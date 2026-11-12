package com.huawei.watchface;

import android.graphics.Bitmap;
import androidx.core.view.MotionEventCompat;
import com.huawei.watchface.utils.HwLog;
import huawei.android.hwcolorpicker.HwColorPicker;

/* JADX INFO: loaded from: classes20.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f30534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30536c;
    public int d;
    public int e;
    public float[] f;
    public float[] g;
    public float[] h;
    public float[] i;

    public p(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        this.f30535b = bitmap.getWidth();
        int height = bitmap.getHeight();
        this.f30536c = height;
        this.f30534a = new int[this.f30535b * height];
        HwLog.i("AreaAveragingUtil", "AreaAveragingUtil() bitmap : { mSrcWidth：" + this.f30535b + ", mSrcHeight:" + this.f30536c + "}");
        int[] iArr = this.f30534a;
        int i = this.f30535b;
        bitmap.getPixels(iArr, 0, i, 0, 0, i, this.f30536c);
    }

    public final void a(int i, int i2, int i3, Bitmap bitmap) {
        int i4 = this.e;
        int i5 = i;
        int i6 = 0;
        int i7 = 0;
        while (i5 < i + i3) {
            float fA = 0.0f;
            if (i6 == 0) {
                for (int i8 = 0; i8 < this.d; i8++) {
                    if (i8 < this.f30535b) {
                        this.f[i8] = 0.0f;
                        this.g[i8] = 0.0f;
                        this.h[i8] = 0.0f;
                        this.i[i8] = 0.0f;
                    }
                }
                i6 = this.f30536c;
            }
            int i9 = i4 < i6 ? i4 : i6;
            float fC = 0.0f;
            float fB = 0.0f;
            int i10 = this.f30535b;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            float fD = 0.0f;
            while (i11 < i2) {
                if (i12 == 0) {
                    i12 = this.d;
                    fA = a(i11, i5);
                    fD = d(i11, i5);
                    fC = c(i11, i5);
                    fB = b(i11, i5);
                    if (fA != 255.0f) {
                        float f = fA / 255.0f;
                        fD *= f;
                        fC *= f;
                        fB *= f;
                    }
                }
                int i14 = i7;
                int i15 = i12 < i10 ? i12 : i10;
                float f2 = i9 * i15;
                float[] fArr = this.f;
                fArr[i13] = fArr[i13] + (f2 * fA);
                float[] fArr2 = this.g;
                fArr2[i13] = fArr2[i13] + (f2 * fD);
                float[] fArr3 = this.h;
                fArr3[i13] = fArr3[i13] + (f2 * fC);
                float[] fArr4 = this.i;
                fArr4[i13] = fArr4[i13] + (f2 * fB);
                i12 -= i15;
                if (i12 == 0) {
                    i11++;
                }
                i10 -= i15;
                if (i10 == 0) {
                    i13++;
                    i10 = this.f30535b;
                }
                i7 = i14;
            }
            int i16 = i7;
            i6 -= i9;
            if (i6 == 0) {
                i7 = i16;
                do {
                    a(i7, bitmap);
                    i7++;
                    i4 -= i9;
                    if (i4 < i9) {
                        break;
                    }
                } while (i9 == this.f30536c);
            } else {
                i4 -= i9;
                i7 = i16;
            }
            if (i4 == 0) {
                i4 = this.e;
                i5++;
            }
        }
    }

    public final int b(int i, int i2) {
        return this.f30534a[(i2 * this.f30535b) + i] & 255;
    }

    public final int c(int i, int i2) {
        return (this.f30534a[(i2 * this.f30535b) + i] & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >>> 8;
    }

    public final int d(int i, int i2) {
        return (this.f30534a[(i2 * this.f30535b) + i] & HwColorPicker.MASK_RESULT_STATE) >>> 16;
    }

    public Bitmap e(int i, int i2) {
        this.d = i;
        this.e = i2;
        int i3 = this.f30535b;
        this.g = new float[i3];
        this.h = new float[i3];
        this.i = new float[i3];
        this.f = new float[i3];
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        a(0, this.f30535b, this.f30536c, bitmapCreateBitmap);
        HwLog.i("AreaAveragingUtil", "getScaledBitmap() bitmap : {width:" + i + ", height:" + i2 + "}");
        return bitmapCreateBitmap;
    }

    public final void a(int i, Bitmap bitmap) {
        float f;
        float f2 = this.f30535b * this.f30536c;
        for (int i2 = 0; i2 < this.f30535b; i2++) {
            int iRound = Math.round(this.f[i2] / f2);
            int i3 = 255;
            if (iRound <= 0) {
                f = f2;
                iRound = 0;
            } else if (iRound >= 255) {
                f = f2;
                iRound = 255;
            } else {
                f = this.f[i2] / 255.0f;
            }
            int iRound2 = Math.round(this.g[i2] / f);
            if (iRound2 < 0) {
                iRound2 = 0;
            }
            if (iRound2 > 255) {
                iRound2 = 255;
            }
            int iRound3 = Math.round(this.h[i2] / f);
            if (iRound3 < 0) {
                iRound3 = 0;
            }
            if (iRound3 > 255) {
                iRound3 = 255;
            }
            int iRound4 = Math.round(this.i[i2] / f);
            if (iRound4 < 0) {
                iRound4 = 0;
            }
            if (iRound4 <= 255) {
                i3 = iRound4;
            }
            a(bitmap, i2, i, (iRound << 24) + (iRound2 << 16) + (iRound3 << 8) + i3);
        }
    }

    public final void a(Bitmap bitmap, int i, int i2, int i3) {
        this.f30534a[(this.f30535b * i2) + i] = i3;
        if (i >= this.d || i2 >= this.e) {
            return;
        }
        bitmap.setPixel(i, i2, i3);
    }

    public final int a(int i, int i2) {
        return (this.f30534a[(i2 * this.f30535b) + i] & (-16777216)) >>> 24;
    }
}
