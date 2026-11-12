package ck0;

import android.app.Activity;
import android.content.Context;
import i3.mc;
import o53.b0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f27853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f27854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f27855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f27856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f27857g;

    public /* synthetic */ j(b0 b0Var, Context context, e23.l lVar, e23.a aVar, c.q qVar, mc mcVar) {
        this.f27851a = 10;
        this.f27852b = b0Var;
        this.f27855e = context;
        this.f27857g = lVar;
        this.f27856f = aVar;
        this.f27853c = qVar;
        this.f27854d = mcVar;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0208  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [T, java.lang.Object] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v49 kx1.a, still in use, count: 2, list:
          (r2v49 kx1.a) from 0x0204: PHI (r2 I:??) = (r2v46 kx1.a), (r2v49 kx1.a) binds: [B:70:0x0203, B:168:0x0204] A[DONT_GENERATE, DONT_INLINE]
          (r2v49 kx1.a) from 0x01f4: IGET (r2v49 kx1.a) A[WRAPPED] kx1.a.a java.lang.String
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
            Method dump skipped, instruction units count: 1412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ck0.j.invoke():java.lang.Object");
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i14) {
        this.f27851a = i14;
        this.f27855e = obj;
        this.f27856f = obj2;
        this.f27852b = obj3;
        this.f27857g = obj4;
        this.f27853c = obj5;
        this.f27854d = obj6;
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, String str, Object obj4, Object obj5, int i14) {
        this.f27851a = i14;
        this.f27855e = obj;
        this.f27856f = obj2;
        this.f27852b = obj3;
        this.f27854d = str;
        this.f27857g = obj4;
        this.f27853c = obj5;
    }

    public /* synthetic */ j(e23.a aVar, c.q qVar, uu0.c cVar, Activity activity, gv0.d dVar, hl.a aVar2) {
        this.f27851a = 4;
        this.f27856f = aVar;
        this.f27855e = qVar;
        this.f27852b = cVar;
        this.f27857g = activity;
        this.f27853c = dVar;
        this.f27854d = aVar2;
    }

    public /* synthetic */ j(b0 b0Var, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i14) {
        this.f27851a = i14;
        this.f27852b = b0Var;
        this.f27855e = obj;
        this.f27856f = obj2;
        this.f27857g = obj3;
        this.f27853c = obj4;
        this.f27854d = obj5;
    }

    public /* synthetic */ j(yu0.b.C3736b c3736b, com.garmin.android.library.livetrack.b bVar, e23.a aVar, c.q qVar, ub1.g gVar, Context context) {
        this.f27851a = 7;
        this.f27855e = c3736b;
        this.f27852b = bVar;
        this.f27856f = aVar;
        this.f27857g = qVar;
        this.f27853c = gVar;
        this.f27854d = context;
    }
}
