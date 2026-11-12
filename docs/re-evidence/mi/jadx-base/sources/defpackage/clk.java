package defpackage;

import android.os.Build;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class clk implements kgi {
    public static boolean a() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "mha-l29".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean b() {
        return a();
    }
}
