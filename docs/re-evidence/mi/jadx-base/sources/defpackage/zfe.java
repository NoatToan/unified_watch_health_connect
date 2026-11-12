package defpackage;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.entrys.AGPDetailList;
import com.xiaomi.fitness.chart.entrys.BloodGlucoseEntry;
import com.xiaomi.fitness.chart.entrys.BloodGlucoseLineChartData;
import com.xiaomi.fitness.chart.entrys.EcgEntry;
import com.xiaomi.fitness.chart.entrys.FingerBSList;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.render.BaseChartRender;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public class zfe extends BaseChartRender<RecyclerBarEntry, vfe> {
    public Boolean breakPointLineFlag;
    private Paint mLineCirclePaint;
    private Paint mLineFillPaint;
    private Paint mLinePaint;
    private Paint mLineSelectPaint;
    int[] pointColorList;
    float[] pointColorValue;
    private Float valueToPoint;
    private Float valueToPointPercent;

    public zfe(vfe vfeVar, onq onqVar) {
        super(vfeVar, onqVar);
        this.breakPointLineFlag = Boolean.FALSE;
        Float fValueOf = Float.valueOf(1.0f);
        this.valueToPoint = fValueOf;
        this.valueToPointPercent = fValueOf;
        initLineFillPaint();
    }

    private boolean checkoutIsInBoundary(PointF pointF, ViewGroup viewGroup) {
        float paddingLeft = viewGroup.getPaddingLeft();
        float width = viewGroup.getWidth() - viewGroup.getPaddingRight();
        float f = pointF.x;
        return f < width && f > paddingLeft;
    }

    private <T extends RecyclerBarEntry, E extends sf2> PointF createNearPoint(RecyclerView recyclerView, List<T> list, PointF pointF, int i, int i2, E e, boolean z) {
        float f = pointF.x;
        float f2 = i2;
        return new PointF(z ? f - f2 : f + f2, eu3.k(list.get(i).getY(), recyclerView, e, this.mBarChartAttrs));
    }

    private <T extends RecyclerBarEntry> void drawChartLine(Canvas canvas, PointF pointF, PointF pointF2, T t, T t2, float f) {
        PointF theCrossPointFLeft;
        PointF theCrossPointFRight;
        if (t.isSelected()) {
            theCrossPointFLeft = getTheCrossPointFLeft(pointF, pointF2, ((vfe) this.mBarChartAttrs).L0);
            theCrossPointFRight = getTheCrossPointFRight(pointF, pointF2, ((vfe) this.mBarChartAttrs).K0);
        } else if (t2.isSelected()) {
            theCrossPointFLeft = getTheCrossPointFLeft(pointF, pointF2, ((vfe) this.mBarChartAttrs).K0);
            theCrossPointFRight = getTheCrossPointFRight(pointF, pointF2, ((vfe) this.mBarChartAttrs).L0);
        } else {
            theCrossPointFLeft = getTheCrossPointFLeft(pointF, pointF2, ((vfe) this.mBarChartAttrs).K0);
            theCrossPointFRight = getTheCrossPointFRight(pointF, pointF2, ((vfe) this.mBarChartAttrs).K0);
        }
        drawChartLine(canvas, new float[]{theCrossPointFLeft.x, theCrossPointFLeft.y, theCrossPointFRight.x, theCrossPointFRight.y}, f);
    }

    private <T extends RecyclerBarEntry> void drawChartLineCross(Canvas canvas, PointF pointF, PointF pointF2, PointF pointF3, T t, boolean z, float f) {
        float f2 = ((vfe) this.mBarChartAttrs).K0;
        if (t.isSelected()) {
            E e = this.mBarChartAttrs;
            f2 = ((vfe) e).L0 + ((vfe) e).M0;
        }
        PointF theCrossPointFLeft = z ? getTheCrossPointFLeft(pointF, pointF2, f2) : getTheCrossPointFRight(pointF, pointF2, f2);
        drawChartLine(canvas, new float[]{pointF3.x, pointF3.y, theCrossPointFLeft.x, theCrossPointFLeft.y}, f);
    }

    private <T extends RecyclerBarEntry> void drawCircle(Canvas canvas, PointF pointF, T t, RecyclerView recyclerView) {
        if (checkoutIsInBoundary(pointF, recyclerView)) {
            if (t.isSelected()) {
                drawSelectCircle(canvas, pointF);
                E e = this.mBarChartAttrs;
                if (((vfe) e).q0 == 2) {
                    canvas.drawCircle(pointF.x, pointF.y, ((vfe) e).K0, this.mLineCirclePaint);
                    return;
                }
                return;
            }
            Paint.Style style = this.mLineCirclePaint.getStyle();
            if (((vfe) this.mBarChartAttrs).S0) {
                this.mLineCirclePaint.setStyle(Paint.Style.STROKE);
                this.mLineCirclePaint.setStrokeWidth(((vfe) this.mBarChartAttrs).M0);
            }
            canvas.drawCircle(pointF.x, pointF.y, ((vfe) this.mBarChartAttrs).K0, this.mLineCirclePaint);
            this.mLineCirclePaint.setStyle(style);
        }
    }

    private void drawFill(RecyclerView recyclerView, a52 a52Var, Canvas canvas, PointF pointF, PointF pointF2, float f) {
        if (a52Var.o0) {
            this.mLineFillPaint.setShader(new LinearGradient(0.0f, recyclerView.getBottom() - recyclerView.getPaddingBottom(), 0.0f, recyclerView.getTop() + recyclerView.getPaddingTop(), new int[]{a52Var.m0, a52Var.n0}, (float[]) null, Shader.TileMode.CLAMP));
            new xfe(this.mLineFillPaint, eu3.a(pointF, pointF2, f)).draw(canvas);
        }
    }

    private void drawItemFill(Canvas canvas, RecyclerView recyclerView, PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        new xfe(this.mLineFillPaint, eu3.b(pointF, pointF2, pointF3, pointF4)).draw(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T extends RecyclerBarEntry, E extends sf2> void drawLineChartWithPoint(Canvas canvas, RecyclerView recyclerView, E e) {
        RecyclerBarEntry recyclerBarEntry;
        float f;
        RectF rectF;
        int i;
        int i2;
        List<T> list;
        float f2;
        int i3;
        PointF pointF;
        PointF pointF2;
        RecyclerBarEntry recyclerBarEntry2;
        RecyclerBarEntry recyclerBarEntry3;
        List<T> list2;
        PointF pointF3;
        int i4;
        List<T> list3;
        E e2 = e;
        int i5 = 1;
        float width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        float paddingLeft = recyclerView.getPaddingLeft();
        List<T> entries = ((j22) recyclerView.getAdapter()).getEntries();
        int childCount = recyclerView.getChildCount();
        int i6 = 0;
        int i7 = 0;
        while (i7 < childCount) {
            View childAt = recyclerView.getChildAt(i7);
            RecyclerBarEntry recyclerBarEntry4 = (RecyclerBarEntry) childAt.getTag();
            if ((recyclerBarEntry4.getY() != recyclerBarEntry4.getEntryMinY() || recyclerBarEntry4.getY() > e.getAxisMinimum()) && recyclerBarEntry4.validType != i5) {
                int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                RectF rectFF = eu3.f(childAt, recyclerView, e2, this.mBarChartAttrs, recyclerBarEntry4);
                float f3 = rectFF.bottom;
                PointF pointF4 = new PointF((rectFF.left + rectFF.right) / 2.0f, rectFF.top);
                if (i6 <= 0 || !this.breakPointLineFlag.booleanValue()) {
                    recyclerBarEntry = recyclerBarEntry4;
                    childAt = childAt;
                    i7 = i7;
                    childCount = childCount;
                    entries = entries;
                    f = f3;
                    rectF = rectFF;
                    i = i6;
                } else {
                    if (i7 != i6) {
                        View childAt2 = recyclerView.getChildAt((i7 - i6) - 1);
                        RecyclerBarEntry recyclerBarEntry5 = (RecyclerBarEntry) childAt2.getTag();
                        RectF rectFF2 = eu3.f(childAt2, recyclerView, e2, this.mBarChartAttrs, recyclerBarEntry5);
                        PointF pointF5 = new PointF((rectFF2.left + rectFF2.right) / 2.0f, rectFF2.top);
                        rectF = rectFF;
                        recyclerBarEntry = recyclerBarEntry4;
                        f = f3;
                        drawChartLine(canvas, pointF5, pointF4, recyclerBarEntry5, recyclerBarEntry, f);
                        drawFill(recyclerView, this.mBarChartAttrs, canvas, pointF5, pointF4, rectF.bottom);
                    } else {
                        recyclerBarEntry = recyclerBarEntry4;
                        f = f3;
                        rectF = rectFF;
                    }
                    i = 0;
                }
                if (i7 < childCount - 1) {
                    View childAt3 = recyclerView.getChildAt(i7 + 1);
                    RecyclerBarEntry recyclerBarEntry6 = (RecyclerBarEntry) childAt3.getTag();
                    if ((recyclerBarEntry6.getY() != recyclerBarEntry6.getEntryMinY() || recyclerBarEntry6.getY() > e.getAxisMinimum()) && recyclerBarEntry6.validType != 1) {
                        RecyclerBarEntry recyclerBarEntry7 = recyclerBarEntry;
                        RectF rectFF3 = eu3.f(childAt3, recyclerView, e2, this.mBarChartAttrs, recyclerBarEntry6);
                        PointF pointF6 = new PointF((rectFF3.left + rectFF3.right) / 2.0f, rectFF3.top);
                        float f4 = pointF6.x;
                        if (f4 < paddingLeft || pointF4.x > width) {
                            pointF = pointF4;
                            i2 = i7;
                            float f5 = f;
                            list = entries;
                            pointF2 = pointF6;
                            recyclerBarEntry2 = recyclerBarEntry7;
                            recyclerBarEntry3 = recyclerBarEntry6;
                            f2 = paddingLeft;
                            if (f4 < f2 && childAt3.getRight() >= f2) {
                                drawLineCross(recyclerView, canvas, pointF2, pointF, recyclerBarEntry2, f2, f5, false);
                            }
                        } else {
                            i2 = i7;
                            recyclerBarEntry3 = recyclerBarEntry6;
                            drawChartLine(canvas, pointF6, pointF4, recyclerBarEntry6, recyclerBarEntry7, f);
                            drawFill(recyclerView, this.mBarChartAttrs, canvas, pointF6, pointF4, rectF.bottom);
                            if (childAt3.getLeft() < paddingLeft) {
                                int i8 = childAdapterPosition + 2;
                                if (i8 < entries.size()) {
                                    float width2 = pointF6.x - childAt3.getWidth();
                                    List<T> list4 = entries;
                                    list2 = list4;
                                    pointF3 = pointF4;
                                    pointF2 = pointF6;
                                    f2 = paddingLeft;
                                    drawLineCross(recyclerView, canvas, new PointF(width2, eu3.k(list4.get(i8).getY(), recyclerView, e2, this.mBarChartAttrs)), pointF6, recyclerBarEntry7, paddingLeft, f, false);
                                } else {
                                    list2 = entries;
                                    f2 = paddingLeft;
                                    pointF3 = pointF4;
                                    pointF2 = pointF6;
                                }
                            } else {
                                list2 = entries;
                                f2 = paddingLeft;
                                pointF3 = pointF4;
                                pointF2 = pointF6;
                                if (childAt.getRight() < width && width - childAt.getRight() <= childAt.getWidth() && (i4 = childAdapterPosition - 1) > 0) {
                                    T t = list2.get(i4);
                                    if ((t.getY() != t.getEntryMinY() || t.getY() > e.getAxisMinimum()) && t.validType != 1) {
                                        PointF pointF7 = new PointF(pointF3.x + childAt.getWidth(), eu3.k(t.getY(), recyclerView, e, this.mBarChartAttrs));
                                        float f6 = pointF7.x;
                                        if (f6 >= width) {
                                            PointF pointF8 = new PointF(width, pointF7.y);
                                            drawChartLine(canvas, new float[]{pointF3.x, pointF3.y, pointF8.x, pointF8.y}, f);
                                            list3 = list2;
                                            pointF = pointF3;
                                            drawFill(recyclerView, this.mBarChartAttrs, canvas, pointF3, pointF8, rectF.bottom);
                                        } else {
                                            pointF = pointF3;
                                            float f7 = f;
                                            if (f6 < width) {
                                                int i9 = childAdapterPosition - 2;
                                                if (i9 > 0) {
                                                    T t2 = list3.get(i9);
                                                    if (t2.getY() != t2.getEntryMinY() || t2.getY() > e.getAxisMinimum()) {
                                                        list3 = list2;
                                                        list3 = list2;
                                                        if (t2.validType != 1) {
                                                            list = list3;
                                                            e2 = e;
                                                            recyclerBarEntry2 = recyclerBarEntry7;
                                                            drawLineCross(recyclerView, canvas, pointF7, new PointF(Math.min(pointF7.x + childAt.getWidth(), width), eu3.k(t2.getY(), recyclerView, e2, this.mBarChartAttrs)), t, width, f7, true);
                                                        }
                                                    }
                                                    list3 = list2;
                                                    drawCircle(canvas, pointF2, recyclerBarEntry3, recyclerView);
                                                    drawCircle(canvas, pointF, recyclerBarEntry7, recyclerView);
                                                    list = list3;
                                                } else {
                                                    list3 = list2;
                                                    recyclerBarEntry2 = recyclerBarEntry7;
                                                    list = list3;
                                                    e2 = e;
                                                }
                                            }
                                        }
                                        list3 = list2;
                                        recyclerBarEntry2 = recyclerBarEntry7;
                                        list = list3;
                                    } else {
                                        drawCircle(canvas, pointF2, recyclerBarEntry3, recyclerView);
                                        drawCircle(canvas, pointF3, recyclerBarEntry7, recyclerView);
                                        list = list2;
                                    }
                                    e2 = e;
                                }
                                e2 = e;
                            }
                            list = list2;
                            pointF = pointF3;
                            recyclerBarEntry2 = recyclerBarEntry7;
                            e2 = e;
                        }
                        drawCircle(canvas, pointF2, recyclerBarEntry3, recyclerView);
                        drawCircle(canvas, pointF, recyclerBarEntry2, recyclerView);
                    } else {
                        drawCircle(canvas, pointF4, recyclerBarEntry, recyclerView);
                        i2 = i7;
                        list = entries;
                        f2 = paddingLeft;
                    }
                } else {
                    i2 = i7;
                    list = entries;
                    f2 = paddingLeft;
                    drawCircle(canvas, pointF4, recyclerBarEntry, recyclerView);
                }
                i6 = i;
                i3 = 1;
            } else {
                i6 += i5;
                i2 = i7;
                childCount = childCount;
                list = entries;
                f2 = paddingLeft;
                i3 = i5;
            }
            i7 = i2 + 1;
            i5 = i3;
            entries = list;
            paddingLeft = f2;
            childCount = childCount;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T extends RecyclerBarEntry, E extends sf2> void drawLineChartWithPointRTL(Canvas canvas, RecyclerView recyclerView, E e) {
        PointF pointF;
        int i;
        RectF rectF;
        int i2;
        int i3;
        List<T> list;
        PointF pointF2;
        PointF pointF3;
        RecyclerBarEntry recyclerBarEntry;
        RecyclerBarEntry recyclerBarEntry2;
        RecyclerBarEntry recyclerBarEntry3;
        int i4;
        List<T> list2;
        int i5;
        int i6;
        float paddingLeft = recyclerView.getPaddingLeft();
        float width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        List<T> entries = ((j22) recyclerView.getAdapter()).getEntries();
        int childCount = recyclerView.getChildCount();
        int i7 = 0;
        int i8 = 0;
        while (i8 < childCount) {
            View childAt = recyclerView.getChildAt(i8);
            RecyclerBarEntry recyclerBarEntry4 = (RecyclerBarEntry) childAt.getTag();
            if ((recyclerBarEntry4.getY() != recyclerBarEntry4.getEntryMinY() || recyclerBarEntry4.getY() > e.getAxisMinimum()) && recyclerBarEntry4.validType != 1) {
                int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                RectF rectFF = eu3.f(childAt, recyclerView, e, this.mBarChartAttrs, recyclerBarEntry4);
                float f = rectFF.bottom;
                int width2 = childAt.getWidth();
                PointF pointF4 = new PointF((rectFF.left + rectFF.right) / 2.0f, rectFF.top);
                if (i7 <= 0 || !this.breakPointLineFlag.booleanValue()) {
                    pointF = pointF4;
                    recyclerBarEntry4 = recyclerBarEntry4;
                    childAt = childAt;
                    childCount = childCount;
                    entries = entries;
                    i = 1;
                    rectF = rectFF;
                    i2 = i7;
                } else {
                    if (i8 != i7) {
                        View childAt2 = recyclerView.getChildAt((i8 - i7) - 1);
                        RecyclerBarEntry recyclerBarEntry5 = (RecyclerBarEntry) childAt2.getTag();
                        RectF rectFF2 = eu3.f(childAt2, recyclerView, e, this.mBarChartAttrs, recyclerBarEntry5);
                        pointF = pointF4;
                        PointF pointF5 = new PointF((rectFF2.left + rectFF2.right) / 2.0f, rectFF2.top);
                        rectF = rectFF;
                        i = 1;
                        drawChartLine(canvas, pointF5, pointF, recyclerBarEntry5, recyclerBarEntry4, f);
                        drawFill(recyclerView, this.mBarChartAttrs, canvas, pointF5, pointF, rectF.bottom);
                    } else {
                        pointF = pointF4;
                        i = 1;
                        rectF = rectFF;
                    }
                    i2 = 0;
                }
                if (i8 >= i) {
                    View childAt3 = recyclerView.getChildAt(i8 - 1);
                    RecyclerBarEntry recyclerBarEntry6 = (RecyclerBarEntry) childAt3.getTag();
                    if ((recyclerBarEntry6.getY() != recyclerBarEntry6.getEntryMinY() || recyclerBarEntry6.getY() > e.getAxisMinimum()) && recyclerBarEntry6.validType != i) {
                        PointF pointF6 = pointF;
                        RecyclerBarEntry recyclerBarEntry7 = recyclerBarEntry4;
                        RectF rectFF3 = eu3.f(childAt3, recyclerView, e, this.mBarChartAttrs, recyclerBarEntry6);
                        PointF pointF7 = new PointF((rectFF3.left + rectFF3.right) / 2.0f, rectFF3.top);
                        float f2 = pointF7.x;
                        if (f2 < paddingLeft || pointF6.x > width) {
                            pointF2 = pointF7;
                            pointF3 = pointF6;
                            recyclerBarEntry = recyclerBarEntry7;
                            recyclerBarEntry2 = recyclerBarEntry6;
                            i3 = i8;
                            list = entries;
                            if (f2 < width && childAt3.getRight() >= width) {
                                drawLineCross(recyclerView, canvas, pointF2, pointF3, recyclerBarEntry, width, f, false);
                            }
                        } else {
                            pointF2 = pointF7;
                            recyclerBarEntry = recyclerBarEntry7;
                            drawChartLine(canvas, pointF7, pointF6, recyclerBarEntry6, recyclerBarEntry, f);
                            drawFill(recyclerView, this.mBarChartAttrs, canvas, pointF2, pointF6, rectF.bottom);
                            if (childAt3.getLeft() < paddingLeft) {
                                int i9 = childAdapterPosition - 2;
                                if (i9 >= 0) {
                                    i3 = i8;
                                    PointF pointFCreateNearPoint = createNearPoint(recyclerView, entries, pointF2, i9, width2, e, true);
                                    drawLineLeftBoundary(recyclerView, canvas, pointFCreateNearPoint, pointF2, paddingLeft, f);
                                    if (pointFCreateNearPoint.x > paddingLeft && (i6 = childAdapterPosition - 3) >= 0) {
                                        drawLineCross(recyclerView, canvas, createNearPoint(recyclerView, entries, pointFCreateNearPoint, i6, width2, e, true), pointFCreateNearPoint, recyclerBarEntry6, paddingLeft, f, false);
                                    }
                                } else {
                                    i3 = i8;
                                }
                            } else {
                                i3 = i8;
                                if (childAt.getRight() < width && width - childAt.getRight() <= childAt.getWidth() && (i4 = childAdapterPosition + 1) < entries.size()) {
                                    List<T> list3 = entries;
                                    T t = list3.get(i4);
                                    if ((t.getY() != t.getEntryMinY() || t.getY() > e.getAxisMinimum()) && t.validType != 1) {
                                        PointF pointFCreateNearPoint2 = createNearPoint(recyclerView, list3, pointF6, i4, width2, e, false);
                                        float f3 = pointFCreateNearPoint2.x;
                                        if (f3 >= width) {
                                            list2 = list3;
                                            drawLineCross(recyclerView, canvas, pointF6, pointFCreateNearPoint2, t, width, f, true);
                                        } else {
                                            list2 = list3;
                                            if (f3 < width && (i5 = childAdapterPosition + 2) < list2.size()) {
                                                list3 = list2;
                                                T t2 = list3.get(i5);
                                                if ((t2.getY() != t2.getEntryMinY() || t2.getY() > e.getAxisMinimum()) && t2.validType != 1) {
                                                    pointF3 = pointF6;
                                                    recyclerBarEntry = recyclerBarEntry;
                                                    recyclerBarEntry2 = recyclerBarEntry6;
                                                    PointF pointFCreateNearPoint3 = createNearPoint(recyclerView, list3, pointFCreateNearPoint2, i5, width2, e, false);
                                                    list = list3;
                                                    drawLineCross(recyclerView, canvas, pointFCreateNearPoint2, pointFCreateNearPoint3, t, width, f, true);
                                                } else {
                                                    drawCircle(canvas, pointF2, recyclerBarEntry6, recyclerView);
                                                    drawCircle(canvas, pointF6, recyclerBarEntry, recyclerView);
                                                }
                                            }
                                        }
                                        list = list2;
                                        pointF3 = pointF6;
                                        recyclerBarEntry = recyclerBarEntry;
                                        recyclerBarEntry2 = recyclerBarEntry6;
                                    } else {
                                        drawCircle(canvas, pointF2, recyclerBarEntry6, recyclerView);
                                        drawCircle(canvas, pointF6, recyclerBarEntry, recyclerView);
                                    }
                                    list = list3;
                                }
                            }
                            pointF3 = pointF6;
                            list = entries;
                            recyclerBarEntry3 = recyclerBarEntry6;
                            drawCircle(canvas, pointF2, recyclerBarEntry3, recyclerView);
                            drawCircle(canvas, pointF3, recyclerBarEntry, recyclerView);
                        }
                        recyclerBarEntry3 = recyclerBarEntry2;
                        drawCircle(canvas, pointF2, recyclerBarEntry3, recyclerView);
                        drawCircle(canvas, pointF3, recyclerBarEntry, recyclerView);
                    } else {
                        drawCircle(canvas, pointF, recyclerBarEntry4, recyclerView);
                        i3 = i8;
                        list = entries;
                    }
                } else {
                    i3 = i8;
                    list = entries;
                    drawCircle(canvas, pointF, recyclerBarEntry4, recyclerView);
                }
                i7 = i2;
            } else {
                i7++;
                i3 = i8;
                childCount = childCount;
                list = entries;
            }
            i8 = i3 + 1;
            entries = list;
            childCount = childCount;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x010a  */
    /* JADX WARN: Code duplicated, block: B:47:0x020e  */
    private <T extends RecyclerBarEntry, E extends sf2> void drawLineChartWithoutPoint(Canvas canvas, RecyclerView recyclerView, E e) {
        RectF rectF;
        int i;
        int i2;
        int i3;
        float f;
        int i4;
        int i5;
        int i6;
        Canvas canvas2 = canvas;
        int i7 = 1;
        float width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        float paddingLeft = recyclerView.getPaddingLeft();
        List<T> entries = ((j22) recyclerView.getAdapter()).getEntries();
        int childCount = recyclerView.getChildCount();
        int i8 = 0;
        int i9 = 0;
        while (i9 < childCount) {
            View childAt = recyclerView.getChildAt(i9);
            RecyclerBarEntry recyclerBarEntry = (RecyclerBarEntry) childAt.getTag();
            if (recyclerBarEntry.getY() == 0.0f) {
                i8 += i7;
                i4 = i9;
                i2 = childCount;
                paddingLeft = paddingLeft;
                f = width;
                i5 = i7;
            } else {
                int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                int width2 = childAt.getWidth();
                RectF rectFF = eu3.f(childAt, recyclerView, e, this.mBarChartAttrs, recyclerBarEntry);
                float f2 = rectFF.bottom;
                PointF pointF = new PointF((rectFF.left + rectFF.right) / 2.0f, rectFF.top);
                if (i8 <= 0 || !this.breakPointLineFlag.booleanValue()) {
                    f2 = f2;
                    rectF = rectFF;
                    childAt = childAt;
                    i = i9;
                    i2 = childCount;
                    paddingLeft = paddingLeft;
                    i3 = i8;
                } else {
                    if (i9 != i8) {
                        View childAt2 = recyclerView.getChildAt((i9 - i8) - i7);
                        RectF rectFF2 = eu3.f(childAt2, recyclerView, e, this.mBarChartAttrs, (RecyclerBarEntry) childAt2.getTag());
                        PointF pointF2 = new PointF((rectFF2.left + rectFF2.right) / 2.0f, rectFF2.top);
                        drawChartLine(canvas2, new float[]{pointF2.x, pointF2.y, pointF.x, pointF.y}, f2);
                        i = i9;
                        rectF = rectFF;
                        i2 = childCount;
                        drawFill(recyclerView, this.mBarChartAttrs, canvas, pointF2, pointF, rectFF.bottom);
                    } else {
                        rectF = rectFF;
                        i = i9;
                        i2 = childCount;
                    }
                    i3 = 0;
                }
                if (i < i2 - 1) {
                    View childAt3 = recyclerView.getChildAt(i + 1);
                    RecyclerBarEntry recyclerBarEntry2 = (RecyclerBarEntry) childAt3.getTag();
                    if (recyclerBarEntry2.getY() == 0.0f) {
                        f = width;
                        i4 = i;
                        canvas2 = canvas;
                    } else {
                        RectF rectFF3 = eu3.f(childAt3, recyclerView, e, this.mBarChartAttrs, recyclerBarEntry2);
                        PointF pointF3 = new PointF((rectFF3.left + rectFF3.right) / 2.0f, rectFF3.top);
                        float f3 = pointF3.x;
                        if (f3 >= paddingLeft) {
                            float f4 = pointF.x;
                            if (f4 <= width) {
                                i4 = i;
                                canvas2 = canvas;
                                drawChartLine(canvas2, new float[]{f3, pointF3.y, f4, pointF.y}, f2);
                                drawFill(recyclerView, this.mBarChartAttrs, canvas, pointF3, pointF, rectF.bottom);
                                if (childAt3.getLeft() < paddingLeft) {
                                    int i10 = childAdapterPosition + 2;
                                    if (i10 < entries.size()) {
                                        f = width;
                                        drawLineLeftBoundary(recyclerView, canvas, createNearPoint(recyclerView, entries, pointF3, i10, width2, e, true), pointF3, paddingLeft, f2);
                                    } else {
                                        f = width;
                                    }
                                } else {
                                    f = width;
                                    if (childAt.getRight() < f && f - childAt.getRight() <= childAt.getWidth() && (i6 = childAdapterPosition - 1) > 0) {
                                        PointF pointFCreateNearPoint = createNearPoint(recyclerView, entries, pointF, i6, width2, e, false);
                                        float f5 = pointFCreateNearPoint.x;
                                        if (f5 > f) {
                                            drawLineRightBoundary(recyclerView, canvas, pointF, pointFCreateNearPoint, f, f2);
                                        } else if (f5 < f) {
                                            int i11 = childAdapterPosition - 2;
                                            if (i11 > 0) {
                                                drawLineRightBoundary(recyclerView, canvas, pointFCreateNearPoint, createNearPoint(recyclerView, entries, pointFCreateNearPoint, i11, width2, e, false), f, f2);
                                            }
                                        }
                                    }
                                }
                            } else {
                                f = width;
                                i4 = i;
                                canvas2 = canvas;
                                if (f3 < paddingLeft && childAt3.getRight() >= paddingLeft) {
                                    drawLineLeftBoundary(recyclerView, canvas, pointF3, pointF, paddingLeft, f2);
                                }
                            }
                        } else {
                            f = width;
                            i4 = i;
                            canvas2 = canvas;
                            if (f3 < paddingLeft) {
                                drawLineLeftBoundary(recyclerView, canvas, pointF3, pointF, paddingLeft, f2);
                            }
                        }
                    }
                } else {
                    f = width;
                    i4 = i;
                    canvas2 = canvas;
                }
                i8 = i3;
                i5 = 1;
            }
            i9 = i4 + 1;
            i7 = i5;
            childCount = i2;
            paddingLeft = paddingLeft;
            width = f;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0105  */
    /* JADX WARN: Code duplicated, block: B:50:0x0232  */
    private <T extends RecyclerBarEntry, E extends sf2> void drawLineChartWithoutPointRTL(Canvas canvas, RecyclerView recyclerView, E e) {
        RectF rectF;
        int i;
        int i2;
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        Canvas canvas2 = canvas;
        int i7 = 1;
        float paddingLeft = recyclerView.getPaddingLeft();
        float width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        List<T> entries = ((j22) recyclerView.getAdapter()).getEntries();
        int childCount = recyclerView.getChildCount();
        int i8 = 0;
        int i9 = 0;
        while (i9 < childCount) {
            View childAt = recyclerView.getChildAt(i9);
            RecyclerBarEntry recyclerBarEntry = (RecyclerBarEntry) childAt.getTag();
            if (recyclerBarEntry.getY() == 0.0f) {
                i8 += i7;
                i3 = i9;
                childCount = childCount;
                width = width;
                f = paddingLeft;
                i4 = i7;
            } else {
                int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                int width2 = childAt.getWidth();
                RectF rectFF = eu3.f(childAt, recyclerView, e, this.mBarChartAttrs, recyclerBarEntry);
                float f2 = rectFF.bottom;
                PointF pointF = new PointF((rectFF.left + rectFF.right) / 2.0f, rectFF.top);
                if (i8 <= 0 || !this.breakPointLineFlag.booleanValue()) {
                    f2 = f2;
                    rectF = rectFF;
                    childAt = childAt;
                    i = i9;
                    childCount = childCount;
                    width = width;
                    i2 = i8;
                } else {
                    if (i9 != i8) {
                        View childAt2 = recyclerView.getChildAt((i9 - i8) - i7);
                        RectF rectFF2 = eu3.f(childAt2, recyclerView, e, this.mBarChartAttrs, (RecyclerBarEntry) childAt2.getTag());
                        PointF pointF2 = new PointF((rectFF2.left + rectFF2.right) / 2.0f, rectFF2.top);
                        drawChartLine(canvas2, new float[]{pointF2.x, pointF2.y, pointF.x, pointF.y}, f2);
                        i = i9;
                        rectF = rectFF;
                        drawFill(recyclerView, this.mBarChartAttrs, canvas, pointF2, pointF, rectFF.bottom);
                    } else {
                        rectF = rectFF;
                        i = i9;
                    }
                    i2 = 0;
                }
                if (i >= 1) {
                    View childAt3 = recyclerView.getChildAt(i - 1);
                    RecyclerBarEntry recyclerBarEntry2 = (RecyclerBarEntry) childAt3.getTag();
                    if (recyclerBarEntry2.getY() == 0.0f) {
                        f = paddingLeft;
                        i3 = i;
                        canvas2 = canvas;
                    } else {
                        RectF rectFF3 = eu3.f(childAt3, recyclerView, e, this.mBarChartAttrs, recyclerBarEntry2);
                        PointF pointF3 = new PointF((rectFF3.left + rectFF3.right) / 2.0f, rectFF3.top);
                        float f3 = pointF3.x;
                        if (f3 >= paddingLeft) {
                            float f4 = pointF.x;
                            if (f4 <= width) {
                                i3 = i;
                                canvas2 = canvas;
                                drawChartLine(canvas2, new float[]{f3, pointF3.y, f4, pointF.y}, f2);
                                drawFill(recyclerView, this.mBarChartAttrs, canvas, pointF3, pointF, rectF.bottom);
                                if (childAt3.getLeft() < paddingLeft) {
                                    int i10 = childAdapterPosition - 2;
                                    if (i10 >= 0) {
                                        f = paddingLeft;
                                        PointF pointFCreateNearPoint = createNearPoint(recyclerView, entries, pointF3, i10, width2, e, true);
                                        drawLineLeftBoundary(recyclerView, canvas, pointFCreateNearPoint, pointF3, f, f2);
                                        if (pointFCreateNearPoint.x > f && (i6 = childAdapterPosition - 3) >= 0) {
                                            drawLineLeftBoundary(recyclerView, canvas, createNearPoint(recyclerView, entries, pointFCreateNearPoint, i6, width2, e, true), pointFCreateNearPoint, f, f2);
                                        }
                                    } else {
                                        f = paddingLeft;
                                    }
                                } else {
                                    f = paddingLeft;
                                    if (childAt.getRight() < width && width - childAt.getRight() <= childAt.getWidth() && (i5 = childAdapterPosition + 1) < entries.size()) {
                                        PointF pointFCreateNearPoint2 = createNearPoint(recyclerView, entries, pointF, i5, width2, e, false);
                                        float f5 = pointFCreateNearPoint2.x;
                                        if (f5 > width) {
                                            drawLineRightBoundary(recyclerView, canvas, pointF, pointFCreateNearPoint2, width, f2);
                                        } else if (f5 < width) {
                                            int i11 = childAdapterPosition + 2;
                                            if (i11 < entries.size()) {
                                                drawLineRightBoundary(recyclerView, canvas, pointFCreateNearPoint2, createNearPoint(recyclerView, entries, pointFCreateNearPoint2, i11, width2, e, false), width, f2);
                                            }
                                        }
                                    }
                                }
                            } else {
                                f = paddingLeft;
                                i3 = i;
                                canvas2 = canvas;
                                if (f3 < f && childAt3.getRight() >= f) {
                                    drawLineLeftBoundary(recyclerView, canvas, pointF3, pointF, f, f2);
                                }
                            }
                        } else {
                            f = paddingLeft;
                            i3 = i;
                            canvas2 = canvas;
                            if (f3 < f) {
                                drawLineLeftBoundary(recyclerView, canvas, pointF3, pointF, f, f2);
                            }
                        }
                    }
                } else {
                    f = paddingLeft;
                    i3 = i;
                    canvas2 = canvas;
                }
                i8 = i2;
                i4 = 1;
            }
            i9 = i3 + 1;
            i7 = i4;
            width = width;
            childCount = childCount;
            paddingLeft = f;
        }
    }

    private <T extends RecyclerBarEntry> void drawLineCross(RecyclerView recyclerView, Canvas canvas, PointF pointF, PointF pointF2, T t, float f, float f2, boolean z) {
        PointF pointFG = eu3.g(pointF, pointF2, f);
        drawChartLineCross(canvas, pointF, pointF2, pointFG, t, z, f2);
        if (z) {
            drawFill(recyclerView, this.mBarChartAttrs, canvas, pointFG, pointF, f2);
        } else {
            drawFill(recyclerView, this.mBarChartAttrs, canvas, pointFG, pointF2, f2);
        }
    }

    private void drawLineLeftBoundary(RecyclerView recyclerView, Canvas canvas, PointF pointF, PointF pointF2, float f, float f2) {
        PointF pointFG = eu3.g(pointF, pointF2, f);
        drawChartLine(canvas, new float[]{pointFG.x, pointFG.y, pointF2.x, pointF2.y}, f2);
        drawFill(recyclerView, this.mBarChartAttrs, canvas, pointFG, pointF2, f2);
    }

    private void drawLineRightBoundary(RecyclerView recyclerView, Canvas canvas, PointF pointF, PointF pointF2, float f, float f2) {
        PointF pointFG = eu3.g(pointF, pointF2, f);
        drawChartLine(canvas, new float[]{pointF.x, pointF.y, pointFG.x, pointFG.y}, f2);
        drawFill(recyclerView, this.mBarChartAttrs, canvas, pointF, pointFG, f2);
    }

    private void drawSelectCircle(Canvas canvas, PointF pointF) {
        Paint.Style style = this.mLineCirclePaint.getStyle();
        float strokeWidth = this.mLineCirclePaint.getStrokeWidth();
        this.mLineCirclePaint.setStyle(Paint.Style.STROKE);
        this.mLineCirclePaint.setStrokeWidth(((vfe) this.mBarChartAttrs).M0);
        canvas.drawCircle(pointF.x, pointF.y, ((vfe) this.mBarChartAttrs).L0, this.mLineCirclePaint);
        this.mLineCirclePaint.setStyle(style);
        this.mLineCirclePaint.setStrokeWidth(strokeWidth);
    }

    private int getChartFillColor(int i) {
        if (i != 1) {
            return i != 2 ? x44.a(aji.i) : x44.a(aji.f1101k);
        }
        return x44.a(aji.j);
    }

    private int getPointsCircleColor(float f, float f2) {
        float f3 = (f2 - f) / f2;
        int i = 1;
        while (true) {
            float[] fArr = this.pointColorValue;
            if (i >= fArr.length) {
                return this.pointColorList[0];
            }
            if (f3 == fArr[1] || f3 == fArr[3]) {
                return this.pointColorList[2];
            }
            if (f3 > fArr[i - 1] && f3 < fArr[i]) {
                return this.pointColorList[i];
            }
            i++;
        }
    }

    private PointF getTheCrossPointFLeft(PointF pointF, PointF pointF2, float f) {
        float fAbs = Math.abs(pointF.x - pointF2.x);
        float fAbs2 = Math.abs(pointF.y - pointF2.y);
        double dSqrt = ((double) (f * 1.0f)) / Math.sqrt((fAbs * fAbs) + (fAbs2 * fAbs2));
        double d = ((double) fAbs2) * dSqrt;
        double d2 = ((double) fAbs) * dSqrt;
        PointF pointF3 = new PointF();
        float f2 = pointF.y;
        if (f2 > pointF2.y) {
            pointF3.y = (float) (((double) f2) - d);
        } else {
            pointF3.y = (float) (((double) f2) + d);
        }
        float f3 = pointF.x;
        if (f3 > pointF2.x) {
            pointF3.x = (float) (((double) f3) - d2);
        } else {
            pointF3.x = (float) (((double) f3) + d2);
        }
        return pointF3;
    }

    private PointF getTheCrossPointFRight(PointF pointF, PointF pointF2, float f) {
        float fAbs = Math.abs(pointF.x - pointF2.x);
        float fAbs2 = Math.abs(pointF.y - pointF2.y);
        double dSqrt = ((double) (f * 1.0f)) / Math.sqrt((fAbs * fAbs) + (fAbs2 * fAbs2));
        double d = ((double) fAbs2) * dSqrt;
        double d2 = ((double) fAbs) * dSqrt;
        PointF pointF3 = new PointF();
        float f2 = pointF.y;
        float f3 = pointF2.y;
        if (f2 > f3) {
            pointF3.y = (float) (((double) f3) + d);
        } else {
            pointF3.y = (float) (((double) f3) - d);
        }
        float f4 = pointF.x;
        float f5 = pointF2.x;
        if (f4 > f5) {
            pointF3.x = (float) (((double) f5) + d2);
        } else {
            pointF3.x = (float) (((double) f5) - d2);
        }
        return pointF3;
    }

    public void convertPointsLineColor(List<Integer> list, List<Float> list2, rtr rtrVar) {
        int size = list2.size() + 1;
        float[] fArr = new float[size];
        float axisMaximum = rtrVar.getAxisMaximum();
        float f = axisMaximum - 0.0f;
        Collections.reverse(list2);
        for (int i = 0; i < list2.size(); i++) {
            if (i > 0) {
                int i2 = i - 1;
                fArr[i] = ((list2.get(i2).floatValue() - list2.get(i).floatValue()) / f) + fArr[i2];
            } else {
                fArr[i] = (axisMaximum - list2.get(i).floatValue()) / f;
            }
        }
        fArr[list2.size()] = 1.0f;
        int i3 = size * 2;
        this.pointColorList = new int[i3];
        this.pointColorValue = new float[i3];
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            this.pointColorList[i4] = list.get(i5).intValue();
            int i6 = i4 + 1;
            this.pointColorList[i6] = list.get(i5).intValue();
            if (i5 == 0) {
                this.pointColorValue[i4] = 0.0f;
            } else {
                this.pointColorValue[i4] = fArr[i5 - 1];
            }
            this.pointColorValue[i6] = fArr[i5];
            i4 += 2;
        }
    }

    public void drawAGPFill(Canvas canvas, RecyclerView recyclerView, float f, List<List<MaxMinEntry>> list, List<List<MaxMinEntry>> list2) {
        float paddingLeft = recyclerView.getPaddingLeft();
        float width = (recyclerView.getWidth() - recyclerView.getPaddingRight()) - paddingLeft;
        int i = 0;
        int i2 = 0;
        while (i2 < list.size()) {
            List<MaxMinEntry> list3 = list.get(i2);
            List<MaxMinEntry> list4 = list2.get(i2);
            float fFloatValue = this.valueToPoint.floatValue() - (list3.get(i).getY() * this.valueToPointPercent.floatValue());
            float fFloatValue2 = this.valueToPoint.floatValue() - (list3.get(i).getY() * this.valueToPointPercent.floatValue());
            PointF pointF = new PointF(paddingLeft, fFloatValue);
            PointF pointF2 = new PointF(paddingLeft, fFloatValue2);
            PointF pointF3 = pointF;
            int i3 = 1;
            while (i3 < list3.size()) {
                float fFloatValue3 = this.valueToPoint.floatValue() - (list3.get(i3).getY() * this.valueToPointPercent.floatValue());
                float fFloatValue4 = this.valueToPoint.floatValue() - (list4.get(i3).getY() * this.valueToPointPercent.floatValue());
                float f2 = i3;
                float size = ((width / (list3.size() - 1)) * f2) + paddingLeft;
                float size2 = ((width / (list3.size() - 1)) * f2) + paddingLeft;
                PointF pointF4 = new PointF(size, fFloatValue3);
                PointF pointF5 = new PointF(size2, fFloatValue4);
                drawItemFill(canvas, recyclerView, pointF3, pointF2, pointF4, pointF5);
                i3++;
                pointF2 = pointF5;
                pointF3 = pointF4;
            }
            i2++;
            i = 0;
        }
    }

    public <T extends RecyclerBarEntry> void drawBloodGlucoseAGPChart(Canvas canvas, RecyclerView recyclerView, rtr rtrVar) {
        int i;
        float f;
        List<AGPDetailList> list;
        float f2;
        int childCount = recyclerView.getChildCount();
        this.mLinePaint.setStrokeWidth(DisplayUtil.dip2px(1.0f));
        this.mLinePaint.setStrokeCap(Paint.Cap.ROUND);
        this.mLinePaint.setStrokeJoin(Paint.Join.ROUND);
        float paddingTop = recyclerView.getPaddingTop();
        float height = (recyclerView.getHeight() - recyclerView.getPaddingBottom()) - ((vfe) this.mBarChartAttrs).f625a;
        float bottom = recyclerView.getBottom() - recyclerView.getPaddingBottom();
        float top = recyclerView.getTop() + recyclerView.getPaddingTop();
        this.valueToPoint = Float.valueOf(((vfe) this.mBarChartAttrs).f626b + height);
        this.valueToPointPercent = Float.valueOf((height - paddingTop) / rtrVar.getAxisMaximum());
        if (childCount <= 0) {
            return;
        }
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = recyclerView.getChildAt(i2);
            RecyclerBarEntry recyclerBarEntry = (RecyclerBarEntry) childAt.getTag();
            if (recyclerBarEntry instanceof BloodGlucoseEntry) {
                List<AGPDetailList> drawAGPList = ((BloodGlucoseEntry) recyclerBarEntry).getDrawAGPList();
                float width = childAt.getWidth();
                float right = childAt.getRight();
                childAt.getLeft();
                if (drawAGPList.size() > 0) {
                    int i3 = 0;
                    while (i3 < drawAGPList.size()) {
                        AGPDetailList aGPDetailList = drawAGPList.get(i3);
                        int size = aGPDetailList.getListValueTop().size();
                        List<Float> listValueTop = aGPDetailList.getListValueTop();
                        List<Float> listValueBottom = aGPDetailList.getListValueBottom();
                        if (size <= 1) {
                            i = i2;
                            f = right;
                            list = drawAGPList;
                            f2 = top;
                        } else {
                            float f3 = width / (size - 1);
                            boolean z = false;
                            Logger.i("thisValueAGPDetail   " + aGPDetailList.getTypeValue() + "  " + size + "  " + childCount, new Object[0]);
                            int i4 = 1;
                            while (i4 < size) {
                                Path path = new Path();
                                int i5 = i4 - 1;
                                int i6 = size;
                                List<AGPDetailList> list2 = drawAGPList;
                                float fK = eu3.k(listValueBottom.get(i5).floatValue(), recyclerView, rtrVar, this.mBarChartAttrs);
                                int i7 = i2;
                                float fK2 = eu3.k(listValueTop.get(i5).floatValue(), recyclerView, rtrVar, this.mBarChartAttrs);
                                float f4 = right - (i5 * f3);
                                path.moveTo(f4, fK2);
                                if (aGPDetailList.getTypeValue() != 3) {
                                    path.lineTo(f4, fK);
                                }
                                float fK3 = eu3.k(listValueBottom.get(i4).floatValue(), recyclerView, rtrVar, this.mBarChartAttrs);
                                float fK4 = eu3.k(listValueTop.get(i4).floatValue(), recyclerView, rtrVar, this.mBarChartAttrs);
                                if (aGPDetailList.getTypeValue() != 3) {
                                    path.lineTo(right - (i4 * f3), fK3);
                                }
                                path.lineTo(right - (i4 * f3), fK4);
                                path.close();
                                List<Float> list3 = listValueBottom;
                                List<Float> list4 = listValueTop;
                                float f5 = right;
                                float f6 = top;
                                this.mLineFillPaint.setShader(new LinearGradient(0.0f, bottom, 0.0f, top, new int[]{getChartFillColor(aGPDetailList.getTypeValue()), getChartFillColor(aGPDetailList.getTypeValue())}, (float[]) null, Shader.TileMode.CLAMP));
                                if (aGPDetailList.getTypeValue() == 3) {
                                    this.mLinePaint.setColor(getChartFillColor(aGPDetailList.getTypeValue()));
                                    canvas.drawPath(path, this.mLinePaint);
                                } else {
                                    new xfe(this.mLineFillPaint, path).draw(canvas);
                                }
                                i4++;
                                z = false;
                                drawAGPList = list2;
                                size = i6;
                                i2 = i7;
                                top = f6;
                                right = f5;
                                listValueBottom = list3;
                                listValueTop = list4;
                            }
                            i = i2;
                            f = right;
                            list = drawAGPList;
                            f2 = top;
                        }
                        i3++;
                        childCount = childCount;
                        width = width;
                        drawAGPList = list;
                        i2 = i;
                        top = f2;
                        right = f;
                    }
                }
            }
            i2++;
            childCount = childCount;
            top = top;
        }
    }

    public <T extends RecyclerBarEntry> void drawBloodGlucoseChart(Canvas canvas, RecyclerView recyclerView, rtr rtrVar) {
        int i;
        boolean z;
        int childCount = recyclerView.getChildCount();
        this.mLinePaint.setStrokeWidth(DisplayUtil.dip2px(1.0f));
        Path path = new Path();
        float paddingTop = recyclerView.getPaddingTop();
        float height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
        E e = this.mBarChartAttrs;
        float f = height - ((vfe) e).f625a;
        this.valueToPoint = Float.valueOf(((vfe) e).f626b + f);
        this.valueToPointPercent = Float.valueOf((f - paddingTop) / rtrVar.getAxisMaximum());
        if (childCount <= 0) {
            return;
        }
        BloodGlucoseLineChartData bloodGlucoseLineChartData = null;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < childCount) {
            View childAt = recyclerView.getChildAt(i2);
            RecyclerBarEntry recyclerBarEntry = (RecyclerBarEntry) childAt.getTag();
            if (recyclerBarEntry instanceof BloodGlucoseEntry) {
                BloodGlucoseEntry bloodGlucoseEntry = (BloodGlucoseEntry) recyclerBarEntry;
                bloodGlucoseEntry.getItem().clear();
                List<BloodGlucoseLineChartData> values = bloodGlucoseEntry.getValues();
                float width = childAt.getWidth();
                float size = width / values.size();
                boolean z3 = z2;
                float right = childAt.getRight();
                float left = childAt.getLeft();
                float f2 = width / 288.0f;
                if (values.size() > 0) {
                    float fK = eu3.k(values.get(0).getValue(), recyclerView, rtrVar, this.mBarChartAttrs);
                    if (i2 > 0 && bloodGlucoseLineChartData != null) {
                        fK = eu3.k(bloodGlucoseLineChartData.getValue(), recyclerView, rtrVar, this.mBarChartAttrs);
                    }
                    path.moveTo(right, fK);
                    int i3 = 0;
                    while (i3 < values.size()) {
                        if (values.get(i3).getValue() < 0.0f || values.get(i3).getValue() > 25.0f) {
                            z = true;
                            z3 = false;
                        } else {
                            z = false;
                        }
                        int i4 = i2;
                        float fK2 = eu3.k(values.get(i3).getValue(), recyclerView, rtrVar, this.mBarChartAttrs);
                        if (z) {
                            path.moveTo(right - (i3 * size), fK2);
                        } else if (z3) {
                            path.lineTo(right - (i3 * size), fK2);
                        } else {
                            float f3 = right - (i3 * size);
                            path.moveTo(f3, fK2);
                            if (i3 > 0) {
                                path.lineTo(f3 + (0.3f * f2), fK2);
                            } else {
                                path.lineTo(f3 - (0.3f * f2), fK2);
                            }
                            z3 = true;
                        }
                        if (bloodGlucoseEntry.getHighLightType() == 1) {
                            this.mLinePaint.setAlpha(255);
                            float f4 = i3;
                            bloodGlucoseEntry.getItem().add(new Pair<>(Float.valueOf(right - ((f4 + 0.5f) * size)), Float.valueOf(right - ((f4 - 0.5f) * size))));
                        } else {
                            this.mLinePaint.setAlpha(50);
                        }
                        i3++;
                        i2 = i4;
                        f2 = f2;
                    }
                    i = i2;
                    bloodGlucoseLineChartData = values.get(values.size() - 1);
                } else {
                    i = i2;
                }
                z2 = z3;
                List<FingerBSList> fingerBSList = bloodGlucoseEntry.getFingerBSList();
                int i5 = 0;
                while (i5 < fingerBSList.size()) {
                    boolean z4 = z2;
                    float time = fingerBSList.get(i5).getTime();
                    BloodGlucoseLineChartData bloodGlucoseLineChartData2 = bloodGlucoseLineChartData;
                    if (values.size() > 1) {
                        float f5 = (((time - recyclerBarEntry.timestamp) / (values.size() != 288 ? 3600.0f : 300.0f)) * size) + left;
                        float fK3 = eu3.k(fingerBSList.get(i5).getValue(), recyclerView, rtrVar, this.mBarChartAttrs);
                        this.mLineCirclePaint.setColor(getPointsCircleColor(fingerBSList.get(i5).getValue(), rtrVar.getAxisMaximum()));
                        this.mLineCirclePaint.setStrokeWidth(DisplayUtil.dip2px(4.0f));
                        if (bloodGlucoseEntry.getHighLightType() == 2) {
                            this.mLineCirclePaint.setAlpha(255);
                            float f6 = size * 0.5f;
                            bloodGlucoseEntry.getItem().add(new Pair<>(Float.valueOf(f5 - f6), Float.valueOf(f5 + f6)));
                        } else {
                            this.mLineCirclePaint.setAlpha(25);
                        }
                        canvas.drawCircle(f5, fK3, ((vfe) this.mBarChartAttrs).K0, this.mLineCirclePaint);
                    }
                    i5++;
                    recyclerView = recyclerView;
                    rtrVar = rtrVar;
                    bloodGlucoseLineChartData = bloodGlucoseLineChartData2;
                    z2 = z4;
                }
            } else {
                i = i2;
                paddingTop = paddingTop;
            }
            i2 = i + 1;
            paddingTop = paddingTop;
            childCount = childCount;
            f = f;
        }
        this.mLinePaint.setShader(new LinearGradient(0.0f, paddingTop, 0.0f, f, this.pointColorList, this.pointColorValue, Shader.TileMode.CLAMP));
        canvas.drawPath(path, this.mLinePaint);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0062  */
    /* JADX WARN: Code duplicated, block: B:18:0x007e  */
    public <T extends RecyclerBarEntry> void drawEcgChart(Canvas canvas, RecyclerView recyclerView, rtr rtrVar) {
        float fFloatValue;
        float width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        float paddingLeft = recyclerView.getPaddingLeft();
        int childCount = recyclerView.getChildCount();
        this.mLinePaint.setStrokeWidth(DisplayUtil.dip2px(1.0f));
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            RecyclerBarEntry recyclerBarEntry = (RecyclerBarEntry) childAt.getTag();
            if (i > 0) {
                RecyclerBarEntry recyclerBarEntry2 = (RecyclerBarEntry) recyclerView.getChildAt(i - 1).getTag();
                if (recyclerBarEntry2 instanceof EcgEntry) {
                    List<Float> list = ((EcgEntry) recyclerBarEntry2).f11750a;
                    if (list.size() > 0) {
                        fFloatValue = list.get(list.size() - 1).floatValue();
                    } else {
                        fFloatValue = -2.14748365E9f;
                    }
                } else {
                    fFloatValue = -2.14748365E9f;
                }
            } else {
                fFloatValue = -2.14748365E9f;
            }
            if (recyclerBarEntry instanceof EcgEntry) {
                List<Float> list2 = ((EcgEntry) recyclerBarEntry).f11750a;
                RectF rectFD = eu3.d(childAt, recyclerView, rtrVar, this.mBarChartAttrs, recyclerBarEntry);
                if (rectFD.left >= paddingLeft && rectFD.right <= width) {
                    float fWidth = rectFD.width() / list2.size();
                    float f = rectFD.left;
                    if (fFloatValue == -2.14748365E9f) {
                        fFloatValue = list2.get(0).floatValue();
                    }
                    float fK = eu3.k(fFloatValue, recyclerView, rtrVar, this.mBarChartAttrs);
                    Path path = new Path();
                    path.moveTo(f, fK);
                    for (int i2 = 0; i2 < list2.size(); i2++) {
                        float fK2 = eu3.k(list2.get(i2).floatValue(), recyclerView, rtrVar, this.mBarChartAttrs);
                        Logger.d("EcgLineChartRender", " values:" + list2.get(i2) + " yPosition:" + fK2 + " size:" + list2.size());
                        path.lineTo((((float) i2) * fWidth) + f, fK2);
                    }
                    canvas.drawPath(path, this.mLinePaint);
                }
            }
        }
    }

    public <E extends sf2> void drawLineChart(Canvas canvas, RecyclerView recyclerView, E e) {
        if (((vfe) this.mBarChartAttrs).w) {
            if (AppUtil.isRTLDirection()) {
                drawLineChartWithPointRTL(canvas, recyclerView, e);
                return;
            } else {
                drawLineChartWithPoint(canvas, recyclerView, e);
                return;
            }
        }
        if (AppUtil.isRTLDirection()) {
            drawLineChartWithoutPointRTL(canvas, recyclerView, e);
        } else {
            drawLineChartWithoutPoint(canvas, recyclerView, e);
        }
    }

    public void drawSelectArea(Canvas canvas, RecyclerView recyclerView, float f, float f2, float f3) {
        float paddingLeft = recyclerView.getPaddingLeft();
        float width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        float paddingTop = recyclerView.getPaddingTop();
        float height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
        E e = this.mBarChartAttrs;
        float f4 = height - ((vfe) e).f625a;
        float f5 = f4 - paddingTop;
        float f6 = (f4 - ((f2 * f5) / f)) + ((vfe) e).f626b;
        float f7 = (f4 - ((f5 * f3) / f)) + ((vfe) e).f626b;
        float[] fArr = {paddingLeft, f6, width, f6};
        float[] fArr2 = {paddingLeft, f7, width, f7};
        this.mLineSelectPaint.setColor(x44.a(aji.h));
        Paint paint = this.mLineSelectPaint;
        DisplayUtil displayUtil = DisplayUtil.INSTANCE;
        paint.setPathEffect(new DashPathEffect(new float[]{displayUtil.dip2pxF(4.0f), displayUtil.dip2pxF(1.5f)}, 0.0f));
        canvas.drawLines(fArr, this.mLineSelectPaint);
        canvas.drawLines(fArr2, this.mLineSelectPaint);
    }

    public void drawSelectFill(Canvas canvas, RecyclerView recyclerView, float f, float f2, float f3) {
        float paddingTop = recyclerView.getPaddingTop();
        float height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
        E e = this.mBarChartAttrs;
        float f4 = height - ((vfe) e).f625a;
        float f5 = f4 - paddingTop;
        float f6 = ((vfe) e).f626b;
        float f7 = ((vfe) e).f626b;
        float f8 = (f4 - ((f2 * f5) / f)) + ((vfe) e).f626b;
        float f9 = (f4 - ((f5 * f3) / f)) + ((vfe) e).f626b;
        float f10 = ((vfe) e).f626b;
        float f11 = ((vfe) e).f626b;
        drawSelectFillDrawable(canvas, recyclerView, f8, f9);
    }

    public void drawSelectFillDrawable(Canvas canvas, RecyclerView recyclerView, float f, float f2) {
        float paddingLeft = recyclerView.getPaddingLeft();
        float width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        PointF pointF = new PointF(paddingLeft, f);
        PointF pointF2 = new PointF(width, f);
        E e = this.mBarChartAttrs;
        this.mLineFillPaint.setShader(new LinearGradient(0.0f, f, 0.0f, f2, new int[]{((vfe) e).m0, ((vfe) e).m0}, (float[]) null, Shader.TileMode.CLAMP));
        new xfe(this.mLineFillPaint, eu3.a(pointF, pointF2, f2)).draw(canvas);
    }

    @Override // com.xiaomi.fitness.chart.render.BaseChartRender
    public int getChartColor(RecyclerBarEntry recyclerBarEntry) {
        return ((vfe) this.mBarChartAttrs).O0;
    }

    public void initLineFillPaint() {
        Paint paint = new Paint();
        this.mLineFillPaint = paint;
        paint.reset();
        this.mLineFillPaint.setAntiAlias(true);
        this.mLineFillPaint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.mLineCirclePaint = paint2;
        paint2.reset();
        this.mLineCirclePaint.setAntiAlias(true);
        Paint paint3 = this.mLineCirclePaint;
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        this.mLineCirclePaint.setColor(((vfe) this.mBarChartAttrs).O0);
        Paint paint4 = new Paint();
        this.mLinePaint = paint4;
        paint4.reset();
        this.mLinePaint.setAntiAlias(true);
        this.mLinePaint.setStyle(style);
        Paint paint5 = this.mLinePaint;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint5.setStrokeCap(cap);
        this.mLinePaint.setStrokeWidth(((vfe) this.mBarChartAttrs).N0);
        this.mLinePaint.setColor(((vfe) this.mBarChartAttrs).O0);
        Paint paint6 = new Paint();
        this.mLineSelectPaint = paint6;
        paint6.reset();
        this.mLineSelectPaint.setAntiAlias(true);
        this.mLineSelectPaint.setStyle(style);
        this.mLineSelectPaint.setStrokeCap(cap);
        this.mLineSelectPaint.setStrokeWidth(((vfe) this.mBarChartAttrs).N0);
        this.mLineSelectPaint.setColor(((vfe) this.mBarChartAttrs).O0);
    }

    public void setBreakPointLine(Boolean bool) {
        this.breakPointLineFlag = bool;
    }

    @Override // com.xiaomi.fitness.chart.render.BaseChartRender
    public void setHighLightValueFormatter(onq onqVar) {
        this.mHighLightValueFormatter = onqVar;
    }

    private void drawChartLine(Canvas canvas, float[] fArr, float f) {
        int color = this.mLinePaint.getColor();
        E e = this.mBarChartAttrs;
        if (((vfe) e).O0 == -1) {
            this.mLinePaint.setColor(((vfe) e).g0);
        } else {
            this.mLinePaint.setColor(((vfe) e).O0);
        }
        if (fArr.length >= 4 && fArr[1] >= f && fArr[3] >= f) {
            this.mLinePaint.setColor(0);
        }
        canvas.drawLines(fArr, this.mLinePaint);
        this.mLinePaint.setColor(color);
    }
}
