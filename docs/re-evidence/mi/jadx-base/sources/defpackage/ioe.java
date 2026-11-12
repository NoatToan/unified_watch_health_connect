package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Process;
import com.xiaomi.fitness.common.log.Logger;

/* JADX INFO: loaded from: classes6.dex */
public class ioe {
    public static boolean a(Context context) {
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        try {
            Class<?> cls = appOpsManager.getClass();
            Class<?> cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, 10020, Integer.valueOf(Process.myUid()), context.getPackageName())).intValue() == 0;
        } catch (Exception e) {
            Logger.e("MiHealth", "not support", e);
            return false;
        }
    }
}
