package com.huawei.watchface.mvp.model.datatype;

import com.huawei.watchface.utils.callback.IBaseCommonCallback;
import com.huawei.watchface.utils.callback.IBaseResponseCallback;
import com.huawei.watchface.utils.callback.IFileTransferStateCallback;
import com.huawei.watchface.utils.callback.IPhotoFileCallback;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes20.dex */
public class CommonFileInfo {
    private ByteBuffer mByteAll;
    private ByteBuffer mByteUnit;
    private int mFileId;
    private int mFileLength;
    private int mFileOffset;
    private String mFilePath;
    private int mFilePsnMax;
    private int mFilePsnTemp;
    private int mFileSize;
    private int mFileType;
    private IBaseCommonCallback mKitCallback;
    private String mFileName = "";
    private boolean mIsNeddVerify = true;
    private String mHashValue = "";
    private long mUriId = -1;
    private int mTotalIndex = 0;
    private int mStartTime = 0;
    private int mEndTime = 0;
    private IBaseResponseCallback mCallback = null;
    private IFileTransferStateCallback mFileCallback = null;
    private IPhotoFileCallback mFileRequestCallBack = null;

    public ByteBuffer getByteAll() {
        return this.mByteAll;
    }

    public ByteBuffer getByteUnit() {
        return this.mByteUnit;
    }

    public IBaseResponseCallback getCallback() {
        return this.mCallback;
    }

    public int getEndTime() {
        return this.mEndTime;
    }

    public IFileTransferStateCallback getFileCallBack() {
        return this.mFileCallback;
    }

    public int getFileId() {
        return this.mFileId;
    }

    public int getFileLength() {
        return this.mFileLength;
    }

    public String getFileName() {
        return this.mFileName;
    }

    public int getFileOffset() {
        return this.mFileOffset;
    }

    public String getFilePath() {
        return this.mFilePath;
    }

    public int getFilePsn() {
        return this.mFilePsnTemp;
    }

    public int getFilePsnMax() {
        return this.mFilePsnMax;
    }

    public IPhotoFileCallback getFileRequestCallBack() {
        return this.mFileRequestCallBack;
    }

    public int getFileSize() {
        return this.mFileSize;
    }

    public int getFileType() {
        return this.mFileType;
    }

    public String getHashValue() {
        return this.mHashValue;
    }

    public IBaseCommonCallback getKitCallback() {
        return this.mKitCallback;
    }

    public int getStartTime() {
        return this.mStartTime;
    }

    public int getTotalIndex() {
        return this.mTotalIndex;
    }

    public long getUriId() {
        return this.mUriId;
    }

    public boolean isNeedVerify() {
        return this.mIsNeddVerify;
    }

    public void setByteAll(ByteBuffer byteBuffer) {
        this.mByteAll = byteBuffer;
    }

    public void setByteUnit(ByteBuffer byteBuffer) {
        this.mByteUnit = byteBuffer;
    }

    public void setCallback(IBaseResponseCallback iBaseResponseCallback) {
        this.mCallback = iBaseResponseCallback;
    }

    public void setEndTime(int i) {
        this.mEndTime = i;
    }

    public void setFileCallBack(IFileTransferStateCallback iFileTransferStateCallback) {
        this.mFileCallback = iFileTransferStateCallback;
    }

    public void setFileId(int i) {
        this.mFileId = i;
    }

    public void setFileLength(int i) {
        this.mFileLength = i;
    }

    public void setFileName(String str) {
        this.mFileName = str;
    }

    public void setFileOffset(int i) {
        this.mFileOffset = i;
    }

    public void setFilePath(String str) {
        this.mFilePath = str;
    }

    public void setFilePsn(int i) {
        this.mFilePsnTemp = i;
    }

    public void setFilePsnMax(int i) {
        this.mFilePsnMax = i;
    }

    public void setFileRequestCallBack(IPhotoFileCallback iPhotoFileCallback) {
        this.mFileRequestCallBack = iPhotoFileCallback;
    }

    public void setFileSize(int i) {
        this.mFileSize = i;
    }

    public void setFileType(int i) {
        this.mFileType = i;
    }

    public void setHashValue(String str) {
        this.mHashValue = str;
    }

    public void setKitCallback(IBaseCommonCallback iBaseCommonCallback) {
        this.mKitCallback = iBaseCommonCallback;
    }

    public void setNeedVerify(boolean z) {
        this.mIsNeddVerify = z;
    }

    public void setStartTime(int i) {
        this.mStartTime = i;
    }

    public void setTotalIndex(int i) {
        this.mTotalIndex = i;
    }

    public void setUriId(long j) {
        this.mUriId = j;
    }
}
