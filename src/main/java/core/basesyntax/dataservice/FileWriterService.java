package core.basesyntax.dataservice;

import java.util.List;

public interface FileWriterService {
    void writeDataToFile(String reportToFile, List<String> convertReport);
}
