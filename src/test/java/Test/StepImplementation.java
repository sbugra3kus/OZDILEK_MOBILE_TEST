package Test;

import com.thoughtworks.gauge.Logger;
import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Constants.Constants.*;

public class StepImplementation extends BaseTest {

    WebDriverWait wait = new WebDriverWait(appiumDriver, 60);

    @Step("Alışverişe başla")
    public void AlisveriseBasla() {
        Logger.info("Alışverişe BaşLa Butonuna Tıklanıyor");
        wait.until(ExpectedConditions.elementToBeClickable(By.id(START_SHOPPING))).click();
        Logger.info("Alışverişe BaşLa Butonuna Tıklandı");
    }

    @Step("Kategorileri aç")
    public void KategorileriAc() {
        Logger.info("Kategoriler Butonuna Tıklanıyor");
        wait.until(ExpectedConditions.elementToBeClickable(By.id(CATE))).click();
        Logger.info("Kategoriler Butonuna Tıklandı");
    }

    @Step("Kadın bölümünü seç")
    public void KadınıSec() {
        Logger.info("KADIN BÖLÜMÜ SEÇİLİYOR");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(WOMAN))).click();
        Logger.info("KADIN BÖLÜMÜ SEÇİLDİ");
    }

    @Step("Pantolon seç")
    public void PantolonSec() {
        Logger.info("PANTOLON SEÇİLİYOR");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PANTS))).click();
        Logger.info("PANTOLON SEÇİLDİ");
    }
    @Step("<x> saniye kadar bekleme")
    public void Sleep(int x) throws  InterruptedException {
        Thread.sleep(1000*x);
    }
    @Step("Kaydırma")
    public void Swipe() throws InterruptedException {
        Logger.info("SAYFA KAYDIRILIYOR");
        TouchAction action = new TouchAction(appiumDriver);
        for (int a = 0; a <= 50; a++) {
            action.press(new PointOption().withCoordinates(553, 1793)).moveTo(new PointOption().withCoordinates(553, 408)).release().perform();
        }
        Logger.info("SAYFA KAYDIRILDI");
    }
    @Step("Pantolon Seçme")
    public void LastPants(){
        Logger.info("EN SON PANTOLON SEÇİLİYOR");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(LAST_PANTS))).click();
        Logger.info("EN SON PANTOLON SEÇİLDİ");
    }
    @Step("Geri Tıklama")
    public void GeriTiklama() {
        Logger.info("GERİ BUTONUNA TIKLANILIYOR");
        wait.until(ExpectedConditions.elementToBeClickable(By.id(TURN_BACK))).click();
        Logger.info("GERİ BUTONUNA TIKLANDI");
    }
    @Step("Hesabıma Tıklama")
    public void Account() {
        Logger.info("HESABIM AÇILIYOR");
        wait.until(ExpectedConditions.elementToBeClickable(By.id(ACCOUNT))).click();
        Logger.info("HESABIM AÇILDI");
    }
    @Step("Sepetime Tıkla")
    public void Cart() {
        Logger.info("SEPETİM AÇILIYOR");
        wait.until(ExpectedConditions.elementToBeClickable(By.id(CART))).click();
        Logger.info("SEPETİM AÇILDI");
    }
    @Step("ASSERT Main")
    public void AssertShopping() {
        Logger.info("ANASAYFA KONTROL EDİLİYOR");
        MobileElement element = (MobileElement) appiumDriver.findElementByXPath(MAIN);
        String elText1 = element.getText();
        System.out.println(elText1);
        Assert.assertEquals(MAGAZA,elText1);
        Logger.info("ANASAYFA KONTROL EDİLDİ");
    }
    @Step("ASSERT CATE")
    public void AssertCate() {
        Logger.info("KATEGORİLER KONTROL EDİLİYOR");
        MobileElement element = (MobileElement) appiumDriver.findElementByXPath(CATES);
        String elText2 = element.getText();
        System.out.println(elText2);
        Assert.assertEquals(CATE_ASSERT,elText2);
        Logger.info("KATEGORİLER KONTROL EDİLDİ");
    }
    @Step("ASSERT ACCOUNT")
    public void AssertAccount() {
        Logger.info("HESABIM KONTROL EDİLİYOR");
        MobileElement element = (MobileElement) appiumDriver.findElementByXPath(ACCOUNT_PATH);
        String elText3 = element.getText();
        System.out.println(elText3);
        Assert.assertEquals(ACCOUNT_ASSERT,elText3);
        Logger.info("HESABIM KONTROL EDİLDİ");
    }
    @Step("ASSERT BACK")
    public void AssertBack() {
        Logger.info("GERİ DÖNÜŞ KONTROL EDİLİYOR");
        MobileElement element = (MobileElement) appiumDriver.findElementByXPath(BACK_ASSERT);
        String elText4 = element.getText();
        System.out.println(elText4);
        Assert.assertEquals(BACK_ASSERT_TEXT,elText4);
        Logger.info("GERİ DÖNÜŞ KONTROL EDİLDİ");
    }
}