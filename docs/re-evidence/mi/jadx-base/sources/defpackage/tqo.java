package defpackage;

import android.os.Build;
import androidx.annotation.RequiresApi;
import com.xiaomi.passport.ui.utils.OsHelper;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class tqo implements kgi {
    public static boolean a() {
        return OsHelper.ROM_OPPO.equalsIgnoreCase(Build.MANUFACTURER) && "OP4E75L1".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean b() {
        if ("SAMSUNG".equalsIgnoreCase(Build.MANUFACTURER)) {
            String str = Build.DEVICE;
            if ("F2Q".equalsIgnoreCase(str) || "Q2Q".equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean c() {
        return b() || a();
    }
}
