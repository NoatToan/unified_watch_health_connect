package h00;

import android.graphics.Canvas;
import c22.l3;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.renderer.XAxisRenderer;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0010B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lh00/j;", "Lcom/github/mikephil/charting/renderer/XAxisRenderer;", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "Lcom/github/mikephil/charting/components/XAxis;", "xAxis", "Lcom/github/mikephil/charting/utils/Transformer;", "trans", "Lfz/c;", "xAxisType", "", "isUsingMetric", "Lh00/g;", "roundingType", "<init>", "(Lcom/github/mikephil/charting/utils/ViewPortHandler;Lcom/github/mikephil/charting/components/XAxis;Lcom/github/mikephil/charting/utils/Transformer;Lfz/c;ZLh00/g;)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class j extends XAxisRenderer {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f80622d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f80623e = (int) Utils.convertDpToPixel(4.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f80624f = (int) Utils.convertDpToPixel(17.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f80625g = (int) Utils.convertDpToPixel(6.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fz.c f80626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f80627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f80628c;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f80629a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.MULTIPLE_OF_0_05.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.MULTIPLE_OF_10.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f80629a = iArr;
        }
    }

    public /* synthetic */ j(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer, fz.c cVar, boolean z14, g gVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(viewPortHandler, xAxis, transformer, (i14 & 8) != 0 ? fz.c.TIME : cVar, (i14 & 16) != 0 ? true : z14, (i14 & 32) != 0 ? g.MULTIPLE_OF_0_05 : gVar);
    }

    public void a(Canvas canvas, String str, float f14, float f15, MPPointF mPPointF, float f16, boolean z14) {
        if (!z14) {
            drawLabel(canvas, str, f14, f15, mPPointF, f16);
            return;
        }
        float fCalcTextWidth = Utils.calcTextWidth(this.mAxisLabelPaint, str);
        float f17 = (fCalcTextWidth <= this.mViewPortHandler.offsetRight() * ((float) 2) || fCalcTextWidth + f14 <= this.mViewPortHandler.getChartWidth()) ? f14 : f14 - f80625g;
        Utils.drawXAxisValue(canvas, "●", f14, (20.0f + f15) - f80623e, this.mAxisLabelPaint, mPPointF, 0.0f);
        Utils.drawXAxisValue(canvas, str, f17, f15 + f80624f, this.mAxisLabelPaint, mPPointF, f16);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ae  */
    @Override // com.github.mikephil.charting.renderer.XAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public final void computeAxis(float f14, float f15, boolean z14) {
        double dRint;
        double d14;
        double d15;
        if (this.f80626a != fz.c.DISTANCE) {
            super.computeAxis(f14, f15, z14);
            return;
        }
        float f16 = 5;
        if (f15 < f16) {
            super.computeAxis(f14, f15, z14);
            return;
        }
        int i14 = b.f80629a[this.f80628c.ordinal()];
        boolean z15 = this.f80627b;
        if (i14 != 1) {
            if (i14 != 2) {
                u0.r();
                return;
            }
            double dS1 = f15;
            if (!z15) {
                l3.f23124b.getClass();
                dS1 = l3.a.S1(dS1);
            }
            double d16 = 5;
            double d17 = dS1 / d16;
            if (d17 == 0.0d) {
                super.computeAxis(f14, f15, z14);
                return;
            } else {
                double d18 = 10;
                super.computeAxis(f14, (float) (Math.rint(d17 / d18) * d18 * d16), z14);
                return;
            }
        }
        double d19 = f15 / f16;
        l3.f23124b.getClass();
        double d24 = d19 / 1000.0d;
        double d25 = f15;
        double d26 = d25 / 1000.0d;
        if (!z15) {
            d24 = d19 / 1609.344d;
            d26 = d25 / 1609.344d;
        }
        double dRint2 = Math.rint(((double) 2) * d24) / 2.0d;
        if (d26 >= 0) {
            if (d26 < 5) {
                dRint = Math.rint(d24 * ((double) 20));
                d14 = 20.0d;
            }
            if (z15) {
                d15 = dRint2 * 1000.0d;
            } else {
                d15 = dRint2 * 1609.344d;
            }
            if (d15 == 0.0d) {
                super.computeAxis(f14, f15, z14);
            } else {
                super.computeAxis(f14, (float) (((double) 5) * d15), z14);
            }
        }
        dRint = Math.rint(d24 * ((double) 200));
        d14 = 200.0d;
        dRint2 = dRint / d14;
        if (z15) {
            d15 = dRint2 * 1609.344d;
        } else {
            d15 = dRint2 * 1000.0d;
        }
        if (d15 == 0.0d) {
            super.computeAxis(f14, f15, z14);
        } else {
            super.computeAxis(f14, (float) (((double) 5) * d15), z14);
        }
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    public void drawLabel(Canvas canvas, String str, float f14, float f15, MPPointF mPPointF, float f16) {
        Utils.drawXAxisValue(canvas, str, f14, f15 + f80624f, this.mAxisLabelPaint, mPPointF, f16);
        Utils.drawXAxisValue(canvas, "●", f14, (f15 + 20.0f) - f80623e, this.mAxisLabelPaint, mPPointF, 0.0f);
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    public void drawLabels(Canvas canvas, float f14, MPPointF mPPointF) {
        float labelRotationAngle = this.mXAxis.getLabelRotationAngle();
        boolean zIsCenterAxisLabelsEnabled = this.mXAxis.isCenterAxisLabelsEnabled();
        int i14 = this.mXAxis.mEntryCount * 2;
        float[] fArr = new float[i14];
        for (int i15 = 0; i15 < i14; i15 += 2) {
            XAxis xAxis = this.mXAxis;
            if (zIsCenterAxisLabelsEnabled) {
                fArr[i15] = xAxis.mCenteredEntries[i15 / 2];
            } else {
                fArr[i15] = xAxis.mEntries[i15 / 2];
            }
        }
        this.mTrans.pointValuesToPixel(fArr);
        for (int i16 = 0; i16 < i14; i16 += 2) {
            float fCalcTextWidth = fArr[i16];
            if (this.mViewPortHandler.isInBoundsX(fCalcTextWidth)) {
                ValueFormatter valueFormatter = this.mXAxis.getValueFormatter();
                XAxis xAxis2 = this.mXAxis;
                int i17 = i16 / 2;
                String axisLabel = valueFormatter.getAxisLabel(xAxis2.mEntries[i17], xAxis2);
                if (this.mXAxis.isAvoidFirstLastClippingEnabled()) {
                    int i18 = this.mXAxis.mEntryCount;
                    if (i17 == i18 - 1 && i18 > 1) {
                        float fCalcTextWidth2 = Utils.calcTextWidth(this.mAxisLabelPaint, axisLabel);
                        float f15 = 2;
                        if (fCalcTextWidth2 > this.mViewPortHandler.offsetRight() * f15 && fCalcTextWidth + fCalcTextWidth2 > this.mViewPortHandler.getChartWidth()) {
                            fCalcTextWidth -= fCalcTextWidth2 / f15;
                        }
                    } else if (i16 == 0) {
                        fCalcTextWidth += Utils.calcTextWidth(this.mAxisLabelPaint, axisLabel) / 2;
                    }
                }
                int i19 = this.mXAxis.mEntryCount;
                a(canvas, axisLabel, fCalcTextWidth, f14, mPPointF, labelRotationAngle, i17 == i19 + (-1) && i19 > 1);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lh00/j$a;", "", "<init>", "()V", "", "AXIS_TOP_PADDING", "F", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer, fz.c cVar, boolean z14, g gVar) {
        super(viewPortHandler, xAxis, transformer);
        viewPortHandler.getClass();
        xAxis.getClass();
        transformer.getClass();
        cVar.getClass();
        gVar.getClass();
        this.f80626a = cVar;
        this.f80627b = z14;
        this.f80628c = gVar;
    }
}
