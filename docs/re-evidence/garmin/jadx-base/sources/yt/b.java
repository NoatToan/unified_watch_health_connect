package yt;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f199269b;

    public /* synthetic */ b(h hVar, int i14) {
        this.f199268a = i14;
        this.f199269b = hVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v6 java.lang.Object, still in use, count: 2, list:
          (r7v6 java.lang.Object) from 0x0285: PHI (r7 I:??) = (r7v3 java.lang.Object), (r7v6 java.lang.Object) binds: [B:112:0x0284, B:161:0x0285] A[DONT_GENERATE, DONT_INLINE]
          (r7v6 java.lang.Object) from 0x0275: CHECK_CAST (com.airbnb.lottie.model.Marker) (r7v6 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 1012
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yt.b.invoke(java.lang.Object):java.lang.Object");
    }
}
