package n12;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.x1;
import u1.y0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class x implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.userprofile.editimage.c f122344b;

    public /* synthetic */ x(com.garmin.android.apps.connectmobile.userprofile.editimage.c cVar, int i14) {
        this.f122343a = i14;
        this.f122344b = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        float f14;
        float f15;
        int i14;
        int i15 = this.f122343a;
        com.garmin.android.apps.connectmobile.userprofile.editimage.c cVar = this.f122344b;
        int i16 = 2;
        int i17 = 1;
        switch (i15) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i18 = com.garmin.android.apps.connectmobile.userprofile.editimage.c.f46657x;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-632113093, new x(cVar, i17), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i19 = com.garmin.android.apps.connectmobile.userprofile.editimage.c.f46657x;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    p1 p1VarC = p3.p0.c(cVar.f46673p, mVar2, 0);
                    p1 p1VarC2 = p3.p0.c(cVar.f46674q, mVar2, 0);
                    p1 p1VarC3 = p3.p0.c(cVar.f46675r, mVar2, 0);
                    p1 p1VarC4 = p3.p0.c(cVar.f46676t, mVar2, 0);
                    p1 p1VarC5 = p3.p0.c(cVar.f46678w, mVar2, 0);
                    float fQ = gl.b.q(mVar2, R.dimen.profile_frame_size);
                    float fQ2 = gl.b.q(mVar2, R.dimen.edit_profile_premium_icon_size);
                    Object objQ = mVar2.q();
                    p3.m.f135153a.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = Double.valueOf(Math.sin(0.7853981633974483d) * ((double) (fQ / 2)) * 0.97d);
                        mVar2.K(objQ);
                    }
                    double dDoubleValue = ((Number) objQ).doubleValue();
                    Object objQ2 = mVar2.q();
                    if (objQ2 == c2565a) {
                        objQ2 = p3.p0.n(Boolean.FALSE);
                        mVar2.K(objQ2);
                    }
                    p1 p1Var = (p1) objQ2;
                    p1 p1VarC6 = p3.p0.c(cVar.f46677v, mVar2, 0);
                    boolean z14 = ((Boolean) p1VarC4.getF182175a()).booleanValue() || ((Boolean) p1VarC5.getF182175a()).booleanValue();
                    if (((Boolean) p1VarC.getF182175a()).booleanValue()) {
                        mVar2.C(-2143529139);
                        T f182175a = p1VarC2.getF182175a();
                        String strQ = gl1.y.Q(mVar2, R.string.image_content_description);
                        h4.r rVarB = l4.k.b(x2.q(h4.r.S, fQ), k2.i.f102406a);
                        z3.e eVarC = z3.f.c(477488759, new d70.e(fQ, p1Var, i16), mVar2);
                        i14 = R.string.image_content_description;
                        f14 = fQ;
                        f15 = fQ2;
                        jf.t.a(f182175a, strQ, rVarB, null, null, eVarC, mVar2, 0, 2040);
                        mVar2 = mVar2;
                        mVar2.f();
                    } else {
                        f14 = fQ;
                        f15 = fQ2;
                        i14 = R.string.image_content_description;
                        mVar2.C(-2142735353);
                        mVar2.f();
                    }
                    T f182175a2 = p1VarC3.getF182175a();
                    String strQ2 = gl1.y.Q(mVar2, i14);
                    h4.r.a aVar = h4.r.S;
                    h4.r rVarB2 = l4.k.b(x2.q(aVar, f14), k2.i.f102406a);
                    Object objQ3 = mVar2.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new md0.f(p1Var, 3);
                        mVar2.K(objQ3);
                    }
                    p3.m mVar3 = mVar2;
                    int i24 = i14;
                    jf.r.b(f182175a2, strQ2, rVarB2, null, null, null, null, (e23.l) objQ3, null, null, null, null, mVar3, 12582912, 0, 32632);
                    if (z14 && (((Boolean) p1Var.getF182175a()).booleanValue() || ((Boolean) p1VarC6.getF182175a()).booleanValue())) {
                        mVar3.C(-2142269857);
                        h4.d.f81522a.getClass();
                        z0 z0VarD = c2.q.d(h4.d.a.f81528f, false);
                        int iHashCode = Long.hashCode(mVar3.getU());
                        i2 i2VarX = mVar3.x();
                        h4.r rVarC = h4.k.c(aVar, mVar3);
                        h5.g.V.getClass();
                        h5.e0.a aVar2 = h5.g.a.f81805b;
                        if (mVar3.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar3.z();
                        if (mVar3.getT()) {
                            mVar3.M(aVar2);
                        } else {
                            mVar3.c();
                        }
                        b4.c(h5.g.a.f81810g, z0VarD, mVar3);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                        h5.g.a.b bVar = h5.g.a.f81813j;
                        if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar3, iHashCode, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, mVar3);
                        c2.u uVar = c2.u.f22885a;
                        t4.d dVarA = n5.c.a(R.drawable.premium_icon, mVar3, 0);
                        String strQ3 = gl1.y.Q(mVar3, i24);
                        h4.r rVarQ = x2.q(aVar, f15);
                        float f16 = (float) dDoubleValue;
                        g6.f.a aVar3 = g6.f.f75994b;
                        y0.a(dVarA, strQ3, c2.l.u(rVarQ, f16, (float) (((double) (-1)) * dDoubleValue)), null, null, 0.0f, null, mVar3, 0, 120);
                        mVar3.y();
                        mVar3.f();
                    } else {
                        mVar3.C(-2141739385);
                        mVar3.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
