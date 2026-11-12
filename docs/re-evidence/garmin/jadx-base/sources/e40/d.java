package e40;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f62847b;

    public /* synthetic */ d(Object obj, int i14) {
        this.f62846a = i14;
        this.f62847b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:201:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x011a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x011c A[Catch: all -> 0x010d, LOOP:2: B:50:0x00d7->B:65:0x011c, LOOP_END, TryCatch #2 {all -> 0x010d, blocks: (B:58:0x0107, B:62:0x0111, B:67:0x0125, B:65:0x011c), top: B:195:0x0107 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v9 java.lang.Object, still in use, count: 2, list:
          (r3v9 java.lang.Object) from 0x0388: PHI (r3 I:??) = (r3v6 java.lang.Object), (r3v9 java.lang.Object) binds: [B:178:0x0387, B:211:0x0388] A[DONT_GENERATE, DONT_INLINE]
          (r3v9 java.lang.Object) from 0x0380: CHECK_CAST (e40.f$b) (r3v9 java.lang.Object)
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
            Method dump skipped, instruction units count: 1012
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e40.d.invoke():java.lang.Object");
    }
}
