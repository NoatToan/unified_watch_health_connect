package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.view.Surface;
import com.huawei.openalliance.ad.eh;
import com.huawei.openalliance.ad.ei;
import com.huawei.openalliance.ad.ej;
import com.huawei.openalliance.ad.ek;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dq;

/* JADX INFO: loaded from: classes41.dex */
public abstract class b extends BaseVideoView implements com.huawei.openalliance.ad.views.interfaces.u {
    private volatile boolean A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final ej f21156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected eh f21157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected ek f21158c;
    protected int d;
    protected int e;
    protected h f;
    protected Integer g;
    protected Integer h;
    protected volatile Float i;
    protected volatile boolean j;
    private final ei y;
    private float[] z;

    protected abstract String getLogTag();

    public void setVideoRatio(Float f) {
        hw.a(getLogTag(), "setVideoRatio %s", f);
        this.i = f;
    }

    protected void e() {
        a(new Runnable() { // from class: com.huawei.openalliance.ad.views.b.4
            @Override // java.lang.Runnable
            public void run() {
                b.this.j();
            }
        });
    }

    @Override // com.huawei.openalliance.ad.views.BaseVideoView, com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle
    public void destroyView() {
        super.destroyView();
        this.j = true;
        this.A = false;
        a();
    }

    @Override // com.huawei.openalliance.ad.views.BaseVideoView
    public void d() {
        a(new Runnable() { // from class: com.huawei.openalliance.ad.views.b.3
            @Override // java.lang.Runnable
            public void run() {
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                GLES20.glClear(16384);
            }
        });
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.u
    public void c() {
        if (this.j) {
            hw.c(getLogTag(), "renderVideo, destroyed");
        } else {
            a(new Runnable() { // from class: com.huawei.openalliance.ad.views.b.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (b.this.j) {
                            hw.c(b.this.getLogTag(), "renderVideo, destroyed");
                            return;
                        }
                        if (b.this.q != null) {
                            b.this.q.updateTexImage();
                        }
                        if (b.this.f21157b != null) {
                            GLES20.glViewport(0, 0, b.this.d, b.this.e);
                            b.this.f21157b.c();
                            b.this.i();
                        }
                    } catch (Throwable th) {
                        hw.a(3, b.this.getLogTag(), "render exception", th);
                    }
                }
            });
        }
    }

    protected void b(final int i, final int i2) {
        a(new Runnable() { // from class: com.huawei.openalliance.ad.views.b.5
            @Override // java.lang.Runnable
            public void run() {
                b.this.d(i, i2);
                dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.b.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        b.this.x.a(b.this.v, b.this.w);
                    }
                });
            }
        });
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.u
    public void b() {
        this.A = true;
    }

    protected void a(Runnable runnable) {
        h hVar = this.f;
        if (hVar != null) {
            hVar.a(runnable);
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.u
    public void a(h hVar) {
        this.f = hVar;
        setMediaPlayerAgent(hVar.h());
    }

    protected void a(final Surface surface) {
        a(new Runnable() { // from class: com.huawei.openalliance.ad.views.b.6
            @Override // java.lang.Runnable
            public void run() {
                b.this.b(surface);
            }
        });
    }

    protected void a(int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
        float f = i;
        float f2 = i2;
        Matrix.orthoM(this.z, 0, 0.0f, f, 0.0f, f2, -1.0f, 1.0f);
        float f3 = f / 2.0f;
        float f4 = f2 / 2.0f;
        Integer num = this.g;
        if (num != null) {
            i = num.intValue();
        }
        Integer num2 = this.h;
        if (num2 != null) {
            i2 = num2.intValue();
        }
        this.f21156a.a(i, i2);
        this.f21156a.b(f3, f4);
    }

    @Override // com.huawei.openalliance.ad.views.BaseVideoView
    public void a(float f, float f2, int i, int i2) {
        int i3 = this.s;
        if (i3 == 1) {
            a(this.d, this.e);
            return;
        }
        if (i3 != 2) {
            return;
        }
        if (f2 < f) {
            this.h = Integer.valueOf(i2);
            this.g = Integer.valueOf((int) (i2 * f));
        } else {
            this.g = Integer.valueOf(i);
            this.h = Integer.valueOf((int) (i / f));
        }
        this.f21156a.a(this.g.intValue(), this.h.intValue());
    }

    protected void a() {
        a(new Runnable() { // from class: com.huawei.openalliance.ad.views.b.1
            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f21157b != null) {
                    b.this.f21157b.e();
                    b.this.f21157b = null;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        hw.b(getLogTag(), "onSurfaceDestroyed");
        this.m = false;
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.f21158c == null || this.f21157b == null) {
            hw.c(getLogTag(), "render failed, textureProgram:%s, windowSurface:%s", dg.b(this.f21158c), dg.b(this.f21157b));
            return;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        if (this.A) {
            this.f21156a.a(this.f21158c, this.z);
            this.f21157b.d();
        }
    }

    private void e(int i, int i2) {
        this.d = i;
        this.e = i2;
        a(i, i2);
        if (this.i != null) {
            float fFloatValue = this.i.floatValue();
            int i3 = this.d;
            int i4 = this.e;
            a(fFloatValue, i3 / i4, i3, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, int i2) {
        hw.b(getLogTag(), "onSurfaceChanged");
        e(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Surface surface) {
        hw.b(getLogTag(), "onSurfaceAvailable");
        this.m = true;
        if (this.f != null && surface != null && surface.isValid()) {
            try {
                this.f.b();
                eh ehVar = new eh(this.f.g(), surface);
                this.f21157b = ehVar;
                ehVar.c();
                this.f.a();
                this.p = this.f.c();
                this.f21158c = this.f.f();
                this.f21156a.a(this.f.d());
                this.q = this.f.e();
                this.n.setSurface(this.p);
                e(this.f21157b.a(), this.f21157b.b());
                if (this.u == null) {
                    this.u = new BaseVideoView.h(this.x);
                    this.n.setVideoSizeChangeListener(this.u);
                }
                if (this.l) {
                    play(this.r);
                }
            } catch (Throwable th) {
                hw.c(getLogTag(), "exception: %s", th.getClass().getSimpleName());
            }
        }
        c();
    }

    public b(Context context) {
        super(context);
        ei eiVar = new ei();
        this.y = eiVar;
        this.f21156a = new ej(eiVar);
        this.j = false;
        this.z = new float[16];
        this.A = false;
    }
}
