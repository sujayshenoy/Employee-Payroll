import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.yml.employeepayroll.FileIO;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeePayrollTest {
    FileIO fileIO;

    @Before
    public void initialize() {
        fileIO = new FileIO();
    }
    
    @Test
    public void trueIfFileExists() throws IOException {
        Path path = Paths.get(System.getProperty("user.home"));
        Assert.assertTrue(fileIO.checkIfExists(path));
    }

    @Test
    public void falseIfFileDeleted() throws IOException {
        Path path = Paths.get(System.getProperty("user.home"), "tempFile");
        fileIO.deleteFile(path);
        Assert.assertFalse(fileIO.checkIfExists(path));
    }
    
    @Test
    public void trueIfDirectoryCreated() throws IOException {
        Path path = Paths.get(System.getProperty("user.home"), "tempDirectory");
        fileIO.createDirectory(path);
        Assert.assertTrue(fileIO.checkIfExists(path));
    }

    @Test
    public void trueIfFileCreated() throws IOException {
        Path path = Paths.get(System.getProperty("user.home"), "newEmptyFile");
        fileIO.createFile(path);
        Assert.assertTrue(fileIO.checkIfExists(path));
    }

    @Test
    public void listFiles() throws IOException {
        Path path = Paths.get(System.getProperty("user.home"));
        fileIO.listFiles(path);
    }
}
