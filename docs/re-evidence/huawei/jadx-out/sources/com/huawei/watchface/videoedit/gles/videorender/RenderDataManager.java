package com.huawei.watchface.videoedit.gles.videorender;

import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.videoedit.gles.Tail;
import com.huawei.watchface.videoedit.gles.template.RenderListener;
import com.huawei.watchface.videoedit.gles.template.RenderModel;
import com.huawei.watchface.videoedit.gles.transition.Transition;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes20.dex */
public class RenderDataManager implements RenderListener {
    private RenderModel mRenderModel;
    private Tail mTail;
    private List<Transition> mTransitions;
    private boolean mTailChanged = false;
    private boolean mMaterialChanged = false;
    private boolean mTransitionChanged = false;

    public RenderModel getRenderModel() {
        return this.mRenderModel;
    }

    public Tail getTail() {
        return this.mTail;
    }

    public List<Transition> getTransitions() {
        return this.mTransitions;
    }

    public boolean isMaterialChanged() {
        return this.mMaterialChanged;
    }

    public boolean isTailChanged() {
        return this.mTailChanged;
    }

    public boolean isTransitionChanged() {
        return this.mTransitionChanged;
    }

    @Override // com.huawei.watchface.videoedit.gles.template.RenderListener
    public void onMaterialChanged(RenderModel renderModel) {
        if (renderModel == null) {
            HwLog.e(HwLog.TAG, "renderModel is null.");
        }
        setMaterialChanged(true);
        setRenderModel(renderModel);
    }

    @Override // com.huawei.watchface.videoedit.gles.template.RenderListener
    public void onTailChanged(Tail tail) {
        if (tail == null) {
            HwLog.e(HwLog.TAG, "tail is null.");
        }
        if (Objects.equals(this.mTail, tail)) {
            HwLog.d(HwLog.TAG, "tail not change.");
        } else {
            setTailChanged(true);
            setTail(tail);
        }
    }

    public void setMaterialChanged(boolean z) {
        this.mMaterialChanged = z;
    }

    public void setRenderModel(RenderModel renderModel) {
        this.mRenderModel = renderModel;
    }

    public void setTail(Tail tail) {
        this.mTail = tail;
    }

    public void setTailChanged(boolean z) {
        this.mTailChanged = z;
    }

    public void setTransitionChanged(boolean z) {
        this.mTransitionChanged = z;
    }

    public void setTransitions(List<Transition> list) {
        this.mTransitions = list;
    }
}
