package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class RetailPageObj extends Base {

	// Once we create Page Obj we need to extends the Base class to use Parent Class
	// properties such is Webdriver driver
	// we create a constructor and inside the constructor we define the
	// PageFactory.initElements
	// method to initialize the WebElements in this page.

	public RetailPageObj() {

		PageFactory.initElements(driver, this);
	}

	// we need to store UI Webelements in a private webElement using @FindBy
	// annotations of
	// PageFactory class.

	@FindBy(xpath = "//input[@name='search']")
	private WebElement searchBar;

	@FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
	private WebElement searchButton;

	@FindBy(xpath = "//img[@title='iPhone']")
	private WebElement iphoneImage;

	// WebElements for Register page
	@FindBy(xpath = "(//a[text()='Register'])[1]")
	private WebElement registerOption;

	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement firstNameField;

	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement lastNameField;

	@FindBy(css = "#input-email")
	private WebElement emailField;

	@FindBy(id = "input-telephone")
	private WebElement telephoneField;

	@FindBy(id = "input-password")
	private WebElement passwordField;

	@FindBy(id = "input-confirm")
	private WebElement confirmPasswordField;

	@FindBy(xpath = "(//input[@value='1'])[1]")
	private WebElement yesSubscribeButton;

	@FindBy(xpath = "(//input[@value='0'])[1]")
	private WebElement noSubscribeButton;

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement privacyPolicyCheckBox;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;

	@FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")
	private WebElement accountCreatedMessage;
	
	
	// WebElements for Show Desktop page

	@FindBy(xpath = "//a[text()='Desktops']")//(//a[@class='dropdown-toggle'])[2]
	private WebElement desktop;
	
	
	@FindBy(xpath = "(//a[text()='Show All Desktops'])[1]")
	private WebElement showAllDesktop;

	// we need to create public methods to perform required actions on each elements
	// we stored.

	public void enterValueToSearchBar(String value) {
		WebDriverUtility.enterValue(searchBar, value);
	}

	public void clickOnSearchButton() {
		WebDriverUtility.clickOnElement(searchButton);
	}

	public boolean iPhoneImageIsDisplayed() {

		if (iphoneImage.isDisplayed())
			return true;
		else
			return false;

	}

	// we need to create Methods to perform on each WebElement.

	public void clickOnRegister() {
		WebDriverUtility.clickOnElement(registerOption);
	}

	public void enterFirstName(String fName) {
		WebDriverUtility.enterValue(firstNameField, fName);
	}

	public void enterLastName(String lName) {
		WebDriverUtility.enterValue(lastNameField, lName);
	}

	public void enterEmail(String email) {
		WebDriverUtility.enterValue(emailField, email);
	}

	public void enterTelephone(String phoneNumber) {
		WebDriverUtility.enterValue(telephoneField, phoneNumber);

	}

	public void enterPassword(String password) {
		WebDriverUtility.enterValue(passwordField, password);

	}

	public void enterConfirmPassword(String confirmPassword) {
		WebDriverUtility.enterValue(confirmPasswordField, confirmPassword);
	}

	public void subscribe(String valueOfSubscribe) {

		if (valueOfSubscribe.equalsIgnoreCase("yes")) {
			if (!yesSubscribeButton.isSelected())
				WebDriverUtility.clickOnElement(yesSubscribeButton);
		} else
			WebDriverUtility.clickOnElement(noSubscribeButton);
	}

	public void checkPrivacyPolicy() {

		if (privacyPolicyCheckBox.isDisplayed()) {
			privacyPolicyCheckBox.click();
		}

	}

	public void clickOnContinueButton() {
		WebDriverUtility.clickOnElement(continueButton);
	}

	public boolean registrationOutcome() {

		boolean successMessage = accountCreatedMessage.isDisplayed();
		return successMessage;
	}
	
	//Show Desktop Page
	
	public void clickOnDesktop() {
		WebDriverUtility.clickOnElement(desktop);
	}
	
	public void clickOnShowDesktop() {
		WebDriverUtility.clickOnElement(showAllDesktop);
	}
	
	//Other Desktop Items
	
	@FindBy(xpath = "//img[@alt='Apple Cinema 30\"']")
	private WebElement cinemaImage;
	
	@FindBy(xpath = "//img[@alt='Canon EOS 5D']")
	private WebElement canonImage;
	
	@FindBy(xpath = "//img[@alt='HP LP3065']")
	private WebElement hpImage;
	
	@FindBy(xpath = "//img[@alt='HTC Touch HD']")
	private WebElement touchImage;
	
	@FindBy(xpath = "//img[@alt='iPod Classic']")
	private WebElement ipodImage;
	
	@FindBy(xpath = "//img[@alt='MacBook']")
	private WebElement macBookImage;
	
	@FindBy(xpath = "//img[@alt='MacBook Air']")
	private WebElement airImage;
		
	@FindBy(xpath = "//img[@alt='Palm Treo Pro']")
	private WebElement palmImage;
	
	@FindBy(xpath = "//img[@alt='Product 8']")
	private WebElement productImage;
	
	@FindBy(xpath = "//img[@alt='Samsung SyncMaster 941BW']")
	private WebElement syncMasterImage;
	
	
	@FindBy(xpath = "//img[@alt='Sony VAIO']")
	private WebElement sonyVaioImage;
	
	
//	
//	public boolean allDesktopImageIsDisplayed() {
//
//		if (iphoneImage.isDisplayed())
//			return true;
//		else
//			return false;
//
//	}
	

	public boolean cinemaImageIsDisplayed() {

	if (cinemaImage.isDisplayed())
		return true;
	else
		return false;

	}

	public boolean canonIsDisplayed() {

	if (canonImage.isDisplayed())
		return true;
	else
		return false;

	}

	public boolean hpImageIsDisplayed() {

	if (hpImage.isDisplayed())
		return true;
	else
		return false;

	}

	public boolean touchImageIsDisplayed() {

	if (touchImage.isDisplayed())
		return true;
	else
		return false;

	}

	public boolean ipodImageIsDisplayed() {

	if (ipodImage.isDisplayed())
		return true;
	else
		return false;

	}

	public boolean macBookImageIsDisplayed() {

	if (macBookImage.isDisplayed())
		return true;
	else
		return false;

	}

	public boolean airImageIsDisplayed() {

	if (airImage.isDisplayed())
		return true;
	else
		return false;

	}

	public boolean palmImageIsDisplayed() {

	if (palmImage.isDisplayed())
		return true;
	else
		return false;

	}

	public boolean productImageIsDisplayed() {

	if (productImage.isDisplayed())
		return true;
	else
		return false;

	}


	public boolean syncImageIsDisplayed() {

	if (syncMasterImage.isDisplayed())
		return true;
	else
		return false;
	}


	public boolean VAIOImageIsDisplayed() {

	if (sonyVaioImage.isDisplayed())
		return true;
	else
		return false;

	}



	//Add HP LP 3065
	
	
	@FindBy(xpath = "//div[@id='content']/div[4]/div[3]/div[1]/div[2]/div[2]/button[1]")
	private WebElement hpCartImage;
	
	
	
	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement Quantity;
	
	
	
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement AddtoCart;
	
	
	@FindBy(xpath = "//div[contains(@class,'alert alert-success')]")
	private WebElement hpSuccessAlert;
	
	public void clickOnHpCartImage() {
		WebDriverUtility.clickOnElement(hpCartImage);
	}
	
	public void enterQuantity(String Amount) {
		
		driver.findElement(By.id("input-quantity")).clear();
		WebDriverUtility.enterValue(Quantity, Amount);
	}
	
	public void clickOnAddCart() {
		WebDriverUtility.clickOnElement(AddtoCart);
	}
	
	public boolean hpCartOutcome() {
		boolean successMessage = hpSuccessAlert.isDisplayed();
		return successMessage;
	}
	
	
	//Canon EOS
	
	@FindBy(xpath = "//div[@id='content']/div[4]/div[2]/div[1]/div[2]/div[2]/button[1]")
	private WebElement canonCartImage;
	
	public void clickOnCanonCartImage() {
		WebDriverUtility.clickOnElement(canonCartImage);
	}
	
	
	@FindBy(xpath = "//select//option[@value='15']")
	private WebElement canonRed;
	
	public void clickOnCanonRed() {
		WebDriverUtility.clickOnElement(canonRed);
	}
	
	
	@FindBy(xpath = "//div[contains(@class,'alert alert-success')]")
	private WebElement canonSuccessAlert;
	
	public boolean canonCartOutcome() {
		boolean successMessage = canonSuccessAlert.isDisplayed();
		return successMessage;
	}
	
	
	//Review Canon
	
	public void clickOnCanonImage() {
		WebDriverUtility.clickOnElement(canonImage);
	}
	
	
	@FindBy(xpath = "//a[@href='#tab-review']")
	private WebElement tabReview;
	
	public void clickOnTabReview() {
		WebDriverUtility.clickOnElement(tabReview);
	}
	
	
	@FindBy(xpath = "//input[@id='input-name']")
	private WebElement yName;
	
	public void enterYourName(String yourname) {
		WebDriverUtility.enterValue(yName, yourname);
	}
	
	
	@FindBy(xpath = "//textarea[@id='input-review']")
	private WebElement yReview;
	
	public void enterYourReview(String yourReview) {
		WebDriverUtility.enterValue(yReview, yourReview);
	}
	
	
	@FindBy(xpath = "//input[@value='4']")
	private WebElement yRating;
	
	public void clickOnRating() {
		WebDriverUtility.clickOnElement(yRating);
	}
	
	@FindBy(xpath = "//button[@id='button-review']")
	private WebElement rContinueButton;
	
	public void clickOnReviewContinueButton() {
		WebDriverUtility.clickOnElement(rContinueButton);
	}
	
	
	@FindBy(xpath = "//div[contains(@class,'alert alert-success')]")
	private WebElement canonReviewAlert;
	
	public boolean canonReviewOutcome() {
		boolean successMessage = canonReviewAlert.isDisplayed();
		return successMessage;
	}
	
	
	// WebElements for Show Laptop page

	@FindBy(xpath = "(//a[@class='dropdown-toggle'])[3]")
	private WebElement laptop;
	
	
	@FindBy(xpath = "(//a[@class='see-all'])[2]")
	private WebElement showAllLaptop;
	
	
	@FindBy(xpath = "(//div[@class='caption']//a)[2]")
	private WebElement macbookOnLaptop;
	
	
	//@FindBy(xpath = "//button[@id='button-cart']")
	//private WebElement AddtoCart;
	
	
	@FindBy(xpath = "//div[contains(@class,'alert alert-success')]")
	private WebElement macbookCartAlert;
	
	
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement cartTotal;
		
	
	@FindBy(xpath = "//i[@class='fa fa-shopping-cart']")
	private WebElement viewCart;
	
	
	@FindBy(xpath = "//button[@class='btn btn-danger']")
	private WebElement cartRemoval;
	
	
	@FindBy(xpath = "(//p[text()='Your shopping cart is empty!'])[2]")
	private WebElement cartMessage;
	
	//Show Laptop Page
	
	public void clickOnLaptop() {
		WebDriverUtility.clickOnElement(laptop);
	}
	
	public void clickOnShowLaptop() {
		WebDriverUtility.clickOnElement(showAllLaptop);
	}
	
	public void clickOnMacBookLaptop() {
		WebDriverUtility.clickOnElement(macbookOnLaptop);
	}
	
	public boolean macbookCartSuccess() {
		boolean successMessage = macbookCartAlert.isDisplayed();
		return successMessage;
	}
	
	public boolean cartTotal() {
		boolean successMessage = viewCart.isDisplayed();
		return successMessage;
	}
	
	
	public void clickOnCart() {
		WebDriverUtility.clickOnElement(viewCart);
	}
	
	
	public void clickOnCartRemoval() {
		WebDriverUtility.clickOnElement(cartRemoval);
	}

	
	public boolean cartSuccess() {
		boolean successMessage = cartMessage.isDisplayed();
		return successMessage;
	}
	
	
	//Compare Macs
	
	@FindBy(xpath = "(//button[@data-original-title='Compare this Product'])[2]")
	private WebElement compareMacbook;
			
			
			
	@FindBy(xpath = "(//button[@data-original-title='Compare this Product'])[3]")
	private WebElement compareAir;
	
	
	@FindBy(xpath = "//div[contains(@class,'alert alert-success')]")
	private WebElement airAddCompare;
	
	
	@FindBy(xpath = "//a[text()='MacBook Air']/following-sibling::a")
	private WebElement productComparePage;
	
	
	@FindBy(xpath = "//h1[text()='Product Comparison']")
	private WebElement compareDetails;
	
	public void clickOncompareMacbook() {
		WebDriverUtility.clickOnElement(compareMacbook);
	}
	
	public void clickOncompareAir() {
		WebDriverUtility.clickOnElement(compareAir);
	}
	
	
	public void clickOnproductComparePage() {
		WebDriverUtility.clickOnElement(productComparePage);
	}
	
	public boolean airAddSuccess() {
		boolean successMessage = airAddCompare.isDisplayed();
		return successMessage;
	}
	
	public boolean compareDetailsSuccess() {
		boolean successMessage = compareDetails.isDisplayed();
		return successMessage;
	}
	
	//Heart Button
	
	
	@FindBy(xpath = "//div[@id='content']/div[4]/div[5]/div[1]/div[2]/div[2]/button[2]")
	private WebElement sonyWishList;
	

	@FindBy(xpath = "//div[contains(@class,'alert alert-success')]")
	private WebElement mustRegister;
	
	public void clickOnSonyWishList() {
		WebDriverUtility.clickOnElement(sonyWishList);
	
	}
	
	public boolean mustRegisterSuccess() {
		boolean successMessage = mustRegister.isDisplayed();
		return successMessage;
	}
	
	
	//Macbook Pro 
	
	
	@FindBy(xpath = "//img[@alt='MacBook Pro']")
	private WebElement macbookProImage;
	
	public void clickOnMacbookProImage() {
		WebDriverUtility.clickOnElement(macbookProImage);
	}
	
	@FindBy(xpath = "//h2[text()='$2,000.00']")
	private WebElement macbookProPrice;
	
	public boolean macbookProPriceSuccess() {
		boolean successMessage = macbookProPrice.isDisplayed();
		return successMessage;
	}
	

	
	//Login to Account
	
	@FindBy(xpath = "//a[@class='dropdown-toggle']//i[1]")
	private WebElement myAccountll;
	
	@FindBy(xpath = "(//a[text()='Login'])[1]")
	private WebElement loginOption;
	
	//email and password done
	
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement loginSuccessful;
	
	
	public void clickOnmyAccountll() {
		WebDriverUtility.clickOnElement(myAccountll);
	}
	public void clickOnLoginOption() {
		WebDriverUtility.clickOnElement(loginOption);
	}
	
	public void clickOnLoginButton() {
		WebDriverUtility.clickOnElement(loginButton);
	}
	
	public boolean loginSuccessfulSuccess() {
		boolean successMessage = loginSuccessful.isDisplayed();
		return successMessage;
	}
	
	
	//Affiliate Registering
	
	@FindBy(xpath = "(//a[text()='Register for an affiliate account'])[1]")
	private WebElement affiliateRegisteration;
	
	
	@FindBy(id = "input-company")
	private WebElement companyField;
	
	@FindBy(id = "input-website")
	private WebElement websiteField;
	
	@FindBy(id = "input-tax")
	private WebElement taxField;
	
	
	@FindBy(xpath ="//label[text()[normalize-space()='Cheque']]")
	private WebElement chequeButton;
	
	
	@FindBy(id = "input-cheque")
	private WebElement chequeField;
	
	@FindBy(xpath = "//input[@name='agree']")
	private WebElement agreeButton;
	
	
	@FindBy(xpath = "//div[@id='account-account']//div")
	private WebElement affiliateSuccess;
	
	public void clickonAffiliateRegisteration() {
		WebDriverUtility.clickOnElement(affiliateRegisteration);
	}
	
	
	public void enterCompany(String company) {
		WebDriverUtility.enterValue(companyField, company);
	}
	
	public void enterWebsite(String website) {
		WebDriverUtility.enterValue(websiteField, website);
	}
	
	public void enterTaxid(String taxID) {
		WebDriverUtility.enterValue(taxField, taxID);
	}
	
	
	public void enterChequeReceiver(String paymentMethod) {
		WebDriverUtility.enterValue(chequeField, paymentMethod);
	}

	public void checkAgree() {

		if (agreeButton.isDisplayed()) {
			agreeButton.click();
		}

	}
	
	public void chequeSelection(String valueOfPay) {

		if (valueOfPay.equalsIgnoreCase("yes")) {
			if (!chequeButton.isSelected())
				WebDriverUtility.clickOnElement(chequeButton);
		} else
			WebDriverUtility.clickOnElement(chequeButton);
	}

	
	public boolean affiliateRegisterationSuccess() {
		boolean successMessage = affiliateSuccess.isDisplayed();
		return successMessage;
	}
	
	
	
	//Edit Affiliate Info

	@FindBy(xpath = "//input[@id='input-bank-name']")
	private WebElement bankNameField;
	
	@FindBy(id = "input-bank-branch-number")
	private WebElement bankBranchField;
	
	@FindBy(id = "input-bank-swift-code")
	private WebElement bankSwiftcodeField;
	
	@FindBy(id = "input-bank-account-name")
	private WebElement bankAccountNameField;
	
	@FindBy(id = "input-bank-account-number")
	private WebElement bankAccountNumberField;
	
	public void enterbankName(String bankName) {
		WebDriverUtility.enterValue(bankNameField, bankName);
	}
	
	public void enterBankBranch(String abaNumber) {
		WebDriverUtility.enterValue(bankBranchField, abaNumber);
	}
	
	public void enterBankSwiftCode(String swiftCode) {
		WebDriverUtility.enterValue(bankSwiftcodeField, swiftCode);
	}
	
	public void enterbankAccountName(String accountName) {
		WebDriverUtility.enterValue(bankAccountNameField, accountName);
	}
	
	public void enterBankAccountNumber(String accountNumber) {
		WebDriverUtility.enterValue(bankAccountNumberField, accountNumber);
	}
	
	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement affiliateEdit;
	
	public void clickonAffiliateEdit() {
		WebDriverUtility.clickOnElement(affiliateEdit);
	}
	
	
	@FindBy(xpath = "(//div[@class='radio']//label)[3]")
	private WebElement bankButton;
	
	public void bankSelection() {
			WebDriverUtility.clickOnElement(bankButton);
	}
	
	@FindBy(xpath = "//div[@id='account-account']//div")
	private WebElement affiliateEditSuccess;
	
	//Edit Your Account
	
	
	@FindBy (xpath = "//a[text()='Edit your account information']")
	private WebElement editAccountButton;
	
	@FindBy (xpath = "//div[text()=' Success: Your account has been successfully updated.']")
	private WebElement editAccountSuccess;
	
	public void clickonEditAccountButton() {
		WebDriverUtility.clickOnElement(editAccountButton);
	}
	
	public void enterFirstNameA(String fName) {
		driver.findElement(By.id("input-firstname")).clear();
		WebDriverUtility.enterValue(firstNameField, fName);
	}

	public void enterLastNameA(String lName) {
		driver.findElement(By.id("input-lastname")).clear();
		WebDriverUtility.enterValue(lastNameField, lName);
	}

	public void enterEmailA(String email) {
		driver.findElement(By.id("input-email")).clear();
		WebDriverUtility.enterValue(emailField, email);
	}

	public void enterTelephoneA(String phoneNumber) {
		driver.findElement(By.id("input-telephone")).clear();
		WebDriverUtility.enterValue(telephoneField, phoneNumber);
	}
	
	public boolean editAccountDoneSuccess() {
		boolean successMessage = editAccountSuccess.isDisplayed();
		return successMessage;
	}
	
}