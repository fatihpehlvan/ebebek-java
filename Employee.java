public class Employee {
	private String name;
	private Double salary;
	private Integer workHours;
	private Integer hireYear;

	public Employee(String name, Double salary, Integer workHours, Integer hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	public Double tax() {
		if (salary >= 1000)
			return salary * 0.03;
		return 0.0;
	}

	public Integer bonus() {
		if (workHours > 40) {
			return 30 * (workHours - 40);
		}
		return 0;
	}

	public Double raiseSalary() {
		int workYear = 2021 - hireYear;
		if (workYear < 10) {
			return salary * 0.05;
		} else if (workYear < 20) {
			return salary * 0.1;
		} else return salary *0.15;
	}

	@Override
	public String toString() {
		String result = "Adı : " + name + "\n" +
				"Maaşı : " + salary + "\n" +
				"Çalışma Saati : " + workHours + "\n" +
				"Başlangıç Yılı : " + hireYear + "\n" +
				"Vergi : " + tax() + "\n" +
				"Maaş Artışı : " + raiseSalary() + "\n" +
				"Vergi ve Bonuslar ile birlikte maaş : " + (salary - tax() + bonus()) + "\n" +
				"Toplam Maaş : " + (salary - tax() + bonus() + raiseSalary());
		System.out.println(result);
		return result;
	}
}
