package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.operation;

import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.utils.TemplateUtil;
import com.huawei.watchface.videoedit.param.TemplateModel;

/* JADX INFO: loaded from: classes10.dex */
public abstract class Operation {
    public static final int IMMEDIATELY = -1;
    private static final int SECOND_PER_FRAME = 33;
    protected TemplateModel operationOwnedModel;
    protected boolean isPlayWhenReady = true;
    protected int seekTime = -1;
    protected boolean isSaveStackRequired = false;
    protected int pauseTime = -1;
    private OperationStatus status = OperationStatus.INIT;

    public abstract boolean handleTemplate(TemplateModel templateModel);

    public int getSeekTime() {
        TemplateModel templateModel = this.operationOwnedModel;
        if (templateModel != null && this.seekTime > templateModel.getDuration() - 33) {
            this.seekTime = (int) (this.operationOwnedModel.getDuration() - 33);
        }
        return this.seekTime;
    }

    public int getPauseTime() {
        return this.pauseTime;
    }

    public OperationStatus getStatus() {
        return this.status;
    }

    public void setStatus(OperationStatus operationStatus) {
        this.status = operationStatus;
    }

    public void setSeekTime(int i) {
        this.seekTime = i;
    }

    public boolean isOperationHandled() {
        return this.status.equals(OperationStatus.HANDLED);
    }

    public boolean isPlayWhenReady() {
        return this.isPlayWhenReady;
    }

    public TemplateModel getModel() {
        return this.operationOwnedModel;
    }

    public void postHandleTemplate(TemplateModel templateModel) {
        TemplateUtil.reCalibrateModelDuration(templateModel);
        templateModel.setIsFormedByTheme(false);
        templateModel.setName(TemplateUtil.CUSTOMIZED_NAME);
        if (this.isSaveStackRequired) {
            TemplateUtil.queueModelStack(templateModel);
        }
    }
}
