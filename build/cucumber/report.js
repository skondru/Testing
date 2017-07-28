$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/contactus.feature");
formatter.feature({
  "id": "contact-us-page",
  "description": "As an end user\r\nI want a contact us page\r\nSo that I can find out more about QAWorks exciting services!!",
  "name": "Contact Us Page",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "contact-us-page;valid-submission",
  "description": "",
  "name": "Valid Submission",
  "keyword": "Scenario",
  "line": 6,
  "type": "scenario"
});
formatter.step({
  "name": "I am on the QAWorks Site",
  "keyword": "Given ",
  "line": 7
});
formatter.step({
  "name": "I should be able to contact QAWorks with the following information",
  "keyword": "Then ",
  "line": 8,
  "rows": [
    {
      "cells": [
        "name",
        "j.Bloggs"
      ],
      "line": 9
    },
    {
      "cells": [
        "email",
        "j.Bloggs@qaworks.com"
      ],
      "line": 10
    },
    {
      "cells": [
        "message",
        "please contact me I want to find out more"
      ],
      "line": 11
    }
  ]
});
formatter.match({
  "location": "ContactUsSteps.i_am_on_the_QAWorks_Site()"
});
formatter.result({
  "duration": 2455530680,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.i_should_be_able_to_contact_QAWorks_with_the_following_information(DataTable)"
});
formatter.result({
  "duration": 1344325808,
  "status": "passed"
});
});