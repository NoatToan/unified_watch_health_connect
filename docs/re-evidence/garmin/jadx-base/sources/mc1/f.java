package mc1;

import android.content.Context;
import android.text.format.DateFormat;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.a0;
import c2.l;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import gl1.y;
import h4.r;
import h5.e0;
import i3.mh;
import i3.v5;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final class f {
    /* JADX WARN: Code duplicated, block: B:51:0x028e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0295  */
    /* JADX WARN: Code duplicated, block: B:55:0x029b  */
    /* JADX WARN: Code duplicated, block: B:60:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:67:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:85:0x0344 A[SYNTHETIC] */
    public static final void a(final a0 a0Var, final List<hc1.c> list, m mVar, final int i14) {
        final List<hc1.c> list2;
        o0 o0Var;
        String str;
        h5.g.a.f fVar;
        j92.f fVar2;
        x0 x0Var;
        o0 o0Var2;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        boolean zL;
        Object objQ;
        a0Var.getClass();
        o0 o0VarE = mVar.E(-2046136080);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.r(list) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 17) != 16)) {
            x1 x1Var = n.f135158a;
            if (list == null || list.isEmpty()) {
                final int i16 = 0;
                p2 p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new p(a0Var, list, i14, i16) { // from class: mc1.e

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f117775a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ a0 f117776b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ List f117777c;

                        {
                            this.f117775a = i16;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i17 = this.f117775a;
                            m mVar2 = (m) obj;
                            ((Integer) obj2).getClass();
                            switch (i17) {
                                case 0:
                                    f.a(this.f117776b, this.f117777c, mVar2, p0.t(7));
                                    break;
                                default:
                                    f.a(this.f117776b, this.f117777c, mVar2, p0.t(7));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ2 = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = new jz.a(new l22.a(context));
                o0VarE.K(objQ2);
            }
            jz.a aVar = (jz.a) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new gc1.a(context);
                o0VarE.K(objQ3);
            }
            String strQ = y.Q(o0VarE, R.string.lbl_single_readings);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
            r.a aVar2 = r.S;
            r rVarF = x2.f(aVar2, 1.0f);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            gc1.a aVar3 = (gc1.a) objQ3;
            jz.a aVar4 = aVar;
            float f14 = 1.0f;
            boolean z14 = true;
            mh.c(strQ, l.A(rVarF, eVar.f97918c, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
            r rVarF2 = x2.f(aVar2, 1.0f);
            bVar.getClass();
            r rVarC2 = l.C(rVarF2, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
            float f15 = 1;
            g6.f.a aVar5 = g6.f.f75994b;
            long jC = sn.a.c(o0VarE);
            o0 o0Var3 = o0VarE;
            v5.a(f15, 48, 0, jC, rVarC2, o0Var3);
            float f16 = f15;
            o0Var3.C(758276380);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hc1.c cVar2 = (hc1.c) it.next();
                long j8 = cVar2.f83277a;
                double d14 = cVar2.f83278b;
                jz.a aVar6 = aVar4;
                String strB = aVar6.b(new DateTime(j8), DateFormat.is24HourFormat(context));
                float f17 = (float) d14;
                gc1.a aVar7 = aVar3;
                String strA = gc1.a.a(aVar7, Float.valueOf(f17));
                bc1.a aVar8 = bc1.a.f17414a;
                Float fValueOf = Float.valueOf(f17);
                aVar8.getClass();
                c22.p2 p2VarU = jg.b.u(aVar8, fValueOf);
                Integer num = p2VarU != null ? p2VarU.f23193b : null;
                long jA = n5.a.a(o0Var3, num != null ? num.intValue() : R.color.gcm3_transparent);
                r.a aVar9 = r.S;
                r rVarF3 = x2.f(aVar9, f14);
                Object objQ4 = o0Var3.q();
                m.a.C2565a c2565a2 = m.a.f135155b;
                if (objQ4 == c2565a2) {
                    objQ4 = new m30.n(18);
                    o0Var3.K(objQ4);
                }
                r rVarC3 = v.c((e23.l) objQ4, rVarF3, z14);
                d92.b.f58623a.getClass();
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar2 = j92.b.f97899b;
                float f18 = eVar2.f97920e;
                bVar2.getClass();
                r rVarZ = l.z(rVarC3, f18, eVar2.f97917b);
                c2.j.f22691a.getClass();
                c2.j.C0343j c0343j = c2.j.f22692b;
                h4.d.f81522a.getClass();
                s2 s2VarA2 = q2.a(c0343j, h4.d.a.f81533k, o0Var3, 0);
                x1 x1Var2 = n.f135158a;
                float f19 = f16;
                int iHashCode2 = Long.hashCode(o0Var3.U);
                i2 i2VarA1 = o0Var3.a0();
                r rVarC4 = h4.k.c(rVarZ, o0Var3);
                h5.g.V.getClass();
                e0.a aVar10 = h5.g.a.f81805b;
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0Var3.z();
                if (o0Var3.T) {
                    o0Var3.M(aVar10);
                } else {
                    o0Var3.c();
                }
                h5.g.a.e eVar3 = h5.g.a.f81810g;
                b4.c(eVar3, s2VarA2, o0Var3);
                h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA1, o0Var3);
                h5.g.a.b bVar3 = h5.g.a.f81813j;
                Iterator it3 = it;
                if (o0Var3.T) {
                    str = strB;
                } else {
                    str = strB;
                    if (!s.g(o0Var3.q(), Integer.valueOf(iHashCode2))) {
                    }
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC4, o0Var3);
                    u2 u2Var = u2.f22900a;
                    fVar2 = d92.b.f58624b;
                    fVar2.getClass();
                    x0Var = j92.f.f97932i;
                    o0Var2 = o0Var3;
                    mh.c(str, u2Var.a(aVar9, 1.0f, true), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0Var3), o0Var2, 0, 0, 131068);
                    r rVarA = u2Var.a(aVar9, 1.0f, true);
                    s2VarA = q2.a(c0343j, h4.d.a.f81534l, o0Var2, 48);
                    iHashCode = Long.hashCode(o0Var2.U);
                    i2VarA0 = o0Var2.a0();
                    rVarC = h4.k.c(rVarA, o0Var2);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0Var2.z();
                    if (o0Var2.T) {
                        o0Var2.M(aVar10);
                    } else {
                        o0Var2.c();
                    }
                    b4.c(eVar3, s2VarA, o0Var2);
                    b4.c(c1623g, i2VarA0, o0Var2);
                    if (o0Var2.T || !s.g(o0Var2.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0Var2, iHashCode, bVar3);
                    }
                    b4.c(fVar, rVarC, o0Var2);
                    bVar2.getClass();
                    r rVarQ = x2.q(l.C(aVar9, 0.0f, 0.0f, eVar2.f97917b, 0.0f, 11), 10);
                    zL = o0Var2.l(jA);
                    objQ = o0Var2.q();
                    if (zL || objQ == c2565a2) {
                        objQ = new j82.d(jA, 12);
                        o0Var2.K(objQ);
                    }
                    u1.n.b(rVarQ, (e23.l) objQ, o0Var2, 0);
                    fVar2.getClass();
                    mh.c(strA, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0Var2), o0Var2, 0, 0, 131070);
                    o0Var3 = o0Var2;
                    o0Var3.g0(true);
                    o0Var3.g0(true);
                    f16 = f19;
                    z14 = true;
                    it = it3;
                    aVar4 = aVar6;
                    aVar3 = aVar7;
                    f14 = 1.0f;
                }
                v.h.A(iHashCode2, o0Var3, iHashCode2, bVar3);
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC4, o0Var3);
                u2 u2Var2 = u2.f22900a;
                fVar2 = d92.b.f58624b;
                fVar2.getClass();
                x0Var = j92.f.f97932i;
                o0Var2 = o0Var3;
                mh.c(str, u2Var2.a(aVar9, 1.0f, true), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0Var3), o0Var2, 0, 0, 131068);
                r rVarA2 = u2Var2.a(aVar9, 1.0f, true);
                s2VarA = q2.a(c0343j, h4.d.a.f81534l, o0Var2, 48);
                iHashCode = Long.hashCode(o0Var2.U);
                i2VarA0 = o0Var2.a0();
                rVarC = h4.k.c(rVarA2, o0Var2);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0Var2.z();
                if (o0Var2.T) {
                    o0Var2.M(aVar10);
                } else {
                    o0Var2.c();
                }
                b4.c(eVar3, s2VarA, o0Var2);
                b4.c(c1623g, i2VarA0, o0Var2);
                if (o0Var2.T) {
                    v.h.A(iHashCode, o0Var2, iHashCode, bVar3);
                } else {
                    v.h.A(iHashCode, o0Var2, iHashCode, bVar3);
                }
                b4.c(fVar, rVarC, o0Var2);
                bVar2.getClass();
                r rVarQ2 = x2.q(l.C(aVar9, 0.0f, 0.0f, eVar2.f97917b, 0.0f, 11), 10);
                zL = o0Var2.l(jA);
                objQ = o0Var2.q();
                if (zL) {
                    objQ = new j82.d(jA, 12);
                    o0Var2.K(objQ);
                } else {
                    objQ = new j82.d(jA, 12);
                    o0Var2.K(objQ);
                }
                u1.n.b(rVarQ2, (e23.l) objQ, o0Var2, 0);
                fVar2.getClass();
                mh.c(strA, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0Var2), o0Var2, 0, 0, 131070);
                o0Var3 = o0Var2;
                o0Var3.g0(true);
                o0Var3.g0(true);
                f16 = f19;
                z14 = true;
                it = it3;
                aVar4 = aVar6;
                aVar3 = aVar7;
                f14 = 1.0f;
            }
            o0Var3.g0(false);
            r rVarF4 = x2.f(r.S, 1.0f);
            d92.b.f58623a.getClass();
            v5.a(f16, 54, 0, d92.b.a(o0Var3).j().c(), rVarF4, o0Var3);
            o0Var = o0Var3;
            x1 x1Var3 = n.f135158a;
            list2 = list;
        } else {
            list2 = list;
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI1 = o0Var.i0();
        if (p2VarI1 != null) {
            final int i17 = 1;
            p2VarI1.f135219d = new p(a0Var, list2, i14, i17) { // from class: mc1.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f117775a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a0 f117776b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ List f117777c;

                {
                    this.f117775a = i17;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i18 = this.f117775a;
                    m mVar2 = (m) obj;
                    ((Integer) obj2).getClass();
                    switch (i18) {
                        case 0:
                            f.a(this.f117776b, this.f117777c, mVar2, p0.t(7));
                            break;
                        default:
                            f.a(this.f117776b, this.f117777c, mVar2, p0.t(7));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
