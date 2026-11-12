package fg2;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class e implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f71475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f71476b;

    public /* synthetic */ e(f fVar, int i14) {
        this.f71475a = i14;
        this.f71476b = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x014d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x012b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0131  */
    /* JADX WARN: Code duplicated, block: B:66:0x0153  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v4 yg2.a, still in use, count: 2, list:
          (r6v4 yg2.a) from 0x0127: PHI (r6 I:??) = (r6v1 yg2.a), (r6v4 yg2.a) binds: [B:57:0x0126, B:112:0x0127] A[DONT_GENERATE, DONT_INLINE]
          (r6v4 yg2.a) from 0x011f: INVOKE (r6v4 yg2.a) VIRTUAL call: yg2.a.a():int A[MD:():int (m), WRAPPED]
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
    public final java.lang.Object invoke(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fg2.e.invoke(java.lang.Object):java.lang.Object");
    }
}
