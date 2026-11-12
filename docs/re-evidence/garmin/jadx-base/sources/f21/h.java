package f21;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.f f68538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g21.r f68539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f68540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l22.a f68541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f68542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v21.e f68543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f68544h;

    public /* synthetic */ h(i53.f fVar, g21.r rVar, List list, l22.a aVar, v21.e eVar, long j8, String str) {
        this.f68537a = 2;
        this.f68538b = fVar;
        this.f68539c = rVar;
        this.f68540d = list;
        this.f68541e = aVar;
        this.f68543g = eVar;
        this.f68544h = j8;
        this.f68542f = str;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0064  */
    /* JADX WARN: Code duplicated, block: B:14:0x0067  */
    /* JADX WARN: Code duplicated, block: B:17:0x0071  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:35:0x010b  */
    /* JADX WARN: Code duplicated, block: B:37:0x010e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0118  */
    /* JADX WARN: Code duplicated, block: B:50:0x019f  */
    /* JADX WARN: Code duplicated, block: B:51:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:56:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:61:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:63:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e1  */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v5 java.lang.Object, still in use, count: 2, list:
          (r13v5 java.lang.Object) from 0x019b: PHI (r13 I:??) = (r13v1 java.lang.Object), (r13v5 java.lang.Object) binds: [B:47:0x019a, B:74:0x019b] A[DONT_GENERATE, DONT_INLINE]
          (r13v5 java.lang.Object) from 0x0189: CHECK_CAST (s21.n) (r13v5 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r19, java.lang.Object r20, java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f21.h.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ h(i53.f fVar, g21.r rVar, List list, l22.a aVar, i53.f fVar2, v21.e eVar, long j8, int i14) {
        this.f68537a = i14;
        this.f68538b = fVar;
        this.f68539c = rVar;
        this.f68540d = list;
        this.f68541e = aVar;
        this.f68542f = fVar2;
        this.f68543g = eVar;
        this.f68544h = j8;
    }
}
