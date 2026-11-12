package com.xiaomi.fitness.health.sleep.interfere.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.amap.api.maps.utils.SpatialRelationUtil;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.wearable.hm.BroadcastsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 !2\u00020\u0001:\u0001!B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\tJ0\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aH\u0014J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 H\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/widget/ProgressCircle;", "Landroid/view/View;", "ctx", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", BroadcastsKt.SILENT_PUSHING_PROGRESS, "", "centerX", "centerY", "radius", "path", "Landroid/graphics/Path;", "defaultPaint", "Landroid/graphics/Paint;", "progressPaint", "rectF", "Landroid/graphics/RectF;", "updateProgress", "", "onLayout", "changed", "", "left", "", "top", TSMAuthContants.PARAM_KEY_RIGHT, "bottom", "onDraw", "canvas", "Landroid/graphics/Canvas;", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProgressCircle extends View {
    private float centerX;
    private float centerY;

    @NotNull
    private final Paint defaultPaint;

    @NotNull
    private final Path path;
    private float progress;

    @NotNull
    private final Paint progressPaint;
    private float radius;

    @NotNull
    private final RectF rectF;
    private static final int CIRCLE_WIDTH = ExtUtilsKt.getDp(3);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressCircle(@NotNull Context ctx, @Nullable AttributeSet attributeSet) {
        super(ctx, attributeSet);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        this.path = new Path();
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#338673FA"));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        int i = CIRCLE_WIDTH;
        paint.setStrokeWidth(i);
        this.defaultPaint = paint;
        Paint paint2 = new Paint();
        paint2.setColor(Color.parseColor("#8673FA"));
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(i);
        this.progressPaint = paint2;
        this.rectF = new RectF();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawArc(this.rectF, 0.0f, 360.0f, false, this.defaultPaint);
        canvas.drawArc(this.rectF, 270.0f, SpatialRelationUtil.A_CIRCLE_DEGREE * this.progress, false, this.progressPaint);
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.centerX = getWidth() / 2.0f;
        this.centerY = getHeight() / 2.0f;
        float fCoerceAtMost = (float) (((double) (RangesKt___RangesKt.coerceAtMost(getWidth(), getHeight()) / 2)) * 0.8d);
        this.radius = fCoerceAtMost;
        RectF rectF = this.rectF;
        float f = this.centerX;
        rectF.left = f - fCoerceAtMost;
        float f2 = this.centerY;
        rectF.top = f2 - fCoerceAtMost;
        rectF.right = f + fCoerceAtMost;
        rectF.bottom = f2 + fCoerceAtMost;
    }

    public final void updateProgress(float progress) {
        this.progress = progress;
        requestLayout();
    }

    public /* synthetic */ ProgressCircle(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
