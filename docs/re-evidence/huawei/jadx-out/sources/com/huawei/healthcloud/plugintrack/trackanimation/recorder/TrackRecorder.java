package com.huawei.healthcloud.plugintrack.trackanimation.recorder;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.hardware.display.VirtualDisplay;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaMuxer;
import android.media.projection.MediaProjection;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.view.Surface;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.healthcloud.plugintrack.trackanimation.recorder.auxiliary.FrameControlCallBack;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.jer;
import defpackage.jfu;
import defpackage.jho;
import defpackage.yzc;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public abstract class TrackRecorder extends Thread {
    protected static final int DEFAULT_VIDEO_BITRATE = 24000000;
    protected static final int DEFAULT_VIDEO_DPI = 1;
    private static final int DEFAULT_VIDEO_HEIGHT = 1280;
    private static final int DEFAULT_VIDEO_WIDTH = 720;
    private static final int ERROR_KEY = -1;
    protected static final int FRAME_RATE = 60;
    private static final int HD_VIDEO_WIDTH = 1080;
    protected static final int IFRAME_INTERVAL = 1;
    protected static final String MIME_TYPE = "video/avc";
    public static final int MSG_RECORD_FINISHED = 15790320;
    private static final String TAG = "Track_TrackRecorder";
    private static final int TIMEOUT_US = 10000;
    private static final int WAIT_TIME_MS = 10;
    private MediaCodec.BufferInfo mBufferInfo;
    protected MediaCodec mEncoder;
    protected e mErrorManager;
    protected int mHeight;
    private boolean mIsMuxerStarted;
    private boolean mIsStop;
    private MediaProjection mMediaProjection;
    private c mMessageManager;
    private b mMixAudio;
    private Handler mMsgHandler;
    private MediaMuxer mMuxer;
    private a mMuxerFileManager;
    private Paint mPaint;
    private final ExtendHandler mPixelHandler;
    private int mVideoTrackIndex;
    private VirtualDisplay mVirtualDisplay;
    protected Surface mVirtualSurface;
    protected int mWidth;

    protected abstract void prepareEncoder();

    protected abstract void startEncode();

    protected abstract void stopEncode();

    /* JADX INFO: renamed from: com.huawei.healthcloud.plugintrack.trackanimation.recorder.TrackRecorder$3, reason: invalid class name */
    public class AnonymousClass3 implements Handler.Callback {
        AnonymousClass3() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (TrackRecorder.this.mIsStop) {
                return false;
            }
            jfu.f38557a.e().c(new Function1() { // from class: jge
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return this.d.b((Bitmap) obj);
                }
            });
            TrackRecorder.this.mPixelHandler.sendMessage(Message.obtain(), 35L);
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ yzc b(Bitmap bitmap) throws Throwable {
            TrackRecorder trackRecorder = TrackRecorder.this;
            trackRecorder.drawBitmapToSurface(bitmap, trackRecorder.mVirtualSurface);
            return null;
        }
    }

    public TrackRecorder(MediaProjection mediaProjection, String str) {
        super(TAG);
        this.mWidth = 720;
        this.mHeight = 1280;
        this.mVirtualSurface = null;
        this.mEncoder = null;
        this.mErrorManager = new e();
        this.mMuxer = null;
        this.mBufferInfo = new MediaCodec.BufferInfo();
        this.mVirtualDisplay = null;
        this.mIsMuxerStarted = false;
        this.mVideoTrackIndex = -1;
        this.mMixAudio = new b();
        this.mMuxerFileManager = new a();
        this.mMessageManager = new c();
        this.mMsgHandler = null;
        this.mIsStop = false;
        this.mPaint = new Paint();
        this.mPixelHandler = HandlerCenter.b(new AnonymousClass3(), TAG);
        this.mMediaProjection = mediaProjection;
        this.mMuxerFileManager.c(str);
        this.mPaint.setAntiAlias(true);
        this.mPaint.setFilterBitmap(true);
    }

    public TrackRecorder(MediaProjection mediaProjection, Uri uri) {
        super(TAG);
        this.mWidth = 720;
        this.mHeight = 1280;
        this.mVirtualSurface = null;
        this.mEncoder = null;
        this.mErrorManager = new e();
        this.mMuxer = null;
        this.mBufferInfo = new MediaCodec.BufferInfo();
        this.mVirtualDisplay = null;
        this.mIsMuxerStarted = false;
        this.mVideoTrackIndex = -1;
        this.mMixAudio = new b();
        this.mMuxerFileManager = new a();
        this.mMessageManager = new c();
        this.mMsgHandler = null;
        this.mIsStop = false;
        this.mPaint = new Paint();
        this.mPixelHandler = HandlerCenter.b(new AnonymousClass3(), TAG);
        this.mMediaProjection = mediaProjection;
        this.mMuxerFileManager.b(uri);
        this.mPaint.setAntiAlias(true);
        this.mPaint.setFilterBitmap(true);
    }

    public TrackRecorder reviseVideoResolution(boolean z, boolean z2) {
        if (z2) {
            setDisplayVideo(16.0f, 16, 1080);
        } else {
            setDisplayVideo(16.0f, 16, 720);
        }
        if (z) {
            this.mHeight *= 2;
            this.mWidth *= 2;
        }
        return this;
    }

    private void setDisplayVideo(float f, int i, int i2) {
        int iE = (jer.e() * i2) / jer.a();
        this.mHeight = iE;
        this.mHeight = Math.round(iE / f) * i;
        this.mWidth = i2;
    }

    public long getVideoDuration() {
        return this.mMixAudio.a();
    }

    public TrackRecorder setAudioFileDescriptor(AssetFileDescriptor assetFileDescriptor) {
        this.mMixAudio.d(assetFileDescriptor);
        return this;
    }

    public TrackRecorder setAudioFilePath(String str) {
        this.mMixAudio.c(str);
        return this;
    }

    public TrackRecorder setHandler(Handler handler) {
        this.mMsgHandler = handler;
        return this;
    }

    public boolean isRunSuccess() {
        return this.mErrorManager.e();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            Thread.sleep(100L);
        } catch (InterruptedException unused) {
            LogUtil.e(TAG, "sleep error");
        }
        this.mMessageManager.b();
        prepareEncoder();
        this.mMuxerFileManager.d();
        if (!this.mErrorManager.e()) {
            release();
            this.mMessageManager.d();
            ReleaseLogUtil.a(TAG, "record is fail");
        } else if (this.mVirtualSurface == null) {
            release();
            this.mMessageManager.d();
            ReleaseLogUtil.a(TAG, "virtualSurface is null");
        } else if (jho.b() || !isVirtualDisplayFailed()) {
            try {
                startEncode();
                this.mMixAudio.c();
            } finally {
                release();
                this.mMessageManager.d();
                this.mMessageManager.c();
            }
        }
    }

    private boolean isVirtualDisplayFailed() {
        try {
            this.mMediaProjection.registerCallback(new MediaProjection.Callback(this) { // from class: com.huawei.healthcloud.plugintrack.trackanimation.recorder.TrackRecorder.2
                @Override // android.media.projection.MediaProjection.Callback
                public void onStop() {
                    super.onStop();
                    ReleaseLogUtil.e(TrackRecorder.TAG, "mMediaProjection onStop");
                }
            }, this.mMsgHandler);
            this.mVirtualDisplay = this.mMediaProjection.createVirtualDisplay("Track_TrackRecorder-display", this.mWidth, this.mHeight, 1, 1, this.mVirtualSurface, null, null);
        } catch (SecurityException e2) {
            ReleaseLogUtil.e(TAG, "mediaProjection create error : ", LogAnonymous.b(e2));
        }
        if (this.mVirtualDisplay != null) {
            return false;
        }
        release();
        this.mMessageManager.d();
        ReleaseLogUtil.a(TAG, "virtualDisplay is null");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void drawBitmapToSurface(Bitmap bitmap, Surface surface) throws Throwable {
        if (bitmap == null || surface == null) {
            ReleaseLogUtil.a(TAG, "drawBitmapToSurface bitmap with null: ", Boolean.valueOf(bitmap == null));
            return;
        }
        Canvas canvas = null;
        try {
            Canvas canvasLockCanvas = surface.lockCanvas(null);
            if (canvasLockCanvas == null) {
                if (canvasLockCanvas != null) {
                    surface.unlockCanvasAndPost(canvasLockCanvas);
                }
                bitmap.recycle();
                return;
            }
            try {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int width2 = canvasLockCanvas.getWidth();
                int height2 = canvasLockCanvas.getHeight();
                if (width != 0 && height != 0 && width2 != 0 && height2 != 0) {
                    float f = width;
                    float f2 = height;
                    float fMin = Math.min(width2 / f, height2 / f2);
                    int i = (int) (f * fMin);
                    int i2 = (int) (f2 * fMin);
                    int i3 = (width2 - i) / 2;
                    int i4 = (height2 - i2) / 2;
                    canvasLockCanvas.drawBitmap(bitmap, (Rect) null, new Rect(i3, i4, i + i3, i2 + i4), this.mPaint);
                    if (canvasLockCanvas != null) {
                        surface.unlockCanvasAndPost(canvasLockCanvas);
                    }
                    bitmap.recycle();
                    return;
                }
                ReleaseLogUtil.a(TAG, "bitmap: ", Integer.valueOf(width), Integer.valueOf(width), "surface: ", Integer.valueOf(width2), Integer.valueOf(height2));
                if (canvasLockCanvas != null) {
                    surface.unlockCanvasAndPost(canvasLockCanvas);
                }
                bitmap.recycle();
            } catch (Throwable th) {
                th = th;
                canvas = canvasLockCanvas;
                if (canvas != null) {
                    surface.unlockCanvasAndPost(canvas);
                }
                bitmap.recycle();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void startViewRecord() {
        this.mIsStop = false;
        this.mPixelHandler.sendMessage(Message.obtain());
    }

    public void stopScreen() {
        this.mMessageManager.c();
        stopEncode();
        this.mIsStop = true;
        LogUtil.a(TAG, "stopScreen");
    }

    public void stopScreenOnActive() {
        this.mErrorManager.b("stop success");
        this.mMessageManager.c();
        stopEncode();
        this.mIsStop = true;
        LogUtil.a(TAG, "stopScreenOnActive");
    }

    protected void encodeCurrentFrame(FrameControlCallBack frameControlCallBack) {
        int iDequeueOutputBuffer;
        try {
            iDequeueOutputBuffer = this.mEncoder.dequeueOutputBuffer(this.mBufferInfo, 10000L);
        } catch (IllegalStateException e2) {
            LogUtil.j(TAG, "encodeCurrentFrame:c ", LogAnonymous.b(e2));
            iDequeueOutputBuffer = -3;
        }
        ReleaseLogUtil.d(TAG, "encodeCurrentFrame:c index = ", Integer.valueOf(iDequeueOutputBuffer));
        if (iDequeueOutputBuffer == -2) {
            resetOutputFormat();
            return;
        }
        if (iDequeueOutputBuffer == -1) {
            LogUtil.j(TAG, "retrieving buffers time out! c");
            try {
                Thread.sleep(10L);
                return;
            } catch (InterruptedException unused) {
                LogUtil.j(TAG, "thread sleep is error c");
                return;
            }
        }
        if (iDequeueOutputBuffer < 0) {
            LogUtil.e(TAG, "error in encodeCurrentFrame c");
        } else if (!this.mIsMuxerStarted) {
            this.mErrorManager.b("media start mixur error");
            stopEncode();
        } else {
            addVideoTrack(iDequeueOutputBuffer, frameControlCallBack);
            this.mEncoder.releaseOutputBuffer(iDequeueOutputBuffer, false);
        }
    }

    public void encodeCurrentFrame() {
        int iDequeueOutputBuffer;
        try {
            iDequeueOutputBuffer = this.mEncoder.dequeueOutputBuffer(this.mBufferInfo, 10000L);
        } catch (IllegalStateException e2) {
            LogUtil.j(TAG, "encodeCurrentFrame: ", LogAnonymous.b(e2));
            iDequeueOutputBuffer = -3;
        }
        if (iDequeueOutputBuffer == -2) {
            ReleaseLogUtil.d(TAG, "encodeCurrentFrame: index = ", -2);
            resetOutputFormat();
            return;
        }
        if (iDequeueOutputBuffer == -1) {
            ReleaseLogUtil.d(TAG, "encodeCurrentFrame: index = ", -1);
            LogUtil.j(TAG, "retrieving buffers time out!");
            try {
                Thread.sleep(10L);
                return;
            } catch (InterruptedException unused) {
                LogUtil.j(TAG, "thread sleep is error");
                return;
            }
        }
        if (iDequeueOutputBuffer < 0) {
            LogUtil.e(TAG, "error in encodeCurrentFrame");
        } else if (!this.mIsMuxerStarted) {
            this.mErrorManager.b("media start mixur error");
            stopEncode();
        } else {
            addVideoTrack(iDequeueOutputBuffer);
            this.mEncoder.releaseOutputBuffer(iDequeueOutputBuffer, false);
        }
    }

    private void release() {
        try {
            MediaCodec mediaCodec = this.mEncoder;
            if (mediaCodec != null) {
                mediaCodec.stop();
                this.mEncoder.release();
                this.mEncoder = null;
            }
            VirtualDisplay virtualDisplay = this.mVirtualDisplay;
            if (virtualDisplay != null) {
                virtualDisplay.release();
                this.mVirtualDisplay = null;
            }
            MediaMuxer mediaMuxer = this.mMuxer;
            if (mediaMuxer != null) {
                mediaMuxer.stop();
                this.mMuxer.release();
                this.mMuxer = null;
            }
            this.mMixAudio.d();
            MediaProjection mediaProjection = this.mMediaProjection;
            if (mediaProjection != null) {
                mediaProjection.stop();
                this.mMediaProjection = null;
            }
            this.mPixelHandler.removeTasksAndMessages();
        } catch (IllegalStateException e2) {
            LogUtil.e(TAG, e2.getMessage());
        } finally {
            MediaProjection mediaProjection2 = this.mMediaProjection;
            if (mediaProjection2 != null) {
                mediaProjection2.stop();
                this.mMediaProjection = null;
            }
        }
    }

    private void addVideoTrack(int i, FrameControlCallBack frameControlCallBack) {
        ByteBuffer outputBuffer = this.mEncoder.getOutputBuffer(i);
        if ((this.mBufferInfo.flags & 2) != 0) {
            LogUtil.a(TAG, "ignoring BUFFER_FLAG_CODEC_CONFIG");
            this.mBufferInfo.size = 0;
        }
        if (this.mBufferInfo.size == 0) {
            outputBuffer = null;
        }
        if (outputBuffer != null) {
            LogUtil.a(TAG, "before presentationTimeUs: " + this.mBufferInfo.presentationTimeUs);
            if (frameControlCallBack.isSaveCurrentFrame(this.mBufferInfo.presentationTimeUs)) {
                outputBuffer.position(this.mBufferInfo.offset);
                outputBuffer.limit(this.mBufferInfo.offset + this.mBufferInfo.size);
                this.mBufferInfo.presentationTimeUs = frameControlCallBack.getFrameTimeStamp();
                LogUtil.a(TAG, "after presentationTimeUs: " + this.mBufferInfo.presentationTimeUs);
                this.mMixAudio.c(this.mBufferInfo.presentationTimeUs);
                this.mMuxer.writeSampleData(this.mVideoTrackIndex, outputBuffer, this.mBufferInfo);
            }
        }
    }

    private void addVideoTrack(int i) {
        ByteBuffer outputBuffer = this.mEncoder.getOutputBuffer(i);
        if ((this.mBufferInfo.flags & 2) != 0) {
            LogUtil.a(TAG, "ignoring BUFFER_FLAG_CODEC_CONFIG");
            this.mBufferInfo.size = 0;
        }
        if (this.mBufferInfo.size == 0) {
            outputBuffer = null;
        }
        if (outputBuffer != null) {
            outputBuffer.position(this.mBufferInfo.offset);
            outputBuffer.limit(this.mBufferInfo.offset + this.mBufferInfo.size);
            this.mMixAudio.c(this.mBufferInfo.presentationTimeUs);
            try {
                this.mMuxer.writeSampleData(this.mVideoTrackIndex, outputBuffer, this.mBufferInfo);
            } catch (IllegalArgumentException e2) {
                ReleaseLogUtil.e(TAG, "addVideoTrack: IllegalArgumentException ", LogAnonymous.b(e2));
            } catch (IllegalStateException e3) {
                ReleaseLogUtil.e(TAG, "addVideoTrack: IllegalStateException ", LogAnonymous.b(e3));
            }
        }
    }

    private void resetOutputFormat() {
        if (this.mIsMuxerStarted) {
            stopEncode();
            this.mErrorManager.b("media add video error");
            return;
        }
        this.mVideoTrackIndex = this.mMuxer.addTrack(this.mEncoder.getOutputFormat());
        try {
            this.mMixAudio.e();
        } catch (IllegalArgumentException e2) {
            ReleaseLogUtil.e(TAG, "resetOutputFormat addAudioTrack ", LogAnonymous.b(e2));
        }
        ReleaseLogUtil.d(TAG, "resetOutputFormat: video index is ", Integer.valueOf(this.mVideoTrackIndex), " audio index is ", Integer.valueOf(this.mMixAudio.g));
        if (this.mVideoTrackIndex == -1) {
            stopEncode();
            this.mErrorManager.b("media add video error");
            LogUtil.a(TAG, "resetOutputFormat: ");
            return;
        }
        try {
            this.mMuxer.start();
            this.mIsMuxerStarted = true;
        } catch (IllegalStateException e3) {
            ReleaseLogUtil.e(TAG, "resetOutputFormat: ", LogAnonymous.b(e3));
            stopEncode();
            this.mErrorManager.b("Muxer start error");
        }
    }

    class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f10671b;

        private c() {
            this.f10671b = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            this.f10671b = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            this.f10671b = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            if (TrackRecorder.this.mMsgHandler == null || !this.f10671b) {
                return;
            }
            TrackRecorder.this.mMsgHandler.sendEmptyMessage(TrackRecorder.MSG_RECORD_FINISHED);
            this.f10671b = false;
        }
    }

    class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Uri f10666b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f10667c;
        private FileDescriptor d;
        private String e;

        private a() {
            this.f10667c = false;
        }

        public void c(String str) {
            this.e = str;
            this.d = null;
            this.f10667c = false;
            this.f10666b = null;
        }

        public void b(Uri uri) {
            this.f10666b = uri;
            this.d = null;
            this.e = null;
            this.f10667c = true;
        }

        public void d() {
            try {
                if (!this.f10667c) {
                    if (this.e == null) {
                        TrackRecorder.this.mErrorManager.b("out file is null");
                        LogUtil.e(TrackRecorder.TAG, "dst path is null");
                        return;
                    } else {
                        TrackRecorder.this.mMuxer = new MediaMuxer(this.e, 0);
                        return;
                    }
                }
                if (this.f10666b == null) {
                    TrackRecorder.this.mErrorManager.b("out file is null");
                    LogUtil.e(TrackRecorder.TAG, "dst file Uri is null");
                    return;
                }
                FileDescriptor fileDescriptorA = a();
                this.d = fileDescriptorA;
                if (fileDescriptorA == null) {
                    TrackRecorder.this.mErrorManager.b("out file is null");
                    LogUtil.e(TrackRecorder.TAG, "dst file descriptor is null");
                } else {
                    TrackRecorder.this.mMuxer = new MediaMuxer(this.d, 0);
                }
            } catch (IOException e) {
                LogUtil.e(TrackRecorder.TAG, "mp4 file write error", " exception = ", LogAnonymous.b(e));
                TrackRecorder.this.mErrorManager.b("mp4 file write error");
            } catch (IllegalArgumentException e2) {
                LogUtil.e(TrackRecorder.TAG, "mp4 file read error", " exception = ", LogAnonymous.b(e2));
                TrackRecorder.this.mErrorManager.b("mp4 file read error");
            }
        }

        private FileDescriptor a() {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
            if (this.f10666b == null) {
                LogUtil.j(TrackRecorder.TAG, "acquireFileDescriptor: mVideoUri is null");
                return null;
            }
            try {
                parcelFileDescriptorOpenFileDescriptor = BaseApplication.getContext().getContentResolver().openFileDescriptor(this.f10666b, "rw");
            } catch (FileNotFoundException e) {
                ReleaseLogUtil.e(TrackRecorder.TAG, "acquireFileDescriptor : Failed to open file", LogAnonymous.b(e));
                parcelFileDescriptorOpenFileDescriptor = null;
            }
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                LogUtil.j(TrackRecorder.TAG, "pdf is null");
                return null;
            }
            if (!parcelFileDescriptorOpenFileDescriptor.getFileDescriptor().valid()) {
                ReleaseLogUtil.e(TrackRecorder.TAG, "acquireFileDescriptor: fileDescriptor is invalid");
                return null;
            }
            return parcelFileDescriptorOpenFileDescriptor.getFileDescriptor();
        }
    }

    class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f10668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f10669b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ByteBuffer f10670c;
        private MediaCodec.BufferInfo d;
        private AssetFileDescriptor f;
        private int g;
        private long h;
        private boolean i;
        private MediaExtractor j;
        private long l;
        private long m;

        private b() {
            this.g = -1;
            this.j = null;
            this.d = new MediaCodec.BufferInfo();
            this.f10670c = ByteBuffer.allocate(2097152);
            this.i = false;
            this.m = -1L;
            this.l = -1L;
            this.h = -1L;
            this.f10669b = -1L;
            this.f10668a = -1L;
            this.f = null;
        }

        public void c(String str) {
            if (TextUtils.isEmpty(str)) {
                this.i = false;
                return;
            }
            this.i = true;
            try {
                MediaExtractor mediaExtractor = new MediaExtractor();
                this.j = mediaExtractor;
                mediaExtractor.setDataSource(str);
                this.j.selectTrack(0);
            } catch (IOException unused) {
                LogUtil.e(TrackRecorder.TAG, "audio file error");
                TrackRecorder.this.mErrorManager.b("audio file error");
            } finally {
                if (!TrackRecorder.this.mErrorManager.e()) {
                    this.i = false;
                }
            }
        }

        public void d(AssetFileDescriptor assetFileDescriptor) {
            this.f = assetFileDescriptor;
            if (assetFileDescriptor == null) {
                this.i = false;
                return;
            }
            this.i = true;
            try {
                MediaExtractor mediaExtractor = new MediaExtractor();
                this.j = mediaExtractor;
                mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                this.j.selectTrack(0);
            } catch (IOException unused) {
                LogUtil.e(TrackRecorder.TAG, "audio file error");
                TrackRecorder.this.mErrorManager.b("audio file error");
            } finally {
                if (!TrackRecorder.this.mErrorManager.e()) {
                    this.i = false;
                }
            }
        }

        public long a() {
            return (this.l - this.m) / 1000;
        }

        public void e() {
            if (this.i) {
                this.g = TrackRecorder.this.mMuxer.addTrack(this.j.getTrackFormat(0));
            }
        }

        private void b() {
            this.h = this.j.getSampleTime();
            this.f10669b = -1L;
            long j = 0;
            while (this.j.advance()) {
                if (this.j.getSampleTime() > this.f10669b) {
                    this.f10669b = this.j.getSampleTime();
                    j++;
                }
            }
            long j2 = this.f10669b;
            long j3 = this.h;
            this.f10668a = (j2 - j3) / (j - 1);
            this.j.seekTo(j3, 0);
        }

        public void c() {
            if (this.i && TrackRecorder.this.mErrorManager.e()) {
                b();
                long sampleTime = this.m;
                long j = 0;
                while (sampleTime <= this.l) {
                    int sampleData = this.j.readSampleData(this.f10670c, 0);
                    this.d.offset = 0;
                    this.d.size = sampleData;
                    try {
                        this.d.flags = this.j.getSampleFlags();
                        this.d.presentationTimeUs = sampleTime;
                        TrackRecorder.this.mMuxer.writeSampleData(this.g, this.f10670c, this.d);
                    } catch (IllegalArgumentException e) {
                        TrackRecorder.this.mErrorManager.b("audio stream error");
                        LogUtil.e(TrackRecorder.TAG, e.getMessage());
                    } catch (IllegalStateException e2) {
                        TrackRecorder.this.mErrorManager.b("audio stream error");
                        LogUtil.e(TrackRecorder.TAG, e2.getMessage());
                    }
                    if (!this.j.advance() || this.j.getSampleTime() < 0) {
                        this.j.seekTo(this.h, 2);
                        j += (this.f10669b - this.h) + this.f10668a;
                    }
                    sampleTime = (this.j.getSampleTime() - this.h) + j + this.m;
                }
            }
        }

        public void c(long j) {
            if (this.m == -1) {
                this.m = j;
            } else {
                this.l = j;
            }
        }

        public void d() {
            MediaExtractor mediaExtractor = this.j;
            if (mediaExtractor != null) {
                mediaExtractor.release();
                this.j = null;
            }
            AssetFileDescriptor assetFileDescriptor = this.f;
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.getParcelFileDescriptor().close();
                } catch (IOException unused) {
                    LogUtil.e(TrackRecorder.TAG, "mAudioFileDescriptor close error");
                } finally {
                    this.f = null;
                }
            }
        }
    }

    public static class e {
        private String e = "record success";

        public void b(String str) {
            this.e = str;
        }

        public boolean e() {
            return "record success".equals(this.e);
        }
    }
}
