package com.huawei.ui.homehealth.knit;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import defpackage.qdh;
import defpackage.qdm;
import defpackage.qee;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class HealthInsightsCardProvider extends BaseKnitDataProvider<Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f25603c;
    private SectionBean j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f25601a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Object> f25602b = new HashMap();
    private boolean d = true;
    private Observer e = new Observer() { // from class: spf
        @Override // com.huawei.haf.design.pattern.Observer
        public final void notify(String str, Object[] objArr) {
            this.f48489a.d(str, objArr);
        }
    };

    public /* synthetic */ void d(String str, Object[] objArr) {
        if (str == null) {
            return;
        }
        str.hashCode();
        if (str.equals("com.huawei.plugin.account.login")) {
            d();
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
        LogUtil.a("HealthInsightsCardProvider", "health Insights card loadData");
        this.f25603c = context;
        this.j = sectionBean;
        if (this.d) {
            if (!LoginInit.getInstance(BaseApplication.b()).isBrowseMode()) {
                setIsActive(true);
            }
            ObserverManagerUtil.d(this.e, "com.huawei.plugin.account.login");
            this.d = false;
        }
        d();
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void parseParams(Context context, HashMap<String, Object> map, Object obj) {
        LogUtil.a("HealthInsightsCardProvider", "operation card parseParams, size: ", Integer.valueOf(this.f25602b.size()));
        map.clear();
        map.putAll(this.f25602b);
    }

    private void a() {
        LogUtil.a("HealthInsightsCardProvider", "health trend card refreshSection");
        SectionBean sectionBean = this.j;
        if (sectionBean != null) {
            sectionBean.c(new Object());
        }
    }

    private boolean c() {
        if (LoginInit.getInstance(BaseApplication.b()).isBrowseMode()) {
            if (isActive(this.f25603c)) {
                LogUtil.a("HealthInsightsCardProvider", "login out hide itemview");
                setIsActive(false);
            }
            return false;
        }
        LogUtil.a("HealthInsightsCardProvider", "begin to refresh CardData");
        if (!isActive(this.f25603c)) {
            LogUtil.a("HealthInsightsCardProvider", "Card is hide, need to show Card");
            setIsActive(true);
        }
        return true;
    }

    public void d() {
        LogUtil.a("HealthInsightsCardProvider", "login change need to refresh Card");
        if (c()) {
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: spd
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.b();
                }
            });
            return;
        }
        if (!CommonUtil.bu() && qdm.j()) {
            this.f25602b.clear();
            this.f25602b.put("INIT_CARD_DATA", true);
            a();
            LogUtil.a("HealthInsightsCardProvider", "developer switch is open");
            return;
        }
        LogUtil.a("HealthInsightsCardProvider", "getHealthHighlights");
        qdh.d(new ResponseCallback() { // from class: spc
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f48487c.b(i, (String) obj);
            }
        });
    }

    public /* synthetic */ void b(int i, String str) {
        LogUtil.a("HealthInsightsCardProvider", "getSummaryToCard  errorCode ", Integer.valueOf(i), " summaryResponse ", str);
        if (i != 0) {
            LogUtil.a("HealthInsightsCardProvider", "getHealthHighlights error Code is: ", Integer.valueOf(i));
            return;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("HealthInsightsCardProvider", "response is empty.");
            return;
        }
        if (!qdm.e(str)) {
            LogUtil.a("HealthInsightsCardProvider", "summaryResponse is not change.");
            return;
        }
        qee qeeVar = (qee) HiJsonUtil.d(str, qee.class);
        qdm.d(str);
        this.f25602b.clear();
        this.f25602b.put("REFRESH_CARD_DATA", qeeVar);
        a();
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onResume() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onResume();
        if (c() && !this.f25601a) {
            LogUtil.a("HealthInsightsCardProvider", "onResume getHealthHighlights.");
            b();
        }
        this.f25601a = false;
        ReleaseLogUtil.d("HealthInsightsCardProvider", "main card onResume finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        ObserverManagerUtil.c(this.e);
        this.f25602b.clear();
        this.f25602b.put("DESTROY", true);
        a();
    }
}
