package com.autonavi.base.amap.api.mapcore;

import android.opengl.GLSurfaceView;
import android.view.SurfaceHolder;
import android.view.ViewParent;
import com.amap.api.col.p0003sl.n;
import com.amap.api.col.p0003sl.q;

/* JADX INFO: loaded from: classes4.dex */
public interface IGLSurfaceView {
    int getHeight();

    SurfaceHolder getHolder();

    ViewParent getParent();

    int getRenderMode();

    int getWidth();

    boolean isEnabled();

    void onDetachedGLThread();

    boolean post(Runnable runnable);

    boolean postDelayed(Runnable runnable, long j);

    void queueEvent(Runnable runnable);

    void requestRender();

    void setBackgroundColor(int i);

    void setEGLConfigChooser(n nVar);

    void setEGLContextFactory(q qVar);

    void setRenderMode(int i);

    void setRenderer(GLSurfaceView.Renderer renderer);

    void setVisibility(int i);

    void setZOrderOnTop(boolean z);
}
