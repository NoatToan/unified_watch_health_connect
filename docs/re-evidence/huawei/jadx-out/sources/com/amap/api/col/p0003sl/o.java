package com.amap.api.col.p0003sl;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;
import com.amap.api.maps.MapsInitializer;
import com.autonavi.base.ae.gmap.GLMapRender;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.autonavi.base.amap.api.mapcore.IGLSurfaceView;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends GLSurfaceView implements IGLSurfaceView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f3252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IAMapDelegate f3253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private GLMapRender f3254c;

    public o(Context context, boolean z) {
        this(context, z, (byte) 0);
    }

    private o(Context context, boolean z, byte b2) {
        super(context, null);
        this.f3253b = null;
        this.f3254c = null;
        this.f3252a = false;
        dn.a(this, 5, 6, 5);
        this.f3253b = new m(this, context, z);
    }

    public final IAMapDelegate a() {
        return this.f3253b;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        try {
            return this.f3253b.onTouchEvent(motionEvent);
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    @Override // android.opengl.GLSurfaceView, com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final void setRenderer(GLSurfaceView.Renderer renderer) {
        this.f3254c = (GLMapRender) renderer;
        super.setRenderer(renderer);
    }

    @Override // com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final void setEGLConfigChooser(dl dlVar) {
        super.setEGLConfigChooser((GLSurfaceView.EGLConfigChooser) dlVar);
    }

    @Override // com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final void setEGLContextFactory(dm dmVar) {
        super.setEGLContextFactory((GLSurfaceView.EGLContextFactory) dmVar);
    }

    @Override // com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final void onDetachedGLThread() {
        ee.a(ed.f2416c, "AMapGLSurfaceView onDetachedGLThread MapsInitializer.isSupportRecycleView() " + MapsInitializer.isSupportRecycleView());
        if (MapsInitializer.isSupportRecycleView()) {
            onPause();
            try {
                GLMapRender gLMapRender = this.f3254c;
                if (gLMapRender != null) {
                    gLMapRender.onDetachedFromWindow();
                }
            } catch (Throwable th) {
                th.printStackTrace();
                eb.a(th);
            }
            super.onDetachedFromWindow();
        }
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        ee.a(ed.f2416c, "AMapGLSurfaceView onPause mMapRender.mSurfacedestoryed " + this.f3254c.mSurfacedestoryed);
        if (!this.f3254c.mSurfacedestoryed) {
            queueEvent(new Runnable() { // from class: com.amap.api.col.3sl.o.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (o.this.f3254c != null) {
                        try {
                            o.this.f3254c.onSurfaceDestory();
                        } catch (Throwable th) {
                            th.printStackTrace();
                            eb.a(th);
                        }
                    }
                }
            });
            for (int i = 0; !this.f3254c.mSurfacedestoryed && i < 50; i++) {
                try {
                    Thread.sleep(20L);
                } catch (InterruptedException unused) {
                }
            }
        }
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        ee.a(ed.f2416c, "AMapGLSurfaceView onPause");
    }

    @Override // android.view.SurfaceView, android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        GLMapRender gLMapRender;
        super.onWindowVisibilityChanged(i);
        ee.a(ed.f2416c, "AMapGLSurfaceView onWindowVisibilityChanged visibility ".concat(String.valueOf(i)));
        try {
            if (i != 8 && i != 4) {
                if (i != 0 || (gLMapRender = this.f3254c) == null) {
                    return;
                }
                gLMapRender.renderResume();
                return;
            }
            GLMapRender gLMapRender2 = this.f3254c;
            if (gLMapRender2 != null) {
                gLMapRender2.renderPause();
                this.f3252a = false;
            }
        } catch (Throwable th) {
            th.printStackTrace();
            eb.a(th);
        }
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ee.a(ed.f2416c, "AMapGLSurfaceView onAttachedToWindow");
        try {
            GLMapRender gLMapRender = this.f3254c;
            if (gLMapRender != null) {
                gLMapRender.onAttachedToWindow();
            }
        } catch (Throwable th) {
            th.printStackTrace();
            eb.a(th);
        }
        onResume();
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected final void onDetachedFromWindow() {
        ee.a(ed.f2416c, "AMapGLSurfaceView onDetachedFromWindow MapsInitializer.isSupportRecycleView() " + MapsInitializer.isSupportRecycleView());
        if (MapsInitializer.isSupportRecycleView()) {
            return;
        }
        onPause();
        try {
            GLMapRender gLMapRender = this.f3254c;
            if (gLMapRender != null) {
                gLMapRender.onDetachedFromWindow();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        super.onDetachedFromWindow();
    }
}
