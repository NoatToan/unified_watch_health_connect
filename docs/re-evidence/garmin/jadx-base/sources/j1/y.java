package j1;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import b0.g1;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class y implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f96328a;

    public class a implements l0.c<g1.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SurfaceTexture f96329a;

        public a(SurfaceTexture surfaceTexture) {
            this.f96329a = surfaceTexture;
        }

        @Override // l0.c
        public final void onFailure(Throwable th3) {
            throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th3);
        }

        @Override // l0.c
        public final void onSuccess(g1.f fVar) {
            k7.h.f(fVar.a() != 3, "Unexpected result from SurfaceRequest. Surface was provided twice.");
            this.f96329a.release();
            z zVar = y.this.f96328a;
            if (zVar.f96336j != null) {
                zVar.f96336j = null;
            }
        }
    }

    public y(z zVar) {
        this.f96328a = zVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i14, int i15) {
        z zVar = this.f96328a;
        zVar.f96332f = surfaceTexture;
        if (zVar.f96333g == null) {
            zVar.h();
            return;
        }
        zVar.f96334h.getClass();
        Objects.toString(zVar.f96334h);
        zVar.f96334h.f13917m.a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        z zVar = this.f96328a;
        zVar.f96332f = null;
        androidx.concurrent.futures.b.d dVar = zVar.f96333g;
        if (dVar == null) {
            return true;
        }
        l0.j.a(dVar, new a(surfaceTexture), a7.b.getMainExecutor(zVar.f96331e.getContext()));
        zVar.f96336j = surfaceTexture;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i14, int i15) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        androidx.concurrent.futures.b.a<Void> andSet = this.f96328a.f96337k.getAndSet(null);
        if (andSet != null) {
            andSet.b(null);
        }
    }
}
