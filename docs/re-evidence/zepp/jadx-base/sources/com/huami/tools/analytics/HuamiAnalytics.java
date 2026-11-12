package com.huami.tools.analytics;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.VisibleForTesting;
import com.huami.tools.analytics.Event;
import com.huami.tools.analytics.internal.function.BooleanSupplier;
import com.huami.tools.analytics.internal.function.Consumer;
import com.huami.tools.analytics.internal.helper.GzipRequestInterceptor;
import com.huami.tools.analytics.internal.utils.DeviceConfig;
import io.flutter.plugins.connectivity.ConnectivityBroadcastReceiver;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes15.dex */
public final class HuamiAnalytics {
    private static final String q = "HmStat-HuamiAnalytics";
    private static final HuamiAnalytics r = new HuamiAnalytics();
    private static final long s = 5000;
    private Application b;
    private l c;
    private Handler d;
    private final Tracker g;
    private Tracker h;
    private Tracker i;
    private Tracker j;
    private volatile Executor k;
    private volatile Executor l;
    private volatile OkHttpClient m;

    @VisibleForTesting
    public final Runnable n;

    @VisibleForTesting
    public final c.b o;

    @VisibleForTesting
    public final BroadcastReceiver p;
    private boolean a = false;
    private final Map<String, h> e = new HashMap();
    private final Set<Tracker> f = new HashSet();

    public class a implements c.b {
        public a() {
        }

        @Override // com.huami.tools.analytics.c.b
        public void a() {
            if (HuamiAnalytics.this.isEnabled()) {
                p.b().v(HuamiAnalytics.q, "应用进入了后台，触发上传检查");
                HuamiAnalytics.this.s();
            }
        }

        @Override // com.huami.tools.analytics.c.b
        public void b() {
            if (HuamiAnalytics.this.isEnabled()) {
                p.b().v(HuamiAnalytics.q, String.format(Locale.CHINA, "应用进入了前台，延迟%d毫秒触发上传检查", 5000L));
                HuamiAnalytics.this.g();
            }
        }
    }

    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (ConnectivityBroadcastReceiver.CONNECTIVITY_ACTION.equals(intent.getAction()) && HuamiAnalytics.this.isEnabled() && DeviceConfig.isNetworkConnected(context) && !isInitialStickyBroadcast()) {
                p.b().v(HuamiAnalytics.q, "网络恢复了连接，启动上传任务");
                HuamiAnalytics.this.r();
            }
        }
    }

    @VisibleForTesting
    public HuamiAnalytics() {
        j jVar = new j();
        this.g = jVar;
        this.h = jVar;
        this.i = jVar;
        this.j = jVar;
        this.n = new Runnable() { // from class: cb4
            @Override // java.lang.Runnable
            public final void run() {
                this.a.p();
            }
        };
        this.o = new a();
        this.p = new b();
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public static HuamiAnalytics get() {
        return r;
    }

    public static String getAnonymousId(@NonNull Context context) {
        return DeviceConfig.getInstallationId(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(Event event) {
        if (isEnabled()) {
            synchronized (this.f) {
                Iterator<Tracker> it2 = this.f.iterator();
                while (it2.hasNext()) {
                    it2.next().record(event);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        if (isEnabled()) {
            p.b().v(q, String.format(Locale.CHINA, "app启动%d毫秒后触发了上传检查", 5000L));
            s();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        p.b().v(q, "所有追踪器执行上传检查");
        synchronized (this.e) {
            Iterator<h> it2 = this.e.values().iterator();
            while (it2.hasNext()) {
                it2.next().c();
            }
        }
    }

    public static void setLogger(@Nullable Logger logger) {
        p.d(logger);
    }

    @VisibleForTesting
    public Consumer<Event> d() {
        return new Consumer() { // from class: bb4
            @Override // com.huami.tools.analytics.internal.function.Consumer
            public final void accept(Object obj) {
                this.a.o((Event) obj);
            }
        };
    }

    public void e(h hVar) {
        synchronized (this.f) {
            this.f.add(hVar);
        }
    }

    public void enable(boolean z) {
        this.a = z;
    }

    public void f(@NonNull Context context) {
        this.b = (Application) context.getApplicationContext();
        this.c = new l.b().g(DeviceConfig.getApplicationId(this.b)).i(DeviceConfig.getInstallationId(this.b)).j(DeviceConfig.getAppVersionCode(this.b)).k(DeviceConfig.getAppVersionName(this.b)).f();
        this.b.registerActivityLifecycleCallbacks(new com.huami.tools.analytics.a(d(), new BooleanSupplier() { // from class: ab4
            @Override // com.huami.tools.analytics.internal.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return this.a.isEnabled();
            }
        }));
        this.b.registerReceiver(this.p, new IntentFilter(ConnectivityBroadcastReceiver.CONNECTIVITY_ACTION));
        c.i().m(this.o);
    }

    public void g() {
        if (this.d == null) {
            this.d = new Handler(Looper.getMainLooper());
        }
        this.d.removeCallbacks(this.n);
        this.d.postDelayed(this.n, 5000L);
    }

    @NonNull
    public Tracker getAnonymousTracker() {
        if (this.h == null) {
            this.h = this.g;
        }
        if (this.h instanceof j) {
            p.b().d(q, "尚未初始化匿名追踪器");
        }
        return this.h;
    }

    @NonNull
    public Tracker getIdentifiedTracker() {
        if (this.i == null) {
            this.i = this.g;
        }
        if (this.i instanceof j) {
            p.b().d(q, "尚未初始化实名追踪器");
        }
        return this.i;
    }

    @NonNull
    public Tracker getTimerTracker() {
        if (this.j == null) {
            this.j = this.g;
        }
        return this.j;
    }

    @VisibleForTesting
    public Context h() {
        return this.b;
    }

    @VisibleForTesting
    public l i() {
        return this.c;
    }

    public boolean initializeAnonymousTracker(String str, String str2) {
        h hVarM = m(str, str2, true);
        this.h = hVarM;
        return hVarM != null;
    }

    public boolean initializeIdentifiedTracker(String str, String str2) {
        h hVarM = m(str, str2, false);
        this.i = hVarM;
        return hVarM != null;
    }

    public boolean initializeTimerTracker(String str, String str2) {
        TimerUploadTracker timerUploadTrackerL = l(str, false);
        this.j = timerUploadTrackerL;
        return timerUploadTrackerL != null;
    }

    public boolean isEnabled() {
        return this.a;
    }

    public Executor j() {
        if (this.k == null) {
            synchronized (this) {
                if (this.k == null) {
                    this.k = new i(1, "LocalDispatcher");
                }
            }
        }
        return this.k;
    }

    public OkHttpClient k() {
        if (this.m == null) {
            synchronized (this) {
                if (this.m == null) {
                    OkHttpClient.Builder builder = new OkHttpClient.Builder();
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    this.m = builder.readTimeout(1L, timeUnit).writeTimeout(1L, timeUnit).connectTimeout(1L, timeUnit).addInterceptor(new GzipRequestInterceptor()).build();
                }
            }
        }
        return this.m;
    }

    public TimerUploadTracker l(String str, boolean z) {
        try {
            Config config = Config.INSTANCE.config(false, this.b, str, true, 5000, 30, false, new e(this.b, this.c, z).a());
            config.setAnonymous(z);
            Logger loggerB = p.b();
            Locale locale = Locale.CHINA;
            Object[] objArr = new Object[1];
            objArr[0] = z ? "匿名" : "实名";
            loggerB.d(q, String.format(locale, "创建了实时上传的%s追踪器", objArr));
            return new TimerUploadTracker(config);
        } catch (Exception e) {
            p.b().e(q, e, "init TimerTask error.");
            return null;
        }
    }

    @Nullable
    @VisibleForTesting
    public h m(String str, String str2, boolean z) {
        h hVar;
        synchronized (this.e) {
            String str3 = str + z;
            hVar = this.e.get(str3);
            if (hVar == null && this.c != null) {
                hVar = new h(h(), z, str, this.c.k().h(str2).f());
                hVar.b();
                this.e.put(str3, hVar);
                Logger loggerB = p.b();
                Locale locale = Locale.CHINA;
                Object[] objArr = new Object[1];
                objArr[0] = z ? "匿名" : "实名";
                loggerB.d(q, String.format(locale, "创建了一个新的%s追踪器", objArr));
            }
        }
        return hVar;
    }

    public Executor n() {
        if (this.l == null) {
            synchronized (this) {
                if (this.l == null) {
                    this.l = new i(1, "UploadDispatcher");
                }
            }
        }
        return this.l;
    }

    public void q(h hVar) {
        synchronized (this.f) {
            this.f.remove(hVar);
        }
    }

    public void s() {
        if (DeviceConfig.isNetworkConnected(h())) {
            r();
        } else {
            p.b().v(q, "无网络连接，不上传数据");
        }
    }
}
