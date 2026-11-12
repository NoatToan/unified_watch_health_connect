package i3;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class jg implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u1.d2 f88608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f88609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f88610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f88611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f88612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f88613f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.q<lf, p3.m, Integer, Unit> f88614g;

    /* JADX WARN: Multi-variable type inference failed */
    public jg(u1.d2 d2Var, e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2, float f14, float f15, int i14, e23.q<? super lf, ? super p3.m, ? super Integer, Unit> qVar) {
        this.f88608a = d2Var;
        this.f88609b = pVar;
        this.f88610c = pVar2;
        this.f88611d = f14;
        this.f88612e = f15;
        this.f88613f = i14;
        this.f88614g = qVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        h5.g.a.b bVar;
        Object hgVar;
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = mVar2.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.l0.j(t13.h.f161748a, mVar2);
                mVar2.K(objQ);
            }
            o53.b0 b0Var = (o53.b0) objQ;
            n3.h0 h0Var = n3.h0.DefaultSpatial;
            s1.f0 f0VarB = k9.b(h0Var, mVar2);
            s1.f0 f0VarB2 = k9.b(h0Var, mVar2);
            u1.d2 d2Var = this.f88608a;
            boolean zB = mVar2.B(d2Var) | mVar2.B(b0Var);
            Object objQ2 = mVar2.q();
            if (zB || objQ2 == c2565a) {
                objQ2 = new nb(d2Var, b0Var, f0VarB);
                mVar2.K(objQ2);
            }
            nb nbVar = (nb) objQ2;
            Object objQ3 = mVar2.q();
            if (objQ3 == c2565a) {
                objQ3 = new ig(f0VarB2);
                mVar2.K(objQ3);
            }
            ig igVar = (ig) objQ3;
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81530h;
            h4.r.a aVar = h4.r.S;
            f5.z0 z0VarD = c2.q.d(gVar, false);
            int iP = mVar2.P();
            p3.i2 i2VarX = mVar2.x();
            h4.r rVarC = h4.k.c(aVar, mVar2);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (mVar2.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar2);
            } else {
                mVar2.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            p3.b4.c(eVar, z0VarD, mVar2);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            p3.b4.c(c1623g, i2VarX, mVar2);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iP))) {
                v.h.z(iP, mVar2, iP, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            p3.b4.c(fVar, rVarC, mVar2);
            c2.u uVar = c2.u.f22885a;
            this.f88609b.invoke(mVar2, 0);
            List listK = p13.x.k(this.f88610c, z3.f.c(509386037, new fg(this.f88614g, igVar), mVar2));
            h4.r rVarC2 = l4.k.c(g8.i.Z(u1.a2.b(c2.x2.y(c2.x2.f(aVar, 1.0f), h4.d.a.f81527e, 2), d2Var, false)));
            float f14 = this.f88611d;
            boolean zI = mVar2.i(f14);
            float f15 = this.f88612e;
            boolean zI2 = zI | mVar2.i(f15);
            int i14 = this.f88613f;
            boolean zK = zI2 | mVar2.k(i14) | mVar2.r(nbVar);
            Object objQ4 = mVar2.q();
            if (zK || objQ4 == c2565a) {
                bVar = bVar2;
                hgVar = new hg(f14, f15, igVar, i14, nbVar);
                mVar2.K(hgVar);
            } else {
                hgVar = objQ4;
                bVar = bVar2;
            }
            f5.e1 e1Var = (f5.e1) hgVar;
            z3.e eVarB = f5.k0.b(listK);
            boolean zB2 = mVar2.B(e1Var);
            Object objQ5 = mVar2.q();
            if (zB2 || objQ5 == c2565a) {
                objQ5 = new f5.f1(e1Var);
                mVar2.K(objQ5);
            }
            f5.z0 z0Var = (f5.z0) objQ5;
            int iP2 = mVar2.P();
            p3.i2 i2VarX2 = mVar2.x();
            h4.r rVarC3 = h4.k.c(rVarC2, mVar2);
            if (mVar2.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar2);
            } else {
                mVar2.c();
            }
            p3.b4.c(eVar, z0Var, mVar2);
            p3.b4.c(c1623g, i2VarX2, mVar2);
            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iP2))) {
                v.h.z(iP2, mVar2, iP2, bVar);
            }
            p3.b4.c(fVar, rVarC3, mVar2);
            eVarB.invoke(mVar2, 0);
            mVar2.y();
            mVar2.y();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
