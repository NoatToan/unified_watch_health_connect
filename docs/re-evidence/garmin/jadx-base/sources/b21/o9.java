package b21;

import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o9 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15114f;

    public /* synthetic */ o9(e23.l lVar, boolean z14, e23.a aVar, p3.n1 n1Var, p3.l1 l1Var) {
        this.f15109a = 3;
        this.f15114f = lVar;
        this.f15110b = z14;
        this.f15112d = aVar;
        this.f15113e = n1Var;
        this.f15111c = l1Var;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02f4  */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v10 java.lang.Object, still in use, count: 2, list:
          (r11v10 java.lang.Object) from 0x02eb: PHI (r11 I:??) = (r11v7 java.lang.Object), (r11v10 java.lang.Object) binds: [B:94:0x02ea, B:126:0x02eb] A[DONT_GENERATE, DONT_INLINE]
          (r11v10 java.lang.Object) from 0x02df: CHECK_CAST (l01.d) (r11v10 java.lang.Object)
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
            Method dump skipped, instruction units count: 898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b21.o9.invoke():java.lang.Object");
    }

    public /* synthetic */ o9(Object obj, boolean z14, Object obj2, Object obj3, Object obj4, int i14) {
        this.f15109a = i14;
        this.f15112d = obj;
        this.f15110b = z14;
        this.f15113e = obj2;
        this.f15114f = obj3;
        this.f15111c = obj4;
    }

    public /* synthetic */ o9(ta0.x xVar, boolean z14, e23.l lVar, l90.k kVar, ca0.t1 t1Var) {
        this.f15109a = 4;
        this.f15112d = xVar;
        this.f15110b = z14;
        this.f15114f = lVar;
        this.f15113e = kVar;
        this.f15111c = t1Var;
    }

    public /* synthetic */ o9(boolean z14, f4.s sVar, Context context, String str, p3.p1 p1Var) {
        this.f15109a = 1;
        this.f15110b = z14;
        this.f15112d = sVar;
        this.f15113e = context;
        this.f15114f = str;
        this.f15111c = p1Var;
    }
}
