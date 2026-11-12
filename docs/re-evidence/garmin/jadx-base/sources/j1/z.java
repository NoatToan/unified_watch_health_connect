package j1;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import b0.g1;
import com.google.common.util.concurrent.ListenableFuture;
import h0.r0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class z extends l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextureView f96331e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SurfaceTexture f96332f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.concurrent.futures.b.d f96333g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g1 f96334h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f96335i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SurfaceTexture f96336j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicReference<androidx.concurrent.futures.b.a<Void>> f96337k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a73.f f96338l;

    public z(FrameLayout frameLayout, j jVar) {
        super(frameLayout, jVar);
        this.f96335i = false;
        this.f96337k = new AtomicReference<>();
    }

    @Override // j1.l
    public final View a() {
        return this.f96331e;
    }

    @Override // j1.l
    public final Bitmap b() {
        TextureView textureView = this.f96331e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.f96331e.getBitmap();
    }

    @Override // j1.l
    public final void c() {
        if (!this.f96335i || this.f96336j == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.f96331e.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.f96336j;
        if (surfaceTexture != surfaceTexture2) {
            this.f96331e.setSurfaceTexture(surfaceTexture2);
            this.f96336j = null;
            this.f96335i = false;
        }
    }

    @Override // j1.l
    public final void d() {
        this.f96335i = true;
    }

    @Override // j1.l
    public final void e(g1 g1Var, a73.f fVar) {
        a73.f fVar2;
        this.f96288a = g1Var.f13906b;
        FrameLayout frameLayout = this.f96289b;
        frameLayout.getClass();
        this.f96288a.getClass();
        TextureView textureView = new TextureView(frameLayout.getContext());
        this.f96331e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.f96288a.getWidth(), this.f96288a.getHeight()));
        this.f96331e.setSurfaceTextureListener(new y(this));
        frameLayout.removeAllViews();
        frameLayout.addView(this.f96331e);
        g1 g1Var2 = this.f96334h;
        if (g1Var2 != null && g1Var2.d() && (fVar2 = this.f96338l) != null) {
            fVar2.a();
            this.f96338l = null;
        }
        this.f96334h = g1Var;
        this.f96338l = fVar;
        g1Var.f13916l.a(new r0(19, this, g1Var), a7.b.getMainExecutor(this.f96331e.getContext()));
        h();
    }

    @Override // j1.l
    public final ListenableFuture<Void> g() {
        androidx.concurrent.futures.b.a<Void> aVar = new androidx.concurrent.futures.b.a<>();
        androidx.concurrent.futures.b.d<T> dVar = new androidx.concurrent.futures.b.d<>(aVar);
        aVar.f6080b = dVar;
        aVar.f6079a = v.h.class;
        try {
            this.f96337k.set(aVar);
            aVar.f6079a = "textureViewImpl_waitForNextFrame";
        } catch (Exception e4) {
            dVar.a(e4);
        }
        return dVar;
    }

    public final void h() {
        SurfaceTexture surfaceTexture;
        Size size = this.f96288a;
        if (size == null || (surfaceTexture = this.f96332f) == null || this.f96334h == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.f96288a.getHeight());
        Surface surface = new Surface(this.f96332f);
        g1 g1Var = this.f96334h;
        androidx.concurrent.futures.b.d dVarA = androidx.concurrent.futures.b.a(new hc0.c(9, this, surface));
        this.f96333g = dVarA;
        dVarA.addListener(new at0.c(this, surface, dVarA, g1Var, 13), a7.b.getMainExecutor(this.f96331e.getContext()));
        this.f96291d = true;
        f();
    }
}
