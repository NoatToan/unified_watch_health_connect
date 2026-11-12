package sa0;

import b82.t0;
import c2.a0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import i3.mh;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;
import rk0.w;
import x5.e0;
import x5.l0;
import x5.r0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158177a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f158178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f158179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f158180d;

    public /* synthetic */ e(String str, p1 p1Var, p1 p1Var2) {
        this.f158179c = str;
        this.f158178b = p1Var;
        this.f158180d = p1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        r0 e0Var;
        p3.m mVar;
        int i14 = this.f158177a;
        p1 p1Var = this.f158180d;
        p1 p1Var2 = this.f158178b;
        switch (i14) {
            case 0:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.h(aVar, j92.b.f97899b.f97920e), mVar2);
                    t0 t0Var = t0.f16792a;
                    String str = (String) p1Var2.getF182175a();
                    String strQ = y.Q(mVar2, R.string.wifi_password);
                    boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                    String str2 = ((Boolean) p1Var.getF182175a()).booleanValue() ? "Show sensitive text" : "Hide sensitive text";
                    Object objQ = mVar2.q();
                    p3.m.f135153a.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new w(p1Var, 25);
                        mVar2.K(objQ);
                    }
                    t0Var.getClass();
                    z3.e eVarN = t0.n(zBooleanValue, str2, (e23.a) objQ, mVar2);
                    if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                        e0Var = new e0((char) 0, 1, null);
                    } else {
                        r0.f188941a.getClass();
                        e0Var = r0.a.f188943b;
                    }
                    r0 r0Var = e0Var;
                    Object objQ2 = mVar2.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new pp.b(p1Var2, 25);
                        mVar2.K(objQ2);
                    }
                    t0Var.e(str, null, strQ, this.f158179c, null, false, false, null, null, eVarN, 0, 0L, 0L, r0Var, null, (e23.l) objQ2, mVar2, 0, 196608, 24050);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            default:
                e23.p pVar = (e23.p) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                pVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar3.r(pVar) ? 4 : 2;
                }
                int i15 = iIntValue2;
                if (mVar3.n(i15 & 1, (i15 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.C0343j c0343j = c2.j.f22692b;
                    h4.d.f81522a.getClass();
                    s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, mVar3, 0);
                    int iHashCode = Long.hashCode(mVar3.getU());
                    i2 i2VarX = mVar3.x();
                    h4.r rVarC = h4.k.c(rVarF, mVar3);
                    h5.g.V.getClass();
                    h5.e0.a aVar2 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar2);
                    } else {
                        mVar3.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA, mVar3);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar3, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar3);
                    u2 u2Var = u2.f22900a;
                    if (((l0) p1Var2.getF182175a()).f188878a.f157138b.length() != 0 || ((Boolean) p1Var.getF182175a()).booleanValue()) {
                        mVar = mVar3;
                        mVar.C(2076430392);
                        mVar.f();
                    } else {
                        mVar3.C(2076189181);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        mh.c(this.f158179c, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar3), mVar3, 0, 0, 131070);
                        mVar = mVar3;
                        mVar.f();
                    }
                    v.h.B(pVar, mVar, i15 & 14);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ e(p1 p1Var, String str, p1 p1Var2) {
        this.f158178b = p1Var;
        this.f158179c = str;
        this.f158180d = p1Var2;
    }
}
