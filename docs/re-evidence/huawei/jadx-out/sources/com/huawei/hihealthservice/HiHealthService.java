package com.huawei.hihealthservice;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.IBinder;
import com.braintreepayments.api.PayPalRequest;
import com.huawei.haf.application.BroadcastManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.IBinderInterceptor;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.dictionary.utils.ProductMapParseUtil;
import com.huawei.hihealthservice.db.helper.HiHealthDBHelper;
import com.huawei.hihealthservice.hihealthkit.HiHealthKitBinder;
import com.huawei.hihealthservice.hihealthkit.HiHealthKitCommonOhosBinder;
import com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder;
import com.huawei.hihealthservice.hihealthkit.HiHealthKitOhosBinder;
import com.huawei.hihealthservice.hihealthkit.WearKitBinder;
import com.huawei.hihealthservice.manager.SyncCloudInitWorkManager;
import com.huawei.hwauthutil.HsfSignValidator;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwlogsmodel.common.LogConfig;
import com.huawei.login.ui.login.HealthAccessTokenUtil;
import com.huawei.login.ui.login.util.SharedPreferenceUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.wearkit.IWearBinderInterceptor;
import defpackage.ktn;
import defpackage.kto;
import defpackage.lbe;
import defpackage.lbi;
import defpackage.lee;
import defpackage.lep;
import defpackage.lev;
import defpackage.lgp;
import defpackage.liq;
import defpackage.liv;
import defpackage.ljm;
import defpackage.lkb;
import defpackage.lkt;
import health.compact.a.ApplicationLazyLoad;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.BuildConfigProperties;
import health.compact.a.CommonUtil;
import health.compact.a.DfxMonitorCenter;
import health.compact.a.HiDateUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.LogAllowListConfig;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.text.ParseException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes2.dex */
public class HiHealthService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f12344a = new Object();
    private static final Object e = new Object();
    private static final Object d = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f12345c = new Object();
    private kto j = null;
    private HiHealthKitCommonOhosBinder k = null;
    private HiHealthKitBinder g = null;
    private HiHealthKitExtendBinder m = null;
    private HiHealthKitOhosBinder l = null;
    private WearKitBinder p = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IBinderInterceptor.Stub f12346b = null;
    private IWearBinderInterceptor.Stub t = null;
    private c h = null;
    private BroadcastReceiver r = new BroadcastReceiver() { // from class: com.huawei.hihealthservice.HiHealthService.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("com.huawei.health.action.DATA_DICTIONARY_SHOULD_RELOAD".equals(intent.getAction())) {
                HiHealthDictManager.a(BaseApplication.getContext()).c(true);
            }
        }
    };
    private BroadcastReceiver o = new BroadcastReceiver() { // from class: com.huawei.hihealthservice.HiHealthService.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("com.huawei.plugin.account.logout".equals(action)) {
                LogUtil.a("HiH_HiHealthService", "logout");
                lbi.a(BaseApplication.getContext()).a();
            } else if ("com.huawei.plugin.account.login".equals(action)) {
                LogUtil.a("HiH_HiHealthService", PayPalRequest.LANDING_PAGE_TYPE_LOGIN);
                lbi.a(BaseApplication.getContext()).b();
            }
        }
    };
    private BroadcastReceiver i = new AnonymousClass4();
    private BroadcastReceiver n = new BroadcastReceiver() { // from class: com.huawei.hihealthservice.HiHealthService.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("HiH_HiHealthService", "mLogReceiver onReceive intent is null");
                return;
            }
            String action = intent.getAction();
            if ("com.huawei.health.action.ACTION_OVERSEA_BETA_LOG".equals(action)) {
                ReleaseLogUtil.d("HiH_HiHealthService", "begin to switch beta log from oversea to domestic");
                LogAllowListConfig.d(!Boolean.parseBoolean(SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(2039), "beta_log_switch")));
                LogUtil.f();
            }
            if ("com.huawei.health.action.ACTION_BETA_DEBUG_LOG".equals(action)) {
                ReleaseLogUtil.d("HiH_HiHealthService", "begin to open debug level for beta log");
                LogConfig.d(Boolean.parseBoolean(SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(Constants.START_TO_INDOOR_RUNNING), "beta_debug_log_switch")));
                LogUtil.a("HiH_HiHealthService", "begin to set log level, current minimum logLevel is debug: true, BUILD_TYPE: ", BuildConfigProperties.d(), ", LOG_LEVEL: ", Integer.valueOf(health.compact.a.LogConfig.e()));
            }
        }
    };
    private BroadcastReceiver f = new BroadcastReceiver() { // from class: com.huawei.hihealthservice.HiHealthService.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("HiH_HiHealthService", "mDeviceStatusReceiver onReceive intent is null");
                return;
            }
            try {
                if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                    ReleaseLogUtil.d("HiH_HiHealthService", "device action state has changed.");
                    lbi.a(BaseApplication.getContext()).a(intent);
                }
            } catch (RuntimeException e2) {
                ReleaseLogUtil.a("HiH_HiHealthService", "mDeviceStatusReceiver onReceive error", LogAnonymous.b(e2));
            }
        }
    };
    private BroadcastReceiver q = new BroadcastReceiver() { // from class: com.huawei.hihealthservice.HiHealthService.6
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("HiH_HiHealthService", "mProductMapUpdateReceiver onReceive intent is null");
            } else if ("com.huawei.health.action.PRODUCT_MAP_UPDATE".equals(intent.getAction())) {
                ReleaseLogUtil.d("HiH_HiHealthService", "product_map has updated,reload product_map config");
                ProductMapParseUtil.a(BaseApplication.getContext());
            }
        }
    };

    /* JADX INFO: renamed from: com.huawei.hihealthservice.HiHealthService$4, reason: invalid class name */
    public class AnonymousClass4 extends BroadcastReceiver {
        AnonymousClass4() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean booleanExtra = intent.getBooleanExtra("isForeground", true);
            boolean z = System.currentTimeMillis() - lkb.a(context, "WAL_CHECKPOINT_TIME", 0, 0L) >= 60000;
            if (booleanExtra || !z || liq.h() || lgp.j()) {
                return;
            }
            lkb.c(context, "WAL_CHECKPOINT_TIME", System.currentTimeMillis(), 0);
            ThreadPoolManager.c().execute(new Runnable() { // from class: ktv
                @Override // java.lang.Runnable
                public final void run() {
                    HiHealthDBHelper.d().c();
                }
            });
        }
    }

    @Override // android.app.Service
    public void onCreate() throws Throwable {
        super.onCreate();
        ApplicationLazyLoad.a();
        ReleaseLogUtil.d("HiH_HiHealthService", "onCreate()");
        d();
        Context applicationContext = getApplicationContext();
        if (CommonUtil.ca()) {
            if (b(applicationContext)) {
                LogUtil.d("HiH_HiHealthService", "need delete DB file");
                if (!applicationContext.deleteDatabase("hihealth_003.db")) {
                    LogUtil.d("HiH_HiHealthService", "try delete again return ", Boolean.valueOf(applicationContext.deleteDatabase("hihealth_003.db")));
                }
            }
            a(applicationContext);
        }
        d(applicationContext);
        h();
        SyncCloudInitWorkManager.b();
    }

    private void d(Context context) {
        this.h = new c();
        HealthAccessTokenUtil.getAtInstance().registerReceiver();
        if (this.r != null) {
            BroadcastManagerUtil.b(BaseApplication.getContext(), this.r, new IntentFilter("com.huawei.health.action.DATA_DICTIONARY_SHOULD_RELOAD"));
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.plugin.account.logout");
        if (SharedPreferenceUtil.getInstance(BaseApplication.getContext()).getIsLogined()) {
            lbi.a(context).b();
        } else {
            LogUtil.a("HiH_HiHealthService", "app has not login, delayed registration.");
            intentFilter.addAction("com.huawei.plugin.account.login");
        }
        if (this.o != null) {
            BroadcastManagerUtil.b(BaseApplication.getContext(), this.o, intentFilter);
        }
        if (this.n != null && LogConfig.b()) {
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("com.huawei.health.action.ACTION_OVERSEA_BETA_LOG");
            intentFilter2.addAction("com.huawei.health.action.ACTION_BETA_DEBUG_LOG");
            BroadcastManagerUtil.d(BaseApplication.getContext(), this.n, intentFilter2, LocalBroadcast.f36595c, null);
        }
        BroadcastReceiver broadcastReceiver = this.i;
        if (broadcastReceiver != null) {
            BroadcastManager.d(broadcastReceiver);
        }
        if (this.f != null) {
            BroadcastManagerUtil.c(BaseApplication.getContext(), this.f, new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED"), LocalBroadcast.f36595c, null);
        }
        if (this.q != null) {
            IntentFilter intentFilter3 = new IntentFilter();
            intentFilter3.addAction("com.huawei.health.action.PRODUCT_MAP_UPDATE");
            BroadcastManagerUtil.d(BaseApplication.getContext(), this.q, intentFilter3, LocalBroadcast.f36595c, null);
        }
    }

    private void d() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.hihealthservice.HiHealthService.10
            @Override // java.lang.Runnable
            public void run() {
                ktn.c().a();
            }
        });
    }

    private void h() {
        LogUtil.a("HiH_HiHealthService", "sendHiHealthServiceStartBroadcast");
        BroadcastManagerUtil.e(BaseApplication.getContext(), new Intent("com.huawei.health.action.HIHEALTH_SERVICE_START"));
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        ReleaseLogUtil.d("HiH_HiHealthService", "onBind intent = ", intent == null ? null : intent.getAction());
        if (intent != null) {
            if ("com.huawei.health.action.KIT_SERVICE".equals(intent.getAction()) || "com.huawei.health.action.KIT_OHOS".equals(intent.getAction()) || "com.huawei.health.action.KIT_COMMON_OHOS".equals(intent.getAction())) {
                if (this.f12346b == null) {
                    this.f12346b = new b(this);
                }
                return this.f12346b;
            }
            if ("com.huawei.health.action.WEAR_KIT_SERVICE".equals(intent.getAction())) {
                if (this.t == null) {
                    this.t = new d(this);
                }
                return this.t;
            }
        }
        if (this.j == null) {
            DfxMonitorCenter.b();
            this.j = new kto(getApplicationContext(), this.h);
            HiHealthDictManager.a(BaseApplication.getContext()).c(false);
            ljm.c();
            liv.d().b(getApplicationContext());
        }
        return this.j;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        ReleaseLogUtil.d("HiH_HiHealthService", "onUnBind intent = ", intent == null ? null : intent.getAction());
        return super.onUnbind(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        LogUtil.a("HiH_HiHealthService", "onStartCommand() intent = ", intent, ",flags = ", Integer.valueOf(i), ",startId = ", Integer.valueOf(i2));
        stopSelf(i2);
        return 2;
    }

    @Override // android.app.Service
    public void onDestroy() {
        ReleaseLogUtil.d("HiH_HiHealthService", "onDestroy()");
        kto ktoVar = this.j;
        if (ktoVar != null) {
            ktoVar.c();
        }
        c cVar = this.h;
        if (cVar != null) {
            cVar.d();
        }
        HiHealthKitBinder hiHealthKitBinder = this.g;
        if (hiHealthKitBinder != null) {
            hiHealthKitBinder.onDestroy();
        }
        HiHealthKitExtendBinder hiHealthKitExtendBinder = this.m;
        if (hiHealthKitExtendBinder != null) {
            hiHealthKitExtendBinder.onDestroy();
        }
        HiHealthKitOhosBinder hiHealthKitOhosBinder = this.l;
        if (hiHealthKitOhosBinder != null) {
            hiHealthKitOhosBinder.onDestroy();
        }
        HiHealthKitCommonOhosBinder hiHealthKitCommonOhosBinder = this.k;
        if (hiHealthKitCommonOhosBinder != null) {
            hiHealthKitCommonOhosBinder.onDestroy();
        }
        WearKitBinder wearKitBinder = this.p;
        if (wearKitBinder != null) {
            wearKitBinder.onDestroy();
        }
        if (this.r != null) {
            BaseApplication.getContext().unregisterReceiver(this.r);
        }
        if (this.o != null) {
            BaseApplication.getContext().unregisterReceiver(this.o);
        }
        if (this.n != null && LogConfig.b()) {
            BaseApplication.getContext().unregisterReceiver(this.n);
        }
        if (this.f != null) {
            BaseApplication.getContext().unregisterReceiver(this.f);
        }
        BroadcastReceiver broadcastReceiver = this.i;
        if (broadcastReceiver != null) {
            BroadcastManager.n(broadcastReceiver);
        }
        if (this.q != null) {
            BaseApplication.getContext().unregisterReceiver(this.q);
        }
        lgp.f().q();
        HealthAccessTokenUtil.getAtInstance().unregisterReceiverToGetAt();
        super.onDestroy();
    }

    static class b extends IBinderInterceptor.Stub {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile HiHealthService f12352b;

        public b(HiHealthService hiHealthService) {
            this.f12352b = hiHealthService;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:24:0x0041  */
        @Override // com.huawei.hihealth.IBinderInterceptor
        public IBinder getServiceBinder(String str) {
            byte b2;
            if (str == null) {
                return b();
            }
            str.hashCode();
            switch (str) {
                case "KIT_COMMON_OHOS_EXTEND":
                    b2 = 0;
                    break;
                case "KIT_COMMON_OHOS_NATIVE":
                    b2 = 1;
                    break;
                case "KIT_EXTEND":
                    b2 = 2;
                    break;
                case "KIT_OHOS":
                    b2 = 3;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0 || b2 == 1) {
                return e(str);
            }
            if (b2 == 2) {
                return c();
            }
            if (b2 == 3) {
                return a();
            }
            LogUtil.a("HiH_HiHealthService", "no such service");
            return null;
        }

        private IBinder a() {
            int callingUid = Binder.getCallingUid();
            Context applicationContext = this.f12352b.getApplicationContext();
            String nameForUid = applicationContext.getPackageManager().getNameForUid(callingUid);
            LogUtil.a("HiH_HiHealthService", "getServiceBinder uid:", Integer.valueOf(callingUid), " packageName:", nameForUid);
            lbe.c(this.f12352b, this.f12352b.h);
            if (this.f12352b.l == null) {
                synchronized (HiHealthService.f12344a) {
                    if (this.f12352b.l == null) {
                        try {
                            this.f12352b.l = new HiHealthKitOhosBinder(applicationContext, this.f12352b.h);
                        } catch (lkt e) {
                            ReleaseLogUtil.a("HiH_HiHealthService", e.getMessage());
                            return null;
                        }
                    }
                }
            }
            try {
                if (HsfSignValidator.b(nameForUid)) {
                    return this.f12352b.l;
                }
            } catch (Exception e2) {
                ReleaseLogUtil.a("HiH_HiHealthService", "getServiceBinder Exception", LogAnonymous.b(e2));
            }
            return this.f12352b.l;
        }

        private IBinder e(String str) throws Throwable {
            int callingUid = Binder.getCallingUid();
            Context applicationContext = this.f12352b.getApplicationContext();
            String nameForUid = applicationContext.getPackageManager().getNameForUid(callingUid);
            LogUtil.a("HiH_HiHealthService", "getServiceBinder uid:", Integer.valueOf(callingUid), " packageName:", nameForUid);
            lbe.c(this.f12352b, this.f12352b.h);
            if (!"KIT_COMMON_OHOS_EXTEND".equals(str) || lep.a(this.f12352b) || lep.d(this.f12352b)) {
                if (this.f12352b.k == null) {
                    synchronized (HiHealthService.d) {
                        if (this.f12352b.k == null) {
                            try {
                                this.f12352b.k = new HiHealthKitCommonOhosBinder(applicationContext, this.f12352b.h);
                            } catch (lkt e) {
                                ReleaseLogUtil.a("HiH_HiHealthService", "mKitCommonOhosBinder() e = ", e.getMessage());
                            }
                        }
                    }
                }
                lee.a(applicationContext, nameForUid);
                return this.f12352b.k;
            }
            LogUtil.e("HiH_HiHealthService", "Illegal app engine.");
            return null;
        }

        private IBinder c() {
            int callingUid = Binder.getCallingUid();
            Context applicationContext = this.f12352b.getApplicationContext();
            String nameForUid = applicationContext.getPackageManager().getNameForUid(callingUid);
            LogUtil.a("HiH_HiHealthService", "getServiceBinder uid:", Integer.valueOf(callingUid), " packageName:", nameForUid);
            if (nameForUid != null && nameForUid.length() > 5) {
                ReleaseLogUtil.d("HiH_HiHealthService", " packageName:", nameForUid.substring(nameForUid.length() - 5));
            }
            if (!lep.a(this.f12352b) && !lep.d(this.f12352b) && !lep.e(this.f12352b)) {
                ReleaseLogUtil.a("HiH_HiHealthService", "Illegal caller, extendbinder is null");
                return null;
            }
            ReleaseLogUtil.d("HiH_HiHealthService", "verified caller success, return extendbinder");
            lbe.c(this.f12352b, this.f12352b.h);
            if (this.f12352b.m == null) {
                synchronized (HiHealthService.e) {
                    if (this.f12352b.m == null) {
                        try {
                            this.f12352b.m = new HiHealthKitExtendBinder(applicationContext, this.f12352b.h);
                        } catch (lkt e) {
                            ReleaseLogUtil.a("HiH_HiHealthService", "getKitExtendBinder() e = ", e.getMessage());
                        }
                    }
                }
            }
            return this.f12352b.m;
        }

        private IBinder b() {
            int callingUid = Binder.getCallingUid();
            Context applicationContext = this.f12352b.getApplicationContext();
            String nameForUid = applicationContext.getPackageManager().getNameForUid(callingUid);
            LogUtil.a("HiH_HiHealthService", "getServiceBinder uid:", Integer.valueOf(callingUid), " packageName:", nameForUid);
            if (nameForUid != null && nameForUid.length() > 5) {
                ReleaseLogUtil.d("HiH_HiHealthService", " packageName:", nameForUid.substring(nameForUid.length() - 5));
            }
            lev.e(applicationContext).a();
            lbe.c(this.f12352b, this.f12352b.h);
            if (this.f12352b.g == null) {
                synchronized (HiHealthService.f12344a) {
                    if (this.f12352b.g == null) {
                        try {
                            this.f12352b.g = new HiHealthKitBinder(applicationContext, this.f12352b.h);
                        } catch (lkt e) {
                            ReleaseLogUtil.a("HiH_HiHealthService", e.getMessage());
                            return null;
                        }
                    }
                }
            }
            try {
                if (HsfSignValidator.b(nameForUid)) {
                    return this.f12352b.g;
                }
            } catch (Exception e2) {
                ReleaseLogUtil.a("HiH_HiHealthService", "getServiceBinder Exception", LogAnonymous.b(e2));
            }
            return this.f12352b.g;
        }
    }

    static class d extends IWearBinderInterceptor.Stub {
        private HiHealthService d;

        d(HiHealthService hiHealthService) {
            this.d = hiHealthService;
        }

        @Override // com.huawei.wearkit.IWearBinderInterceptor
        public IBinder getServiceBinder(String str) {
            WearKitBinder wearKitBinder;
            synchronized (HiHealthService.f12345c) {
                Context applicationContext = this.d.getApplicationContext();
                if (this.d.p == null) {
                    this.d.p = new WearKitBinder(applicationContext);
                }
                wearKitBinder = this.d.p;
            }
            return wearKitBinder;
        }
    }

    private boolean b(Context context) {
        int iD = HiDateUtil.d(System.currentTimeMillis());
        int i = context != null ? context.getSharedPreferences("demo_hihealth_config", 0).getInt("demo_last_open_time", 20140101) : 20140101;
        try {
            return 1 < HiDateUtil.d(i, iD, "yyyyMMdd") || 1 < HiDateUtil.d(iD, i, "yyyyMMdd");
        } catch (ParseException e2) {
            ReleaseLogUtil.a("HiH_HiHealthService", "needDelDBFile parse date fail, e=", e2.getMessage());
        }
    }

    private void a(Context context) {
        if (context != null) {
            context.getSharedPreferences("demo_hihealth_config", 0).edit().putInt("demo_last_open_time", HiDateUtil.d(System.currentTimeMillis())).apply();
        }
    }

    static class c implements InsertExecutor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile ExecutorService f12353a;

        c() {
        }

        private ExecutorService c() {
            if (this.f12353a == null || this.f12353a.isShutdown()) {
                synchronized (this) {
                    if (this.f12353a == null || this.f12353a.isShutdown()) {
                        this.f12353a = Executors.newSingleThreadExecutor();
                    }
                }
            }
            return this.f12353a;
        }

        @Override // com.huawei.hihealthservice.InsertExecutor, java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (runnable == null) {
                return;
            }
            c().execute(runnable);
        }

        @Override // com.huawei.hihealthservice.InsertExecutor
        public Future<?> submit(Runnable runnable) {
            runnable.getClass();
            FutureTask futureTask = new FutureTask(runnable, null);
            c().execute(futureTask);
            return futureTask;
        }

        void d() {
            if (this.f12353a != null) {
                this.f12353a.shutdown();
            }
        }
    }
}
