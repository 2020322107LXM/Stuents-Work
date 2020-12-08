# Stuents-Work
# 实验四 G202 2020322107 李雪明

# 实验内容
 
  掌握字符串String及其方法的使用，
  掌握文件的读取/写入方法，
  掌握异常处理结构。
# 实验要求
  
  设计学生类，
  采用交互式方式实例化某学生。
  设计程序完成上述的业务逻辑处理，并且把“古诗处理后的输出”结果存储到学生基本信息所在的文本文件A中。
# 实验过程
  Student类：
  用如下语句完成小任务：实现交互式方式实例化某学生
  
 	Student stu=new Student();
	Scanner s=new Scanner(System.in);
	
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
 Txt类：
 用如下语句完成小任务：每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”

 
	try (FileReader fInputStream = new FileReader("F:////A.txt");//输入流文件
	             FileWriter fOutputStream  = new FileWriter("F:////B.txt")){
	            StringBuffer st=new StringBuffer();
	            char[] ch=new char[14];//设置有14个字符
	            while ((fInputStream.read(ch)) !=-1) {
	                st.append(ch, 0,7);
	                st.append("，");
	                st.append(ch, 7, 7);
	                st.append("。"+"\n");
	            }
	            System.out.println(st);
	            fOutputStream.write(new String(st));
	        }catch (IOException e) {
	            e.printStackTrace();
	        }
		
Text类：
用如下语句完成小任务：查询某个汉字出现的次数。
	
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
 # 实验结果
![](https://github.com/2020322107LXM/Stuents-Work/blob/main/%E6%88%AA%E5%9B%BE1607434904.png)
