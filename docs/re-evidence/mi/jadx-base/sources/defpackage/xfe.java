package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes7.dex */
public class xfe extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Paint f39066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Path f39067b;

    public xfe(Paint paint, Path path) {
        this.f39066a = paint;
        this.f39067b = path;
        setAlpha(102);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.drawPath(this.f39067b, this.f39066a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f39066a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f39066a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
