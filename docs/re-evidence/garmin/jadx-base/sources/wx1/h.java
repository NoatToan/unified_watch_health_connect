package wx1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e2.f0;
import e2.i0;
import e2.k0;
import gl1.y;
import h5.e0;
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
import w51.j0;
import wn1.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class h {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final int i14, final int i15, final i53.c cVar, final i53.c cVar2, final i53.c cVar3, final dy1.p pVar, final boolean z14, e23.a aVar, e23.p pVar2, final e23.l lVar, final e23.a aVar2, e23.a aVar3, e23.a aVar4, p3.m mVar, int i16) {
        cVar.getClass();
        cVar2.getClass();
        cVar3.getClass();
        pVar.getClass();
        aVar.getClass();
        pVar2.getClass();
        lVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        o0 o0VarE = mVar.E(-1530496132);
        int i17 = i16 | (o0VarE.k(i14) ? 4 : 2) | (o0VarE.k(i15) ? 32 : 16) | (o0VarE.r(cVar) ? 256 : 128) | (o0VarE.B(cVar2) ? 2048 : 1024) | (o0VarE.B(cVar3) ? 16384 : 8192) | (o0VarE.r(pVar) ? 131072 : 65536) | (o0VarE.h(z14) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(aVar) ? 8388608 : 4194304) | (o0VarE.r(pVar2) ? 67108864 : 33554432) | (o0VarE.r(lVar) ? 536870912 : 268435456);
        int i18 = (o0VarE.r(aVar2) ? 4 : 2) | (o0VarE.r(aVar3) ? 32 : 16) | (o0VarE.r(aVar4) ? 256 : 128);
        if (o0VarE.n(i17 & 1, ((i17 & 306783379) == 306783378 && (i18 & 147) == 146) ? false : true)) {
            x1 x1Var = p3.n.f135158a;
            final Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new d0(20);
                o0VarE.K(objQ);
            }
            final p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            Object[] objArr2 = new Object[0];
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new d0(21);
                o0VarE.K(objQ2);
            }
            final p1 p1Var2 = (p1) d4.a.e(objArr2, (e23.a) objQ2, o0VarE, 48);
            Object[] objArr3 = new Object[0];
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new d0(22);
                o0VarE.K(objQ3);
            }
            final p1 p1Var3 = (p1) d4.a.e(objArr3, (e23.a) objQ3, o0VarE, 48);
            Object[] objArr4 = new Object[0];
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = new d0(23);
                o0VarE.K(objQ4);
            }
            final p1 p1Var4 = (p1) d4.a.e(objArr4, (e23.a) objQ4, o0VarE, 48);
            final i0 i0VarA = k0.a(0, 0, 3, o0VarE);
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ5);
            }
            final b0 b0Var = (b0) objQ5;
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = Integer.valueOf(((bv.d) KoinJavaComponent.get$default(bv.d.class, null, null, 6, null)).N());
                o0VarE.K(objQ6);
            }
            final int iIntValue = ((Number) objQ6).intValue();
            og2.k.g(y.Q(o0VarE, R.string.lbl_confirm_schedule), aVar3, aVar4, false, null, z3.f.c(1635789773, new e23.p() { // from class: wx1.f
                /* JADX WARN: Code duplicated, block: B:25:0x0133  */
                /* JADX WARN: Code duplicated, block: B:30:0x019e  */
                /* JADX WARN: Code duplicated, block: B:35:0x01e2  */
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
                        qx1.n.a(i14, i15, 0, c2.l.A(c2.l.C(aVar5, 0.0f, f14, 0.0f, eVar.f97918c, 5), f14, 0.0f, 2), mVar2);
                        h4.r rVarA = b0Var2.a(aVar5, 1.0f, true);
                        final dy1.p pVar3 = pVar;
                        boolean zR = mVar2.r(pVar3);
                        final p1 p1Var5 = p1Var3;
                        boolean zB = zR | mVar2.B(p1Var5);
                        final b0 b0Var3 = b0Var;
                        boolean zR2 = zB | mVar2.r(b0Var3);
                        final i0 i0Var2 = i0VarA;
                        boolean zB2 = zR2 | mVar2.B(i0Var2);
                        final i53.c cVar4 = cVar3;
                        boolean zB3 = zB2 | mVar2.B(cVar4);
                        final e23.l lVar2 = lVar;
                        boolean zB4 = zB3 | mVar2.B(lVar2);
                        final i53.c cVar5 = cVar2;
                        boolean zB5 = zB4 | mVar2.B(cVar5);
                        final boolean z15 = z14;
                        boolean zH = zB5 | mVar2.h(z15);
                        final i53.c cVar6 = cVar;
                        boolean zR3 = zH | mVar2.r(cVar6);
                        final Context context2 = context;
                        boolean zR4 = zR3 | mVar2.r(context2);
                        final p1 p1Var6 = p1Var4;
                        boolean zB6 = zR4 | mVar2.B(p1Var6);
                        final p1 p1Var7 = p1Var2;
                        boolean zB7 = zB6 | mVar2.B(p1Var7);
                        Object objQ7 = mVar2.q();
                        p3.m.a aVar8 = p3.m.f135153a;
                        if (zB7) {
                            final int i19 = iIntValue;
                            objQ7 = new e23.l() { // from class: wx1.c
                                @Override // e23.l
                                public final Object invoke(Object obj3) {
                                    f0 f0Var = (f0) obj3;
                                    f0Var.getClass();
                                    dy1.p pVar4 = pVar3;
                                    p1 p1Var8 = p1Var5;
                                    f0.b(f0Var, null, new z3.e(876034978, true, new d(pVar4, p1Var8, b0Var3, i0Var2, 0)), 3);
                                    f0.b(f0Var, null, new z3.e(2101071883, true, new e(cVar4, pVar4, i19, lVar2, p1Var8)), 3);
                                    f0.b(f0Var, null, new z3.e(1752444266, true, new l72.b(cVar5, z15, cVar6, context2, p1Var6, p1Var7, 7)), 3);
                                    return Unit.INSTANCE;
                                }
                            };
                            i0Var = i0Var2;
                            mVar2.K(objQ7);
                        } else {
                            aVar8.getClass();
                            if (objQ7 == p3.m.a.f135155b) {
                                final int i110 = iIntValue;
                                objQ7 = new e23.l() { // from class: wx1.c
                                    @Override // e23.l
                                    public final Object invoke(Object obj3) {
                                        f0 f0Var = (f0) obj3;
                                        f0Var.getClass();
                                        dy1.p pVar4 = pVar3;
                                        p1 p1Var8 = p1Var5;
                                        f0.b(f0Var, null, new z3.e(876034978, true, new d(pVar4, p1Var8, b0Var3, i0Var2, 0)), 3);
                                        f0.b(f0Var, null, new z3.e(2101071883, true, new e(cVar4, pVar4, i110, lVar2, p1Var8)), 3);
                                        f0.b(f0Var, null, new z3.e(1752444266, true, new l72.b(cVar5, z15, cVar6, context2, p1Var6, p1Var7, 7)), 3);
                                        return Unit.INSTANCE;
                                    }
                                };
                                i0Var = i0Var2;
                                mVar2.K(objQ7);
                            } else {
                                i0Var = i0Var2;
                            }
                        }
                        e2.c.b(rVarA, i0Var, null, null, aVar6, null, false, null, (e23.l) objQ7, mVar2, 196608, 476);
                        l72.f0 f0Var = l72.f0.f110999a;
                        h4.r rVarC2 = c2.l.C(c2.l.A(x2.f(aVar5, 1.0f), f14, 0.0f, 2), 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
                        String strQ = y.Q(mVar2, R.string.lbl_clear_schedule);
                        p1 p1Var8 = p1Var;
                        boolean zB8 = mVar2.B(p1Var8);
                        Object objQ8 = mVar2.q();
                        if (zB8) {
                            objQ8 = new j0(p1Var8, 15);
                            mVar2.K(objQ8);
                        } else {
                            aVar8.getClass();
                            if (objQ8 == p3.m.a.f135155b) {
                                objQ8 = new j0(p1Var8, 15);
                                mVar2.K(objQ8);
                            }
                        }
                        f0Var.k(strQ, rVarC2, false, (e23.a) objQ8, mVar2, 0, 4);
                        h4.r rVarC3 = c2.l.C(c2.l.A(x2.f(aVar5, 1.0f), f14, 0.0f, 2), 0.0f, eVar.f97920e, 0.0f, eVar.f97921f, 5);
                        String strQ2 = y.Q(mVar2, R.string.lbl_confirm_schedule);
                        e23.a aVar9 = aVar2;
                        boolean zB9 = mVar2.B(aVar9);
                        Object objQ9 = mVar2.q();
                        if (zB9) {
                            objQ9 = new wv0.v(aVar9, 2);
                            mVar2.K(objQ9);
                        } else {
                            aVar8.getClass();
                            if (objQ9 == p3.m.a.f135155b) {
                                objQ9 = new wv0.v(aVar9, 2);
                                mVar2.K(objQ9);
                            }
                        }
                        f0Var.d(0, 9, (e23.a) objQ9, rVarC3, strQ2, mVar2, null, false);
                        mVar2.y();
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, (i18 & 112) | 196608 | (i18 & 896), 24);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(369521143);
                boolean zB = ((i17 & 29360128) == 8388608) | o0VarE.B(p1Var);
                Object objQ7 = o0VarE.q();
                if (zB || objQ7 == c2565a) {
                    objQ7 = new w52.p1(aVar, p1Var, 3);
                    o0VarE.K(objQ7);
                }
                e23.a aVar5 = (e23.a) objQ7;
                boolean zB2 = o0VarE.B(p1Var);
                Object objQ8 = o0VarE.q();
                if (zB2 || objQ8 == c2565a) {
                    objQ8 = new j0(p1Var, 16);
                    o0VarE.K(objQ8);
                }
                o72.t.h(aVar5, (e23.a) objQ8, o0VarE, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(369781574);
                o0VarE.g0(false);
            }
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0VarE.C(369822246);
                String str = (String) p1Var4.getF182175a();
                boolean zB3 = o0VarE.B(p1Var2);
                Object objQ9 = o0VarE.q();
                if (zB3 || objQ9 == c2565a) {
                    objQ9 = new j0(p1Var2, 17);
                    o0VarE.K(objQ9);
                }
                rx1.j.a(str, cVar, cVar2, z14, pVar2, (e23.a) objQ9, o0VarE, ((i17 >> 3) & 1008) | ((i17 >> 9) & 7168) | ((i17 >> 12) & 57344));
                o0VarE.g0(false);
            } else {
                o0VarE.C(370252774);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new jt1.i(i14, i15, cVar, cVar2, cVar3, pVar, z14, aVar, pVar2, lVar, aVar2, aVar3, aVar4, i16);
        }
    }
}
