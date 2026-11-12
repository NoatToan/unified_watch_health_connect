package defpackage;

import android.system.Os;
import java.io.File;

/* JADX INFO: loaded from: classes11.dex */
public class iis {
    public static long a(String str) {
        try {
            if (new File(str).exists()) {
                return Os.stat(str).st_size;
            }
            return 0L;
        } catch (Exception e) {
            x9s.s(e);
            return 0L;
        }
    }
}
