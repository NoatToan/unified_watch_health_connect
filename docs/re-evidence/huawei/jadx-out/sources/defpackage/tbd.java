package defpackage;

import android.content.Context;
import android.content.Intent;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.healthcloud.plugintrack.notification.HealthSportingNotificationHelper;
import com.huawei.hwadpaterhealthmgr.PluginHealthTrackAdapterImpl;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes17.dex */
public class tbd {
    public static void e(final Context context) {
        ReleaseLogUtil.d("Track_checkRestartHelper", "enter checkRestart");
        if (iwy.a(context).p() != 1) {
            HealthSportingNotificationHelper.c();
        }
        final ive iveVarC = ive.c();
        iveVarC.w();
        iveVarC.setAdapter(PluginHealthTrackAdapterImpl.getInstance(context));
        iveVarC.c(context);
        HandlerExecutor.c(new Runnable() { // from class: tbb
            @Override // java.lang.Runnable
            public final void run() {
                tbd.d(context, iveVarC);
            }
        });
    }

    static /* synthetic */ void d(Context context, ive iveVar) {
        boolean isLogined = LoginInit.getInstance(context).getIsLogined();
        ReleaseLogUtil.d("Track_checkRestartHelper", "enter checkRestart isLogin = ", Boolean.valueOf(isLogined));
        if (!isLogined) {
            iwy.a(context).i(false);
        }
        if (iveVar.a(context) && isLogined) {
            CommonUtil.d("Track_checkRestartHelper", "-Restart sport");
            ReleaseLogUtil.d("Track_checkRestartHelper", "Restart now");
            iwy.a(context).i(true);
            iveVar.e(context);
            swi.c(2);
        }
        d(context);
    }

    public static void c(Context context) {
        long jD = lua.d(Integer.toString(20002), "last_unsaved_track", 0L);
        ReleaseLogUtil.d("Track_checkRestartHelper", "lastUnsavedTrackStartTime:", Long.valueOf(jD));
        if (jD > 0) {
            PluginHealthTrackAdapterImpl.getInstance(context).saveBackTrackDataToDb(jD);
        }
    }

    private static void d(Context context) {
        if (context == null) {
            return;
        }
        if (Utils.o()) {
            ReleaseLogUtil.e("Track_checkRestartHelper", "updateAutoTrackStateToDaemonService the version is oversea");
            return;
        }
        String string = Integer.toString(20002);
        String strE = SharedPreferenceManager.e(context, string, "com.huawei.auto_track_refresh_sp.track.config");
        if (strE == null || "".equals(strE)) {
            SharedPreferenceManager.e(context, string, "com.huawei.auto_track_refresh_sp.track.config", "1", new StorageParams());
            iyd iydVar = new iyd();
            iydVar.a(context);
            try {
                Intent intent = new Intent("com.huawei.health.track.config");
                intent.setPackage(context.getPackageName());
                intent.setClassName(context.getPackageName(), "com.huawei.health.manager.DaemonService");
                intent.putExtra("autotrack_enable", iydVar.e());
                intent.putExtra("stop_delay", iydVar.b());
                intent.putExtra("start_delay", iydVar.c());
                context.startService(intent);
            } catch (SecurityException e) {
                ReleaseLogUtil.a("Track_checkRestartHelper", "updateAutoTrackStateToDaemonService", ExceptionUtils.c(e));
            }
        }
    }
}
