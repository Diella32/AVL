package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import binarySearchTreePD.AVLTree;
import binarySearchTreePD.Student;

public class Test {
	
	public static void Test1() {
	
		    public static void main(String[] args) {
		        String fileUsed = "testdata.csv";
		        String line = null;
		        String[] stringUsed;

		        AVLTree<Integer, Student> avlTree = new AVLTree<Integer, Student>();

		        try {
		            FileReader fileReader = new FileReader(fileUsed);
		            BufferedReader bufferedReader = new BufferedReader(fileReader);

		            while ((line = bufferedReader.readLine()) != null) {
		                stringUsed = line.split(",");
		                Integer id = Integer.parseInt(stringUsed[0]);
		                String name = stringUsed[1];
		                avlTree.insert(id, new Student(id, name));
		            }
		        } catch (FileNotFoundException ex) {
		            System.out.println("Unable to open file '" + fileUsed + "'");
		        } catch (IOException ex) {
		            System.out.println("Error reading file '" + fileUsed + "'");
		        }

		        System.out.println("AVL Tree Height: " + avlTree.height());
		        Integer searchKey = 782209;
		        System.out.println("Search For: " + searchKey);
		        Student searchResult = avlTree.search(searchKey);
		        if (searchResult != null) {
		            System.out.println("Search result: " + searchKey + " - " + searchResult.getName());
		            avlTree.remove(searchKey);
		            System.out.println("Removed " + searchKey);
		            System.out.print("Search for " + searchKey + ": ");
		            if (avlTree.search(searchKey) == null) {
		                System.out.println(searchKey + " not found");
		            }
		        } else {
		            System.out.println(searchKey + " not found");
		        }
		    }
		}
	
//		    String fileUsed = "testdata.csv";
//		    String line = null;
//		    String dataType; 
//		    Student student;  
//		    String[] stringUsed; 
//		    
//		    AVLTree<Student, Integer> elementUsed = new AVLTree() ; 
//		        
//		    int id = 0; 
//
//		    try {
//		        FileReader fileReader =  new FileReader("C:\\Users\\diell\\Downloads\\testdata.csv");
//		        BufferedReader bufferedReader = new BufferedReader(fileReader);
//		        
//		        while((line = bufferedReader.readLine())!= null) {
//		            stringUsed = line.split(","); 
//		            student = new Student(Integer.parseInt(stringUsed[0]), stringUsed[1]); 
//		            elementUsed.insert(student, student.getKey());
//		        }
//		    }
//		    catch(FileNotFoundException ex) {
//		        System.out.println( "Unable to open file '" +  fileUsed + "'");                
//		    }
//		    catch(IOException ex) {
//		        System.out.println (  "Error reading file '" + fileUsed + "'");   	
//		    }
//
//		    System.out.println("AVL Tree Height: " + elementUsed.height());
//		    System.out.println("Search For: 782209");
//		    System.out.println("Search result: 782209 - " + elementUsed.search(782209).getElement());
//		    elementUsed.remove(782209);
//		    System.out.println("Removed 782209");
//		    System.out.print("Search for 782209: ");
//		    if (elementUsed.search(782209) == null) {
//		        System.out.println("782209 not found"); 
//		    }    
//		}
//	}
