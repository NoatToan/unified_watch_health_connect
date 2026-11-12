package ot1;

import android.content.Context;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class p implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f133812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qt1.k f133813c;

    public /* synthetic */ p(Context context, qt1.k kVar, int i14) {
        this.f133811a = i14;
        this.f133812b = context;
        this.f133813c = kVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v17 pt1.x, still in use, count: 2, list:
          (r2v17 pt1.x) from 0x0204: PHI (r2 I:??) = (r2v15 pt1.x), (r2v17 pt1.x) binds: [B:54:0x0203, B:99:0x0204] A[DONT_GENERATE, DONT_INLINE]
          (r2v17 pt1.x) from 0x01fc: IGET (r2v17 pt1.x) A[WRAPPED] pt1.x.a long
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
    public final java.lang.Object invoke(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 978
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ot1.p.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ p(qt1.k kVar, Context context, int i14) {
        this.f133811a = i14;
        this.f133813c = kVar;
        this.f133812b = context;
    }
}
