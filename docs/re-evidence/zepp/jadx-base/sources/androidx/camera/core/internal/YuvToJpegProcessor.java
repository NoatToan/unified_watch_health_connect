package androidx.camera.core.internal;

import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CaptureProcessor;
import androidx.camera.core.impl.ImageProxyBundle;
import androidx.camera.core.impl.utils.ExifData;
import androidx.camera.core.impl.utils.ExifOutputStream;
import androidx.camera.core.internal.compat.ImageWriterCompat;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(26)
public class YuvToJpegProcessor implements CaptureProcessor {
    private static final String TAG = "YuvToJpegProcessor";
    private static final Rect UNINITIALIZED_RECT = new Rect(0, 0, 0, 0);

    @GuardedBy("mLock")
    private ImageWriter mImageWriter;
    private final int mMaxImages;

    @IntRange(from = 0, to = 100)
    private final int mQuality;
    private final Object mLock = new Object();

    @GuardedBy("mLock")
    private boolean mClosed = false;

    @GuardedBy("mLock")
    private int mProcessingImages = 0;

    @GuardedBy("mLock")
    private Rect mImageRect = UNINITIALIZED_RECT;

    public YuvToJpegProcessor(@IntRange(from = 0, to = 100) int quality, int maxImages) {
        this.mQuality = quality;
        this.mMaxImages = maxImages;
    }

    @NonNull
    private static ExifData getExifData(@NonNull ImageProxy imageProxy) {
        ExifData.Builder builderBuilderForDevice = ExifData.builderForDevice();
        imageProxy.getImageInfo().populateExifData(builderBuilderForDevice);
        return builderBuilderForDevice.setImageWidth(imageProxy.getWidth()).setImageHeight(imageProxy.getHeight()).build();
    }

    public void close() {
        synchronized (this.mLock) {
            if (!this.mClosed) {
                this.mClosed = true;
                if (this.mProcessingImages != 0 || this.mImageWriter == null) {
                    Logger.d(TAG, "close() called while processing. Will close after completion.");
                } else {
                    Logger.d(TAG, "No processing in progress. Closing immediately.");
                    this.mImageWriter.close();
                }
            }
        }
    }

    @Override // androidx.camera.core.impl.CaptureProcessor
    public void onOutputSurface(@NonNull Surface surface, int imageFormat) {
        Preconditions.checkState(imageFormat == 256, "YuvToJpegProcessor only supports JPEG output format.");
        synchronized (this.mLock) {
            if (this.mClosed) {
                Logger.w(TAG, "Cannot set output surface. Processor is closed.");
            } else {
                if (this.mImageWriter != null) {
                    throw new IllegalStateException("Output surface already set.");
                }
                this.mImageWriter = ImageWriterCompat.newInstance(surface, this.mMaxImages, imageFormat);
            }
        }
    }

    @Override // androidx.camera.core.impl.CaptureProcessor
    public void onResolutionUpdate(@NonNull Size size) {
        synchronized (this.mLock) {
            this.mImageRect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x016c A[Catch: all -> 0x0172, TryCatch #10 {all -> 0x0172, blocks: (B:99:0x0164, B:101:0x016c, B:106:0x0174), top: B:143:0x0164 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0177  */
    /* JADX WARN: Code duplicated, block: B:110:0x017c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0181  */
    /* JADX WARN: Code duplicated, block: B:118:0x0191 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x019b A[Catch: all -> 0x01a1, TryCatch #1 {all -> 0x01a1, blocks: (B:119:0x0193, B:121:0x019b, B:126:0x01a3), top: B:139:0x0193 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:139:0x0193 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x0164 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x013b A[Catch: all -> 0x015e, TRY_ENTER, TRY_LEAVE, TryCatch #18 {all -> 0x015e, blocks: (B:43:0x00e3, B:90:0x013b), top: B:151:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0162 A[DONT_INVERT] */
    @Override // androidx.camera.core.impl.CaptureProcessor
    public void process(@NonNull ImageProxyBundle bundle) throws Throwable {
        ImageWriter imageWriter;
        boolean z;
        Rect rect;
        Image imageDequeueInputImage;
        int i;
        int i2;
        Image imageDequeueInputImage2;
        List<Integer> captureIds = bundle.getCaptureIds();
        boolean z2 = false;
        Preconditions.checkArgument(captureIds.size() == 1, "Processing image bundle have single capture id, but found " + captureIds.size());
        ListenableFuture<ImageProxy> imageProxy = bundle.getImageProxy(captureIds.get(0).intValue());
        Preconditions.checkArgument(imageProxy.isDone());
        synchronized (this.mLock) {
            imageWriter = this.mImageWriter;
            z = !this.mClosed;
            rect = this.mImageRect;
            if (z) {
                this.mProcessingImages++;
            }
        }
        ImageProxy imageProxy2 = null;
        try {
            try {
                ImageProxy imageProxy3 = imageProxy.get();
                try {
                    if (!z) {
                        Logger.w(TAG, "Image enqueued for processing on closed processor.");
                        imageProxy3.close();
                        synchronized (this.mLock) {
                            if (z) {
                                try {
                                    int i3 = this.mProcessingImages;
                                    this.mProcessingImages = i3 - 1;
                                    if (i3 == 0 && this.mClosed) {
                                        z2 = true;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        if (z2) {
                            imageWriter.close();
                            Logger.d(TAG, "Closed after completion of last image processed.");
                            return;
                        }
                        return;
                    }
                    imageDequeueInputImage = imageWriter.dequeueInputImage();
                    try {
                        ImageProxy imageProxy4 = imageProxy.get();
                        try {
                            Preconditions.checkState(imageProxy4.getFormat() == 35, "Input image is not expected YUV_420_888 image format");
                            YuvImage yuvImage = new YuvImage(ImageUtil.yuv_420_888toNv21(imageProxy4), 17, imageProxy4.getWidth(), imageProxy4.getHeight(), null);
                            ByteBuffer buffer = imageDequeueInputImage.getPlanes()[0].getBuffer();
                            int iPosition = buffer.position();
                            yuvImage.compressToJpeg(rect, this.mQuality, new ExifOutputStream(new ByteBufferOutputStream(buffer), getExifData(imageProxy4)));
                            imageProxy4.close();
                            try {
                                buffer.limit(buffer.position());
                                buffer.position(iPosition);
                                imageWriter.queueInputImage(imageDequeueInputImage);
                                synchronized (this.mLock) {
                                    if (z) {
                                        try {
                                            int i4 = this.mProcessingImages;
                                            this.mProcessingImages = i4 - 1;
                                            if (i4 == 0 && this.mClosed) {
                                                z2 = true;
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                }
                                if (!z2) {
                                    return;
                                }
                            } catch (InterruptedException e) {
                                e = e;
                                if (z) {
                                    Logger.e(TAG, "Failed to process YUV -> JPEG", e);
                                    imageDequeueInputImage2 = imageWriter.dequeueInputImage();
                                    try {
                                        ByteBuffer buffer2 = imageDequeueInputImage2.getPlanes()[0].getBuffer();
                                        buffer2.rewind();
                                        buffer2.limit(0);
                                        imageWriter.queueInputImage(imageDequeueInputImage2);
                                        imageDequeueInputImage = imageDequeueInputImage2;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        imageDequeueInputImage = imageDequeueInputImage2;
                                        synchronized (this.mLock) {
                                            if (z) {
                                                try {
                                                    i = this.mProcessingImages;
                                                    this.mProcessingImages = i - 1;
                                                    if (i == 0 && this.mClosed) {
                                                        z2 = true;
                                                    }
                                                } catch (Throwable th4) {
                                                    throw th4;
                                                }
                                            }
                                        }
                                        if (imageDequeueInputImage != null) {
                                            imageDequeueInputImage.close();
                                        }
                                        if (imageProxy2 != null) {
                                            imageProxy2.close();
                                        }
                                        if (z2) {
                                            imageWriter.close();
                                            Logger.d(TAG, "Closed after completion of last image processed.");
                                        }
                                        throw th;
                                    }
                                }
                                synchronized (this.mLock) {
                                    if (z) {
                                        try {
                                            i2 = this.mProcessingImages;
                                            this.mProcessingImages = i2 - 1;
                                            if (i2 == 0) {
                                                z2 = true;
                                            }
                                        } catch (Throwable th5) {
                                            throw th5;
                                        }
                                    }
                                    if (imageDequeueInputImage != null) {
                                        imageDequeueInputImage.close();
                                    }
                                    if (imageProxy2 != null) {
                                        imageProxy2.close();
                                    }
                                    if (!z2) {
                                        return;
                                    }
                                }
                            } catch (ExecutionException e2) {
                                e = e2;
                                if (z) {
                                    Logger.e(TAG, "Failed to process YUV -> JPEG", e);
                                    imageDequeueInputImage2 = imageWriter.dequeueInputImage();
                                    ByteBuffer buffer3 = imageDequeueInputImage2.getPlanes()[0].getBuffer();
                                    buffer3.rewind();
                                    buffer3.limit(0);
                                    imageWriter.queueInputImage(imageDequeueInputImage2);
                                    imageDequeueInputImage = imageDequeueInputImage2;
                                }
                                synchronized (this.mLock) {
                                    if (z) {
                                        i2 = this.mProcessingImages;
                                        this.mProcessingImages = i2 - 1;
                                        if (i2 == 0) {
                                            z2 = true;
                                        }
                                    }
                                    if (imageDequeueInputImage != null) {
                                        imageDequeueInputImage.close();
                                    }
                                    if (imageProxy2 != null) {
                                        imageProxy2.close();
                                    }
                                    if (!z2) {
                                        return;
                                    }
                                }
                            }
                        } catch (InterruptedException e3) {
                            e = e3;
                            imageProxy2 = imageProxy4;
                            if (z) {
                                Logger.e(TAG, "Failed to process YUV -> JPEG", e);
                                imageDequeueInputImage2 = imageWriter.dequeueInputImage();
                                ByteBuffer buffer4 = imageDequeueInputImage2.getPlanes()[0].getBuffer();
                                buffer4.rewind();
                                buffer4.limit(0);
                                imageWriter.queueInputImage(imageDequeueInputImage2);
                                imageDequeueInputImage = imageDequeueInputImage2;
                            }
                            synchronized (this.mLock) {
                                if (z) {
                                    i2 = this.mProcessingImages;
                                    this.mProcessingImages = i2 - 1;
                                    if (i2 == 0) {
                                        z2 = true;
                                    }
                                }
                                if (imageDequeueInputImage != null) {
                                    imageDequeueInputImage.close();
                                }
                                if (imageProxy2 != null) {
                                    imageProxy2.close();
                                }
                                if (!z2) {
                                    return;
                                }
                                imageWriter.close();
                                Logger.d(TAG, "Closed after completion of last image processed.");
                            }
                        } catch (ExecutionException e4) {
                            e = e4;
                            imageProxy2 = imageProxy4;
                            if (z) {
                                Logger.e(TAG, "Failed to process YUV -> JPEG", e);
                                imageDequeueInputImage2 = imageWriter.dequeueInputImage();
                                ByteBuffer buffer5 = imageDequeueInputImage2.getPlanes()[0].getBuffer();
                                buffer5.rewind();
                                buffer5.limit(0);
                                imageWriter.queueInputImage(imageDequeueInputImage2);
                                imageDequeueInputImage = imageDequeueInputImage2;
                            }
                            synchronized (this.mLock) {
                                if (z) {
                                    i2 = this.mProcessingImages;
                                    this.mProcessingImages = i2 - 1;
                                    if (i2 == 0) {
                                        z2 = true;
                                    }
                                }
                                if (imageDequeueInputImage != null) {
                                    imageDequeueInputImage.close();
                                }
                                if (imageProxy2 != null) {
                                    imageProxy2.close();
                                }
                                if (!z2) {
                                    return;
                                }
                                imageWriter.close();
                                Logger.d(TAG, "Closed after completion of last image processed.");
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            imageProxy2 = imageProxy4;
                            synchronized (this.mLock) {
                                if (z) {
                                    i = this.mProcessingImages;
                                    this.mProcessingImages = i - 1;
                                    if (i == 0) {
                                        z2 = true;
                                    }
                                }
                                if (imageDequeueInputImage != null) {
                                    imageDequeueInputImage.close();
                                }
                                if (imageProxy2 != null) {
                                    imageProxy2.close();
                                }
                                if (z2) {
                                    imageWriter.close();
                                    Logger.d(TAG, "Closed after completion of last image processed.");
                                }
                                throw th;
                            }
                        }
                    } catch (InterruptedException e5) {
                        e = e5;
                        imageProxy2 = imageProxy3;
                        if (z) {
                            Logger.e(TAG, "Failed to process YUV -> JPEG", e);
                            imageDequeueInputImage2 = imageWriter.dequeueInputImage();
                            ByteBuffer buffer6 = imageDequeueInputImage2.getPlanes()[0].getBuffer();
                            buffer6.rewind();
                            buffer6.limit(0);
                            imageWriter.queueInputImage(imageDequeueInputImage2);
                            imageDequeueInputImage = imageDequeueInputImage2;
                        }
                        synchronized (this.mLock) {
                            if (z) {
                                i2 = this.mProcessingImages;
                                this.mProcessingImages = i2 - 1;
                                if (i2 == 0 && this.mClosed) {
                                    z2 = true;
                                }
                            }
                        }
                        if (imageDequeueInputImage != null) {
                            imageDequeueInputImage.close();
                        }
                        if (imageProxy2 != null) {
                            imageProxy2.close();
                        }
                        if (!z2) {
                            return;
                        }
                        imageWriter.close();
                        Logger.d(TAG, "Closed after completion of last image processed.");
                    } catch (ExecutionException e6) {
                        e = e6;
                        imageProxy2 = imageProxy3;
                        if (z) {
                            Logger.e(TAG, "Failed to process YUV -> JPEG", e);
                            imageDequeueInputImage2 = imageWriter.dequeueInputImage();
                            ByteBuffer buffer7 = imageDequeueInputImage2.getPlanes()[0].getBuffer();
                            buffer7.rewind();
                            buffer7.limit(0);
                            imageWriter.queueInputImage(imageDequeueInputImage2);
                            imageDequeueInputImage = imageDequeueInputImage2;
                        }
                        synchronized (this.mLock) {
                            if (z) {
                                i2 = this.mProcessingImages;
                                this.mProcessingImages = i2 - 1;
                                if (i2 == 0) {
                                    z2 = true;
                                }
                            }
                            if (imageDequeueInputImage != null) {
                                imageDequeueInputImage.close();
                            }
                            if (imageProxy2 != null) {
                                imageProxy2.close();
                            }
                            if (!z2) {
                                return;
                            }
                            imageWriter.close();
                            Logger.d(TAG, "Closed after completion of last image processed.");
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        imageProxy2 = imageProxy3;
                        synchronized (this.mLock) {
                            if (z) {
                                i = this.mProcessingImages;
                                this.mProcessingImages = i - 1;
                                if (i == 0) {
                                    z2 = true;
                                }
                            }
                            if (imageDequeueInputImage != null) {
                                imageDequeueInputImage.close();
                            }
                            if (imageProxy2 != null) {
                                imageProxy2.close();
                            }
                            if (z2) {
                                imageWriter.close();
                                Logger.d(TAG, "Closed after completion of last image processed.");
                            }
                            throw th;
                        }
                    }
                    imageWriter.close();
                    Logger.d(TAG, "Closed after completion of last image processed.");
                } catch (InterruptedException e7) {
                    e = e7;
                    imageDequeueInputImage = null;
                    imageProxy2 = imageProxy3;
                    if (z) {
                        Logger.e(TAG, "Failed to process YUV -> JPEG", e);
                        imageDequeueInputImage2 = imageWriter.dequeueInputImage();
                        ByteBuffer buffer8 = imageDequeueInputImage2.getPlanes()[0].getBuffer();
                        buffer8.rewind();
                        buffer8.limit(0);
                        imageWriter.queueInputImage(imageDequeueInputImage2);
                        imageDequeueInputImage = imageDequeueInputImage2;
                    }
                    synchronized (this.mLock) {
                        if (z) {
                            i2 = this.mProcessingImages;
                            this.mProcessingImages = i2 - 1;
                            if (i2 == 0) {
                                z2 = true;
                            }
                        }
                        if (imageDequeueInputImage != null) {
                            imageDequeueInputImage.close();
                        }
                        if (imageProxy2 != null) {
                            imageProxy2.close();
                        }
                        if (!z2) {
                            return;
                        }
                        imageWriter.close();
                        Logger.d(TAG, "Closed after completion of last image processed.");
                    }
                } catch (ExecutionException e8) {
                    e = e8;
                    imageDequeueInputImage = null;
                    imageProxy2 = imageProxy3;
                    if (z) {
                        Logger.e(TAG, "Failed to process YUV -> JPEG", e);
                        imageDequeueInputImage2 = imageWriter.dequeueInputImage();
                        ByteBuffer buffer9 = imageDequeueInputImage2.getPlanes()[0].getBuffer();
                        buffer9.rewind();
                        buffer9.limit(0);
                        imageWriter.queueInputImage(imageDequeueInputImage2);
                        imageDequeueInputImage = imageDequeueInputImage2;
                    }
                    synchronized (this.mLock) {
                        if (z) {
                            i2 = this.mProcessingImages;
                            this.mProcessingImages = i2 - 1;
                            if (i2 == 0) {
                                z2 = true;
                            }
                        }
                        if (imageDequeueInputImage != null) {
                            imageDequeueInputImage.close();
                        }
                        if (imageProxy2 != null) {
                            imageProxy2.close();
                        }
                        if (!z2) {
                            return;
                        }
                        imageWriter.close();
                        Logger.d(TAG, "Closed after completion of last image processed.");
                    }
                } catch (Throwable th8) {
                    th = th8;
                    imageDequeueInputImage = null;
                }
            } catch (Throwable th9) {
                th = th9;
            }
        } catch (InterruptedException e9) {
            e = e9;
            imageDequeueInputImage = null;
            if (z) {
                Logger.e(TAG, "Failed to process YUV -> JPEG", e);
                imageDequeueInputImage2 = imageWriter.dequeueInputImage();
                ByteBuffer buffer10 = imageDequeueInputImage2.getPlanes()[0].getBuffer();
                buffer10.rewind();
                buffer10.limit(0);
                imageWriter.queueInputImage(imageDequeueInputImage2);
                imageDequeueInputImage = imageDequeueInputImage2;
            }
            synchronized (this.mLock) {
                if (z) {
                    i2 = this.mProcessingImages;
                    this.mProcessingImages = i2 - 1;
                    if (i2 == 0) {
                        z2 = true;
                    }
                }
                if (imageDequeueInputImage != null) {
                    imageDequeueInputImage.close();
                }
                if (imageProxy2 != null) {
                    imageProxy2.close();
                }
                if (!z2) {
                    return;
                }
                imageWriter.close();
                Logger.d(TAG, "Closed after completion of last image processed.");
            }
        } catch (ExecutionException e10) {
            e = e10;
            imageDequeueInputImage = null;
            if (z) {
                Logger.e(TAG, "Failed to process YUV -> JPEG", e);
                imageDequeueInputImage2 = imageWriter.dequeueInputImage();
                ByteBuffer buffer11 = imageDequeueInputImage2.getPlanes()[0].getBuffer();
                buffer11.rewind();
                buffer11.limit(0);
                imageWriter.queueInputImage(imageDequeueInputImage2);
                imageDequeueInputImage = imageDequeueInputImage2;
            }
            synchronized (this.mLock) {
                if (z) {
                    i2 = this.mProcessingImages;
                    this.mProcessingImages = i2 - 1;
                    if (i2 == 0) {
                        z2 = true;
                    }
                }
                if (imageDequeueInputImage != null) {
                    imageDequeueInputImage.close();
                }
                if (imageProxy2 != null) {
                    imageProxy2.close();
                }
                if (!z2) {
                    return;
                }
                imageWriter.close();
                Logger.d(TAG, "Closed after completion of last image processed.");
            }
        } catch (Throwable th10) {
            th = th10;
            imageDequeueInputImage = null;
        }
    }

    public static final class ByteBufferOutputStream extends OutputStream {
        private final ByteBuffer mByteBuffer;

        public ByteBufferOutputStream(@NonNull ByteBuffer buf) {
            this.mByteBuffer = buf;
        }

        @Override // java.io.OutputStream
        public void write(int b) throws IOException {
            if (!this.mByteBuffer.hasRemaining()) {
                throw new EOFException("Output ByteBuffer has no bytes remaining.");
            }
            this.mByteBuffer.put((byte) b);
        }

        @Override // java.io.OutputStream
        public void write(byte[] b, int off, int len) throws IOException {
            int i;
            Objects.requireNonNull(b);
            if (off < 0 || off > b.length || len < 0 || (i = off + len) > b.length || i < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (len == 0) {
                return;
            }
            if (this.mByteBuffer.remaining() >= len) {
                this.mByteBuffer.put(b, off, len);
                return;
            }
            throw new EOFException("Output ByteBuffer has insufficient bytes remaining.");
        }
    }
}
