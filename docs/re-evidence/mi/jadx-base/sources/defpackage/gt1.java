package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gt1 extends qkk {
    protected ft1 mAxis;
    protected Paint mAxisLabelPaint;
    protected Paint mAxisLinePaint;
    protected Paint mGridPaint;
    protected Paint mLimitLinePaint;
    protected ryp mTrans;

    public gt1(hwq hwqVar, ryp rypVar, ft1 ft1Var) {
        super(hwqVar);
        this.mTrans = rypVar;
        this.mAxis = ft1Var;
        if (this.mViewPortHandler != null) {
            this.mAxisLabelPaint = new Paint(1);
            Paint paint = new Paint();
            this.mGridPaint = paint;
            paint.setColor(-7829368);
            this.mGridPaint.setStrokeWidth(1.0f);
            Paint paint2 = this.mGridPaint;
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            this.mGridPaint.setAlpha(90);
            Paint paint3 = new Paint();
            this.mAxisLinePaint = paint3;
            paint3.setColor(-16777216);
            this.mAxisLinePaint.setStrokeWidth(1.0f);
            this.mAxisLinePaint.setStyle(style);
            Paint paint4 = new Paint(1);
            this.mLimitLinePaint = paint4;
            paint4.setStyle(style);
        }
    }

    public void computeAxis(float f, float f2, boolean z) {
        float f3;
        double d;
        hwq hwqVar = this.mViewPortHandler;
        if (hwqVar != null && hwqVar.k() > 10.0f && !this.mViewPortHandler.y()) {
            vye vyeVarG = this.mTrans.g(this.mViewPortHandler.h(), this.mViewPortHandler.j());
            vye vyeVarG2 = this.mTrans.g(this.mViewPortHandler.h(), this.mViewPortHandler.f());
            if (z) {
                f3 = (float) vyeVarG.d;
                d = vyeVarG2.d;
            } else {
                f3 = (float) vyeVarG2.d;
                d = vyeVarG.d;
            }
            float f4 = (float) d;
            vye.c(vyeVarG);
            vye.c(vyeVarG2);
            f = f3;
            f2 = f4;
        }
        computeAxisValues(f, f2);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v15, types: [int] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [int] */
    public void computeAxisValues(float f, float f2) {
        ft1 ft1Var;
        int i;
        float f3 = f;
        int labelCount = this.mAxis.getLabelCount();
        double dAbs = Math.abs(f2 - f3);
        if (labelCount == 0 || dAbs <= 0.0d || Double.isInfinite(dAbs)) {
            ft1 ft1Var2 = this.mAxis;
            ft1Var2.mEntries = new float[0];
            ft1Var2.mCenteredEntries = new float[0];
            ft1Var2.mEntryCount = 0;
            return;
        }
        double dY = fmq.y(dAbs / ((double) labelCount));
        if (this.mAxis.isGranularityEnabled() && dY < this.mAxis.getGranularity()) {
            dY = this.mAxis.getGranularity();
        }
        double dY2 = fmq.y(Math.pow(10.0d, (int) Math.log10(dY)));
        if (((int) (dY / dY2)) > 5) {
            double d = dY2 * 10.0d;
            if (Math.floor(d) != 0.0d) {
                dY = Math.floor(d);
            }
        }
        ?? IsCenterAxisLabelsEnabled = this.mAxis.isCenterAxisLabelsEnabled();
        if (this.mAxis.isForceLabelsEnabled()) {
            dY = ((float) dAbs) / (labelCount - 1);
            ft1 ft1Var3 = this.mAxis;
            ft1Var3.mEntryCount = labelCount;
            if (ft1Var3.mEntries.length < labelCount) {
                ft1Var3.mEntries = new float[labelCount];
            }
            for (int i2 = 0; i2 < labelCount; i2++) {
                this.mAxis.mEntries[i2] = f3;
                f3 = (float) (((double) f3) + dY);
            }
        } else {
            double dCeil = dY == 0.0d ? 0.0d : Math.ceil(((double) f3) / dY) * dY;
            if (this.mAxis.isCenterAxisLabelsEnabled()) {
                dCeil -= dY;
            }
            double dW = dY == 0.0d ? 0.0d : fmq.w(Math.floor(((double) f2) / dY) * dY);
            if (dY == 0.0d || dW == dCeil) {
                if (dW == dCeil && IsCenterAxisLabelsEnabled == 0) {
                    labelCount = 1;
                }
                ft1Var = this.mAxis;
                ft1Var.mEntryCount = labelCount;
                if (ft1Var.mEntries.length < labelCount) {
                    ft1Var.mEntries = new float[labelCount];
                }
                for (i = 0; i < labelCount; i++) {
                    if (dCeil == 0.0d) {
                        dCeil = 0.0d;
                    }
                    this.mAxis.mEntries[i] = (float) dCeil;
                    dCeil += dY;
                }
            } else {
                double d2 = dCeil;
                IsCenterAxisLabelsEnabled = IsCenterAxisLabelsEnabled;
                while (d2 <= dW) {
                    d2 += dY;
                    IsCenterAxisLabelsEnabled++;
                }
            }
            labelCount = IsCenterAxisLabelsEnabled;
            ft1Var = this.mAxis;
            ft1Var.mEntryCount = labelCount;
            if (ft1Var.mEntries.length < labelCount) {
                ft1Var.mEntries = new float[labelCount];
            }
            while (i < labelCount) {
                if (dCeil == 0.0d) {
                    dCeil = 0.0d;
                }
                this.mAxis.mEntries[i] = (float) dCeil;
                dCeil += dY;
            }
        }
        if (dY < 1.0d) {
            this.mAxis.mDecimals = (int) Math.ceil(-Math.log10(dY));
        } else {
            this.mAxis.mDecimals = 0;
        }
        if (this.mAxis.isCenterAxisLabelsEnabled()) {
            ft1 ft1Var4 = this.mAxis;
            if (ft1Var4.mCenteredEntries.length < labelCount) {
                ft1Var4.mCenteredEntries = new float[labelCount];
            }
            float f4 = ((float) dY) / 2.0f;
            for (int i3 = 0; i3 < labelCount; i3++) {
                ft1 ft1Var5 = this.mAxis;
                ft1Var5.mCenteredEntries[i3] = ft1Var5.mEntries[i3] + f4;
            }
        }
    }

    public Paint getPaintAxisLabels() {
        return this.mAxisLabelPaint;
    }

    public Paint getPaintAxisLine() {
        return this.mAxisLinePaint;
    }

    public Paint getPaintGrid() {
        return this.mGridPaint;
    }

    public ryp getTransformer() {
        return this.mTrans;
    }

    public abstract void renderAxisLabels(Canvas canvas);

    public abstract void renderAxisLine(Canvas canvas);

    public abstract void renderGridLines(Canvas canvas);

    public abstract void renderLimitLines(Canvas canvas);
}
