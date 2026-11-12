package vp;

import android.graphics.Canvas;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lvp/h;", "Lh00/b;", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "Lcom/github/mikephil/charting/components/XAxis;", "xAxis", "Lcom/github/mikephil/charting/utils/Transformer;", "trans", "<init>", "(Lcom/github/mikephil/charting/utils/ViewPortHandler;Lcom/github/mikephil/charting/components/XAxis;Lcom/github/mikephil/charting/utils/Transformer;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends h00.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f179299m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f179300n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f179301o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f179302p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer) {
        super(viewPortHandler, xAxis, transformer);
        viewPortHandler.getClass();
        xAxis.getClass();
        transformer.getClass();
        this.f179302p = 29;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v8, types: [int] */
    @Override // com.github.mikephil.charting.renderer.XAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public final void computeAxisValues(float f14, float f15) {
        int labelCount = this.mAxis.getLabelCount();
        int i14 = labelCount;
        if (labelCount > 24) {
            i14 = this.f179302p;
        }
        double dAbs = Math.abs(f15 - f14);
        if (i14 == 0 || dAbs <= 0.0d || Double.isInfinite(dAbs)) {
            AxisBase axisBase = this.mAxis;
            axisBase.mEntries = new float[0];
            axisBase.mCenteredEntries = new float[0];
            axisBase.mEntryCount = 0;
            return;
        }
        double dRoundToNextSignificant = Utils.roundToNextSignificant(dAbs / ((double) i14));
        if (this.mAxis.isGranularityEnabled() && dRoundToNextSignificant < this.mAxis.getGranularity()) {
            dRoundToNextSignificant = this.mAxis.getGranularity();
        }
        double dRoundToNextSignificant2 = Utils.roundToNextSignificant(Math.pow(10.0d, Math.log10(dRoundToNextSignificant)));
        if (((int) (dRoundToNextSignificant / dRoundToNextSignificant2)) > 5) {
            dRoundToNextSignificant = Math.floor(((double) 10) * dRoundToNextSignificant2);
        }
        ?? IsCenterAxisLabelsEnabled = this.mAxis.isCenterAxisLabelsEnabled();
        if (this.mAxis.isForceLabelsEnabled()) {
            dRoundToNextSignificant = ((float) dAbs) / (i14 - 1);
            AxisBase axisBase2 = this.mAxis;
            axisBase2.mEntryCount = i14;
            if (axisBase2.mEntries.length < i14) {
                axisBase2.mEntries = new float[i14];
            }
            for (int i15 = 0; i15 < i14; i15++) {
                this.mAxis.mEntries[i15] = f14;
                f14 += (float) dRoundToNextSignificant;
            }
        } else {
            double dCeil = dRoundToNextSignificant == 0.0d ? 0.0d : Math.ceil(((double) f14) / dRoundToNextSignificant) * dRoundToNextSignificant;
            if (this.mAxis.isCenterAxisLabelsEnabled()) {
                dCeil -= dRoundToNextSignificant;
            }
            double dNextUp = dRoundToNextSignificant == 0.0d ? 0.0d : Utils.nextUp(Math.floor(((double) f15) / dRoundToNextSignificant) * dRoundToNextSignificant);
            if (dRoundToNextSignificant != 0.0d) {
                double d14 = dCeil;
                IsCenterAxisLabelsEnabled = IsCenterAxisLabelsEnabled;
                while (d14 <= dNextUp) {
                    d14 += dRoundToNextSignificant;
                    IsCenterAxisLabelsEnabled++;
                }
            }
            i14 = IsCenterAxisLabelsEnabled;
            AxisBase axisBase3 = this.mAxis;
            axisBase3.mEntryCount = i14;
            if (axisBase3.mEntries.length < i14) {
                axisBase3.mEntries = new float[i14];
            }
            for (int i16 = 0; i16 < i14; i16++) {
                if (dCeil == 0.0d) {
                    dCeil = 0.0d;
                }
                this.mAxis.mEntries[i16] = (float) dCeil;
                dCeil += dRoundToNextSignificant;
            }
        }
        AxisBase axisBase4 = this.mAxis;
        if (dRoundToNextSignificant < 1.0d) {
            axisBase4.mDecimals = (int) Math.ceil(-Math.log10(dRoundToNextSignificant));
        } else {
            axisBase4.mDecimals = 0;
        }
        if (this.mAxis.isCenterAxisLabelsEnabled()) {
            AxisBase axisBase5 = this.mAxis;
            if (axisBase5.mCenteredEntries.length < i14) {
                axisBase5.mCenteredEntries = new float[i14];
            }
            float f16 = ((float) dRoundToNextSignificant) / 2.0f;
            for (int i17 = 0; i17 < i14; i17++) {
                AxisBase axisBase6 = this.mAxis;
                axisBase6.mCenteredEntries[i17] = axisBase6.mEntries[i17] + f16;
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    public final void drawLabel(Canvas canvas, String str, float f14, float f15, MPPointF mPPointF, float f16) {
        int i14;
        canvas.getClass();
        str.getClass();
        mPPointF.getClass();
        int i15 = this.f179301o;
        String str2 = (i15 == 0 || i15 == this.f80602f + (-2) || this.f179299m) ? "●" : "•";
        float f17 = (i15 == 0 || i15 == this.f80602f + (-2) || this.f179299m) ? f15 : f15 + (pz.d.f141919b / 4);
        Utils.drawXAxisValue(canvas, str2, f14, f17, this.f80599c, mPPointF, f16);
        boolean z14 = this.f179300n;
        if ((z14 && ((i14 = this.f179301o) == 0 || i14 == this.f80602f - 2)) || !z14) {
            Utils.drawXAxisValue(canvas, str, f14, f17 + pz.d.f141918a, this.f80598b, mPPointF, f16);
        }
        this.f179301o++;
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    public final void drawLabels(Canvas canvas, float f14, MPPointF mPPointF) {
        canvas.getClass();
        mPPointF.getClass();
        this.f179301o = 0;
        super.drawLabels(canvas, f14, mPPointF);
    }
}
