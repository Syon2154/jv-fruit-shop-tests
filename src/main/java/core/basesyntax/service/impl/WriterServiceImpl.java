package core.basesyntax.service.impl;

import core.basesyntax.service.WriterService;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WriterServiceImpl implements WriterService {
    @Override
    public void write(String filePath, List<String> data) {
        if (filePath == null) {
            throw new RuntimeException("File path is null");
        }
        Path path = Paths.get(filePath);
        try {
            Files.write(path, data);
        } catch (IOException e) {
            throw new RuntimeException("Can't write to file " + filePath, e);
        }
    }
}
