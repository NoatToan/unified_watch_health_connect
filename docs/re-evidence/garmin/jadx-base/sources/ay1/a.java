package ay1;

import e23.l;
import ey1.j;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f13656b;

    public /* synthetic */ a(j jVar, int i14) {
        this.f13655a = i14;
        this.f13656b = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x01d8  */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v7 dy1.d, still in use, count: 2, list:
          (r12v7 dy1.d) from 0x019b: PHI (r12 I:??) = (r12v4 dy1.d), (r12v7 dy1.d) binds: [B:88:0x019a, B:128:0x019b] A[DONT_GENERATE, DONT_INLINE]
          (r12v7 dy1.d) from 0x0195: IGET (r12v7 dy1.d) A[WRAPPED] dy1.d.a mx1.a
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
    public final java.lang.Object invoke(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ay1.a.invoke(java.lang.Object):java.lang.Object");
    }
}
