package et1;

import android.content.Context;
import i3.mc;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65525a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f65526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f65527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f65528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f65529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f65530f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f65531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f65532h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f65533i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f65534j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f65535k;

    public /* synthetic */ f(e23.l lVar, f4.s sVar, f4.s sVar2, f4.s sVar3, p3.p1 p1Var, f4.s sVar4, bt1.u uVar, boolean z14, bt1.u uVar2, Context context) {
        this.f65527c = lVar;
        this.f65529e = sVar;
        this.f65530f = sVar2;
        this.f65531g = sVar3;
        this.f65533i = p1Var;
        this.f65532h = sVar4;
        this.f65534j = uVar;
        this.f65526b = z14;
        this.f65535k = uVar2;
        this.f65528d = context;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x018d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v6 java.lang.Object, still in use, count: 2, list:
          (r10v6 java.lang.Object) from 0x012d: PHI (r10 I:??) = (r10v3 java.lang.Object), (r10v6 java.lang.Object) binds: [B:39:0x012c, B:103:0x012d] A[DONT_GENERATE, DONT_INLINE]
          (r10v6 java.lang.Object) from 0x011d: CHECK_CAST (us1.m) (r10v6 java.lang.Object)
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
            Method dump skipped, instruction units count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: et1.f.invoke():java.lang.Object");
    }

    public /* synthetic */ f(boolean z14, o53.b0 b0Var, e23.l lVar, String str, String str2, Context context, e23.a aVar, mc mcVar, e23.a aVar2, com.garmin.android.library.livetrack.b bVar) {
        this.f65526b = z14;
        this.f65529e = b0Var;
        this.f65527c = lVar;
        this.f65530f = str;
        this.f65531g = str2;
        this.f65528d = context;
        this.f65532h = aVar;
        this.f65533i = mcVar;
        this.f65534j = aVar2;
        this.f65535k = bVar;
    }
}
