package w52;

import android.os.Build;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.i7;
import i3.mh;
import l72.v2;
import p005kotlin.Unit;
import p3.b4;
import p3.c2;
import p3.i2;
import p3.p2;

/* JADX INFO: loaded from: classes9.dex */
public final class y1 {
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0081  */
    /* JADX WARN: Code duplicated, block: B:41:0x009a  */
    /* JADX WARN: Code duplicated, block: B:42:0x009c  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:49:0x00be  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:66:0x0105  */
    /* JADX WARN: Code duplicated, block: B:69:0x010f  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    public static final void a(int i14, int i15, e23.l lVar, String str, p3.m mVar, boolean z14) {
        int i16;
        boolean z15;
        boolean z16;
        boolean z17;
        p2 p2VarI0;
        String strQ;
        String strQ2;
        Object objQ;
        p3.m.a.C2565a c2565a;
        p3.p1 p1Var;
        p3.p1 p1VarQ;
        boolean z18;
        boolean z19;
        int i17;
        boolean z24;
        boolean zB;
        Object objQ2;
        boolean z25;
        int i18;
        boolean z26;
        Object objQ3;
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(972151342);
        int i19 = 4;
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(lVar) ? 32 : 16;
        }
        int i24 = i15 & 4;
        if (i24 == 0) {
            if ((i14 & 384) == 0) {
                z15 = z14;
                i16 |= o0VarE.h(z15) ? 256 : 128;
            }
            if ((i16 & 147) != 146) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                if (i24 != 0) {
                    z15 = true;
                }
                p3.x1 x1Var = p3.n.f135158a;
                strQ = gl1.y.Q(o0VarE, R.string.workout_add_notes);
                strQ2 = gl1.y.Q(o0VarE, R.string.workout_step_notes);
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = p3.p0.n(str);
                    o0VarE.K(objQ);
                }
                p1Var = (p3.p1) objQ;
                p1VarQ = p3.p0.q(lVar, o0VarE);
                h4.r rVarF = x2.f(h4.r.S, 1.0f);
                if (Build.VERSION.SDK_INT <= 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                h4.r rVarA = v2.a(rVarF, z18, new s(i19), o0VarE, 54);
                if ((i16 & 896) == 256) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean zB2 = z19 | o0VarE.B(strQ) | o0VarE.B(strQ2);
                i17 = i16 & 14;
                if (i17 == 4) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                zB = zB2 | z24 | o0VarE.B(p1VarQ);
                objQ2 = o0VarE.q();
                if (!zB || objQ2 == c2565a) {
                    boolean z27 = z15;
                    ds.e eVar = new ds.e(z27, strQ, strQ2, str, p1Var, p1VarQ);
                    z25 = z27;
                    o0VarE.K(eVar);
                    objQ2 = eVar;
                } else {
                    z25 = z15;
                }
                e23.l lVar2 = (e23.l) objQ2;
                i18 = 4;
                if (i17 == 4) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                objQ3 = o0VarE.q();
                if (z26 || objQ3 == c2565a) {
                    objQ3 = new b82.b0(i18, str, p1Var);
                    o0VarE.K(objQ3);
                }
                p002j6.c.b(lVar2, rVarA, (e23.l) objQ3, o0VarE, 0, 0);
                z17 = z25;
            } else {
                o0VarE.e();
                z17 = z15;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new bb1.e(str, lVar, z17, i14, i15);
            }
        }
        i16 |= 384;
        z15 = z14;
        if ((i16 & 147) != 146) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i16 & 1, z16)) {
            if (i24 != 0) {
                z15 = true;
            }
            p3.x1 x1Var2 = p3.n.f135158a;
            strQ = gl1.y.Q(o0VarE, R.string.workout_add_notes);
            strQ2 = gl1.y.Q(o0VarE, R.string.workout_step_notes);
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(str);
                o0VarE.K(objQ);
            }
            p1Var = (p3.p1) objQ;
            p1VarQ = p3.p0.q(lVar, o0VarE);
            h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
            if (Build.VERSION.SDK_INT <= 32) {
                z18 = true;
            } else {
                z18 = false;
            }
            h4.r rVarA2 = v2.a(rVarF2, z18, new s(i19), o0VarE, 54);
            if ((i16 & 896) == 256) {
                z19 = true;
            } else {
                z19 = false;
            }
            boolean zB3 = z19 | o0VarE.B(strQ) | o0VarE.B(strQ2);
            i17 = i16 & 14;
            if (i17 == 4) {
                z24 = true;
            } else {
                z24 = false;
            }
            zB = zB3 | z24 | o0VarE.B(p1VarQ);
            objQ2 = o0VarE.q();
            if (zB) {
                boolean z28 = z15;
                ds.e eVar2 = new ds.e(z28, strQ, strQ2, str, p1Var, p1VarQ);
                z25 = z28;
                o0VarE.K(eVar2);
                objQ2 = eVar2;
            } else {
                boolean z29 = z15;
                ds.e eVar3 = new ds.e(z29, strQ, strQ2, str, p1Var, p1VarQ);
                z25 = z29;
                o0VarE.K(eVar3);
                objQ2 = eVar3;
            }
            e23.l lVar3 = (e23.l) objQ2;
            i18 = 4;
            if (i17 == 4) {
                z26 = true;
            } else {
                z26 = false;
            }
            objQ3 = o0VarE.q();
            if (z26) {
                objQ3 = new b82.b0(i18, str, p1Var);
                o0VarE.K(objQ3);
            } else {
                objQ3 = new b82.b0(i18, str, p1Var);
                o0VarE.K(objQ3);
            }
            p002j6.c.b(lVar3, rVarA2, (e23.l) objQ3, o0VarE, 0, 0);
            z17 = z25;
        } else {
            o0VarE.e();
            z17 = z15;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bb1.e(str, lVar, z17, i14, i15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(String str, p3.m mVar, int i14) {
        int i15;
        byte b14;
        p3.o0 o0Var;
        Object obj;
        boolean z14;
        boolean z15;
        p3.o0 o0Var2;
        j92.e eVar;
        h4.r.a aVar;
        boolean z16;
        p3.o0 o0Var3;
        p3.o0 o0VarE = mVar.E(-305551563);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(str) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                obj = objQ;
                c2 c2VarN = p3.p0.n(Boolean.FALSE);
                o0VarE.K(c2VarN);
                obj = c2VarN;
            }
            obj = objQ;
            p3.p1 p1Var = (p3.p1) obj;
            Object objQ2 = o0VarE.q();
            Object obj2 = objQ2;
            if (objQ2 == c2565a) {
                c2 c2VarN2 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(c2VarN2);
                obj2 = c2VarN2;
            }
            p3.p1 p1Var2 = (p3.p1) obj2;
            h4.r.a aVar2 = h4.r.S;
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            Object objQ3 = o0VarE.q();
            Object obj3 = objQ3;
            if (objQ3 == c2565a) {
                w51.j0 j0Var = new w51.j0(p1Var2, 10);
                o0VarE.K(j0Var);
                obj3 = j0Var;
            }
            h4.r rVarD = u1.w.d(aVar2, zBooleanValue, null, null, (e23.a) obj3, 14);
            h4.d.f81522a.getClass();
            h4.g.a aVar3 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar3, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            d92.b.f58623a.getClass();
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            s5.x0 x0VarF = d92.c.f(j92.f.f97932i, o0VarE);
            d6.p.f57793b.getClass();
            int i16 = d6.p.f57795d;
            int i17 = ((Boolean) p1Var2.getF182175a()).booleanValue() ? Integer.MAX_VALUE : 3;
            Object objQ4 = o0VarE.q();
            Object obj4 = objQ4;
            if (objQ4 == c2565a) {
                sk0.l lVar = new sk0.l(p1Var2, p1Var, 5);
                o0VarE.K(lVar);
                obj4 = lVar;
            }
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, i16, false, i17, 0, (e23.l) obj4, x0VarF, o0VarE, i15 & 14, 1573248, 45054);
            p3.o0 o0Var4 = o0VarE;
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0Var4.C(-2074547941);
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar3 = j92.b.f97899b;
                h4.r rVarA = c2.l.A(aVar2, eVar3.f97920e, 0.0f, 2);
                bVar2.getClass();
                h4.r rVarC2 = c2.l.C(rVarA, 0.0f, eVar3.f97917b, 0.0f, 0.0f, 13);
                s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, o0Var4, 0);
                int iHashCode2 = Long.hashCode(o0Var4.U);
                i2 i2VarA1 = o0Var4.a0();
                h4.r rVarC3 = h4.k.c(rVarC2, o0Var4);
                if (cVar == null) {
                    p3.p0.l();
                    throw null;
                }
                o0Var4.z();
                if (o0Var4.T) {
                    o0Var4.M(aVar4);
                } else {
                    o0Var4.c();
                }
                b4.c(eVar2, s2VarA, o0Var4);
                b4.c(c1623g, i2VarA1, o0Var4);
                if (o0Var4.T || !p005kotlin.jvm.internal.s.g(o0Var4.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0Var4, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC3, o0Var4);
                u2 u2Var = u2.f22900a;
                if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                    eVar = eVar3;
                    aVar = aVar2;
                    z16 = false;
                    o0Var4.C(-1524072862);
                    o0Var4.g0(false);
                    o0Var3 = o0Var4;
                } else {
                    o0Var4.C(-1524266023);
                    String strQ = gl1.y.Q(o0Var4, R.string.tabbar_more);
                    fVar2.getClass();
                    aVar = aVar2;
                    eVar = eVar3;
                    z16 = false;
                    mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0Var4), o0Var4, 0, 0, 131070);
                    p3.o0 o0Var5 = o0Var4;
                    o0Var5.g0(false);
                    o0Var3 = o0Var5;
                }
                bVar2.getClass();
                h4.r rVarC4 = c2.l.C(aVar, eVar.f97917b, 0.0f, 0.0f, 0.0f, 14);
                bVar2.getClass();
                i7.a(n5.c.a(((Boolean) p1Var2.getF182175a()).booleanValue() ? R.drawable.chevron_up : R.drawable.chevron_down, o0Var3, z16 ? 1 : 0), null, x2.q(rVarC4, j92.b.f97901d.f97903b), sn.a.y(o0Var3), o0Var3, 48, 0);
                z15 = true;
                o0Var3.g0(true);
                o0Var3.g0(z16);
                z14 = z16;
                o0Var2 = o0Var3;
            } else {
                z14 = false;
                z15 = true;
                o0Var4.C(-2073709949);
                o0Var4.g0(false);
                o0Var2 = o0Var4;
            }
            o0Var2.g0(z15);
            b14 = z14;
            o0Var = o0Var2;
        } else {
            b14 = 0;
            o0VarE.e();
            o0Var = o0VarE;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bg2.b(str, i14, 6, b14);
        }
    }

    public static final void c(final int i14, final String str, p3.m mVar, final boolean z14) {
        int i15;
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(1758689751);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        int i16 = i15;
        final int i17 = 0;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (str == null || str.length() == 0) {
                p2 p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: w52.x1
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i18 = i17;
                            p3.m mVar2 = (p3.m) obj;
                            ((Integer) obj2).intValue();
                            switch (i18) {
                                case 0:
                                    y1.c(p3.p0.t(i14 | 1), str, mVar2, z14);
                                    break;
                                default:
                                    y1.c(p3.p0.t(i14 | 1), str, mVar2, z14);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            h4.r.a aVar = h4.r.S;
            h4.r rVarF = x2.f(aVar, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarY = c2.l.y(rVarF, eVar.f97920e);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
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
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            if (z14) {
                o0VarE.C(-701944028);
                String strQ = gl1.y.Q(o0VarE, R.string.workout_step_notes);
                d92.b.f58624b.getClass();
                s5.x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
                bVar.getClass();
                mh.c(strQ, c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
                o0Var = o0VarE;
                o0Var.g0(false);
            } else {
                o0Var = o0VarE;
                o0Var.C(-701721727);
                o0Var.g0(false);
            }
            b(str, o0Var, i16 & 14);
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI1 = o0Var.i0();
        if (p2VarI1 != null) {
            final int i18 = 1;
            p2VarI1.f135219d = new e23.p() { // from class: w52.x1
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i19 = i18;
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).intValue();
                    switch (i19) {
                        case 0:
                            y1.c(p3.p0.t(i14 | 1), str, mVar2, z14);
                            break;
                        default:
                            y1.c(p3.p0.t(i14 | 1), str, mVar2, z14);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
