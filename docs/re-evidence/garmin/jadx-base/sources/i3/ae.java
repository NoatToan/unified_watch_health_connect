package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ae implements e23.q<e23.p<? super p3.m, ? super Integer, ? extends Unit>, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wd f87486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wd f87487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n6<wd> f87488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f87489d;

    public ae(wd wdVar, wd wdVar2, n6<wd> n6Var, String str) {
        this.f87486a = wdVar;
        this.f87487b = wdVar2;
        this.f87488c = n6Var;
        this.f87489d = str;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Unit invoke(e23.p<? super p3.m, ? super Integer, ? extends Unit> pVar, p3.m mVar, Integer num) {
        s1.b bVar;
        Boolean bool;
        e23.p<? super p3.m, ? super Integer, ? extends Unit> pVar2 = pVar;
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar2.r(pVar2) ? 4 : 2;
        }
        if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            wd wdVar = this.f87487b;
            wd wdVar2 = this.f87486a;
            boolean zG = p005kotlin.jvm.internal.s.g(wdVar2, wdVar);
            s1.f0 f0VarB = k9.b(n3.h0.FastEffects, mVar2);
            boolean zB = mVar2.B(wdVar2);
            n6<wd> n6Var = this.f87488c;
            boolean zR = zB | mVar2.r(n6Var);
            Object objQ = mVar2.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zR) {
                objQ = new gp.f(27, wdVar2, n6Var);
                mVar2.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new gp.f(27, wdVar2, n6Var);
                    mVar2.K(objQ);
                }
            }
            e23.a aVar2 = (e23.a) objQ;
            Object objQ2 = mVar2.q();
            aVar.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = s1.d.a(!zG ? 1.0f : 0.0f, 0.01f);
                mVar2.K(objQ2);
            }
            s1.b bVar2 = (s1.b) objQ2;
            Boolean boolValueOf = Boolean.valueOf(zG);
            boolean zR2 = mVar2.r(bVar2) | mVar2.h(zG) | mVar2.r(f0VarB) | mVar2.B(aVar2);
            Object objQ3 = mVar2.q();
            if (zR2 || objQ3 == c2565a) {
                bVar = bVar2;
                bool = boolValueOf;
                de deVar = new de(bVar, zG, f0VarB, aVar2, null);
                mVar2.K(deVar);
                objQ3 = deVar;
            } else {
                bVar = bVar2;
                bool = boolValueOf;
            }
            p3.l0.e((e23.p) objQ3, bool, mVar2);
            s1.m<T, V> mVar3 = bVar.f155489c;
            s1.f0 f0VarB2 = k9.b(n3.h0.FastSpatial, mVar2);
            Object objQ4 = mVar2.q();
            if (objQ4 == c2565a) {
                objQ4 = s1.d.a(zG ? 0.8f : 1.0f, 0.01f);
                mVar2.K(objQ4);
            }
            s1.b bVar3 = (s1.b) objQ4;
            Boolean boolValueOf2 = Boolean.valueOf(zG);
            boolean zR3 = mVar2.r(bVar3) | mVar2.h(zG) | mVar2.r(f0VarB2);
            Object objQ5 = mVar2.q();
            if (zR3 || objQ5 == c2565a) {
                objQ5 = new ee(bVar3, zG, f0VarB2, null);
                mVar2.K(objQ5);
            }
            p3.l0.e((e23.p) objQ5, boolValueOf2, mVar2);
            s1.m<T, V> mVar4 = bVar3.f155489c;
            h4.r rVarB = o4.s0.b(h4.r.S, ((Number) mVar4.f155628b.getF182175a()).floatValue(), ((Number) mVar4.f155628b.getF182175a()).floatValue(), ((Number) mVar3.f155628b.getF182175a()).floatValue(), 0.0f, null, 131064);
            boolean zH = mVar2.h(zG) | mVar2.B(wdVar2);
            String str = this.f87489d;
            boolean zB2 = zH | mVar2.B(str);
            Object objQ6 = mVar2.q();
            if (zB2 || objQ6 == c2565a) {
                objQ6 = new ad0.f(zG, str, wdVar2, 11);
                mVar2.K(objQ6);
            }
            h4.r rVarC = p5.v.c((e23.l) objQ6, rVarB, false);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iP = mVar2.P();
            p3.i2 i2VarX = mVar2.x();
            h4.r rVarC2 = h4.k.c(rVarC, mVar2);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (mVar2.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar3);
            } else {
                mVar2.c();
            }
            p3.b4.c(h5.g.a.f81810g, z0VarD, mVar2);
            p3.b4.c(h5.g.a.f81809f, i2VarX, mVar2);
            h5.g.a.b bVar4 = h5.g.a.f81813j;
            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iP))) {
                v.h.z(iP, mVar2, iP, bVar4);
            }
            p3.b4.c(h5.g.a.f81807d, rVarC2, mVar2);
            c2.u uVar = c2.u.f22885a;
            v.h.B(pVar2, mVar2, iIntValue & 14);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
