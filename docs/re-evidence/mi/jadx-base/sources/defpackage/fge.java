package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class fge extends ige {
    public fge(cu3 cu3Var, hwq hwqVar) {
        super(cu3Var, hwqVar);
    }

    private boolean clipPathSupported() {
        return fmq.s() >= 18;
    }

    public void drawFilledPath(Canvas canvas, Path path, int i, int i2) {
        int i3 = (i & 16777215) | (i2 << 24);
        if (clipPathSupported()) {
            int iSave = canvas.save();
            canvas.clipPath(path);
            canvas.drawColor(i3);
            canvas.restoreToCount(iSave);
            return;
        }
        Paint.Style style = this.mRenderPaint.getStyle();
        int color = this.mRenderPaint.getColor();
        this.mRenderPaint.setStyle(Paint.Style.FILL);
        this.mRenderPaint.setColor(i3);
        canvas.drawPath(path, this.mRenderPaint);
        this.mRenderPaint.setColor(color);
        this.mRenderPaint.setStyle(style);
    }

    public void drawFilledPath(Canvas canvas, Path path, Drawable drawable) {
        if (clipPathSupported()) {
            int iSave = canvas.save();
            canvas.clipPath(path);
            drawable.setBounds((int) this.mViewPortHandler.h(), (int) this.mViewPortHandler.j(), (int) this.mViewPortHandler.i(), (int) this.mViewPortHandler.f());
            drawable.draw(canvas);
            canvas.restoreToCount(iSave);
            return;
        }
        throw new RuntimeException("Fill-drawables not (yet) supported below API level 18, this code was run on API level " + fmq.s() + ".");
    }
}
