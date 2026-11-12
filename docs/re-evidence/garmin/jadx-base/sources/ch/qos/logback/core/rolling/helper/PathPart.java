package ch.qos.logback.core.rolling.helper;

import java.io.File;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
abstract class PathPart {
    String part;

    public PathPart(String str) {
        this.part = str;
    }

    public abstract List<File> listFiles(FileProvider fileProvider);

    public List<File> listFiles(FileProvider fileProvider, String str) {
        File[] fileArrListFiles = fileProvider.listFiles(new File(str).getAbsoluteFile(), null);
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        return Arrays.asList(fileArrListFiles);
    }

    public abstract boolean matches(File file);
}
