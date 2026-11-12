package cb0;

import a51.k;
import ak0.z;
import am.c1;
import android.content.Context;
import android.text.format.DateFormat;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.room.a0;
import b63.o;
import c2.j;
import c2.q;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c42.c0;
import ca0.v0;
import com.garmin.android.apps.connectmobile.R;
import da0.p;
import ds.e0;
import e23.l;
import f5.z0;
import gl1.y;
import h4.g;
import h4.r;
import i3.e5;
import i3.m4;
import i3.mh;
import i3.x3;
import j92.e;
import k2.i;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;
import u1.w;
import u4.d;
import v.h;
import v62.s0;
import vx.c;
import z3.f;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(o oVar, l<? super o, Unit> lVar, e23.a<Unit> aVar, m mVar, int i14) {
        p1 p1Var;
        m.a.C2565a c2565a;
        p1 p1Var2;
        p1 p1Var3;
        p1 p1Var4;
        o0 o0VarP = a0.p(lVar, aVar, mVar, 950553027);
        int i15 = i14 | (o0VarP.r(oVar) ? 4 : 2) | (o0VarP.r(lVar) ? 32 : 16) | (o0VarP.r(aVar) ? 256 : 128);
        if (o0VarP.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarP.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a2 = m.a.f135155b;
            if (objQ == c2565a2) {
                objQ = p0.n(oVar);
                o0VarP.K(objQ);
            }
            p1 p1Var5 = (p1) objQ;
            Object objQ2 = o0VarP.q();
            if (objQ2 == c2565a2) {
                objQ2 = p0.n(Boolean.FALSE);
                o0VarP.K(objQ2);
            }
            p1 p1Var6 = (p1) objQ2;
            m4 m4VarP = x3.p(Long.valueOf(oVar.f16206a.toEpochDay() * 86400000), null, null, o0VarP, 0, 30);
            if (((Boolean) p1Var6.getF182175a()).booleanValue()) {
                o0VarP.C(1206249908);
                Object objQ3 = o0VarP.q();
                if (objQ3 == c2565a2) {
                    p1Var4 = p1Var6;
                    objQ3 = new c1(p1Var5, p1Var4, 1);
                    o0VarP.K(objQ3);
                } else {
                    p1Var4 = p1Var6;
                }
                l lVar2 = (l) objQ3;
                Object objQ4 = o0VarP.q();
                if (objQ4 == c2565a2) {
                    objQ4 = new z(p1Var4, 24);
                    o0VarP.K(objQ4);
                }
                p1Var2 = p1Var5;
                p1Var = p1Var4;
                c2565a = c2565a2;
                c.c(m4VarP, null, lVar2, null, (e23.a) objQ4, false, o0VarP, 221568, 10);
                o0VarP = o0VarP;
                o0VarP.g0(false);
            } else {
                p1Var = p1Var6;
                c2565a = c2565a2;
                p1Var2 = p1Var5;
                o0VarP.C(1206598751);
                o0VarP.g0(false);
            }
            String strQ = y.Q(o0VarP, R.string.lbl_what_is_your_date_of_birth);
            s62.a.f157643a.getClass();
            d dVarA = s0.a(t62.b.f162798a);
            String strQ2 = y.Q(o0VarP, R.string.lbl_next);
            h4.d.f81522a.getClass();
            g.a aVar2 = h4.d.a.f81537o;
            boolean z14 = (i15 & 112) == 32;
            Object objQ5 = o0VarP.q();
            if (z14 || objQ5 == c2565a) {
                p1Var3 = p1Var2;
                objQ5 = new k(lVar, p1Var3, 4);
                o0VarP.K(objQ5);
            } else {
                p1Var3 = p1Var2;
            }
            o0 o0Var = o0VarP;
            p.b("user_profile_birthday_screen", strQ, dVarA, null, null, strQ2, (e23.a) objQ5, false, null, null, false, null, null, false, false, aVar, null, null, null, null, aVar2, f.c(1590324931, new a(p1Var3, p1Var, 0), o0VarP), o0Var, 6, (i15 << 9) & 458752, 432, 2064280);
            o0VarP = o0Var;
        } else {
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c50.f(oVar, lVar, aVar, i14, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:35:0x012c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0133  */
    /* JADX WARN: Code duplicated, block: B:38:0x0137  */
    /* JADX WARN: Code duplicated, block: B:43:0x0152  */
    /* JADX WARN: Code duplicated, block: B:46:0x0168  */
    /* JADX WARN: Code duplicated, block: B:48:0x016e  */
    /* JADX WARN: Code duplicated, block: B:49:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:52:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:54:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:56:0x0201  */
    /* JADX WARN: Code duplicated, block: B:58:0x0205  */
    /* JADX WARN: Code duplicated, block: B:59:0x0210  */
    /* JADX WARN: Code duplicated, block: B:60:0x0220  */
    /* JADX WARN: Code duplicated, block: B:63:0x027e  */
    public static final void b(o oVar, e23.a<Unit> aVar, m mVar, int i14) {
        o0 o0Var;
        p3.c<?> cVar;
        h5.g.a.f fVar;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        int length;
        int i15;
        int i16;
        char c14;
        int i17;
        char[] cArr;
        int i18;
        o0 o0Var2;
        char c15;
        char c16;
        String strM;
        o0 o0VarE = mVar.E(-1255216815);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i19 = (o0VarE.r(oVar) ? 4 : 2) | i14;
        if (o0VarE.n(i19 & 1, (i19 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean zB = o0VarE.B(context);
            Object objQ = o0VarE.q();
            m.a aVar2 = m.f135153a;
            if (zB) {
                objQ = DateFormat.getDateFormatOrder(context);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = DateFormat.getDateFormatOrder(context);
                    o0VarE.K(objQ);
                }
            }
            char[] cArr2 = (char[]) objQ;
            r.a aVar3 = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            e eVar = j92.b.f97899b;
            float f14 = eVar.f97923h;
            float f15 = eVar.f97920e;
            bVar.getClass();
            r rVarZ = c2.l.z(aVar3, f15, f14);
            bVar.getClass();
            r rVarE = u1.n.e(l4.k.b(rVarZ, i.a(f15)), e0.w(o0VarE), m1.f128891a);
            Object objQ2 = o0VarE.q();
            aVar2.getClass();
            if (objQ2 == m.a.f135155b) {
                objQ2 = new v0(aVar, 11);
                o0VarE.K(objQ2);
            }
            r rVarD = w.d(rVarE, false, null, null, (e23.a) objQ2, 15);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81528f, false);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar2;
            } else {
                cVar = cVar2;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                u uVar = u.f22885a;
                g.b bVar3 = h4.d.a.f81534l;
                j.f22691a.getClass();
                j.c cVar3 = j.f22696f;
                bVar.getClass();
                r rVarY = c2.l.y(aVar3, f15);
                s2VarA = q2.a(cVar3, bVar3, o0VarE, 54);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarY, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarE);
                u2 u2Var = u2.f22900a;
                o0VarE.C(2022016746);
                cArr2.getClass();
                length = cArr2.length;
                i15 = 0;
                i16 = 0;
                while (i15 < length) {
                    c14 = cArr2[i15];
                    int i24 = i16 + 1;
                    if (i16 > 0) {
                        o0VarE.C(-699101597);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
                        r.a aVar5 = r.S;
                        d92.b.f58625c.getClass();
                        i17 = length;
                        cArr = cArr2;
                        i18 = i15;
                        o0 o0Var3 = o0VarE;
                        c15 = c14;
                        mh.c("/", c2.l.A(aVar5, j92.b.f97899b.f97918c, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0Var3, 6, 0, 131068);
                        o0Var2 = o0Var3;
                        o0Var2.g0(false);
                    } else {
                        i17 = length;
                        cArr = cArr2;
                        i18 = i15;
                        o0Var2 = o0VarE;
                        c15 = c14;
                        o0Var2.C(-698875204);
                        o0Var2.g0(false);
                    }
                    if (c15 != 'M') {
                        c16 = 2;
                        strM = d53.w.M(2, String.valueOf(b63.b.b(oVar.c())));
                    } else if (c15 != 'd') {
                        if (c15 != 'y') {
                            strM = "";
                        } else {
                            strM = String.valueOf(oVar.f16206a.getYear());
                        }
                        c16 = 2;
                    } else {
                        c16 = 2;
                        strM = d53.w.M(2, String.valueOf(oVar.f16206a.getDayOfMonth()));
                    }
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    o0 o0Var4 = o0Var2;
                    mh.c(strM, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97925b, o0Var2), o0Var4, 0, 0, 131070);
                    i15 = i18 + 1;
                    o0VarE = o0Var4;
                    i16 = i24;
                    length = i17;
                    cArr2 = cArr;
                }
                o0Var = o0VarE;
                e5.u(o0Var, false, true, true);
                x1 x1Var2 = n.f135158a;
            }
            h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            u uVar2 = u.f22885a;
            g.b bVar4 = h4.d.a.f81534l;
            j.f22691a.getClass();
            j.c cVar4 = j.f22696f;
            bVar.getClass();
            r rVarY2 = c2.l.y(aVar3, f15);
            s2VarA = q2.a(cVar4, bVar4, o0VarE, 54);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarY2, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var2 = u2.f22900a;
            o0VarE.C(2022016746);
            cArr2.getClass();
            length = cArr2.length;
            i15 = 0;
            i16 = 0;
            while (i15 < length) {
                c14 = cArr2[i15];
                int i25 = i16 + 1;
                if (i16 > 0) {
                    o0VarE.C(-699101597);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarB2 = d92.c.b(j92.f.f97931h, o0VarE);
                    r.a aVar6 = r.S;
                    d92.b.f58625c.getClass();
                    i17 = length;
                    cArr = cArr2;
                    i18 = i15;
                    o0 o0Var5 = o0VarE;
                    c15 = c14;
                    mh.c("/", c2.l.A(aVar6, j92.b.f97899b.f97918c, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, o0Var5, 6, 0, 131068);
                    o0Var2 = o0Var5;
                    o0Var2.g0(false);
                } else {
                    i17 = length;
                    cArr = cArr2;
                    i18 = i15;
                    o0Var2 = o0VarE;
                    c15 = c14;
                    o0Var2.C(-698875204);
                    o0Var2.g0(false);
                }
                if (c15 != 'M') {
                    c16 = 2;
                    strM = d53.w.M(2, String.valueOf(b63.b.b(oVar.c())));
                } else if (c15 != 'd') {
                    if (c15 != 'y') {
                        strM = "";
                    } else {
                        strM = String.valueOf(oVar.f16206a.getYear());
                    }
                    c16 = 2;
                } else {
                    c16 = 2;
                    strM = d53.w.M(2, String.valueOf(oVar.f16206a.getDayOfMonth()));
                }
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                o0 o0Var6 = o0Var2;
                mh.c(strM, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97925b, o0Var2), o0Var6, 0, 0, 131070);
                i15 = i18 + 1;
                o0VarE = o0Var6;
                i16 = i25;
                length = i17;
                cArr2 = cArr;
            }
            o0Var = o0VarE;
            e5.u(o0Var, false, true, true);
            x1 x1Var3 = n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c0(oVar, aVar, i14, 9);
        }
    }
}
