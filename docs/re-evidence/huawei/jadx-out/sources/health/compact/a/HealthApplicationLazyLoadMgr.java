package health.compact.a;

import android.content.Context;
import com.huawei.health.lazyload.LazyLoadingMgr;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import defpackage.iqr;

/* JADX INFO: loaded from: classes.dex */
public class HealthApplicationLazyLoadMgr implements LazyLoadingMgr {
    @Override // com.huawei.health.lazyload.LazyLoadingMgr
    public void load(Context context) {
        CloudImpl.e((Context) null);
        com.huawei.hwlogsmodel.LogUtil.e(context, b());
        c();
        KeyManager.c();
        HiHealthNativeApi.a(context, new LogApiImpl(), new iqr());
    }

    private void c() {
        health.compact.a.hwlogsmodel.ReleaseLogUtil.d("R_HealthApplicationLazyLoadMgr", "overseaBetaLogConfig begin");
        if (com.huawei.hwlogsmodel.common.LogConfig.b() && Utils.o()) {
            String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(2039), "beta_log_switch");
            health.compact.a.hwlogsmodel.ReleaseLogUtil.d("R_HealthApplicationLazyLoadMgr", "betaLogFlag =", strE);
            if (health.compact.a.utils.StringUtils.g(strE)) {
                return;
            }
            LogAllowListConfig.d(!Boolean.parseBoolean(strE));
            com.huawei.hwlogsmodel.LogUtil.f();
        }
    }

    private com.huawei.hwlogsmodel.common.LogConfig b() {
        String strC = EnvironmentUtils.c();
        if (EnvironmentUtils.e()) {
            return LogConfigCenter.d(strC);
        }
        if (EnvironmentUtils.b()) {
            com.huawei.hwlogsmodel.LogUtil.c().add(LogConfigCenter.b(strC));
            return LogConfigCenter.e(strC);
        }
        return LogConfigCenter.c(strC);
    }
}
