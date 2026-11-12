package defpackage;

import android.os.Handler;
import com.huawei.basichealthmodel.R;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes.dex */
public class cdg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Handler f1486b;

    public static void d(Handler handler) {
        if (handler == null) {
            LogUtil.j("HL_HealthModelHandlerHelper", "initHandler handler is null");
        } else {
            f1486b = handler;
        }
    }

    public static void a(int i) {
        cbg.d(f1486b, 5000, Integer.valueOf(i));
    }

    public static void b() {
        cbg.d(f1486b, 8000, BaseApplication.b().getResources().getString(R.string.IDS_health_model_edit_error_time));
    }

    public static void d() {
        cbg.d(f1486b, 9000, BaseApplication.b().getResources().getString(R.string.IDS_health_model_user_status_out));
    }

    public static void a() {
        cbg.d(f1486b, 10000, BaseApplication.b().getResources().getString(R.string.IDS_health_model_edit_error));
    }

    public static void e() {
        Handler handler = f1486b;
        if (handler == null) {
            LogUtil.j("HL_HealthModelHandlerHelper", "releaseHandler sHandler is null");
        } else {
            handler.removeCallbacksAndMessages(null);
            f1486b = null;
        }
    }
}
