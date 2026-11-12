package org.opencv.android;

import android.content.Context;
import android.content.res.TypedArray;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import org.opencv.R;

/* JADX INFO: loaded from: classes23.dex */
public class CameraGLSurfaceView extends GLSurfaceView {
    private static final String c = "CameraGLSurfaceView";
    private CameraTextureListener a;
    private CameraGLRendererBase b;

    public interface CameraTextureListener {
        boolean onCameraTexture(int i, int i2, int i3, int i4);

        void onCameraViewStarted(int i, int i2);

        void onCameraViewStopped();
    }

    public CameraGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.CameraBridgeViewBase);
        int i = typedArrayObtainStyledAttributes.getInt(R.styleable.CameraBridgeViewBase_camera_id, -1);
        typedArrayObtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT >= 21) {
            this.b = new Camera2Renderer(this);
        } else {
            this.b = new CameraRenderer(this);
        }
        setCameraIndex(i);
        setEGLContextClientVersion(2);
        setRenderer(this.b);
        setRenderMode(0);
    }

    public void disableView() {
        this.b.disableView();
    }

    public void enableView() {
        this.b.enableView();
    }

    public CameraTextureListener getCameraTextureListener() {
        return this.a;
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        Log.i(c, "onPause");
        this.b.onPause();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        Log.i(c, "onResume");
        super.onResume();
        this.b.onResume();
    }

    public void setCameraIndex(int i) {
        this.b.setCameraIndex(i);
    }

    public void setCameraTextureListener(CameraTextureListener cameraTextureListener) {
        this.a = cameraTextureListener;
    }

    public void setMaxCameraPreviewSize(int i, int i2) {
        this.b.setMaxCameraPreviewSize(i, i2);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        super.surfaceChanged(surfaceHolder, i, i2, i3);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        super.surfaceCreated(surfaceHolder);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.b.mHaveSurface = false;
        super.surfaceDestroyed(surfaceHolder);
    }
}
