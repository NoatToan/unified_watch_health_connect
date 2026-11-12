package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
public class u8f extends m1a {
    public Matrix e;
    public Matrix f;
    public int g;
    public int h;

    private void p() {
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.g = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.h = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.f = null;
        } else {
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            this.f = this.e;
        }
    }

    @Override // defpackage.m1a, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        q();
        if (this.f == null) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipRect(getBounds());
        canvas.concat(this.f);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // defpackage.m1a, defpackage.byp
    public void g(Matrix matrix) {
        super.g(matrix);
        Matrix matrix2 = this.f;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    @Override // defpackage.m1a
    public Drawable n(Drawable drawable) {
        Drawable drawableN = super.n(drawable);
        p();
        return drawableN;
    }

    @Override // defpackage.m1a, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        p();
    }

    public final void q() {
        if (this.g == getCurrent().getIntrinsicWidth() && this.h == getCurrent().getIntrinsicHeight()) {
            return;
        }
        p();
    }
}
