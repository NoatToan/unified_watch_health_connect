package com.xiaomi.hm.health.bodyfat.view.popupmenu;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes19.dex */
public class TriangleDrawable extends Drawable {
    public static final int BOTTOM = 13;
    public static final int LEFT = 14;
    public static final int RIGHT = 15;
    public static final int TOP = 12;
    private int a;
    private int b;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ARROWDIRECTION {
    }

    public TriangleDrawable(int i, int i2) {
        this.a = -1;
        this.b = i;
        this.a = i2;
    }

    private Path a() {
        Rect bounds = getBounds();
        Path path = new Path();
        int i = this.b;
        if (i == 12) {
            path.moveTo(bounds.right / 2, 0.0f);
            path.lineTo(0.0f, bounds.bottom);
            path.lineTo(bounds.right, bounds.bottom);
            path.close();
        } else if (i == 13) {
            path.moveTo(bounds.right / 2, bounds.bottom);
            path.lineTo(0.0f, 0.0f);
            path.lineTo(bounds.right, 0.0f);
            path.close();
        } else if (i == 14) {
            path.moveTo(0.0f, bounds.bottom / 2);
            path.lineTo(bounds.right, 0.0f);
            path.lineTo(bounds.right, bounds.bottom);
            path.close();
        } else {
            path.moveTo(bounds.right, bounds.bottom / 2);
            path.lineTo(0.0f, 0.0f);
            path.lineTo(0.0f, bounds.bottom);
            path.close();
        }
        return path;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(this.a);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawPath(a(), paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = 255) int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}
