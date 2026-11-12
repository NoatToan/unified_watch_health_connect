package ca0;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j1 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26302c;

    public /* synthetic */ j1(cw2.f fVar, dx2.c cVar, Map map) {
        this.f26300a = 20;
        this.f26301b = fVar;
        this.f26302c = map;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x012f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:? A[LOOP:4: B:47:0x011b->B:136:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x018b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:41:0x0106  */
    /* JADX WARN: Code duplicated, block: B:46:0x0117  */
    /* JADX WARN: Code duplicated, block: B:49:0x0121  */
    /* JADX WARN: Code duplicated, block: B:54:0x014c A[LOOP:5: B:52:0x0146->B:54:0x014c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x0191  */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v9 dy1.h, still in use, count: 2, list:
          (r11v9 dy1.h) from 0x00e9: PHI (r11 I:??) = (r11v2 dy1.h), (r11v9 dy1.h) binds: [B:33:0x00e8, B:129:0x00e9] A[DONT_GENERATE, DONT_INLINE]
          (r11v9 dy1.h) from 0x00e3: IGET (r11v9 dy1.h) A[WRAPPED] dy1.h.c boolean
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
            Method dump skipped, instruction units count: 842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ca0.j1.invoke():java.lang.Object");
    }

    public /* synthetic */ j1(int i14, Object obj, Object obj2) {
        this.f26300a = i14;
        this.f26301b = obj;
        this.f26302c = obj2;
    }
}
