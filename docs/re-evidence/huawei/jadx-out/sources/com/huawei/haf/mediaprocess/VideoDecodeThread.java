package com.huawei.haf.mediaprocess;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.huawei.haf.common.exception.ExceptionUtils;
import health.compact.a.LogUtil;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class VideoDecodeThread extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DecodeOutputSurface f6004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f6005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6006c;
    private MediaCodec.BufferInfo d;
    private MediaCodec e;
    private MediaExtractor f;
    private EncodeInputSurface g;
    private FrameDropHelper h;
    private Integer i;
    private VideoProcessException j;
    private boolean k;
    private int l;
    private AtomicBoolean m;
    private boolean n;
    private boolean o;
    private IVideoEncodeThread p;
    private long q;
    private Integer r;
    private int s;
    private Integer t;

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Object obj = "decode stop error";
        super.run();
        try {
            try {
                c();
                EncodeInputSurface encodeInputSurface = this.g;
                if (encodeInputSurface != null) {
                    encodeInputSurface.d();
                }
                DecodeOutputSurface decodeOutputSurface = this.f6004a;
                if (decodeOutputSurface != null) {
                    decodeOutputSurface.e();
                }
                try {
                    MediaCodec mediaCodec = this.e;
                    obj = obj;
                    if (mediaCodec != null) {
                        mediaCodec.stop();
                        this.e.release();
                    }
                } catch (IllegalStateException e) {
                    VideoProcessException videoProcessException = this.j;
                    if (videoProcessException == null) {
                        videoProcessException = new VideoProcessException(e);
                    }
                    this.j = videoProcessException;
                    Object[] objArr = {"decode stop error"};
                    LogUtil.d("VideoDecodeThread", objArr);
                    obj = objArr;
                }
            } catch (Throwable th) {
                EncodeInputSurface encodeInputSurface2 = this.g;
                if (encodeInputSurface2 != null) {
                    encodeInputSurface2.d();
                }
                DecodeOutputSurface decodeOutputSurface2 = this.f6004a;
                if (decodeOutputSurface2 != null) {
                    decodeOutputSurface2.e();
                }
                try {
                    MediaCodec mediaCodec2 = this.e;
                    if (mediaCodec2 != null) {
                        mediaCodec2.stop();
                        this.e.release();
                    }
                } catch (IllegalStateException e2) {
                    VideoProcessException videoProcessException2 = this.j;
                    if (videoProcessException2 == null) {
                        videoProcessException2 = new VideoProcessException(e2);
                    }
                    this.j = videoProcessException2;
                    LogUtil.d("VideoDecodeThread", obj);
                }
                throw th;
            }
        } catch (IOException e3) {
            this.j = new VideoProcessException(e3);
            LogUtil.d("VideoDecodeThread", "video decode error");
            if (this.g != null) {
                this.g.d();
            }
            DecodeOutputSurface decodeOutputSurface3 = this.f6004a;
            if (decodeOutputSurface3 != null) {
                decodeOutputSurface3.e();
            }
            try {
                MediaCodec mediaCodec3 = this.e;
                obj = obj;
                if (mediaCodec3 != null) {
                    mediaCodec3.stop();
                    this.e.release();
                    obj = obj;
                }
            } catch (IllegalStateException e4) {
                VideoProcessException videoProcessException3 = this.j;
                if (videoProcessException3 == null) {
                    videoProcessException3 = new VideoProcessException(e4);
                }
                this.j = videoProcessException3;
                Object[] objArr2 = {"decode stop error"};
                LogUtil.d("VideoDecodeThread", objArr2);
                obj = objArr2;
            }
        }
    }

    private void c() throws IOException {
        if (g()) {
            e();
            d();
            boolean z = false;
            while (!this.n) {
                if (!z) {
                    int sampleTrackIndex = this.f.getSampleTrackIndex();
                    if (sampleTrackIndex == this.s) {
                        j();
                    } else if (sampleTrackIndex == -1) {
                        LogUtil.b("VideoDecodeThread", "inputDone");
                        int iDequeueInputBuffer = this.e.dequeueInputBuffer(2500L);
                        if (iDequeueInputBuffer >= 0) {
                            this.e.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                            z = true;
                        }
                    }
                }
                if (this.n) {
                    LogUtil.b("VideoDecodeThread", "decoderOutputAvailable:false");
                } else {
                    b();
                }
            }
            LogUtil.b("VideoDecodeThread", "Video Decode Done!");
            this.m.set(true);
        }
    }

    private void b() throws IOException {
        while (true) {
            int iDequeueOutputBuffer = this.e.dequeueOutputBuffer(this.d, 2500L);
            LogUtil.b("VideoDecodeThread", "outputBufferIndex = ", Integer.valueOf(iDequeueOutputBuffer));
            boolean z = false;
            if (this.o && iDequeueOutputBuffer == -1) {
                int i = this.f6006c + 1;
                this.f6006c = i;
                if (i > 10) {
                    LogUtil.d("VideoDecodeThread", "INFO_TRY_AGAIN_LATER 10 times,force End!");
                    this.n = true;
                    return;
                }
            } else {
                this.f6006c = 0;
            }
            if (iDequeueOutputBuffer == -1) {
                return;
            }
            if (iDequeueOutputBuffer == -2) {
                LogUtil.b("VideoDecodeThread", "decode newFormat = ", this.e.getOutputFormat());
            } else if (iDequeueOutputBuffer < 0) {
                LogUtil.d("VideoDecodeThread", "unexpected result from decoder.dequeueOutputBuffer: ", Integer.valueOf(iDequeueOutputBuffer));
            } else {
                boolean zA = a();
                if (this.d.flags == 4) {
                    this.n = true;
                    this.e.releaseOutputBuffer(iDequeueOutputBuffer, false);
                    LogUtil.b("VideoDecodeThread", "decoderDone");
                    return;
                }
                FrameDropHelper frameDropHelper = this.h;
                if (frameDropHelper == null || !frameDropHelper.d(this.l)) {
                    z = zA;
                } else {
                    LogUtil.e("VideoDecodeThread", "drop frame at:", Integer.valueOf(this.l));
                }
                this.l++;
                this.e.releaseOutputBuffer(iDequeueOutputBuffer, z);
                if (z && f()) {
                    return;
                }
            }
        }
    }

    private boolean a() {
        boolean z = true;
        if (this.i != null && this.d.presentationTimeUs >= ((long) this.i.intValue()) * 1000) {
            this.o = true;
            this.n = true;
            this.d.flags |= 4;
            z = false;
        }
        if (this.r == null || this.d.presentationTimeUs >= ((long) this.r.intValue()) * 1000) {
            return z;
        }
        LogUtil.d("VideoDecodeThread", "drop frame startTime = ", this.r, " present time = ", Long.valueOf(this.d.presentationTimeUs / 1000));
        return false;
    }

    private boolean f() throws IOException {
        boolean z;
        try {
            this.f6004a.a();
            z = false;
        } catch (IOException e) {
            LogUtil.d("VideoDecodeThread", ExceptionUtils.c(e));
            z = true;
        }
        if (!z) {
            if (this.q == -1) {
                long j = this.d.presentationTimeUs;
                this.q = j;
                LogUtil.b("VideoDecodeThread", "videoStartTime:", Long.valueOf(j / 1000));
            }
            this.f6004a.c();
            long j2 = (this.d.presentationTimeUs - this.q) * 1000;
            LogUtil.b("VideoDecodeThread", "drawImage,setPresentationTimeMs:", Long.valueOf((j2 / 1000) / 1000));
            this.g.b(j2);
            this.g.e();
        }
        return !z;
    }

    private void j() {
        this.n = false;
        int iDequeueInputBuffer = this.e.dequeueInputBuffer(2500L);
        if (iDequeueInputBuffer >= 0) {
            int sampleData = this.f.readSampleData(this.e.getInputBuffer(iDequeueInputBuffer), 0);
            if (sampleData < 0) {
                this.e.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                this.n = true;
            } else {
                this.e.queueInputBuffer(iDequeueInputBuffer, 0, sampleData, this.f.getSampleTime(), 0);
                this.f.advance();
            }
        }
    }

    private boolean g() {
        try {
            if (this.p.getEglContextLatch().await(5L, TimeUnit.SECONDS)) {
                return true;
            }
            this.j = new VideoProcessException("wait eglContext timeout!");
            return false;
        } catch (InterruptedException e) {
            LogUtil.d("VideoDecodeThread", "decode is interrupt");
            this.j = new VideoProcessException(e);
            return false;
        }
    }

    private void e() throws IOException {
        EncodeInputSurface encodeInputSurface = new EncodeInputSurface(this.p.getSurface());
        this.g = encodeInputSurface;
        encodeInputSurface.b();
        MediaFormat trackFormat = this.f.getTrackFormat(this.s);
        this.e = MediaCodec.createDecoderByType(trackFormat.getString("mime"));
        DecodeOutputSurface decodeOutputSurface = new DecodeOutputSurface();
        this.f6004a = decodeOutputSurface;
        this.e.configure(trackFormat, decodeOutputSurface.b(), (MediaCrypto) null, 0);
        this.e.start();
    }

    private void d() {
        Integer num;
        if (!this.k || (num = this.t) == null || this.f6005b == null || num.intValue() <= this.f6005b.intValue()) {
            return;
        }
        this.h = new FrameDropHelper(this.t.intValue(), this.f6005b.intValue());
        LogUtil.e("VideoDecodeThread", "need to drop frame:", this.t + "->", this.f6005b);
    }
}
