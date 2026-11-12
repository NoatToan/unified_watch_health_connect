package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import health.compact.a.SharedPreferenceManager;

/* JADX INFO: loaded from: classes.dex */
public class qgr {
    public static boolean b(Context context) {
        if (context == null) {
            context = BaseApplication.b();
        }
        String strE = SharedPreferenceManager.e(context, String.valueOf(10000), "SP_KEY_CUR_DISPLAY");
        return TextUtils.isEmpty(strE) || "stepCard".equals(strE);
    }

    public static boolean a(Context context) {
        if (context == null) {
            context = BaseApplication.b();
        }
        String strE = SharedPreferenceManager.e(context, String.valueOf(10000), "SP_KEY_CUR_DISPLAY");
        return !TextUtils.isEmpty(strE) && "threeCircleCard".equals(strE);
    }

    public static boolean c(Context context) {
        if (context == null) {
            context = BaseApplication.b();
        }
        String strE = SharedPreferenceManager.e(context, String.valueOf(10000), "SP_KEY_CUR_DISPLAY");
        return !TextUtils.isEmpty(strE) && "threeLeafCard".equals(strE);
    }
}
