package ak0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class m implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3650d;

    public /* synthetic */ m(c60.a aVar, androidx.fragment.app.v vVar, e23.a aVar2) {
        this.f3647a = 20;
        this.f3648b = aVar;
        this.f3650d = vVar;
        this.f3649c = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:179:0x051d  */
    /* JADX WARN: Code duplicated, block: B:181:0x0521  */
    /* JADX WARN: Code duplicated, block: B:182:0x0530  */
    /* JADX WARN: Code duplicated, block: B:227:0x0541 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:81:0x01fd  */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v9 java.lang.Object, still in use, count: 2, list:
          (r4v9 java.lang.Object) from 0x0519: PHI (r4 I:??) = (r4v6 java.lang.Object), (r4v9 java.lang.Object) binds: [B:176:0x0518, B:229:0x0519] A[DONT_GENERATE, DONT_INLINE]
          (r4v9 java.lang.Object) from 0x050f: CHECK_CAST (s21.j) (r4v9 java.lang.Object)
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
            Method dump skipped, instruction units count: 1572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ak0.m.invoke():java.lang.Object");
    }

    public /* synthetic */ m(e23.a aVar, e23.l lVar, bb1.g gVar) {
        this.f3647a = 14;
        this.f3649c = aVar;
        this.f3648b = lVar;
        this.f3650d = gVar;
    }

    public /* synthetic */ m(Object obj, int i14, Object obj2, Object obj3) {
        this.f3647a = i14;
        this.f3648b = obj;
        this.f3649c = obj2;
        this.f3650d = obj3;
    }
}
