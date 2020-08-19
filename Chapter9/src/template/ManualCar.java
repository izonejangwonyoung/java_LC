package template;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("사람이 운전합니다.");
		
		System.out.println("사람이 핸들을 조작합니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("사람이 브레이크로 정지합니다.");
		
	}

	@Override
	public void wiper() {
		System.out.println("비나 눈의 양에 따라 자동으로 조절됩니다.");
	}

}
