package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.mmedit;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.mmedit.media.MediaDataReceiver;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.mmedit.media.MediaDataSender;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.watchface.mvp.ui.activity.ScanImageActivity;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public class ThumbnailExtractor extends MediaDataSender implements Runnable {
    private static final String TAG = "ThumbnailExtractor";
    private MediaExtractor mExtractor;
    private volatile boolean mIsInterrupted;
    private ByteBuffer mSendBuffer;
    private int[] mTimeArray;
    private boolean mIsInitialized = false;
    private MediaFormat mVideoFormat = null;
    private int mVideoIndex = -1;
    private Thread mThread = null;
    private final Object mLock = new Object();

    protected ThumbnailExtractor() {
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007a  */
    protected int init(String str) {
        int integer;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.mExtractor = mediaExtractor;
        try {
            mediaExtractor.setDataSource(str);
            for (int i = 0; i < this.mExtractor.getTrackCount(); i++) {
                MediaFormat trackFormat = this.mExtractor.getTrackFormat(i);
                if (!trackFormat.getString("mime").startsWith("video/")) {
                    LogUtil.a(TAG, "init Unknown mime type ");
                } else {
                    this.mVideoFormat = trackFormat;
                    this.mVideoIndex = i;
                    this.mExtractor.selectTrack(i);
                    LogUtil.a(TAG, "init Video Format ");
                }
            }
            MediaFormat mediaFormat = this.mVideoFormat;
            if (mediaFormat == null) {
                LogUtil.e(TAG, "init mVideoFormat is null");
                return -4;
            }
            int i2 = ScanImageActivity.SCAN_IMAGE_LENGTH_LIMIT;
            if (mediaFormat != null) {
                mediaFormat.getInteger("width");
                if (this.mVideoFormat.containsKey("max-input-size")) {
                    integer = this.mVideoFormat.getInteger("max-input-size");
                    if (integer <= 0) {
                        integer = 0;
                    }
                } else {
                    integer = 5242880;
                }
            } else {
                integer = 0;
            }
            if (integer != 0) {
                i2 = integer;
            }
            LogUtil.a(TAG, "SendBuffer size ", Integer.valueOf(i2));
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i2);
            this.mSendBuffer = byteBufferAllocateDirect;
            byteBufferAllocateDirect.clear();
            this.mIsInterrupted = true;
            this.mIsInitialized = true;
            LogUtil.a(TAG, "init");
            return 0;
        } catch (IOException unused) {
            LogUtil.e(TAG, "init set data source failed!");
            return -2;
        }
    }

    protected int start(int[] iArr) {
        if (!this.mIsInitialized) {
            return -1000000;
        }
        if (iArr == null || iArr.length <= 0) {
            return -3;
        }
        this.mTimeArray = new int[iArr.length];
        this.mTimeArray = (int[]) iArr.clone();
        this.mIsInterrupted = false;
        synchronized (this.mLock) {
            Thread thread = new Thread(this, TAG);
            this.mThread = thread;
            thread.start();
        }
        return 0;
    }

    protected int stop() {
        LogUtil.a(TAG, "Enter Stop");
        if (!this.mIsInitialized) {
            return 0;
        }
        synchronized (this.mLock) {
            this.mIsInterrupted = true;
        }
        Thread thread = this.mThread;
        if (thread == null) {
            return 0;
        }
        try {
            thread.join();
            LogUtil.a(TAG, "Leave Stop");
            return 0;
        } catch (InterruptedException unused) {
            LogUtil.e(TAG, "stop thread failed!");
            return -1000000;
        }
    }

    protected MediaFormat getVideoFormat() {
        return this.mVideoFormat;
    }

    private int doSeek(long j) {
        LogUtil.a(TAG, "seekTo timeUs ", Long.valueOf(j));
        this.mExtractor.seekTo(j, 2);
        return 0;
    }

    public void release() {
        stop();
        MediaExtractor mediaExtractor = this.mExtractor;
        if (mediaExtractor != null) {
            mediaExtractor.release();
            this.mExtractor = null;
        }
        this.mIsInitialized = false;
    }

    @Override // java.lang.Runnable
    public void run() {
        LogUtil.a(TAG, "Video count = ", Integer.valueOf(this.mTimeArray.length));
        int i = 0;
        while (!this.mIsInterrupted) {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            LogUtil.a(TAG, "current count = ", Integer.valueOf(i));
            int[] iArr = this.mTimeArray;
            if (i >= iArr.length) {
                bufferInfo.flags = 4;
                this.mVideoReceiver.onDataReceive(bufferInfo, null, MediaDataReceiver.StreamType.VIDEO_STREAM);
                return;
            }
            doSeek(iArr[i] * 1000);
            i++;
            this.mSendBuffer.rewind();
            int sampleData = this.mExtractor.readSampleData(this.mSendBuffer, 0);
            int iOnDataReceive = -1000000;
            if (sampleData < 0) {
                bufferInfo.flags = 4;
                if (this.mVideoReceiver != null) {
                    while (iOnDataReceive != 0 && !this.mIsInterrupted) {
                        iOnDataReceive = this.mVideoReceiver.onDataReceive(bufferInfo, null, MediaDataReceiver.StreamType.VIDEO_STREAM);
                    }
                    if (iOnDataReceive != 0) {
                        LogUtil.e(TAG, "Try End Of Video Decoder Error");
                        return;
                    }
                    return;
                }
                return;
            }
            bufferInfo.flags = this.mExtractor.getSampleFlags();
            bufferInfo.presentationTimeUs = this.mExtractor.getSampleTime();
            bufferInfo.size = sampleData;
            bufferInfo.offset = 0;
            if (this.mVideoIndex == this.mExtractor.getSampleTrackIndex()) {
                LogUtil.a(TAG, "Reader Video = ", Long.valueOf(bufferInfo.presentationTimeUs));
                if (this.mVideoReceiver != null) {
                    while (iOnDataReceive != 0 && !this.mIsInterrupted) {
                        iOnDataReceive = this.mVideoReceiver.onDataReceive(bufferInfo, this.mSendBuffer, MediaDataReceiver.StreamType.VIDEO_STREAM);
                    }
                    if (iOnDataReceive != 0) {
                        LogUtil.e(TAG, "Video onDataReceive error!");
                    }
                }
            }
            this.mExtractor.advance();
        }
    }
}
