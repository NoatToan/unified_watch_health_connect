package dj;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import i3.e5;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes7.dex */
public final class m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ui.g<ui.b> f59847f = ui.g.b(ui.b.f171160c, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ui.g<ui.i> f59848g = ui.g.c("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ui.g<Boolean> f59849h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ui.g<Boolean> f59850i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Set<String> f59851j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f59852k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Set<ImageHeaderParser.ImageType> f59853l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ArrayDeque f59854m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi.d f59855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f59856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi.b f59857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<ImageHeaderParser> f59858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f59859e = t.a();

    public class a implements b {
        @Override // dj.m.b
        public final void a(Bitmap bitmap, xi.d dVar) {
        }

        @Override // dj.m.b
        public final void b() {
        }
    }

    public interface b {
        void a(Bitmap bitmap, xi.d dVar);

        void b();
    }

    static {
        l.e eVar = l.f59837a;
        Boolean bool = Boolean.FALSE;
        f59849h = ui.g.b(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f59850i = ui.g.b(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        f59851j = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f59852k = new a();
        f59853l = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        char[] cArr = qj.m.f144982a;
        f59854m = new ArrayDeque(0);
    }

    public m(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, xi.d dVar, xi.b bVar) {
        this.f59858d = list;
        qj.l.c(displayMetrics, "Argument must not be null");
        this.f59856b = displayMetrics;
        qj.l.c(dVar, "Argument must not be null");
        this.f59855a = dVar;
        qj.l.c(bVar, "Argument must not be null");
        this.f59857c = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        throw r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap c(u uVar, BitmapFactory.Options options, b bVar, xi.d dVar) {
        if (!options.inJustDecodeBounds) {
            bVar.b();
            uVar.a();
        }
        int i14 = options.outWidth;
        int i15 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = d0.f59818d;
        lock.lock();
        try {
            try {
                Bitmap bitmapB = uVar.b(options);
                lock.unlock();
                return bitmapB;
            } catch (IllegalArgumentException e4) {
                StringBuilder sbJ = e5.j(i14, i15, "Exception decoding bitmap, outWidth: ", ", outHeight: ", ", outMimeType: ");
                sbJ.append(str);
                sbJ.append(", inBitmap: ");
                sbJ.append(d(options.inBitmap));
                IOException iOException = new IOException(sbJ.toString(), e4);
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    throw iOException;
                }
                try {
                    dVar.c(bitmap);
                    options.inBitmap = null;
                    Bitmap bitmapC = c(uVar, options, bVar, dVar);
                    d0.f59818d.unlock();
                    return bitmapC;
                } catch (IOException unused) {
                    throw iOException;
                }
            }
        } catch (Throwable th3) {
            d0.f59818d.unlock();
            throw th3;
        }
    }

    @TargetApi(19)
    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static void e(BitmapFactory.Options options) {
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

    public final e a(u uVar, int i14, int i15, ui.h hVar, b bVar) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        byte[] bArr = (byte[]) this.f59857c.c(65536, byte[].class);
        synchronized (m.class) {
            arrayDeque = f59854m;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                e(options);
            }
        }
        options.inTempStorage = bArr;
        ui.b bVar2 = (ui.b) hVar.c(f59847f);
        ui.i iVar = (ui.i) hVar.c(f59848g);
        l lVar = (l) hVar.c(l.f59842f);
        boolean zBooleanValue = ((Boolean) hVar.c(f59849h)).booleanValue();
        ui.g<Boolean> gVar = f59850i;
        try {
            e eVarC = e.c(b(uVar, options, lVar, bVar2, iVar, hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue(), i14, i15, zBooleanValue, bVar), this.f59855a);
            e(options);
            synchronized (arrayDeque) {
                arrayDeque.offer(options);
            }
            return eVarC;
        } finally {
            e(options);
            ArrayDeque arrayDeque2 = f59854m;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options);
                this.f59857c.put(bArr);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0206  */
    public final Bitmap b(u uVar, BitmapFactory.Options options, l lVar, ui.b bVar, ui.i iVar, boolean z14, int i14, int i15, boolean z15, b bVar2) {
        char c14;
        boolean z16;
        float f14;
        boolean z17;
        boolean zHasAlpha;
        boolean z18;
        int i16;
        Bitmap bitmap;
        ColorSpace colorSpace;
        Bitmap.Config config;
        int i17;
        int i18;
        int iFloor;
        int iFloor2;
        int i19 = qj.h.f144972a;
        SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        xi.d dVar = this.f59855a;
        c(uVar, options, bVar2, dVar);
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i24 = iArr[0];
        int i25 = iArr[1];
        boolean z19 = (i24 == -1 || i25 == -1) ? false : z14;
        int iD = uVar.d();
        switch (iD) {
            case 3:
            case 4:
                c14 = 180;
                break;
            case 5:
            case 6:
                c14 = 'Z';
                break;
            case 7:
            case 8:
                c14 = 270;
                break;
            default:
                c14 = 0;
                break;
        }
        switch (iD) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                z16 = true;
                break;
            default:
                z16 = false;
                break;
        }
        int i26 = i14;
        if (i26 == Integer.MIN_VALUE) {
            i26 = (c14 == 'Z' || c14 == 270) ? i25 : i24;
        }
        if (i15 == -2147483648) {
            i15 = (c14 == 'Z' || c14 == 270) ? i24 : i25;
        }
        ImageHeaderParser.ImageType imageType = uVar.getImageType();
        String str = "Downsampler";
        if (i24 <= 0 || i25 <= 0) {
            f14 = 1.0f;
            if (Log.isLoggable(str, 3)) {
                Objects.toString(imageType);
            }
        } else {
            f14 = 1.0f;
            if (c14 == 'Z' || c14 == 270) {
                i17 = i25;
                i18 = i24;
            } else {
                i18 = i25;
                i17 = i24;
            }
            float fB = lVar.b(i17, i18, i26, i15);
            if (fB <= 0.0f) {
                StringBuilder sb3 = new StringBuilder("Cannot scale with factor: ");
                sb3.append(fB);
                sb3.append(" from: ");
                sb3.append(lVar);
                sb3.append(", source: [");
                ds.e0.m(i24, i25, "x", "], target: [", sb3);
                vb.h.s(androidx.core.view.j.e(i26, i15, "x", "]", sb3));
                return null;
            }
            z19 = z19;
            l.g gVarA = lVar.a(i17, i18, i26, i15);
            if (gVarA == null) {
                vb.h.s("Cannot round with null rounding");
                return null;
            }
            float f15 = i17;
            int i27 = i17;
            float f16 = i18;
            int i28 = i27 / ((int) (((double) (fB * f15)) + 0.5d));
            int i29 = i18 / ((int) (((double) (fB * f16)) + 0.5d));
            l.g gVar = l.g.MEMORY;
            int iMax = Math.max(1, Integer.highestOneBit(gVarA == gVar ? Math.max(i28, i29) : Math.min(i28, i29)));
            if (gVarA == gVar && iMax < 1.0f / fB) {
                iMax <<= 1;
            }
            options.inSampleSize = iMax;
            if (imageType == ImageHeaderParser.ImageType.JPEG) {
                float fMin = Math.min(iMax, 8);
                iFloor = (int) Math.ceil(f15 / fMin);
                iFloor2 = (int) Math.ceil(f16 / fMin);
                int i30 = iMax / 8;
                if (i30 > 0) {
                    iFloor /= i30;
                    iFloor2 /= i30;
                }
            } else if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
                float f17 = iMax;
                iFloor = (int) Math.floor(f15 / f17);
                iFloor2 = (int) Math.floor(f16 / f17);
            } else if (imageType.isWebp()) {
                float f18 = iMax;
                iFloor = Math.round(f15 / f18);
                iFloor2 = Math.round(f16 / f18);
            } else if (i27 % iMax == 0 && i18 % iMax == 0) {
                iFloor = i27 / iMax;
                iFloor2 = i18 / iMax;
            } else {
                options.inJustDecodeBounds = true;
                c(uVar, options, bVar2, dVar);
                options.inJustDecodeBounds = false;
                int[] iArr2 = {options.outWidth, options.outHeight};
                iFloor = iArr2[0];
                iFloor2 = iArr2[1];
            }
            double dB = lVar.b(iFloor, iFloor2, i26, i15);
            int iRound = (int) Math.round((dB <= 1.0d ? dB : 1.0d / dB) * 2.147483647E9d);
            int i34 = (int) ((((double) iRound) * dB) + 0.5d);
            options.inTargetDensity = (int) (((dB / ((double) (i34 / iRound))) * ((double) i34)) + 0.5d);
            int iRound2 = (int) Math.round((dB <= 1.0d ? dB : 1.0d / dB) * 2.147483647E9d);
            options.inDensity = iRound2;
            int i35 = options.inTargetDensity;
            if (i35 <= 0 || iRound2 <= 0 || i35 == iRound2) {
                options.inTargetDensity = 0;
                options.inDensity = 0;
            } else {
                options.inScaled = true;
            }
            str = "Downsampler";
        }
        boolean zC = this.f59859e.c(i26, i15, z19, z16);
        if (zC) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            z17 = false;
            options.inMutable = false;
        } else {
            z17 = false;
        }
        if (zC) {
            z18 = true;
        } else if (bVar != ui.b.PREFER_ARGB_8888) {
            try {
                zHasAlpha = uVar.getImageType().hasAlpha();
            } catch (IOException unused) {
                if (Log.isLoggable(str, 3)) {
                    Objects.toString(bVar);
                }
                zHasAlpha = z17;
            }
            Bitmap.Config config2 = zHasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
            options.inPreferredConfig = config2;
            if (config2 == Bitmap.Config.RGB_565) {
                z18 = true;
                options.inDither = true;
            } else {
                z18 = true;
            }
        } else {
            z18 = true;
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        }
        if (i24 < 0 || i25 < 0 || !z15) {
            int i36 = options.inTargetDensity;
            float f19 = (i36 <= 0 || (i16 = options.inDensity) <= 0 || i36 == i16) ? z17 : z18 ? i36 / options.inDensity : f14;
            float f22 = options.inSampleSize;
            int iCeil = (int) Math.ceil(i24 / f22);
            int iCeil2 = (int) Math.ceil(i25 / f22);
            int iRound3 = Math.round(iCeil * f19);
            i15 = Math.round(iCeil2 * f19);
            i26 = iRound3;
        }
        if (i26 > 0 && i15 > 0 && (config = options.inPreferredConfig) != Bitmap.Config.HARDWARE) {
            Bitmap.Config config3 = options.outConfig;
            if (config3 != null) {
                config = config3;
            }
            options.inBitmap = dVar.d(i26, i15, config);
        }
        if (iVar != null) {
            options.inPreferredColorSpace = ColorSpace.get((iVar != ui.i.DISPLAY_P3 || (colorSpace = options.outColorSpace) == null || !colorSpace.isWideGamut()) ? z17 : z18 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
        }
        Bitmap bitmapC = c(uVar, options, bVar2, dVar);
        bVar2.a(bitmapC, dVar);
        if (Log.isLoggable(str, 2)) {
            d(bitmapC);
            d(options.inBitmap);
            Thread.currentThread().getName();
            SystemClock.elapsedRealtimeNanos();
        }
        if (bitmapC == null) {
            return null;
        }
        bitmapC.setDensity(this.f59856b.densityDpi);
        switch (iD) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                Matrix matrix = new Matrix();
                switch (iD) {
                    case 2:
                        matrix.setScale(-1.0f, f14);
                        break;
                    case 3:
                        matrix.setRotate(180.0f);
                        break;
                    case 4:
                        matrix.setRotate(180.0f);
                        matrix.postScale(-1.0f, f14);
                        break;
                    case 5:
                        matrix.setRotate(90.0f);
                        matrix.postScale(-1.0f, f14);
                        break;
                    case 6:
                        matrix.setRotate(90.0f);
                        break;
                    case 7:
                        matrix.setRotate(-90.0f);
                        matrix.postScale(-1.0f, f14);
                        break;
                    case 8:
                        matrix.setRotate(-90.0f);
                        break;
                }
                bitmapC = Bitmap.createBitmap(bitmapC, 0, 0, bitmapC.getWidth(), bitmapC.getHeight(), matrix, true);
                bitmap = bitmapC;
                break;
            default:
                bitmap = bitmapC;
                break;
        }
        if (!bitmap.equals(bitmapC)) {
            dVar.c(bitmap);
        }
        return bitmapC;
    }
}
