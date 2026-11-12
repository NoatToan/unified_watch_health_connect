package aq1;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f12363b;

    public /* synthetic */ d0(o71.e.a aVar, List list) {
        this.f12362a = 20;
        this.f12363b = list;
    }

    /* JADX WARN: Code duplicated, block: B:131:0x025c  */
    /* JADX WARN: Code duplicated, block: B:279:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:280:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:285:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0121  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v63 */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r8v0, types: [co0.d$b, kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r8v11, types: [org.joda.time.DateTimeZone] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v22 java.lang.Object, still in use, count: 2, list:
          (r3v22 java.lang.Object) from 0x03b5: PHI (r3 I:??) = (r3v19 java.lang.Object), (r3v22 java.lang.Object) binds: [B:178:0x03b4, B:267:0x03b5] A[DONT_GENERATE, DONT_INLINE]
          (r3v22 java.lang.Object) from 0x03a7: CHECK_CAST (mm1.c) (r3v22 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 1348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aq1.d0.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ d0(List list, int i14) {
        this.f12362a = i14;
        this.f12363b = list;
    }
}
