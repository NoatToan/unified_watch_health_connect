package cg1;

import android.view.KeyEvent;
import android.view.ViewGroup;
import aq.p3;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.segments.presentation.SegmentDetailsActivity;
import gg1.o0;
import i3.e5;
import java.util.ArrayList;
import l72.x0;
import o4.m1;
import p005kotlin.Unit;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.x1;
import qm.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ double f27159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f27160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f27161e;

    public /* synthetic */ l(double d14, double d15, p0 p0Var, ViewGroup viewGroup) {
        this.f27157a = 2;
        this.f27159c = d14;
        this.f27161e = d15;
        this.f27158b = p0Var;
        this.f27160d = viewGroup;
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
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f27157a;
        KeyEvent.Callback callback = this.f27160d;
        Object obj3 = this.f27158b;
        switch (i14) {
            case 0:
                o0 o0Var = (o0) obj3;
                SegmentDetailsActivity segmentDetailsActivity = (SegmentDetailsActivity) callback;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                SegmentDetailsActivity.a aVar = SegmentDetailsActivity.Z;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(402094570, new l(o0Var, this.f27159c, segmentDetailsActivity, this.f27161e, 1), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                o0 o0Var2 = (o0) obj3;
                SegmentDetailsActivity segmentDetailsActivity2 = (SegmentDetailsActivity) callback;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                SegmentDetailsActivity.a aVar2 = SegmentDetailsActivity.Z;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    x0 x0Var = x0.f111346a;
                    g6.f.a aVar3 = g6.f.f75994b;
                    x0Var.e(c2.l.y(h4.r.S, 16), z3.f.c(1756724849, new n(o0Var2, this.f27159c, segmentDetailsActivity2, this.f27161e, 0), mVar2), mVar2, (x0.f111348c << 6) | 54, 0);
                } else {
                    mVar2.e();
                }
                break;
            default:
                final p0 p0Var = (p0) obj3;
                final ViewGroup viewGroup = (ViewGroup) callback;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    p3[] p3VarArrValues = p3.values();
                    ArrayList arrayList = new ArrayList(p3VarArrValues.length);
                    int length = p3VarArrValues.length;
                    for (int iD = 0; iD < length; iD = e5.d(p3VarArrValues[iD].f12159b, iD, arrayList, 1)) {
                    }
                    final i53.f fVarJ = i53.a.j(h0.G0(arrayList));
                    final double d14 = this.f27159c;
                    final double d15 = this.f27161e;
                    z02.b.a(false, null, null, null, false, z3.f.c(-508535986, new e23.p() { // from class: qm.n0
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
                        public final Object invoke(Object obj4, Object obj5) {
                            p3.m mVar4 = (p3.m) obj4;
                            int iIntValue4 = ((Integer) obj5).intValue();
                            if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                x1 x1Var4 = p3.n.f135158a;
                                h4.r.a aVar4 = h4.r.S;
                                Object objQ = mVar4.q();
                                p3.m.f135153a.getClass();
                                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                                if (objQ == c2565a) {
                                    objQ = new qc.c(17);
                                    mVar4.K(objQ);
                                }
                                h4.r rVarC = p5.v.c((e23.l) objQ, aVar4, true);
                                float f14 = 8;
                                g6.f.a aVar5 = g6.f.f75994b;
                                h4.r rVarE = u1.n.e(c2.l.C(rVarC, f14, 0.0f, f14, 0.0f, 10), vb.h.e(d92.b.f58623a, mVar4), m1.f128891a);
                                c2.j.f22691a.getClass();
                                c2.j.k kVar = c2.j.f22694d;
                                h4.d.f81522a.getClass();
                                h4.g.a aVar6 = h4.d.a.f81536n;
                                c2.z zVarA = c2.y.a(kVar, aVar6, mVar4, 0);
                                int iHashCode = Long.hashCode(mVar4.getU());
                                i2 i2VarX = mVar4.x();
                                h4.r rVarC2 = h4.k.c(rVarE, mVar4);
                                h5.g.V.getClass();
                                h5.e0.a aVar7 = h5.g.a.f81805b;
                                if (mVar4.F() == null) {
                                    p3.p0.l();
                                    throw null;
                                }
                                mVar4.z();
                                if (mVar4.getT()) {
                                    mVar4.M(aVar7);
                                } else {
                                    mVar4.c();
                                }
                                h5.g.a.e eVar = h5.g.a.f81810g;
                                b4.c(eVar, zVarA, mVar4);
                                h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                                b4.c(c1623g, i2VarX, mVar4);
                                h5.g.a.b bVar = h5.g.a.f81813j;
                                if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode))) {
                                    v.h.z(iHashCode, mVar4, iHashCode, bVar);
                                }
                                h5.g.a.f fVar = h5.g.a.f81807d;
                                b4.c(fVar, rVarC2, mVar4);
                                c2.b0 b0Var = c2.b0.f22601a;
                                Object objQ2 = mVar4.q();
                                if (objQ2 == c2565a) {
                                    o4.d0.f128823b.getClass();
                                    objQ2 = p3.p0.n(o4.d0.a(o4.d0.f128831j));
                                    mVar4.K(objQ2);
                                }
                                p1 p1Var = (p1) objQ2;
                                Object objQ3 = mVar4.q();
                                if (objQ3 == c2565a) {
                                    o4.d0.f128823b.getClass();
                                    objQ3 = p3.p0.n(o4.d0.a(o4.d0.f128831j));
                                    mVar4.K(objQ3);
                                }
                                p1 p1Var2 = (p1) objQ3;
                                x0 x0Var2 = x0.f111346a;
                                h4.r rVarC3 = c2.l.C(aVar4, f14, 0.0f, f14, 0.0f, 10);
                                double d16 = d14;
                                double d17 = d15;
                                x0Var2.e(rVarC3, z3.f.c(-1336839331, new cg1.n(d16, p1Var2, d17, p1Var), mVar4), mVar4, (x0.f111348c << 6) | 54, 0);
                                float f15 = 16;
                                c2.l.f(x2.h(aVar4, f15), mVar4);
                                h4.r rVarF = x2.f(aVar4, 1.0f);
                                Object objQ4 = mVar4.q();
                                if (objQ4 == c2565a) {
                                    objQ4 = new qc.c(18);
                                    mVar4.K(objQ4);
                                }
                                h4.r rVarB = p5.v.b(rVarF, (e23.l) objQ4);
                                c2.z zVarA2 = c2.y.a(c2.j.i(f14), aVar6, mVar4, 6);
                                int iHashCode2 = Long.hashCode(mVar4.getU());
                                i2 i2VarX2 = mVar4.x();
                                h4.r rVarC4 = h4.k.c(rVarB, mVar4);
                                if (mVar4.F() == null) {
                                    p3.p0.l();
                                    throw null;
                                }
                                mVar4.z();
                                if (mVar4.getT()) {
                                    mVar4.M(aVar7);
                                } else {
                                    mVar4.c();
                                }
                                b4.c(eVar, zVarA2, mVar4);
                                b4.c(c1623g, i2VarX2, mVar4);
                                if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                    v.h.z(iHashCode2, mVar4, iHashCode2, bVar);
                                }
                                b4.c(fVar, rVarC4, mVar4);
                                final p0 p0Var2 = p0Var;
                                boolean zR = mVar4.r(p0Var2);
                                final ViewGroup viewGroup2 = viewGroup;
                                boolean zR2 = zR | mVar4.r(viewGroup2);
                                Object objQ5 = mVar4.q();
                                if (zR2 || objQ5 == c2565a) {
                                    final int i15 = 0;
                                    objQ5 = new e23.a() { // from class: qm.o0
                                        @Override // e23.a
                                        public final Object invoke() {
                                            switch (i15) {
                                                case 0:
                                                    p0Var2.f145439e.onClick(viewGroup2);
                                                    break;
                                                default:
                                                    p0Var2.f145439e.onClick(viewGroup2);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar4.K(objQ5);
                                }
                                i53.f fVar2 = fVarJ;
                                cr.a0.a(null, 0, null, R.string.activity_aerobic_label, d16, fVar2, (e23.a) objQ5, p1Var2, mVar4, 12582912);
                                boolean zR3 = mVar4.r(p0Var2) | mVar4.r(viewGroup2);
                                Object objQ6 = mVar4.q();
                                if (zR3 || objQ6 == c2565a) {
                                    final int i16 = 1;
                                    objQ6 = new e23.a() { // from class: qm.o0
                                        @Override // e23.a
                                        public final Object invoke() {
                                            switch (i16) {
                                                case 0:
                                                    p0Var2.f145439e.onClick(viewGroup2);
                                                    break;
                                                default:
                                                    p0Var2.f145439e.onClick(viewGroup2);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar4.K(objQ6);
                                }
                                cr.a0.a(null, 0, null, R.string.activity_anaerobic_label, d17, fVar2, (e23.a) objQ6, p1Var, mVar4, 12582912);
                                mVar4.y();
                                c2.l.f(x2.h(aVar4, f15), mVar4);
                                mVar4.y();
                                c2.l.f(x2.h(aVar4, 24), mVar4);
                            } else {
                                mVar4.e();
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar3), mVar3, 196608, 31);
                    x1 x1Var4 = p3.n.f135158a;
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ l(o0 o0Var, double d14, SegmentDetailsActivity segmentDetailsActivity, double d15, int i14) {
        this.f27157a = i14;
        this.f27158b = o0Var;
        this.f27159c = d14;
        this.f27160d = segmentDetailsActivity;
        this.f27161e = d15;
    }
}
