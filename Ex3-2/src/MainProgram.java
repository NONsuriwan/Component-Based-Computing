import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        // สร้าง bean
        LiveScoreBean scoreBean = new LiveScoreBean();
        
        // สร้าง subscribers
        Subscriber subscriber1 = new Subscriber("Subscriber 1");
        Subscriber subscriber2 = new Subscriber("Subscriber 2");
        
        // ลงทะเบียน subscribers
        scoreBean.addPropertyChangeListener(subscriber1);
        scoreBean.addPropertyChangeListener(subscriber2);
        
        // รับ input จากผู้ใช้
        Scanner scanner = new Scanner(System.in);
        String score = "";
        
        while(true) {
            System.out.print("Enter Score: ");
            score = scanner.nextLine();
            
            // ถ้าไม่ได้ป้อนข้อมูล (กด Enter เปล่าๆ) ให้จบโปรแกรม
            if(score.isEmpty()) {
                break;
            }
            
            // ส่งข้อมูลไปยัง subscribers ผ่าน bean
            scoreBean.setScoreLine(score);
        }
        
        scanner.close();
    }
}
