
Feature:US1001 Testotomasyonu arama

  Scenario: TC01 Kullanici testotomasyonu sayfasina phone aratabilmeli

    Given kullanici testotomasyonu anasayfaya gider
    When  arama kutusuna phone yazip aratir
    Then  arama sonucunda urun bulunabildiğini test eder
    And sayfayi kapatir
