import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBox {


    @Test
    void successFillTextBox(){
        open("https://demoqa.com/automation-practice-form");
        // перейти на тестовый сайт
        /*$("#firstName").setValue("Steve");
        // Ввод имени
        $(byId("lastName")).setValue("Wolf");
        //Ввод фамилии
        $(By.id("userEmail")).setValue("johnny@junior.net");
        // е-мэйл пользователя
        $("[id=genterWrapper]").$(byText("Male")).click();
        // проставить чек-бокс пол
        $(by("id", "userNumber")).setValue("7977777777");
        // номер телефона
        $("#dateOfBirth-wrapper").click();
        // вызов календаря
        $(".react-datepicker__year-select").selectOption("1990");
        // выбор года
        $(".react-datepicker__month-select").selectOption("March");
        // выбор месяца
        $(".react-datepicker__day--031").click();
        // выбор дня
       // $("#subjectsInput").setValue("Goblin");
        // выбор хобби (спроставляем чек-боксы)
        $("#hobbiesWrapper > div.col-md-9.col-sm-12 > div:nth-child(1) > label").click();*/
        // загрузка файла
        $("#userForm > div:nth-child(8) > div.col-md-9.col-sm-12 > div > label").click();
        // Заполнить "Текущий адрес"
        // Выбрать штат в выпадающем меню
        // Выбрать город

        }
}
