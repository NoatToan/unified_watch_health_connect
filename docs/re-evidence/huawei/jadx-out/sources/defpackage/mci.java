package defpackage;

import android.graphics.Bitmap;
import androidx.core.view.MotionEventCompat;
import com.huawei.hwlogsmodel.LogUtil;
import huawei.android.hwcolorpicker.HwColorPicker;

/* JADX INFO: loaded from: classes10.dex */
public class mci {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float[] f41413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float[] f41415c;
    private int[] d;
    private int e;
    private float[] f;
    private int h;
    private float[] i;
    private int j;

    public mci(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        this.j = bitmap.getWidth();
        int height = bitmap.getHeight();
        this.h = height;
        int i = this.j;
        this.d = new int[height * i];
        LogUtil.a("AreaAveragingUtil", "bitmap : { mSrcWidth：", Integer.valueOf(i), ", mSrcHeight:", Integer.valueOf(height), "}");
        int[] iArr = this.d;
        int i2 = this.j;
        bitmap.getPixels(iArr, 0, i2, 0, 0, i2, this.h);
    }

    public Bitmap c(int i, int i2) {
        this.f41414b = i;
        this.e = i2;
        int i3 = this.j;
        this.i = new float[i3];
        this.f = new float[i3];
        this.f41415c = new float[i3];
        this.f41413a = new float[i3];
        if (i <= 0 || i2 <= 0) {
            LogUtil.j("AreaAveragingUtil", "getScaledBitmap, IllegalArgumentException: width and height must be > 0.");
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        d(0, this.j, this.h, bitmapCreateBitmap);
        LogUtil.a("AreaAveragingUtil", "bitmap : {width:", Integer.valueOf(i), ", height:", Integer.valueOf(i2), "}");
        return bitmapCreateBitmap;
    }

    private void d(int i, int i2, int i3, Bitmap bitmap) {
        int i4 = this.e;
        int i5 = i;
        int i6 = 0;
        int i7 = 0;
        while (i5 < i + i3) {
            if (i6 == 0) {
                for (int i8 = 0; i8 < this.f41414b; i8++) {
                    this.f41413a[i8] = 0.0f;
                    this.i[i8] = 0.0f;
                    this.f[i8] = 0.0f;
                    this.f41415c[i8] = 0.0f;
                }
                i6 = this.h;
            }
            int i9 = i4 < i6 ? i4 : i6;
            a(i2, i5, i9);
            i6 -= i9;
            if (i6 == 0) {
                do {
                    b(i7, bitmap);
                    i7++;
                    i4 -= i9;
                    if (i4 < i9) {
                        break;
                    }
                } while (i9 == this.h);
            } else {
                i4 -= i9;
            }
            if (i4 == 0) {
                i4 = this.e;
                i5++;
            }
        }
    }

    private void a(int i, int i2, int i3) {
        int i4 = this.j;
        int i5 = 0;
        int i6 = 0;
        float fE = 0.0f;
        float fB = 0.0f;
        float fD = 0.0f;
        float fA = 0.0f;
        int i7 = 0;
        while (i5 < i) {
            if (i7 == 0) {
                i7 = this.f41414b;
                fE = e(i5, i2);
                fB = b(i5, i2);
                fD = d(i5, i2);
                fA = a(i5, i2);
                if (fE != 255.0f) {
                    float f = fE / 255.0f;
                    fB *= f;
                    fD *= f;
                    fA *= f;
                }
            }
            int i8 = i7 < i4 ? i7 : i4;
            float f2 = i8 * i3;
            float[] fArr = this.f41413a;
            fArr[i6] = fArr[i6] + (f2 * fE);
            float[] fArr2 = this.i;
            fArr2[i6] = fArr2[i6] + (f2 * fB);
            float[] fArr3 = this.f;
            fArr3[i6] = fArr3[i6] + (f2 * fD);
            float[] fArr4 = this.f41415c;
            fArr4[i6] = fArr4[i6] + (f2 * fA);
            i7 -= i8;
            if (i7 == 0) {
                i5++;
            }
            i4 -= i8;
            if (i4 == 0) {
                i6++;
                i4 = this.j;
            }
        }
    }

    private void b(int i, Bitmap bitmap) {
        float f;
        float f2 = this.j * this.h;
        for (int i2 = 0; i2 < this.j; i2++) {
            int iRound = Math.round(this.f41413a[i2] / f2);
            int i3 = 255;
            if (iRound <= 0) {
                f = f2;
                iRound = 0;
            } else if (iRound >= 255) {
                f = f2;
                iRound = 255;
            } else {
                f = this.f41413a[i2] / 255.0f;
            }
            int iRound2 = Math.round(this.i[i2] / f);
            if (iRound2 < 0) {
                iRound2 = 0;
            }
            if (iRound2 > 255) {
                iRound2 = 255;
            }
            int iRound3 = Math.round(this.f[i2] / f);
            if (iRound3 < 0) {
                iRound3 = 0;
            }
            if (iRound3 > 255) {
                iRound3 = 255;
            }
            int iRound4 = Math.round(this.f41415c[i2] / f);
            if (iRound4 < 0) {
                iRound4 = 0;
            }
            if (iRound4 <= 255) {
                i3 = iRound4;
            }
            d(bitmap, i2, i, (iRound << 24) + (iRound2 << 16) + (iRound3 << 8) + i3);
        }
    }

    private void d(Bitmap bitmap, int i, int i2, int i3) {
        this.d[(this.j * i2) + i] = i3;
        if (i >= this.f41414b || i2 >= this.e) {
            return;
        }
        bitmap.setPixel(i, i2, i3);
    }

    private int e(int i, int i2) {
        return (this.d[(i2 * this.j) + i] & (-16777216)) >>> 24;
    }

    private int b(int i, int i2) {
        return (this.d[(i2 * this.j) + i] & HwColorPicker.MASK_RESULT_STATE) >>> 16;
    }

    private int d(int i, int i2) {
        return (this.d[(i2 * this.j) + i] & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >>> 8;
    }

    private int a(int i, int i2) {
        return this.d[(i2 * this.j) + i] & 255;
    }
}
