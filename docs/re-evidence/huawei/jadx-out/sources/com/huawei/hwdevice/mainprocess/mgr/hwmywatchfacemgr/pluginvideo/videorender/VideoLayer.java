package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videorender;

import android.opengl.GLES20;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.videorender.RenderLayer;
import com.huawei.watchface.videoedit.gles.Constant;
import com.huawei.watchface.videoedit.gles.CurvedAnimation;
import com.huawei.watchface.videoedit.gles.ShaderManager;
import com.huawei.watchface.videoedit.gles.background.GaussianBlurBackground;
import com.huawei.watchface.videoedit.gles.drawer.BaseAnimation;
import com.huawei.watchface.videoedit.gles.template.Material;
import com.huawei.watchface.videoedit.gles.template.RenderModel;
import com.huawei.watchface.videoedit.gles.transition.RenderToFboAnim;
import com.huawei.watchface.videoedit.gles.transition.SquareChangeAnimation;
import com.huawei.watchface.videoedit.gles.transition.Transition;
import com.huawei.watchface.videoedit.gles.transition.TransitionAnim;
import com.huawei.watchface.videoedit.gles.videorender.RenderDataManager;
import health.compact.a.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class VideoLayer extends RenderLayer {
    private static final int DEFAULT_Z_ORDER = 1000;
    private static final String TAG = "VideoLayer";
    private Material mNextMaterial;
    private boolean mNextPhotoChanged;
    private Material mPreMaterial;
    private boolean mPrePhotoChanged;
    private RenderModel mRenderModel;
    private RenderTextureManager mRenderTextureManager;
    private RenderToFboAnim mRenderToFboAnim;
    private ShaderManager mShaderManager;
    private Transition mTransition;
    private TransitionAnim mTransitionAnim;
    private List<Transition> mTransitions;

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.videorender.RenderLayer
    public void release() {
    }

    public VideoLayer(ShaderManager shaderManager, RenderTextureManager renderTextureManager) {
        setZorder(1000);
        this.mShaderManager = shaderManager;
        this.mRenderTextureManager = renderTextureManager;
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.videorender.RenderLayer
    public void init(int i, int i2) {
        this.mWidth = i;
        this.mHeight = i2;
        TransitionAnim transitionAnim = new TransitionAnim(this.mShaderManager.getShader(Constant.DIRECT_DRAW), this.mShaderManager);
        this.mTransitionAnim = transitionAnim;
        transitionAnim.setInputWidth(this.mWidth);
        this.mTransitionAnim.setInputHeight(this.mHeight);
        this.mRenderToFboAnim = new RenderToFboAnim(this.mShaderManager.getShader(Constant.DIRECT_DRAW));
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.videorender.RenderLayer
    public void updateAnimVertex() {
        Material material = this.mPreMaterial;
        if (material != null) {
            material.updateAnimVertex(this.mShaderManager.getViewportRatio()).setVpMatrix(this.mShaderManager.getVpMatrix());
        }
        Material material2 = this.mNextMaterial;
        if (material2 != null) {
            material2.updateAnimVertex(this.mShaderManager.getViewportRatio()).setVpMatrix(this.mShaderManager.getVpMatrix());
        }
        TransitionAnim transitionAnim = this.mTransitionAnim;
        if (transitionAnim != null) {
            transitionAnim.setInputWidth(this.mWidth);
            this.mTransitionAnim.setInputHeight(this.mHeight);
        }
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.videorender.RenderLayer
    public void draw(long j) {
        int iDrawPreMaterial = drawPreMaterial(j);
        if (iDrawPreMaterial <= 0) {
            return;
        }
        List<Transition> list = this.mTransitions;
        if (list != null) {
            for (Transition transition : list) {
                if (transition.contains(j)) {
                    this.mTransition = transition;
                    if (!transition.isOverLap() || drawNextMaterial(j) > 0) {
                        break;
                        break;
                    }
                    return;
                }
            }
        }
        GLES20.glBindFramebuffer(36160, this.mShaderManager.getFboId(Constant.RENDER_TO_SCREEN_FBO));
        GLES20.glClear(16384);
        this.mRenderToFboAnim.draw(iDrawPreMaterial);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.videorender.RenderLayer
    public void handleDataChange(RenderDataManager renderDataManager) {
        if (renderDataManager == null) {
            return;
        }
        if (renderDataManager.isMaterialChanged()) {
            renderDataManager.setMaterialChanged(false);
            RenderModel renderModel = renderDataManager.getRenderModel();
            this.mRenderModel = renderModel;
            LogUtil.b(TAG, "video layer receive data change: render model", renderModel);
        }
        if (renderDataManager.isTransitionChanged()) {
            renderDataManager.setTransitionChanged(false);
            List<Transition> transitions = renderDataManager.getTransitions();
            this.mTransitions = transitions;
            LogUtil.b(TAG, "video layer receive data change: transitions", Integer.valueOf(transitions.size()));
        }
    }

    private int drawPreMaterial(long j) {
        int iUpdateBitmap;
        if (!findPreReadyMaterial(j)) {
            LogUtil.d(TAG, "current: ", Long.valueOf(j), ", pre material not ready.");
            return this.mShaderManager.getFboTextureId(Constant.PRE_MATERIAL_FBO);
        }
        if (this.mPreMaterial.isVideo()) {
            iUpdateBitmap = this.mRenderTextureManager.renderToFbo(this.mPreMaterial, Constant.VIDEO_FBO);
            if (iUpdateBitmap == -1) {
                return this.mShaderManager.getFboTextureId(Constant.PRE_MATERIAL_FBO);
            }
        } else {
            iUpdateBitmap = this.mRenderTextureManager.updateBitmap(this.mPreMaterial, 0, this.mPrePhotoChanged);
            if (iUpdateBitmap > 0) {
                this.mPrePhotoChanged = false;
            }
        }
        this.mPreMaterial.draw(j, iUpdateBitmap, this.mShaderManager.getFboId(Constant.PRE_MATERIAL_FBO));
        return this.mShaderManager.getFboTextureId(Constant.PRE_MATERIAL_FBO);
    }

    private int drawNextMaterial(long j) {
        int iUpdateBitmap;
        if (!findNextReadyMaterial(j)) {
            LogUtil.d(TAG, "current: ", Long.valueOf(j), ", next material not ready.");
            return this.mShaderManager.getFboTextureId(Constant.NEXT_MATERIAL_FBO);
        }
        if (this.mNextMaterial.isVideo()) {
            iUpdateBitmap = this.mRenderTextureManager.renderToFbo(this.mNextMaterial, Constant.VIDEO_FBO_SECOND);
            if (iUpdateBitmap == -1) {
                return this.mShaderManager.getFboTextureId(Constant.NEXT_MATERIAL_FBO);
            }
        } else {
            iUpdateBitmap = this.mRenderTextureManager.updateBitmap(this.mNextMaterial, 1, this.mNextPhotoChanged);
            if (iUpdateBitmap > 0) {
                this.mNextPhotoChanged = false;
            }
        }
        this.mNextMaterial.draw(j, iUpdateBitmap, this.mShaderManager.getFboId(Constant.NEXT_MATERIAL_FBO));
        return this.mShaderManager.getFboTextureId(Constant.NEXT_MATERIAL_FBO);
    }

    private boolean findPreReadyMaterial(long j) {
        RenderModel renderModel = this.mRenderModel;
        if (renderModel == null) {
            LogUtil.b(TAG, "findPreReadyMaterial mRenderModel is null.");
            return false;
        }
        Material materialOrElse = renderModel.getPreMaterial(j).orElse(null);
        if (materialOrElse == null) {
            LogUtil.d(TAG, "findPreReadyMaterial material is null.");
            return false;
        }
        if (materialOrElse.equals(this.mPreMaterial)) {
            return true;
        }
        this.mPreMaterial = materialOrElse;
        if (!materialOrElse.isVideo()) {
            this.mPrePhotoChanged = true;
        }
        setMaterial(this.mPreMaterial, j);
        return true;
    }

    private boolean findNextReadyMaterial(long j) {
        RenderModel renderModel = this.mRenderModel;
        if (renderModel == null) {
            LogUtil.b(TAG, "findPreReadyMaterial mRenderModel is null.");
            return false;
        }
        Material materialOrElse = renderModel.getNextMaterial(j).orElse(null);
        if (materialOrElse == null) {
            LogUtil.d(TAG, "findPreReadyMaterial material is null.");
            return false;
        }
        if (materialOrElse.equals(this.mNextMaterial)) {
            return true;
        }
        this.mNextMaterial = materialOrElse;
        if (!materialOrElse.isVideo()) {
            this.mNextPhotoChanged = true;
        }
        setMaterial(this.mNextMaterial, j);
        return true;
    }

    private void setMaterial(Material material, long j) {
        LogUtil.b(TAG, "setMaterial time: ", Long.valueOf(j), "setMaterial: ", material);
        CurvedAnimation meshChanger = new BaseAnimation(this.mShaderManager.getShader(Constant.BASIC), material.getTimeRange()).setMeshChanger(new SquareChangeAnimation(material.getMeshChangerType()));
        if (material.getBackgroundType() == 1) {
            meshChanger.setBackground(new GaussianBlurBackground(this.mShaderManager));
        }
        material.setCurvedAnimation(meshChanger).setVpMatrix(this.mShaderManager.getVpMatrix()).updateAnimVertex(this.mShaderManager.getViewportRatio());
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.videorender.RenderLayer
    public void onSizeChanged(int i, int i2) {
        this.mWidth = i;
        this.mHeight = i2;
    }
}
