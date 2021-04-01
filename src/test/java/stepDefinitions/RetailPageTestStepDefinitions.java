package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.RetailPageObj;
import utilities.WebDriverUtility;

public class RetailPageTestStepDefinitions extends Base {

	// In this class we will write Actual Java/Selenium codes associated to each
	// Sceanrio
	// Steps.

	RetailPageObj retailPage = new RetailPageObj();

	@When("^User search for '(.+)'$")
	public void user_search_for_iphone(String value) throws Throwable {
		retailPage.enterValueToSearchBar(value);
		logger.info("User entered value in search bar");
		WebDriverUtility.screenShot();

	}

	@When("^User click on search button$")
	public void user_click_on_search_button() throws Throwable {
		retailPage.clickOnSearchButton();
		logger.info("User clicked on search button");

	}

	@Then("^User should see Iphone image$")
	public void user_should_see_Iphone_image() throws Throwable {
		Assert.assertTrue(retailPage.iPhoneImageIsDisplayed());
		WebDriverUtility.screenShot();
		logger.info("iPhone image is displayed");
	}
	
	@When("^User click on Register option$")
	public void user_click_on_Register_option() throws Throwable {
		retailPage.clickOnRegister();
		logger.info("User clicked on Register option");
	}

	@When("^User fill the Registration form with Below information$")
	public void user_fill_the_Registration_form_with_Below_information(DataTable personalInfo) throws Throwable {
		List<Map<String, String>> dataValues = personalInfo.asMaps(String.class, String.class);
		retailPage.enterFirstName(dataValues.get(0).get("firstName"));
		retailPage.enterLastName(dataValues.get(0).get("lastName"));
		retailPage.enterEmail(dataValues.get(0).get("email"));
		retailPage.enterTelephone(dataValues.get(0).get("telephone"));
		retailPage.enterPassword(dataValues.get(0).get("password"));
		retailPage.enterConfirmPassword(dataValues.get(0).get("confirmPassword"));
		retailPage.subscribe(dataValues.get(0).get("subscribe"));
		
		logger.info("User filled the information form");
		WebDriverUtility.screenShot();
		
	   
	}

	@When("^User accept the privacy and policy$")
	public void user_accept_the_privacy_and_policy() throws Throwable {
		
		retailPage.checkPrivacyPolicy();
		logger.info("User check privacy and policy");
		WebDriverUtility.screenShot();
		

	}

	@When("^User click on Continue button$")
	public void user_click_on_Continue_button() throws Throwable {
		retailPage.clickOnContinueButton();
		logger.info("User clicked on Continue button");
	}

	@Then("^User should be registered in Retail Website$")
	public void user_should_be_registered_in_Retail_Website() throws Throwable {
		
		Assert.assertTrue(retailPage.registrationOutcome());
		WebDriverUtility.screenShot();
		logger.info("Account was created Successfully");
	   
	}
	
	
//	When User click on desktops tab
//	And User click on Show all desktops
//	Then User should see all items are present in Desktop page
	
	@When("^User click on desktops tab$")
	public void user_click_on_desktops_tab() throws Throwable {
		
		retailPage.clickOnDesktop();
		logger.info("User clicked on Desktop button");
		
	}
	
	@When("^User click on Show all desktops$")
	public void user_click_on_Show_all_desktops() throws Throwable {
		
		retailPage.clickOnShowDesktop();
		logger.info("User clicked on Show all Desktop button");
		
	}
	
	@Then("^User should see all items are present in Desktop page$")
	public void user_should_see_all_items_are_present_in_Desktop_page() throws Throwable {
		Assert.assertTrue(retailPage.iPhoneImageIsDisplayed());
		Assert.assertTrue(retailPage.cinemaImageIsDisplayed());
		Assert.assertTrue(retailPage.canonIsDisplayed());
		Assert.assertTrue(retailPage.hpImageIsDisplayed());
		Assert.assertTrue(retailPage.touchImageIsDisplayed());
		Assert.assertTrue(retailPage.ipodImageIsDisplayed());
		Assert.assertTrue(retailPage.macBookImageIsDisplayed());
		Assert.assertTrue(retailPage.airImageIsDisplayed());
		Assert.assertTrue(retailPage.palmImageIsDisplayed());
		Assert.assertTrue(retailPage.productImageIsDisplayed());
		Assert.assertTrue(retailPage.syncImageIsDisplayed());
		Assert.assertTrue(retailPage.VAIOImageIsDisplayed());
		WebDriverUtility.screenShot();
		logger.info("All items imagse are displayed");
	
	}
	
	
//	And User click ADD TO CARToption on ‘HP LP3065’item 
//	And User select quantity 1 
//	And User click add to Cart button 
//	Then User should see a message ‘Success: you have added HP LP 3065 to your Shopping cart!’
	
	@When("^User click ADD TO CARToption on ‘HP LP3065’ item$") 
	public void user_click_ADD_TO_CARToption_on_HP_LP3065_item() throws Throwable {
		retailPage.clickOnHpCartImage();
		logger.info("user click ADD TO CARToption on ‘HP LP3065’item");
		
	}

	@When("^User select quantity 1$")
	public void user_select_quantity_1(DataTable Amount) throws Throwable {
			
		List<Map<String, String>> dataValues = Amount.asMaps(String.class, String.class);
		retailPage.enterQuantity(dataValues.get(0).get("CartAmount"));
		
		logger.info("User select quantity 1");
		
	}
	
	
	@When("^User click add to Cart button$")
	public void user_click_add_to_Cart_button() throws Throwable {
		
		retailPage.clickOnAddCart();
		logger.info("User click add to Cart button");
		
	}
	
	
	@Then("^User should see a message 'Success: you have added HP LP 3065 to your Shopping cart!'$")
	public void user_should_see_a_message_Success_you_have_added_HP_LP_3065_to_your_Shopping_cart() throws Throwable {
		
		Assert.assertTrue(retailPage.hpCartOutcome());
		WebDriverUtility.screenShot();
		logger.info("HP LP 3065 was added to Cart");
	   
	}
	
	
	
//	And User click ADD TO CART option on ‘Canon EOS 5D’item 
//	And User select color from dropdown ‘Red’
//	And User select quantity 1 
//	And User click add to Cart button 
//	Then User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’
	
	@When("^User click ADD TO CART option on ‘Canon EOS 5D’ item$") 
	public void user_click_ADD_TO_CART_option_on_Canon_EOS_5D_item() throws Throwable {
		retailPage.clickOnCanonCartImage();
		logger.info("User click ADD TO CART option on ‘Canon EOS 5D’ item");
		
	}
	
	@When("^User select color from dropdown ‘Red’$") 
	public void user_select_color_from_dropdown_Red() throws Throwable {
		retailPage.clickOnCanonRed();
		logger.info("User select color from dropdown ‘Red’");
		
	}
	
	
	@Then("^User should see a message 'Success: You have added Canon EOS 5D to your shopping cart!'$")
	public void user_should_see_a_message_Success_You_have_added_Canon_EOS_5D_to_your_shopping_cart() throws Throwable {
		
		Assert.assertTrue(retailPage.canonCartOutcome());
		WebDriverUtility.screenShot();
		logger.info("User should see a message 'Success: You have added Canon EOS 5D to your shopping cart!'");
	   
	}
	
//	And User click on Canon EOS 5D item 
//	And User click on write a review link 
//	And user fill the review information with below information
//	|yourname| yourReview| Rating|
//	|name|review|Bad or good|
//	And User click on Continue Button 
//	Then User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”
	
	
	@When("^User click on Canon EOS 5D item$")
	public void user_click_on_Canon_EOS_5D_item() throws Throwable {
		retailPage.clickOnCanonImage();
		WebDriverUtility.screenShot();
		logger.info("User click on Canon EOS 5D item");
	}
	
	@When("^User click on write a review link$") 
	public void user_click_on_write_a_review_link() throws Throwable {
		retailPage.clickOnTabReview();
		logger.info("User click on write a review link");	
	}
	
	@When("^User fill the review information with below information$")
	public void user_fill_the_review_information_with_below_information(DataTable Info) throws Throwable {
			
		List<Map<String, String>> dataValues = Info.asMaps(String.class, String.class);
		retailPage.enterYourName(dataValues.get(0).get("yourname"));
		retailPage.enterYourReview(dataValues.get(0).get("yourReview"));
		//retailPage.clickOnReview(dataValues.get(0).get("Rating"));
		
		retailPage.clickOnRating();
		logger.info("User fill the review information with below information");
		
	}
	
	@When("^User click on Continue Button$")
	public void user_click_on_Continue_Button() throws Throwable {
		retailPage.clickOnReviewContinueButton();
		WebDriverUtility.screenShot();
		logger.info("User click on Continue Button");
	}
	
	@Then("^User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval'$")
	public void user_should_see_a_message_with_Thank_you_for_your_review_It_has_been_submitted_to_the_webmaster_for_approval() throws Throwable {
		
		Assert.assertTrue(retailPage.canonReviewOutcome());
		WebDriverUtility.screenShot();
		logger.info("User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval'");
	   
	}
	
	
//	When User click on Laptop & NoteBook tab
//	And User click on Show all Laptop & NoteBook option
//	And User click on MacBook item
//	And User click add to Cart button
//	Then User should see a message ‘Success: You have added MacBook to your shopping cart!’
//	And User should see ‘1 tem(s)-602.00’ showed to the cart
//	And User click on cart option
//	And user click on red X button to remove the item from cart
//	Then item should be removed and cart should show ‘0 item(s)’
	
	@When("^User click on Laptop & NoteBook tab$")
	public void user_click_on_Laptop_NoteBook_tab() throws Throwable {
		
		retailPage.clickOnLaptop();
		logger.info("User clicked on Laptop NoteBook tab");	
	}
	
	@When("^User click on Show all Laptop & NoteBook option$")
	public void user_click_on_Show_all_Laptop_NoteBook_option() throws Throwable {
		retailPage.clickOnShowLaptop();
		logger.info("ser clicked on Show all Laptop & NoteBook option");

	}
	
	@When("^User click on MacBook item$")
	public void user_click_on_MacBook_item() throws Throwable {
		retailPage.clickOnMacBookLaptop();
		logger.info("User clicked on MacBook item");

	}
	
	@Then("^User should see a message ‘Success: You have added MacBook to your shopping cart!’$")
	public void user_should_see_a_message_Success_You_have_added_MacBook_to_your_shopping_cart() throws Throwable {
		
		Assert.assertTrue(retailPage.macbookCartSuccess());
		WebDriverUtility.screenShot();
		logger.info("User should see a message ‘Success: You have added MacBook to your shopping cart!’");
	   
	}
	
	@When("^User click on cart option$")
	public void user_click_on_cart_option() throws Throwable {
		retailPage.clickOnCart();
		logger.info("User click on cart option");

	}
	

	@When("^User should see '1 item - 602.00' showed to the cart$")
	public void user_should_see_1_item_602_showed_to_the_cart() throws Throwable {
		
		Assert.assertTrue(retailPage.cartTotal());
		logger.info("User should see ‘1 item(s)-602.00’ showed to the cart");

	}
	
	@When("^User click on red X button to remove the item from cart$")
	public void user_click_on_red_X_button_to_remove_the_item_from_cart() throws Throwable {
		retailPage.clickOnCartRemoval();
		logger.info("User click on red X button to remove the item from cart");

	}
	
	@Then("^item should be removed and cart should show '0 item'$")
	public void item_should_be_removed_and_cart_should_show_0_item() throws Throwable {
		
		Assert.assertTrue(retailPage.cartSuccess());
		WebDriverUtility.screenShot();
		logger.info("item should be removed and cart should show '0 item'");
	   
	}
	
	
//	And User click on product comparison icon on ‘MacBook’
//	And User click on product comparison icon on ‘MacBook Air
//	Then User should see a message ‘Success: You have added MacBook Air to your product comparison!’
//	And User click on Product comparison link
//	Then User should see Product Comparison Chart
	
	@When("^User click on product comparison icon on 'Macbook'$")
	public void user_click_on_product_comparison_icon_on_Macbook() throws Throwable {
		retailPage.clickOncompareMacbook();
		WebDriverUtility.screenShot();
		logger.info("User click on product comparison icon on 'Macbook'");
	}
	
	
	@When("^User click on product comparison icon on 'Macbook Air'$")
	public void user_click_on_product_comparison_icon_on_Macbook_Air() throws Throwable {
		retailPage.clickOncompareAir();
		WebDriverUtility.screenShot();
		logger.info("User click on product comparison icon on 'Macbook Air'");

	}
	
	@Then("^User should see a message 'Success: You have added MacBook Air to your product comparison!'$")
	public void user_should_see_a_message_Success_You_have_added_MacBook_Air_to_your_product_comparison() throws Throwable {
		
		Assert.assertTrue(retailPage.airAddSuccess());
		WebDriverUtility.screenShot();
		logger.info("User should see a message 'Success: You have added MacBook Air to your product comparison!'");
	   
	}
	
	@When("^User click on Product comparison link$")
	public void user_click_on_Product_comparison_link() throws Throwable {
		retailPage.clickOnproductComparePage();
		WebDriverUtility.screenShot();
		logger.info("User click on Product comparison link");

	}
	
	@Then("^User should see Product Comparison Chart$")
	public void user_should_see_Product_Comparison_Chart() throws Throwable {
		
		Assert.assertTrue(retailPage.compareDetailsSuccess());
		WebDriverUtility.screenShot();
		logger.info("User should see Product Comparison Chart");
	   
	}
	
	
	//Sony WishList
	
	//And User click on heart icon to add 'Sony VaIO' laptop to wish list
	//Then User should get a message 'You must login or create an account to save Sony VAIO to your wish list!'
	
	@When("^User click on heart icon to add 'Sony VaIO' laptop to wish list$")
	public void user_click_on_heart_icon_to_add_Sony_VaIO_laptop_to_wish_list() throws Throwable {
		retailPage.clickOnSonyWishList();
		logger.info("User click on heart icon to add 'Sony VaIO' laptop to wish list");

	}
	
	@Then("^User should get a message 'You must login or create an account to save Sony VAIO to your wish list!'$")
	public void user_should_get_a_message_You_must_login_or_create_an_account_to_save_Sony_VAIO_to_your_wish_list() throws Throwable {
		
		Assert.assertTrue(retailPage.mustRegisterSuccess());
		WebDriverUtility.screenShot();
		logger.info("User should get a message 'You must login or create an account to save Sony VAIO to your wish list!'");
	   
	}
	
	
	//Macbook Pro Price
	
//	And User click on 'MacBook Pro' item
//	Then User should see '$2,000.00' price tag is present on UI
	
	@When("^User click on 'MacBook Pro' item$")
	public void user_click_on_MacBook_Pro_item() throws Throwable {
		retailPage.clickOnMacbookProImage();
		logger.info("User clicked on 'MacBook Pro' item");

	}
	
	@Then("^User should see '2000.00' price tag is present on UI$")
	public void user_should_see_2000_price_tag_is_present_on_UI() throws Throwable {
		
		Assert.assertTrue(retailPage.macbookProPriceSuccess());
		WebDriverUtility.screenShot();
		logger.info("User should see '$2,000.00' price tag is present on UI");
	   
	}
	
	
	
	@When("^User click on a MyAccount$")
	public void user_click_on_MyAccount() throws Throwable {
		retailPage.clickOnmyAccountll();
		logger.info("User clicked on MyAccount");
	}
	
	@When("^User click on a Login$")
	public void user_click_on_Login() throws Throwable {
		retailPage.clickOnLoginOption();
		logger.info("User clicked on Login");

	}
	
	@When("^User enter username and password$")
	public void user_enter_username_and_password(DataTable personalInfo) throws Throwable {
		List<Map<String, String>> dataValues = personalInfo.asMaps(String.class, String.class);

		retailPage.enterEmail(dataValues.get(0).get("email"));
		retailPage.enterPassword(dataValues.get(0).get("password"));
	
		logger.info("User entered username 'userName' and password 'password'");
		WebDriverUtility.screenShot();
		
	}
	
	@When("^User click on the Login button$")
	public void user_click_on_Login_button() throws Throwable {
		retailPage.clickOnLoginButton();
		logger.info("User clicked on Login button");

	}
	
	@Then("^User should be logged in to the MyAccount dashboard$")
	public void user_should_be_logged_in_to_MyAccount_dashboard() throws Throwable {
		
		Assert.assertTrue(retailPage.loginSuccessfulSuccess());
		WebDriverUtility.screenShot();
		logger.info("User should be logged in to MyAccount dashboard");
	   
	}
	
//	When User click on 'Register for an Affiliate Account' link 
//	And User fill affiliate form with below information
//	And User check on About us check box 
//	And User click on Continue button 
//	Then User should see a success message 	
	
	@When("^User click on 'Register for an Affiliate Account' link$")
	public void user_click_on_Register_for_an_Affiliate_Account_link() throws Throwable {
		retailPage.clickonAffiliateRegisteration();
		logger.info("User clicked on 'Register for an Affiliate Account' link");

	}
	
	
	@When("^User fill affiliate form with below information$")
	public void user_fill_affiliate_form_with_below_information(DataTable personalInfo) throws Throwable {
		List<Map<String, String>> dataValues = personalInfo.asMaps(String.class, String.class);

		retailPage.enterCompany(dataValues.get(0).get("company"));
		retailPage.enterWebsite(dataValues.get(0).get("website"));
		retailPage.enterTaxid(dataValues.get(0).get("taxID"));
		retailPage.enterChequeReceiver(dataValues.get(0).get("paymentMethod"));
	
		logger.info("User fill affiliate form with above information");
		WebDriverUtility.screenShot();
		
	}
	
	
	@When("^User check on About us check box$")
	public void user_check_on_About_us_check_box_() throws Throwable {
		retailPage.checkAgree();
		logger.info("User check on About us check box ");

	}

	
	@Then("^User should see a success message$")
	public void user_should_see_a_success_message() throws Throwable {
		
		Assert.assertTrue(retailPage.affiliateRegisterationSuccess());
		WebDriverUtility.screenShot();
		logger.info("User should see a success message");
	   
	}
	
	
//	When User click on 'Edit your affiliate informationlink' 
//	And user click on Bank Transfer radio button
//	And User fill Bank information with below information
 

	@When("^User click on 'Edit your affiliate informationlink'$")
	public void user_click_on_Edit_your_affiliate_informationlink() throws Throwable {
		retailPage.clickonAffiliateEdit();
		logger.info("User clicked on 'Edit your affiliate informationlink'");

	}
	
	
	@When("^user click on Bank Transfer radio button$")
	public void user_click_on_Bank_Transfer_radio_button() throws Throwable {
		retailPage.bankSelection();
		logger.info("user clicked on Bank Transfer radio button");

	}
	
	
	@When("^User fill Bank information with below information$")
	public void user_fill_Bank_information_with_below_information(DataTable personalInfo) throws Throwable {
		List<Map<String, String>> dataValues = personalInfo.asMaps(String.class, String.class);

		retailPage.enterbankName(dataValues.get(0).get("bankName"));
		retailPage.enterBankBranch(dataValues.get(0).get("abaNumber"));
		retailPage.enterBankSwiftCode(dataValues.get(0).get("swiftCode"));
		retailPage.enterbankAccountName(dataValues.get(0).get("accountName"));
		retailPage.enterBankAccountNumber(dataValues.get(0).get("accountNumber"));
		
		logger.info("User filled Bank information with above information");
		WebDriverUtility.screenShot();
		
	}
	
	
	@When("^User click on 'Edit your account information' link$")
	public void user_click_on_Edit_your_account_information_link() throws Throwable {
		retailPage.clickonEditAccountButton();
		logger.info("User clicked on 'Edit your account information' link");

	}
	
	@When("^User modify below information$")
	public void user_modify_below_information(DataTable personalInfo) throws Throwable {
		List<Map<String, String>> dataValues = personalInfo.asMaps(String.class, String.class);
		retailPage.enterFirstNameA(dataValues.get(0).get("firstName"));
		retailPage.enterLastNameA(dataValues.get(0).get("lastName"));
		retailPage.enterEmailA(dataValues.get(0).get("email"));
		retailPage.enterTelephoneA(dataValues.get(0).get("telephone"));
		
		logger.info("User modified the information");
		WebDriverUtility.screenShot();
		
	}
		

	@Then("^User should see a message 'Success: Your account has been successfully updated'.$")
	public void user_should_see_a_message_Success_Your_account_has_been_successfully_updated() throws Throwable {
			
			Assert.assertTrue(retailPage.editAccountDoneSuccess());
			WebDriverUtility.screenShot();
			logger.info("User should see an account success message");
		   
		}
	   
	
}
