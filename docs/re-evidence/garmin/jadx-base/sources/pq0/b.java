package pq0;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.ChartData;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.renderer.XAxisRenderer;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import pz.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0016By\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lpq0/b;", "Lcom/github/mikephil/charting/renderer/XAxisRenderer;", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "Lcom/github/mikephil/charting/components/XAxis;", "xAxis", "Lcom/github/mikephil/charting/utils/Transformer;", "trans", "Lcom/github/mikephil/charting/data/ChartData;", "chartData", "Lpz/a;", "dotPattern", "Lpz/b;", "labelPattern", "", "numberOfXAxisLabels", "labelOffset", "axisTopPadding", "boundaryDotPadding", "largeDotOffset", "<init>", "(Lcom/github/mikephil/charting/utils/ViewPortHandler;Lcom/github/mikephil/charting/components/XAxis;Lcom/github/mikephil/charting/utils/Transformer;Lcom/github/mikephil/charting/data/ChartData;Lpz/a;Lpz/b;IIIII)V", "a", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class b extends XAxisRenderer {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f139552i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pz.a f139553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pz.b f139554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f139555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f139556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f139557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f139558f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f139559g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f139560h;

    /* JADX INFO: renamed from: pq0.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C2641b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f139561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f139562b;

        static {
            int[] iArr = new int[pz.b.values().length];
            try {
                iArr[pz.b.DEFAULT_LABEL_PATTERN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pz.b.BOUNDARY_LABEL_PATTERN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pz.b.COMB_LABEL_PATTERN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f139561a = iArr;
            int[] iArr2 = new int[pz.a.values().length];
            try {
                iArr2[pz.a.STANDARD_DOT_PATTERN.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[pz.a.ALL_LARGE_DOT_PATTERN.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[pz.a.LARGE_LIMIT_DOT_PATTERN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[pz.a.BOUNDARY_DOT_PATTERN.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[pz.a.ONE_BIG_THREE_SMALL_DOT_PATTERN.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            f139562b = iArr2;
        }
    }

    static {
        new a(null);
        f139552i = (int) Utils.convertDpToPixel(0.4f);
    }

    public b(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer, ChartData chartData, pz.a aVar, pz.b bVar, int i14, int i15, int i16, int i17, int i18, int i19, j jVar) {
        this(viewPortHandler, xAxis, transformer, chartData, (i19 & 16) != 0 ? pz.a.STANDARD_DOT_PATTERN : aVar, (i19 & 32) != 0 ? pz.b.DEFAULT_LABEL_PATTERN : bVar, (i19 & 64) != 0 ? 0 : i14, (i19 & 128) != 0 ? d.f141918a : i15, (i19 & 256) != 0 ? 20 : i16, (i19 & 512) != 0 ? 30 : i17, (i19 & 1024) != 0 ? d.f141919b : i18);
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    public final void drawLabels(Canvas canvas, float f14, MPPointF mPPointF) {
        float labelRotationAngle = this.mXAxis.getLabelRotationAngle();
        float[] fArr = {0.0f, 0.0f};
        int i14 = this.f139560h;
        int i15 = this.f139555c;
        int i16 = i15 > 1 ? i14 / (i15 - 1) : i15 == 1 ? i14 : 1;
        int i17 = i16 < 1 ? 1 : i16;
        for (int i18 = 0; i18 <= i14; i18 += i17) {
            fArr[0] = i18;
            this.mTrans.pointValuesToPixel(fArr);
            if (this.mViewPortHandler.isInBoundsX(fArr[0])) {
                String formattedLabel = this.mXAxis.getFormattedLabel(i18);
                if (this.mXAxis.isAvoidFirstLastClippingEnabled()) {
                    if (i18 == i14 - 1 && i14 > 1) {
                        float fCalcTextWidth = Utils.calcTextWidth(this.mAxisLabelPaint, formattedLabel);
                        float f15 = 2;
                        if (fCalcTextWidth > this.mViewPortHandler.offsetRight() * f15 && fArr[0] + fCalcTextWidth > this.mViewPortHandler.getChartWidth()) {
                            fArr[0] = fArr[0] - (fCalcTextWidth / f15);
                        }
                    } else if (i18 == 0) {
                        fArr[0] = (Utils.calcTextWidth(this.mAxisLabelPaint, formattedLabel) / 2) + fArr[0];
                    }
                }
                float f16 = fArr[0];
                int i19 = C2641b.f139561a[this.f139554b.ordinal()];
                int i24 = this.f139556d;
                if (i19 == 1) {
                    Utils.drawXAxisValue(canvas, formattedLabel, f16, f14 + i24, this.mAxisLabelPaint, mPPointF, labelRotationAngle);
                } else if (i19 != 2) {
                    if (i19 != 3) {
                        u0.r();
                        return;
                    } else if (i18 % 4 == 0) {
                        Utils.drawXAxisValue(canvas, formattedLabel, f16, f14 + i24, this.mAxisLabelPaint, mPPointF, labelRotationAngle);
                    }
                } else if (i18 == 0 || i18 == i14) {
                    Utils.drawXAxisValue(canvas, formattedLabel, f16, f14 + i24, this.mAxisLabelPaint, mPPointF, labelRotationAngle);
                }
                int color = this.mAxisLabelPaint.getColor();
                int i25 = C2641b.f139562b[this.f139553a.ordinal()];
                int i26 = f139552i;
                int i27 = this.f139557e;
                if (i25 != 1) {
                    int i28 = this.f139559g;
                    if (i25 == 2) {
                        Utils.drawXAxisValue(canvas, "●", f16, (f14 + i27) - i28, this.mAxisLabelPaint, mPPointF, 0.0f);
                    } else if (i25 != 3) {
                        if (i25 != 4) {
                            if (i25 != 5) {
                                u0.r();
                                return;
                            }
                            int i29 = i18 % 4;
                            Paint paint = this.mAxisLabelPaint;
                            if (i29 == 0) {
                                Utils.drawXAxisValue(canvas, "●", f16, (f14 + i27) - i28, paint, mPPointF, 0.0f);
                            } else {
                                Utils.drawXAxisValue(canvas, "•", f16, (f14 + i27) - i26, paint, mPPointF, 0.0f);
                            }
                        } else if (i18 != 0 && i18 != i14) {
                            Utils.drawXAxisValue(canvas, "•", f16, f14 - this.f139558f, this.mAxisLabelPaint, mPPointF, 0.0f);
                        }
                    } else if (i18 == 0 || i18 == i14) {
                        Utils.drawXAxisValue(canvas, "●", f16, (f14 + i27) - i28, this.mAxisLabelPaint, mPPointF, 0.0f);
                    } else {
                        Utils.drawXAxisValue(canvas, "•", f16, (f14 + i27) - i26, this.mAxisLabelPaint, mPPointF, 0.0f);
                    }
                } else {
                    Utils.drawXAxisValue(canvas, "•", f16, (f14 + i27) - i26, this.mAxisLabelPaint, mPPointF, 0.0f);
                }
                this.mAxisLabelPaint.setColor(color);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0004X\u0084T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lpq0/b$a;", "", "<init>", "()V", "", "BOTTOM_OFFSET", "F", "", "SMALL_DOT_OFFSET", "I", "BOUNDARY_DOT_PATTERN_OFFSET", "AXIS_TOP_PADDING", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer, ChartData<?> chartData, pz.a aVar) {
        this(viewPortHandler, xAxis, transformer, chartData, aVar, null, 0, 0, 0, 0, 0, 2016, null);
        chartData.getClass();
        aVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer, ChartData<?> chartData, pz.a aVar, pz.b bVar) {
        this(viewPortHandler, xAxis, transformer, chartData, aVar, bVar, 0, 0, 0, 0, 0, 1984, null);
        chartData.getClass();
        aVar.getClass();
        bVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer, ChartData<?> chartData, pz.a aVar, pz.b bVar, int i14) {
        this(viewPortHandler, xAxis, transformer, chartData, aVar, bVar, i14, 0, 0, 0, 0, 1920, null);
        chartData.getClass();
        aVar.getClass();
        bVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer, ChartData<?> chartData, pz.a aVar, pz.b bVar, int i14, int i15) {
        this(viewPortHandler, xAxis, transformer, chartData, aVar, bVar, i14, i15, 0, 0, 0, 1792, null);
        chartData.getClass();
        aVar.getClass();
        bVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer, ChartData<?> chartData, pz.a aVar, pz.b bVar, int i14, int i15, int i16) {
        this(viewPortHandler, xAxis, transformer, chartData, aVar, bVar, i14, i15, i16, 0, 0, 1536, null);
        chartData.getClass();
        aVar.getClass();
        bVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer, ChartData<?> chartData, pz.a aVar, pz.b bVar, int i14, int i15, int i16, int i17) {
        this(viewPortHandler, xAxis, transformer, chartData, aVar, bVar, i14, i15, i16, i17, 0, 1024, null);
        chartData.getClass();
        aVar.getClass();
        bVar.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer, ChartData<?> chartData, pz.a aVar, pz.b bVar, int i14, int i15, int i16, int i17, int i18) {
        super(viewPortHandler, xAxis, transformer);
        chartData.getClass();
        aVar.getClass();
        bVar.getClass();
        this.f139553a = aVar;
        this.f139554b = bVar;
        this.f139555c = i14;
        this.f139556d = i15;
        this.f139557e = i16;
        this.f139558f = i17;
        this.f139559g = i18;
        IDataSet maxEntryCountSet = chartData.getMaxEntryCountSet();
        int entryCount = maxEntryCountSet != null ? maxEntryCountSet.getEntryCount() : 0;
        this.f139560h = entryCount;
        this.mXAxis.setLabelCount(entryCount);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer, ChartData<?> chartData) {
        this(viewPortHandler, xAxis, transformer, chartData, null, null, 0, 0, 0, 0, 0, 2032, null);
        chartData.getClass();
    }
}
