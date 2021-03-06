public class ScrollintoView {
    public static void main(String[] args) {
        String userDirectory = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",
             userDirectory+"\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.navigate().to("https://jqueryui.com");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement txtEasing = driver.findElement(By
             .xpath("//a[text()='Easing']"));
        js.executeScript("arguments[0].scrollIntoView(true);", txtEasing);
        txtEasing.click();
 }
}
