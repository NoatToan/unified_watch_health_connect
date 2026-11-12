package et;

import android.content.Context;
import android.util.Base64;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.a0;
import c2.b0;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.z;
import c22.l3;
import c22.o2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.firebase.messaging.Constants;
import et1.b2;
import et1.q2;
import et1.u1;
import et1.w1;
import ew1.z1;
import f5.z0;
import gl1.y;
import gt1.s;
import h4.r;
import h5.e0;
import hl1.u;
import i3.d6;
import i3.k1;
import i3.mc;
import i3.mh;
import i3.o1;
import i3.v2;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jr.t;
import l72.c1;
import l72.f0;
import l72.i3;
import l72.p2;
import nr.l0;
import o4.d0;
import o4.m1;
import o4.r1;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.j0;
import p13.x;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;
import p5.v;
import pv0.w;
import s5.x0;
import u1.a2;
import u1.y0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class p implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f65270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f65271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f65272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f65273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f65274f;

    public /* synthetic */ p(h60.h hVar, o82.g gVar, e23.a aVar, Context context, c.q qVar) {
        this.f65269a = 16;
        this.f65272d = hVar;
        this.f65271c = gVar;
        this.f65270b = aVar;
        this.f65273e = context;
        this.f65274f = qVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0069  */
    /* JADX WARN: Code duplicated, block: B:19:0x008e  */
    /* JADX WARN: Code duplicated, block: B:77:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:93:0x02f6  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object a(Object obj, Object obj2) {
        o13.p<String, String> pVarA;
        String strB;
        boolean z14;
        String strB2;
        String strP;
        boolean z15;
        zf2.i iVar;
        boolean z16;
        u uVar = (u) this.f65272d;
        e23.a aVar = (e23.a) this.f65270b;
        e23.a aVar2 = (e23.a) this.f65271c;
        p1 p1Var = (p1) this.f65273e;
        u00.a aVar3 = (u00.a) this.f65274f;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            boolean z17 = uVar.f84464b;
            p3.m.a aVar4 = p3.m.f135153a;
            if (z17) {
                mVar.C(-808679140);
                c1 c1Var = c1.f110940a;
                String strQ = y.Q(mVar, R.string.pregnancy_something_went_wrong);
                String strQ2 = y.Q(mVar, R.string.trail_reviews_loading_error_message);
                String strQ3 = y.Q(mVar, R.string.lbl_retry);
                boolean zB = mVar.B(aVar);
                Object objQ = mVar.q();
                if (zB) {
                    objQ = new s(aVar, 9);
                    mVar.K(objQ);
                } else {
                    aVar4.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new s(aVar, 9);
                        mVar.K(objQ);
                    }
                }
                e23.a<Unit> aVar5 = (e23.a) objQ;
                String strQ4 = y.Q(mVar, R.string.lbl_cancel);
                boolean zB2 = mVar.B(aVar2);
                Object objQ2 = mVar.q();
                if (zB2) {
                    objQ2 = new s(aVar2, 10);
                    mVar.K(objQ2);
                } else {
                    aVar4.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new s(aVar2, 10);
                        mVar.K(objQ2);
                    }
                }
                c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, aVar5, strQ4, (e23.a) objQ2, mVar, 0, 0, 217);
                mVar.f();
            } else {
                p3.m mVar2 = mVar;
                mVar2.C(-807964063);
                r.a aVar6 = r.S;
                r rVarB = a2.b(aVar6, a2.a(mVar2), true);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                h4.g.a aVar7 = h4.d.a.f81536n;
                z zVarA = c2.y.a(kVar, aVar7, mVar2, 0);
                int iHashCode = Long.hashCode(mVar2.getU());
                i2 i2VarX = mVar2.x();
                r rVarC = h4.k.c(rVarB, mVar2);
                h5.g.V.getClass();
                e0.a aVar8 = h5.g.a.f81805b;
                if (mVar2.F() == null) {
                    p0.l();
                    throw null;
                }
                mVar2.z();
                if (mVar2.getT()) {
                    mVar2.M(aVar8);
                } else {
                    mVar2.c();
                }
                h5.g.a.e eVar = h5.g.a.f81810g;
                b4.c(eVar, zVarA, mVar2);
                h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarX, mVar2);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                    v.h.z(iHashCode, mVar2, iHashCode, bVar);
                }
                h5.g.a.f fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, mVar2);
                b0 b0Var = b0.f22601a;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                c2.l.f(x2.h(aVar6, j92.b.f97899b.f97920e), mVar2);
                r rVarZ = g8.i.Z(aVar6);
                z zVarA2 = c2.y.a(kVar, aVar7, mVar2, 0);
                int iHashCode2 = Long.hashCode(mVar2.getU());
                i2 i2VarX2 = mVar2.x();
                r rVarC2 = h4.k.c(rVarZ, mVar2);
                if (mVar2.F() == null) {
                    p0.l();
                    throw null;
                }
                mVar2.z();
                if (mVar2.getT()) {
                    mVar2.M(aVar8);
                } else {
                    mVar2.c();
                }
                b4.c(eVar, zVarA2, mVar2);
                b4.c(c1623g, i2VarX2, mVar2);
                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                    v.h.z(iHashCode2, mVar2, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, mVar2);
                mVar2.C(149330204);
                for (rf2.h hVar : uVar.f84465c) {
                    Integer num = hVar.f152488i;
                    if (num != null) {
                        int iIntValue2 = num.intValue();
                        l3.f23124b.getClass();
                        pVarA = aVar3.a(MathKt.b(((double) ((int) ((Math.ceil(iIntValue2) + 59.0d) / 60.0d))) * 60.0d));
                    } else {
                        pVarA = null;
                    }
                    String str = hVar.f152483d;
                    if (str == null) {
                        mVar2.C(1806494061);
                        mVar2.f();
                        strB = null;
                    } else {
                        mVar2.C(1806494062);
                        cx2.j.a aVar9 = cx2.j.f56682a;
                        Context context = (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b);
                        byte[] bytes = str.getBytes(d53.c.f57666b);
                        bytes.getClass();
                        strB = cx2.j.a.b(aVar9, context, Base64.encodeToString(bytes, 0));
                        mVar2.f();
                    }
                    if (strB == null) {
                        strB = hVar.f152482c;
                    }
                    String str2 = hVar.f152487h;
                    if (str2 == null) {
                        mVar2.C(1806949389);
                        mVar2.f();
                        strB2 = null;
                        z14 = false;
                    } else {
                        mVar2.C(1806949390);
                        cx2.j.a aVar10 = cx2.j.f56682a;
                        Context context2 = (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b);
                        byte[] bytes2 = str2.getBytes(d53.c.f57666b);
                        bytes2.getClass();
                        z14 = false;
                        strB2 = cx2.j.a.b(aVar10, context2, Base64.encodeToString(bytes2, 0));
                        mVar2.f();
                    }
                    if (pVarA != null) {
                        mVar2.C(1807368944);
                        strP = y.P(R.string.common_hyphenated_values, new Object[]{strB, pVarA.f128594a}, mVar2);
                        mVar2.f();
                    } else {
                        mVar2.C(1807632599);
                        mVar2.f();
                        strP = strB;
                    }
                    if (pVarA != null) {
                        mVar2.C(1807783631);
                        strB = y.P(R.string.common_hyphenated_values, new Object[]{strB, pVarA.f128595b}, mVar2);
                        mVar2.f();
                    } else {
                        mVar2.C(1808048247);
                        mVar2.f();
                    }
                    b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                    c0235a.f16962a.put(Constants.ScionAnalytics.PARAM_LABEL, strB);
                    b92.a aVarB = c0235a.b();
                    Context context3 = (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b);
                    boolean z18 = z14;
                    p2 p2Var = p2.f111205a;
                    r.a aVar11 = r.S;
                    o13.p pVar = (o13.p) p1Var.getF182175a();
                    if (pVar == null || (iVar = (zf2.i) pVar.f128594a) == null) {
                        z15 = z18;
                    } else {
                        Integer num2 = hVar.f152481b;
                        if (num2 == null) {
                            if (iVar instanceof zf2.i.c) {
                                int i14 = ((zf2.i.c) iVar).f204654a;
                                Integer num3 = hVar.f152480a;
                                if (num3 != null && i14 == num3.intValue()) {
                                    z16 = true;
                                }
                            }
                            z16 = z18;
                        } else if ((iVar instanceof zf2.i.b) && ((zf2.i.b) iVar).f204653a == num2.intValue()) {
                            z16 = true;
                        } else {
                            z16 = z18;
                        }
                        z15 = z16;
                    }
                    boolean zR = mVar2.r(hVar) | mVar2.r(context3);
                    Object objQ3 = mVar2.q();
                    if (zR) {
                        objQ3 = new fk0.a(p1Var, 25, hVar, context3);
                        mVar2.K(objQ3);
                    } else {
                        aVar4.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new fk0.a(p1Var, 25, hVar, context3);
                            mVar2.K(objQ3);
                        }
                    }
                    r rVarB2 = j2.b.b(aVar11, z15, false, null, (e23.a) objQ3, 14);
                    if (strB2 == null && (strB2 = hVar.f152486g) == null) {
                        strB2 = "";
                    }
                    z3.e eVarC = z3.f.c(-1247374725, new g80.e(19, p1Var, hVar), mVar2);
                    int i15 = b92.a.f16960b;
                    p3.m mVar3 = mVar2;
                    p2Var.h(strP, strB2, null, rVarB2, aVarB, false, false, null, eVarC, null, null, mVar3, 100663296, 0, 1764);
                    mVar2 = mVar3;
                }
                p3.m mVar4 = mVar2;
                mVar4.f();
                mVar4.y();
                mVar4.y();
                mVar4.f();
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    private final Object b(Object obj, Object obj2) {
        p3.m mVar;
        String str = (String) this.f65272d;
        u4.d dVar = (u4.d) this.f65270b;
        List<aq.c> list = (List) this.f65271c;
        ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) this.f65273e;
        hn.b bVar = (hn.b) this.f65274f;
        p3.m mVar2 = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            r.a aVar = r.S;
            r rVarD = x2.d(aVar, 1.0f);
            boolean zB = mVar2.B(str);
            Object objQ = mVar2.q();
            if (zB) {
                objQ = new gp.j(str, 24);
                mVar2.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new gp.j(str, 24);
                    mVar2.K(objQ);
                }
            }
            r rVarC = v.c((e23.l) objQ, rVarD, false);
            c2.j.f22691a.getClass();
            c2.j.g gVar = c2.j.f22698h;
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81536n;
            z zVarA = c2.y.a(gVar, aVar2, mVar2, 6);
            int iHashCode = Long.hashCode(mVar2.getU());
            i2 i2VarX = mVar2.x();
            r rVarC2 = h4.k.c(rVarC, mVar2);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (mVar2.F() == null) {
                p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar3);
            } else {
                mVar2.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, mVar2);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarX, mVar2);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar2, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, mVar2);
            b0 b0Var = b0.f22601a;
            c2.j.k kVar = c2.j.f22694d;
            z zVarA2 = c2.y.a(kVar, aVar2, mVar2, 0);
            int iHashCode2 = Long.hashCode(mVar2.getU());
            i2 i2VarX2 = mVar2.x();
            r rVarC3 = h4.k.c(aVar, mVar2);
            if (mVar2.F() == null) {
                p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar3);
            } else {
                mVar2.c();
            }
            b4.c(eVar, zVarA2, mVar2);
            b4.c(c1623g, i2VarX2, mVar2);
            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                v.h.z(iHashCode2, mVar2, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC3, mVar2);
            r rVarA = b0Var.a(x2.f(aVar, 1.0f), 1.0f, true);
            z zVarA3 = c2.y.a(kVar, aVar2, mVar2, 0);
            int iHashCode3 = Long.hashCode(mVar2.getU());
            i2 i2VarX3 = mVar2.x();
            r rVarC4 = h4.k.c(rVarA, mVar2);
            if (mVar2.F() == null) {
                p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar3);
            } else {
                mVar2.c();
            }
            b4.c(eVar, zVarA3, mVar2);
            b4.c(c1623g, i2VarX3, mVar2);
            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode3))) {
                v.h.z(iHashCode3, mVar2, iHashCode3, bVar2);
            }
            b4.c(fVar, rVarC4, mVar2);
            if (dVar == null) {
                mVar2.C(1301677986);
                mVar2.f();
                mVar = mVar2;
            } else {
                mVar2.C(1301677987);
                g6.f.a aVar4 = g6.f.f75994b;
                r rVarC5 = c2.l.C(aVar, 0.0f, 0.0f, 12, 0.0f, 11);
                f02.h.f67736a.getClass();
                mVar = mVar2;
                g02.i.a(rVarC5, dVar, f02.h.a(mVar2), n5.a.a(mVar2, activityListItemDTO.f29265g.f4366i), 40, 0.0f, null, mVar, 24582, 224);
                Unit unit = Unit.INSTANCE;
                mVar.f();
            }
            if (list == null) {
                mVar.C(1302202816);
                mVar.f();
            } else {
                mVar.C(1302202817);
                for (aq.c cVar : list) {
                    bVar.b(cVar.f11849c.toString(), cVar.f11847a.toString(), cVar.f11851e, mVar, 0);
                }
                mVar.f();
                Unit unit2 = Unit.INSTANCE;
            }
            mVar.y();
            mVar.y();
            mVar.y();
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0295 A[EDGE_INSN: B:105:0x0295->B:69:0x0295 BREAK  A[LOOP:0: B:33:0x018f->B:109:0x018f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:25:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:26:0x0100  */
    /* JADX WARN: Code duplicated, block: B:31:0x011d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0198  */
    /* JADX WARN: Code duplicated, block: B:37:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:38:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:57:0x020d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0245  */
    /* JADX WARN: Code duplicated, block: B:62:0x024d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0267  */
    /* JADX WARN: Code duplicated, block: B:67:0x026e  */
    /* JADX WARN: Code duplicated, block: B:71:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:72:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:75:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:77:0x0302  */
    /* JADX WARN: Code duplicated, block: B:79:0x0327  */
    /* JADX WARN: Code duplicated, block: B:81:0x032e  */
    /* JADX WARN: Code duplicated, block: B:86:0x036b  */
    /* JADX WARN: Code duplicated, block: B:90:0x038c  */
    /* JADX WARN: Code duplicated, block: B:94:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:96:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:98:0x03c4  */
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
    private final Object c(Object obj, Object obj2) {
        e23.a aVar;
        h5.g.a.f fVar;
        z zVarA;
        int iHashCode;
        i2 i2VarX;
        r rVarC;
        p3.m mVar;
        Iterator<T> it;
        boolean zHasNext;
        int i14;
        p3.m.a aVar2;
        boolean z14;
        Object objQ;
        p3.m.a.C2565a c2565a;
        p1 p1VarA;
        boolean zB;
        Object objQ2;
        boolean zB2;
        Object objQ3;
        boolean zB3;
        Object objQ4;
        Double d14;
        double dA;
        t41.f fVar2;
        boolean z15;
        z3.e eVar;
        boolean zK;
        Object objQ5;
        String strQ;
        e23.p pVar = (e23.p) this.f65272d;
        p1 p1Var = (p1) this.f65271c;
        o51.j jVar = (o51.j) this.f65273e;
        e23.a aVar3 = (e23.a) this.f65270b;
        e23.l lVar = (e23.l) this.f65274f;
        p3.m mVar2 = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            r.a aVar4 = r.S;
            r rVarD = x2.d(aVar4, 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar5 = h4.d.a.f81537o;
            c2.j jVar2 = c2.j.f22691a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97917b;
            jVar2.getClass();
            z zVarA2 = c2.y.a(c2.j.i(f14), aVar5, mVar2, 48);
            int iHashCode2 = Long.hashCode(mVar2.getU());
            i2 i2VarX2 = mVar2.x();
            r rVarC2 = h4.k.c(rVarD, mVar2);
            h5.g.V.getClass();
            e0.a aVar6 = h5.g.a.f81805b;
            if (mVar2.F() == null) {
                p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar6);
            } else {
                mVar2.c();
            }
            h5.g.a.e eVar3 = h5.g.a.f81810g;
            b4.c(eVar3, zVarA2, mVar2);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarX2, mVar2);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar2.getT()) {
                aVar = aVar3;
            } else {
                aVar = aVar3;
                if (!p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, mVar2);
                r rVarB = a2.b(b0.f22601a.a(aVar4, 1.0f, true), a2.a(mVar2), true);
                zVarA = c2.y.a(c2.j.i(eVar2.f97917b), aVar5, mVar2, 48);
                iHashCode = Long.hashCode(mVar2.getU());
                i2VarX = mVar2.x();
                rVarC = h4.k.c(rVarB, mVar2);
                if (mVar2.F() != null) {
                    p0.l();
                    throw null;
                }
                mVar2.z();
                if (mVar2.getT()) {
                    mVar2.M(aVar6);
                } else {
                    mVar2.c();
                }
                b4.c(eVar3, zVarA, mVar2);
                b4.c(c1623g, i2VarX, mVar2);
                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                    v.h.z(iHashCode, mVar2, iHashCode, bVar);
                }
                b4.c(fVar, rVarC, mVar2);
                r rVarC3 = c2.l.C(c2.l.A(aVar4, eVar2.f97921f, 0.0f, 2), 0.0f, eVar2.f97921f, 0.0f, eVar2.f97922g, 5);
                String strQ2 = y.Q(mVar2, R.string.pacepro_select_race_distance_message);
                d92.b.f58624b.getClass();
                x0 x0VarF = d92.c.f(j92.f.f97931h, mVar2);
                d6.h.f57752b.getClass();
                mh.c(strQ2, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF, mVar2, 0, 0, 130044);
                mVar = mVar2;
                mVar.C(-1465012204);
                it = t41.f.f162289j.iterator();
                while (true) {
                    zHasNext = it.hasNext();
                    i14 = 4;
                    aVar2 = p3.m.f135153a;
                    if (zHasNext) {
                        break;
                    }
                    fVar2 = (t41.f) it.next();
                    if (jVar.f129272a == fVar2) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z15 || fVar2 != t41.f.OTHER) {
                        mVar.C(310977898);
                        p2 p2Var = p2.f111205a;
                        String strQ3 = y.Q(mVar, fVar2.f162290a);
                        if (z15) {
                            i51.a.f91784a.getClass();
                            eVar = i51.a.f91787d;
                        } else {
                            eVar = null;
                        }
                        zK = mVar.k(fVar2.ordinal()) | mVar.B(p1Var) | mVar.B(lVar);
                        objQ5 = mVar.q();
                        if (zK) {
                            objQ5 = new d6(fVar2, 3, lVar, p1Var);
                            mVar.K(objQ5);
                        } else {
                            aVar2.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                objQ5 = new d6(fVar2, 3, lVar, p1Var);
                                mVar.K(objQ5);
                            }
                        }
                        p3.m mVar3 = mVar;
                        p2Var.g(strQ3, null, null, null, eVar, false, z15, (e23.a) objQ5, mVar3, 0, 174);
                        mVar = mVar3;
                        mVar.f();
                    } else {
                        mVar.C(310064700);
                        p2 p2Var2 = p2.f111205a;
                        String strQ4 = y.Q(mVar, fVar2.f162290a);
                        x1 x1Var2 = p3.n.f135158a;
                        Context context = (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b);
                        Double d15 = jVar.f129273b;
                        n02.g gVar = jVar.f129274c;
                        if (d15 == null || gVar == null) {
                            strQ = null;
                        } else {
                            double dB = gVar.b(d15.doubleValue());
                            l3.a aVar7 = l3.f23124b;
                            DecimalFormat decimalFormat = l3.f23125c;
                            boolean z16 = gVar == n02.g.KILOMETERS;
                            aVar7.getClass();
                            strQ = l3.a.Q(context, dB, decimalFormat, true, z16);
                        }
                        if (strQ == null) {
                            strQ = "";
                        }
                        String str = strQ;
                        i51.a.f91784a.getClass();
                        z3.e eVar4 = i51.a.f91786c;
                        boolean zB4 = mVar.B(p1Var);
                        Object objQ6 = mVar.q();
                        if (zB4) {
                            objQ6 = new i11.i(p1Var, 4);
                            mVar.K(objQ6);
                        } else {
                            aVar2.getClass();
                            if (objQ6 == p3.m.a.f135155b) {
                                objQ6 = new i11.i(p1Var, 4);
                                mVar.K(objQ6);
                            }
                        }
                        p3.m mVar4 = mVar;
                        p2Var2.h(strQ4, str, null, null, null, false, true, null, eVar4, null, (e23.a) objQ6, mVar4, 102236160, 0, com.google.firebase.perf.util.Constants.FROZEN_FRAME_TIME);
                        mVar = mVar4;
                        mVar.f();
                    }
                }
                mVar.f();
                mVar.y();
                f0 f0Var = f0.f110999a;
                r rVarF = x2.f(r.S, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                j92.e eVar5 = j92.b.f97899b;
                r rVarC4 = c2.l.C(c2.l.A(rVarF, eVar5.f97920e, 0.0f, 2), 0.0f, 0.0f, 0.0f, eVar5.f97918c, 7);
                String strQ5 = y.Q(mVar, R.string.lbl_next);
                if (jVar.f129272a != null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                f0Var.d(0, 1, aVar, rVarC4, strQ5, mVar, null, z14);
                mVar.y();
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    mVar.C(-478976963);
                    objQ = mVar.q();
                    aVar2.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        n02.g gVar2 = jVar.f129274c;
                        n02.g gVar3 = n02.g.KILOMETERS;
                        t41.c.f162274a.getClass();
                        i53.g gVarB = i53.a.b(new o13.p(gVar3, t41.c.f162275b), new o13.p(n02.g.MILES, t41.c.f162276c));
                        d14 = jVar.f129273b;
                        if (d14 != null) {
                            dA = d14.doubleValue();
                        } else {
                            dA = jVar.f129274c.a(t41.f.OTHER.f162291b);
                        }
                        objQ = new n02.f(gVar2, dA, gVarB, 0, false, 24, null);
                        mVar.K(objQ);
                    }
                    n02.f.f122169f.getClass();
                    p1VarA = n02.f.a.a((n02.f) objQ, mVar);
                    n02.f fVar3 = (n02.f) p1VarA.getF182175a();
                    zB = mVar.B(p1VarA);
                    objQ2 = mVar.q();
                    if (zB || objQ2 == c2565a) {
                        objQ2 = new v2(p1VarA, i14);
                        mVar.K(objQ2);
                    }
                    e23.l lVar2 = (e23.l) objQ2;
                    zB2 = mVar.B(pVar) | mVar.B(p1VarA) | mVar.B(p1Var);
                    objQ3 = mVar.q();
                    if (zB2 || objQ3 == c2565a) {
                        objQ3 = new z1(pVar, p1VarA, p1Var, 1);
                        mVar.K(objQ3);
                    }
                    e23.a aVar8 = (e23.a) objQ3;
                    zB3 = mVar.B(p1Var);
                    objQ4 = mVar.q();
                    if (zB3 || objQ4 == c2565a) {
                        objQ4 = new i11.i(p1Var, 5);
                        mVar.K(objQ4);
                    }
                    n02.b.a(fVar3, lVar2, false, aVar8, (e23.a) objQ4, mVar, 0);
                    mVar.f();
                } else {
                    mVar.C(-477883345);
                    mVar.f();
                }
                x1 x1Var3 = p3.n.f135158a;
            }
            v.h.z(iHashCode2, mVar2, iHashCode2, bVar);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, mVar2);
            r rVarB2 = a2.b(b0.f22601a.a(aVar4, 1.0f, true), a2.a(mVar2), true);
            zVarA = c2.y.a(c2.j.i(eVar2.f97917b), aVar5, mVar2, 48);
            iHashCode = Long.hashCode(mVar2.getU());
            i2VarX = mVar2.x();
            rVarC = h4.k.c(rVarB2, mVar2);
            if (mVar2.F() != null) {
                p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar6);
            } else {
                mVar2.c();
            }
            b4.c(eVar3, zVarA, mVar2);
            b4.c(c1623g, i2VarX, mVar2);
            if (mVar2.getT()) {
                v.h.z(iHashCode, mVar2, iHashCode, bVar);
            } else {
                v.h.z(iHashCode, mVar2, iHashCode, bVar);
            }
            b4.c(fVar, rVarC, mVar2);
            r rVarC5 = c2.l.C(c2.l.A(aVar4, eVar2.f97921f, 0.0f, 2), 0.0f, eVar2.f97921f, 0.0f, eVar2.f97922g, 5);
            String strQ6 = y.Q(mVar2, R.string.pacepro_select_race_distance_message);
            d92.b.f58624b.getClass();
            x0 x0VarF2 = d92.c.f(j92.f.f97931h, mVar2);
            d6.h.f57752b.getClass();
            mh.c(strQ6, rVarC5, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF2, mVar2, 0, 0, 130044);
            mVar = mVar2;
            mVar.C(-1465012204);
            it = t41.f.f162289j.iterator();
            while (true) {
                zHasNext = it.hasNext();
                i14 = 4;
                aVar2 = p3.m.f135153a;
                if (zHasNext) {
                    break;
                    break;
                }
                fVar2 = (t41.f) it.next();
                if (jVar.f129272a == fVar2) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (z15) {
                }
                mVar.C(310977898);
                p2 p2Var3 = p2.f111205a;
                String strQ7 = y.Q(mVar, fVar2.f162290a);
                if (z15) {
                    i51.a.f91784a.getClass();
                    eVar = i51.a.f91787d;
                } else {
                    eVar = null;
                }
                zK = mVar.k(fVar2.ordinal()) | mVar.B(p1Var) | mVar.B(lVar);
                objQ5 = mVar.q();
                if (zK) {
                    aVar2.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new d6(fVar2, 3, lVar, p1Var);
                        mVar.K(objQ5);
                    }
                } else {
                    objQ5 = new d6(fVar2, 3, lVar, p1Var);
                    mVar.K(objQ5);
                }
                p3.m mVar5 = mVar;
                p2Var3.g(strQ7, null, null, null, eVar, false, z15, (e23.a) objQ5, mVar5, 0, 174);
                mVar = mVar5;
                mVar.f();
            }
            mVar.f();
            mVar.y();
            f0 f0Var2 = f0.f110999a;
            r rVarF2 = x2.f(r.S, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar6 = j92.b.f97899b;
            r rVarC6 = c2.l.C(c2.l.A(rVarF2, eVar6.f97920e, 0.0f, 2), 0.0f, 0.0f, 0.0f, eVar6.f97918c, 7);
            String strQ8 = y.Q(mVar, R.string.lbl_next);
            if (jVar.f129272a != null) {
                z14 = true;
            } else {
                z14 = false;
            }
            f0Var2.d(0, 1, aVar, rVarC6, strQ8, mVar, null, z14);
            mVar.y();
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                mVar.C(-478976963);
                objQ = mVar.q();
                aVar2.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    n02.g gVar4 = jVar.f129274c;
                    n02.g gVar5 = n02.g.KILOMETERS;
                    t41.c.f162274a.getClass();
                    i53.g gVarB2 = i53.a.b(new o13.p(gVar5, t41.c.f162275b), new o13.p(n02.g.MILES, t41.c.f162276c));
                    d14 = jVar.f129273b;
                    if (d14 != null) {
                        dA = d14.doubleValue();
                    } else {
                        dA = jVar.f129274c.a(t41.f.OTHER.f162291b);
                    }
                    objQ = new n02.f(gVar4, dA, gVarB2, 0, false, 24, null);
                    mVar.K(objQ);
                }
                n02.f.f122169f.getClass();
                p1VarA = n02.f.a.a((n02.f) objQ, mVar);
                n02.f fVar4 = (n02.f) p1VarA.getF182175a();
                zB = mVar.B(p1VarA);
                objQ2 = mVar.q();
                if (zB) {
                    objQ2 = new v2(p1VarA, i14);
                    mVar.K(objQ2);
                } else {
                    objQ2 = new v2(p1VarA, i14);
                    mVar.K(objQ2);
                }
                e23.l lVar3 = (e23.l) objQ2;
                zB2 = mVar.B(pVar) | mVar.B(p1VarA) | mVar.B(p1Var);
                objQ3 = mVar.q();
                if (zB2) {
                    objQ3 = new z1(pVar, p1VarA, p1Var, 1);
                    mVar.K(objQ3);
                } else {
                    objQ3 = new z1(pVar, p1VarA, p1Var, 1);
                    mVar.K(objQ3);
                }
                e23.a aVar9 = (e23.a) objQ3;
                zB3 = mVar.B(p1Var);
                objQ4 = mVar.q();
                if (zB3) {
                    objQ4 = new i11.i(p1Var, 5);
                    mVar.K(objQ4);
                } else {
                    objQ4 = new i11.i(p1Var, 5);
                    mVar.K(objQ4);
                }
                n02.b.a(fVar4, lVar3, false, aVar9, (e23.a) objQ4, mVar, 0);
                mVar.f();
            } else {
                mVar.C(-477883345);
                mVar.f();
            }
            x1 x1Var4 = p3.n.f135158a;
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }

    private final Object d(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        i51.f.a((o51.j) this.f65272d, (e23.l) this.f65273e, (e23.p) this.f65274f, (e23.a) this.f65270b, (e23.a) this.f65271c, (p3.m) obj, p0.t(1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00de  */
    private final Object e(Object obj, Object obj2) {
        i53.f fVar = (i53.f) this.f65272d;
        n82.f fVar2 = (n82.f) this.f65270b;
        yd1.a aVar = (yd1.a) this.f65271c;
        ic1.m mVar = (ic1.m) this.f65273e;
        e23.l lVar = (e23.l) this.f65274f;
        p3.m mVar2 = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            r.a aVar2 = r.S;
            r rVarE = u1.n.e(x2.d(aVar2, 1.0f), vb.h.e(d92.b.f58623a, mVar2), m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
            int iHashCode = Long.hashCode(mVar2.getU());
            i2 i2VarX = mVar2.x();
            r rVarC = h4.k.c(rVarE, mVar2);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (mVar2.F() == null) {
                p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar3);
            } else {
                mVar2.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar2);
            b4.c(h5.g.a.f81809f, i2VarX, mVar2);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar2, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar2);
            b0 b0Var = b0.f22601a;
            i53.c cVarE = i53.a.e(o2.b(fVar, mVar2));
            int iIndexOf = fVar.indexOf(fVar2.f124961b.a());
            r rVarB = b0Var.b(aVar2, h4.d.a.f81537o);
            boolean zB = mVar2.B(fVar2);
            Object objQ = mVar2.q();
            if (zB) {
                objQ = new a42.f0(fVar2, fVar, 7);
                mVar2.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a42.f0(fVar2, fVar, 7);
                    mVar2.K(objQ);
                }
            }
            t82.c.a(cVarE, rVarB, iIndexOf, 0.0f, (e23.l) objQ, mVar2, 0, 24);
            q82.a.a(x2.f(aVar2, 1.0f), new n82.n(fVar2, aVar), null, mVar2, 6, 4);
            n82.c.a(b0Var.a(aVar2, 1.0f, true), fVar2, 3, false, z3.f.c(-287525546, new i91.e(mVar, 1, lVar, fVar2), mVar2), mVar2, 24960, 8);
            mVar2.y();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d1  */
    private final Object f(Object obj, Object obj2) {
        String str = (String) this.f65272d;
        e23.a aVar = (e23.a) this.f65270b;
        List list = (List) this.f65271c;
        gi0.a aVar2 = (gi0.a) this.f65273e;
        Context context = (Context) this.f65274f;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            r rVarC = wz1.i.c(r.S, mVar);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            r rVarC2 = h4.k.c(rVarC, mVar);
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
            b4.c(h5.g.a.f81810g, z0VarD, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, mVar);
            c2.u uVar = c2.u.f22885a;
            boolean zB = mVar.B(aVar);
            Object objQ = mVar.q();
            p3.m.a aVar4 = p3.m.f135153a;
            if (zB) {
                objQ = new ii0.h(aVar, 5);
                mVar.K(objQ);
            } else {
                aVar4.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ii0.h(aVar, 5);
                    mVar.K(objQ);
                }
            }
            e23.a aVar5 = (e23.a) objQ;
            i53.c cVarE = i53.a.e(list);
            boolean zR = mVar.r(aVar2) | mVar.r(context);
            Object objQ2 = mVar.q();
            if (zR) {
                objQ2 = new hy.h(17, aVar2, context);
                mVar.K(objQ2);
            } else {
                aVar4.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new hy.h(17, aVar2, context);
                    mVar.K(objQ2);
                }
            }
            z02.f.d(str, null, null, aVar5, cVarE, null, (e23.l) objQ2, mVar, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00af  */
    /* JADX WARN: Code duplicated, block: B:23:0x00da  */
    private final Object g(Object obj, Object obj2) {
        rm1.j jVar = (rm1.j) this.f65272d;
        CustomCombinedChart customCombinedChart = (CustomCombinedChart) this.f65270b;
        sl1.h hVar = (sl1.h) this.f65271c;
        p1 p1Var = (p1) this.f65273e;
        String str = (String) this.f65274f;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            rm1.b bVar = jVar.D;
            if (bVar == null || !(!p005kotlin.jvm.internal.s.g(bVar.f153534c, bVar.f153535d))) {
                mVar.C(1809655301);
                mVar.f();
            } else {
                mVar.C(1809545747);
                r.a aVar = r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                in1.k.b(c2.l.C(aVar, j92.b.f97899b.f97920e, 0.0f, 0.0f, 0.0f, 14), mVar, 0);
                mVar.f();
            }
            r rVarF = x2.f(r.S, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            g6.f.a aVar2 = g6.f.f75994b;
            r rVarH = x2.h(c2.l.A(rVarF, j92.b.f97899b.f97920e, 0.0f, 2), 350);
            boolean zR = mVar.r(customCombinedChart);
            Object objQ = mVar.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zR) {
                objQ = new hn1.j(customCombinedChart, 1);
                mVar.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new hn1.j(customCombinedChart, 1);
                    mVar.K(objQ);
                }
            }
            e23.l lVar = (e23.l) objQ;
            boolean zR2 = mVar.r(hVar) | mVar.r(jVar) | mVar.B(p1Var) | mVar.B(str);
            Object objQ2 = mVar.q();
            if (zR2) {
                ev2.f fVar = new ev2.f(hVar, jVar, str, p1Var, 14);
                mVar.K(fVar);
                objQ2 = fVar;
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    ev2.f fVar2 = new ev2.f(hVar, jVar, str, p1Var, 14);
                    mVar.K(fVar2);
                    objQ2 = fVar2;
                }
            }
            p002j6.c.b(lVar, rVarH, (e23.l) objQ2, mVar, 0, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0055  */
    /* JADX WARN: Code duplicated, block: B:54:0x01f5  */
    private final Object h(Object obj, Object obj2) {
        Object obj3;
        go0.e.a aVar;
        String str = (String) this.f65272d;
        String str2 = (String) this.f65270b;
        go0.e.a aVar2 = (go0.e.a) this.f65271c;
        String str3 = (String) this.f65273e;
        String str4 = (String) this.f65274f;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            r.a aVar3 = r.S;
            r rVarD = x2.d(aVar3, 1.0f);
            boolean zB = mVar.B(str);
            Object objQ = mVar.q();
            p3.m.a aVar4 = p3.m.f135153a;
            if (zB) {
                objQ = new i11.g(str, 22);
                mVar.K(objQ);
            } else {
                aVar4.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new i11.g(str, 22);
                    mVar.K(objQ);
                }
            }
            r rVarC = v.c((e23.l) objQ, rVarD, false);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            r rVarC2 = h4.k.c(rVarC, mVar);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar5);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, mVar);
            b0 b0Var = b0.f22601a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarA = c2.l.A(aVar3, j92.b.f97899b.f97920e, 0.0f, 2);
            d92.b.f58624b.getClass();
            mh.c(str2, rVarA, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97930g, mVar), mVar, 0, 0, 131068);
            float fI = yz1.y.i(mVar);
            ArrayList arrayList = new ArrayList();
            i53.c<i53.d<Float, Float>> cVar = aVar2 != null ? aVar2.f78192d : null;
            if (cVar == null) {
                mVar.C(-1358562959);
                mVar.f();
            } else {
                mVar.C(-1358562958);
                int i14 = 0;
                for (i53.d<Float, Float> dVar : cVar) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        x.q();
                        throw null;
                    }
                    i53.d<Float, Float> dVar2 = dVar;
                    i53.d dVar3 = (i53.d) h0.e0(i14, aVar2.f78193e);
                    i53.e<Map.Entry> eVar = dVar3 != null ? (i53.e) dVar3.entrySet() : null;
                    if (eVar == null) {
                        mVar.C(819712920);
                        mVar.f();
                        obj3 = null;
                    } else {
                        mVar.C(819712921);
                        ArrayList arrayList2 = new ArrayList(p13.y.r(eVar, 10));
                        for (Map.Entry entry : eVar) {
                            arrayList2.add(new o13.p(entry.getKey(), d0.a(n5.a.a(mVar, ((Number) entry.getValue()).intValue()))));
                        }
                        mVar.f();
                        obj3 = arrayList2;
                    }
                    if (obj3 == null) {
                        obj3 = j0.f134944a;
                    }
                    Object obj4 = obj3;
                    boolean zR = mVar.r(obj4) | mVar.B(dVar2) | mVar.r(aVar2) | mVar.i(fI);
                    Object objQ2 = mVar.q();
                    if (zR) {
                        aVar = aVar2;
                        io0.a aVar6 = new io0.a(fI, 0, obj4, dVar2, aVar);
                        mVar.K(aVar6);
                        objQ2 = aVar6;
                    } else {
                        aVar4.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            aVar = aVar2;
                            io0.a aVar7 = new io0.a(fI, 0, obj4, dVar2, aVar);
                            mVar.K(aVar7);
                            objQ2 = aVar7;
                        } else {
                            aVar = aVar2;
                        }
                    }
                    arrayList.add((e23.l) objQ2);
                    aVar2 = aVar;
                    i14 = i15;
                }
                mVar.f();
                Unit unit = Unit.INSTANCE;
            }
            r.a aVar8 = r.S;
            r rVarA2 = b0Var.a(x2.f(aVar8, 1.0f), 1.0f, true);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97920e;
            r rVarA3 = c2.l.A(rVarA2, 0.0f, f14, 1);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            x1 x1Var2 = p3.n.f135158a;
            int iHashCode2 = Long.hashCode(mVar.getU());
            i2 i2VarX2 = mVar.x();
            r rVarC3 = h4.k.c(rVarA3, mVar);
            h5.g.V.getClass();
            e0.a aVar9 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar9);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, mVar);
            b4.c(h5.g.a.f81809f, i2VarX2, mVar);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                v.h.z(iHashCode2, mVar, iHashCode2, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC3, mVar);
            c2.u uVar = c2.u.f22885a;
            m92.r.b(x2.d(aVar8, 1.0f), i53.a.e(arrayList), null, null, false, y.Q(mVar, R.string.common_no_data), 0.0f, 0.0f, null, null, null, mVar, 6, 0, 2012);
            mVar.y();
            String strQ = y.Q(mVar, R.string.label_last_4h);
            r rVarC4 = c2.l.C(c2.l.A(x2.x(aVar8, null, 3), f14, 0.0f, 2), 0.0f, 0.0f, 0.0f, eVar2.f97920e, 7);
            d92.b.f58624b.getClass();
            x0 x0Var = j92.f.f97933j;
            g02.c.a(strQ, rVarC4, 0L, null, 0, false, 0, d92.c.f(x0Var, mVar), 0.0d, mVar, 0, 380);
            g02.c.a(str3, c2.l.A(x2.x(aVar8, null, 3), f14, 0.0f, 2), 0L, null, 0, false, 0, d92.c.b(j92.f.f97930g, mVar), 0.0d, mVar, 0, 380);
            g02.c.a(str4, c2.l.A(x2.x(x2.f(aVar8, 1.0f), null, 3), f14, 0.0f, 2), 0L, null, 0, false, 0, d92.c.f(x0Var, mVar), 0.0d, mVar, 0, 380);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0457  */
    /* JADX WARN: Code duplicated, block: B:133:0x0472  */
    /* JADX WARN: Code duplicated, block: B:356:0x0cc4  */
    /* JADX WARN: Code duplicated, block: B:361:0x0ce7  */
    /* JADX WARN: Code duplicated, block: B:53:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:79:0x0289  */
    /* JADX WARN: Code duplicated, block: B:89:0x0342  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        String strH;
        int i14;
        float f14;
        float f15;
        String strC;
        i53.f fVarA;
        int i15 = this.f65269a;
        int i16 = 28;
        p3.m.a aVar = p3.m.f135153a;
        Object obj3 = this.f65274f;
        Object obj4 = this.f65273e;
        Object obj5 = this.f65271c;
        Object obj6 = this.f65270b;
        Object obj7 = this.f65272d;
        switch (i15) {
            case 0:
                ((Integer) obj2).getClass();
                q.a((zs.c) obj7, (e23.a) obj6, (e23.a) obj5, (e23.a) obj4, (e23.a) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 1:
                pt1.h hVar = (pt1.h) obj7;
                e23.a aVar2 = (e23.a) obj6;
                p1 p1Var = (p1) obj4;
                e23.p pVar = (e23.p) obj3;
                e23.a aVar3 = (e23.a) obj5;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    r.a aVar4 = r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    r rVarC = h4.k.c(aVar4, mVar);
                    h5.g.V.getClass();
                    e0.a aVar5 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar5);
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
                    if (hVar.f140853d.isEmpty()) {
                        strH = sn.a.h(mVar, 159974778, R.string.lbl_saved_trails, mVar);
                    } else {
                        mVar.C(159826319);
                        strH = y.P(R.string.trails_saved_count, new Object[]{Integer.valueOf(hVar.f140853d.size())}, mVar);
                        mVar.f();
                    }
                    z02.f.c(0, 54, null, aVar2, null, strH, mVar, null);
                    String str = (String) p1Var.getF182175a();
                    boolean z14 = hVar.f140851b;
                    String strQ = y.Q(mVar, R.string.search_hint_saved_trails);
                    boolean zB = mVar.B(p1Var) | mVar.B(pVar);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new e11.m(pVar, p1Var, 1);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new e11.m(pVar, p1Var, 1);
                            mVar.K(objQ);
                        }
                    }
                    e23.p pVar2 = (e23.p) objQ;
                    boolean zB2 = mVar.B(pVar) | mVar.B(p1Var);
                    Object objQ2 = mVar.q();
                    if (zB2) {
                        objQ2 = new et1.i(pVar, p1Var, 0);
                        mVar.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new et1.i(pVar, p1Var, 0);
                            mVar.K(objQ2);
                        }
                    }
                    w1.b(str, z14, strQ, pVar2, (e23.l) objQ2, aVar3, mVar, 0);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 2:
                e23.l lVar = (e23.l) obj6;
                o53.b0 b0Var2 = (o53.b0) obj5;
                e23.p pVar3 = (e23.p) obj4;
                e23.l lVar2 = (e23.l) obj3;
                String str2 = (String) obj;
                Boolean bool = (Boolean) obj2;
                bool.getClass();
                str2.getClass();
                if (((pt1.c) obj7).f140819d.f140833i) {
                    lVar.invoke(null);
                } else {
                    ge1.b.T(b0Var2, null, null, new u1(lVar2, null), 3);
                }
                pVar3.invoke(str2, bool);
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                q2.a((r) obj7, (us1.o) obj6, (List) obj5, (p1) obj4, (e23.l) obj3, (p3.m) obj, p0.t(3073));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                f21.o.b((String) obj7, (String) obj6, (i53.c) obj5, (z3.e) obj4, (z3.e) obj3, (p3.m) obj, p0.t(27649));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                fb0.e.a((fb0.a) obj7, (e23.l) obj4, (e23.l) obj3, (e23.a) obj6, (e23.a) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                fv0.f.c((fv0.g) obj7, (ou0.e) obj3, (e23.a) obj6, (e23.a) obj5, (e23.a) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 7:
                e23.p pVar4 = (e23.p) obj7;
                e23.p pVar5 = (e23.p) obj6;
                String str3 = (String) obj5;
                String str4 = (String) obj4;
                String str5 = (String) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                g02.b0 b0Var3 = g02.b0.f74326a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    r.a aVar6 = r.S;
                    float f16 = 16;
                    g6.f.a aVar7 = g6.f.f75994b;
                    r rVarY = c2.l.y(aVar6, f16);
                    h4.d.f81522a.getClass();
                    h4.g.b bVar2 = h4.d.a.f81534l;
                    c2.j.f22691a.getClass();
                    s2 s2VarA = c2.q2.a(c2.j.f22692b, bVar2, mVar2, 48);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    i2 i2VarX2 = mVar2.x();
                    r rVarC2 = h4.k.c(rVarY, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar8 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar8);
                    } else {
                        mVar2.c();
                    }
                    h5.g.a.e eVar = h5.g.a.f81810g;
                    b4.c(eVar, s2VarA, mVar2);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX2, mVar2);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar3);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC2, mVar2);
                    u2 u2Var = u2.f22900a;
                    if (pVar4 == null) {
                        mVar2.C(272554976);
                        mVar2.f();
                    } else {
                        v.h.D(mVar2, 1117170753, pVar4, mVar2, 0);
                    }
                    if (pVar4 != null) {
                        f14 = f16;
                        i14 = 0;
                    } else {
                        i14 = 0;
                        f14 = 0;
                    }
                    if (pVar5 == null) {
                        f16 = i14;
                    }
                    r rVarC3 = c2.l.C(u2Var.a(aVar6, 1.0f, true), f14, 0.0f, f16, 0.0f, 10);
                    z zVarA2 = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar2, i14);
                    int iHashCode3 = Long.hashCode(mVar2.getU());
                    i2 i2VarX3 = mVar2.x();
                    r rVarC4 = h4.k.c(rVarC3, mVar2);
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar8);
                    } else {
                        mVar2.c();
                    }
                    b4.c(eVar, zVarA2, mVar2);
                    b4.c(c1623g, i2VarX3, mVar2);
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar2, iHashCode3, bVar3);
                    }
                    b4.c(fVar, rVarC4, mVar2);
                    b0 b0Var4 = b0.f22601a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(str3, l72.v2.a(aVar6, false, new fx0.a(4), mVar2, 6), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar2), mVar2, 0, 0, 131068);
                    x0 x0Var = j92.f.f97933j;
                    mh.c(str4, l72.v2.a(aVar6, false, new fx0.a(5), mVar2, 6), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar2), mVar2, 0, 0, 131068);
                    if (str5 == null) {
                        mVar2.C(2075021252);
                        mVar2.f();
                    } else {
                        mVar2.C(2075021253);
                        mh.c(str5, l72.v2.a(aVar6, false, new fx0.a(6), mVar2, 6), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar2), mVar2, 0, 0, 131068);
                        mVar2.f();
                    }
                    mVar2.y();
                    if (pVar5 == null) {
                        mVar2.C(274084640);
                        mVar2.f();
                    } else {
                        v.h.D(mVar2, 1117220097, pVar5, mVar2, 0);
                    }
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                g52.k.a((z42.i) obj7, (LocalDate) obj5, (LocalDate) obj4, (e23.l) obj3, (e23.a) obj6, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 9:
                List list = (List) obj7;
                Calendar calendar = (Calendar) obj6;
                e23.l lVar3 = (e23.l) obj5;
                Calendar calendar2 = (Calendar) obj4;
                Calendar calendar3 = (Calendar) obj3;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    r.a aVar9 = r.S;
                    r rVarF = x2.f(aVar9, 1.0f);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar10 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    z zVarA3 = c2.y.a(c2.j.f22694d, aVar10, mVar3, 48);
                    int iHashCode4 = Long.hashCode(mVar3.getU());
                    i2 i2VarX4 = mVar3.x();
                    r rVarC5 = h4.k.c(rVarF, mVar3);
                    h5.g.V.getClass();
                    e0.a aVar11 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar11);
                    } else {
                        mVar3.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA3, mVar3);
                    b4.c(h5.g.a.f81809f, i2VarX4, mVar3);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar3, iHashCode4, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC5, mVar3);
                    b0 b0Var5 = b0.f22601a;
                    r82.g.a(x2.x(x2.z(aVar9, null, 3), null, 3), list, calendar, lVar3, calendar2, calendar3, mVar3, 6);
                    mVar3.y();
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 10:
                p1 p1Var2 = (p1) obj7;
                in.c cVar = (in.c) obj6;
                l22.a aVar12 = (l22.a) obj5;
                e23.l lVar4 = (e23.l) obj4;
                p1 p1Var3 = (p1) obj3;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    boolean zBooleanValue = ((Boolean) p1Var2.getF182175a()).booleanValue();
                    Object objQ3 = mVar4.q();
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new gp.e(p1Var2, 0);
                        mVar4.K(objQ3);
                    }
                    i3.u.a(zBooleanValue, (e23.a) objQ3, u1.n.e(r.S, fb1.c.z(d92.b.f58623a, mVar4), m1.f128891a), 0L, null, null, null, 0L, 0.0f, 0.0f, z3.f.c(-589364035, new ak0.j(cVar, aVar12, lVar4, p1Var2, p1Var3, 21), mVar4), mVar4, 48, 48, 2040);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 11:
                r rVar = (r) obj7;
                p1 p1Var4 = (p1) obj6;
                t tVar = (t) obj5;
                ds.n nVar = (ds.n) obj4;
                nr.p0 p0Var = (nr.p0) obj3;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    r.a aVar13 = r.S;
                    r rVarD = x2.d(aVar13, 1.0f);
                    if (!((Boolean) p1Var4.getF182175a()).booleanValue()) {
                        rVar = aVar13;
                    }
                    r rVarThen = rVarD.then(rVar);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode5 = Long.hashCode(mVar5.getU());
                    i2 i2VarX5 = mVar5.x();
                    r rVarC6 = h4.k.c(rVarThen, mVar5);
                    h5.g.V.getClass();
                    e0.a aVar14 = h5.g.a.f81805b;
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar14);
                    } else {
                        mVar5.c();
                    }
                    h5.g.a.e eVar2 = h5.g.a.f81810g;
                    b4.c(eVar2, z0VarD, mVar5);
                    h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
                    b4.c(c1623g2, i2VarX5, mVar5);
                    h5.g.a.b bVar5 = h5.g.a.f81813j;
                    if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode5))) {
                        v.h.z(iHashCode5, mVar5, iHashCode5, bVar5);
                    }
                    h5.g.a.f fVar2 = h5.g.a.f81807d;
                    b4.c(fVar2, rVarC6, mVar5);
                    c2.u uVar = c2.u.f22885a;
                    wf.f.a aVar15 = new wf.f.a((Context) mVar5.A(AndroidCompositionLocals_androidKt.f6042b));
                    pr.b bVar6 = pr.b.f139599a;
                    String str6 = tVar != null ? tVar.f100469a : null;
                    if (str6 == null) {
                        str6 = "";
                    }
                    String strConcat = str6.concat(is.c.a(nVar, false));
                    bVar6.getClass();
                    aVar15.f184930c = pr.b.b(strConcat);
                    wf.h.a(aVar15);
                    wf.f fVarA2 = aVar15.a();
                    r rVarD2 = x2.d(aVar13, 1.0f);
                    f5.k.f68985a.getClass();
                    f5.k.a.e eVar3 = f5.k.a.f68988c;
                    Object objQ4 = mVar5.q();
                    aVar.getClass();
                    int i17 = 21;
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new b2(p1Var4, i17);
                        mVar5.K(objQ4);
                    }
                    jf.r.b(fVarA2, null, rVarD2, null, null, null, null, (e23.l) objQ4, null, null, eVar3, null, mVar5, 12583344, 6, 31608);
                    String str7 = p0Var.f127282a;
                    List<l0> list2 = p0Var.f127285d;
                    String str8 = p0Var.f127283b;
                    Integer num = p0Var.f127284c;
                    long jA = com.nimbusds.jose.shaded.gson.internal.a.a(d92.b.f58623a, mVar5);
                    ds.n nVar2 = ds.n.f61012i;
                    i17 = nVar == nVar2 ? 69 : 21;
                    g6.f.a aVar16 = g6.f.f75994b;
                    ds.f0.a(str7, str8, num, null, null, jA, 0L, 0L, i17, null, mVar5, 3072, 720);
                    r rVarC7 = uVar.c(aVar13, h4.d.a.f81530h);
                    if (nVar == nVar2) {
                        f15 = 88;
                    } else {
                        d92.b.f58625c.getClass();
                        f15 = j92.b.f97899b.f97920e;
                    }
                    r rVarC8 = c2.l.C(rVarC7, 0.0f, 0.0f, 0.0f, f15, 7);
                    c2.j.f22691a.getClass();
                    z zVarA4 = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar5, 0);
                    int iHashCode6 = Long.hashCode(mVar5.getU());
                    i2 i2VarX6 = mVar5.x();
                    r rVarC9 = h4.k.c(rVarC8, mVar5);
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar14);
                    } else {
                        mVar5.c();
                    }
                    b4.c(eVar2, zVarA4, mVar5);
                    b4.c(c1623g2, i2VarX6, mVar5);
                    if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode6))) {
                        v.h.z(iHashCode6, mVar5, iHashCode6, bVar5);
                    }
                    b4.c(fVar2, rVarC9, mVar5);
                    b0 b0Var6 = b0.f22601a;
                    l0 l0Var = (l0) h0.e0(0, list2);
                    r22.p pVar6 = l0Var != null ? l0Var.f127250a : null;
                    l72.x0 x0Var2 = l72.x0.f111346a;
                    d92.b.f58625c.getClass();
                    j92.e eVar4 = j92.b.f97899b;
                    r rVarC10 = c2.l.C(c2.l.A(aVar13, eVar4.f97920e, 0.0f, 2), 0.0f, 0.0f, 0.0f, eVar4.f97920e, 7);
                    z3.e eVarC = z3.f.c(-244968534, new gs.i(pVar6, 1), mVar5);
                    int i18 = (l72.x0.f111348c << 6) | 48;
                    x0Var2.e(rVarC10, eVarC, mVar5, i18, 0);
                    l0 l0Var2 = (l0) h0.e0(1, list2);
                    r22.p pVar7 = l0Var2 != null ? l0Var2.f127250a : null;
                    l0 l0Var3 = (l0) h0.e0(2, list2);
                    x0Var2.e(c2.l.A(aVar13, eVar4.f97920e, 0.0f, 2), z3.f.c(239017235, new a42.a(pVar7, 28, tVar, l0Var3 != null ? l0Var3.f127250a : null), mVar5), mVar5, i18, 0);
                    mVar5.y();
                    y0.a(n5.c.a(R.drawable.garmin_logo_tag_vertical, mVar5, 0), null, uVar.c(c2.l.C(aVar13, 0.0f, nVar == nVar2 ? 64 : eVar4.f97922g, 0.0f, 0.0f, 13), h4.d.a.f81526d), null, null, 0.0f, null, mVar5, 48, 120);
                    mVar5.y();
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 12:
                pv0.h hVar2 = (pv0.h) obj5;
                e23.q qVar = (e23.q) obj4;
                p1 p1Var5 = (p1) obj3;
                pv0.s sVar = (pv0.s) obj;
                pv0.o oVar = (pv0.o) obj2;
                sVar.getClass();
                oVar.getClass();
                ge1.b.T((o53.b0) obj7, null, null, new gw0.j.m((mc) obj6, null), 3);
                if (az0.b.a()) {
                    p1Var5.setValue(gw0.j.n((i53.c) p1Var5.getF182175a(), hVar2.f141374a, sVar, oVar));
                    qVar.invoke(hVar2, sVar, oVar);
                    Unit unit = Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            case 13:
                List<pv0.o> list3 = (List) obj7;
                e23.l lVar5 = (e23.l) obj5;
                pv0.h hVar3 = (pv0.h) obj4;
                e23.a aVar17 = (e23.a) obj6;
                aw0.a aVar18 = (aw0.a) obj3;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    ArrayList arrayList = new ArrayList(p13.y.r(list3, 10));
                    for (pv0.o oVar2 : list3) {
                        w wVarC = pv0.j.c(hVar3);
                        pv0.y yVarB = wVarC != null ? pv0.x.b(wVarC, oVar2.f141395a) : null;
                        oVar2.getClass();
                        Integer num2 = oVar2.f141397c;
                        int iIntValue7 = num2 != null ? num2.intValue() : 0;
                        if (yVarB != null) {
                            zv0.a aVar19 = zv0.a.f207158a;
                            l22.b bVar7 = aVar18.f13319a;
                            aVar19.getClass();
                            strC = zv0.a.c(yVarB, bVar7);
                        } else {
                            strC = null;
                        }
                        arrayList.add(g22.n.d(strC) ? vb.h.h(iIntValue7, strC, ": ") : String.valueOf(iIntValue7));
                    }
                    i53.c cVarE = i53.a.e(arrayList);
                    boolean zB3 = mVar6.B(lVar5) | mVar6.r(hVar3) | mVar6.r(list3);
                    Object objQ5 = mVar6.q();
                    if (zB3) {
                        objQ5 = new ci0.b(lVar5, i16, hVar3, list3);
                        mVar6.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new ci0.b(lVar5, i16, hVar3, list3);
                            mVar6.K(objQ5);
                        }
                    }
                    e23.l lVar6 = (e23.l) objQ5;
                    boolean zB4 = mVar6.B(aVar17);
                    Object objQ6 = mVar6.q();
                    if (zB4) {
                        objQ6 = new s(aVar17, 5);
                        mVar6.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new s(aVar17, 5);
                            mVar6.K(objQ6);
                        }
                    }
                    wv0.q.a(cVarE, lVar6, (e23.a) objQ6, mVar6, 0);
                    x1 x1Var7 = p3.n.f135158a;
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                gw0.t.b((a0) obj7, (ArrayList) obj4, (ug2.x) obj3, (e23.a) obj6, (e23.a) obj5, (p3.m) obj, p0.t(7));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                h21.a0.a((o82.a) obj7, (i53.f) obj6, (v21.e) obj5, (pi0.e) obj4, (e23.l) obj3, (p3.m) obj, p0.t(4097));
                return Unit.INSTANCE;
            case 16:
                h60.h hVar4 = (h60.h) obj7;
                o82.g gVar = (o82.g) obj5;
                e23.a aVar20 = (e23.a) obj6;
                Context context = (Context) obj4;
                c.q qVar2 = (c.q) obj3;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    String strQ2 = y.Q(mVar7, R.string.lbl_css);
                    boolean zR = mVar7.r(hVar4) | mVar7.k(gVar.ordinal()) | mVar7.B(aVar20);
                    Object objQ7 = mVar7.q();
                    if (zR) {
                        objQ7 = new fk0.a(hVar4, 20, gVar, aVar20);
                        mVar7.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new fk0.a(hVar4, 20, gVar, aVar20);
                            mVar7.K(objQ7);
                        }
                    }
                    e23.a aVar21 = (e23.a) objQ7;
                    if (gVar != o82.g.f130849b) {
                        mVar7.C(22212767);
                        fVarA = i53.a.a(new i3("HELP", y.Q(mVar7, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null), new i3("ADD_CSS", y.Q(mVar7, R.string.lbl_add_css_result), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                        mVar7.f();
                    } else {
                        mVar7.C(22522891);
                        fVarA = i53.a.a(new i3("HELP", y.Q(mVar7, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null), new i3("ADD_CSS", y.Q(mVar7, R.string.lbl_add_css_result), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null), new i3("DELETE_CSS", y.Q(mVar7, R.string.lbl_delete_css_result), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                        mVar7.f();
                    }
                    i53.f fVar3 = fVarA;
                    boolean zR2 = mVar7.r(hVar4) | mVar7.k(gVar.ordinal()) | mVar7.r(context) | mVar7.r(qVar2);
                    Object objQ8 = mVar7.q();
                    if (zR2) {
                        ev2.f fVar4 = new ev2.f(hVar4, gVar, context, qVar2, 9);
                        mVar7.K(fVar4);
                        objQ8 = fVar4;
                    } else {
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            ev2.f fVar5 = new ev2.f(hVar4, gVar, context, qVar2, 9);
                            mVar7.K(fVar5);
                            objQ8 = fVar5;
                        }
                    }
                    z02.f.d(strQ2, null, null, aVar21, null, fVar3, (e23.l) objQ8, mVar7, 2097152, 54);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 17:
                i53.f fVar6 = (i53.f) obj7;
                o82.g gVar2 = (o82.g) obj6;
                n82.f fVar7 = (n82.f) obj5;
                Context context2 = (Context) obj4;
                h60.h hVar5 = (h60.h) obj3;
                p3.m mVar8 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    r.a aVar22 = r.S;
                    r rVarE = u1.n.e(x2.d(aVar22, 1.0f), vb.h.e(d92.b.f58623a, mVar8), m1.f128891a);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar23 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    z zVarA5 = c2.y.a(c2.j.f22694d, aVar23, mVar8, 48);
                    int iHashCode7 = Long.hashCode(mVar8.getU());
                    i2 i2VarX7 = mVar8.x();
                    r rVarC11 = h4.k.c(rVarE, mVar8);
                    h5.g.V.getClass();
                    e0.a aVar24 = h5.g.a.f81805b;
                    if (mVar8.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar8.z();
                    if (mVar8.getT()) {
                        mVar8.M(aVar24);
                    } else {
                        mVar8.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA5, mVar8);
                    b4.c(h5.g.a.f81809f, i2VarX7, mVar8);
                    h5.g.a.b bVar8 = h5.g.a.f81813j;
                    if (mVar8.getT() || !p005kotlin.jvm.internal.s.g(mVar8.q(), Integer.valueOf(iHashCode7))) {
                        v.h.z(iHashCode7, mVar8, iHashCode7, bVar8);
                    }
                    b4.c(h5.g.a.f81807d, rVarC11, mVar8);
                    b0 b0Var7 = b0.f22601a;
                    i53.c cVarE2 = i53.a.e(o2.b(fVar6, mVar8));
                    int iIndexOf = fVar6.indexOf(gVar2);
                    boolean zB5 = mVar8.B(fVar7);
                    Object objQ9 = mVar8.q();
                    if (zB5) {
                        objQ9 = new a42.f0(fVar7, fVar6, 6);
                        mVar8.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new a42.f0(fVar7, fVar6, 6);
                            mVar8.K(objQ9);
                        }
                    }
                    t82.c.a(cVarE2, null, iIndexOf, 0.0f, (e23.l) objQ9, mVar8, 3072, 18);
                    Object objQ10 = mVar8.q();
                    aVar.getClass();
                    if (objQ10 == p3.m.a.f135155b) {
                        objQ10 = new yd1.a(context2);
                        mVar8.K(objQ10);
                    }
                    yd1.a aVar25 = (yd1.a) objQ10;
                    if (gVar2 != o82.g.f130849b) {
                        mVar8.C(174415259);
                        q82.a.a(x2.f(aVar22, 1.0f), new n82.n(fVar7, aVar25), null, mVar8, 6, 4);
                        mVar8.f();
                    } else {
                        mVar8.C(174623796);
                        mVar8.f();
                    }
                    n82.c.a(b0Var7.a(aVar22, 1.0f, true), fVar7, 3, false, z3.f.c(-1755682608, new aa2.r(hVar5, 27, gVar2, fVar7), mVar8), mVar8, 24960, 8);
                    mVar8.y();
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                hl1.a.a((hl1.c) obj7, (il1.a) obj5, (kl1.a) obj4, (e23.s) obj3, (e23.a) obj6, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 19:
                return a(obj, obj2);
            case 20:
                return b(obj, obj2);
            case 21:
                ((Integer) obj2).getClass();
                ht1.w.g((r) obj7, (i53.c) obj6, (e23.l) obj5, (e23.p) obj4, (e23.l) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                o1.b((r) obj7, (r1) obj6, (k1) obj5, (i3.m1) obj4, (z3.e) obj3, (p3.m) obj, p0.t(24577));
                return Unit.INSTANCE;
            case 23:
                return c(obj, obj2);
            case 24:
                return d(obj, obj2);
            case 25:
                return e(obj, obj2);
            case 26:
                return f(obj, obj2);
            case 27:
                return g(obj, obj2);
            case 28:
                return h(obj, obj2);
            default:
                e23.p pVar8 = (e23.p) obj6;
                p1 p1Var6 = (p1) obj5;
                p1 p1Var7 = (p1) obj4;
                p1 p1Var8 = (p1) obj3;
                pu0.b bVar9 = (pu0.b) obj;
                pu0.b bVar10 = (pu0.b) obj2;
                bVar9.getClass();
                bVar10.getClass();
                if (((Boolean) ((e23.l) obj7).invoke(bVar9)).booleanValue()) {
                    p1Var6.setValue(bVar9);
                    p1Var7.setValue(bVar10);
                    p1Var8.setValue(Boolean.TRUE);
                } else {
                    pVar8.invoke(bVar9, bVar10);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ p(fv0.g gVar, ou0.e eVar, e23.a aVar, e23.a aVar2, e23.a aVar3, int i14) {
        this.f65269a = 6;
        this.f65272d = gVar;
        this.f65274f = eVar;
        this.f65270b = aVar;
        this.f65271c = aVar2;
        this.f65273e = aVar3;
    }

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, e23.a aVar, Object obj4, int i14) {
        this.f65269a = i14;
        this.f65272d = obj;
        this.f65271c = obj2;
        this.f65273e = obj3;
        this.f65270b = aVar;
        this.f65274f = obj4;
    }

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i14) {
        this.f65269a = i14;
        this.f65272d = obj;
        this.f65270b = obj2;
        this.f65271c = obj3;
        this.f65273e = obj4;
        this.f65274f = obj5;
    }

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, Object obj4, o13.h hVar, int i14, int i15) {
        this.f65269a = i15;
        this.f65272d = obj;
        this.f65270b = obj2;
        this.f65271c = obj3;
        this.f65273e = obj4;
        this.f65274f = hVar;
    }

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, o13.h hVar, e23.a aVar, int i14, int i15) {
        this.f65269a = i15;
        this.f65272d = obj;
        this.f65271c = obj2;
        this.f65273e = obj3;
        this.f65274f = hVar;
        this.f65270b = aVar;
    }

    public /* synthetic */ p(Object obj, Object obj2, o13.h hVar, e23.a aVar, e23.a aVar2, int i14, int i15) {
        this.f65269a = i15;
        this.f65272d = obj;
        this.f65273e = obj2;
        this.f65274f = hVar;
        this.f65270b = aVar;
        this.f65271c = aVar2;
    }

    public /* synthetic */ p(pt1.h hVar, e23.a aVar, p1 p1Var, e23.p pVar, e23.a aVar2) {
        this.f65269a = 1;
        this.f65272d = hVar;
        this.f65270b = aVar;
        this.f65273e = p1Var;
        this.f65274f = pVar;
        this.f65271c = aVar2;
    }
}
