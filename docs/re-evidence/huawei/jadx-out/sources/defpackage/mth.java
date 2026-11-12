package defpackage;

import android.content.Context;
import android.os.UserManager;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class mth {
    public static boolean d(Context context) {
        if (context == null) {
            LogUtil.a("ContactSync", 1, "CommonUtilMethods", "[isRebootLocked] context is null.");
            return false;
        }
        Object systemService = context.getSystemService("user");
        if (!(systemService instanceof UserManager)) {
            LogUtil.j("CommonUtilMethods", "object not instanceof UserManager");
            return false;
        }
        return !((UserManager) systemService).isUserUnlocked();
    }
}
