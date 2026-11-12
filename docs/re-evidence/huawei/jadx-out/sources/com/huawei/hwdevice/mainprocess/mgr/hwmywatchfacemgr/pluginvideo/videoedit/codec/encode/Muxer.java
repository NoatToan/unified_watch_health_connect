package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.codec.encode;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.watchface.videoedit.dfx.DfxGuard;
import com.huawei.watchface.videoedit.utils.Releasable;
import com.huawei.watchface.videoedit.utils.Utils;
import health.compact.a.LogUtil;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ohos.ace.plugin.taskmanagerplugin.EventType;

/* JADX INFO: loaded from: classes10.dex */
public final class Muxer implements Releasable, Initializable {
    private static final String TAG = "Muxer";
    private MediaMuxer mMediaMuxer;
    private File mTempVideoFile;
    private String mVideoSavePath;
    private volatile boolean mIsMuxerBegin = false;
    private final Object mLock = new Object();
    private List<EncodedTrack> mTracks = new ArrayList(2);

    public Muxer(String str) {
        this.mVideoSavePath = str;
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.codec.encode.Initializable
    public boolean init() {
        try {
            this.mTempVideoFile = new File(this.mVideoSavePath);
            this.mMediaMuxer = new MediaMuxer(this.mVideoSavePath, 0);
            return true;
        } catch (RuntimeException e) {
            LogUtil.d("Muxer", "init RuntimeException initMuxer", ExceptionUtils.c(e));
            return false;
        } catch (Exception e2) {
            LogUtil.d("Muxer", "init exception initMuxer", ExceptionUtils.c(e2));
            return false;
        }
    }

    void attachToMuxer(EncodedTrack encodedTrack) {
        if (encodedTrack == null) {
            LogUtil.b("Muxer", "attachToMuxer Track is null, can't add to muxer");
        }
        this.mTracks.add(encodedTrack);
    }

    public int addTrack(MediaFormat mediaFormat) {
        return this.mMediaMuxer.addTrack(mediaFormat);
    }

    public void start() {
        if (!isAllTrackAdded() || this.mIsMuxerBegin) {
            return;
        }
        this.mMediaMuxer.start();
        synchronized (this.mLock) {
            this.mIsMuxerBegin = true;
            this.mLock.notifyAll();
            LogUtil.d("Muxer", "start Muxer begin");
        }
    }

    public void addMuxerData(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) throws InterruptedException {
        synchronized (this.mLock) {
            while (!this.mIsMuxerBegin) {
                LogUtil.e("Muxer", "addMuxerData wait to add other track when add muxer for ", Integer.valueOf(i));
                this.mLock.wait();
            }
        }
        MediaMuxer mediaMuxer = this.mMediaMuxer;
        if (mediaMuxer == null) {
            throw new InterruptedException();
        }
        mediaMuxer.writeSampleData(i, byteBuffer, bufferInfo);
    }

    private boolean isAllTrackAdded() {
        Iterator<EncodedTrack> it = this.mTracks.iterator();
        while (it.hasNext()) {
            if (!it.next().isAddedToMuxer()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.huawei.watchface.videoedit.utils.Releasable
    public void release() {
        MediaMuxer mediaMuxer = this.mMediaMuxer;
        if (mediaMuxer != null) {
            mediaMuxer.stop();
            this.mMediaMuxer.release();
            this.mMediaMuxer = null;
        }
        this.mIsMuxerBegin = false;
    }

    public void failed() {
        LogUtil.d("Muxer", EventType.FAILED);
        Utils.release(this);
        deletedCacheFiles();
    }

    private void deletedCacheFiles() {
        File file = this.mTempVideoFile;
        if (file == null || !file.exists()) {
            return;
        }
        DfxGuard.getPolicy().onWriteDisk();
        if (this.mTempVideoFile.delete()) {
            LogUtil.d("Muxer", "deletedCacheFiles delete file success");
        }
    }
}
