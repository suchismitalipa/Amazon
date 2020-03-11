$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User Launch Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.user_Launch_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user opens URL \"https://www.amazon.com/\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enters Email as \"suchismitalipa@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_Enters_Email_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enters Password as \"bGlwYUxJWkEyQA\u003d\u003d\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_Enters_Password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs \u0026 more\"",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.page_Title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Clicks Sign out",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.user_Clicks_Sign_out()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close Browser",
  "keyword": "And "
});
formatter.match({
  "location": "steps.close_Browser()"
});
formatter.result({
  "status": "passed"
});
});