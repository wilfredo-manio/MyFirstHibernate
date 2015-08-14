package com.exist.manio.myfirsthibernate.app;

import java.util.List;

import com.exist.manio.myfirsthibernate.core.service.MenuService;
import com.exist.manio.myfirsthibernate.core.model.Person;
import com.exist.manio.myfirsthibernate.core.model.Contact;
import com.exist.manio.myfirsthibernate.core.model.ContactType;

public class MainMenuController {

	public String processOption(String chosen) {
		switch(chosen) {
			case "1"	:	return listPerson();

			case "2"	:	return addPerson();

			case "0"	:	return "System Exiting.";

			default		:	return "Incorrect Option";
		}
	}

	private String listPerson() {
		DisplayPersonMenu displayPerson = new DisplayPersonMenu();
		return displayPerson.processSearch();
	}

	private String addPerson() {
		AddPersonMenu addPersonMenu = new AddPersonMenu();
		addPersonMenu.add();
		return "Successfully added a person.";
	}

}