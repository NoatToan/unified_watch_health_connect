package a42;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b82.y1;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.k1;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes10.dex */
public final class h {
    /* JADX WARN: Code duplicated, block: B:100:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:101:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:104:0x0305  */
    /* JADX WARN: Code duplicated, block: B:106:0x030c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0119  */
    /* JADX WARN: Code duplicated, block: B:87:0x023e  */
    /* JADX WARN: Code duplicated, block: B:97:0x02ee  */
    public static final void a(d42.b bVar, q71.e eVar, List list, e23.a aVar, e23.l lVar, ky0.w wVar, p3.m mVar, int i14) {
        o0 o0Var;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objQ;
        h4.r.a aVar2;
        boolean z17;
        q71.e eVar2;
        int i15;
        o0 o0VarO = androidx.room.a0.o(aVar, lVar, mVar, -294726902);
        int i16 = i14 | (o0VarO.B(bVar) ? 4 : 2) | (o0VarO.k(eVar == null ? -1 : eVar.ordinal()) ? 32 : 16) | (o0VarO.r(list) ? 256 : 128) | (o0VarO.r(aVar) ? 2048 : 1024) | (o0VarO.r(lVar) ? 16384 : 8192) | (o0VarO.r(wVar) ? 131072 : 65536);
        if (o0VarO.n(i16 & 1, (i16 & 74899) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarO.A(AndroidCompositionLocals_androidKt.f6042b);
            h4.r.a aVar3 = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar3 = j92.b.f97899b;
            h4.r rVarD = x2.d(c2.l.C(aVar3, 0.0f, eVar3.f97918c, 0.0f, 0.0f, 13), 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar4 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar4, o0VarO, 48);
            int iHashCode = Long.hashCode(o0VarO.U);
            i2 i2VarA0 = o0VarO.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarO);
            h5.g.V.getClass();
            h5.e0.a aVar5 = h5.g.a.f81805b;
            String strQ = null;
            if (o0VarO.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarO.z();
            if (o0VarO.T) {
                o0VarO.M(aVar5);
            } else {
                o0VarO.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarO);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarO);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarO.T || !p005kotlin.jvm.internal.s.g(o0VarO.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarO, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarO);
            c2.b0 b0Var = c2.b0.f22601a;
            p3.m.a aVar6 = p3.m.f135153a;
            if (bVar != null) {
                i53.d<q71.e, d42.a> dVar = bVar.f57477a;
                if (dVar.isEmpty()) {
                    o0Var = o0VarO;
                    o0Var.C(-1426139855);
                    bv.b.f21239a.getClass();
                    bv.b.a();
                    boolean zE = k1.f37122a.E();
                    if (list == null && !list.isEmpty() && zE) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean zR = o0Var.r(list);
                    if ((i16 & 458752) == 131072) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zR | z15;
                    objQ = o0Var.q();
                    if (z16) {
                        objQ = new a11.n(2, list, wVar);
                        o0Var.K(objQ);
                    } else {
                        aVar6.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new a11.n(2, list, wVar);
                            o0Var.K(objQ);
                        }
                    }
                    b(z14, (e23.a) objQ, o0Var, 0);
                    o0Var.g0(false);
                } else if (dVar.size() > 1) {
                    o0VarO.C(-1425580832);
                    y1 y1Var = y1.f16902a;
                    o0VarO.C(508205989);
                    Set<q71.e> setKeySet = dVar.keySet();
                    ArrayList arrayList = new ArrayList(p13.y.r(setKeySet, 10));
                    Iterator<T> it = setKeySet.iterator();
                    while (it.hasNext()) {
                        arrayList.add(gl1.y.Q(o0VarO, ((q71.e) it.next()).f143244a));
                    }
                    o0VarO.g0(false);
                    i53.c<String> cVarE = i53.a.e(arrayList);
                    Iterator<T> it3 = dVar.keySet().iterator();
                    int i17 = 0;
                    while (true) {
                        if (!it3.hasNext()) {
                            i15 = -1;
                            break;
                        }
                        Object next = it3.next();
                        if (i17 < 0) {
                            p13.x.q();
                            throw null;
                        }
                        if (((q71.e) next) == eVar) {
                            i15 = i17;
                            break;
                        }
                        i17++;
                    }
                    if (i15 < 0) {
                        i15 = 0;
                    }
                    z3.e eVarC = z3.f.c(1528507785, new a(bVar, 0, aVar, lVar), o0VarO);
                    y1 y1Var2 = y1.f16902a;
                    y1Var.c(cVarE, i15, false, true, true, 0L, 0L, eVarC, o0VarO, 12610560, 100);
                    o0Var = o0VarO;
                    o0Var.g0(false);
                } else {
                    o0Var = o0VarO;
                    o0Var.C(-1424320403);
                    q71.e eVar4 = (q71.e) p13.h0.c0(dVar.keySet());
                    if (eVar4 == null) {
                        o0Var.C(-1424210540);
                    } else {
                        o0Var.C(-1424210539);
                        strQ = gl1.y.Q(o0Var, eVar4.f143244a);
                    }
                    o0Var.g0(false);
                    String str = strQ;
                    if (str == null) {
                        o0Var.C(-1424117230);
                        o0Var.g0(false);
                        eVar2 = eVar4;
                        aVar2 = aVar3;
                    } else {
                        o0Var.C(-1424117229);
                        bVar2.getClass();
                        h4.r rVarC2 = c2.l.C(aVar3, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13);
                        aVar2 = aVar3;
                        bVar2.getClass();
                        h4.r rVarA = c2.l.A(rVarC2, eVar3.f97921f, 0.0f, 2);
                        boolean zB = o0Var.B(str) | o0Var.r(context);
                        Object objQ2 = o0Var.q();
                        if (zB) {
                            z17 = false;
                            objQ2 = new b(str, context, 0);
                            o0Var.K(objQ2);
                        } else {
                            aVar6.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                z17 = false;
                                objQ2 = new b(str, context, 0);
                                o0Var.K(objQ2);
                            } else {
                                z17 = false;
                            }
                        }
                        h4.r rVarC3 = p5.v.c((e23.l) objQ2, rVarA, z17);
                        d92.b.f58624b.getClass();
                        x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97932i), o0Var);
                        d6.h.f57752b.getClass();
                        eVar2 = eVar4;
                        mh.c(str, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, o0Var, 0, 0, 130044);
                        o0Var = o0Var;
                        Unit unit = Unit.INSTANCE;
                        o0Var.g0(false);
                    }
                    bVar2.getClass();
                    c(dVar.get(eVar2), c2.l.C(aVar2, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13), aVar, o0Var, (i16 >> 3) & 896);
                    o0Var.g0(false);
                }
            } else {
                o0Var = o0VarO;
                o0Var.C(-1426139855);
                bv.b.f21239a.getClass();
                bv.b.a();
                boolean zE2 = k1.f37122a.E();
                if (list == null) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                boolean zR2 = o0Var.r(list);
                if ((i16 & 458752) == 131072) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zR2 | z15;
                objQ = o0Var.q();
                if (z16) {
                    aVar6.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new a11.n(2, list, wVar);
                        o0Var.K(objQ);
                    }
                } else {
                    objQ = new a11.n(2, list, wVar);
                    o0Var.K(objQ);
                }
                b(z14, (e23.a) objQ, o0Var, 0);
                o0Var.g0(false);
            }
            o0Var.g0(true);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarO;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c((Object) bVar, (Object) eVar, (Object) list, (Object) aVar, (Object) lVar, (Object) wVar, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a1  */
    public static final void b(boolean z14, e23.a aVar, p3.m mVar, int i14) {
        String strJ;
        o0 o0VarE = mVar.E(1873562509);
        int i15 = (o0VarE.h(z14) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            h4.r.a aVar2 = h4.r.S;
            h4.d.f81522a.getClass();
            h4.r rVarX = x2.x(aVar2, h4.d.a.f81533k, 2);
            s62.a.f157643a.getClass();
            u4.d dVarA = u62.a.a(t62.a.f162797a);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_no_vo2_max_data);
            c22.x0.f23314a.getClass();
            String strW = gl1.d.W(c22.x0.f23675vb);
            if (z14) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 902289059, R.string.lbl_vo2max_estimate_home, o0VarE, false);
            } else {
                o0VarE.C(-2093752272);
                o0VarE.g0(false);
                strJ = null;
            }
            e23.a aVar3 = z14 ? aVar : null;
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_view_your_fitness_age);
            boolean zR = o0VarE.r(context);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new d(context, 0);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new d(context, 0);
                    o0VarE.K(objQ);
                }
            }
            b82.n.d(dVarA, strQ, strW, rVarX, strJ, aVar3, strQ2, (e23.a) objQ, o0VarE, 3072, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(i14, 0, aVar, z14);
        }
    }

    public static final void c(d42.a aVar, h4.r rVar, e23.a aVar2, p3.m mVar, int i14) {
        int i15;
        boolean z14;
        j92.e eVar;
        o0 o0VarE = mVar.E(1666071379);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(rVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar2) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(rVar, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar2 = j92.b.f97899b;
            h4.r rVarA = c2.l.A(rVarF, eVar2.f97921f, 0.0f, 2);
            h4.d.f81522a.getClass();
            h4.g.a aVar3 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar3, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
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
            String str = aVar != null ? aVar.f57476f : null;
            if (str == null) {
                o0VarE.C(-2109505436);
                o0VarE.g0(false);
                eVar = eVar2;
                z14 = true;
            } else {
                o0VarE.C(-2109505435);
                h4.r.a aVar5 = h4.r.S;
                bVar.getClass();
                h4.r rVarC2 = c2.l.C(aVar5, 0.0f, 0.0f, 0.0f, eVar2.f97918c, 7);
                d92.b.f58624b.getClass();
                x0 x0VarF = d92.c.f(j92.f.f97932i, o0VarE);
                d6.h.f57752b.getClass();
                String str2 = str;
                z14 = true;
                eVar = eVar2;
                mh.c(str2, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 130044);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            }
            z32.b.a(aVar, 0.0f, 0.0f, o0VarE, i15 & 14);
            h4.r.a aVar6 = h4.r.S;
            bVar.getClass();
            c2.l.f(x2.q(aVar6, eVar.f97922g), o0VarE);
            y32.a.a(null, aVar != null ? aVar.f57474d : null, aVar != null ? aVar.f57475e : null, aVar2, o0VarE, (i15 << 3) & 7168, 1);
            o0VarE.g0(z14);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(aVar, rVar, aVar2, i14, 0);
        }
    }
}
