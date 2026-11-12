package com.huawei.watchface.videoedit.param;

import com.huawei.watchface.videoedit.utils.SaveResolutionUtils;

/* JADX INFO: loaded from: classes45.dex */
public class ResolutionInfo {
    private int fileSize;
    private SaveResolutionUtils.VideoResolution innerDefine;
    private int resolutionSize;
    private int stringIndex;

    public ResolutionInfo(int i, SaveResolutionUtils.VideoResolution videoResolution, int i2) {
        this.resolutionSize = i;
        this.innerDefine = videoResolution;
        this.stringIndex = i2;
    }

    public int getFileSize() {
        return this.fileSize;
    }

    public SaveResolutionUtils.VideoResolution getInnerDefine() {
        return this.innerDefine;
    }

    public int getResolutionSize() {
        return this.resolutionSize;
    }

    public int getStringIndex() {
        return this.stringIndex;
    }

    public void setFileSize(int i) {
        this.fileSize = i;
    }
}
