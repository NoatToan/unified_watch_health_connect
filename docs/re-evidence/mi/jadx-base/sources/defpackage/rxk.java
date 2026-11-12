package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class rxk extends xxk {
    public final Paint D;
    public final Paint E;
    public final Bitmap F;
    public WeakReference<Bitmap> G;

    public rxk(Resources resources, Bitmap bitmap, Paint paint) {
        super(new BitmapDrawable(resources, bitmap));
        Paint paint2 = new Paint();
        this.D = paint2;
        Paint paint3 = new Paint(1);
        this.E = paint3;
        this.F = bitmap;
        if (paint != null) {
            paint2.set(paint);
        }
        paint2.setFlags(1);
        paint3.setStyle(Paint.Style.STROKE);
    }

    @Override // defpackage.xxk, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (epa.d()) {
            epa.a("RoundedBitmapDrawable#draw");
        }
        if (!g()) {
            super.draw(canvas);
            if (epa.d()) {
                epa.b();
                return;
            }
            return;
        }
        k();
        h();
        m();
        int iSave = canvas.save();
        canvas.concat(this.u);
        canvas.drawPath(this.e, this.D);
        float f = this.d;
        if (f > 0.0f) {
            this.E.setStrokeWidth(f);
            this.E.setColor(y47.c(this.g, this.D.getAlpha()));
            canvas.drawPath(this.h, this.E);
        }
        canvas.restoreToCount(iSave);
        if (epa.d()) {
            epa.b();
        }
    }

    @Override // defpackage.xxk
    public boolean g() {
        return super.g() && this.F != null;
    }

    public final void m() {
        WeakReference<Bitmap> weakReference = this.G;
        if (weakReference == null || weakReference.get() != this.F) {
            this.G = new WeakReference<>(this.F);
            Paint paint = this.D;
            Bitmap bitmap = this.F;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            this.f = true;
        }
        if (this.f) {
            this.D.getShader().setLocalMatrix(this.x);
            this.f = false;
        }
        this.D.setFilterBitmap(f());
    }

    @Override // defpackage.xxk, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        super.setAlpha(i);
        if (i != this.D.getAlpha()) {
            this.D.setAlpha(i);
            super.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // defpackage.xxk, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.D.setColorFilter(colorFilter);
    }
}
