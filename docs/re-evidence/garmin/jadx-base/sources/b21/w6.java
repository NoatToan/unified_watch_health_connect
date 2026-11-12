package b21;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import i3.fe;
import java.util.ArrayList;
import java.util.List;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class w6 implements e23.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.v f15355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f15356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v21.e f15357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x01.b f15358e;

    public /* synthetic */ w6(lc.m0 m0Var, lc.v vVar, x01.b bVar, v21.e eVar) {
        this.f15354a = 0;
        this.f15356c = m0Var;
        this.f15355b = vVar;
        this.f15358e = bVar;
        this.f15357d = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0370  */
    /* JADX WARN: Code duplicated, block: B:109:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:114:0x0413  */
    /* JADX WARN: Code duplicated, block: B:119:0x044e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0480  */
    /* JADX WARN: Code duplicated, block: B:131:0x049d  */
    /* JADX WARN: Code duplicated, block: B:136:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:141:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:146:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:151:0x0510  */
    /* JADX WARN: Code duplicated, block: B:16:0x006d  */
    /* JADX WARN: Code duplicated, block: B:33:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:38:0x0142  */
    /* JADX WARN: Code duplicated, block: B:43:0x016a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0187  */
    /* JADX WARN: Code duplicated, block: B:53:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:69:0x0209  */
    /* JADX WARN: Code duplicated, block: B:76:0x0279  */
    /* JADX WARN: Code duplicated, block: B:81:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:86:0x02db  */
    /* JADX WARN: Code duplicated, block: B:96:0x0342  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.s
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        p3.p1 p1Var;
        p3.m mVar;
        fe feVar;
        final q21.b bVar;
        int i14 = this.f15354a;
        lc.m0 m0Var = this.f15356c;
        p3.m.a aVar = p3.m.f135153a;
        lc.v vVar = this.f15355b;
        final int i15 = 1;
        final int i16 = 0;
        switch (i14) {
            case 0:
                q21.r rVar = (q21.r) obj;
                fe feVar2 = (fe) obj3;
                p3.m mVar2 = (p3.m) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                rVar.getClass();
                ((q21.q) obj2).getClass();
                feVar2.getClass();
                p3.x1 x1Var = p3.n.f135158a;
                l01.k kVar = rVar.f142293f;
                if (kVar == null) {
                    mVar2.C(359158043);
                    Unit unit = Unit.INSTANCE;
                    boolean zR = mVar2.r(rVar) | mVar2.r(m0Var);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new t7(rVar, m0Var, null);
                        mVar2.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new t7(rVar, m0Var, null);
                            mVar2.K(objQ);
                        }
                    }
                    p3.l0.e((e23.p) objQ, unit, mVar2);
                    mVar2.f();
                    return unit;
                }
                mVar2.C(359532833);
                mVar2.f();
                boolean zR2 = mVar2.r(kVar);
                Object objQ2 = mVar2.q();
                if (zR2) {
                    objQ2 = new s4(kVar, 3);
                    mVar2.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new s4(kVar, 3);
                        mVar2.K(objQ2);
                    }
                }
                e23.a aVar2 = (e23.a) objQ2;
                mVar2.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar2);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(q21.k.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar2, 0), aVar2);
                mVar2.R();
                final q21.k kVar2 = (q21.k) u1VarResolveViewModel;
                p3.p1 p1VarC = s9.c.c(kVar2.f142252h, mVar2);
                p3.p1 p1VarG = o53.f0.G(vVar.a().b("mealWindowResult"), mVar2);
                o21.e eVar = (o21.e) p1VarG.getF182175a();
                boolean zB = mVar2.B(p1VarG) | mVar2.r(kVar2) | mVar2.r(vVar);
                Object objQ3 = mVar2.q();
                if (zB) {
                    objQ3 = new u7(p1VarG, kVar2, vVar, null);
                    mVar2.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new u7(p1VarG, kVar2, vVar, null);
                        mVar2.K(objQ3);
                    }
                }
                p3.l0.e((e23.p) objQ3, eVar, mVar2);
                Integer num = ((q21.p) p1VarC.getF182175a()).f142271c;
                boolean zB2 = mVar2.B(p1VarC) | mVar2.r(rVar) | mVar2.r(kVar2);
                Object objQ4 = mVar2.q();
                if (zB2) {
                    objQ4 = new v7(p1VarC, rVar, kVar2, null);
                    mVar2.K(objQ4);
                } else {
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new v7(p1VarC, rVar, kVar2, null);
                        mVar2.K(objQ4);
                    }
                }
                p3.l0.e((e23.p) objQ4, num, mVar2);
                Boolean boolValueOf = Boolean.valueOf(((q21.p) p1VarC.getF182175a()).f142272d);
                boolean zB3 = mVar2.B(p1VarC) | mVar2.r(rVar) | mVar2.r(kVar2);
                x01.b bVar2 = this.f15358e;
                boolean zB4 = zB3 | mVar2.B(bVar2);
                Object objQ5 = mVar2.q();
                if (zB4) {
                    p1Var = p1VarC;
                    mVar = mVar2;
                    w7 w7Var = new w7(rVar, kVar2, bVar2, p1Var, null);
                    mVar.K(w7Var);
                    objQ5 = w7Var;
                } else {
                    aVar.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        p1Var = p1VarC;
                        mVar = mVar2;
                        w7 w7Var2 = new w7(rVar, kVar2, bVar2, p1Var, null);
                        mVar.K(w7Var2);
                        objQ5 = w7Var2;
                    } else {
                        p1Var = p1VarC;
                        mVar = mVar2;
                    }
                }
                p3.l0.e((e23.p) objQ5, boolValueOf, mVar);
                q21.p pVar = (q21.p) p1Var.getF182175a();
                boolean zR3 = mVar.r(m0Var);
                Object objQ6 = mVar.q();
                if (zR3) {
                    objQ6 = new d7(m0Var, 0);
                    mVar.K(objQ6);
                } else {
                    aVar.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        objQ6 = new d7(m0Var, 0);
                        mVar.K(objQ6);
                    }
                }
                e23.l lVar = (e23.l) objQ6;
                boolean zR4 = mVar.r(kVar2);
                Object objQ7 = mVar.q();
                if (zR4) {
                    objQ7 = new e23.l() { // from class: b21.e7
                        /* JADX WARN: Code duplicated, block: B:18:0x006b  */
                        /* JADX WARN: Code duplicated, block: B:19:0x006f  */
                        /* JADX WARN: Code duplicated, block: B:25:0x0090  */
                        /* JADX WARN: Code duplicated, block: B:42:0x0103  */
                        /* JADX WARN: Code duplicated, block: B:43:0x0107  */
                        /* JADX WARN: Code duplicated, block: B:49:0x0128  */
                        /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v9 java.lang.Object, still in use, count: 2, list:
                              (r4v9 java.lang.Object) from 0x00ff: PHI (r4 I:??) = (r4v1 java.lang.Object), (r4v9 java.lang.Object) binds: [B:39:0x00fe, B:61:0x00ff] A[DONT_GENERATE, DONT_INLINE]
                              (r4v9 java.lang.Object) from 0x00ef: CHECK_CAST (o21.f) (r4v9 java.lang.Object)
                            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                            	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                            	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                            	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                            	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                            	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                            	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
                            */
                        @Override // e23.l
                        public final java.lang.Object invoke(java.lang.Object r23) {
                            /*
                                Method dump skipped, instruction units count: 362
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: b21.e7.invoke(java.lang.Object):java.lang.Object");
                        }
                    };
                    mVar.K(objQ7);
                } else {
                    aVar.getClass();
                    if (objQ7 == p3.m.a.f135155b) {
                        objQ7 = new e23.l() { // from class: b21.e7
                            /* JADX WARN: Code duplicated, block: B:18:0x006b  */
                            /* JADX WARN: Code duplicated, block: B:19:0x006f  */
                            /* JADX WARN: Code duplicated, block: B:25:0x0090  */
                            /* JADX WARN: Code duplicated, block: B:42:0x0103  */
                            /* JADX WARN: Code duplicated, block: B:43:0x0107  */
                            /* JADX WARN: Code duplicated, block: B:49:0x0128  */
                            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v9 java.lang.Object, still in use, count: 2, list:
                                  (r4v9 java.lang.Object) from 0x00ff: PHI (r4 I:??) = (r4v1 java.lang.Object), (r4v9 java.lang.Object) binds: [B:39:0x00fe, B:61:0x00ff] A[DONT_GENERATE, DONT_INLINE]
                                  (r4v9 java.lang.Object) from 0x00ef: CHECK_CAST (o21.f) (r4v9 java.lang.Object)
                                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                                	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                                */
                            @Override // e23.l
                            public final java.lang.Object invoke(java.lang.Object r23) {
                                /*
                                    Method dump skipped, instruction units count: 362
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: b21.e7.invoke(java.lang.Object):java.lang.Object");
                            }
                        };
                        mVar.K(objQ7);
                    }
                }
                e23.l lVar2 = (e23.l) objQ7;
                boolean zR5 = mVar.r(kVar2);
                Object objQ8 = mVar.q();
                if (zR5) {
                    objQ8 = new e23.l() { // from class: b21.e7
                        /* JADX WARN: Code duplicated, block: B:18:0x006b  */
                        /* JADX WARN: Code duplicated, block: B:19:0x006f  */
                        /* JADX WARN: Code duplicated, block: B:25:0x0090  */
                        /* JADX WARN: Code duplicated, block: B:42:0x0103  */
                        /* JADX WARN: Code duplicated, block: B:43:0x0107  */
                        /* JADX WARN: Code duplicated, block: B:49:0x0128  */
                        /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v9 java.lang.Object, still in use, count: 2, list:
                              (r4v9 java.lang.Object) from 0x00ff: PHI (r4 I:??) = (r4v1 java.lang.Object), (r4v9 java.lang.Object) binds: [B:39:0x00fe, B:61:0x00ff] A[DONT_GENERATE, DONT_INLINE]
                              (r4v9 java.lang.Object) from 0x00ef: CHECK_CAST (o21.f) (r4v9 java.lang.Object)
                            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                            	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                            	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                            	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                            	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                            */
                        @Override // e23.l
                        public final java.lang.Object invoke(java.lang.Object r23) {
                            /*
                                Method dump skipped, instruction units count: 362
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: b21.e7.invoke(java.lang.Object):java.lang.Object");
                        }
                    };
                    mVar.K(objQ8);
                } else {
                    aVar.getClass();
                    if (objQ8 == p3.m.a.f135155b) {
                        objQ8 = new e23.l() { // from class: b21.e7
                            /* JADX WARN: Code duplicated, block: B:18:0x006b  */
                            /* JADX WARN: Code duplicated, block: B:19:0x006f  */
                            /* JADX WARN: Code duplicated, block: B:25:0x0090  */
                            /* JADX WARN: Code duplicated, block: B:42:0x0103  */
                            /* JADX WARN: Code duplicated, block: B:43:0x0107  */
                            /* JADX WARN: Code duplicated, block: B:49:0x0128  */
                            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v9 java.lang.Object, still in use, count: 2, list:
                                  (r4v9 java.lang.Object) from 0x00ff: PHI (r4 I:??) = (r4v1 java.lang.Object), (r4v9 java.lang.Object) binds: [B:39:0x00fe, B:61:0x00ff] A[DONT_GENERATE, DONT_INLINE]
                                  (r4v9 java.lang.Object) from 0x00ef: CHECK_CAST (o21.f) (r4v9 java.lang.Object)
                                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                                */
                            @Override // e23.l
                            public final java.lang.Object invoke(java.lang.Object r23) {
                                /*
                                    Method dump skipped, instruction units count: 362
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: b21.e7.invoke(java.lang.Object):java.lang.Object");
                            }
                        };
                        mVar.K(objQ8);
                    }
                }
                e23.l lVar3 = (e23.l) objQ8;
                boolean zB5 = mVar.B(bVar2);
                Object objQ9 = mVar.q();
                if (zB5) {
                    objQ9 = new f7(bVar2, 0);
                    mVar.K(objQ9);
                } else {
                    aVar.getClass();
                    if (objQ9 == p3.m.a.f135155b) {
                        objQ9 = new f7(bVar2, 0);
                        mVar.K(objQ9);
                    }
                }
                e23.a aVar3 = (e23.a) objQ9;
                boolean zR6 = mVar.r(kVar2);
                Object objQ10 = mVar.q();
                if (zR6) {
                    objQ10 = new s4(kVar2, 4);
                    mVar.K(objQ10);
                } else {
                    aVar.getClass();
                    if (objQ10 == p3.m.a.f135155b) {
                        objQ10 = new s4(kVar2, 4);
                        mVar.K(objQ10);
                    }
                }
                e23.a aVar4 = (e23.a) objQ10;
                boolean zR7 = mVar.r(kVar2);
                Object objQ11 = mVar.q();
                if (zR7) {
                    final int i17 = 2;
                    objQ11 = new e23.l() { // from class: b21.e7
                        /* JADX WARN: Code duplicated, block: B:18:0x006b  */
                        /* JADX WARN: Code duplicated, block: B:19:0x006f  */
                        /* JADX WARN: Code duplicated, block: B:25:0x0090  */
                        /* JADX WARN: Code duplicated, block: B:42:0x0103  */
                        /* JADX WARN: Code duplicated, block: B:43:0x0107  */
                        /* JADX WARN: Code duplicated, block: B:49:0x0128  */
                        /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v9 java.lang.Object, still in use, count: 2, list:
                              (r4v9 java.lang.Object) from 0x00ff: PHI (r4 I:??) = (r4v1 java.lang.Object), (r4v9 java.lang.Object) binds: [B:39:0x00fe, B:61:0x00ff] A[DONT_GENERATE, DONT_INLINE]
                              (r4v9 java.lang.Object) from 0x00ef: CHECK_CAST (o21.f) (r4v9 java.lang.Object)
                            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                            	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                            	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                            	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                            */
                        @Override // e23.l
                        public final java.lang.Object invoke(java.lang.Object r23) {
                            /*
                                Method dump skipped, instruction units count: 362
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: b21.e7.invoke(java.lang.Object):java.lang.Object");
                        }
                    };
                    mVar.K(objQ11);
                } else {
                    aVar.getClass();
                    if (objQ11 == p3.m.a.f135155b) {
                        final int i18 = 2;
                        objQ11 = new e23.l() { // from class: b21.e7
                            /* JADX WARN: Code duplicated, block: B:18:0x006b  */
                            /* JADX WARN: Code duplicated, block: B:19:0x006f  */
                            /* JADX WARN: Code duplicated, block: B:25:0x0090  */
                            /* JADX WARN: Code duplicated, block: B:42:0x0103  */
                            /* JADX WARN: Code duplicated, block: B:43:0x0107  */
                            /* JADX WARN: Code duplicated, block: B:49:0x0128  */
                            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v9 java.lang.Object, still in use, count: 2, list:
                                  (r4v9 java.lang.Object) from 0x00ff: PHI (r4 I:??) = (r4v1 java.lang.Object), (r4v9 java.lang.Object) binds: [B:39:0x00fe, B:61:0x00ff] A[DONT_GENERATE, DONT_INLINE]
                                  (r4v9 java.lang.Object) from 0x00ef: CHECK_CAST (o21.f) (r4v9 java.lang.Object)
                                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                                */
                            @Override // e23.l
                            public final java.lang.Object invoke(java.lang.Object r23) {
                                /*
                                    Method dump skipped, instruction units count: 362
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: b21.e7.invoke(java.lang.Object):java.lang.Object");
                            }
                        };
                        mVar.K(objQ11);
                    }
                }
                p21.g.b(pVar, feVar2, this.f15357d, lVar, lVar2, lVar3, aVar3, aVar4, (e23.l) objQ11, mVar, (iIntValue >> 3) & 112);
                return Unit.INSTANCE;
            case 1:
                q21.r rVar2 = (q21.r) obj;
                q21.q qVar = (q21.q) obj2;
                p3.m mVar3 = (p3.m) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                rVar2.getClass();
                qVar.getClass();
                ((fe) obj3).getClass();
                p3.x1 x1Var2 = p3.n.f135158a;
                if ((((iIntValue2 & 112) ^ 48) <= 32 || !mVar3.B(qVar)) && (iIntValue2 & 48) != 32) {
                    i15 = 0;
                }
                Object objQ12 = mVar3.q();
                if (i15 == 0) {
                    aVar.getClass();
                    if (objQ12 == p3.m.a.f135155b) {
                        objQ12 = new a7(qVar, 0);
                        mVar3.K(objQ12);
                    }
                } else {
                    objQ12 = new a7(qVar, 0);
                    mVar3.K(objQ12);
                }
                e23.a aVar5 = (e23.a) objQ12;
                mVar3.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA2 = v9.a.a(mVar3);
                if (viewModelStoreOwnerA2 == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                androidx.lifecycle.u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(q21.m.class), viewModelStoreOwnerA2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA2), null, KoinApplicationKt.currentKoinScope(mVar3, 0), aVar5);
                mVar3.R();
                q21.m mVar4 = (q21.m) u1VarResolveViewModel2;
                p3.p1 p1VarC2 = s9.c.c(mVar4.f142263e, mVar3);
                p3.p1 p1VarG2 = o53.f0.G(vVar.a().b("mealGoalsResult"), mVar3);
                List list = (List) p1VarG2.getF182175a();
                boolean zB6 = mVar3.B(p1VarG2) | mVar3.r(mVar4) | mVar3.r(vVar);
                Object objQ13 = mVar3.q();
                if (zB6) {
                    objQ13 = new p7(p1VarG2, mVar4, vVar, null);
                    mVar3.K(objQ13);
                } else {
                    aVar.getClass();
                    if (objQ13 == p3.m.a.f135155b) {
                        objQ13 = new p7(p1VarG2, mVar4, vVar, null);
                        mVar3.K(objQ13);
                    }
                }
                p3.l0.e((e23.p) objQ13, list, mVar3);
                Boolean boolValueOf2 = Boolean.valueOf(((q21.l) p1VarC2.getF182175a()).f142258d);
                boolean zB7 = mVar3.B(p1VarC2) | mVar3.r(rVar2) | mVar3.r(m0Var);
                Object objQ14 = mVar3.q();
                if (zB7) {
                    objQ14 = new q7(rVar2, m0Var, p1VarC2, null);
                    mVar3.K(objQ14);
                } else {
                    aVar.getClass();
                    if (objQ14 == p3.m.a.f135155b) {
                        objQ14 = new q7(rVar2, m0Var, p1VarC2, null);
                        mVar3.K(objQ14);
                    }
                }
                p3.l0.e((e23.p) objQ14, boolValueOf2, mVar3);
                q21.l lVar4 = (q21.l) p1VarC2.getF182175a();
                boolean zR8 = mVar3.r(m0Var) | mVar3.r(mVar4) | mVar3.B(p1VarC2);
                Object objQ15 = mVar3.q();
                if (zR8) {
                    objQ15 = new ak0.m(m0Var, 9, mVar4, p1VarC2);
                    mVar3.K(objQ15);
                } else {
                    aVar.getClass();
                    if (objQ15 == p3.m.a.f135155b) {
                        objQ15 = new ak0.m(m0Var, 9, mVar4, p1VarC2);
                        mVar3.K(objQ15);
                    }
                }
                p21.h.a(lVar4, this.f15357d, (e23.a) objQ15, this.f15358e, mVar3, 0);
                return Unit.INSTANCE;
            default:
                q21.r rVar3 = (q21.r) obj;
                q21.q qVar2 = (q21.q) obj2;
                fe feVar3 = (fe) obj3;
                p3.m mVar5 = (p3.m) obj4;
                int iIntValue3 = ((Integer) obj5).intValue();
                rVar3.getClass();
                qVar2.getClass();
                feVar3.getClass();
                p3.x1 x1Var3 = p3.n.f135158a;
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                l4.u uVar = (l4.u) lc.w.a(vVar, t0Var.b(l4.u.class));
                boolean zR9 = ((((iIntValue3 & 112) ^ 48) > 32 && mVar5.B(qVar2)) || (iIntValue3 & 48) == 32) | mVar5.r(uVar);
                Object objQ16 = mVar5.q();
                if (zR9) {
                    objQ16 = new ao1.i(21, qVar2, uVar);
                    mVar5.K(objQ16);
                } else {
                    aVar.getClass();
                    if (objQ16 == p3.m.a.f135155b) {
                        objQ16 = new ao1.i(21, qVar2, uVar);
                        mVar5.K(objQ16);
                    }
                }
                e23.a aVar6 = (e23.a) objQ16;
                mVar5.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA3 = v9.a.a(mVar5);
                if (viewModelStoreOwnerA3 == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                androidx.lifecycle.u1 u1VarResolveViewModel3 = GetViewModelKt.resolveViewModel(t0Var.b(q21.b.class), viewModelStoreOwnerA3.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA3), null, KoinApplicationKt.currentKoinScope(mVar5, 0), aVar6);
                mVar5.R();
                q21.b bVar3 = (q21.b) u1VarResolveViewModel3;
                p3.p1 p1VarC3 = s9.c.c(bVar3.f142216g, mVar5);
                Context context = (Context) mVar5.A(AndroidCompositionLocals_androidKt.f6042b);
                Boolean boolValueOf3 = Boolean.valueOf(((q21.a) p1VarC3.getF182175a()).f142206e);
                int i19 = iIntValue3 & 896;
                boolean zB8 = mVar5.B(p1VarC3) | (((i19 ^ 384) > 256 && mVar5.B(feVar3)) || (iIntValue3 & 384) == 256) | mVar5.r(context) | mVar5.r(bVar3);
                Object objQ17 = mVar5.q();
                if (zB8) {
                    r7 r7Var = new r7(feVar3, context, bVar3, p1VarC3, null);
                    feVar = feVar3;
                    bVar = bVar3;
                    p1VarC3 = p1VarC3;
                    mVar5.K(r7Var);
                    objQ17 = r7Var;
                } else {
                    aVar.getClass();
                    if (objQ17 == p3.m.a.f135155b) {
                        r7 r7Var2 = new r7(feVar3, context, bVar3, p1VarC3, null);
                        feVar = feVar3;
                        bVar = bVar3;
                        p1VarC3 = p1VarC3;
                        mVar5.K(r7Var2);
                        objQ17 = r7Var2;
                    } else {
                        bVar = bVar3;
                        feVar = feVar3;
                    }
                }
                p3.l0.e((e23.p) objQ17, boolValueOf3, mVar5);
                Boolean boolValueOf4 = Boolean.valueOf(((q21.a) p1VarC3.getF182175a()).f142205d);
                boolean zB9 = mVar5.B(p1VarC3) | mVar5.r(rVar3);
                lc.m0 m0Var2 = this.f15356c;
                boolean zR10 = zB9 | mVar5.r(m0Var2) | mVar5.r(bVar);
                Object objQ18 = mVar5.q();
                if (zR10) {
                    s7 s7Var = new s7(rVar3, m0Var2, bVar, p1VarC3, null);
                    mVar5.K(s7Var);
                    objQ18 = s7Var;
                } else {
                    aVar.getClass();
                    if (objQ18 == p3.m.a.f135155b) {
                        s7 s7Var2 = new s7(rVar3, m0Var2, bVar, p1VarC3, null);
                        mVar5.K(s7Var2);
                        objQ18 = s7Var2;
                    }
                }
                p3.l0.e((e23.p) objQ18, boolValueOf4, mVar5);
                q21.a aVar7 = (q21.a) p1VarC3.getF182175a();
                boolean zR11 = mVar5.r(bVar);
                Object objQ19 = mVar5.q();
                if (zR11) {
                    objQ19 = new e23.a() { // from class: b21.b7
                        @Override // e23.a
                        public final Object invoke() {
                            Object value;
                            q21.a aVarA;
                            switch (i16) {
                                case 0:
                                    q21.b bVar4 = bVar;
                                    ge1.b.T(androidx.lifecycle.v1.a(bVar4), null, null, new q21.c(bVar4, null), 3);
                                    return Unit.INSTANCE;
                                default:
                                    q21.b bVar5 = bVar;
                                    r53.p2 p2Var = bVar5.f142215f;
                                    do {
                                        value = p2Var.getValue();
                                        aVarA = (q21.a) value;
                                        Integer num2 = aVarA.f142202a;
                                        if (num2 != null) {
                                            int iIntValue4 = num2.intValue();
                                            List<o21.d> list2 = aVarA.f142203b;
                                            ArrayList arrayList = new ArrayList(p13.y.r(list2, 10));
                                            int i24 = 0;
                                            for (Object obj6 : list2) {
                                                int i25 = i24 + 1;
                                                if (i24 < 0) {
                                                    p13.x.q();
                                                    throw null;
                                                }
                                                arrayList.add(o21.d.a((o21.d) obj6, bVar5.f142210a.get(i24).intValue(), null, null, null, null, 123));
                                                i24 = i25;
                                            }
                                            aVarA = q21.a.a(aVarA, bVar5.x4(iIntValue4, arrayList), false, false, false, false, 29);
                                        }
                                    } while (!p2Var.b(value, aVarA));
                                    return Unit.INSTANCE;
                            }
                        }
                    };
                    mVar5.K(objQ19);
                } else {
                    aVar.getClass();
                    if (objQ19 == p3.m.a.f135155b) {
                        objQ19 = new e23.a() { // from class: b21.b7
                            @Override // e23.a
                            public final Object invoke() {
                                Object value;
                                q21.a aVarA;
                                switch (i16) {
                                    case 0:
                                        q21.b bVar4 = bVar;
                                        ge1.b.T(androidx.lifecycle.v1.a(bVar4), null, null, new q21.c(bVar4, null), 3);
                                        return Unit.INSTANCE;
                                    default:
                                        q21.b bVar5 = bVar;
                                        r53.p2 p2Var = bVar5.f142215f;
                                        do {
                                            value = p2Var.getValue();
                                            aVarA = (q21.a) value;
                                            Integer num2 = aVarA.f142202a;
                                            if (num2 != null) {
                                                int iIntValue4 = num2.intValue();
                                                List<o21.d> list2 = aVarA.f142203b;
                                                ArrayList arrayList = new ArrayList(p13.y.r(list2, 10));
                                                int i24 = 0;
                                                for (Object obj6 : list2) {
                                                    int i25 = i24 + 1;
                                                    if (i24 < 0) {
                                                        p13.x.q();
                                                        throw null;
                                                    }
                                                    arrayList.add(o21.d.a((o21.d) obj6, bVar5.f142210a.get(i24).intValue(), null, null, null, null, 123));
                                                    i24 = i25;
                                                }
                                                aVarA = q21.a.a(aVarA, bVar5.x4(iIntValue4, arrayList), false, false, false, false, 29);
                                            }
                                        } while (!p2Var.b(value, aVarA));
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        mVar5.K(objQ19);
                    }
                }
                e23.a aVar8 = (e23.a) objQ19;
                boolean zR12 = mVar5.r(bVar);
                Object objQ20 = mVar5.q();
                if (zR12) {
                    objQ20 = new e23.a() { // from class: b21.b7
                        @Override // e23.a
                        public final Object invoke() {
                            Object value;
                            q21.a aVarA;
                            switch (i15) {
                                case 0:
                                    q21.b bVar4 = bVar;
                                    ge1.b.T(androidx.lifecycle.v1.a(bVar4), null, null, new q21.c(bVar4, null), 3);
                                    return Unit.INSTANCE;
                                default:
                                    q21.b bVar5 = bVar;
                                    r53.p2 p2Var = bVar5.f142215f;
                                    do {
                                        value = p2Var.getValue();
                                        aVarA = (q21.a) value;
                                        Integer num2 = aVarA.f142202a;
                                        if (num2 != null) {
                                            int iIntValue4 = num2.intValue();
                                            List<o21.d> list2 = aVarA.f142203b;
                                            ArrayList arrayList = new ArrayList(p13.y.r(list2, 10));
                                            int i24 = 0;
                                            for (Object obj6 : list2) {
                                                int i25 = i24 + 1;
                                                if (i24 < 0) {
                                                    p13.x.q();
                                                    throw null;
                                                }
                                                arrayList.add(o21.d.a((o21.d) obj6, bVar5.f142210a.get(i24).intValue(), null, null, null, null, 123));
                                                i24 = i25;
                                            }
                                            aVarA = q21.a.a(aVarA, bVar5.x4(iIntValue4, arrayList), false, false, false, false, 29);
                                        }
                                    } while (!p2Var.b(value, aVarA));
                                    return Unit.INSTANCE;
                            }
                        }
                    };
                    mVar5.K(objQ20);
                } else {
                    aVar.getClass();
                    if (objQ20 == p3.m.a.f135155b) {
                        objQ20 = new e23.a() { // from class: b21.b7
                            @Override // e23.a
                            public final Object invoke() {
                                Object value;
                                q21.a aVarA;
                                switch (i15) {
                                    case 0:
                                        q21.b bVar4 = bVar;
                                        ge1.b.T(androidx.lifecycle.v1.a(bVar4), null, null, new q21.c(bVar4, null), 3);
                                        return Unit.INSTANCE;
                                    default:
                                        q21.b bVar5 = bVar;
                                        r53.p2 p2Var = bVar5.f142215f;
                                        do {
                                            value = p2Var.getValue();
                                            aVarA = (q21.a) value;
                                            Integer num2 = aVarA.f142202a;
                                            if (num2 != null) {
                                                int iIntValue4 = num2.intValue();
                                                List<o21.d> list2 = aVarA.f142203b;
                                                ArrayList arrayList = new ArrayList(p13.y.r(list2, 10));
                                                int i24 = 0;
                                                for (Object obj6 : list2) {
                                                    int i25 = i24 + 1;
                                                    if (i24 < 0) {
                                                        p13.x.q();
                                                        throw null;
                                                    }
                                                    arrayList.add(o21.d.a((o21.d) obj6, bVar5.f142210a.get(i24).intValue(), null, null, null, null, 123));
                                                    i24 = i25;
                                                }
                                                aVarA = q21.a.a(aVarA, bVar5.x4(iIntValue4, arrayList), false, false, false, false, 29);
                                            }
                                        } while (!p2Var.b(value, aVarA));
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        mVar5.K(objQ20);
                    }
                }
                e23.a aVar9 = (e23.a) objQ20;
                boolean zR13 = mVar5.r(bVar);
                Object objQ21 = mVar5.q();
                if (zR13) {
                    objQ21 = new a61.d(bVar, 12);
                    mVar5.K(objQ21);
                } else {
                    aVar.getClass();
                    if (objQ21 == p3.m.a.f135155b) {
                        objQ21 = new a61.d(bVar, 12);
                        mVar5.K(objQ21);
                    }
                }
                p21.d.a(aVar7, this.f15357d, feVar, aVar8, aVar9, (e23.p) objQ21, this.f15358e, mVar5, i19);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ w6(lc.v vVar, lc.m0 m0Var, v21.e eVar, x01.b bVar, int i14) {
        this.f15354a = i14;
        this.f15355b = vVar;
        this.f15356c = m0Var;
        this.f15357d = eVar;
        this.f15358e = bVar;
    }
}
