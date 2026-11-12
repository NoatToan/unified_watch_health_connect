package a8;

import com.garmin.android.apps.connectmobile.settings.devices.wifi.m;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1909d;

    public /* synthetic */ d(com.garmin.android.apps.connectmobile.settings.devices.wifi.b bVar, m.b bVar2, com.garmin.android.apps.connectmobile.settings.devices.wifi.e eVar, String str, boolean z14) {
        this.f1906a = 29;
        this.f1907b = bVar;
        this.f1908c = bVar2;
        this.f1909d = eVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v12 java.lang.Object, still in use, count: 2, list:
          (r3v12 java.lang.Object) from 0x0261: PHI (r3 I:??) = (r3v9 java.lang.Object), (r3v12 java.lang.Object) binds: [B:76:0x0260, B:75:0x025f] A[DONT_GENERATE, DONT_INLINE]
          (r3v12 java.lang.Object) from 0x0253: CHECK_CAST (androidx.camera.core.impl.k0) (r3v12 java.lang.Object)
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
    @Override // java.lang.Runnable
    public final void run() {
        /*
            Method dump skipped, instruction units count: 816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.d.run():void");
    }

    public /* synthetic */ d(Object obj, int i14, Object obj2, Object obj3) {
        this.f1906a = i14;
        this.f1907b = obj;
        this.f1908c = obj2;
        this.f1909d = obj3;
    }
}
