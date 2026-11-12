package l72;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b1 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110912a;

    public /* synthetic */ b1(int i14) {
        this.f110912a = i14;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x01a6  */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v7 java.lang.Object, still in use, count: 2, list:
          (r4v7 java.lang.Object) from 0x01a2: PHI (r4 I:??) = (r4v4 java.lang.Object), (r4v7 java.lang.Object) binds: [B:68:0x01a1, B:141:0x01a2] A[DONT_GENERATE, DONT_INLINE]
          (r4v7 java.lang.Object) from 0x0198: CHECK_CAST (pd1.b) (r4v7 java.lang.Object)
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
            Method dump skipped, instruction units count: 864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l72.b1.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ b1(Object obj, int i14) {
        this.f110912a = i14;
    }
}
