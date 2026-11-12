package aq1;

import android.util.Pair;
import c22.s3;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import lc.u0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Laq1/j;", "Laq1/i;", "Lcom/garmin/android/apps/connectmobile/f0;", "La20/a;", "consentAPI", "Lf12/l;", "userSettings", "<init>", "(La20/a;Lf12/l;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j implements i, com.garmin.android.apps.connectmobile.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a20.a f12387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f12.l f12388b;

    static {
        new a(null);
    }

    public j(a20.a aVar, f12.l lVar) {
        aVar.getClass();
        lVar.getClass();
        this.f12387a = aVar;
        this.f12388b = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // aq1.i
    public final Object a(v13.c cVar) {
        p pVar;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i14 = pVar.f12419c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                pVar.f12419c = i14 - Integer.MIN_VALUE;
            } else {
                pVar = new p(this, cVar);
            }
        } else {
            pVar = new p(this, cVar);
        }
        Object objJ = pVar.f12417a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = pVar.f12419c;
        if (i15 == 0) {
            o13.r.b(objJ);
            q qVar = new q(this, null);
            pVar.f12419c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, qVar, pVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            String strF = b71.i.f("GET USER LOCATION -> server call failed ", v2Var);
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "StartupChecksRepository", strF);
            return v2Var;
        }
        d20.c cVar2 = (d20.c) ((v2.b) v2Var).f47386a;
        String str = cVar2.com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE java.lang.String;
        if (str == null || d53.w.J(str)) {
            cVar2.com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE java.lang.String = c22.b0.c();
        }
        String str2 = cVar2.com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE java.lang.String;
        if (str2 == null) {
            str2 = "";
        }
        f12.l lVar = this.f12388b;
        lVar.M1(str2);
        lVar.f4(cVar2.getIsCountryCodeVerified());
        return v2Var;
    }

    @Override // aq1.i
    public final boolean b() {
        String str;
        Pair<String, Long> pairU0 = this.f12388b.U0();
        if (pairU0 == null || (str = (String) pairU0.first) == null) {
            return false;
        }
        p92.o oVar = p92.o.f136619a;
        q92.x xVar = q92.x.DI_CONNECT_PRIVACY;
        oVar.getClass();
        q92.v vVarN = p92.o.n(xVar);
        try {
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            aq1.a aVarValueOf = aq1.a.valueOf(upperCase);
            aVarValueOf.getClass();
            return aVarValueOf.a(vVarN);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // aq1.i
    public final Object c(com.garmin.android.apps.connectmobile.startup.f fVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new n(this, null), fVar);
    }

    @Override // aq1.i
    public final boolean d() {
        String str;
        Pair<String, Long> pairU0 = this.f12388b.U0();
        if (pairU0 == null || (str = (String) pairU0.first) == null) {
            return false;
        }
        p92.o oVar = p92.o.f136619a;
        q92.x xVar = q92.x.DI_CONNECT_PRIVACY;
        oVar.getClass();
        q92.v vVarN = p92.o.n(xVar);
        if (vVarN == null) {
            return false;
        }
        try {
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            aq1.a aVarValueOf = aq1.a.valueOf(upperCase);
            aVarValueOf.getClass();
            return aVarValueOf.b(vVarN);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // aq1.i
    public final Object f(b0 b0Var) {
        x53.c cVar = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new o(null), b0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // aq1.i
    public final Object g(v13.c cVar) {
        s sVar;
        int i14;
        Iterator it;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i15 = sVar.f12430e;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                sVar.f12430e = i15 - Integer.MIN_VALUE;
            } else {
                sVar = new s(this, cVar);
            }
        } else {
            sVar = new s(this, cVar);
        }
        Object obj = sVar.f12428c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = sVar.f12430e;
        if (i16 == 0) {
            o13.r.b(obj);
            i14 = 0;
            it = r().iterator();
        } else {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i14 = sVar.f12427b;
            it = sVar.f12426a;
            o13.r.b(obj);
        }
        while (it.hasNext()) {
            q92.x xVar = (q92.x) it.next();
            p92.o oVar = p92.o.f136619a;
            oVar.getClass();
            q92.v vVarN = p92.o.n(xVar);
            if (vVarN != null && q92.c.a(vVarN)) {
                sVar.getClass();
                sVar.f12426a = it;
                sVar.f12427b = i14;
                sVar.f12430e = 1;
                if (oVar.c(xVar, sVar) == aVar) {
                    return aVar;
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // aq1.i
    public final Object h(com.garmin.android.apps.connectmobile.userprofile.model.m mVar, com.garmin.android.apps.connectmobile.startup.e.b bVar) {
        x53.c cVar = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new t(mVar, null), bVar);
    }

    @Override // aq1.i
    public final boolean i() {
        if (k1.f37122a.r()) {
            return false;
        }
        f12.l lVar = this.f12388b;
        return !lVar.A1() || lVar.U0() == null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // aq1.i
    public final Object j(String str, v13.c cVar) {
        u uVar;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i14 = uVar.f12437d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                uVar.f12437d = i14 - Integer.MIN_VALUE;
            } else {
                uVar = new u(this, cVar);
            }
        } else {
            uVar = new u(this, cVar);
        }
        Object objJ = uVar.f12435b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = uVar.f12437d;
        if (i15 == 0) {
            o13.r.b(objJ);
            v vVar = new v(str, this, null);
            uVar.f12434a = str;
            uVar.f12437d = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, vVar, uVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = uVar.f12434a;
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            f12.l lVar = this.f12388b;
            lVar.f4(true);
            lVar.M1(str);
            return v2Var;
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        String strF = b71.i.f("UPDATE USER LOCATION -> server call failed ", v2Var);
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.f(a2Var, "StartupChecksRepository", strF);
        return v2Var;
    }

    @Override // aq1.i
    public final Object k(s92.g gVar, com.garmin.android.apps.connectmobile.startup.e.d dVar) {
        x53.c cVar = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new r(gVar, null), dVar);
    }

    @Override // aq1.i
    public final Object l(a0 a0Var) {
        x53.c cVar = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new m(this, null), a0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // aq1.i
    public final Object m(v13.c cVar) throws Throwable {
        l lVar;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f12409c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f12409c = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object objE = lVar.f12407a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f12409c;
        if (i15 == 0) {
            o13.r.b(objE);
            dq1.d.f60719j.getClass();
            dq1.d dVar = (dq1.d) dq1.d.f60720k.getValue();
            lVar.f12409c = 1;
            objE = dVar.e(lVar);
            if (objE == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE);
        }
        List list = (List) objE;
        List<q92.x> listR = r();
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            q92.v vVar = (q92.v) obj;
            if (listR.contains(vVar.f143783a) && q92.c.a(vVar)) {
                arrayList.add(obj);
            }
        }
        return p13.h0.N0(arrayList, new k(listR));
    }

    @Override // aq1.i
    public final boolean n(boolean z14) {
        if (s3.b()) {
            return false;
        }
        s3.f23252a.getClass();
        if (s3.a("ROLE_USER_MANAGED_ACCOUNTS_ADMIN") || !k1.f37122a.r()) {
            return false;
        }
        p92.o oVar = p92.o.f136619a;
        q92.x xVar = q92.x.DI_CONNECT_UPLOAD;
        oVar.getClass();
        q92.v vVarN = p92.o.n(xVar);
        if (vVarN != null && !q92.c.a(vVarN) && !vVarN.b()) {
            return false;
        }
        List<q92.x> listR = r();
        if (listR != null && listR.isEmpty()) {
            return false;
        }
        for (q92.x xVar2 : listR) {
            p92.o.f136619a.getClass();
            q92.v vVarN2 = p92.o.n(xVar2);
            if ((z14 && vVarN2 == null) || (vVarN2 != null && q92.c.a(vVarN2))) {
                return true;
            }
        }
        return false;
    }

    @Override // aq1.i
    public final boolean o() {
        return !this.f12388b.P0();
    }

    @Override // aq1.i
    public final boolean q() {
        return !this.f12388b.J4();
    }

    public final List<q92.x> r() {
        ArrayList arrayListM = p13.x.m(q92.x.DI_CONNECT_UPLOAD, q92.x.DI_CONNECT_ADAPTIVE_TRAINING_PLAN, q92.x.DI_CONNECT_LIVETRACK, q92.x.DI_CONNECT_INSIGHTS, q92.x.DI_CONNECT_PRODUCT_IMPROVEMENT_DATA_USAGE, q92.x.DI_CONNECT_AUTO_ACTIVITY_DETECTION);
        if (b()) {
            arrayListM.add(0, q92.x.DI_CONNECT_PRIVACY);
        }
        return p13.h0.b1(arrayListM);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Laq1/j$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
