package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class Downsampler {
    public static final Option<Boolean> ALLOW_HARDWARE_CONFIG;
    public static final Option<DecodeFormat> DECODE_FORMAT = Option.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", DecodeFormat.DEFAULT);

    @Deprecated
    public static final Option<DownsampleStrategy> DOWNSAMPLE_STRATEGY = DownsampleStrategy.OPTION;
    public static final Option<Boolean> FIX_BITMAP_SIZE_TO_REQUESTED_DIMENSIONS;
    public static final String f = "Downsampler";
    private static final String g = "image/vnd.wap.wbmp";
    private static final String h = "image/x-ico";
    private static final Set<String> i;
    private static final DecodeCallbacks j;
    private static final Set<ImageHeaderParser.ImageType> k;
    private static final Queue<BitmapFactory.Options> l;
    private static final int m = 10485760;
    private final BitmapPool a;
    private final DisplayMetrics b;
    private final ArrayPool c;
    private final List<ImageHeaderParser> d;
    private final b e = b.a();

    public interface DecodeCallbacks {
        void onDecodeComplete(BitmapPool bitmapPool, Bitmap bitmap) throws IOException;

        void onObtainBounds();
    }

    public class a implements DecodeCallbacks {
        @Override // com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks
        public void onDecodeComplete(BitmapPool bitmapPool, Bitmap bitmap) {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks
        public void onObtainBounds() {
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        FIX_BITMAP_SIZE_TO_REQUESTED_DIMENSIONS = Option.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        ALLOW_HARDWARE_CONFIG = Option.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        i = Collections.unmodifiableSet(new HashSet(Arrays.asList(g, h)));
        j = new a();
        k = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        l = Util.createQueue(0);
    }

    public Downsampler(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, BitmapPool bitmapPool, ArrayPool arrayPool) {
        this.d = list;
        this.b = (DisplayMetrics) Preconditions.checkNotNull(displayMetrics);
        this.a = (BitmapPool) Preconditions.checkNotNull(bitmapPool);
        this.c = (ArrayPool) Preconditions.checkNotNull(arrayPool);
    }

    private static int a(double d) {
        int iH = h(d);
        int iP = p(((double) iH) * d);
        return p((d / ((double) (iP / iH))) * ((double) iP));
    }

    private void b(InputStream inputStream, DecodeFormat decodeFormat, boolean z, boolean z2, BitmapFactory.Options options, int i2, int i3) {
        if (this.e.c(i2, i3, options, decodeFormat, z, z2)) {
            return;
        }
        if (decodeFormat == DecodeFormat.PREFER_ARGB_8888 || Build.VERSION.SDK_INT == 16) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        boolean zHasAlpha = false;
        try {
            zHasAlpha = ImageHeaderParserUtils.getType(this.d, inputStream, this.c).hasAlpha();
        } catch (IOException e) {
            if (Log.isLoggable(f, 3)) {
                Log.d(f, "Cannot determine whether the image has alpha or not from header, format " + decodeFormat, e);
            }
        }
        Bitmap.Config config = zHasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    private static void c(ImageHeaderParser.ImageType imageType, InputStream inputStream, DecodeCallbacks decodeCallbacks, BitmapPool bitmapPool, DownsampleStrategy downsampleStrategy, int i2, int i3, int i4, int i5, int i6, BitmapFactory.Options options) throws IOException {
        int i7;
        int i8;
        int iFloor;
        double dFloor;
        int iRound;
        if (i3 <= 0 || i4 <= 0) {
            if (Log.isLoggable(f, 3)) {
                Log.d(f, "Unable to determine dimensions for: " + imageType + " with target [" + i5 + "x" + i6 + "]");
                return;
            }
            return;
        }
        float scaleFactor = (i2 == 90 || i2 == 270) ? downsampleStrategy.getScaleFactor(i4, i3, i5, i6) : downsampleStrategy.getScaleFactor(i3, i4, i5, i6);
        if (scaleFactor <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + scaleFactor + " from: " + downsampleStrategy + ", source: [" + i3 + "x" + i4 + "], target: [" + i5 + "x" + i6 + "]");
        }
        DownsampleStrategy.SampleSizeRounding sampleSizeRounding = downsampleStrategy.getSampleSizeRounding(i3, i4, i5, i6);
        if (sampleSizeRounding == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f2 = i3;
        float f3 = i4;
        int iP = i3 / p(scaleFactor * f2);
        int iP2 = i4 / p(scaleFactor * f3);
        DownsampleStrategy.SampleSizeRounding sampleSizeRounding2 = DownsampleStrategy.SampleSizeRounding.MEMORY;
        int iMax = sampleSizeRounding == sampleSizeRounding2 ? Math.max(iP, iP2) : Math.min(iP, iP2);
        int i9 = Build.VERSION.SDK_INT;
        if (i9 > 23 || !i.contains(options.outMimeType)) {
            int iMax2 = Math.max(1, Integer.highestOneBit(iMax));
            i7 = (sampleSizeRounding != sampleSizeRounding2 || ((float) iMax2) >= 1.0f / scaleFactor) ? iMax2 : iMax2 << 1;
        } else {
            i7 = 1;
        }
        options.inSampleSize = i7;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float fMin = Math.min(i7, 8);
            i8 = i9;
            iFloor = (int) Math.ceil(f2 / fMin);
            iRound = (int) Math.ceil(f3 / fMin);
            int i10 = i7 / 8;
            if (i10 > 0) {
                iFloor /= i10;
                iRound /= i10;
            }
        } else {
            i8 = i9;
            if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
                float f4 = i7;
                iFloor = (int) Math.floor(f2 / f4);
                dFloor = Math.floor(f3 / f4);
            } else if (imageType == ImageHeaderParser.ImageType.WEBP || imageType == ImageHeaderParser.ImageType.WEBP_A) {
                if (i8 >= 24) {
                    float f5 = i7;
                    iFloor = Math.round(f2 / f5);
                    iRound = Math.round(f3 / f5);
                } else {
                    float f6 = i7;
                    iFloor = (int) Math.floor(f2 / f6);
                    dFloor = Math.floor(f3 / f6);
                }
            } else if (i3 % i7 == 0 && i4 % i7 == 0) {
                iFloor = i3 / i7;
                iRound = i4 / i7;
            } else {
                int[] iArrI = i(inputStream, options, decodeCallbacks, bitmapPool);
                int i11 = iArrI[0];
                iRound = iArrI[1];
                iFloor = i11;
            }
            iRound = (int) dFloor;
        }
        double scaleFactor2 = downsampleStrategy.getScaleFactor(iFloor, iRound, i5, i6);
        if (i8 >= 19) {
            options.inTargetDensity = a(scaleFactor2);
            options.inDensity = h(scaleFactor2);
        }
        if (k(options)) {
            options.inScaled = true;
        } else {
            options.inTargetDensity = 0;
            options.inDensity = 0;
        }
        if (Log.isLoggable(f, 2)) {
            Log.v(f, "Calculate scaling, source: [" + i3 + "x" + i4 + "], target: [" + i5 + "x" + i6 + "], power of two scaled: [" + iFloor + "x" + iRound + "], exact scale factor: " + scaleFactor + ", power of 2 sample size: " + i7 + ", adjusted scale factor: " + scaleFactor2 + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity);
        }
    }

    private Bitmap d(InputStream inputStream, BitmapFactory.Options options, DownsampleStrategy downsampleStrategy, DecodeFormat decodeFormat, boolean z, int i2, int i3, boolean z2, DecodeCallbacks decodeCallbacks) throws IOException {
        Downsampler downsampler;
        int iRound;
        int iRound2;
        long logTime = LogTime.getLogTime();
        int[] iArrI = i(inputStream, options, decodeCallbacks, this.a);
        int i4 = iArrI[0];
        int i5 = iArrI[1];
        String str = options.outMimeType;
        boolean z3 = (i4 == -1 || i5 == -1) ? false : z;
        int orientation = ImageHeaderParserUtils.getOrientation(this.d, inputStream, this.c);
        int exifOrientationDegrees = TransformationUtils.getExifOrientationDegrees(orientation);
        boolean zIsExifOrientationRequired = TransformationUtils.isExifOrientationRequired(orientation);
        int i6 = i2 == Integer.MIN_VALUE ? i4 : i2;
        int i7 = i3 == Integer.MIN_VALUE ? i5 : i3;
        ImageHeaderParser.ImageType type = ImageHeaderParserUtils.getType(this.d, inputStream, this.c);
        c(type, inputStream, decodeCallbacks, this.a, downsampleStrategy, exifOrientationDegrees, i4, i5, i6, i7, options);
        b(inputStream, decodeFormat, z3, zIsExifOrientationRequired, options, i6, i7);
        boolean z4 = Build.VERSION.SDK_INT >= 19;
        if (options.inSampleSize == 1 || z4) {
            downsampler = this;
            if (downsampler.r(type)) {
                if (i4 < 0 || i5 < 0 || !z2 || !z4) {
                    float f2 = k(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                    int i8 = options.inSampleSize;
                    float f3 = i8;
                    int iCeil = (int) Math.ceil(i4 / f3);
                    int iCeil2 = (int) Math.ceil(i5 / f3);
                    iRound = Math.round(iCeil * f2);
                    iRound2 = Math.round(iCeil2 * f2);
                    if (Log.isLoggable(f, 2)) {
                        Log.v(f, "Calculated target [" + iRound + "x" + iRound2 + "] for source [" + i4 + "x" + i5 + "], sampleSize: " + i8 + ", targetDensity: " + options.inTargetDensity + ", density: " + options.inDensity + ", density multiplier: " + f2);
                    }
                } else {
                    iRound = i6;
                    iRound2 = i7;
                }
                if (iRound > 0 && iRound2 > 0) {
                    q(options, downsampler.a, iRound, iRound2);
                }
            }
        } else {
            downsampler = this;
        }
        Bitmap bitmapE = e(inputStream, options, decodeCallbacks, downsampler.a);
        decodeCallbacks.onDecodeComplete(downsampler.a, bitmapE);
        if (Log.isLoggable(f, 2)) {
            l(i4, i5, str, options, bitmapE, i2, i3, logTime);
        }
        Bitmap bitmapRotateImageExif = null;
        if (bitmapE != null) {
            bitmapE.setDensity(downsampler.b.densityDpi);
            bitmapRotateImageExif = TransformationUtils.rotateImageExif(downsampler.a, bitmapE, orientation);
            if (!bitmapE.equals(bitmapRotateImageExif)) {
                downsampler.a.put(bitmapE);
            }
        }
        return bitmapRotateImageExif;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Bitmap e(InputStream inputStream, BitmapFactory.Options options, DecodeCallbacks decodeCallbacks, BitmapPool bitmapPool) throws IOException {
        if (options.inJustDecodeBounds) {
            inputStream.mark(m);
        } else {
            decodeCallbacks.onObtainBounds();
        }
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        String str = options.outMimeType;
        TransformationUtils.getBitmapDrawableLock().lock();
        try {
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                TransformationUtils.getBitmapDrawableLock().unlock();
                if (options.inJustDecodeBounds) {
                    inputStream.reset();
                }
                return bitmapDecodeStream;
            } catch (IllegalArgumentException e) {
                IOException iOExceptionM = m(e, i2, i3, str, options);
                if (Log.isLoggable(f, 3)) {
                    Log.d(f, "Failed to decode with inBitmap, trying again without Bitmap re-use", iOExceptionM);
                }
                if (options.inBitmap == null) {
                    throw iOExceptionM;
                }
                try {
                    inputStream.reset();
                    bitmapPool.put(options.inBitmap);
                    options.inBitmap = null;
                    Bitmap bitmapE = e(inputStream, options, decodeCallbacks, bitmapPool);
                    TransformationUtils.getBitmapDrawableLock().unlock();
                    return bitmapE;
                } catch (IOException unused) {
                    throw iOExceptionM;
                }
            }
        } catch (Throwable th) {
            TransformationUtils.getBitmapDrawableLock().unlock();
            throw th;
        }
    }

    @Nullable
    @TargetApi(19)
    private static String f(Bitmap bitmap) {
        String str;
        if (bitmap == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            str = " (" + bitmap.getAllocationByteCount() + ")";
        } else {
            str = "";
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + str;
    }

    private static synchronized BitmapFactory.Options g() {
        BitmapFactory.Options optionsPoll;
        Queue<BitmapFactory.Options> queue = l;
        synchronized (queue) {
            optionsPoll = queue.poll();
        }
        if (optionsPoll == null) {
            optionsPoll = new BitmapFactory.Options();
            o(optionsPoll);
        }
        return optionsPoll;
    }

    private static int h(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    private static int[] i(InputStream inputStream, BitmapFactory.Options options, DecodeCallbacks decodeCallbacks, BitmapPool bitmapPool) throws IOException {
        options.inJustDecodeBounds = true;
        e(inputStream, options, decodeCallbacks, bitmapPool);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static String j(BitmapFactory.Options options) {
        return f(options.inBitmap);
    }

    private static boolean k(BitmapFactory.Options options) {
        int i2;
        int i3 = options.inTargetDensity;
        return i3 > 0 && (i2 = options.inDensity) > 0 && i3 != i2;
    }

    private static void l(int i2, int i3, String str, BitmapFactory.Options options, Bitmap bitmap, int i4, int i5, long j2) {
        Log.v(f, "Decoded " + f(bitmap) + " from [" + i2 + "x" + i3 + "] " + str + " with inBitmap " + j(options) + " for [" + i4 + "x" + i5 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + LogTime.getElapsedMillis(j2));
    }

    private static IOException m(IllegalArgumentException illegalArgumentException, int i2, int i3, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i2 + ", outHeight: " + i3 + ", outMimeType: " + str + ", inBitmap: " + j(options), illegalArgumentException);
    }

    private static void n(BitmapFactory.Options options) {
        o(options);
        Queue<BitmapFactory.Options> queue = l;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void o(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static int p(double d) {
        return (int) (d + 0.5d);
    }

    @TargetApi(26)
    private static void q(BitmapFactory.Options options, BitmapPool bitmapPool, int i2, int i3) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig == Bitmap.Config.HARDWARE) {
            return;
        } else {
            config = options.outConfig;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = bitmapPool.getDirty(i2, i3, config);
    }

    private boolean r(ImageHeaderParser.ImageType imageType) {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return k.contains(imageType);
    }

    public Resource<Bitmap> decode(InputStream inputStream, int i2, int i3, Options options) throws IOException {
        return decode(inputStream, i2, i3, options, j);
    }

    public boolean handles(InputStream inputStream) {
        return true;
    }

    public boolean handles(ByteBuffer byteBuffer) {
        return true;
    }

    public Resource<Bitmap> decode(InputStream inputStream, int i2, int i3, Options options, DecodeCallbacks decodeCallbacks) throws IOException {
        Preconditions.checkArgument(inputStream.markSupported(), "You must provide an InputStream that supports mark()");
        byte[] bArr = (byte[]) this.c.get(65536, byte[].class);
        BitmapFactory.Options optionsG = g();
        optionsG.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) options.get(DECODE_FORMAT);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) options.get(DownsampleStrategy.OPTION);
        boolean zBooleanValue = ((Boolean) options.get(FIX_BITMAP_SIZE_TO_REQUESTED_DIMENSIONS)).booleanValue();
        Option<Boolean> option = ALLOW_HARDWARE_CONFIG;
        try {
            return BitmapResource.obtain(d(inputStream, optionsG, downsampleStrategy, decodeFormat, options.get(option) != null && ((Boolean) options.get(option)).booleanValue(), i2, i3, zBooleanValue, decodeCallbacks), this.a);
        } finally {
            n(optionsG);
            this.c.put(bArr);
        }
    }
}
