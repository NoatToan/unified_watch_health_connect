package aq;

import com.garmin.android.apps.connectmobile.R;
import com.google.mlkit.common.MlKitException;
import i3.mh;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class w2 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y2 f12284b;

    public /* synthetic */ w2(y2 y2Var, int i14) {
        this.f12283a = i14;
        this.f12284b = y2Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f12283a;
        y2 y2Var = this.f12284b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i15 = y2.f12312f;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    y2Var.h(mVar, h82.c.f82429e);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                h82.r rVar = (h82.r) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i16 = y2.f12312f;
                rVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(rVar) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    int i17 = (iIntValue2 << 3) & 112;
                    rVar.D(R.string.lbl_crosscountry_skiing_cadence, mVar2, i17);
                    int i18 = (iIntValue2 << 6) & 896;
                    rVar.l(R.string.lbl_crosscountry_skiing_cadence_body, i18, 2, null, mVar2);
                    rVar.t(R.string.lbl_crosscountry_skiing_cadence_zones, mVar2, i17);
                    rVar.o(R.string.lbl_crosscountry_skiing_cadence_zones_body, i18, 2, null, mVar2);
                    h4.r.a aVar = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97922g;
                    float f15 = eVar.f97918c;
                    h4.r rVarC = c2.l.C(aVar, f14, eVar.f97920e, 0.0f, 0.0f, 12);
                    c2.j.f22691a.getClass();
                    c2.j.C0343j c0343j = c2.j.f22692b;
                    h4.d.f81522a.getClass();
                    c2.s2 s2VarA = c2.q2.a(c0343j, h4.d.a.f81533k, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    p3.i2 i2VarX = mVar2.x();
                    h4.r rVarC2 = h4.k.c(rVarC, mVar2);
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
                    h5.g.a.e eVar2 = h5.g.a.f81810g;
                    b4.c(eVar2, s2VarA, mVar2);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC2, mVar2);
                    c2.u2 u2Var = c2.u2.f22900a;
                    c2.z zVarA = c2.y.a(c2.j.i(f15), h4.d.a.f81537o, mVar2, 48);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    p3.i2 i2VarX2 = mVar2.x();
                    h4.r rVarC3 = h4.k.c(aVar, mVar2);
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
                    b4.c(eVar2, zVarA, mVar2);
                    b4.c(c1623g, i2VarX2, mVar2);
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC3, mVar2);
                    c2.b0 b0Var = c2.b0.f22601a;
                    String strQ = gl1.y.Q(mVar2, R.string.lbl_zone);
                    j92.f.f97924a.getClass();
                    s5.x0 x0Var = j92.f.f97932i;
                    mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar2), mVar2, 0, 0, 131070);
                    long jC = o4.f0.c(229, 0, 225);
                    int i19 = (h82.c.f82429e << 3) | 6;
                    y2Var.g(jC, mVar2, i19);
                    y2Var.g(o4.f0.c(33, 101, MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE), mVar2, i19);
                    y2Var.g(o4.f0.c(78, 185, 0), mVar2, i19);
                    y2Var.g(o4.f0.c(254, 163, 0), mVar2, i19);
                    y2Var.g(o4.f0.c(254, 0, 61), mVar2, i19);
                    mVar2.y();
                    h4.r rVarA = u2Var.a(c2.l.C(aVar, eVar.f97920e, 0.0f, 0.0f, 0.0f, 14), 1.0f, true);
                    c2.z zVarA2 = c2.y.a(c2.j.i(f15), h4.d.a.f81536n, mVar2, 48);
                    int iHashCode3 = Long.hashCode(mVar2.getU());
                    p3.i2 i2VarX3 = mVar2.x();
                    h4.r rVarC4 = h4.k.c(rVarA, mVar2);
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
                    b4.c(eVar2, zVarA2, mVar2);
                    b4.c(c1623g, i2VarX3, mVar2);
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar2, iHashCode3, bVar);
                    }
                    b4.c(fVar, rVarC4, mVar2);
                    mh.c(gl1.y.Q(mVar2, R.string.lbl_crosscountry_skiing_cadence_range), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar2), mVar2, 0, 0, 131070);
                    mh.c(gl1.y.Q(mVar2, R.string.ski_cadence_help_zone1), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar2), mVar2, 0, 0, 131070);
                    mh.c(gl1.y.P(R.string.string_short_dash_line_string_pattern, new Object[]{90, 119}, mVar2), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar2), mVar2, 0, 0, 131070);
                    mh.c(gl1.y.P(R.string.string_short_dash_line_string_pattern, new Object[]{60, 89}, mVar2), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar2), mVar2, 0, 0, 131070);
                    mh.c(gl1.y.P(R.string.string_short_dash_line_string_pattern, new Object[]{30, 59}, mVar2), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar2), mVar2, 0, 0, 131070);
                    mh.c(gl1.y.P(R.string.string_short_dash_line_string_pattern, new Object[]{0, 29}, mVar2), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar2), mVar2, 0, 0, 131070);
                    mVar2.y();
                    mVar2.y();
                    rVar.t(R.string.lbl_crosscountry_skiing_cadence_importance, mVar2, i17);
                    rVar.o(R.string.lbl_crosscountry_skiing_cadence_importance_body, i18, 2, null, mVar2);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
