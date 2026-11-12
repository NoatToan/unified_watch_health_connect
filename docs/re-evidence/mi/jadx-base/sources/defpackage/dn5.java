package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import com.github.mikephil.charting.data.Entry;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;

/* JADX INFO: loaded from: classes4.dex */
public abstract class dn5 extends qkk {
    protected cu3 mAnimator;
    protected Paint mDrawPaint;
    protected Paint mHighlightPaint;
    protected Paint mRenderPaint;
    protected Paint mValuePaint;

    public dn5(cu3 cu3Var, hwq hwqVar) {
        super(hwqVar);
        this.mAnimator = cu3Var;
        Paint paint = new Paint(1);
        this.mRenderPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.mDrawPaint = new Paint(4);
        Paint paint2 = new Paint(1);
        this.mValuePaint = paint2;
        paint2.setColor(Color.rgb(63, 63, 63));
        this.mValuePaint.setTextAlign(Paint.Align.CENTER);
        this.mValuePaint.setTextSize(fmq.e(9.0f));
        Paint paint3 = new Paint(1);
        this.mHighlightPaint = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        this.mHighlightPaint.setStrokeWidth(2.0f);
        this.mHighlightPaint.setColor(Color.rgb(255, SportReportBaseParser.ReportType.avgAscentRate, 115));
    }

    public void applyValueTextStyle(erc ercVar) {
        this.mValuePaint.setTypeface(ercVar.l());
        this.mValuePaint.setTextSize(ercVar.z0());
    }

    public abstract void drawData(Canvas canvas);

    public abstract void drawExtras(Canvas canvas);

    public abstract void drawHighlighted(Canvas canvas, r7c[] r7cVarArr);

    public void drawValue(Canvas canvas, k0d k0dVar, float f, Entry entry, int i, float f2, float f3, int i2) {
        this.mValuePaint.setColor(i2);
        canvas.drawText(k0dVar.a(f, entry, i, this.mViewPortHandler), f2, f3, this.mValuePaint);
    }

    public abstract void drawValues(Canvas canvas);

    public Paint getPaintHighlight() {
        return this.mHighlightPaint;
    }

    public Paint getPaintRender() {
        return this.mRenderPaint;
    }

    public Paint getPaintValues() {
        return this.mValuePaint;
    }

    public abstract void initBuffers();

    public boolean isDrawingValuesAllowed(hu3 hu3Var) {
        return ((float) hu3Var.getData().m()) < ((float) hu3Var.getMaxVisibleCount()) * this.mViewPortHandler.r();
    }
}
