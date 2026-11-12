package kb0;

import android.content.Context;
import b63.v;
import c2.a0;
import c2.b0;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import l72.p2;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f103758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f103759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f103760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1 f103761e;

    public /* synthetic */ a(Context context, v vVar, v vVar2, p1 p1Var, int i14) {
        this.f103757a = i14;
        this.f103758b = context;
        this.f103759c = vVar;
        this.f103760d = vVar2;
        this.f103761e = p1Var;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f103757a;
        p3.m.a aVar = p3.m.f135153a;
        p1 p1Var = this.f103761e;
        v vVar = this.f103760d;
        v vVar2 = this.f103759c;
        Context context = this.f103758b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar2 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar, 0);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(aVar2, mVar);
                    h5.g.V.getClass();
                    e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar3);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    b0 b0Var = b0.f22601a;
                    p2 p2Var = p2.f111205a;
                    String strQ = gl1.y.Q(mVar, R.string.sleep_lbl_bedtime);
                    String strA = s.a(context, vVar2);
                    e.f103768a.getClass();
                    z3.e eVar = e.f103769b;
                    Object objQ = mVar.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new jt1.h(p1Var, 27);
                        mVar.K(objQ);
                    }
                    p2Var.h(strQ, strA, null, aVar2, null, false, false, eVar, null, null, (e23.a) objQ, mVar, 12585984, 6, 884);
                    String strQ2 = gl1.y.Q(mVar, R.string.sleep_lbl_wake_time);
                    String strA2 = s.a(context, vVar);
                    z3.e eVar2 = e.f103770c;
                    Object objQ2 = mVar.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new jt1.h(p1Var, 28);
                        mVar.K(objQ2);
                    }
                    p2Var.h(strQ2, strA2, null, null, null, false, false, eVar2, null, null, (e23.a) objQ2, mVar, 12582912, 6, 892);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar4 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA2 = y.a(kVar2, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    i2 i2VarX2 = mVar2.x();
                    h4.r rVarC2 = h4.k.c(aVar4, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar5 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar5);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar2);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                    b0 b0Var2 = b0.f22601a;
                    p2 p2Var2 = p2.f111205a;
                    String strQ3 = gl1.y.Q(mVar2, R.string.sleep_lbl_bedtime);
                    String strA3 = s.a(context, vVar2);
                    h.f103777a.getClass();
                    z3.e eVar3 = h.f103778b;
                    Object objQ3 = mVar2.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    if (objQ3 == c2565a2) {
                        objQ3 = new k(p1Var, 3);
                        mVar2.K(objQ3);
                    }
                    p2Var2.h(strQ3, strA3, null, aVar4, null, false, false, eVar3, null, null, (e23.a) objQ3, mVar2, 12585984, 6, 884);
                    String strQ4 = gl1.y.Q(mVar2, R.string.sleep_lbl_wake_time);
                    String strA4 = s.a(context, vVar);
                    z3.e eVar4 = h.f103779c;
                    Object objQ4 = mVar2.q();
                    if (objQ4 == c2565a2) {
                        objQ4 = new k(p1Var, 4);
                        mVar2.K(objQ4);
                    }
                    p2Var2.h(strQ4, strA4, null, null, null, false, false, eVar4, null, null, (e23.a) objQ4, mVar2, 12582912, 6, 892);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = p3.n.f135158a;
                    h4.r.a aVar6 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar3 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA3 = y.a(kVar3, h4.d.a.f81536n, mVar3, 0);
                    int iHashCode3 = Long.hashCode(mVar3.getU());
                    i2 i2VarX3 = mVar3.x();
                    h4.r rVarC3 = h4.k.c(aVar6, mVar3);
                    h5.g.V.getClass();
                    e0.a aVar7 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar7);
                    } else {
                        mVar3.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA3, mVar3);
                    b4.c(h5.g.a.f81809f, i2VarX3, mVar3);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar3, iHashCode3, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, mVar3);
                    b0 b0Var3 = b0.f22601a;
                    p2 p2Var3 = p2.f111205a;
                    String strQ5 = gl1.y.Q(mVar3, R.string.sleep_lbl_bedtime);
                    String strA5 = s.a(context, vVar2);
                    i.f103781a.getClass();
                    z3.e eVar5 = i.f103782b;
                    Object objQ5 = mVar3.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a3 = p3.m.a.f135155b;
                    if (objQ5 == c2565a3) {
                        objQ5 = new k(p1Var, 6);
                        mVar3.K(objQ5);
                    }
                    p2Var3.h(strQ5, strA5, null, aVar6, null, false, false, eVar5, null, null, (e23.a) objQ5, mVar3, 12585984, 6, 884);
                    String strQ6 = gl1.y.Q(mVar3, R.string.sleep_lbl_wake_time);
                    String strA6 = s.a(context, vVar);
                    z3.e eVar6 = i.f103783c;
                    Object objQ6 = mVar3.q();
                    if (objQ6 == c2565a3) {
                        objQ6 = new k(p1Var, 7);
                        mVar3.K(objQ6);
                    }
                    p2Var3.h(strQ6, strA6, null, null, null, false, false, eVar6, null, null, (e23.a) objQ6, mVar3, 12582912, 6, 892);
                    mVar3.y();
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
        }
    }
}
