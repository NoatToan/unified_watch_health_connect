package com.huawei.ucd.gles.engine.android;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import com.huawei.ucd.gles.engine.Stage;
import com.huawei.ucd.helper.gles.IGLActor;
import defpackage.qis;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes43.dex */
public class StageView extends GLSurfaceView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private GLSurfaceView.Renderer f23218c;
    protected Stage d;
    private GLSurfaceView.EGLConfigChooser e;

    public StageView(Context context) {
        super(context);
        this.f23218c = new GLSurfaceView.Renderer() { // from class: com.huawei.ucd.gles.engine.android.StageView.1
            @Override // android.opengl.GLSurfaceView.Renderer
            public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
                StageView.this.d.onSurfaceCreated();
            }

            @Override // android.opengl.GLSurfaceView.Renderer
            public void onSurfaceChanged(GL10 gl10, int i, int i2) {
                StageView.this.d.onSurfaceChanged(i, i2);
            }

            @Override // android.opengl.GLSurfaceView.Renderer
            public void onDrawFrame(GL10 gl10) {
                StageView.this.d.onDrawFrame();
            }
        };
        d(context);
    }

    public StageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23218c = new GLSurfaceView.Renderer() { // from class: com.huawei.ucd.gles.engine.android.StageView.1
            @Override // android.opengl.GLSurfaceView.Renderer
            public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
                StageView.this.d.onSurfaceCreated();
            }

            @Override // android.opengl.GLSurfaceView.Renderer
            public void onSurfaceChanged(GL10 gl10, int i, int i2) {
                StageView.this.d.onSurfaceChanged(i, i2);
            }

            @Override // android.opengl.GLSurfaceView.Renderer
            public void onDrawFrame(GL10 gl10) {
                StageView.this.d.onDrawFrame();
            }
        };
        d(context);
    }

    private void d(Context context) {
        Stage stage = new Stage(context);
        this.d = stage;
        stage.setRequestRenderListener(new IGLActor.RequestRenderListener() { // from class: com.huawei.ucd.gles.engine.android.StageView.3
            @Override // com.huawei.ucd.helper.gles.IGLActor.RequestRenderListener
            public void onRequestRenderCalled() {
                StageView.this.requestRender();
            }
        });
        setEGLContextClientVersion(2);
        setPreserveEGLContextOnPause(true);
    }

    @Override // android.opengl.GLSurfaceView
    public void setEGLConfigChooser(GLSurfaceView.EGLConfigChooser eGLConfigChooser) {
        super.setEGLConfigChooser(eGLConfigChooser);
        this.e = eGLConfigChooser;
    }

    public void d() {
        if (this.e == null) {
            this.e = new qis();
        }
        setRenderer(this.f23218c);
        setRenderMode(0);
    }

    @Override // android.opengl.GLSurfaceView
    public void setRenderMode(int i) {
        super.setRenderMode(i);
    }

    public Stage getStage() {
        return this.d;
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        super.onPause();
        this.d.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.d.onResume();
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    public void e() {
        if (this.f23218c != null) {
            this.f23218c = null;
        }
        Stage stage = this.d;
        if (stage != null) {
            stage.onDestroy();
            super.onDetachedFromWindow();
            this.d = null;
        }
    }

    public void setTranslucent() {
        setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        getHolder().setFormat(-3);
        setZOrderOnTop(true);
    }

    public void setTranslucent(GLSurfaceView.EGLConfigChooser eGLConfigChooser) {
        setEGLConfigChooser(eGLConfigChooser);
        getHolder().setFormat(-3);
        setZOrderOnTop(true);
    }
}
