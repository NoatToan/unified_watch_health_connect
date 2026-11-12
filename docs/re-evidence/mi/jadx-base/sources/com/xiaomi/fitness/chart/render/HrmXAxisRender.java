package com.xiaomi.fitness.chart.render;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import defpackage.a52;
import defpackage.fpc;
import defpackage.onq;
import defpackage.vqr;
import defpackage.xr5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/chart/render/HrmXAxisRender;", "La52;", "T", "Lcom/xiaomi/fitness/chart/render/XAxisRender;", "", "initDathPaint", "()V", "Landroid/graphics/Canvas;", "canvas", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Lvqr;", "xAxis", "drawVerticalLine", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Lvqr;)V", "drawXAxis", "Landroid/graphics/Paint;", "mDashPaint", "Landroid/graphics/Paint;", "mBarChartAttrs", "<init>", "(La52;)V", "chart_release"}, k = 1, mv = {2, 0, 0})
public final class HrmXAxisRender<T extends a52> extends XAxisRender<T> {

    @Nullable
    private Paint mDashPaint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HrmXAxisRender(@NotNull T mBarChartAttrs) {
        super(mBarChartAttrs);
        Intrinsics.checkNotNullParameter(mBarChartAttrs, "mBarChartAttrs");
        initDathPaint();
    }

    private final void initDathPaint() {
        Paint paint = new Paint();
        this.mDashPaint = paint;
        Intrinsics.checkNotNull(paint);
        paint.reset();
        Paint paint2 = this.mDashPaint;
        Intrinsics.checkNotNull(paint2);
        paint2.setAntiAlias(true);
        Paint paint3 = this.mDashPaint;
        Intrinsics.checkNotNull(paint3);
        paint3.setStyle(Paint.Style.STROKE);
        Paint paint4 = this.mDashPaint;
        Intrinsics.checkNotNull(paint4);
        paint4.setStrokeWidth(1.0f);
        Paint paint5 = this.mDashPaint;
        Intrinsics.checkNotNull(paint5);
        paint5.setColor(-7829368);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:39:0x0114 A[SYNTHETIC] */
    @Override // com.xiaomi.fitness.chart.render.XAxisRender
    public void drawVerticalLine(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull vqr xAxis) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(xAxis, "xAxis");
        if (getMBarChartAttrs().q) {
            int paddingTop = parent.getPaddingTop();
            int height = parent.getHeight() - parent.getPaddingBottom();
            int paddingLeft = parent.getPaddingLeft();
            int childCount = parent.getChildCount();
            int width = parent.getWidth() - parent.getPaddingRight();
            for (int i = 0; i < childCount; i++) {
                View childAt = parent.getChildAt(i);
                int childAdapterPosition = parent.getChildAdapterPosition(childAt);
                if (childAdapterPosition != -1) {
                    RecyclerView.Adapter adapter = parent.getAdapter();
                    Intrinsics.checkNotNull(adapter);
                    int itemViewType = adapter.getItemViewType(childAdapterPosition);
                    int left = childAt.getLeft();
                    if (left <= width && left >= paddingLeft) {
                        if (itemViewType == 1) {
                            if (getMBarChartAttrs().f628r) {
                                Paint mLinePaint = getMLinePaint();
                                Intrinsics.checkNotNull(mLinePaint);
                                mLinePaint.setColor(xAxis.f37145b);
                                Path path = new Path();
                                float f = left;
                                path.moveTo(f, height - getMBarChartAttrs().f625a);
                                path.lineTo(f, paddingTop);
                                Paint mLinePaint2 = getMLinePaint();
                                Intrinsics.checkNotNull(mLinePaint2);
                                canvas.drawPath(path, mLinePaint2);
                            }
                        } else if (itemViewType != 2) {
                            if (itemViewType != 3) {
                                if (itemViewType == 4) {
                                    if (getMBarChartAttrs().f628r) {
                                        Paint mLinePaint3 = getMLinePaint();
                                        Intrinsics.checkNotNull(mLinePaint3);
                                        mLinePaint3.setColor(xAxis.f37145b);
                                        Path path2 = new Path();
                                        float f2 = left;
                                        path2.moveTo(f2, height - getMBarChartAttrs().f625a);
                                        path2.lineTo(f2, paddingTop);
                                        Paint mLinePaint4 = getMLinePaint();
                                        Intrinsics.checkNotNull(mLinePaint4);
                                        canvas.drawPath(path2, mLinePaint4);
                                    }
                                }
                            } else if (getMBarChartAttrs().t) {
                                DashPathEffect dashPathEffect = new DashPathEffect(new float[]{5.0f, 5.0f, 5.0f, 5.0f}, 1.0f);
                                Paint paint = this.mDashPaint;
                                Intrinsics.checkNotNull(paint);
                                paint.setPathEffect(dashPathEffect);
                                Paint paint2 = this.mDashPaint;
                                Intrinsics.checkNotNull(paint2);
                                paint2.setColor(xAxis.d);
                                Path path3 = new Path();
                                float f3 = left;
                                path3.moveTo(f3, height - getMBarChartAttrs().f625a);
                                path3.lineTo(f3, paddingTop);
                                Paint paint3 = this.mDashPaint;
                                Intrinsics.checkNotNull(paint3);
                                canvas.drawPath(path3, paint3);
                            }
                        } else if (getMBarChartAttrs().s) {
                            Paint mLinePaint5 = getMLinePaint();
                            Intrinsics.checkNotNull(mLinePaint5);
                            mLinePaint5.setColor(xAxis.c);
                            Path path4 = new Path();
                            float f4 = left;
                            path4.moveTo(f4, height - getMBarChartAttrs().f625a);
                            path4.lineTo(f4, paddingTop);
                            Paint mLinePaint6 = getMLinePaint();
                            Intrinsics.checkNotNull(mLinePaint6);
                            canvas.drawPath(path4, mLinePaint6);
                        }
                    }
                }
            }
        }
    }

    @Override // com.xiaomi.fitness.chart.render.XAxisRender
    public void drawXAxis(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull vqr xAxis) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(xAxis, "xAxis");
        if (getMBarChartAttrs().u) {
            int height = parent.getHeight() - parent.getPaddingBottom();
            int paddingLeft = parent.getPaddingLeft();
            int childCount = parent.getChildCount();
            int width = parent.getWidth() - parent.getPaddingRight();
            for (int i = 0; i < childCount; i++) {
                View childAt = parent.getChildAt(i);
                int left = childAt.getLeft();
                int right = childAt.getRight();
                Object tag = childAt.getTag();
                Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.xiaomi.fitness.chart.entrys.RecyclerBarEntry");
                RecyclerBarEntry recyclerBarEntry = (RecyclerBarEntry) tag;
                fpc valueFormatter = xAxis.getValueFormatter();
                String xAxisLabel = valueFormatter instanceof onq ? getXAxisLabel(recyclerBarEntry, (onq) valueFormatter) : "";
                if (!TextUtils.isEmpty(xAxisLabel)) {
                    int width2 = childAt.getWidth();
                    Paint mTextPaint = getMTextPaint();
                    Intrinsics.checkNotNull(mTextPaint);
                    float fMeasureText = mTextPaint.measureText(xAxisLabel);
                    float dp = height - ExtUtilsKt.getDp(Float.valueOf(1.0f));
                    float f = width2;
                    float f2 = f > fMeasureText ? left + ((f - fMeasureText) / 2) : (right - xAxis.e) - fMeasureText;
                    float f3 = f2 + fMeasureText;
                    int length = xAxisLabel.length();
                    float f4 = paddingLeft;
                    if (xr5.a(f2, f4) && xr5.l(f3, width)) {
                        Paint mTextPaint2 = getMTextPaint();
                        Intrinsics.checkNotNull(mTextPaint2);
                        canvas.drawText(xAxisLabel, f2, dp, mTextPaint2);
                    } else if (f2 < f4 && f3 > f4) {
                        Paint mTextPaint3 = getMTextPaint();
                        Intrinsics.checkNotNull(mTextPaint3);
                        canvas.drawText(xAxisLabel, length - ((int) (((f3 - f4) / fMeasureText) * length)), length, f4, dp, mTextPaint3);
                    }
                }
            }
        }
    }
}
