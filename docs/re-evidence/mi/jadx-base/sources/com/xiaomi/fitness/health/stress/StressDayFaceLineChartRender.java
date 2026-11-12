package com.xiaomi.fitness.health.stress;

import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import defpackage.eu3;
import defpackage.gni;
import defpackage.j22;
import defpackage.onq;
import defpackage.sf2;
import defpackage.vfe;
import defpackage.zfe;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 L2\u00020\u0001:\u0001LB\u0019\u0012\u0006\u0010C\u001a\u00020B\u0012\b\u0010>\u001a\u0004\u0018\u00010=¢\u0006\u0004\bJ\u0010KJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004JQ\u0010\u0013\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014JS\u0010\u001a\u001a\u00020\u0002\"\n\b\u0000\u0010\u0015*\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010 \u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u000eH\u0002¢\u0006\u0004\b \u0010\u001fJ'\u0010#\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b#\u0010$JK\u0010#\u001a\u00020\u0002\"\n\b\u0000\u0010\u0015*\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010%\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u000eH\u0002¢\u0006\u0004\b#\u0010&JI\u0010)\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t2\u0006\u0010%\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b)\u0010*J?\u0010.\u001a\u00020\u0002\"\n\b\u0000\u0010\u0015*\u0004\u0018\u00010\f\"\n\b\u0001\u0010,*\u0004\u0018\u00010+2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010-\u001a\u00028\u0001H\u0002¢\u0006\u0004\b.\u0010/J\u001f\u00102\u001a\u00020\u00112\u0006\u00100\u001a\u00020\t2\u0006\u0010\u0006\u001a\u000201H\u0002¢\u0006\u0004\b2\u00103J;\u00104\u001a\u00020\u0002\"\n\b\u0000\u0010\u0015*\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u00100\u001a\u00020\t2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b4\u00105J!\u00109\u001a\u0004\u0018\u0001072\u0006\u00106\u001a\u00020\u000e2\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u0002072\u0006\u00106\u001a\u00020\u000eH\u0002¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020\u00022\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b?\u0010@J3\u0010A\u001a\u00020\u0002\"\n\b\u0000\u0010,*\u0004\u0018\u00010+2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010-\u001a\u00028\u0000H\u0016¢\u0006\u0004\bA\u0010/R\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010GR\u0014\u0010I\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010G¨\u0006M"}, d2 = {"Lcom/xiaomi/fitness/health/stress/StressDayFaceLineChartRender;", "Lzfe;", "", "initChartPaint", "()V", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/PointF;", "pointFLeft", "pointFRight", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "barEntry", "", "crossX", "yZeroLine", "", "crossLeft", "drawLineCross", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/graphics/Canvas;Landroid/graphics/PointF;Landroid/graphics/PointF;Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;FFZ)V", "T", "pointF0", "pointF1", "pointIntercept", "yZero", "drawChartLineCross", "(Landroid/graphics/Canvas;Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;ZF)V", "pointF2", "radius", "getTheCrossPointFLeft", "(Landroid/graphics/PointF;Landroid/graphics/PointF;F)Landroid/graphics/PointF;", "getTheCrossPointFRight", "", "points", "drawChartLine", "(Landroid/graphics/Canvas;[FF)V", "barEntryLeft", "(Landroid/graphics/Canvas;Landroid/graphics/PointF;Landroid/graphics/PointF;Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;F)V", "pointF1Cross", "pointF2Cross", "drawLinearGradient", "(Landroid/graphics/Canvas;[FFLandroid/graphics/PointF;Landroid/graphics/PointF;Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;)V", "Lsf2;", "E", "mYAxis", "drawLineChartWithFaceIcon", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Lsf2;)V", "pointF", "Landroid/view/ViewGroup;", "checkoutIsInBoundary", "(Landroid/graphics/PointF;Landroid/view/ViewGroup;)Z", "drawCircle", "(Landroid/graphics/Canvas;Landroid/graphics/PointF;Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;Landroidx/recyclerview/widget/RecyclerView;)V", "stressValue", "", "deviceType", "getStressType", "(FI)Ljava/lang/Integer;", "getStressColor", "(F)I", "Lonq;", "highLightValueFormatter", "setHighLightValueFormatter", "(Lonq;)V", "drawLineChart", "Lvfe;", "mLineChartAttrs", "Lvfe;", "Landroid/graphics/Paint;", "mLineChartPaint", "Landroid/graphics/Paint;", "mPointChartPaint", "mLinePaint", "<init>", "(Lvfe;Lonq;)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class StressDayFaceLineChartRender extends zfe {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final vfe mLineChartAttrs;

    @NotNull
    private final Paint mLineChartPaint;

    @NotNull
    private final Paint mLinePaint;

    @NotNull
    private final Paint mPointChartPaint;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/health/stress/StressDayFaceLineChartRender$Companion;", "", "<init>", "()V", "createColorLinePath", "Landroid/graphics/Path;", "pointF1", "Landroid/graphics/PointF;", "pointF2", "bottom", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Path createColorLinePath(@NotNull PointF pointF1, @NotNull PointF pointF2, float bottom) {
            Intrinsics.checkNotNullParameter(pointF1, "pointF1");
            Intrinsics.checkNotNullParameter(pointF2, "pointF2");
            Path path = new Path();
            Logger.d("createColorLinePath", " pointF1:" + pointF1 + " pointF2:" + pointF2);
            path.moveTo(pointF1.x, pointF1.y);
            path.lineTo(pointF2.x, pointF2.y);
            path.lineTo(pointF1.x, bottom);
            path.close();
            return path;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StressDayFaceLineChartRender(@NotNull vfe mLineChartAttrs, @Nullable onq onqVar) {
        super(mLineChartAttrs, onqVar);
        Intrinsics.checkNotNullParameter(mLineChartAttrs, "mLineChartAttrs");
        this.mLineChartAttrs = mLineChartAttrs;
        this.mLineChartPaint = new Paint();
        this.mPointChartPaint = new Paint();
        this.mLinePaint = new Paint();
        this.mHighLightValueFormatter = onqVar;
        initChartPaint();
    }

    private final boolean checkoutIsInBoundary(PointF pointF, ViewGroup parent) {
        float paddingLeft = parent.getPaddingLeft();
        float width = parent.getWidth() - parent.getPaddingRight();
        float f = pointF.x;
        return f < width && f > paddingLeft;
    }

    private final void drawChartLine(Canvas canvas, float[] points, float yZeroLine) {
        Logger.i("StressDayFaceLineChartRender", "drawChartLine = ");
        Paint paint = this.mLinePaint;
        Intrinsics.checkNotNull(paint);
        int color = paint.getColor();
        if (((vfe) this.mBarChartAttrs).O0 == -1) {
            Paint paint2 = this.mLinePaint;
            Intrinsics.checkNotNull(paint2);
            paint2.setColor(((vfe) this.mBarChartAttrs).g0);
        } else {
            Paint paint3 = this.mLinePaint;
            Intrinsics.checkNotNull(paint3);
            paint3.setColor(((vfe) this.mBarChartAttrs).O0);
        }
        if (points.length >= 4 && points[1] >= yZeroLine && points[3] >= yZeroLine) {
            Paint paint4 = this.mLinePaint;
            Intrinsics.checkNotNull(paint4);
            paint4.setColor(0);
        }
        Paint paint5 = this.mLinePaint;
        Intrinsics.checkNotNull(paint5);
        canvas.drawLines(points, paint5);
        Paint paint6 = this.mLinePaint;
        Intrinsics.checkNotNull(paint6);
        paint6.setColor(color);
    }

    private final <T extends RecyclerBarEntry> void drawChartLineCross(Canvas canvas, PointF pointF0, PointF pointF1, PointF pointIntercept, T barEntry, boolean crossLeft, float yZero) {
        float f;
        Intrinsics.checkNotNull(barEntry);
        if (barEntry.isSelected()) {
            E e = this.mBarChartAttrs;
            f = ((vfe) e).L0 + ((vfe) e).M0;
        } else {
            f = 0.0f;
        }
        PointF theCrossPointFLeft = crossLeft ? getTheCrossPointFLeft(pointF0, pointF1, f) : getTheCrossPointFRight(pointF0, pointF1, f);
        drawChartLine(canvas, new float[]{pointIntercept.x, pointIntercept.y, theCrossPointFLeft.x, theCrossPointFLeft.y}, yZero);
    }

    private final <T extends RecyclerBarEntry> void drawCircle(Canvas canvas, PointF pointF, T barEntry, RecyclerView parent) {
        if (checkoutIsInBoundary(pointF, parent)) {
            Paint.Style style = this.mLineChartPaint.getStyle();
            Logger.d("stress chart = ", "drawCircle =" + barEntry);
            Intrinsics.checkNotNull(barEntry);
            if (getStressType(barEntry.getY(), 0) == null || !barEntry.getNeedShowIcon()) {
                return;
            }
            Resources resources = AppUtil.getApp().getResources();
            Integer stressType = getStressType(barEntry.getY(), 0);
            Intrinsics.checkNotNull(stressType);
            canvas.drawBitmap(BitmapFactory.decodeResource(resources, stressType.intValue()), (Rect) null, new RectF(pointF.x - DisplayUtil.dip2px(13.0f), pointF.y - DisplayUtil.dip2px(13.0f), pointF.x + DisplayUtil.dip2px(13.0f), pointF.y + DisplayUtil.dip2px(13.0f)), this.mLineChartPaint);
            this.mLineChartPaint.setStyle(style);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends RecyclerBarEntry, E extends sf2> void drawLineChartWithFaceIcon(Canvas canvas, RecyclerView parent, E mYAxis) {
        List<T> list;
        float f;
        RecyclerBarEntry recyclerBarEntry;
        int i;
        int i2;
        int i3;
        PointF pointF;
        List<T> list2;
        RecyclerBarEntry recyclerBarEntry2;
        RecyclerBarEntry recyclerBarEntry3;
        RecyclerBarEntry recyclerBarEntry4;
        PointF pointF2;
        int i4;
        int i5;
        int i6 = 1;
        float width = parent.getWidth() - parent.getPaddingRight();
        float paddingLeft = parent.getPaddingLeft();
        j22 j22Var = (j22) parent.getAdapter();
        Intrinsics.checkNotNull(j22Var);
        List<T> entries = j22Var.getEntries();
        int childCount = parent.getChildCount();
        int i7 = 0;
        int i8 = 0;
        while (i8 < childCount) {
            View childAt = parent.getChildAt(i8);
            RecyclerBarEntry recyclerBarEntry5 = (RecyclerBarEntry) childAt.getTag();
            Intrinsics.checkNotNull(recyclerBarEntry5);
            if (recyclerBarEntry5.getY() == 0.0f) {
                i7 += i6;
                i2 = i8;
                childCount = childCount;
                list = entries;
                paddingLeft = paddingLeft;
                i3 = i6;
            } else {
                int childAdapterPosition = parent.getChildAdapterPosition(childAt);
                RectF rectFF = eu3.f(childAt, parent, mYAxis, this.mBarChartAttrs, recyclerBarEntry5);
                float f2 = rectFF.bottom;
                list = entries;
                float f3 = 2;
                PointF pointF3 = new PointF((rectFF.left + rectFF.right) / f3, rectFF.top);
                if (i7 <= 0 || !this.breakPointLineFlag.booleanValue()) {
                    childAt = childAt;
                    i8 = i8;
                    childCount = childCount;
                    f = f2;
                    recyclerBarEntry = recyclerBarEntry5;
                    i = i7;
                } else {
                    if (i8 != i7) {
                        View childAt2 = parent.getChildAt((i8 - i7) - 1);
                        RecyclerBarEntry recyclerBarEntry6 = (RecyclerBarEntry) childAt2.getTag();
                        RectF rectFF2 = eu3.f(childAt2, parent, mYAxis, this.mBarChartAttrs, recyclerBarEntry6);
                        recyclerBarEntry = recyclerBarEntry5;
                        f = f2;
                        drawChartLine(canvas, new PointF((rectFF2.left + rectFF2.right) / f3, rectFF2.top), pointF3, recyclerBarEntry6, recyclerBarEntry, f);
                    } else {
                        f = f2;
                        recyclerBarEntry = recyclerBarEntry5;
                    }
                    i = 0;
                }
                if (i8 < childCount - 1) {
                    View childAt3 = parent.getChildAt(i8 + 1);
                    RecyclerBarEntry recyclerBarEntry7 = (RecyclerBarEntry) childAt3.getTag();
                    Intrinsics.checkNotNull(recyclerBarEntry7);
                    if (recyclerBarEntry7.getY() == 0.0f) {
                        drawCircle(canvas, pointF3, recyclerBarEntry, parent);
                        i2 = i8;
                    } else {
                        RecyclerBarEntry recyclerBarEntry8 = recyclerBarEntry;
                        RectF rectFF3 = eu3.f(childAt3, parent, mYAxis, this.mBarChartAttrs, recyclerBarEntry7);
                        PointF pointF4 = new PointF((rectFF3.left + rectFF3.right) / f3, rectFF3.top);
                        float f4 = pointF4.x;
                        if (f4 < paddingLeft || pointF3.x > width) {
                            pointF = pointF4;
                            i2 = i8;
                            list2 = list;
                            float f5 = f;
                            recyclerBarEntry2 = recyclerBarEntry7;
                            recyclerBarEntry3 = recyclerBarEntry8;
                            if (f4 >= paddingLeft || childAt3.getRight() < paddingLeft) {
                                recyclerBarEntry4 = recyclerBarEntry3;
                                list = list2;
                                pointF2 = pointF;
                            } else {
                                recyclerBarEntry4 = recyclerBarEntry3;
                                list = list2;
                                pointF2 = pointF;
                                drawLineCross(parent, canvas, pointF, pointF3, recyclerBarEntry3, paddingLeft, f5, false);
                            }
                            drawCircle(canvas, pointF2, recyclerBarEntry2, parent);
                            drawCircle(canvas, pointF3, recyclerBarEntry4, parent);
                        } else {
                            pointF = pointF4;
                            recyclerBarEntry4 = recyclerBarEntry8;
                            i2 = i8;
                            recyclerBarEntry2 = recyclerBarEntry7;
                            drawChartLine(canvas, pointF4, pointF3, recyclerBarEntry7, recyclerBarEntry4, f);
                            if (childAt3.getLeft() < paddingLeft) {
                                int i9 = childAdapterPosition + 2;
                                Intrinsics.checkNotNull(list);
                                if (i9 < list.size()) {
                                    float width2 = pointF.x - childAt3.getWidth();
                                    T t = list.get(i9);
                                    Intrinsics.checkNotNull(t);
                                    new PointF(width2, eu3.k(t.getY(), parent, mYAxis, this.mBarChartAttrs));
                                }
                                pointF2 = pointF;
                                drawCircle(canvas, pointF2, recyclerBarEntry2, parent);
                                drawCircle(canvas, pointF3, recyclerBarEntry4, parent);
                            } else {
                                list2 = list;
                                if (childAt.getRight() >= width || width - childAt.getRight() > childAt.getWidth() || (i4 = childAdapterPosition - 1) <= 0) {
                                    list = list2;
                                    pointF2 = pointF;
                                    drawCircle(canvas, pointF2, recyclerBarEntry2, parent);
                                    drawCircle(canvas, pointF3, recyclerBarEntry4, parent);
                                } else {
                                    Intrinsics.checkNotNull(list2);
                                    T t2 = list2.get(i4);
                                    Intrinsics.checkNotNull(t2);
                                    if (t2.getY() == 0.0f) {
                                        drawCircle(canvas, pointF, recyclerBarEntry2, parent);
                                        drawCircle(canvas, pointF3, recyclerBarEntry4, parent);
                                        list = list2;
                                    } else {
                                        recyclerBarEntry3 = recyclerBarEntry4;
                                        PointF pointF5 = new PointF(pointF3.x + childAt.getWidth(), eu3.k(t2.getY(), parent, mYAxis, this.mBarChartAttrs));
                                        float f6 = pointF5.x;
                                        if (f6 >= width) {
                                            PointF pointF6 = new PointF(width, pointF5.y);
                                            drawChartLine(canvas, new float[]{pointF3.x, pointF3.y, pointF6.x, pointF6.y}, f);
                                        } else if (f6 < width && (i5 = childAdapterPosition - 2) > 0) {
                                            T t3 = list2.get(i5);
                                            Intrinsics.checkNotNull(t3);
                                            if (t3.getY() == 0.0f) {
                                                drawCircle(canvas, pointF, recyclerBarEntry2, parent);
                                                drawCircle(canvas, pointF3, recyclerBarEntry3, parent);
                                                list = list2;
                                                paddingLeft = paddingLeft;
                                            } else {
                                                new PointF(Math.min(pointF5.x + childAt.getWidth(), width), eu3.k(t3.getY(), parent, mYAxis, this.mBarChartAttrs));
                                            }
                                        }
                                        recyclerBarEntry4 = recyclerBarEntry3;
                                        list = list2;
                                        pointF2 = pointF;
                                        drawCircle(canvas, pointF2, recyclerBarEntry2, parent);
                                        drawCircle(canvas, pointF3, recyclerBarEntry4, parent);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    paddingLeft = paddingLeft;
                    i2 = i8;
                    drawCircle(canvas, pointF3, recyclerBarEntry, parent);
                }
                i7 = i;
                i3 = 1;
            }
            i8 = i2 + 1;
            i6 = i3;
            paddingLeft = paddingLeft;
            entries = list;
            childCount = childCount;
        }
    }

    private final void drawLineCross(RecyclerView parent, Canvas canvas, PointF pointFLeft, PointF pointFRight, RecyclerBarEntry barEntry, float crossX, float yZeroLine, boolean crossLeft) {
        PointF pointFG = eu3.g(pointFLeft, pointFRight, crossX);
        Intrinsics.checkNotNull(pointFG);
        drawChartLineCross(canvas, pointFLeft, pointFRight, pointFG, barEntry, crossLeft, yZeroLine);
    }

    private final void drawLinearGradient(Canvas canvas, float[] points, float yZeroLine, PointF pointF1Cross, PointF pointF2Cross, RecyclerBarEntry barEntryLeft, RecyclerBarEntry barEntry) {
        this.mLinePaint.getColor();
        Logger.i("StressDayFaceLineChartRender", "drawLinearGradient barEntryLeft : " + barEntryLeft.getY() + " barEntry:" + barEntry.getY());
        this.mLinePaint.setShader(new LinearGradient(pointF1Cross.x, pointF1Cross.y, pointF2Cross.x, pointF2Cross.y, getStressColor(barEntryLeft.getY()), getStressColor(barEntry.getY()), Shader.TileMode.CLAMP));
        canvas.drawLine(pointF1Cross.x, pointF1Cross.y, pointF2Cross.x, pointF2Cross.y, this.mLinePaint);
    }

    private final int getStressColor(float stressValue) {
        if (stressValue <= 5.0f) {
            return Color.parseColor("#FF8A05");
        }
        if (stressValue > 5.0f && stressValue <= 15.0f) {
            return Color.parseColor("#FFBB00");
        }
        if (stressValue <= 15.0f || stressValue > 25.0f) {
            return (stressValue <= 25.0f || stressValue > 35.0f) ? Color.parseColor("#FF8A05") : Color.parseColor("#00DCC7");
        }
        return Color.parseColor("#A3E50B");
    }

    private final Integer getStressType(float stressValue, int deviceType) {
        if (stressValue == 5.0f) {
            return Integer.valueOf(gni.d);
        }
        if (stressValue == 15.0f) {
            return Integer.valueOf(gni.g);
        }
        if (stressValue == 25.0f) {
            return Integer.valueOf(gni.e);
        }
        if (stressValue == 35.0f) {
            return Integer.valueOf(gni.f);
        }
        return null;
    }

    private final PointF getTheCrossPointFLeft(PointF pointF1, PointF pointF2, float radius) {
        float fAbs = Math.abs(pointF1.x - pointF2.x);
        float fAbs2 = Math.abs(pointF1.y - pointF2.y);
        double dSqrt = ((double) (radius * 1.0f)) / Math.sqrt((fAbs * fAbs) + (fAbs2 * fAbs2));
        double d = ((double) fAbs2) * dSqrt;
        double d2 = ((double) fAbs) * dSqrt;
        PointF pointF = new PointF();
        float f = pointF1.y;
        if (f > pointF2.y) {
            pointF.y = (float) (((double) f) - d);
        } else {
            pointF.y = (float) (((double) f) + d);
        }
        float f2 = pointF1.x;
        if (f2 > pointF2.x) {
            pointF.x = (float) (((double) f2) - d2);
        } else {
            pointF.x = (float) (((double) f2) + d2);
        }
        return pointF;
    }

    private final PointF getTheCrossPointFRight(PointF pointF1, PointF pointF2, float radius) {
        float fAbs = Math.abs(pointF1.x - pointF2.x);
        float fAbs2 = Math.abs(pointF1.y - pointF2.y);
        double dSqrt = ((double) (radius * 1.0f)) / Math.sqrt((fAbs * fAbs) + (fAbs2 * fAbs2));
        double d = ((double) fAbs2) * dSqrt;
        double d2 = ((double) fAbs) * dSqrt;
        PointF pointF = new PointF();
        float f = pointF1.y;
        float f2 = pointF2.y;
        if (f > f2) {
            pointF.y = (float) (((double) f2) + d);
        } else {
            pointF.y = (float) (((double) f2) - d);
        }
        float f3 = pointF1.x;
        float f4 = pointF2.x;
        if (f3 > f4) {
            pointF.x = (float) (((double) f4) + d2);
        } else {
            pointF.x = (float) (((double) f4) - d2);
        }
        return pointF;
    }

    private final void initChartPaint() {
        this.mLineChartPaint.reset();
        this.mLineChartPaint.setAntiAlias(true);
        Paint paint = this.mLineChartPaint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = this.mLineChartPaint;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        this.mLineChartPaint.setStrokeJoin(Paint.Join.ROUND);
        this.mLineChartPaint.setStrokeWidth(ExtUtilsKt.getDp(Float.valueOf(1.3f)));
        this.mLineChartPaint.setColor(this.mLineChartAttrs.O0);
        this.mPointChartPaint.reset();
        this.mPointChartPaint.setAntiAlias(true);
        this.mPointChartPaint.setStyle(Paint.Style.FILL);
        this.mPointChartPaint.setStrokeCap(cap);
        this.mPointChartPaint.setStrokeWidth(ExtUtilsKt.getDp(Float.valueOf(0.8f)));
        this.mPointChartPaint.setColor(this.mLineChartAttrs.O0);
        this.mLinePaint.reset();
        this.mLinePaint.setAntiAlias(true);
        this.mLinePaint.setStyle(style);
        this.mLinePaint.setStrokeCap(cap);
        this.mLinePaint.setStrokeWidth(((vfe) this.mBarChartAttrs).N0);
        this.mLinePaint.setColor(((vfe) this.mBarChartAttrs).O0);
    }

    @Override // defpackage.zfe
    public <E extends sf2> void drawLineChart(@NotNull Canvas canvas, @NotNull RecyclerView parent, E mYAxis) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        drawLineChartWithFaceIcon(canvas, parent, mYAxis);
    }

    @Override // defpackage.zfe, com.xiaomi.fitness.chart.render.BaseChartRender
    public void setHighLightValueFormatter(@NotNull onq highLightValueFormatter) {
        Intrinsics.checkNotNullParameter(highLightValueFormatter, "highLightValueFormatter");
        this.mHighLightValueFormatter = highLightValueFormatter;
    }

    private final <T extends RecyclerBarEntry> void drawChartLine(Canvas canvas, PointF pointF1, PointF pointF2, T barEntryLeft, T barEntry, float yZero) {
        PointF theCrossPointFLeft;
        PointF theCrossPointFRight;
        Intrinsics.checkNotNull(barEntryLeft);
        if (barEntryLeft.isSelected()) {
            theCrossPointFLeft = getTheCrossPointFLeft(pointF1, pointF2, 0.0f);
            theCrossPointFRight = getTheCrossPointFRight(pointF1, pointF2, 0.0f);
        } else {
            Intrinsics.checkNotNull(barEntry);
            if (barEntry.isSelected()) {
                theCrossPointFLeft = getTheCrossPointFLeft(pointF1, pointF2, 0.0f);
                theCrossPointFRight = getTheCrossPointFRight(pointF1, pointF2, 0.0f);
            } else {
                theCrossPointFLeft = getTheCrossPointFLeft(pointF1, pointF2, 0.0f);
                theCrossPointFRight = getTheCrossPointFRight(pointF1, pointF2, 0.0f);
            }
        }
        PointF pointF = theCrossPointFRight;
        PointF pointF3 = theCrossPointFLeft;
        float[] fArr = {pointF3.x, pointF3.y, pointF.x, pointF.y};
        Intrinsics.checkNotNull(barEntry);
        drawLinearGradient(canvas, fArr, yZero, pointF3, pointF, barEntryLeft, barEntry);
    }
}
