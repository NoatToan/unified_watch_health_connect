package fq1;

import android.content.Context;
import android.content.Intent;
import androidx.room.a0;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.auth.PostUserAuthenticationActivity;
import com.garmin.android.apps.connectmobile.c2;
import com.garmin.android.apps.connectmobile.help.HelpDetailsActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.mapbox.maps.plugin.scalebar.LocaleUnitResolver;
import fb1.d0;
import java.net.URL;
import java.util.Set;
import o53.b0;
import o53.c0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.u;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lfq1/n;", "Lfq1/s;", "Landroid/content/Context;", "appContext", "Lpu/a;", "authConfig", "Lf12/b;", "userAccount", "Lvf1/a;", "saMDAppSession", "<init>", "(Landroid/content/Context;Lpu/a;Lf12/b;Lvf1/a;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f73268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pu.a f73269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f12.b f73270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vf1.a f73271d;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"fq1/n$b", "Lre2/b$b;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements re2.b.InterfaceC2863b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f73273b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.startup.init.async.MobileAuthInitializer$execute$2$onUserSignedIn$1", f = "MobileAuthInitializer.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Context f73274a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ re2.b.d f73275b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context, re2.b.d dVar, t13.d<? super a> dVar2) {
                super(2, dVar2);
                this.f73274a = context;
                this.f73275b = dVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f73274a, this.f73275b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                PostUserAuthenticationActivity.f30291i.getClass();
                Context context = this.f73274a;
                context.getClass();
                re2.b.d dVar = this.f73275b;
                dVar.getClass();
                Intent intent = new Intent(context, (Class<?>) PostUserAuthenticationActivity.class);
                intent.setFlags(268468224);
                intent.putExtra("EXTRA_USER_SIGN_IN_TYPE", dVar);
                context.startActivity(intent);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: fq1.n$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.startup.init.async.MobileAuthInitializer$execute$2$onUserSignedIn$2", f = "MobileAuthInitializer.kt", l = {101}, m = "invokeSuspend", v = 2)
        public static final class C1475b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f73276a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f73277b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1475b(n nVar, t13.d<? super C1475b> dVar) {
                super(2, dVar);
                this.f73277b = nVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C1475b(this.f73277b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C1475b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f73276a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    this.f73276a = 1;
                    if (n.c(this.f73277b, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public b(Context context) {
            this.f73273b = context;
        }

        @Override // re2.b.InterfaceC2863b
        public final void a() {
            h.a aVar = h.f73247b;
            n nVar = n.this;
            Context context = nVar.f73268a;
            f12.b bVar = nVar.f73270c;
            aVar.getClass();
            h.a.a(context, bVar);
            k.a aVar2 = k.f73265a;
            Context context2 = nVar.f73268a;
            aVar2.getClass();
            k.a.a(context2);
        }

        @Override // re2.b.InterfaceC2863b
        public final void b(ve2.r rVar) {
            rVar.getClass();
            String strM = am.j.m("onShareLogs: actor ", rVar.name(), ", launching 'HelpDetailsActivity - Product support screen'...");
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "MobileAuthInitializer", strM);
            Context context = this.f73273b;
            Intent intent = new Intent(context, (Class<?>) HelpDetailsActivity.class);
            intent.putExtra("START_DESTINATION", "DIAGNOSTIC_REPORT");
            intent.putExtra("BACK_BUTTON_REQUIRED", false);
            intent.setFlags(268468224);
            context.startActivity(intent);
        }

        @Override // re2.b.InterfaceC2863b
        public final void c(ve2.e eVar) {
            eVar.getClass();
            n nVar = n.this;
            nVar.f73270c.z(eVar);
            if (eVar.name().equals("CHINA")) {
                GCMSettingManager.f41536b.edit().putString(GCMSettingManager.f41535a.getString(R.string.key_country), "CN").apply();
            } else {
                GCMSettingManager.f41536b.edit().putString(GCMSettingManager.f41535a.getString(R.string.key_country), LocaleUnitResolver.ImperialCountryCode.US).apply();
            }
            f60.a.f69195a.getClass();
            FirebaseCrashlytics.getInstance().setCustomKey("serverEnvironment", eVar.name());
            com.garmin.android.apps.connectmobile.l.g().h(eVar);
            az0.b.b(nVar.f73268a);
        }

        @Override // re2.b.InterfaceC2863b
        public final void e(ve2.d dVar, re2.b.d dVar2) {
            dVar.getClass();
            dVar2.getClass();
            String strJ = a0.j("onUserSignedIn: customerName ", dVar.f177692c, ", type ", dVar2.name());
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "MobileAuthInitializer", strJ);
            n nVar = n.this;
            f12.b bVar = nVar.f73270c;
            ve2.e eVar = dVar.f177690a;
            bVar.z(eVar);
            x53.c cVar = s0.f129406a;
            ge1.b.T(c0.a(u53.o.f168762a), null, null, new a(this.f73273b, dVar2, null), 3);
            if (eVar == ve2.e.f177714n) {
                i2.a.b(a2Var, "MobileAuthInitializer", "User signed in to Aqua environment, prefetching OAuth1 token");
                ge1.b.T(c0.a(x53.b.f189152a), null, null, new C1475b(nVar, null), 3);
            }
            l.a aVar2 = l.f73266b;
            f12.b bVar2 = nVar.f73270c;
            kj0.c.a aVar3 = kj0.c.a.ON_USER_SIGN_IN;
            aVar2.getClass();
            l.a.a(bVar2, aVar3);
            i2.a.b(a2.SUBSCRIPTIONS, "MobileAuthInitializer", "User signed in. Calling initSubscriptionProvider()");
            GarminConnectMobileApp.f28685g.getClass();
            GarminConnectMobileApp.a.b().c();
            nVar.f73271d.g();
        }

        @Override // re2.b.InterfaceC2863b
        public final void f() {
            GarminConnectMobileApp.f28685g.getClass();
            ge1.b.T(q2.l("gdi-initialized"), null, null, new c2(GarminConnectMobileApp.a.b(), new d0(25), null), 3);
        }
    }

    static {
        new a(null);
    }

    public n(Context context, pu.a aVar, f12.b bVar, vf1.a aVar2) {
        context.getClass();
        aVar.getClass();
        bVar.getClass();
        aVar2.getClass();
        this.f73268a = context;
        this.f73269b = aVar;
        this.f73270c = bVar;
        this.f73271d = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object c(n nVar, v13.c cVar) {
        o oVar;
        Object bVar;
        nVar.getClass();
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i14 = oVar.f73280c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                oVar.f73280c = i14 - Integer.MIN_VALUE;
            } else {
                oVar = new o(nVar, cVar);
            }
        } else {
            oVar = new o(nVar, cVar);
        }
        Object objN = oVar.f73278a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = oVar.f73280c;
        try {
            if (i15 == 0) {
                o13.r.b(objN);
                int i16 = o13.q.f128596b;
                re2.b bVar2 = re2.b.f152215a;
                oVar.f73280c = 1;
                bVar2.getClass();
                objN = re2.b.n(oVar);
                if (objN == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objN);
            }
            bVar = (sc2.j) objN;
            int i17 = o13.q.f128596b;
        } catch (Throwable th3) {
            int i18 = o13.q.f128596b;
            bVar = new o13.q.b(th3);
        }
        if (bVar instanceof o13.q.b) {
            String strP = am.j.p("OAuth1 Connect credential exchange failed: ", o13.q.b(bVar));
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "MobileAuthInitializer", strP);
        } else {
            i2.a aVar3 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar3.getClass();
            i2.a.b(a2Var2, "MobileAuthInitializer", "OAuth1 Connect credential exchange succeeded");
        }
        return Unit.INSTANCE;
    }

    @Override // fq1.s
    public final Object b(Context context, t13.d<? super Unit> dVar) {
        nc2.c cVar = new nc2.c();
        context.getClass();
        cVar.f125374c = context.getApplicationContext();
        cVar.f125375d = 749008027698L;
        cVar.f125376e = 3;
        cVar.f125377f = 1000L;
        cVar.d();
        we2.g.a aVar = new we2.g.a(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
        Set<? extends ve2.e> setM0 = u.m0(new ve2.e[]{ve2.e.f177707g, ve2.e.f177704d});
        setM0.getClass();
        aVar.f184871a = setM0;
        aVar.f184872b = "GCM_ANDROID_LIGHT";
        aVar.f184873c = "GCM_ANDROID_DARK";
        aVar.f184874d = new we2.f(new URL("https://mobile.integration.garmin.com/gcm/android"), new URL("https://mobile.integration.garmin.com/gcm/android"));
        aVar.f184875e = new we2.f(new URL("https://mobile.integration.garmin.cn/gcm/android"), new URL("https://mobile.integration.garmin.cn/gcm/android"));
        aVar.f184877g = new we2.f(new URL("https://connecttest.garmin.com/modern/"), new URL("https://connecttest.garmin.com/modern/"));
        aVar.f184878h = new we2.f(new URL("https://connecttest.garmin.com/modern/"), new URL("https://connecttest.garmin.com/modern/"));
        aVar.f184879i = new we2.f(new URL("https://connecttest.garmin.com/modern/"), new URL("https://connecttest.garmin.com/modern/"));
        aVar.f184880j = new we2.f(new URL("https://connecttest.garmin.com/modern/"), new URL("https://connecttest.garmin.com/modern/"));
        aVar.f184881k = new we2.f(new URL("https://connecttest.garmin.com/modern/"), new URL("https://connecttest.garmin.com/modern/"));
        aVar.f184882l = new we2.f(new URL("https://connecttest.garmin.com/modern/"), new URL("https://connecttest.garmin.com/modern/"));
        aVar.f184883m = new we2.f(new URL("https://connecttest.garmin.com/modern/"), new URL("https://connecttest.garmin.com/modern/"));
        aVar.f184884n = new we2.f(new URL("https://connecttest.garmin.com/modern/"), new URL("https://connecttest.garmin.com/modern/"));
        we2.f fVar = new we2.f(new URL("https://connecttest.garmin.com/modern/"), new URL("https://connecttest.garmin.com/modern/"));
        aVar.f184885o = fVar;
        we2.g gVar = new we2.g(aVar.f184871a, aVar.f184872b, aVar.f184873c, aVar.f184874d, aVar.f184875e, aVar.f184876f, aVar.f184877g, aVar.f184878h, aVar.f184879i, aVar.f184880j, aVar.f184881k, aVar.f184882l, aVar.f184883m, aVar.f184884n, fVar);
        re2.b bVar = re2.b.f152215a;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        pu.a aVar2 = this.f73269b;
        ve2.q qVar = new ve2.q(aVar2.b(), aVar2.a(), aVar2.c());
        ev.a.f66134a.getClass();
        re2.b.s(bVar, applicationContext, qVar, new b(context), (ev.a) ev.a.f66135b.getValue(), gVar, cVar, 32);
        fm0.a.f72093a.getClass();
        fm0.a.f72095c = null;
        fm0.a.f72096d = null;
        i2.a aVar3 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar3.getClass();
        i2.a.b(a2Var, "MobileAuthInitializer", "Mobile Auth core library initialized");
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lfq1/n$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "SSO_PORTAL_CLIENT_ID_LIGHT", "SSO_PORTAL_CLIENT_ID_DARK", "SSO_PORTAL_MFA_SERVICE_URL_LIGHT_PROD", "SSO_PORTAL_MFA_SERVICE_URL_DARK_PROD", "SSO_PORTAL_MFA_SERVICE_URL_LIGHT_CHINA", "SSO_PORTAL_MFA_SERVICE_URL_DARK_CHINA", "SSO_PORTAL_MFA_SERVICE_URL_LIGHT_TEST", "SSO_PORTAL_MFA_SERVICE_URL_DARK_TEST", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
