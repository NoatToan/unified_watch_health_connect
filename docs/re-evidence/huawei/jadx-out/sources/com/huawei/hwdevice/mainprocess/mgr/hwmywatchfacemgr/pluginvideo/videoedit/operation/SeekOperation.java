package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.operation;

import com.huawei.watchface.videoedit.param.TemplateModel;

/* JADX INFO: loaded from: classes10.dex */
public class SeekOperation extends Operation {
    public SeekOperation(int i, int i2, boolean z) {
        this.seekTime = i;
        this.isPlayWhenReady = z;
        this.pauseTime = i2;
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.operation.Operation
    public boolean handleTemplate(TemplateModel templateModel) {
        this.operationOwnedModel = templateModel;
        return false;
    }
}
