package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.gles;

import android.content.Context;
import android.opengl.GLES20;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.play.MagicPlayer;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.videorender.RenderLayer;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.videorender.RenderNodeSelectListener;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.videorender.RenderNodeSelector;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videorender.RenderTextureManager;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videorender.VideoLayer;
import com.huawei.watchface.videoedit.gles.Constant;
import com.huawei.watchface.videoedit.gles.ShaderManager;
import com.huawei.watchface.videoedit.gles.transition.DirectDrawAnim;
import com.huawei.watchface.videoedit.gles.transition.SingleFrameAnim;
import com.huawei.watchface.videoedit.gles.videorender.RenderDataManager;
import com.huawei.watchface.videoedit.utils.Releasable;
import com.huawei.watchface.videoedit.utils.Utils;
import health.compact.a.LogUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class VideoRender implements Releasable {
    private static final int SURFACE_COUNT = 4;
    private static final String TAG = "VideoRender";
    private int encoderH;
    private int encoderW;
    private DirectDrawAnim mDirectDrawAnim;
    private final MagicPlayer.Mode mMode;
    private RenderNodeSelectListener mNodeSelector;
    private RenderDataManager mRenderDataManager;
    private RenderTextureManager mRenderTextureManager;
    private ShaderManager mShaderManager;
    private SingleFrameAnim mSingleFrameAnim;
    private List<RenderLayer> renderLayers;
    private boolean mOnSizeChanged = false;
    private int mWidth = 0;
    private int mHeight = 0;
    private int mSingleFrameWidth = 0;
    private int mSingleFrameHeight = 0;

    public VideoRender(Context context, MagicPlayer.Mode mode) {
        this.mMode = mode;
        ShaderManager shaderManager = new ShaderManager(context);
        this.mShaderManager = shaderManager;
        this.mRenderTextureManager = new RenderTextureManager(shaderManager);
        this.mRenderDataManager = new RenderDataManager();
        ArrayList arrayList = new ArrayList(10);
        this.renderLayers = arrayList;
        this.mNodeSelector = new RenderNodeSelector(arrayList);
    }

    public void init() {
        LogUtil.b(TAG, "init current mode: ", this.mMode);
        Utils.setDefaultClearColor();
        int i = this.mWidth;
        int i2 = this.mHeight;
        if (this.mMode == MagicPlayer.Mode.PLAY) {
            i = 1080;
            i2 = 1920;
        }
        LogUtil.c(TAG, "init, width: ", Integer.valueOf(i), ", height: ", Integer.valueOf(i2));
        this.mRenderTextureManager.createSurfaces(4, i, i2);
        this.mShaderManager.prepareFbos(i, i2);
        this.renderLayers.add(new VideoLayer(this.mShaderManager, this.mRenderTextureManager).setMode(this.mMode));
        Collections.sort(this.renderLayers);
        Iterator<RenderLayer> it = this.renderLayers.iterator();
        while (it.hasNext()) {
            it.next().init(this.mWidth, this.mHeight);
        }
        this.mDirectDrawAnim = new DirectDrawAnim(this.mShaderManager.getShader(Constant.DIRECT_DRAW));
        this.mSingleFrameAnim = new SingleFrameAnim(this.mShaderManager.getShader(Constant.SINGLE_FRAME));
    }

    public void onDrawFrame(long j) {
        handleDataChange();
        if (this.mMode == MagicPlayer.Mode.PLAY) {
            GLES20.glViewport(0, 0, 1080, 1920);
            Iterator<RenderLayer> it = this.renderLayers.iterator();
            while (it.hasNext()) {
                it.next().draw(j);
            }
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glClear(16384);
            GLES20.glViewport(0, 0, this.mWidth, this.mHeight);
            this.mDirectDrawAnim.draw(this.mShaderManager.getFboTextureId(Constant.RENDER_TO_SCREEN_FBO));
            GLES20.glBindFramebuffer(36160, 0);
            return;
        }
        this.mShaderManager.applyCachedViewport();
        Iterator<RenderLayer> it2 = this.renderLayers.iterator();
        while (it2.hasNext()) {
            it2.next().draw(j);
        }
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glClear(16384);
        GLES20.glViewport(0, 0, this.encoderW, this.encoderH);
        this.mDirectDrawAnim.draw(this.mShaderManager.getFboTextureId(Constant.RENDER_TO_SCREEN_FBO));
        GLES20.glBindFramebuffer(36160, 0);
    }

    public void setEncoderSize(int i, int i2) {
        this.encoderW = i;
        this.encoderH = i2;
    }

    public ByteBuffer outputSingleFrame(int i, int i2) {
        updateSingleFbo(i, i2);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i * i2 * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        GLES20.glBindFramebuffer(36160, this.mShaderManager.getFboId(Constant.SINGLE_FRAME_FBO));
        GLES20.glClear(16384);
        GLES20.glViewport(0, 0, i, i2);
        this.mSingleFrameAnim.draw(this.mShaderManager.getFboTextureId(Constant.RENDER_TO_SCREEN_FBO));
        GLES20.glFinish();
        GLES20.glReadPixels(0, 0, i, i2, 6408, 5121, byteBufferAllocateDirect);
        GLES20.glBindFramebuffer(36160, 0);
        return byteBufferAllocateDirect;
    }

    private void updateSingleFbo(int i, int i2) {
        if (i == this.mSingleFrameWidth && i2 == this.mSingleFrameHeight) {
            return;
        }
        this.mSingleFrameWidth = i;
        this.mSingleFrameHeight = i2;
        this.mShaderManager.clearTargetFbo(Constant.SINGLE_FRAME_FBO);
        this.mShaderManager.getFboId(Constant.SINGLE_FRAME_FBO, i, i2);
    }

    private void handleDataChange() {
        handleSizeChange();
        Iterator<RenderLayer> it = this.renderLayers.iterator();
        while (it.hasNext()) {
            it.next().handleDataChange(this.mRenderDataManager);
        }
    }

    private void handleSizeChange() {
        if (this.mOnSizeChanged) {
            this.mOnSizeChanged = false;
            this.mRenderTextureManager.onSizeChanged(this.mWidth, this.mHeight);
            for (RenderLayer renderLayer : this.renderLayers) {
                renderLayer.onSizeChanged(this.mWidth, this.mHeight);
                renderLayer.updateAnimVertex();
            }
        }
    }

    public void onSizeChanged(int i, int i2) {
        if (this.mWidth == i && this.mHeight == i2) {
            LogUtil.b(TAG, "onSizeChanged size not changed.");
            return;
        }
        LogUtil.b(TAG, "onSurfaceChanged: width: ", Integer.valueOf(i), ", height: ", Integer.valueOf(i2));
        if (i * i2 == 0) {
            return;
        }
        this.mWidth = i;
        this.mHeight = i2;
        this.mOnSizeChanged = true;
    }

    @Override // com.huawei.watchface.videoedit.utils.Releasable
    public void release() {
        if (this.mRenderDataManager.getRenderModel() != null) {
            this.mRenderDataManager.getRenderModel().release();
        }
        this.mShaderManager.clean();
        this.mRenderTextureManager.release();
        Iterator<RenderLayer> it = this.renderLayers.iterator();
        while (it.hasNext()) {
            it.next().release();
        }
    }

    public RenderTextureManager getRenderTextureManager() {
        return this.mRenderTextureManager;
    }

    public RenderDataManager getRenderDataManager() {
        return this.mRenderDataManager;
    }

    public RenderNodeSelectListener getNodeSelector() {
        return this.mNodeSelector;
    }
}
