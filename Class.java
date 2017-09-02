class Cat{
	int age;

	public Cat(int catsAge){
		age = catsAge;
	}

	public void meow(){
		System.out.println("Rwar");
	}

	public void scurry(int feet){
		System.out.println("Your cat ran " + feet + " feet!");
	}

	public int getAge(){
		return age;
	}

	public static void main(String[] args) {
		Cat indigo = new Cat(1);
		indigo.meow();
		indigo.scurry(99);
		int indigoAge = indigo.getAge();
		System.out.println(indigoAge);
	}
}