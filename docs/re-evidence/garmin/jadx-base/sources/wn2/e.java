package wn2;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class e implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f186355a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.feature.garminpay.providers.felica.ui.account.developer.a.C1049a f186356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f186357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f186358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pn2.m f186359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f186360f;

    public /* synthetic */ e(com.garmin.feature.garminpay.providers.felica.ui.account.developer.a.C1049a c1049a, pn2.m mVar, String str, String str2, String str3) {
        this.f186356b = c1049a;
        this.f186359e = mVar;
        this.f186357c = str;
        this.f186358d = str2;
        this.f186360f = str3;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0095  */
    /* JADX WARN: Code duplicated, block: B:25:0x0098  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b3  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v7 java.lang.Object, still in use, count: 2, list:
          (r3v7 java.lang.Object) from 0x0091: PHI (r3 I:??) = (r3v1 java.lang.Object), (r3v7 java.lang.Object) binds: [B:21:0x0090, B:36:0x0091] A[DONT_GENERATE, DONT_INLINE]
          (r3v7 java.lang.Object) from 0x0089: CHECK_CAST (com.garmin.feature.garminpay.providers.felica.ui.account.developer.a$b) (r3v7 java.lang.Object)
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
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wn2.e.call():java.lang.Object");
    }

    public /* synthetic */ e(com.garmin.feature.garminpay.providers.felica.ui.account.developer.a aVar, com.garmin.feature.garminpay.providers.felica.ui.account.developer.a.C1049a c1049a, String str, String str2, pn2.m mVar) {
        this.f186360f = aVar;
        this.f186356b = c1049a;
        this.f186357c = str;
        this.f186358d = str2;
        this.f186359e = mVar;
    }
}
