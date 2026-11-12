package com.garmin.android.apps.connectmobile.startup;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.startup.StartupChecksViewModel$startChecks$1", f = "StartupChecksViewModel.kt", l = {87, 90, 93, 96, 104}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f44865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f44866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f44867c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.startup.StartupChecksViewModel$startChecks$1$1", f = "StartupChecksViewModel.kt", l = {106}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f44868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f44869b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f44870c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f44870c = eVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f44870c, dVar);
            aVar.f44869b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f44868a;
            if (i14 == 0) {
                r.b(obj);
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var, "StartupChecksViewModel", "startChecks() -> fetchAndCacheCountryMinimumAge()");
                pu.h hVar = this.f44870c.f44829b;
                this.f44869b = null;
                this.f44868a = 1;
                if (hVar.a(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(e eVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f44867c = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        h hVar = new h(this.f44867c, dVar);
        hVar.f44866b = obj;
        return hVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0119, code lost:
    
        if (ge1.b.e0(r11, r1, r10) == r0) goto L49;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f44865a;
        e eVar = this.f44867c;
        if (i14 != 0) {
            if (i14 == 1 || i14 == 2 || i14 == 3 || i14 == 4) {
                r.b(obj);
            } else {
                if (i14 != 5) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
        r.b(obj);
        String[] strArr = eVar.f44832e;
        aq1.i iVar = eVar.f44828a;
        if (u.z(strArr, "GRADUATION_CHECK")) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "StartupChecksViewModel", "startChecks() -> checkUserGraduationConsents()");
            this.f44866b = null;
            this.f44865a = 1;
            if (eVar.y4(1, this) != aVar) {
            }
        } else if (u.z(eVar.f44832e, "LOCATION_CHECK") && iVar.i()) {
            i2.a aVar3 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar3.getClass();
            i2.a.b(a2Var2, "StartupChecksViewModel", "startChecks() -> fetchUserLocation()");
            this.f44866b = null;
            this.f44865a = 2;
            if (eVar.E4(this) != aVar) {
            }
        } else if (u.z(eVar.f44832e, "DI_CONNECT_PRIVACY_CHECK") && iVar.b()) {
            i2.a aVar4 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar4.getClass();
            i2.a.b(a2Var3, "StartupChecksViewModel", "startChecks() -> fetchConnectPrivacyConsent()");
            this.f44866b = null;
            this.f44865a = 3;
            if (eVar.C4(this) != aVar) {
            }
        } else if (u.z(eVar.f44832e, "NAME_APPROVAL_CHECK") && iVar.q()) {
            i2.a aVar5 = i2.f36769a;
            a2 a2Var4 = a2.GENERAL;
            aVar5.getClass();
            i2.a.b(a2Var4, "StartupChecksViewModel", "startChecks() -> fetchSocialProfile()");
            this.f44866b = null;
            this.f44865a = 4;
            if (eVar.D4(this) != aVar) {
            }
        } else if (u.z(eVar.f44832e, "USER_ROLE_CHECK") && iVar.o()) {
            i2.a aVar6 = i2.f36769a;
            a2 a2Var5 = a2.GENERAL;
            aVar6.getClass();
            i2.a.b(a2Var5, "StartupChecksViewModel", "startChecks() -> saveDefaultUserRoles()");
            eVar.J4();
        } else {
            i2.a aVar7 = i2.f36769a;
            a2 a2Var6 = a2.GENERAL;
            aVar7.getClass();
            i2.a.b(a2Var6, "StartupChecksViewModel", "startChecks() -> endConsentCheck()");
            y0<j> y0Var = eVar.f44831d;
            if (y0Var == null) {
                s.m("startupChecksLiveData");
                throw null;
            }
            j.f44873f.getClass();
            y0Var.m(j.a.a());
        }
        return aVar;
        x53.c cVar = s0.f129406a;
        x53.b bVar = x53.b.f189152a;
        a aVar8 = new a(eVar, null);
        this.f44866b = null;
        this.f44865a = 5;
    }
}
