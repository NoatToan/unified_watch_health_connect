package fk0;

import android.content.Context;
import gp.g;
import o70.n;
import p3.p1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f71923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f71924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f71925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f71926d;

    public /* synthetic */ a(n nVar, g gVar, Context context, in.c cVar) {
        this.f71923a = 13;
        this.f71926d = nVar;
        this.f71925c = context;
        this.f71924b = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0207  */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v40 java.lang.Object, still in use, count: 2, list:
          (r7v40 java.lang.Object) from 0x00cb: PHI (r7 I:??) = (r7v37 java.lang.Object), (r7v40 java.lang.Object) binds: [B:31:0x00ca, B:208:0x00cb] A[DONT_GENERATE, DONT_INLINE]
          (r7v40 java.lang.Object) from 0x00bb: CHECK_CAST (g21.p) (r7v40 java.lang.Object)
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
            Method dump skipped, instruction units count: 1302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fk0.a.invoke():java.lang.Object");
    }

    public /* synthetic */ a(ak0.a aVar, Context context, p1 p1Var) {
        this.f71923a = 1;
        this.f71924b = aVar;
        this.f71925c = context;
        this.f71926d = p1Var;
    }

    public /* synthetic */ a(Object obj, int i14, Object obj2, Object obj3) {
        this.f71923a = i14;
        this.f71926d = obj;
        this.f71924b = obj2;
        this.f71925c = obj3;
    }

    public /* synthetic */ a(int i14, Context context, Object obj, Object obj2) {
        this.f71923a = i14;
        this.f71926d = obj;
        this.f71925c = context;
        this.f71924b = obj2;
    }
}
