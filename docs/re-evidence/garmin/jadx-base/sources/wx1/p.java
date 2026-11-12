package wx1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e2.f0;
import e2.i0;
import e2.k0;
import gl1.y;
import h5.e0;
import i3.fe;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import t21.v0;
import w51.j0;
import wn1.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class p {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final int i14, int i15, fe feVar, dy1.p pVar, final i53.c cVar, boolean z14, final e23.l lVar, final e23.p pVar2, final e23.l lVar2, final e23.l lVar3, e23.a aVar, final e23.a aVar2, e23.a aVar3, e23.a aVar4, p3.m mVar, int i16) {
        int i17;
        int i18;
        dy1.p pVar3;
        feVar.getClass();
        pVar.getClass();
        cVar.getClass();
        lVar.getClass();
        pVar2.getClass();
        lVar2.getClass();
        lVar3.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        o0 o0VarE = mVar.E(-1791874574);
        if ((i16 & 6) == 0) {
            i17 = (o0VarE.k(i14) ? 4 : 2) | i16;
        } else {
            i17 = i16;
        }
        if ((i16 & 48) == 0) {
            i18 = i15;
            i17 |= o0VarE.k(i18) ? 32 : 16;
        } else {
            i18 = i15;
        }
        if ((i16 & 384) == 0) {
            i17 |= o0VarE.B(feVar) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            pVar3 = pVar;
            i17 |= o0VarE.r(pVar3) ? 2048 : 1024;
        } else {
            pVar3 = pVar;
        }
        if ((i16 & 24576) == 0) {
            i17 |= o0VarE.B(cVar) ? 16384 : 8192;
        }
        if ((i16 & 196608) == 0) {
            i17 |= o0VarE.h(z14) ? 131072 : 65536;
        }
        if ((i16 & 1572864) == 0) {
            i17 |= o0VarE.r(lVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i16 & 12582912) == 0) {
            i17 |= o0VarE.r(pVar2) ? 8388608 : 4194304;
        }
        if ((i16 & 100663296) == 0) {
            i17 |= o0VarE.r(lVar2) ? 67108864 : 33554432;
        }
        if ((i16 & C.ENCODING_PCM_32BIT) == 0) {
            i17 |= o0VarE.r(lVar3) ? 536870912 : 268435456;
        }
        int i19 = (o0VarE.r(aVar) ? 4 : 2) | (o0VarE.r(aVar2) ? 32 : 16) | (o0VarE.r(aVar3) ? 256 : 128) | (o0VarE.r(aVar4) ? 2048 : 1024);
        int i24 = i17;
        if (o0VarE.n(i24 & 1, ((i17 & 306783379) == 306783378 && (i19 & 1171) == 1170) ? false : true)) {
            x1 x1Var = p3.n.f135158a;
            final Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new d0(24);
                o0VarE.K(objQ);
            }
            final p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            final p1 p1Var2 = (p1) objQ2;
            Object[] objArr2 = new Object[0];
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new d0(25);
                o0VarE.K(objQ3);
            }
            final p1 p1Var3 = (p1) d4.a.e(objArr2, (e23.a) objQ3, o0VarE, 48);
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = p0.n("");
                o0VarE.K(objQ4);
            }
            final p1 p1Var4 = (p1) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = p0.n("");
                o0VarE.K(objQ5);
            }
            final p1 p1Var5 = (p1) objQ5;
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = p0.n(new wp.b(18));
                o0VarE.K(objQ6);
            }
            final p1 p1Var6 = (p1) objQ6;
            final i0 i0VarA = k0.a(0, 0, 3, o0VarE);
            Object objQ7 = o0VarE.q();
            if (objQ7 == c2565a) {
                objQ7 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ7);
            }
            final b0 b0Var = (b0) objQ7;
            Object objQ8 = o0VarE.q();
            if (objQ8 == c2565a) {
                objQ8 = Integer.valueOf(((bv.d) KoinJavaComponent.get$default(bv.d.class, null, null, 6, null)).N());
                o0VarE.K(objQ8);
            }
            final int iIntValue = ((Number) objQ8).intValue();
            final int i25 = i18;
            final dy1.p pVar4 = pVar3;
            int i26 = i19 >> 3;
            og2.k.g(y.Q(o0VarE, R.string.review_plan), aVar3, aVar4, z14, z3.f.c(-1180987868, new p21.b(feVar, 27), o0VarE), z3.f.c(239802435, new e23.p() { // from class: wx1.m
                /* JADX WARN: Code duplicated, block: B:25:0x012e  */
                /* JADX WARN: Code duplicated, block: B:30:0x01a2  */
                /* JADX WARN: Code duplicated, block: B:35:0x01ee  */
                /* JADX WARN: Multi-variable type inference failed */
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
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    i0 i0Var;
                    p1 p1Var7;
                    p3.m mVar2 = (p3.m) obj;
                    int iIntValue2 = ((Integer) obj2).intValue();
                    if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                        x1 x1Var2 = p3.n.f135158a;
                        h4.r.a aVar5 = h4.r.S;
                        h4.r rVarD = x2.d(aVar5, 1.0f);
                        h4.d.f81522a.getClass();
                        h4.g.a aVar6 = h4.d.a.f81537o;
                        c2.j.f22691a.getClass();
                        z zVarA = c2.y.a(c2.j.f22694d, aVar6, mVar2, 48);
                        int iHashCode = Long.hashCode(mVar2.getU());
                        i2 i2VarX = mVar2.x();
                        h4.r rVarC = h4.k.c(rVarD, mVar2);
                        h5.g.V.getClass();
                        e0.a aVar7 = h5.g.a.f81805b;
                        if (mVar2.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar7);
                        } else {
                            mVar2.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA, mVar2);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                        h5.g.a.b bVar = h5.g.a.f81813j;
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar2, iHashCode, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, mVar2);
                        c2.b0 b0Var2 = c2.b0.f22601a;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar = j92.b.f97899b;
                        float f14 = eVar.f97920e;
                        qx1.n.a(i14, i25, 0, c2.l.A(c2.l.C(aVar5, 0.0f, f14, 0.0f, eVar.f97918c, 5), f14, 0.0f, 2), mVar2);
                        h4.r rVarA = b0Var2.a(aVar5, 1.0f, true);
                        final dy1.p pVar5 = pVar4;
                        boolean zR = mVar2.r(pVar5);
                        final Context context2 = context;
                        boolean zR2 = zR | mVar2.r(context2);
                        final e23.l lVar4 = lVar;
                        boolean zB = zR2 | mVar2.B(lVar4);
                        final e23.p pVar6 = pVar2;
                        boolean zB2 = zB | mVar2.B(pVar6);
                        final e23.l lVar5 = lVar2;
                        boolean zB3 = zB2 | mVar2.B(lVar5);
                        final p1 p1Var8 = p1Var3;
                        boolean zB4 = zB3 | mVar2.B(p1Var8);
                        final b0 b0Var3 = b0Var;
                        boolean zR3 = zB4 | mVar2.r(b0Var3);
                        final i0 i0Var2 = i0VarA;
                        boolean zB5 = zR3 | mVar2.B(i0Var2);
                        final i53.c cVar2 = cVar;
                        boolean zB6 = zB5 | mVar2.B(cVar2);
                        final e23.l lVar6 = lVar3;
                        boolean zB7 = zB6 | mVar2.B(lVar6);
                        Object objQ9 = mVar2.q();
                        final p1 p1Var9 = p1Var4;
                        final p1 p1Var10 = p1Var5;
                        final p1 p1Var11 = p1Var6;
                        final p1 p1Var12 = p1Var2;
                        p3.m.a aVar8 = p3.m.f135153a;
                        if (zB7) {
                            final int i27 = iIntValue;
                            objQ9 = new e23.l() { // from class: wx1.n
                                @Override // e23.l
                                public final Object invoke(Object obj3) {
                                    f0 f0Var = (f0) obj3;
                                    f0Var.getClass();
                                    dy1.p pVar7 = pVar5;
                                    Context context3 = context2;
                                    e23.l lVar7 = lVar4;
                                    p1 p1Var13 = p1Var8;
                                    f0.b(f0Var, null, new z3.e(-1537614312, true, new oy0.d(pVar7, context3, lVar7, p1Var13, b0Var3, i0Var2, p1Var9, p1Var10, p1Var11, p1Var12, pVar6, lVar5)), 3);
                                    f0.b(f0Var, null, new z3.e(-1352499071, true, new e(pVar7, i27, cVar2, lVar6, p1Var13)), 3);
                                    f0.b(f0Var, null, new z3.e(-817217568, true, new v0(pVar7, 21)), 3);
                                    return Unit.INSTANCE;
                                }
                            };
                            i0Var = i0Var2;
                            p1Var7 = p1Var12;
                            mVar2.K(objQ9);
                        } else {
                            aVar8.getClass();
                            if (objQ9 == p3.m.a.f135155b) {
                                final int i28 = iIntValue;
                                objQ9 = new e23.l() { // from class: wx1.n
                                    @Override // e23.l
                                    public final Object invoke(Object obj3) {
                                        f0 f0Var = (f0) obj3;
                                        f0Var.getClass();
                                        dy1.p pVar7 = pVar5;
                                        Context context3 = context2;
                                        e23.l lVar7 = lVar4;
                                        p1 p1Var13 = p1Var8;
                                        f0.b(f0Var, null, new z3.e(-1537614312, true, new oy0.d(pVar7, context3, lVar7, p1Var13, b0Var3, i0Var2, p1Var9, p1Var10, p1Var11, p1Var12, pVar6, lVar5)), 3);
                                        f0.b(f0Var, null, new z3.e(-1352499071, true, new e(pVar7, i28, cVar2, lVar6, p1Var13)), 3);
                                        f0.b(f0Var, null, new z3.e(-817217568, true, new v0(pVar7, 21)), 3);
                                        return Unit.INSTANCE;
                                    }
                                };
                                i0Var = i0Var2;
                                p1Var7 = p1Var12;
                                mVar2.K(objQ9);
                            } else {
                                p1Var7 = p1Var12;
                                i0Var = i0Var2;
                            }
                        }
                        p1 p1Var13 = p1Var7;
                        e2.c.b(rVarA, i0Var, null, null, aVar6, null, false, null, (e23.l) objQ9, mVar2, 196608, 476);
                        l72.f0 f0Var = l72.f0.f110999a;
                        h4.r rVarC2 = c2.l.C(c2.l.A(x2.f(aVar5, 1.0f), f14, 0.0f, 2), 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
                        String strQ = y.Q(mVar2, R.string.lbl_reset_plan_back_to_start);
                        p1 p1Var14 = p1Var;
                        boolean zB8 = mVar2.B(p1Var14);
                        Object objQ10 = mVar2.q();
                        if (zB8) {
                            objQ10 = new j0(p1Var14, 18);
                            mVar2.K(objQ10);
                        } else {
                            aVar8.getClass();
                            if (objQ10 == p3.m.a.f135155b) {
                                objQ10 = new j0(p1Var14, 18);
                                mVar2.K(objQ10);
                            }
                        }
                        f0Var.k(strQ, rVarC2, false, (e23.a) objQ10, mVar2, 0, 4);
                        h4.r rVarC3 = c2.l.C(c2.l.A(x2.f(aVar5, 1.0f), f14, 0.0f, 2), 0.0f, eVar.f97920e, 0.0f, eVar.f97921f, 5);
                        String strQ2 = y.Q(mVar2, R.string.atp_create_plan);
                        e23.a aVar9 = aVar2;
                        boolean zB9 = mVar2.B(aVar9);
                        Object objQ11 = mVar2.q();
                        if (zB9) {
                            objQ11 = new wv0.v(aVar9, 3);
                            mVar2.K(objQ11);
                        } else {
                            aVar8.getClass();
                            if (objQ11 == p3.m.a.f135155b) {
                                objQ11 = new wv0.v(aVar9, 3);
                                mVar2.K(objQ11);
                            }
                        }
                        f0Var.d(0, 9, (e23.a) objQ11, rVarC3, strQ2, mVar2, null, false);
                        mVar2.y();
                        if (((Boolean) p1Var13.getF182175a()).booleanValue()) {
                            mVar2.C(1433231044);
                            String str = (String) p1Var9.getF182175a();
                            String str2 = (String) p1Var10.getF182175a();
                            e23.l lVar7 = (e23.l) p1Var11.getF182175a();
                            Object objQ12 = mVar2.q();
                            aVar8.getClass();
                            if (objQ12 == p3.m.a.f135155b) {
                                objQ12 = new j0(p1Var13, 19);
                                mVar2.K(objQ12);
                            }
                            rx1.v.a(str, str2, lVar7, (e23.a) objQ12, mVar2, 3072);
                            mVar2.f();
                        } else {
                            mVar2.C(1433533759);
                            mVar2.f();
                        }
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, (i26 & 896) | (i26 & 112) | 221184 | ((i24 >> 6) & 7168), 0);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(424532129);
                boolean zB = ((i19 & 14) == 4) | o0VarE.B(p1Var);
                Object objQ9 = o0VarE.q();
                if (zB || objQ9 == c2565a) {
                    objQ9 = new w52.p1(aVar, p1Var, 4);
                    o0VarE.K(objQ9);
                }
                e23.a aVar5 = (e23.a) objQ9;
                boolean zB2 = o0VarE.B(p1Var);
                Object objQ10 = o0VarE.q();
                if (zB2 || objQ10 == c2565a) {
                    objQ10 = new j0(p1Var, 20);
                    o0VarE.K(objQ10);
                }
                oc.b.c(aVar5, (e23.a) objQ10, o0VarE, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(424792560);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cw1.l0(i14, i15, feVar, pVar, cVar, z14, lVar, pVar2, lVar2, lVar3, aVar, aVar2, aVar3, aVar4, i16);
        }
    }
}
