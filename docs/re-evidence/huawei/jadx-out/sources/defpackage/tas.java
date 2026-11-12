package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.openservice.db.control.OpenServiceControl;
import com.huawei.ui.openservice.db.model.OpenService;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes17.dex */
public class tas {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OpenServiceControl f48899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f48900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f48901c;
    private SharedPreferences e;

    public tas() {
        Context contextB = BaseApplication.b();
        this.f48900b = contextB;
        this.e = contextB.getSharedPreferences("Service_Card", 0);
        this.f48901c = LoginInit.getInstance(this.f48900b).getAccountInfo(1011);
        this.f48899a = OpenServiceControl.getInstance(this.f48900b);
    }

    public void a() throws Throwable {
        if (CommonUtil.ap()) {
            int iE = CommonUtil.e(this.f48900b);
            if (a(iE)) {
                LogUtil.a("UIHLH_ServiceInteractor", "initService, new Beta Version! refresh DB, version is ", Integer.valueOf(iE));
                this.f48899a.initOpenServiceDB(this.f48901c);
                b(iE);
            }
        } else {
            this.f48899a.initHomePageService(this.f48901c);
        }
        if (OpenService.isEmpty(this.f48899a.queryAllService())) {
            LogUtil.a("UIHLH_ServiceInteractor", "initService, if no service exist refresh service");
            this.f48899a.initOpenServiceDB(this.f48901c);
        }
    }

    public void e() throws Throwable {
        LogUtil.a("UIHLH_ServiceInteractor", "refreshServiceFW start");
        this.f48899a.initOpenServiceDB(this.f48901c);
    }

    private boolean a(int i) {
        return this.e.getBoolean("Beta_Upgrade_" + i, true);
    }

    private void b(int i) {
        this.e.edit().putBoolean("Beta_Upgrade_" + i, false).apply();
    }
}
