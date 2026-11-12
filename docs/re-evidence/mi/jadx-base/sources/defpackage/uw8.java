package defpackage;

import android.net.Uri;
import com.xiaomi.fitness.common.utils.AppUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes10.dex */
public class uw8 {
    /* JADX WARN: Code duplicated, block: B:36:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static boolean a(String str, Uri uri) {
        try {
            InputStream inputStreamOpenInputStream = AppUtil.getApp().getContentResolver().openInputStream(uri);
            try {
                File file = new File(str);
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStreamOpenInputStream.read(bArr);
                        if (i == -1) {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            inputStreamOpenInputStream.close();
                            return true;
                        }
                        fileOutputStream.write(bArr, 0, i);
                        if (inputStreamOpenInputStream != null) {
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                if (inputStreamOpenInputStream != null) {
                    inputStreamOpenInputStream.close();
                }
                throw th4;
            }
        } catch (Exception unused) {
            return false;
        }
    }

    public static String b(String str) {
        File externalFilesDir = AppUtil.getApp().getExternalFilesDir(str);
        return externalFilesDir != null ? externalFilesDir.getAbsolutePath() : e(str);
    }

    public static String c() {
        return b("WatchFace");
    }

    public static String d() {
        return e("WatchFace");
    }

    public static String e(String str) {
        return AppUtil.getApp().getFilesDir().getAbsolutePath() + File.separator + str;
    }
}
