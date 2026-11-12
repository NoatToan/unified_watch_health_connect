package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import defpackage.a6i;
import defpackage.cch;
import defpackage.cq2;
import defpackage.epe;
import defpackage.flb;
import defpackage.gq2;
import defpackage.kqk;
import defpackage.nj1;
import defpackage.oyp;
import defpackage.ulq;
import defpackage.wbh;
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

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public static final wbh<DecodeFormat> f = wbh.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", DecodeFormat.DEFAULT);
    public static final wbh<PreferredColorSpace> g = wbh.e("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    @Deprecated
    public static final wbh<DownsampleStrategy> h = DownsampleStrategy.h;
    public static final wbh<Boolean> i;
    public static final wbh<Boolean> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Set<String> f6980k;
    public static final b l;
    public static final Set<ImageHeaderParser.ImageType> m;
    public static final Queue<BitmapFactory.Options> n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cq2 f6981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f6982b;
    public final nj1 c;
    public final List<ImageHeaderParser> d;
    public final flb e = flb.b();

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.a$a, reason: collision with other inner class name */
    public class C0138a implements b {
        @Override // com.bumptech.glide.load.resource.bitmap.a.b
        public void a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a.b
        public void b(cq2 cq2Var, Bitmap bitmap) {
        }
    }

    public interface b {
        void a();

        void b(cq2 cq2Var, Bitmap bitmap) throws IOException;
    }

    static {
        Boolean bool = Boolean.FALSE;
        i = wbh.f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        j = wbh.f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f6980k = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        l = new C0138a();
        m = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        n = ulq.g(0);
    }

    public a(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, cq2 cq2Var, nj1 nj1Var) {
        this.d = list;
        this.f6982b = (DisplayMetrics) a6i.d(displayMetrics);
        this.f6981a = (cq2) a6i.d(cq2Var);
        this.c = (nj1) a6i.d(nj1Var);
    }

    public static int a(double d) {
        int iL = l(d);
        int iX = x(((double) iL) * d);
        return x((d / ((double) (iX / iL))) * ((double) iX));
    }

    public static void c(ImageHeaderParser.ImageType imageType, com.bumptech.glide.load.resource.bitmap.b bVar, b bVar2, cq2 cq2Var, DownsampleStrategy downsampleStrategy, int i2, int i3, int i4, int i5, int i6, BitmapFactory.Options options) throws IOException {
        int i7;
        int i8;
        int iFloor;
        int iFloor2;
        if (i3 <= 0 || i4 <= 0) {
            if (Log.isLoggable("Downsampler", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to determine dimensions for: ");
                sb.append(imageType);
                sb.append(" with target [");
                sb.append(i5);
                sb.append("x");
                sb.append(i6);
                sb.append("]");
                return;
            }
            return;
        }
        if (r(i2)) {
            i8 = i3;
            i7 = i4;
        } else {
            i7 = i3;
            i8 = i4;
        }
        float fB = downsampleStrategy.b(i7, i8, i5, i6);
        if (fB <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + fB + " from: " + downsampleStrategy + ", source: [" + i3 + "x" + i4 + "], target: [" + i5 + "x" + i6 + "]");
        }
        DownsampleStrategy.SampleSizeRounding sampleSizeRoundingA = downsampleStrategy.a(i7, i8, i5, i6);
        if (sampleSizeRoundingA == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f2 = i7;
        float f3 = i8;
        int iX = i7 / x(fB * f2);
        int iX2 = i8 / x(fB * f3);
        DownsampleStrategy.SampleSizeRounding sampleSizeRounding = DownsampleStrategy.SampleSizeRounding.MEMORY;
        int iMax = Math.max(1, Integer.highestOneBit(sampleSizeRoundingA == sampleSizeRounding ? Math.max(iX, iX2) : Math.min(iX, iX2)));
        if (sampleSizeRoundingA == sampleSizeRounding && iMax < 1.0f / fB) {
            iMax <<= 1;
        }
        options.inSampleSize = iMax;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float fMin = Math.min(iMax, 8);
            iFloor = (int) Math.ceil(f2 / fMin);
            iFloor2 = (int) Math.ceil(f3 / fMin);
            int i9 = iMax / 8;
            if (i9 > 0) {
                iFloor /= i9;
                iFloor2 /= i9;
            }
        } else if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
            float f4 = iMax;
            iFloor = (int) Math.floor(f2 / f4);
            iFloor2 = (int) Math.floor(f3 / f4);
        } else if (imageType.isWebp()) {
            float f5 = iMax;
            iFloor = Math.round(f2 / f5);
            iFloor2 = Math.round(f3 / f5);
        } else if (i7 % iMax == 0 && i8 % iMax == 0) {
            iFloor = i7 / iMax;
            iFloor2 = i8 / iMax;
        } else {
            int[] iArrM = m(bVar, options, bVar2, cq2Var);
            iFloor = iArrM[0];
            iFloor2 = iArrM[1];
        }
        double dB = downsampleStrategy.b(iFloor, iFloor2, i5, i6);
        options.inTargetDensity = a(dB);
        options.inDensity = l(dB);
        if (s(options)) {
            options.inScaled = true;
        } else {
            options.inTargetDensity = 0;
            options.inDensity = 0;
        }
        if (Log.isLoggable("Downsampler", 2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Calculate scaling, source: [");
            sb2.append(i3);
            sb2.append("x");
            sb2.append(i4);
            sb2.append("], degreesToRotate: ");
            sb2.append(i2);
            sb2.append(", target: [");
            sb2.append(i5);
            sb2.append("x");
            sb2.append(i6);
            sb2.append("], power of two scaled: [");
            sb2.append(iFloor);
            sb2.append("x");
            sb2.append(iFloor2);
            sb2.append("], exact scale factor: ");
            sb2.append(fB);
            sb2.append(", power of 2 sample size: ");
            sb2.append(iMax);
            sb2.append(", adjusted scale factor: ");
            sb2.append(dB);
            sb2.append(", target density: ");
            sb2.append(options.inTargetDensity);
            sb2.append(", density: ");
            sb2.append(options.inDensity);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap i(com.bumptech.glide.load.resource.bitmap.b r4, android.graphics.BitmapFactory.Options r5, com.bumptech.glide.load.resource.bitmap.a.b r6, defpackage.cq2 r7) throws java.io.IOException {
        /*
            boolean r0 = r5.inJustDecodeBounds
            if (r0 != 0) goto La
            r6.a()
            r4.a()
        La:
            int r0 = r5.outWidth
            int r1 = r5.outHeight
            java.lang.String r2 = r5.outMimeType
            java.util.concurrent.locks.Lock r3 = defpackage.oyp.f()
            r3.lock()
            android.graphics.Bitmap r4 = r4.c(r5)     // Catch: java.lang.Throwable -> L23 java.lang.IllegalArgumentException -> L25
            java.util.concurrent.locks.Lock r5 = defpackage.oyp.f()
            r5.unlock()
            return r4
        L23:
            r4 = move-exception
            goto L48
        L25:
            r3 = move-exception
            java.io.IOException r0 = u(r3, r0, r1, r2, r5)     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = "Downsampler"
            r2 = 3
            android.util.Log.isLoggable(r1, r2)     // Catch: java.lang.Throwable -> L23
            android.graphics.Bitmap r1 = r5.inBitmap     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L47
            r7.a(r1)     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L46
            r1 = 0
            r5.inBitmap = r1     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L46
            android.graphics.Bitmap r4 = i(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L46
            java.util.concurrent.locks.Lock r5 = defpackage.oyp.f()
            r5.unlock()
            return r4
        L46:
            throw r0     // Catch: java.lang.Throwable -> L23
        L47:
            throw r0     // Catch: java.lang.Throwable -> L23
        L48:
            java.util.concurrent.locks.Lock r5 = defpackage.oyp.f()
            r5.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.a.i(com.bumptech.glide.load.resource.bitmap.b, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.a$b, cq2):android.graphics.Bitmap");
    }

    @TargetApi(19)
    public static String j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static synchronized BitmapFactory.Options k() {
        BitmapFactory.Options optionsPoll;
        Queue<BitmapFactory.Options> queue = n;
        synchronized (queue) {
            optionsPoll = queue.poll();
        }
        if (optionsPoll == null) {
            optionsPoll = new BitmapFactory.Options();
            w(optionsPoll);
        }
        return optionsPoll;
    }

    public static int l(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    public static int[] m(com.bumptech.glide.load.resource.bitmap.b bVar, BitmapFactory.Options options, b bVar2, cq2 cq2Var) throws IOException {
        options.inJustDecodeBounds = true;
        i(bVar, options, bVar2, cq2Var);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    public static String n(BitmapFactory.Options options) {
        return j(options.inBitmap);
    }

    public static boolean r(int i2) {
        return i2 == 90 || i2 == 270;
    }

    public static boolean s(BitmapFactory.Options options) {
        int i2;
        int i3 = options.inTargetDensity;
        return i3 > 0 && (i2 = options.inDensity) > 0 && i3 != i2;
    }

    public static void t(int i2, int i3, String str, BitmapFactory.Options options, Bitmap bitmap, int i4, int i5, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append("Decoded ");
        sb.append(j(bitmap));
        sb.append(" from [");
        sb.append(i2);
        sb.append("x");
        sb.append(i3);
        sb.append("] ");
        sb.append(str);
        sb.append(" with inBitmap ");
        sb.append(n(options));
        sb.append(" for [");
        sb.append(i4);
        sb.append("x");
        sb.append(i5);
        sb.append("], sample size: ");
        sb.append(options.inSampleSize);
        sb.append(", density: ");
        sb.append(options.inDensity);
        sb.append(", target density: ");
        sb.append(options.inTargetDensity);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        sb.append(", duration: ");
        sb.append(epe.a(j2));
    }

    public static IOException u(IllegalArgumentException illegalArgumentException, int i2, int i3, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i2 + ", outHeight: " + i3 + ", outMimeType: " + str + ", inBitmap: " + n(options), illegalArgumentException);
    }

    public static void v(BitmapFactory.Options options) {
        w(options);
        Queue<BitmapFactory.Options> queue = n;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    public static void w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public static int x(double d) {
        return (int) (d + 0.5d);
    }

    @TargetApi(26)
    public static void y(BitmapFactory.Options options, cq2 cq2Var, int i2, int i3) {
        Bitmap.Config config = options.inPreferredConfig;
        if (config == Bitmap.Config.HARDWARE) {
            return;
        }
        Bitmap.Config config2 = options.outConfig;
        if (config2 != null) {
            config = config2;
        }
        options.inBitmap = cq2Var.c(i2, i3, config);
    }

    public final void b(com.bumptech.glide.load.resource.bitmap.b bVar, DecodeFormat decodeFormat, boolean z, boolean z2, BitmapFactory.Options options, int i2, int i3) {
        Bitmap.Config config;
        if (this.e.g(i2, i3, options, z, z2)) {
            return;
        }
        if (decodeFormat == DecodeFormat.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        try {
            config = bVar.d().hasAlpha() ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        } catch (IOException unused) {
            if (Log.isLoggable("Downsampler", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot determine whether the image has alpha or not from header, format ");
                sb.append(decodeFormat);
            }
        }
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    @RequiresApi(21)
    public kqk<Bitmap> d(ParcelFileDescriptor parcelFileDescriptor, int i2, int i3, cch cchVar) throws IOException {
        return e(new com.bumptech.glide.load.resource.bitmap.b.c(parcelFileDescriptor, this.d, this.c), i2, i3, cchVar, l);
    }

    public final kqk<Bitmap> e(com.bumptech.glide.load.resource.bitmap.b bVar, int i2, int i3, cch cchVar, b bVar2) throws IOException {
        byte[] bArr = (byte[]) this.c.a(65536, byte[].class);
        BitmapFactory.Options optionsK = k();
        optionsK.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) cchVar.c(f);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) cchVar.c(g);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) cchVar.c(DownsampleStrategy.h);
        boolean zBooleanValue = ((Boolean) cchVar.c(i)).booleanValue();
        wbh<Boolean> wbhVar = j;
        try {
            return gq2.c(h(bVar, optionsK, downsampleStrategy, decodeFormat, preferredColorSpace, cchVar.c(wbhVar) != null && ((Boolean) cchVar.c(wbhVar)).booleanValue(), i2, i3, zBooleanValue, bVar2), this.f6981a);
        } finally {
            v(optionsK);
            this.c.put(bArr);
        }
    }

    public kqk<Bitmap> f(InputStream inputStream, int i2, int i3, cch cchVar, b bVar) throws IOException {
        return e(new com.bumptech.glide.load.resource.bitmap.b.C0139b(inputStream, this.d, this.c), i2, i3, cchVar, bVar);
    }

    public kqk<Bitmap> g(ByteBuffer byteBuffer, int i2, int i3, cch cchVar) throws IOException {
        return e(new com.bumptech.glide.load.resource.bitmap.b.a(byteBuffer, this.d, this.c), i2, i3, cchVar, l);
    }

    public final Bitmap h(com.bumptech.glide.load.resource.bitmap.b bVar, BitmapFactory.Options options, DownsampleStrategy downsampleStrategy, DecodeFormat decodeFormat, PreferredColorSpace preferredColorSpace, boolean z, int i2, int i3, boolean z2, b bVar2) throws IOException {
        int i4;
        int i5;
        int i6;
        String str;
        ColorSpace colorSpace;
        int iRound;
        int i7;
        long jB = epe.b();
        int[] iArrM = m(bVar, options, bVar2, this.f6981a);
        int i8 = iArrM[0];
        int i9 = iArrM[1];
        String str2 = options.outMimeType;
        boolean z3 = (i8 == -1 || i9 == -1) ? false : z;
        int iB = bVar.b();
        int iG = oyp.g(iB);
        boolean zJ = oyp.j(iB);
        if (i2 == Integer.MIN_VALUE) {
            i4 = i3;
            i5 = r(iG) ? i9 : i8;
        } else {
            i4 = i3;
            i5 = i2;
        }
        if (i4 == Integer.MIN_VALUE) {
            i6 = r(iG) ? i8 : i9;
        } else {
            i6 = i4;
        }
        ImageHeaderParser.ImageType imageTypeD = bVar.d();
        c(imageTypeD, bVar, bVar2, this.f6981a, downsampleStrategy, iG, i8, i9, i5, i6, options);
        b(bVar, decodeFormat, z3, zJ, options, i5, i6);
        int i10 = Build.VERSION.SDK_INT;
        if (z(imageTypeD)) {
            if (i8 < 0 || i9 < 0 || !z2) {
                float f2 = s(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                int i11 = options.inSampleSize;
                float f3 = i11;
                int iCeil = (int) Math.ceil(i8 / f3);
                int iCeil2 = (int) Math.ceil(i9 / f3);
                int iRound2 = Math.round(iCeil * f2);
                iRound = Math.round(iCeil2 * f2);
                str = "Downsampler";
                if (Log.isLoggable(str, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Calculated target [");
                    sb.append(iRound2);
                    sb.append("x");
                    sb.append(iRound);
                    sb.append("] for source [");
                    sb.append(i8);
                    sb.append("x");
                    sb.append(i9);
                    sb.append("], sampleSize: ");
                    sb.append(i11);
                    sb.append(", targetDensity: ");
                    sb.append(options.inTargetDensity);
                    sb.append(", density: ");
                    sb.append(options.inDensity);
                    sb.append(", density multiplier: ");
                    sb.append(f2);
                }
                i7 = iRound2;
            } else {
                str = "Downsampler";
                i7 = i5;
                iRound = i6;
            }
            if (i7 > 0 && iRound > 0) {
                y(options, this.f6981a, i7, iRound);
            }
        } else {
            str = "Downsampler";
        }
        if (preferredColorSpace != null) {
            if (i10 >= 28) {
                options.inPreferredColorSpace = ColorSpace.get((preferredColorSpace == PreferredColorSpace.DISPLAY_P3 && (colorSpace = options.outColorSpace) != null && colorSpace.isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
            } else {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        Bitmap bitmapI = i(bVar, options, bVar2, this.f6981a);
        bVar2.b(this.f6981a, bitmapI);
        if (Log.isLoggable(str, 2)) {
            t(i8, i9, str2, options, bitmapI, i2, i3, jB);
        }
        if (bitmapI == null) {
            return null;
        }
        bitmapI.setDensity(this.f6982b.densityDpi);
        Bitmap bitmapK = oyp.k(this.f6981a, bitmapI, iB);
        if (bitmapI.equals(bitmapK)) {
            return bitmapK;
        }
        this.f6981a.a(bitmapI);
        return bitmapK;
    }

    public boolean o(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.c();
    }

    public boolean p(InputStream inputStream) {
        return true;
    }

    public boolean q(ByteBuffer byteBuffer) {
        return true;
    }

    public final boolean z(ImageHeaderParser.ImageType imageType) {
        return true;
    }
}
