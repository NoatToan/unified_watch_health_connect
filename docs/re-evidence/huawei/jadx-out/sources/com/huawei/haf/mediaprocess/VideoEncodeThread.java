package com.huawei.haf.mediaprocess;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.view.Surface;
import health.compact.a.LogUtil;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class VideoEncodeThread extends Thread implements IVideoEncodeThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MediaCodec f6007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private VideoProcessException f6008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AtomicBoolean f6009c;
    private MediaMuxer d;
    private volatile CountDownLatch e;
    private CountDownLatch f;
    private volatile Surface h;
    private VideoProgress i;

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        super.run();
        try {
            try {
                c();
                try {
                    MediaCodec mediaCodec = this.f6007a;
                    if (mediaCodec != null) {
                        mediaCodec.stop();
                        this.f6007a.release();
                    }
                } catch (IllegalStateException e) {
                    VideoProcessException videoProcessException = this.f6008b;
                    if (videoProcessException == null) {
                        videoProcessException = new VideoProcessException(e);
                    }
                    this.f6008b = videoProcessException;
                    LogUtil.d("VideoEncodeThread", "release encode fail");
                }
            } catch (IOException e2) {
                LogUtil.d("VideoEncodeThread", "video encode error");
                this.f6008b = new VideoProcessException(e2);
                try {
                    if (this.f6007a != null) {
                        this.f6007a.stop();
                        this.f6007a.release();
                    }
                } catch (IllegalStateException e3) {
                    VideoProcessException videoProcessException2 = this.f6008b;
                    if (videoProcessException2 == null) {
                        videoProcessException2 = new VideoProcessException(e3);
                    }
                    this.f6008b = videoProcessException2;
                    LogUtil.d("VideoEncodeThread", "release encode fail");
                }
            }
        } catch (Throwable th) {
            try {
                MediaCodec mediaCodec2 = this.f6007a;
                if (mediaCodec2 != null) {
                    mediaCodec2.stop();
                    this.f6007a.release();
                }
            } catch (IllegalStateException e4) {
                VideoProcessException videoProcessException3 = this.f6008b;
                if (videoProcessException3 == null) {
                    videoProcessException3 = new VideoProcessException(e4);
                }
                this.f6008b = videoProcessException3;
                LogUtil.d("VideoEncodeThread", "release encode fail");
            }
            throw th;
        }
    }

    private void c() throws IOException {
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        boolean z = false;
        int i = 0;
        int iAddTrack = -5;
        while (true) {
            if (this.f6009c.get() && !z) {
                this.f6007a.signalEndOfInputStream();
                z = true;
            }
            int iDequeueOutputBuffer = this.f6007a.dequeueOutputBuffer(bufferInfo, 2500L);
            LogUtil.b("VideoEncodeThread", "encode outputBufferIndex = ", Integer.valueOf(iDequeueOutputBuffer));
            if (z && iDequeueOutputBuffer == -1) {
                i++;
                if (i > 10) {
                    LogUtil.d("VideoEncodeThread", "INFO_TRY_AGAIN_LATER 10 times,force End!");
                    break;
                }
            } else {
                i = 0;
            }
            if (iDequeueOutputBuffer != -1) {
                if (iDequeueOutputBuffer == -2) {
                    MediaFormat outputFormat = this.f6007a.getOutputFormat();
                    if (iAddTrack == -5) {
                        iAddTrack = this.d.addTrack(outputFormat);
                        e();
                    }
                    LogUtil.b("VideoEncodeThread", "encode newFormat = ", outputFormat);
                } else if (iDequeueOutputBuffer < 0) {
                    LogUtil.d("VideoEncodeThread", "unexpected result from decoder.dequeueOutputBuffer: ", Integer.valueOf(iDequeueOutputBuffer));
                } else {
                    if (bufferInfo.flags == 4 && bufferInfo.presentationTimeUs < 0) {
                        bufferInfo.presentationTimeUs = 0L;
                    }
                    LogUtil.b("VideoEncodeThread", "writeSampleData,size:", Integer.valueOf(bufferInfo.size), " time:", Long.valueOf(bufferInfo.presentationTimeUs / 1000));
                    this.d.writeSampleData(iAddTrack, this.f6007a.getOutputBuffer(iDequeueOutputBuffer), bufferInfo);
                    b(bufferInfo);
                    this.f6007a.releaseOutputBuffer(iDequeueOutputBuffer, false);
                    if (bufferInfo.flags == 4) {
                        LogUtil.b("VideoEncodeThread", "encoderDone");
                        break;
                    }
                }
            }
        }
        LogUtil.b("VideoEncodeThread", "Video Encode Done!");
    }

    private void e() {
        this.d.start();
        this.f.countDown();
    }

    private void b(MediaCodec.BufferInfo bufferInfo) {
        VideoProgress videoProgress = this.i;
        if (videoProgress == null) {
            return;
        }
        videoProgress.e((bufferInfo.flags & 4) != 0 ? Long.MAX_VALUE : bufferInfo.presentationTimeUs);
    }

    @Override // com.huawei.haf.mediaprocess.IVideoEncodeThread
    public Surface getSurface() {
        return this.h;
    }

    @Override // com.huawei.haf.mediaprocess.IVideoEncodeThread
    public CountDownLatch getEglContextLatch() {
        return this.e;
    }
}
