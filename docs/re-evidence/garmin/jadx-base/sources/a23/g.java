package a23;

import a23.b.C0006b;
import d53.w;
import java.io.File;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/io/FilesKt")
public class g extends f {
    public static boolean d(File file) {
        file.getClass();
        b.C0006b c0006b = f.c(file, c.BOTTOM_UP).new C0006b();
        while (true) {
            boolean z14 = true;
            while (c0006b.hasNext()) {
                File next = c0006b.next();
                if (next.delete() || !next.exists()) {
                    if (z14) {
                    }
                }
                z14 = false;
            }
            return z14;
        }
    }

    public static String e(File file) {
        file.getClass();
        String name = file.getName();
        name.getClass();
        return w.d0('.', name, "");
    }

    public static String f(File file) {
        file.getClass();
        String name = file.getName();
        name.getClass();
        int iL = w.L(0, 6, name, ".");
        return iL == -1 ? name : name.substring(0, iL);
    }
}
