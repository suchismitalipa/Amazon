Feature: Login

Scenario:
	Given User Launch Chrome Browser
	When user opens URL "https://www.amazon.com/"
	And User Enters Email as "suchismitalipa@gmail.com"
	And User Enters Password as "bGlwYUxJWkEyQA=="
	Then Page Title should be "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more"
	Then User Clicks Sign out
#	Then Page Title should be "Amazon Sign-In"
	And Close Browser
