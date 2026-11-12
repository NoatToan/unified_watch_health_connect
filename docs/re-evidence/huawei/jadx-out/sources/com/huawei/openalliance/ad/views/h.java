package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.huawei.openalliance.ad.eg;
import com.huawei.openalliance.ad.ek;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.media.MediaPlayerAgent;
import com.huawei.openalliance.ad.utils.ap;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes41.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ap f21237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private eg f21238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MediaPlayerAgent f21239c;
    private ek d;
    private SurfaceTexture e;
    private int f;
    private Surface g;
    private final Set<WeakReference<com.huawei.openalliance.ad.views.interfaces.u>> h;
    private SurfaceTexture.OnFrameAvailableListener i;

    public void i() {
        ek ekVar = this.d;
        if (ekVar != null) {
            ekVar.a();
            this.d = null;
        }
        eg egVar = this.f21238b;
        if (egVar != null) {
            egVar.b();
            this.f21238b.a();
            this.f21238b = null;
        }
        SurfaceTexture surfaceTexture = this.e;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    public MediaPlayerAgent h() {
        MediaPlayerAgent mediaPlayerAgent;
        synchronized (this) {
            mediaPlayerAgent = this.f21239c;
        }
        return mediaPlayerAgent;
    }

    eg g() {
        eg egVar;
        synchronized (this) {
            egVar = this.f21238b;
        }
        return egVar;
    }

    protected void finalize() throws Throwable {
        super.finalize();
        this.f21237a.b();
    }

    ek f() {
        ek ekVar;
        synchronized (this) {
            ekVar = this.d;
        }
        return ekVar;
    }

    SurfaceTexture e() {
        SurfaceTexture surfaceTexture;
        synchronized (this) {
            surfaceTexture = this.e;
        }
        return surfaceTexture;
    }

    int d() {
        int i;
        synchronized (this) {
            i = this.f;
        }
        return i;
    }

    Surface c() {
        Surface surface;
        synchronized (this) {
            surface = this.g;
        }
        return surface;
    }

    public void b(com.huawei.openalliance.ad.views.interfaces.u uVar) {
        WeakReference<com.huawei.openalliance.ad.views.interfaces.u> weakReference = null;
        for (WeakReference<com.huawei.openalliance.ad.views.interfaces.u> weakReference2 : this.h) {
            if (weakReference2.get() == uVar) {
                weakReference = weakReference2;
            }
        }
        if (weakReference != null) {
            this.h.remove(weakReference);
        }
    }

    void b() {
        synchronized (this) {
            if (this.f21238b != null) {
                return;
            }
            this.f21238b = new eg();
        }
    }

    void a(Runnable runnable) {
        this.f21237a.a(runnable);
    }

    public void a(com.huawei.openalliance.ad.views.interfaces.u uVar) {
        uVar.a(this);
        this.h.add(new WeakReference<>(uVar));
    }

    void a() {
        synchronized (this) {
            try {
                if (this.d != null) {
                    return;
                }
                ek ekVar = new ek();
                this.d = ekVar;
                this.f = ekVar.b();
                SurfaceTexture surfaceTexture = new SurfaceTexture(this.f);
                this.e = surfaceTexture;
                surfaceTexture.setOnFrameAvailableListener(this.i);
                Surface surface = new Surface(this.e);
                this.g = surface;
                this.f21239c.setSurface(surface);
            } catch (Throwable th) {
                hw.a(5, "MultiSurfacesVideoMixer", "init texture", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        Iterator<WeakReference<com.huawei.openalliance.ad.views.interfaces.u>> it = this.h.iterator();
        while (it.hasNext()) {
            com.huawei.openalliance.ad.views.interfaces.u uVar = it.next().get();
            if (uVar != null) {
                uVar.b();
                uVar.c();
            }
        }
    }

    public h(Context context) {
        ap apVar = new ap("video_render");
        this.f21237a = apVar;
        this.h = new CopyOnWriteArraySet();
        this.i = new SurfaceTexture.OnFrameAvailableListener() { // from class: com.huawei.openalliance.ad.views.h.1
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                h.this.j();
            }
        };
        this.f21239c = new MediaPlayerAgent(context);
        apVar.a();
    }
}
