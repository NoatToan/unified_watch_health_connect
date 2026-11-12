package jc1;

import android.graphics.Canvas;
import android.graphics.Path;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ljc1/a;", "Lh00/e;", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "Lcom/github/mikephil/charting/components/XAxis;", "xAxis", "Lcom/github/mikephil/charting/utils/Transformer;", "trans", "Lpz/a;", "dotPattern", "Lpz/b;", "labelPattern", "<init>", "(Lcom/github/mikephil/charting/utils/ViewPortHandler;Lcom/github/mikephil/charting/components/XAxis;Lcom/github/mikephil/charting/utils/Transformer;Lpz/a;Lpz/b;)V", "gcm-pulseox_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends h00.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f98160q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f98161r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer, pz.a aVar, pz.b bVar) {
        super(viewPortHandler, xAxis, transformer, aVar, bVar, false);
        viewPortHandler.getClass();
        xAxis.getClass();
        transformer.getClass();
        aVar.getClass();
        bVar.getClass();
        this.f98160q = 1;
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public final void renderGridLines(Canvas canvas) {
        if (!this.mXAxis.isDrawGridLinesEnabled() || !this.mXAxis.isEnabled()) {
            return;
        }
        float[] fArr = {0.0f, 0.0f};
        this.mGridPaint.setColor(this.mXAxis.getGridColor());
        this.mGridPaint.setStrokeWidth(this.mXAxis.getGridLineWidth());
        this.mGridPaint.setPathEffect(this.mXAxis.getGridDashPathEffect());
        Path path = new Path();
        int iC = MathKt.c(this.mXAxis.getAxisMinimum());
        while (true) {
            float f14 = iC;
            if (f14 > this.mXAxis.getAxisMaximum()) {
                return;
            }
            iC++;
            if (iC % this.f98160q == 0) {
                fArr[0] = f14 + (this.f98161r ? 0.5f : 0.0f);
                this.mTrans.pointValuesToPixel(fArr);
                if (fArr[0] >= this.mViewPortHandler.offsetLeft() && fArr[0] <= this.mViewPortHandler.getChartWidth()) {
                    path.moveTo(fArr[0], this.mViewPortHandler.contentBottom());
                    path.lineTo(fArr[0], this.mViewPortHandler.contentTop());
                    if (canvas != null) {
                        canvas.drawPath(path, this.mGridPaint);
                    }
                }
                path.reset();
            }
        }
    }
}
