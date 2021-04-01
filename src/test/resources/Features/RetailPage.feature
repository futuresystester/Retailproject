@retailPage
Feature: Retail Website Features 

#Every feature file starts with Feature: <Name of feature file>
#Every Scenario starts with Scenario: <Name of Test case we want to automate>
#Gherkin keywords are Given When Then 
#Given is precondition 
#When is an Action taken 
#Then is an expected result ( we write validation )
#And is repeating an action or can be used following Given keyword as well
#But is used for negative scenarios verification 


Background: 
	Given User is on Retail website 
	
	
	
@Test 
Scenario: Search functionality Test case 
	When User search for 'iphone' 
	And User click on search button 
	Then User should see Iphone image 
	
	
	#In scenario Outline we can run same scenario with multiple set of data 
	# we will use Examples keyword to pass different data 
	#Every Scenario outline follows with Examples keyword
	#Under Examples Keyword we placed Data inside the pipes |  and we can separate Columns 
	#with Pipes 
	#In Examples each row represent one time of execution
	
Scenario Outline: Test Search Functionality with multiple set of Data 
	When User search for '<itemName>' 
	And User click on search button 
	
	
	Examples: 
		|itemName|
		|iphone|
		|mac book|
		|Canon|
		
		
@RegisterTest
Scenario: Register an Account test case
		When User click  on MyAccount
		And User click on Register option
		And User fill the Registration form with Below information
		|firstName|lastName|email|telephone|password|confirmPassword|subscribe|
		|Alex|Sokolova|aldeefkfy89yx@gmail.com|1002026633|test|test|no|
		And User accept the privacy and policy 
		And User click on Continue button
		Then User should be registered in Retail Website
		
		
		
@DesktopFeatures
Scenario: User verify all items are present in Desktops tab
		When User click on desktops tab
		And User click on Show all desktops
		Then User should see all items are present in Desktop page


@HPLP3065
Scenario: User add HP LP 3065  from Desktops tab to the cart
		Given User is on Retail website
		When User click on desktops tab
		And User click on Show all desktops 
		And User click ADD TO CARToption on ‘HP LP3065’ item 
		And User select quantity 1 
		|CartAmount|
		|1|
		And User click add to Cart button 
		Then User should see a message 'Success: you have added HP LP 3065 to your Shopping cart!'
		
@CanonRed		
Scenario: User add Canon EOS 5Dfrom Desktops tab to the cart
		Given User is on Retail website
		When User click on desktops tab
		And User click on Show all desktops 
		And User click ADD TO CART option on ‘Canon EOS 5D’ item 
		And User select color from dropdown ‘Red’
		And User select quantity 1 
		|CartAmount|
		|1|
		And User click add to Cart button 
		Then User should see a message 'Success: You have added Canon EOS 5D to your shopping cart!'
		
	
@CanonReview	
Scenario: User add a review to Canon EOS 5D item in Desktops tab
		Given User is on Retail website
		When User click on desktops tab
		And User click on Show all desktops 
		And User click on Canon EOS 5D item 
		And User click on write a review link 
		And User fill the review information with below information
		|yourname| yourReview| Rating|
		|Ricky|Hell No. This is a Horrible Device. But I love it|good|
		And User click on Continue Button
		Then User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval'
		
@MacbookCartAddRemove	
Scenario: Add and Remove a Mac book from Cart
		Given User is on Retail website
		When User click on Laptop & NoteBook tab
		And User click on Show all Laptop & NoteBook option
		And User click on MacBook item
		And User click add to Cart button
		Then User should see a message ‘Success: You have added MacBook to your shopping cart!’
		And User should see '1 item - 602.00' showed to the cart
		And User click on cart option 
		And User click on red X button to remove the item from cart
		Then item should be removed and cart should show '0 item'
		
@Comparism		
Scenario: Product Comparison
		Given User is on Retail website
		When User click on Laptop & NoteBook tab
		And User click on Show all Laptop & NoteBook option
		And User click on product comparison icon on 'Macbook'
		And User click on product comparison icon on 'Macbook Air'
		Then User should see a message 'Success: You have added MacBook Air to your product comparison!'
		And User click on Product comparison link
		Then User should see Product Comparison Chart
		
@SonyWishList		
Scenario: Adding an item to Wish list
		Given User is on Retail website
		When User click on Laptop & NoteBook tab
		And User click on Show all Laptop & NoteBook option
		And User click on heart icon to add 'Sony VaIO' laptop to wish list
		Then User should get a message 'You must login or create an account to save Sony VAIO to your wish list!'
		
@PriceValidation		
Scenario: Validate the price of MacBook Pro is 2000
		Given User is on Retail website
		When User click on Laptop & NoteBook tab
		And User click on Show all Laptop & NoteBook option
		And User click on 'MacBook Pro' item
		Then User should see '2000.00' price tag is present on UI
		
	
@UserLogin		
Scenario:  For this feature you have to have an existing account
		Given User is on Retail website
		And User click on a MyAccount
		When User click on a Login
		And User enter username and password
		|email|password|
		|aldeefkfy89yx@gmail.com|test|
		And User click on the Login button
		Then User should be logged in to the MyAccount dashboard	
		
@AffiliateRegisteration		
Scenario: Register as an Affiliate user with Cheque Payment Method
		Given User is on Retail website
		And User click on a MyAccount
		When User click on a Login
		And User enter username and password
		|email|password|
		|aldeefkfy89yx@gmail.com|test|
		And User click on the Login button
		When User click on 'Register for an Affiliate Account' link 
		And User fill affiliate form with below information
		|company|website|taxID|paymentMethod|
		|Fake Tek|https://www.gmail.com|49481449184|Fake Tek LLC|
		And User check on About us check box 
		And User click on Continue button 
		Then User should see a success message 
		
@EditAffiliate		
Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
		Given User is on Retail website
		And User click on a MyAccount
		When User click on a Login
		And User enter username and password
		|email|password|
		|aldeefkfy89yx@gmail.com|test|
		And User click on the Login button		
		When User click on 'Edit your affiliate informationlink' 
		And user click on Bank Transfer radio button
		And User fill Bank information with below information
		|bankName|abaNumber|swiftCode|accountName|accountNumber|
		|Wells Fargo|94494984|6464446|Fake Again LLC|8846545489|
		And User click on Continue button 
		Then User should see a success message	


@EditAccountInfo		
Scenario: Edit your account Information
		Given User is on Retail website
		And User click on a MyAccount
		When User click on a Login
		And User enter username and password
		|email|password|
		|aldeefkfy89yx@gmail.com|test|
		And User click on the Login button		
		When User click on 'Edit your account information' link
		And User modify below information 
		|firstName|lastName|email|telephone|
		|Buju|Watson|jfsouriedf@gmail.com|2408695478|
		And User click on Continue button 
		Then User should see a message 'Success: Your account has been successfully updated'.