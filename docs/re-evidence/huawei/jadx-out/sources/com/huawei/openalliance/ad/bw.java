package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.media.IMultiMediaPlayingManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class bw extends com.huawei.hms.ads.uiengine.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static bw f18298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f18299b = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f18300c;
    private IMultiMediaPlayingManager d;
    private final Map<Long, bv> e = new HashMap();

    @Override // com.huawei.hms.ads.uiengine.b
    public void d(String str, com.huawei.hms.ads.uiengine.a aVar) {
        hw.b("MultiMPlayingManagerPro", "pause %s", c(aVar));
        IMultiMediaPlayingManager iMultiMediaPlayingManager = this.d;
        if (iMultiMediaPlayingManager != null) {
            iMultiMediaPlayingManager.pause(str, d(aVar));
        }
    }

    @Override // com.huawei.hms.ads.uiengine.b
    public void c(String str, com.huawei.hms.ads.uiengine.a aVar) {
        hw.b("MultiMPlayingManagerPro", "stop %s", c(aVar));
        IMultiMediaPlayingManager iMultiMediaPlayingManager = this.d;
        if (iMultiMediaPlayingManager != null) {
            iMultiMediaPlayingManager.stop(str, d(aVar));
        }
    }

    @Override // com.huawei.hms.ads.uiengine.b
    public void b(String str, com.huawei.hms.ads.uiengine.a aVar) {
        hw.b("MultiMPlayingManagerPro", "manualPlay %s", c(aVar));
        IMultiMediaPlayingManager iMultiMediaPlayingManager = this.d;
        if (iMultiMediaPlayingManager != null) {
            iMultiMediaPlayingManager.manualPlay(str, d(aVar));
        }
    }

    @Override // com.huawei.hms.ads.uiengine.b
    public void b(com.huawei.hms.ads.uiengine.a aVar) {
        hw.b("MultiMPlayingManagerPro", "removeListeners %s", c(aVar));
        bv bvVarD = d(aVar);
        IMultiMediaPlayingManager iMultiMediaPlayingManager = this.d;
        if (iMultiMediaPlayingManager != null) {
            iMultiMediaPlayingManager.removeListenersForMediaPlayerAgent(bvVarD);
        }
    }

    @Override // com.huawei.hms.ads.uiengine.b
    public void a(String str, com.huawei.hms.ads.uiengine.a aVar) {
        hw.b("MultiMPlayingManagerPro", "autoPlay %s", c(aVar));
        IMultiMediaPlayingManager iMultiMediaPlayingManager = this.d;
        if (iMultiMediaPlayingManager != null) {
            iMultiMediaPlayingManager.autoPlay(str, d(aVar));
        }
    }

    public void a(IMultiMediaPlayingManager iMultiMediaPlayingManager) {
        this.d = iMultiMediaPlayingManager;
    }

    @Override // com.huawei.hms.ads.uiengine.b
    public void a(com.huawei.hms.ads.uiengine.a aVar) {
        Long lC = c(aVar);
        hw.b("MultiMPlayingManagerPro", "removeAgent %s", lC);
        IMultiMediaPlayingManager iMultiMediaPlayingManager = this.d;
        if (iMultiMediaPlayingManager != null) {
            iMultiMediaPlayingManager.removeMediaPlayerAgent(d(aVar));
        }
        if (lC != null) {
            this.e.remove(lC);
        }
    }

    private bv d(com.huawei.hms.ads.uiengine.a aVar) {
        bv bvVar;
        try {
            long jA = aVar.a();
            if (this.e.containsKey(Long.valueOf(jA))) {
                bvVar = this.e.get(Long.valueOf(jA));
            } else {
                bv bvVar2 = new bv(this.f18300c, aVar);
                this.e.put(Long.valueOf(jA), bvVar2);
                bvVar = bvVar2;
            }
            if (hw.a()) {
                hw.a("MultiMPlayingManagerPro", "getProxy = %s, proxy = %s", Long.valueOf(jA), bvVar);
            }
            return bvVar;
        } catch (Throwable th) {
            hw.b("MultiMPlayingManagerPro", "getProxy err: %s", th.getClass().getSimpleName());
            return null;
        }
    }

    private Long c(com.huawei.hms.ads.uiengine.a aVar) {
        if (aVar == null) {
            return null;
        }
        try {
            return Long.valueOf(aVar.a());
        } catch (Throwable th) {
            hw.b("MultiMPlayingManagerPro", "get id err: %s", th.getClass().getSimpleName());
            return null;
        }
    }

    private static bw b(Context context) {
        bw bwVar;
        synchronized (f18299b) {
            if (f18298a == null) {
                f18298a = new bw(context);
            }
            bwVar = f18298a;
        }
        return bwVar;
    }

    public static bw a(Context context) {
        return b(context);
    }

    private bw(Context context) {
        this.f18300c = context;
    }
}
