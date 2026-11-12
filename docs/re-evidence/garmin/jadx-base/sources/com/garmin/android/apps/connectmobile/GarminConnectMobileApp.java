package com.garmin.android.apps.connectmobile;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.webkit.CookieSyncManager;
import ca0.d4;
import ch.qos.logback.classic.Level;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.google.android.play.core.splitcompat.SplitCompat;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import java.util.Locale;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/GarminConnectMobileApp;", "Landroid/app/Application;", "Landroidx/work/a$c;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class GarminConnectMobileApp extends Application implements androidx.work.a.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f28685g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f28686h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static GarminConnectMobileApp f28687i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Context f28688j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f28691c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o53.c2 f28694f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f28689a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f28690b = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r53.p2 f28692d = r53.q2.a(Boolean.FALSE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o13.t f28693e = o13.m.b(new d4(22));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.GarminConnectMobileApp$initSubscriptionProvider$1", f = "GarminConnectMobileApp.kt", l = {444, 447, 464, 469}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public zd0.j1 f28695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f28696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f28697c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f28698d;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/GarminConnectMobileApp$b$a", "Lht/t;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a implements ht.t {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f28700a;

            public a(boolean z14) {
                String lowerCase = String.valueOf(z14).toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                this.f28700a = lowerCase;
            }

            @Override // ht.t
            public final String a() {
                return "gcPlusSubscriber";
            }

            @Override // ht.t
            /* JADX INFO: renamed from: getValue, reason: from getter */
            public final String getF36089a() {
                return this.f28700a;
            }
        }

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = GarminConnectMobileApp.this.new b(dVar);
            bVar.f28698d = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0073  */
        /* JADX WARN: Code duplicated, block: B:31:0x0090  */
        /* JADX WARN: Code duplicated, block: B:33:0x009d  */
        /* JADX WARN: Code duplicated, block: B:36:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:38:0x00ae A[PHI: r8
          0x00ae: PHI (r8v3 ??) = (r8v8 ??), (r8v9 ??), (r8v4 ??) binds: [B:30:0x008e, B:32:0x009b, B:37:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:41:0x00fa  */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00fc, code lost:
        
            if (r11 == r1) goto L43;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v3, types: [int] */
        /* JADX WARN: Type inference failed for: r8v4 */
        /* JADX WARN: Type inference failed for: r8v8 */
        /* JADX WARN: Type inference failed for: r8v9 */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            zd0.j1 j1Var;
            c80.s sVar;
            p92.o oVar;
            q92.x xVar;
            int i14;
            ?? r14;
            Object objA;
            o53.b0 b0Var = (o53.b0) this.f28698d;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = this.f28697c;
            boolean z14 = true;
            if (i15 == 0) {
                o13.r.b(obj);
                a2 a2Var = a2.SUBSCRIPTIONS;
                i2.f36769a.getClass();
                i2.a.k(a2Var, "GarminConnectMobileApp", "Set up subscription provider");
                zd0.j1 j1Var2 = (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null);
                this.f28698d = b0Var;
                this.f28695a = j1Var2;
                this.f28697c = 1;
                if (j1Var2.d(this) != aVar) {
                    j1Var = j1Var2;
                }
                r14 = z14;
                return aVar;
            }
            if (i15 == 1) {
                j1Var = this.f28695a;
                o13.r.b(obj);
            } else {
                if (i15 == 2) {
                    j1Var = this.f28695a;
                    o13.r.b(obj);
                    sVar = (c80.s) obj;
                    if (!(sVar instanceof c80.s.a)) {
                        z14 = false;
                        z14 = false;
                        if (!(sVar instanceof c80.s.b) && !(sVar instanceof c80.s.c)) {
                            lc.u0.r();
                            return null;
                        }
                    }
                    ht.s sVar2 = ht.s.f85508a;
                    a aVar2 = new a(z14);
                    sVar2.getClass();
                    ht.s.c(aVar2);
                    r14 = z14;
                    if (j1Var.e()) {
                        oVar = p92.o.f136619a;
                        xVar = q92.x.DI_CONNECT_AI;
                        oVar.getClass();
                        if (p92.o.n(xVar) == null) {
                            this.f28698d = b0Var;
                            this.f28695a = null;
                            this.f28696b = z14 ? 1 : 0;
                            this.f28697c = 3;
                            if (oVar.c(xVar, this) != aVar) {
                                r14 = z14;
                                i14 = z14 ? 1 : 0;
                                r14 = i14;
                                r14 = z14;
                                ie2.n.f93149a.getClass();
                                qw0.i iVar = (qw0.i) ie2.n.a();
                                x53.c cVar = o53.s0.f129406a;
                                ge1.b.T(o53.c0.a(u53.o.f168762a), null, null, new qw0.h(iVar, null), 3);
                                a2 a2Var2 = a2.NUTRITION;
                                i2.f36769a.getClass();
                                i2.a.k(a2Var2, "GarminConnectMobileApp", "Checking if we need to unschedule local nutrition reminders.");
                                GarminConnectMobileApp.f28685g.getClass();
                                Context contextA = a.a();
                                this.f28698d = null;
                                this.f28695a = null;
                                this.f28696b = r14;
                                this.f28697c = 4;
                                GarminConnectMobileApp.this.getClass();
                                objA = ((v01.o1) KoinJavaComponent.get$default(v01.o1.class, null, null, 6, null)).a(contextA, this);
                                if (objA != aVar) {
                                    objA = Unit.INSTANCE;
                                }
                            }
                        } else {
                            r14 = z14;
                            ie2.n.f93149a.getClass();
                            qw0.i iVar2 = (qw0.i) ie2.n.a();
                            x53.c cVar2 = o53.s0.f129406a;
                            ge1.b.T(o53.c0.a(u53.o.f168762a), null, null, new qw0.h(iVar2, null), 3);
                            a2 a2Var3 = a2.NUTRITION;
                            i2.f36769a.getClass();
                            i2.a.k(a2Var3, "GarminConnectMobileApp", "Checking if we need to unschedule local nutrition reminders.");
                            GarminConnectMobileApp.f28685g.getClass();
                            Context contextA2 = a.a();
                            this.f28698d = null;
                            this.f28695a = null;
                            this.f28696b = r14;
                            this.f28697c = 4;
                            GarminConnectMobileApp.this.getClass();
                            objA = ((v01.o1) KoinJavaComponent.get$default(v01.o1.class, null, null, 6, null)).a(contextA2, this);
                            if (objA != aVar) {
                                objA = Unit.INSTANCE;
                            }
                        }
                    } else {
                        r14 = z14;
                        ie2.n.f93149a.getClass();
                        qw0.i iVar3 = (qw0.i) ie2.n.a();
                        x53.c cVar3 = o53.s0.f129406a;
                        ge1.b.T(o53.c0.a(u53.o.f168762a), null, null, new qw0.h(iVar3, null), 3);
                        a2 a2Var4 = a2.NUTRITION;
                        i2.f36769a.getClass();
                        i2.a.k(a2Var4, "GarminConnectMobileApp", "Checking if we need to unschedule local nutrition reminders.");
                        GarminConnectMobileApp.f28685g.getClass();
                        Context contextA3 = a.a();
                        this.f28698d = null;
                        this.f28695a = null;
                        this.f28696b = r14;
                        this.f28697c = 4;
                        GarminConnectMobileApp.this.getClass();
                        objA = ((v01.o1) KoinJavaComponent.get$default(v01.o1.class, null, null, 6, null)).a(contextA3, this);
                        if (objA != aVar) {
                            objA = Unit.INSTANCE;
                        }
                    }
                    r14 = z14;
                    return aVar;
                }
                if (i15 == 3) {
                    i14 = this.f28696b;
                    o13.r.b(obj);
                    r14 = i14;
                    r14 = z14;
                    ie2.n.f93149a.getClass();
                    qw0.i iVar4 = (qw0.i) ie2.n.a();
                    x53.c cVar4 = o53.s0.f129406a;
                    ge1.b.T(o53.c0.a(u53.o.f168762a), null, null, new qw0.h(iVar4, null), 3);
                    a2 a2Var5 = a2.NUTRITION;
                    i2.f36769a.getClass();
                    i2.a.k(a2Var5, "GarminConnectMobileApp", "Checking if we need to unschedule local nutrition reminders.");
                    GarminConnectMobileApp.f28685g.getClass();
                    Context contextA4 = a.a();
                    this.f28698d = null;
                    this.f28695a = null;
                    this.f28696b = r14;
                    this.f28697c = 4;
                    GarminConnectMobileApp.this.getClass();
                    objA = ((v01.o1) KoinJavaComponent.get$default(v01.o1.class, null, null, 6, null)).a(contextA4, this);
                    if (objA != aVar) {
                        objA = Unit.INSTANCE;
                    }
                } else {
                    if (i15 != 4) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
            }
            return Unit.INSTANCE;
            this.f28698d = b0Var;
            this.f28695a = j1Var;
            this.f28697c = 2;
            obj = j1Var.i(this);
            if (obj != aVar) {
                sVar = (c80.s) obj;
                if (!(sVar instanceof c80.s.a)) {
                    z14 = false;
                    z14 = false;
                    if (!(sVar instanceof c80.s.b)) {
                        lc.u0.r();
                        return null;
                    }
                }
                ht.s sVar3 = ht.s.f85508a;
                a aVar3 = new a(z14);
                sVar3.getClass();
                ht.s.c(aVar3);
                r14 = z14;
                if (j1Var.e()) {
                    oVar = p92.o.f136619a;
                    xVar = q92.x.DI_CONNECT_AI;
                    oVar.getClass();
                    if (p92.o.n(xVar) == null) {
                        this.f28698d = b0Var;
                        this.f28695a = null;
                        this.f28696b = z14 ? 1 : 0;
                        this.f28697c = 3;
                        if (oVar.c(xVar, this) != aVar) {
                            r14 = z14;
                            i14 = z14 ? 1 : 0;
                            r14 = i14;
                            r14 = z14;
                            ie2.n.f93149a.getClass();
                            qw0.i iVar5 = (qw0.i) ie2.n.a();
                            x53.c cVar5 = o53.s0.f129406a;
                            ge1.b.T(o53.c0.a(u53.o.f168762a), null, null, new qw0.h(iVar5, null), 3);
                            a2 a2Var6 = a2.NUTRITION;
                            i2.f36769a.getClass();
                            i2.a.k(a2Var6, "GarminConnectMobileApp", "Checking if we need to unschedule local nutrition reminders.");
                            GarminConnectMobileApp.f28685g.getClass();
                            Context contextA5 = a.a();
                            this.f28698d = null;
                            this.f28695a = null;
                            this.f28696b = r14;
                            this.f28697c = 4;
                            GarminConnectMobileApp.this.getClass();
                            objA = ((v01.o1) KoinJavaComponent.get$default(v01.o1.class, null, null, 6, null)).a(contextA5, this);
                            if (objA != aVar) {
                                objA = Unit.INSTANCE;
                            }
                        }
                    } else {
                        r14 = z14;
                        ie2.n.f93149a.getClass();
                        qw0.i iVar6 = (qw0.i) ie2.n.a();
                        x53.c cVar6 = o53.s0.f129406a;
                        ge1.b.T(o53.c0.a(u53.o.f168762a), null, null, new qw0.h(iVar6, null), 3);
                        a2 a2Var7 = a2.NUTRITION;
                        i2.f36769a.getClass();
                        i2.a.k(a2Var7, "GarminConnectMobileApp", "Checking if we need to unschedule local nutrition reminders.");
                        GarminConnectMobileApp.f28685g.getClass();
                        Context contextA6 = a.a();
                        this.f28698d = null;
                        this.f28695a = null;
                        this.f28696b = r14;
                        this.f28697c = 4;
                        GarminConnectMobileApp.this.getClass();
                        objA = ((v01.o1) KoinJavaComponent.get$default(v01.o1.class, null, null, 6, null)).a(contextA6, this);
                        if (objA != aVar) {
                            objA = Unit.INSTANCE;
                        }
                    }
                } else {
                    r14 = z14;
                    ie2.n.f93149a.getClass();
                    qw0.i iVar7 = (qw0.i) ie2.n.a();
                    x53.c cVar7 = o53.s0.f129406a;
                    ge1.b.T(o53.c0.a(u53.o.f168762a), null, null, new qw0.h(iVar7, null), 3);
                    a2 a2Var8 = a2.NUTRITION;
                    i2.f36769a.getClass();
                    i2.a.k(a2Var8, "GarminConnectMobileApp", "Checking if we need to unschedule local nutrition reminders.");
                    GarminConnectMobileApp.f28685g.getClass();
                    Context contextA7 = a.a();
                    this.f28698d = null;
                    this.f28695a = null;
                    this.f28696b = r14;
                    this.f28697c = 4;
                    GarminConnectMobileApp.this.getClass();
                    objA = ((v01.o1) KoinJavaComponent.get$default(v01.o1.class, null, null, 6, null)).a(contextA7, this);
                    if (objA != aVar) {
                        objA = Unit.INSTANCE;
                    }
                }
            }
            r14 = z14;
            return aVar;
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f28686h = gt2.b.f79005a.h("GarminConnectMobileApp");
    }

    public GarminConnectMobileApp() {
        f28685g.getClass();
        f28687i = this;
    }

    @Override // androidx.work.a.c
    public final androidx.work.a a() {
        androidx.work.a.C0163a c0163a = new androidx.work.a.C0163a();
        c0163a.f11456h = 4;
        return new androidx.work.a(c0163a);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        f28686h.debug("attachBaseContext");
        SplitCompat.install(this);
    }

    public final String b() {
        Object systemService = getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager != null) {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            int iMyPid = Process.myPid();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid) {
                        return runningAppProcessInfo.processName;
                    }
                }
            } else {
                f28686h.warn("getCurrentProcessName: runningAppProcesses is null");
            }
        }
        return null;
    }

    public final void c() {
        if (((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).c()) {
            x53.c cVar = o53.s0.f129406a;
            this.f28694f = ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new b(null), 3);
        } else {
            a2 a2Var = a2.SUBSCRIPTIONS;
            i2.f36769a.getClass();
            i2.a.k(a2Var, "GarminConnectMobileApp", "User is not signed in. Skip setup of subscription provider.");
        }
    }

    public final void d() {
        boolean z14 = this.f28689a;
        Logger logger = f28686h;
        if (z14) {
            logger.debug("onUserSignedOut: app is in background, not relaunching app");
            return;
        }
        logger.debug("onUserSignedOut: app is in foreground, relaunching app");
        f28685g.getClass();
        Intent intent = new Intent(a.a(), (Class<?>) GCMActivityStartup.class);
        intent.addFlags(268468224);
        startActivity(intent);
    }

    @Override // android.app.Application
    public final void onCreate() {
        GarminConnectMobileApp garminConnectMobileApp;
        super.onCreate();
        Logger logger = f28686h;
        logger.debug("onCreate");
        boolean zBooleanValue = false;
        if (!d53.u.q(getPackageName(), b(), true)) {
            logger.info("onCreateRemoteProcess: processName = " + b());
            if (tn.k.g(getPackageName(), getString(R.string.baidu_cloud_push_process_name)).equals(b())) {
                gt2.d.f79011k.getClass();
                gt2.d.b bVar = gt2.d.b.LOG_TYPE_LOGCAT_AND_FILE;
                Level level = Level.ALL;
                level.getClass();
                gt2.d dVar = new gt2.d(bVar, level, null, 4, null);
                dVar.f79021j = "[%thread] | %msg";
                gt2.c.c(this, dVar);
                pu.b bVar2 = new pu.b(this, new pu.f(this));
                garminConnectMobileApp = this;
                re2.b.s(re2.b.f152215a, garminConnectMobileApp, new ve2.q(bVar2.b(), bVar2.a(), bVar2.c()), new e2(), null, null, new nc2.f(), 104);
                boolean z14 = getSharedPreferences(getString(R.string.key_shared_preferences_name), 0).getBoolean(lg1.d.BAIDU_CLOUD_PUSH.f112244a, false);
                if (re2.b.f152233s) {
                    zBooleanValue = ((Boolean) ge1.b.W(t13.h.f161748a, new f2(null))).booleanValue();
                }
                if (!zBooleanValue && !z14) {
                    logger.info("Baidu push service started up on non-CHINA environment, stopping service...");
                    int i14 = l00.a.f107830a;
                }
            }
            garminConnectMobileApp.f28692d.k(null, Boolean.TRUE);
        }
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.garmin.android.apps.connectmobile.b2
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th3) {
                GarminConnectMobileApp.a aVar = GarminConnectMobileApp.f28685g;
                try {
                    StringWriter stringWriterAppend = new StringWriter().append((CharSequence) "FATAL EXCEPTION: ").append((CharSequence) Thread.currentThread().getName()).append('\n');
                    th3.printStackTrace(new PrintWriter(stringWriterAppend));
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var = a2.CRASH;
                    String string = stringWriterAppend.toString();
                    aVar2.getClass();
                    i2.a.e(a2Var, string);
                    GCMSettingManager.f41536b.edit().putLong(GCMSettingManager.f41535a.getString(R.string.key_feedback_last_crash_timestamp), System.currentTimeMillis()).apply();
                } catch (Throwable unused) {
                }
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = defaultUncaughtExceptionHandler;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th3);
                }
            }
        });
        k13.a.f102397a = new bd0.e(new ch1.f(8), 16);
        i.e.c cVar = i.e.f86561a;
        int i15 = androidx.appcompat.widget.b1.f5036c;
        c22.m.a(((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).E2());
        kg1.a.f104701a.getClass();
        kg1.a.C2003a.a().getClass();
        f28685g.getClass();
        CookieSyncManager.createInstance(a.a());
        a2 a2Var = a2.SUBSCRIPTIONS;
        i2.f36769a.getClass();
        i2.a.k(a2Var, "GarminConnectMobileApp", "onCreateMainApplication. Calling initSubscriptionProvider.");
        c();
        oi2.a.C2513a c2513a = oi2.a.f132270a;
        jj0.e eVar = new jj0.e();
        c2513a.getClass();
        oi2.a.C2513a.b(eVar);
        oi2.a.C2513a.b(new fc0.a());
        oi2.a.C2513a.b(new jj0.b());
        oi2.a.C2513a.b(new g2(this));
        fq1.i iVar = (fq1.i) this.f28693e.getValue();
        c32.k kVar = new c32.k(this, 19);
        iVar.getClass();
        o53.c2 c2Var = iVar.f73252c;
        if (c2Var != null && c2Var.isActive()) {
            i2.a.b(a2.GENERAL, "GCMStartupAsync", "Async initializers already running, cancelling previous job");
            o53.c2 c2Var2 = iVar.f73252c;
            if (c2Var2 == null) {
                p005kotlin.jvm.internal.s.m("startUpAsyncInitJob");
                throw null;
            }
            c2Var2.c(null);
        }
        i2.a.b(a2.GENERAL, "GCMStartupAsync", "Starting async initializers");
        iVar.f73252c = ge1.b.T((o53.b0) iVar.f73251b.getValue(), null, null, new fq1.j(iVar, kVar, this, null), 3);
        u1.g0.f167497d = false;
        garminConnectMobileApp = this;
        garminConnectMobileApp.f28692d.k(null, Boolean.TRUE);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/GarminConnectMobileApp$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "GLOGGER_PUBLIC_DIR_NAME", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Context a() {
            Context context = GarminConnectMobileApp.f28688j;
            if (context != null) {
                return context;
            }
            p005kotlin.jvm.internal.s.m("appContext");
            throw null;
        }

        public static GarminConnectMobileApp b() {
            GarminConnectMobileApp garminConnectMobileApp = GarminConnectMobileApp.f28687i;
            if (garminConnectMobileApp != null) {
                return garminConnectMobileApp;
            }
            p005kotlin.jvm.internal.s.m("instance");
            throw null;
        }

        private a() {
        }
    }
}
