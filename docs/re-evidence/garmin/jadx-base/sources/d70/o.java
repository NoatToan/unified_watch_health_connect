package d70;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.q;
import c2.u;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import cr.v;
import f5.z0;
import h4.r;
import h5.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.t1;
import m92.c0;
import m92.y;
import o4.d0;
import org.joda.time.DateTime;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p3.y3;
import s5.s0;
import s5.x0;
import w02.b0;
import ww1.a0;

/* JADX INFO: loaded from: classes8.dex */
public final class o {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f58135a;

        static {
            int[] iArr = new int[j61.h.values().length];
            try {
                iArr[j61.h.DAILY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j61.h.WEEKLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j61.h.MONTHLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f58135a = iArr;
        }
    }

    public static final void a(int i14, String str, String str2, long j8, p3.m mVar, int i15) {
        o0 o0VarE = mVar.E(1345893586);
        int i16 = (o0VarE.k(i14) ? 4 : 2) | i15 | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(str2) ? 256 : 128) | (o0VarE.l(j8) ? 2048 : 1024);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            y.a(str, z3.f.c(39935907, new i(i14, str2, j8), o0VarE), o0VarE, ((i16 >> 3) & 14) | 384);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m(i14, i15, j8, str, str2);
        }
    }

    public static final void b(long j8, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(516751134);
        int i15 = (o0VarE.l(j8) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            i53.f fVarA = i53.a.a(new j82.f(gl1.y.Q(o0VarE, R.string.lbl_course_demands), new j82.g.h(j8, null), null, 4, null));
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j82.e.h(fVarA, c2.l.A(aVar, j92.b.f97899b.f97920e, 0.0f, 2), null, o0VarE, 0, 4);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(j8, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:59:0x0116  */
    /* JADX WARN: Code duplicated, block: B:68:0x0159  */
    public static final void c(r rVar, final k kVar, final a0 a0Var, p3.m mVar, int i14) {
        o0 o0Var;
        final List list;
        boolean z14;
        long jC;
        rVar.getClass();
        i53.c<k61.a> cVar = kVar.f58119f;
        o0 o0VarE = mVar.E(427182145);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(kVar) ? 32 : 16) | (o0VarE.k(a0Var == null ? -1 : a0Var.ordinal()) ? 256 : 128);
        final int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            DateTime dateTime = kVar.f58116c;
            DateTime dateTime2 = kVar.f58117d;
            int i17 = kVar.f58122i;
            boolean z15 = kVar.f58123j;
            final int i18 = 1;
            o0VarE.C(799426302);
            if (i17 < 2) {
                list = j0.f134944a;
                o0VarE.g0(false);
            } else {
                ArrayList arrayList = new ArrayList(i17);
                for (int i19 = 0; i19 < i17; i19++) {
                    arrayList.add("");
                }
                String strQ = gl1.y.Q(o0VarE, z15 ? R.string.plan_start : R.string.event_added);
                c22.j0.f23099a.getClass();
                arrayList.set(0, gl1.y.P(R.string.string_space_string_bracket_pattern, new Object[]{strQ, c22.j0.k(dateTime, 'S')}, o0VarE));
                arrayList.set(i17 - 1, gl1.y.P(R.string.string_space_string_bracket_pattern, new Object[]{gl1.y.Q(o0VarE, R.string.lbl_pacepro_event_date), c22.j0.k(dateTime2, 'S')}, o0VarE));
                x1 x1Var2 = p3.n.f135158a;
                o0VarE.g0(false);
                list = arrayList;
            }
            int i24 = i15 & 896;
            int i25 = i15 & 112;
            boolean zR = (i24 == 256) | (i25 == 32) | o0VarE.r(list);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zR) {
                objQ = new e23.l() { // from class: d70.l
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        switch (i16) {
                            case 0:
                                q4.f fVar = (q4.f) obj;
                                fVar.getClass();
                                k kVar2 = kVar;
                                long jC2 = kVar2.f58115b;
                                if (a0Var != null) {
                                    jC2 = d0.c(0.5f, jC2, 14);
                                }
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                float f14 = j92.b.f97899b.f97916a;
                                m92.m.d dVar = new m92.m.d(jC2, null);
                                float f15 = j92.b.f97900c.f97910b;
                                i53.c<k61.a> cVar3 = kVar2.f58119f;
                                ArrayList arrayList2 = new ArrayList(p13.y.r(cVar3, 10));
                                Iterator<k61.a> it = cVar3.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(it.next().f103160a);
                                }
                                return c0.e(fVar, f14, dVar, true, f15, null, d0.a(jC2), i53.a.e(arrayList2), Float.valueOf(list.size()), null, null, Float.valueOf(0.0f), Float.valueOf(100.0f), null, false, null, 29456);
                            default:
                                k kVar3 = kVar;
                                long j8 = kVar3.f58115b;
                                q4.f fVar2 = (q4.f) obj;
                                fVar2.getClass();
                                a0 a0Var2 = a0Var;
                                if (a0Var2 == null) {
                                    return i53.a.c();
                                }
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                float f16 = j92.b.f97899b.f97916a;
                                m92.m.d dVar2 = new m92.m.d(j8, null);
                                float f17 = j92.b.f97900c.f97910b;
                                i53.c<k61.a> cVar4 = kVar3.f58119f;
                                ArrayList arrayList3 = new ArrayList();
                                for (k61.a aVar2 : cVar4) {
                                    if (aVar2.f103162c == a0Var2) {
                                        arrayList3.add(aVar2);
                                    }
                                }
                                ArrayList arrayList4 = new ArrayList(p13.y.r(arrayList3, 10));
                                Iterator it3 = arrayList3.iterator();
                                while (it3.hasNext()) {
                                    arrayList4.add(((k61.a) it3.next()).f103160a);
                                }
                                return c0.e(fVar2, f16, dVar2, true, f17, null, d0.a(j8), i53.a.e(arrayList4), Float.valueOf(list.size()), null, null, Float.valueOf(0.0f), Float.valueOf(100.0f), null, false, null, 29456);
                        }
                    }
                };
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new e23.l() { // from class: d70.l
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            switch (i16) {
                                case 0:
                                    q4.f fVar = (q4.f) obj;
                                    fVar.getClass();
                                    k kVar2 = kVar;
                                    long jC2 = kVar2.f58115b;
                                    if (a0Var != null) {
                                        jC2 = d0.c(0.5f, jC2, 14);
                                    }
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    float f14 = j92.b.f97899b.f97916a;
                                    m92.m.d dVar = new m92.m.d(jC2, null);
                                    float f15 = j92.b.f97900c.f97910b;
                                    i53.c<k61.a> cVar3 = kVar2.f58119f;
                                    ArrayList arrayList2 = new ArrayList(p13.y.r(cVar3, 10));
                                    Iterator<k61.a> it = cVar3.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(it.next().f103160a);
                                    }
                                    return c0.e(fVar, f14, dVar, true, f15, null, d0.a(jC2), i53.a.e(arrayList2), Float.valueOf(list.size()), null, null, Float.valueOf(0.0f), Float.valueOf(100.0f), null, false, null, 29456);
                                default:
                                    k kVar3 = kVar;
                                    long j8 = kVar3.f58115b;
                                    q4.f fVar2 = (q4.f) obj;
                                    fVar2.getClass();
                                    a0 a0Var2 = a0Var;
                                    if (a0Var2 == null) {
                                        return i53.a.c();
                                    }
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    float f16 = j92.b.f97899b.f97916a;
                                    m92.m.d dVar2 = new m92.m.d(j8, null);
                                    float f17 = j92.b.f97900c.f97910b;
                                    i53.c<k61.a> cVar4 = kVar3.f58119f;
                                    ArrayList arrayList3 = new ArrayList();
                                    for (k61.a aVar2 : cVar4) {
                                        if (aVar2.f103162c == a0Var2) {
                                            arrayList3.add(aVar2);
                                        }
                                    }
                                    ArrayList arrayList4 = new ArrayList(p13.y.r(arrayList3, 10));
                                    Iterator it3 = arrayList3.iterator();
                                    while (it3.hasNext()) {
                                        arrayList4.add(((k61.a) it3.next()).f103160a);
                                    }
                                    return c0.e(fVar2, f16, dVar2, true, f17, null, d0.a(j8), i53.a.e(arrayList4), Float.valueOf(list.size()), null, null, Float.valueOf(0.0f), Float.valueOf(100.0f), null, false, null, 29456);
                            }
                        }
                    };
                    o0VarE.K(objQ);
                }
            }
            e23.l lVar = (e23.l) objQ;
            boolean zR2 = (i24 == 256) | (i25 == 32) | o0VarE.r(list);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new e23.l() { // from class: d70.l
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        switch (i18) {
                            case 0:
                                q4.f fVar = (q4.f) obj;
                                fVar.getClass();
                                k kVar2 = kVar;
                                long jC2 = kVar2.f58115b;
                                if (a0Var != null) {
                                    jC2 = d0.c(0.5f, jC2, 14);
                                }
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                float f14 = j92.b.f97899b.f97916a;
                                m92.m.d dVar = new m92.m.d(jC2, null);
                                float f15 = j92.b.f97900c.f97910b;
                                i53.c<k61.a> cVar3 = kVar2.f58119f;
                                ArrayList arrayList2 = new ArrayList(p13.y.r(cVar3, 10));
                                Iterator<k61.a> it = cVar3.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(it.next().f103160a);
                                }
                                return c0.e(fVar, f14, dVar, true, f15, null, d0.a(jC2), i53.a.e(arrayList2), Float.valueOf(list.size()), null, null, Float.valueOf(0.0f), Float.valueOf(100.0f), null, false, null, 29456);
                            default:
                                k kVar3 = kVar;
                                long j8 = kVar3.f58115b;
                                q4.f fVar2 = (q4.f) obj;
                                fVar2.getClass();
                                a0 a0Var2 = a0Var;
                                if (a0Var2 == null) {
                                    return i53.a.c();
                                }
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                float f16 = j92.b.f97899b.f97916a;
                                m92.m.d dVar2 = new m92.m.d(j8, null);
                                float f17 = j92.b.f97900c.f97910b;
                                i53.c<k61.a> cVar4 = kVar3.f58119f;
                                ArrayList arrayList3 = new ArrayList();
                                for (k61.a aVar2 : cVar4) {
                                    if (aVar2.f103162c == a0Var2) {
                                        arrayList3.add(aVar2);
                                    }
                                }
                                ArrayList arrayList4 = new ArrayList(p13.y.r(arrayList3, 10));
                                Iterator it3 = arrayList3.iterator();
                                while (it3.hasNext()) {
                                    arrayList4.add(((k61.a) it3.next()).f103160a);
                                }
                                return c0.e(fVar2, f16, dVar2, true, f17, null, d0.a(j8), i53.a.e(arrayList4), Float.valueOf(list.size()), null, null, Float.valueOf(0.0f), Float.valueOf(100.0f), null, false, null, 29456);
                        }
                    }
                };
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new e23.l() { // from class: d70.l
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            switch (i18) {
                                case 0:
                                    q4.f fVar = (q4.f) obj;
                                    fVar.getClass();
                                    k kVar2 = kVar;
                                    long jC2 = kVar2.f58115b;
                                    if (a0Var != null) {
                                        jC2 = d0.c(0.5f, jC2, 14);
                                    }
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    float f14 = j92.b.f97899b.f97916a;
                                    m92.m.d dVar = new m92.m.d(jC2, null);
                                    float f15 = j92.b.f97900c.f97910b;
                                    i53.c<k61.a> cVar3 = kVar2.f58119f;
                                    ArrayList arrayList2 = new ArrayList(p13.y.r(cVar3, 10));
                                    Iterator<k61.a> it = cVar3.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(it.next().f103160a);
                                    }
                                    return c0.e(fVar, f14, dVar, true, f15, null, d0.a(jC2), i53.a.e(arrayList2), Float.valueOf(list.size()), null, null, Float.valueOf(0.0f), Float.valueOf(100.0f), null, false, null, 29456);
                                default:
                                    k kVar3 = kVar;
                                    long j8 = kVar3.f58115b;
                                    q4.f fVar2 = (q4.f) obj;
                                    fVar2.getClass();
                                    a0 a0Var2 = a0Var;
                                    if (a0Var2 == null) {
                                        return i53.a.c();
                                    }
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    float f16 = j92.b.f97899b.f97916a;
                                    m92.m.d dVar2 = new m92.m.d(j8, null);
                                    float f17 = j92.b.f97900c.f97910b;
                                    i53.c<k61.a> cVar4 = kVar3.f58119f;
                                    ArrayList arrayList3 = new ArrayList();
                                    for (k61.a aVar2 : cVar4) {
                                        if (aVar2.f103162c == a0Var2) {
                                            arrayList3.add(aVar2);
                                        }
                                    }
                                    ArrayList arrayList4 = new ArrayList(p13.y.r(arrayList3, 10));
                                    Iterator it3 = arrayList3.iterator();
                                    while (it3.hasNext()) {
                                        arrayList4.add(((k61.a) it3.next()).f103160a);
                                    }
                                    return c0.e(fVar2, f16, dVar2, true, f17, null, d0.a(j8), i53.a.e(arrayList4), Float.valueOf(list.size()), null, null, Float.valueOf(0.0f), Float.valueOf(100.0f), null, false, null, 29456);
                            }
                        }
                    };
                    o0VarE.K(objQ2);
                }
            }
            e23.l lVar2 = (e23.l) objQ2;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float fG = b0.g(eVar.f97917b, o0VarE);
            float f14 = fG / 2;
            boolean zI = (i25 == 32) | o0VarE.i(fG) | o0VarE.i(f14);
            Object objQ3 = o0VarE.q();
            if (zI) {
                objQ3 = new v(3, fG, f14, kVar);
                o0VarE.K(objQ3);
            } else {
                aVar.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new v(3, fG, f14, kVar);
                    o0VarE.K(objQ3);
                }
            }
            i53.f fVarA = i53.a.a((e23.l) objQ3, lVar, lVar2);
            pi0.e eVar2 = new pi0.e((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar3 = h5.g.a.f81810g;
            b4.c(eVar3, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u uVar = u.f22885a;
            r.a aVar3 = r.S;
            c2.j.f22691a.getClass();
            z zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            List list2 = list;
            r rVarC2 = h4.k.c(aVar3, o0VarE);
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar3, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            g6.f.a aVar4 = g6.f.f75994b;
            r rVarH = x2.h(x2.f(aVar3, 1.0f), 275);
            String str = kVar.f58114a;
            y3 y3Var = t1.f91493k;
            w5.q.b bVar3 = (w5.q.b) o0VarE.A(y3Var);
            y3 y3Var2 = t1.f91490h;
            g6.d dVar = new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), 1.0f);
            y3 y3Var3 = t1.f91496n;
            s0 s0Var = new s0(bVar3, dVar, (g6.o) o0VarE.A(y3Var3), 0, 8, null);
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0 x0Var = j92.f.f97935l;
            n92.d dVar2 = new n92.d(list2, s0Var, d92.c.f(x0Var, o0VarE), Boolean.TRUE, null, 16, null);
            n92.j jVar = new n92.j(new d02.c(), Float.valueOf(0.0f), Float.valueOf(100.0f), 0, 8, null);
            s0 s0Var2 = new s0((w5.q.b) o0VarE.A(y3Var), new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), 1.0f), (g6.o) o0VarE.A(y3Var3), 0, 8, null);
            fVar2.getClass();
            x0 x0VarF = d92.c.f(x0Var, o0VarE);
            if (cVar.isEmpty()) {
                z14 = false;
                o0VarE.C(-1195141592);
                o0VarE.g0(false);
                d0.f128823b.getClass();
                jC = d0.f128831j;
            } else {
                o0VarE.C(-1195142204);
                jC = d92.b.a(o0VarE).j().c();
                z14 = false;
                o0VarE.g0(false);
            }
            boolean z16 = z14;
            m92.r.b(rVarH, fVarA, null, str, false, gl1.y.Q(o0VarE, R.string.common_no_data), 0.0f, 0.0f, new n92.a(jVar, null, new n92.g(jC, s0Var2, x0VarF, null, 8, null), dVar2, 2, null), null, z3.f.c(-1582481586, new a42.a(kVar, 16, a0Var, eVar2), o0VarE), o0VarE, 6, 6, 724);
            o0Var = o0VarE;
            if (kVar.f58120g == null || cVar.isEmpty()) {
                o0Var.C(1606428005);
                o0Var.g0(z16);
            } else {
                o0Var.C(1606354008);
                b(kVar.f58121h, o0Var, z16 ? 1 : 0);
                o0Var.g0(z16);
            }
            o0Var.g0(true);
            if (cVar.isEmpty()) {
                o0Var.C(1789471149);
                r rVarC3 = uVar.c(x2.d(aVar3, 1.0f), h4.d.a.f81528f);
                bVar.getClass();
                r20.e.a(c2.l.A(rVarC3, eVar.f97920e, 0.0f, 2), o0Var, z16 ? 1 : 0);
                o0Var.g0(z16);
            } else {
                o0Var.C(1789699867);
                o0Var.g0(z16);
            }
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c50.f(rVar, kVar, a0Var, i14, 19);
        }
    }
}
