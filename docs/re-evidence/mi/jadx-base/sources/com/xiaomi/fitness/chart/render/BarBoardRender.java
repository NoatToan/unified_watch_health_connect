package com.xiaomi.fitness.chart.render;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import defpackage.a52;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b \u0010\u0016J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000eR\"\u0010\u0011\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\"\u0010\u001b\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/chart/render/BarBoardRender;", "La52;", "V", "", "", "initBarBorderPaint", "()V", "initTopBarBorderPaint", "initBgPaint", "Landroid/graphics/Canvas;", "canvas", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "drawBg", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;)V", "drawBarBorder", "drawBarBorder1", "mBarChartAttrs", "La52;", "getMBarChartAttrs", "()La52;", "setMBarChartAttrs", "(La52;)V", "Landroid/graphics/Paint;", "mBarBorderPaint", "Landroid/graphics/Paint;", "mTopBarBorderPaint", "mBgPaint", "getMBgPaint", "()Landroid/graphics/Paint;", "setMBgPaint", "(Landroid/graphics/Paint;)V", "<init>", "chart_release"}, k = 1, mv = {2, 0, 0})
public final class BarBoardRender<V extends a52> {
    private Paint mBarBorderPaint;

    @NotNull
    private V mBarChartAttrs;
    public Paint mBgPaint;
    private Paint mTopBarBorderPaint;

    public BarBoardRender(@NotNull V mBarChartAttrs) {
        Intrinsics.checkNotNullParameter(mBarChartAttrs, "mBarChartAttrs");
        this.mBarChartAttrs = mBarChartAttrs;
        initBarBorderPaint();
        initBgPaint();
        initTopBarBorderPaint();
    }

    private final void drawBg(Canvas canvas, RecyclerView parent) {
        if (this.mBarChartAttrs.z) {
            RectF rectF = new RectF();
            rectF.set(parent.getPaddingLeft(), parent.getPaddingTop(), parent.getRight() - parent.getPaddingRight(), (parent.getHeight() - parent.getPaddingBottom()) - this.mBarChartAttrs.f625a);
            canvas.drawRect(rectF, getMBgPaint());
        }
    }

    private final void initBarBorderPaint() {
        Paint paint = new Paint();
        this.mBarBorderPaint = paint;
        paint.reset();
        Paint paint2 = this.mBarBorderPaint;
        Paint paint3 = null;
        if (paint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBarBorderPaint");
            paint2 = null;
        }
        paint2.setAntiAlias(true);
        Paint paint4 = this.mBarBorderPaint;
        if (paint4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBarBorderPaint");
            paint4 = null;
        }
        paint4.setStyle(Paint.Style.STROKE);
        Paint paint5 = this.mBarBorderPaint;
        if (paint5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBarBorderPaint");
            paint5 = null;
        }
        paint5.setStrokeWidth(1.0f);
        Paint paint6 = this.mBarBorderPaint;
        if (paint6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBarBorderPaint");
        } else {
            paint3 = paint6;
        }
        paint3.setColor(this.mBarChartAttrs.b0);
    }

    private final void initBgPaint() {
        setMBgPaint(new Paint());
        getMBgPaint().reset();
        getMBgPaint().setAntiAlias(true);
        getMBgPaint().setAlpha(51);
        getMBgPaint().setColor(this.mBarChartAttrs.c0);
    }

    private final void initTopBarBorderPaint() {
        Paint paint = new Paint();
        this.mTopBarBorderPaint = paint;
        paint.reset();
        Paint paint2 = this.mTopBarBorderPaint;
        Paint paint3 = null;
        if (paint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTopBarBorderPaint");
            paint2 = null;
        }
        paint2.setAntiAlias(true);
        Paint paint4 = this.mTopBarBorderPaint;
        if (paint4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTopBarBorderPaint");
            paint4 = null;
        }
        paint4.setStyle(Paint.Style.STROKE);
        Paint paint5 = this.mTopBarBorderPaint;
        if (paint5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTopBarBorderPaint");
            paint5 = null;
        }
        paint5.setStrokeWidth(1.0f);
        Paint paint6 = this.mTopBarBorderPaint;
        if (paint6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTopBarBorderPaint");
        } else {
            paint3 = paint6;
        }
        paint3.setColor(this.mBarChartAttrs.b0);
    }

    public final void drawBarBorder(@NotNull Canvas canvas, @NotNull RecyclerView parent) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (this.mBarChartAttrs.y) {
            float paddingTop = parent.getPaddingTop();
            float width = AppUtil.isRTLDirection() ? parent.getWidth() - parent.getPaddingRight() : parent.getPaddingLeft();
            float paddingLeft = AppUtil.isRTLDirection() ? parent.getPaddingLeft() : parent.getWidth() - parent.getPaddingRight();
            float height = (parent.getHeight() - parent.getPaddingBottom()) - this.mBarChartAttrs.f625a;
            Path path = new Path();
            path.moveTo(width, height);
            path.lineTo(width, paddingTop);
            Paint paint = this.mBarBorderPaint;
            Paint paint2 = null;
            if (paint == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBarBorderPaint");
                paint = null;
            }
            canvas.drawPath(path, paint);
            Path path2 = new Path();
            path2.moveTo(paddingLeft, height);
            path2.lineTo(paddingLeft, paddingTop);
            Paint paint3 = this.mBarBorderPaint;
            if (paint3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBarBorderPaint");
                paint3 = null;
            }
            canvas.drawPath(path2, paint3);
            Path path3 = new Path();
            path3.moveTo(width, paddingTop);
            path3.lineTo(paddingLeft, paddingTop);
            if (this.mBarChartAttrs.l) {
                Paint paint4 = this.mTopBarBorderPaint;
                if (paint4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTopBarBorderPaint");
                    paint4 = null;
                }
                paint4.setPathEffect(new DashPathEffect(new float[]{ExtUtilsKt.getDp(Float.valueOf(4.0f)), ExtUtilsKt.getDp(Float.valueOf(1.5f))}, 0.0f));
            }
            Paint paint5 = this.mTopBarBorderPaint;
            if (paint5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTopBarBorderPaint");
            } else {
                paint2 = paint5;
            }
            canvas.drawPath(path3, paint2);
        }
        drawBg(canvas, parent);
    }

    public final void drawBarBorder1(@NotNull Canvas canvas, @NotNull RecyclerView parent) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (this.mBarChartAttrs.y) {
            float paddingTop = parent.getPaddingTop();
            float width = AppUtil.isRTLDirection() ? parent.getWidth() - parent.getPaddingRight() : parent.getPaddingLeft();
            float paddingLeft = AppUtil.isRTLDirection() ? parent.getPaddingLeft() : parent.getWidth() - parent.getPaddingRight();
            float height = (parent.getHeight() - parent.getPaddingBottom()) - this.mBarChartAttrs.f625a;
            Path path = new Path();
            path.moveTo(paddingLeft, paddingTop);
            path.lineTo(paddingLeft, height);
            path.moveTo(width, paddingTop);
            path.lineTo(width, height);
            Paint paint = this.mBarBorderPaint;
            if (paint == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBarBorderPaint");
                paint = null;
            }
            canvas.drawPath(path, paint);
        }
    }

    @NotNull
    public final V getMBarChartAttrs() {
        return this.mBarChartAttrs;
    }

    @NotNull
    public final Paint getMBgPaint() {
        Paint paint = this.mBgPaint;
        if (paint != null) {
            return paint;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mBgPaint");
        return null;
    }

    public final void setMBarChartAttrs(@NotNull V v) {
        Intrinsics.checkNotNullParameter(v, "<set-?>");
        this.mBarChartAttrs = v;
    }

    public final void setMBgPaint(@NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<set-?>");
        this.mBgPaint = paint;
    }
}
