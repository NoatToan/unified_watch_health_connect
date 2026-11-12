package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.codec;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.view.Surface;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.VideoSurfaceManager2;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videorender.RenderSurfaceListener;
import com.huawei.watchface.videoedit.param.PlayerBean;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class SaveVideoSurfaceManager2 extends VideoSurfaceManager2 {
    private static final String TAG = "SaveVideoSurfaceManager2";
    private long decodeTimeUs;
    private boolean mIsInputFinished;
    private MediaExtractor mMediaExtractor;
    private MediaCodec mVideoDecoder;

    public SaveVideoSurfaceManager2(Surface surface, int i, RenderSurfaceListener renderSurfaceListener) {
        super(surface, i, renderSurfaceListener);
        this.decodeTimeUs = -10001L;
        this.mIsInputFinished = false;
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.VideoSurfaceManager2
    public void onSurfaceBind(PlayerBean playerBean) {
        super.onSurfaceBind(playerBean);
    }

    public Surface getSurface() {
        return this.mSurface;
    }

    public MediaExtractor getMediaExtractor() {
        return this.mMediaExtractor;
    }

    public void setMediaExtractor(MediaExtractor mediaExtractor) {
        this.mMediaExtractor = mediaExtractor;
    }

    public MediaCodec getVideoDecoder() {
        return this.mVideoDecoder;
    }

    public void setVideoDecoder(MediaCodec mediaCodec) {
        this.mVideoDecoder = mediaCodec;
    }

    public long getDecodeTimeUs() {
        return this.decodeTimeUs;
    }

    public void setDecodeTimeUs(long j) {
        if (this.mPlayerBean == null) {
            this.decodeTimeUs = j;
            LogUtil.b(TAG, "setDecodeTimeUs player bean is null");
        } else {
            this.decodeTimeUs = (long) (((j - (((long) this.mPlayerBean.getSourceTimeRange().getStart()) * 1000)) / this.mPlayerBean.getSpeed()) + (this.mPlayerBean.getTargetTimeRange().getStart() * 1000));
        }
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.VideoSurfaceManager2
    public void onSurfaceUnBind() {
        super.onSurfaceUnBind();
        MediaExtractor mediaExtractor = this.mMediaExtractor;
        if (mediaExtractor != null) {
            mediaExtractor.release();
        }
        MediaCodec mediaCodec = this.mVideoDecoder;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.mVideoDecoder.release();
        }
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.VideoSurfaceManager2
    public void onSurfaceRelease() {
        super.onSurfaceRelease();
    }

    public void inputFinished() {
        this.mIsInputFinished = true;
    }

    public void resetInput() {
        this.mIsInputFinished = false;
    }

    public boolean isInputFinished() {
        return this.mIsInputFinished;
    }
}
