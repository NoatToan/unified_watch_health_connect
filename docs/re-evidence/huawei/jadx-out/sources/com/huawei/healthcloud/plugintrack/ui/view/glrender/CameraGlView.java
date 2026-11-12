package com.huawei.healthcloud.plugintrack.ui.view.glrender;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import com.huawei.healthcloud.plugintrack.ui.view.glrender.util.Camera2Helper;
import defpackage.jsy;

/* JADX INFO: loaded from: classes10.dex */
public class CameraGlView extends GLSurfaceView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private jsy f11373b;

    public CameraGlView(Context context) {
        this(context, null);
    }

    public CameraGlView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setEGLContextClientVersion(2);
        jsy jsyVar = new jsy(this);
        this.f11373b = jsyVar;
        setRenderer(jsyVar);
        setRenderMode(0);
    }

    public void setOnPreviewListener(Camera2Helper.OnPreviewListener onPreviewListener) {
        this.f11373b.e(onPreviewListener);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        super.surfaceDestroyed(surfaceHolder);
        this.f11373b.d();
    }

    public void d(boolean z) {
        this.f11373b.d(z);
    }

    public boolean d() {
        return this.f11373b.e();
    }

    public void c(boolean z) {
        this.f11373b.a(z);
    }

    public void setIsOptimalSize(boolean z) {
        this.f11373b.b(z);
    }

    public void setRadio(float f) {
        this.f11373b.e(f);
    }
}
