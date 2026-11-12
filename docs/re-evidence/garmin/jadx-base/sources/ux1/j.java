package ux1;

import android.app.Activity;
import c2.b0;
import c2.l;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.mlkit.common.MlKitException;
import dy1.t;
import e23.p;
import f72.vb;
import h4.k;
import h4.r;
import h5.e0;
import i3.e5;
import i3.fe;
import i3.i7;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l72.c1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import rv1.q;
import s5.x0;
import s70.a0;
import sk0.k1;
import t21.v0;
import tr2.o;
import ty1.f1;
import u1.w;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f173071a;

        static {
            int[] iArr = new int[dy1.e.values().length];
            try {
                iArr[dy1.e.NEW_BENCHMARKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[dy1.e.CONFIRM_BENCHMARKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[dy1.e.NOT_SET_BENCHMARKS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f173071a = iArr;
        }
    }

    public static final void a(dy1.f fVar, String str, m mVar, int i14) {
        o0 o0VarE = mVar.E(414440512);
        int i15 = (o0VarE.r(fVar) ? 4 : 2) | i14 | (o0VarE.B(str) ? 32 : 16);
        int i16 = 14;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            List<dy1.e> list = fVar.f61551a;
            if (list == null || list.isEmpty()) {
                o0VarE.C(-1432703902);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1433451746);
                r rVarF = x2.f(r.S, 1.0f);
                d92.b.f58623a.getClass();
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar = j92.b.f97899b;
                r rVarY = l.y(rVarF, eVar.f97920e);
                h4.d.f81522a.getClass();
                h4.g.a aVar = h4.d.a.f81537o;
                c2.j jVar = c2.j.f22691a;
                bVar.getClass();
                float f14 = eVar.f97920e;
                jVar.getClass();
                z zVarA = y.a(c2.j.i(f14), aVar, o0VarE, 48);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                r rVarC = k.c(rVarY, o0VarE);
                h5.g.V.getClass();
                e0.a aVar2 = h5.g.a.f81805b;
                if (o0VarE.f135177b == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                b0 b0Var = b0.f22601a;
                e23.a<Unit> aVar3 = fVar.f61553c;
                o0VarE.C(1459907535);
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    int i17 = a.f173071a[((dy1.e) it.next()).ordinal()];
                    if (i17 == 1) {
                        o0VarE.C(-79402575);
                        e(aVar3, o0VarE, 0);
                        o0VarE.g0(false);
                    } else if (i17 == 2) {
                        o0VarE.C(-79399584);
                        d((i15 >> 3) & 14, aVar3, str, o0VarE);
                        o0VarE.g0(false);
                    } else {
                        if (i17 != 3) {
                            throw kg.f.h(o0VarE, -79404802, false);
                        }
                        o0VarE.C(-79396140);
                        f(aVar3, o0VarE, 0);
                        o0VarE.g0(false);
                    }
                }
                e5.u(o0VarE, false, true, false);
            }
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u91.i(fVar, str, i14, i16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    public static final void b(dy1.f fVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(1106665932);
        int i15 = (o0VarE.r(fVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            l72.p2 p2Var = l72.p2.f111205a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_stp_benchmarks);
            String str = fVar.f61552b;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            c.f173044a.getClass();
            z3.e eVar = c.f173045b;
            boolean zR = o0VarE.r(fVar);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new f1(fVar, 19);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new f1(fVar, 19);
                    o0VarE.K(objQ);
                }
            }
            p2Var.h(strQ, str2, null, null, null, false, false, eVar, null, null, (e23.a) objQ, o0VarE, 12582912, 0, 892);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(fVar, i14, 11);
        }
    }

    public static final void c(Map<String, ? extends List<? extends ActivityListItemDTO>> map, m mVar, int i14) {
        boolean z14;
        o0 o0VarE = mVar.E(300883457);
        int i15 = i14 | (o0VarE.r(map) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            if (map != null) {
                o0VarE.C(22536900);
                r.a aVar = r.S;
                r rVarF = x2.f(aVar, 1.0f);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                r rVarC = k.c(rVarF, o0VarE);
                h5.g.V.getClass();
                e0.a aVar2 = h5.g.a.f81805b;
                if (o0VarE.f135177b == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                b0 b0Var = b0.f22601a;
                String strQ = gl1.y.Q(o0VarE, map.isEmpty() ? R.string.lbl_activites : R.string.lbl_completed_activities);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97930g), o0VarE);
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar = j92.b.f97899b;
                mh.c(strQ, l.y(aVar, eVar.f97920e), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
                o0VarE = o0VarE;
                if (map.isEmpty()) {
                    o0VarE.C(-1373494922);
                    r rVarF2 = x2.f(aVar, 1.0f);
                    u4.d dVarA = vt1.o.f180177h.a();
                    bVar2.getClass();
                    cv1.b.a(rVarF2, dVarA, 0.0f, eVar.f97920e, R.string.lbl_lets_start_training, R.string.completed_activities_training_plan_message, o0VarE, 6, 4);
                    z14 = false;
                    o0VarE.g0(false);
                } else {
                    z14 = false;
                    o0VarE.C(-1373034045);
                    o0VarE.C(-182837647);
                    for (String str : map.keySet()) {
                        r rVarF3 = x2.f(r.S, 1.0f);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        cv1.m.a(l.C(rVarF3, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97917b, 7), str, z3.f.c(292385960, new u91.i(15, map, str), o0VarE), o0VarE, 384);
                    }
                    o0VarE.g0(false);
                    r rVarF4 = x2.f(r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    l.f(x2.h(rVarF4, j92.b.f97899b.f97920e), o0VarE);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                o0VarE.g0(z14);
            } else {
                map = map;
                o0VarE.C(25178689);
                o0VarE.g0(false);
            }
            x1 x1Var2 = n.f135158a;
        } else {
            map = map;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q(map, i14, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public static final void d(int i14, e23.a aVar, String str, m mVar) {
        int i15;
        o0 o0VarE = mVar.E(1646639203);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new b(21);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(-2087781203);
                l72.s sVar = l72.s.f111232a;
                s62.a.f157643a.getClass();
                u4.d dVarA = vb.a(t62.c.f162799a);
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_stp_confirm_benchmarks);
                String strP = gl1.y.P(R.string.lbl_confirm_benchmarks_description, new Object[]{str}, o0VarE);
                String strQ2 = gl1.y.Q(o0VarE, R.string.common_confirm);
                boolean zB = o0VarE.B(p1Var);
                Object objQ2 = o0VarE.q();
                if (zB || objQ2 == c2565a) {
                    objQ2 = new tn.h(p1Var, 24);
                    o0VarE.K(objQ2);
                }
                e23.a aVar2 = (e23.a) objQ2;
                boolean z14 = (i15 & 112) == 32;
                Object objQ3 = o0VarE.q();
                if (z14 || objQ3 == c2565a) {
                    objQ3 = new u11.b(aVar, 27);
                    o0VarE.K(objQ3);
                }
                sVar.c(null, dVarA, null, null, strQ, strP, strQ2, false, aVar2, (e23.a) objQ3, o0VarE, 0, 0, 397);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-2087364129);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.j(str, aVar, i14, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public static final void e(e23.a aVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1788208618);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new b(20);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(-2043413005);
                l72.s sVar = l72.s.f111232a;
                s62.a.f157643a.getClass();
                u4.d dVarA = vb.a(t62.c.f162799a);
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_new_benchmarks);
                String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_estimated_benchmarks);
                String strQ3 = gl1.y.Q(o0VarE, R.string.btn_view_benchmark);
                boolean zB = o0VarE.B(p1Var);
                Object objQ2 = o0VarE.q();
                if (zB || objQ2 == c2565a) {
                    objQ2 = new tn.h(p1Var, 23);
                    o0VarE.K(objQ2);
                }
                e23.a aVar2 = (e23.a) objQ2;
                boolean z14 = (i15 & 14) == 4;
                Object objQ3 = o0VarE.q();
                if (z14 || objQ3 == c2565a) {
                    objQ3 = new g(aVar, 1);
                    o0VarE.K(objQ3);
                }
                sVar.c(null, dVarA, null, null, strQ, strQ2, strQ3, false, aVar2, (e23.a) objQ3, o0VarE, 0, 0, 397);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-2043019956);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a0(aVar, i14, 24);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public static final void f(e23.a aVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(261985569);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new b(19);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(856665923);
                l72.s sVar = l72.s.f111232a;
                s62.a.f157643a.getClass();
                u4.d dVarA = vb.a(t62.c.f162799a);
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_benchmarks_not_set);
                String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_benchmarks_no_weight);
                String strQ3 = gl1.y.Q(o0VarE, R.string.btn_edit_benchmarks);
                boolean zB = o0VarE.B(p1Var);
                Object objQ2 = o0VarE.q();
                if (zB || objQ2 == c2565a) {
                    objQ2 = new tn.h(p1Var, 20);
                    o0VarE.K(objQ2);
                }
                e23.a aVar2 = (e23.a) objQ2;
                boolean z14 = (i15 & 14) == 4;
                Object objQ3 = o0VarE.q();
                if (z14 || objQ3 == c2565a) {
                    objQ3 = new u11.b(aVar, 28);
                    o0VarE.K(objQ3);
                }
                sVar.c(null, dVarA, null, null, strQ, strQ2, strQ3, false, aVar2, (e23.a) objQ3, o0VarE, 0, 0, 397);
                o0VarE.g0(false);
            } else {
                o0VarE.C(857063777);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a0(aVar, i14, 23);
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x01f1  */
    public static final void g(String str, String str2, String str3, boolean z14, boolean z15, e23.a aVar, e23.a aVar2, m mVar, int i14) {
        e23.a aVar3;
        j92.e eVar;
        o0 o0VarE = mVar.E(549647171);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.B(str3) ? 256 : 128) | (o0VarE.h(z14) ? 2048 : 1024) | (o0VarE.h(z15) ? 16384 : 8192) | (o0VarE.r(aVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = n.f135158a;
            r.a aVar4 = r.S;
            r rVarF = x2.f(aVar4, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97921f;
            float f15 = eVar2.f97918c;
            bVar.getClass();
            r rVarZ = l.z(rVarF, eVar2.f97920e, f14);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarZ, o0VarE);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar3 = h5.g.a.f81810g;
            b4.c(eVar3, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            h4.g.b bVar3 = h4.d.a.f81534l;
            bVar.getClass();
            s2 s2VarA = q2.a(c2.j.i(f15), bVar3, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = k.c(aVar4, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(eVar3, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            r rVarA = u2Var.a(aVar4, 1.0f, false);
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            mh.c(str, rVarA, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, i15 & 14, 0, 131068);
            o0VarE = o0VarE;
            m.a aVar6 = m.f135153a;
            if (z14) {
                o0VarE.C(-673986611);
                t4.d dVarA = n5.c.a(R.drawable.about, o0VarE, 0);
                long jY = sn.a.y(o0VarE);
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_about);
                bVar.getClass();
                r rVarC3 = u2Var.c(x2.q(aVar4, j92.b.f97901d.f97905d), bVar3);
                boolean z16 = (i15 & 3670016) == 1048576;
                Object objQ = o0VarE.q();
                if (z16) {
                    objQ = new u11.b(aVar2, 29);
                    o0VarE.K(objQ);
                } else {
                    aVar6.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new u11.b(aVar2, 29);
                        o0VarE.K(objQ);
                    }
                }
                i7.a(dVarA, strQ, w.d(rVarC3, false, null, null, (e23.a) objQ, 15), jY, o0VarE, 0, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-673488379);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            if (g22.n.d(str2)) {
                o0VarE.C(224444093);
                fVar2.getClass();
                mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, (i15 >> 3) & 14, 0, 131070);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(224578633);
                o0VarE.g0(false);
            }
            if (g22.n.d(str3)) {
                eVar = eVar2;
                r rVarC4 = l.C(ds.e0.g(o0VarE, 224664038, aVar4, 1.0f, bVar), 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
                bVar.getClass();
                s2 s2VarA2 = q2.a(c2.j.i(f15), bVar3, o0VarE, 48);
                int iHashCode3 = Long.hashCode(o0VarE.U);
                i2 i2VarA2 = o0VarE.a0();
                r rVarC5 = k.c(rVarC4, o0VarE);
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar5);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar3, s2VarA2, o0VarE);
                b4.c(c1623g, i2VarA2, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
                }
                b4.c(fVar, rVarC5, o0VarE);
                t4.d dVarA2 = n5.c.a(R.drawable.warning, o0VarE, 0);
                gl.c.f77766a.getClass();
                long jR = gl.c.a(o0VarE).r();
                String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_warning);
                bVar.getClass();
                i7.a(dVarA2, strQ2, x2.q(aVar4, j92.b.f97901d.f97904c), jR, o0VarE, 0, 0);
                fVar2.getClass();
                x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
                d6.h.f57752b.getClass();
                o0 o0Var = o0VarE;
                mh.c(str3, null, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57757g), 0L, 0, false, 0, 0, null, x0VarF, o0Var, (i15 >> 6) & 14, 0, 130046);
                o0VarE = o0Var;
                o0VarE.g0(true);
                o0VarE.g0(false);
            } else {
                eVar = eVar2;
                o0VarE.C(225476393);
                o0VarE.g0(false);
            }
            if (z15) {
                o0VarE.C(225545740);
                bVar.getClass();
                r rVarC6 = l.C(aVar4, 0.0f, eVar.f97917b, 0.0f, 0.0f, 13);
                Object objQ2 = o0VarE.q();
                aVar6.getClass();
                if (objQ2 == m.a.f135155b) {
                    aVar3 = aVar;
                    objQ2 = new g(aVar3, 0);
                    o0VarE.K(objQ2);
                } else {
                    aVar3 = aVar;
                }
                r rVarD = w.d(rVarC6, false, null, null, (e23.a) objQ2, 15);
                String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_skip_and_complete_plan);
                fVar2.getClass();
                o0 o0Var2 = o0VarE;
                mh.c(strQ3, rVarD, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(j92.f.f97932i, hb.a.e(o0VarE), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var2, 0, 0, 131068);
                o0VarE = o0Var2;
                o0VarE.g0(false);
            } else {
                aVar3 = aVar;
                o0VarE.C(225891049);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            aVar3 = aVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ki1.f(str, str2, str3, z14, z15, aVar3, aVar2, i14);
        }
    }

    public static final void h(int i14, int i15, String str, String str2, boolean z14, m mVar, int i16) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-1909055137);
        int i17 = i16 | (o0VarE.k(i14) ? 4 : 2) | (o0VarE.k(i15) ? 32 : 16) | (o0VarE.B(str) ? 256 : 128) | (o0VarE.B(str2) ? 2048 : 1024) | (o0VarE.h(z14) ? 16384 : 8192) | 196608;
        int i18 = 1;
        if (o0VarE.n(i17 & 1, (74899 & i17) != 74898)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            float f14 = MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR;
            g6.f.a aVar2 = g6.f.f75994b;
            r rVarQ = x2.q(aVar, f14);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarY = l.y(rVarQ, j92.b.f97899b.f97920e);
            o0VarE.C(-650937539);
            j23.l lVar = new j23.l(1, i14);
            ArrayList arrayList = new ArrayList(p13.y.r(lVar, 10));
            Iterator<Integer> it = lVar.iterator();
            while (((j23.k) it).f96801c) {
                ((p13.p0) it).nextInt();
                gl.c.f77766a.getClass();
                arrayList.add(new z72.l(1.0f / i14, gl.c.a(o0VarE).g(), null));
            }
            o0VarE.g0(false);
            i53.f fVarJ = i53.a.j(arrayList);
            gl.c.f77766a.getClass();
            long jB = gl.c.a(o0VarE).b();
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            o0Var = o0VarE;
            z72.k.b(i15 / i14, j92.b.f97899b.f97918c, 0.0f, 100663296, 208, jB, z3.f.c(-86950311, new sz1.f(str, str2, z14, i18), o0VarE), rVarY, fVarJ, o0Var, false);
            x1 x1Var2 = n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.a(str, i14, str2, i15, i16, z14);
        }
    }

    public static final void i(dy1.m mVar, m mVar2, int i14) {
        o0 o0VarE = mVar2.E(1982306090);
        int i15 = (o0VarE.B(mVar) ? 4 : 2) | i14;
        int i16 = 10;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            l72.x0 x0Var = l72.x0.f111346a;
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            x0Var.e(l.y(aVar, j92.b.f97899b.f97920e), z3.f.c(-1570164815, new v0(mVar, i16), o0VarE), o0VarE, (l72.x0.f111348c << 6) | 48, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(mVar, i14, i16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0149  */
    /* JADX WARN: Code duplicated, block: B:48:0x019f  */
    /* JADX WARN: Code duplicated, block: B:80:0x022d  */
    public static final void j(final t tVar, m mVar, int i14) {
        dy1.i iVar;
        o0 o0Var;
        boolean z14;
        o0 o0VarE = mVar.E(-199911685);
        int i15 = (o0VarE.B(tVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            r rVarF = x2.f(aVar, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            String strQ = gl1.y.Q(o0VarE, R.string.section_schedule);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97930g), o0VarE);
            d92.b.f58625c.getClass();
            mh.c(strQ, l.y(aVar, j92.b.f97899b.f97920e), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
            boolean z15 = tVar.f61635c;
            dy1.i iVar2 = tVar.f61634b;
            m.a aVar3 = m.f135153a;
            if (z15) {
                o0VarE.C(2057489282);
                String str = tVar.f61636d;
                if (str == null || str.length() == 0) {
                    iVar = iVar2;
                    final int i16 = 0;
                    o0VarE.C(2057646483);
                    l72.p2 p2Var = l72.p2.f111205a;
                    String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_workout_schedule);
                    c.f173044a.getClass();
                    z3.e eVar = c.f173046c;
                    boolean z16 = (i15 & 14) == 4;
                    Object objQ = o0VarE.q();
                    if (z16) {
                        objQ = new e23.a() { // from class: ux1.h
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i16) {
                                    case 0:
                                        tVar.f61637e.invoke();
                                        break;
                                    case 1:
                                        tVar.f61637e.invoke();
                                        break;
                                    default:
                                        e23.a<Unit> aVar4 = tVar.f61638f;
                                        if (aVar4 != null) {
                                            aVar4.invoke();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ);
                    } else {
                        aVar3.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new e23.a() { // from class: ux1.h
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i16) {
                                        case 0:
                                            tVar.f61637e.invoke();
                                            break;
                                        case 1:
                                            tVar.f61637e.invoke();
                                            break;
                                        default:
                                            e23.a<Unit> aVar4 = tVar.f61638f;
                                            if (aVar4 != null) {
                                                aVar4.invoke();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0VarE.K(objQ);
                        }
                    }
                    o0Var = o0VarE;
                    z14 = false;
                    p2Var.g(strQ2, null, null, eVar, null, false, false, (e23.a) objQ, o0Var, 3072, 246);
                    o0Var.g0(false);
                } else {
                    o0VarE.C(2058319276);
                    l72.p2 p2Var2 = l72.p2.f111205a;
                    String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_workout_schedule);
                    c.f173044a.getClass();
                    z3.e eVar2 = c.f173047d;
                    boolean z17 = (i15 & 14) == 4;
                    Object objQ2 = o0VarE.q();
                    if (z17) {
                        final int i17 = 1;
                        objQ2 = new e23.a() { // from class: ux1.h
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i17) {
                                    case 0:
                                        tVar.f61637e.invoke();
                                        break;
                                    case 1:
                                        tVar.f61637e.invoke();
                                        break;
                                    default:
                                        e23.a<Unit> aVar4 = tVar.f61638f;
                                        if (aVar4 != null) {
                                            aVar4.invoke();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ2);
                    } else {
                        aVar3.getClass();
                        if (objQ2 == m.a.f135155b) {
                            final int i18 = 1;
                            objQ2 = new e23.a() { // from class: ux1.h
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i18) {
                                        case 0:
                                            tVar.f61637e.invoke();
                                            break;
                                        case 1:
                                            tVar.f61637e.invoke();
                                            break;
                                        default:
                                            e23.a<Unit> aVar4 = tVar.f61638f;
                                            if (aVar4 != null) {
                                                aVar4.invoke();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0VarE.K(objQ2);
                        }
                    }
                    iVar = iVar2;
                    p2Var2.h(strQ3, str, null, null, null, false, false, eVar2, null, null, (e23.a) objQ2, o0VarE, 12582912, 0, 892);
                    o0VarE.g0(false);
                    o0Var = o0VarE;
                    z14 = false;
                }
                o0Var.g0(z14);
            } else {
                iVar = iVar2;
                o0Var = o0VarE;
                z14 = false;
                o0Var.C(2059041297);
                o0Var.g0(false);
            }
            if (tVar.f61633a) {
                o0Var.C(2059134266);
                l72.p2 p2Var3 = l72.p2.f111205a;
                dy1.i iVar3 = iVar;
                String str2 = iVar3 != null ? iVar3.f61566a : null;
                if (str2 == null) {
                    str2 = "";
                }
                String strQ4 = gl1.y.Q(o0Var, R.string.lbl_next_workout);
                String str3 = iVar3 != null ? iVar3.f61567b : null;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = iVar3 != null ? iVar3.f61568c : null;
                String strP = gl1.y.P(R.string.string_bullet_string_bullet_string_pattern, new Object[]{strQ4, str3, str4 != null ? str4 : ""}, o0Var);
                c.f173044a.getClass();
                z3.e eVar3 = c.f173048e;
                boolean z18 = (i15 & 14) == 4 ? true : z14;
                Object objQ3 = o0Var.q();
                if (z18) {
                    final int i19 = 2;
                    objQ3 = new e23.a() { // from class: ux1.h
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i19) {
                                case 0:
                                    tVar.f61637e.invoke();
                                    break;
                                case 1:
                                    tVar.f61637e.invoke();
                                    break;
                                default:
                                    e23.a<Unit> aVar4 = tVar.f61638f;
                                    if (aVar4 != null) {
                                        aVar4.invoke();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0Var.K(objQ3);
                } else {
                    aVar3.getClass();
                    if (objQ3 == m.a.f135155b) {
                        final int i110 = 2;
                        objQ3 = new e23.a() { // from class: ux1.h
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i110) {
                                    case 0:
                                        tVar.f61637e.invoke();
                                        break;
                                    case 1:
                                        tVar.f61637e.invoke();
                                        break;
                                    default:
                                        e23.a<Unit> aVar4 = tVar.f61638f;
                                        if (aVar4 != null) {
                                            aVar4.invoke();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0Var.K(objQ3);
                    }
                }
                e23.a<Unit> aVar4 = (e23.a) objQ3;
                boolean z19 = z14;
                o0VarE = o0Var;
                p2Var3.h(str2, strP, null, null, null, false, false, eVar3, null, null, aVar4, o0VarE, 12582912, 0, 892);
                o0VarE.g0(z19);
            } else {
                boolean z24 = z14;
                o0VarE = o0Var;
                o0VarE.C(2060140433);
                o0VarE.g0(z24);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(tVar, i14, 12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0110  */
    /* JADX WARN: Code duplicated, block: B:69:0x0117  */
    /* JADX WARN: Code duplicated, block: B:72:0x0181  */
    /* JADX WARN: Code duplicated, block: B:75:0x0194  */
    /* JADX WARN: Code duplicated, block: B:77:0x019b  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void k(ey1.j jVar, lc.y yVar, fe feVar, e23.a aVar, e23.a aVar2, boolean z14, m mVar, int i14) {
        int i15;
        o0 o0Var;
        int i16;
        c.q qVarC;
        boolean zR;
        Object objQ;
        c.q qVarC2;
        boolean z15;
        boolean zR2;
        Object objQ2;
        yVar.getClass();
        feVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-1090443490);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(jVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(yVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(feVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.h(z14) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            p1 p1VarC = s9.c.c(jVar.E, o0VarE);
            p1 p1VarC2 = s9.c.c(jVar.I, o0VarE);
            p1 p1VarC3 = s9.c.c(jVar.P, o0VarE);
            p1 p1VarC4 = s9.c.c(jVar.D, o0VarE);
            Activity activity = (Activity) o0VarE.A(c.n.f22332a);
            tx1.b bVar = new tx1.b();
            boolean zR3 = o0VarE.r(jVar);
            Object objQ3 = o0VarE.q();
            m.a aVar3 = m.f135153a;
            if (zR3) {
                i16 = i15;
            } else {
                aVar3.getClass();
                i16 = i15;
                if (objQ3 == m.a.f135155b) {
                }
                qVarC = c.w.c(bVar, (e23.l) objQ3, o0VarE, 0);
                tx1.d dVar = new tx1.d();
                zR = o0VarE.r(jVar);
                objQ = o0VarE.q();
                if (zR) {
                    objQ = new ay1.a(jVar, 5);
                    o0VarE.K(objQ);
                } else {
                    aVar3.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new ay1.a(jVar, 5);
                        o0VarE.K(objQ);
                    }
                }
                qVarC2 = c.w.c(dVar, (e23.l) objQ, o0VarE, 0);
                int i17 = i16 << 6;
                z15 = false;
                l(((Boolean) p1VarC4.getF182175a()).booleanValue(), z14, (dy1.r) p1VarC.getF182175a(), (Map) p1VarC2.getF182175a(), feVar, aVar, o0VarE, ((i16 >> 12) & 112) | (i17 & 57344) | (i17 & 458752), 0);
                o0Var = o0VarE;
                dy1.n nVar = (dy1.n) p1VarC3.getF182175a();
                boolean zB = o0Var.B(p1VarC3) | o0Var.r(jVar) | o0Var.r(qVarC) | o0Var.r(qVarC2);
                if ((i16 & 57344) == 16384) {
                    z15 = true;
                }
                zR2 = z15 | zB | o0Var.r(activity) | o0Var.r(yVar);
                objQ2 = o0Var.q();
                if (zR2) {
                    i iVar = new i(jVar, qVarC, qVarC2, aVar2, activity, yVar, p1VarC3, null);
                    o0Var.K(iVar);
                    objQ2 = iVar;
                } else {
                    aVar3.getClass();
                    if (objQ2 == m.a.f135155b) {
                        i iVar2 = new i(jVar, qVarC, qVarC2, aVar2, activity, yVar, p1VarC3, null);
                        o0Var.K(iVar2);
                        objQ2 = iVar2;
                    }
                }
                l0.e((p) objQ2, nVar, o0Var);
            }
            objQ3 = new ay1.a(jVar, 4);
            o0VarE.K(objQ3);
            qVarC = c.w.c(bVar, (e23.l) objQ3, o0VarE, 0);
            tx1.d dVar2 = new tx1.d();
            zR = o0VarE.r(jVar);
            objQ = o0VarE.q();
            if (zR) {
                aVar3.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new ay1.a(jVar, 5);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new ay1.a(jVar, 5);
                o0VarE.K(objQ);
            }
            qVarC2 = c.w.c(dVar2, (e23.l) objQ, o0VarE, 0);
            int i18 = i16 << 6;
            z15 = false;
            l(((Boolean) p1VarC4.getF182175a()).booleanValue(), z14, (dy1.r) p1VarC.getF182175a(), (Map) p1VarC2.getF182175a(), feVar, aVar, o0VarE, ((i16 >> 12) & 112) | (i18 & 57344) | (i18 & 458752), 0);
            o0Var = o0VarE;
            dy1.n nVar2 = (dy1.n) p1VarC3.getF182175a();
            boolean zB2 = o0Var.B(p1VarC3) | o0Var.r(jVar) | o0Var.r(qVarC) | o0Var.r(qVarC2);
            if ((i16 & 57344) == 16384) {
                z15 = true;
            }
            zR2 = z15 | zB2 | o0Var.r(activity) | o0Var.r(yVar);
            objQ2 = o0Var.q();
            if (zR2) {
                aVar3.getClass();
                if (objQ2 == m.a.f135155b) {
                    i iVar3 = new i(jVar, qVarC, qVarC2, aVar2, activity, yVar, p1VarC3, null);
                    o0Var.K(iVar3);
                    objQ2 = iVar3;
                }
            } else {
                i iVar4 = new i(jVar, qVarC, qVarC2, aVar2, activity, yVar, p1VarC3, null);
                o0Var.K(iVar4);
                objQ2 = iVar4;
            }
            l0.e((p) objQ2, nVar2, o0Var);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(jVar, yVar, feVar, aVar, aVar2, z14, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:102:0x0227  */
    /* JADX WARN: Code duplicated, block: B:105:0x023f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0271  */
    /* JADX WARN: Code duplicated, block: B:111:0x0284  */
    /* JADX WARN: Code duplicated, block: B:113:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:116:0x0301  */
    /* JADX WARN: Code duplicated, block: B:119:0x030e  */
    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:82:0x0120  */
    /* JADX WARN: Code duplicated, block: B:85:0x014a  */
    /* JADX WARN: Code duplicated, block: B:88:0x015c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0167  */
    /* JADX WARN: Code duplicated, block: B:91:0x019a  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e7  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void l(boolean z14, boolean z15, final dy1.r rVar, Map<String, ? extends List<? extends ActivityListItemDTO>> map, fe feVar, e23.a<Unit> aVar, m mVar, int i14, int i15) {
        boolean z16;
        int i16;
        boolean z17;
        int i17;
        final int i18;
        boolean z18;
        o0 o0Var;
        boolean z19;
        boolean z24;
        p2 p2VarI0;
        boolean z25;
        Object objA;
        i.c cVar;
        i.c cVar2;
        Object objQ;
        m.a.C2565a c2565a;
        final p1 p1Var;
        Object objQ2;
        final p1 p1Var2;
        Object objQ3;
        p1 p1Var3;
        boolean z26;
        o0 o0Var2;
        boolean z27;
        final int i19;
        int i24;
        boolean zR;
        Object objQ4;
        Object objQ5;
        boolean zR2;
        Object objQ6;
        Object objQ7;
        boolean zR3;
        Object objQ8;
        Object objQ9;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        o0 o0VarE = mVar.E(254882009);
        int i30 = i15 & 1;
        if (i30 != 0) {
            i16 = i14 | 6;
            z16 = z14;
        } else if ((i14 & 6) == 0) {
            z16 = z14;
            i16 = (o0VarE.h(z16) ? 4 : 2) | i14;
        } else {
            z16 = z14;
            i16 = i14;
        }
        int i34 = i15 & 2;
        if (i34 == 0) {
            if ((i14 & 48) == 0) {
                z17 = z15;
                i16 |= o0VarE.h(z17) ? 32 : 16;
            }
            if ((i14 & 384) == 0) {
                if (o0VarE.r(rVar)) {
                    i29 = 256;
                } else {
                    i29 = 128;
                }
                i16 |= i29;
            }
            if ((i14 & 3072) != 0) {
                if (o0VarE.r(map)) {
                    i28 = 2048;
                } else {
                    i28 = 1024;
                }
                i16 |= i28;
            }
            if ((i14 & 24576) == 0) {
                if (o0VarE.B(feVar)) {
                    i27 = 16384;
                } else {
                    i27 = 8192;
                }
                i16 |= i27;
            }
            if ((196608 & i14) != 0) {
                if (o0VarE.r(aVar)) {
                    i26 = 131072;
                } else {
                    i26 = 65536;
                }
                i16 |= i26;
            }
            i17 = i16;
            i18 = 0;
            if ((i17 & 74899) != 74898) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (o0VarE.n(i17 & 1, z18)) {
                if (i30 != 0) {
                    z25 = false;
                } else {
                    z25 = z16;
                }
                if (i34 != 0) {
                    z17 = true;
                }
                x1 x1Var = n.f135158a;
                objA = o0VarE.A(c.n.f22332a);
                if (objA instanceof i.c) {
                    cVar = (i.c) objA;
                } else {
                    cVar = null;
                }
                cVar2 = cVar;
                String strQ = gl1.y.Q(o0VarE, R.string.no_value);
                objQ = o0VarE.q();
                m.f135153a.getClass();
                c2565a = m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ);
                }
                p1Var = (p1) objQ;
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ2);
                }
                p1Var2 = (p1) objQ2;
                objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ3);
                }
                p1Var3 = (p1) objQ3;
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    o0VarE.C(-311564665);
                    c1 c1Var = c1.f110940a;
                    String strQ2 = gl1.y.Q(o0VarE, R.string.itp_remove_plan);
                    String strQ3 = gl1.y.Q(o0VarE, R.string.itp_remove_plan_body);
                    String strQ4 = gl1.y.Q(o0VarE, R.string.common_confirm);
                    String strQ5 = gl1.y.Q(o0VarE, R.string.common_cancel);
                    zR3 = o0VarE.r(rVar);
                    objQ8 = o0VarE.q();
                    if (zR3 || objQ8 == c2565a) {
                        objQ8 = new e23.a() { // from class: ux1.f
                            @Override // e23.a
                            public final Object invoke() {
                                e23.a<Unit> aVar2;
                                e23.a<Unit> aVar3;
                                switch (i18) {
                                    case 0:
                                        p1Var.setValue(Boolean.FALSE);
                                        dy1.r rVar2 = rVar;
                                        if (rVar2 != null && (aVar2 = rVar2.f61628t) != null) {
                                            aVar2.invoke();
                                        }
                                        break;
                                    default:
                                        p1Var.setValue(Boolean.FALSE);
                                        dy1.r rVar3 = rVar;
                                        if (rVar3 != null && (aVar3 = rVar3.f61629u) != null) {
                                            aVar3.invoke();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ8);
                    }
                    e23.a<Unit> aVar2 = (e23.a) objQ8;
                    objQ9 = o0VarE.q();
                    if (objQ9 == c2565a) {
                        i25 = 18;
                        objQ9 = new tn.h(p1Var, i25);
                        o0VarE.K(objQ9);
                    } else {
                        i25 = 18;
                    }
                    z26 = z17;
                    z27 = false;
                    i19 = 1;
                    c1Var.a(false, strQ2, strQ3, null, null, strQ4, false, false, aVar2, strQ5, (e23.a) objQ9, o0VarE, 0, 6, 217);
                    o0Var2 = o0VarE;
                    o0Var2.g0(false);
                } else {
                    z26 = z17;
                    o0Var2 = o0VarE;
                    z27 = false;
                    i19 = 1;
                    o0Var2.C(-311034007);
                    o0Var2.g0(false);
                }
                if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                    o0Var2.C(-310970767);
                    c1 c1Var2 = c1.f110940a;
                    String strQ6 = gl1.y.Q(o0Var2, R.string.msg_quit_plan);
                    String strQ7 = gl1.y.Q(o0Var2, R.string.msg_quit_plan_info);
                    String strQ8 = gl1.y.Q(o0Var2, R.string.common_confirm);
                    String strQ9 = gl1.y.Q(o0Var2, R.string.common_cancel);
                    zR2 = o0Var2.r(rVar);
                    objQ6 = o0Var2.q();
                    if (zR2 || objQ6 == c2565a) {
                        objQ6 = new e23.a() { // from class: ux1.f
                            @Override // e23.a
                            public final Object invoke() {
                                e23.a<Unit> aVar3;
                                e23.a<Unit> aVar4;
                                switch (i19) {
                                    case 0:
                                        p1Var2.setValue(Boolean.FALSE);
                                        dy1.r rVar2 = rVar;
                                        if (rVar2 != null && (aVar3 = rVar2.f61628t) != null) {
                                            aVar3.invoke();
                                        }
                                        break;
                                    default:
                                        p1Var2.setValue(Boolean.FALSE);
                                        dy1.r rVar3 = rVar;
                                        if (rVar3 != null && (aVar4 = rVar3.f61629u) != null) {
                                            aVar4.invoke();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0Var2.K(objQ6);
                    }
                    e23.a<Unit> aVar3 = (e23.a) objQ6;
                    objQ7 = o0Var2.q();
                    if (objQ7 == c2565a) {
                        objQ7 = new tn.h(p1Var2, 19);
                        o0Var2.K(objQ7);
                    }
                    o0 o0Var3 = o0Var2;
                    i24 = R.string.common_cancel;
                    c1Var2.a(false, strQ6, strQ7, null, null, strQ8, false, false, aVar3, strQ9, (e23.a) objQ7, o0Var3, 0, 6, 217);
                    o0Var2 = o0Var3;
                    o0Var2.g0(z27);
                } else {
                    i24 = R.string.common_cancel;
                    o0Var2.C(-310449719);
                    o0Var2.g0(z27);
                }
                if (((Boolean) r33.getF182175a()).booleanValue()) {
                    o0Var2.C(-310378047);
                    c1 c1Var3 = c1.f110940a;
                    String strQ10 = gl1.y.Q(o0Var2, R.string.skip_deload_week_alert_title);
                    String strQ11 = gl1.y.Q(o0Var2, R.string.skip_deload_week_alert_message);
                    String strQ12 = gl1.y.Q(o0Var2, R.string.lbl_common_continue);
                    String strQ13 = gl1.y.Q(o0Var2, i24);
                    zR = o0Var2.r(cVar2) | o0Var2.r(rVar);
                    objQ4 = o0Var2.q();
                    if (zR || objQ4 == c2565a) {
                        objQ4 = new ug2.b0(cVar2, 1, (Object) r33, rVar);
                        o0Var2.K(objQ4);
                    }
                    e23.a<Unit> aVar4 = (e23.a) objQ4;
                    objQ5 = o0Var2.q();
                    if (objQ5 == c2565a) {
                        objQ5 = new tn.h(p1Var3, 21);
                        o0Var2.K(objQ5);
                    }
                    o0 o0Var4 = o0Var2;
                    c1Var3.a(false, strQ10, strQ11, null, null, strQ12, false, false, aVar4, strQ13, (e23.a) objQ5, o0Var4, 0, 6, 217);
                    o0Var2 = o0Var4;
                    o0Var2.g0(z27);
                } else {
                    o0Var2.C(-309780119);
                    o0Var2.g0(z27);
                }
                boolean z28 = z26;
                z17 = z28;
                o0 o0Var5 = o0Var2;
                boolean z29 = z25;
                z02.d.a(z29, z3.f.c(-565101708, new defpackage.d(z28, rVar, aVar, cVar2, p1Var, (p1) r33, p1Var2), o0Var2), z3.f.c(1856652051, new p21.b(feVar, 18), o0Var2), null, null, z3.f.c(531978736, new k1((Object) rVar, (Object) map, (Object) strQ, (p1) r33, 20), o0Var2), o0Var5, (i17 & 14) | 197040, 24);
                o0Var = o0Var5;
                z19 = z29;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                z19 = z16;
            }
            z24 = z17;
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new at.a(z19, z24, rVar, map, feVar, aVar, i14, i15);
            }
        }
        i16 |= 48;
        z17 = z15;
        if ((i14 & 384) == 0) {
            if (o0VarE.r(rVar)) {
                i29 = 256;
            } else {
                i29 = 128;
            }
            i16 |= i29;
        }
        if ((i14 & 3072) != 0) {
            if (o0VarE.r(map)) {
                i28 = 2048;
            } else {
                i28 = 1024;
            }
            i16 |= i28;
        }
        if ((i14 & 24576) == 0) {
            if (o0VarE.B(feVar)) {
                i27 = 16384;
            } else {
                i27 = 8192;
            }
            i16 |= i27;
        }
        if ((196608 & i14) != 0) {
            if (o0VarE.r(aVar)) {
                i26 = 131072;
            } else {
                i26 = 65536;
            }
            i16 |= i26;
        }
        i17 = i16;
        i18 = 0;
        if ((i17 & 74899) != 74898) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (o0VarE.n(i17 & 1, z18)) {
            if (i30 != 0) {
                z25 = false;
            } else {
                z25 = z16;
            }
            if (i34 != 0) {
                z17 = true;
            }
            x1 x1Var2 = n.f135158a;
            objA = o0VarE.A(c.n.f22332a);
            if (objA instanceof i.c) {
                cVar = (i.c) objA;
            } else {
                cVar = null;
            }
            cVar2 = cVar;
            String strQ14 = gl1.y.Q(o0VarE, R.string.no_value);
            objQ = o0VarE.q();
            m.f135153a.getClass();
            c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1Var = (p1) objQ;
            objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1Var2 = (p1) objQ2;
            objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1Var3 = (p1) objQ3;
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(-311564665);
                c1 c1Var4 = c1.f110940a;
                String strQ15 = gl1.y.Q(o0VarE, R.string.itp_remove_plan);
                String strQ16 = gl1.y.Q(o0VarE, R.string.itp_remove_plan_body);
                String strQ17 = gl1.y.Q(o0VarE, R.string.common_confirm);
                String strQ18 = gl1.y.Q(o0VarE, R.string.common_cancel);
                zR3 = o0VarE.r(rVar);
                objQ8 = o0VarE.q();
                if (zR3) {
                    objQ8 = new e23.a() { // from class: ux1.f
                        @Override // e23.a
                        public final Object invoke() {
                            e23.a<Unit> aVar5;
                            e23.a<Unit> aVar6;
                            switch (i18) {
                                case 0:
                                    p1Var.setValue(Boolean.FALSE);
                                    dy1.r rVar2 = rVar;
                                    if (rVar2 != null && (aVar5 = rVar2.f61628t) != null) {
                                        aVar5.invoke();
                                    }
                                    break;
                                default:
                                    p1Var.setValue(Boolean.FALSE);
                                    dy1.r rVar3 = rVar;
                                    if (rVar3 != null && (aVar6 = rVar3.f61629u) != null) {
                                        aVar6.invoke();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ8);
                } else {
                    objQ8 = new e23.a() { // from class: ux1.f
                        @Override // e23.a
                        public final Object invoke() {
                            e23.a<Unit> aVar5;
                            e23.a<Unit> aVar6;
                            switch (i18) {
                                case 0:
                                    p1Var.setValue(Boolean.FALSE);
                                    dy1.r rVar2 = rVar;
                                    if (rVar2 != null && (aVar5 = rVar2.f61628t) != null) {
                                        aVar5.invoke();
                                    }
                                    break;
                                default:
                                    p1Var.setValue(Boolean.FALSE);
                                    dy1.r rVar3 = rVar;
                                    if (rVar3 != null && (aVar6 = rVar3.f61629u) != null) {
                                        aVar6.invoke();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ8);
                }
                e23.a<Unit> aVar5 = (e23.a) objQ8;
                objQ9 = o0VarE.q();
                if (objQ9 == c2565a) {
                    i25 = 18;
                    objQ9 = new tn.h(p1Var, i25);
                    o0VarE.K(objQ9);
                } else {
                    i25 = 18;
                }
                z26 = z17;
                z27 = false;
                i19 = 1;
                c1Var4.a(false, strQ15, strQ16, null, null, strQ17, false, false, aVar5, strQ18, (e23.a) objQ9, o0VarE, 0, 6, 217);
                o0Var2 = o0VarE;
                o0Var2.g0(false);
            } else {
                z26 = z17;
                o0Var2 = o0VarE;
                z27 = false;
                i19 = 1;
                o0Var2.C(-311034007);
                o0Var2.g0(false);
            }
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0Var2.C(-310970767);
                c1 c1Var5 = c1.f110940a;
                String strQ19 = gl1.y.Q(o0Var2, R.string.msg_quit_plan);
                String strQ20 = gl1.y.Q(o0Var2, R.string.msg_quit_plan_info);
                String strQ21 = gl1.y.Q(o0Var2, R.string.common_confirm);
                String strQ22 = gl1.y.Q(o0Var2, R.string.common_cancel);
                zR2 = o0Var2.r(rVar);
                objQ6 = o0Var2.q();
                if (zR2) {
                    objQ6 = new e23.a() { // from class: ux1.f
                        @Override // e23.a
                        public final Object invoke() {
                            e23.a<Unit> aVar6;
                            e23.a<Unit> aVar7;
                            switch (i19) {
                                case 0:
                                    p1Var2.setValue(Boolean.FALSE);
                                    dy1.r rVar2 = rVar;
                                    if (rVar2 != null && (aVar6 = rVar2.f61628t) != null) {
                                        aVar6.invoke();
                                    }
                                    break;
                                default:
                                    p1Var2.setValue(Boolean.FALSE);
                                    dy1.r rVar3 = rVar;
                                    if (rVar3 != null && (aVar7 = rVar3.f61629u) != null) {
                                        aVar7.invoke();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0Var2.K(objQ6);
                } else {
                    objQ6 = new e23.a() { // from class: ux1.f
                        @Override // e23.a
                        public final Object invoke() {
                            e23.a<Unit> aVar6;
                            e23.a<Unit> aVar7;
                            switch (i19) {
                                case 0:
                                    p1Var2.setValue(Boolean.FALSE);
                                    dy1.r rVar2 = rVar;
                                    if (rVar2 != null && (aVar6 = rVar2.f61628t) != null) {
                                        aVar6.invoke();
                                    }
                                    break;
                                default:
                                    p1Var2.setValue(Boolean.FALSE);
                                    dy1.r rVar3 = rVar;
                                    if (rVar3 != null && (aVar7 = rVar3.f61629u) != null) {
                                        aVar7.invoke();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0Var2.K(objQ6);
                }
                e23.a<Unit> aVar6 = (e23.a) objQ6;
                objQ7 = o0Var2.q();
                if (objQ7 == c2565a) {
                    objQ7 = new tn.h(p1Var2, 19);
                    o0Var2.K(objQ7);
                }
                o0 o0Var6 = o0Var2;
                i24 = R.string.common_cancel;
                c1Var5.a(false, strQ19, strQ20, null, null, strQ21, false, false, aVar6, strQ22, (e23.a) objQ7, o0Var6, 0, 6, 217);
                o0Var2 = o0Var6;
                o0Var2.g0(z27);
            } else {
                i24 = R.string.common_cancel;
                o0Var2.C(-310449719);
                o0Var2.g0(z27);
            }
            if (((Boolean) r33.getF182175a()).booleanValue()) {
                o0Var2.C(-310378047);
                c1 c1Var6 = c1.f110940a;
                String strQ110 = gl1.y.Q(o0Var2, R.string.skip_deload_week_alert_title);
                String strQ111 = gl1.y.Q(o0Var2, R.string.skip_deload_week_alert_message);
                String strQ112 = gl1.y.Q(o0Var2, R.string.lbl_common_continue);
                String strQ113 = gl1.y.Q(o0Var2, i24);
                zR = o0Var2.r(cVar2) | o0Var2.r(rVar);
                objQ4 = o0Var2.q();
                if (zR) {
                    objQ4 = new ug2.b0(cVar2, 1, (Object) r33, rVar);
                    o0Var2.K(objQ4);
                } else {
                    objQ4 = new ug2.b0(cVar2, 1, (Object) r33, rVar);
                    o0Var2.K(objQ4);
                }
                e23.a<Unit> aVar7 = (e23.a) objQ4;
                objQ5 = o0Var2.q();
                if (objQ5 == c2565a) {
                    objQ5 = new tn.h(p1Var3, 21);
                    o0Var2.K(objQ5);
                }
                o0 o0Var7 = o0Var2;
                c1Var6.a(false, strQ110, strQ111, null, null, strQ112, false, false, aVar7, strQ113, (e23.a) objQ5, o0Var7, 0, 6, 217);
                o0Var2 = o0Var7;
                o0Var2.g0(z27);
            } else {
                o0Var2.C(-309780119);
                o0Var2.g0(z27);
            }
            boolean z210 = z26;
            z17 = z210;
            o0 o0Var8 = o0Var2;
            boolean z211 = z25;
            z02.d.a(z211, z3.f.c(-565101708, new defpackage.d(z210, rVar, aVar, cVar2, p1Var, (p1) r33, p1Var2), o0Var2), z3.f.c(1856652051, new p21.b(feVar, 18), o0Var2), null, null, z3.f.c(531978736, new k1((Object) rVar, (Object) map, (Object) strQ14, (p1) r33, 20), o0Var2), o0Var8, (i17 & 14) | 197040, 24);
            o0Var = o0Var8;
            z19 = z211;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            z19 = z16;
        }
        z24 = z17;
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at.a(z19, z24, rVar, map, feVar, aVar, i14, i15);
        }
    }
}
