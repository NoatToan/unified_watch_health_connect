package zy0;

import android.os.Build;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import gg1.v0;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lzy0/f;", "Lzy0/l;", "Lf12/b;", "gcmUserAccount", "Lqf1/b;", "samdRepository", "Lkg1/a;", "gcmDeveloperPrefs", "<init>", "(Lf12/b;Lqf1/b;Lkg1/a;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f12.b f207446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qf1.b f207447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kg1.a f207448c;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f207449a;

        static {
            int[] iArr = new int[ez0.c.values().length];
            try {
                iArr[ez0.c.APP_REVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ez0.c.COMMUNICATION_SERVICES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ez0.c.ECC_URL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ez0.c.GC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ez0.c.GC_OAUTH_1.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ez0.c.TRAILS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ez0.c.GCS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ez0.c.GCS_API.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ez0.c.GCS_API_DI.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ez0.c.GC_WEB_URL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ez0.c.LTE_SUBSCRIPTIONS_URL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ez0.c.STATIC.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ez0.c.STATIC_ATP_GATEWAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ez0.c.GARMIN_HEALTH_SERVICES.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ez0.c.GARMIN_HEALTH_SERVICES_GC.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ez0.c.SHORT_LINK.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ez0.c.GOLF.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ez0.c.OMT.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[ez0.c.SSO.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[ez0.c.OMT_CMS.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[ez0.c.INREACH.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[ez0.c.GCX.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            f207449a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.network.GCMNetworkModuleAppDelegate$getGHSAccessToken$1", f = "GCMNetworkModuleAppDelegate.kt", l = {114}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<b0, t13.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f207450a;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return f.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super String> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f207450a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            qf1.b bVar = f.this.f207447b;
            this.f207450a = 1;
            Object objC = bVar.c(this);
            return objC == aVar ? aVar : objC;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.network.GCMNetworkModuleAppDelegate$isChinaServerEnvironment$1", f = "GCMNetworkModuleAppDelegate.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<b0, t13.d<? super Boolean>, Object> {
        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return f.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Boolean> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            return Boolean.valueOf(f.this.f207446a.f());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.network.GCMNetworkModuleAppDelegate$isUserSignedIn$1", f = "GCMNetworkModuleAppDelegate.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<b0, t13.d<? super Boolean>, Object> {
        public e(t13.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return f.this.new e(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Boolean> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            return Boolean.valueOf(f.this.f207446a.c());
        }
    }

    static {
        new a(null);
    }

    public f(f12.b bVar, qf1.b bVar2, kg1.a aVar) {
        bVar.getClass();
        bVar2.getClass();
        aVar.getClass();
        this.f207446a = bVar;
        this.f207447b = bVar2;
        this.f207448c = aVar;
    }

    @Override // zy0.l
    public final boolean a() {
        return this.f207448c.o();
    }

    @Override // zy0.l
    public final dd2.b b() {
        return this.f207446a.b();
    }

    @Override // zy0.l
    public final boolean c() {
        return ((Boolean) ge1.b.W(t13.h.f161748a, new e(null))).booleanValue();
    }

    @Override // zy0.l
    public final sc2.j d() {
        return this.f207446a.d();
    }

    @Override // zy0.l
    public final String e() {
        return this.f207446a.e();
    }

    @Override // zy0.l
    public final boolean f() {
        return ((Boolean) ge1.b.W(t13.h.f161748a, new d(null))).booleanValue();
    }

    @Override // zy0.l
    public final String g() {
        return this.f207446a.g();
    }

    @Override // zy0.l
    public final Object h(v13.i iVar) {
        return this.f207446a.j(iVar);
    }

    @Override // zy0.l
    public final boolean i() {
        kg1.a.f104701a.getClass();
        return kg1.a.C2003a.a().m();
    }

    @Override // zy0.l
    public final String j() {
        return (String) ge1.b.W(t13.h.f161748a, new c(null));
    }

    @Override // zy0.l
    public final String k(ez0.c cVar) {
        cVar.getClass();
        v0.T.getClass();
        v0 v0VarB = v0.a.b();
        switch (b.f207449a[cVar.ordinal()]) {
            case 1:
                v0VarB.getClass();
                return fb1.c.n("https://", v0VarB.f77344j);
            case 2:
                v0VarB.getClass();
                return fb1.c.n("https://", v0VarB.f77356x);
            case 3:
                v0VarB.getClass();
                return fb1.c.n("https://", v0VarB.f77355w);
            case 4:
                return v0VarB.a();
            case 5:
                return v0VarB.a();
            case 6:
                v0VarB.getClass();
                return fb1.c.n("https://", v0VarB.f77358z);
            case 7:
                return fb1.c.n("https://", v0VarB.f77336b);
            case 8:
            case 9:
                return fb1.c.n("https://", v0VarB.f77351q);
            case 10:
                return v0VarB.b();
            case 11:
                return fb1.c.n("https://", v0VarB.f77354v);
            case 12:
                v0VarB.getClass();
                return fb1.c.n("https://", v0VarB.f77346l);
            case 13:
                return i62.n.b();
            case 14:
                v0VarB.getClass();
                return fb1.c.n("https://", v0VarB.f77357y);
            case 15:
                v0VarB.getClass();
                return fb1.c.n("https://ghs.", v0VarB.f77349o);
            case 16:
                v0VarB.getClass();
                return fb1.c.n("https://", v0VarB.B);
            case 17:
                return fb1.c.n("https://", v0VarB.f77341g);
            case 18:
                return v0VarB.e();
            case 19:
                v0VarB.getClass();
                return fb1.c.n("https://", v0VarB.f77335a.f204880a);
            case 20:
                v0VarB.getClass();
                return fb1.c.n("https://", v0VarB.D);
            case 21:
                v0VarB.getClass();
                return fb1.c.n("https://", v0VarB.E);
            case 22:
                v0VarB.getClass();
                return fb1.c.n("https://", v0VarB.I);
            default:
                u0.r();
                return null;
        }
    }

    @Override // zy0.l
    public final void l(vc2.b bVar) {
        bVar.getClass();
        if (bVar.equals(vc2.b.e.f177087b) || bVar.equals(vc2.b.c.f177084b) || bVar.equals(vc2.b.a.f177082b)) {
            Bundle bundle = new Bundle();
            String str = Build.BRAND;
            if (str != null) {
                bundle.putString("PhoneBrand", str);
            }
            String str2 = Build.MODEL;
            if (str2 != null) {
                bundle.putString("PhoneModel", str2);
            }
            bundle.putString("Status", bVar.toString());
            ht.a.f85464a.getClass();
            ht.a.a(bundle, "NoInternetBanner");
            return;
        }
        if (bVar instanceof vc2.b.d) {
            Bundle bundle2 = new Bundle();
            String str3 = Build.BRAND;
            if (str3 != null) {
                bundle2.putString("PhoneBrand", str3);
            }
            String str4 = Build.MODEL;
            if (str4 != null) {
                bundle2.putString("PhoneModel", str4);
            }
            bundle2.putString("Status", ((vc2.b.d) bVar).f177085b != null ? "Outage Status" : "Cannot Read Status");
            ht.a.f85464a.getClass();
            ht.a.a(bundle2, "OutageBanner");
            return;
        }
        if (!(bVar instanceof vc2.b.C3312b)) {
            u0.r();
            return;
        }
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "GCMNetworkModuleAppDelegate", "logAnalyticsEvent state: " + bVar);
    }

    @Override // zy0.l
    public final Object m(v13.i iVar) {
        return this.f207446a.s(iVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lzy0/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "STATUS_OUTAGE", "STATUS_CANNOT_READ", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
