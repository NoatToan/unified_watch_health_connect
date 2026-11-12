package cn1;

import android.content.Context;
import android.text.format.DateFormat;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import o4.d0;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p13.h0;
import p13.w;
import p13.x;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import w2.a0;

/* JADX INFO: loaded from: classes10.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z3.e f28029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z3.e f28030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z3.e f28031c;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28032a;

        static {
            int[] iArr = new int[qm1.o.values().length];
            try {
                iArr[qm1.o.SLEEP_SCORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[qm1.o.SLEEP_LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[qm1.o.MANUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f28032a = iArr;
        }
    }

    static {
        e.f28008a.getClass();
        f28029a = e.f28009b;
        f28030b = e.f28010c;
        f28031c = e.f28011d;
    }

    public static final void a(h4.r rVar, Context context, b10.c cVar, qm1.k kVar, e23.t[] tVarArr, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1891377169);
        Context context2 = context;
        b10.c cVar2 = cVar;
        qm1.k kVar2 = kVar;
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.r(context2) ? 32 : 16) | (o0VarE.r(cVar2) ? 256 : 128) | (o0VarE.B(kVar2) ? 2048 : 1024);
        o0VarE.N(-842288799, Integer.valueOf(tVarArr.length));
        int i16 = i15 | (o0VarE.k(tVarArr.length) ? 16384 : 0);
        for (e23.t tVar : tVarArr) {
            i16 |= o0VarE.r(tVar) ? 16384 : 0;
        }
        o0VarE.g0(false);
        if ((57344 & i16) == 0) {
            i16 |= 8192;
        }
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(rVar, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarC = c2.l.C(rVarF, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
            c2.j.f22691a.getClass();
            c2.j.k kVar3 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar3, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            o0VarE.C(1219907354);
            int length = tVarArr.length;
            int i17 = 0;
            while (i17 < length) {
                tVarArr[i17].invoke(b0Var, context2, cVar2, kVar2, o0VarE, Integer.valueOf((i16 & 112) | 518 | (i16 & 896) | (i16 & 7168)));
                i17++;
                context2 = context;
                cVar2 = cVar;
                kVar2 = kVar;
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.z(rVar, context, cVar, kVar, tVarArr, i14, 14);
        }
    }

    public static final void b(h4.r rVar, qm1.k kVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        boolean z14;
        String strJ;
        boolean z15;
        o13.p<Long, Long> pVar;
        o13.p<Long, Long> pVar2;
        o0 o0VarE = mVar.E(-1557387798);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(kVar) : o0VarE.r(kVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            b10.c cVar = new b10.c(new l22.a(context));
            mn1.d dVar = new mn1.d(new l22.a(context));
            boolean zIs24HourFormat = DateFormat.is24HourFormat(context);
            String strA = b10.c.a(new DateTime((kVar == null || (pVar2 = kVar.f145624e) == null) ? null : pVar2.f128594a), zIs24HourFormat);
            String strA2 = b10.c.a(new DateTime((kVar == null || (pVar = kVar.f145624e) == null) ? null : pVar.f128595b), zIs24HourFormat);
            int i17 = a.f28032a[qm1.l.b(kVar).ordinal()];
            if (i17 == 1) {
                o0VarE.C(-1902445390);
                o0VarE.C(-2001031903);
                Integer num = kVar != null ? kVar.f145621b : null;
                Integer num2 = kVar != null ? kVar.f145622c : null;
                if (num == null || num2 == null) {
                    z14 = false;
                    strJ = null;
                } else {
                    int iIntValue = num2.intValue();
                    int iIntValue2 = num.intValue();
                    z14 = false;
                    strJ = oi0.c.P(x.k(gl1.y.P(R.string.msg_value_out_of_100, new Object[]{Integer.valueOf(iIntValue2)}, o0VarE), gl1.y.Q(o0VarE, R.string.lbl_quality), dVar.f(Integer.valueOf(iIntValue2)), new oi0.h(context).c(iIntValue, false), gl1.y.Q(o0VarE, R.string.lbl_duration)));
                }
                o0VarE.g0(z14);
                if (strJ == null) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -2001013163, R.string.no_data_label, o0VarE, z14);
                } else {
                    o0VarE.C(-2001031856);
                    o0VarE.g0(z14);
                }
                o0VarE.g0(z14);
            } else if (i17 == 2) {
                o0VarE.C(-1901734188);
                Integer num3 = kVar != null ? kVar.f145622c : null;
                if (num3 == null) {
                    o0VarE.C(-1901712582);
                    o0VarE.g0(false);
                    strJ = null;
                } else {
                    o0VarE.C(-1901712581);
                    strJ = h0.k0(w.c(gl1.y.P(R.string.string_space_string_pattern, new Object[]{new oi0.h(context).c(num3.intValue(), false), gl1.y.Q(o0VarE, R.string.lbl_duration)}, o0VarE)), ". ", null, null, null, 62);
                    o0VarE.g0(false);
                }
                if (strJ == null) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -2000994251, R.string.no_data_label, o0VarE, false);
                } else {
                    o0VarE.C(-2001008914);
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            } else {
                if (i17 != 3) {
                    throw kg.f.h(o0VarE, -2001032828, false);
                }
                o0VarE.C(-1901137593);
                Integer num4 = kVar != null ? kVar.f145622c : null;
                if (num4 == null) {
                    o0VarE.C(-1901115987);
                    z15 = false;
                    o0VarE.g0(false);
                    strJ = null;
                } else {
                    o0VarE.C(-1901115986);
                    strJ = oi0.c.P(x.k(gl1.y.P(R.string.string_space_string_pattern, new Object[]{new oi0.h(context).c(num4.intValue(), false), gl1.y.Q(o0VarE, R.string.lbl_duration)}, o0VarE), gl1.y.P(R.string.string_space_string_pattern, new Object[]{strA, gl1.y.Q(o0VarE, R.string.sleep_lbl_bedtime)}, o0VarE), gl1.y.P(R.string.string_space_string_pattern, new Object[]{strA2, gl1.y.Q(o0VarE, R.string.sleep_lbl_wake_time)}, o0VarE)));
                    z15 = false;
                    o0VarE.g0(false);
                }
                if (strJ == null) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -2000958731, R.string.no_data_label, o0VarE, z15);
                } else {
                    o0VarE.C(-2000989669);
                    o0VarE.g0(z15);
                }
                o0VarE.g0(z15);
            }
            o0Var = o0VarE;
            yz1.s.c(rVar, kVar != null ? kVar.f145620a : null, qm1.l.e(kVar, a0.s(o0VarE)), null, qm1.l.a(kVar), o70.t.Z.e(null, o0VarE, 1), 0.0f, 0, null, 0.0f, null, null, z3.f.c(-652507719, new a51.l(kVar, strJ, context, cVar, 22), o0VarE), aVar, o0Var, i16 & 14, ((i16 << 3) & 7168) | 384, 4040);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.f(rVar, (Object) kVar, (Object) aVar, i14, 29);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009f  */
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
    public static final void c(h4.r rVar, yz1.d dVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-1235295177);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_see_how_well_slept);
            String strQ2 = gl1.y.Q(o0VarE, R.string.msg_wear_device_while_sleeping);
            o70.t tVar = o70.t.Z;
            String strD = tVar.d(new l22.a(context), null);
            int i16 = i15;
            u4.d dVarB = o70.t.b(tVar);
            d0 d0VarE = tVar.e(null, o0VarE, 1);
            boolean zR = o0VarE.r(context);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new a42.d(context, 24);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a42.d(context, 24);
                    o0VarE.K(objQ);
                }
            }
            yz1.s.d(rVar, dVar, strD, strQ, strQ2, dVarB, d0VarE, 0.0f, null, 0.0f, aVar, (e23.a) objQ, null, o0VarE, i16 & 126, (i16 << 3) & 7168, 40832);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m(rVar, dVar, aVar, i14, 0);
        }
    }

    public static final void d(h4.r rVar, yz1.d dVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(1848113100);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_no_sleep_detected);
            String strQ2 = gl1.y.Q(o0VarE, R.string.msg_continue_wearing_your_device_while_sleeping);
            o70.t tVar = o70.t.Z;
            int i16 = i15;
            yz1.s.d(rVar, dVar, tVar.d(a0.s(o0VarE), null), strQ, strQ2, o70.t.b(tVar), tVar.e(null, o0VarE, 1), 0.0f, null, 0.0f, aVar, null, null, o0VarE, i16 & 126, ((i16 << 3) & 7168) | 196608, 24448);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m(rVar, dVar, aVar, i14, 1);
        }
    }
}
