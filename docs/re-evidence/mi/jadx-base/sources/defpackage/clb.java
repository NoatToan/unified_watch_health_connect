package defpackage;

import android.content.Context;
import android.os.Vibrator;
import androidx.annotation.RequiresPermission;

/* JADX INFO: loaded from: classes6.dex */
public class clb {
    @RequiresPermission("android.permission.VIBRATE")
    public static void a(Context context) {
        b(context, 4);
    }

    @RequiresPermission("android.permission.VIBRATE")
    public static void b(Context context, int i) {
        if (context == null) {
            return;
        }
        try {
            zkb zkbVar = new zkb(context);
            if (zkbVar.b(i)) {
                zkbVar.c(i);
            } else {
                c(context);
            }
        } catch (Exception unused) {
        }
    }

    @RequiresPermission("android.permission.VIBRATE")
    public static void c(Context context) {
        Vibrator vibrator;
        if (context == null || (vibrator = (Vibrator) context.getSystemService("vibrator")) == null) {
            return;
        }
        vibrator.vibrate(24L);
    }
}
