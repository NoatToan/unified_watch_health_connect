package ci0;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b21.k0;
import b82.a1;
import b82.t0;
import b82.y1;
import c.q;
import c2.x2;
import c2.y;
import c2.z;
import c80.u;
import ca0.o1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.gear.presentation.GearActivity;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import com.garmin.proto.generated.GDIInReachMessaging;
import d53.w;
import e23.l;
import e23.p;
import f5.g0;
import f5.z0;
import gg1.o0;
import h21.a0;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import l72.c1;
import l72.i3;
import l72.p2;
import l72.r1;
import l72.w1;
import lc.u0;
import m12.t;
import m4.b0;
import o4.m1;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.c2;
import p3.i2;
import p3.m;
import p3.n;
import p3.n1;
import p3.p0;
import p3.p1;
import p3.x1;
import s5.x0;
import sd.o;
import sg0.w0;
import sk0.b1;
import sk0.g1;
import sk0.h0;
import sk0.h1;
import sk0.n0;
import sk0.y0;
import tn2.s0;
import u1.a2;
import x5.v;
import y22.x;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f27645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f27646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f27647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f27648f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f27649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f27650h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f27651i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f27652j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f27653k;

    public /* synthetic */ g(o12.d dVar, Context context, e23.a aVar, q qVar, boolean z14, b0 b0Var, l lVar, p1 p1Var, p1 p1Var2, n1 n1Var) {
        this.f27643a = 10;
        this.f27644b = dVar;
        this.f27645c = context;
        this.f27647e = aVar;
        this.f27651i = qVar;
        this.f27649g = z14;
        this.f27652j = b0Var;
        this.f27646d = lVar;
        this.f27648f = p1Var;
        this.f27653k = p1Var2;
        this.f27650h = n1Var;
    }

    /* JADX WARN: Code duplicated, block: B:191:0x089e  */
    /* JADX WARN: Multi-variable type inference failed */
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
    private final Object a(Object obj, Object obj2) {
        Object dVar;
        m.a.C2565a c2565a;
        boolean z14;
        p1 p1Var;
        m.a.C2565a c2565a2;
        char c14;
        String str;
        String str2;
        z3.e eVar;
        m.a.C2565a c2565a3;
        int i14;
        m mVar;
        Object dVar2;
        p1 p1Var2;
        r.a aVar;
        o0 o0Var;
        int i15;
        p1 p1Var3;
        int i16;
        int i17;
        double d14;
        o0 o0Var2;
        String strE;
        String strD;
        int i18;
        o0 o0Var3;
        p2 p2Var;
        m mVar2;
        int i19;
        int i24;
        String strP;
        String str3;
        final p1 p1Var4 = (p1) this.f27648f;
        g1 g1Var = (g1) this.f27644b;
        e23.q qVar = (e23.q) this.f27645c;
        e23.q qVar2 = (e23.q) this.f27646d;
        p1 p1Var5 = (p1) this.f27647e;
        o0 o0Var4 = (o0) this.f27651i;
        final String str4 = (String) this.f27650h;
        Set set = (Set) this.f27652j;
        final p pVar = (p) this.f27653k;
        m mVar3 = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            r.a aVar2 = r.S;
            r rVarD = c2.l.D(a2.b(aVar2, a2.a(mVar3), true));
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, mVar3, 0);
            int iHashCode = Long.hashCode(mVar3.getU());
            i2 i2VarX = mVar3.x();
            r rVarC = k.c(rVarD, mVar3);
            h5.g.V.getClass();
            r.a aVar3 = aVar2;
            e0.a aVar4 = h5.g.a.f81805b;
            if (mVar3.F() == null) {
                p0.l();
                throw null;
            }
            mVar3.z();
            if (mVar3.getT()) {
                mVar3.M(aVar4);
            } else {
                mVar3.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar3);
            b4.c(h5.g.a.f81809f, i2VarX, mVar3);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar3, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar3);
            c2.b0 b0Var = c2.b0.f22601a;
            r1.b(gl1.y.Q(mVar3, R.string.lbl_gear_info), null, mVar3, 0, 2);
            Object[] objArr = new Object[0];
            Object objQ = mVar3.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a4 = m.a.f135155b;
            if (objQ == c2565a4) {
                objQ = new o(24);
                mVar3.K(objQ);
            }
            p1 p1Var6 = (p1) d4.a.e(objArr, (e23.a) objQ, mVar3, 48);
            u uVar = ((n0) p1Var4.getF182175a()).f159762a;
            w13.c cVar = u.f25612w;
            s50.b bVar2 = new s50.b(10);
            Object objQ2 = mVar3.q();
            if (objQ2 == c2565a4) {
                objQ2 = new se0.a(18);
                mVar3.K(objQ2);
            }
            l lVar = (l) objQ2;
            boolean zB = mVar3.B(p1Var4) | mVar3.B(p1Var6);
            Object objQ3 = mVar3.q();
            if (zB || objQ3 == c2565a4) {
                objQ3 = new sk0.l(p1Var4, p1Var6, 2);
                mVar3.K(objQ3);
            }
            uk0.m.b(uVar, cVar, bVar2, lVar, (l) objQ3, gl1.y.Q(mVar3, R.string.lbl_gear_type), xy2.b.l(((n0) p1Var4.getF182175a()).f159762a, mVar3), mVar3, 3072);
            m mVar4 = mVar3;
            u uVar2 = (u) p1Var6.getF182175a();
            if (uVar2 == null) {
                mVar4.C(-1361295611);
                mVar4.f();
                c2565a2 = c2565a4;
                c14 = R.string.lbl_common_continue;
                aVar3 = aVar3;
                p1Var = p1Var5;
            } else {
                mVar4.C(-1361295610);
                c1 c1Var = c1.f110940a;
                String strQ = gl1.y.Q(mVar4, R.string.change_gear_type);
                String strQ2 = gl1.y.Q(mVar4, R.string.will_reset_several_fields_continue);
                String strQ3 = gl1.y.Q(mVar4, R.string.lbl_common_continue);
                boolean zB2 = mVar4.B(p1Var4) | mVar4.k(uVar2.ordinal()) | mVar4.k(o0Var4.ordinal()) | mVar4.B(p1Var5) | mVar4.B(p1Var6);
                Object objQ4 = mVar4.q();
                if (zB2 || objQ4 == c2565a4) {
                    c2565a = c2565a4;
                    z14 = true;
                    dVar = new p50.d(9, uVar2, o0Var4, p1Var5, p1Var6, p1Var4);
                    p1Var = p1Var5;
                    p1Var4 = p1Var4;
                    mVar4.K(dVar);
                } else {
                    c2565a = c2565a4;
                    dVar = objQ4;
                    z14 = true;
                    p1Var = p1Var5;
                }
                e23.a<Unit> aVar5 = (e23.a) dVar;
                String strQ4 = gl1.y.Q(mVar4, R.string.lbl_cancel);
                boolean zB3 = mVar4.B(p1Var6);
                Object objQ5 = mVar4.q();
                if (zB3) {
                    c2565a2 = c2565a;
                } else {
                    c2565a2 = c2565a;
                    if (objQ5 == c2565a2) {
                    }
                    c14 = 8217;
                    c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, aVar5, strQ4, (e23.a) objQ5, mVar4, 0, 0, 217);
                    mVar4 = mVar4;
                    Unit unit = Unit.INSTANCE;
                    mVar4.f();
                }
                objQ5 = new sg0.l(p1Var6, 15);
                mVar4.K(objQ5);
                c14 = 8217;
                c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, aVar5, strQ4, (e23.a) objQ5, mVar4, 0, 0, 217);
                mVar4 = mVar4;
                Unit unit2 = Unit.INSTANCE;
                mVar4.f();
            }
            String str5 = ((n0) p1Var4.getF182175a()).f159763b;
            if ((str5 == null || w.J(str5)) && ((str = ((n0) p1Var4.getF182175a()).f159764c) == null || w.J(str))) {
                mVar4.C(-1359784298);
                mVar4.f();
                str2 = null;
            } else {
                mVar4.C(-1359877856);
                uk0.i iVar = uk0.i.f171830a;
                String str6 = ((n0) p1Var4.getF182175a()).f159763b;
                if (str6 == null) {
                    str6 = "";
                }
                String str7 = ((n0) p1Var4.getF182175a()).f159764c;
                iVar.getClass();
                String strC = uk0.i.c((Context) mVar4.A(AndroidCompositionLocals_androidKt.f6042b), str6, str7);
                mVar4.f();
                str2 = strC;
            }
            boolean z15 = ((sk0.o0) p1Var.getF182175a()).f159790b || ((sk0.o0) p1Var.getF182175a()).f159789a;
            uk0.i iVar2 = uk0.i.f171830a;
            String strQ5 = gl1.y.Q(mVar4, R.string.lbl_gear_brand_and_model);
            iVar2.getClass();
            String strH = uk0.i.h(strQ5, mVar4);
            if (z15) {
                h0.f159674a.getClass();
                eVar = h0.f159675b;
            } else {
                eVar = null;
            }
            boolean zR = mVar4.r(g1Var) | mVar4.B(p1Var4) | mVar4.B(qVar) | mVar4.B(qVar2);
            Object objQ6 = mVar4.q();
            if (zR || objQ6 == c2565a2) {
                c2565a3 = c2565a2;
                i14 = 15;
                ok0.d dVar3 = new ok0.d(g1Var, qVar, qVar2, p1Var4, 23);
                mVar4.K(dVar3);
                objQ6 = dVar3;
            } else {
                c2565a3 = c2565a2;
                i14 = 15;
            }
            e23.a<Unit> aVar6 = (e23.a) objQ6;
            if (str2 == null || w.J(str2)) {
                z3.e eVar2 = eVar;
                mVar4.C(-1358429722);
                m mVar5 = mVar4;
                p2.f111205a.g(strH, null, null, null, eVar2, false, false, aVar6, mVar5, 0, 238);
                mVar = mVar5;
                mVar.f();
            } else {
                mVar4.C(-1358211947);
                m mVar6 = mVar4;
                p2.f111205a.h(strH, str2, null, null, null, false, false, null, eVar, null, aVar6, mVar6, 0, 0, 764);
                mVar = mVar6;
                mVar.f();
            }
            d92.b.f58623a.getClass();
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar3 = j92.b.f97899b;
            float f14 = eVar3.f97920e;
            bVar3.getClass();
            r.a aVar7 = aVar3;
            r rVarZ = c2.l.z(aVar7, f14, eVar3.f97917b);
            String strQ6 = gl1.y.Q(mVar, R.string.required_field_star);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            m mVar7 = mVar;
            mh.c(strQ6, rVarZ, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, mVar), mVar7, 0, 0, 131068);
            t0 t0Var = t0.f16792a;
            String strQ7 = gl1.y.Q(mVar7, R.string.lbl_common_nickname);
            String str8 = ((n0) p1Var4.getF182175a()).f159765d;
            String str9 = str8 == null ? "" : str8;
            boolean z16 = ((sk0.o0) p1Var.getF182175a()).f159791c;
            boolean zB4 = mVar7.B(p1Var) | mVar7.B(p1Var4);
            Object objQ7 = mVar7.q();
            j92.e eVar4 = eVar3;
            int i25 = 3;
            if (zB4 || objQ7 == c2565a3) {
                objQ7 = new sk0.l(p1Var, p1Var4, i25);
                mVar7.K(objQ7);
            }
            v.f188954b.getClass();
            t0Var.i(null, strQ7, str9, 251, z16, (l) objQ7, null, v.f188955c, 0, z3.f.c(1314733832, new sk0.c(p1Var, 4), mVar7), mVar7, 817892352, 321);
            int i26 = 0;
            r1.b(gl1.y.Q(mVar7, R.string.gear_use), null, mVar7, 0, 2);
            Object[] objArr2 = new Object[0];
            Object objQ8 = mVar7.q();
            if (objQ8 == c2565a3) {
                objQ8 = new o(27);
                mVar7.K(objQ8);
            }
            p1 p1Var7 = (p1) d4.a.e(objArr2, (e23.a) objQ8, mVar7, 48);
            p2 p2Var2 = p2.f111205a;
            String strQ8 = gl1.y.Q(mVar7, R.string.first_use_date);
            FormatStyle formatStyle = FormatStyle.SHORT;
            String str10 = DateTimeFormatter.ofLocalizedDate(formatStyle).format(((n0) p1Var4.getF182175a()).f159766e.f16206a);
            str10.getClass();
            boolean zB5 = mVar7.B(p1Var7);
            Object objQ9 = mVar7.q();
            if (zB5 || objQ9 == c2565a3) {
                objQ9 = new sg0.l(p1Var7, 10);
                mVar7.K(objQ9);
            }
            p2Var2.h(strQ8, str10, null, null, null, false, false, null, null, null, (e23.a) objQ9, mVar7, 0, 0, 1020);
            m mVar8 = mVar7;
            if (((Boolean) p1Var7.getF182175a()).booleanValue()) {
                mVar8.C(-1356112193);
                b63.o oVarI = ((n0) p1Var4.getF182175a()).f159770i;
                if (oVarI == null) {
                    oVarI = sk0.p.i();
                }
                b63.o oVar = ((n0) p1Var4.getF182175a()).f159766e;
                b63.o oVar2 = (b63.o) r13.b.e(b63.q.d(oVarI, new b63.d(0, 0, 1, 3, null)), g22.l.d(b63.o.INSTANCE));
                boolean zB6 = mVar8.B(p1Var4) | mVar8.B(p1Var7);
                Object objQ10 = mVar8.q();
                if (zB6 || objQ10 == c2565a3) {
                    objQ10 = new sk0.l(p1Var4, p1Var7, i26);
                    mVar8.K(objQ10);
                }
                l lVar2 = (l) objQ10;
                boolean zB7 = mVar8.B(p1Var7);
                Object objQ11 = mVar8.q();
                if (zB7 || objQ11 == c2565a3) {
                    objQ11 = new sg0.l(p1Var7, 11);
                    mVar8.K(objQ11);
                }
                uk0.h.a(oVar, lVar2, (e23.a) objQ11, null, oVar2, mVar8, 0, 8);
                mVar8 = mVar8;
                mVar8.f();
            } else {
                mVar8.C(-1355471206);
                mVar8.f();
            }
            Object[] objArr3 = new Object[0];
            Object objQ12 = mVar8.q();
            if (objQ12 == c2565a3) {
                objQ12 = new o(25);
                mVar8.K(objQ12);
            }
            p1 p1Var8 = (p1) d4.a.e(objArr3, (e23.a) objQ12, mVar8, 48);
            c80.w wVar = ((n0) p1Var4.getF182175a()).f159767f;
            w13.c cVar2 = c80.w.f25629g;
            s50.b bVar4 = new s50.b(9);
            Object objQ13 = mVar8.q();
            int i27 = 16;
            if (objQ13 == c2565a3) {
                objQ13 = new se0.a(i27);
                mVar8.K(objQ13);
            }
            l lVar3 = (l) objQ13;
            boolean zK = mVar8.k(o0Var4.ordinal()) | mVar8.B(p1Var4) | mVar8.B(p1Var8);
            Object objQ14 = mVar8.q();
            if (zK || objQ14 == c2565a3) {
                objQ14 = new rp.b(o0Var4, i14, p1Var4, p1Var8);
                mVar8.K(objQ14);
            }
            m mVar9 = mVar8;
            uk0.m.b(wVar, cVar2, bVar4, lVar3, (l) objQ14, gl1.y.Q(mVar8, R.string.usage_tracking), gl1.y.Q(mVar8, sk0.p.j(((n0) p1Var4.getF182175a()).f159767f)), mVar9, 3072);
            m mVar10 = mVar9;
            c80.w wVar2 = (c80.w) p1Var8.getF182175a();
            if (wVar2 == null) {
                mVar10.C(-1354376752);
                mVar10.f();
                o0Var = o0Var4;
                aVar = aVar7;
                p1Var3 = p1Var;
                eVar4 = eVar4;
                i15 = 3;
            } else {
                mVar10.C(-1354376751);
                c1 c1Var2 = c1.f110940a;
                String strQ9 = gl1.y.Q(mVar10, R.string.change_use_type);
                String strQ10 = gl1.y.Q(mVar10, R.string.will_reset_max_use_continue);
                String strQ11 = gl1.y.Q(mVar10, R.string.lbl_common_continue);
                boolean zB8 = mVar10.B(p1Var4) | mVar10.k(wVar2.ordinal()) | mVar10.k(o0Var4.ordinal()) | mVar10.B(p1Var) | mVar10.B(p1Var8);
                Object objQ15 = mVar10.q();
                if (zB8 || objQ15 == c2565a3) {
                    p1Var2 = p1Var8;
                    aVar = aVar7;
                    p1 p1Var9 = p1Var;
                    p1 p1Var10 = p1Var4;
                    o0Var = o0Var4;
                    i15 = 3;
                    dVar2 = new p50.d(8, wVar2, o0Var, p1Var9, p1Var2, p1Var10);
                    p1Var3 = p1Var9;
                    p1Var4 = p1Var10;
                    mVar10.K(dVar2);
                } else {
                    p1Var2 = p1Var8;
                    aVar = aVar7;
                    dVar2 = objQ15;
                    p1Var3 = p1Var;
                    i15 = 3;
                    o0Var = o0Var4;
                }
                e23.a<Unit> aVar8 = (e23.a) dVar2;
                String strQ12 = gl1.y.Q(mVar10, R.string.lbl_cancel);
                boolean zB9 = mVar10.B(p1Var2);
                Object objQ16 = mVar10.q();
                if (zB9 || objQ16 == c2565a3) {
                    objQ16 = new sg0.l(p1Var2, 12);
                    mVar10.K(objQ16);
                }
                c1Var2.a(false, strQ9, strQ10, null, null, strQ11, false, false, aVar8, strQ12, (e23.a) objQ16, mVar10, 0, 0, 217);
                mVar10 = mVar10;
                Unit unit3 = Unit.INSTANCE;
                mVar10.f();
            }
            int i28 = sk0.p.b.f159797b[((n0) p1Var4.getF182175a()).f159767f.ordinal()];
            int i29 = 1;
            if (i28 != 1) {
                if (i28 != 2) {
                    if (i28 == i15) {
                        mVar10.C(-1346884826);
                        Object[] objArr4 = new Object[0];
                        Object objQ17 = mVar10.q();
                        if (objQ17 == c2565a3) {
                            objQ17 = new o(26);
                            mVar10.K(objQ17);
                        }
                        p1 p1Var11 = (p1) d4.a.e(objArr4, (e23.a) objQ17, mVar10, 48);
                        b63.o oVarI2 = ((n0) p1Var4.getF182175a()).f159770i;
                        if (oVarI2 == null) {
                            oVarI2 = sk0.p.i();
                        }
                        String strQ13 = gl1.y.Q(mVar10, R.string.max_use_threshold);
                        String str11 = DateTimeFormatter.ofLocalizedDate(formatStyle).format(oVarI2.f16206a);
                        str11.getClass();
                        boolean zB10 = mVar10.B(p1Var11);
                        Object objQ18 = mVar10.q();
                        if (zB10 || objQ18 == c2565a3) {
                            objQ18 = new sg0.l(p1Var11, 13);
                            mVar10.K(objQ18);
                        }
                        m mVar11 = mVar10;
                        p2Var2.h(strQ13, str11, null, null, null, false, false, null, null, null, (e23.a) objQ18, mVar11, 0, 0, 1020);
                        mVar10 = mVar11;
                        if (((Boolean) p1Var11.getF182175a()).booleanValue()) {
                            mVar10.C(-1346320316);
                            b63.o oVarC = b63.p.c(((n0) p1Var4.getF182175a()).f159766e, new b63.d(0, 0, 1, 3, null));
                            boolean zB11 = mVar10.B(p1Var4) | mVar10.B(p1Var11);
                            Object objQ19 = mVar10.q();
                            if (zB11 || objQ19 == c2565a3) {
                                objQ19 = new sk0.l(p1Var4, p1Var11, i29);
                                mVar10.K(objQ19);
                            }
                            l lVar4 = (l) objQ19;
                            boolean zB12 = mVar10.B(p1Var11);
                            Object objQ20 = mVar10.q();
                            if (zB12 || objQ20 == c2565a3) {
                                objQ20 = new sg0.l(p1Var11, 14);
                                mVar10.K(objQ20);
                            }
                            uk0.h.a(oVarI2, lVar4, (e23.a) objQ20, oVarC, null, mVar10, 0, 16);
                            mVar10 = mVar10;
                            mVar10.f();
                        } else {
                            mVar10.C(-1345622630);
                            mVar10.f();
                        }
                        mVar10.f();
                        Unit unit4 = Unit.INSTANCE;
                    } else {
                        if (i28 != 4) {
                            throw n23.j.m(mVar10, 1757470002);
                        }
                        mVar10.C(-1345563234);
                        mVar10.f();
                        Unit unit5 = Unit.INSTANCE;
                    }
                    c2565a3 = c2565a3;
                } else {
                    mVar10.C(-1349458632);
                    String strQ14 = gl1.y.Q(mVar10, R.string.lbl_hour);
                    NumberFormat integerInstance = NumberFormat.getIntegerInstance();
                    NumberFormat integerInstance2 = NumberFormat.getIntegerInstance();
                    integerInstance2.setGroupingUsed(false);
                    String strQ15 = gl1.y.Q(mVar10, R.string.max_use_threshold);
                    Long l14 = ((n0) p1Var4.getF182175a()).f159769h;
                    if (l14 == null) {
                        mVar10.C(-1349076341);
                        mVar10.f();
                        strP = null;
                    } else {
                        mVar10.C(-1349076340);
                        long jLongValue = l14.longValue();
                        integerInstance.getClass();
                        x1 x1Var2 = n.f135158a;
                        e53.c.a aVar9 = e53.c.f63094b;
                        long j8 = e53.c.j(e53.e.f(jLongValue, e53.f.SECONDS), e53.f.HOURS);
                        String str12 = integerInstance.format(j8);
                        if (j8 == 1) {
                            mVar10.C(275026104);
                            str12.getClass();
                            strP = gl1.y.P(R.string.lbl_plural_one_hour, new Object[]{str12}, mVar10);
                            mVar10.f();
                        } else {
                            mVar10.C(275110734);
                            str12.getClass();
                            strP = gl1.y.P(R.string.lbl_plural_more_than_one_hour, new Object[]{str12}, mVar10);
                            mVar10.f();
                        }
                        mVar10.f();
                    }
                    if (strP == null) {
                        strP = "";
                    }
                    Long l15 = ((n0) p1Var4.getF182175a()).f159769h;
                    if (l15 != null) {
                        e53.c.a aVar10 = e53.c.f63094b;
                        String str13 = integerInstance2.format(e53.c.j(e53.e.f(l15.longValue(), e53.f.SECONDS), e53.f.HOURS));
                        if (str13 != null) {
                            str3 = str13;
                        } else {
                            str3 = "";
                        }
                    } else {
                        str3 = "";
                    }
                    int length = integerInstance2.format((Object) 999999).length() + 1;
                    boolean z17 = ((sk0.o0) p1Var3.getF182175a()).f159793e;
                    boolean zB13 = mVar10.B(p1Var3) | mVar10.B(p1Var4) | mVar10.r(integerInstance2);
                    Object objQ21 = mVar10.q();
                    if (zB13 || objQ21 == c2565a3) {
                        objQ21 = new rp.b(integerInstance2, 16, p1Var3, p1Var4);
                        mVar10.K(objQ21);
                    }
                    boolean z18 = ((sk0.o0) p1Var3.getF182175a()).f159793e;
                    h0.f159674a.getClass();
                    m mVar12 = mVar10;
                    uk0.o.d(strQ15, strP, str3, strQ14, length, z17, (l) objQ21, gg.b.o(z18, h0.f159676c, mVar10), mVar12, 0);
                    mVar10 = mVar12;
                    mVar10.f();
                    Unit unit6 = Unit.INSTANCE;
                }
                set = set;
            } else {
                c2565a3 = c2565a3;
                mVar10.C(-1353065358);
                int[] iArr = sk0.p.b.f159796a;
                int i30 = iArr[o0Var.ordinal()];
                if (i30 == 1 || i30 == 2) {
                    i16 = 1757467977;
                    i17 = R.string.lbl_mile;
                } else {
                    if (i30 != 3) {
                        throw n23.j.m(mVar10, 1757465678);
                    }
                    i16 = 1757470151;
                    i17 = R.string.lbl_km;
                }
                String strH2 = sn.a.h(mVar10, i16, i17, mVar10);
                int i34 = iArr[o0Var.ordinal()];
                if (i34 == 1 || i34 == 2) {
                    d14 = 621372.0d;
                } else {
                    if (i34 != 3) {
                        u0.r();
                        return null;
                    }
                    d14 = 999999.0d;
                }
                NumberFormat integerInstance3 = NumberFormat.getIntegerInstance();
                NumberFormat integerInstance4 = NumberFormat.getIntegerInstance();
                integerInstance4.setGroupingUsed(false);
                String strQ16 = gl1.y.Q(mVar10, R.string.max_use_threshold);
                Double d15 = ((n0) p1Var4.getF182175a()).f159768g;
                if (d15 == null) {
                    mVar10.C(-1352466222);
                    mVar10.f();
                    strE = null;
                    o0Var2 = o0Var;
                } else {
                    mVar10.C(-1352466221);
                    double dDoubleValue = d15.doubleValue();
                    integerInstance3.getClass();
                    o0Var2 = o0Var;
                    strE = uk0.i.e(dDoubleValue, o0Var2, integerInstance3, mVar10, 3072);
                    mVar10.f();
                }
                if (strE == null) {
                    strE = "";
                }
                Double d16 = ((n0) p1Var4.getF182175a()).f159768g;
                if (d16 == null) {
                    mVar10.C(-1352132042);
                    mVar10.f();
                    strD = null;
                } else {
                    mVar10.C(-1352132041);
                    strD = uk0.i.d(d16.doubleValue(), o0Var2, integerInstance4);
                    mVar10.f();
                }
                String str14 = strD == null ? "" : strD;
                int length2 = integerInstance4.format(d14).length() + 1;
                boolean z19 = ((sk0.o0) p1Var3.getF182175a()).f159792d;
                boolean zB14 = mVar10.B(p1Var3) | mVar10.B(p1Var4) | mVar10.r(integerInstance4) | mVar10.m(d14) | mVar10.k(o0Var2.ordinal());
                Object objQ22 = mVar10.q();
                if (zB14 || objQ22 == c2565a3) {
                    i18 = 14;
                    o0 o0Var5 = o0Var2;
                    p1 p1Var12 = p1Var4;
                    objQ22 = new mx.f(integerInstance4, p1Var3, p1Var12, d14, o0Var5);
                    p1Var4 = p1Var12;
                    o0Var3 = o0Var5;
                    mVar10.K(objQ22);
                } else {
                    o0Var3 = o0Var2;
                    i18 = 14;
                }
                m mVar13 = mVar10;
                uk0.o.d(strQ16, strE, str14, strH2, length2, z19, (l) objQ22, gg.b.o(((sk0.o0) p1Var3.getF182175a()).f159792d, z3.f.c(-1285008155, new s5.a(o0Var3, i18), mVar10), mVar10), mVar13, 0);
                mVar10 = mVar13;
                mVar10.f();
                Unit unit7 = Unit.INSTANCE;
            }
            int i35 = 0;
            r1.b(gl1.y.Q(mVar10, R.string.activities_for_this_gear), null, mVar10, 0, 2);
            if (p13.h0.L(((n0) p1Var4.getF182175a()).f159771j)) {
                mVar10.C(-1345321527);
                String strQ17 = gl1.y.Q(mVar10, R.string.default_activities);
                String strB = uk0.i.b(((n0) p1Var4.getF182175a()).f159771j, mVar10, 384);
                String str15 = strB == null ? "" : strB;
                boolean zB15 = mVar10.B(p1Var4) | mVar10.B(str4) | mVar10.r(set) | mVar10.B(pVar);
                Object objQ23 = mVar10.q();
                if (zB15 || objQ23 == c2565a3) {
                    final int i36 = 0;
                    final Set set2 = set;
                    e23.a aVar11 = new e23.a() { // from class: sk0.m
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i36) {
                                case 0:
                                    qk0.c.Companion companion = qk0.c.INSTANCE;
                                    p3.p1 p1Var13 = p1Var4;
                                    c80.u uVar3 = ((n0) p1Var13.getF182175a()).f159762a;
                                    companion.getClass();
                                    Set set3 = set2;
                                    set3.getClass();
                                    Set setB = p13.a1.b(uVar3);
                                    String str16 = str4;
                                    pVar.invoke(((n0) p1Var13.getF182175a()).f159771j, qk0.c.Companion.a(setB, str16 != null ? p13.a1.b(str16) : p13.l0.f134950a, set3));
                                    break;
                                default:
                                    qk0.c.Companion companion2 = qk0.c.INSTANCE;
                                    p3.p1 p1Var14 = p1Var4;
                                    c80.u uVar4 = ((n0) p1Var14.getF182175a()).f159762a;
                                    companion2.getClass();
                                    Set set4 = set2;
                                    set4.getClass();
                                    Set setB2 = p13.a1.b(uVar4);
                                    String str17 = str4;
                                    pVar.invoke(((n0) p1Var14.getF182175a()).f159771j, qk0.c.Companion.a(setB2, str17 != null ? p13.a1.b(str17) : p13.l0.f134950a, set4));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar10.K(aVar11);
                    objQ23 = aVar11;
                }
                m mVar14 = mVar10;
                p2Var = p2Var2;
                p2Var.h(strQ17, str15, null, null, null, false, false, null, null, null, (e23.a) objQ23, mVar14, 0, 0, 1020);
                mVar2 = mVar14;
                mVar2.f();
            } else {
                final Set set3 = set;
                mVar10.C(-1344953061);
                String strQ18 = gl1.y.Q(mVar10, R.string.default_activities);
                boolean zB16 = mVar10.B(p1Var4) | mVar10.B(str4) | mVar10.r(set3) | mVar10.B(pVar);
                Object objQ24 = mVar10.q();
                if (zB16 || objQ24 == c2565a3) {
                    p2Var = p2Var2;
                    final int i37 = 1;
                    e23.a aVar12 = new e23.a() { // from class: sk0.m
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i37) {
                                case 0:
                                    qk0.c.Companion companion = qk0.c.INSTANCE;
                                    p3.p1 p1Var13 = p1Var4;
                                    c80.u uVar3 = ((n0) p1Var13.getF182175a()).f159762a;
                                    companion.getClass();
                                    Set set4 = set3;
                                    set4.getClass();
                                    Set setB = p13.a1.b(uVar3);
                                    String str16 = str4;
                                    pVar.invoke(((n0) p1Var13.getF182175a()).f159771j, qk0.c.Companion.a(setB, str16 != null ? p13.a1.b(str16) : p13.l0.f134950a, set4));
                                    break;
                                default:
                                    qk0.c.Companion companion2 = qk0.c.INSTANCE;
                                    p3.p1 p1Var14 = p1Var4;
                                    c80.u uVar4 = ((n0) p1Var14.getF182175a()).f159762a;
                                    companion2.getClass();
                                    Set set5 = set3;
                                    set5.getClass();
                                    Set setB2 = p13.a1.b(uVar4);
                                    String str17 = str4;
                                    pVar.invoke(((n0) p1Var14.getF182175a()).f159771j, qk0.c.Companion.a(setB2, str17 != null ? p13.a1.b(str17) : p13.l0.f134950a, set5));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar10.K(aVar12);
                    objQ24 = aVar12;
                }
                m mVar15 = mVar10;
                p2Var.g(strQ18, null, null, null, null, false, false, (e23.a) objQ24, mVar15, 0, 254);
                mVar2 = mVar15;
                mVar2.f();
            }
            if (p13.h0.L(((n0) p1Var4.getF182175a()).f159771j) && this.f27649g) {
                mVar2.C(-1344587261);
                boolean zB17 = mVar2.B(p1Var4);
                Object objQ25 = mVar2.q();
                if (zB17 || objQ25 == c2565a3) {
                    objQ25 = new sk0.n(p1Var4, i35);
                    mVar2.K(objQ25);
                }
                l lVar5 = (l) objQ25;
                Object objQ26 = mVar2.q();
                if (objQ26 == c2565a3) {
                    objQ26 = new se0.a(17);
                    mVar2.K(objQ26);
                }
                i19 = 1;
                r rVarC2 = p5.v.c((l) objQ26, aVar, true);
                p5.l.f136032b.getClass();
                m mVar16 = mVar2;
                p2Var.g(gl1.y.Q(mVar2, R.string.add_to_existing_activities), j2.g.b(rVarC2, ((n0) p1Var4.getF182175a()).f159772k, false, p5.l.a(p5.l.f136034d), lVar5, 10), null, null, z3.f.c(-252842361, new sk0.c(p1Var4, 2), mVar2), false, false, null, mVar16, 100687872, 236);
                String strD2 = new pi0.e((Context) mVar16.A(AndroidCompositionLocals_androidKt.f6042b)).d(g22.l.h(((n0) p1Var4.getF182175a()).f159766e), qi0.a.RELATIVE_YEAR_ABBREV_MONTH_DAY);
                bVar3.getClass();
                float f15 = eVar4.f97920e;
                bVar3.getClass();
                r rVarZ2 = c2.l.z(aVar, f15, eVar4.f97917b);
                String strP2 = gl1.y.P(R.string.add_to_default_activities_since, new Object[]{strD2}, mVar16);
                fVar.getClass();
                mh.c(strP2, rVarZ2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar16), mVar16, 0, 0, 131068);
                mVar2 = mVar16;
                mVar2.f();
            } else {
                i19 = 1;
                mVar2.C(-1342904550);
                mVar2.f();
            }
            String str16 = ((n0) p1Var4.getF182175a()).f159773l;
            String str17 = str16 == null ? "" : str16;
            boolean zB18 = mVar2.B(p1Var4);
            Object objQ27 = mVar2.q();
            if (zB18 || objQ27 == c2565a3) {
                objQ27 = new sk0.n(p1Var4, i19);
                mVar2.K(objQ27);
            }
            m mVar17 = mVar2;
            uk0.o.c(str17, (l) objQ27, null, null, mVar17, 0, 12);
            bVar3.getClass();
            c2.l.f(x2.h(aVar, eVar4.getF97920e()), mVar17);
            String strQ19 = gl1.y.Q(mVar17, R.string.my_photos);
            i53.c<x> cVar3 = ((n0) p1Var4.getF182175a()).f159774m;
            boolean zB19 = mVar17.B(p1Var4);
            Object objQ28 = mVar17.q();
            if (zB19 || objQ28 == m.a.a()) {
                objQ28 = new sk0.n(p1Var4, 2);
                mVar17.K(objQ28);
            }
            l lVar6 = (l) objQ28;
            boolean zB20 = mVar17.B(p1Var4);
            Object objQ29 = mVar17.q();
            if (zB20 || objQ29 == m.a.a()) {
                objQ29 = new sk0.c(p1Var4, 3);
                mVar17.K(objQ29);
            }
            p pVar2 = (p) objQ29;
            boolean zB21 = mVar17.B(p1Var4);
            Object objQ30 = mVar17.q();
            if (zB21 || objQ30 == m.a.a()) {
                i24 = 3;
                objQ30 = new sk0.n(p1Var4, i24);
                mVar17.K(objQ30);
            } else {
                i24 = 3;
            }
            y22.d.a(strQ19, cVar3, 10, lVar6, pVar2, (l) objQ30, mVar17, (x.f194327d << i24) | 384);
            c2.l.f(x2.h(aVar, d92.b.b().b().getF97921f()), mVar17);
            mVar17.y();
            x1 x1Var3 = n.f135158a;
        } else {
            mVar3.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0437  */
    /* JADX WARN: Code duplicated, block: B:102:0x043e  */
    /* JADX WARN: Code duplicated, block: B:106:0x048f  */
    /* JADX WARN: Code duplicated, block: B:108:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:111:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:112:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:115:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:117:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:119:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:120:0x0508  */
    /* JADX WARN: Code duplicated, block: B:123:0x053f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0546  */
    /* JADX WARN: Code duplicated, block: B:127:0x0563  */
    /* JADX WARN: Code duplicated, block: B:129:0x0567  */
    /* JADX WARN: Code duplicated, block: B:134:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:152:0x0641  */
    /* JADX WARN: Code duplicated, block: B:157:0x065e  */
    /* JADX WARN: Code duplicated, block: B:205:0x07d6  */
    /* JADX WARN: Code duplicated, block: B:208:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:212:0x080f  */
    /* JADX WARN: Code duplicated, block: B:214:0x0816  */
    /* JADX WARN: Code duplicated, block: B:216:0x082b A[LOOP:2: B:206:0x07da->B:216:0x082b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:219:0x083e  */
    /* JADX WARN: Code duplicated, block: B:222:0x0849  */
    /* JADX WARN: Code duplicated, block: B:225:0x0853  */
    /* JADX WARN: Code duplicated, block: B:230:0x0876  */
    /* JADX WARN: Code duplicated, block: B:232:0x087d  */
    /* JADX WARN: Code duplicated, block: B:252:0x0914  */
    /* JADX WARN: Code duplicated, block: B:257:0x0976  */
    /* JADX WARN: Code duplicated, block: B:279:0x0a45  */
    /* JADX WARN: Code duplicated, block: B:299:0x0b54  */
    /* JADX WARN: Code duplicated, block: B:304:0x0b70  */
    /* JADX WARN: Code duplicated, block: B:320:0x0c22  */
    /* JADX WARN: Code duplicated, block: B:325:0x0c3e  */
    /* JADX WARN: Code duplicated, block: B:330:0x0592 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:0x0489 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:0x0847 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:0x0863 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:340:? A[LOOP:1: B:223:0x084d->B:340:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:341:0x07f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:342:0x082e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x014f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0158  */
    /* JADX WARN: Code duplicated, block: B:38:0x015c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0179  */
    /* JADX WARN: Code duplicated, block: B:46:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:48:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:52:0x0253  */
    /* JADX WARN: Code duplicated, block: B:54:0x025d  */
    /* JADX WARN: Code duplicated, block: B:55:0x027b  */
    /* JADX WARN: Code duplicated, block: B:57:0x027f  */
    /* JADX WARN: Code duplicated, block: B:62:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:65:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:67:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:69:0x0308  */
    /* JADX WARN: Code duplicated, block: B:71:0x0312  */
    /* JADX WARN: Code duplicated, block: B:73:0x031f  */
    /* JADX WARN: Code duplicated, block: B:74:0x032b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0344  */
    /* JADX WARN: Code duplicated, block: B:86:0x0387  */
    /* JADX WARN: Code duplicated, block: B:89:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:91:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:92:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:97:0x03ef  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        u4.d dVarA;
        int i14;
        int i15;
        Collection collectionValues;
        Iterator it;
        boolean zR;
        Object objQ;
        Collection collectionValues2;
        Iterator it3;
        boolean z14;
        boolean zR2;
        Object objQ2;
        n1 n1Var;
        p1 p1Var;
        h5.g.a.f fVar;
        c2.b0 b0Var;
        l lVar;
        b0 b0Var2;
        j92.e eVar;
        h4.g.a aVar;
        z zVarA;
        int iHashCode;
        p1 p1Var2;
        i2 i2VarX;
        r rVarC;
        int i16;
        boolean zR3;
        Object objQ3;
        Iterator it4;
        m12.s sVar;
        b0 b0Var3;
        l lVar2;
        p1 p1Var3;
        int i17;
        m12.s.e eVar2;
        Integer num;
        String str;
        boolean zB;
        Object objQ4;
        m12.s.c cVar;
        Integer num2;
        String str2;
        boolean zB2;
        Object objQ5;
        n1 n1Var2;
        r rVarD;
        z0 z0VarD;
        int iHashCode2;
        i2 i2VarX2;
        r rVarC2;
        e0.a aVar2;
        h5.g.a.b bVar;
        p1 p1Var4;
        boolean zB3;
        Object objQ6;
        m12.s.b bVar2;
        c2 c2VarN;
        boolean zB4;
        Object objQ7;
        int i18 = this.f27643a;
        boolean z15 = this.f27649g;
        m.a aVar3 = m.f135153a;
        Object obj3 = this.f27650h;
        Object obj4 = this.f27653k;
        Object obj5 = this.f27648f;
        Object obj6 = this.f27646d;
        Object obj7 = this.f27652j;
        Object obj8 = this.f27651i;
        int i19 = 6;
        Object obj9 = this.f27647e;
        Object obj10 = this.f27645c;
        Object obj11 = this.f27644b;
        switch (i18) {
            case 0:
                DateTime dateTime = (DateTime) obj11;
                tf0.i iVar = (tf0.i) obj10;
                l lVar3 = (l) obj6;
                l lVar4 = (l) obj9;
                p1 p1Var5 = (p1) obj5;
                sh0.d dVar = (sh0.d) obj4;
                String str3 = (String) obj3;
                l lVar5 = (l) obj8;
                l lVar6 = (l) obj7;
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    boolean zBooleanValue = ((Boolean) p1Var5.getF182175a()).booleanValue();
                    LocalDate localDate = dateTime.toLocalDate();
                    localDate.getClass();
                    g6.f.a aVar4 = g6.f.f75994b;
                    r rVarH = x2.h(x2.f(r.S, 1.0f), 290);
                    boolean zB5 = mVar.B(lVar3) | mVar.r(dateTime);
                    Object objQ8 = mVar.q();
                    if (zB5) {
                        objQ8 = new e(lVar3, dateTime, 0);
                        mVar.K(objQ8);
                    } else {
                        aVar3.getClass();
                        if (objQ8 == m.a.f135155b) {
                            objQ8 = new e(lVar3, dateTime, 0);
                            mVar.K(objQ8);
                        }
                    }
                    e23.a aVar5 = (e23.a) objQ8;
                    boolean zB6 = mVar.B(lVar4);
                    Object objQ9 = mVar.q();
                    if (zB6) {
                        objQ9 = new f(lVar4, 0);
                        mVar.K(objQ9);
                    } else {
                        aVar3.getClass();
                        if (objQ9 == m.a.f135155b) {
                            objQ9 = new f(lVar4, 0);
                            mVar.K(objQ9);
                        }
                    }
                    tf0.r.a(zBooleanValue, localDate, iVar, rVarH, aVar5, (l) objQ9, z3.f.c(885250477, new bt1.m(dVar, this.f27649g, str3, lVar5, lVar6, 2), mVar), mVar, (tf0.i.f164439d << 6) | 1575936);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                DateTime dateTime2 = (DateTime) obj11;
                tf0.i iVar2 = (tf0.i) obj10;
                l lVar7 = (l) obj6;
                l lVar8 = (l) obj9;
                p1 p1Var6 = (p1) obj5;
                z42.g gVar = (z42.g) obj7;
                String str4 = (String) obj3;
                e23.a aVar6 = (e23.a) obj4;
                l lVar9 = (l) obj8;
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    r rVarH2 = x2.h(x2.f(r.S, 1.0f), e52.g.f63088a);
                    boolean zBooleanValue2 = ((Boolean) p1Var6.getF182175a()).booleanValue();
                    LocalDate localDate2 = dateTime2.toLocalDate();
                    localDate2.getClass();
                    boolean zB7 = mVar2.B(lVar7) | mVar2.r(dateTime2);
                    Object objQ10 = mVar2.q();
                    if (zB7) {
                        objQ10 = new e(lVar7, dateTime2, 1);
                        mVar2.K(objQ10);
                    } else {
                        aVar3.getClass();
                        if (objQ10 == m.a.f135155b) {
                            objQ10 = new e(lVar7, dateTime2, 1);
                            mVar2.K(objQ10);
                        }
                    }
                    e23.a aVar7 = (e23.a) objQ10;
                    boolean zB8 = mVar2.B(lVar8);
                    Object objQ11 = mVar2.q();
                    if (zB8) {
                        objQ11 = new f(lVar8, 20);
                        mVar2.K(objQ11);
                    } else {
                        aVar3.getClass();
                        if (objQ11 == m.a.f135155b) {
                            objQ11 = new f(lVar8, 20);
                            mVar2.K(objQ11);
                        }
                    }
                    tf0.r.a(zBooleanValue2, localDate2, iVar2, rVarH2, aVar7, (l) objQ11, z3.f.c(-1379913616, new bt1.m(gVar, this.f27649g, str4, aVar6, lVar9), mVar2), mVar2, (tf0.i.f164439d << 6) | 1575936);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                fa0.g.a((fa0.h) obj11, (o1) obj10, (g90.a) obj9, (q92.x) obj8, this.f27649g, (e23.a) obj7, (p) obj5, (l) obj6, (ca0.u0) obj4, (e23.a) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                h21.j.c((x01.f) obj11, (o82.a) obj10, (List) obj9, this.f27649g, (g21.l) obj8, (List) obj7, (g21.b) obj5, (Integer) obj4, (v21.e) obj3, (l) obj6, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 4:
                NutritionActivity.g gVar2 = (NutritionActivity.g) obj11;
                x01.e eVar3 = (x01.e) obj10;
                e23.a aVar8 = (e23.a) obj6;
                e23.a aVar9 = (e23.a) obj9;
                e23.a aVar10 = (e23.a) obj8;
                e23.a aVar11 = (e23.a) obj7;
                p pVar = (p) obj5;
                Context context = (Context) obj4;
                x01.a aVar12 = (x01.a) obj3;
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    if (z15) {
                        dVarA = null;
                    } else {
                        int i24 = b3.a.f15501a;
                        dVarA = c3.a.a();
                    }
                    String strQ = gl1.y.Q(mVar3, R.string.lbl_nutrition);
                    boolean zB9 = mVar3.B(gVar2);
                    Object objQ12 = mVar3.q();
                    if (zB9) {
                        objQ12 = new k0(gVar2, 8);
                        mVar3.K(objQ12);
                    } else {
                        aVar3.getClass();
                        if (objQ12 == m.a.f135155b) {
                            objQ12 = new k0(gVar2, 8);
                            mVar3.K(objQ12);
                        }
                    }
                    z02.f.a(196608, 10, null, (e23.a) objQ12, z3.f.c(-417408477, new dd1.d(eVar3, aVar8, aVar9, aVar10, aVar11, pVar, context, aVar12, 5), mVar3), strQ, mVar3, dVarA);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                a0.d((x01.f) obj11, (o82.a) obj10, (ArrayList) obj9, this.f27649g, (List) obj8, (g21.r) obj7, (g21.c) obj5, (v21.e) obj4, (pi0.e) obj3, (l) obj6, (m) obj, p0.t(134217729));
                return Unit.INSTANCE;
            case 6:
                String str5 = (String) obj3;
                GearActivity.w wVar = (GearActivity.w) obj11;
                p1 p1Var7 = (p1) obj5;
                p1 p1Var8 = (p1) obj10;
                p1 p1Var9 = (p1) obj6;
                p1 p1Var10 = (p1) obj9;
                p1 p1Var11 = (p1) obj8;
                p pVar2 = (p) obj7;
                p1 p1Var12 = (p1) obj4;
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    boolean zB10 = mVar4.B(wVar);
                    Object objQ13 = mVar4.q();
                    if (zB10) {
                        objQ13 = new w0(wVar, 2);
                        mVar4.K(objQ13);
                    } else {
                        aVar3.getClass();
                        if (objQ13 == m.a.f135155b) {
                            objQ13 = new w0(wVar, 2);
                            mVar4.K(objQ13);
                        }
                    }
                    e23.a aVar13 = (e23.a) objQ13;
                    i53.f fVarA = i53.a.a(new i3("SAVE", gl1.y.Q(mVar4, R.string.lbl_save), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    boolean zB11 = mVar4.B(p1Var7) | mVar4.B(p1Var8);
                    boolean z16 = this.f27649g;
                    boolean zH = zB11 | mVar4.h(z16) | mVar4.B(p1Var9) | mVar4.B(p1Var10) | mVar4.B(p1Var11) | mVar4.B(pVar2) | mVar4.B(p1Var12);
                    Object objQ14 = mVar4.q();
                    if (zH) {
                        objQ14 = new gt1.j(z16, pVar2, p1Var7, p1Var8, p1Var9, p1Var10, p1Var11, p1Var12);
                        mVar4.K(objQ14);
                    } else {
                        aVar3.getClass();
                        if (objQ14 == m.a.f135155b) {
                            objQ14 = new gt1.j(z16, pVar2, p1Var7, p1Var8, p1Var9, p1Var10, p1Var11, p1Var12);
                            mVar4.K(objQ14);
                        }
                    }
                    z02.f.e(str5, null, aVar13, fVarA, (l) objQ14, mVar4, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 7:
                return a(obj, obj2);
            case 8:
                final LinkedHashMap linkedHashMap = (LinkedHashMap) obj11;
                h1 h1Var = (h1) obj10;
                e23.a aVar14 = (e23.a) obj8;
                e23.a aVar15 = (e23.a) obj7;
                p1 p1Var13 = (p1) obj5;
                n1 n1Var3 = (n1) obj4;
                o0 o0Var = (o0) obj3;
                l lVar10 = (l) obj6;
                l lVar11 = (l) obj9;
                m mVar5 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    m3.s sVarE = m3.l.e(mVar5);
                    if (z15) {
                        return Unit.INSTANCE;
                    }
                    Collection collectionValues3 = linkedHashMap.values();
                    if ((collectionValues3 instanceof Collection) && collectionValues3.isEmpty()) {
                        mVar5.C(-10945114);
                        collectionValues = linkedHashMap.values();
                        if (collectionValues instanceof Collection) {
                            it = collectionValues.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    mVar5.C(-10404381);
                                    collectionValues2 = linkedHashMap.values();
                                    if (collectionValues2 instanceof Collection) {
                                        it3 = collectionValues2.iterator();
                                        while (true) {
                                            if (!it3.hasNext()) {
                                                z14 = false;
                                            } else if (((zc.d) it3.next()).d().f196385a instanceof yc.z0.b) {
                                                z14 = true;
                                            }
                                        }
                                    } else {
                                        it3 = collectionValues2.iterator();
                                        while (true) {
                                            if (!it3.hasNext()) {
                                                z14 = false;
                                            } else if (((zc.d) it3.next()).d().f196385a instanceof yc.z0.b) {
                                                z14 = true;
                                            }
                                        }
                                    }
                                    r rVarD2 = x2.d(r.S, 1.0f);
                                    zR2 = mVar5.r(linkedHashMap);
                                    objQ2 = mVar5.q();
                                    if (zR2) {
                                        final int i25 = 1;
                                        objQ2 = new e23.a() { // from class: sk0.w0
                                            @Override // e23.a
                                            public final Object invoke() {
                                                switch (i25) {
                                                    case 0:
                                                        for (zc.d dVar2 : linkedHashMap.values()) {
                                                            if (dVar2.d().f196385a instanceof yc.z0.a) {
                                                                dVar2.e();
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        Iterator it5 = linkedHashMap.values().iterator();
                                                        while (it5.hasNext()) {
                                                            ((zc.d) it5.next()).e();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar5.K(objQ2);
                                    } else {
                                        aVar3.getClass();
                                        if (objQ2 == m.a.f135155b) {
                                            final int i26 = 1;
                                            objQ2 = new e23.a() { // from class: sk0.w0
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    switch (i26) {
                                                        case 0:
                                                            for (zc.d dVar2 : linkedHashMap.values()) {
                                                                if (dVar2.d().f196385a instanceof yc.z0.a) {
                                                                    dVar2.e();
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            Iterator it5 = linkedHashMap.values().iterator();
                                                            while (it5.hasNext()) {
                                                                ((zc.d) it5.next()).e();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar5.K(objQ2);
                                        }
                                    }
                                    m3.l.b(z14, (e23.a) objQ2, rVarD2, sVarE, null, z3.f.c(1336978616, new p003ji0.e(z14, sVarE, 11), mVar5), z3.f.c(-1815641095, new mw0.h(h1Var, aVar14, aVar15, p1Var13, 20), mVar5), mVar5, 1769856, 16);
                                    mVar5.f();
                                } else if (((zc.d) it.next()).d().f196385a instanceof yc.z0.a) {
                                    mVar5.C(-10897281);
                                    r rVarD3 = x2.d(r.S, 1.0f);
                                    String strQ2 = gl1.y.Q(mVar5, R.string.problem_loading_refresh);
                                    zR = mVar5.r(linkedHashMap);
                                    objQ = mVar5.q();
                                    if (zR) {
                                        final int i27 = 0;
                                        objQ = new e23.a() { // from class: sk0.w0
                                            @Override // e23.a
                                            public final Object invoke() {
                                                switch (i27) {
                                                    case 0:
                                                        for (zc.d dVar2 : linkedHashMap.values()) {
                                                            if (dVar2.d().f196385a instanceof yc.z0.a) {
                                                                dVar2.e();
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        Iterator it5 = linkedHashMap.values().iterator();
                                                        while (it5.hasNext()) {
                                                            ((zc.d) it5.next()).e();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar5.K(objQ);
                                    } else {
                                        aVar3.getClass();
                                        if (objQ == m.a.f135155b) {
                                            final int i28 = 0;
                                            objQ = new e23.a() { // from class: sk0.w0
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    switch (i28) {
                                                        case 0:
                                                            for (zc.d dVar2 : linkedHashMap.values()) {
                                                                if (dVar2.d().f196385a instanceof yc.z0.a) {
                                                                    dVar2.e();
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            Iterator it5 = linkedHashMap.values().iterator();
                                                            while (it5.hasNext()) {
                                                                ((zc.d) it5.next()).e();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar5.K(objQ);
                                        }
                                    }
                                    y0.b(rVarD3, strQ2, (e23.a) objQ, mVar5, i19);
                                    mVar5.f();
                                } else {
                                    i19 = 6;
                                }
                            }
                        } else {
                            it = collectionValues.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    mVar5.C(-10404381);
                                    collectionValues2 = linkedHashMap.values();
                                    if (collectionValues2 instanceof Collection) {
                                        it3 = collectionValues2.iterator();
                                        while (true) {
                                            if (!it3.hasNext()) {
                                                z14 = false;
                                            } else if (((zc.d) it3.next()).d().f196385a instanceof yc.z0.b) {
                                                z14 = true;
                                            }
                                        }
                                    } else {
                                        it3 = collectionValues2.iterator();
                                        while (true) {
                                            if (!it3.hasNext()) {
                                                z14 = false;
                                            } else if (((zc.d) it3.next()).d().f196385a instanceof yc.z0.b) {
                                                z14 = true;
                                            }
                                        }
                                    }
                                    r rVarD4 = x2.d(r.S, 1.0f);
                                    zR2 = mVar5.r(linkedHashMap);
                                    objQ2 = mVar5.q();
                                    if (zR2) {
                                        aVar3.getClass();
                                        if (objQ2 == m.a.f135155b) {
                                            final int i29 = 1;
                                            objQ2 = new e23.a() { // from class: sk0.w0
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    switch (i29) {
                                                        case 0:
                                                            for (zc.d dVar2 : linkedHashMap.values()) {
                                                                if (dVar2.d().f196385a instanceof yc.z0.a) {
                                                                    dVar2.e();
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            Iterator it5 = linkedHashMap.values().iterator();
                                                            while (it5.hasNext()) {
                                                                ((zc.d) it5.next()).e();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar5.K(objQ2);
                                        }
                                    } else {
                                        final int i210 = 1;
                                        objQ2 = new e23.a() { // from class: sk0.w0
                                            @Override // e23.a
                                            public final Object invoke() {
                                                switch (i210) {
                                                    case 0:
                                                        for (zc.d dVar2 : linkedHashMap.values()) {
                                                            if (dVar2.d().f196385a instanceof yc.z0.a) {
                                                                dVar2.e();
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        Iterator it5 = linkedHashMap.values().iterator();
                                                        while (it5.hasNext()) {
                                                            ((zc.d) it5.next()).e();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar5.K(objQ2);
                                    }
                                    m3.l.b(z14, (e23.a) objQ2, rVarD4, sVarE, null, z3.f.c(1336978616, new p003ji0.e(z14, sVarE, 11), mVar5), z3.f.c(-1815641095, new mw0.h(h1Var, aVar14, aVar15, p1Var13, 20), mVar5), mVar5, 1769856, 16);
                                    mVar5.f();
                                } else if (((zc.d) it.next()).d().f196385a instanceof yc.z0.a) {
                                    mVar5.C(-10897281);
                                    r rVarD5 = x2.d(r.S, 1.0f);
                                    String strQ3 = gl1.y.Q(mVar5, R.string.problem_loading_refresh);
                                    zR = mVar5.r(linkedHashMap);
                                    objQ = mVar5.q();
                                    if (zR) {
                                        aVar3.getClass();
                                        if (objQ == m.a.f135155b) {
                                            final int i211 = 0;
                                            objQ = new e23.a() { // from class: sk0.w0
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    switch (i211) {
                                                        case 0:
                                                            for (zc.d dVar2 : linkedHashMap.values()) {
                                                                if (dVar2.d().f196385a instanceof yc.z0.a) {
                                                                    dVar2.e();
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            Iterator it5 = linkedHashMap.values().iterator();
                                                            while (it5.hasNext()) {
                                                                ((zc.d) it5.next()).e();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar5.K(objQ);
                                        }
                                    } else {
                                        final int i212 = 0;
                                        objQ = new e23.a() { // from class: sk0.w0
                                            @Override // e23.a
                                            public final Object invoke() {
                                                switch (i212) {
                                                    case 0:
                                                        for (zc.d dVar2 : linkedHashMap.values()) {
                                                            if (dVar2.d().f196385a instanceof yc.z0.a) {
                                                                dVar2.e();
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        Iterator it5 = linkedHashMap.values().iterator();
                                                        while (it5.hasNext()) {
                                                            ((zc.d) it5.next()).e();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar5.K(objQ);
                                    }
                                    y0.b(rVarD5, strQ3, (e23.a) objQ, mVar5, i19);
                                    mVar5.f();
                                } else {
                                    i19 = 6;
                                }
                            }
                        }
                        mVar5.f();
                    } else {
                        Iterator it5 = collectionValues3.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                mVar5.C(-10945114);
                                collectionValues = linkedHashMap.values();
                                if ((collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                                    it = collectionValues.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            mVar5.C(-10404381);
                                            collectionValues2 = linkedHashMap.values();
                                            if ((collectionValues2 instanceof Collection) || !collectionValues2.isEmpty()) {
                                                it3 = collectionValues2.iterator();
                                                while (true) {
                                                    if (!it3.hasNext()) {
                                                        z14 = false;
                                                    } else if (((zc.d) it3.next()).d().f196385a instanceof yc.z0.b) {
                                                        z14 = true;
                                                    }
                                                }
                                            } else {
                                                z14 = false;
                                            }
                                            r rVarD6 = x2.d(r.S, 1.0f);
                                            zR2 = mVar5.r(linkedHashMap);
                                            objQ2 = mVar5.q();
                                            if (zR2) {
                                                aVar3.getClass();
                                                if (objQ2 == m.a.f135155b) {
                                                    final int i213 = 1;
                                                    objQ2 = new e23.a() { // from class: sk0.w0
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i213) {
                                                                case 0:
                                                                    for (zc.d dVar2 : linkedHashMap.values()) {
                                                                        if (dVar2.d().f196385a instanceof yc.z0.a) {
                                                                            dVar2.e();
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    Iterator it6 = linkedHashMap.values().iterator();
                                                                    while (it6.hasNext()) {
                                                                        ((zc.d) it6.next()).e();
                                                                    }
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar5.K(objQ2);
                                                }
                                            } else {
                                                final int i214 = 1;
                                                objQ2 = new e23.a() { // from class: sk0.w0
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        switch (i214) {
                                                            case 0:
                                                                for (zc.d dVar2 : linkedHashMap.values()) {
                                                                    if (dVar2.d().f196385a instanceof yc.z0.a) {
                                                                        dVar2.e();
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                Iterator it6 = linkedHashMap.values().iterator();
                                                                while (it6.hasNext()) {
                                                                    ((zc.d) it6.next()).e();
                                                                }
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar5.K(objQ2);
                                            }
                                            m3.l.b(z14, (e23.a) objQ2, rVarD6, sVarE, null, z3.f.c(1336978616, new p003ji0.e(z14, sVarE, 11), mVar5), z3.f.c(-1815641095, new mw0.h(h1Var, aVar14, aVar15, p1Var13, 20), mVar5), mVar5, 1769856, 16);
                                            mVar5.f();
                                        } else if (((zc.d) it.next()).d().f196385a instanceof yc.z0.a) {
                                            mVar5.C(-10897281);
                                            r rVarD7 = x2.d(r.S, 1.0f);
                                            String strQ4 = gl1.y.Q(mVar5, R.string.problem_loading_refresh);
                                            zR = mVar5.r(linkedHashMap);
                                            objQ = mVar5.q();
                                            if (zR) {
                                                aVar3.getClass();
                                                if (objQ == m.a.f135155b) {
                                                    final int i215 = 0;
                                                    objQ = new e23.a() { // from class: sk0.w0
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i215) {
                                                                case 0:
                                                                    for (zc.d dVar2 : linkedHashMap.values()) {
                                                                        if (dVar2.d().f196385a instanceof yc.z0.a) {
                                                                            dVar2.e();
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    Iterator it6 = linkedHashMap.values().iterator();
                                                                    while (it6.hasNext()) {
                                                                        ((zc.d) it6.next()).e();
                                                                    }
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar5.K(objQ);
                                                }
                                            } else {
                                                final int i216 = 0;
                                                objQ = new e23.a() { // from class: sk0.w0
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        switch (i216) {
                                                            case 0:
                                                                for (zc.d dVar2 : linkedHashMap.values()) {
                                                                    if (dVar2.d().f196385a instanceof yc.z0.a) {
                                                                        dVar2.e();
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                Iterator it6 = linkedHashMap.values().iterator();
                                                                while (it6.hasNext()) {
                                                                    ((zc.d) it6.next()).e();
                                                                }
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar5.K(objQ);
                                            }
                                            y0.b(rVarD7, strQ4, (e23.a) objQ, mVar5, i19);
                                            mVar5.f();
                                        } else {
                                            i19 = 6;
                                        }
                                    }
                                } else {
                                    mVar5.C(-10404381);
                                    collectionValues2 = linkedHashMap.values();
                                    if (collectionValues2 instanceof Collection) {
                                        it3 = collectionValues2.iterator();
                                        while (true) {
                                            if (!it3.hasNext()) {
                                                z14 = false;
                                            } else if (((zc.d) it3.next()).d().f196385a instanceof yc.z0.b) {
                                                z14 = true;
                                            }
                                        }
                                    } else {
                                        it3 = collectionValues2.iterator();
                                        while (true) {
                                            if (!it3.hasNext()) {
                                                z14 = false;
                                            } else if (((zc.d) it3.next()).d().f196385a instanceof yc.z0.b) {
                                                z14 = true;
                                            }
                                        }
                                    }
                                    r rVarD8 = x2.d(r.S, 1.0f);
                                    zR2 = mVar5.r(linkedHashMap);
                                    objQ2 = mVar5.q();
                                    if (zR2) {
                                        aVar3.getClass();
                                        if (objQ2 == m.a.f135155b) {
                                            final int i217 = 1;
                                            objQ2 = new e23.a() { // from class: sk0.w0
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    switch (i217) {
                                                        case 0:
                                                            for (zc.d dVar2 : linkedHashMap.values()) {
                                                                if (dVar2.d().f196385a instanceof yc.z0.a) {
                                                                    dVar2.e();
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            Iterator it6 = linkedHashMap.values().iterator();
                                                            while (it6.hasNext()) {
                                                                ((zc.d) it6.next()).e();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar5.K(objQ2);
                                        }
                                    } else {
                                        final int i218 = 1;
                                        objQ2 = new e23.a() { // from class: sk0.w0
                                            @Override // e23.a
                                            public final Object invoke() {
                                                switch (i218) {
                                                    case 0:
                                                        for (zc.d dVar2 : linkedHashMap.values()) {
                                                            if (dVar2.d().f196385a instanceof yc.z0.a) {
                                                                dVar2.e();
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        Iterator it6 = linkedHashMap.values().iterator();
                                                        while (it6.hasNext()) {
                                                            ((zc.d) it6.next()).e();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar5.K(objQ2);
                                    }
                                    m3.l.b(z14, (e23.a) objQ2, rVarD8, sVarE, null, z3.f.c(1336978616, new p003ji0.e(z14, sVarE, 11), mVar5), z3.f.c(-1815641095, new mw0.h(h1Var, aVar14, aVar15, p1Var13, 20), mVar5), mVar5, 1769856, 16);
                                    mVar5.f();
                                }
                                mVar5.f();
                            } else if (((zc.d) it5.next()).b() >= 1) {
                                mVar5.C(-9083285);
                                y1 y1Var = y1.f16902a;
                                mVar5.C(276793214);
                                w13.c<b1.b> cVar2 = b1.b.f159631e;
                                ArrayList arrayList = new ArrayList(p13.y.r(cVar2, 10));
                                for (b1.b bVar3 : cVar2) {
                                    bVar3.getClass();
                                    x1 x1Var6 = n.f135158a;
                                    int i30 = b1.b.a.f159632a[bVar3.ordinal()];
                                    if (i30 == 1) {
                                        i14 = 274897034;
                                        i15 = R.string.concept_gear;
                                    } else if (i30 == 2) {
                                        i14 = 274899247;
                                        i15 = R.string.title_collections;
                                    } else {
                                        if (i30 != 3) {
                                            throw n23.j.m(mVar5, 274896013);
                                        }
                                        i14 = 274901486;
                                        i15 = R.string.lbl_gear_retired;
                                    }
                                    arrayList.add(sn.a.h(mVar5, i14, i15, mVar5));
                                }
                                mVar5.f();
                                i53.f fVarJ = i53.a.j(arrayList);
                                int intValue = n1Var3.getIntValue();
                                z3.e eVarC = z3.f.c(-1868695892, new et1.u(linkedHashMap, n1Var3, o0Var, lVar10, lVar11, h1Var, aVar14, aVar15, p1Var13, 4), mVar5);
                                y1 y1Var2 = y1.f16902a;
                                y1Var.c(fVarJ, intValue, true, true, true, 0L, 0L, eVarC, mVar5, 12610944, 96);
                                mVar5.f();
                            }
                        }
                    }
                    x1 x1Var7 = n.f135158a;
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 9:
                DateTime dateTime3 = (DateTime) obj11;
                tf0.i iVar3 = (tf0.i) obj10;
                l lVar12 = (l) obj6;
                l lVar13 = (l) obj9;
                p1 p1Var14 = (p1) obj5;
                jq1.g gVar3 = (jq1.g) obj4;
                String str6 = (String) obj3;
                l lVar14 = (l) obj8;
                l lVar15 = (l) obj7;
                m mVar6 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                    r rVarH3 = x2.h(x2.f(r.S, 1.0f), sq1.d.f160533a);
                    boolean zBooleanValue3 = ((Boolean) p1Var14.getF182175a()).booleanValue();
                    LocalDate localDate3 = dateTime3.toLocalDate();
                    localDate3.getClass();
                    boolean zB12 = mVar6.B(lVar12) | mVar6.r(dateTime3);
                    Object objQ15 = mVar6.q();
                    if (zB12) {
                        objQ15 = new e(lVar12, dateTime3, 10);
                        mVar6.K(objQ15);
                    } else {
                        aVar3.getClass();
                        if (objQ15 == m.a.f135155b) {
                            objQ15 = new e(lVar12, dateTime3, 10);
                            mVar6.K(objQ15);
                        }
                    }
                    e23.a aVar16 = (e23.a) objQ15;
                    boolean zB13 = mVar6.B(lVar13);
                    Object objQ16 = mVar6.q();
                    if (zB13) {
                        objQ16 = new qe2.c(lVar13, 23);
                        mVar6.K(objQ16);
                    } else {
                        aVar3.getClass();
                        if (objQ16 == m.a.f135155b) {
                            objQ16 = new qe2.c(lVar13, 23);
                            mVar6.K(objQ16);
                        }
                    }
                    tf0.r.a(zBooleanValue3, localDate3, iVar3, rVarH3, aVar16, (l) objQ16, z3.f.c(-238310991, new bt1.m(gVar3, this.f27649g, str6, lVar14, lVar15, 27), mVar6), mVar6, (tf0.i.f164439d << 6) | 1575936);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            default:
                o12.d dVar2 = (o12.d) obj11;
                Context context2 = (Context) obj10;
                e23.a aVar17 = (e23.a) obj9;
                q qVar = (q) obj8;
                b0 b0Var4 = (b0) obj7;
                l lVar16 = (l) obj6;
                p1 p1Var15 = (p1) obj5;
                p1 p1Var16 = (p1) obj4;
                n1 n1Var4 = (n1) obj3;
                m mVar7 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    List<m12.s> list = dVar2.f128543d;
                    if (dVar2.f128541b && list.isEmpty()) {
                        return Unit.INSTANCE;
                    }
                    if (dVar2.f128540a && hb2.i.a(context2)) {
                        Toast.makeText(context2, R.string.txt_error_occurred, 0).show();
                        aVar17.invoke();
                    }
                    r.a aVar18 = r.S;
                    r rVarB = a2.b(x2.d(aVar18, 1.0f), a2.a(mVar7), true);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA2 = y.a(kVar, h4.d.a.f81536n, mVar7, 0);
                    int iHashCode3 = Long.hashCode(mVar7.getU());
                    i2 i2VarX3 = mVar7.x();
                    r rVarC3 = k.c(rVarB, mVar7);
                    h5.g.V.getClass();
                    e0.a aVar19 = h5.g.a.f81805b;
                    if (mVar7.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar7.z();
                    if (mVar7.getT()) {
                        mVar7.M(aVar19);
                    } else {
                        mVar7.c();
                    }
                    h5.g.a.e eVar4 = h5.g.a.f81810g;
                    b4.c(eVar4, zVarA2, mVar7);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX3, mVar7);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar7.getT()) {
                        n1Var = n1Var4;
                        p1Var = p1Var16;
                    } else {
                        p1Var = p1Var16;
                        n1Var = n1Var4;
                        if (!s.g(mVar7.q(), Integer.valueOf(iHashCode3))) {
                        }
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC3, mVar7);
                        b0Var = c2.b0.f22601a;
                        lVar = lVar16;
                        b0Var2 = b0Var4;
                        r rVarE = u1.n.e(x2.f(aVar18, 1.0f), vb.h.e(d92.b.f58623a, mVar7), m1.f128891a);
                        d92.b.f58625c.getClass();
                        eVar = j92.b.f97899b;
                        r rVarY = c2.l.y(rVarE, eVar.f97921f);
                        aVar = h4.d.a.f81537o;
                        zVarA = y.a(c2.j.f22696f, aVar, mVar7, 54);
                        iHashCode = Long.hashCode(mVar7.getU());
                        p1Var2 = p1Var15;
                        i2VarX = mVar7.x();
                        rVarC = k.c(rVarY, mVar7);
                        if (mVar7.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar7.z();
                        if (mVar7.getT()) {
                            mVar7.M(aVar19);
                        } else {
                            mVar7.c();
                        }
                        b4.c(eVar4, zVarA, mVar7);
                        b4.c(c1623g, i2VarX, mVar7);
                        if (mVar7.getT() || !s.g(mVar7.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar7, iHashCode, bVar4);
                        }
                        b4.c(fVar, rVarC, mVar7);
                        i16 = 9;
                        b12.k.b(null, null, w12.g.f181275a, dVar2.f128542c, mVar7, (b12.b.f14385f << 9) | 384, 19);
                        String strQ5 = gl1.y.Q(mVar7, R.string.lbl_change);
                        zR3 = mVar7.r(qVar) | mVar7.r(context2);
                        objQ3 = mVar7.q();
                        if (zR3) {
                            objQ3 = new fv0.d(qVar, context2, 7);
                            mVar7.K(objQ3);
                        } else {
                            aVar3.getClass();
                            if (objQ3 == m.a.f135155b) {
                                objQ3 = new fv0.d(qVar, context2, 7);
                                mVar7.K(objQ3);
                            }
                        }
                        r rVarB2 = b0Var.b(c2.l.C(x2.f(u1.w.d(aVar18, false, null, null, (e23.a) objQ3, 15), 1.0f), 0.0f, eVar.f97917b, 0.0f, 0.0f, 13), aVar);
                        d6.h.f57752b.getClass();
                        d6.h hVarA = d6.h.a(d6.h.f57755e);
                        d92.b.f58624b.getClass();
                        mh.c(strQ5, rVarB2, 0L, null, 0L, null, 0L, hVarA, 0L, 0, false, 0, 0, null, x0.a(j92.f.f97933j, ds.e0.e(mVar7), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), mVar7, 0, 0, 130044);
                        mVar7.y();
                        mVar7.C(1006923690);
                        it4 = list.iterator();
                        while (it4.hasNext()) {
                            sVar = (m12.s) it4.next();
                            if (sVar instanceof m12.s.a) {
                                mVar7.C(48442002);
                                r1.b(sVar.a(context2), null, mVar7, 0, 2);
                                mVar7.f();
                                it4 = it4;
                                i17 = i16;
                                b0Var3 = b0Var2;
                                lVar2 = lVar;
                                p1Var3 = p1Var2;
                            } else if (sVar instanceof m12.s.b) {
                                mVar7.C(48602861);
                                String strA = sVar.a(context2);
                                bVar2 = (m12.s.b) sVar;
                                c2VarN = p0.n(bVar2.f115861b);
                                if (z15 || bVar2.f115860a != t.f115871l) {
                                    p1Var3 = p1Var2;
                                } else {
                                    p1Var3 = p1Var2;
                                    p1Var3.setValue(Boolean.TRUE);
                                }
                                t0 t0Var = t0.f16792a;
                                b0Var3 = b0Var2;
                                r rVarA = m4.e.a(r.S, b0Var3);
                                String str7 = (String) c2VarN.getF182175a();
                                lVar2 = lVar;
                                zB4 = mVar7.B(sVar) | mVar7.B(c2VarN) | mVar7.B(lVar2);
                                objQ7 = mVar7.q();
                                if (zB4) {
                                    objQ7 = new s0(lVar2, 22, bVar2, c2VarN);
                                    mVar7.K(objQ7);
                                } else {
                                    aVar3.getClass();
                                    if (objQ7 == m.a.f135155b) {
                                        objQ7 = new s0(lVar2, 22, bVar2, c2VarN);
                                        mVar7.K(objQ7);
                                    }
                                }
                                v.f188954b.getClass();
                                t0Var.i(rVarA, strA, str7, 128, false, (l) objQ7, null, v.f188955c, 0, null, mVar7, 12610560, 832);
                                mVar7.f();
                                it4 = it4;
                                i17 = i16;
                            } else {
                                b0Var3 = b0Var2;
                                lVar2 = lVar;
                                p1Var3 = p1Var2;
                                if (sVar instanceof m12.s.c) {
                                    mVar7.C(49661821);
                                    cVar = (m12.s.c) sVar;
                                    num2 = cVar.f115863b;
                                    if (num2 == null) {
                                        mVar7.C(49628681);
                                        mVar7.f();
                                        str2 = null;
                                    } else {
                                        mVar7.C(49628682);
                                        String strQ6 = gl1.y.Q(mVar7, num2.intValue());
                                        mVar7.f();
                                        str2 = strQ6;
                                    }
                                    if (cVar.f115862a == t.Q0) {
                                        mVar7.C(49812884);
                                        if (((Boolean) p1Var.getF182175a()).booleanValue() || n1Var.getIntValue() <= 0) {
                                            n1Var2 = n1Var;
                                            mVar7.C(50238452);
                                            mVar7.f();
                                            rVarD = r.S;
                                        } else {
                                            mVar7.C(49888865);
                                            r.a aVar20 = r.S;
                                            Object objQ17 = mVar7.q();
                                            aVar3.getClass();
                                            if (objQ17 == m.a.f135155b) {
                                                n1Var2 = n1Var;
                                                objQ17 = new cw1.s0(n1Var2, 2);
                                                mVar7.K(objQ17);
                                            } else {
                                                n1Var2 = n1Var;
                                            }
                                            rVarD = g0.d(aVar20, (e23.q) objQ17);
                                            mVar7.f();
                                        }
                                        h4.d.f81522a.getClass();
                                        z0VarD = c2.q.d(h4.d.a.f81524b, false);
                                        x1 x1Var10 = n.f135158a;
                                        iHashCode2 = Long.hashCode(mVar7.getU());
                                        i2VarX2 = mVar7.x();
                                        rVarC2 = k.c(rVarD, mVar7);
                                        h5.g.V.getClass();
                                        aVar2 = h5.g.a.f81805b;
                                        if (mVar7.F() != null) {
                                            p0.l();
                                            throw null;
                                        }
                                        mVar7.z();
                                        if (mVar7.getT()) {
                                            mVar7.M(aVar2);
                                        } else {
                                            mVar7.c();
                                        }
                                        b4.c(h5.g.a.f81810g, z0VarD, mVar7);
                                        b4.c(h5.g.a.f81809f, i2VarX2, mVar7);
                                        bVar = h5.g.a.f81813j;
                                        if (mVar7.getT() || !s.g(mVar7.q(), Integer.valueOf(iHashCode2))) {
                                            v.h.z(iHashCode2, mVar7, iHashCode2, bVar);
                                        }
                                        b4.c(h5.g.a.f81807d, rVarC2, mVar7);
                                        c2.u uVar = c2.u.f22885a;
                                        String strQ7 = gl1.y.Q(mVar7, R.string.you_can_update_account_access);
                                        w1 w1Var = w1.TopEnd;
                                        l72.x1 x1Var11 = l72.x1.EndSmall;
                                        long j8 = (((long) 16) & 4294967295L) | (((long) (-160)) << 32);
                                        g6.k.a aVar21 = g6.k.f76003b;
                                        boolean zBooleanValue4 = ((Boolean) p1Var.getF182175a()).booleanValue();
                                        p1Var4 = p1Var;
                                        zB3 = mVar7.B(p1Var4);
                                        objQ6 = mVar7.q();
                                        if (zB3) {
                                            objQ6 = new vd0.c(p1Var4, 26);
                                            mVar7.K(objQ6);
                                        } else {
                                            aVar3.getClass();
                                            if (objQ6 == m.a.f135155b) {
                                                objQ6 = new vd0.c(p1Var4, 26);
                                                mVar7.K(objQ6);
                                            }
                                        }
                                        n1 n1Var5 = n1Var2;
                                        p1Var = p1Var4;
                                        n1Var = n1Var5;
                                        a1.a(strQ7, w1Var, x1Var11, 150, j8, zBooleanValue4, (e23.a) objQ6, z3.f.c(685708920, new ak0.h((Object) cVar, context2, (Object) str2, p1Var4, (Object) lVar2, (p1) n1Var5, 27), mVar7), mVar7, 100887936, 2);
                                        mVar7.y();
                                        mVar7.f();
                                        i17 = 9;
                                    } else {
                                        mVar7.C(51941592);
                                        String strA2 = sVar.a(context2);
                                        String strB = sVar.b(context2);
                                        z3.e eVarC2 = z3.f.c(1795675738, new w12.e(cVar, 0), mVar7);
                                        zB2 = mVar7.B(sVar) | mVar7.B(lVar2);
                                        objQ5 = mVar7.q();
                                        if (zB2) {
                                            i17 = 9;
                                            objQ5 = new vv0.n(i17, lVar2, cVar);
                                            mVar7.K(objQ5);
                                        } else {
                                            aVar3.getClass();
                                            if (objQ5 == m.a.f135155b) {
                                                i17 = 9;
                                                objQ5 = new vv0.n(i17, lVar2, cVar);
                                                mVar7.K(objQ5);
                                            } else {
                                                i17 = 9;
                                            }
                                        }
                                        x12.a.a(null, strA2, strB, str2, eVarC2, (e23.a) objQ5, mVar7, 24576, 1);
                                        mVar7.f();
                                    }
                                    mVar7.f();
                                } else {
                                    it4 = it4;
                                    i17 = i16;
                                    if (sVar instanceof m12.s.e) {
                                        mVar7.C(52552075);
                                        eVar2 = (m12.s.e) sVar;
                                        num = eVar2.f115866b;
                                        if (num == null) {
                                            mVar7.C(52577897);
                                            mVar7.f();
                                            str = null;
                                        } else {
                                            mVar7.C(52577898);
                                            String strQ8 = gl1.y.Q(mVar7, num.intValue());
                                            mVar7.f();
                                            str = strQ8;
                                        }
                                        String strA3 = sVar.a(context2);
                                        String strB2 = sVar.b(context2);
                                        z3.e eVarC3 = z3.f.c(-370959809, new vy0.e(eVar2, 3), mVar7);
                                        zB = mVar7.B(sVar) | mVar7.B(lVar2);
                                        objQ4 = mVar7.q();
                                        if (zB) {
                                            objQ4 = new vv0.n(10, lVar2, eVar2);
                                            mVar7.K(objQ4);
                                        } else {
                                            aVar3.getClass();
                                            if (objQ4 == m.a.f135155b) {
                                                objQ4 = new vv0.n(10, lVar2, eVar2);
                                                mVar7.K(objQ4);
                                            }
                                        }
                                        x12.a.a(null, strA3, strB2, str, eVarC3, (e23.a) objQ4, mVar7, 24576, 1);
                                        mVar7.f();
                                    } else {
                                        if (sVar instanceof m12.s.d) {
                                            throw n23.j.m(mVar7, -1245360149);
                                        }
                                        mVar7.C(53589583);
                                        r.a aVar22 = r.S;
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        c2.l.f(x2.h(aVar22, j92.b.f97899b.f97920e), mVar7);
                                        mVar7.f();
                                    }
                                }
                            }
                            i16 = i17;
                            p1Var2 = p1Var3;
                            lVar = lVar2;
                            b0Var2 = b0Var3;
                            it4 = it4;
                        }
                        mVar7.f();
                        r.a aVar23 = r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        c2.l.f(x2.h(aVar23, j92.b.f97899b.f97920e), mVar7);
                        mVar7.y();
                        x1 x1Var12 = n.f135158a;
                    }
                    v.h.z(iHashCode3, mVar7, iHashCode3, bVar4);
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC3, mVar7);
                    b0Var = c2.b0.f22601a;
                    lVar = lVar16;
                    b0Var2 = b0Var4;
                    r rVarE2 = u1.n.e(x2.f(aVar18, 1.0f), vb.h.e(d92.b.f58623a, mVar7), m1.f128891a);
                    d92.b.f58625c.getClass();
                    eVar = j92.b.f97899b;
                    r rVarY2 = c2.l.y(rVarE2, eVar.f97921f);
                    aVar = h4.d.a.f81537o;
                    zVarA = y.a(c2.j.f22696f, aVar, mVar7, 54);
                    iHashCode = Long.hashCode(mVar7.getU());
                    p1Var2 = p1Var15;
                    i2VarX = mVar7.x();
                    rVarC = k.c(rVarY2, mVar7);
                    if (mVar7.F() != null) {
                        p0.l();
                        throw null;
                    }
                    mVar7.z();
                    if (mVar7.getT()) {
                        mVar7.M(aVar19);
                    } else {
                        mVar7.c();
                    }
                    b4.c(eVar4, zVarA, mVar7);
                    b4.c(c1623g, i2VarX, mVar7);
                    if (mVar7.getT()) {
                        v.h.z(iHashCode, mVar7, iHashCode, bVar4);
                    } else {
                        v.h.z(iHashCode, mVar7, iHashCode, bVar4);
                    }
                    b4.c(fVar, rVarC, mVar7);
                    i16 = 9;
                    b12.k.b(null, null, w12.g.f181275a, dVar2.f128542c, mVar7, (b12.b.f14385f << 9) | 384, 19);
                    String strQ9 = gl1.y.Q(mVar7, R.string.lbl_change);
                    zR3 = mVar7.r(qVar) | mVar7.r(context2);
                    objQ3 = mVar7.q();
                    if (zR3) {
                        aVar3.getClass();
                        if (objQ3 == m.a.f135155b) {
                            objQ3 = new fv0.d(qVar, context2, 7);
                            mVar7.K(objQ3);
                        }
                    } else {
                        objQ3 = new fv0.d(qVar, context2, 7);
                        mVar7.K(objQ3);
                    }
                    r rVarB3 = b0Var.b(c2.l.C(x2.f(u1.w.d(aVar18, false, null, null, (e23.a) objQ3, 15), 1.0f), 0.0f, eVar.f97917b, 0.0f, 0.0f, 13), aVar);
                    d6.h.f57752b.getClass();
                    d6.h hVarA2 = d6.h.a(d6.h.f57755e);
                    d92.b.f58624b.getClass();
                    mh.c(strQ9, rVarB3, 0L, null, 0L, null, 0L, hVarA2, 0L, 0, false, 0, 0, null, x0.a(j92.f.f97933j, ds.e0.e(mVar7), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), mVar7, 0, 0, 130044);
                    mVar7.y();
                    mVar7.C(1006923690);
                    it4 = list.iterator();
                    while (it4.hasNext()) {
                        sVar = (m12.s) it4.next();
                        if (sVar instanceof m12.s.a) {
                            mVar7.C(48442002);
                            r1.b(sVar.a(context2), null, mVar7, 0, 2);
                            mVar7.f();
                            it4 = it4;
                            i17 = i16;
                            b0Var3 = b0Var2;
                            lVar2 = lVar;
                            p1Var3 = p1Var2;
                        } else if (sVar instanceof m12.s.b) {
                            mVar7.C(48602861);
                            String strA4 = sVar.a(context2);
                            bVar2 = (m12.s.b) sVar;
                            c2VarN = p0.n(bVar2.f115861b);
                            if (z15) {
                                p1Var3 = p1Var2;
                            } else {
                                p1Var3 = p1Var2;
                            }
                            t0 t0Var2 = t0.f16792a;
                            b0Var3 = b0Var2;
                            r rVarA2 = m4.e.a(r.S, b0Var3);
                            String str8 = (String) c2VarN.getF182175a();
                            lVar2 = lVar;
                            zB4 = mVar7.B(sVar) | mVar7.B(c2VarN) | mVar7.B(lVar2);
                            objQ7 = mVar7.q();
                            if (zB4) {
                                aVar3.getClass();
                                if (objQ7 == m.a.f135155b) {
                                    objQ7 = new s0(lVar2, 22, bVar2, c2VarN);
                                    mVar7.K(objQ7);
                                }
                            } else {
                                objQ7 = new s0(lVar2, 22, bVar2, c2VarN);
                                mVar7.K(objQ7);
                            }
                            v.f188954b.getClass();
                            t0Var2.i(rVarA2, strA4, str8, 128, false, (l) objQ7, null, v.f188955c, 0, null, mVar7, 12610560, 832);
                            mVar7.f();
                            it4 = it4;
                            i17 = i16;
                        } else {
                            b0Var3 = b0Var2;
                            lVar2 = lVar;
                            p1Var3 = p1Var2;
                            if (sVar instanceof m12.s.c) {
                                mVar7.C(49661821);
                                cVar = (m12.s.c) sVar;
                                num2 = cVar.f115863b;
                                if (num2 == null) {
                                    mVar7.C(49628681);
                                    mVar7.f();
                                    str2 = null;
                                } else {
                                    mVar7.C(49628682);
                                    String strQ10 = gl1.y.Q(mVar7, num2.intValue());
                                    mVar7.f();
                                    str2 = strQ10;
                                }
                                if (cVar.f115862a == t.Q0) {
                                    mVar7.C(49812884);
                                    if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                                        n1Var2 = n1Var;
                                        mVar7.C(50238452);
                                        mVar7.f();
                                        rVarD = r.S;
                                    } else {
                                        n1Var2 = n1Var;
                                        mVar7.C(50238452);
                                        mVar7.f();
                                        rVarD = r.S;
                                    }
                                    h4.d.f81522a.getClass();
                                    z0VarD = c2.q.d(h4.d.a.f81524b, false);
                                    x1 x1Var13 = n.f135158a;
                                    iHashCode2 = Long.hashCode(mVar7.getU());
                                    i2VarX2 = mVar7.x();
                                    rVarC2 = k.c(rVarD, mVar7);
                                    h5.g.V.getClass();
                                    aVar2 = h5.g.a.f81805b;
                                    if (mVar7.F() != null) {
                                        p0.l();
                                        throw null;
                                    }
                                    mVar7.z();
                                    if (mVar7.getT()) {
                                        mVar7.M(aVar2);
                                    } else {
                                        mVar7.c();
                                    }
                                    b4.c(h5.g.a.f81810g, z0VarD, mVar7);
                                    b4.c(h5.g.a.f81809f, i2VarX2, mVar7);
                                    bVar = h5.g.a.f81813j;
                                    if (mVar7.getT()) {
                                        v.h.z(iHashCode2, mVar7, iHashCode2, bVar);
                                    } else {
                                        v.h.z(iHashCode2, mVar7, iHashCode2, bVar);
                                    }
                                    b4.c(h5.g.a.f81807d, rVarC2, mVar7);
                                    c2.u uVar2 = c2.u.f22885a;
                                    String strQ11 = gl1.y.Q(mVar7, R.string.you_can_update_account_access);
                                    w1 w1Var2 = w1.TopEnd;
                                    l72.x1 x1Var14 = l72.x1.EndSmall;
                                    long j14 = (((long) 16) & 4294967295L) | (((long) (-160)) << 32);
                                    g6.k.a aVar24 = g6.k.f76003b;
                                    boolean zBooleanValue5 = ((Boolean) p1Var.getF182175a()).booleanValue();
                                    p1Var4 = p1Var;
                                    zB3 = mVar7.B(p1Var4);
                                    objQ6 = mVar7.q();
                                    if (zB3) {
                                        aVar3.getClass();
                                        if (objQ6 == m.a.f135155b) {
                                            objQ6 = new vd0.c(p1Var4, 26);
                                            mVar7.K(objQ6);
                                        }
                                    } else {
                                        objQ6 = new vd0.c(p1Var4, 26);
                                        mVar7.K(objQ6);
                                    }
                                    n1 n1Var6 = n1Var2;
                                    p1Var = p1Var4;
                                    n1Var = n1Var6;
                                    a1.a(strQ11, w1Var2, x1Var14, 150, j14, zBooleanValue5, (e23.a) objQ6, z3.f.c(685708920, new ak0.h((Object) cVar, context2, (Object) str2, p1Var4, (Object) lVar2, (p1) n1Var6, 27), mVar7), mVar7, 100887936, 2);
                                    mVar7.y();
                                    mVar7.f();
                                    i17 = 9;
                                } else {
                                    mVar7.C(51941592);
                                    String strA5 = sVar.a(context2);
                                    String strB3 = sVar.b(context2);
                                    z3.e eVarC4 = z3.f.c(1795675738, new w12.e(cVar, 0), mVar7);
                                    zB2 = mVar7.B(sVar) | mVar7.B(lVar2);
                                    objQ5 = mVar7.q();
                                    if (zB2) {
                                        aVar3.getClass();
                                        if (objQ5 == m.a.f135155b) {
                                            i17 = 9;
                                            objQ5 = new vv0.n(i17, lVar2, cVar);
                                            mVar7.K(objQ5);
                                        } else {
                                            i17 = 9;
                                        }
                                    } else {
                                        i17 = 9;
                                        objQ5 = new vv0.n(i17, lVar2, cVar);
                                        mVar7.K(objQ5);
                                    }
                                    x12.a.a(null, strA5, strB3, str2, eVarC4, (e23.a) objQ5, mVar7, 24576, 1);
                                    mVar7.f();
                                }
                                mVar7.f();
                            } else {
                                it4 = it4;
                                i17 = i16;
                                if (sVar instanceof m12.s.e) {
                                    mVar7.C(52552075);
                                    eVar2 = (m12.s.e) sVar;
                                    num = eVar2.f115866b;
                                    if (num == null) {
                                        mVar7.C(52577897);
                                        mVar7.f();
                                        str = null;
                                    } else {
                                        mVar7.C(52577898);
                                        String strQ12 = gl1.y.Q(mVar7, num.intValue());
                                        mVar7.f();
                                        str = strQ12;
                                    }
                                    String strA6 = sVar.a(context2);
                                    String strB4 = sVar.b(context2);
                                    z3.e eVarC5 = z3.f.c(-370959809, new vy0.e(eVar2, 3), mVar7);
                                    zB = mVar7.B(sVar) | mVar7.B(lVar2);
                                    objQ4 = mVar7.q();
                                    if (zB) {
                                        aVar3.getClass();
                                        if (objQ4 == m.a.f135155b) {
                                            objQ4 = new vv0.n(10, lVar2, eVar2);
                                            mVar7.K(objQ4);
                                        }
                                    } else {
                                        objQ4 = new vv0.n(10, lVar2, eVar2);
                                        mVar7.K(objQ4);
                                    }
                                    x12.a.a(null, strA6, strB4, str, eVarC5, (e23.a) objQ4, mVar7, 24576, 1);
                                    mVar7.f();
                                } else {
                                    if (sVar instanceof m12.s.d) {
                                        throw n23.j.m(mVar7, -1245360149);
                                    }
                                    mVar7.C(53589583);
                                    r.a aVar25 = r.S;
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    c2.l.f(x2.h(aVar25, j92.b.f97899b.f97920e), mVar7);
                                    mVar7.f();
                                }
                            }
                        }
                        i16 = i17;
                        p1Var2 = p1Var3;
                        lVar = lVar2;
                        b0Var2 = b0Var3;
                        it4 = it4;
                    }
                    mVar7.f();
                    r.a aVar26 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.h(aVar26, j92.b.f97899b.f97920e), mVar7);
                    mVar7.y();
                    x1 x1Var15 = n.f135158a;
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ g(String str, GearActivity.w wVar, p1 p1Var, p1 p1Var2, boolean z14, p1 p1Var3, p1 p1Var4, p1 p1Var5, p pVar, p1 p1Var6) {
        this.f27643a = 6;
        this.f27650h = str;
        this.f27644b = wVar;
        this.f27648f = p1Var;
        this.f27645c = p1Var2;
        this.f27649g = z14;
        this.f27646d = p1Var3;
        this.f27647e = p1Var4;
        this.f27651i = p1Var5;
        this.f27652j = pVar;
        this.f27653k = p1Var6;
    }

    public /* synthetic */ g(fa0.h hVar, o1 o1Var, g90.a aVar, q92.x xVar, boolean z14, e23.a aVar2, p pVar, l lVar, ca0.u0 u0Var, e23.a aVar3, int i14) {
        this.f27643a = 2;
        this.f27644b = hVar;
        this.f27645c = o1Var;
        this.f27647e = aVar;
        this.f27651i = xVar;
        this.f27649g = z14;
        this.f27652j = aVar2;
        this.f27648f = pVar;
        this.f27646d = lVar;
        this.f27653k = u0Var;
        this.f27650h = aVar3;
    }

    public /* synthetic */ g(DateTime dateTime, tf0.i iVar, l lVar, l lVar2, p1 p1Var, Object obj, boolean z14, String str, l lVar3, l lVar4, int i14) {
        this.f27643a = i14;
        this.f27644b = dateTime;
        this.f27645c = iVar;
        this.f27646d = lVar;
        this.f27647e = lVar2;
        this.f27648f = p1Var;
        this.f27653k = obj;
        this.f27649g = z14;
        this.f27650h = str;
        this.f27651i = lVar3;
        this.f27652j = lVar4;
    }

    public /* synthetic */ g(DateTime dateTime, tf0.i iVar, l lVar, l lVar2, p1 p1Var, z42.g gVar, boolean z14, String str, e23.a aVar, l lVar3) {
        this.f27643a = 1;
        this.f27644b = dateTime;
        this.f27645c = iVar;
        this.f27646d = lVar;
        this.f27647e = lVar2;
        this.f27648f = p1Var;
        this.f27652j = gVar;
        this.f27649g = z14;
        this.f27650h = str;
        this.f27653k = aVar;
        this.f27651i = lVar3;
    }

    public /* synthetic */ g(p1 p1Var, g1 g1Var, e23.q qVar, e23.q qVar2, p1 p1Var2, o0 o0Var, String str, Set set, p pVar, boolean z14) {
        this.f27643a = 7;
        this.f27648f = p1Var;
        this.f27644b = g1Var;
        this.f27645c = qVar;
        this.f27646d = qVar2;
        this.f27647e = p1Var2;
        this.f27651i = o0Var;
        this.f27650h = str;
        this.f27652j = set;
        this.f27653k = pVar;
        this.f27649g = z14;
    }

    public /* synthetic */ g(x01.f fVar, o82.a aVar, List list, boolean z14, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, l lVar, int i14, int i15) {
        this.f27643a = i15;
        this.f27644b = fVar;
        this.f27645c = aVar;
        this.f27647e = list;
        this.f27649g = z14;
        this.f27651i = obj;
        this.f27652j = obj2;
        this.f27648f = obj3;
        this.f27653k = obj4;
        this.f27650h = obj5;
        this.f27646d = lVar;
    }

    public /* synthetic */ g(boolean z14, NutritionActivity.g gVar, x01.e eVar, e23.a aVar, e23.a aVar2, e23.a aVar3, e23.a aVar4, p pVar, Context context, x01.a aVar5) {
        this.f27643a = 4;
        this.f27649g = z14;
        this.f27644b = gVar;
        this.f27645c = eVar;
        this.f27646d = aVar;
        this.f27647e = aVar2;
        this.f27651i = aVar3;
        this.f27652j = aVar4;
        this.f27648f = pVar;
        this.f27653k = context;
        this.f27650h = aVar5;
    }

    public /* synthetic */ g(boolean z14, LinkedHashMap linkedHashMap, h1 h1Var, e23.a aVar, e23.a aVar2, p1 p1Var, n1 n1Var, o0 o0Var, l lVar, l lVar2) {
        this.f27643a = 8;
        this.f27649g = z14;
        this.f27644b = linkedHashMap;
        this.f27645c = h1Var;
        this.f27651i = aVar;
        this.f27652j = aVar2;
        this.f27648f = p1Var;
        this.f27653k = n1Var;
        this.f27650h = o0Var;
        this.f27646d = lVar;
        this.f27647e = lVar2;
    }
}
