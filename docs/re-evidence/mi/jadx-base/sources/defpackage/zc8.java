package defpackage;

import android.os.Environment;
import androidx.annotation.RequiresApi;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class zc8 {

    @RequiresApi(21)
    public static class a {
        public static String a(File file) {
            return Environment.getExternalStorageState(file);
        }
    }

    public static String a(File file) {
        return a.a(file);
    }
}
