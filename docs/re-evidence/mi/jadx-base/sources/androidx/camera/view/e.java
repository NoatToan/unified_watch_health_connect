package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.RequiresApi;
import androidx.camera.core.r;
import androidx.core.util.Consumer;
import defpackage.cb3;
import defpackage.g6i;
import defpackage.jua;
import defpackage.lhe;
import defpackage.li3;
import defpackage.ni4;
import defpackage.oua;
import defpackage.zpe;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class e extends c {
    public TextureView e;
    public SurfaceTexture f;
    public lhe<r.f> g;
    public r h;
    public boolean i;
    public SurfaceTexture j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AtomicReference<cb3.a<Void>> f1860k;
    public c.a l;

    public class a implements TextureView.SurfaceTextureListener {

        /* JADX INFO: renamed from: androidx.camera.view.e$a$a, reason: collision with other inner class name */
        public class C0016a implements jua<r.f> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ SurfaceTexture f1862a;

            public C0016a(SurfaceTexture surfaceTexture) {
                this.f1862a = surfaceTexture;
            }

            @Override // defpackage.jua
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(r.f fVar) {
                g6i.j(fVar.a() != 3, "Unexpected result from SurfaceRequest. Surface was provided twice.");
                zpe.a("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
                this.f1862a.release();
                e eVar = e.this;
                if (eVar.j != null) {
                    eVar.j = null;
                }
            }

            @Override // defpackage.jua
            public void onFailure(Throwable th) {
                throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
            }
        }

        public a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            zpe.a("TextureViewImpl", "SurfaceTexture available. Size: " + i + "x" + i2);
            e eVar = e.this;
            eVar.f = surfaceTexture;
            if (eVar.g == null) {
                eVar.u();
                return;
            }
            g6i.g(eVar.h);
            zpe.a("TextureViewImpl", "Surface invalidated " + e.this.h);
            e.this.h.k().c();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            e eVar = e.this;
            eVar.f = null;
            lhe<r.f> lheVar = eVar.g;
            if (lheVar == null) {
                zpe.a("TextureViewImpl", "SurfaceTexture about to be destroyed");
                return true;
            }
            oua.b(lheVar, new C0016a(surfaceTexture), ni4.h(e.this.e.getContext()));
            e.this.j = surfaceTexture;
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            zpe.a("TextureViewImpl", "SurfaceTexture size changed: " + i + "x" + i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            cb3.a<Void> andSet = e.this.f1860k.getAndSet(null);
            if (andSet != null) {
                andSet.c(null);
            }
        }
    }

    public e(FrameLayout frameLayout, b bVar) {
        super(frameLayout, bVar);
        this.i = false;
        this.f1860k = new AtomicReference<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(r rVar) {
        r rVar2 = this.h;
        if (rVar2 != null && rVar2 == rVar) {
            this.h = null;
            this.g = null;
        }
        s();
    }

    private void s() {
        c.a aVar = this.l;
        if (aVar != null) {
            aVar.a();
            this.l = null;
        }
    }

    @Override // androidx.camera.view.c
    public View b() {
        return this.e;
    }

    @Override // androidx.camera.view.c
    public Bitmap c() {
        TextureView textureView = this.e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.e.getBitmap();
    }

    @Override // androidx.camera.view.c
    public void d() {
        t();
    }

    @Override // androidx.camera.view.c
    public void e() {
        this.i = true;
    }

    @Override // androidx.camera.view.c
    public void g(final r rVar, c.a aVar) {
        this.f1856a = rVar.l();
        this.l = aVar;
        n();
        r rVar2 = this.h;
        if (rVar2 != null) {
            rVar2.y();
        }
        this.h = rVar;
        rVar.i(ni4.h(this.e.getContext()), new Runnable() { // from class: x8p
            @Override // java.lang.Runnable
            public final void run() {
                this.f38867a.o(rVar);
            }
        });
        u();
    }

    @Override // androidx.camera.view.c
    public lhe<Void> i() {
        return cb3.a(new cb3.c() { // from class: w8p
            @Override // cb3.c
            public final Object a(cb3.a aVar) {
                return this.f37729a.r(aVar);
            }
        });
    }

    public void n() {
        g6i.g(this.f1857b);
        g6i.g(this.f1856a);
        TextureView textureView = new TextureView(this.f1857b.getContext());
        this.e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.f1856a.getWidth(), this.f1856a.getHeight()));
        this.e.setSurfaceTextureListener(new a());
        this.f1857b.removeAllViews();
        this.f1857b.addView(this.e);
    }

    public final /* synthetic */ Object p(Surface surface, final cb3.a aVar) throws Exception {
        zpe.a("TextureViewImpl", "Surface set on Preview.");
        r rVar = this.h;
        Executor executorA = li3.a();
        Objects.requireNonNull(aVar);
        rVar.v(surface, executorA, new Consumer() { // from class: a9p
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                aVar.c((r.f) obj);
            }
        });
        return "provideSurface[request=" + this.h + " surface=" + surface + "]";
    }

    public final /* synthetic */ void q(Surface surface, lhe lheVar, r rVar) {
        zpe.a("TextureViewImpl", "Safe to release surface.");
        s();
        surface.release();
        if (this.g == lheVar) {
            this.g = null;
        }
        if (this.h == rVar) {
            this.h = null;
        }
    }

    public final /* synthetic */ Object r(cb3.a aVar) throws Exception {
        this.f1860k.set(aVar);
        return "textureViewImpl_waitForNextFrame";
    }

    public final void t() {
        if (!this.i || this.j == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.e.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.j;
        if (surfaceTexture != surfaceTexture2) {
            this.e.setSurfaceTexture(surfaceTexture2);
            this.j = null;
            this.i = false;
        }
    }

    public void u() {
        SurfaceTexture surfaceTexture;
        Size size = this.f1856a;
        if (size == null || (surfaceTexture = this.f) == null || this.h == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.f1856a.getHeight());
        final Surface surface = new Surface(this.f);
        final r rVar = this.h;
        final lhe<r.f> lheVarA = cb3.a(new cb3.c() { // from class: y8p
            @Override // cb3.c
            public final Object a(cb3.a aVar) {
                return this.f39937a.p(surface, aVar);
            }
        });
        this.g = lheVarA;
        lheVarA.addListener(new Runnable() { // from class: z8p
            @Override // java.lang.Runnable
            public final void run() {
                this.f41031a.q(surface, lheVarA, rVar);
            }
        }, ni4.h(this.e.getContext()));
        f();
    }
}
