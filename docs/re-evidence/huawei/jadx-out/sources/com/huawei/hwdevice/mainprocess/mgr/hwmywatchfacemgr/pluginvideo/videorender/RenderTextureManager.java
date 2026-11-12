package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videorender;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.view.Surface;
import androidx.work.Data;
import com.huawei.watchface.videoedit.gles.ShaderManager;
import com.huawei.watchface.videoedit.gles.template.Material;
import com.huawei.watchface.videoedit.gles.videorender.VideoDraw;
import com.huawei.watchface.videoedit.sysc.Optional;
import com.huawei.watchface.videoedit.utils.Releasable;
import com.huawei.watchface.videoedit.utils.Utils;
import health.compact.a.LogUtil;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class RenderTextureManager implements RenderSurfaceListener, Releasable {
    private static final String TAG = "RenderTextureManager";
    private SurfaceFrameAvailableListener frameAvailableListener;
    private ShaderManager mShaderManager;
    private SurfaceTexture[] mSurfaceTextures;
    private Surface[] mSurfaces;
    private int[] mTextureIds;
    private VideoDraw[] mVideoDraws;
    private int[] mVideoTexIds;
    private Map<String, Integer> mVideoCaches = new HashMap(10);
    private Map<String, BitmapCache> mBitmapCaches = new HashMap(10);

    public RenderTextureManager(ShaderManager shaderManager) {
        this.mShaderManager = shaderManager;
    }

    public void createSurfaces(int i, int i2, int i3) {
        this.mVideoDraws = new VideoDraw[i];
        this.mVideoTexIds = new int[i];
        this.mSurfaces = new Surface[i];
        int[] iArr = new int[i];
        this.mTextureIds = iArr;
        Utils.createTextures(iArr);
        this.mSurfaceTextures = new SurfaceTexture[i];
        GLES20.glGenTextures(i, this.mVideoTexIds, 0);
        for (int i4 = 0; i4 < i; i4++) {
            this.mVideoDraws[i4] = new VideoDraw(this.mShaderManager);
            GLES20.glBindTexture(36197, this.mVideoTexIds[i4]);
            GLES20.glTexParameterf(36197, 10241, 9729.0f);
            GLES20.glTexParameterf(36197, Data.MAX_DATA_BYTES, 9729.0f);
            GLES20.glTexParameteri(36197, 10242, 33648);
            GLES20.glTexParameteri(36197, 10243, 33648);
            this.mSurfaceTextures[i4] = new SurfaceTexture(this.mVideoTexIds[i4]);
            this.mSurfaceTextures[i4].setDefaultBufferSize(i2, i3);
            this.mSurfaceTextures[i4].setOnFrameAvailableListener(new VideoFrameAvailableListener(i4));
            this.mSurfaces[i4] = new Surface(this.mSurfaceTextures[i4]);
        }
    }

    public void onSizeChanged(int i, int i2) {
        if (this.mShaderManager == null) {
            LogUtil.d(TAG, "onSizeChanged Shader manager is null.");
            return;
        }
        float f = i / i2;
        float[] fArr = new float[16];
        float[] fArr2 = new float[16];
        float[] fArr3 = new float[16];
        Matrix.setLookAtM(fArr3, 0, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        Matrix.orthoM(fArr2, 0, -f, f, -1.0f, 1.0f, 3.0f, 7.0f);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr3, 0);
        this.mShaderManager.updateCashViewport(0, 0, i, i2);
        this.mShaderManager.updateVpMatrix(fArr);
    }

    public int renderToFbo(Material material, String str) {
        if (this.mSurfaceTextures == null || this.mVideoTexIds == null || this.mVideoDraws == null) {
            LogUtil.d(TAG, "RenderTextureManager is not initialized.");
            return 0;
        }
        Integer num = this.mVideoCaches.get(material.getId());
        if (num == null) {
            LogUtil.c(TAG, "material: ", material.toString(), ", not ready.");
            return -1;
        }
        this.mVideoDraws[num.intValue()].setRotation(material.getRotation());
        this.mSurfaceTextures[num.intValue()].updateTexImage();
        float[] fArr = new float[16];
        this.mSurfaceTextures[num.intValue()].getTransformMatrix(fArr);
        this.mVideoDraws[num.intValue()].setStMatrix(fArr);
        return this.mVideoDraws[num.intValue()].draw(this.mVideoTexIds[num.intValue()], str);
    }

    public int updateBitmap(Material material, int i, boolean z) {
        int[] iArr = this.mTextureIds;
        if (iArr == null || i >= iArr.length || i < 0) {
            LogUtil.d(TAG, "Invalid parameters when calling updateBitmap.");
            return 0;
        }
        if (z && material != null) {
            Bitmap bitmapOrElse = getFromBitmapCaches(material.getId()).orElse(null);
            if (bitmapOrElse == null) {
                LogUtil.c(TAG, "material: ", material.getId(), ", is not decoded.");
                return 0;
            }
            if (material.getRotation() != 0 && (bitmapOrElse = rotateBitmap(bitmapOrElse, material.getRotation())) == null) {
                LogUtil.d(TAG, "rotatedBitmap is null.");
                return 0;
            }
            Utils.textureBindData(this.mTextureIds[i], bitmapOrElse);
        }
        return this.mTextureIds[i];
    }

    private Optional<Bitmap> getFromBitmapCaches(String str) {
        if (this.mBitmapCaches.containsKey(str) && this.mBitmapCaches.get(str) != null) {
            this.mBitmapCaches.get(str).setBirth(System.currentTimeMillis());
            return Optional.of(this.mBitmapCaches.get(str).getBitmap());
        }
        return Optional.empty();
    }

    private static Bitmap rotateBitmap(Bitmap bitmap, int i) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postRotate(i);
        try {
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (IllegalArgumentException unused) {
            LogUtil.d(TAG, "rotateBitmap IllegalArgumentException");
            return null;
        }
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videorender.RenderSurfaceListener
    public void onSurfaceBind(String str, int i) {
        LogUtil.b(TAG, "onSurfaceBind, materialId: ", str + " surfaceIndex:", Integer.valueOf(i));
        this.mVideoCaches.put(str, Integer.valueOf(i));
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videorender.RenderSurfaceListener
    public void onSurfaceUnBind(String str, int i) {
        LogUtil.b(TAG, "onSurfaceUnBind, materialId: ", str, " surfaceIndex:", Integer.valueOf(i));
        this.mVideoCaches.remove(str);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videorender.RenderSurfaceListener
    public void onBitmapLoaded(Bitmap bitmap, String str) {
        if (bitmap == null) {
            LogUtil.d(TAG, "loaded bitmap is null!");
        } else {
            LogUtil.b(TAG, "onBitmapLoaded, materialId: ", str);
            putBitmapCaches(str, new BitmapCache(bitmap, System.currentTimeMillis()));
        }
    }

    private void putBitmapCaches(String str, BitmapCache bitmapCache) {
        if (this.mBitmapCaches.size() > 10) {
            BitmapCache value = null;
            String key = str;
            for (Map.Entry<String, BitmapCache> entry : this.mBitmapCaches.entrySet()) {
                if (value == null || entry.getValue().getBirth() < value.getBirth()) {
                    value = entry.getValue();
                    key = entry.getKey();
                }
            }
            this.mBitmapCaches.remove(key);
        }
        this.mBitmapCaches.put(str, bitmapCache);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videorender.RenderSurfaceListener
    public boolean queryBitmapIsCached(String str) {
        return this.mBitmapCaches.containsKey(str);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videorender.RenderSurfaceListener
    public List<Surface> getVideoSurfaces() {
        return Arrays.asList(this.mSurfaces);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videorender.RenderSurfaceListener
    public void registerFrameAvailalbleLister(SurfaceFrameAvailableListener surfaceFrameAvailableListener) {
        this.frameAvailableListener = surfaceFrameAvailableListener;
    }

    @Override // com.huawei.watchface.videoedit.utils.Releasable
    public void release() {
        Surface[] surfaceArr = this.mSurfaces;
        if (surfaceArr != null) {
            for (Surface surface : surfaceArr) {
                surface.release();
            }
            this.mSurfaces = null;
        }
        SurfaceTexture[] surfaceTextureArr = this.mSurfaceTextures;
        if (surfaceTextureArr != null) {
            for (SurfaceTexture surfaceTexture : surfaceTextureArr) {
                surfaceTexture.release();
            }
            this.mSurfaceTextures = null;
        }
    }

    class VideoFrameAvailableListener implements SurfaceTexture.OnFrameAvailableListener {
        private int mIndex;

        VideoFrameAvailableListener(int i) {
            this.mIndex = i;
        }

        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            if (RenderTextureManager.this.frameAvailableListener != null) {
                LogUtil.b(RenderTextureManager.TAG, "mIndex is onFrameAvailable ", Integer.valueOf(this.mIndex));
                RenderTextureManager.this.frameAvailableListener.surfaceFrameAvailable();
            }
        }
    }

    static class BitmapCache {
        private long birth;
        private Bitmap bitmap;

        public BitmapCache(Bitmap bitmap, long j) {
            this.bitmap = bitmap;
            this.birth = j;
        }

        public Bitmap getBitmap() {
            return this.bitmap;
        }

        public long getBirth() {
            return this.birth;
        }

        public void setBirth(long j) {
            this.birth = j;
        }
    }
}
