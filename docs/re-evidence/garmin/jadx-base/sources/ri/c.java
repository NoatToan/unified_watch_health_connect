package ri;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f152799a = Charset.forName("US-ASCII");

    static {
        Charset.forName("UTF-8");
    }

    private c() {
    }

    public static void a(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            h.C(v.h.v(file, "not a readable directory: "));
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                a(file2);
            }
            if (!file2.delete()) {
                h.C(v.h.v(file2, "failed to delete file: "));
                return;
            }
        }
    }
}
