package ohos.ace.adapter.capability.texture;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: loaded from: classes20.dex */
public interface IAceSurfaceTexture {

    /* JADX INFO: loaded from: classes46.dex */
    public interface OnFrameAvailableListener {
        void onFrameAvailable(IAceSurfaceTexture iAceSurfaceTexture);
    }

    void attachToGLContext(int i);

    void detachFromGLContext();

    Surface getSurface();

    SurfaceTexture getTexture();

    long getTextureId();

    float[] getTransformMatrix();

    void release();

    void setOnFrameAvailableListener(OnFrameAvailableListener onFrameAvailableListener);

    void setTextureSize(int i, int i2);

    void updateTexImage();
}
