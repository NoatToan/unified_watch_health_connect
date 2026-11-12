package com.garmin.subscriptions.ui;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.subscriptions.ui.InAppPurchaseTwaActivity;
import com.google.androidbrowserhelper.trusted.FocusActivity;
import cy2.i;
import cy2.j;
import d53.u;
import e23.p;
import o13.o;
import o13.r;
import o53.b0;
import o53.f0;
import o53.m0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p3.m;
import p3.n;
import p3.x1;
import r.f;
import r.g;
import v.e0;
import vb.h;
import ve2.e;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/subscriptions/ui/InAppPurchaseTwaActivity;", "Li/c;", "<init>", "()V", "a", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InAppPurchaseTwaActivity extends i.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f52748r = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f52749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f52750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f52751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i f52752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f52753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public cy2.c f52754f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public cy2.e f52755g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public cy2.b f52756h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public androidx.appcompat.app.e f52757i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ComposeView f52758j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public androidx.browser.trusted.i f52759k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f52760l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f52761m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f52762n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f52763o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f52764p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f52765q;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/subscriptions/ui/InAppPurchaseTwaActivity$b", "Lr/f;", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends f {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
        @v13.e(c = "com.garmin.subscriptions.ui.InAppPurchaseTwaActivity$customTabsServiceConnection$1$onCustomTabsServiceConnected$1$1", f = "InAppPurchaseTwaActivity.kt", l = {196}, m = "invokeSuspend")
        public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f52767a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InAppPurchaseTwaActivity f52768b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ g f52769c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InAppPurchaseTwaActivity inAppPurchaseTwaActivity, g gVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f52768b = inAppPurchaseTwaActivity;
                this.f52769c = gVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f52768b, this.f52769c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f52767a;
                if (i14 == 0) {
                    r.b(obj);
                    e53.c.a aVar2 = e53.c.f63094b;
                    long jF = e53.e.f(300L, e53.f.MILLISECONDS);
                    this.f52767a = 1;
                    if (m0.c(jF, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                InAppPurchaseTwaActivity inAppPurchaseTwaActivity = this.f52768b;
                if (!inAppPurchaseTwaActivity.isFinishing() && !inAppPurchaseTwaActivity.isDestroyed()) {
                    androidx.browser.trusted.i iVar = inAppPurchaseTwaActivity.f52759k;
                    if (iVar == null) {
                        s.m("builder");
                        throw null;
                    }
                    inAppPurchaseTwaActivity.P9(iVar.a(this.f52769c));
                    inAppPurchaseTwaActivity.f52763o = true;
                }
                return Unit.INSTANCE;
            }
        }

        public b() {
        }

        @Override // r.f
        public final void onCustomTabsServiceConnected(ComponentName componentName, r.d dVar) {
            componentName.getClass();
            dVar.getClass();
            InAppPurchaseTwaActivity inAppPurchaseTwaActivity = InAppPurchaseTwaActivity.this;
            boolean zIsFinishing = inAppPurchaseTwaActivity.isFinishing();
            Logger logger = inAppPurchaseTwaActivity.f52749a;
            if (zIsFinishing || inAppPurchaseTwaActivity.isDestroyed()) {
                return;
            }
            logger.info("CustomTabsServiceConnection::onCustomTabsServiceConnected: customTabs service connected for " + componentName.getPackageName() + ":" + componentName.getClassName());
            try {
                dVar.f148674a.warmup(0L);
            } catch (RemoteException unused) {
            }
            g gVarB = dVar.b(null, PendingIntent.getActivity(dVar.f148676c, 36, new Intent(), 67108864));
            inAppPurchaseTwaActivity.f52750b = gVarB;
            if (gVarB == null) {
                logger.error("onCustomTabsServiceConnected: Couldn't get session from provider.");
                inAppPurchaseTwaActivity.O9();
                Unit unit = Unit.INSTANCE;
                return;
            }
            androidx.browser.trusted.i iVar = inAppPurchaseTwaActivity.f52759k;
            if (iVar == null) {
                s.m("builder");
                throw null;
            }
            try {
                gVarB.f148685a.mayLaunchUrl(gVarB.f148686b, iVar.f5326a, gVarB.a(), null);
            } catch (RemoteException unused2) {
            }
            androidx.browser.trusted.i iVar2 = inAppPurchaseTwaActivity.f52759k;
            if (iVar2 == null) {
                s.m("builder");
                throw null;
            }
            String scheme = iVar2.f5326a.getScheme();
            androidx.browser.trusted.i iVar3 = inAppPurchaseTwaActivity.f52759k;
            if (iVar3 == null) {
                s.m("builder");
                throw null;
            }
            String host = iVar3.f5326a.getHost();
            androidx.browser.trusted.i iVar4 = inAppPurchaseTwaActivity.f52759k;
            if (iVar4 == null) {
                s.m("builder");
                throw null;
            }
            logger.debug(e0.g("CustomTabsServiceConnection::onCustomTabsServiceConnected: launching TWA with ", scheme, "://", host, iVar4.f5326a.getPath()));
            ge1.b.T(f0.w(inAppPurchaseTwaActivity), null, null, new a(inAppPurchaseTwaActivity, gVarB, null), 3);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            InAppPurchaseTwaActivity inAppPurchaseTwaActivity = InAppPurchaseTwaActivity.this;
            inAppPurchaseTwaActivity.f52749a.info("CustomTabsServiceConnection::onServiceDisconnected");
            inAppPurchaseTwaActivity.f52750b = null;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c implements p<m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ cy2.e f52770a;

        public c(cy2.e eVar) {
            this.f52770a = eVar;
        }

        @Override // e23.p
        public final Unit invoke(m mVar, Integer num) {
            m mVar2 = mVar;
            if ((num.intValue() & 3) == 2 && mVar2.b()) {
                mVar2.e();
            } else {
                x1 x1Var = n.f135158a;
                this.f52770a.U0(h4.r.S, mVar2, 6);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.subscriptions.ui.InAppPurchaseTwaActivity$onCreate$4", f = "InAppPurchaseTwaActivity.kt", l = {296}, m = "invokeSuspend")
    public static final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f52771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f52772b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f52773c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InAppPurchaseTwaActivity f52774d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, InAppPurchaseTwaActivity inAppPurchaseTwaActivity, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f52772b = str;
            this.f52773c = str2;
            this.f52774d = inAppPurchaseTwaActivity;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f52772b, this.f52773c, this.f52774d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f52771a;
            InAppPurchaseTwaActivity inAppPurchaseTwaActivity = this.f52774d;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    ey2.c cVar = ey2.c.f67454a;
                    String str = this.f52772b;
                    String str2 = this.f52773c;
                    e eVar = inAppPurchaseTwaActivity.f52751c;
                    if (eVar == null) {
                        s.m("environment");
                        throw null;
                    }
                    i iVar = inAppPurchaseTwaActivity.f52752d;
                    if (iVar == null) {
                        s.m("purchaseDelegate");
                        throw null;
                    }
                    j jVar = inAppPurchaseTwaActivity.f52753e;
                    if (jVar == null) {
                        s.m("activationFlow");
                        throw null;
                    }
                    cy2.c cVar2 = inAppPurchaseTwaActivity.f52754f;
                    this.f52771a = 1;
                    cVar.getClass();
                    obj = ey2.c.a(str, str2, eVar, iVar, jVar, cVar2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                Uri uri = (Uri) obj;
                r.a.C2800a c2800a = new r.a.C2800a();
                c2800a.f148636a = Integer.valueOf(inAppPurchaseTwaActivity.f52762n | (-16777216));
                Integer numValueOf = Integer.valueOf(inAppPurchaseTwaActivity.f52762n | (-16777216));
                c2800a.f148637b = numValueOf;
                r.a aVar2 = new r.a(c2800a.f148636a, null, numValueOf, c2800a.f148638c);
                androidx.browser.trusted.i iVar2 = new androidx.browser.trusted.i(uri);
                r.e.d dVar = iVar2.f5327b;
                dVar.getClass();
                dVar.f148683e = aVar2.b();
                inAppPurchaseTwaActivity.f52759k = iVar2;
                String strA = r.d.a(inAppPurchaseTwaActivity, j0.f134944a);
                if (strA != null) {
                    b bVar = inAppPurchaseTwaActivity.f52765q;
                    bVar.setApplicationContext(inAppPurchaseTwaActivity.getApplicationContext());
                    Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                    if (!TextUtils.isEmpty(strA)) {
                        intent.setPackage(strA);
                    }
                    inAppPurchaseTwaActivity.bindService(intent, bVar, 33);
                    inAppPurchaseTwaActivity.f52761m = true;
                } else {
                    inAppPurchaseTwaActivity.f52749a.error("onCreate: Custom tabs aren't supported, should not have launched this activity.");
                    inAppPurchaseTwaActivity.finish();
                }
                return Unit.INSTANCE;
            } catch (o e4) {
                inAppPurchaseTwaActivity.f52749a.error("Failed to generate purchase URL", (Throwable) e4);
                inAppPurchaseTwaActivity.finish();
                return Unit.INSTANCE;
            }
        }
    }

    public InAppPurchaseTwaActivity() {
        Logger logger = LoggerFactory.getLogger("SUB#InAppPurchaseTwaActivity");
        logger.getClass();
        this.f52749a = logger;
        this.f52765q = new b();
    }

    public final void O9() {
        Q9();
        setResult(0);
        finish();
    }

    public final void P9(androidx.browser.trusted.h hVar) {
        Intent intent = hVar.f5324a;
        ComposeView composeView = this.f52758j;
        if (composeView != null) {
            composeView.setVisibility(8);
        }
        intent.putExtra("android.intent.extra.REFERRER", Uri.parse("android-app://" + getPackageName()));
        FocusActivity.addToIntent(intent, this);
        hVar.a(this);
    }

    public final void Q9() {
        this.f52750b = null;
        this.f52763o = false;
        this.f52764p = false;
        xx2.d.f192590a.getClass();
        xx2.d.f192592c.set(false);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00e8 A[PHI: r2
      0x00e8: PHI (r2v10 java.lang.String) = (r2v7 java.lang.String), (r2v11 java.lang.String) binds: [B:62:0x011c, B:51:0x00e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ea  */
    @Override // androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z14;
        String string;
        ResolveInfo resolveInfoResolveActivity;
        ActivityInfo activityInfo;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        boolean z15 = true;
        Logger logger = this.f52749a;
        if (extras != null) {
            e eVar = (e) h7.b.b(extras, e.class, "GARMIN_ENVIRONMENT");
            if (eVar != null) {
                this.f52751c = eVar;
                z14 = false;
            } else {
                logger.error("Garmin environment was null");
                z14 = true;
            }
            i iVar = (i) h7.b.a(extras, i.class, "PURCHASE_DELEGATE");
            if (iVar != null) {
                this.f52752d = iVar;
            } else {
                logger.error("Purchase delegate was null");
                z14 = true;
            }
            j jVar = (j) h7.b.a(extras, j.class, "ACTIVATION_FLOW");
            if (jVar != null) {
                this.f52753e = jVar;
            } else {
                logger.error("Activation flow was null");
                z14 = true;
            }
            cy2.c cVar = (cy2.c) h7.b.a(extras, cy2.c.class, "GARMIN_STORE_CONFIG");
            if (cVar != null) {
                this.f52754f = cVar;
            }
            this.f52762n = extras.getInt("BACKGROUND_COLOR");
            cy2.e eVar2 = (cy2.e) h7.b.a(extras, cy2.e.class, "ANIMATION_PROVIDER");
            if (eVar2 != null) {
                this.f52755g = eVar2;
            }
            cy2.b bVar = (cy2.b) h7.b.a(extras, cy2.b.class, "EXIT_ALERT_CONFIG");
            if (bVar != null) {
                this.f52756h = bVar;
            }
        } else {
            logger.error("onCreate: missing intent extras.");
            z14 = true;
        }
        String str = null;
        if (!z14) {
            xx2.d.f192590a.getClass();
            xx2.d.f192594e.set(true);
            cy2.e eVar3 = this.f52755g;
            if (eVar3 != null) {
                setContentView(R.layout.activity_twa);
                findViewById(R.id.root_twa).setBackgroundColor(this.f52762n);
                ComposeView composeView = (ComposeView) findViewById(R.id.loading_compose_view);
                composeView.setContent(new z3.e(1630450932, true, new c(eVar3)));
                this.f52758j = composeView;
                composeView.setVisibility(0);
            }
            xx2.b.f192586a.getClass();
            by2.d dVar = xx2.b.f192587b;
            if (dVar == null) {
                logger.error("SubscriptionManager instance was null");
                finish();
                return;
            }
            String str2 = dVar.f22257d;
            str2.getClass();
            String str3 = dVar.f22258e;
            String str4 = "https";
            try {
                ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? getPackageManager().getApplicationInfo(getPackageName(), PackageManager.ApplicationInfoFlags.of(128L)) : getPackageManager().getApplicationInfo(getPackageName(), 128);
                applicationInfo.getClass();
                Bundle bundle2 = applicationInfo.metaData;
                if (bundle2 != null && (string = bundle2.getString("com.garmin.subscriptions.TWA_HOST_SCHEME")) != null) {
                    str4 = string;
                }
            } catch (PackageManager.NameNotFoundException e4) {
                logger.error("getTwaHostScheme: Failed to get application info for package " + getPackageName(), (Throwable) e4);
            }
            this.f52760l = str4;
            ge1.b.T(f0.w(this), null, null, new d(str2, str3, this, null), 3);
            return;
        }
        Uri data = getIntent().getData();
        if (!u.q(data != null ? data.getHost() : null, zi2.a.PROD.f204880a, true)) {
            if (!u.q(data != null ? data.getHost() : null, zi2.a.TEST.f204880a, true)) {
                z15 = false;
            }
        }
        if (z15) {
            logger.info("onCreate: received Garmin SSO URL without purchase extras; launching externally.");
            Uri data2 = getIntent().getData();
            if (data2 != null) {
                String strA = r.d.a(this, j0.f134944a);
                if (strA == null) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.example.com"));
                    intent.addCategory("android.intent.category.BROWSABLE");
                    resolveInfoResolveActivity = getPackageManager().resolveActivity(intent, 65536);
                    if (resolveInfoResolveActivity != null && (activityInfo = resolveInfoResolveActivity.activityInfo) != null && (strA = activityInfo.packageName) != null && !strA.equals(getPackageName()) && !strA.equals("android")) {
                        str = strA;
                    }
                } else {
                    if (strA.equals(getPackageName())) {
                        strA = null;
                    }
                    if (strA != null) {
                        str = strA;
                    } else {
                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.example.com"));
                        intent2.addCategory("android.intent.category.BROWSABLE");
                        resolveInfoResolveActivity = getPackageManager().resolveActivity(intent2, 65536);
                        if (resolveInfoResolveActivity != null) {
                            str = strA;
                        }
                    }
                }
                if (str == null) {
                    logger.error(e0.g("launchExternalBrowser: No external browser package found for ", data2.getScheme(), "://", data2.getHost(), data2.getPath()));
                } else {
                    Intent intent3 = new Intent("android.intent.action.VIEW", data2);
                    intent3.addCategory("android.intent.category.BROWSABLE");
                    intent3.setPackage(str);
                    try {
                        startActivity(intent3);
                    } catch (ActivityNotFoundException e14) {
                        StringBuilder sbI = p6.b.i("launchExternalBrowser: Failed to launch ", data2.getScheme(), "://", data2.getHost(), data2.getPath());
                        sbI.append(" externally");
                        logger.error(sbI.toString(), (Throwable) e14);
                    }
                }
            }
        }
        finish();
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        if (this.f52761m) {
            unbindService(this.f52765q);
            this.f52761m = false;
        }
        xx2.d.f192590a.getClass();
        xx2.d.f192594e.set(false);
        xx2.d.f192592c.set(false);
        androidx.appcompat.app.e eVar = this.f52757i;
        if (eVar != null) {
            eVar.dismiss();
        }
        this.f52757i = null;
        super.onDestroy();
    }

    @Override // b.g, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        setIntent(intent);
        this.f52764p = true;
        ComposeView composeView = this.f52758j;
        if (composeView != null) {
            composeView.setVisibility(0);
        }
        Uri data = intent.getData();
        String scheme = data != null ? data.getScheme() : null;
        Uri data2 = intent.getData();
        String host = data2 != null ? data2.getHost() : null;
        Uri data3 = intent.getData();
        String strG = e0.g("onNewIntent: received intent with ", scheme, "://", host, data3 != null ? data3.getPath() : null);
        Logger logger = this.f52749a;
        logger.debug(strG);
        Uri data4 = intent.getData();
        if (data4 != null) {
            if (s.g(data4.getScheme(), "mpf")) {
                logger.trace(e0.g("handleReturnUri: received mpf response ", data4.getScheme(), "://", data4.getHost(), data4.getPath()));
                String string = data4.toString();
                xx2.d.f192590a.getClass();
                if (s.g(string, (String) xx2.d.f192597h.getValue())) {
                    O9();
                    return;
                }
                if (s.g(string, (String) xx2.d.f192596g.getValue())) {
                    Q9();
                    setResult(9);
                    finish();
                    return;
                } else if (!s.g(string, (String) xx2.d.f192595f.getValue())) {
                    logger.error(e0.g("onNewIntent: Invalid URL response: ", data4.getScheme(), "://", data4.getHost(), data4.getPath()));
                    O9();
                    return;
                } else {
                    Q9();
                    setResult(-1);
                    finish();
                    return;
                }
            }
            String scheme2 = data4.getScheme();
            String str = this.f52760l;
            if (str == null) {
                s.m("twaHostSchemeVal");
                throw null;
            }
            if (!s.g(scheme2, str)) {
                g gVar = this.f52750b;
                if (gVar != null) {
                    P9(new androidx.browser.trusted.i(data4).a(gVar));
                    this.f52763o = true;
                    return;
                } else {
                    logger.error(e0.g("handleReturnUri: Session is null, cannot load URI in TWA: ", data4.getScheme(), "://", data4.getHost(), data4.getPath()));
                    O9();
                    return;
                }
            }
            String str2 = this.f52760l;
            if (str2 == null) {
                s.m("twaHostSchemeVal");
                throw null;
            }
            String scheme3 = data4.getScheme();
            String host2 = data4.getHost();
            String path = data4.getPath();
            StringBuilder sbI = p6.b.i("handleReturnUri: received ", str2, " URI: ", scheme3, "://");
            sbI.append(host2);
            sbI.append(path);
            logger.debug(sbI.toString());
            ge1.b.T(f0.w(this), null, null, new ey2.b(this, data4, null), 3);
        }
    }

    @Override // androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!this.f52763o || this.f52764p) {
            return;
        }
        this.f52749a.info("onResume: TWA dismissed without a response intent; prompting exit confirmation.");
        cy2.b bVar = this.f52756h;
        if (bVar == null) {
            O9();
            return;
        }
        androidx.appcompat.app.e eVar = this.f52757i;
        if (eVar == null || !eVar.isShowing()) {
            ey2.c cVar = ey2.c.f67454a;
            final int i14 = 0;
            e23.a aVar = new e23.a(this) { // from class: ey2.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InAppPurchaseTwaActivity f67448b;

                {
                    this.f67448b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    int i15 = i14;
                    InAppPurchaseTwaActivity inAppPurchaseTwaActivity = this.f67448b;
                    switch (i15) {
                        case 0:
                            InAppPurchaseTwaActivity.a aVar2 = InAppPurchaseTwaActivity.f52748r;
                            inAppPurchaseTwaActivity.O9();
                            break;
                        default:
                            Logger logger = inAppPurchaseTwaActivity.f52749a;
                            g gVar = inAppPurchaseTwaActivity.f52750b;
                            if (gVar == null) {
                                logger.warn("relaunchTwa: no active CustomTabs session; cancelling purchase flow.");
                                inAppPurchaseTwaActivity.O9();
                            } else {
                                androidx.browser.trusted.i iVar = inAppPurchaseTwaActivity.f52759k;
                                if (iVar == null) {
                                    logger.warn("relaunchTwa: TWA builder not initialized; cancelling purchase flow.");
                                    inAppPurchaseTwaActivity.O9();
                                } else {
                                    inAppPurchaseTwaActivity.f52764p = false;
                                    Uri uri = iVar.f5326a;
                                    uri.getClass();
                                    logger.debug(e0.g("relaunchTwa: relaunching TWA at ", uri.getScheme(), "://", uri.getHost(), uri.getPath()));
                                    inAppPurchaseTwaActivity.P9(new androidx.browser.trusted.i(uri).a(gVar));
                                    inAppPurchaseTwaActivity.f52763o = true;
                                }
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            final int i15 = 1;
            e23.a aVar2 = new e23.a(this) { // from class: ey2.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InAppPurchaseTwaActivity f67448b;

                {
                    this.f67448b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    int i16 = i15;
                    InAppPurchaseTwaActivity inAppPurchaseTwaActivity = this.f67448b;
                    switch (i16) {
                        case 0:
                            InAppPurchaseTwaActivity.a aVar3 = InAppPurchaseTwaActivity.f52748r;
                            inAppPurchaseTwaActivity.O9();
                            break;
                        default:
                            Logger logger = inAppPurchaseTwaActivity.f52749a;
                            g gVar = inAppPurchaseTwaActivity.f52750b;
                            if (gVar == null) {
                                logger.warn("relaunchTwa: no active CustomTabs session; cancelling purchase flow.");
                                inAppPurchaseTwaActivity.O9();
                            } else {
                                androidx.browser.trusted.i iVar = inAppPurchaseTwaActivity.f52759k;
                                if (iVar == null) {
                                    logger.warn("relaunchTwa: TWA builder not initialized; cancelling purchase flow.");
                                    inAppPurchaseTwaActivity.O9();
                                } else {
                                    inAppPurchaseTwaActivity.f52764p = false;
                                    Uri uri = iVar.f5326a;
                                    uri.getClass();
                                    logger.debug(e0.g("relaunchTwa: relaunching TWA at ", uri.getScheme(), "://", uri.getHost(), uri.getPath()));
                                    inAppPurchaseTwaActivity.P9(new androidx.browser.trusted.i(uri).a(gVar));
                                    inAppPurchaseTwaActivity.f52763o = true;
                                }
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            cVar.getClass();
            this.f52757i = ey2.c.c(this, bVar, aVar, aVar2);
        }
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStart() {
        super.onStart();
        this.f52764p = false;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u0014\u0010\u0012\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/garmin/subscriptions/ui/InAppPurchaseTwaActivity$a;", "", "<init>", "()V", "", "SESSION_ID", "I", "", "DAL_PRE_VERIFICATION_DELAY_MS", "J", "", "GARMIN_ENVIRONMENT", "Ljava/lang/String;", "PURCHASE_DELEGATE", "ACTIVATION_FLOW", "GARMIN_STORE_CONFIG", "EXTERNAL_BROWSER_PROBE_URL", "BACKGROUND_COLOR", "ANIMATION_PROVIDER", "EXIT_ALERT_CONFIG", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Activity activity, e eVar, i iVar, j jVar, cy2.c cVar, Integer num, cy2.e eVar2, cy2.b bVar) {
            activity.getClass();
            Intent intent = new Intent(activity, (Class<?>) InAppPurchaseTwaActivity.class);
            intent.putExtra("GARMIN_ENVIRONMENT", eVar);
            intent.putExtra("PURCHASE_DELEGATE", iVar);
            intent.putExtra("ACTIVATION_FLOW", jVar);
            intent.putExtra("GARMIN_STORE_CONFIG", cVar);
            intent.putExtra("BACKGROUND_COLOR", num);
            intent.putExtra("ANIMATION_PROVIDER", eVar2);
            intent.putExtra("EXIT_ALERT_CONFIG", bVar);
            return intent;
        }

        private a() {
        }
    }
}
