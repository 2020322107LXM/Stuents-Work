package package1;
import java.io.*;
import java.util.Scanner;



public class Test {
	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String args[]) throws FileNotFoundException, IOException {
		
    
		Student stu=new Student();
		Scanner s=new Scanner(System.in);
		System.out.println("姓名：");		
		String Name =s.next();
		stu.setName(Name);
		System.out.println("年龄:");
		int Age =s.nextInt();
		stu.setAge(Age);
		System.out.println("性别：");		
		String Sex =s.next();
		stu.setSex(Sex);
		System.out.println("班级：");		
		String Grade =s.next();
		stu.setGrade(Grade);
		System.out.println("学号：");
		int Id =s.nextInt();
		stu.setId(Id);
		 System.out.println("-----------------------------------------");
		 System.out.println(" 姓名： "+Name+" 年龄: "+Age+" 性别："+Sex+" 班级： "+Grade+" 学号："+Id);

/*		char[] char_gs= gs.toCharArray();
		
		for(char gs:char_gs){
		 System.out.print(gs);
		if(i%7==0&&i%14!=0)
			System.out.print(",");
		 if(i%14==0)
			System.out.println(".");
			i++;
		}*/			
		 Txt Txt = new Txt();
	        Txt.txt();
	        
			stu.toshow();
			 System.out.println("-----------------------------------------");
			File file = new File("F:\\A.txt");
			FileInputStream fis = new FileInputStream(file);
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			int len;
			byte[] data = null;
			byte[] buffer = new byte[(int) file.length()];

			while ((len=fis.read(buffer))!=-1){
			    bos.write(buffer,0,len);
			}

			data = bos.toByteArray();
			String str1 = new String(data);

			int count=0;
			Scanner sc = new Scanner(System.in);
			System.out.println("输入你要查找的字或词：");
			char o = sc.next().charAt(0);
			char[] ch1 =str1.toCharArray();
			for(int i=0;i<ch1.length;i++){
			    if(o==ch1[i]){
			        count++;
			    }

			}

			System.out.println("你输入的字或词在诗中出现过"+count+"次。");
			 System.out.println("-----------------------------------------");
			    fis.close();
			    bos.close();
		}

		}

