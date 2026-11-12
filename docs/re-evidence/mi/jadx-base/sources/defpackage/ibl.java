package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
public class ibl extends m1a {
    public rbl.b e;
    public Object f;
    public PointF g;
    public int h;
    public int i;
    public Matrix j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Matrix f20980k;

    public ibl(Drawable drawable, rbl.b bVar) {
        super((Drawable) b6i.g(drawable));
        this.g = null;
        this.h = 0;
        this.i = 0;
        this.f20980k = new Matrix();
        this.e = bVar;
    }

    private void q() {
        rbl.b bVar = this.e;
        boolean z = false;
        if (bVar instanceof rbl.l) {
            Object state = ((rbl.l) bVar).getState();
            z = state == null || !state.equals(this.f);
            this.f = state;
        }
        if (this.h == getCurrent().getIntrinsicWidth() && this.i == getCurrent().getIntrinsicHeight() && !z) {
            return;
        }
        p();
    }

    @Override // defpackage.m1a, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        q();
        if (this.j == null) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipRect(getBounds());
        canvas.concat(this.j);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // defpackage.m1a, defpackage.byp
    public void g(Matrix matrix) {
        m(matrix);
        q();
        Matrix matrix2 = this.j;
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
        p();
    }

    public void p() {
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.h = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.i = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.j = null;
            return;
        }
        if (intrinsicWidth == iWidth && intrinsicHeight == iHeight) {
            current.setBounds(bounds);
            this.j = null;
        } else {
            if (this.e == rbl.b.f32389a) {
                current.setBounds(bounds);
                this.j = null;
                return;
            }
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            rbl.b bVar = this.e;
            Matrix matrix = this.f20980k;
            PointF pointF = this.g;
            bVar.a(matrix, bounds, intrinsicWidth, intrinsicHeight, pointF != null ? pointF.x : 0.5f, pointF != null ? pointF.y : 0.5f);
            this.j = this.f20980k;
        }
    }

    public rbl.b r() {
        return this.e;
    }

    public void s(PointF pointF) {
        if (i4h.a(this.g, pointF)) {
            return;
        }
        if (this.g == null) {
            this.g = new PointF();
        }
        this.g.set(pointF);
        p();
        invalidateSelf();
    }

    public void t(rbl.b bVar) {
        if (i4h.a(this.e, bVar)) {
            return;
        }
        this.e = bVar;
        this.f = null;
        p();
        invalidateSelf();
    }
}
