package iv0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.room.a0;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import h5.e0;
import i3.mc;
import java.util.List;
import l72.p2;
import o53.b0;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class r {
    /* JADX WARN: Code duplicated, block: B:125:0x0211  */
    public static final void a(final mc mcVar, final b0 b0Var, final pu0.b bVar, final boolean z14, final boolean z15, final boolean z16, final hl.a aVar, final e23.a aVar2, final e23.a aVar3, final e23.a aVar4, final e23.a aVar5, final e23.a aVar6, final e23.l lVar, p3.m mVar, final int i14) {
        int i15;
        pu0.b bVar2;
        boolean z17;
        boolean z18;
        o0 o0Var;
        boolean z19;
        b0Var.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        aVar5.getClass();
        o0 o0VarO = a0.o(aVar6, lVar, mVar, -1141847849);
        if ((i14 & 6) == 0) {
            i15 = (o0VarO.B(mcVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarO.r(b0Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            bVar2 = bVar;
            i15 |= o0VarO.r(bVar2) ? 256 : 128;
        } else {
            bVar2 = bVar;
        }
        if ((i14 & 3072) == 0) {
            z17 = z14;
            i15 |= o0VarO.h(z17) ? 2048 : 1024;
        } else {
            z17 = z14;
        }
        if ((i14 & 24576) == 0) {
            z18 = z15;
            i15 |= o0VarO.h(z18) ? 16384 : 8192;
        } else {
            z18 = z15;
        }
        if ((i14 & 196608) == 0) {
            i15 |= o0VarO.h(z16) ? 131072 : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i15 |= (i14 & 2097152) == 0 ? o0VarO.B(aVar) : o0VarO.r(aVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i15 |= o0VarO.r(aVar2) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i15 |= o0VarO.r(aVar3) ? 67108864 : 33554432;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i15 |= o0VarO.r(aVar4) ? 536870912 : 268435456;
        }
        int i16 = i15;
        if (o0VarO.n(i16 & 1, ((i16 & 306783379) == 306783378 && (((384 | (o0VarO.r(aVar5) ? (char) 4 : (char) 2)) | (o0VarO.r(aVar6) ? 32 : 16)) & 147) == 146) ? false : true)) {
            o0VarO.G0();
            if ((i14 & 1) != 0 && !o0VarO.o0()) {
                o0VarO.e();
            }
            o0VarO.h0();
            x1 x1Var = p3.n.f135158a;
            final Context context = (Context) o0VarO.A(AndroidCompositionLocals_androidKt.f6042b);
            final String strQ = gl1.y.Q(o0VarO, R.string.previously_declined_contact_alert_title);
            final String strQ2 = gl1.y.Q(o0VarO, R.string.msg_livetrack_recipient_declined_messages);
            final com.garmin.android.library.livetrack.b bVar3 = (com.garmin.android.library.livetrack.b) KoinJavaComponent.get$default(com.garmin.android.library.livetrack.b.class, null, null, 6, null);
            l72.w wVar = l72.w.f111301a;
            o0VarO.C(-2099093589);
            String strB = og.a.B(bVar2);
            if (!(strB.length() == 0)) {
                z19 = false;
            } else if (g22.n.d(og.a.I(bVar2))) {
                o0VarO.C(-720500415);
                strB = gl1.y.P(R.string.string_space_string_pattern, new Object[]{gl1.y.Q(o0VarO, R.string.lbl_garmin_messenger_app_name), jg.b.v(context, og.a.I(bVar2))}, o0VarO);
                z19 = false;
                o0VarO.g0(false);
            } else {
                o0VarO.C(-720218377);
                strB = gl1.y.P(R.string.string_space_string_pattern, new Object[]{gl1.y.Q(o0VarO, R.string.lbl_text_message), jg.b.v(context, og.a.K(bVar2))}, o0VarO);
                z19 = false;
                o0VarO.g0(false);
            }
            String str = strB;
            o0VarO.g0(z19);
            boolean zR = o0VarO.r(b0Var) | ((i16 & 29360128) == 8388608) | ((i16 & 14) == 4);
            Object objQ = o0VarO.q();
            if (zR) {
                objQ = new eu.b(b0Var, aVar2, mcVar, 3);
                o0VarO.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new eu.b(b0Var, aVar2, mcVar, 3);
                    o0VarO.K(objQ);
                }
            }
            e23.a aVar7 = (e23.a) objQ;
            final boolean z24 = z18;
            final pu0.b bVar4 = bVar2;
            final boolean z25 = z17;
            e23.q qVar = new e23.q() { // from class: iv0.i
                /* JADX WARN: Code duplicated, block: B:25:0x00d0  */
                /* JADX WARN: Code duplicated, block: B:32:0x014a  */
                /* JADX WARN: Code duplicated, block: B:52:0x025c  */
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
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i17;
                    e23.l lVar2;
                    Context context2;
                    Context context3;
                    e23.l lVar3;
                    p3.m mVar2 = (p3.m) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((c2.a0) obj).getClass();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                        x1 x1Var2 = p3.n.f135158a;
                        h4.r rVarS = c2.l.s(h4.r.S);
                        c2.j.f22691a.getClass();
                        c2.j.k kVar = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                        int iHashCode = Long.hashCode(mVar2.getU());
                        i2 i2VarX = mVar2.x();
                        h4.r rVarC = h4.k.c(rVarS, mVar2);
                        h5.g.V.getClass();
                        e0.a aVar8 = h5.g.a.f81805b;
                        if (mVar2.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar8);
                        } else {
                            mVar2.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA, mVar2);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                        h5.g.a.b bVar5 = h5.g.a.f81813j;
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar2, iHashCode, bVar5);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, mVar2);
                        c2.b0 b0Var2 = c2.b0.f22601a;
                        p2 p2Var = p2.f111205a;
                        String strQ3 = gl1.y.Q(mVar2, R.string.lbl_view_contact);
                        final b0 b0Var3 = b0Var;
                        boolean zR2 = mVar2.r(b0Var3);
                        final e23.a aVar9 = aVar2;
                        boolean zB = zR2 | mVar2.B(aVar9);
                        final e23.a aVar10 = aVar3;
                        boolean zB2 = zB | mVar2.B(aVar10);
                        final mc mcVar2 = mcVar;
                        boolean zB3 = zB2 | mVar2.B(mcVar2);
                        Object objQ2 = mVar2.q();
                        p3.m.a aVar11 = p3.m.f135153a;
                        if (zB3) {
                            final int i18 = 0;
                            objQ2 = new e23.a() { // from class: iv0.k
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i18) {
                                        case 0:
                                            ge1.b.T(b0Var3, null, null, new m(aVar9, aVar10, mcVar2, null), 3);
                                            break;
                                        default:
                                            ge1.b.T(b0Var3, null, null, new p(aVar9, aVar10, mcVar2, null), 3);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ2);
                        } else {
                            aVar11.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                final int i19 = 0;
                                objQ2 = new e23.a() { // from class: iv0.k
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i19) {
                                            case 0:
                                                ge1.b.T(b0Var3, null, null, new m(aVar9, aVar10, mcVar2, null), 3);
                                                break;
                                            default:
                                                ge1.b.T(b0Var3, null, null, new p(aVar9, aVar10, mcVar2, null), 3);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ2);
                            }
                        }
                        p2Var.g(strQ3, null, null, null, null, false, false, (e23.a) objQ2, mVar2, 0, 254);
                        boolean z26 = z25;
                        e23.l lVar4 = lVar;
                        Context context4 = context;
                        if (z26) {
                            mVar2.C(-1863322675);
                            String strQ4 = gl1.y.Q(mVar2, R.string.livetrack_resend_request);
                            boolean z27 = z16;
                            boolean zH = mVar2.h(z27) | mVar2.r(b0Var3) | mVar2.B(aVar9) | mVar2.B(mcVar2) | mVar2.B(lVar4);
                            String str2 = strQ;
                            boolean zB4 = zH | mVar2.B(str2);
                            String str3 = strQ2;
                            boolean zB5 = zB4 | mVar2.B(str3) | mVar2.r(context4);
                            e23.a aVar12 = aVar5;
                            boolean zB6 = zB5 | mVar2.B(aVar12);
                            com.garmin.android.library.livetrack.b bVar6 = bVar3;
                            boolean zR3 = zB6 | mVar2.r(bVar6);
                            Object objQ3 = mVar2.q();
                            if (zR3) {
                                context3 = context4;
                                et1.f fVar = new et1.f(z27, b0Var3, lVar4, str2, str3, context3, aVar9, mcVar2, aVar12, bVar6);
                                lVar3 = lVar4;
                                mcVar2 = mcVar2;
                                mVar2.K(fVar);
                                objQ3 = fVar;
                            } else {
                                aVar11.getClass();
                                if (objQ3 == p3.m.a.f135155b) {
                                    context3 = context4;
                                    et1.f fVar2 = new et1.f(z27, b0Var3, lVar4, str2, str3, context3, aVar9, mcVar2, aVar12, bVar6);
                                    lVar3 = lVar4;
                                    mcVar2 = mcVar2;
                                    mVar2.K(fVar2);
                                    objQ3 = fVar2;
                                } else {
                                    lVar3 = lVar4;
                                    context3 = context4;
                                }
                            }
                            lVar2 = lVar3;
                            context2 = context3;
                            i17 = 0;
                            p2Var.g(strQ4, null, null, null, null, false, false, (e23.a) objQ3, mVar2, 0, 254);
                            mVar2.f();
                        } else {
                            i17 = 0;
                            lVar2 = lVar4;
                            context2 = context4;
                            mVar2.C(-1862137762);
                            mVar2.f();
                        }
                        if (z24) {
                            mVar2.C(-1862075266);
                            List listW = d53.w.W(gl1.y.Q(mVar2, R.string.lbl_change_method), new String[]{StringUtils.SPACE});
                            Object objQ4 = mVar2.q();
                            aVar11.getClass();
                            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                            if (objQ4 == c2565a) {
                                objQ4 = new ig2.d(28);
                                mVar2.K(objQ4);
                            }
                            String strK0 = h0.k0(listW, StringUtils.SPACE, null, null, (e23.l) objQ4, 30);
                            boolean zR4 = mVar2.r(b0Var3) | mVar2.B(aVar9);
                            final e23.a aVar13 = aVar6;
                            boolean zB7 = zR4 | mVar2.B(aVar13) | mVar2.B(mcVar2);
                            Object objQ5 = mVar2.q();
                            if (zB7 || objQ5 == c2565a) {
                                final int i24 = 1;
                                final mc mcVar3 = mcVar2;
                                e23.a aVar14 = new e23.a() { // from class: iv0.k
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i24) {
                                            case 0:
                                                ge1.b.T(b0Var3, null, null, new m(aVar9, aVar13, mcVar3, null), 3);
                                                break;
                                            default:
                                                ge1.b.T(b0Var3, null, null, new p(aVar9, aVar13, mcVar3, null), 3);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(aVar14);
                                objQ5 = aVar14;
                            }
                            p2Var.g(strK0, null, null, null, null, false, false, (e23.a) objQ5, mVar2, i17, 254);
                            mVar2.f();
                        } else {
                            mVar2.C(-1861613986);
                            mVar2.f();
                        }
                        String strQ5 = gl1.y.Q(mVar2, R.string.remove_lt_recipient);
                        boolean zR5 = mVar2.r(b0Var3) | mVar2.B(aVar9) | mVar2.B(mcVar2);
                        hl.a aVar15 = aVar;
                        Context context5 = context2;
                        boolean zR6 = zR5 | mVar2.r(aVar15) | mVar2.r(context5);
                        pu0.b bVar7 = bVar4;
                        e23.l lVar5 = lVar2;
                        boolean zR7 = zR6 | mVar2.r(bVar7) | mVar2.B(lVar5);
                        e23.a aVar16 = aVar4;
                        boolean zB8 = zR7 | mVar2.B(aVar16);
                        Object objQ6 = mVar2.q();
                        if (zB8) {
                            av0.d dVar = new av0.d(b0Var3, aVar15, context5, bVar7, lVar5, aVar9, mcVar2, aVar16);
                            mVar2.K(dVar);
                            objQ6 = dVar;
                        } else {
                            aVar11.getClass();
                            if (objQ6 == p3.m.a.f135155b) {
                                av0.d dVar2 = new av0.d(b0Var3, aVar15, context5, bVar7, lVar5, aVar9, mcVar2, aVar16);
                                mVar2.K(dVar2);
                                objQ6 = dVar2;
                            }
                        }
                        p2Var.g(strQ5, null, null, null, null, false, false, (e23.a) objQ6, mVar2, i17, 254);
                        mVar2.y();
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            };
            o0Var = o0VarO;
            wVar.f(str, null, null, null, aVar7, mcVar, false, null, z3.f.c(-361585234, qVar, o0Var), o0Var, ((i16 << 15) & 458752) | C.ENCODING_PCM_32BIT, 462);
        } else {
            o0Var = o0VarO;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: iv0.j
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(i14 | 1);
                    r.a(mcVar, b0Var, bVar, z14, z15, z16, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, lVar, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
