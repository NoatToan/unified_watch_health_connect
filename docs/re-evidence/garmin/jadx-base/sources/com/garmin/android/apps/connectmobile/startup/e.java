package com.garmin.android.apps.connectmobile.startup;

import androidx.lifecycle.s0;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import aq1.a0;
import aq1.c0;
import aq1.j0;
import aq1.y;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.r;
import o53.b0;
import o53.z;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.u;
import p13.x;
import q92.v;
import r53.p2;
import r53.q2;
import v.e0;
import z10.d1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/startup/e;", "Landroidx/lifecycle/u1;", "Laq1/i;", "startupChecksRepository", "Lpu/h;", "gcmCountryMinimumAge", "Lo53/z;", "ioDispatcher", "<init>", "(Laq1/i;Lpu/h;Lo53/z;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends u1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f44827g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aq1.i f44828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pu.h f44829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f44830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y0<j> f44831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String[] f44832e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f44833f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.startup.StartupChecksViewModel$approveDisplayName$1", f = "StartupChecksViewModel.kt", l = {190}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f44834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f44835b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.userprofile.model.m f44837d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.garmin.android.apps.connectmobile.userprofile.model.m mVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f44837d = mVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = e.this.new b(this.f44837d, dVar);
            bVar.f44835b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var = (b0) this.f44835b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f44834a;
            com.garmin.android.apps.connectmobile.userprofile.model.m mVar = this.f44837d;
            e eVar = e.this;
            if (i14 == 0) {
                r.b(obj);
                aq1.i iVar = eVar.f44828a;
                this.f44835b = b0Var;
                this.f44834a = 1;
                obj = iVar.h(mVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                eVar.B4();
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                String strF = b71.i.f("SAVE SOCIAL PROFILE (approve display name) -> failed with status = ", v2Var);
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var, "StartupChecksViewModel", strF);
                y0<j> y0Var = eVar.f44831d;
                if (y0Var == null) {
                    s.m("startupChecksLiveData");
                    throw null;
                }
                j.f44873f.getClass();
                mVar.getClass();
                y0Var.m(new j(j0.APPROVE_DISPLAY_NAME_ERROR, null, null, null, mVar, 14, null));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.startup.StartupChecksViewModel$confirmUserLocation$1", f = "StartupChecksViewModel.kt", l = {142}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f44838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f44839b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f44841d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f44842e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f44841d = str;
            this.f44842e = str2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = e.this.new c(this.f44841d, this.f44842e, dVar);
            cVar.f44839b = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object objJ;
            b0 b0Var = (b0) this.f44839b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f44838a;
            String str = this.f44841d;
            e eVar = e.this;
            if (i14 == 0) {
                r.b(obj);
                aq1.i iVar = eVar.f44828a;
                this.f44839b = b0Var;
                this.f44838a = 1;
                objJ = iVar.j(str, this);
                if (objJ == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                objJ = obj;
            }
            v2 v2Var = (v2) objJ;
            if (v2Var instanceof v2.b) {
                String str2 = this.f44842e;
                String strG = e0.g("UPDATE USER LOCATION -> SUCCESS countryCode=[", str, "] , countryName=[", str2, "]");
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var, "StartupChecksViewModel", strG);
                y0<j> y0Var = eVar.f44831d;
                if (y0Var == null) {
                    s.m("startupChecksLiveData");
                    throw null;
                }
                j.f44873f.getClass();
                str2.getClass();
                y0Var.m(new j(j0.CONFIRM_LOCATION_SUCCESS, null, str2, null, null, 26, null));
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                String strF = b71.i.f("UPDATE USER LOCATION -> failed with status = ", v2Var);
                i2.a aVar3 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar3.getClass();
                i2.a.f(a2Var2, "StartupChecksViewModel", strF);
                y0<j> y0Var2 = eVar.f44831d;
                if (y0Var2 == null) {
                    s.m("startupChecksLiveData");
                    throw null;
                }
                j.a aVar4 = j.f44873f;
                d1.f200951a.getClass();
                d20.c cVarD = d1.d(str);
                aVar4.getClass();
                y0Var2.m(new j(j0.CONFIRM_LOCATION_ERROR, cVarD, null, null, null, 28, null));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.startup.StartupChecksViewModel$grantConnectPrivacyConsent$1", f = "StartupChecksViewModel.kt", l = {173, 175}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f44843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f44844b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ s92.g f44846d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(s92.g gVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f44846d = gVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = e.this.new d(this.f44846d, dVar);
            dVar2.f44844b = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
        
            if (r6.A4(r11) == r1) goto L17;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            b0 b0Var = (b0) this.f44844b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f44843a;
            s92.g gVar = this.f44846d;
            e eVar = e.this;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
            r.b(obj);
            aq1.i iVar = eVar.f44828a;
            this.f44844b = b0Var;
            this.f44843a = 1;
            obj = iVar.k(gVar, this);
            if (obj != aVar) {
            }
            return aVar;
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                this.f44844b = null;
                this.f44843a = 2;
                int i15 = e.f44827g;
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                String strF = b71.i.f("GRANT CONNECT PRIVACY CONSENT -> failed with status = ", v2Var);
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var, "StartupChecksViewModel", strF);
                y0<j> y0Var = eVar.f44831d;
                if (y0Var == null) {
                    s.m("startupChecksLiveData");
                    throw null;
                }
                j.f44873f.getClass();
                gVar.getClass();
                y0Var.m(new j(j0.GRANT_CONNECT_PRIVACY_CONSENT_ERROR, null, null, gVar, null, 22, null));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.startup.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.startup.StartupChecksViewModel$saveDefaultUserRoles$1", f = "StartupChecksViewModel.kt", l = {217}, m = "invokeSuspend", v = 2)
    public static final class C0857e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f44847a;

        public C0857e(t13.d<? super C0857e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C0857e(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return new C0857e(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f44847a;
            if (i14 == 0) {
                r.b(obj);
                k12.d dVarA = k12.d.a.a(k12.d.f102315g);
                ArrayList arrayListD = x.d("ROLE_FITNESS_USER", "ROLE_WELLNESS_USER");
                this.f44847a = 1;
                if (f0.J(dVarA, new k12.b0(dVarA, arrayListD, null), this) == aVar) {
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

    static {
        new a(null);
    }

    public e(aq1.i iVar, pu.h hVar, z zVar) {
        String[] strArr;
        iVar.getClass();
        hVar.getClass();
        zVar.getClass();
        this.f44828a = iVar;
        this.f44829b = hVar;
        this.f44830c = zVar;
        if (k1.f37122a.r()) {
            com.garmin.android.apps.connectmobile.startup.c.f44811b.getClass();
            strArr = com.garmin.android.apps.connectmobile.startup.c.a.f44813b;
        } else {
            com.garmin.android.apps.connectmobile.startup.c.f44811b.getClass();
            strArr = com.garmin.android.apps.connectmobile.startup.c.a.f44814c;
        }
        this.f44832e = strArr;
        this.f44833f = q2.a(new aq1.e(null, false, 3, null));
    }

    public final Object A4(v13.c cVar) {
        boolean z14 = u.z(this.f44832e, "NAME_APPROVAL_CHECK");
        aq1.i iVar = this.f44828a;
        if (z14 && iVar.q()) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "StartupChecksViewModel", "connectPrivacyConsentGranted() -> fetchSocialProfile()");
            Object objD4 = D4(cVar);
            return objD4 == u13.a.COROUTINE_SUSPENDED ? objD4 : Unit.INSTANCE;
        }
        if (u.z(this.f44832e, "USER_ROLE_CHECK") && iVar.o()) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var2, "StartupChecksViewModel", "connectPrivacyConsentGranted() -> saveDefaultUserRoles()");
            J4();
        } else {
            i2.a aVar3 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar3.getClass();
            i2.a.b(a2Var3, "StartupChecksViewModel", "connectPrivacyConsentGranted() -> endConsentCheck()");
            y0<j> y0Var = this.f44831d;
            if (y0Var == null) {
                s.m("startupChecksLiveData");
                throw null;
            }
            j.f44873f.getClass();
            y0Var.m(j.a.a());
        }
        return Unit.INSTANCE;
    }

    public final void B4() {
        if (u.z(this.f44832e, "USER_ROLE_CHECK") && this.f44828a.o()) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "StartupChecksViewModel", "endDisplayNameApprove() -> saveDefaultUserRoles()");
            J4();
            return;
        }
        i2.a aVar2 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var2, "StartupChecksViewModel", "endDisplayNameApprove() -> endConsentCheck()");
        y0<j> y0Var = this.f44831d;
        if (y0Var == null) {
            s.m("startupChecksLiveData");
            throw null;
        }
        j.f44873f.getClass();
        y0Var.m(j.a.a());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00dc, code lost:
    
        if (A4(r2) == r3) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object C4(v13.c cVar) {
        a0 a0Var;
        if (cVar instanceof a0) {
            a0Var = (a0) cVar;
            int i14 = a0Var.f12347c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                a0Var.f12347c = i14 - Integer.MIN_VALUE;
            } else {
                a0Var = new a0(this, cVar);
            }
        } else {
            a0Var = new a0(this, cVar);
        }
        Object objL = a0Var.f12345a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = a0Var.f12347c;
        aq1.i iVar = this.f44828a;
        if (i15 != 0) {
            if (i15 == 1) {
                r.b(objL);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objL);
            }
            return Unit.INSTANCE;
        }
        r.b(objL);
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "StartupChecksViewModel", "fetchConnectPrivacyConsent()");
        y0<j> y0Var = this.f44831d;
        if (y0Var == null) {
            s.m("startupChecksLiveData");
            throw null;
        }
        j.f44873f.getClass();
        y0Var.m(j.a.b());
        a0Var.f12347c = 1;
        objL = iVar.l(a0Var);
        if (objL != obj) {
        }
        return obj;
        v2 v2Var = (v2) objL;
        if (v2Var instanceof v2.b) {
            if (iVar.d()) {
                s92.g gVar = (s92.g) ((v2.b) v2Var).f47386a;
                if (gVar != null) {
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar2.getClass();
                    i2.a.b(a2Var2, "StartupChecksViewModel", "Show connect privacy consent screen");
                    y0<j> y0Var2 = this.f44831d;
                    if (y0Var2 == null) {
                        s.m("startupChecksLiveData");
                        throw null;
                    }
                    j.f44873f.getClass();
                    y0Var2.m(new j(j0.SHOW_CONNECT_PRIVACY_CONSENT, null, null, gVar, null, 22, null));
                } else {
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var3 = a2.GENERAL;
                    aVar3.getClass();
                    i2.a.f(a2Var3, "StartupChecksViewModel", "GET DI_CONNECT_PRIVACY CONSENT -> NULL consent text response");
                    y0<j> y0Var3 = this.f44831d;
                    if (y0Var3 == null) {
                        s.m("startupChecksLiveData");
                        throw null;
                    }
                    j.f44873f.getClass();
                    y0Var3.m(new j(j0.SHOW_CONNECT_PRIVACY_CONSENT_ERROR, null, null, null, null, 30, null));
                }
            } else {
                a0Var.f12347c = 2;
            }
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            String strF = b71.i.f("GET DI_CONNECT_PRIVACY CONSENT -> failed with status = ", v2Var);
            i2.a aVar4 = i2.f36769a;
            a2 a2Var4 = a2.GENERAL;
            aVar4.getClass();
            i2.a.f(a2Var4, "StartupChecksViewModel", strF);
            y0<j> y0Var4 = this.f44831d;
            if (y0Var4 == null) {
                s.m("startupChecksLiveData");
                throw null;
            }
            j.f44873f.getClass();
            y0Var4.m(new j(j0.SHOW_CONNECT_PRIVACY_CONSENT_ERROR, null, null, null, null, 30, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object D4(v13.c cVar) {
        aq1.b0 b0Var;
        if (cVar instanceof aq1.b0) {
            b0Var = (aq1.b0) cVar;
            int i14 = b0Var.f12354c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                b0Var.f12354c = i14 - Integer.MIN_VALUE;
            } else {
                b0Var = new aq1.b0(this, cVar);
            }
        } else {
            b0Var = new aq1.b0(this, cVar);
        }
        Object objF = b0Var.f12352a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = b0Var.f12354c;
        if (i15 == 0) {
            r.b(objF);
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "StartupChecksViewModel", "fetchSocialProfile()");
            y0<j> y0Var = this.f44831d;
            if (y0Var == null) {
                s.m("startupChecksLiveData");
                throw null;
            }
            j.f44873f.getClass();
            y0Var.m(j.a.b());
            b0Var.f12354c = 1;
            objF = this.f44828a.f(b0Var);
            if (objF == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objF);
        }
        v2 v2Var = (v2) objF;
        if (v2Var instanceof v2.b) {
            com.garmin.android.apps.connectmobile.userprofile.model.m mVar = (com.garmin.android.apps.connectmobile.userprofile.model.m) ((v2.b) v2Var).f47386a;
            if (mVar == null) {
                i2.a aVar3 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar3.getClass();
                i2.a.f(a2Var2, "StartupChecksViewModel", "GET SOCIAL PROFILE -> NULL social profile response");
                B4();
            } else if (s.g(mVar.getNameApproved(), Boolean.TRUE)) {
                B4();
            } else {
                i2.a aVar4 = i2.f36769a;
                a2 a2Var3 = a2.GENERAL;
                aVar4.getClass();
                i2.a.b(a2Var3, "StartupChecksViewModel", "Show display name approve screen");
                y0<j> y0Var2 = this.f44831d;
                if (y0Var2 == null) {
                    s.m("startupChecksLiveData");
                    throw null;
                }
                j.f44873f.getClass();
                y0Var2.m(new j(j0.SHOW_DISPLAY_NAME_APPROVE, null, null, null, mVar, 14, null));
            }
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            String strF = b71.i.f("GET SOCIAL PROFILE -> failed with status = ", v2Var);
            i2.a aVar5 = i2.f36769a;
            a2 a2Var4 = a2.GENERAL;
            aVar5.getClass();
            i2.a.f(a2Var4, "StartupChecksViewModel", strF);
            B4();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c3, code lost:
    
        if (H4(r2) == r3) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object E4(v13.c cVar) {
        c0 c0Var;
        if (cVar instanceof c0) {
            c0Var = (c0) cVar;
            int i14 = c0Var.f12359c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c0Var.f12359c = i14 - Integer.MIN_VALUE;
            } else {
                c0Var = new c0(this, cVar);
            }
        } else {
            c0Var = new c0(this, cVar);
        }
        Object objA = c0Var.f12357a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = c0Var.f12359c;
        if (i15 != 0) {
            if (i15 == 1) {
                r.b(objA);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objA);
            }
            return Unit.INSTANCE;
        }
        r.b(objA);
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "StartupChecksViewModel", "fetchUserLocation()");
        y0<j> y0Var = this.f44831d;
        if (y0Var == null) {
            s.m("startupChecksLiveData");
            throw null;
        }
        j.f44873f.getClass();
        y0Var.m(j.a.b());
        c0Var.f12359c = 1;
        objA = this.f44828a.a(c0Var);
        if (objA != obj) {
        }
        return obj;
        v2 v2Var = (v2) objA;
        if (v2Var instanceof v2.b) {
            d20.c cVar2 = (d20.c) ((v2.b) v2Var).f47386a;
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var2, "StartupChecksViewModel", "GET USER LOCATION = [" + cVar2 + "]");
            if (cVar2.getIsCountryCodeVerified()) {
                c0Var.f12359c = 2;
            } else {
                i2.a.b(a2Var2, "StartupChecksViewModel", "Show location confirmation screen");
                y0<j> y0Var2 = this.f44831d;
                if (y0Var2 == null) {
                    s.m("startupChecksLiveData");
                    throw null;
                }
                j.f44873f.getClass();
                y0Var2.m(new j(j0.SHOW_LOCATION_POPUP, cVar2, null, null, null, 28, null));
            }
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            String strF = b71.i.f("GET USER LOCATION -> failed with status = ", v2Var);
            i2.a aVar3 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var3, "StartupChecksViewModel", strF);
            y0<j> y0Var3 = this.f44831d;
            if (y0Var3 == null) {
                s.m("startupChecksLiveData");
                throw null;
            }
            j.f44873f.getClass();
            y0Var3.m(new j(j0.SHOW_LOCATION_ERROR, null, null, null, null, 30, null));
        }
        return Unit.INSTANCE;
    }

    public final Object F4(v13.c cVar) {
        y0<j> y0Var = this.f44831d;
        if (y0Var == null) {
            s.m("startupChecksLiveData");
            throw null;
        }
        j.f44873f.getClass();
        y0Var.m(new j(j0.GRADUATION_CONSENTS_CONFIRMED, null, null, null, null, 30, null));
        boolean z14 = u.z(this.f44832e, "LOCATION_CHECK");
        aq1.i iVar = this.f44828a;
        if (z14 && iVar.i()) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "StartupChecksViewModel", "startChecks() -> fetchUserLocation()");
            Object objE4 = E4(cVar);
            return objE4 == u13.a.COROUTINE_SUSPENDED ? objE4 : Unit.INSTANCE;
        }
        if (u.z(this.f44832e, "DI_CONNECT_PRIVACY_CHECK") && iVar.b()) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var2, "StartupChecksViewModel", "locationConfirmed() -> fetchConnectPrivacyConsent()");
            Object objC4 = C4(cVar);
            return objC4 == u13.a.COROUTINE_SUSPENDED ? objC4 : Unit.INSTANCE;
        }
        if (u.z(this.f44832e, "NAME_APPROVAL_CHECK") && iVar.q()) {
            i2.a aVar3 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar3.getClass();
            i2.a.b(a2Var3, "StartupChecksViewModel", "locationConfirmed() -> fetchSocialProfile()");
            Object objD4 = D4(cVar);
            return objD4 == u13.a.COROUTINE_SUSPENDED ? objD4 : Unit.INSTANCE;
        }
        if (u.z(this.f44832e, "USER_ROLE_CHECK") && iVar.o()) {
            i2.a aVar4 = i2.f36769a;
            a2 a2Var4 = a2.GENERAL;
            aVar4.getClass();
            i2.a.b(a2Var4, "StartupChecksViewModel", "locationConfirmed() -> saveDefaultUserRoles()");
            J4();
        } else {
            i2.a aVar5 = i2.f36769a;
            a2 a2Var5 = a2.GENERAL;
            aVar5.getClass();
            i2.a.b(a2Var5, "StartupChecksViewModel", "locationConfirmed() -> endConsentCheck()");
            y0<j> y0Var2 = this.f44831d;
            if (y0Var2 == null) {
                s.m("startupChecksLiveData");
                throw null;
            }
            y0Var2.m(j.a.a());
        }
        return Unit.INSTANCE;
    }

    public final void G4(s92.g gVar) {
        gVar.getClass();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "StartupChecksViewModel", "grantConnectPrivacyConsent()");
        y0<j> y0Var = this.f44831d;
        if (y0Var == null) {
            s.m("startupChecksLiveData");
            throw null;
        }
        j.f44873f.getClass();
        y0Var.m(j.a.b());
        ge1.b.T(v1.a(this), null, null, new d(gVar, null), 3);
    }

    public final Object H4(v13.c cVar) {
        boolean z14 = u.z(this.f44832e, "DI_CONNECT_PRIVACY_CHECK");
        aq1.i iVar = this.f44828a;
        if (z14 && iVar.b()) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "StartupChecksViewModel", "locationConfirmed() -> fetchConnectPrivacyConsent()");
            Object objC4 = C4(cVar);
            return objC4 == u13.a.COROUTINE_SUSPENDED ? objC4 : Unit.INSTANCE;
        }
        if (u.z(this.f44832e, "NAME_APPROVAL_CHECK") && iVar.q()) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var2, "StartupChecksViewModel", "locationConfirmed() -> fetchSocialProfile()");
            Object objD4 = D4(cVar);
            return objD4 == u13.a.COROUTINE_SUSPENDED ? objD4 : Unit.INSTANCE;
        }
        if (u.z(this.f44832e, "USER_ROLE_CHECK") && iVar.o()) {
            i2.a aVar3 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar3.getClass();
            i2.a.b(a2Var3, "StartupChecksViewModel", "locationConfirmed() -> saveDefaultUserRoles()");
            J4();
        } else {
            i2.a aVar4 = i2.f36769a;
            a2 a2Var4 = a2.GENERAL;
            aVar4.getClass();
            i2.a.b(a2Var4, "StartupChecksViewModel", "locationConfirmed() -> endConsentCheck()");
            y0<j> y0Var = this.f44831d;
            if (y0Var == null) {
                s.m("startupChecksLiveData");
                throw null;
            }
            j.f44873f.getClass();
            y0Var.m(j.a.a());
        }
        return Unit.INSTANCE;
    }

    public final s0<j> I4() {
        if (this.f44831d == null) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "StartupChecksViewModel", "observeUpdates() creating LiveData");
            this.f44831d = new y0<>();
        }
        y0<j> y0Var = this.f44831d;
        if (y0Var != null) {
            return y0Var;
        }
        s.m("startupChecksLiveData");
        throw null;
    }

    public final void J4() {
        String str = "setDefaultUserRoles() -> userRole=[" + f12.a.ROLE_FITNESS_USER + ", " + f12.a.ROLE_WELLNESS_USER + "]";
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "StartupChecksViewModel", str);
        ge1.b.T(v1.a(this), null, null, new C0857e(null), 3);
        GCMSettingManager.b("ROLE_FITNESS_USER");
        GCMSettingManager.b("ROLE_WELLNESS_USER");
        i2.a.b(a2Var, "StartupChecksViewModel", "saveDefaultUserRoles() -> endConsentCheck()");
        y0<j> y0Var = this.f44831d;
        if (y0Var == null) {
            s.m("startupChecksLiveData");
            throw null;
        }
        j.f44873f.getClass();
        y0Var.m(j.a.a());
    }

    public final y0 K4(String... strArr) {
        if (strArr.length != 0) {
            String string = Arrays.toString(strArr);
            string.getClass();
            String strConcat = "startChecks() : ".concat(string);
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "StartupChecksViewModel", strConcat);
            this.f44832e = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        if (this.f44831d == null) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var2, "StartupChecksViewModel", "startChecks() creating LiveData");
            this.f44831d = new y0<>();
        }
        ge1.b.T(v1.a(this), null, null, new h(this, null), 3);
        i2.a aVar3 = i2.f36769a;
        a2 a2Var3 = a2.GENERAL;
        aVar3.getClass();
        i2.a.b(a2Var3, "StartupChecksViewModel", "startChecks() returning LiveData");
        y0<j> y0Var = this.f44831d;
        if (y0Var != null) {
            return y0Var;
        }
        s.m("startupChecksLiveData");
        throw null;
    }

    public final void x4(com.garmin.android.apps.connectmobile.userprofile.model.m mVar) {
        mVar.getClass();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "StartupChecksViewModel", "approveDisplayName()");
        y0<j> y0Var = this.f44831d;
        if (y0Var == null) {
            s.m("startupChecksLiveData");
            throw null;
        }
        j.f44873f.getClass();
        y0Var.m(j.a.b());
        ge1.b.T(v1.a(this), null, null, new b(mVar, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008e  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a3 A[LOOP:1: B:33:0x009d->B:35:0x00a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x00af  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00db A[PHI: r13
      0x00db: PHI (r13v10 int) = (r13v5 int), (r13v13 int) binds: [B:46:0x00d7, B:15:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:56:0x0102 A[PHI: r2 r13 r14
      0x0102: PHI (r2v6 java.util.ArrayList) = (r2v4 java.util.ArrayList), (r2v7 java.util.ArrayList) binds: [B:54:0x00ff, B:13:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x0102: PHI (r13v15 int) = (r13v5 int), (r13v22 int) binds: [B:54:0x00ff, B:13:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x0102: PHI (r14v14 java.lang.Object) = (r14v9 java.lang.Object), (r14v1 java.lang.Object) binds: [B:54:0x00ff, B:13:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x0106  */
    /* JADX WARN: Code duplicated, block: B:69:0x0128  */
    /* JADX WARN: Code duplicated, block: B:74:0x0154  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bf, code lost:
    
        if (y4(r13 + 1, r0) == r1) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e6, code lost:
    
        if (F4(r0) == r1) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x011e, code lost:
    
        if (F4(r0) == r1) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x016f, code lost:
    
        if (F4(r0) == r1) goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y4(int i14, v13.c cVar) throws Throwable {
        y yVar;
        List list;
        ArrayList arrayList;
        Iterator it;
        v vVar;
        y0<j> y0Var;
        p2 p2Var;
        Object value;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i15 = yVar.f12451e;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                yVar.f12451e = i15 - Integer.MIN_VALUE;
            } else {
                yVar = new y(this, cVar);
            }
        } else {
            yVar = new y(this, cVar);
        }
        Object objM = yVar.f12449c;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i16 = yVar.f12451e;
        aq1.i iVar = this.f44828a;
        switch (i16) {
            case 0:
                r.b(objM);
                if (i14 <= 3 && iVar.n(true)) {
                    y0<j> y0Var2 = this.f44831d;
                    if (y0Var2 == null) {
                        s.m("startupChecksLiveData");
                        throw null;
                    }
                    j.f44873f.getClass();
                    y0Var2.m(j.a.b());
                    yVar.f12447a = i14;
                    yVar.f12451e = 3;
                    objM = iVar.m(yVar);
                    if (objM != obj) {
                        list = (List) objM;
                        if (list != null) {
                            arrayList = new ArrayList(p13.y.r(list, 10));
                            it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((v) it.next()).f143783a);
                            }
                        } else {
                            arrayList = null;
                        }
                        if (arrayList != null) {
                            yVar.f12448b = null;
                            yVar.f12447a = i14;
                            yVar.f12451e = 4;
                        } else if (!arrayList.isEmpty()) {
                            aq1.z zVar = new aq1.z(null);
                            yVar.f12448b = arrayList;
                            yVar.f12447a = i14;
                            yVar.f12451e = 7;
                            objM = ge1.b.e0(this.f44830c, zVar, yVar);
                            if (objM != obj) {
                                vVar = (v) objM;
                                if (vVar != null || q92.c.a(vVar) || vVar.b()) {
                                    y0Var = this.f44831d;
                                    if (y0Var == null) {
                                        s.m("startupChecksLiveData");
                                        throw null;
                                    }
                                    j.f44873f.getClass();
                                    y0Var.m(new j(j0.SHOW_GRADUATION_SCREEN, null, null, null, null, 30, null));
                                    do {
                                        p2Var = this.f44833f;
                                        value = p2Var.getValue();
                                    } while (!p2Var.b(value, aq1.e.a((aq1.e) value, arrayList, 2)));
                                    return Unit.INSTANCE;
                                }
                                yVar.f12448b = null;
                                yVar.f12447a = i14;
                                yVar.f12451e = 8;
                            }
                        } else {
                            yVar.f12448b = null;
                            yVar.f12447a = i14;
                            yVar.f12451e = 5;
                            if (iVar.g(yVar) != obj) {
                                yVar.f12448b = null;
                                yVar.f12447a = i14;
                                yVar.f12451e = 6;
                            }
                        }
                    }
                    break;
                } else {
                    yVar.f12447a = i14;
                    yVar.f12451e = 1;
                    if (iVar.g(yVar) != obj) {
                        yVar.f12447a = i14;
                        yVar.f12451e = 2;
                    }
                    break;
                }
                return obj;
            case 1:
                i14 = yVar.f12447a;
                r.b(objM);
                yVar.f12447a = i14;
                yVar.f12451e = 2;
                break;
            case 2:
                r.b(objM);
                return Unit.INSTANCE;
            case 3:
                i14 = yVar.f12447a;
                r.b(objM);
                list = (List) objM;
                if (list != null) {
                    arrayList = new ArrayList(p13.y.r(list, 10));
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((v) it.next()).f143783a);
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    if (!arrayList.isEmpty()) {
                        yVar.f12448b = null;
                        yVar.f12447a = i14;
                        yVar.f12451e = 5;
                        if (iVar.g(yVar) != obj) {
                            yVar.f12448b = null;
                            yVar.f12447a = i14;
                            yVar.f12451e = 6;
                        }
                    } else {
                        aq1.z zVar2 = new aq1.z(null);
                        yVar.f12448b = arrayList;
                        yVar.f12447a = i14;
                        yVar.f12451e = 7;
                        objM = ge1.b.e0(this.f44830c, zVar2, yVar);
                        if (objM != obj) {
                            vVar = (v) objM;
                            if (vVar != null) {
                                break;
                            }
                            y0Var = this.f44831d;
                            if (y0Var == null) {
                                s.m("startupChecksLiveData");
                                throw null;
                            }
                            j.f44873f.getClass();
                            y0Var.m(new j(j0.SHOW_GRADUATION_SCREEN, null, null, null, null, 30, null));
                            do {
                                p2Var = this.f44833f;
                                value = p2Var.getValue();
                            } while (!p2Var.b(value, aq1.e.a((aq1.e) value, arrayList, 2)));
                            return Unit.INSTANCE;
                        }
                    }
                    break;
                } else {
                    yVar.f12448b = null;
                    yVar.f12447a = i14;
                    yVar.f12451e = 4;
                    break;
                }
                return obj;
            case 4:
                r.b(objM);
                return Unit.INSTANCE;
            case 5:
                i14 = yVar.f12447a;
                r.b(objM);
                yVar.f12448b = null;
                yVar.f12447a = i14;
                yVar.f12451e = 6;
                break;
            case 6:
                r.b(objM);
                return Unit.INSTANCE;
            case 7:
                i14 = yVar.f12447a;
                arrayList = yVar.f12448b;
                r.b(objM);
                vVar = (v) objM;
                if (vVar != null) {
                    break;
                }
                y0Var = this.f44831d;
                if (y0Var == null) {
                    s.m("startupChecksLiveData");
                    throw null;
                }
                j.f44873f.getClass();
                y0Var.m(new j(j0.SHOW_GRADUATION_SCREEN, null, null, null, null, 30, null));
                do {
                    p2Var = this.f44833f;
                    value = p2Var.getValue();
                } while (!p2Var.b(value, aq1.e.a((aq1.e) value, arrayList, 2)));
                return Unit.INSTANCE;
            case 8:
                r.b(objM);
                return Unit.INSTANCE;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public final void z4(String str, String str2) {
        String strG = e0.g("confirmUserLocation(", str, " , ", str2, ")");
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "StartupChecksViewModel", strG);
        y0<j> y0Var = this.f44831d;
        if (y0Var == null) {
            s.m("startupChecksLiveData");
            throw null;
        }
        j.f44873f.getClass();
        y0Var.m(j.a.b());
        ge1.b.T(v1.a(this), null, null, new c(str, str2, null), 3);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/startup/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "RETRY_GRADUATIONS_COUNT", "I", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e(aq1.i iVar, pu.h hVar, z zVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 4) != 0) {
            x53.c cVar = o53.s0.f129406a;
            zVar = x53.b.f189152a;
        }
        this(iVar, hVar, zVar);
    }
}
