package com.amap.api.col.p0003sl;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;
import com.amap.api.maps.MapsInitializer;
import com.autonavi.base.ae.gmap.GLMapRender;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.autonavi.base.amap.api.mapcore.IGLSurfaceView;
import defpackage.bls;
import defpackage.gos;
import defpackage.jos;
import defpackage.zns;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends GLSurfaceView implements IGLSurfaceView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IAMapDelegate f6221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GLMapRender f6222b;
    public boolean c;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (o.this.f6222b != null) {
                try {
                    o.this.f6222b.onSurfaceDestory();
                } catch (Throwable th) {
                    th.printStackTrace();
                    zns.E(th);
                }
            }
        }
    }

    public o(Context context, boolean z) {
        this(context, z, (byte) 0);
    }

    public final IAMapDelegate b() {
        return this.f6221a;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jos.e(gos.c, "AMapGLSurfaceView onAttachedToWindow");
        try {
            GLMapRender gLMapRender = this.f6222b;
            if (gLMapRender != null) {
                gLMapRender.onAttachedToWindow();
            }
        } catch (Throwable th) {
            th.printStackTrace();
            zns.E(th);
        }
        onResume();
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        jos.e(gos.c, "AMapGLSurfaceView onDetachedFromWindow MapsInitializer.isSupportRecycleView() " + MapsInitializer.isSupportRecycleView());
        if (MapsInitializer.isSupportRecycleView()) {
            return;
        }
        onPause();
        try {
            GLMapRender gLMapRender = this.f6222b;
            if (gLMapRender != null) {
                gLMapRender.onDetachedFromWindow();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        super.onDetachedFromWindow();
    }

    @Override // com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final void onDetachedGLThread() {
        jos.e(gos.c, "AMapGLSurfaceView onDetachedGLThread MapsInitializer.isSupportRecycleView() " + MapsInitializer.isSupportRecycleView());
        if (MapsInitializer.isSupportRecycleView()) {
            onPause();
            try {
                GLMapRender gLMapRender = this.f6222b;
                if (gLMapRender != null) {
                    gLMapRender.onDetachedFromWindow();
                }
            } catch (Throwable th) {
                th.printStackTrace();
                zns.E(th);
            }
            super.onDetachedFromWindow();
        }
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        jos.e(gos.c, "AMapGLSurfaceView onPause mMapRender.mSurfacedestoryed " + this.f6222b.mSurfacedestoryed);
        if (!this.f6222b.mSurfacedestoryed) {
            queueEvent(new a());
            int i = 0;
            while (!this.f6222b.mSurfacedestoryed) {
                int i2 = i + 1;
                if (i >= 50) {
                    break;
                }
                try {
                    Thread.sleep(20L);
                } catch (InterruptedException unused) {
                }
                i = i2;
            }
        }
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        jos.e(gos.c, "AMapGLSurfaceView onPause");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        try {
            return this.f6221a.onTouchEvent(motionEvent);
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        jos.e(gos.c, "AMapGLSurfaceView onWindowVisibilityChanged visibility ".concat(String.valueOf(i)));
        try {
            if (i == 8 || i == 4) {
                GLMapRender gLMapRender = this.f6222b;
                if (gLMapRender != null) {
                    gLMapRender.renderPause();
                    this.c = false;
                }
            } else {
                if (i != 0) {
                    return;
                }
                GLMapRender gLMapRender2 = this.f6222b;
                if (gLMapRender2 != null) {
                    gLMapRender2.renderResume();
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
            zns.E(th);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final void setEGLConfigChooser(n nVar) {
        super.setEGLConfigChooser((GLSurfaceView.EGLConfigChooser) nVar);
    }

    @Override // com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final void setEGLContextFactory(q qVar) {
        super.setEGLContextFactory((GLSurfaceView.EGLContextFactory) qVar);
    }

    @Override // android.opengl.GLSurfaceView, com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final void setRenderer(GLSurfaceView.Renderer renderer) {
        this.f6222b = (GLMapRender) renderer;
        super.setRenderer(renderer);
    }

    public o(Context context, boolean z, byte b2) {
        super(context, null);
        this.f6221a = null;
        this.f6222b = null;
        this.c = false;
        bls.a(this, 5, 6, 5);
        this.f6221a = new i1(this, context, z);
    }
}
