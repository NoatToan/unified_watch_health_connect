package mz;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.text.TextUtils;
import c22.l3;
import com.github.mikephil.chartingv2.components.XAxis;
import com.github.mikephil.chartingv2.renderer.XAxisRenderer;
import com.github.mikephil.chartingv2.utils.Transformer;
import com.github.mikephil.chartingv2.utils.Utils;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@o13.e
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0018B7\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fB?\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fB?\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0011B_\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u000b\u0010\u0017¨\u0006\u0019"}, d2 = {"Lmz/f;", "Lcom/github/mikephil/chartingv2/renderer/XAxisRenderer;", "Lcom/github/mikephil/chartingv2/utils/ViewPortHandler;", "viewPortHandler", "Lcom/github/mikephil/chartingv2/components/XAxis;", "xAxis", "Lcom/github/mikephil/chartingv2/utils/Transformer;", "trans", "", "dotPattern", "labelPattern", "<init>", "(Lcom/github/mikephil/chartingv2/utils/ViewPortHandler;Lcom/github/mikephil/chartingv2/components/XAxis;Lcom/github/mikephil/chartingv2/utils/Transformer;II)V", "", "allXLabels", "(Lcom/github/mikephil/chartingv2/utils/ViewPortHandler;Lcom/github/mikephil/chartingv2/components/XAxis;Lcom/github/mikephil/chartingv2/utils/Transformer;IIZ)V", "numberOfXAxisLabels", "(Lcom/github/mikephil/chartingv2/utils/ViewPortHandler;Lcom/github/mikephil/chartingv2/components/XAxis;Lcom/github/mikephil/chartingv2/utils/Transformer;III)V", "numberOfXAxisLables", "labelOffset", "axisTopPadding", "", "largeDotOffset", "(Lcom/github/mikephil/chartingv2/utils/ViewPortHandler;Lcom/github/mikephil/chartingv2/components/XAxis;Lcom/github/mikephil/chartingv2/utils/Transformer;IIZIIIF)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class f extends XAxisRenderer {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f121623o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f121624p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f121625q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f121626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f121627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f121628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f121629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f121630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f121631f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f121632g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f121633h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f121634i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f121635j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f121636k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f121637l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public fz.c f121638m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f121639n;

    static {
        new a(null);
        f121623o = (int) Utils.convertDpToPixel(4.0f);
        f121624p = (int) Utils.convertDpToPixel(0.4f);
        f121625q = (int) Utils.convertDpToPixel(17.0f);
    }

    public f(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer, int i14, int i15, boolean z14, int i16, int i17, int i18, float f14) {
        super(viewPortHandler, xAxis, transformer);
        this.f121629d = f121625q;
        this.f121630e = 20.0f;
        this.f121631f = f121623o;
        this.f121638m = fz.c.TIME;
        this.f121639n = true;
        this.f121632g = z14;
        if (i14 != -1) {
            this.f121627b = i14;
        }
        if (i15 != -1) {
            this.f121628c = i15;
        }
        if (i16 != -1) {
            this.f121633h = i16;
        }
        if (i17 != -1) {
            this.f121629d = i17;
        }
        if (i18 != -1) {
            this.f121630e = i18;
        }
        if (f14 == -1.0f) {
            return;
        }
        this.f121631f = (int) Utils.convertDpToPixel(f14);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0064  */
    /* JADX WARN: Code duplicated, block: B:17:0x0069  */
    @Override // com.github.mikephil.chartingv2.renderer.XAxisRenderer
    public final void computeAxis(float f14, List<String> list) {
        double dRint;
        double d14;
        double d15;
        if (this.f121638m != fz.c.DISTANCE) {
            super.computeAxis(f14, list);
            return;
        }
        l3.a aVar = l3.f23124b;
        double d16 = f14 / 5;
        aVar.getClass();
        double d17 = d16 / 1000.0d;
        double d18 = f14;
        aVar.getClass();
        double d19 = d18 / 1000.0d;
        if (!this.f121639n) {
            aVar.getClass();
            d17 = d16 / 1609.344d;
            aVar.getClass();
            d19 = d18 / 1609.344d;
        }
        double dRint2 = Math.rint(((double) 2) * d17) / 2.0d;
        if (d19 >= 0) {
            if (d19 < 5) {
                dRint = Math.rint(d17 * ((double) 20));
                d14 = 20.0d;
            }
            if (this.f121639n) {
                aVar.getClass();
                d15 = dRint2 * 1000.0d;
            } else {
                aVar.getClass();
                d15 = dRint2 * 1609.344d;
            }
            super.computeAxis((float) (((double) 5) * d15), list);
        }
        dRint = Math.rint(d17 * ((double) 200));
        d14 = 200.0d;
        dRint2 = dRint / d14;
        if (this.f121639n) {
            aVar.getClass();
            d15 = dRint2 * 1609.344d;
        } else {
            aVar.getClass();
            d15 = dRint2 * 1000.0d;
        }
        super.computeAxis((float) (((double) 5) * d15), list);
    }

    @Override // com.github.mikephil.chartingv2.renderer.XAxisRenderer
    public void drawLabel(Canvas canvas, String str, int i14, float f14, float f15, PointF pointF, float f16) {
        int i15 = i14;
        str.getClass();
        String xValue = this.mXAxis.getValueFormatter().getXValue(str, i15, this.mViewPortHandler);
        if (this.f121635j) {
            i15 -= this.f121636k;
        }
        int i16 = this.f121629d;
        int i17 = this.f121628c;
        if (i17 == 0 || i17 != 1 || i15 == 0 || i15 == this.f121626a) {
            Utils.drawText(canvas, xValue, f14, f15 + i16, this.mAxisLabelPaint, pointF, f16);
        }
        int color = this.mAxisLabelPaint.getColor();
        int i18 = this.f121634i;
        if (i18 != 0) {
            this.mAxisLabelPaint.setColor(i18);
        }
        int i19 = i15 + this.f121637l;
        int i24 = f121624p;
        float f17 = this.f121630e;
        int i25 = this.f121627b;
        if (i25 != 0) {
            int i26 = this.f121631f;
            if (i25 != 1) {
                if (i25 == 2) {
                    Utils.drawText(canvas, "●", f14, (f15 + f17) - i26, this.mAxisLabelPaint, pointF, 0.0f);
                } else if (i25 == 3) {
                    int i27 = i19 % 4;
                    Paint paint = this.mAxisLabelPaint;
                    if (i27 == 0) {
                        Utils.drawText(canvas, "●", f14, (f15 + f17) - i26, paint, pointF, 0.0f);
                    } else {
                        Utils.drawText(canvas, "•", f14, (f15 + f17) - i24, paint, pointF, 0.0f);
                    }
                } else if (i25 != 4) {
                    Utils.drawText(canvas, "•", f14, (f15 + f17) - i24, this.mAxisLabelPaint, pointF, 0.0f);
                } else if (!TextUtils.isEmpty(str)) {
                    Utils.drawText(canvas, "●", f14, (f15 + f17) - i26, this.mAxisLabelPaint, pointF, 0.0f);
                }
            } else if (i19 == 0 || i19 == this.f121626a) {
                Utils.drawText(canvas, "●", f14, (f15 + f17) - i26, this.mAxisLabelPaint, pointF, 0.0f);
            } else {
                Utils.drawText(canvas, "•", f14, (f15 + f17) - i24, this.mAxisLabelPaint, pointF, 0.0f);
            }
        } else {
            Utils.drawText(canvas, "•", f14, (f15 + f17) - i24, this.mAxisLabelPaint, pointF, 0.0f);
        }
        this.mAxisLabelPaint.setColor(color);
    }

    @Override // com.github.mikephil.chartingv2.renderer.XAxisRenderer
    public void drawLabels(Canvas canvas, float f14, PointF pointF) {
        try {
            if (this.f121632g) {
                super.drawLabels(canvas, f14, pointF);
                return;
            }
            float labelRotationAngle = this.mXAxis.getLabelRotationAngle();
            int size = this.mXAxis.getValues().size() - 1;
            float[] fArr = {0.0f, 0.0f};
            int i14 = this.mMaxX;
            if (i14 <= size) {
                size = i14;
            }
            this.f121626a = size;
            int i15 = this.f121633h;
            if (i15 > 1) {
                size /= i15 - 1;
            } else if (i15 != 1) {
                size = 1;
            }
            if (size < 1) {
                size = 1;
            }
            this.f121636k = 0;
            for (int i16 = this.mMinX; i16 <= this.f121626a; i16 += size) {
                fArr[0] = i16;
                this.mTrans.pointValuesToPixel(fArr);
                if (this.mViewPortHandler.isInBoundsX(fArr[0])) {
                    String str = this.mXAxis.getValues().get(i16);
                    if (this.f121635j && TextUtils.isEmpty(str)) {
                        this.f121636k++;
                    } else {
                        if (this.mXAxis.isAvoidFirstLastClippingEnabled()) {
                            if (i16 == this.mXAxis.getValues().size() - 1 && this.mXAxis.getValues().size() > 1) {
                                float fCalcTextWidth = Utils.calcTextWidth(this.mAxisLabelPaint, str);
                                float f15 = 2;
                                if (fCalcTextWidth > this.mViewPortHandler.offsetRight() * f15 && fArr[0] + fCalcTextWidth > this.mViewPortHandler.getChartWidth()) {
                                    fArr[0] = fArr[0] - (fCalcTextWidth / f15);
                                }
                            } else if (i16 == 0) {
                                fArr[0] = (Utils.calcTextWidth(this.mAxisLabelPaint, str) / 2) + fArr[0];
                            }
                        }
                        str.getClass();
                        drawLabel(canvas, str, i16, fArr[0], f14, pointF, labelRotationAngle);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000eR\u0014\u0010\u0016\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000e¨\u0006\u0018"}, d2 = {"Lmz/f$a;", "", "<init>", "()V", "", "LARGE_MARK", "Ljava/lang/String;", "SMALL_MARK", "", "BOTTOM_OFFSET", "F", "AXIS_TOP_PADDING", "", "LARGE_DOT_OFFSET", "I", "SMALL_DOT_OFFSET", "LABEL_OFFSET", "STANDARD_DOT_PATTERN", "LARGE_LIMIT_DOT_PATTERN", "ALL_LARGE_DOT_PATTERN", "ONE_BIG_THREE_SMALL_DOT_PATTERN", "LARGE_DOT_FOR_VALID_LABELS_PATTERN", "DEFAULT_LABEL_PATTERN", "BOUNDARY_LABEL_PATTERN", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public f(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer, int i14, int i15, boolean z14) {
        super(viewPortHandler, xAxis, transformer);
        this.f121629d = f121625q;
        this.f121630e = 20.0f;
        this.f121631f = f121623o;
        this.f121638m = fz.c.TIME;
        this.f121639n = true;
        this.f121627b = i14;
        this.f121628c = i15;
        this.f121632g = z14;
    }

    public f(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer, int i14, int i15, int i16) {
        super(viewPortHandler, xAxis, transformer);
        this.f121629d = f121625q;
        this.f121630e = 20.0f;
        this.f121631f = f121623o;
        this.f121638m = fz.c.TIME;
        this.f121639n = true;
        this.f121627b = i14;
        this.f121628c = i15;
        this.f121632g = false;
        this.f121633h = i16;
    }

    public f(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer, int i14, int i15) {
        super(viewPortHandler, xAxis, transformer);
        this.f121629d = f121625q;
        this.f121630e = 20.0f;
        this.f121631f = f121623o;
        this.f121638m = fz.c.TIME;
        this.f121639n = true;
        this.f121627b = i14;
        this.f121628c = i15;
    }
}
