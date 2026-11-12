package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.mmedit;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.mmedit.media.MediaDataReceiver;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.mmedit.media.MediaDataSender;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes10.dex */
public class ThumbnailDecoder extends MediaDataSender implements MediaDataReceiver, Runnable {
    private static final String TAG = "ThumbnailDecoder";
    private int[] mTimeArray;
    private BlockingQueue<ThumbnailInfo> thumbnailQueue;
    private MediaCodec mDecoder = null;
    private Thread mThread = null;
    private boolean mIsInterrupted = true;
    private boolean mIsInitialized = false;
    private int mDegree = 0;
    private int mThumbnailWidth = 0;
    private int mThumbnailHeight = 0;
    private MediaFormat mFormat = null;
    private ExecutorService exec = null;
    private final Object mLock = new Object();

    protected ThumbnailDecoder() {
    }

    protected int init(MediaFormat mediaFormat, int i, int i2) {
        if (this.mIsInitialized) {
            return 0;
        }
        this.mFormat = mediaFormat;
        this.mThumbnailWidth = i;
        this.mThumbnailHeight = i2;
        if (mediaFormat != null && mediaFormat.containsKey("rotation-degrees")) {
            this.mDegree = this.mFormat.getInteger("rotation-degrees");
        }
        this.thumbnailQueue = new LinkedBlockingQueue(12);
        this.mIsInterrupted = true;
        this.mIsInitialized = true;
        return 0;
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
        String string = this.mFormat.getString("mime");
        LogUtil.a(TAG, "Thread Start!" + string);
        try {
            this.mDecoder = MediaCodec.createDecoderByType(string);
            try {
                this.exec = Executors.newFixedThreadPool(12);
                this.mDecoder.configure(this.mFormat, (Surface) null, (MediaCrypto) null, 0);
                this.mDecoder.start();
                this.mIsInterrupted = false;
                synchronized (this.mLock) {
                    Thread thread = new Thread(this, TAG);
                    this.mThread = thread;
                    thread.start();
                    LogUtil.a(TAG, "Thread Start!");
                }
                return 0;
            } catch (IllegalArgumentException e) {
                e = e;
                LogUtil.e(TAG, "start decoder failed!", ExceptionUtils.c(e));
                return -1000000;
            } catch (IllegalStateException e2) {
                e = e2;
                LogUtil.e(TAG, "start decoder failed!", ExceptionUtils.c(e));
                return -1000000;
            } catch (Exception e3) {
                LogUtil.e(TAG, "unknown exception, maybe configure -12, qcom hardware overload", ExceptionUtils.c(e3));
                return -1000000;
            }
        } catch (IOException unused) {
            LogUtil.e(TAG, "create decoder failed!");
            return -1000000;
        } catch (IllegalArgumentException e4) {
            LogUtil.e(TAG, "create decoder failed: ", e4.getMessage());
            return -1000000;
        }
    }

    protected int stop() {
        LogUtil.a(TAG, "Enter Stop");
        if (!this.mIsInitialized) {
            return 0;
        }
        synchronized (this.mLock) {
            this.mIsInterrupted = true;
            LogUtil.a(TAG, "break the while loop!");
        }
        Thread thread = this.mThread;
        if (thread != null) {
            try {
                thread.join();
            } catch (InterruptedException unused) {
                LogUtil.a(TAG, "stop thread failed!");
                return -1000000;
            }
        }
        MediaCodec mediaCodec = this.mDecoder;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
                this.mDecoder.release();
            } catch (IllegalStateException unused2) {
                LogUtil.a(TAG, "stop thread failed! illegal state");
            }
            this.mDecoder = null;
        }
        BlockingQueue<ThumbnailInfo> blockingQueue = this.thumbnailQueue;
        if (blockingQueue != null) {
            blockingQueue.clear();
        }
        ExecutorService executorService = this.exec;
        if (executorService != null) {
            executorService.shutdown();
            this.exec = null;
        }
        LogUtil.a(TAG, "Leave Stop");
        return 0;
    }

    public void release() {
        stop();
        this.mIsInitialized = false;
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.mmedit.media.MediaDataReceiver
    public int onDataReceive(MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer, MediaDataReceiver.StreamType streamType) {
        if (!this.mIsInitialized) {
            LogUtil.j(TAG, "Decoder not initialized!");
            return -1;
        }
        try {
            int iDequeueInputBuffer = this.mDecoder.dequeueInputBuffer(1000000L);
            if (iDequeueInputBuffer > 0) {
                ByteBuffer inputBuffer = this.mDecoder.getInputBuffer(iDequeueInputBuffer);
                if (bufferInfo.flags == 4) {
                    bufferInfo.size = 0;
                    LogUtil.a(TAG, "DecIn, End Of Stream");
                } else if (inputBuffer != null && byteBuffer != null) {
                    inputBuffer.clear();
                    inputBuffer.put(byteBuffer);
                }
                LogUtil.a(TAG, "queueInputBuffer timeUs = ", Long.valueOf(bufferInfo.presentationTimeUs));
                LogUtil.a(TAG, "index = ", Integer.valueOf(iDequeueInputBuffer), "info.flags = ", Integer.valueOf(bufferInfo.flags));
                this.mDecoder.queueInputBuffer(iDequeueInputBuffer, 0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
                return 0;
            }
            LogUtil.j(TAG, "DequeueInputBuffer Time Out!");
            return -9;
        } catch (IllegalStateException unused) {
            return -1000000;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        char c2;
        int i;
        int i2;
        char c3 = 0;
        int i3 = 0;
        int i4 = 0;
        while (!this.mIsInterrupted) {
            try {
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                int iDequeueOutputBuffer = this.mDecoder.dequeueOutputBuffer(bufferInfo, SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US);
                long j = bufferInfo.presentationTimeUs;
                int i5 = bufferInfo.flags;
                Object[] objArr = new Object[6];
                objArr[c3] = "dequeueOutputBuffer timeUs = ";
                objArr[1] = Long.valueOf(j);
                objArr[2] = "info.flags = ";
                objArr[3] = Integer.valueOf(i5);
                objArr[4] = ", status = ";
                objArr[5] = Integer.valueOf(iDequeueOutputBuffer);
                LogUtil.a(TAG, objArr);
                if (iDequeueOutputBuffer >= 0) {
                    try {
                        if (bufferInfo.flags == 4 || i3 >= this.mTimeArray.length) {
                            i = 4;
                        } else {
                            int i6 = i3 + 1;
                            try {
                                ByteBuffer outputBuffer = this.mDecoder.getOutputBuffer(iDequeueOutputBuffer);
                                byte[] bArr = new byte[outputBuffer.remaining()];
                                outputBuffer.get(bArr);
                                this.exec.execute(new FormatConverter(bArr, this.mTimeArray[i3], this.mDecoder.getOutputFormat()));
                                i = 4;
                                LogUtil.a(TAG, Integer.valueOf(bufferInfo.flags), "count = ", Integer.valueOf(i6), "timeStamp:", Integer.valueOf(this.mTimeArray[i3]));
                                i3 = i6;
                            } catch (IllegalStateException e) {
                                e = e;
                                i3 = i6;
                                c2 = 0;
                                LogUtil.a(TAG, "Unexpected Codec Status ", e.getMessage());
                                c3 = c2;
                            }
                        }
                        long j2 = bufferInfo.presentationTimeUs;
                        Object[] objArr2 = new Object[i];
                        objArr2[0] = "releaseOutputBuffer = ";
                        objArr2[1] = Long.valueOf(j2);
                        objArr2[2] = ", status = ";
                        objArr2[3] = Integer.valueOf(iDequeueOutputBuffer);
                        LogUtil.a(TAG, objArr2);
                        this.mDecoder.releaseOutputBuffer(iDequeueOutputBuffer, false);
                        c3 = 0;
                    } catch (IllegalStateException e2) {
                        e = e2;
                    }
                } else {
                    if (iDequeueOutputBuffer == -1) {
                        LogUtil.a(TAG, "No output right now, try again later");
                        i4++;
                        if (i4 > 5) {
                            try {
                                try {
                                    this.thumbnailQueue.put(new ThumbnailInfo(null, this.mTimeArray[0]));
                                    i2 = 1;
                                    try {
                                        Object[] objArr3 = new Object[1];
                                        objArr3[0] = "put null thumbnail";
                                        LogUtil.j(TAG, objArr3);
                                    } catch (InterruptedException unused) {
                                        Object[] objArr4 = new Object[i2];
                                        objArr4[0] = "thumbnailQueue put error";
                                        LogUtil.j(TAG, objArr4);
                                    }
                                } catch (InterruptedException unused2) {
                                    i2 = 1;
                                }
                                c3 = 0;
                                i4 = 0;
                            } catch (IllegalStateException e3) {
                                e = e3;
                                c2 = 0;
                                i4 = 0;
                                LogUtil.a(TAG, "Unexpected Codec Status ", e.getMessage());
                                c3 = c2;
                            }
                        } else {
                            c3 = 0;
                        }
                    } else {
                        Object[] objArr5 = new Object[2];
                        c2 = 0;
                        try {
                            objArr5[0] = "Unexpected status ";
                            objArr5[1] = Integer.valueOf(iDequeueOutputBuffer);
                            LogUtil.a(TAG, objArr5);
                        } catch (IllegalStateException e4) {
                            e = e4;
                            LogUtil.a(TAG, "Unexpected Codec Status ", e.getMessage());
                        }
                        c3 = c2;
                    }
                    LogUtil.a(TAG, "Unexpected Codec Status ", e.getMessage());
                    c3 = c2;
                }
            } catch (IllegalStateException e5) {
                e = e5;
                c2 = c3;
            }
        }
    }

    protected ThumbnailInfo getThumbnailInfo() {
        return this.thumbnailQueue.poll();
    }

    class FormatConverter implements Runnable {
        protected byte[] bufArray;
        protected MediaFormat outFormat;
        protected long timestamp;

        FormatConverter(byte[] bArr, long j, MediaFormat mediaFormat) {
            this.bufArray = bArr;
            this.timestamp = j;
            this.outFormat = mediaFormat;
        }

        private Bitmap convertToBitmap(byte[] bArr, int i, int i2) {
            YuvImage yuvImage = new YuvImage(bArr, 17, i, i2, null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            yuvImage.compressToJpeg(new Rect(0, 0, i, i2), 100, byteArrayOutputStream);
            return BitmapFactory.decodeByteArray(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
        }

        private void convertNv12ToNv21(byte[] bArr, int i, int i2) {
            if (bArr == null) {
                LogUtil.a(ThumbnailDecoder.TAG, "convertNv12ToNv21 NV21 to NV12: param is null.");
                return;
            }
            for (int i3 = i * i2; i3 < bArr.length; i3 += 2) {
                byte b2 = bArr[i3];
                int i4 = i3 + 1;
                bArr[i3] = bArr[i4];
                bArr[i4] = b2;
            }
        }

        private void convertYuv420pToNv21(byte[] bArr, int i, int i2) {
            if (bArr == null) {
                LogUtil.a(ThumbnailDecoder.TAG, "convertYuv420pToNv21 to NV12: param is null.");
                return;
            }
            int i3 = i * i2;
            int i4 = i3 / 4;
            int i5 = i3 / 2;
            byte[] bArr2 = new byte[i5];
            int i6 = 0;
            int i7 = 0;
            while (i6 < i5) {
                bArr2[i6] = bArr[i4 + i3 + i7];
                bArr2[i6 + 1] = bArr[i3 + i7];
                i6 += 2;
                i7++;
            }
            System.arraycopy(bArr2, 0, bArr, i3, i5);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x008f  */
        private Bitmap cropAndScale(Bitmap bitmap, int i, int i2, int i3) {
            int i4;
            int i5;
            int i6;
            int i7 = i2;
            int i8 = i3;
            if (bitmap == null || bitmap.isRecycled()) {
                return null;
            }
            LogUtil.a(ThumbnailDecoder.TAG, "degree = ", i + " bitmap.getWidth() = ", Integer.valueOf(bitmap.getWidth()), " bitmap.getHeight()", Integer.valueOf(bitmap.getHeight()));
            Matrix matrix = new Matrix();
            matrix.postRotate((float) i);
            if (i == 90 || i == 270) {
                i4 = ThumbnailDecoder.this.mThumbnailWidth;
                i5 = ThumbnailDecoder.this.mThumbnailHeight;
            } else {
                i4 = ThumbnailDecoder.this.mThumbnailHeight;
                i5 = ThumbnailDecoder.this.mThumbnailWidth;
            }
            float f = i5;
            float f2 = f / i7;
            float f3 = i4;
            float f4 = f3 / i8;
            boolean z = true;
            if (f2 >= 1.0f || f4 >= 1.0f) {
                i6 = 0;
            } else if (f2 < f4) {
                i6 = i7 - ((int) (f / f4));
                z = false;
            } else if (f2 > f4) {
                i6 = i8 - ((int) (f3 / f2));
            } else {
                i6 = 0;
            }
            if (z) {
                i8 -= i6;
            }
            int i9 = i8;
            if (!z) {
                i7 -= i6;
            }
            int i10 = i7;
            if (i != 90 && i != 270) {
                matrix.postScale(ThumbnailDecoder.this.mThumbnailWidth / i10, ThumbnailDecoder.this.mThumbnailHeight / i9);
            } else {
                matrix.postScale(ThumbnailDecoder.this.mThumbnailWidth / i9, ThumbnailDecoder.this.mThumbnailHeight / i10);
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, z ? 0 : i6 / 2, z ? i6 / 2 : 0, i10, i9, matrix, false);
            LogUtil.a(ThumbnailDecoder.TAG, "cropBmp.getHeight() = ", bitmapCreateBitmap.getHeight() + "cropBmp.getWidth() = ", Integer.valueOf(bitmapCreateBitmap.getWidth()));
            return bitmapCreateBitmap;
        }

        private byte[] videoCrop(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6) {
            int i7 = (i - i3) - i4;
            byte[] bArr2 = new byte[((((i2 - i6) - i5) * i7) * 3) / 2];
            int i8 = 0;
            while (true) {
                int i9 = (i2 - i5) - i6;
                if (i8 >= i9) {
                    return bArr2;
                }
                int i10 = (i5 + i8) * i;
                int i11 = i8 * i7;
                System.arraycopy(bArr, i10 + i3, bArr2, i11, i7);
                if (i8 % 2 == 0) {
                    System.arraycopy(bArr, (i * i2) + (i10 / 2) + i3, bArr2, (i9 * i7) + (i11 / 2), i7);
                }
                i8++;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            int integer;
            int integer2;
            MediaFormat mediaFormat = this.outFormat;
            int integer3 = (mediaFormat == null || !mediaFormat.containsKey("color-format")) ? 21 : this.outFormat.getInteger("color-format");
            MediaFormat mediaFormat2 = this.outFormat;
            if (mediaFormat2 != null && mediaFormat2.containsKey("width") && this.outFormat.containsKey("height")) {
                integer = this.outFormat.getInteger("width");
                integer2 = this.outFormat.getInteger("height");
            } else {
                integer = 0;
                integer2 = 0;
            }
            if (integer3 == 19) {
                convertYuv420pToNv21(this.bufArray, integer, integer2);
            } else {
                convertNv12ToNv21(this.bufArray, integer, integer2);
            }
            MediaFormat mediaFormat3 = this.outFormat;
            if (mediaFormat3 != null && mediaFormat3.containsKey("crop-bottom") && this.outFormat.containsKey("crop-top") && this.outFormat.containsKey("crop-right") && this.outFormat.containsKey("crop-left")) {
                int integer4 = this.outFormat.getInteger("crop-left");
                int integer5 = this.outFormat.getInteger("crop-right");
                int integer6 = this.outFormat.getInteger("crop-top");
                int integer7 = this.outFormat.getInteger("crop-bottom");
                int i = (integer7 - integer6) + 1;
                int i2 = (integer5 - integer4) + 1;
                if (i != integer2 || i2 != integer) {
                    this.bufArray = videoCrop(this.bufArray, integer, integer2, integer4, (integer - integer5) - 1, integer6, (integer2 - integer7) - 1);
                    integer2 = i;
                    integer = i2;
                }
            }
            try {
                ThumbnailDecoder.this.thumbnailQueue.put(new ThumbnailInfo(cropAndScale(convertToBitmap(this.bufArray, integer, integer2), ThumbnailDecoder.this.mDegree, integer, integer2), this.timestamp));
            } catch (InterruptedException unused) {
                LogUtil.a(ThumbnailDecoder.TAG, "put queue failed!");
            } catch (Exception unused2) {
                LogUtil.a(ThumbnailDecoder.TAG, "Exception put queue failed!");
            } catch (OutOfMemoryError e) {
                LogUtil.a(ThumbnailDecoder.TAG, " OutOfMemoryError ", ExceptionUtils.c(e));
            }
        }
    }
}
