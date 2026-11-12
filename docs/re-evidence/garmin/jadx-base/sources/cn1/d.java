package cn1;

import android.content.Context;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28007c;

    public /* synthetic */ d(int i14, Context context, Object obj) {
        this.f28005a = i14;
        this.f28007c = context;
        this.f28006b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:219:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:255:0x0686  */
    /* JADX WARN: Code duplicated, block: B:304:0x07e5  */
    /* JADX WARN: Code duplicated, block: B:306:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:309:0x07ff  */
    /* JADX WARN: Code duplicated, block: B:311:0x0807  */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v16 java.lang.Object, still in use, count: 2, list:
          (r7v16 java.lang.Object) from 0x07e1: PHI (r7 I:??) = (r7v13 java.lang.Object), (r7v16 java.lang.Object) binds: [B:301:0x07e0, B:464:0x07e1] A[DONT_GENERATE, DONT_INLINE]
          (r7v16 java.lang.Object) from 0x07d3: CHECK_CAST (fj2.h) (r7v16 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r39) {
        /*
            Method dump skipped, instruction units count: 2920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cn1.d.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ d(int i14, Object obj, Object obj2) {
        this.f28005a = i14;
        this.f28006b = obj;
        this.f28007c = obj2;
    }
}
