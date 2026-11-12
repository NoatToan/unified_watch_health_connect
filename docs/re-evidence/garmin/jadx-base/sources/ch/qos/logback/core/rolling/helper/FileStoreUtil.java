package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.rolling.RolloverFailure;
import java.io.File;
import java.lang.reflect.Method;
import java.nio.file.Path;
import vb.h;
import wr.g;

/* JADX INFO: loaded from: classes7.dex */
public class FileStoreUtil {
    static final String FILES_CLASS_STR = "java.nio.file.Files";
    static final String PATH_CLASS_STR = "java.nio.file.Path";

    public static boolean areOnSameFileStore(File file, File file2) {
        String strO;
        if (!file.exists()) {
            strO = g.o("File [", file, "] does not exist.");
        } else {
            if (file2.exists()) {
                try {
                    Class<?> cls = Class.forName(FILES_CLASS_STR);
                    Method method = File.class.getMethod("toPath", null);
                    Method method2 = cls.getMethod("getFileStore", Path.class);
                    return method2.invoke(null, method.invoke(file, null)).equals(method2.invoke(null, method.invoke(file2, null)));
                } catch (Exception e4) {
                    throw new RolloverFailure("Failed to check file store equality for [" + file + "] and [" + file2 + "]", e4);
                }
            }
            strO = g.o("File [", file2, "] does not exist.");
        }
        h.s(strO);
        return false;
    }
}
