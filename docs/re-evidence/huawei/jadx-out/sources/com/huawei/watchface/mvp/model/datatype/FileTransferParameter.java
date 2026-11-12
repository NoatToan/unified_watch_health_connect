package com.huawei.watchface.mvp.model.datatype;

/* JADX INFO: loaded from: classes20.dex */
public class FileTransferParameter {
    private static final int WAIT_TIME_DEFAULT = 30;
    private String mFileProtocolVersion = "";
    private int mAppWaitTime = 30;
    private boolean mIsBitmapEnable = false;
    private int mTransferUnitSize = 0;
    private int mMaxApplyDataSize = 0;
    private int mInterval = 0;
    private int mReceivedFileSize = 0;
    private int mFileId = 0;
    private int mPackageNumberMax = 0;
    private boolean mIsTransferNotEncrypt = false;

    public int getAppWaitTime() {
        return this.mAppWaitTime;
    }

    public int getFileId() {
        return this.mFileId;
    }

    public String getFileProtocolVersion() {
        return this.mFileProtocolVersion;
    }

    public int getInterval() {
        return this.mInterval;
    }

    public int getMaxApplyDataSize() {
        return this.mMaxApplyDataSize;
    }

    public int getPackageNumberMax() {
        return this.mPackageNumberMax;
    }

    public int getReceivedFileSize() {
        return this.mReceivedFileSize;
    }

    public int getTransferUnitSize() {
        return this.mTransferUnitSize;
    }

    public boolean isBitmapEnable() {
        return this.mIsBitmapEnable;
    }

    public boolean isTransferNotEncrypt() {
        return this.mIsTransferNotEncrypt;
    }

    public void setAppWaitTime(int i) {
        this.mAppWaitTime = i;
    }

    public void setBitmapEnable(boolean z) {
        this.mIsBitmapEnable = z;
    }

    public void setFileId(int i) {
        this.mFileId = i;
    }

    public void setFileProtocolVersion(String str) {
        this.mFileProtocolVersion = str;
    }

    public void setInterval(int i) {
        this.mInterval = i;
    }

    public void setMaxApplyDataSize(int i) {
        this.mMaxApplyDataSize = i;
    }

    public void setPackageNumberMax(int i) {
        this.mPackageNumberMax = i;
    }

    public void setReceivedFileSize(int i) {
        this.mReceivedFileSize = i;
    }

    public void setTransferNotEncrypt(boolean z) {
        this.mIsTransferNotEncrypt = z;
    }

    public void setTransferUnitSize(int i) {
        this.mTransferUnitSize = i;
    }
}
