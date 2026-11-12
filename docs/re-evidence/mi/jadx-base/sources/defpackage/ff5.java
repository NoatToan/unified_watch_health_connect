package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes5.dex */
public class ff5 extends l8f {
    public final Paint y;
    public final RectF z;

    public ff5() {
        this(null);
    }

    public boolean q0() {
        return !this.z.isEmpty();
    }

    @Override // defpackage.l8f
    public void r(Canvas canvas) {
        if (this.z.isEmpty()) {
            super.r(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.z);
        super.r(canvas);
        canvas.restore();
    }

    public void r0() {
        s0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void s0(float f, float f2, float f3, float f4) {
        RectF rectF = this.z;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }

    public void t0(RectF rectF) {
        s0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void u0() {
        this.y.setStyle(Paint.Style.FILL_AND_STROKE);
        this.y.setColor(-1);
        this.y.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public ff5(r2m r2mVar) {
        super(r2mVar == null ? new r2m() : r2mVar);
        this.y = new Paint(1);
        u0();
        this.z = new RectF();
    }
}
