package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class lx1 {
    public static void a(File file, ix1 ix1Var) {
        String name = file.getName();
        String parent = file.getParent();
        int iB = ix1Var.b();
        if (iB <= 0) {
            if (iB == 0) {
                for (int i = 1; i < Integer.MAX_VALUE; i++) {
                    File file2 = new File(parent, ix1Var.a(name, i));
                    if (!file2.exists()) {
                        file.renameTo(file2);
                        return;
                    }
                }
                return;
            }
            return;
        }
        File file3 = new File(parent, ix1Var.a(name, iB));
        if (file3.exists()) {
            file3.delete();
        }
        for (int i2 = iB - 1; i2 > 0; i2--) {
            File file4 = new File(parent, ix1Var.a(name, i2));
            if (file4.exists()) {
                file4.renameTo(new File(parent, ix1Var.a(name, i2 + 1)));
            }
        }
        file.renameTo(new File(parent, ix1Var.a(name, 1)));
    }

    public static void b(ix1 ix1Var) {
        int iB = ix1Var.b();
        if (iB < 0) {
            throw new IllegalArgumentException("Max backup index should not be less than 0");
        }
        if (iB != Integer.MAX_VALUE) {
            return;
        }
        throw new IllegalArgumentException("Max backup index too big: " + iB);
    }
}
