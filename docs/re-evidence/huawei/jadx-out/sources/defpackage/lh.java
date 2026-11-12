package defpackage;

import android.os.Environment;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class lh {
    public static boolean c() {
        String externalStorageState = Environment.getExternalStorageState();
        if (externalStorageState == null || externalStorageState.length() <= 0) {
            return false;
        }
        return (externalStorageState.equals("mounted") || externalStorageState.equals("mounted_ro")) && Environment.getExternalStorageDirectory() != null;
    }

    public static void a(String str, String str2) {
        try {
            if (c()) {
                File file = new File(Environment.getExternalStorageDirectory(), str);
                if (file.exists() && file.isFile()) {
                    file.delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    public static String e(String str) {
        try {
            if (!c()) {
                return null;
            }
            File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath(), str);
            if (!file.exists()) {
                return null;
            }
            file.delete();
            return "";
        } catch (Exception unused) {
            return null;
        }
    }
}
