package com.huami.chart.render;

import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.ColorUtils;
import com.huami.chart.chart.HMChart;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.MultiColorLine;
import com.huami.chart.data.RangeIndex;
import com.huami.chart.listener.IDataExtendListener;
import com.huami.chart.provider.PaintProvider;
import com.huami.chart.render.LineRender;
import com.huami.chart.style.LineStyle;
import com.huami.chart.util.HMColor;
import com.huami.chart.util.HMGradientDrawable;
import com.huami.chart.util.HMGradientDrawableRectValue;
import com.huami.chart.util.Index;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class LineRender extends BaseRender<LineStyle> {
    private static final String u = "LineRender";
    private static final float v = 45.0f;
    private Path i;
    private Path j;
    private Path k;
    private Drawable l;
    private Drawable m;
    private float n;
    private Paint o;
    private PathEffect p;
    private Path q;
    private Path r;
    private Path s;
    private Path t;

    public LineRender(HMChart hMChart, PaintProvider paintProvider) {
        super(hMChart, paintProvider);
        this.i = new Path();
        this.j = new Path();
        this.k = new Path();
        this.o = new Paint(1);
        this.p = new CornerPathEffect(45.0f);
        this.q = new Path();
        this.r = new Path();
        this.s = new Path();
        this.t = new Path();
    }

    private void A(Canvas canvas) {
        int canvasEnd = getCanvasEnd() + 1;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<Integer> subPoints = ((LineStyle) this.mStyle).getSubPoints();
        for (int iMax = Math.max(getCanvasStart(), 0); iMax < canvasEnd; iMax++) {
            if (this.hmChart.getChartDataManager().hasDataAtPositionIndex(iMax)) {
                arrayList.add(Integer.valueOf(iMax));
                if (!subPoints.contains(Integer.valueOf(iMax))) {
                    arrayList2.add(Integer.valueOf(iMax));
                }
            }
        }
        c0(arrayList2, canvas);
        D(canvas);
        E(canvas);
        a0(arrayList, canvas);
        b0(arrayList, canvas);
        C(arrayList, canvas);
    }

    private void B(Canvas canvas) {
        String str = u;
        HMLog.verbose(str, new Function0() { // from class: ln4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LineRender.Q();
            }
        });
        HMLog.verbose(str, new Function0() { // from class: un4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.a.R();
            }
        });
        this.q.reset();
        this.r.reset();
        this.s.reset();
        this.t.reset();
        if (getDataSize() < 1) {
            return;
        }
        int firstDataPositionIndex = this.hmChart.getChartDataManager().getFirstDataPositionIndex();
        final float shownDataHorizonalValue = getShownDataHorizonalValue(getPositionByPosIndex(firstDataPositionIndex));
        float shownDataVerticalValue = getShownDataVerticalValue(getPositionByValuePositionIndex(firstDataPositionIndex));
        if (getDataSize() == 1) {
            if (((LineStyle) this.mStyle).getSinglePointSize() > 0.0f) {
                Paint linePaint = this.paintProvider.getLinePaint();
                linePaint.setStyle(Paint.Style.FILL);
                canvas.drawCircle(shownDataHorizonalValue, shownDataVerticalValue, ((LineStyle) this.mStyle).getSinglePointSize(), linePaint);
                return;
            }
            return;
        }
        this.r.moveTo(shownDataHorizonalValue, this.hmChart.getDrawAreaManager().getBottom());
        this.q.moveTo(shownDataHorizonalValue, shownDataVerticalValue);
        this.r.lineTo(shownDataHorizonalValue, shownDataVerticalValue);
        for (int canvasStart = getCanvasStart() - 1; canvasStart <= getCanvasEnd() + 1; canvasStart++) {
            if (this.hmChart.getChartDataManager().hasDataAtPositionIndex(canvasStart)) {
                shownDataHorizonalValue = getShownDataHorizonalValue(getPositionByPosIndex(canvasStart));
                final float shownDataVerticalValue2 = getShownDataVerticalValue(getPositionByValuePositionIndex(canvasStart));
                this.q.lineTo(shownDataHorizonalValue, shownDataVerticalValue2);
                this.r.lineTo(shownDataHorizonalValue, shownDataVerticalValue2);
                HMLog.verbose(u, new Function0() { // from class: rn4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LineRender.S(shownDataHorizonalValue, shownDataVerticalValue2);
                    }
                });
            }
        }
        this.r.lineTo(shownDataHorizonalValue, this.hmChart.getDrawAreaManager().getBottom());
        if (this.l != null) {
            String str2 = u;
            HMLog.verbose(str2, new Function0() { // from class: nn4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LineRender.T();
                }
            });
            canvas.save();
            canvas.clipPath(this.r);
            HMLog.verbose(str2, new Function0() { // from class: tn4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.a.G();
                }
            });
            HMLog.verbose(str2, new Function0() { // from class: hn4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.a.H();
                }
            });
            if (this.hmChart.getInteractiveManager().getCurrentIndex() == Index.INVALID_INDEX || !((LineStyle) this.mStyle).getShadowShownBeforeIndex()) {
                HMLog.verbose(str2, new Function0() { // from class: vn4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return this.a.I();
                    }
                });
                HMLog.verbose(str2, new Function0() { // from class: yn4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return this.a.J();
                    }
                });
                this.l.setBounds((int) this.hmChart.getDrawAreaManager().getLeft(), (int) this.hmChart.getDrawAreaManager().getTop(), (int) this.hmChart.getDrawAreaManager().getRight(), (int) this.hmChart.getDrawAreaManager().getBottom());
            } else {
                this.l.setBounds((int) this.hmChart.getDrawAreaManager().getLeft(), (int) this.hmChart.getDrawAreaManager().getTop(), (int) getShownDataHorizonalValue(getPositionByPosIndex(this.hmChart.getInteractiveManager().getCurrentIndex().getPosiIndex().getIndex())), (int) this.hmChart.getDrawAreaManager().getBottom());
            }
            this.l.draw(canvas);
            canvas.restore();
        }
        Paint linePaint2 = this.paintProvider.getLinePaint();
        linePaint2.setPathEffect(this.p);
        HMLog.verbose(u, new Function0() { // from class: in4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LineRender.K();
            }
        });
        if (((LineStyle) this.mStyle).isFadingInAndOut()) {
            int alphaComponent = ColorUtils.setAlphaComponent(this.o.getColor(), 51);
            linePaint2.setShader(y(new int[]{alphaComponent, this.o.getColor(), this.o.getColor(), this.o.getColor(), this.o.getColor(), alphaComponent}, new float[]{0.0f, 0.01f, 0.01f, 0.99f, 0.99f, 1.0f}));
        }
        canvas.drawPath(this.q, linePaint2);
        ArrayList<RangeIndex> subIndex = ((LineStyle) this.mStyle).getSubIndex();
        if (subIndex == null || subIndex.isEmpty()) {
            return;
        }
        for (int i = 0; i < subIndex.size(); i++) {
            int i2 = subIndex.get(i).start;
            int i3 = subIndex.get(i).end;
            final float shownDataHorizonalValue2 = getShownDataHorizonalValue(getPositionByPosIndex(i2));
            float shownDataVerticalValue3 = getShownDataVerticalValue(getPositionByValuePositionIndex(i2));
            this.t.moveTo(shownDataHorizonalValue2, this.hmChart.getDrawAreaManager().getBottom());
            this.s.moveTo(shownDataHorizonalValue2, shownDataVerticalValue3);
            this.t.lineTo(shownDataHorizonalValue2, shownDataVerticalValue3);
            while (i2 <= i3) {
                if (this.hmChart.getChartDataManager().hasDataAtPositionIndex(i2)) {
                    shownDataHorizonalValue2 = getShownDataHorizonalValue(getPositionByPosIndex(i2));
                    final float shownDataVerticalValue4 = getShownDataVerticalValue(getPositionByValuePositionIndex(i2));
                    this.s.lineTo(shownDataHorizonalValue2, shownDataVerticalValue4);
                    this.t.lineTo(shownDataHorizonalValue2, shownDataVerticalValue4);
                    HMLog.verbose(u, new Function0() { // from class: fn4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LineRender.L(shownDataHorizonalValue2, shownDataVerticalValue4);
                        }
                    });
                }
                i2++;
            }
            this.t.lineTo(shownDataHorizonalValue2, this.hmChart.getDrawAreaManager().getBottom());
            if (this.m != null) {
                String str3 = u;
                HMLog.verbose(str3, new Function0() { // from class: kn4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LineRender.M();
                    }
                });
                canvas.save();
                canvas.clipPath(this.t);
                if (this.hmChart.getInteractiveManager().getCurrentIndex() == Index.INVALID_INDEX || !((LineStyle) this.mStyle).getShadowShownBeforeIndex()) {
                    HMLog.verbose(str3, new Function0() { // from class: sn4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return this.a.N();
                        }
                    });
                    HMLog.verbose(str3, new Function0() { // from class: gn4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return this.a.O();
                        }
                    });
                    this.m.setBounds((int) this.hmChart.getDrawAreaManager().getLeft(), (int) this.hmChart.getDrawAreaManager().getTop(), (int) this.hmChart.getDrawAreaManager().getRight(), (int) this.hmChart.getDrawAreaManager().getBottom());
                } else {
                    this.m.setBounds((int) this.hmChart.getDrawAreaManager().getLeft(), (int) this.hmChart.getDrawAreaManager().getTop(), (int) getShownDataHorizonalValue(getPositionByPosIndex(this.hmChart.getInteractiveManager().getCurrentIndex().getPosiIndex().getIndex())), (int) this.hmChart.getDrawAreaManager().getBottom());
                }
                this.m.draw(canvas);
                canvas.restore();
            }
            Paint subLinePaint = this.paintProvider.getSubLinePaint();
            if (((LineStyle) this.mStyle).getSubLinePathEffect() != null) {
                subLinePaint.setPathEffect(((LineStyle) this.mStyle).getSubLinePathEffect());
            } else {
                subLinePaint.setPathEffect(this.p);
            }
            HMLog.verbose(u, new Function0() { // from class: mn4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LineRender.P();
                }
            });
            canvas.drawPath(this.s, subLinePaint);
        }
    }

    private void C(List<Integer> list, Canvas canvas) {
        if (list.size() < 1 || ((LineStyle) this.mStyle).getDataPointRadius() <= 0.0f) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            Paint linePaint = this.paintProvider.getLinePaint();
            float shownDataHorizonalValue = getShownDataHorizonalValue(getPositionByPosIndex(list.get(i).intValue()));
            float shownDataVerticalValue = getShownDataVerticalValue(getPositionByValuePositionIndex(list.get(i).intValue()));
            linePaint.setStyle(Paint.Style.FILL);
            linePaint.setColor(((LineStyle) this.mStyle).getDataPointBorderColor());
            canvas.drawCircle(shownDataHorizonalValue, shownDataVerticalValue, ((LineStyle) this.mStyle).getDataPointBorderRadius(), linePaint);
            linePaint.setColor(((LineStyle) this.mStyle).getLineColor());
            canvas.drawCircle(shownDataHorizonalValue, shownDataVerticalValue, ((LineStyle) this.mStyle).getDataPointRadius(), linePaint);
        }
    }

    private void D(Canvas canvas) {
        int i;
        ArrayList<RangeIndex> subIndex = ((LineStyle) this.mStyle).getSubIndex();
        ArrayList<int[]> subIndexShadowColors = ((LineStyle) this.mStyle).getSubIndexShadowColors();
        if (subIndex == null || subIndex.isEmpty()) {
            return;
        }
        if (subIndexShadowColors != null && !subIndexShadowColors.isEmpty() && subIndex.size() != subIndexShadowColors.size()) {
            HMLog.verbose(u, new Function0() { // from class: jn4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LineRender.U();
                }
            });
            return;
        }
        for (int i2 = 0; i2 < subIndex.size(); i2++) {
            this.s.reset();
            this.t.reset();
            int i3 = subIndex.get(i2).start;
            int i4 = subIndex.get(i2).end;
            float shownDataHorizonalValue = getShownDataHorizonalValue(getPositionByPosIndex(i3));
            float shownDataVerticalValue = getShownDataVerticalValue(getPositionByValuePositionIndex(i3));
            for (int i5 = i3; i5 < i4; i5++) {
                if (this.hmChart.getChartDataManager().hasDataAtPositionIndex(i5)) {
                    shownDataHorizonalValue = getShownDataHorizonalValue(getPositionByPosIndex(i5));
                    shownDataVerticalValue = getShownDataVerticalValue(getPositionByValuePositionIndex(i5));
                    this.s.moveTo(shownDataHorizonalValue, shownDataVerticalValue);
                    this.t.moveTo(shownDataHorizonalValue, this.hmChart.getDrawAreaManager().getBottom());
                    this.t.lineTo(shownDataHorizonalValue, shownDataVerticalValue);
                    break;
                }
            }
            int i6 = i3;
            int i7 = i6;
            int i8 = i7;
            float f = shownDataVerticalValue;
            while (i7 <= i4) {
                if (!this.hmChart.getChartDataManager().hasDataAtPositionIndex(i7) || (((LineStyle) this.mStyle).getSubPoints() != null && ((LineStyle) this.mStyle).getSubPoints().contains(Integer.valueOf(i7)))) {
                    i = i7;
                } else {
                    float shownDataHorizonalValue2 = getShownDataHorizonalValue(getPositionByPosIndex(i7));
                    float shownDataVerticalValue2 = getShownDataVerticalValue(getPositionByValuePositionIndex(i7));
                    float f2 = shownDataVerticalValue2 < shownDataVerticalValue ? shownDataVerticalValue2 : shownDataVerticalValue;
                    float f3 = shownDataHorizonalValue + ((shownDataHorizonalValue2 - shownDataHorizonalValue) / 2.0f);
                    if (((LineStyle) this.mStyle).getDisconnectLineGap() <= 0 || (i7 - i6 <= ((LineStyle) this.mStyle).getDisconnectLineGap() && i3 != i4)) {
                        float f4 = f;
                        i = i7;
                        this.s.cubicTo(f3, f4, f3, shownDataVerticalValue2, shownDataHorizonalValue2, shownDataVerticalValue2);
                        this.t.cubicTo(f3, f4, f3, shownDataVerticalValue2, shownDataHorizonalValue2, shownDataVerticalValue2);
                        f = shownDataVerticalValue2;
                        shownDataVerticalValue = f2;
                        shownDataHorizonalValue = shownDataHorizonalValue2;
                        i6 = i;
                    } else {
                        this.s.moveTo(shownDataHorizonalValue2, shownDataVerticalValue2);
                        if (i7 != i4) {
                            i8 = i7 + 1;
                        }
                        if (((LineStyle) this.mStyle).isShowGapPoint() && (i8 - i7 > ((LineStyle) this.mStyle).getDisconnectLineGap() || i7 == i4 || i3 == i4)) {
                            canvas.drawCircle(shownDataHorizonalValue2, shownDataVerticalValue2, ((LineStyle) this.mStyle).getGapPointSize(), this.paintProvider.getGapSubPointPaint());
                            this.t.lineTo(shownDataHorizonalValue, this.hmChart.getDrawAreaManager().getBottom());
                            this.t.lineTo(shownDataHorizonalValue2, this.hmChart.getDrawAreaManager().getBottom());
                        } else {
                            this.t.lineTo(shownDataHorizonalValue, this.hmChart.getDrawAreaManager().getBottom());
                            this.t.lineTo(shownDataHorizonalValue2, this.hmChart.getDrawAreaManager().getBottom());
                            this.t.lineTo(shownDataHorizonalValue2, shownDataVerticalValue2);
                        }
                        f = shownDataVerticalValue2;
                        shownDataHorizonalValue = shownDataHorizonalValue2;
                        i6 = i7;
                        i = i6;
                        shownDataVerticalValue = f2;
                    }
                }
                i7 = i + 1;
            }
            this.t.lineTo(shownDataHorizonalValue, this.hmChart.getDrawAreaManager().getBottom());
            HMGradientDrawable hMGradientDrawable = ((LineStyle) this.mStyle).getSubIndexShadowColors().get(i2) != null ? new HMGradientDrawable(((LineStyle) this.mStyle).getSubIndexShadowColors().get(i2)) : null;
            if (hMGradientDrawable != null) {
                canvas.save();
                canvas.clipPath(this.t);
                if (this.hmChart.getInteractiveManager().getCurrentIndex() == Index.INVALID_INDEX || !((LineStyle) this.mStyle).getShadowShownBeforeIndex()) {
                    String str = u;
                    HMLog.verbose(str, new Function0() { // from class: wn4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return this.a.V();
                        }
                    });
                    HMLog.verbose(str, new Function0() { // from class: xn4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return this.a.W();
                        }
                    });
                    hMGradientDrawable.setBounds((int) getShownDataHorizonalValue(getPositionByPosIndex(i3)), (int) shownDataVerticalValue, (int) getShownDataHorizonalValue(getPositionByPosIndex(i4)), (int) this.hmChart.getDrawAreaManager().getBottom());
                } else {
                    hMGradientDrawable.setBounds((int) this.hmChart.getDrawAreaManager().getLeft(), (int) this.hmChart.getDrawAreaManager().getTop(), (int) getShownDataHorizonalValue(getPositionByPosIndex(this.hmChart.getInteractiveManager().getCurrentIndex().getPosiIndex().getIndex())), (int) this.hmChart.getDrawAreaManager().getBottom());
                }
                hMGradientDrawable.draw(canvas);
                canvas.restore();
            }
            Paint subLinePaint = this.paintProvider.getSubLinePaint();
            if (((LineStyle) this.mStyle).getSubLinePathEffect() != null) {
                subLinePaint.setPathEffect(((LineStyle) this.mStyle).getSubLinePathEffect());
            } else {
                subLinePaint.setPathEffect(this.p);
            }
            if (((LineStyle) this.mStyle).getSubIndexShadowColors().get(i2) != null) {
                subLinePaint.setColor(((LineStyle) this.mStyle).getSubIndexShadowColors().get(i2)[0]);
            }
            if (((LineStyle) this.mStyle).getSubBezierLineColor() != -1) {
                subLinePaint.setColor(((LineStyle) this.mStyle).getSubBezierLineColor());
            }
            HMLog.verbose(u, new Function0() { // from class: pn4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LineRender.X();
                }
            });
            canvas.drawPath(this.s, subLinePaint);
        }
    }

    private void E(Canvas canvas) {
        int iIntValue;
        ChartData dataByPositionIndex;
        ArrayList<Integer> subPoints = ((LineStyle) this.mStyle).getSubPoints();
        if (subPoints == null || subPoints.isEmpty()) {
            return;
        }
        Paint subPointPaint = this.paintProvider.getSubPointPaint();
        for (int i = 0; i < subPoints.size() && (dataByPositionIndex = this.hmChart.getChartDataManager().getDataByPositionIndex((iIntValue = subPoints.get(i).intValue()))) != null; i++) {
            float shownDataHorizonalValue = getShownDataHorizonalValue(getPositionByPosIndex(iIntValue));
            float shownDataVerticalValue = getShownDataVerticalValue(getPositionByValuePositionIndex(iIntValue));
            subPointPaint.setColor(((LineStyle) this.mStyle).getSubPointColor());
            if (dataByPositionIndex.getDataExtends() != null) {
                Iterator<IDataExtendListener<?>> it2 = dataByPositionIndex.getDataExtends().iterator();
                while (it2.hasNext()) {
                    Object obj = it2.next().get(dataByPositionIndex.getBaseIndex());
                    if (obj instanceof HMColor) {
                        subPointPaint.setColor(((HMColor) obj).getRawColor());
                    }
                }
            }
            canvas.drawCircle(shownDataHorizonalValue, shownDataVerticalValue, ((LineStyle) this.mStyle).getSubPointRadius(), subPointPaint);
        }
    }

    private Integer F(List<Integer> list, float f) {
        int i = 0;
        float fAbs = Math.abs(getShownDataHorizonalValue(getPositionByPosIndex(list.get(0).intValue())) - f);
        for (int i2 = 1; i2 < list.size(); i2++) {
            float fAbs2 = Math.abs(getShownDataHorizonalValue(getPositionByPosIndex(list.get(i2).intValue())) - f);
            if (fAbs2 < fAbs) {
                i = i2;
                fAbs = fAbs2;
            }
        }
        return Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String G() {
        return "interactiveManager getIndex " + this.hmChart.getInteractiveManager().getCurrentIndex();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String H() {
        return "shadowShownBeforeIndex " + ((LineStyle) this.mStyle).getShadowShownBeforeIndex();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String I() {
        return this.hmChart.getDrawAreaManager().getLeft() + " " + this.hmChart.getDrawAreaManager().getTop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String J() {
        return this.hmChart.getDrawAreaManager().getRight() + " " + this.hmChart.getDrawAreaManager().getBottom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String K() {
        return "drwaPath....";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String L(float f, float f2) {
        return "lineTo " + f + " , " + f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String M() {
        return "null != mDrawable....";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String N() {
        return this.hmChart.getDrawAreaManager().getLeft() + " " + this.hmChart.getDrawAreaManager().getTop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String O() {
        return this.hmChart.getDrawAreaManager().getRight() + " " + this.hmChart.getDrawAreaManager().getBottom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String P() {
        return "drawPath....";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String Q() {
        return "drawCurvePath...";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String R() {
        return "xOffset " + this.hmChart.getInteractiveManager().getxOffset() + " start " + getCanvasStart();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String S(float f, float f2) {
        return "lineTo " + f + " , " + f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String T() {
        return "null != mDrawable....";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String U() {
        return "subIndex.size() != subIndexShadowColors.size()";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String V() {
        return this.hmChart.getDrawAreaManager().getLeft() + " " + this.hmChart.getDrawAreaManager().getTop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String W() {
        return this.hmChart.getDrawAreaManager().getRight() + " " + this.hmChart.getDrawAreaManager().getBottom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String X() {
        return "drawSubBezierPath....";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String Y(float f, float f2) {
        return "paintInteractive...\ncurrentDownX:" + f + "\nhighLightPosX" + f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String Z() {
        return "main path index list size is less than 2";
    }

    private void a0(List<Integer> list, Canvas canvas) {
        Index currentIndex;
        if (list.isEmpty() || (((LineStyle) this.mStyle).getInteractiveType() & 32) <= 0 || (currentIndex = this.hmChart.getInteractiveManager().getCurrentIndex()) == null || currentIndex.getDataIndex() == -1) {
            return;
        }
        if (((LineStyle) this.mStyle).isInteractiveUpCancel() && Float.isNaN(this.hmChart.getInteractiveManager().getCurrentDownX())) {
            return;
        }
        RectF cacheRectByDataIndex = this.hmChart.getHmDataCacheCenter().getCacheRectByDataIndex(currentIndex.getDataIndex());
        final float f = (cacheRectByDataIndex.left + cacheRectByDataIndex.right) / 2.0f;
        if (Float.isNaN(f)) {
            return;
        }
        HMLog.verbose(u, new Function0() { // from class: qn4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LineRender.Y(f, f);
            }
        });
        float top = this.hmChart.getDrawAreaManager().getTop();
        float bottom = this.hmChart.getDrawAreaManager().getBottom();
        this.o.setStrokeWidth(((LineStyle) this.mStyle).getHighlightLineWidth());
        this.o.setColor(((LineStyle) this.mStyle).getHighlightLineColor());
        canvas.drawLine(f, bottom, f, top, this.o);
    }

    private void b0(List<Integer> list, Canvas canvas) {
        Index currentIndex;
        if ((((LineStyle) this.mStyle).getInteractiveType() & 32) <= 0 || ((LineStyle) this.mStyle).getIntersectionPointSize() <= 0.0f || (currentIndex = this.hmChart.getInteractiveManager().getCurrentIndex()) == null || currentIndex.getDataIndex() == -1) {
            return;
        }
        if (((LineStyle) this.mStyle).isInteractiveUpCancel() && Float.isNaN(this.hmChart.getInteractiveManager().getCurrentDownX())) {
            return;
        }
        Paint paint = new Paint(1);
        RectF cacheRectByDataIndex = this.hmChart.getHmDataCacheCenter().getCacheRectByDataIndex(currentIndex.getDataIndex());
        float f = (cacheRectByDataIndex.left + cacheRectByDataIndex.right) / 2.0f;
        int lineColor = ((LineStyle) this.mStyle).getLineColor();
        if (-1 != ((LineStyle) this.mStyle).getIntersectionPointColor()) {
            lineColor = ((LineStyle) this.mStyle).getIntersectionPointColor();
        }
        float shownDataVerticalValue = getShownDataVerticalValue(getPositionByValuePositionIndex(list.get(currentIndex.getDataIndex()).intValue()));
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(lineColor);
        canvas.drawCircle(f, shownDataVerticalValue, ((LineStyle) this.mStyle).getIntersectionPointSize(), paint);
        if (((LineStyle) this.mStyle).getIntersectionPointBorderWidth() > 0.0f) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(-1);
            paint.setStrokeWidth(((LineStyle) this.mStyle).getIntersectionPointBorderWidth());
            canvas.drawCircle(f, shownDataVerticalValue, ((LineStyle) this.mStyle).getIntersectionPointSize() + (((LineStyle) this.mStyle).getIntersectionPointBorderWidth() / 2.0f), paint);
        }
    }

    private void c0(List<Integer> list, Canvas canvas) {
        float shownDataVerticalValue;
        float f;
        int i;
        int i2;
        if (list.size() < 1) {
            return;
        }
        if (list.size() == 1) {
            if (((LineStyle) this.mStyle).getSinglePointSize() > 0.0f) {
                float shownDataHorizonalValue = getShownDataHorizonalValue(getPositionByPosIndex(list.get(0).intValue()));
                float shownDataVerticalValue2 = getShownDataVerticalValue(getPositionByValuePositionIndex(list.get(0).intValue()));
                Paint linePaint = this.paintProvider.getLinePaint();
                linePaint.setStyle(Paint.Style.FILL);
                canvas.drawCircle(shownDataHorizonalValue, shownDataVerticalValue2, ((LineStyle) this.mStyle).getSinglePointSize(), linePaint);
            }
            HMLog.verbose(u, new Function0() { // from class: on4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LineRender.Z();
                }
            });
            return;
        }
        this.i.reset();
        this.j.reset();
        this.k.reset();
        int iIntValue = list.get(0).intValue();
        float shownDataHorizonalValue2 = getShownDataHorizonalValue(getPositionByPosIndex(iIntValue));
        float shownDataVerticalValue3 = getShownDataVerticalValue(getPositionByValuePositionIndex(iIntValue));
        this.i.moveTo(shownDataHorizonalValue2, shownDataVerticalValue3);
        this.k.moveTo(shownDataHorizonalValue2, shownDataVerticalValue3);
        this.j.moveTo(shownDataHorizonalValue2, this.hmChart.getDrawAreaManager().getBottom());
        this.j.lineTo(shownDataHorizonalValue2, shownDataVerticalValue3);
        float f2 = shownDataVerticalValue3;
        int i3 = 1;
        float f3 = shownDataHorizonalValue2;
        int iIntValue2 = iIntValue;
        while (i3 < list.size()) {
            int iIntValue3 = list.get(i3).intValue();
            float shownDataHorizonalValue3 = getShownDataHorizonalValue(getPositionByPosIndex(iIntValue3));
            float shownDataVerticalValue4 = getShownDataVerticalValue(getPositionByValuePositionIndex(iIntValue3));
            float f4 = f3 + ((shownDataHorizonalValue3 - f3) / 2.0f);
            if (((LineStyle) this.mStyle).getDisconnectLineGap() <= 0 || iIntValue3 - iIntValue <= ((LineStyle) this.mStyle).getDisconnectLineGap()) {
                f = shownDataVerticalValue4;
                f3 = shownDataHorizonalValue3;
                i = iIntValue3;
                i2 = i3;
                this.i.cubicTo(f4, f2, f4, f, f3, f);
                this.j.cubicTo(f4, f2, f4, f, f3, f);
            } else {
                this.i.moveTo(shownDataHorizonalValue3, shownDataVerticalValue4);
                this.k.moveTo(f3, f2);
                int i4 = i3 + 1;
                if (i4 != list.size()) {
                    iIntValue2 = list.get(i4).intValue();
                }
                if (!((LineStyle) this.mStyle).isShowGapPoint() || (iIntValue2 - iIntValue3 <= ((LineStyle) this.mStyle).getDisconnectLineGap() && i4 != list.size())) {
                    f = shownDataVerticalValue4;
                    i = iIntValue3;
                    i2 = i3;
                    if (((LineStyle) this.mStyle).isShowGapPoint() && i2 == 1) {
                        canvas.drawCircle(f3, f2, ((LineStyle) this.mStyle).getGapPointSize(), this.paintProvider.getGapPointPaint());
                        this.j.lineTo(f3, this.hmChart.getDrawAreaManager().getBottom());
                        this.j.lineTo(shownDataHorizonalValue3, this.hmChart.getDrawAreaManager().getBottom());
                        f3 = shownDataHorizonalValue3;
                        this.k.cubicTo(f4, f2, f4, f, shownDataHorizonalValue3, f);
                    } else {
                        this.j.lineTo(f3, this.hmChart.getDrawAreaManager().getBottom());
                        this.j.lineTo(shownDataHorizonalValue3, this.hmChart.getDrawAreaManager().getBottom());
                        this.j.lineTo(shownDataHorizonalValue3, f);
                        f3 = shownDataHorizonalValue3;
                        this.k.cubicTo(f4, f2, f4, f, shownDataHorizonalValue3, f);
                    }
                } else {
                    if (i3 == 1) {
                        canvas.drawCircle(f3, f2, ((LineStyle) this.mStyle).getGapPointSize(), this.paintProvider.getGapPointPaint());
                    }
                    canvas.drawCircle(shownDataHorizonalValue3, shownDataVerticalValue4, ((LineStyle) this.mStyle).getGapPointSize(), this.paintProvider.getGapPointPaint());
                    this.j.lineTo(f3, this.hmChart.getDrawAreaManager().getBottom());
                    this.j.lineTo(shownDataHorizonalValue3, this.hmChart.getDrawAreaManager().getBottom());
                    f = shownDataVerticalValue4;
                    f3 = shownDataHorizonalValue3;
                    i = iIntValue3;
                    i2 = i3;
                    this.k.cubicTo(f4, f2, f4, f, f3, f);
                }
            }
            i3 = i2 + 1;
            f2 = f;
            iIntValue = i;
        }
        this.j.lineTo(f3, this.hmChart.getDrawAreaManager().getBottom());
        if (this.l != null) {
            canvas.save();
            canvas.clipPath(this.j);
            float bottom = this.hmChart.getDrawAreaManager().getBottom();
            if (((LineStyle) this.mStyle).getGradientDrawableRectValue() != null) {
                HMGradientDrawableRectValue gradientDrawableRectValue = ((LineStyle) this.mStyle).getGradientDrawableRectValue();
                shownDataVerticalValue = getShownDataVerticalValue(getPositionByValue(gradientDrawableRectValue.getTop()));
                bottom = getShownDataVerticalValue(getPositionByValue(gradientDrawableRectValue.getBottom()));
            } else {
                shownDataVerticalValue = 0.0f;
            }
            if (this.hmChart.getInteractiveManager().getCurrentIndex() == Index.INVALID_INDEX || !((LineStyle) this.mStyle).getShadowShownBeforeIndex()) {
                this.l.setBounds((int) this.hmChart.getDrawAreaManager().getLeft(), (int) shownDataVerticalValue, (int) this.hmChart.getDrawAreaManager().getRight(), (int) bottom);
            } else {
                this.l.setBounds((int) this.hmChart.getDrawAreaManager().getLeft(), (int) shownDataVerticalValue, (int) getShownDataHorizonalValue(getPositionByPosIndex(this.hmChart.getInteractiveManager().getCurrentIndex().getPosiIndex().getIndex())), (int) bottom);
            }
            this.l.draw(canvas);
            canvas.restore();
        }
        Paint linePaint2 = this.paintProvider.getLinePaint();
        if (((LineStyle) this.mStyle).getDividerValue() != -1.0f) {
            float positionByValue = getPositionByValue(((LineStyle) this.mStyle).getDividerValue());
            float top = this.hmChart.getDrawAreaManager().getTop();
            float bottom2 = this.hmChart.getDrawAreaManager().getBottom();
            float left = this.hmChart.getDrawAreaManager().getLeft();
            float right = this.hmChart.getDrawAreaManager().getRight();
            linePaint2.setColor(((LineStyle) this.mStyle).getAboveDividerLineColor());
            canvas.save();
            canvas.clipRect(left, top, right, positionByValue);
            canvas.drawPath(this.i, linePaint2);
            canvas.restore();
            linePaint2.setColor(((LineStyle) this.mStyle).getBelowDividerLineColor());
            canvas.save();
            canvas.clipRect(left, positionByValue, right, bottom2);
            canvas.drawPath(this.i, linePaint2);
            canvas.restore();
            return;
        }
        if (((LineStyle) this.mStyle).getMultiColorLines() != null && ((LineStyle) this.mStyle).getMultiColorLines().length > 0) {
            MultiColorLine[] multiColorLines = ((LineStyle) this.mStyle).getMultiColorLines();
            ArraysKt___ArraysKt.sortDescending(multiColorLines);
            for (MultiColorLine multiColorLine : multiColorLines) {
                z(canvas, linePaint2, multiColorLine);
            }
            return;
        }
        if (((LineStyle) this.mStyle).isFadingInAndOut()) {
            int alphaComponent = ColorUtils.setAlphaComponent(linePaint2.getColor(), 51);
            linePaint2.setShader(y(new int[]{alphaComponent, linePaint2.getColor(), linePaint2.getColor(), linePaint2.getColor(), linePaint2.getColor(), alphaComponent}, new float[]{0.0f, 0.01f, 0.01f, 0.99f, 0.99f, 1.0f}));
        }
        canvas.drawPath(this.i, linePaint2);
        if (((LineStyle) this.mStyle).getGapDashPathEffect() != null) {
            linePaint2.setPathEffect(((LineStyle) this.mStyle).getGapDashPathEffect());
            canvas.drawPath(this.k, linePaint2);
        }
    }

    private LinearGradient y(int[] iArr, float[] fArr) {
        return new LinearGradient(this.hmChart.getDrawAreaManager().getLeft(), 0.0f, this.hmChart.getDrawAreaManager().getRight(), 0.0f, iArr, fArr, Shader.TileMode.CLAMP);
    }

    private void z(Canvas canvas, Paint paint, MultiColorLine multiColorLine) {
        float positionByValue = getPositionByValue(multiColorLine.getYFloatArray()[0]);
        float positionByValue2 = getPositionByValue(multiColorLine.getYFloatArray()[1]);
        float left = this.hmChart.getDrawAreaManager().getLeft();
        float right = this.hmChart.getDrawAreaManager().getRight();
        paint.setColor(multiColorLine.getLineColor());
        canvas.save();
        canvas.clipRect(left, positionByValue, right, positionByValue2);
        canvas.drawPath(this.i, paint);
        canvas.restore();
    }

    @Override // com.huami.chart.render.BaseRender
    public void draw(Canvas canvas, int i, int i2, float f) {
        super.draw(canvas, i, i2, f);
        int[] shadowColors = ((LineStyle) this.mStyle).getShadowColors();
        int[] subShadowColors = ((LineStyle) this.mStyle).getSubShadowColors();
        if (shadowColors != null && this.l == null) {
            this.l = new HMGradientDrawable(shadowColors);
        }
        if (subShadowColors != null && this.m == null) {
            this.m = new HMGradientDrawable(subShadowColors);
        }
        canvas.save();
        if (((LineStyle) this.mStyle).getClipStart() != ((LineStyle) this.mStyle).getClipEnd()) {
            canvas.clipRect(((LineStyle) this.mStyle).getClipStart(), ((LineStyle) this.mStyle).getClipTop(), this.hmChart.getDrawAreaManager().getWidth() - ((LineStyle) this.mStyle).getClipEnd(), this.hmChart.getDrawAreaManager().getHeight() - ((LineStyle) this.mStyle).getClipBtm());
        }
        if ((((LineStyle) this.mStyle).getLineStyle() & 4) > 0) {
            A(canvas);
        } else if ((((LineStyle) this.mStyle).getLineStyle() & 2) > 0) {
            B(canvas);
        } else if ((((LineStyle) this.mStyle).getLineStyle() & 8) <= 0) {
            ((LineStyle) this.mStyle).getLineStyle();
        }
        canvas.restore();
    }
}
