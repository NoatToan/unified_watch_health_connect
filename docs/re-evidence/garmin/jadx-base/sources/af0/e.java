package af0;

import android.content.Context;
import p3.n1;
import p3.x3;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3043e;

    public /* synthetic */ e(Context context, n1 n1Var, n1 n1Var2, n1 n1Var3) {
        this.f3039a = 21;
        this.f3042d = context;
        this.f3040b = n1Var;
        this.f3041c = n1Var2;
        this.f3043e = n1Var3;
    }

    /* JADX WARN: Code duplicated, block: B:278:0x0851  */
    /* JADX WARN: Code duplicated, block: B:281:0x088e  */
    /* JADX WARN: Code duplicated, block: B:282:0x08d3  */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v5 java.lang.Object, still in use, count: 2, list:
          (r10v5 java.lang.Object) from 0x084d: PHI (r10 I:??) = (r10v1 java.lang.Object), (r10v5 java.lang.Object) binds: [B:275:0x084c, B:313:0x084d] A[DONT_GENERATE, DONT_INLINE]
          (r10v5 java.lang.Object) from 0x0845: CHECK_CAST (we0.h) (r10v5 java.lang.Object)
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
            Method dump skipped, instruction units count: 2326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: af0.e.invoke():java.lang.Object");
    }

    public /* synthetic */ e(int i14, Context context, Object obj, Object obj2, Object obj3) {
        this.f3039a = i14;
        this.f3040b = obj;
        this.f3041c = obj2;
        this.f3043e = obj3;
        this.f3042d = context;
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, int i14) {
        this.f3039a = i14;
        this.f3040b = obj;
        this.f3041c = obj2;
        this.f3042d = obj3;
        this.f3043e = obj4;
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, x3 x3Var, int i14) {
        this.f3039a = i14;
        this.f3040b = obj;
        this.f3042d = obj2;
        this.f3041c = obj3;
        this.f3043e = x3Var;
    }
}
