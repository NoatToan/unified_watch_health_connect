package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public class ok8 {
    public static File a(Context context, String str) {
        return c() ? Environment.getExternalStorageDirectory() : context.getExternalFilesDir(str);
    }

    public static File b(String str) {
        return c() ? Environment.getExternalStoragePublicDirectory(str) : MiJiaEnvironment.getAppContext().getExternalFilesDir(str);
    }

    public static boolean c() {
        int i = Build.VERSION.SDK_INT;
        if (i < 29) {
            return true;
        }
        return i >= 29 && Environment.isExternalStorageLegacy();
    }
}
