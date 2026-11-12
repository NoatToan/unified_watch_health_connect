package defpackage;

import android.os.Build;
import androidx.annotation.RequiresApi;
import com.xiaomi.fitness.common.utils.RomUtils;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class t0s implements oah {
    public static boolean a() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "MotoG3".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean b() {
        return RomUtils.SAMSUNG.equalsIgnoreCase(Build.BRAND) && "SM-G532F".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean c() {
        return RomUtils.SAMSUNG.equalsIgnoreCase(Build.BRAND) && "SM-J700F".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean d(vf3 vf3Var) {
        return a() || b() || c();
    }
}
