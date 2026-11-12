package com.xiaomi.hm.health.utils;

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

/* JADX INFO: loaded from: classes22.dex */
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

    public RoundedCornersTransformation(int radius, int margin) {
        this(radius, margin, CornerType.ALL);
    }

    private void a(Canvas canvas, Paint paint, float right, float bottom) {
        int i = this.c;
        int i2 = this.b;
        RectF rectF = new RectF(i, bottom - i2, i + i2, bottom);
        int i3 = this.a;
        canvas.drawRoundRect(rectF, i3, i3, paint);
        int i4 = this.c;
        canvas.drawRect(new RectF(i4, i4, i4 + this.b, bottom - this.a), paint);
        int i5 = this.c;
        canvas.drawRect(new RectF(this.a + i5, i5, right, bottom), paint);
    }

    private void b(Canvas canvas, Paint paint, float right, float bottom) {
        int i = this.b;
        RectF rectF = new RectF(right - i, bottom - i, right, bottom);
        int i2 = this.a;
        canvas.drawRoundRect(rectF, i2, i2, paint);
        int i3 = this.c;
        canvas.drawRect(new RectF(i3, i3, right - this.a, bottom), paint);
        int i4 = this.a;
        canvas.drawRect(new RectF(right - i4, this.c, right, bottom - i4), paint);
    }

    private void c(Canvas canvas, Paint paint, float right, float bottom) {
        RectF rectF = new RectF(this.c, bottom - this.b, right, bottom);
        int i = this.a;
        canvas.drawRoundRect(rectF, i, i, paint);
        int i2 = this.c;
        canvas.drawRect(new RectF(i2, i2, right, bottom - this.a), paint);
    }

    private void d(Canvas canvas, Paint paint, float right, float bottom) {
        int i = this.c;
        int i2 = this.b;
        RectF rectF = new RectF(i, i, i + i2, i + i2);
        int i3 = this.a;
        canvas.drawRoundRect(rectF, i3, i3, paint);
        int i4 = this.b;
        RectF rectF2 = new RectF(right - i4, bottom - i4, right, bottom);
        int i5 = this.a;
        canvas.drawRoundRect(rectF2, i5, i5, paint);
        int i6 = this.c;
        canvas.drawRect(new RectF(i6, i6 + this.a, right - this.b, bottom), paint);
        int i7 = this.c;
        canvas.drawRect(new RectF(this.b + i7, i7, right, bottom - this.a), paint);
    }

    private void e(Canvas canvas, Paint paint, float right, float bottom) {
        int i = this.b;
        int i2 = this.c;
        RectF rectF = new RectF(right - i, i2, right, i2 + i);
        int i3 = this.a;
        canvas.drawRoundRect(rectF, i3, i3, paint);
        int i4 = this.c;
        int i5 = this.b;
        RectF rectF2 = new RectF(i4, bottom - i5, i4 + i5, bottom);
        int i6 = this.a;
        canvas.drawRoundRect(rectF2, i6, i6, paint);
        int i7 = this.c;
        int i8 = this.a;
        canvas.drawRect(new RectF(i7, i7, right - i8, bottom - i8), paint);
        int i9 = this.c;
        int i10 = this.a;
        canvas.drawRect(new RectF(i9 + i10, i9 + i10, right, bottom), paint);
    }

    private void f(Canvas canvas, Paint paint, float right, float bottom) {
        int i = this.c;
        RectF rectF = new RectF(i, i, i + this.b, bottom);
        int i2 = this.a;
        canvas.drawRoundRect(rectF, i2, i2, paint);
        int i3 = this.c;
        canvas.drawRect(new RectF(this.a + i3, i3, right, bottom), paint);
    }

    private void g(Canvas canvas, Paint paint, float right, float bottom) {
        int i = this.c;
        RectF rectF = new RectF(i, i, right, i + this.b);
        int i2 = this.a;
        canvas.drawRoundRect(rectF, i2, i2, paint);
        RectF rectF2 = new RectF(right - this.b, this.c, right, bottom);
        int i3 = this.a;
        canvas.drawRoundRect(rectF2, i3, i3, paint);
        int i4 = this.c;
        int i5 = this.a;
        canvas.drawRect(new RectF(i4, i4 + i5, right - i5, bottom), paint);
    }

    private void h(Canvas canvas, Paint paint, float right, float bottom) {
        int i = this.c;
        RectF rectF = new RectF(i, i, right, i + this.b);
        int i2 = this.a;
        canvas.drawRoundRect(rectF, i2, i2, paint);
        int i3 = this.c;
        RectF rectF2 = new RectF(i3, i3, i3 + this.b, bottom);
        int i4 = this.a;
        canvas.drawRoundRect(rectF2, i4, i4, paint);
        int i5 = this.c;
        int i6 = this.a;
        canvas.drawRect(new RectF(i5 + i6, i5 + i6, right, bottom), paint);
    }

    private void i(Canvas canvas, Paint paint, float right, float bottom) {
        RectF rectF = new RectF(this.c, bottom - this.b, right, bottom);
        int i = this.a;
        canvas.drawRoundRect(rectF, i, i, paint);
        RectF rectF2 = new RectF(right - this.b, this.c, right, bottom);
        int i2 = this.a;
        canvas.drawRoundRect(rectF2, i2, i2, paint);
        int i3 = this.c;
        int i4 = this.a;
        canvas.drawRect(new RectF(i3, i3, right - i4, bottom - i4), paint);
    }

    private void j(Canvas canvas, Paint paint, float right, float bottom) {
        int i = this.c;
        RectF rectF = new RectF(i, i, i + this.b, bottom);
        int i2 = this.a;
        canvas.drawRoundRect(rectF, i2, i2, paint);
        RectF rectF2 = new RectF(this.c, bottom - this.b, right, bottom);
        int i3 = this.a;
        canvas.drawRoundRect(rectF2, i3, i3, paint);
        int i4 = this.c;
        int i5 = this.a;
        canvas.drawRect(new RectF(i4 + i5, i4, right, bottom - i5), paint);
    }

    private void k(Canvas canvas, Paint paint, float right, float bottom) {
        RectF rectF = new RectF(right - this.b, this.c, right, bottom);
        int i = this.a;
        canvas.drawRoundRect(rectF, i, i, paint);
        int i2 = this.c;
        canvas.drawRect(new RectF(i2, i2, right - this.a, bottom), paint);
    }

    private void l(Canvas canvas, Paint paint, float width, float height) {
        int i = this.c;
        float f2 = width - i;
        float f3 = height - i;
        switch (a.a[this.d.ordinal()]) {
            case 1:
                int i2 = this.c;
                RectF rectF = new RectF(i2, i2, f2, f3);
                int i3 = this.a;
                canvas.drawRoundRect(rectF, i3, i3, paint);
                break;
            case 2:
                m(canvas, paint, f2, f3);
                break;
            case 3:
                n(canvas, paint, f2, f3);
                break;
            case 4:
                a(canvas, paint, f2, f3);
                break;
            case 5:
                b(canvas, paint, f2, f3);
                break;
            case 6:
                o(canvas, paint, f2, f3);
                break;
            case 7:
                c(canvas, paint, f2, f3);
                break;
            case 8:
                f(canvas, paint, f2, f3);
                break;
            case 9:
                k(canvas, paint, f2, f3);
                break;
            case 10:
                i(canvas, paint, f2, f3);
                break;
            case 11:
                j(canvas, paint, f2, f3);
                break;
            case 12:
                g(canvas, paint, f2, f3);
                break;
            case 13:
                h(canvas, paint, f2, f3);
                break;
            case 14:
                d(canvas, paint, f2, f3);
                break;
            case 15:
                e(canvas, paint, f2, f3);
                break;
            default:
                int i4 = this.c;
                RectF rectF2 = new RectF(i4, i4, f2, f3);
                int i5 = this.a;
                canvas.drawRoundRect(rectF2, i5, i5, paint);
                break;
        }
    }

    private void m(Canvas canvas, Paint paint, float right, float bottom) {
        int i = this.c;
        int i2 = this.b;
        RectF rectF = new RectF(i, i, i + i2, i + i2);
        int i3 = this.a;
        canvas.drawRoundRect(rectF, i3, i3, paint);
        int i4 = this.c;
        int i5 = this.a;
        canvas.drawRect(new RectF(i4, i4 + i5, i4 + i5, bottom), paint);
        int i6 = this.c;
        canvas.drawRect(new RectF(this.a + i6, i6, right, bottom), paint);
    }

    private void n(Canvas canvas, Paint paint, float right, float bottom) {
        int i = this.b;
        int i2 = this.c;
        RectF rectF = new RectF(right - i, i2, right, i2 + i);
        int i3 = this.a;
        canvas.drawRoundRect(rectF, i3, i3, paint);
        int i4 = this.c;
        canvas.drawRect(new RectF(i4, i4, right - this.a, bottom), paint);
        int i5 = this.a;
        canvas.drawRect(new RectF(right - i5, this.c + i5, right, bottom), paint);
    }

    private void o(Canvas canvas, Paint paint, float right, float bottom) {
        int i = this.c;
        RectF rectF = new RectF(i, i, right, i + this.b);
        int i2 = this.a;
        canvas.drawRoundRect(rectF, i2, i2, paint);
        int i3 = this.c;
        canvas.drawRect(new RectF(i3, i3 + this.a, right, bottom), paint);
    }

    private void p(@NonNull Bitmap toTransform, @NonNull Bitmap canvasBitmap) {
        canvasBitmap.setDensity(toTransform.getDensity());
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object o) {
        if (o instanceof RoundedCornersTransformation) {
            RoundedCornersTransformation roundedCornersTransformation = (RoundedCornersTransformation) o;
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
    public Bitmap transform(@NonNull BitmapPool pool, @NonNull Bitmap toTransform, int outWidth, int outHeight) {
        int width = toTransform.getWidth();
        int height = toTransform.getHeight();
        Bitmap bitmap = pool.get(width, height, Bitmap.Config.ARGB_8888);
        bitmap.setHasAlpha(true);
        p(toTransform, bitmap);
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(toTransform, tileMode, tileMode));
        l(canvas, paint, width, height);
        return bitmap;
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update((f + this.a + this.b + this.c + this.d).getBytes(Key.CHARSET));
    }

    public RoundedCornersTransformation(int radius, int margin, CornerType cornerType) {
        this.a = radius;
        this.b = radius * 2;
        this.c = margin;
        this.d = cornerType;
    }
}
