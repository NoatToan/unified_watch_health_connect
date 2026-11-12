package k7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f103259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f103260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f103261c;

    public a(File file) {
        this.f103259a = file;
        this.f103260b = new File(file.getPath() + ".new");
        this.f103261c = new File(file.getPath() + ".bak");
    }

    public final FileOutputStream a() throws IOException {
        File file = this.f103260b;
        File file2 = this.f103261c;
        if (file2.exists()) {
            File file3 = this.f103259a;
            if (file3.isDirectory() && !file3.delete()) {
                file3.toString();
            }
            if (!file2.renameTo(file3)) {
                file2.toString();
                file3.toString();
            }
        }
        try {
            return new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (!file.getParentFile().mkdirs()) {
                vb.h.C(v.h.v(file, "Failed to create directory for "));
                return null;
            }
            try {
                return new FileOutputStream(file);
            } catch (FileNotFoundException e4) {
                vb.h.u(v.h.v(file, "Failed to create new file "), e4);
                return null;
            }
        }
    }
}
