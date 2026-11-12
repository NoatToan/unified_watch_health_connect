package com.github.mikephil.charting.utils;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import defpackage.fmq;

/* JADX INFO: loaded from: classes4.dex */
public class Fill {
    public Drawable d;
    public int[] e;
    public float[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Type f7808a = Type.EMPTY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f7809b = null;
    public Integer c = null;
    public int g = 255;

    public enum Direction {
        DOWN,
        UP,
        RIGHT,
        LEFT
    }

    public enum Type {
        EMPTY,
        COLOR,
        LINEAR_GRADIENT,
        DRAWABLE
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7810a;

        static {
            int[] iArr = new int[Type.values().length];
            f7810a = iArr;
            try {
                iArr[Type.EMPTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7810a[Type.COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7810a[Type.LINEAR_GRADIENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7810a[Type.DRAWABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public void a(Canvas canvas, Paint paint, float f, float f2, float f3, float f4, Direction direction) {
        float f5;
        float f6;
        Drawable drawable;
        int i = a.f7810a[this.f7808a.ordinal()];
        if (i == 2) {
            if (this.c == null) {
                return;
            }
            if (b()) {
                int iSave = canvas.save();
                canvas.clipRect(f, f2, f3, f4);
                canvas.drawColor(this.c.intValue());
                canvas.restoreToCount(iSave);
                return;
            }
            Paint.Style style = paint.getStyle();
            int color = paint.getColor();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.c.intValue());
            canvas.drawRect(f, f2, f3, f4, paint);
            paint.setColor(color);
            paint.setStyle(style);
            return;
        }
        if (i != 3) {
            if (i == 4 && (drawable = this.d) != null) {
                drawable.setBounds((int) f, (int) f2, (int) f3, (int) f4);
                this.d.draw(canvas);
                return;
            }
            return;
        }
        if (this.e == null) {
            return;
        }
        Direction direction2 = Direction.RIGHT;
        if (direction == direction2) {
            f5 = f3;
        } else {
            Direction direction3 = Direction.DOWN;
            f5 = f;
        }
        float f7 = (int) f5;
        Direction direction4 = Direction.UP;
        if (direction == direction4) {
            f6 = f4;
        } else {
            Direction direction5 = Direction.DOWN;
            f6 = f2;
        }
        paint.setShader(new LinearGradient(f7, (int) f6, (int) ((direction != direction2 && direction == Direction.LEFT) ? f3 : f), (int) ((direction != direction4 && direction == Direction.DOWN) ? f4 : f2), this.e, this.f, Shader.TileMode.MIRROR));
        canvas.drawRect(f, f2, f3, f4, paint);
    }

    public final boolean b() {
        return fmq.s() >= 18;
    }
}
