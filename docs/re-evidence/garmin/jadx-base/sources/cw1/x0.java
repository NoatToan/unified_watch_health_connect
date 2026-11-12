package cw1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.messaging.Constants;
import g02.b2;
import i3.e5;
import org.apache.commons.lang3.StringUtils;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;
import u1.a2;

/* JADX INFO: loaded from: classes10.dex */
public final class x0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(h4.r rVar, hv1.i iVar, m52.i iVar2, e23.l lVar, p3.m mVar, int i14) {
        h4.r rVar2;
        String strJ;
        p3.p1 p1Var;
        p3.o0 o0Var;
        iVar2.getClass();
        p3.o0 o0VarE = mVar.E(-105903631);
        int i15 = i14 | 6 | (o0VarE.k(iVar == null ? -1 : iVar.ordinal()) ? 32 : 16) | (o0VarE.k(iVar2.ordinal()) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            h4.r.a aVar = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = p3.p0.n(iVar);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var2 = (p3.p1) objQ;
            h4.r rVarE = u1.n.e(x2.d(aVar, 1.0f), vb.h.f(d92.b.f58623a, o0VarE), o4.m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            d92.b.f58625c.getClass();
            p3.o0 o0Var2 = o0VarE;
            p3.p1 p1Var3 = p1Var2;
            b2.a(c2.l.C(aVar, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), false, 0, 0, gl1.y.Q(o0VarE, R.string.how_far_comfortable_swim_workouts), gl1.y.Q(o0VarE, R.string.swim_workouts_within_this_range), null, null, null, o0Var2, 0, 462);
            o0Var2.C(2061426908);
            w13.c cVar = hv1.i.f85871g;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                hv1.i iVar3 = (hv1.i) bVarN.next();
                if (iVar2 == m52.i.HALF_IRON && iVar3 == hv1.i.NOVICE) {
                    o0Var2.C(2004138514);
                    o0Var2.g0(false);
                    o0Var = o0Var2;
                } else {
                    o0Var2.C(2003288029);
                    boolean z14 = ((hv1.i) p1Var3.getF182175a()) == iVar3;
                    String strA = hv1.i.a(iVar3, context);
                    if (z14) {
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0Var2, -1459392347, R.string.selected, o0Var2, false);
                    } else {
                        o0Var2.C(2003565198);
                        o0Var2.g0(false);
                        strJ = "";
                    }
                    b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                    c0235a.f16962a.put(Constants.ScionAnalytics.PARAM_LABEL, e5.g(strA, StringUtils.SPACE, strJ));
                    b92.a aVarB = c0235a.b();
                    String strB = iVar3.b(context, false);
                    boolean zK = o0Var2.k(iVar3.ordinal()) | ((i15 & 7168) == 2048);
                    Object objQ2 = o0Var2.q();
                    if (zK || objQ2 == p3.m.a.f135155b) {
                        p1Var = p1Var3;
                        objQ2 = new g0(iVar3, lVar, p1Var, 1);
                        o0Var2.K(objQ2);
                    } else {
                        p1Var = p1Var3;
                    }
                    int i16 = b92.a.f16960b;
                    p1Var3 = p1Var;
                    o0Var = o0Var2;
                    r.a(null, strB, aVarB, z14, false, (e23.a) objQ2, o0Var, 0, 17);
                    o0Var.g0(false);
                }
                o0Var2 = o0Var;
            }
            o0VarE = o0Var2;
            o0VarE.g0(false);
            o0VarE.g0(true);
            x1 x1Var2 = p3.n.f135158a;
            rVar2 = aVar;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a51.l(i14, 29, lVar, rVar2, iVar, iVar2, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x015b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0162  */
    /* JADX WARN: Code duplicated, block: B:63:0x0166  */
    /* JADX WARN: Code duplicated, block: B:68:0x0181  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:79:0x020a  */
    /* JADX WARN: Code duplicated, block: B:80:0x020c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0213  */
    /* JADX WARN: Code duplicated, block: B:84:0x021f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0257  */
    /* JADX WARN: Code duplicated, block: B:88:0x0259  */
    /* JADX WARN: Code duplicated, block: B:91:0x0261  */
    /* JADX WARN: Code duplicated, block: B:95:0x026f  */
    /* JADX WARN: Code duplicated, block: B:99:0x02e6  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(h4.r rVar, hv1.i iVar, boolean z14, int i14, int i15, m52.i iVar2, e23.l lVar, p3.m mVar, int i16) {
        p3.o0 o0Var;
        h4.r rVar2;
        p3.p1 p1Var;
        h5.g.a.f fVar;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        p13.c.b bVarN;
        hv1.i iVar3;
        boolean z15;
        boolean z16;
        String strJ;
        boolean z17;
        boolean z18;
        Object eVar;
        p3.p1 p1Var2;
        p3.p1 p1Var3;
        iVar2.getClass();
        p3.o0 o0VarE = mVar.E(739010048);
        p3.c<?> cVar = o0VarE.f135177b;
        int i17 = i16 | 6 | (o0VarE.k(iVar == null ? -1 : iVar.ordinal()) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.k(i14) ? 2048 : 1024) | (o0VarE.k(i15) ? 16384 : 8192) | (o0VarE.k(iVar2.ordinal()) ? 131072 : 65536) | 1572864 | (o0VarE.r(lVar) ? 8388608 : 4194304);
        if (o0VarE.n(i17 & 1, (i17 & 4793491) != 4793490)) {
            h4.r.a aVar = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(iVar);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var4 = (p3.p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = hb.a.n(iVar != null, o0VarE);
            }
            p3.p1 p1Var5 = (p3.p1) objQ2;
            h4.r rVarE = u1.n.e(x2.d(aVar, 1.0f), vb.h.f(d92.b.f58623a, o0VarE), o4.m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81536n;
            c2.z zVarA2 = c2.y.a(kVar, aVar2, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA2, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                p1Var = p1Var4;
            } else {
                p1Var = p1Var4;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                h4.r rVarB = a2.b(c2.b0.f22601a.a(x2.f(aVar, 1.0f), 1.0f, true), a2.a(o0VarE), true);
                zVarA = c2.y.a(kVar, aVar2, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarB, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(fVar, rVarC, o0VarE);
                d92.b.f58625c.getClass();
                b2.a(c2.l.C(aVar, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), z14, i14, i15, gl1.y.Q(o0VarE, R.string.how_far_comfortable_swim_workouts), gl1.y.Q(o0VarE, R.string.swim_workouts_within_this_range), null, null, null, o0VarE, (i17 >> 3) & 8176, 448);
                o0Var = o0VarE;
                o0Var.C(-1400951149);
                w13.c cVar2 = hv1.i.f85871g;
                bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar2, cVar2);
                while (bVarN.hasNext()) {
                    iVar3 = (hv1.i) bVarN.next();
                    if (iVar2 == m52.i.HALF_IRON || iVar3 != hv1.i.NOVICE) {
                        o0Var.C(4588566);
                        if (((hv1.i) p1Var.getF182175a()) == iVar3) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        String strA = hv1.i.a(iVar3, context);
                        if (z15) {
                            z16 = false;
                            strJ = com.airbnb.lottie.animation.keyframe.a.j(o0Var, 1939816810, R.string.selected, o0Var, false);
                        } else {
                            z16 = false;
                            o0Var.C(4866665);
                            o0Var.g0(false);
                            strJ = "";
                        }
                        b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                        c0235a.f16962a.put(Constants.ScionAnalytics.PARAM_LABEL, e5.g(strA, StringUtils.SPACE, strJ));
                        b92.a aVarB = c0235a.b();
                        String strB = iVar3.b(context, z16);
                        boolean zK = o0Var.k(iVar3.ordinal());
                        if ((i17 & 29360128) == 8388608) {
                            z17 = true;
                        } else {
                            z17 = z16;
                        }
                        z18 = zK | z17;
                        Object objQ3 = o0Var.q();
                        if (!z18 || objQ3 == p3.m.a.f135155b) {
                            p1Var2 = p1Var5;
                            eVar = new af0.e((Object) iVar3, (Object) lVar, (Object) p1Var2, (Object) p1Var, 16);
                            o0Var.K(eVar);
                        } else {
                            eVar = objQ3;
                            p1Var2 = p1Var5;
                        }
                        e23.a aVar4 = (e23.a) eVar;
                        int i18 = b92.a.f16960b;
                        p1Var3 = p1Var2;
                        r.a(null, strB, aVarB, z15, false, aVar4, o0Var, 0, 17);
                        o0Var.g0(z16);
                    } else {
                        o0Var.C(5779245);
                        o0Var.g0(false);
                        context = context;
                        p1Var3 = p1Var5;
                    }
                    bVarN = bVarN;
                    p1Var = p1Var;
                    p1Var5 = p1Var3;
                    context = context;
                }
                o0Var.g0(false);
                o0Var.g0(true);
                o0Var.C(1032737481);
                b82.c.b(null, null, z3.f.c(2121830822, new h0(lVar, p1Var5, p1Var, 1), o0Var), null, 0L, o0Var, 384, 27);
                o0Var.g0(false);
                o0Var.g0(true);
                x1 x1Var2 = p3.n.f135158a;
                rVar2 = aVar;
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            h4.r rVarB2 = a2.b(c2.b0.f22601a.a(x2.f(aVar, 1.0f), 1.0f, true), a2.a(o0VarE), true);
            zVarA = c2.y.a(kVar, aVar2, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarB2, o0VarE);
            if (cVar != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(fVar, rVarC, o0VarE);
            d92.b.f58625c.getClass();
            b2.a(c2.l.C(aVar, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), z14, i14, i15, gl1.y.Q(o0VarE, R.string.how_far_comfortable_swim_workouts), gl1.y.Q(o0VarE, R.string.swim_workouts_within_this_range), null, null, null, o0VarE, (i17 >> 3) & 8176, 448);
            o0Var = o0VarE;
            o0Var.C(-1400951149);
            w13.c cVar3 = hv1.i.f85871g;
            bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar3, cVar3);
            while (bVarN.hasNext()) {
                iVar3 = (hv1.i) bVarN.next();
                if (iVar2 == m52.i.HALF_IRON) {
                    o0Var.C(4588566);
                    if (((hv1.i) p1Var.getF182175a()) == iVar3) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    String strA2 = hv1.i.a(iVar3, context);
                    if (z15) {
                        z16 = false;
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0Var, 1939816810, R.string.selected, o0Var, false);
                    } else {
                        z16 = false;
                        o0Var.C(4866665);
                        o0Var.g0(false);
                        strJ = "";
                    }
                    b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
                    c0235a2.f16962a.put(Constants.ScionAnalytics.PARAM_LABEL, e5.g(strA2, StringUtils.SPACE, strJ));
                    b92.a aVarB2 = c0235a2.b();
                    String strB2 = iVar3.b(context, z16);
                    boolean zK2 = o0Var.k(iVar3.ordinal());
                    if ((i17 & 29360128) == 8388608) {
                        z17 = true;
                    } else {
                        z17 = z16;
                    }
                    z18 = zK2 | z17;
                    Object objQ4 = o0Var.q();
                    if (z18) {
                        p1Var2 = p1Var5;
                        eVar = new af0.e((Object) iVar3, (Object) lVar, (Object) p1Var2, (Object) p1Var, 16);
                        o0Var.K(eVar);
                    } else {
                        p1Var2 = p1Var5;
                        eVar = new af0.e((Object) iVar3, (Object) lVar, (Object) p1Var2, (Object) p1Var, 16);
                        o0Var.K(eVar);
                    }
                    e23.a aVar5 = (e23.a) eVar;
                    int i19 = b92.a.f16960b;
                    p1Var3 = p1Var2;
                    r.a(null, strB2, aVarB2, z15, false, aVar5, o0Var, 0, 17);
                    o0Var.g0(z16);
                } else {
                    o0Var.C(4588566);
                    if (((hv1.i) p1Var.getF182175a()) == iVar3) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    String strA3 = hv1.i.a(iVar3, context);
                    if (z15) {
                        z16 = false;
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0Var, 1939816810, R.string.selected, o0Var, false);
                    } else {
                        z16 = false;
                        o0Var.C(4866665);
                        o0Var.g0(false);
                        strJ = "";
                    }
                    b92.a.C0235a c0235a3 = new b92.a.C0235a(null, 1, null);
                    c0235a3.f16962a.put(Constants.ScionAnalytics.PARAM_LABEL, e5.g(strA3, StringUtils.SPACE, strJ));
                    b92.a aVarB3 = c0235a3.b();
                    String strB3 = iVar3.b(context, z16);
                    boolean zK3 = o0Var.k(iVar3.ordinal());
                    if ((i17 & 29360128) == 8388608) {
                        z17 = true;
                    } else {
                        z17 = z16;
                    }
                    z18 = zK3 | z17;
                    Object objQ5 = o0Var.q();
                    if (z18) {
                        p1Var2 = p1Var5;
                        eVar = new af0.e((Object) iVar3, (Object) lVar, (Object) p1Var2, (Object) p1Var, 16);
                        o0Var.K(eVar);
                    } else {
                        p1Var2 = p1Var5;
                        eVar = new af0.e((Object) iVar3, (Object) lVar, (Object) p1Var2, (Object) p1Var, 16);
                        o0Var.K(eVar);
                    }
                    e23.a aVar6 = (e23.a) eVar;
                    int i110 = b92.a.f16960b;
                    p1Var3 = p1Var2;
                    r.a(null, strB3, aVarB3, z15, false, aVar6, o0Var, 0, 17);
                    o0Var.g0(z16);
                }
                bVarN = bVarN;
                p1Var = p1Var;
                p1Var5 = p1Var3;
                context = context;
            }
            o0Var.g0(false);
            o0Var.g0(true);
            o0Var.C(1032737481);
            b82.c.b(null, null, z3.f.c(2121830822, new h0(lVar, p1Var5, p1Var, 1), o0Var), null, 0L, o0Var, 384, 27);
            o0Var.g0(false);
            o0Var.g0(true);
            x1 x1Var3 = p3.n.f135158a;
            rVar2 = aVar;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a82.a(rVar2, iVar, z14, i14, i15, iVar2, lVar, i16);
        }
    }
}
