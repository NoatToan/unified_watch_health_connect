package com.huami.homepage.promotion.util;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes10.dex */
public class RoundedCornersTransformation extends BitmapTransformation {
    private static final int e = 1;
    private static final String f = "jp.wasabeef.glide.transformations.RoundedCornersTransformation.1";
    private int a;
    private int b;
    private int c;
    private CornerType d;

    public enum CornerType {
        ALL,
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT,
        OTHER_TOP_LEFT,
        OTHER_TOP_RIGHT,
        OTHER_BOTTOM_LEFT,
        OTHER_BOTTOM_RIGHT,
        DIAGONAL_FROM_TOP_LEFT,
        DIAGONAL_FROM_TOP_RIGHT
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CornerType.values().length];
            a = iArr;
            try {
                iArr[CornerType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[CornerType.TOP_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[CornerType.TOP_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[CornerType.BOTTOM_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[CornerType.BOTTOM_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[CornerType.TOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[CornerType.BOTTOM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[CornerType.LEFT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[CornerType.RIGHT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[CornerType.OTHER_TOP_LEFT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[CornerType.OTHER_TOP_RIGHT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[CornerType.OTHER_BOTTOM_LEFT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[CornerType.OTHER_BOTTOM_RIGHT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[CornerType.DIAGONAL_FROM_TOP_LEFT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[CornerType.DIAGONAL_FROM_TOP_RIGHT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public RoundedCornersTransformation(int i, int i2) {
        this(i, i2, CornerType.ALL);
    }

    private void a(Canvas canvas, Paint paint, float f2, float f3) {
        int i = this.c;
        int i2 = this.b;
        RectF rectF = new RectF(i, f3 - i2, i + i2, f3);
        int i3 = this.a;
        canvas.drawRoundRect(rectF, i3, i3, paint);
        int i4 = this.c;
        canvas.drawRect(new RectF(i4, i4, i4 + this.b, f3 - this.a), paint);
        int i5 = this.c;
        canvas.drawRect(new RectF(this.a + i5, i5, f2, f3), paint);
    }

    private void b(Canvas canvas, Paint paint, float f2, float f3) {
        int i = this.b;
        RectF rectF = new RectF(f2 - i, f3 - i, f2, f3);
        int i2 = this.a;
        canvas.drawRoundRect(rectF, i2, i2, paint);
        int i3 = this.c;
        canvas.drawRect(new RectF(i3, i3, f2 - this.a, f3), paint);
        int i4 = this.a;
        canvas.drawRect(new RectF(f2 - i4, this.c, f2, f3 - i4), paint);
    }

    private void c(Canvas canvas, Paint paint, float f2, float f3) {
        RectF rectF = new RectF(this.c, f3 - this.b, f2, f3);
        int i = this.a;
        canvas.drawRoundRect(rectF, i, i, paint);
        int i2 = this.c;
        canvas.drawRect(new RectF(i2, i2, f2, f3 - this.a), paint);
    }

    private void d(Canvas canvas, Paint paint, float f2, float f3) {
        int i = this.c;
        int i2 = this.b;
        RectF rectF = new RectF(i, i, i + i2, i + i2);
        int i3 = this.a;
        canvas.drawRoundRect(rectF, i3, i3, paint);
        int i4 = this.b;
        RectF rectF2 = new RectF(f2 - i4, f3 - i4, f2, f3);
        int i5 = this.a;
        canvas.drawRoundRect(rectF2, i5, i5, paint);
        int i6 = this.c;
        canvas.drawRect(new RectF(i6, i6 + this.a, f2 - this.b, f3), paint);
        int i7 = this.c;
        canvas.drawRect(new RectF(this.b + i7, i7, f2, f3 - this.a), paint);
    }

    private void e(Canvas canvas, Paint paint, float f2, float f3) {
        int i = this.b;
        int i2 = this.c;
        RectF rectF = new RectF(f2 - i, i2, f2, i2 + i);
        int i3 = this.a;
        canvas.drawRoundRect(rectF, i3, i3, paint);
        int i4 = this.c;
        int i5 = this.b;
        RectF rectF2 = new RectF(i4, f3 - i5, i4 + i5, f3);
        int i6 = this.a;
        canvas.drawRoundRect(rectF2, i6, i6, paint);
        int i7 = this.c;
        int i8 = this.a;
        canvas.drawRect(new RectF(i7, i7, f2 - i8, f3 - i8), paint);
        int i9 = this.c;
        int i10 = this.a;
        canvas.drawRect(new RectF(i9 + i10, i9 + i10, f2, f3), paint);
    }

    private void f(Canvas canvas, Paint paint, float f2, float f3) {
        int i = this.c;
        RectF rectF = new RectF(i, i, i + this.b, f3);
        int i2 = this.a;
        canvas.drawRoundRect(rectF, i2, i2, paint);
        int i3 = this.c;
        canvas.drawRect(new RectF(this.a + i3, i3, f2, f3), paint);
    }

    private void g(Canvas canvas, Paint paint, float f2, float f3) {
        int i = this.c;
        RectF rectF = new RectF(i, i, f2, i + this.b);
        int i2 = this.a;
        canvas.drawRoundRect(rectF, i2, i2, paint);
        RectF rectF2 = new RectF(f2 - this.b, this.c, f2, f3);
        int i3 = this.a;
        canvas.drawRoundRect(rectF2, i3, i3, paint);
        int i4 = this.c;
        int i5 = this.a;
        canvas.drawRect(new RectF(i4, i4 + i5, f2 - i5, f3), paint);
    }

    private void h(Canvas canvas, Paint paint, float f2, float f3) {
        int i = this.c;
        RectF rectF = new RectF(i, i, f2, i + this.b);
        int i2 = this.a;
        canvas.drawRoundRect(rectF, i2, i2, paint);
        int i3 = this.c;
        RectF rectF2 = new RectF(i3, i3, i3 + this.b, f3);
        int i4 = this.a;
        canvas.drawRoundRect(rectF2, i4, i4, paint);
        int i5 = this.c;
        int i6 = this.a;
        canvas.drawRect(new RectF(i5 + i6, i5 + i6, f2, f3), paint);
    }

    private void i(Canvas canvas, Paint paint, float f2, float f3) {
        RectF rectF = new RectF(this.c, f3 - this.b, f2, f3);
        int i = this.a;
        canvas.drawRoundRect(rectF, i, i, paint);
        RectF rectF2 = new RectF(f2 - this.b, this.c, f2, f3);
        int i2 = this.a;
        canvas.drawRoundRect(rectF2, i2, i2, paint);
        int i3 = this.c;
        int i4 = this.a;
        canvas.drawRect(new RectF(i3, i3, f2 - i4, f3 - i4), paint);
    }

    private void j(Canvas canvas, Paint paint, float f2, float f3) {
        int i = this.c;
        RectF rectF = new RectF(i, i, i + this.b, f3);
        int i2 = this.a;
        canvas.drawRoundRect(rectF, i2, i2, paint);
        RectF rectF2 = new RectF(this.c, f3 - this.b, f2, f3);
        int i3 = this.a;
        canvas.drawRoundRect(rectF2, i3, i3, paint);
        int i4 = this.c;
        int i5 = this.a;
        canvas.drawRect(new RectF(i4 + i5, i4, f2, f3 - i5), paint);
    }

    private void k(Canvas canvas, Paint paint, float f2, float f3) {
        RectF rectF = new RectF(f2 - this.b, this.c, f2, f3);
        int i = this.a;
        canvas.drawRoundRect(rectF, i, i, paint);
        int i2 = this.c;
        canvas.drawRect(new RectF(i2, i2, f2 - this.a, f3), paint);
    }

    private void l(Canvas canvas, Paint paint, float f2, float f3) {
        int i = this.c;
        float f4 = f2 - i;
        float f5 = f3 - i;
        switch (a.a[this.d.ordinal()]) {
            case 1:
                int i2 = this.c;
                RectF rectF = new RectF(i2, i2, f4, f5);
                int i3 = this.a;
                canvas.drawRoundRect(rectF, i3, i3, paint);
                break;
            case 2:
                m(canvas, paint, f4, f5);
                break;
            case 3:
                n(canvas, paint, f4, f5);
                break;
            case 4:
                a(canvas, paint, f4, f5);
                break;
            case 5:
                b(canvas, paint, f4, f5);
                break;
            case 6:
                o(canvas, paint, f4, f5);
                break;
            case 7:
                c(canvas, paint, f4, f5);
                break;
            case 8:
                f(canvas, paint, f4, f5);
                break;
            case 9:
                k(canvas, paint, f4, f5);
                break;
            case 10:
                i(canvas, paint, f4, f5);
                break;
            case 11:
                j(canvas, paint, f4, f5);
                break;
            case 12:
                g(canvas, paint, f4, f5);
                break;
            case 13:
                h(canvas, paint, f4, f5);
                break;
            case 14:
                d(canvas, paint, f4, f5);
                break;
            case 15:
                e(canvas, paint, f4, f5);
                break;
            default:
                int i4 = this.c;
                RectF rectF2 = new RectF(i4, i4, f4, f5);
                int i5 = this.a;
                canvas.drawRoundRect(rectF2, i5, i5, paint);
                break;
        }
    }

    private void m(Canvas canvas, Paint paint, float f2, float f3) {
        int i = this.c;
        int i2 = this.b;
        RectF rectF = new RectF(i, i, i + i2, i + i2);
        int i3 = this.a;
        canvas.drawRoundRect(rectF, i3, i3, paint);
        int i4 = this.c;
        int i5 = this.a;
        canvas.drawRect(new RectF(i4, i4 + i5, i4 + i5, f3), paint);
        int i6 = this.c;
        canvas.drawRect(new RectF(this.a + i6, i6, f2, f3), paint);
    }

    private void n(Canvas canvas, Paint paint, float f2, float f3) {
        int i = this.b;
        int i2 = this.c;
        RectF rectF = new RectF(f2 - i, i2, f2, i2 + i);
        int i3 = this.a;
        canvas.drawRoundRect(rectF, i3, i3, paint);
        int i4 = this.c;
        canvas.drawRect(new RectF(i4, i4, f2 - this.a, f3), paint);
        int i5 = this.a;
        canvas.drawRect(new RectF(f2 - i5, this.c + i5, f2, f3), paint);
    }

    private void o(Canvas canvas, Paint paint, float f2, float f3) {
        int i = this.c;
        RectF rectF = new RectF(i, i, f2, i + this.b);
        int i2 = this.a;
        canvas.drawRoundRect(rectF, i2, i2, paint);
        int i3 = this.c;
        canvas.drawRect(new RectF(i3, i3 + this.a, f2, f3), paint);
    }

    private void p(@NonNull Bitmap bitmap, @NonNull Bitmap bitmap2) {
        bitmap2.setDensity(bitmap.getDensity());
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (obj instanceof RoundedCornersTransformation) {
            RoundedCornersTransformation roundedCornersTransformation = (RoundedCornersTransformation) obj;
            if (roundedCornersTransformation.a == this.a && roundedCornersTransformation.b == this.b && roundedCornersTransformation.c == this.c && roundedCornersTransformation.d == this.d) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return 425235636 + (this.a * 10000) + (this.b * 1000) + (this.c * 100) + (this.d.ordinal() * 10);
    }

    @NonNull
    public String toString() {
        return "RoundedTransformation(radius=" + this.a + ", margin=" + this.c + ", diameter=" + this.b + ", cornerType=" + this.d.name() + ")";
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    public Bitmap transform(@NonNull BitmapPool bitmapPool, @NonNull Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap bitmap2 = bitmapPool.get(width, height, Bitmap.Config.ARGB_8888);
        bitmap2.setHasAlpha(true);
        p(bitmap, bitmap2);
        Canvas canvas = new Canvas(bitmap2);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        l(canvas, paint, width, height);
        return bitmap2;
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update((f + this.a + this.b + this.c + this.d).getBytes(Key.CHARSET));
    }

    public RoundedCornersTransformation(int i, int i2, CornerType cornerType) {
        this.a = i;
        this.b = i * 2;
        this.c = i2;
        this.d = cornerType;
    }
}
