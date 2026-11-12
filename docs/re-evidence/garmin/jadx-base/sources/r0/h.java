package r0;

import android.content.Context;
import com.garmin.device.ciq.http.requests.oauth.ConnectIQOAuthRequest;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f148721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f148722c;

    public /* synthetic */ h(s10.b bVar, Context context, ConnectIQOAuthRequest connectIQOAuthRequest) {
        this.f148720a = 9;
        this.f148721b = context;
        this.f148722c = connectIQOAuthRequest;
    }

    /* JADX WARN: Code duplicated, block: B:191:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:192:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:194:0x04d9  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v13 java.lang.Object, still in use, count: 2, list:
          (r6v13 java.lang.Object) from 0x04b1: PHI (r6 I:??) = (r6v10 java.lang.Object), (r6v13 java.lang.Object) binds: [B:188:0x04b0, B:280:0x04b1] A[DONT_GENERATE, DONT_INLINE]
          (r6v13 java.lang.Object) from 0x04a7: CHECK_CAST (java.lang.String) (r6v13 java.lang.Object)
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
            Method dump skipped, instruction units count: 1586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.h.run():void");
    }

    public /* synthetic */ h(i iVar, g gVar, androidx.concurrent.futures.b.a aVar) {
        this.f148720a = 0;
        this.f148721b = iVar;
        this.f148722c = aVar;
    }

    public /* synthetic */ h(int i14, Object obj, Object obj2) {
        this.f148720a = i14;
        this.f148721b = obj;
        this.f148722c = obj2;
    }
}
