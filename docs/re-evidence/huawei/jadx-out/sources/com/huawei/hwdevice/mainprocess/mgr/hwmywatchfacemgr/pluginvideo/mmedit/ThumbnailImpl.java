package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.mmedit;

import android.media.MediaFormat;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class ThumbnailImpl {
    private static final String TAG = "ThumbnailImpl";
    private ThumbnailExtractor mDataReader = null;
    private ThumbnailDecoder mVideoDecoder = null;
    private boolean mIsInitialized = false;
    private boolean mIsRunning = false;
    private final Object mLock = new Object();

    protected ThumbnailImpl() {
    }

    protected int init(String str, int i, int i2) {
        synchronized (this.mLock) {
            if (this.mIsInitialized) {
                LogUtil.j(TAG, "Already Initialized!");
                return -11;
            }
            ThumbnailExtractor thumbnailExtractor = new ThumbnailExtractor();
            this.mDataReader = thumbnailExtractor;
            int iInit = thumbnailExtractor.init(str);
            if (iInit != 0) {
                return iInit;
            }
            MediaFormat videoFormat = this.mDataReader.getVideoFormat();
            if (videoFormat == null) {
                return -4;
            }
            ThumbnailDecoder thumbnailDecoder = new ThumbnailDecoder();
            this.mVideoDecoder = thumbnailDecoder;
            int iInit2 = thumbnailDecoder.init(videoFormat, i, i2);
            if (iInit2 != 0) {
                return iInit2;
            }
            this.mDataReader.addVideoReceiver(this.mVideoDecoder);
            this.mIsInitialized = true;
            return 0;
        }
    }

    protected int start(int[] iArr, Thumbnail.ThumbnailReceiver thumbnailReceiver) {
        if (!this.mIsInitialized) {
            LogUtil.e(TAG, "Not Initialized!");
            return -1;
        }
        synchronized (this.mLock) {
            if (this.mIsRunning) {
                return -11;
            }
            this.mIsRunning = true;
            LogUtil.a(TAG, "Enter Start");
            ThumbnailDecoder thumbnailDecoder = this.mVideoDecoder;
            int iStart = thumbnailDecoder != null ? thumbnailDecoder.start(iArr) : 0;
            ThumbnailExtractor thumbnailExtractor = this.mDataReader;
            if (thumbnailExtractor != null) {
                iStart |= thumbnailExtractor.start(iArr);
            }
            LogUtil.a(TAG, "Enter Start 1");
            if (iStart != 0) {
                LogUtil.a(TAG, "Enter Stop with error!");
                stop();
                return iStart;
            }
            if (this.mIsRunning) {
                return 0;
            }
            LogUtil.a(TAG, "Leave tart before Stop");
            return -13;
        }
    }

    protected int stop() {
        if (!this.mIsInitialized) {
            return 0;
        }
        LogUtil.a(TAG, "Enter Stop!");
        synchronized (this.mLock) {
            ThumbnailExtractor thumbnailExtractor = this.mDataReader;
            if (thumbnailExtractor != null) {
                thumbnailExtractor.stop();
            }
            ThumbnailDecoder thumbnailDecoder = this.mVideoDecoder;
            if (thumbnailDecoder != null) {
                thumbnailDecoder.stop();
            }
        }
        this.mIsRunning = false;
        LogUtil.a(TAG, "Leave Stop!");
        return 0;
    }

    protected int release() {
        LogUtil.a(TAG, "Enter release!");
        synchronized (this.mLock) {
            ThumbnailExtractor thumbnailExtractor = this.mDataReader;
            if (thumbnailExtractor != null) {
                thumbnailExtractor.release();
                this.mDataReader = null;
            }
            ThumbnailDecoder thumbnailDecoder = this.mVideoDecoder;
            if (thumbnailDecoder != null) {
                thumbnailDecoder.release();
                this.mVideoDecoder = null;
            }
        }
        this.mIsRunning = false;
        this.mIsInitialized = false;
        LogUtil.a(TAG, "Leave release!");
        return 0;
    }

    protected ThumbnailInfo getThumbnailInfo() {
        return this.mVideoDecoder.getThumbnailInfo();
    }

    protected boolean isNullDecoder() {
        return this.mVideoDecoder == null;
    }
}
