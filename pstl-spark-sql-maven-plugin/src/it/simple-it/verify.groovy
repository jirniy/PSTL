import java.io.*;
import org.codehaus.plexus.util.FileUtils;

def log = FileUtils.fileRead(new File(basedir, "build.log"));

assert log.contains("Provided job definition"), "the job definition was not detected"
assert log.contains("BUILD SUCCESS"), "the build was not successful"
