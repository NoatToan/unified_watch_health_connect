package a11;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f351c;

    public /* synthetic */ n(int i14, Object obj, Object obj2) {
        this.f349a = i14;
        this.f350b = obj;
        this.f351c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x020f  */
    /* JADX WARN: Code duplicated, block: B:156:0x0349  */
    /* JADX WARN: Code duplicated, block: B:159:0x0358  */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v22 java.lang.Object, still in use, count: 2, list:
          (r4v22 java.lang.Object) from 0x020d: PHI (r4 I:??) = (r4v20 java.lang.Object), (r4v22 java.lang.Object) binds: [B:101:0x020c, B:222:0x020d] A[DONT_GENERATE, DONT_INLINE]
          (r4v22 java.lang.Object) from 0x0205: CHECK_CAST (we0.h) (r4v22 java.lang.Object)
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
            Method dump skipped, instruction units count: 1306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a11.n.invoke():java.lang.Object");
    }
}
