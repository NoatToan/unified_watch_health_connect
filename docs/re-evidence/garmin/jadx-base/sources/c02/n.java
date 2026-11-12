package c02;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import g6.q;
import gl1.y;
import h4.r;
import h5.e0;
import i3.i7;
import i3.mh;
import kotlin.t1;
import lc.u0;
import o4.d0;
import o53.f0;
import org.joda.time.LocalDate;
import p005kotlin.jvm.internal.s;
import p13.u;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import s5.x0;

/* JADX INFO: loaded from: classes10.dex */
public final class n {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22409a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.MONDAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.TUESDAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.WEDNESDAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.THURSDAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c.FRIDAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c.SATURDAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[c.SUNDAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f22409a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x028a  */
    /* JADX WARN: Code duplicated, block: B:102:0x0292  */
    /* JADX WARN: Code duplicated, block: B:104:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:107:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:111:0x0312  */
    /* JADX WARN: Code duplicated, block: B:113:0x0317  */
    /* JADX WARN: Code duplicated, block: B:116:0x0325  */
    /* JADX WARN: Code duplicated, block: B:119:0x0265 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0092  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    /* JADX WARN: Code duplicated, block: B:51:0x009c  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:67:0x012e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0135  */
    /* JADX WARN: Code duplicated, block: B:70:0x0139  */
    /* JADX WARN: Code duplicated, block: B:75:0x015a  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:80:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:82:0x01de  */
    /* JADX WARN: Code duplicated, block: B:83:0x01eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:85:0x0200  */
    /* JADX WARN: Code duplicated, block: B:87:0x024a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0269  */
    /* JADX WARN: Code duplicated, block: B:92:0x026d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0271  */
    /* JADX WARN: Code duplicated, block: B:94:0x0275  */
    /* JADX WARN: Code duplicated, block: B:95:0x0279  */
    /* JADX WARN: Code duplicated, block: B:96:0x027d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0281  */
    public static final void a(r rVar, i53.c<? extends c> cVar, c cVar2, String str, c cVar3, int i14, d0 d0Var, boolean z14, p3.m mVar, int i15, int i16) {
        int i17;
        boolean z15;
        boolean z16;
        int i18;
        d0 d0Var2;
        boolean z17;
        p2 p2VarI0;
        d0 d0VarA;
        int i19;
        c[] cVarArrValues;
        int iM;
        Object objQ;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        e0.a aVar;
        h5.g.a.b bVar;
        x0 x0Var;
        long jH;
        int length;
        int i24;
        c cVar4;
        c[] cVarArr;
        long j8;
        int i25;
        x0 x0VarF;
        long jH2;
        cVar.getClass();
        cVar2.getClass();
        o0 o0VarE = mVar.E(1929224463);
        if ((i15 & 6) == 0) {
            i17 = (o0VarE.B(rVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= o0VarE.B(cVar) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i17 |= o0VarE.k(cVar2.ordinal()) ? 256 : 128;
        }
        if ((i15 & 24576) == 0) {
            i17 |= o0VarE.k(cVar3 == null ? -1 : cVar3.ordinal()) ? 16384 : 8192;
        }
        int i26 = 589824 | i17;
        int i27 = i16 & 128;
        if (i27 == 0) {
            if ((12582912 & i15) == 0) {
                z15 = z14;
                i26 |= o0VarE.h(z15) ? 8388608 : 4194304;
            }
            if ((4793491 & i26) != 4793490) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i26 & 1, z16)) {
                o0VarE.G0();
                if ((i15 & 1) != 0 || o0VarE.o0()) {
                    d92.b.f58623a.getClass();
                    d0VarA = d0.a(d92.b.a(o0VarE).f().d());
                    if (i27 != 0) {
                        i19 = R.drawable.check;
                        z17 = true;
                    } else {
                        z17 = z15;
                        i19 = R.drawable.check;
                    }
                } else {
                    o0VarE.e();
                    d0VarA = d0Var;
                    z17 = z15;
                    i19 = i14;
                }
                o0VarE.h0();
                x1 x1Var = p3.n.f135158a;
                cVarArrValues = c.values();
                iM = u.M(cVarArrValues, cVar3);
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new defpackage.b(str, 28);
                    o0VarE.K(objQ);
                }
                r rVarC2 = v.c((e23.l) objQ, rVar, false);
                c2.j.f22691a.getClass();
                c2.j.g gVar = c2.j.f22698h;
                h4.d.f81522a.getClass();
                s2VarA = q2.a(gVar, h4.d.a.f81534l, o0VarE, 54);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarC2, o0VarE);
                h5.g.V.getClass();
                aVar = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                u2 u2Var = u2.f22900a;
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0Var = j92.f.f97933j;
                long j14 = x0Var.f157322a.fontSize;
                f0.n(j14);
                long jH3 = f0.H(q.d(j14) * 4, j14 & 1095216660480L);
                f0.n(jH3);
                long jH4 = f0.H(q.d(jH3) / 3, jH3 & 1095216660480L);
                f0.n(jH4);
                jH = f0.H(q.d(jH4) * 0.8f, jH4 & 1095216660480L);
                o0VarE.C(257507816);
                length = cVarArrValues.length;
                i24 = 0;
                while (i24 < length) {
                    int i28 = length;
                    int length2 = cVarArrValues.length;
                    int i29 = (i24 + iM) % length2;
                    cVar4 = cVarArrValues[i29 + (length2 & (((i29 ^ length2) & ((-i29) | i29)) >> 31))];
                    if (cVar.contains(cVar4)) {
                        o0VarE.C(-607014881);
                        c[] cVarArr2 = cVarArrValues;
                        t4.d dVarA = n5.c.a(i19, o0VarE, 0);
                        if (cVar4 == cVar2) {
                            o0VarE.C(257520626);
                            jH2 = fb1.c.h(d92.b.f58623a, o0VarE, false);
                        } else if (d0VarA != null) {
                            o0VarE.C(257522551);
                            o0VarE.g0(false);
                            jH2 = d0VarA.f128833a;
                            o0VarE = o0VarE;
                        } else {
                            o0VarE.C(257524310);
                            o0VarE.g0(false);
                            d0.f128823b.getClass();
                            jH2 = d0.f128832k;
                        }
                        cVarArr = cVarArr2;
                        j8 = jH;
                        i7.a(dVarA, null, x2.q(r.S, g6.f.a(((g6.c) o0VarE.A(t1.f91490h)).H0(jH)).f75997a), jH2, o0VarE, 48, 0);
                        o0VarE.g0(false);
                    } else {
                        cVarArr = cVarArrValues;
                        j8 = jH;
                        o0VarE.C(-606477620);
                        switch (a.f22409a[cVar4.ordinal()]) {
                            case 1:
                                i25 = R.string.monday_single_letter;
                                break;
                            case 2:
                                i25 = R.string.tuesday_single_letter;
                                break;
                            case 3:
                                i25 = R.string.wednesday_single_letter;
                                break;
                            case 4:
                                i25 = R.string.thursday_single_letter;
                                break;
                            case 5:
                                i25 = R.string.friday_single_letter;
                                break;
                            case 6:
                                i25 = R.string.saturday_single_letter;
                                break;
                            case 7:
                                i25 = R.string.sunday_single_letter;
                                break;
                            default:
                                u0.r();
                                return;
                        }
                        String strQ = y.Q(o0VarE, i25);
                        if (cVar4 == cVar2) {
                            o0VarE.C(257557222);
                            if (z17) {
                                o0VarE.C(257558771);
                                x0VarF = d92.c.e(d92.c.b(x0Var, o0VarE));
                            } else {
                                o0VarE.C(257559547);
                                x0VarF = d92.c.f(x0Var, o0VarE);
                            }
                            o0VarE.g0(false);
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(257561563);
                            x0VarF = d92.c.f(x0Var, o0VarE);
                            o0VarE.g0(false);
                        }
                        o0 o0Var = o0VarE;
                        mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0Var, 0, 0, 131070);
                        o0VarE = o0Var;
                        o0VarE.g0(false);
                    }
                    i24++;
                    length = i28;
                    i19 = i19;
                    cVarArrValues = cVarArr;
                    jH = j8;
                }
                int i30 = i19;
                o0VarE.g0(false);
                o0VarE.g0(true);
                x1 x1Var2 = p3.n.f135158a;
                d0Var2 = d0VarA;
                i18 = i30;
            } else {
                o0VarE.e();
                i18 = i14;
                d0Var2 = d0Var;
                z17 = z15;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new m(rVar, cVar, cVar2, str, cVar3, i18, d0Var2, z17, i15, i16);
            }
        }
        i26 = 13172736 | i17;
        z15 = z14;
        if ((4793491 & i26) != 4793490) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i26 & 1, z16)) {
            o0VarE.G0();
            if ((i15 & 1) != 0) {
                d92.b.f58623a.getClass();
                d0VarA = d0.a(d92.b.a(o0VarE).f().d());
                if (i27 != 0) {
                    i19 = R.drawable.check;
                    z17 = true;
                } else {
                    z17 = z15;
                    i19 = R.drawable.check;
                }
            } else {
                d92.b.f58623a.getClass();
                d0VarA = d0.a(d92.b.a(o0VarE).f().d());
                if (i27 != 0) {
                    i19 = R.drawable.check;
                    z17 = true;
                } else {
                    z17 = z15;
                    i19 = R.drawable.check;
                }
            }
            o0VarE.h0();
            x1 x1Var3 = p3.n.f135158a;
            cVarArrValues = c.values();
            iM = u.M(cVarArrValues, cVar3);
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new defpackage.b(str, 28);
                o0VarE.K(objQ);
            }
            r rVarC3 = v.c((e23.l) objQ, rVar, false);
            c2.j.f22691a.getClass();
            c2.j.g gVar2 = c2.j.f22698h;
            h4.d.f81522a.getClass();
            s2VarA = q2.a(gVar2, h4.d.a.f81534l, o0VarE, 54);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarC3, o0VarE);
            h5.g.V.getClass();
            aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var2 = u2.f22900a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0Var = j92.f.f97933j;
            long j15 = x0Var.f157322a.fontSize;
            f0.n(j15);
            long jH5 = f0.H(q.d(j15) * 4, j15 & 1095216660480L);
            f0.n(jH5);
            long jH6 = f0.H(q.d(jH5) / 3, jH5 & 1095216660480L);
            f0.n(jH6);
            jH = f0.H(q.d(jH6) * 0.8f, jH6 & 1095216660480L);
            o0VarE.C(257507816);
            length = cVarArrValues.length;
            i24 = 0;
            while (i24 < length) {
                int i210 = length;
                int length3 = cVarArrValues.length;
                int i211 = (i24 + iM) % length3;
                cVar4 = cVarArrValues[i211 + (length3 & (((i211 ^ length3) & ((-i211) | i211)) >> 31))];
                if (cVar.contains(cVar4)) {
                    o0VarE.C(-607014881);
                    c[] cVarArr3 = cVarArrValues;
                    t4.d dVarA2 = n5.c.a(i19, o0VarE, 0);
                    if (cVar4 == cVar2) {
                        o0VarE.C(257520626);
                        jH2 = fb1.c.h(d92.b.f58623a, o0VarE, false);
                    } else if (d0VarA != null) {
                        o0VarE.C(257522551);
                        o0VarE.g0(false);
                        jH2 = d0VarA.f128833a;
                        o0VarE = o0VarE;
                    } else {
                        o0VarE.C(257524310);
                        o0VarE.g0(false);
                        d0.f128823b.getClass();
                        jH2 = d0.f128832k;
                    }
                    cVarArr = cVarArr3;
                    j8 = jH;
                    i7.a(dVarA2, null, x2.q(r.S, g6.f.a(((g6.c) o0VarE.A(t1.f91490h)).H0(jH)).f75997a), jH2, o0VarE, 48, 0);
                    o0VarE.g0(false);
                } else {
                    cVarArr = cVarArrValues;
                    j8 = jH;
                    o0VarE.C(-606477620);
                    switch (a.f22409a[cVar4.ordinal()]) {
                        case 1:
                            i25 = R.string.monday_single_letter;
                            break;
                        case 2:
                            i25 = R.string.tuesday_single_letter;
                            break;
                        case 3:
                            i25 = R.string.wednesday_single_letter;
                            break;
                        case 4:
                            i25 = R.string.thursday_single_letter;
                            break;
                        case 5:
                            i25 = R.string.friday_single_letter;
                            break;
                        case 6:
                            i25 = R.string.saturday_single_letter;
                            break;
                        case 7:
                            i25 = R.string.sunday_single_letter;
                            break;
                        default:
                            u0.r();
                            return;
                    }
                    String strQ2 = y.Q(o0VarE, i25);
                    if (cVar4 == cVar2) {
                        o0VarE.C(257557222);
                        if (z17) {
                            o0VarE.C(257558771);
                            x0VarF = d92.c.e(d92.c.b(x0Var, o0VarE));
                        } else {
                            o0VarE.C(257559547);
                            x0VarF = d92.c.f(x0Var, o0VarE);
                        }
                        o0VarE.g0(false);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(257561563);
                        x0VarF = d92.c.f(x0Var, o0VarE);
                        o0VarE.g0(false);
                    }
                    o0 o0Var2 = o0VarE;
                    mh.c(strQ2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0Var2, 0, 0, 131070);
                    o0VarE = o0Var2;
                    o0VarE.g0(false);
                }
                i24++;
                length = i210;
                i19 = i19;
                cVarArrValues = cVarArr;
                jH = j8;
            }
            int i34 = i19;
            o0VarE.g0(false);
            o0VarE.g0(true);
            x1 x1Var4 = p3.n.f135158a;
            d0Var2 = d0VarA;
            i18 = i34;
        } else {
            o0VarE.e();
            i18 = i14;
            d0Var2 = d0Var;
            z17 = z15;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m(rVar, cVar, cVar2, str, cVar3, i18, d0Var2, z17, i15, i16);
        }
    }

    public static final c b(c cVar) {
        cVar.getClass();
        return u.M(c.values(), cVar) == c.values().length + (-1) ? c.values()[0] : c.values()[cVar.ordinal() + 1];
    }

    public static final c c(LocalDate localDate) {
        for (c cVar : c.values()) {
            if (localDate.getDayOfWeek() == cVar.f22364a) {
                return cVar;
            }
        }
        n23.j.s("Array contains no element matching the predicate.");
        return null;
    }
}
