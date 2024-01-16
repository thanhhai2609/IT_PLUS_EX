package b2;

import java.util.Random;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		int bt;
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			System.out.println("1. Giải bài tập phần câu lệnh điều kiện");
			System.out.println("2. Giải bài tập phần lặp");
			System.out.println("0. Thoát chương trình");
			System.out.print("Chọn bài toán bạn muốn giải:");
			bt = sc.nextInt();
			if(bt == 1 || bt == 2 || bt == 0) {
				switch (bt) {
				case 0: {
					flag = false;
					break;
				}
				case 1: {
					int bt_1;
					boolean flag_1 = true;
					while(flag_1) {
						System.out.println("-------------------------------------------------");
						System.out.println("1.1. Tìm số lớn nhất trong 3 số");
						System.out.println("1.2. Xếp loại điểm");
						System.out.println("1.3. In chuỗi");
						System.out.println("0. Quay lại menu trước đó");
						System.out.println("-------------------------------------------------");
						System.out.print("Nhập bài toán muốn giải:");
						bt_1 = sc.nextInt();
						System.out.println("-------------------------------------------------");
						if(bt_1 == 1 || bt_1 == 2 || bt_1 ==3 || bt_1 ==0) {
							switch (bt_1) {
							case 0: {
								flag_1 = false;
								break;
							}
							case 1: {
								int a, b, c;
								int max;
								System.out.print("Nhập số thứ nhất:");
								a = sc.nextInt();
								System.out.print("Nhập số thứ hai:");
								b = sc.nextInt();
								System.out.print("Nhập số thứ ba:");
								c = sc.nextInt();
								max = a;
								if(b > max) {
									max = b;
								}
								if(c > max) {
									max = c;
								}
								System.out.println("Số lớn nhất trong 3 số là:"+max);
								break;
							}
							case 2: {
								float score;
								int count=0;
								do {
									if(count==0) {
										System.out.print("Nhập vào điểm của học viên:");
										score = sc.nextFloat();
									}else {
										System.out.println("Điểm phải là 1 số lớn hơn hoặc bằng 0.0 và nhỏ hơn hoặc bằng 10.0");
										System.out.print("Hãy nhập lại điểm của học viên:");
										score = sc.nextFloat();
									}
									if(score > 8 && score <= 10.0) {
										System.out.println("Học viên đạt điểm giỏi!!!");
									}
									else if(score <= 8 && score > 6.5) {
										System.out.println("Học viên đạt điểm khá!!!");
									} 
									else if(score <= 6.5 && score > 5) {
										System.out.println("Học viên đạt điểm trung bình!!!");
									}
									else if(score<=5 && score>=0.0) {
										System.out.println("Học viên đạt điểm yếu!!!");
									}else {
										count++;
									}
									
								}while(score > 10 || score < 0);
								break;
							}
							case 3:{
								System.out.print("Nhập:");
								float number = sc.nextFloat();
								if(number > 0) {
									System.out.println("Postitive");
								}else if(number < 0) {
									System.out.println("Negative");
								}else {
									System.out.println("0");
								}
								break;
							}
							default:
								throw new IllegalArgumentException("Unexpected value: " + bt_1);
							}
						}else {
							System.out.println("-------------------------------------------------");
							System.out.println("Chọn 0, 1, 2 hoặc 3");
						}
					}
					break;
				}
				case 2:{
					int bt_2;
					boolean flag_2 = true;
					while(flag_2) {
						System.out.println("\n-------------------------------------------------");
						System.out.println("2.1. Tính giai thừa của một số");
						System.out.println("2.2. In ra màn hình 20 số nguyên tố đầu tiên");
						System.out.println("2.3. In ra màn hình 20 số đầu của dãy Fib");
						System.out.println("2.4. Tính lãi kép");
						System.out.println("2.5. In ra từ 1->100 nếu chia hết cho 3 in ra 'Hello', chia hết cho 5 in ra 'World', cả 3 và 5 in ra 'HelloWorld'");
						System.out.println("2.6. Đoán số");
						System.out.println("0. Quay lại menu trước đó");
						System.out.println("-------------------------------------------------");
						System.out.print("Nhập bài toán muốn giải:");
						bt_2 = sc.nextInt();
						System.out.println("-------------------------------------------------");
						if(bt_2 == 1 || bt_2 == 2 || bt_2 ==3 || bt_2 == 4|| bt_2 == 5|| bt_2 == 6 || bt_2 ==0) {
							switch (bt_2) {
							case 1: {
								int n, gt;
								boolean test = true;
								do {
									if(test == true) {
										System.out.print("Nhập vào số cần tính:");
										n = sc.nextInt();
										if(n<0) {
											test = false;
										}
									}else {
										System.out.println("Số để tính giai thừa phải là số dương");
										System.out.print("Mời nhập lại:");
										n = sc.nextInt();
									}
									gt = 1;
									for(int i=1; i<=n; i++) {
										gt*=i;
									}
								}while(n<0);
								System.out.println("Giai thừa của "+n+" là:"+gt);
								break;
							}
							case 2:{
								int n = 1;
								int count = 0;
								System.out.println("20 số nguyên tố đầu tiên là:");
								while(count<20) {
									if(n<2) {
										n++;
										continue;
									}else {
										boolean test = true;
										for(int i = 2; i<n; i-=-1) {
											if(n%i==0) {
												test = false;
												break;
											}
										}
										if(test) {
											System.out.print(n+"  ");
											count++;
										}
									}
									n++;
								}
								break;
							}
							case 3:{
								//1 1 2 3 5 8
								int n = 20;
						        int a = 0;
						        int b = 1;
						        System.out.println("20 số đầu tiên của dãy Fib là:");
						        System.out.print(a + " " + b + " ");
						        for (int i = 2; i < n; i++) {
						            int next = a + b;
						            System.out.print(next + " ");
						            a = b;
						            b = next;}
								break;
							}
							case 4:{
						        System.out.print("Nhập số tiền gửi (VND): ");
						        double principal = sc.nextDouble();
						        System.out.print("Nhập lãi suất hàng tháng (dưới dạng thập phân, ví dụ: 0.05 cho 5%): ");
						        double rate = sc.nextDouble();
						        System.out.print("Nhập số tháng gửi: ");
						        int months = sc.nextInt();
						        double compoundInterest = principal * Math.pow(1 + rate, months);
						        System.out.printf("Tổng số tiền sau %d tháng là: %.2f VND%n", months, compoundInterest);
								break;
							}
							case 5:{
								for(int i=1;i<101;i++) {
									if(i%3==0&&i%5==0) {
										System.out.println("HelloWorld");
									}else if(i%3==0){
										System.out.println("Hello");
									}else if(i%5==0) {
										System.out.println("World");
									}else {
										System.out.println(i);
									}
								}
								break;
							}
							case 6:{
								Boolean test = false;
								Random random = new Random();
						        System.out.print("Nhập số đầu tiên: ");
						        int minNumber = sc.nextInt();
						        System.out.print("Nhập số thứ hai: ");
						        int maxNumber = sc.nextInt();
						        int randomNumber = random.nextInt((maxNumber - minNumber) + 1) + minNumber;
						        for (int i = 0; i < 3; i++) {
						            System.out.print("Nhập dự đoán của bạn: ");
						            int guess = sc.nextInt();
						            if (guess < randomNumber) {
						                System.out.println("Tăng lên");
						                test = false;
						            } else if (guess > randomNumber) {
						                System.out.println("Giảm xuống");
						                test = false;
						            } else {
						                System.out.println("Bạn đã thắng!"); 
						                test = true;
						                break;
						            }
						        }
						        if (test == false) {
						        	System.out.println("Bạn đã thua. Số đúng là: " + randomNumber);
						        }
						        break;
							}
							default:
								throw new IllegalArgumentException("Unexpected value: " + bt_2);
							}
						}else {
							System.out.println("-------------------------------------------------");
							System.out.println("Chọn số từ 0->6");
						}
					}
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + bt);
				}	
			System.out.println("-------------------------------------------------");
			}else {
				System.out.println("Chỉ nhập 1, 2 hoặc 0");
			}
			
		}
	}
}
