package vu1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f180260b;

    public /* synthetic */ b(x5.k kVar, x5.l lVar) {
        this.f180259a = 27;
        this.f180260b = kVar;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0309  */
    /* JADX WARN: Code duplicated, block: B:124:0x030e  */
    /* JADX WARN: Code duplicated, block: B:306:0x06b8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v90, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r12v2, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v63, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r37v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v17, types: [zy2.k] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v58 java.lang.Object, still in use, count: 2, list:
          (r2v58 java.lang.Object) from 0x0305: PHI (r2 I:??) = (r2v56 java.lang.Object), (r2v58 java.lang.Object) binds: [B:119:0x0304, B:498:0x0305] A[DONT_GENERATE, DONT_INLINE]
          (r2v58 java.lang.Object) from 0x02fd: CHECK_CAST (com.garmin.feature.garminpay.providers.felica.ui.account.developer.a$b) (r2v58 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r55) {
        /*
            Method dump skipped, instruction units count: 2392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vu1.b.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ b(Object obj, int i14) {
        this.f180259a = i14;
        this.f180260b = obj;
    }
}
