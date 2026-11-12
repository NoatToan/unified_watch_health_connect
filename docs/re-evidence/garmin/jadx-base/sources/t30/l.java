package t30;

import android.content.Context;
import c2.b0;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import e23.p;
import h4.r;
import h5.e0;
import i3.e5;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.x;
import p3.b4;
import p3.i2;
import p3.n;
import p3.p0;
import p3.x1;
import t21.u;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f162188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m00.a f162189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y30.a f162190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f162191e;

    public /* synthetic */ l(m mVar, m00.a aVar, y30.a aVar2, Context context, int i14) {
        this.f162187a = i14;
        this.f162188b = mVar;
        this.f162189c = aVar;
        this.f162190d = aVar2;
        this.f162191e = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
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
        boolean z14 = false;
        ?? r14 = 1;
        switch (this.f162187a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                m.a aVar = m.f162192o;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-252946358, new l(this.f162188b, this.f162189c, this.f162190d, this.f162191e, 1), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                m.a aVar2 = m.f162192o;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    r.a aVar3 = r.S;
                    float f14 = 8;
                    g6.f.a aVar4 = g6.f.f75994b;
                    r rVarC = c2.l.C(aVar3, 0.0f, f14, 0.0f, 0.0f, 13);
                    float f15 = f14;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    r rVarC2 = h4.k.c(rVarC, mVar2);
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
                    b4.c(h5.g.a.f81810g, zVarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                    b0 b0Var = b0.f22601a;
                    mVar2.C(-2086337405);
                    m mVar3 = this.f162188b;
                    List<ClimbDTO> list = mVar3.f162195m;
                    if (list == null) {
                        s.m("climbs");
                        throw null;
                    }
                    int i14 = 0;
                    for (Object obj3 : list) {
                        int i15 = i14 + 1;
                        if (i14 < 0) {
                            x.q();
                            throw null;
                        }
                        ClimbDTO climbDTO = (ClimbDTO) obj3;
                        Double dValueOf = Double.valueOf(climbDTO.getAvgGrade());
                        m00.a aVar6 = this.f162189c;
                        String strC = aVar6.c(dValueOf);
                        String strA = aVar6.a(Double.valueOf(climbDTO.getElevationGain()), r14);
                        Double dValueOf2 = Double.valueOf(climbDTO.getDistance());
                        String str = aVar6.f115519d;
                        String strB = ss.k.b(ls.e.BIKE_DISTANCE, aVar6.f115517b, dValueOf2, r14);
                        if (strB != null) {
                            str = strB;
                        }
                        r rVarZ = c2.l.z(r.S, 16, f15);
                        com.garmin.android.apps.connectmobile.courses.model.b category = climbDTO.getCategory();
                        y30.a aVar7 = this.f162190d;
                        String strA2 = aVar7.a(category, z14);
                        String strP = gl1.y.P(R.string.string_space_dot_space_string_space_dot_space_string_space_dot_space_string_pattern, new Object[]{strC, str, strA}, mVar2);
                        String strB2 = aVar7.b(climbDTO.getCategory());
                        Object objQ = mVar2.q();
                        p3.m.f135153a.getClass();
                        p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                        if (objQ == c2565a) {
                            objQ = new u(11);
                            mVar2.K(objQ);
                        }
                        Context context = this.f162191e;
                        float f16 = f15;
                        String strG = e5.g(gl1.y.Q(mVar2, R.string.lbl_distance), ": ", oi0.c.A(context, (e23.l) objQ, str));
                        Object objQ2 = mVar2.q();
                        if (objQ2 == c2565a) {
                            objQ2 = new u(12);
                            mVar2.K(objQ2);
                        }
                        String strH = v.e0.h(e5.l(strB2, ", ", strC, ", ", strG), StringUtils.SPACE, e5.g(gl1.y.Q(mVar2, R.string.activities_ascent_label), ": ", oi0.c.A(context, (e23.l) objQ2, strA)), ".");
                        b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                        c0235a.f16962a.put("merge", strH);
                        b92.a aVarB = c0235a.b();
                        boolean zR = mVar2.r(mVar3) | mVar2.r(climbDTO) | mVar2.k(i14);
                        Object objQ3 = mVar2.q();
                        if (zR || objQ3 == c2565a) {
                            objQ3 = new a83.a(mVar3, climbDTO, i14, 13);
                            mVar2.K(objQ3);
                        }
                        int i16 = b92.a.f16960b;
                        l72.l.d(strA2, strP, null, rVarZ, aVarB, false, (e23.a) objQ3, mVar2, 0, 36);
                        f15 = f16;
                        i14 = i15;
                        z14 = false;
                        r14 = 1;
                    }
                    mVar2.f();
                    mVar2.y();
                    x1 x1Var3 = n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
