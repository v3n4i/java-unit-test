@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
	 assertEquals("Будет ошибка если верется возраст меньше 18 лет", true, isAdult);
}
