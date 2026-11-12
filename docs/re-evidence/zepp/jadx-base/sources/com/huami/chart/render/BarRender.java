package com.huami.chart.render;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import androidx.core.graphics.ColorUtils;
import com.huami.chart.chart.HMChart;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ColorSegmentBar;
import com.huami.chart.listener.IDataExtendListener;
import com.huami.chart.provider.PaintProvider;
import com.huami.chart.render.BarRender;
import com.huami.chart.style.BarStyle;
import com.huami.chart.util.ChartGradientColor;
import com.huami.chart.util.ChartUtil;
import com.huami.chart.util.HMColor;
import com.huami.chart.util.Index;
import com.huami.tools.log.HMLog;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class BarRender extends BaseRender<BarStyle> {
    private static final String k = "BarRender";
    private float i;
    private Paint j;

    public class a {
        private Path a;
        private Paint b;
        private ChartGradientColor c;

        public a(Path path, Paint paint, ChartGradientColor chartGradientColor) {
            this.a = path;
            this.b = paint;
            this.c = chartGradientColor;
        }

        public ChartGradientColor c() {
            return this.c;
        }

        public Paint d() {
            return this.b;
        }

        public Path e() {
            return this.a;
        }
    }

    public BarRender(HMChart hMChart, PaintProvider paintProvider) {
        super(hMChart, paintProvider);
        this.i = ChartUtil.dp2px(this.hmChart.getContext(), 3.0f);
        this.j = null;
    }

    private ChartGradientColor A(int i) {
        if (((BarStyle) this.mStyle).getBarGradientColors() == null || i >= ((BarStyle) this.mStyle).getBarGradientColors().length) {
            return null;
        }
        return ((BarStyle) this.mStyle).getBarGradientColors()[i];
    }

    private HMColor B() {
        HMColor[] barColors = ((BarStyle) this.mStyle).getBarColors();
        if (barColors == null || barColors.length == 0) {
            return null;
        }
        int rawColor = barColors[0].getRawColor();
        return new HMColor(ColorUtils.blendARGB(rawColor, barColors.length >= 2 ? barColors[1].getRawColor() : rawColor, 0.5f));
    }

    private int C(int i, int i2) {
        if (((BarStyle) this.mStyle).getHighlightContrast() <= 0) {
            return i;
        }
        return ((((BarStyle) this.mStyle).isFingerUpHighlightCancel() && isFingerUp()) || highlight(i2) || isInvalidIndex() || m()) ? i : ColorUtils.compositeColors(ColorUtils.setAlphaComponent(i, ((BarStyle) this.mStyle).getHighlightContrast()), -1);
    }

    private Paint D() {
        return ((BarStyle) this.mStyle).getOverlapColor() != null ? this.paintProvider.getBarChartPaint(false, ((BarStyle) this.mStyle).getOverlapColor()) : this.paintProvider.getBarChartPaint(false, B());
    }

    private RectF[] E(float[] fArr) {
        RectF rectF = new RectF();
        float f = 0.0f;
        RectF rectF2 = null;
        float f2 = 0.0f;
        int i = 0;
        while (i < fArr.length) {
            f += fArr[i];
            float shownDataVerticalValue = getShownDataVerticalValue(getPositionByValue(f));
            float shownDataVerticalValue2 = getShownDataVerticalValue(getPositionByValue(f2));
            if (shownDataVerticalValue != shownDataVerticalValue2) {
                if (rectF2 == null) {
                    rectF2 = new RectF();
                    rectF2.top = shownDataVerticalValue;
                    rectF2.bottom = this.hmChart.getDrawAreaManager().getHeight() - this.hmChart.getDrawAreaManager().getMarginBottom();
                }
                rectF.top = shownDataVerticalValue;
                rectF.bottom = shownDataVerticalValue2;
            }
            i++;
            f2 = f;
        }
        return new RectF[]{rectF2, rectF};
    }

    private float[] F() {
        float[] fArr = new float[8];
        if (((BarStyle) this.mStyle).getRadianValues() != null && ((BarStyle) this.mStyle).getRadianValues().length == 8) {
            return ((BarStyle) this.mStyle).getRadianValues();
        }
        fArr[0] = 90.0f;
        fArr[1] = 90.0f;
        fArr[2] = 90.0f;
        fArr[3] = 90.0f;
        fArr[4] = 90.0f;
        fArr[5] = 90.0f;
        fArr[6] = 90.0f;
        fArr[7] = 90.0f;
        return fArr;
    }

    private float[] G() {
        float[] fArr = new float[8];
        if (((BarStyle) this.mStyle).getRadianValues() == null || ((BarStyle) this.mStyle).getRadianValues().length != 8) {
            fArr[0] = 90.0f;
            fArr[1] = 90.0f;
            fArr[2] = 90.0f;
            fArr[3] = 90.0f;
        } else {
            fArr[0] = ((BarStyle) this.mStyle).getRadianValues()[0];
            fArr[1] = ((BarStyle) this.mStyle).getRadianValues()[1];
            fArr[2] = ((BarStyle) this.mStyle).getRadianValues()[2];
            fArr[3] = ((BarStyle) this.mStyle).getRadianValues()[3];
        }
        return fArr;
    }

    private PorterDuffXfermode H() {
        return new PorterDuffXfermode(PorterDuff.Mode.OVERLAY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String I() {
        return "you havent set barstyle yet";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String J() {
        return "请确认下是否是无数据，无数据讲不绘制";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String K() {
        return "暂未支持";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String L() {
        return "null != data.getExtends";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String M(HMColor hMColor) {
        return "o instanceOf HMColor " + hMColor.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String N() {
        return "null != data.getExtends";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String O(HMColor hMColor) {
        return "o instanceOf HMColor " + hMColor.toString();
    }

    private Path P(Path path, Path path2, Path.Op op) {
        if (path2 == null) {
            return path;
        }
        Path path3 = new Path(path);
        path3.op(path2, op);
        return path3;
    }

    private boolean Q(Canvas canvas, int i, boolean z, float f, float f2, float f3, float f4) {
        if ((((BarStyle) this.mStyle).getInteractiveType() & 2) <= 0) {
            return false;
        }
        if (!(((BarStyle) this.mStyle).isInteractiveUpCancel() ? highlight((f + f2) / 2.0f, -1.0f) : highlight(i)) || !z) {
            return false;
        }
        Paint paint = new Paint(1);
        float top = this.hmChart.getDrawAreaManager().getTop();
        float bottom = this.hmChart.getDrawAreaManager().getBottom();
        float f5 = (f + f2) / 2.0f;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SCREEN));
        paint.setStrokeWidth(((BarStyle) this.mStyle).getInteractiveLineWidth());
        paint.setColor(((BarStyle) this.mStyle).getInteractiveLineColor());
        canvas.drawLine(f5, Math.max(f4 - ChartUtil.dp2px(this.hmChart.getContext(), 2.0f), top), f5, top, paint);
        canvas.drawLine(f5, bottom, f5, Math.min(f3 + ChartUtil.dp2px(this.hmChart.getContext(), 2.0f), bottom), paint);
        return true;
    }

    private void R(int i, ChartGradientColor chartGradientColor, Paint paint, Path path) {
        if (chartGradientColor != null) {
            RectF rectF = new RectF();
            path.computeBounds(rectF, true);
            S(i, chartGradientColor, paint, rectF);
        }
    }

    private void S(int i, ChartGradientColor chartGradientColor, Paint paint, RectF rectF) {
        float f = rectF.left;
        paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, C(chartGradientColor.getStartColor().getRawColor(), i), C(chartGradientColor.getEndColor().getRawColor(), i), Shader.TileMode.CLAMP));
    }

    private void T(int i, Paint paint) {
        if (((BarStyle) this.mStyle).getHighlightContrast() <= 0) {
            return;
        }
        if ((((BarStyle) this.mStyle).isFingerUpHighlightCancel() && isFingerUp()) || highlight(i) || isInvalidIndex() || m()) {
            return;
        }
        paint.setAlpha(((BarStyle) this.mStyle).getHighlightContrast());
        paint.setColor(ColorUtils.compositeColors(paint.getColor(), ((BarStyle) this.mStyle).getChartBackgroundColor()));
    }

    @NonNull
    private Path l(RectF rectF, boolean z) {
        float minHeight = (((BarStyle) this.mStyle).getMinHeight() - rectF.height()) / 2.0f;
        rectF.top -= minHeight;
        rectF.bottom += minHeight;
        Path path = new Path();
        if (z) {
            path.addRoundRect(rectF, F(), Path.Direction.CW);
        } else {
            path.addRect(rectF, Path.Direction.CW);
        }
        return path;
    }

    private boolean m() {
        if (this.hmChart.getInteractiveManager().isEnableAutoAdjust()) {
            return false;
        }
        Index currentIndex = this.hmChart.getInteractiveManager().getCurrentIndex();
        return (currentIndex.getPosiIndex() == null || currentIndex.getDataIndex() != Index.INVALID_INDEX.getDataIndex() || this.hmChart.getInteractiveManager().isMoving()) ? false : true;
    }

    private void n(Canvas canvas, Path path, Paint paint, int i, ChartGradientColor chartGradientColor) {
        if (chartGradientColor == null) {
            chartGradientColor = A(0);
        }
        R(i, chartGradientColor, paint, path);
        T(i, paint);
        canvas.drawPath(path, paint);
    }

    private void o(Canvas canvas, ChartData chartData, float f, int i, float f2, float f3) {
        ColorSegmentBar[] colorSegmentBars = chartData.getColorSegmentBars();
        if (colorSegmentBars == null || colorSegmentBars.length == 0) {
            HMLog.debug(k, new Function0() { // from class: in
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BarRender.J();
                }
            });
            return;
        }
        int length = colorSegmentBars.length;
        a[] aVarArr = new a[length];
        boolean z = false;
        int i2 = 0;
        while (i2 < colorSegmentBars.length) {
            ColorSegmentBar colorSegmentBar = colorSegmentBars[i2];
            float shownDataVerticalValue = getShownDataVerticalValue(getPositionByValue(colorSegmentBar.getEnd()));
            float shownDataVerticalValue2 = getShownDataVerticalValue(getPositionByValue(colorSegmentBar.getStart()));
            if (shownDataVerticalValue2 < shownDataVerticalValue) {
                shownDataVerticalValue2 = shownDataVerticalValue;
                shownDataVerticalValue = shownDataVerticalValue2;
            }
            Paint paint = new Paint(this.paintProvider.getBarChartPaint(z, colorSegmentBar.getHmColor()));
            RectF rectF = ((BarStyle) this.mStyle).isNeedClipRange() ? new RectF(clipValueInCorrectRange(f2 - f), shownDataVerticalValue, clipValueInCorrectRange(f3 + f), shownDataVerticalValue2) : new RectF(clipValueInCorrectRange(f2 - f, f), shownDataVerticalValue, clipValueInCorrectRange(f3 + f, f), shownDataVerticalValue2);
            Path path = new Path();
            if (rectF.height() < ((BarStyle) this.mStyle).getMinHeight()) {
                T(i, paint);
                if (((BarStyle) this.mStyle).isSupportRadian()) {
                    path.addPath(l(rectF, true));
                } else {
                    path.addPath(l(rectF, false));
                }
            } else if (Math.abs(colorSegmentBar.getEnd() - colorSegmentBar.getStart()) <= ((BarStyle) this.mStyle).getMinDiff()) {
                if (((BarStyle) this.mStyle).isSupportRadian()) {
                    path.addCircle(rectF.centerX(), rectF.centerY(), f, Path.Direction.CW);
                } else {
                    HMLog.error(k, new Function0() { // from class: gn
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BarRender.K();
                        }
                    });
                }
            }
            if (((BarStyle) this.mStyle).isSupportRadian()) {
                path.addRoundRect(rectF, F(), Path.Direction.CW);
            } else {
                path.addRect(rectF, Path.Direction.CW);
            }
            aVarArr[i2] = new a(path, paint, colorSegmentBar.getChartGradientColor());
            i2++;
            z = false;
        }
        if (length == 2) {
            v(canvas, aVarArr[0], aVarArr[1], i);
        } else {
            u(canvas, aVarArr[0], i, 0);
        }
    }

    private void p(Canvas canvas, Path path, int i) {
        if (this.j == null || ((BarStyle) this.mStyle).getHighlightBorderStrokeWidth() <= 0.0f || !highlight(i)) {
            return;
        }
        canvas.drawPath(path, this.j);
    }

    private void q(Canvas canvas, RectF rectF, int i) {
        if (this.j == null || ((BarStyle) this.mStyle).getHighlightBorderStrokeWidth() <= 0.0f || !highlight(i)) {
            return;
        }
        canvas.drawRect(rectF, this.j);
    }

    private void r(Canvas canvas) {
        if (this.hmChart.getChartDataManager().getChartDataList().getCount() != 0 && (((BarStyle) this.mStyle).getInteractiveType() & 4) > 0) {
            if (((BarStyle) this.mStyle).isInteractiveUpCancel() && isFingerUp()) {
                return;
            }
            float adjustedDownX = getAdjustedDownX();
            if (!((BarStyle) this.mStyle).isInteractiveUpCancel() && isFingerUp()) {
                adjustedDownX = adjustedHasDataX(adjustedDownX);
            }
            float f = adjustedDownX;
            float top = this.hmChart.getDrawAreaManager().getTop();
            float bottom = this.hmChart.getDrawAreaManager().getBottom();
            Paint interactiveLinePaint = this.paintProvider.getInteractiveLinePaint(((BarStyle) this.mStyle).getInteractiveLineColor());
            interactiveLinePaint.setStrokeWidth(((BarStyle) this.mStyle).getInteractiveLineWidth());
            canvas.drawLine(f, top, f, bottom, interactiveLinePaint);
        }
    }

    private void s(Canvas canvas, ChartData chartData, float f, int i, float f2, float f3) {
        float[] values = chartData.getValues();
        RectF[] rectFArrE = ((BarStyle) this.mStyle).isSupportRadian() ? E(values) : null;
        float f4 = 0.0f;
        float f5 = 0.0f;
        boolean zQ = false;
        int i2 = 0;
        float f6 = 0.0f;
        while (i2 < values.length) {
            float f7 = f4 + values[i2];
            float shownDataVerticalValue = getShownDataVerticalValue(getPositionByValue(f7));
            float shownDataVerticalValue2 = getShownDataVerticalValue(getPositionByValue(f5));
            if (shownDataVerticalValue == shownDataVerticalValue2) {
                f7 = f7;
                i2 = i2;
            } else {
                HMColor hMColor = (((BarStyle) this.mStyle).getBarColors() == null || i2 >= ((BarStyle) this.mStyle).getBarColors().length) ? null : ((BarStyle) this.mStyle).getBarColors()[i2];
                ChartGradientColor chartGradientColor = null;
                for (IDataExtendListener<?> iDataExtendListener : chartData.getDataExtends()) {
                    String str = k;
                    HMLog.verbose(str, new Function0() { // from class: jn
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BarRender.L();
                        }
                    });
                    Object obj = iDataExtendListener.get(chartData.getBaseIndex());
                    if (obj instanceof HMColor) {
                        final HMColor hMColor2 = (HMColor) obj;
                        HMLog.verbose(str, new Function0() { // from class: fn
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return BarRender.M(hMColor2);
                            }
                        });
                        hMColor = hMColor2;
                    } else if (obj instanceof ChartGradientColor) {
                        chartGradientColor = (ChartGradientColor) obj;
                    }
                }
                RectF rectF = ((BarStyle) this.mStyle).isNeedClipRange() ? new RectF(clipValueInCorrectRange(f2 - f), shownDataVerticalValue, clipValueInCorrectRange(f3 + f), shownDataVerticalValue2) : new RectF(clipValueInCorrectRange(f2 - f, f), shownDataVerticalValue, clipValueInCorrectRange(f3 + f, f), shownDataVerticalValue2);
                Paint paintY = y(i, hMColor);
                T(i, paintY);
                if (!zQ) {
                    zQ = Q(canvas, i, true, rectF.left, rectF.right, rectF.bottom, rectF.top);
                }
                boolean z = zQ;
                if (((BarStyle) this.mStyle).getBarGradientColors() != null && i2 < ((BarStyle) this.mStyle).getBarGradientColors().length) {
                    chartGradientColor = ((BarStyle) this.mStyle).getBarGradientColors()[i2];
                }
                ChartGradientColor chartGradientColor2 = chartGradientColor;
                if (chartGradientColor2 != null) {
                    S(i, chartGradientColor2, paintY, rectF);
                }
                if (((BarStyle) this.mStyle).isSupportRadian() && rectFArrE != null && rectFArrE.length == 2) {
                    RectF rectF2 = rectFArrE[0];
                    RectF rectF3 = rectFArrE[1];
                    if (rectF2 != null && rectF3 != null && rectF2.top == rectF3.top) {
                        rectF.bottom = rectF2.bottom;
                        t(canvas, rectF, paintY, F(), i);
                    } else if (rectF2 != null && rectF2.top == shownDataVerticalValue) {
                        float f8 = rectF2.bottom;
                        rectF.bottom = f8;
                        float f9 = rectF.top;
                        float f10 = f8 - f9;
                        float f11 = this.i;
                        if (f10 < f11) {
                            f6 = f11 - (f8 - f9);
                            rectF.top = f8 - f11;
                        }
                        t(canvas, rectF, paintY, z(), i);
                    } else if (rectF3 == null || rectF3.top != shownDataVerticalValue) {
                        if (f6 != 0.0f) {
                            rectF.top -= f6;
                            rectF.bottom -= f6;
                            f6 = 0.0f;
                        }
                        q(canvas, rectF, i);
                        canvas.drawRect(rectF, paintY);
                    } else {
                        if (f6 != 0.0f) {
                            rectF.top -= f6;
                            rectF.bottom -= f6;
                            f6 = 0.0f;
                        }
                        float f12 = rectF.bottom;
                        float f13 = f12 - rectF.top;
                        float f14 = this.i;
                        if (f13 < f14) {
                            rectF.top = f12 - f14;
                        }
                        t(canvas, rectF, paintY, G(), i);
                    }
                } else {
                    q(canvas, rectF, i);
                    canvas.drawRect(rectF, paintY);
                }
                zQ = z;
            }
            i2++;
            f4 = f7;
            f5 = f4;
        }
    }

    private void t(Canvas canvas, RectF rectF, Paint paint, float[] fArr, int i) {
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        p(canvas, path, i);
        canvas.drawPath(path, paint);
    }

    private void u(Canvas canvas, a aVar, int i, int i2) {
        if (aVar == null) {
            return;
        }
        T(i, aVar.b);
        ChartGradientColor chartGradientColorA = aVar.c;
        if (chartGradientColorA == null) {
            chartGradientColorA = A(i2);
        }
        R(i, chartGradientColorA, aVar.b, aVar.e());
        if (this.j != null && ((BarStyle) this.mStyle).getHighlightBorderStrokeWidth() > 0.0f && highlight(i)) {
            canvas.drawPath(aVar.e(), this.j);
        }
        canvas.drawPath(aVar.e(), aVar.b);
    }

    private void v(Canvas canvas, a aVar, a aVar2, int i) {
        if (aVar == null || aVar2 == null) {
            return;
        }
        Paint paint = aVar.b;
        Paint paint2 = aVar2.b;
        Paint paintD = D();
        Path pathE = aVar.e();
        Path pathE2 = aVar2.e();
        Path pathP = P(pathE, pathE2, Path.Op.INTERSECT);
        Path pathP2 = P(pathE, pathE2, Path.Op.UNION);
        if (new PathMeasure(pathP, true).getLength() > 0.0f) {
            p(canvas, pathP2, i);
            Path pathP3 = P(pathE, pathE2, Path.Op.DIFFERENCE);
            Path pathP4 = P(pathE, pathE2, Path.Op.REVERSE_DIFFERENCE);
            n(canvas, pathP3, paint, i, aVar.c);
            n(canvas, pathP4, paint2, i, aVar2.c);
            n(canvas, pathP, paintD, i, null);
            return;
        }
        p(canvas, pathE, i);
        p(canvas, pathE2, i);
        T(i, paint);
        canvas.drawPath(pathE, paint);
        T(i, paint2);
        canvas.drawPath(pathE2, paint2);
    }

    private void w(Canvas canvas, a[] aVarArr, int i) {
        for (int i2 = 0; i2 < aVarArr.length; i2++) {
            u(canvas, aVarArr[i2], i, i2);
        }
    }

    private void x(Canvas canvas, ChartData chartData, float f, int i, float f2, float f3) {
        float[] fArr;
        Paint barChartPaint;
        float[] values = chartData.getValues();
        int length = values.length;
        int i2 = length / 2;
        a[] aVarArr = new a[i2];
        float f4 = 0.0f;
        float f5 = 0.0f;
        int i3 = 0;
        while (i3 < values.length) {
            float f6 = values[i3];
            if (i3 % 2 == 0) {
                f5 = f6;
                fArr = values;
                f4 = 0.0f;
            } else {
                float f7 = f4 + f6;
                float shownDataVerticalValue = getShownDataVerticalValue(getPositionByValue(f7));
                float shownDataVerticalValue2 = getShownDataVerticalValue(getPositionByValue(f5));
                int i4 = ((i3 + 1) / 2) - 1;
                HMColor hMColor = (((BarStyle) this.mStyle).getBarColors() == null || i4 >= ((BarStyle) this.mStyle).getBarColors().length) ? null : ((BarStyle) this.mStyle).getBarColors()[i4];
                Paint barChartPaint2 = (((BarStyle) this.mStyle).getInteractiveType() & 2) > 0 ? this.paintProvider.getBarChartPaint(false, hMColor) : this.paintProvider.getBarChartPaint(highlight(i), hMColor);
                Iterator<IDataExtendListener<?>> it2 = chartData.getDataExtends().iterator();
                ChartGradientColor chartGradientColor = null;
                while (it2.hasNext()) {
                    Iterator<IDataExtendListener<?>> it3 = it2;
                    IDataExtendListener<?> next = it2.next();
                    float f8 = f7;
                    String str = k;
                    float[] fArr2 = values;
                    HMLog.verbose(str, new Function0() { // from class: hn
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BarRender.N();
                        }
                    });
                    Object obj = next.get(chartData.getBaseIndex());
                    if (obj instanceof HMColor) {
                        final HMColor hMColor2 = (HMColor) obj;
                        HMLog.verbose(str, new Function0() { // from class: en
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return BarRender.O(hMColor2);
                            }
                        });
                        if ((((BarStyle) this.mStyle).getInteractiveType() & 2) > 0) {
                            barChartPaint = this.paintProvider.getBarChartPaint(i3 == 1, hMColor2);
                        } else {
                            barChartPaint = this.paintProvider.getBarChartPaint(highlight(i), hMColor2);
                        }
                        barChartPaint2 = barChartPaint;
                    } else if (obj instanceof ChartGradientColor) {
                        chartGradientColor = (ChartGradientColor) obj;
                    }
                    f7 = f8;
                    it2 = it3;
                    values = fArr2;
                }
                float f9 = f7;
                fArr = values;
                RectF rectF = ((BarStyle) this.mStyle).isNeedClipRange() ? new RectF(clipValueInCorrectRange(f2 - f), shownDataVerticalValue, clipValueInCorrectRange(f3 + f), shownDataVerticalValue2) : new RectF(clipValueInCorrectRange(f2 - f, f), shownDataVerticalValue, clipValueInCorrectRange(f3 + f, f), shownDataVerticalValue2);
                Path path = new Path();
                if (((BarStyle) this.mStyle).isSupportRadian()) {
                    path.addRoundRect(rectF, F(), Path.Direction.CW);
                } else {
                    path.addRect(rectF, Path.Direction.CW);
                }
                aVarArr[i4] = new a(path, new Paint(barChartPaint2), chartGradientColor);
                Q(canvas, i, length < 4 ? i3 == 1 : i3 == length + (-1), rectF.left, rectF.right, rectF.bottom, rectF.top);
                f4 = f9;
                f5 = f4;
            }
            i3++;
            values = fArr;
        }
        if (i2 == 2) {
            v(canvas, aVarArr[0], aVarArr[1], i);
        } else {
            w(canvas, aVarArr, i);
        }
    }

    private Paint y(int i, HMColor hMColor) {
        return (((BarStyle) this.mStyle).getInteractiveType() & 2) > 0 ? this.paintProvider.getBarChartPaint(false, hMColor) : this.paintProvider.getBarChartPaint(highlight(i), hMColor);
    }

    private float[] z() {
        float[] fArr = new float[8];
        if (((BarStyle) this.mStyle).getRadianValues() == null || ((BarStyle) this.mStyle).getRadianValues().length != 8) {
            fArr[4] = 90.0f;
            fArr[5] = 90.0f;
            fArr[6] = 90.0f;
            fArr[7] = 90.0f;
        } else {
            fArr[4] = ((BarStyle) this.mStyle).getRadianValues()[4];
            fArr[5] = ((BarStyle) this.mStyle).getRadianValues()[5];
            fArr[6] = ((BarStyle) this.mStyle).getRadianValues()[6];
            fArr[7] = ((BarStyle) this.mStyle).getRadianValues()[7];
        }
        return fArr;
    }

    @Override // com.huami.chart.render.BaseRender
    public void draw(Canvas canvas, int i, int i2, float f) {
        super.draw(canvas, i, i2, f);
        r(canvas);
        if (this.j == null && ((BarStyle) this.mStyle).getHighlightBorderStrokeWidth() > 0.0f) {
            Paint paint = new Paint(1);
            this.j = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.j.setStrokeWidth(((BarStyle) this.mStyle).getHighlightBorderStrokeWidth());
            this.j.setColor(((BarStyle) this.mStyle).getHighlightBorderColor());
            this.j.setAntiAlias(true);
        }
        if ((((BarStyle) this.mStyle).getBarStyle() & 1) > 0) {
            HMLog.verbose(k, new Function0() { // from class: kn
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BarRender.I();
                }
            });
            return;
        }
        float halfDataWidth = this.hmChart.getDrawAreaManager().getHalfDataWidth();
        for (int canvasDataIndexStart = getCanvasDataIndexStart(); canvasDataIndexStart <= getCanvasDataIndexEnd(); canvasDataIndexStart++) {
            ChartData dataByDataIndex = this.hmChart.getChartDataManager().getDataByDataIndex(canvasDataIndexStart);
            if (dataByDataIndex != null) {
                float shownDataHorizonalValue = getShownDataHorizonalValue(getPositionByPosIndex(dataByDataIndex.getStart()));
                float shownDataHorizonalValue2 = getShownDataHorizonalValue(getPositionByPosIndex(dataByDataIndex.getEnd()));
                if ((((BarStyle) this.mStyle).getBarStyle() & 4) > 0) {
                    x(canvas, dataByDataIndex, halfDataWidth, canvasDataIndexStart, shownDataHorizonalValue, shownDataHorizonalValue2);
                } else if ((((BarStyle) this.mStyle).getBarStyle() & 8) > 0) {
                    o(canvas, dataByDataIndex, halfDataWidth, canvasDataIndexStart, shownDataHorizonalValue, shownDataHorizonalValue2);
                } else {
                    s(canvas, dataByDataIndex, halfDataWidth, canvasDataIndexStart, shownDataHorizonalValue, shownDataHorizonalValue2);
                }
            }
        }
    }
}
