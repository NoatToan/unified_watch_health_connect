package di0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.t2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import d81.t;
import e23.q;
import h4.r;
import h5.e0;
import i3.e5;
import java.util.Iterator;
import java.util.List;
import l72.x0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
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
public final class b {
    /* JADX WARN: Code duplicated, block: B:112:0x0147  */
    /* JADX WARN: Code duplicated, block: B:139:0x018d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    public static final void a(sh0.a aVar, xh0.c cVar, m mVar, int i14) {
        Integer numValueOf;
        Float fValueOf;
        Float fValueOf2;
        Integer numValueOf2;
        Float fValueOf3;
        Float fValueOf4;
        List<sh0.b> list;
        int i15;
        sh0.b bVar;
        Integer num;
        Object next;
        sh0.b.d dVar;
        List<sh0.b> list2;
        int i16;
        sh0.b bVar2;
        Integer num2;
        Object next2;
        sh0.b.d dVar2;
        final xh0.c cVar2 = cVar;
        cVar2.getClass();
        Context context = cVar2.f190978a;
        o0 o0VarE = mVar.E(1811043840);
        int i17 = ((i14 & 8) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 4 : 2) | i14 | (o0VarE.r(cVar2) ? 32 : 16);
        if (o0VarE.n(i17 & 1, (i17 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            if (aVar == null) {
                numValueOf = null;
            } else {
                List<sh0.b> list3 = aVar.f159272a;
                if (list3 != null) {
                    Iterator<T> it = list3.iterator();
                    do {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        } else {
                            next2 = it.next();
                            dVar2 = ((sh0.b) next2).f159274b;
                        }
                    } while ((dVar2 != null ? dVar2.f159278b : null) == null);
                    bVar2 = (sh0.b) next2;
                } else {
                    bVar2 = null;
                }
                if (bVar2 == null) {
                    numValueOf = null;
                } else {
                    Iterator<T> it3 = list3.iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        sh0.b.d dVar3 = ((sh0.b) it3.next()).f159274b;
                        iIntValue += (dVar3 == null || (num2 = dVar3.f159278b) == null) ? 0 : num2.intValue();
                    }
                    numValueOf = Integer.valueOf(iIntValue);
                }
            }
            if (aVar == null || (list2 = aVar.f159272a) == null) {
                fValueOf = null;
            } else {
                if (list2.isEmpty()) {
                    i16 = 0;
                } else {
                    Iterator<T> it4 = list2.iterator();
                    i16 = 0;
                    while (it4.hasNext()) {
                        sh0.b.d dVar4 = ((sh0.b) it4.next()).f159274b;
                        Integer num3 = dVar4 != null ? dVar4.f159278b : null;
                        if ((num3 != null && num3.intValue() >= 0) && (i16 = i16 + 1) < 0) {
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
            if (aVar == null) {
                numValueOf2 = null;
            } else {
                List<sh0.b> list4 = aVar.f159272a;
                if (list4 != null) {
                    Iterator<T> it5 = list4.iterator();
                    do {
                        if (!it5.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it5.next();
                            dVar = ((sh0.b) next).f159274b;
                        }
                    } while ((dVar != null ? dVar.f159279c : null) == null);
                    bVar = (sh0.b) next;
                } else {
                    bVar = null;
                }
                if (bVar == null) {
                    numValueOf2 = null;
                } else {
                    Iterator<T> it6 = list4.iterator();
                    int iIntValue2 = 0;
                    while (it6.hasNext()) {
                        sh0.b.d dVar5 = ((sh0.b) it6.next()).f159274b;
                        iIntValue2 += (dVar5 == null || (num = dVar5.f159279c) == null) ? 0 : num.intValue();
                    }
                    numValueOf2 = Integer.valueOf(iIntValue2);
                }
            }
            if (aVar == null || (list = aVar.f159272a) == null) {
                fValueOf3 = null;
            } else {
                if (list.isEmpty()) {
                    i15 = 0;
                } else {
                    Iterator<T> it7 = list.iterator();
                    i15 = 0;
                    while (it7.hasNext()) {
                        sh0.b.d dVar6 = ((sh0.b) it7.next()).f159274b;
                        Integer num4 = dVar6 != null ? dVar6.f159279c : null;
                        if ((num4 != null && num4.intValue() >= 0) && (i15 = i15 + 1) < 0) {
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
            String strA = fValueOf2 != null ? xh0.c.a(fValueOf2.floatValue()) : null;
            if (strA == null) {
                strA = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 951409798, R.string.no_value, o0VarE, false);
            } else {
                o0VarE.C(951408000);
                o0VarE.g0(false);
            }
            String strA2 = fValueOf4 != null ? xh0.c.a(fValueOf4.floatValue()) : null;
            if (strA2 == null) {
                strA2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 951413702, R.string.no_value, o0VarE, false);
            } else {
                o0VarE.C(951411842);
                o0VarE.g0(false);
            }
            final String str = strA2;
            String strValueOf = numValueOf != null ? String.valueOf(numValueOf.intValue()) : null;
            if (strValueOf == null) {
                strValueOf = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 951416774, R.string.no_value, o0VarE, false);
            } else {
                o0VarE.C(951415720);
                o0VarE.g0(false);
            }
            String strValueOf2 = numValueOf2 != null ? String.valueOf(numValueOf2.intValue()) : null;
            if (strValueOf2 == null) {
                strValueOf2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 951419974, R.string.no_value, o0VarE, false);
            } else {
                o0VarE.C(951418858);
                o0VarE.g0(false);
            }
            final String str2 = strValueOf2;
            Context context2 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String strG = fValueOf2 != null ? e5.g(context.getString(R.string.lbl_daily_avg_climbed), StringUtils.SPACE, xh0.c.a(fValueOf2.floatValue())) : cVar2.e();
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new t(8);
                o0VarE.K(objQ);
            }
            final String strA3 = oi0.c.A(context2, (e23.l) objQ, strG);
            String strH = fValueOf4 != null ? com.nimbusds.jose.shaded.gson.internal.a.h(context.getString(R.string.lbl_daily_avg_descended), StringUtils.SPACE, xh0.c.a(fValueOf4.floatValue()), StringUtils.SPACE) : cVar2.e();
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new t(9);
                o0VarE.K(objQ2);
            }
            final String strA4 = oi0.c.A(context2, (e23.l) objQ2, strH);
            r.a aVar2 = r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            x1 x1Var2 = n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(aVar2, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            x0 x0Var = x0.f111346a;
            d92.b.f58623a.getClass();
            j92.b bVar4 = d92.b.f58625c;
            bVar4.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarC2 = c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
            final int i18 = 0;
            final String str3 = strValueOf;
            final String str4 = strA;
            z3.e eVarC = z3.f.c(719504271, new q() { // from class: di0.a
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i19 = i18;
                    String str5 = strA3;
                    xh0.c cVar3 = cVar2;
                    switch (i19) {
                        case 0:
                            t2 t2Var = (t2) obj;
                            m mVar2 = (m) obj2;
                            int iIntValue3 = ((Integer) obj3).intValue();
                            t2Var.getClass();
                            if ((iIntValue3 & 6) == 0) {
                                iIntValue3 |= mVar2.B(t2Var) ? 4 : 2;
                            }
                            if (mVar2.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                x1 x1Var3 = n.f135158a;
                                x0 x0Var2 = x0.f111346a;
                                String strQ = gl1.y.Q(mVar2, R.string.lbl_daily_avg_climbed);
                                cVar3.getClass();
                                b92.a aVarC = xh0.c.c("merge", str5);
                                int i24 = b92.a.f16960b;
                                int i25 = (iIntValue3 & 14) | (x0.f111348c << 24);
                                x0Var2.a(i25, 60, aVarC, t2Var, null, null, str4, strQ, null, null, mVar2);
                                x0Var2.a(i25, 124, null, t2Var, null, null, str3, gl1.y.Q(mVar2, R.string.lbl_total_floors_climbed), null, null, mVar2);
                            } else {
                                mVar2.e();
                            }
                            break;
                        default:
                            t2 t2Var2 = (t2) obj;
                            m mVar3 = (m) obj2;
                            int iIntValue4 = ((Integer) obj3).intValue();
                            t2Var2.getClass();
                            if ((iIntValue4 & 6) == 0) {
                                iIntValue4 |= mVar3.B(t2Var2) ? 4 : 2;
                            }
                            if (mVar3.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                x1 x1Var4 = n.f135158a;
                                int i26 = iIntValue4;
                                x0 x0Var3 = x0.f111346a;
                                String strQ2 = gl1.y.Q(mVar3, R.string.lbl_daily_avg_descended);
                                cVar3.getClass();
                                b92.a aVarC2 = xh0.c.c("merge", str5);
                                int i27 = i26 & 14;
                                int i28 = b92.a.f16960b;
                                int i29 = i27 | (x0.f111348c << 24);
                                x0Var3.a(i29, 60, aVarC2, t2Var2, null, null, str4, strQ2, null, null, mVar3);
                                x0Var3.a(i29, 124, null, t2Var2, null, null, str3, gl1.y.Q(mVar3, R.string.lbl_total_floors_descended), null, null, mVar3);
                            } else {
                                mVar3.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE);
            int i19 = (x0.f111348c << 6) | 48;
            x0Var.e(rVarC2, eVarC, o0VarE, i19, 0);
            bVar4.getClass();
            final int i24 = 1;
            cVar2 = cVar;
            x0Var.e(c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7), z3.f.c(1831687622, new q() { // from class: di0.a
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i110 = i24;
                    String str5 = strA4;
                    xh0.c cVar3 = cVar2;
                    switch (i110) {
                        case 0:
                            t2 t2Var = (t2) obj;
                            m mVar2 = (m) obj2;
                            int iIntValue3 = ((Integer) obj3).intValue();
                            t2Var.getClass();
                            if ((iIntValue3 & 6) == 0) {
                                iIntValue3 |= mVar2.B(t2Var) ? 4 : 2;
                            }
                            if (mVar2.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                x1 x1Var3 = n.f135158a;
                                x0 x0Var2 = x0.f111346a;
                                String strQ = gl1.y.Q(mVar2, R.string.lbl_daily_avg_climbed);
                                cVar3.getClass();
                                b92.a aVarC = xh0.c.c("merge", str5);
                                int i25 = b92.a.f16960b;
                                int i26 = (iIntValue3 & 14) | (x0.f111348c << 24);
                                x0Var2.a(i26, 60, aVarC, t2Var, null, null, str, strQ, null, null, mVar2);
                                x0Var2.a(i26, 124, null, t2Var, null, null, str2, gl1.y.Q(mVar2, R.string.lbl_total_floors_climbed), null, null, mVar2);
                            } else {
                                mVar2.e();
                            }
                            break;
                        default:
                            t2 t2Var2 = (t2) obj;
                            m mVar3 = (m) obj2;
                            int iIntValue4 = ((Integer) obj3).intValue();
                            t2Var2.getClass();
                            if ((iIntValue4 & 6) == 0) {
                                iIntValue4 |= mVar3.B(t2Var2) ? 4 : 2;
                            }
                            if (mVar3.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                x1 x1Var4 = n.f135158a;
                                int i27 = iIntValue4;
                                x0 x0Var3 = x0.f111346a;
                                String strQ2 = gl1.y.Q(mVar3, R.string.lbl_daily_avg_descended);
                                cVar3.getClass();
                                b92.a aVarC2 = xh0.c.c("merge", str5);
                                int i28 = i27 & 14;
                                int i29 = b92.a.f16960b;
                                int i210 = i28 | (x0.f111348c << 24);
                                x0Var3.a(i210, 60, aVarC2, t2Var2, null, null, str, strQ2, null, null, mVar3);
                                x0Var3.a(i210, 124, null, t2Var2, null, null, str2, gl1.y.Q(mVar3, R.string.lbl_total_floors_descended), null, null, mVar3);
                            } else {
                                mVar3.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, i19, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.r(aVar, cVar2, i14, 21);
        }
    }
}
