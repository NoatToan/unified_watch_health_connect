package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.codec.encode;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.google.android.gms.common.util.GmsVersion;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.codec.CodecContext;
import com.huawei.watchface.videoedit.utils.EncoderFormat;
import defpackage.eey;
import defpackage.mgg;
import health.compact.a.LogUtil;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public class VideoEncoder implements Encoder, EncodedTrack {
    private static final int ENCODE_LAST_FRAME_WAIT_TIME_MS = 5000;
    private static final String MIME_TYPE = "video/avc";
    private static final String TAG = "VideoEncoder";
    private int mBitRate;
    private MediaCodec.BufferInfo mEncodeInfo;
    private EncoderFormat mEncoderFormat;
    private boolean mIsSingleVideoMode;
    private Muxer mMuxer;
    private Surface mSurface;
    private MediaCodec mVideoEncoder;
    private MediaFormat mVideoFormat;
    private int mVideoHeight;
    private int mVideoWidth;
    private int mTrackIndex = -1;
    private boolean mIsEncodeFinished = false;

    public VideoEncoder(Muxer muxer, int i, int i2, int i3, boolean z) {
        this.mMuxer = muxer;
        this.mBitRate = i;
        this.mVideoWidth = i2;
        this.mVideoHeight = i3;
        this.mIsSingleVideoMode = z;
        if (muxer != null) {
            muxer.attachToMuxer(this);
        }
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.codec.encode.Initializable
    public boolean init() {
        this.mEncoderFormat = new EncoderFormat();
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", this.mVideoWidth, this.mVideoHeight);
        this.mVideoFormat = mediaFormatCreateVideoFormat;
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        this.mVideoFormat.setInteger("bitrate", this.mBitRate);
        this.mVideoFormat.setInteger("frame-rate", this.mEncoderFormat.getmFrameRate());
        if (this.mIsSingleVideoMode) {
            this.mVideoFormat.setInteger("bitrate-mode", 2);
        }
        try {
            boolean zIsSupportVideoPreprocessing = isSupportVideoPreprocessing();
            LogUtil.b("VideoEncoder", "init isSupportVideoPreprocessing is ", Boolean.valueOf(zIsSupportVideoPreprocessing));
            if (!zIsSupportVideoPreprocessing) {
                this.mVideoFormat.setInteger("i-frame-interval", this.mEncoderFormat.getmFrameInterval());
            } else {
                this.mVideoFormat.setInteger("max_ref_frames", 1);
                this.mVideoFormat.setInteger("b_frames", 0);
                this.mVideoFormat.setInteger("slice-count", 1);
                this.mVideoFormat.setInteger("i-frame-interval", 30);
                this.mVideoFormat.setInteger("level", 256);
            }
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("video/avc");
            this.mVideoEncoder = mediaCodecCreateEncoderByType;
            mediaCodecCreateEncoderByType.configure(this.mVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            this.mSurface = this.mVideoEncoder.createInputSurface();
            this.mVideoEncoder.start();
            this.mEncodeInfo = new MediaCodec.BufferInfo();
            return true;
        } catch (RuntimeException e) {
            LogUtil.d("VideoEncoder", "init videoEncoderInit RuntimeException ", ExceptionUtils.c(e));
            return false;
        } catch (Exception e2) {
            LogUtil.d("VideoEncoder", "init videoEncoderInit exception ", ExceptionUtils.c(e2));
            return false;
        }
    }

    public static boolean isSupportVideoPreprocessing() {
        DeviceInfo deviceInfoD = mgg.d("VideoEncoder");
        if (deviceInfoD == null) {
            LogUtil.e("VideoEncoder", "isSupportVideoPreprocessing deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfoD, 261);
    }

    public Surface getSurface() {
        return this.mSurface;
    }

    @Override // com.huawei.watchface.videoedit.utils.Releasable
    public void release() {
        MediaCodec mediaCodec = this.mVideoEncoder;
        if (mediaCodec != null) {
            mediaCodec.signalEndOfInputStream();
            this.mVideoEncoder.stop();
            this.mVideoEncoder.release();
            this.mVideoEncoder = null;
        }
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.codec.encode.EncodedTrack
    public boolean isTrackFinished() {
        return this.mIsEncodeFinished;
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.codec.encode.EncodedTrack
    public boolean isAddedToMuxer() {
        return this.mTrackIndex != -1;
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.codec.encode.EncodedTrack
    public int getTrackIndex() {
        return this.mTrackIndex;
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.codec.encode.Encoder
    public void encodeFrame(CodecContext codecContext, boolean z, long j) throws Exception {
        while (true) {
            int iDequeueOutputBuffer = this.mVideoEncoder.dequeueOutputBuffer(this.mEncodeInfo, z ? GmsVersion.VERSION_LONGHORN : 0);
            LogUtil.c("VideoEncoder", "encodeOutputState is " + iDequeueOutputBuffer);
            if (iDequeueOutputBuffer == -1) {
                return;
            }
            if (iDequeueOutputBuffer == -2) {
                this.mTrackIndex = this.mMuxer.addTrack(this.mVideoEncoder.getOutputFormat());
                this.mMuxer.start();
            } else if (iDequeueOutputBuffer < 0) {
                LogUtil.b("VideoEncoder", "encodeFrame encodeOutputState < 0", Integer.valueOf(iDequeueOutputBuffer));
            } else {
                if ((this.mEncodeInfo.flags & 4) != 0) {
                    LogUtil.e("VideoEncoder", "encodeFrame isOutputFinish is done");
                    this.mIsEncodeFinished = true;
                    return;
                }
                if ((this.mEncodeInfo.flags & 2) != 0) {
                    this.mEncodeInfo.size = 0;
                }
                ByteBuffer outputBuffer = this.mVideoEncoder.getOutputBuffer(iDequeueOutputBuffer);
                if (this.mEncodeInfo.size > 0) {
                    this.mMuxer.addMuxerData(this.mTrackIndex, outputBuffer, this.mEncodeInfo);
                }
                this.mVideoEncoder.releaseOutputBuffer(iDequeueOutputBuffer, false);
                LogUtil.d("VideoEncoder", "encodeFrame mEncodeInfo.presentationTimeUs is ", Long.valueOf(this.mEncodeInfo.presentationTimeUs), " lastTimeStamp ", Long.valueOf(j));
                if (this.mEncodeInfo.presentationTimeUs >= j) {
                    LogUtil.d("VideoEncoder", "encodeFrame mEncodeInfo.presentationTimeUs is ", Long.valueOf(this.mEncodeInfo.presentationTimeUs), " lastTimeStamp ", Long.valueOf(j));
                    return;
                }
            }
            if (codecContext != null && codecContext.isCanceled()) {
                return;
            }
        }
    }
}
