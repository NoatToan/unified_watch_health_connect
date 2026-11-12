package com.huami.chart.render;

import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.ColorUtils;
import com.huami.chart.chart.HMChart;
import com.huami.chart.provider.PaintProvider;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.render.MultiLineRender;
import com.huami.chart.style.MultiLineStyle;
import com.huami.chart.util.HMGradientDrawable;
import com.huami.chart.util.HMGradientDrawableRectValue;
import com.huami.chart.util.Index;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class MultiLineRender extends BaseRender<MultiLineStyle> {
    private static final String r = "MultiLineRender";
    private static final float s = 45.0f;
    private Path i;
    private Path j;
    private Path k;
    private Drawable l;
    private Path m;
    private Path n;
    private float o;
    private PathEffect p;
    private RenderConfig q;

    public MultiLineRender(HMChart hMChart, PaintProvider paintProvider) {
        super(hMChart, paintProvider);
        this.i = new Path();
        this.j = new Path();
        this.k = new Path();
        this.m = new Path();
        this.n = new Path();
        this.p = new CornerPathEffect(45.0f);
        this.q = hMChart.getRenderConfigManager().getRenderConfig();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String A() {
        return "interactiveManager getIndex " + this.hmChart.getInteractiveManager().getCurrentIndex();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String B() {
        return this.hmChart.getDrawAreaManager().getLeft() + " " + this.hmChart.getDrawAreaManager().getTop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String C() {
        return this.hmChart.getDrawAreaManager().getRight() + " " + this.hmChart.getDrawAreaManager().getBottom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String D(Exception exc) {
        return "getLineColors error: " + exc.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String E(Exception exc) {
        return "getIntersectionPointColor error: " + exc.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String F() {
        return "main path index list size is less than 2";
    }

    private void G(int i, List<Integer> list, Canvas canvas) {
        Index currentIndex;
        int iU;
        if ((this.q.getLineStyle().getInteractiveType() & 32) <= 0 || ((MultiLineStyle) this.mStyle).getIntersectionPointSize() <= 0.0f || (currentIndex = this.hmChart.getInteractiveManager().getCurrentIndex()) == null || currentIndex.getDataIndex() == -1 || this.hmChart.getChartDataManager().getDataByPositionIndex(currentIndex.getPosiIndex().getIndex()) == null) {
            return;
        }
        if (this.q.getLineStyle().isInteractiveUpCancel() && Float.isNaN(this.hmChart.getInteractiveManager().getCurrentDownX())) {
            return;
        }
        Paint multiLinePaint = this.paintProvider.getMultiLinePaint(i);
        float fClipValueInCorrectRange = clipValueInCorrectRange(getShownDataHorizonalValue(getPositionByPosIndex(currentIndex.getPosiIndex().getIndex())));
        if (((MultiLineStyle) this.mStyle).getIntersectionPointColor() != null) {
            try {
                iU = ((MultiLineStyle) this.mStyle).getIntersectionPointColor()[i];
            } catch (Exception e) {
                HMLog.info(r, new Function0() { // from class: i95
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MultiLineRender.E(e);
                    }
                });
                iU = u(i);
            }
        } else {
            iU = -1;
        }
        float shownDataVerticalValue = getShownDataVerticalValue(getPositionByValuePositionIndex(i, currentIndex.getPosiIndex().getIndex()));
        multiLinePaint.setStyle(Paint.Style.FILL);
        multiLinePaint.setColor(iU);
        canvas.drawCircle(fClipValueInCorrectRange, shownDataVerticalValue, ((MultiLineStyle) this.mStyle).getIntersectionPointSize(), multiLinePaint);
        if (((MultiLineStyle) this.mStyle).getIntersectionPointBorderWidth() > 0.0f) {
            multiLinePaint.setStyle(Paint.Style.STROKE);
            multiLinePaint.setColor(-1);
            multiLinePaint.setStrokeWidth(((MultiLineStyle) this.mStyle).getIntersectionPointBorderWidth());
            canvas.drawCircle(fClipValueInCorrectRange, shownDataVerticalValue, ((MultiLineStyle) this.mStyle).getIntersectionPointSize() + (((MultiLineStyle) this.mStyle).getIntersectionPointBorderWidth() / 2.0f), multiLinePaint);
        }
    }

    private void H(int i, List<Integer> list, Canvas canvas) {
        float shownDataVerticalValue;
        float f;
        float f2;
        int i2;
        int i3;
        if (list.size() < 1) {
            return;
        }
        if (list.size() == 1) {
            if (((MultiLineStyle) this.mStyle).getSinglePointSize() > 0.0f) {
                float shownDataHorizonalValue = getShownDataHorizonalValue(getPositionByPosIndex(list.get(0).intValue()));
                float shownDataVerticalValue2 = getShownDataVerticalValue(getPositionByValuePositionIndex(i, list.get(0).intValue()));
                Paint multiLinePaint = this.paintProvider.getMultiLinePaint(i);
                multiLinePaint.setStyle(Paint.Style.FILL);
                canvas.drawCircle(shownDataHorizonalValue, shownDataVerticalValue2, ((MultiLineStyle) this.mStyle).getSinglePointSize(), multiLinePaint);
            }
            HMLog.verbose(r, new Function0() { // from class: m95
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MultiLineRender.F();
                }
            });
            return;
        }
        this.i.reset();
        this.j.reset();
        this.k.reset();
        int iIntValue = list.get(0).intValue();
        float shownDataHorizonalValue2 = getShownDataHorizonalValue(getPositionByPosIndex(iIntValue));
        float shownDataVerticalValue3 = getShownDataVerticalValue(getPositionByValuePositionIndex(i, iIntValue));
        this.i.moveTo(shownDataHorizonalValue2, shownDataVerticalValue3);
        this.k.moveTo(shownDataHorizonalValue2, shownDataVerticalValue3);
        this.j.moveTo(shownDataHorizonalValue2, this.hmChart.getDrawAreaManager().getBottom());
        this.j.lineTo(shownDataHorizonalValue2, shownDataVerticalValue3);
        float f3 = shownDataVerticalValue3;
        int i4 = 1;
        float f4 = shownDataHorizonalValue2;
        int iIntValue2 = iIntValue;
        while (i4 < list.size()) {
            int iIntValue3 = list.get(i4).intValue();
            float shownDataHorizonalValue3 = getShownDataHorizonalValue(getPositionByPosIndex(iIntValue3));
            float shownDataVerticalValue4 = getShownDataVerticalValue(getPositionByValuePositionIndex(i, iIntValue3));
            float f5 = f4 + ((shownDataHorizonalValue3 - f4) / 2.0f);
            if (((MultiLineStyle) this.mStyle).getDisconnectLineGap() <= 0 || iIntValue3 - iIntValue <= ((MultiLineStyle) this.mStyle).getDisconnectLineGap()) {
                f = shownDataVerticalValue4;
                f2 = shownDataHorizonalValue3;
                i2 = iIntValue3;
                i3 = i4;
                this.i.cubicTo(f5, f3, f5, f, f2, f);
                this.j.cubicTo(f5, f3, f5, f, f2, f);
            } else {
                this.i.moveTo(shownDataHorizonalValue3, shownDataVerticalValue4);
                this.k.moveTo(f4, f3);
                int i5 = i4 + 1;
                if (i5 != list.size()) {
                    iIntValue2 = list.get(i5).intValue();
                }
                if (!((MultiLineStyle) this.mStyle).isShowGapPoint() || (iIntValue2 - iIntValue3 <= ((MultiLineStyle) this.mStyle).getDisconnectLineGap() && i5 != list.size())) {
                    f = shownDataVerticalValue4;
                    f2 = shownDataHorizonalValue3;
                    i2 = iIntValue3;
                    if (((MultiLineStyle) this.mStyle).isShowGapPoint() && i4 == 1) {
                        canvas.drawCircle(f4, f3, ((MultiLineStyle) this.mStyle).getGapPointSize(), this.paintProvider.getMultiLineGapPointPaint(i));
                        this.j.lineTo(f4, this.hmChart.getDrawAreaManager().getBottom());
                        this.j.lineTo(f2, this.hmChart.getDrawAreaManager().getBottom());
                        i3 = i4;
                        this.k.cubicTo(f5, f3, f5, f, f2, f);
                    } else {
                        i3 = i4;
                        this.j.lineTo(f4, this.hmChart.getDrawAreaManager().getBottom());
                        this.j.lineTo(f2, this.hmChart.getDrawAreaManager().getBottom());
                        this.j.lineTo(f2, f);
                        this.k.cubicTo(f5, f3, f5, f, f2, f);
                    }
                } else {
                    if (i4 == 1) {
                        canvas.drawCircle(f4, f3, ((MultiLineStyle) this.mStyle).getGapPointSize(), this.paintProvider.getMultiLineGapPointPaint(i));
                    }
                    canvas.drawCircle(shownDataHorizonalValue3, shownDataVerticalValue4, ((MultiLineStyle) this.mStyle).getGapPointSize(), this.paintProvider.getMultiLineGapPointPaint(i));
                    this.j.lineTo(f4, this.hmChart.getDrawAreaManager().getBottom());
                    this.j.lineTo(shownDataHorizonalValue3, this.hmChart.getDrawAreaManager().getBottom());
                    f = shownDataVerticalValue4;
                    f2 = shownDataHorizonalValue3;
                    i2 = iIntValue3;
                    this.k.cubicTo(f5, f3, f5, f, f2, f);
                    i3 = i4;
                }
            }
            i4 = i3 + 1;
            f3 = f;
            f4 = f2;
            iIntValue = i2;
        }
        this.j.lineTo(f4, this.hmChart.getDrawAreaManager().getBottom());
        if (this.l != null) {
            canvas.save();
            canvas.clipPath(this.j);
            float bottom = this.hmChart.getDrawAreaManager().getBottom();
            if (((MultiLineStyle) this.mStyle).getGradientDrawableRectValue() != null) {
                HMGradientDrawableRectValue hMGradientDrawableRectValue = ((MultiLineStyle) this.mStyle).getGradientDrawableRectValue()[i];
                shownDataVerticalValue = getShownDataVerticalValue(getPositionByValue(hMGradientDrawableRectValue.getTop()));
                bottom = getShownDataVerticalValue(getPositionByValue(hMGradientDrawableRectValue.getBottom()));
            } else {
                shownDataVerticalValue = 0.0f;
            }
            if (this.hmChart.getInteractiveManager().getCurrentIndex() == Index.INVALID_INDEX || !((MultiLineStyle) this.mStyle).getShadowShownBeforeIndex()) {
                this.l.setBounds((int) this.hmChart.getDrawAreaManager().getLeft(), (int) shownDataVerticalValue, (int) this.hmChart.getDrawAreaManager().getRight(), (int) bottom);
            } else {
                this.l.setBounds((int) this.hmChart.getDrawAreaManager().getLeft(), (int) shownDataVerticalValue, (int) getShownDataHorizonalValue(getPositionByPosIndex(this.hmChart.getInteractiveManager().getCurrentIndex().getPosiIndex().getIndex())), (int) bottom);
            }
            this.l.draw(canvas);
            canvas.restore();
        }
        Paint multiLinePaint2 = this.paintProvider.getMultiLinePaint(i);
        if (((MultiLineStyle) this.mStyle).isFadingInAndOut()) {
            int alphaComponent = ColorUtils.setAlphaComponent(multiLinePaint2.getColor(), 51);
            multiLinePaint2.setShader(p(new int[]{alphaComponent, multiLinePaint2.getColor(), multiLinePaint2.getColor(), multiLinePaint2.getColor(), multiLinePaint2.getColor(), alphaComponent}, new float[]{0.0f, 0.01f, 0.01f, 0.99f, 0.99f, 1.0f}));
        }
        canvas.drawPath(this.i, multiLinePaint2);
        if (((MultiLineStyle) this.mStyle).getGapDashPathEffect() != null) {
            multiLinePaint2.setPathEffect(((MultiLineStyle) this.mStyle).getGapDashPathEffect());
            canvas.drawPath(this.k, multiLinePaint2);
        }
    }

    private LinearGradient p(int[] iArr, float[] fArr) {
        return new LinearGradient(this.hmChart.getDrawAreaManager().getLeft(), 0.0f, this.hmChart.getDrawAreaManager().getRight(), 0.0f, iArr, fArr, Shader.TileMode.CLAMP);
    }

    private void q(int i, Canvas canvas) {
        int canvasEnd = getCanvasEnd() + 1;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int iMax = Math.max(getCanvasStart(), 0); iMax < canvasEnd; iMax++) {
            if (this.hmChart.getChartDataManager().hasMultiDataAtPositionIndex(i, iMax)) {
                arrayList.add(Integer.valueOf(iMax));
                arrayList2.add(Integer.valueOf(iMax));
            }
        }
        H(i, arrayList2, canvas);
        if (this.q.getLineStyle() != null) {
            G(i, arrayList, canvas);
        }
        s(i, arrayList, canvas);
    }

    private void r(int i, Canvas canvas) {
        String str = r;
        HMLog.verbose(str, new Function0() { // from class: k95
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MultiLineRender.w();
            }
        });
        HMLog.verbose(str, new Function0() { // from class: f95
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.a.x();
            }
        });
        this.m.reset();
        this.n.reset();
        if (getDataSize() < 2) {
            return;
        }
        int firstDataPositionIndex = this.hmChart.getChartDataManager().getFirstDataPositionIndex();
        final float shownDataHorizonalValue = getShownDataHorizonalValue(getPositionByPosIndex(firstDataPositionIndex));
        float shownDataVerticalValue = getShownDataVerticalValue(getPositionByValuePositionIndex(i, firstDataPositionIndex));
        this.n.moveTo(shownDataHorizonalValue, this.hmChart.getDrawAreaManager().getBottom());
        this.m.moveTo(shownDataHorizonalValue, shownDataVerticalValue);
        this.n.lineTo(shownDataHorizonalValue, shownDataVerticalValue);
        for (int canvasStart = getCanvasStart() - 1; canvasStart <= getCanvasEnd() + 1; canvasStart++) {
            if (this.hmChart.getChartDataManager().hasDataAtPositionIndex(canvasStart)) {
                shownDataHorizonalValue = getShownDataHorizonalValue(getPositionByPosIndex(canvasStart));
                final float shownDataVerticalValue2 = getShownDataVerticalValue(getPositionByValuePositionIndex(i, canvasStart));
                this.m.lineTo(shownDataHorizonalValue, shownDataVerticalValue2);
                this.n.lineTo(shownDataHorizonalValue, shownDataVerticalValue2);
                HMLog.verbose(r, new Function0() { // from class: c95
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MultiLineRender.y(shownDataHorizonalValue, shownDataVerticalValue2);
                    }
                });
            }
        }
        this.n.lineTo(shownDataHorizonalValue, this.hmChart.getDrawAreaManager().getBottom());
        if (this.l != null) {
            String str2 = r;
            HMLog.verbose(str2, new Function0() { // from class: l95
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MultiLineRender.z();
                }
            });
            canvas.save();
            canvas.clipPath(this.n);
            HMLog.verbose(str2, new Function0() { // from class: g95
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.a.A();
                }
            });
            if (this.hmChart.getInteractiveManager().getCurrentIndex() == Index.INVALID_INDEX || !((MultiLineStyle) this.mStyle).getShadowShownBeforeIndex()) {
                HMLog.verbose(str2, new Function0() { // from class: e95
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return this.a.B();
                    }
                });
                HMLog.verbose(str2, new Function0() { // from class: h95
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return this.a.C();
                    }
                });
                this.l.setBounds((int) this.hmChart.getDrawAreaManager().getLeft(), (int) this.hmChart.getDrawAreaManager().getTop(), (int) this.hmChart.getDrawAreaManager().getRight(), (int) this.hmChart.getDrawAreaManager().getBottom());
            } else {
                this.l.setBounds((int) this.hmChart.getDrawAreaManager().getLeft(), (int) this.hmChart.getDrawAreaManager().getTop(), (int) getShownDataHorizonalValue(getPositionByPosIndex(this.hmChart.getInteractiveManager().getCurrentIndex().getPosiIndex().getIndex())), (int) this.hmChart.getDrawAreaManager().getBottom());
            }
            this.l.draw(canvas);
            canvas.restore();
        }
        Paint multiLinePaint = this.paintProvider.getMultiLinePaint(i);
        multiLinePaint.setPathEffect(this.p);
        HMLog.verbose(r, new Function0() { // from class: d95
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MultiLineRender.v();
            }
        });
        canvas.drawPath(this.m, multiLinePaint);
    }

    private void s(int i, List<Integer> list, Canvas canvas) {
        if (list.size() < 1 || ((MultiLineStyle) this.mStyle).getDataPointRadius() <= 0.0f) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            Paint multiLinePaint = this.paintProvider.getMultiLinePaint(i);
            float shownDataHorizonalValue = getShownDataHorizonalValue(getPositionByPosIndex(list.get(i2).intValue()));
            float shownDataVerticalValue = getShownDataVerticalValue(getPositionByValuePositionIndex(i, list.get(i2).intValue()));
            multiLinePaint.setStyle(Paint.Style.FILL);
            multiLinePaint.setColor(((MultiLineStyle) this.mStyle).getDataPointBorderColor());
            canvas.drawCircle(shownDataHorizonalValue, shownDataVerticalValue, ((MultiLineStyle) this.mStyle).getDataPointBorderRadius(), multiLinePaint);
            multiLinePaint.setColor(((MultiLineStyle) this.mStyle).getLineColors()[i]);
            canvas.drawCircle(shownDataHorizonalValue, shownDataVerticalValue, ((MultiLineStyle) this.mStyle).getDataPointRadius(), multiLinePaint);
        }
    }

    private void t(Canvas canvas) {
        if (this.hmChart.getChartDataManager().getChartDataList().getCount() != 0 && (((MultiLineStyle) this.mStyle).getInteractiveType() & 2) > 0) {
            if (((MultiLineStyle) this.mStyle).isInteractiveUpCancel() && isFingerUp()) {
                return;
            }
            float adjustedDownX = getAdjustedDownX();
            if (!((MultiLineStyle) this.mStyle).isInteractiveUpCancel() && isFingerUp()) {
                adjustedDownX = adjustedHasDataX(adjustedDownX);
            }
            float f = adjustedDownX;
            float top = this.hmChart.getDrawAreaManager().getTop();
            float bottom = this.hmChart.getDrawAreaManager().getBottom();
            Paint interactiveLinePaint = this.paintProvider.getInteractiveLinePaint(((MultiLineStyle) this.mStyle).getInteractiveLineColor());
            interactiveLinePaint.setStrokeWidth(((MultiLineStyle) this.mStyle).getInteractiveLineWidth());
            canvas.drawLine(f, top, f, bottom, interactiveLinePaint);
        }
    }

    private int u(int i) {
        try {
            return ((MultiLineStyle) this.mStyle).getLineColors()[i];
        } catch (Exception e) {
            HMLog.info(r, new Function0() { // from class: j95
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MultiLineRender.D(e);
                }
            });
            return this.q.getLineStyle().getLineColor();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String v() {
        return "drwaPath....";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String w() {
        return "drawCurvePath...";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String x() {
        return "xOffset " + this.hmChart.getInteractiveManager().getxOffset() + " start " + getCanvasStart();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String y(float f, float f2) {
        return "lineTo " + f + " , " + f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String z() {
        return "null != mDrawable....";
    }

    @Override // com.huami.chart.render.BaseRender
    public void draw(Canvas canvas, int i, int i2, float f) {
        super.draw(canvas, i, i2, f);
        t(canvas);
        int[][] shadowColors = ((MultiLineStyle) this.mStyle).getShadowColors();
        if (this.hmChart.getChartDataManager().getMultiChartDataList() == null) {
            return;
        }
        for (int i3 = 0; i3 < this.hmChart.getChartDataManager().getMultiChartDataList().length; i3++) {
            if (shadowColors != null) {
                this.l = new HMGradientDrawable(shadowColors[i3]);
            }
            canvas.save();
            if ((((MultiLineStyle) this.mStyle).getLineStyle() & 4) > 0) {
                q(i3, canvas);
            } else if ((((MultiLineStyle) this.mStyle).getLineStyle() & 2) > 0) {
                r(i3, canvas);
            } else if ((((MultiLineStyle) this.mStyle).getLineStyle() & 8) <= 0) {
                ((MultiLineStyle) this.mStyle).getLineStyle();
            }
            canvas.restore();
        }
    }
}
