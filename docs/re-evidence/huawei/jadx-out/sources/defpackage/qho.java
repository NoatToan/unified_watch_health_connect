package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.servicesapi.R;
import com.huawei.pluginfitnessadvice.h5pro.SeriesCourseH5Repository;
import com.huawei.threecircle.manager.WheelChairStateManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes15.dex */
public class qho {
    public static void e(long j, int i) {
        ReleaseLogUtil.d("R_WheelChairUtils", npt.d("startWheelDetail date timeMillis:", Long.valueOf(j), "pushesValStat:", Integer.valueOf(i)));
        ddv.b().initH5Pro();
        ddv ddvVarB = ddv.b();
        H5ProLaunchOption.Builder forceDarkMode = new H5ProLaunchOption.Builder().addPath("#/wheelChair?timeStamp=" + j + "&pushesValStat=" + i).setImmerse().showStatusBar().setStatusBarTextBlack(true).setForceDarkMode(1);
        SeriesCourseH5Repository.registerService();
        ddvVarB.loadH5ProApp(BaseApplication.b(), "com.huawei.health.h5.sports-record", forceDarkMode);
    }

    public static String e(int i) {
        if (WheelChairStateManager.a().d()) {
            return qre.f(R.string.IDS_active_hours_wheel);
        }
        return qre.f(i);
    }

    public static String d(int i, String str, Class cls) {
        if (WheelChairStateManager.a().d()) {
            return qre.f(qre.e(str + "_wc", "string", cls));
        }
        return qre.f(i);
    }
}
