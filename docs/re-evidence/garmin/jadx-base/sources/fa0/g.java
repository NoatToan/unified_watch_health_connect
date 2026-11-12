package fa0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.v1;
import b21.n9;
import c.w;
import ca0.o1;
import ca0.u0;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import cw1.g0;
import e11.c0;
import e23.l;
import e23.p;
import ew1.c2;
import gl1.y;
import i3.fe;
import l72.c1;
import o53.b0;
import p005kotlin.Unit;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import q92.x;
import v62.b7;
import z10.n0;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f70118a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.CONSENT_PARENTAL_REQUEST_NEEDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.CONSENT_PARENTAL_ALREADY_REQUESTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f70118a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v54, types: [l72.c1] */
    /* JADX WARN: Type inference failed for: r13v0, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r13v1, types: [l72.c1] */
    /* JADX WARN: Type inference failed for: r13v3, types: [l72.c1] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v4, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r4v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r8v11, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r8v12, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v4, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r8v5, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r8v8, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r8v9, types: [p3.o0] */
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
    public static final void a(h hVar, o1 o1Var, g90.a aVar, x xVar, boolean z14, e23.a aVar2, p pVar, l lVar, u0 u0Var, e23.a aVar3, m mVar, int i14) {
        u0 u0Var2;
        final h hVar2;
        ?? r14;
        Object objF;
        Object fVar;
        p1 p1Var;
        c cVar;
        ?? r15;
        fe feVar;
        m.a.C2565a c2565a;
        int i15;
        int i16;
        final x xVar2;
        Object obj;
        ?? r16;
        ?? r17;
        ?? r18;
        ?? r19;
        final int i17;
        Object obj2;
        hVar.getClass();
        o1Var.getClass();
        aVar.getClass();
        xVar.getClass();
        aVar2.getClass();
        pVar.getClass();
        lVar.getClass();
        aVar3.getClass();
        ?? E = mVar.E(662616821);
        int i18 = i14 | (E.r(hVar) ? 4 : 2) | (E.k(o1Var.ordinal()) ? 32 : 16) | (E.r(aVar) ? 256 : 128) | (E.k(xVar.ordinal()) ? 2048 : 1024) | (E.h(z14) ? 16384 : 8192) | (E.r(aVar2) ? 131072 : 65536) | (E.r(pVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (E.r(lVar) ? 8388608 : 4194304) | (E.r(u0Var) ? 67108864 : 33554432) | (E.r(aVar3) ? 536870912 : 268435456);
        if (E.n(i18 & 1, (i18 & 306783379) != 306783378)) {
            x1 x1Var = n.f135158a;
            p1 p1VarC = s9.c.c(hVar.f70133o, E);
            String strQ = y.Q(E, R.string.msg_request_sent);
            Object objQ = E.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a2 = m.a.f135155b;
            if (objQ == c2565a2) {
                objF = objQ;
                objF = com.nimbusds.jose.shaded.gson.internal.a.f(E);
            }
            objF = objQ;
            fe feVar2 = (fe) objF;
            Object objQ2 = E.q();
            Object obj3 = objQ2;
            if (objQ2 == c2565a2) {
                b0 b0VarJ = l0.j(t13.h.f161748a, E);
                E.K(b0VarJ);
                obj3 = b0VarJ;
            }
            b0 b0Var = (b0) obj3;
            c cVar2 = (c) p1VarC.getF182175a();
            int i19 = i18 & 234881024;
            boolean zB = E.B(p1VarC) | ((i18 & 29360128) == 8388608) | ((i18 & 57344) == 16384) | (i19 == 67108864) | E.r(hVar) | E.r(b0Var) | E.B(strQ) | ((i18 & 112) == 32) | ((i18 & 458752) == 131072);
            Object objQ3 = E.q();
            if (zB || objQ3 == c2565a2) {
                p1Var = p1VarC;
                cVar = cVar2;
                r15 = 0;
                feVar = feVar2;
                fVar = new f(p1Var, lVar, z14, u0Var, hVar, b0Var, o1Var, aVar2, feVar, strQ, null);
                E.K(fVar);
            } else {
                fVar = objQ3;
                p1Var = p1VarC;
                cVar = cVar2;
                feVar = feVar2;
                r15 = 0;
            }
            l0.e((p) fVar, cVar, E);
            boolean z15 = ((c) p1Var.getF182175a()).f70094a;
            Object objQ4 = E.q();
            Object obj4 = objQ4;
            if (objQ4 == c2565a2) {
                ey0.a aVar4 = new ey0.a(28);
                E.K(aVar4);
                obj4 = aVar4;
            }
            w.a(48, r15, (e23.a) obj4, E, z15);
            b bVar = ((c) p1Var.getF182175a()).f70098e;
            if (bVar == null) {
                E.C(350160996);
                E.g0(r15);
                xVar2 = xVar;
                r18 = E;
                c2565a = c2565a2;
                r19 = r15;
                i15 = i18;
                i16 = 2048;
            } else {
                E.C(350160997);
                int i24 = a.f70118a[bVar.ordinal()];
                if (i24 == 1) {
                    ?? r24 = E;
                    c2565a = c2565a2;
                    ?? r25 = r15;
                    r24.C(712660878);
                    ?? r110 = c1.f110940a;
                    String strQ2 = y.Q(r24, R.string.lbl_admin_consent_required);
                    String str = ((c) p1Var.getF182175a()).f70095b;
                    String strP = y.P(R.string.msg_admin_consent_required, new Object[]{str != null ? str : ""}, r24);
                    String strQ3 = y.Q(r24, R.string.lbl_request_access);
                    i15 = r26;
                    i16 = 2048;
                    boolean z16 = (r24.r(hVar2) ? 1 : 0) | ((i15 & 7168) == 2048 ? true : r25 == true ? 1 : 0) | (i19 == 67108864 ? true : r25 == true ? 1 : 0);
                    Object objQ5 = r24.q();
                    if (z16 || objQ5 == c2565a) {
                        xVar2 = xVar;
                        g0 g0Var = new g0(hVar, 26, xVar2, u0Var);
                        r24.K(g0Var);
                        obj = g0Var;
                    } else {
                        xVar2 = xVar;
                        obj = objQ5;
                    }
                    e23.a aVar5 = (e23.a) obj;
                    String strQ4 = y.Q(r24, R.string.common_cancel);
                    boolean zR = r24.r(hVar2);
                    Object objQ6 = r24.q();
                    Object obj5 = objQ6;
                    if (zR || objQ6 == c2565a) {
                        final int i25 = r25 == true ? 1 : 0;
                        e23.a aVar6 = new e23.a() { // from class: fa0.d
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i25) {
                                    case 0:
                                        hVar2.x4();
                                        break;
                                    default:
                                        hVar2.y4();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        r24.K(aVar6);
                        obj5 = aVar6;
                    }
                    r110.a(false, strQ2, strP, null, null, strQ3, false, false, aVar5, strQ4, (e23.a) obj5, r24, 0, 0, 217);
                    r24.g0(r25);
                    Unit unit = Unit.INSTANCE;
                    r17 = r25;
                    r16 = r24;
                } else {
                    if (i24 != 2) {
                        throw kg.f.h(E, -531203146, r15);
                    }
                    E.C(713450665);
                    ?? r26 = c1.f110940a;
                    String strQ5 = y.Q(E, R.string.lbl_access_recently_requested);
                    String str2 = ((c) p1Var.getF182175a()).f70095b;
                    String strP2 = y.P(R.string.msg_access_recently_requested, new Object[]{str2 != null ? str2 : ""}, E);
                    String strQ6 = y.Q(E, R.string.lbl_ok);
                    int i26 = (E.r(hVar2) ? 1 : 0) | (i19 == 67108864 ? 1 : r15);
                    Object objQ7 = E.q();
                    Object obj6 = objQ7;
                    if (i26 != 0 || objQ7 == c2565a2) {
                        c2 c2Var = new c2(14, hVar2, u0Var2);
                        E.K(c2Var);
                        obj6 = c2Var;
                    }
                    boolean z17 = r15 == true ? 1 : 0;
                    c2565a = c2565a2;
                    r26.a(false, strQ5, strP2, null, null, strQ6, false, false, (e23.a) obj6, null, null, E, 0, 0, 1753);
                    ?? r27 = E;
                    r27.g0(z17);
                    Unit unit2 = Unit.INSTANCE;
                    xVar2 = xVar;
                    i15 = r26;
                    i16 = 2048;
                    r17 = z17;
                    r16 = r27;
                }
                r16.g0(r17);
                r19 = r17;
                r18 = r16;
            }
            n0 n0Var = ((c) p1Var.getF182175a()).f70096c;
            if (n0Var == null) {
                r18.C(351644966);
                r18.g0(r19);
            } else {
                r18.C(351644967);
                ?? r111 = c1.f110940a;
                String str3 = n0Var.f201169a;
                String str4 = n0Var.f201170b;
                String str5 = n0Var.f201171c;
                boolean z18 = (r18.r(hVar2) ? 1 : 0) | ((i15 & 7168) == i16 ? true : r19 == true ? 1 : 0);
                Object objQ8 = r18.q();
                Object obj7 = objQ8;
                if (z18 != 0 || objQ8 == c2565a) {
                    final int i27 = r19 == true ? 1 : 0;
                    e23.a aVar7 = new e23.a() { // from class: fa0.e
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i27) {
                                case 0:
                                    h hVar3 = hVar2;
                                    hVar3.y4();
                                    x xVar3 = xVar2;
                                    xVar3.getClass();
                                    ge1.b.T(v1.a(hVar3), null, null, new j(hVar3, xVar3, null), 3);
                                    break;
                                default:
                                    h hVar4 = hVar2;
                                    hVar4.getClass();
                                    x xVar4 = xVar2;
                                    xVar4.getClass();
                                    ge1.b.T(v1.a(hVar4), hVar4.f70128j, null, new i(hVar4, xVar4, null), 2);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    r18.K(aVar7);
                    obj7 = aVar7;
                }
                e23.a aVar8 = (e23.a) obj7;
                String str6 = n0Var.f201172d;
                boolean zR2 = r18.r(hVar2);
                Object objQ9 = r18.q();
                Object obj8 = objQ9;
                if (zR2 || objQ9 == c2565a) {
                    final int i28 = 1;
                    e23.a aVar9 = new e23.a() { // from class: fa0.d
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i28) {
                                case 0:
                                    hVar2.x4();
                                    break;
                                default:
                                    hVar2.y4();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    r18.K(aVar9);
                    obj8 = aVar9;
                }
                r111.a(false, str3, str4, null, null, str5, false, false, aVar8, str6, (e23.a) obj8, r18, 0, 0, 217);
                Unit unit3 = Unit.INSTANCE;
                r18.g0(r19);
            }
            Context context = (Context) r18.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean z19 = ((c) p1Var.getF182175a()).f70094a;
            boolean zR3 = r18.r(hVar2);
            int i29 = i15 & 7168;
            boolean z24 = (zR3 ? 1 : 0) | (i29 == 2048 ? true : r19 == true ? 1 : 0);
            Object objQ10 = r18.q();
            if (z24 != 0 || objQ10 == c2565a) {
                i17 = 1;
                e23.a aVar10 = new e23.a() { // from class: fa0.e
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i17) {
                            case 0:
                                h hVar3 = hVar2;
                                hVar3.y4();
                                x xVar3 = xVar2;
                                xVar3.getClass();
                                ge1.b.T(v1.a(hVar3), null, null, new j(hVar3, xVar3, null), 3);
                                break;
                            default:
                                h hVar4 = hVar2;
                                hVar4.getClass();
                                x xVar4 = xVar2;
                                xVar4.getClass();
                                ge1.b.T(v1.a(hVar4), hVar4.f70128j, null, new i(hVar4, xVar4, null), 2);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                r18.K(aVar10);
                obj2 = aVar10;
            } else {
                i17 = 1;
                obj2 = objQ10;
            }
            e23.a aVar11 = (e23.a) obj2;
            int i30 = (r18.r(hVar2) ? 1 : 0) | (r18.r(context) ? 1 : 0);
            ?? r28 = r19;
            if (i29 == 2048) {
                r28 = i17;
            }
            ?? r29 = i30 | r28;
            Object objQ11 = r18.q();
            Object obj9 = objQ11;
            if (r29 != 0 || objQ11 == c2565a) {
                g0 g0Var2 = new g0(hVar2, 27, context, xVar2);
                r18.K(g0Var2);
                obj9 = g0Var2;
            }
            int i34 = i15 >> 9;
            b(aVar, z19, feVar, pVar, aVar11, (e23.a) obj9, aVar3, r18, ((i15 >> 6) & 14) | 384 | (i34 & 7168) | (i34 & 3670016));
            r14 = r18;
        } else {
            u0Var2 = u0Var;
            hVar2 = hVar;
            ?? r34 = E;
            r34.e();
            r14 = r34;
        }
        p2 p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ci0.g(hVar2, o1Var, aVar, xVar, z14, aVar2, pVar, lVar, u0Var2, aVar3, i14);
        }
    }

    public static final void b(g90.a aVar, boolean z14, fe feVar, p<? super String, ? super String, Unit> pVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.a<Unit> aVar4, m mVar, int i14) {
        int i15;
        boolean z15;
        fe feVar2;
        e23.a<Unit> aVar5;
        e23.a<Unit> aVar6;
        o0 o0Var;
        o0 o0VarE = mVar.E(-666392172);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            z15 = z14;
            i15 |= o0VarE.h(z15) ? 32 : 16;
        } else {
            z15 = z14;
        }
        if ((i14 & 384) == 0) {
            feVar2 = feVar;
            i15 |= o0VarE.B(feVar2) ? 256 : 128;
        } else {
            feVar2 = feVar;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(pVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            aVar5 = aVar3;
            i15 |= o0VarE.r(aVar5) ? 131072 : 65536;
        } else {
            aVar5 = aVar3;
        }
        if ((1572864 & i14) == 0) {
            aVar6 = aVar4;
            i15 |= o0VarE.r(aVar6) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            aVar6 = aVar4;
        }
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = n.f135158a;
            String str = aVar.f76459a;
            s62.a.f157643a.getClass();
            o0Var = o0VarE;
            da0.p.b("consent_screen", str, b7.a(t62.b.f162798a), null, null, aVar.f76460b, aVar2, false, aVar.f76461c, aVar5, false, null, null, false, z15, aVar6, null, null, feVar2, null, null, z3.f.c(-2125831020, new c0(12, aVar, pVar), o0VarE), o0Var, ((i15 << 6) & 3670016) | 6 | ((i15 << 12) & 1879048192), ((i15 << 9) & 57344) | ((i15 >> 3) & 458752) | ((i15 << 21) & 1879048192), 384, 3619992);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n9(aVar, z14, feVar, pVar, aVar2, aVar3, aVar4, i14);
        }
    }
}
