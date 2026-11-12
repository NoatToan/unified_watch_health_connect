package pu;

import android.content.Context;
import c22.f2;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.PowerCurveAvailabilityService;
import com.garmin.android.apps.connectmobile.graphql.ApolloClearCacheWorker;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.pregnancytracking.PregnancyTrackingWorker;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.apps.connectmobile.userprofile.UserProfileLoginWorker;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.gcsprotos.generated.Auth;
import java.util.concurrent.TimeUnit;
import lc.u0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p005kotlin.Unit;
import ve.t0;
import zd0.p0;
import zd0.q0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lpu/n;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lqo1/c;", "socialProfileRepo", "Ld12/e;", "usageIndicatorsRepository", "Loj1/a;", "settingsRepo", "Lpc0/j;", "devicesRepo", "Lte0/d;", "fetchViewableAccountsUseCase", "Lte0/h;", "getAccountAdministratorUseCase", "Lzd0/q0;", "promosInternalProvider", "Laq1/i;", "startupRepository", "Lo53/z;", "ioDispatcher", "<init>", "(Landroid/content/Context;Lqo1/c;Ld12/e;Loj1/a;Lpc0/j;Lte0/d;Lte0/h;Lzd0/q0;Laq1/i;Lo53/z;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f141134l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f141135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qo1.c f141136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d12.e f141137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final oj1.a f141138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pc0.j f141139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final te0.d f141140f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final te0.h f141141g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q0 f141142h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final aq1.i f141143i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o53.z f141144j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u53.d f141145k;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f141146a;

        static {
            int[] iArr = new int[Auth.MobileAppAuthorizeResponse.Status.values().length];
            try {
                iArr[Auth.MobileAppAuthorizeResponse.Status.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Auth.MobileAppAuthorizeResponse.Status.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Auth.MobileAppAuthorizeResponse.Status.UNSUPPORTED_VERSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Auth.MobileAppAuthorizeResponse.Status.SECURITY_CHECK_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f141146a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.auth.PostUserAuthenticationCaller$startPostAuthWorkers$1", f = "PostUserAuthenticationCaller.kt", l = {236}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f141147a;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return new c(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f141147a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f141147a = 1;
                if (f2.a("PostUserAuthenticationCaller", this) == aVar) {
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

    static {
        new a(null);
    }

    public n(Context context, qo1.c cVar, d12.e eVar, oj1.a aVar, pc0.j jVar, te0.d dVar, te0.h hVar, q0 q0Var, aq1.i iVar, o53.z zVar) {
        context.getClass();
        cVar.getClass();
        eVar.getClass();
        aVar.getClass();
        jVar.getClass();
        dVar.getClass();
        hVar.getClass();
        q0Var.getClass();
        iVar.getClass();
        zVar.getClass();
        this.f141135a = context;
        this.f141136b = cVar;
        this.f141137c = eVar;
        this.f141138d = aVar;
        this.f141139e = jVar;
        this.f141140f = dVar;
        this.f141141g = hVar;
        this.f141142h = q0Var;
        this.f141143i = iVar;
        this.f141144j = zVar;
        this.f141145k = o53.c0.a(zVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(n nVar, v13.c cVar) {
        z zVar;
        nVar.getClass();
        if (cVar instanceof z) {
            zVar = (z) cVar;
            int i14 = zVar.f141178c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                zVar.f141178c = i14 - Integer.MIN_VALUE;
            } else {
                zVar = new z(nVar, cVar);
            }
        } else {
            zVar = new z(nVar, cVar);
        }
        Object obj = zVar.f141176a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = zVar.f141178c;
        if (i15 == 0) {
            o13.r.b(obj);
            a2 a2Var = a2.GENERAL;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "PostUserAuthenticationCaller", "fetchActivityTypes()");
            com.garmin.android.apps.connectmobile.i iVar = com.garmin.android.apps.connectmobile.i.f36758a;
            zVar.f141178c = 1;
            if (iVar.a(zVar) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        com.garmin.android.apps.connectmobile.i.f36758a.getClass();
        com.garmin.android.apps.connectmobile.i.i();
        a2 a2Var2 = a2.GENERAL;
        i2.f36769a.getClass();
        i2.a.b(a2Var2, "PostUserAuthenticationCaller", "fetchActivityTypes() SUCCESS");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        if (r6.i(r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(n nVar, v13.c cVar) {
        c0 c0Var;
        nVar.getClass();
        if (cVar instanceof c0) {
            c0Var = (c0) cVar;
            int i14 = c0Var.f141054c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c0Var.f141054c = i14 - Integer.MIN_VALUE;
            } else {
                c0Var = new c0(nVar, cVar);
            }
        } else {
            c0Var = new c0(nVar, cVar);
        }
        Object obj = c0Var.f141052a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = c0Var.f141054c;
        if (i15 == 0) {
            o13.r.b(obj);
            a2 a2Var = a2.GENERAL;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "PostUserAuthenticationCaller", "fetchPromotions()");
            i2.a.b(a2.PROMOTIONS, "PostUserAuthenticationCaller", "User signed in. Initialize promos module and provider.");
            p0 p0Var = p0.f204108a;
            c0Var.f141054c = 1;
            if (p0Var.a(c0Var) != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            o13.r.b(obj);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        a2 a2Var2 = a2.GENERAL;
        i2.f36769a.getClass();
        i2.a.b(a2Var2, "PostUserAuthenticationCaller", "fetchPromotions() SUCCESS");
        return Unit.INSTANCE;
        q0 q0Var = nVar.f141142h;
        c0Var.f141054c = 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r7 == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(n nVar, v13.c cVar) {
        e0 e0Var;
        nVar.getClass();
        if (cVar instanceof e0) {
            e0Var = (e0) cVar;
            int i14 = e0Var.f141062c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                e0Var.f141062c = i14 - Integer.MIN_VALUE;
            } else {
                e0Var = new e0(nVar, cVar);
            }
        } else {
            e0Var = new e0(nVar, cVar);
        }
        Object objL = e0Var.f141060a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = e0Var.f141062c;
        if (i15 == 0) {
            o13.r.b(objL);
            e0Var.f141062c = 1;
            if (nVar.f(e0Var) != obj) {
            }
            return obj;
        }
        if (i15 == 1) {
            o13.r.b(objL);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objL);
        }
        v2 v2Var = (v2) objL;
        if (v2Var instanceof v2.b) {
            a2 a2Var = a2.GENERAL;
            String strH = androidx.room.a0.h("fetchUserDevices() SUCCESS[", v2Var, "]");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "PostUserAuthenticationCaller", strH);
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            a2 a2Var2 = a2.GENERAL;
            String strH2 = androidx.room.a0.h("fetchUserDevices() ERROR[", v2Var, "]");
            i2.f36769a.getClass();
            i2.a.f(a2Var2, "PostUserAuthenticationCaller", strH2);
        }
        return Unit.INSTANCE;
        a2 a2Var3 = a2.GENERAL;
        i2.f36769a.getClass();
        i2.a.b(a2Var3, "PostUserAuthenticationCaller", "fetchUserDevices()");
        pc0.j jVar = nVar.f141139e;
        e0Var.f141062c = 2;
        objL = jVar.l(e0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object d(n nVar, v13.c cVar) {
        f0 f0Var;
        nVar.getClass();
        if (cVar instanceof f0) {
            f0Var = (f0) cVar;
            int i14 = f0Var.f141068c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                f0Var.f141068c = i14 - Integer.MIN_VALUE;
            } else {
                f0Var = new f0(nVar, cVar);
            }
        } else {
            f0Var = new f0(nVar, cVar);
        }
        Object objA = f0Var.f141066a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = f0Var.f141068c;
        if (i15 == 0) {
            o13.r.b(objA);
            a2 a2Var = a2.GENERAL;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "PostUserAuthenticationCaller", "fetchUserLocation()");
            aq1.i iVar = nVar.f141143i;
            f0Var.f141068c = 1;
            objA = iVar.a(f0Var);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        v2 v2Var = (v2) objA;
        if (v2Var instanceof v2.b) {
            a2 a2Var2 = a2.GENERAL;
            String strH = androidx.room.a0.h("fetchUserLocation() SUCCESS[", v2Var, "]");
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "PostUserAuthenticationCaller", strH);
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            a2 a2Var3 = a2.GENERAL;
            String strH2 = androidx.room.a0.h("fetchUserLocation() ERROR[", v2Var, "]");
            i2.f36769a.getClass();
            i2.a.f(a2Var3, "PostUserAuthenticationCaller", strH2);
        }
        return Unit.INSTANCE;
    }

    public static void j(Context context, boolean z14) {
        x53.c cVar = s0.f129406a;
        ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new c(null), 3);
        a2 a2Var = a2.GENERAL;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "PostUserAuthenticationCaller", "Enqueue UserProfileLoginWorker to update last login date on GC");
        UserProfileLoginWorker.f46522g.getClass();
        UserProfileLoginWorker.a.a();
        if (!z14) {
            i2.a.b(a2.CLOUD_MESSAGING, "PostUserAuthenticationCaller", "Enqueue Cloud Messaging Registration Worker");
            com.garmin.android.apps.connectmobile.cloudmessaging.a.a(context);
        }
        i2.a.b(a2.CLOUD_MESSAGING, "PostUserAuthenticationCaller", "Enqueue PowerCurveAvailabilityService");
        PowerCurveAvailabilityService.f28787h.getClass();
        t0 t0VarO = com.airbnb.lottie.animation.keyframe.a.o(ue.i0.f170088a, context);
        ue.l lVar = ue.l.REPLACE;
        ue.x.a aVar = new ue.x.a((Class<? extends androidx.work.d>) PowerCurveAvailabilityService.class);
        ue.f.a aVar2 = new ue.f.a();
        ue.v vVar = ue.v.CONNECTED;
        aVar2.b(vVar);
        aVar.f170098c.f26950j = aVar2.a();
        t0VarO.a("AvailableMetricsWorker", lVar, aVar.d(ue.a.LINEAR, 1L, TimeUnit.HOURS).a()).a();
        i2.a.b(a2Var, "PostUserAuthenticationCaller", "Enqueue ApolloClearCacheWorker");
        ApolloClearCacheWorker.f36130g.getClass();
        ApolloClearCacheWorker.a.a(context);
        i2.a.b(a2Var, "PostUserAuthenticationCaller", "Enqueue PregnancyTrackingWorker");
        PregnancyTrackingWorker.f40411g.getClass();
        t0 t0VarG = t0.g(context);
        t0VarG.getClass();
        ue.x.a aVar3 = new ue.x.a((Class<? extends androidx.work.d>) PregnancyTrackingWorker.class);
        ue.f.a aVar4 = new ue.f.a();
        aVar4.b(vVar);
        aVar3.f170098c.f26950j = aVar4.a();
        t0VarG.a("PregnancyTrackingWorker", lVar, aVar3.a()).a();
    }

    /* JADX WARN: Code duplicated, block: B:52:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:53:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:56:0x0209  */
    /* JADX WARN: Code duplicated, block: B:57:0x020b  */
    /* JADX WARN: Code duplicated, block: B:60:0x022d  */
    /* JADX WARN: Code duplicated, block: B:61:0x022f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0255  */
    /* JADX WARN: Code duplicated, block: B:65:0x0257  */
    /* JADX WARN: Code duplicated, block: B:68:0x027d  */
    /* JADX WARN: Code duplicated, block: B:69:0x027f  */
    /* JADX WARN: Code duplicated, block: B:72:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:73:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:76:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:77:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code duplicated, block: B:81:0x02e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x037c, code lost:
    
        if (r0 == r8) goto L117;
     */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [o53.d0, t13.d] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(boolean z14, v13.c cVar) {
        o oVar;
        ?? r14;
        boolean z15;
        o53.j0 j0VarJ;
        o53.i0 i0VarJ;
        o53.j0 j0VarJ2;
        o53.i0 i0VarJ2;
        o53.j0 j0VarJ3;
        String str;
        o53.j0 j0VarJ4;
        Object objC;
        boolean z16;
        Object obj;
        o53.i0 i0Var;
        o53.i0 i0Var2;
        o53.i0 i0Var3;
        Auth.MobileAppAuthorizeResponse.Status status;
        Object objAwait;
        o53.i0 i0Var4;
        o53.i0 i0Var5;
        Auth.MobileAppAuthorizeResponse.Status status2;
        Object obj2;
        com.garmin.android.apps.connectmobile.userprofile.model.m mVar;
        Object objAwait2;
        com.garmin.android.apps.connectmobile.userprofile.model.m mVar2;
        Object obj3;
        o53.i0 i0Var6;
        Auth.MobileAppAuthorizeResponse.Status status3;
        o53.i0 i0Var7;
        UserSettingsDTO userSettingsDTO;
        UserSettingsDTO userSettingsDTO2;
        o53.i0 i0Var8;
        o53.i0 i0Var9;
        Auth.MobileAppAuthorizeResponse.Status status4;
        com.garmin.android.apps.connectmobile.userprofile.model.m mVar3;
        o53.i0 i0Var10;
        boolean z17;
        Auth.MobileAppAuthorizeResponse.Status status5;
        com.garmin.android.apps.connectmobile.userprofile.model.m mVar4;
        UserSettingsDTO userSettingsDTO3;
        o53.i0 i0Var11;
        com.garmin.android.apps.connectmobile.userprofile.model.m mVar5;
        Auth.MobileAppAuthorizeResponse.Status status6;
        com.garmin.android.apps.connectmobile.userprofile.model.m mVar6;
        UserSettingsDTO userSettingsDTO4;
        h0 h0Var;
        String str2;
        Throwable th3;
        Object bVar;
        Context context = this.f141135a;
        String str3 = "Error fetching user data socialProfileDTO[";
        String str4 = "Error performing app upgrades: ";
        String str5 = "Error No Display Name socialProfileDTO[";
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i14 = oVar.f141160m;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                oVar.f141160m = i14 - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        Object obj4 = oVar.f141158k;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = oVar.f141160m;
        o53.z zVar = this.f141144j;
        u53.d dVar = this.f141145k;
        try {
            try {
                switch (i15) {
                    case 0:
                        o13.r.b(obj4);
                        a2 a2Var = a2.GENERAL;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var, "PostUserAuthenticationCaller", "Execute Post User Authentication Actions");
                        r14 = 0;
                        ge1.b.T(dVar, null, null, new p(null), 3);
                        q qVar = new q(null);
                        oVar.f141148a = z14;
                        oVar.f141160m = 1;
                        if (ge1.b.e0(zVar, qVar, oVar) != aVar) {
                            z15 = z14;
                            o53.j0 j0VarJ5 = ge1.b.j(dVar, zVar, r14, new s(this, r14), 2);
                            j0VarJ = ge1.b.j(dVar, zVar, r14, new u(this, r14), 2);
                            i0VarJ = ge1.b.j(dVar, zVar, r14, new y(this, r14), 2);
                            j0VarJ2 = ge1.b.j(dVar, zVar, r14, new w(this, r14), 2);
                            i0VarJ2 = ge1.b.j(dVar, zVar, r14, new t(this, r14), 2);
                            j0VarJ3 = ge1.b.j(dVar, zVar, r14, new x(this, r14), 2);
                            str = "PostUserAuthenticationCaller";
                            j0VarJ4 = ge1.b.j(dVar, zVar, r14, new v(r14), 2);
                            try {
                                oVar.f141149b = j0VarJ;
                                oVar.f141150c = i0VarJ;
                                oVar.f141151d = j0VarJ2;
                                oVar.f141152e = i0VarJ2;
                                oVar.f141153f = j0VarJ3;
                                oVar.f141154g = j0VarJ4;
                                oVar.f141148a = z15;
                                oVar.f141160m = 2;
                                objC = j0VarJ5.C(oVar);
                                if (objC == aVar) {
                                    z16 = z15;
                                    obj = objC;
                                    i0Var = j0VarJ4;
                                    i0Var2 = j0VarJ3;
                                    i0Var3 = j0VarJ2;
                                    status = (Auth.MobileAppAuthorizeResponse.Status) obj;
                                    oVar.f141149b = null;
                                    oVar.f141150c = i0VarJ;
                                    oVar.f141151d = i0Var3;
                                    oVar.f141152e = i0VarJ2;
                                    oVar.f141153f = i0Var2;
                                    oVar.f141154g = i0Var;
                                    oVar.f141155h = status;
                                    oVar.f141148a = z16;
                                    oVar.f141160m = 3;
                                    objAwait = j0VarJ.await(oVar);
                                    if (objAwait != aVar) {
                                        i0Var4 = i0Var2;
                                        i0Var5 = i0Var;
                                        status2 = status;
                                        obj2 = objAwait;
                                        mVar = (com.garmin.android.apps.connectmobile.userprofile.model.m) obj2;
                                        oVar.f141149b = null;
                                        oVar.f141150c = null;
                                        oVar.f141151d = i0Var3;
                                        oVar.f141152e = i0VarJ2;
                                        oVar.f141153f = i0Var4;
                                        oVar.f141154g = i0Var5;
                                        oVar.f141155h = status2;
                                        oVar.f141156i = mVar;
                                        oVar.f141148a = z16;
                                        oVar.f141160m = 4;
                                        objAwait2 = i0VarJ.await(oVar);
                                        if (objAwait2 == aVar) {
                                            Auth.MobileAppAuthorizeResponse.Status status7 = status2;
                                            mVar2 = mVar;
                                            obj3 = objAwait2;
                                            i0Var6 = i0Var5;
                                            status3 = status7;
                                            i0Var7 = i0VarJ2;
                                            userSettingsDTO = (UserSettingsDTO) obj3;
                                            oVar.f141149b = null;
                                            oVar.f141150c = null;
                                            oVar.f141151d = null;
                                            oVar.f141152e = i0Var7;
                                            oVar.f141153f = i0Var4;
                                            oVar.f141154g = i0Var6;
                                            oVar.f141155h = status3;
                                            oVar.f141156i = mVar2;
                                            oVar.f141157j = userSettingsDTO;
                                            oVar.f141148a = z16;
                                            oVar.f141160m = 5;
                                            if (i0Var3.await(oVar) != aVar) {
                                                com.garmin.android.apps.connectmobile.userprofile.model.m mVar7 = mVar2;
                                                userSettingsDTO2 = userSettingsDTO;
                                                i0Var8 = i0Var7;
                                                i0Var9 = i0Var4;
                                                status4 = status3;
                                                mVar3 = mVar7;
                                                i0Var10 = i0Var6;
                                                oVar.f141149b = null;
                                                oVar.f141150c = null;
                                                oVar.f141151d = null;
                                                oVar.f141152e = null;
                                                oVar.f141153f = i0Var9;
                                                oVar.f141154g = i0Var10;
                                                oVar.f141155h = status4;
                                                oVar.f141156i = mVar3;
                                                oVar.f141157j = userSettingsDTO2;
                                                oVar.f141148a = z16;
                                                oVar.f141160m = 6;
                                                if (i0Var8.await(oVar) == aVar) {
                                                    UserSettingsDTO userSettingsDTO5 = userSettingsDTO2;
                                                    z17 = z16;
                                                    status5 = status4;
                                                    mVar4 = mVar3;
                                                    userSettingsDTO3 = userSettingsDTO5;
                                                    i0Var11 = i0Var9;
                                                    oVar.f141149b = null;
                                                    oVar.f141150c = null;
                                                    oVar.f141151d = null;
                                                    oVar.f141152e = null;
                                                    oVar.f141153f = null;
                                                    oVar.f141154g = i0Var10;
                                                    oVar.f141155h = status5;
                                                    oVar.f141156i = mVar4;
                                                    oVar.f141157j = userSettingsDTO3;
                                                    oVar.f141148a = z17;
                                                    oVar.f141160m = 7;
                                                    if (i0Var11.await(oVar) != aVar) {
                                                        mVar5 = mVar4;
                                                        status6 = status5;
                                                        oVar.f141149b = null;
                                                        oVar.f141150c = null;
                                                        oVar.f141151d = null;
                                                        oVar.f141152e = null;
                                                        oVar.f141153f = null;
                                                        oVar.f141154g = null;
                                                        oVar.f141155h = status6;
                                                        oVar.f141156i = mVar5;
                                                        oVar.f141157j = userSettingsDTO3;
                                                        oVar.f141148a = z17;
                                                        oVar.f141160m = 8;
                                                        if (i0Var10.await(oVar) == aVar) {
                                                            mVar6 = mVar5;
                                                            userSettingsDTO4 = userSettingsDTO3;
                                                            ge1.b.T(dVar, null, null, new r(this, null), 3);
                                                            Context applicationContext = context.getApplicationContext();
                                                            applicationContext.getClass();
                                                            j(applicationContext, z17);
                                                            if (mVar6 != null || userSettingsDTO4 == null) {
                                                                String str6 = str;
                                                                i2.f36769a.getClass();
                                                                i2.a.f(a2.GENERAL, str6, str3 + mVar6 + "] userSettingsDTO[" + userSettingsDTO4 + "]");
                                                                return new i0.a(h0.NULL_USER_DATA);
                                                            }
                                                            String displayName = mVar6.getDisplayName();
                                                            if (displayName == null || d53.w.J(displayName)) {
                                                                String str7 = str;
                                                                i2.f36769a.getClass();
                                                                i2.a.f(a2.GENERAL, str7, str5 + mVar6 + "]");
                                                                return new i0.a(h0.NO_DISPLAY_MANE);
                                                            }
                                                            int i16 = b.f141146a[status6.ordinal()];
                                                            if (i16 == 1) {
                                                                h0Var = null;
                                                            } else if (i16 != 2) {
                                                                if (i16 != 3 && i16 != 4) {
                                                                    throw new NoWhenBranchMatchedException();
                                                                }
                                                                h0Var = h0.GCS_SECURITY_CHECK_ERROR;
                                                            } else {
                                                                h0Var = h0.GCS_ERROR;
                                                            }
                                                            if (h0Var != null) {
                                                                a2 a2Var2 = a2.GENERAL;
                                                                String str8 = "Error auth with GCS " + h0Var;
                                                                i2.f36769a.getClass();
                                                                i2.a.f(a2Var2, str, str8);
                                                                return new i0.a(h0Var);
                                                            }
                                                            str2 = str;
                                                            try {
                                                                int i17 = o13.q.f128596b;
                                                                com.garmin.android.apps.connectmobile.u.a aVar2 = com.garmin.android.apps.connectmobile.u.f46488a;
                                                                oVar.f141149b = null;
                                                                oVar.f141150c = null;
                                                                oVar.f141151d = null;
                                                                oVar.f141152e = null;
                                                                oVar.f141153f = null;
                                                                oVar.f141154g = null;
                                                                oVar.f141155h = null;
                                                                oVar.f141156i = mVar6;
                                                                oVar.f141157j = userSettingsDTO4;
                                                                oVar.f141148a = z17;
                                                                oVar.f141160m = 9;
                                                                aVar2.getClass();
                                                                x53.c cVar2 = s0.f129406a;
                                                                Object objE0 = ge1.b.e0(x53.b.f189152a, new com.garmin.android.apps.connectmobile.q(context, null), oVar);
                                                                if (objE0 != aVar) {
                                                                    objE0 = Unit.INSTANCE;
                                                                }
                                                            } catch (Throwable th4) {
                                                                th3 = th4;
                                                                int i18 = o13.q.f128596b;
                                                                bVar = new o13.q.b(th3);
                                                            }
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e4) {
                                e = e4;
                                str4 = str;
                                a2 a2Var3 = a2.GENERAL;
                                String strD = com.airbnb.lottie.animation.keyframe.a.d(e, "Error executing Post User Authentication Actions ");
                                i2.f36769a.getClass();
                                i2.a.f(a2Var3, str4, strD);
                                return new i0.a(h0.GENERIC);
                            }
                        }
                        return aVar;
                    case 1:
                        z15 = oVar.f141148a;
                        o13.r.b(obj4);
                        r14 = 0;
                        o53.j0 j0VarJ6 = ge1.b.j(dVar, zVar, r14, new s(this, r14), 2);
                        j0VarJ = ge1.b.j(dVar, zVar, r14, new u(this, r14), 2);
                        i0VarJ = ge1.b.j(dVar, zVar, r14, new y(this, r14), 2);
                        j0VarJ2 = ge1.b.j(dVar, zVar, r14, new w(this, r14), 2);
                        i0VarJ2 = ge1.b.j(dVar, zVar, r14, new t(this, r14), 2);
                        j0VarJ3 = ge1.b.j(dVar, zVar, r14, new x(this, r14), 2);
                        str = "PostUserAuthenticationCaller";
                        j0VarJ4 = ge1.b.j(dVar, zVar, r14, new v(r14), 2);
                        oVar.f141149b = j0VarJ;
                        oVar.f141150c = i0VarJ;
                        oVar.f141151d = j0VarJ2;
                        oVar.f141152e = i0VarJ2;
                        oVar.f141153f = j0VarJ3;
                        oVar.f141154g = j0VarJ4;
                        oVar.f141148a = z15;
                        oVar.f141160m = 2;
                        objC = j0VarJ6.C(oVar);
                        if (objC == aVar) {
                            z16 = z15;
                            obj = objC;
                            i0Var = j0VarJ4;
                            i0Var2 = j0VarJ3;
                            i0Var3 = j0VarJ2;
                            status = (Auth.MobileAppAuthorizeResponse.Status) obj;
                            oVar.f141149b = null;
                            oVar.f141150c = i0VarJ;
                            oVar.f141151d = i0Var3;
                            oVar.f141152e = i0VarJ2;
                            oVar.f141153f = i0Var2;
                            oVar.f141154g = i0Var;
                            oVar.f141155h = status;
                            oVar.f141148a = z16;
                            oVar.f141160m = 3;
                            objAwait = j0VarJ.await(oVar);
                            if (objAwait != aVar) {
                                i0Var4 = i0Var2;
                                i0Var5 = i0Var;
                                status2 = status;
                                obj2 = objAwait;
                                mVar = (com.garmin.android.apps.connectmobile.userprofile.model.m) obj2;
                                oVar.f141149b = null;
                                oVar.f141150c = null;
                                oVar.f141151d = i0Var3;
                                oVar.f141152e = i0VarJ2;
                                oVar.f141153f = i0Var4;
                                oVar.f141154g = i0Var5;
                                oVar.f141155h = status2;
                                oVar.f141156i = mVar;
                                oVar.f141148a = z16;
                                oVar.f141160m = 4;
                                objAwait2 = i0VarJ.await(oVar);
                                if (objAwait2 == aVar) {
                                    Auth.MobileAppAuthorizeResponse.Status status8 = status2;
                                    mVar2 = mVar;
                                    obj3 = objAwait2;
                                    i0Var6 = i0Var5;
                                    status3 = status8;
                                    i0Var7 = i0VarJ2;
                                    userSettingsDTO = (UserSettingsDTO) obj3;
                                    oVar.f141149b = null;
                                    oVar.f141150c = null;
                                    oVar.f141151d = null;
                                    oVar.f141152e = i0Var7;
                                    oVar.f141153f = i0Var4;
                                    oVar.f141154g = i0Var6;
                                    oVar.f141155h = status3;
                                    oVar.f141156i = mVar2;
                                    oVar.f141157j = userSettingsDTO;
                                    oVar.f141148a = z16;
                                    oVar.f141160m = 5;
                                    if (i0Var3.await(oVar) != aVar) {
                                        com.garmin.android.apps.connectmobile.userprofile.model.m mVar8 = mVar2;
                                        userSettingsDTO2 = userSettingsDTO;
                                        i0Var8 = i0Var7;
                                        i0Var9 = i0Var4;
                                        status4 = status3;
                                        mVar3 = mVar8;
                                        i0Var10 = i0Var6;
                                        oVar.f141149b = null;
                                        oVar.f141150c = null;
                                        oVar.f141151d = null;
                                        oVar.f141152e = null;
                                        oVar.f141153f = i0Var9;
                                        oVar.f141154g = i0Var10;
                                        oVar.f141155h = status4;
                                        oVar.f141156i = mVar3;
                                        oVar.f141157j = userSettingsDTO2;
                                        oVar.f141148a = z16;
                                        oVar.f141160m = 6;
                                        if (i0Var8.await(oVar) == aVar) {
                                            UserSettingsDTO userSettingsDTO6 = userSettingsDTO2;
                                            z17 = z16;
                                            status5 = status4;
                                            mVar4 = mVar3;
                                            userSettingsDTO3 = userSettingsDTO6;
                                            i0Var11 = i0Var9;
                                            oVar.f141149b = null;
                                            oVar.f141150c = null;
                                            oVar.f141151d = null;
                                            oVar.f141152e = null;
                                            oVar.f141153f = null;
                                            oVar.f141154g = i0Var10;
                                            oVar.f141155h = status5;
                                            oVar.f141156i = mVar4;
                                            oVar.f141157j = userSettingsDTO3;
                                            oVar.f141148a = z17;
                                            oVar.f141160m = 7;
                                            if (i0Var11.await(oVar) != aVar) {
                                                mVar5 = mVar4;
                                                status6 = status5;
                                                oVar.f141149b = null;
                                                oVar.f141150c = null;
                                                oVar.f141151d = null;
                                                oVar.f141152e = null;
                                                oVar.f141153f = null;
                                                oVar.f141154g = null;
                                                oVar.f141155h = status6;
                                                oVar.f141156i = mVar5;
                                                oVar.f141157j = userSettingsDTO3;
                                                oVar.f141148a = z17;
                                                oVar.f141160m = 8;
                                                if (i0Var10.await(oVar) == aVar) {
                                                    mVar6 = mVar5;
                                                    userSettingsDTO4 = userSettingsDTO3;
                                                    ge1.b.T(dVar, null, null, new r(this, null), 3);
                                                    Context applicationContext2 = context.getApplicationContext();
                                                    applicationContext2.getClass();
                                                    j(applicationContext2, z17);
                                                    if (mVar6 != null) {
                                                    }
                                                    String str9 = str;
                                                    i2.f36769a.getClass();
                                                    i2.a.f(a2.GENERAL, str9, str3 + mVar6 + "] userSettingsDTO[" + userSettingsDTO4 + "]");
                                                    return new i0.a(h0.NULL_USER_DATA);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return aVar;
                    case 2:
                        boolean z18 = oVar.f141148a;
                        i0Var = oVar.f141154g;
                        i0Var2 = oVar.f141153f;
                        o53.i0 i0Var12 = oVar.f141152e;
                        i0Var3 = oVar.f141151d;
                        o53.i0 i0Var13 = oVar.f141150c;
                        o53.j0 j0Var = oVar.f141149b;
                        o13.r.b(obj4);
                        j0VarJ = j0Var;
                        obj = obj4;
                        i0VarJ = i0Var13;
                        i0VarJ2 = i0Var12;
                        str = "PostUserAuthenticationCaller";
                        z16 = z18;
                        status = (Auth.MobileAppAuthorizeResponse.Status) obj;
                        oVar.f141149b = null;
                        oVar.f141150c = i0VarJ;
                        oVar.f141151d = i0Var3;
                        oVar.f141152e = i0VarJ2;
                        oVar.f141153f = i0Var2;
                        oVar.f141154g = i0Var;
                        oVar.f141155h = status;
                        oVar.f141148a = z16;
                        oVar.f141160m = 3;
                        objAwait = j0VarJ.await(oVar);
                        if (objAwait != aVar) {
                            i0Var4 = i0Var2;
                            i0Var5 = i0Var;
                            status2 = status;
                            obj2 = objAwait;
                            mVar = (com.garmin.android.apps.connectmobile.userprofile.model.m) obj2;
                            oVar.f141149b = null;
                            oVar.f141150c = null;
                            oVar.f141151d = i0Var3;
                            oVar.f141152e = i0VarJ2;
                            oVar.f141153f = i0Var4;
                            oVar.f141154g = i0Var5;
                            oVar.f141155h = status2;
                            oVar.f141156i = mVar;
                            oVar.f141148a = z16;
                            oVar.f141160m = 4;
                            objAwait2 = i0VarJ.await(oVar);
                            if (objAwait2 == aVar) {
                                Auth.MobileAppAuthorizeResponse.Status status9 = status2;
                                mVar2 = mVar;
                                obj3 = objAwait2;
                                i0Var6 = i0Var5;
                                status3 = status9;
                                i0Var7 = i0VarJ2;
                                userSettingsDTO = (UserSettingsDTO) obj3;
                                oVar.f141149b = null;
                                oVar.f141150c = null;
                                oVar.f141151d = null;
                                oVar.f141152e = i0Var7;
                                oVar.f141153f = i0Var4;
                                oVar.f141154g = i0Var6;
                                oVar.f141155h = status3;
                                oVar.f141156i = mVar2;
                                oVar.f141157j = userSettingsDTO;
                                oVar.f141148a = z16;
                                oVar.f141160m = 5;
                                if (i0Var3.await(oVar) != aVar) {
                                    com.garmin.android.apps.connectmobile.userprofile.model.m mVar9 = mVar2;
                                    userSettingsDTO2 = userSettingsDTO;
                                    i0Var8 = i0Var7;
                                    i0Var9 = i0Var4;
                                    status4 = status3;
                                    mVar3 = mVar9;
                                    i0Var10 = i0Var6;
                                    oVar.f141149b = null;
                                    oVar.f141150c = null;
                                    oVar.f141151d = null;
                                    oVar.f141152e = null;
                                    oVar.f141153f = i0Var9;
                                    oVar.f141154g = i0Var10;
                                    oVar.f141155h = status4;
                                    oVar.f141156i = mVar3;
                                    oVar.f141157j = userSettingsDTO2;
                                    oVar.f141148a = z16;
                                    oVar.f141160m = 6;
                                    if (i0Var8.await(oVar) == aVar) {
                                        UserSettingsDTO userSettingsDTO7 = userSettingsDTO2;
                                        z17 = z16;
                                        status5 = status4;
                                        mVar4 = mVar3;
                                        userSettingsDTO3 = userSettingsDTO7;
                                        i0Var11 = i0Var9;
                                        oVar.f141149b = null;
                                        oVar.f141150c = null;
                                        oVar.f141151d = null;
                                        oVar.f141152e = null;
                                        oVar.f141153f = null;
                                        oVar.f141154g = i0Var10;
                                        oVar.f141155h = status5;
                                        oVar.f141156i = mVar4;
                                        oVar.f141157j = userSettingsDTO3;
                                        oVar.f141148a = z17;
                                        oVar.f141160m = 7;
                                        if (i0Var11.await(oVar) != aVar) {
                                            mVar5 = mVar4;
                                            status6 = status5;
                                            oVar.f141149b = null;
                                            oVar.f141150c = null;
                                            oVar.f141151d = null;
                                            oVar.f141152e = null;
                                            oVar.f141153f = null;
                                            oVar.f141154g = null;
                                            oVar.f141155h = status6;
                                            oVar.f141156i = mVar5;
                                            oVar.f141157j = userSettingsDTO3;
                                            oVar.f141148a = z17;
                                            oVar.f141160m = 8;
                                            if (i0Var10.await(oVar) == aVar) {
                                                mVar6 = mVar5;
                                                userSettingsDTO4 = userSettingsDTO3;
                                                ge1.b.T(dVar, null, null, new r(this, null), 3);
                                                Context applicationContext3 = context.getApplicationContext();
                                                applicationContext3.getClass();
                                                j(applicationContext3, z17);
                                                if (mVar6 != null) {
                                                }
                                                String str10 = str;
                                                i2.f36769a.getClass();
                                                i2.a.f(a2.GENERAL, str10, str3 + mVar6 + "] userSettingsDTO[" + userSettingsDTO4 + "]");
                                                return new i0.a(h0.NULL_USER_DATA);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return aVar;
                    case 3:
                        boolean z19 = oVar.f141148a;
                        status2 = oVar.f141155h;
                        i0Var5 = oVar.f141154g;
                        i0Var4 = oVar.f141153f;
                        o53.i0 i0Var14 = oVar.f141152e;
                        o53.i0 i0Var15 = oVar.f141151d;
                        o53.i0 i0Var16 = oVar.f141150c;
                        o13.r.b(obj4);
                        i0VarJ = i0Var16;
                        obj2 = obj4;
                        str3 = "Error fetching user data socialProfileDTO[";
                        context = context;
                        str4 = "Error performing app upgrades: ";
                        str5 = "Error No Display Name socialProfileDTO[";
                        i0VarJ2 = i0Var14;
                        i0Var3 = i0Var15;
                        str = "PostUserAuthenticationCaller";
                        z16 = z19;
                        mVar = (com.garmin.android.apps.connectmobile.userprofile.model.m) obj2;
                        oVar.f141149b = null;
                        oVar.f141150c = null;
                        oVar.f141151d = i0Var3;
                        oVar.f141152e = i0VarJ2;
                        oVar.f141153f = i0Var4;
                        oVar.f141154g = i0Var5;
                        oVar.f141155h = status2;
                        oVar.f141156i = mVar;
                        oVar.f141148a = z16;
                        oVar.f141160m = 4;
                        objAwait2 = i0VarJ.await(oVar);
                        if (objAwait2 == aVar) {
                            Auth.MobileAppAuthorizeResponse.Status status10 = status2;
                            mVar2 = mVar;
                            obj3 = objAwait2;
                            i0Var6 = i0Var5;
                            status3 = status10;
                            i0Var7 = i0VarJ2;
                            userSettingsDTO = (UserSettingsDTO) obj3;
                            oVar.f141149b = null;
                            oVar.f141150c = null;
                            oVar.f141151d = null;
                            oVar.f141152e = i0Var7;
                            oVar.f141153f = i0Var4;
                            oVar.f141154g = i0Var6;
                            oVar.f141155h = status3;
                            oVar.f141156i = mVar2;
                            oVar.f141157j = userSettingsDTO;
                            oVar.f141148a = z16;
                            oVar.f141160m = 5;
                            if (i0Var3.await(oVar) != aVar) {
                                com.garmin.android.apps.connectmobile.userprofile.model.m mVar10 = mVar2;
                                userSettingsDTO2 = userSettingsDTO;
                                i0Var8 = i0Var7;
                                i0Var9 = i0Var4;
                                status4 = status3;
                                mVar3 = mVar10;
                                i0Var10 = i0Var6;
                                oVar.f141149b = null;
                                oVar.f141150c = null;
                                oVar.f141151d = null;
                                oVar.f141152e = null;
                                oVar.f141153f = i0Var9;
                                oVar.f141154g = i0Var10;
                                oVar.f141155h = status4;
                                oVar.f141156i = mVar3;
                                oVar.f141157j = userSettingsDTO2;
                                oVar.f141148a = z16;
                                oVar.f141160m = 6;
                                if (i0Var8.await(oVar) == aVar) {
                                    UserSettingsDTO userSettingsDTO8 = userSettingsDTO2;
                                    z17 = z16;
                                    status5 = status4;
                                    mVar4 = mVar3;
                                    userSettingsDTO3 = userSettingsDTO8;
                                    i0Var11 = i0Var9;
                                    oVar.f141149b = null;
                                    oVar.f141150c = null;
                                    oVar.f141151d = null;
                                    oVar.f141152e = null;
                                    oVar.f141153f = null;
                                    oVar.f141154g = i0Var10;
                                    oVar.f141155h = status5;
                                    oVar.f141156i = mVar4;
                                    oVar.f141157j = userSettingsDTO3;
                                    oVar.f141148a = z17;
                                    oVar.f141160m = 7;
                                    if (i0Var11.await(oVar) != aVar) {
                                        mVar5 = mVar4;
                                        status6 = status5;
                                        oVar.f141149b = null;
                                        oVar.f141150c = null;
                                        oVar.f141151d = null;
                                        oVar.f141152e = null;
                                        oVar.f141153f = null;
                                        oVar.f141154g = null;
                                        oVar.f141155h = status6;
                                        oVar.f141156i = mVar5;
                                        oVar.f141157j = userSettingsDTO3;
                                        oVar.f141148a = z17;
                                        oVar.f141160m = 8;
                                        if (i0Var10.await(oVar) == aVar) {
                                            mVar6 = mVar5;
                                            userSettingsDTO4 = userSettingsDTO3;
                                            ge1.b.T(dVar, null, null, new r(this, null), 3);
                                            Context applicationContext4 = context.getApplicationContext();
                                            applicationContext4.getClass();
                                            j(applicationContext4, z17);
                                            if (mVar6 != null) {
                                            }
                                            String str11 = str;
                                            i2.f36769a.getClass();
                                            i2.a.f(a2.GENERAL, str11, str3 + mVar6 + "] userSettingsDTO[" + userSettingsDTO4 + "]");
                                            return new i0.a(h0.NULL_USER_DATA);
                                        }
                                    }
                                }
                            }
                        }
                        return aVar;
                    case 4:
                        boolean z24 = oVar.f141148a;
                        mVar2 = oVar.f141156i;
                        status3 = oVar.f141155h;
                        o53.i0 i0Var17 = oVar.f141154g;
                        o53.i0 i0Var18 = oVar.f141153f;
                        i0Var7 = oVar.f141152e;
                        o53.i0 i0Var19 = oVar.f141151d;
                        o13.r.b(obj4);
                        i0Var3 = i0Var19;
                        obj3 = obj4;
                        str3 = "Error fetching user data socialProfileDTO[";
                        i0Var6 = i0Var17;
                        i0Var4 = i0Var18;
                        context = context;
                        str4 = "Error performing app upgrades: ";
                        str5 = "Error No Display Name socialProfileDTO[";
                        str = "PostUserAuthenticationCaller";
                        z16 = z24;
                        userSettingsDTO = (UserSettingsDTO) obj3;
                        oVar.f141149b = null;
                        oVar.f141150c = null;
                        oVar.f141151d = null;
                        oVar.f141152e = i0Var7;
                        oVar.f141153f = i0Var4;
                        oVar.f141154g = i0Var6;
                        oVar.f141155h = status3;
                        oVar.f141156i = mVar2;
                        oVar.f141157j = userSettingsDTO;
                        oVar.f141148a = z16;
                        oVar.f141160m = 5;
                        if (i0Var3.await(oVar) != aVar) {
                            com.garmin.android.apps.connectmobile.userprofile.model.m mVar11 = mVar2;
                            userSettingsDTO2 = userSettingsDTO;
                            i0Var8 = i0Var7;
                            i0Var9 = i0Var4;
                            status4 = status3;
                            mVar3 = mVar11;
                            i0Var10 = i0Var6;
                            oVar.f141149b = null;
                            oVar.f141150c = null;
                            oVar.f141151d = null;
                            oVar.f141152e = null;
                            oVar.f141153f = i0Var9;
                            oVar.f141154g = i0Var10;
                            oVar.f141155h = status4;
                            oVar.f141156i = mVar3;
                            oVar.f141157j = userSettingsDTO2;
                            oVar.f141148a = z16;
                            oVar.f141160m = 6;
                            if (i0Var8.await(oVar) == aVar) {
                                UserSettingsDTO userSettingsDTO9 = userSettingsDTO2;
                                z17 = z16;
                                status5 = status4;
                                mVar4 = mVar3;
                                userSettingsDTO3 = userSettingsDTO9;
                                i0Var11 = i0Var9;
                                oVar.f141149b = null;
                                oVar.f141150c = null;
                                oVar.f141151d = null;
                                oVar.f141152e = null;
                                oVar.f141153f = null;
                                oVar.f141154g = i0Var10;
                                oVar.f141155h = status5;
                                oVar.f141156i = mVar4;
                                oVar.f141157j = userSettingsDTO3;
                                oVar.f141148a = z17;
                                oVar.f141160m = 7;
                                if (i0Var11.await(oVar) != aVar) {
                                    mVar5 = mVar4;
                                    status6 = status5;
                                    oVar.f141149b = null;
                                    oVar.f141150c = null;
                                    oVar.f141151d = null;
                                    oVar.f141152e = null;
                                    oVar.f141153f = null;
                                    oVar.f141154g = null;
                                    oVar.f141155h = status6;
                                    oVar.f141156i = mVar5;
                                    oVar.f141157j = userSettingsDTO3;
                                    oVar.f141148a = z17;
                                    oVar.f141160m = 8;
                                    if (i0Var10.await(oVar) == aVar) {
                                        mVar6 = mVar5;
                                        userSettingsDTO4 = userSettingsDTO3;
                                        ge1.b.T(dVar, null, null, new r(this, null), 3);
                                        Context applicationContext5 = context.getApplicationContext();
                                        applicationContext5.getClass();
                                        j(applicationContext5, z17);
                                        if (mVar6 != null) {
                                        }
                                        String str12 = str;
                                        i2.f36769a.getClass();
                                        i2.a.f(a2.GENERAL, str12, str3 + mVar6 + "] userSettingsDTO[" + userSettingsDTO4 + "]");
                                        return new i0.a(h0.NULL_USER_DATA);
                                    }
                                }
                            }
                        }
                        return aVar;
                    case 5:
                        boolean z25 = oVar.f141148a;
                        userSettingsDTO2 = oVar.f141157j;
                        mVar3 = oVar.f141156i;
                        status4 = oVar.f141155h;
                        i0Var10 = oVar.f141154g;
                        i0Var9 = oVar.f141153f;
                        i0Var8 = oVar.f141152e;
                        o13.r.b(obj4);
                        context = context;
                        str3 = "Error fetching user data socialProfileDTO[";
                        str4 = "Error performing app upgrades: ";
                        str5 = "Error No Display Name socialProfileDTO[";
                        str = "PostUserAuthenticationCaller";
                        z16 = z25;
                        oVar.f141149b = null;
                        oVar.f141150c = null;
                        oVar.f141151d = null;
                        oVar.f141152e = null;
                        oVar.f141153f = i0Var9;
                        oVar.f141154g = i0Var10;
                        oVar.f141155h = status4;
                        oVar.f141156i = mVar3;
                        oVar.f141157j = userSettingsDTO2;
                        oVar.f141148a = z16;
                        oVar.f141160m = 6;
                        if (i0Var8.await(oVar) == aVar) {
                            UserSettingsDTO userSettingsDTO10 = userSettingsDTO2;
                            z17 = z16;
                            status5 = status4;
                            mVar4 = mVar3;
                            userSettingsDTO3 = userSettingsDTO10;
                            i0Var11 = i0Var9;
                            oVar.f141149b = null;
                            oVar.f141150c = null;
                            oVar.f141151d = null;
                            oVar.f141152e = null;
                            oVar.f141153f = null;
                            oVar.f141154g = i0Var10;
                            oVar.f141155h = status5;
                            oVar.f141156i = mVar4;
                            oVar.f141157j = userSettingsDTO3;
                            oVar.f141148a = z17;
                            oVar.f141160m = 7;
                            if (i0Var11.await(oVar) != aVar) {
                                mVar5 = mVar4;
                                status6 = status5;
                                oVar.f141149b = null;
                                oVar.f141150c = null;
                                oVar.f141151d = null;
                                oVar.f141152e = null;
                                oVar.f141153f = null;
                                oVar.f141154g = null;
                                oVar.f141155h = status6;
                                oVar.f141156i = mVar5;
                                oVar.f141157j = userSettingsDTO3;
                                oVar.f141148a = z17;
                                oVar.f141160m = 8;
                                if (i0Var10.await(oVar) == aVar) {
                                    mVar6 = mVar5;
                                    userSettingsDTO4 = userSettingsDTO3;
                                    ge1.b.T(dVar, null, null, new r(this, null), 3);
                                    Context applicationContext6 = context.getApplicationContext();
                                    applicationContext6.getClass();
                                    j(applicationContext6, z17);
                                    if (mVar6 != null) {
                                    }
                                    String str13 = str;
                                    i2.f36769a.getClass();
                                    i2.a.f(a2.GENERAL, str13, str3 + mVar6 + "] userSettingsDTO[" + userSettingsDTO4 + "]");
                                    return new i0.a(h0.NULL_USER_DATA);
                                }
                            }
                        }
                        return aVar;
                    case 6:
                        z17 = oVar.f141148a;
                        userSettingsDTO3 = oVar.f141157j;
                        mVar4 = oVar.f141156i;
                        Auth.MobileAppAuthorizeResponse.Status status11 = oVar.f141155h;
                        o53.i0 i0Var20 = oVar.f141154g;
                        i0Var11 = oVar.f141153f;
                        o13.r.b(obj4);
                        context = context;
                        str3 = "Error fetching user data socialProfileDTO[";
                        str4 = "Error performing app upgrades: ";
                        str5 = "Error No Display Name socialProfileDTO[";
                        status5 = status11;
                        i0Var10 = i0Var20;
                        str = "PostUserAuthenticationCaller";
                        oVar.f141149b = null;
                        oVar.f141150c = null;
                        oVar.f141151d = null;
                        oVar.f141152e = null;
                        oVar.f141153f = null;
                        oVar.f141154g = i0Var10;
                        oVar.f141155h = status5;
                        oVar.f141156i = mVar4;
                        oVar.f141157j = userSettingsDTO3;
                        oVar.f141148a = z17;
                        oVar.f141160m = 7;
                        if (i0Var11.await(oVar) != aVar) {
                            mVar5 = mVar4;
                            status6 = status5;
                            oVar.f141149b = null;
                            oVar.f141150c = null;
                            oVar.f141151d = null;
                            oVar.f141152e = null;
                            oVar.f141153f = null;
                            oVar.f141154g = null;
                            oVar.f141155h = status6;
                            oVar.f141156i = mVar5;
                            oVar.f141157j = userSettingsDTO3;
                            oVar.f141148a = z17;
                            oVar.f141160m = 8;
                            if (i0Var10.await(oVar) == aVar) {
                                mVar6 = mVar5;
                                userSettingsDTO4 = userSettingsDTO3;
                                ge1.b.T(dVar, null, null, new r(this, null), 3);
                                Context applicationContext7 = context.getApplicationContext();
                                applicationContext7.getClass();
                                j(applicationContext7, z17);
                                if (mVar6 != null) {
                                }
                                String str14 = str;
                                i2.f36769a.getClass();
                                i2.a.f(a2.GENERAL, str14, str3 + mVar6 + "] userSettingsDTO[" + userSettingsDTO4 + "]");
                                return new i0.a(h0.NULL_USER_DATA);
                            }
                        }
                        return aVar;
                    case 7:
                        z17 = oVar.f141148a;
                        userSettingsDTO3 = oVar.f141157j;
                        com.garmin.android.apps.connectmobile.userprofile.model.m mVar12 = oVar.f141156i;
                        Auth.MobileAppAuthorizeResponse.Status status12 = oVar.f141155h;
                        i0Var10 = oVar.f141154g;
                        o13.r.b(obj4);
                        context = context;
                        str3 = "Error fetching user data socialProfileDTO[";
                        str4 = "Error performing app upgrades: ";
                        str5 = "Error No Display Name socialProfileDTO[";
                        mVar5 = mVar12;
                        status6 = status12;
                        str = "PostUserAuthenticationCaller";
                        oVar.f141149b = null;
                        oVar.f141150c = null;
                        oVar.f141151d = null;
                        oVar.f141152e = null;
                        oVar.f141153f = null;
                        oVar.f141154g = null;
                        oVar.f141155h = status6;
                        oVar.f141156i = mVar5;
                        oVar.f141157j = userSettingsDTO3;
                        oVar.f141148a = z17;
                        oVar.f141160m = 8;
                        if (i0Var10.await(oVar) == aVar) {
                            mVar6 = mVar5;
                            userSettingsDTO4 = userSettingsDTO3;
                            ge1.b.T(dVar, null, null, new r(this, null), 3);
                            Context applicationContext8 = context.getApplicationContext();
                            applicationContext8.getClass();
                            j(applicationContext8, z17);
                            if (mVar6 != null) {
                            }
                            String str15 = str;
                            i2.f36769a.getClass();
                            i2.a.f(a2.GENERAL, str15, str3 + mVar6 + "] userSettingsDTO[" + userSettingsDTO4 + "]");
                            return new i0.a(h0.NULL_USER_DATA);
                        }
                        return aVar;
                    case 8:
                        z17 = oVar.f141148a;
                        userSettingsDTO3 = oVar.f141157j;
                        com.garmin.android.apps.connectmobile.userprofile.model.m mVar13 = oVar.f141156i;
                        status6 = oVar.f141155h;
                        o13.r.b(obj4);
                        context = context;
                        str3 = "Error fetching user data socialProfileDTO[";
                        str4 = "Error performing app upgrades: ";
                        str5 = "Error No Display Name socialProfileDTO[";
                        mVar6 = mVar13;
                        str = "PostUserAuthenticationCaller";
                        userSettingsDTO4 = userSettingsDTO3;
                        ge1.b.T(dVar, null, null, new r(this, null), 3);
                        Context applicationContext9 = context.getApplicationContext();
                        applicationContext9.getClass();
                        j(applicationContext9, z17);
                        if (mVar6 != null) {
                        }
                        String str16 = str;
                        i2.f36769a.getClass();
                        i2.a.f(a2.GENERAL, str16, str3 + mVar6 + "] userSettingsDTO[" + userSettingsDTO4 + "]");
                        return new i0.a(h0.NULL_USER_DATA);
                    case 9:
                        userSettingsDTO4 = oVar.f141157j;
                        mVar6 = oVar.f141156i;
                        try {
                            o13.r.b(obj4);
                            str4 = "Error performing app upgrades: ";
                            str2 = "PostUserAuthenticationCaller";
                            bVar = Unit.INSTANCE;
                            int i19 = o13.q.f128596b;
                            break;
                        } catch (Throwable th5) {
                            th3 = th5;
                            str4 = "Error performing app upgrades: ";
                            str2 = "PostUserAuthenticationCaller";
                            int i110 = o13.q.f128596b;
                            bVar = new o13.q.b(th3);
                        }
                        Throwable thB = o13.q.b(bVar);
                        if (thB != null) {
                            i2.f36769a.getClass();
                            i2.a.f(a2.GENERAL, str2, str4 + thB);
                        }
                        return new i0.b(userSettingsDTO4, mVar6);
                    default:
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            } catch (Exception e14) {
                e = e14;
                str4 = "PostUserAuthenticationCaller";
            }
        } catch (Exception e15) {
            e = e15;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(v13.c cVar) {
        a0 a0Var;
        if (cVar instanceof a0) {
            a0Var = (a0) cVar;
            int i14 = a0Var.f141046c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                a0Var.f141046c = i14 - Integer.MIN_VALUE;
            } else {
                a0Var = new a0(this, cVar);
            }
        } else {
            a0Var = new a0(this, cVar);
        }
        Object objD = a0Var.f141044a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = a0Var.f141046c;
        if (i15 == 0) {
            o13.r.b(objD);
            a2 a2Var = a2.GENERAL;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "PostUserAuthenticationCaller", "fetchAllDevices()");
            a0Var.f141046c = 1;
            objD = pc0.j.d(this.f141139e, false, a0Var);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objD);
        }
        v2 v2Var = (v2) objD;
        if (v2Var instanceof v2.b) {
            a2 a2Var2 = a2.GENERAL;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "PostUserAuthenticationCaller", "fetchAllDevices() SUCCESS");
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            a2 a2Var3 = a2.GENERAL;
            i2.f36769a.getClass();
            i2.a.f(a2Var3, "PostUserAuthenticationCaller", "fetchAllDevices() ERROR");
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(v13.c cVar) {
        b0 b0Var;
        if (cVar instanceof b0) {
            b0Var = (b0) cVar;
            int i14 = b0Var.f141051c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                b0Var.f141051c = i14 - Integer.MIN_VALUE;
            } else {
                b0Var = new b0(this, cVar);
            }
        } else {
            b0Var = new b0(this, cVar);
        }
        Object objA = b0Var.f141049a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = b0Var.f141051c;
        if (i15 == 0) {
            o13.r.b(objA);
            a2 a2Var = a2.GENERAL;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "PostUserAuthenticationCaller", "fetchIntelligentRoles()");
            b0Var.f141051c = 1;
            objA = this.f141137c.a(b0Var);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        v2 v2Var = (v2) objA;
        if (v2Var instanceof v2.b) {
            a2 a2Var2 = a2.GENERAL;
            String strH = androidx.room.a0.h("fetchIntelligentRoles() SUCCESS[", v2Var, "]");
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "PostUserAuthenticationCaller", strH);
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            a2 a2Var3 = a2.GENERAL;
            String strH2 = androidx.room.a0.h("fetchIntelligentRoles() ERROR[", v2Var, "]");
            i2.f36769a.getClass();
            i2.a.f(a2Var3, "PostUserAuthenticationCaller", strH2);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object h(int i14, v13.c cVar) {
        d0 d0Var;
        if (cVar instanceof d0) {
            d0Var = (d0) cVar;
            int i15 = d0Var.f141058d;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                d0Var.f141058d = i15 - Integer.MIN_VALUE;
            } else {
                d0Var = new d0(this, cVar);
            }
        } else {
            d0Var = new d0(this, cVar);
        }
        Object objB = d0Var.f141056b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i16 = d0Var.f141058d;
        if (i16 == 0) {
            o13.r.b(objB);
            a2 a2Var = a2.GENERAL;
            String strF = v.e0.f(i14, "fetchSocialProfile() retryAttempt[", "]");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "PostUserAuthenticationCaller", strF);
            d0Var.f141055a = i14;
            d0Var.f141058d = 1;
            objB = qo1.c.b(this.f141136b, d0Var);
            if (objB != obj) {
            }
        }
        if (i16 != 1) {
            if (i16 == 2) {
                o13.r.b(objB);
                return objB;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i14 = d0Var.f141055a;
        o13.r.b(objB);
        v2 v2Var = (v2) objB;
        if (v2Var instanceof v2.b) {
            a2 a2Var2 = a2.GENERAL;
            String strH = androidx.room.a0.h("fetchSocialProfile() SUCCESS[", v2Var, "]");
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "PostUserAuthenticationCaller", strH);
            return (com.garmin.android.apps.connectmobile.userprofile.model.m) ((v2.b) v2Var).f47386a;
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        a2 a2Var3 = a2.GENERAL;
        String strH2 = androidx.room.a0.h("fetchSocialProfile() ERROR[", v2Var, "]");
        i2.f36769a.getClass();
        i2.a.f(a2Var3, "PostUserAuthenticationCaller", strH2);
        if (i14 >= 3) {
            return null;
        }
        d0Var.f141055a = i14;
        d0Var.f141058d = 2;
        Object objH = h(i14 + 1, d0Var);
        return objH == obj ? obj : objH;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:47:0x00eb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ec A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bb, code lost:
    
        if (r11.f141141g.a(r0) == r1) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(int i14, v13.c cVar) {
        g0 g0Var;
        v2 v2Var;
        Object objI;
        int i15;
        v2 v2Var2;
        if (cVar instanceof g0) {
            g0Var = (g0) cVar;
            int i16 = g0Var.f141077e;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                g0Var.f141077e = i16 - Integer.MIN_VALUE;
            } else {
                g0Var = new g0(this, cVar);
            }
        } else {
            g0Var = new g0(this, cVar);
        }
        Object objB = g0Var.f141075c;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i17 = g0Var.f141077e;
        if (i17 == 0) {
            o13.r.b(objB);
            g0Var.f141073a = i14;
            g0Var.f141077e = 1;
            if (g(g0Var) != obj) {
            }
            return obj;
        }
        if (i17 == 1) {
            i14 = g0Var.f141073a;
            o13.r.b(objB);
        } else {
            if (i17 == 2) {
                i14 = g0Var.f141073a;
                o13.r.b(objB);
                v2Var = (v2) objB;
                if (v2Var instanceof v2.b) {
                    a2 a2Var = a2.GENERAL;
                    String strH = androidx.room.a0.h("fetchUserSettings() SUCCESS[", v2Var, "]");
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "PostUserAuthenticationCaller", strH);
                    g0Var.f141074b = v2Var;
                    g0Var.f141073a = i14;
                    g0Var.f141077e = 3;
                    if (this.f141140f.a(g0Var) != obj) {
                        i15 = i14;
                        v2Var2 = v2Var;
                        g0Var.f141074b = v2Var2;
                        g0Var.f141073a = i15;
                        g0Var.f141077e = 4;
                    }
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    a2 a2Var2 = a2.GENERAL;
                    String strH2 = androidx.room.a0.h("fetchUserSettings() ERROR[", v2Var, "]");
                    i2.f36769a.getClass();
                    i2.a.f(a2Var2, "PostUserAuthenticationCaller", strH2);
                    if (i14 < 3) {
                        return null;
                    }
                    g0Var.f141074b = null;
                    g0Var.f141073a = i14;
                    g0Var.f141077e = 5;
                    objI = i(i14 + 1, g0Var);
                    if (objI == obj) {
                        return objI;
                    }
                }
                return obj;
            }
            if (i17 == 3) {
                int i18 = g0Var.f141073a;
                v2 v2Var3 = g0Var.f141074b;
                o13.r.b(objB);
                i15 = i18;
                v2Var2 = v2Var3;
                g0Var.f141074b = v2Var2;
                g0Var.f141073a = i15;
                g0Var.f141077e = 4;
            } else {
                if (i17 != 4) {
                    if (i17 == 5) {
                        o13.r.b(objB);
                        return objB;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v2Var2 = g0Var.f141074b;
                o13.r.b(objB);
            }
        }
        return (UserSettingsDTO) ((v2.b) v2Var2).f47386a;
        a2 a2Var3 = a2.GENERAL;
        String strF = v.e0.f(i14, "fetchUserSettings() retryAttempt[", "]");
        i2.f36769a.getClass();
        i2.a.b(a2Var3, "PostUserAuthenticationCaller", strF);
        g0Var.f141073a = i14;
        g0Var.f141077e = 2;
        objB = this.f141138d.b(g0Var);
        if (objB != obj) {
            v2Var = (v2) objB;
            if (v2Var instanceof v2.b) {
                a2 a2Var4 = a2.GENERAL;
                String strH3 = androidx.room.a0.h("fetchUserSettings() SUCCESS[", v2Var, "]");
                i2.f36769a.getClass();
                i2.a.b(a2Var4, "PostUserAuthenticationCaller", strH3);
                g0Var.f141074b = v2Var;
                g0Var.f141073a = i14;
                g0Var.f141077e = 3;
                if (this.f141140f.a(g0Var) != obj) {
                    i15 = i14;
                    v2Var2 = v2Var;
                    g0Var.f141074b = v2Var2;
                    g0Var.f141073a = i15;
                    g0Var.f141077e = 4;
                }
            } else {
                if (v2Var instanceof v2.a) {
                    u0.r();
                    return null;
                }
                a2 a2Var5 = a2.GENERAL;
                String strH4 = androidx.room.a0.h("fetchUserSettings() ERROR[", v2Var, "]");
                i2.f36769a.getClass();
                i2.a.f(a2Var5, "PostUserAuthenticationCaller", strH4);
                if (i14 < 3) {
                    return null;
                }
                g0Var.f141074b = null;
                g0Var.f141073a = i14;
                g0Var.f141077e = 5;
                objI = i(i14 + 1, g0Var);
                if (objI == obj) {
                    return objI;
                }
            }
        }
        return obj;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lpu/n$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "MAX_RETRY_ATTEMPTS", "I", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public n(Context context, qo1.c cVar, d12.e eVar, oj1.a aVar, pc0.j jVar, te0.d dVar, te0.h hVar, q0 q0Var, aq1.i iVar, o53.z zVar, int i14, p005kotlin.jvm.internal.j jVar2) {
        o53.z zVar2;
        if ((i14 & 512) != 0) {
            x53.c cVar2 = s0.f129406a;
            zVar2 = x53.b.f189152a;
        } else {
            zVar2 = zVar;
        }
        this(context, cVar, eVar, aVar, jVar, dVar, hVar, q0Var, iVar, zVar2);
    }
}
