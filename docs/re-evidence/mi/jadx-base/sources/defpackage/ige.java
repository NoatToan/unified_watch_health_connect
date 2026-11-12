package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ige extends d12 {
    private Path mHighlightLinePath;

    public ige(cu3 cu3Var, hwq hwqVar) {
        super(cu3Var, hwqVar);
        this.mHighlightLinePath = new Path();
    }

    public void drawHighlightLines(Canvas canvas, float f, float f2, mtc mtcVar) {
        this.mHighlightPaint.setColor(mtcVar.N0());
        this.mHighlightPaint.setStrokeWidth(mtcVar.x0());
        this.mHighlightPaint.setPathEffect(mtcVar.I0());
        if (mtcVar.v()) {
            this.mHighlightLinePath.reset();
            this.mHighlightLinePath.moveTo(f, this.mViewPortHandler.j());
            this.mHighlightLinePath.lineTo(f, this.mViewPortHandler.f());
            canvas.drawPath(this.mHighlightLinePath, this.mHighlightPaint);
        }
        if (mtcVar.Q0()) {
            this.mHighlightLinePath.reset();
            this.mHighlightLinePath.moveTo(this.mViewPortHandler.h(), f2);
            this.mHighlightLinePath.lineTo(this.mViewPortHandler.i(), f2);
            canvas.drawPath(this.mHighlightLinePath, this.mHighlightPaint);
        }
    }
}
