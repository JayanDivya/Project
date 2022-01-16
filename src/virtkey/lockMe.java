package virtkey;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class lockMe {
	public static void main(String[] args) throws IOException {
			String str ="Divya";
			String applicationName ="LockedMe";
			System.out.println("Welcome to Virtual Key for Repositories in Java\n");
			System.out.println("ApplicationName:"+ applicationName +" developed by "+str+"\n");
			System.out.println("Press Enter Key to continue...");
		    System.in.read();
		    FileOperation.operation();	
		}
	 static class FileOperation
	 {
		 static int options;
		 static int Fc;
		 static String location ="F:\\Project";
		public static void operation() throws IOException
		 { 
			 do 
			 {   
				 int options=0;
				 System.out.println("MAIN MENU");
				 System.out.println("Select the Options Given Below:");
				 System.out.println("1. Retrieve All Files inside Main Folder");
				 System.out.println("2. Perform File Operations");
				 System.out.println("3. Exit\n");
				 Scanner sc = new Scanner(System.in);
				 options= sc.nextInt();
					 switch(options) 
					 {
					 	case 1:
					 		File n = new File("F:\\Project");
					 		File filearray[] = n.listFiles();
					 		for(int i=0;i<filearray.length;i++) 
					 		{
					 			if(filearray[i].isFile())
					 			{
					 				System.out.println("File: "+filearray[i] +"\n");
					 			}
					 			
					 		}
					 	break;
					 	case 2:
					 		do
					 		{
					 			int count=0;
								System.out.println("**FILE OPERATION SECTION**");
								System.out.println("Select the Options Given Below:");
								System.out.println("1. Add File to the folder");
								System.out.println("2. Delete File from the folder");
								System.out.println("3. Search File in the folder");
								System.out.println("4. Goback to Main Menu");
								System.out.println("5. Exit\n");
							    Fc= sc.nextInt();
								switch(Fc) 
								{
									case 1:
										System.out.println("Want to add File?");
										System.out.println("Please Enter the File name with extension");
										String str1 = sc.next();
										File afile = new File(location+"\\"+str1);
										if(afile.exists()) 
										{
											System.out.println("Already exits!!\nTry with new file name again\n");
										}
										else 
										{
											try 
											{
												afile.createNewFile();
												System.out.println("*** Your file is successfully created! ***\n");
											}catch(IOException e)
											{
												e.printStackTrace();
											}
										}
										
									break;
									case 2:
										System.out.println(" Want to Delete File ");
										System.out.println("Please Enter the File name to be deleted  with the extension");
										String str2 = sc.next();
										File dFile = new File(location+"\\"+str2);
										if(dFile.exists()) 
										{
											dFile.delete();
											System.out.println(dFile +" File is Deleted\n");
										}else 
										{
											System.out.println("!!File not Found!!!\n");
										}
									break;
									case 3:
										System.out.println("Want to search File?");
										System.out.println("Please Enter Name of the File to be searched :");
										String str3 = sc.next();
										File sFile = new File("F:\\Project");
										File f[] = sFile.listFiles();
										for(int i=0;i<f.length;i++) {
											if(f[i].getName().startsWith(str3)) {
												count++;
												if(f[i].isFile()) {
									    			System.out.println("File found at location:- "+f[i]+"\n");
									    		}
									    		
											}    		
										}
										if(count==0)
											System.out.println("File Not Found\n");// here we get file not found exception
										break;
									case 4: 
										break;
									case 5:
										System.out.println("Thanks for using application");
										System.exit(1);
										break;

									default:
									     System.out.println("====== you entered Invalid input =======");
										
									}

									System.out.println("Press Enter to continue...");
									System.in.read();
									}while(Fc!=4);
									break;
					 	case 3:
					 		System.out.println("Thanks for using application");
					 		System.exit(1);
					 	default:
					 		System.out.println("====== you entered Invalid input ======");
					 		
					 }  // Switch close
				
			 }while(options!=3);  // do while loop close
		 } // method close
	 
	} // static class close
			
	}// public class close
