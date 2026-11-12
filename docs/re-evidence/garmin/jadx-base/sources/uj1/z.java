package uj1;

import b82.t0;
import c2.x2;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.e5;
import i3.mh;
import java.util.List;
import java.util.Locale;
import kotlin.t1;
import l72.r1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;
import u1.a2;

/* JADX INFO: loaded from: classes10.dex */
public final class z {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(String str, e23.l<? super String, Unit> lVar, p3.m mVar, int i14) {
        String strJ;
        lVar.getClass();
        o0 o0VarE = mVar.E(-1484854793);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarA = s02.a.a(o0VarE);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                Boolean bool = (Boolean) p1VarA.getF182175a();
                bool.getClass();
                objQ = p0.n(bool);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            m4.q qVar = (m4.q) o0VarE.A(t1.f91491i);
            boolean z14 = (i15 & 14) == 4;
            Object objQ2 = o0VarE.q();
            if (z14 || objQ2 == c2565a) {
                objQ2 = p0.n(str);
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) objQ2;
            if (((Boolean) p1VarA.getF182175a()).booleanValue()) {
                p1Var.setValue(Boolean.TRUE);
            } else if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                p1Var.setValue(Boolean.FALSE);
                qVar.y(false);
                if (!str.equals((String) p1Var2.getF182175a())) {
                    lVar.invoke((String) p1Var2.getF182175a());
                }
            }
            if (((Boolean) p1VarA.getF182175a()).booleanValue() || ((String) p1Var2.getF182175a()).length() != 0) {
                o0VarE.C(-1440200793);
                o0VarE.g0(false);
                strJ = "";
            } else {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1016291697, R.string.activity_summary_activity_notes, o0VarE, false);
            }
            String str2 = strJ;
            t0 t0Var = t0.f16792a;
            String str3 = (String) p1Var2.getF182175a();
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarC = c2.l.C(aVar, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
            String upperCase = gl1.y.Q(o0VarE, R.string.activity_summary_activity_notes).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            x5.p.f188918b.getClass();
            int i16 = x5.p.f188926j;
            boolean zB = o0VarE.B(p1Var2);
            Object objQ3 = o0VarE.q();
            if (zB || objQ3 == c2565a) {
                objQ3 = new sk0.n(p1Var2, 23);
                o0VarE.K(objQ3);
            }
            t0Var.b(str3, rVarC, upperCase, str2, 0, i16, null, (e23.l) objQ3, o0VarE, 1597440, SyslogConstants.LOG_LOCAL4);
            bVar.getClass();
            float f14 = eVar.f97920e;
            bVar.getClass();
            h4.r rVarZ = c2.l.z(aVar, f14, eVar.f97917b);
            String strQ = gl1.y.Q(o0VarE, R.string.msg_assistance_provide_details);
            d92.b.f58624b.getClass();
            mh.c(strQ, rVarZ, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new aa2.b(str, lVar, i14, 5);
        }
    }

    public static final void b(yj1.j jVar, yj1.a aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, p3.m mVar, int i14) {
        int i15;
        String strJ;
        int i16;
        z3.e eVar;
        o0 o0VarE = mVar.E(95561876);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(jVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar3) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            boolean z14 = !jVar.f197554a && jVar.f197555b;
            String str = aVar.f197516a;
            if (str == null) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1640662066, R.string.contact_management_title_add_contacts, o0VarE, false);
            } else if (str.equals("")) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1640664511, R.string.lte_review_details, o0VarE, false);
            } else {
                o0VarE.C(1640667008);
                o0VarE.g0(false);
                strJ = aVar.f197516a;
            }
            b.f171489a.getClass();
            z3.e eVar2 = b.f171491c;
            if (z14) {
                o0VarE.C(-678642281);
                int i17 = (i15 >> 6) & 14;
                i16 = i15;
                eVar = eVar2;
                l72.p2.f111205a.h(gl1.y.Q(o0VarE, R.string.safety_features_my_information), gl1.y.Q(o0VarE, R.string.lte_add_details), null, null, null, false, false, null, z3.f.c(132394268, new y(eVar2, 0), o0VarE), null, aVar2, o0VarE, 100663296, i17, 764);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                i16 = i15;
                eVar = eVar2;
                o0VarE.C(-678363157);
                l72.p2.f111205a.g(gl1.y.Q(o0VarE, R.string.safety_features_my_information), null, null, null, null, false, false, aVar2, o0VarE, (i16 << 18) & 234881024, 254);
                o0VarE.g0(false);
            }
            o0 o0Var = o0VarE;
            l72.p2.f111205a.h(gl1.y.Q(o0VarE, R.string.incident_detection_assistance_contacts_lower), strJ, null, null, null, false, false, null, z3.f.c(-657776831, new u91.i(5, aVar, eVar), o0VarE), null, aVar3, o0Var, 100663296, (i16 >> 9) & 14, 764);
            h4.r.a aVar4 = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarY = c2.l.y(aVar4, j92.b.f97899b.f97920e);
            String strQ = gl1.y.Q(o0Var, R.string.msg_one_assistance_contact_required);
            d92.b.f58624b.getClass();
            mh.c(strQ, rVarY, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0Var), o0Var, 0, 0, 131068);
            o0VarE = o0Var;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ug0.c((Object) jVar, (Object) aVar, (Object) aVar2, (o13.h) aVar3, i14, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008c  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r13v2, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v5, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r16v1, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [int] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r5v4, types: [l72.p2] */
    /* JADX WARN: Type inference failed for: r6v6, types: [l72.p2] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v12 */
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
    public static final void c(List<yj1.c> list, final e23.l<? super Long, Unit> lVar, p3.m mVar, int i14) {
        ?? r14;
        ?? r15;
        int i15;
        int i16;
        ?? r16;
        final int i17;
        Object obj;
        int i18;
        Object obj2;
        o0 o0VarE = mVar.E(-1414514956);
        int i19 = (i14 & 6) == 0 ? (o0VarE.r(list) ? 4 : 2) | i14 : i14;
        int i24 = 32;
        if ((i14 & 48) == 0) {
            i19 |= o0VarE.r(lVar) ? 32 : 16;
        }
        final ?? r17 = 0;
        int i25 = 1;
        if (o0VarE.n(i19 & 1, (i19 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            ?? r18 = o0VarE;
            for (final yj1.c cVar : list) {
                boolean z14 = cVar.f197528c;
                p3.m.a aVar = p3.m.f135153a;
                if (z14) {
                    r18.C(2023015941);
                    ?? r19 = l72.p2.f111205a;
                    String str = cVar.f197527b;
                    String strQ = gl1.y.Q(r18, R.string.msg_safety_features_need_attention);
                    b.f171489a.getClass();
                    z3.e eVar = b.f171490b;
                    int i26 = ((i19 & 112) == i24 ? i25 : r17) | (r18.B(cVar) ? 1 : 0);
                    Object objQ = r18.q();
                    if (i26 == 0) {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            obj2 = objQ;
                            e23.a aVar2 = new e23.a() { // from class: uj1.w
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (r17) {
                                        case 0:
                                            lVar.invoke(Long.valueOf(cVar.f197526a));
                                            break;
                                        default:
                                            lVar.invoke(Long.valueOf(cVar.f197526a));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            r18.K(aVar2);
                            obj2 = aVar2;
                        }
                    } else {
                        obj2 = objQ;
                        e23.a aVar3 = new e23.a() { // from class: uj1.w
                            @Override // e23.a
                            public final Object invoke() {
                                switch (r17) {
                                    case 0:
                                        lVar.invoke(Long.valueOf(cVar.f197526a));
                                        break;
                                    default:
                                        lVar.invoke(Long.valueOf(cVar.f197526a));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        r18.K(aVar3);
                        obj2 = aVar3;
                    }
                    obj2 = objQ;
                    ?? r110 = r18;
                    i15 = i19;
                    i16 = i24;
                    r16 = r17 == true ? 1 : 0;
                    r19.h(str, strQ, null, null, null, false, false, null, eVar, null, (e23.a) obj2, r110, 100663296, 0, 764);
                    r18 = r110;
                    r18.g0(r16);
                    i18 = 1;
                } else {
                    i15 = i19;
                    i16 = i24;
                    r16 = r17;
                    r18.C(2023550536);
                    ?? r24 = l72.p2.f111205a;
                    String str2 = cVar.f197527b;
                    boolean z15 = ((i15 & 112) == i16 ? true : r16 == true ? 1 : 0) | (r18.B(cVar) ? 1 : 0);
                    Object objQ2 = r18.q();
                    if (z15 == 0) {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            i17 = 1;
                            e23.a aVar4 = new e23.a() { // from class: uj1.w
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i17) {
                                        case 0:
                                            lVar.invoke(Long.valueOf(cVar.f197526a));
                                            break;
                                        default:
                                            lVar.invoke(Long.valueOf(cVar.f197526a));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            r18.K(aVar4);
                            obj = aVar4;
                        } else {
                            i17 = 1;
                            obj = objQ2;
                        }
                    } else {
                        i17 = 1;
                        e23.a aVar5 = new e23.a() { // from class: uj1.w
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i17) {
                                    case 0:
                                        lVar.invoke(Long.valueOf(cVar.f197526a));
                                        break;
                                    default:
                                        lVar.invoke(Long.valueOf(cVar.f197526a));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        r18.K(aVar5);
                        obj = aVar5;
                    }
                    i18 = i17;
                    r24.g(str2, null, null, null, null, false, false, (e23.a) obj, r18, 0, 254);
                    r18.g0(r16);
                }
                i24 = i16;
                r17 = r16;
                i25 = i18;
                i19 = i15;
                r18 = r18;
            }
            r14 = r17;
            x1 x1Var2 = p3.n.f135158a;
            r15 = r18;
        } else {
            r14 = 0;
            o0VarE.e();
            r15 = o0VarE;
        }
        p2 p2VarI0 = r15.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new x(lVar, i14, r14, list);
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:80:0x02ca  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r14v1, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v4, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [boolean, int] */
    public static final void d(yj1.o oVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.a<Unit> aVar4, e23.a<Unit> aVar5, e23.l<? super Boolean, Unit> lVar, e23.l<? super String, Unit> lVar2, e23.l<? super Long, Unit> lVar3, p3.m mVar, int i14) {
        ?? r14;
        h4.r.a aVar6;
        e23.p pVar;
        ?? r15;
        ?? r16;
        Object obj;
        oVar.getClass();
        yj1.d dVar = oVar.f197575b;
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        aVar5.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        o0 o0VarE = mVar.E(-1294484329);
        int i15 = i14 | (o0VarE.B(oVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128) | (o0VarE.r(aVar3) ? 2048 : 1024) | (o0VarE.r(aVar4) ? 16384 : 8192) | (o0VarE.r(aVar5) ? 131072 : 65536) | (o0VarE.r(lVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(lVar2) ? 8388608 : 4194304) | (o0VarE.r(lVar3) ? 67108864 : 33554432);
        if (o0VarE.n(i15 & 1, (38347923 & i15) != 38347922)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar7 = h4.r.S;
            h4.r rVarB = a2.b(x2.d(aVar7, 1.0f), a2.a(o0VarE), true);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar8 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar8);
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
            boolean z14 = dVar instanceof yj1.d.b;
            if (z14) {
                o0VarE.C(614095883);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarY = c2.l.y(aVar7, j92.b.f97899b.f97920e);
                String strQ = gl1.y.Q(o0VarE, R.string.msg_device_safety_features);
                d92.b.f58624b.getClass();
                aVar6 = aVar7;
                r15 = 0;
                pVar = null;
                mh.c(strQ, rVarY, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 131068);
                r1.b(gl1.y.Q(o0VarE, R.string.device_settings_safety_features), null, o0VarE, 0, 2);
                e(((yj1.d.b) dVar).f197530a, aVar3, aVar4, aVar5, lVar, o0VarE, (i15 >> 6) & 65520);
                o0 o0Var = o0VarE;
                o0Var.g0(false);
                r16 = o0Var;
            } else {
                aVar6 = aVar7;
                pVar = null;
                r15 = 0;
                r15 = 0;
                if (dVar instanceof yj1.d.a) {
                    o0VarE.C(614883686);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarY2 = c2.l.y(aVar6, j92.b.f97899b.f97920e);
                    String strQ2 = gl1.y.Q(o0VarE, R.string.msg_multiple_devices_safety_features);
                    d92.b.f58624b.getClass();
                    mh.c(strQ2, rVarY2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 131068);
                    o0 o0Var2 = o0VarE;
                    r1.b(gl1.y.Q(o0Var2, R.string.lbl_safety_features_by_device), null, o0Var2, 0, 2);
                    c(((yj1.d.a) dVar).f197529a, lVar3, o0Var2, (i15 >> 21) & 112);
                    o0Var2.g0(false);
                    r16 = o0Var2;
                } else {
                    o0VarE.C(615411027);
                    o0VarE.g0(false);
                    r16 = o0VarE;
                }
            }
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            c2.l.f(x2.h(aVar6, eVar.f97920e), r16);
            r1.b(gl1.y.Q(r16, R.string.lbl_emergency_info_contacts), pVar, r16, r15, 2);
            b(oVar.f197576c, oVar.f197577d, aVar, aVar2, r16, (i15 << 3) & 8064);
            if (z14) {
                yj1.b bVar3 = ((yj1.d.b) dVar).f197530a;
                if (bVar3.f197524g) {
                    r16.C(615981148);
                    bVar2.getClass();
                    c2.l.f(x2.h(aVar6, eVar.f97918c), r16);
                    String str = bVar3.f197525h;
                    if (str == null) {
                        str = "";
                    }
                    ?? r17 = (i15 & 29360128) == 8388608 ? 1 : r15;
                    Object objQ = r16.q();
                    if (r17 == 0) {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            obj = objQ;
                            ta0.j jVar = new ta0.j(lVar2, 10);
                            r16.K(jVar);
                            obj = jVar;
                        }
                    } else {
                        obj = objQ;
                        ta0.j jVar2 = new ta0.j(lVar2, 10);
                        r16.K(jVar2);
                        obj = jVar2;
                    }
                    obj = objQ;
                    a(str, (e23.l) obj, r16, r15);
                    r16.g0(r15);
                } else {
                    r16.C(616220437);
                    r16.g0(r15);
                }
            } else {
                r16.C(616220437);
                r16.g0(r15);
            }
            r16.g0(true);
            r14 = r16;
        } else {
            o0VarE.e();
            r14 = o0VarE;
        }
        p2 p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c42.d(oVar, aVar, aVar2, aVar3, aVar4, aVar5, lVar, lVar2, lVar3, i14);
        }
    }

    public static final void e(yj1.b bVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.l<? super Boolean, Unit> lVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        o0 o0Var2;
        boolean z14;
        int i16;
        int i17;
        h4.r.a aVar4;
        l72.p2 p2Var;
        bVar.getClass();
        boolean z15 = bVar.f197524g;
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-1067041058);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(bVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar3) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(lVar) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9347) != 9346)) {
            x1 x1Var = p3.n.f135158a;
            if (bVar.f197523f) {
                o0VarE.C(-1166909036);
                l72.p2.f111205a.g(gl1.y.Q(o0VarE, R.string.incident_detection_assistance_plus), null, null, null, z3.f.c(991505412, new u91.i(6, bVar, lVar), o0VarE), false, false, null, o0VarE, 24576, 494);
                h4.r.a aVar5 = h4.r.S;
                d92.b.f58623a.getClass();
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar = j92.b.f97899b;
                float f14 = eVar.f97920e;
                bVar2.getClass();
                h4.r rVarZ = c2.l.z(aVar5, f14, eVar.f97917b);
                String strQ = gl1.y.Q(o0VarE, R.string.msg_assistance_plus_response);
                d92.b.f58624b.getClass();
                mh.c(strQ, rVarZ, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131068);
                o0Var2 = o0VarE;
                bVar2.getClass();
                z14 = false;
                e5.t(aVar5, eVar.f97920e, o0Var2, false);
            } else {
                o0Var2 = o0VarE;
                z14 = false;
                o0Var2.C(-1166155612);
                o0Var2.g0(false);
            }
            l72.p2 p2Var2 = l72.p2.f111205a;
            String strQ2 = gl1.y.Q(o0Var2, R.string.incident_detection_assistance);
            if (bVar.f197518a) {
                i16 = 1070765442;
                i17 = R.string.lbl_enabled;
            } else {
                i16 = 1070766787;
                i17 = R.string.lbl_disabled;
            }
            o0 o0Var3 = o0Var2;
            p2Var2.h(strQ2, com.airbnb.lottie.animation.keyframe.a.j(o0Var2, i16, i17, o0Var2, z14), null, null, null, false, false, null, null, null, null, o0Var3, 0, 0, 2044);
            h4.r.a aVar6 = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f15 = eVar2.f97920e;
            float f16 = eVar2.f97920e;
            float f17 = eVar2.f97917b;
            bVar3.getClass();
            h4.r rVarZ2 = c2.l.z(aVar6, f15, f17);
            String strJ = z15 != 0 ? com.airbnb.lottie.animation.keyframe.a.j(o0Var3, -1165712808, R.string.msg_request_assistance_plus, o0Var3, false) : com.airbnb.lottie.animation.keyframe.a.j(o0Var3, -1165631619, R.string.msg_request_assistance, o0Var3, false);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0Var = j92.f.f97933j;
            int i18 = i15;
            mh.c(strJ, rVarZ2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0Var3), o0Var3, 0, 0, 131068);
            o0 o0Var4 = o0Var3;
            if (bVar.f197521d) {
                o0Var4.C(-1165447448);
                bVar3.getClass();
                h4.r rVarC = c2.l.C(aVar6, 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13);
                String strQ3 = gl1.y.Q(o0Var4, R.string.lbl_emergency_calling);
                String str = bVar.f197522e;
                if (str == null) {
                    str = "";
                }
                aVar4 = aVar6;
                p2Var2.h(strQ3, str, null, rVarC, null, false, false, null, null, null, aVar3, o0Var4, 0, (i18 >> 9) & 14, 1012);
                p2Var = p2Var2;
                bVar3.getClass();
                bVar3.getClass();
                h4.r rVarZ3 = c2.l.z(aVar4, f16, f17);
                String strQ4 = gl1.y.Q(o0Var4, R.string.msg_emergency_calling);
                fVar.getClass();
                mh.c(strQ4, rVarZ3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0Var4), o0Var4, 0, 0, 131068);
                o0Var4 = o0Var4;
                o0Var4.g0(false);
            } else {
                aVar4 = aVar6;
                p2Var = p2Var2;
                o0Var4.C(-1164867004);
                o0Var4.g0(false);
            }
            if (bVar.f197519b) {
                o0Var4.C(-1164812475);
                bVar3.getClass();
                o0 o0Var5 = o0Var4;
                p2Var.g(gl1.y.Q(o0Var4, R.string.lbl_fall_detection), c2.l.C(aVar4, 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13), null, null, null, false, false, bVar.f197520c ? aVar2 : null, o0Var5, 0, 252);
                bVar3.getClass();
                bVar3.getClass();
                h4.r rVarZ4 = c2.l.z(aVar4, f16, f17);
                String strQ5 = gl1.y.Q(o0Var5, R.string.msg_fall_detection);
                fVar.getClass();
                mh.c(strQ5, rVarZ4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0Var5), o0Var5, 0, 0, 131068);
                o0Var = o0Var5;
                o0Var.g0(false);
            } else {
                o0Var4.C(-1164227877);
                bVar3.getClass();
                o0 o0Var6 = o0Var4;
                p2Var.g(gl1.y.Q(o0Var4, R.string.incident_detection_concept), c2.l.C(aVar4, 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13), null, null, null, false, false, null, o0Var6, 100663296, 252);
                bVar3.getClass();
                bVar3.getClass();
                h4.r rVarZ5 = c2.l.z(aVar4, f16, f17);
                String strJ2 = z15 ? com.airbnb.lottie.animation.keyframe.a.j(o0Var6, -1163656144, R.string.msg_incident_detection_plus, o0Var6, false) : com.airbnb.lottie.animation.keyframe.a.j(o0Var6, -1163567019, R.string.msg_incident_detection, o0Var6, false);
                fVar.getClass();
                mh.c(strJ2, rVarZ5, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0Var6), o0Var6, 0, 0, 131068);
                o0Var = o0Var6;
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ka0.e(bVar, aVar, aVar2, aVar3, lVar, i14);
        }
    }
}
