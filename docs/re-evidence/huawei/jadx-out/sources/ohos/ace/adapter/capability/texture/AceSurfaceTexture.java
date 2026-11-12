package ohos.ace.adapter.capability.texture;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import ohos.ace.adapter.ALog;
import ohos.ace.adapter.AceSurfaceHolder;
import ohos.ace.adapter.AceTextureHolder;

/* JADX INFO: loaded from: classes46.dex */
public class AceSurfaceTexture implements IAceSurfaceTexture {
    private static final String LOG_TAG = "AceSurfaceTexture";
    private final long id;
    private int instanceId;
    private IAceSurfaceTexture.OnFrameAvailableListener onFrameAvailableListener;
    private Surface surface;
    private SurfaceTexture surfaceTexture;
    private final IAceTexture textureImpl;
    private int textureWidth = 0;
    private int textureHeight = 0;

    @Override // ohos.ace.adapter.capability.texture.IAceSurfaceTexture
    public long getTextureId() {
        return 0L;
    }

    public AceSurfaceTexture(int i, long j, IAceTexture iAceTexture) {
        this.instanceId = i;
        this.id = j;
        this.textureImpl = iAceTexture;
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        this.surfaceTexture = surfaceTexture;
        surfaceTexture.detachFromGLContext();
        this.surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: ohos.ace.adapter.capability.texture.AceSurfaceTexture.1
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                if (AceSurfaceTexture.this.onFrameAvailableListener != null) {
                    AceSurfaceTexture.this.onFrameAvailableListener.onFrameAvailable(AceSurfaceTexture.this);
                }
            }
        });
        Surface surface = new Surface(this.surfaceTexture);
        this.surface = surface;
        AceSurfaceHolder.addSurface(i, j, surface);
        iAceTexture.registerSurface(j, this.surface);
        AceTextureHolder.addSurfaceTexture(j, this.surfaceTexture);
        AceTextureHolder.addSurface(j, this.surface);
        iAceTexture.registerTexture(j, this.surfaceTexture);
    }

    @Override // ohos.ace.adapter.capability.texture.IAceSurfaceTexture
    public void setOnFrameAvailableListener(IAceSurfaceTexture.OnFrameAvailableListener onFrameAvailableListener) {
        this.onFrameAvailableListener = onFrameAvailableListener;
    }

    @Override // ohos.ace.adapter.capability.texture.IAceSurfaceTexture
    public void setTextureSize(int i, int i2) {
        this.textureWidth = i;
        this.textureHeight = i2;
        SurfaceTexture surfaceTexture = this.surfaceTexture;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.setDefaultBufferSize(i, i2);
            } catch (IllegalArgumentException | IllegalStateException unused) {
                ALog.e(LOG_TAG, "setDefaultBufferSize failed.");
            }
        }
    }

    @Override // ohos.ace.adapter.capability.texture.IAceSurfaceTexture
    public void updateTexImage() {
        SurfaceTexture surfaceTexture = this.surfaceTexture;
        if (surfaceTexture == null) {
            return;
        }
        surfaceTexture.updateTexImage();
    }

    @Override // ohos.ace.adapter.capability.texture.IAceSurfaceTexture
    public float[] getTransformMatrix() {
        SurfaceTexture surfaceTexture = this.surfaceTexture;
        if (surfaceTexture == null) {
            return new float[0];
        }
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        return fArr;
    }

    @Override // ohos.ace.adapter.capability.texture.IAceSurfaceTexture
    public Surface getSurface() {
        return this.surface;
    }

    @Override // ohos.ace.adapter.capability.texture.IAceSurfaceTexture
    public SurfaceTexture getTexture() {
        return this.surfaceTexture;
    }

    @Override // ohos.ace.adapter.capability.texture.IAceSurfaceTexture
    public void release() {
        this.textureImpl.unregisterTexture(this.id);
        this.textureImpl.unregisterSurface(this.id);
        AceTextureHolder.removeSurface(this.id);
        AceTextureHolder.removeSurfaceTexture(this.id);
        AceSurfaceHolder.removeSurface(this.instanceId, this.id);
        SurfaceTexture surfaceTexture = this.surfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(null);
            this.surfaceTexture.release();
        }
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
        }
    }

    @Override // ohos.ace.adapter.capability.texture.IAceSurfaceTexture
    public void attachToGLContext(int i) {
        SurfaceTexture surfaceTexture = this.surfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.attachToGLContext(i);
        }
    }

    @Override // ohos.ace.adapter.capability.texture.IAceSurfaceTexture
    public void detachFromGLContext() {
        SurfaceTexture surfaceTexture = this.surfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.detachFromGLContext();
        }
    }
}
