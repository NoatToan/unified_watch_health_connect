package com.google.firebase.crashlytics.internal.persistence;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.crashlytics.internal.Logger;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class FileStore {
    private static final String f = ".com.google.firebase.crashlytics.files.v1";
    private static final String g = "open-sessions";
    private static final String h = "native";
    private static final String i = "reports";
    private static final String j = "priority-reports";
    private static final String k = "native-reports";
    private final File a;
    private final File b;
    private final File c;
    private final File d;
    private final File e;

    public FileStore(Context context) {
        File fileB = b(new File(context.getFilesDir(), f));
        this.a = fileB;
        this.b = b(new File(fileB, g));
        this.c = b(new File(fileB, i));
        this.d = b(new File(fileB, j));
        this.e = b(new File(fileB, k));
    }

    private File a(String str) {
        return c(new File(this.b, str));
    }

    private static synchronized File b(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                return file;
            }
            Logger.getLogger().d("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
            file.delete();
        }
        if (file.mkdirs()) {
            return file;
        }
        throw new IllegalStateException("Could not create Crashlytics-specific directory: " + file);
    }

    private static File c(File file) {
        file.mkdirs();
        return file;
    }

    public static boolean d(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                d(file2);
            }
        }
        return file.delete();
    }

    private static <T> List<T> e(@Nullable T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    public void cleanupLegacyFiles() {
        File[] fileArr = {new File(this.a.getParent(), ".com.google.firebase.crashlytics"), new File(this.a.getParent(), ".com.google.firebase.crashlytics-ndk")};
        for (int i2 = 0; i2 < 2; i2++) {
            File file = fileArr[i2];
            if (file.exists() && d(file)) {
                Logger.getLogger().d("Deleted legacy Crashlytics files from " + file.getPath());
            }
        }
    }

    @VisibleForTesting
    public void deleteAllCrashlyticsFiles() {
        d(this.a);
    }

    public boolean deleteSessionFiles(String str) {
        return d(new File(this.b, str));
    }

    public List<String> getAllOpenSessionIds() {
        return e(this.b.list());
    }

    public File getCommonFile(String str) {
        return new File(this.a, str);
    }

    public List<File> getCommonFiles(FilenameFilter filenameFilter) {
        return e(this.a.listFiles(filenameFilter));
    }

    public File getNativeReport(String str) {
        return new File(this.e, str);
    }

    public List<File> getNativeReports() {
        return e(this.e.listFiles());
    }

    public File getNativeSessionDir(String str) {
        return c(new File(a(str), "native"));
    }

    public File getPriorityReport(String str) {
        return new File(this.d, str);
    }

    public List<File> getPriorityReports() {
        return e(this.d.listFiles());
    }

    public File getReport(String str) {
        return new File(this.c, str);
    }

    public List<File> getReports() {
        return e(this.c.listFiles());
    }

    public File getSessionFile(String str, String str2) {
        return new File(a(str), str2);
    }

    public List<File> getSessionFiles(String str, FilenameFilter filenameFilter) {
        return e(a(str).listFiles(filenameFilter));
    }
}
