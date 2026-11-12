package j30;

import e23.l;
import e23.p;
import gl1.y;
import jy0.k;
import k30.n;
import k30.o;
import p005kotlin.Unit;
import p3.m;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f96854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f96855c;

    public /* synthetic */ f(n nVar, l lVar, int i14) {
        this.f96853a = i14;
        this.f96854b = nVar;
        this.f96855c = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005d  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:59:0x0120  */
    /* JADX WARN: Code duplicated, block: B:82:0x0185  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f96853a;
        m.a aVar = m.f135153a;
        final l lVar = this.f96855c;
        final n nVar = this.f96854b;
        final int i15 = 0;
        final int i16 = 1;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    for (final k30.m mVar2 : k30.m.f102573g) {
                        String strQ = y.Q(mVar, mVar2.f102574a);
                        boolean z14 = mVar2 == nVar.f102575a;
                        boolean zK = mVar.k(mVar2.ordinal()) | mVar.B(nVar) | mVar.B(lVar);
                        Object objQ = mVar.q();
                        if (zK) {
                            objQ = new e23.a() { // from class: j30.h
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i15) {
                                        case 0:
                                            k30.m mVar3 = nVar.f102575a;
                                            k30.m mVar4 = mVar2;
                                            if (mVar4 != mVar3) {
                                                lVar.invoke(mVar4);
                                            }
                                            break;
                                        default:
                                            k30.m mVar5 = nVar.f102575a;
                                            k30.m mVar6 = mVar2;
                                            if (mVar6 != mVar5) {
                                                lVar.invoke(mVar6);
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new e23.a() { // from class: j30.h
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i15) {
                                            case 0:
                                                k30.m mVar3 = nVar.f102575a;
                                                k30.m mVar4 = mVar2;
                                                if (mVar4 != mVar3) {
                                                    lVar.invoke(mVar4);
                                                }
                                                break;
                                            default:
                                                k30.m mVar5 = nVar.f102575a;
                                                k30.m mVar6 = mVar2;
                                                if (mVar6 != mVar5) {
                                                    lVar.invoke(mVar6);
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar.K(objQ);
                            }
                        }
                        i.c(0, (e23.a) objQ, strQ, mVar, z14);
                    }
                    x1 x1Var2 = p3.n.f135158a;
                } else {
                    mVar.e();
                }
                break;
            case 1:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    for (final o oVar : nVar.f102576b) {
                        String strQ2 = y.Q(mVar, oVar.f102579a.f32979a);
                        boolean z15 = oVar.f102580b;
                        boolean zB = mVar.B(nVar) | mVar.r(oVar) | mVar.B(lVar);
                        Object objQ2 = mVar.q();
                        if (zB) {
                            objQ2 = new e23.a() { // from class: j30.c
                                /* JADX WARN: Code duplicated, block: B:20:0x005c  */
                                /* JADX WARN: Code duplicated, block: B:39:0x00b7  */
                                /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                                    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v6 java.lang.Object, still in use, count: 2, list:
                                      (r2v6 java.lang.Object) from 0x00b5: PHI (r2 I:??) = (r2v4 java.lang.Object), (r2v6 java.lang.Object) binds: [B:37:0x00b4, B:52:0x00b5] A[DONT_GENERATE, DONT_INLINE]
                                      (r2v6 java.lang.Object) from 0x00ad: CHECK_CAST (k30.o) (r2v6 java.lang.Object)
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
                                @Override // e23.a
                                public final java.lang.Object invoke() {
                                    /*
                                        Method dump skipped, instruction units count: 202
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: j30.c.invoke():java.lang.Object");
                                }
                            };
                            mVar.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == m.a.f135155b) {
                                objQ2 = new e23.a() { // from class: j30.c
                                    /* JADX WARN: Code duplicated, block: B:20:0x005c  */
                                    /* JADX WARN: Code duplicated, block: B:39:0x00b7  */
                                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v6 java.lang.Object, still in use, count: 2, list:
                                          (r2v6 java.lang.Object) from 0x00b5: PHI (r2 I:??) = (r2v4 java.lang.Object), (r2v6 java.lang.Object) binds: [B:37:0x00b4, B:52:0x00b5] A[DONT_GENERATE, DONT_INLINE]
                                          (r2v6 java.lang.Object) from 0x00ad: CHECK_CAST (k30.o) (r2v6 java.lang.Object)
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
                                    @Override // e23.a
                                    public final java.lang.Object invoke() {
                                        /*
                                            Method dump skipped, instruction units count: 202
                                            To view this dump add '--comments-level debug' option
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: j30.c.invoke():java.lang.Object");
                                    }
                                };
                                mVar.K(objQ2);
                            }
                        }
                        i.c(0, (e23.a) objQ2, strQ2, mVar, z15);
                    }
                    x1 x1Var4 = p3.n.f135158a;
                } else {
                    mVar.e();
                }
                break;
            case 2:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    for (final k30.m mVar3 : k30.m.f102573g) {
                        String strQ3 = y.Q(mVar, mVar3.f102574a);
                        boolean z16 = mVar3 == nVar.f102575a;
                        boolean zK2 = mVar.k(mVar3.ordinal()) | mVar.B(nVar) | mVar.B(lVar);
                        Object objQ3 = mVar.q();
                        if (zK2) {
                            objQ3 = new e23.a() { // from class: j30.h
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i16) {
                                        case 0:
                                            k30.m mVar4 = nVar.f102575a;
                                            k30.m mVar5 = mVar3;
                                            if (mVar5 != mVar4) {
                                                lVar.invoke(mVar5);
                                            }
                                            break;
                                        default:
                                            k30.m mVar6 = nVar.f102575a;
                                            k30.m mVar7 = mVar3;
                                            if (mVar7 != mVar6) {
                                                lVar.invoke(mVar7);
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(objQ3);
                        } else {
                            aVar.getClass();
                            if (objQ3 == m.a.f135155b) {
                                objQ3 = new e23.a() { // from class: j30.h
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i16) {
                                            case 0:
                                                k30.m mVar4 = nVar.f102575a;
                                                k30.m mVar5 = mVar3;
                                                if (mVar5 != mVar4) {
                                                    lVar.invoke(mVar5);
                                                }
                                                break;
                                            default:
                                                k30.m mVar6 = nVar.f102575a;
                                                k30.m mVar7 = mVar3;
                                                if (mVar7 != mVar6) {
                                                    lVar.invoke(mVar7);
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar.K(objQ3);
                            }
                        }
                        k.b(0, (e23.a) objQ3, strQ3, mVar, z16);
                    }
                    x1 x1Var6 = p3.n.f135158a;
                } else {
                    mVar.e();
                }
                break;
            default:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    for (final o oVar2 : nVar.f102576b) {
                        String strQ4 = y.Q(mVar, oVar2.f102579a.f32979a);
                        boolean z17 = oVar2.f102580b;
                        boolean zB2 = mVar.B(nVar) | mVar.r(oVar2) | mVar.B(lVar);
                        Object objQ4 = mVar.q();
                        if (zB2) {
                            objQ4 = new e23.a() { // from class: j30.c
                                /* JADX WARN: Code duplicated, block: B:20:0x005c  */
                                /* JADX WARN: Code duplicated, block: B:39:0x00b7  */
                                /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                                    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v6 java.lang.Object, still in use, count: 2, list:
                                      (r2v6 java.lang.Object) from 0x00b5: PHI (r2 I:??) = (r2v4 java.lang.Object), (r2v6 java.lang.Object) binds: [B:37:0x00b4, B:52:0x00b5] A[DONT_GENERATE, DONT_INLINE]
                                      (r2v6 java.lang.Object) from 0x00ad: CHECK_CAST (k30.o) (r2v6 java.lang.Object)
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
                                @Override // e23.a
                                public final java.lang.Object invoke() {
                                    /*
                                        Method dump skipped, instruction units count: 202
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: j30.c.invoke():java.lang.Object");
                                }
                            };
                            mVar.K(objQ4);
                        } else {
                            aVar.getClass();
                            if (objQ4 == m.a.f135155b) {
                                objQ4 = new e23.a() { // from class: j30.c
                                    /* JADX WARN: Code duplicated, block: B:20:0x005c  */
                                    /* JADX WARN: Code duplicated, block: B:39:0x00b7  */
                                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v6 java.lang.Object, still in use, count: 2, list:
                                          (r2v6 java.lang.Object) from 0x00b5: PHI (r2 I:??) = (r2v4 java.lang.Object), (r2v6 java.lang.Object) binds: [B:37:0x00b4, B:52:0x00b5] A[DONT_GENERATE, DONT_INLINE]
                                          (r2v6 java.lang.Object) from 0x00ad: CHECK_CAST (k30.o) (r2v6 java.lang.Object)
                                        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                                        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                                        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                                        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                                        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                                        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                                        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                                        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                                        */
                                    @Override // e23.a
                                    public final java.lang.Object invoke() {
                                        /*
                                            Method dump skipped, instruction units count: 202
                                            To view this dump add '--comments-level debug' option
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: j30.c.invoke():java.lang.Object");
                                    }
                                };
                                mVar.K(objQ4);
                            }
                        }
                        k.b(0, (e23.a) objQ4, strQ4, mVar, z17);
                    }
                    x1 x1Var8 = p3.n.f135158a;
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
