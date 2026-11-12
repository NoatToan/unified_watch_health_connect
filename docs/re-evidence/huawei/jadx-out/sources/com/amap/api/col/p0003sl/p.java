package com.amap.api.col.p0003sl;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import com.amap.api.maps.MapsInitializer;
import com.autonavi.base.ae.gmap.GLMapRender;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.autonavi.base.amap.api.mapcore.IGLSurfaceView;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends aa implements IGLSurfaceView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f3259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IAMapDelegate f3260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private GLMapRender f3261c;

    @Override // com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final SurfaceHolder getHolder() {
        return null;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final void setZOrderOnTop(boolean z) {
    }

    public p(Context context, boolean z) {
        super(context);
        this.f3260b = null;
        this.f3261c = null;
        this.f3259a = false;
        if (Build.VERSION.SDK_INT >= 34) {
            dn.a(this, 8, 8, 8);
        } else {
            dn.a(this, 5, 6, 5);
        }
        this.f3260b = new m(this, context, z);
    }

    public final IAMapDelegate a() {
        return this.f3260b;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        try {
            return this.f3260b.onTouchEvent(motionEvent);
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final void setEGLConfigChooser(dl dlVar) {
        super.a(dlVar);
    }

    @Override // com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final void setEGLContextFactory(dm dmVar) {
        super.a(dmVar);
    }

    @Override // com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final void onDetachedGLThread() {
        ee.a(ed.f2416c, "AMapGLTextureView onDetachedGLThread MapsInitializer.isSupportRecycleView() " + MapsInitializer.isSupportRecycleView());
        if (MapsInitializer.isSupportRecycleView()) {
            b();
            try {
                GLMapRender gLMapRender = this.f3261c;
                if (gLMapRender != null) {
                    gLMapRender.onDetachedFromWindow();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            super.onDetachedFromWindow();
        }
    }

    @Override // com.amap.api.col.p0003sl.aa, com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final void setRenderer(GLSurfaceView.Renderer renderer) {
        this.f3261c = (GLMapRender) renderer;
        super.setRenderer(renderer);
    }

    @Override // com.amap.api.col.p0003sl.aa
    public final void b() {
        ee.a(ed.f2416c, "AMapGLTextureView onPause mMapRender.mSurfacedestoryed " + this.f3261c.mSurfacedestoryed);
        if (!this.f3261c.mSurfacedestoryed) {
            queueEvent(new Runnable() { // from class: com.amap.api.col.3sl.p.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        if (p.this.f3261c != null) {
                            p.this.f3261c.onSurfaceDestory();
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                        eb.a(th);
                    }
                }
            });
            for (int i = 0; !this.f3261c.mSurfacedestoryed && i < 50; i++) {
                try {
                    Thread.sleep(20L);
                } catch (InterruptedException unused) {
                }
            }
        }
        super.b();
    }

    @Override // com.amap.api.col.p0003sl.aa
    public final void c() {
        super.c();
        ee.a(ed.f2416c, "AMapGLTextureView onResume");
    }

    @Override // com.amap.api.col.p0003sl.aa, android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ee.a(ed.f2416c, "AMapGLTextureView onSurfaceTextureDestroyed");
        requestRender();
        try {
            if (MapsInitializer.getTextureDestroyRender()) {
                Thread.sleep(100L);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            eb.a(th);
        }
        return super.onSurfaceTextureDestroyed(surfaceTexture);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        GLMapRender gLMapRender;
        super.onWindowVisibilityChanged(i);
        ee.a(ed.f2416c, "AMapGLTextureView onWindowVisibilityChanged visibility ".concat(String.valueOf(i)));
        try {
            if (i != 8 && i != 4) {
                if (i != 0 || (gLMapRender = this.f3261c) == null) {
                    return;
                }
                gLMapRender.renderResume();
                return;
            }
            GLMapRender gLMapRender2 = this.f3261c;
            if (gLMapRender2 != null) {
                gLMapRender2.renderPause();
                this.f3259a = false;
            }
            requestRender();
        } catch (Throwable th) {
            th.printStackTrace();
            eb.a(th);
        }
    }

    @Override // com.amap.api.col.p0003sl.aa, android.view.TextureView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ee.a(ed.f2416c, "AMapGLTextureView onAttachedToWindow");
        try {
            GLMapRender gLMapRender = this.f3261c;
            if (gLMapRender != null) {
                gLMapRender.onAttachedToWindow();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        c();
    }

    @Override // com.amap.api.col.p0003sl.aa, android.view.View
    protected final void onDetachedFromWindow() {
        ee.a(ed.f2416c, "AMapGLTextureView onDetachedFromWindow MapsInitializer.isSupportRecycleView() " + MapsInitializer.isSupportRecycleView());
        if (MapsInitializer.isSupportRecycleView()) {
            return;
        }
        b();
        try {
            GLMapRender gLMapRender = this.f3261c;
            if (gLMapRender != null) {
                gLMapRender.onDetachedFromWindow();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        super.onDetachedFromWindow();
    }
}
