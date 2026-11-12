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
import defpackage.bls;
import defpackage.gos;
import defpackage.jos;
import defpackage.zns;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends aa implements IGLSurfaceView {
    public IAMapDelegate l;
    public GLMapRender m;
    public boolean n;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (p.this.m != null) {
                    p.this.m.onSurfaceDestory();
                }
            } catch (Throwable th) {
                th.printStackTrace();
                zns.E(th);
            }
        }
    }

    public p(Context context, boolean z) {
        super(context);
        this.l = null;
        this.m = null;
        this.n = false;
        if (Build.VERSION.SDK_INT >= 34) {
            bls.a(this, 8, 8, 8);
        } else {
            bls.a(this, 5, 6, 5);
        }
        this.l = new i1(this, context, z);
    }

    @Override // com.amap.api.col.p0003sl.aa
    public final void f() {
        jos.e(gos.c, "AMapGLTextureView onPause mMapRender.mSurfacedestoryed " + this.m.mSurfacedestoryed);
        if (!this.m.mSurfacedestoryed) {
            queueEvent(new a());
            int i = 0;
            while (!this.m.mSurfacedestoryed) {
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
        super.f();
    }

    @Override // com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final SurfaceHolder getHolder() {
        return null;
    }

    @Override // com.amap.api.col.p0003sl.aa
    public final void h() {
        super.h();
        jos.e(gos.c, "AMapGLTextureView onResume");
    }

    @Override // com.amap.api.col.p0003sl.aa, android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jos.e(gos.c, "AMapGLTextureView onAttachedToWindow");
        try {
            GLMapRender gLMapRender = this.m;
            if (gLMapRender != null) {
                gLMapRender.onAttachedToWindow();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        h();
    }

    @Override // com.amap.api.col.p0003sl.aa, android.view.View
    public final void onDetachedFromWindow() {
        jos.e(gos.c, "AMapGLTextureView onDetachedFromWindow MapsInitializer.isSupportRecycleView() " + MapsInitializer.isSupportRecycleView());
        if (MapsInitializer.isSupportRecycleView()) {
            return;
        }
        f();
        try {
            GLMapRender gLMapRender = this.m;
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
        jos.e(gos.c, "AMapGLTextureView onDetachedGLThread MapsInitializer.isSupportRecycleView() " + MapsInitializer.isSupportRecycleView());
        if (MapsInitializer.isSupportRecycleView()) {
            f();
            try {
                GLMapRender gLMapRender = this.m;
                if (gLMapRender != null) {
                    gLMapRender.onDetachedFromWindow();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            super.onDetachedFromWindow();
        }
    }

    @Override // com.amap.api.col.p0003sl.aa, android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        jos.e(gos.c, "AMapGLTextureView onSurfaceTextureDestroyed");
        requestRender();
        try {
            if (MapsInitializer.getTextureDestroyRender()) {
                Thread.sleep(100L);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            zns.E(th);
        }
        return super.onSurfaceTextureDestroyed(surfaceTexture);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        try {
            return this.l.onTouchEvent(motionEvent);
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        GLMapRender gLMapRender;
        super.onWindowVisibilityChanged(i);
        jos.e(gos.c, "AMapGLTextureView onWindowVisibilityChanged visibility ".concat(String.valueOf(i)));
        try {
            if (i != 8 && i != 4) {
                if (i != 0 || (gLMapRender = this.m) == null) {
                    return;
                }
                gLMapRender.renderResume();
                return;
            }
            GLMapRender gLMapRender2 = this.m;
            if (gLMapRender2 != null) {
                gLMapRender2.renderPause();
                this.n = false;
            }
            requestRender();
        } catch (Throwable th) {
            th.printStackTrace();
            zns.E(th);
        }
    }

    public final IAMapDelegate r() {
        return this.l;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final void setEGLConfigChooser(n nVar) {
        super.c(nVar);
    }

    @Override // com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final void setEGLContextFactory(q qVar) {
        super.d(qVar);
    }

    @Override // com.amap.api.col.p0003sl.aa, com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final void setRenderer(GLSurfaceView.Renderer renderer) {
        this.m = (GLMapRender) renderer;
        super.setRenderer(renderer);
    }

    @Override // com.autonavi.base.amap.api.mapcore.IGLSurfaceView
    public final void setZOrderOnTop(boolean z) {
    }
}
