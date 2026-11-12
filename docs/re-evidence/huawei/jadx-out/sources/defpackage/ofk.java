package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import okio.Okio;
import okio.Sink;
import okio.Source;

/* JADX INFO: loaded from: classes3.dex */
public class ofk {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ofk f44289b = new ofk();

    private ofk() {
    }

    public static ofk b() {
        return f44289b;
    }

    public void e(File file, File file2) throws IOException {
        b(file2);
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException("failed to rename " + file + " to " + file2);
    }

    public Source a(File file) throws FileNotFoundException {
        return Okio.source(file);
    }

    public Sink d(File file) throws FileNotFoundException {
        try {
            return Okio.sink(file);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            return Okio.sink(file);
        }
    }

    public void b(File file) throws IOException {
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("failed to delete " + file);
    }

    public void e(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                e(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete " + file2);
            }
        }
    }
}
