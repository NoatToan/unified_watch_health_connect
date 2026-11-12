package f21;

import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.f f68585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f68586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g21.v f68587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o4.d0 f68588e;

    public /* synthetic */ l(i53.f fVar, Context context, g21.v vVar, o4.d0 d0Var, int i14) {
        this.f68584a = i14;
        this.f68585b = fVar;
        this.f68586c = context;
        this.f68587d = vVar;
        this.f68588e = d0Var;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v9 java.lang.Object, still in use, count: 2, list:
          (r0v9 java.lang.Object) from 0x00e4: PHI (r0 I:??) = (r0v6 java.lang.Object), (r0v9 java.lang.Object) binds: [B:44:0x00e3, B:60:0x00e4] A[DONT_GENERATE, DONT_INLINE]
          (r0v9 java.lang.Object) from 0x00da: CHECK_CAST (m92.h0$e$a) (r0v9 java.lang.Object)
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
    @Override // e23.q
    public final java.lang.Object invoke(java.lang.Object r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f21.l.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
