package di0;

import android.content.Context;
import c2.b0;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h4.r;
import h5.e0;
import i3.e5;
import java.util.Iterator;
import java.util.List;
import l72.x0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.jvm.internal.s;
import p13.x;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class i {
    /* JADX WARN: Code duplicated, block: B:145:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:147:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:151:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:157:0x01df  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:160:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:161:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:163:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:164:0x0206  */
    /* JADX WARN: Code duplicated, block: B:166:0x0211  */
    /* JADX WARN: Code duplicated, block: B:167:0x021a  */
    /* JADX WARN: Code duplicated, block: B:169:0x021d  */
    /* JADX WARN: Code duplicated, block: B:170:0x0225  */
    /* JADX WARN: Code duplicated, block: B:172:0x0230  */
    /* JADX WARN: Code duplicated, block: B:173:0x0239  */
    /* JADX WARN: Code duplicated, block: B:175:0x023c  */
    /* JADX WARN: Code duplicated, block: B:176:0x0244  */
    /* JADX WARN: Code duplicated, block: B:179:0x0259  */
    /* JADX WARN: Code duplicated, block: B:180:0x027c  */
    /* JADX WARN: Code duplicated, block: B:183:0x0288  */
    /* JADX WARN: Code duplicated, block: B:184:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:187:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:189:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:190:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:195:0x0314  */
    /* JADX WARN: Code duplicated, block: B:197:0x0372  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ee  */
    public static final void a(sh0.e eVar, xh0.c cVar, m mVar, int i14) {
        Integer numValueOf;
        Float fValueOf;
        Float fValueOf2;
        double d14;
        Integer numValueOf2;
        Float fValueOf3;
        Float fValueOf4;
        String strJ;
        String strJ2;
        String strJ3;
        String strJ4;
        String strE;
        b92.a aVarC;
        String strE2;
        b92.a aVarC2;
        r.a aVar;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        e0.a aVar2;
        h5.g.a.b bVar;
        List<sh0.f> list;
        int i15;
        sh0.f fVar;
        Double dValueOf;
        Double d15;
        Object next;
        List<sh0.f> list2;
        int i16;
        sh0.f fVar2;
        Double dValueOf2;
        Double d16;
        Object next2;
        sh0.f.d dVar;
        cVar.getClass();
        Context context = cVar.f190978a;
        o0 o0VarE = mVar.E(2087189454);
        int i17 = ((i14 & 8) == 0 ? o0VarE.B(eVar) : o0VarE.r(eVar) ? 4 : 2) | i14 | (o0VarE.r(cVar) ? 32 : 16);
        if (o0VarE.n(i17 & 1, (i17 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            double d17 = 0.0d;
            if (eVar == null) {
                numValueOf = null;
            } else {
                List<sh0.f> list3 = eVar.f159296a;
                if (list3 != null) {
                    Iterator<T> it = list3.iterator();
                    do {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        } else {
                            next2 = it.next();
                            dVar = ((sh0.f) next2).f159298b;
                        }
                    } while ((dVar != null ? dVar.f159302b : null) == null);
                    fVar2 = (sh0.f) next2;
                } else {
                    fVar2 = null;
                }
                if (fVar2 == null) {
                    dValueOf2 = null;
                } else {
                    Iterator<T> it3 = list3.iterator();
                    double dDoubleValue = 0.0d;
                    while (it3.hasNext()) {
                        sh0.f.d dVar2 = ((sh0.f) it3.next()).f159298b;
                        dDoubleValue += (dVar2 == null || (d16 = dVar2.f159302b) == null) ? 0.0d : d16.doubleValue();
                    }
                    dValueOf2 = Double.valueOf(dDoubleValue);
                }
                if (dValueOf2 != null) {
                    numValueOf = Integer.valueOf((int) dValueOf2.doubleValue());
                } else {
                    numValueOf = null;
                }
            }
            if (eVar == null || (list2 = eVar.f159296a) == null) {
                fValueOf = null;
            } else {
                if (list2.isEmpty()) {
                    i16 = 0;
                } else {
                    Iterator<T> it4 = list2.iterator();
                    i16 = 0;
                    while (it4.hasNext()) {
                        sh0.f.d dVar3 = ((sh0.f) it4.next()).f159298b;
                        Double d18 = dVar3 != null ? dVar3.f159302b : null;
                        if ((d18 != null && d18.doubleValue() >= 0.0d) && (i16 = i16 + 1) < 0) {
                            x.p();
                            throw null;
                        }
                    }
                }
                if (i16 > 0) {
                    fValueOf = Float.valueOf(i16);
                } else {
                    fValueOf = null;
                }
            }
            if (numValueOf != null) {
                fValueOf2 = Float.valueOf(numValueOf.intValue() / (fValueOf != null ? fValueOf.floatValue() : 1.0f));
            } else {
                fValueOf2 = null;
            }
            if (eVar != null) {
                List<sh0.f> list4 = eVar.f159296a;
                if (list4 != null) {
                    Iterator<T> it5 = list4.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            d14 = d17;
                            next = null;
                            break;
                        }
                        next = it5.next();
                        d14 = d17;
                        sh0.f.d dVar4 = ((sh0.f) next).f159298b;
                        if ((dVar4 != null ? dVar4.f159303c : null) != null) {
                            break;
                        } else {
                            d17 = d14;
                        }
                    }
                    fVar = (sh0.f) next;
                } else {
                    d14 = 0.0d;
                    fVar = null;
                }
                if (fVar == null) {
                    dValueOf = null;
                } else {
                    Iterator<T> it6 = list4.iterator();
                    double dDoubleValue2 = d14;
                    while (it6.hasNext()) {
                        sh0.f.d dVar5 = ((sh0.f) it6.next()).f159298b;
                        dDoubleValue2 += (dVar5 == null || (d15 = dVar5.f159303c) == null) ? d14 : d15.doubleValue();
                    }
                    dValueOf = Double.valueOf(dDoubleValue2);
                }
                if (dValueOf != null) {
                    numValueOf2 = Integer.valueOf((int) dValueOf.doubleValue());
                }
                if (eVar != null || (list = eVar.f159296a) == null) {
                    fValueOf3 = null;
                } else {
                    if (list.isEmpty()) {
                        i15 = 0;
                    } else {
                        Iterator<T> it7 = list.iterator();
                        i15 = 0;
                        while (it7.hasNext()) {
                            sh0.f.d dVar6 = ((sh0.f) it7.next()).f159298b;
                            Double d19 = dVar6 != null ? dVar6.f159303c : null;
                            if ((d19 != null && d19.doubleValue() >= d14) && (i15 = i15 + 1) < 0) {
                                x.p();
                                throw null;
                            }
                        }
                    }
                    if (i15 > 0) {
                        fValueOf3 = Float.valueOf(i15);
                    } else {
                        fValueOf3 = null;
                    }
                }
                if (numValueOf2 != null) {
                    fValueOf4 = Float.valueOf(numValueOf2.intValue() / (fValueOf3 != null ? fValueOf3.floatValue() : 1.0f));
                } else {
                    fValueOf4 = null;
                }
                if (fValueOf2 != null) {
                    strJ = xh0.c.a(fValueOf2.floatValue());
                } else {
                    strJ = null;
                }
                if (strJ == null) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 39372660, R.string.no_value, o0VarE, false);
                } else {
                    o0VarE.C(39370831);
                    o0VarE.g0(false);
                }
                if (fValueOf4 != null) {
                    strJ2 = xh0.c.a(fValueOf4.floatValue());
                } else {
                    strJ2 = null;
                }
                if (strJ2 == null) {
                    strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 39376596, R.string.no_value, o0VarE, false);
                } else {
                    o0VarE.C(39374705);
                    o0VarE.g0(false);
                }
                if (numValueOf != null) {
                    strJ3 = String.valueOf(numValueOf.intValue());
                } else {
                    strJ3 = null;
                }
                if (strJ3 == null) {
                    strJ3 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 39379668, R.string.no_value, o0VarE, false);
                } else {
                    o0VarE.C(39378614);
                    o0VarE.g0(false);
                }
                if (numValueOf2 != null) {
                    strJ4 = String.valueOf(numValueOf2.intValue());
                } else {
                    strJ4 = null;
                }
                if (strJ4 == null) {
                    strJ4 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 39382868, R.string.no_value, o0VarE, false);
                } else {
                    o0VarE.C(39381752);
                    o0VarE.g0(false);
                }
                if (fValueOf2 != null) {
                    String string = context.getString(R.string.common_weekly);
                    String strD = p6.b.d(context, R.string.lbl_average, string);
                    String string2 = context.getString(R.string.lbl_floors_climbed);
                    string2.getClass();
                    strE = v.e0.h(e5.l(string, StringUtils.SPACE, strD, StringUtils.SPACE, string2), StringUtils.SPACE, xh0.c.a(fValueOf2.floatValue()), StringUtils.SPACE);
                } else {
                    strE = cVar.e();
                }
                aVarC = xh0.c.c("merge", strE);
                if (fValueOf4 != null) {
                    String string3 = context.getString(R.string.common_weekly);
                    String strD2 = p6.b.d(context, R.string.lbl_average, string3);
                    String string4 = context.getString(R.string.floors_descended_lbl);
                    string4.getClass();
                    strE2 = v.e0.h(e5.l(string3, StringUtils.SPACE, strD2, StringUtils.SPACE, string4), StringUtils.SPACE, xh0.c.a(fValueOf4.floatValue()), StringUtils.SPACE);
                } else {
                    strE2 = cVar.e();
                }
                aVarC2 = xh0.c.c("merge", strE2);
                aVar = r.S;
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                x1 x1Var2 = n.f135158a;
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(aVar, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
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
                bVar = h5.g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                b0 b0Var = b0.f22601a;
                x0 x0Var = x0.f111346a;
                d92.b.f58623a.getClass();
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar2 = j92.b.f97899b;
                r rVarC2 = c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar2.f97920e, 7);
                z3.e eVarC = z3.f.c(1229287391, new h(strJ, aVarC, strJ3, 0), o0VarE);
                int i18 = (x0.f111348c << 6) | 48;
                x0Var.e(rVarC2, eVarC, o0VarE, i18, 0);
                bVar2.getClass();
                x0Var.e(c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar2.f97920e, 7), z3.f.c(-1389191608, new h(strJ2, aVarC2, strJ4, 1), o0VarE), o0VarE, i18, 0);
                o0VarE.g0(true);
            } else {
                d14 = 0.0d;
            }
            numValueOf2 = null;
            if (eVar != null) {
                fValueOf3 = null;
            } else {
                fValueOf3 = null;
            }
            if (numValueOf2 != null) {
                fValueOf4 = Float.valueOf(numValueOf2.intValue() / (fValueOf3 != null ? fValueOf3.floatValue() : 1.0f));
            } else {
                fValueOf4 = null;
            }
            if (fValueOf2 != null) {
                strJ = xh0.c.a(fValueOf2.floatValue());
            } else {
                strJ = null;
            }
            if (strJ == null) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 39372660, R.string.no_value, o0VarE, false);
            } else {
                o0VarE.C(39370831);
                o0VarE.g0(false);
            }
            if (fValueOf4 != null) {
                strJ2 = xh0.c.a(fValueOf4.floatValue());
            } else {
                strJ2 = null;
            }
            if (strJ2 == null) {
                strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 39376596, R.string.no_value, o0VarE, false);
            } else {
                o0VarE.C(39374705);
                o0VarE.g0(false);
            }
            if (numValueOf != null) {
                strJ3 = String.valueOf(numValueOf.intValue());
            } else {
                strJ3 = null;
            }
            if (strJ3 == null) {
                strJ3 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 39379668, R.string.no_value, o0VarE, false);
            } else {
                o0VarE.C(39378614);
                o0VarE.g0(false);
            }
            if (numValueOf2 != null) {
                strJ4 = String.valueOf(numValueOf2.intValue());
            } else {
                strJ4 = null;
            }
            if (strJ4 == null) {
                strJ4 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 39382868, R.string.no_value, o0VarE, false);
            } else {
                o0VarE.C(39381752);
                o0VarE.g0(false);
            }
            if (fValueOf2 != null) {
                String string5 = context.getString(R.string.common_weekly);
                String strD3 = p6.b.d(context, R.string.lbl_average, string5);
                String string6 = context.getString(R.string.lbl_floors_climbed);
                string6.getClass();
                strE = v.e0.h(e5.l(string5, StringUtils.SPACE, strD3, StringUtils.SPACE, string6), StringUtils.SPACE, xh0.c.a(fValueOf2.floatValue()), StringUtils.SPACE);
            } else {
                strE = cVar.e();
            }
            aVarC = xh0.c.c("merge", strE);
            if (fValueOf4 != null) {
                String string7 = context.getString(R.string.common_weekly);
                String strD4 = p6.b.d(context, R.string.lbl_average, string7);
                String string8 = context.getString(R.string.floors_descended_lbl);
                string8.getClass();
                strE2 = v.e0.h(e5.l(string7, StringUtils.SPACE, strD4, StringUtils.SPACE, string8), StringUtils.SPACE, xh0.c.a(fValueOf4.floatValue()), StringUtils.SPACE);
            } else {
                strE2 = cVar.e();
            }
            aVarC2 = xh0.c.c("merge", strE2);
            aVar = r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar2 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            zVarA = y.a(kVar2, h4.d.a.f81536n, o0VarE, 0);
            x1 x1Var3 = n.f135158a;
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b != null) {
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
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var2 = b0.f22601a;
            x0 x0Var2 = x0.f111346a;
            d92.b.f58623a.getClass();
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar3 = j92.b.f97899b;
            r rVarC3 = c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar3.f97920e, 7);
            z3.e eVarC2 = z3.f.c(1229287391, new h(strJ, aVarC, strJ3, 0), o0VarE);
            int i19 = (x0.f111348c << 6) | 48;
            x0Var2.e(rVarC3, eVarC2, o0VarE, i19, 0);
            bVar3.getClass();
            x0Var2.e(c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar3.f97920e, 7), z3.f.c(-1389191608, new h(strJ2, aVarC2, strJ4, 1), o0VarE), o0VarE, i19, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.r(eVar, cVar, i14, 22);
        }
    }
}
