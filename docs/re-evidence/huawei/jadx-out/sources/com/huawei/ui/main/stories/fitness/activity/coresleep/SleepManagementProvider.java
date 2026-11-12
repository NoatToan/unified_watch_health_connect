package com.huawei.ui.main.stories.fitness.activity.coresleep;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.h5pro.core.H5ProWebView;
import com.huawei.health.knit.data.MinorProvider;
import com.huawei.health.knit.section.listener.IWebViewRefreshListener;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.sleep.SleepApi;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.H5proUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import defpackage.ddv;
import defpackage.gwl;
import defpackage.gxd;
import defpackage.gxq;
import defpackage.qdm;
import defpackage.qqw;
import defpackage.uag;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class SleepManagementProvider extends MinorProvider<gxq> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile long f26814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f26815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile SleepManagementCallback<gwl> f26816c;
    private volatile SleepManagementCallback<Boolean> d;
    private volatile b e;
    private volatile SleepManagementCallback<Integer> f;
    private final d g = new d(this);
    private final e h = new e(this);
    private a i;
    private volatile BroadcastReceiver j;
    private volatile SleepManagementCallback m;
    private final List<Integer> n;

    public SleepManagementProvider() {
        ArrayList arrayList = new ArrayList();
        this.n = arrayList;
        this.f26815b = 0L;
        this.f26814a = 0L;
        this.e = new b();
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(10007);
        arrayList.add(9);
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.COURSE_RECORD.value()));
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.MINDFULNESS_TYPE.value()));
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.BREATH_TRAIN_SET.value()));
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return VersionControlUtil.isShowSmartSleepImprovement() && CommonUtil.ab((Context) null);
    }

    @Override // com.huawei.health.knit.data.MinorProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        e();
        g();
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, gxq gxqVar) {
        LogUtil.a("SleepManagementProvider", "parseParams");
        if (this.mData == 0) {
            LogUtil.j("SleepManagementProvider", "parseParams failed with null data.");
            return;
        }
        n();
        d();
        LogUtil.a("SleepManagementProvider", "parseParams curTime: ", Long.valueOf(this.e.e));
        if (this.i == null) {
            this.i = new a(this);
        }
        map.put("LAYOUT_VIEW", this.i);
        map.put("BAR_CHART_TIME_INT", Long.valueOf(this.e.e));
        qdm.e(gxqVar.m().get("OPEN_STATUS"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void n() {
        Object obj = ((gxq) this.mData).m().get("MGMT_DAILY_SLEEP_PROCESS");
        this.e.c(new Date(((gxq) this.mData).f()).getTime());
        this.e.a(((gxq) this.mData).r());
        if (obj instanceof gxd) {
            LogUtil.e("SleepManagementProvider", "not sleep daily result");
            this.e.e((gxd) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void d() {
        if (!HandlerExecutor.c()) {
            HandlerExecutor.b(new Runnable() { // from class: uaj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49861b.d();
                }
            });
            return;
        }
        if (this.d != null && this.e.b()) {
            this.e.f();
            ReleaseLogUtil.d("SleepManagementProvider", " notify sleep data isValid:", Boolean.valueOf(this.e.a()), " curTime: ", Long.valueOf(this.e.e));
            this.d.onSuccess(Boolean.valueOf(this.e.a()));
        }
        if (this.f26816c == null || !this.e.d()) {
            return;
        }
        this.e.e();
        final gxd gxdVarC = this.e.c();
        if (gxdVarC == null) {
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: uaf
            @Override // java.lang.Runnable
            public final void run() {
                this.e.a(gxdVarC);
            }
        });
    }

    public /* synthetic */ void a(gxd gxdVar) {
        gwl gwlVar = new gwl();
        gwlVar.a(gxdVar.p());
        gwlVar.b(uag.c(gxdVar, gxdVar.l()));
        ReleaseLogUtil.d("SleepManagementProvider", " notify sleep daily result update:", Boolean.valueOf(gwlVar.c()), " curTime: ", Long.valueOf(this.e.e));
        this.f26816c.onSuccess(gwlVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void d(H5ProWebView h5ProWebView) {
        LogUtil.a("SleepManagementProvider", "loadH5proMiniProgram: ", h5ProWebView, ", instance: ", h5ProWebView != null ? h5ProWebView.getInstance() : Constants.NULL);
        ddv ddvVarB = ddv.b();
        this.f26814a = new Date(((gxq) this.mData).f()).getTime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        H5proUtil.initH5pro();
        int iC = qqw.c(((gxq) this.mData).m(), "from", -1);
        LogUtil.a("SleepManagementProvider", "initH5pro cost: ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), ", from: ", Integer.valueOf(iC));
        H5ProClient.startH5MiniProgram("com.huawei.health.h5.sleep-management", h5ProWebView, new H5ProLaunchOption.Builder().addPath("#/sleepScheme").addCustomizeArg("curTime", Long.toString(this.f26814a)).addCustomizeArg("from", String.valueOf(iC)).setForceDarkMode(1).enableImageCache().addCustomizeJsModule("innerapi", ddvVarB.getCommonJsModule("innerapi")).addCustomizeJsModule("SleepManagementApi", ((SleepApi) Services.b("Main", SleepApi.class)).getSleepManagementH5Bridge()).build());
    }

    public static class a implements IWebViewRefreshListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<SleepManagementProvider> f26819b;

        public a(SleepManagementProvider sleepManagementProvider) {
            this.f26819b = new WeakReference<>(sleepManagementProvider);
        }

        @Override // com.huawei.health.knit.section.listener.IWebViewRefreshListener
        public void notifyWebViewLoad(H5ProWebView h5ProWebView) {
            if (this.f26819b.get() == null) {
                return;
            }
            LogUtil.a("SleepManagementProvider", "notifyWebViewLoad: ");
            this.f26819b.get().d(h5ProWebView);
        }

        @Override // com.huawei.health.knit.section.listener.IWebViewRefreshListener
        public void notifyDataChanged(long j) {
            if (this.f26819b.get() == null) {
                return;
            }
            LogUtil.a("SleepManagementProvider", "notifyDataChanged", Long.valueOf(j));
            this.f26819b.get().a(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j) {
        if (this.f26814a == j) {
            LogUtil.e("SleepManagementProvider", "time is not changed");
            return;
        }
        LogUtil.a("SleepManagementProvider", "notifyDataChanged curTime: ", Long.valueOf(j));
        this.f26814a = j;
        if (this.m != null) {
            this.m.onSuccess(Long.valueOf(j));
        }
    }

    private void g() {
        ObserverManagerUtil.d(new Observer() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SleepManagementProvider.5
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                if (objArr == null || objArr.length != 1) {
                    return;
                }
                Object obj = objArr[0];
                if (obj instanceof SleepManagementCallback) {
                    SleepManagementProvider.this.m = (SleepManagementCallback) obj;
                }
            }
        }, "SLEEP_MANAGEMENT_TIME_TAG");
    }

    private void i() {
        ReleaseLogUtil.d("SleepManagementProvider", "registerH5DataValidObserver().");
        ObserverManagerUtil.d(new Observer() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SleepManagementProvider.4
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                ReleaseLogUtil.d("SleepManagementProvider", "registerH5DataValidObserver().  registerObserver");
                if (objArr == null || objArr.length != 1) {
                    return;
                }
                Object obj = objArr[0];
                if (obj instanceof SleepManagementCallback) {
                    SleepManagementProvider.this.d = (SleepManagementCallback) obj;
                    SleepManagementProvider.this.d();
                }
            }
        }, "SLEEP_MANAGEMENT_DATA_VALID_TAG");
    }

    private void b() {
        ReleaseLogUtil.d("SleepManagementProvider", "registerH5DailyResultObserver().");
        ObserverManagerUtil.d(new Observer() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SleepManagementProvider.1
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                ReleaseLogUtil.d("SleepManagementProvider", "registerH5DailyResultObserver().  registerObserver");
                if (objArr == null || objArr.length != 1) {
                    return;
                }
                Object obj = objArr[0];
                if (obj instanceof SleepManagementCallback) {
                    SleepManagementProvider.this.f26816c = (SleepManagementCallback) obj;
                    SleepManagementProvider.this.d();
                }
            }
        }, "SLEEP_MANAGEMENT_DAILY_RESULT_TAG");
    }

    private void l() {
        ReleaseLogUtil.d("SleepManagementProvider", "unregisterH5TimeObserver().");
        ObserverManagerUtil.a("SLEEP_MANAGEMENT_TIME_TAG");
    }

    private void k() {
        ReleaseLogUtil.d("SleepManagementProvider", "unregisterH5DataValidObserver().");
        ObserverManagerUtil.a("SLEEP_MANAGEMENT_DATA_VALID_TAG");
    }

    private void m() {
        ReleaseLogUtil.d("SleepManagementProvider", "unregisterH5DailyResultObserver().");
        ObserverManagerUtil.a("SLEEP_MANAGEMENT_DAILY_RESULT_TAG");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final SleepManagementCallback<Integer> sleepManagementCallback) {
        HandlerExecutor.b(new Runnable() { // from class: uah
            @Override // java.lang.Runnable
            public final void run() {
                this.f49860a.a(sleepManagementCallback);
            }
        });
    }

    public /* synthetic */ void a(SleepManagementCallback sleepManagementCallback) {
        if (this.f == null) {
            this.f = sleepManagementCallback;
            f();
            e((SleepManagementCallback<Boolean>) null);
            return;
        }
        this.f = sleepManagementCallback;
    }

    private void f() {
        ReleaseLogUtil.d("SleepManagementProvider", "registerSyncResultBroadcast() mSyncStatusReceiver = ", this.j);
        if (this.j != null) {
            return;
        }
        this.j = new BroadcastReceiver() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SleepManagementProvider.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (intent == null) {
                    ReleaseLogUtil.e("SleepManagementProvider", "mSyncStatusReceiver receiver intent is null.");
                    return;
                }
                if (!"com.huawei.hihealth.action_sync_data_result".equals(intent.getAction())) {
                    ReleaseLogUtil.e("SleepManagementProvider", "mSyncStatusReceiver receiver intent.action is error.");
                    return;
                }
                SleepManagementProvider.this.a(intent.getLongExtra("sync_data_result_id", 0L), intent.getBooleanExtra("sync_data_result_success", true), intent.getStringExtra("sync_data_result_type"));
            }
        };
        BroadcastManagerUtil.d(BaseApplication.b(), this.j, new IntentFilter("com.huawei.hihealth.action_sync_data_result"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j, boolean z, String str) {
        ReleaseLogUtil.d("SleepManagementProvider", "mSyncStatusReceiver syncId:", Long.valueOf(j), " mLastSyncId:", Long.valueOf(this.f26815b), " syncResult:", Boolean.valueOf(z), " syncType:", str);
        long j2 = this.f26815b;
        if (j2 != 0) {
            if (j2 == j) {
                this.f26815b = 0L;
                a(z);
                return;
            }
            return;
        }
        if (this.n.contains(Integer.valueOf(CommonUtil.j(str))) || CommonUtil.j(str) == 20000) {
            a(z);
        }
    }

    private void o() {
        ReleaseLogUtil.d("SleepManagementProvider", "unregisterSyncResultBroadcast(). mSyncStatusReceiver:", this.j);
        if (this.j != null) {
            BroadcastManagerUtil.d(BaseApplication.b(), this.j);
            this.j = null;
        }
    }

    private void s() {
        ReleaseLogUtil.d("SleepManagementProvider", "updateSyncStatusStart().");
        if (this.f != null) {
            this.f.onSuccess(1);
        }
    }

    private void a(boolean z) {
        ReleaseLogUtil.d("SleepManagementProvider", "updateSyncStatusResult(). isSuccess = ", Boolean.valueOf(z), " mSyncDataStatusCallback:", Boolean.valueOf(this.f == null));
        if (this.f == null) {
            return;
        }
        if (z) {
            this.f.onSuccess(2);
        } else {
            this.f.onFailure(-1, "Sync failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(SleepManagementCallback<Boolean> sleepManagementCallback) {
        if (sleepManagementCallback != null) {
            sleepManagementCallback.onSuccess(true);
        }
        h();
        ObserverManagerUtil.e("INTEL_SECTION_LOADED", new Object[0]);
    }

    private void h() {
        long j = this.f26815b;
        if (j != 0) {
            ReleaseLogUtil.d("SleepManagementProvider", "Last sync process has not finish. mLastSyncId:", Long.valueOf(j));
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jC = c();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long jC2 = qdm.c();
        if (jCurrentTimeMillis - jC < 180000 || jCurrentTimeMillis2 - jC2 < 120000) {
            LogUtil.j("SleepManagementProvider", "Less than the number of minutes since the last sync, given by the condition");
            return;
        }
        LogUtil.a("SleepManagementProvider", "syncCloud start");
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataTypes(this.n);
        hiSyncOption.setForceSync(true);
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        this.f26815b = jCurrentTimeMillis3;
        hiSyncOption.setSyncId(jCurrentTimeMillis3);
        hiSyncOption.setSyncMethod(2);
        HiHealthNativeApi.a(BaseApplication.b()).synCloud(hiSyncOption, null);
        s();
        e(this.f26815b);
        ReleaseLogUtil.d("SleepManagementProvider", " syncCloud start:", Long.valueOf(this.f26815b));
    }

    private void e(long j) {
        SharedPreferenceManager.e(BaseApplication.b(), String.valueOf(PrebakedEffectId.RT_COIN_DROP), "sleep_management_last_sync_time", String.valueOf(j), null);
    }

    private long c() {
        return CommonUtil.m(BaseApplication.b(), SharedPreferenceManager.e(BaseApplication.b(), String.valueOf(PrebakedEffectId.RT_COIN_DROP), "sleep_management_last_sync_time"));
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider
    public String getLogTag() {
        return "SleepManagementProvider";
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        ReleaseLogUtil.d("SleepManagementProvider", "onDestroy()");
        super.onDestroy();
        j();
        o();
        l();
    }

    private void e() {
        ReleaseLogUtil.d("SleepManagementProvider", "registerH5CmdObserver().");
        ObserverManagerUtil.d(this.g, "registerSyncStatus");
        ObserverManagerUtil.d(this.h, "startSleepAllDataSync");
        b();
        i();
    }

    private void j() {
        ReleaseLogUtil.d("SleepManagementProvider", "unregisterH5CmdObserver().");
        ObserverManagerUtil.a("registerSyncStatus");
        ObserverManagerUtil.a("startSleepAllDataSync");
        k();
        m();
    }

    static class d implements Observer {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<SleepManagementProvider> f26823c;

        public d(SleepManagementProvider sleepManagementProvider) {
            this.f26823c = new WeakReference<>(sleepManagementProvider);
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            SleepManagementProvider sleepManagementProvider = this.f26823c.get();
            if (sleepManagementProvider == null) {
                ReleaseLogUtil.d("SleepManagementProvider", "ReceiveSyncStatusObserver notify failed with SleepManagementProvider null.");
                return;
            }
            ReleaseLogUtil.d("SleepManagementProvider", "ReceiveSyncStatusObserver notify with args.", objArr);
            if (objArr == null || objArr.length == 0) {
                return;
            }
            Object obj = objArr[0];
            if (obj instanceof SleepManagementCallback) {
                sleepManagementProvider.c((SleepManagementCallback) obj);
            }
        }
    }

    static class e implements Observer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<SleepManagementProvider> f26824a;

        public e(SleepManagementProvider sleepManagementProvider) {
            this.f26824a = new WeakReference<>(sleepManagementProvider);
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            SleepManagementProvider sleepManagementProvider = this.f26824a.get();
            if (sleepManagementProvider == null) {
                ReleaseLogUtil.d("SleepManagementProvider", "StartAllSyncObserver notify failed with SleepManagementProvider null.");
                return;
            }
            ReleaseLogUtil.d("SleepManagementProvider", "StartAllSyncObserver notify with args.", objArr);
            if (objArr == null || objArr.length == 0) {
                return;
            }
            Object obj = objArr[0];
            if (obj instanceof SleepManagementCallback) {
                sleepManagementProvider.e((SleepManagementCallback<Boolean>) obj);
            }
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f26820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f26821b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private gxd f26822c;
        private boolean d;
        private long e;
        private boolean j;

        private b() {
            this.e = 0L;
            this.j = false;
            this.f26821b = false;
            this.d = false;
            this.f26822c = null;
            this.f26820a = false;
        }

        public void c(long j) {
            if (j != this.e) {
                this.e = j;
                this.j = true;
                this.f26821b = false;
                this.d = true;
                this.f26820a = false;
                this.f26822c = null;
            }
        }

        public boolean a() {
            return this.f26821b;
        }

        public void a(boolean z) {
            if (z != this.f26821b) {
                this.f26821b = z;
                this.d = true;
            }
        }

        public boolean b() {
            return this.d;
        }

        public void f() {
            this.d = false;
        }

        public gxd c() {
            return this.f26822c;
        }

        public void e(gxd gxdVar) {
            if (gxdVar != this.f26822c) {
                this.f26822c = gxdVar;
                this.f26820a = true;
            }
        }

        public boolean d() {
            return this.f26820a;
        }

        public void e() {
            this.f26820a = false;
        }
    }
}
