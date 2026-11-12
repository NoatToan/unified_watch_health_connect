package defpackage;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.e;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class j3d implements kgi {
    public static boolean a() {
        return "HONOR".equalsIgnoreCase(Build.BRAND) && "STK-LX1".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean b() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "SNE-LX1".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean d() {
        return b() || a();
    }

    public boolean c(Config.a<?> aVar) {
        return aVar != e.h;
    }
}
