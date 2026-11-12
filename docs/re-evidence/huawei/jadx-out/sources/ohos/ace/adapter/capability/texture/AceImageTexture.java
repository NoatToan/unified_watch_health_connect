package ohos.ace.adapter.capability.texture;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Surface;
import com.huawei.operation.utils.Constants;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import ohos.ace.adapter.ALog;
import ohos.ace.adapter.AceSurfaceHolder;
import ohos.ace.adapter.AceTextureHolder;

/* JADX INFO: loaded from: classes46.dex */
public class AceImageTexture implements IAceSurfaceTexture {
    private static final String LOG_TAG = "AceImageTexture";
    private static final int MAX_IMAGES = 3;
    private long id;
    private int instanceId;
    private IAceTexture textureImpl;
    private static final Set<String> GPU_COLOR_OUTPUT_REQUIRED_MANUFACTURERS = new HashSet<String>() { // from class: ohos.ace.adapter.capability.texture.AceImageTexture.1
        {
            add("OPPO".toLowerCase());
            add("ONEPLUS".toLowerCase());
            add("REALME".toLowerCase());
        }
    };
    private static Boolean sNeedsGpuColorOutput = null;
    private Surface surface = null;
    private Surface oldSurface = null;
    private int textureWidth = 0;
    private int textureHeight = 0;
    private long imageTextureId = 0;
    private long listenerId = -1;
    private IAceSurfaceTexture.OnFrameAvailableListener onFrameAvailableListener = null;
    private OnImageAvailableListener listener = null;
    private boolean hasRegistered = false;
    private volatile int rotationDegrees = 0;
    private Handler mainHandler = new Handler(Looper.getMainLooper());

    interface OnImageAvailableListener {
        void onImageAvailableListener(long j);
    }

    private native long nativeCreateImageTexture();

    private native void nativeDeleteImageTexture(long j);

    private native void nativeGetId(long j, long j2, long j3);

    private native Surface nativeGetImageSurface(long j, int i, int i2, int i3, long j2, int i4);

    private native void nativeRemoveImageAvailableListener(long j, long j2);

    private native long nativeSetImageAvailableListener(long j, OnImageAvailableListener onImageAvailableListener);

    @Override // ohos.ace.adapter.capability.texture.IAceSurfaceTexture
    public void attachToGLContext(int i) {
    }

    @Override // ohos.ace.adapter.capability.texture.IAceSurfaceTexture
    public void detachFromGLContext() {
    }

    @Override // ohos.ace.adapter.capability.texture.IAceSurfaceTexture
    public SurfaceTexture getTexture() {
        return null;
    }

    @Override // ohos.ace.adapter.capability.texture.IAceSurfaceTexture
    public void updateTexImage() {
    }

    public AceImageTexture(int i, long j, IAceTexture iAceTexture) {
        this.instanceId = -1;
        this.id = 0L;
        this.instanceId = i;
        this.id = j;
        this.textureImpl = iAceTexture;
        if (init()) {
            return;
        }
        ALog.e(LOG_TAG, "init failed.");
    }

    private boolean init() {
        long jNativeCreateImageTexture = nativeCreateImageTexture();
        this.imageTextureId = jNativeCreateImageTexture;
        if (jNativeCreateImageTexture == 0) {
            ALog.e(LOG_TAG, "init: failed to create ImageReader");
            return false;
        }
        nativeGetId(jNativeCreateImageTexture, this.instanceId, this.id);
        OnImageAvailableListener onImageAvailableListener = new OnImageAvailableListener() { // from class: ohos.ace.adapter.capability.texture.AceImageTexture.2
            @Override // ohos.ace.adapter.capability.texture.AceImageTexture.OnImageAvailableListener
            public void onImageAvailableListener(long j) {
                AceImageTexture.this.notifyFrameAvailable();
            }
        };
        this.listener = onImageAvailableListener;
        this.listenerId = nativeSetImageAvailableListener(this.imageTextureId, onImageAvailableListener);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyFrameAvailable() {
        this.mainHandler.post(new Runnable() { // from class: ohos.ace.adapter.capability.texture.AceImageTexture.3
            @Override // java.lang.Runnable
            public void run() {
                if (AceImageTexture.this.onFrameAvailableListener != null) {
                    AceImageTexture.this.onFrameAvailableListener.onFrameAvailable(AceImageTexture.this);
                }
            }
        });
    }

    private void createImageReader() {
        if (this.surface != null) {
            AceSurfaceHolder.removeSurface(this.instanceId, this.id);
            AceTextureHolder.removeSurface(this.id);
        }
        if (this.hasRegistered) {
            this.textureImpl.unregisterSurface(this.id);
            this.textureImpl.unregisterTexture(this.id);
        }
        Surface surfaceNativeGetImageSurface = nativeGetImageSurface(this.imageTextureId, this.textureWidth, this.textureHeight, 34, getUsageFlags(), 3);
        Surface surface = this.oldSurface;
        if (surface != null) {
            surface.release();
        }
        Surface surface2 = this.surface;
        if (surface2 != null) {
            this.oldSurface = surface2;
            this.surface = null;
        }
        if (surfaceNativeGetImageSurface != null) {
            this.surface = surfaceNativeGetImageSurface;
            AceTextureHolder.addSurface(this.id, surfaceNativeGetImageSurface);
            AceSurfaceHolder.addSurface(this.instanceId, this.id, this.surface);
            this.textureImpl.registerSurface(this.id, this.surface);
            this.textureImpl.registerTexture(this.id, this.surface);
            this.hasRegistered = true;
        }
    }

    @Override // ohos.ace.adapter.capability.texture.IAceSurfaceTexture
    public void setOnFrameAvailableListener(IAceSurfaceTexture.OnFrameAvailableListener onFrameAvailableListener) {
        this.onFrameAvailableListener = onFrameAvailableListener;
    }

    @Override // ohos.ace.adapter.capability.texture.IAceSurfaceTexture
    public void setTextureSize(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        if (this.textureWidth == i && this.textureHeight == i2) {
            return;
        }
        this.textureWidth = i;
        this.textureHeight = i2;
        ALog.i(LOG_TAG, "setTextureSize: width " + i + ", height " + i2);
        createImageReader();
    }

    @Override // ohos.ace.adapter.capability.texture.IAceSurfaceTexture
    public float[] getTransformMatrix() {
        return new float[0];
    }

    @Override // ohos.ace.adapter.capability.texture.IAceSurfaceTexture
    public long getTextureId() {
        return this.imageTextureId;
    }

    @Override // ohos.ace.adapter.capability.texture.IAceSurfaceTexture
    public Surface getSurface() {
        return this.surface;
    }

    @Override // ohos.ace.adapter.capability.texture.IAceSurfaceTexture
    public void release() {
        ALog.i(LOG_TAG, "release: texture id = " + this.imageTextureId);
        AceTextureHolder.removeSurface(this.id);
        AceSurfaceHolder.removeSurface(this.instanceId, this.id);
        if (this.hasRegistered) {
            this.textureImpl.unregisterSurface(this.id);
            this.textureImpl.unregisterTexture(this.id);
        }
        nativeRemoveImageAvailableListener(this.imageTextureId, this.listenerId);
        nativeDeleteImageTexture(this.imageTextureId);
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
        }
        Surface surface2 = this.oldSurface;
        if (surface2 != null) {
            surface2.release();
        }
        this.hasRegistered = false;
        this.surface = null;
        this.listener = null;
        this.onFrameAvailableListener = null;
        this.textureWidth = 0;
        this.textureHeight = 0;
        this.mainHandler.removeCallbacksAndMessages(null);
    }

    private static boolean needsGpuColorOutput() {
        Boolean bool = sNeedsGpuColorOutput;
        if (bool != null) {
            return bool.booleanValue();
        }
        String str = Build.MANUFACTURER;
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            Iterator<String> it = GPU_COLOR_OUTPUT_REQUIRED_MANUFACTURERS.iterator();
            while (it.hasNext()) {
                if (lowerCase.contains(it.next())) {
                    ALog.i(LOG_TAG, "Manufacturer " + str + " requires GPU_COLOR_OUTPUT");
                    sNeedsGpuColorOutput = true;
                    return true;
                }
            }
        }
        ALog.i(LOG_TAG, "Device does not require GPU_COLOR_OUTPUT (manufacturer=" + str + Constants.RIGHT_BRACKET_ONLY);
        sNeedsGpuColorOutput = false;
        return false;
    }

    private static long getUsageFlags() {
        if (needsGpuColorOutput()) {
            ALog.i(LOG_TAG, "Using GPU_SAMPLED_IMAGE | GPU_COLOR_OUTPUT: 0x" + Long.toHexString(768L));
            return 768L;
        }
        ALog.i(LOG_TAG, "Using GPU_SAMPLED_IMAGE only: 0x" + Long.toHexString(256L));
        return 256L;
    }
}
