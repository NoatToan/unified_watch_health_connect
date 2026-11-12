package cf1;

import af1.e;
import c2.b0;
import c2.j;
import c2.l;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.q;
import h4.d;
import h4.k;
import h5.e0;
import h5.g;
import h82.r;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import v.h;
import z3.f;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f27016b;

    public /* synthetic */ a(b bVar, int i14) {
        this.f27015a = i14;
        this.f27016b = bVar;
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
        int i14 = this.f27015a;
        b bVar = this.f27016b;
        switch (i14) {
            case 0:
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i15 = b.f27017g;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = n.f135158a;
                    bVar.h(mVar, h82.c.f82429e);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                r rVar = (r) obj;
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i16 = b.f27017g;
                rVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(rVar) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = n.f135158a;
                    int i17 = (iIntValue2 << 3) & 112;
                    rVar.D(R.string.running_economy, mVar2, i17);
                    int i18 = (iIntValue2 << 6) & 896;
                    rVar.l(R.string.running_economy_help_header_description, i18, 2, null, mVar2);
                    rVar.A(R.string.running_economy_help_body1, mVar2, i17);
                    h4.r.a aVar = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarY = l.y(aVar, j92.b.f97899b.f97920e);
                    j.f22691a.getClass();
                    j.k kVar = j.f22694d;
                    d.f81522a.getClass();
                    z zVarA = y.a(kVar, d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC = k.c(rVarY, mVar2);
                    g.V.getClass();
                    e0.a aVar2 = g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar2);
                    } else {
                        mVar2.c();
                    }
                    b4.c(g.a.f81810g, zVarA, mVar2);
                    b4.c(g.a.f81809f, i2VarX, mVar2);
                    g.a.b bVar2 = g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        h.z(iHashCode, mVar2, iHashCode, bVar2);
                    }
                    b4.c(g.a.f81807d, rVarC, mVar2);
                    b0 b0Var = b0.f22601a;
                    e eVar = e.f3078k;
                    int i19 = (h82.c.f82429e << 3) | 6;
                    bVar.g(eVar, mVar2, i19);
                    bVar.g(e.f3077j, mVar2, i19);
                    bVar.g(e.f3076i, mVar2, i19);
                    bVar.g(e.f3075h, mVar2, i19);
                    bVar.g(e.f3074g, mVar2, i19);
                    bVar.g(e.f3073f, mVar2, i19);
                    bVar.g(e.f3072e, mVar2, i19);
                    mVar2.y();
                    rVar.A(R.string.running_economy_help_body2, mVar2, i17);
                    rVar.t(R.string.running_economy_help_section1_title, mVar2, i17);
                    rVar.o(R.string.running_economy_help_section1_body, i18, 2, null, mVar2);
                    rVar.t(R.string.running_economy_help_section2_title, mVar2, i17);
                    rVar.o(R.string.running_economy_help_section2_body1, i18, 2, null, mVar2);
                    rVar.o(R.string.running_economy_help_section2_body2, i18, 2, null, mVar2);
                    rVar.g(f.c(-1812429376, new a42.l(rVar, 11), mVar2), mVar2, i17 | 6);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
