package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import health.compact.a.SharedPreferenceManager;

/* JADX INFO: loaded from: classes10.dex */
public class miw {
    public static void a(boolean z) {
        SharedPreferenceManager.a("screenshot_permission", "key_is_show_permission_dialog", z);
    }

    public static boolean e() {
        return SharedPreferenceManager.b("screenshot_permission", "key_is_show_permission_dialog", false);
    }

    public static void a(long j) {
        SharedPreferenceManager.c("screenshot_permission", "key_permission_time", j);
    }

    public static boolean c() {
        return System.currentTimeMillis() - SharedPreferenceManager.d("screenshot_permission", "key_permission_time", 0L) < 3600000;
    }

    public static void d() {
        a(true);
        a(System.currentTimeMillis());
        Intent intent = new Intent();
        intent.setAction("com.huawei.health.action.SCREEN_SHOT_PERMISSION_QUEST");
        BaseApplication.getContext().sendBroadcast(intent);
    }

    public static PermissionUtil.PermissionResult a(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            return PermissionUtil.PermissionResult.GRANTED;
        }
        return PermissionUtil.d(context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"});
    }

    public static void a() {
        a(false);
        a(0L);
    }
}
