import java.io.File;
import java.util.Objects;

public class setCSV {
    public static void main(String[] args) {
        File dir = new File("/Users/junseok/workspace/java/iwaz_code_assign_2022/data/search_result/ccc1");
        File[]  fileList = dir.listFiles();
//        System.out.println(fileList);
        int count=0;
        for (File file : Objects.requireNonNull(fileList)) {
            String fileName = file.getName();
            System.out.println(fileName);
            File newFile = new File("/Users/junseok/workspace/java/iwaz_code_assign_2022/data/search_result/ccc1/"+fileName+".csv");
            boolean result = file.renameTo(newFile);
            System.out.println(">> file changed!!: " + result);
        }
    }

//    public static void main(String[] args) {
//        // 1. 원본 파일
//        File file = new File("D:\\example\\image.jpg");
//        // 2. new File
//        File newFile = new File("D:\\example\\new_image.jpg");
//        // File newFile = new File("D:\\example\\new_dir\\new_image.jpg");
//        // 3. rename
//        boolean result = file.renameTo(newFile);
//        // 4. 결과 출력
//        System.out.println(result); // true
//    }
}
