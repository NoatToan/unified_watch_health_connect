package yu1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.j;
import c2.l;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import fg0.k;
import h4.r;
import h5.e0;
import i3.e5;
import l72.x0;
import org.apache.commons.lang3.StringUtils;
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
import vu1.w;
import w52.k0;

/* JADX INFO: loaded from: classes10.dex */
public final class g {
    public static final void a(fy1.f fVar, String str, String str2, m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(560264490);
        int i15 = (o0VarE.B(fVar) ? 4 : 2) | i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(str2) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            String strG = e5.g(fVar.f73917b, StringUtils.SPACE, str);
            String strG2 = e5.g(fVar.f73920e, StringUtils.SPACE, str2);
            x0 x0Var = x0.f111346a;
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            float f15 = eVar.f97920e;
            bVar.getClass();
            o0Var = o0VarE;
            x0Var.e(l.C(aVar, f15, 0.0f, eVar.f97920e, f14, 2), z3.f.c(-529464463, new f(fVar, str, strG, str2, strG2, 2), o0VarE), o0Var, (x0.f111348c << 6) | 48, 0);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k0(fVar, str, str2, i14, 19);
        }
    }

    public static final void b(fy1.f fVar, String str, String str2, fy1.f fVar2, String str3, String str4, m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(1615555417);
        int i15 = (o0VarE.B(fVar) ? 4 : 2) | i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(str2) ? 256 : 128;
        }
        int i16 = i15 | (o0VarE.B(fVar2) ? 2048 : 1024);
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.B(str3) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i16 |= o0VarE.B(str4) ? 131072 : 65536;
        }
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            x1 x1Var = n.f135158a;
            String strG = e5.g(fVar.f73917b, StringUtils.SPACE, str);
            String strG2 = e5.g(fVar2.f73917b, StringUtils.SPACE, str3);
            String strG3 = e5.g(fVar.f73920e, StringUtils.SPACE, str2);
            String strG4 = e5.g(fVar2.f73920e, StringUtils.SPACE, str4);
            x0 x0Var = x0.f111346a;
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            float f15 = eVar.f97920e;
            bVar.getClass();
            r rVarC = l.C(aVar, f15, 0.0f, eVar.f97920e, f14, 2);
            z3.e eVarC = z3.f.c(-667325646, new f(fVar2, str3, strG2, str4, strG4, 0), o0VarE);
            int i17 = (x0.f111348c << 6) | 48;
            o0Var = o0VarE;
            x0Var.e(rVarC, eVarC, o0Var, i17, 0);
            bVar.getClass();
            x0Var.e(l.y(aVar, eVar.f97920e), z3.f.c(819850537, new f(fVar, str, strG, str2, strG3, 1), o0Var), o0Var, i17, 0);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q32.b(fVar, str, str2, fVar2, str3, str4, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ec  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r8v13, types: [l72.x0] */
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
    public static final void c(jv1.n nVar, w wVar, m mVar, int i14) {
        ?? r14;
        boolean z14;
        e23.a aVar;
        ?? r15;
        boolean z15;
        ?? r16;
        boolean z16;
        boolean z17;
        fg0.d completionTarget;
        boolean z18;
        fg0.d completionTarget2;
        boolean z19;
        String strJ;
        gg0.f eventType;
        String strJ2;
        ?? r17;
        nVar.getClass();
        Double d14 = nVar.f101099u;
        Double d15 = nVar.f101098t;
        boolean z24 = nVar.f101094p;
        k kVar = nVar.f101088j;
        ?? E = mVar.E(107011434);
        int i15 = (E.r(nVar) ? 4 : 2) | i14 | (E.B(wVar) ? 32 : 16);
        if (E.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) E.A(AndroidCompositionLocals_androidKt.f6042b);
            r.a aVar2 = r.S;
            r rVarF = x2.f(aVar2, 1.0f);
            j.f22691a.getClass();
            j.k kVar2 = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar2, h4.d.a.f81536n, E, 0);
            int iHashCode = Long.hashCode(E.U);
            i2 i2VarA0 = E.a0();
            r rVarC = h4.k.c(rVarF, E);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            Unit unit = null;
            if (E.f135177b == null) {
                p0.l();
                throw null;
            }
            E.z();
            if (E.T) {
                E.M(aVar3);
            } else {
                E.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, E);
            b4.c(h5.g.a.f81809f, i2VarA0, E);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (E.T || !s.g(E.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, E, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, E);
            b0 b0Var = b0.f22601a;
            if (z24) {
                E.C(1934588318);
                r15 = 0;
                E.g0(false);
                aVar = null;
            } else {
                E.C(1934632059);
                boolean zR = E.r(nVar) | ((i15 & 112) == 32);
                Object objQ = E.q();
                if (zR) {
                    z14 = false;
                    objQ = new d(nVar, wVar, 0);
                    E.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        z14 = false;
                        objQ = new d(nVar, wVar, 0);
                        E.K(objQ);
                    } else {
                        z14 = false;
                    }
                }
                aVar = (e23.a) objQ;
                E.g0(z14);
                r15 = z14;
            }
            c.a(aVar, E, r15);
            if (kVar != null) {
                E.C(1935086302);
                fy1.i.f73924a.getClass();
                r.a aVar4 = aVar2;
                fy1.f fVarN = fy1.i.a.n(context, kVar, r15);
                if (fVarN == null) {
                    E.C(1935146782);
                    E.g0(r15);
                    aVar4 = aVar4;
                    z15 = true;
                } else {
                    E.C(1935146783);
                    fg0.d completionTarget3 = kVar.getCompletionTarget();
                    String strJ3 = (completionTarget3 == null || !completionTarget3.o()) ? com.airbnb.lottie.animation.keyframe.a.j(E, 1871669641, R.string.lbl_goal_time, E, r15) : com.airbnb.lottie.animation.keyframe.a.j(E, 1871578377, R.string.goal_distance, E, r15);
                    gg0.f eventType2 = kVar.getEventType();
                    String strJ4 = (eventType2 == null || !eventType2.e()) ? com.airbnb.lottie.animation.keyframe.a.j(E, 1871968450, R.string.lbl_course_goal_pace, E, r15) : com.airbnb.lottie.animation.keyframe.a.j(E, 1871869281, R.string.lbl_course_goal_speed, E, r15);
                    if (!z24 || d15 == null || d14 == null) {
                        z16 = false;
                        z15 = true;
                        E.C(1874002670);
                        a(fVarN, strJ3, strJ4, E, 0);
                        E.g0(false);
                    } else {
                        E.C(1872333413);
                        double dDoubleValue = d15.doubleValue();
                        double dDoubleValue2 = d14.doubleValue();
                        gg0.f eventType3 = kVar.getEventType();
                        if (eventType3 != null) {
                            z17 = true;
                            boolean z25 = eventType3.e();
                            completionTarget = kVar.getCompletionTarget();
                            if (completionTarget == null && completionTarget.o() == z17) {
                                z18 = z17;
                            } else {
                                z18 = false;
                            }
                            fy1.f fVarM = fy1.i.a.m(context, dDoubleValue, dDoubleValue2, z25, z18, false);
                            completionTarget2 = kVar.getCompletionTarget();
                            if (completionTarget2 == null && completionTarget2.o() == z17) {
                                z19 = false;
                                strJ = com.airbnb.lottie.animation.keyframe.a.j(E, 1872975423, R.string.actual_distance, E, false);
                            } else {
                                z19 = false;
                                strJ = com.airbnb.lottie.animation.keyframe.a.j(E, 1873076483, R.string.actual_time, E, false);
                            }
                            String str = strJ;
                            eventType = kVar.getEventType();
                            if (eventType != null) {
                                z15 = true;
                                if (eventType.e()) {
                                    strJ2 = com.airbnb.lottie.animation.keyframe.a.j(E, 1873290910, R.string.lbl_actual_speed, E, z19);
                                }
                                boolean z26 = z19;
                                b(fVarN, strJ3, strJ4, fVarM, str, strJ2, E, 0);
                                E.g0(z26);
                                z16 = z26;
                            } else {
                                z15 = true;
                            }
                            strJ2 = com.airbnb.lottie.animation.keyframe.a.j(E, 1873393055, R.string.lbl_actual_pace, E, z19);
                            boolean z27 = z19;
                            b(fVarN, strJ3, strJ4, fVarM, str, strJ2, E, 0);
                            E.g0(z27);
                            z16 = z27;
                        } else {
                            z17 = true;
                        }
                        completionTarget = kVar.getCompletionTarget();
                        if (completionTarget == null) {
                            z18 = false;
                        } else {
                            z18 = false;
                        }
                        fy1.f fVarM2 = fy1.i.a.m(context, dDoubleValue, dDoubleValue2, z25, z18, false);
                        completionTarget2 = kVar.getCompletionTarget();
                        if (completionTarget2 == null) {
                            z19 = false;
                            strJ = com.airbnb.lottie.animation.keyframe.a.j(E, 1873076483, R.string.actual_time, E, false);
                        } else {
                            z19 = false;
                            strJ = com.airbnb.lottie.animation.keyframe.a.j(E, 1873076483, R.string.actual_time, E, false);
                        }
                        String str2 = strJ;
                        eventType = kVar.getEventType();
                        if (eventType != null) {
                            z15 = true;
                            if (eventType.e()) {
                                strJ2 = com.airbnb.lottie.animation.keyframe.a.j(E, 1873290910, R.string.lbl_actual_speed, E, z19);
                            }
                            boolean z28 = z19;
                            b(fVarN, strJ3, strJ4, fVarM2, str2, strJ2, E, 0);
                            E.g0(z28);
                            z16 = z28;
                        } else {
                            z15 = true;
                        }
                        strJ2 = com.airbnb.lottie.animation.keyframe.a.j(E, 1873393055, R.string.lbl_actual_pace, E, z19);
                        boolean z29 = z19;
                        b(fVarN, strJ3, strJ4, fVarM2, str2, strJ2, E, 0);
                        E.g0(z29);
                        z16 = z29;
                    }
                    E.g0(z16);
                    unit = Unit.INSTANCE;
                    r17 = z16;
                }
                if (unit == null) {
                    r17 = r15;
                    E.C(1937939511);
                    ?? r18 = x0.f111346a;
                    d92.b.f58623a.getClass();
                    j92.b bVar2 = d92.b.f58625c;
                    bVar2.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97920e;
                    bVar2.getClass();
                    float f15 = eVar.f97920e;
                    bVar2.getClass();
                    r rVarC2 = l.C(aVar4, f15, 0.0f, eVar.f97920e, f14, 2);
                    b.f199773a.getClass();
                    r18.e(rVarC2, b.f199774b, E, (x0.f111348c << 6) | 48, 0);
                    E.g0(r17);
                } else {
                    r17 = r15;
                    E.C(1447895460);
                    E.g0(r17);
                }
                E.g0(r17);
                r16 = r17;
            } else {
                z15 = true;
                E.C(1938513538);
                E.g0(r15);
                r16 = r15;
            }
            E.g0(z15);
            r14 = r16;
        } else {
            r14 = 0;
            E.e();
        }
        p2 p2VarI0 = E.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(nVar, wVar, i14, r14);
        }
    }
}
