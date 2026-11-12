package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;
import androidx.collection.ScatterMapKt;

/* JADX INFO: loaded from: classes7.dex */
public class kxk extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Paint f24396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bitmap f24397b;
    public int c;
    public int d;

    public kxk(int i, int i2, int i3) {
        Paint paint = new Paint();
        this.f24396a = paint;
        paint.setAntiAlias(true);
        this.f24396a.setColor(i);
        this.c = i2;
        this.d = i3;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f24397b != null) {
            canvas.drawRoundRect(new RectF(0.0f, 0.0f, this.f24397b.getWidth(), this.f24397b.getHeight()), 100.0f, 100.0f, this.f24396a);
            return;
        }
        int i = this.c;
        RectF rectF = new RectF(0.0f, 0.0f, i, i);
        int i2 = this.d;
        canvas.drawRoundRect(rectF, i2, i2, this.f24396a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Bitmap bitmap = this.f24397b;
        return bitmap != null ? bitmap.getHeight() : this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Bitmap bitmap = this.f24397b;
        return bitmap != null ? bitmap.getWidth() : this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = ScatterMapKt.Sentinel) int i) {
        this.f24396a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f24396a.setColorFilter(colorFilter);
    }
}
