package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class StandardGifDecoder implements GifDecoder {
    private static final int BYTES_PER_INTEGER = 4;
    private static final int COLOR_TRANSPARENT_BLACK = 0;
    private static final int INITIAL_FRAME_POINTER = -1;
    private static final int MASK_INT_LOWEST_BYTE = 255;
    private static final int MAX_STACK_SIZE = 4096;
    private static final int NULL_CODE = -1;
    private static final String TAG = "StandardGifDecoder";
    private int[] act;
    private Bitmap.Config bitmapConfig;
    private final GifDecoder.BitmapProvider bitmapProvider;
    private byte[] block;
    private int downsampledHeight;
    private int downsampledWidth;
    private int framePointer;
    private GifHeader header;
    private Boolean isFirstFrameTransparent;
    private byte[] mainPixels;
    private int[] mainScratch;
    private GifHeaderParser parser;
    private final int[] pct;
    private byte[] pixelStack;
    private short[] prefix;
    private Bitmap previousImage;
    private ByteBuffer rawData;
    private int sampleSize;
    private boolean savePrevious;
    private int status;
    private byte[] suffix;

    public StandardGifDecoder(GifDecoder.BitmapProvider bitmapProvider, GifHeader gifHeader, ByteBuffer byteBuffer) {
        this(bitmapProvider, gifHeader, byteBuffer, 1);
    }

    public StandardGifDecoder(GifDecoder.BitmapProvider bitmapProvider, GifHeader gifHeader, ByteBuffer byteBuffer, int i) {
        this(bitmapProvider);
        setData(gifHeader, byteBuffer, i);
    }

    public StandardGifDecoder(GifDecoder.BitmapProvider bitmapProvider) {
        this.pct = new int[256];
        this.bitmapConfig = Bitmap.Config.ARGB_8888;
        this.bitmapProvider = bitmapProvider;
        this.header = new GifHeader();
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getWidth() {
        return this.header.width;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getHeight() {
        return this.header.height;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public ByteBuffer getData() {
        return this.rawData;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getStatus() {
        return this.status;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void advance() {
        this.framePointer = (this.framePointer + 1) % this.header.frameCount;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getDelay(int i) {
        if (i < 0 || i >= this.header.frameCount) {
            return -1;
        }
        return this.header.frames.get(i).delay;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getNextDelay() {
        int i;
        if (this.header.frameCount <= 0 || (i = this.framePointer) < 0) {
            return 0;
        }
        return getDelay(i);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getFrameCount() {
        return this.header.frameCount;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getCurrentFrameIndex() {
        return this.framePointer;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void resetFrameIndex() {
        this.framePointer = -1;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    @Deprecated
    public int getLoopCount() {
        if (this.header.loopCount == -1) {
            return 1;
        }
        return this.header.loopCount;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getNetscapeLoopCount() {
        return this.header.loopCount;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getTotalIterationCount() {
        if (this.header.loopCount == -1) {
            return 1;
        }
        if (this.header.loopCount == 0) {
            return 0;
        }
        return this.header.loopCount + 1;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getByteSize() {
        return this.rawData.limit() + this.mainPixels.length + (this.mainScratch.length * 4);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public Bitmap getNextFrame() {
        synchronized (this) {
            if (this.header.frameCount <= 0 || this.framePointer < 0) {
                String str = TAG;
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Unable to decode frame, frameCount=" + this.header.frameCount + ", framePointer=" + this.framePointer);
                }
                this.status = 1;
            }
            int i = this.status;
            if (i != 1 && i != 2) {
                this.status = 0;
                if (this.block == null) {
                    this.block = this.bitmapProvider.obtainByteArray(255);
                }
                GifFrame gifFrame = this.header.frames.get(this.framePointer);
                int i2 = this.framePointer - 1;
                GifFrame gifFrame2 = i2 >= 0 ? this.header.frames.get(i2) : null;
                int[] iArr = gifFrame.lct != null ? gifFrame.lct : this.header.gct;
                this.act = iArr;
                if (iArr == null) {
                    String str2 = TAG;
                    if (Log.isLoggable(str2, 3)) {
                        Log.d(str2, "No valid color table found for frame #" + this.framePointer);
                    }
                    this.status = 1;
                    return null;
                }
                if (gifFrame.transparency) {
                    int[] iArr2 = this.act;
                    System.arraycopy(iArr2, 0, this.pct, 0, iArr2.length);
                    int[] iArr3 = this.pct;
                    this.act = iArr3;
                    iArr3[gifFrame.transIndex] = 0;
                    if (gifFrame.dispose == 2 && this.framePointer == 0) {
                        this.isFirstFrameTransparent = true;
                    }
                }
                return setPixels(gifFrame, gifFrame2);
            }
            String str3 = TAG;
            if (Log.isLoggable(str3, 3)) {
                Log.d(str3, "Unable to decode frame, status=" + this.status);
            }
            return null;
        }
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int read(InputStream inputStream, int i) {
        if (inputStream != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i > 0 ? i + 4096 : 16384);
                byte[] bArr = new byte[16384];
                while (true) {
                    int i2 = inputStream.read(bArr, 0, 16384);
                    if (i2 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i2);
                }
                byteArrayOutputStream.flush();
                read(byteArrayOutputStream.toByteArray());
            } catch (IOException e) {
                Log.w(TAG, "Error reading data from stream", e);
            }
        } else {
            this.status = 2;
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                Log.w(TAG, "Error closing stream", e2);
            }
        }
        return this.status;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void clear() {
        this.header = null;
        byte[] bArr = this.mainPixels;
        if (bArr != null) {
            this.bitmapProvider.release(bArr);
        }
        int[] iArr = this.mainScratch;
        if (iArr != null) {
            this.bitmapProvider.release(iArr);
        }
        Bitmap bitmap = this.previousImage;
        if (bitmap != null) {
            this.bitmapProvider.release(bitmap);
        }
        this.previousImage = null;
        this.rawData = null;
        this.isFirstFrameTransparent = null;
        byte[] bArr2 = this.block;
        if (bArr2 != null) {
            this.bitmapProvider.release(bArr2);
        }
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void setData(GifHeader gifHeader, byte[] bArr) {
        synchronized (this) {
            setData(gifHeader, ByteBuffer.wrap(bArr));
        }
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void setData(GifHeader gifHeader, ByteBuffer byteBuffer) {
        synchronized (this) {
            setData(gifHeader, byteBuffer, 1);
        }
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void setData(GifHeader gifHeader, ByteBuffer byteBuffer, int i) {
        synchronized (this) {
            try {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int iHighestOneBit = Integer.highestOneBit(i);
                this.status = 0;
                this.header = gifHeader;
                this.framePointer = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.rawData = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.rawData.order(ByteOrder.LITTLE_ENDIAN);
                this.savePrevious = false;
                Iterator<GifFrame> it = gifHeader.frames.iterator();
                while (it.hasNext()) {
                    if (it.next().dispose == 3) {
                        this.savePrevious = true;
                        break;
                    }
                }
                this.sampleSize = iHighestOneBit;
                this.downsampledWidth = gifHeader.width / iHighestOneBit;
                this.downsampledHeight = gifHeader.height / iHighestOneBit;
                this.mainPixels = this.bitmapProvider.obtainByteArray(gifHeader.width * gifHeader.height);
                this.mainScratch = this.bitmapProvider.obtainIntArray(this.downsampledWidth * this.downsampledHeight);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private GifHeaderParser getHeaderParser() {
        if (this.parser == null) {
            this.parser = new GifHeaderParser();
        }
        return this.parser;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int read(byte[] bArr) {
        int i;
        synchronized (this) {
            GifHeader header = getHeaderParser().setData(bArr).parseHeader();
            this.header = header;
            if (bArr != null) {
                setData(header, bArr);
            }
            i = this.status;
        }
        return i;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void setDefaultBitmapConfig(Bitmap.Config config) {
        if (config != Bitmap.Config.ARGB_8888 && config != Bitmap.Config.RGB_565) {
            throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
        }
        this.bitmapConfig = config;
    }

    private Bitmap setPixels(GifFrame gifFrame, GifFrame gifFrame2) {
        Bitmap bitmap;
        int[] iArr = this.mainScratch;
        int i = 0;
        if (gifFrame2 == null) {
            Bitmap bitmap2 = this.previousImage;
            if (bitmap2 != null) {
                this.bitmapProvider.release(bitmap2);
            }
            this.previousImage = null;
            Arrays.fill(iArr, 0);
        }
        if (gifFrame2 != null && gifFrame2.dispose == 3 && this.previousImage == null) {
            Arrays.fill(iArr, 0);
        }
        if (gifFrame2 != null && gifFrame2.dispose > 0) {
            if (gifFrame2.dispose == 2) {
                if (!gifFrame.transparency) {
                    int i2 = this.header.bgColor;
                    if (gifFrame.lct == null || this.header.bgIndex != gifFrame.transIndex) {
                        i = i2;
                    }
                }
                int i3 = gifFrame2.ih / this.sampleSize;
                int i4 = gifFrame2.iy / this.sampleSize;
                int i5 = gifFrame2.iw / this.sampleSize;
                int i6 = gifFrame2.ix / this.sampleSize;
                int i7 = this.downsampledWidth;
                int i8 = (i4 * i7) + i6;
                int i9 = i8;
                while (i9 < (i3 * i7) + i8) {
                    for (int i10 = i9; i10 < i9 + i5; i10++) {
                        iArr[i10] = i;
                    }
                    i9 += this.downsampledWidth;
                }
            } else if (gifFrame2.dispose == 3 && (bitmap = this.previousImage) != null) {
                int i11 = this.downsampledWidth;
                bitmap.getPixels(iArr, 0, i11, 0, 0, i11, this.downsampledHeight);
            }
        }
        decodeBitmapData(gifFrame);
        if (gifFrame.interlace || this.sampleSize != 1) {
            copyCopyIntoScratchRobust(gifFrame);
        } else {
            copyIntoScratchFast(gifFrame);
        }
        if (this.savePrevious && (gifFrame.dispose == 0 || gifFrame.dispose == 1)) {
            if (this.previousImage == null) {
                this.previousImage = getNextBitmap();
            }
            Bitmap bitmap3 = this.previousImage;
            int i12 = this.downsampledWidth;
            bitmap3.setPixels(iArr, 0, i12, 0, 0, i12, this.downsampledHeight);
        }
        Bitmap nextBitmap = getNextBitmap();
        int i13 = this.downsampledWidth;
        nextBitmap.setPixels(iArr, 0, i13, 0, 0, i13, this.downsampledHeight);
        return nextBitmap;
    }

    private void copyIntoScratchFast(GifFrame gifFrame) {
        GifFrame gifFrame2 = gifFrame;
        int[] iArr = this.mainScratch;
        int i = gifFrame2.ih;
        int i2 = gifFrame2.iy;
        int i3 = gifFrame2.iw;
        int i4 = gifFrame2.ix;
        boolean z = this.framePointer == 0;
        int i5 = this.downsampledWidth;
        byte[] bArr = this.mainPixels;
        int[] iArr2 = this.act;
        int i6 = 0;
        byte b2 = -1;
        while (i6 < i) {
            int i7 = (i6 + i2) * i5;
            int i8 = i7 + i4;
            int i9 = i8 + i3;
            int i10 = i7 + i5;
            if (i10 < i9) {
                i9 = i10;
            }
            int i11 = gifFrame2.iw * i6;
            int i12 = i8;
            while (i12 < i9) {
                byte b3 = bArr[i11];
                int i13 = i;
                int i14 = b3 & 255;
                if (i14 != b2) {
                    int i15 = iArr2[i14];
                    if (i15 != 0) {
                        iArr[i12] = i15;
                    } else {
                        b2 = b3;
                    }
                }
                i11++;
                i12++;
                i = i13;
            }
            i6++;
            gifFrame2 = gifFrame;
        }
        Boolean bool = this.isFirstFrameTransparent;
        this.isFirstFrameTransparent = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.isFirstFrameTransparent == null && z && b2 != -1));
    }

    private void copyCopyIntoScratchRobust(GifFrame gifFrame) {
        int i;
        int i2;
        int i3;
        int[] iArr = this.mainScratch;
        int i4 = gifFrame.ih / this.sampleSize;
        int i5 = gifFrame.iy / this.sampleSize;
        int i6 = gifFrame.iw / this.sampleSize;
        int i7 = gifFrame.ix;
        int i8 = this.sampleSize;
        int i9 = i7 / i8;
        boolean z = this.framePointer == 0;
        int i10 = this.downsampledWidth;
        int i11 = this.downsampledHeight;
        byte[] bArr = this.mainPixels;
        int[] iArr2 = this.act;
        Boolean bool = this.isFirstFrameTransparent;
        int i12 = 8;
        int i13 = 1;
        int i14 = 0;
        int i15 = 0;
        while (i14 < i4) {
            Boolean bool2 = bool;
            if (gifFrame.interlace) {
                if (i15 >= i4) {
                    int i16 = i13 + 1;
                    i = i4;
                    if (i16 == 2) {
                        i15 = 4;
                        i13 = i16;
                    } else if (i16 != 3) {
                        i13 = i16;
                        if (i16 == 4) {
                            i15 = 1;
                            i12 = 2;
                        }
                    } else {
                        i12 = 4;
                        i13 = i16;
                        i15 = 2;
                    }
                } else {
                    i = i4;
                }
                i2 = i15 + i12;
            } else {
                i = i4;
                i2 = i15;
                i15 = i14;
            }
            int i17 = i15 + i5;
            boolean z2 = i8 == 1;
            if (i17 < i11) {
                int i18 = i17 * i10;
                int i19 = i18 + i9;
                int i20 = i19 + i6;
                int i21 = i18 + i10;
                if (i21 < i20) {
                    i20 = i21;
                }
                int i22 = gifFrame.iw * i14 * i8;
                if (z2) {
                    int i23 = i19;
                    while (true) {
                        i3 = i5;
                        if (i23 >= i20) {
                            break;
                        }
                        int i24 = iArr2[bArr[i22] & 255];
                        if (i24 != 0) {
                            iArr[i23] = i24;
                        } else if (z && bool2 == null) {
                            bool2 = true;
                        }
                        i22 += i8;
                        i23++;
                        i5 = i3;
                    }
                } else {
                    i3 = i5;
                    int i25 = i22;
                    int i26 = i19;
                    while (i26 < i20) {
                        int i27 = i6;
                        int i28 = i9;
                        int iAverageColorsNear = averageColorsNear(i25, i22 + ((i20 - i19) * i8), gifFrame.iw);
                        if (iAverageColorsNear != 0) {
                            iArr[i26] = iAverageColorsNear;
                        } else if (z && bool2 == null) {
                            bool2 = true;
                        }
                        i25 += i8;
                        i26++;
                        i9 = i28;
                        i6 = i27;
                    }
                }
            } else {
                i3 = i5;
            }
            bool = bool2;
            i14++;
            i15 = i2;
            i4 = i;
            i5 = i3;
            i9 = i9;
            i6 = i6;
        }
        Boolean bool3 = bool;
        if (this.isFirstFrameTransparent == null) {
            this.isFirstFrameTransparent = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
        }
    }

    private int averageColorsNear(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.sampleSize + i; i9++) {
            byte[] bArr = this.mainPixels;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.act[bArr[i9] & 255];
            if (i10 != 0) {
                i4 += (i10 >> 24) & 255;
                i5 += (i10 >> 16) & 255;
                i6 += (i10 >> 8) & 255;
                i7 += i10 & 255;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.sampleSize + i11; i12++) {
            byte[] bArr2 = this.mainPixels;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.act[bArr2[i12] & 255];
            if (i13 != 0) {
                i4 += (i13 >> 24) & 255;
                i5 += (i13 >> 16) & 255;
                i6 += (i13 >> 8) & 255;
                i7 += i13 & 255;
                i8++;
            }
        }
        if (i8 == 0) {
            return 0;
        }
        return ((i4 / i8) << 24) | ((i5 / i8) << 16) | ((i6 / i8) << 8) | (i7 / i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v15, types: [short] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    private void decodeBitmapData(GifFrame gifFrame) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        short s;
        StandardGifDecoder standardGifDecoder = this;
        if (gifFrame != null) {
            standardGifDecoder.rawData.position(gifFrame.bufferFrameStart);
        }
        if (gifFrame == null) {
            i2 = standardGifDecoder.header.width;
            i = standardGifDecoder.header.height;
        } else {
            i = gifFrame.iw;
            i2 = gifFrame.ih;
        }
        int i5 = i2 * i;
        byte[] bArr = standardGifDecoder.mainPixels;
        if (bArr == null || bArr.length < i5) {
            standardGifDecoder.mainPixels = standardGifDecoder.bitmapProvider.obtainByteArray(i5);
        }
        byte[] bArr2 = standardGifDecoder.mainPixels;
        if (standardGifDecoder.prefix == null) {
            standardGifDecoder.prefix = new short[4096];
        }
        short[] sArr = standardGifDecoder.prefix;
        if (standardGifDecoder.suffix == null) {
            standardGifDecoder.suffix = new byte[4096];
        }
        byte[] bArr3 = standardGifDecoder.suffix;
        if (standardGifDecoder.pixelStack == null) {
            standardGifDecoder.pixelStack = new byte[4097];
        }
        byte[] bArr4 = standardGifDecoder.pixelStack;
        int i6 = readByte();
        int i7 = 1 << i6;
        int i8 = i7 + 2;
        int i9 = i6 + 1;
        int i10 = (1 << i9) - 1;
        byte b2 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            sArr[i11] = 0;
            bArr3[i11] = (byte) i11;
        }
        byte[] bArr5 = standardGifDecoder.block;
        int i12 = i9;
        int i13 = i8;
        int i14 = i10;
        int i15 = 0;
        int block = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = -1;
        while (i15 < i5) {
            if (block == 0) {
                block = readBlock();
                if (block <= 0) {
                    standardGifDecoder.status = 3;
                    break;
                }
                i20 = b2;
            }
            i19 += (bArr5[i20] & 255) << i17;
            i20++;
            block--;
            int i23 = i17 + 8;
            int i24 = i18;
            int i25 = i22;
            int i26 = i12;
            int i27 = i13;
            while (true) {
                i3 = i9;
                if (i23 < i26) {
                    i4 = i8;
                    z = true;
                    i17 = i23;
                    break;
                }
                int i28 = i19 & i14;
                i19 >>= i26;
                i23 -= i26;
                if (i28 == i7) {
                    i27 = i8;
                    i14 = i10;
                    i9 = i3;
                    i26 = i9;
                    i25 = -1;
                } else {
                    i4 = i8;
                    if (i28 == i7 + 1) {
                        i17 = i23;
                        z = true;
                        break;
                    }
                    if (i25 == -1) {
                        bArr2[i21] = bArr3[i28];
                        i21++;
                        i15++;
                        i24 = i28;
                        i25 = i24;
                        i9 = i3;
                        i8 = i4;
                    } else {
                        if (i28 >= i27) {
                            bArr4[i16] = (byte) i24;
                            i16++;
                            s = i25;
                        } else {
                            s = i28;
                        }
                        while (s >= i7) {
                            bArr4[i16] = bArr3[s];
                            i16++;
                            s = sArr[s];
                        }
                        int i29 = bArr3[s] & 255;
                        byte b3 = (byte) i29;
                        bArr2[i21] = b3;
                        while (true) {
                            i21++;
                            i15++;
                            if (i16 <= 0) {
                                break;
                            }
                            i16--;
                            bArr2[i21] = bArr4[i16];
                        }
                        if (i27 < 4096) {
                            sArr[i27] = (short) i25;
                            bArr3[i27] = b3;
                            i27++;
                            if ((i27 & i14) == 0 && i27 < 4096) {
                                i26++;
                                i14 += i27;
                            }
                        }
                        i25 = i28;
                        i9 = i3;
                        i8 = i4;
                        i24 = i29;
                    }
                }
            }
            i22 = i25;
            i8 = i4;
            b2 = 0;
            i13 = i27;
            i18 = i24;
            i9 = i3;
            standardGifDecoder = this;
            i12 = i26;
        }
        Arrays.fill(bArr2, i21, i5, b2);
    }

    private int readByte() {
        return this.rawData.get() & 255;
    }

    private int readBlock() {
        int i = readByte();
        if (i <= 0) {
            return i;
        }
        ByteBuffer byteBuffer = this.rawData;
        byteBuffer.get(this.block, 0, Math.min(i, byteBuffer.remaining()));
        return i;
    }

    private Bitmap getNextBitmap() {
        Boolean bool = this.isFirstFrameTransparent;
        Bitmap bitmapObtain = this.bitmapProvider.obtain(this.downsampledWidth, this.downsampledHeight, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.bitmapConfig);
        bitmapObtain.setHasAlpha(true);
        return bitmapObtain;
    }
}
