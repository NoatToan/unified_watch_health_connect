package androidx.profileinstaller;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private a() {
    }

    public static boolean a(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z14 = true;
        for (File file2 : fileArrListFiles) {
            z14 = a(file2) && z14;
        }
        return z14;
    }
}
