package com.xiaomi.fitness.detail.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.summary.recycler.SportBehaviorModel;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.dki;
import defpackage.j1j;
import defpackage.xr5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 -2\u00020\u0001:\u0001-B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020#H\u0014J\u0010\u0010'\u001a\u00020!2\u0006\u0010(\u001a\u00020)H\u0014J\u000e\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020,R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/xiaomi/fitness/detail/view/SportsBehaviorCircleView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "rect", "Landroid/graphics/Rect;", "getRect", "()Landroid/graphics/Rect;", "setRect", "(Landroid/graphics/Rect;)V", "fontMetrics", "Landroid/graphics/Paint$FontMetrics;", "progressSweepAngle", "", "gradientColors", "", "bounds", "Landroid/graphics/RectF;", "mSweepGradient", "Landroid/graphics/SweepGradient;", BroadcastsKt.SILENT_PUSHING_PROGRESS, "", "progressDes", "title", "baseProgressPaint", "Landroid/graphics/Paint;", "progressPaint", "textPaint", "onSizeChanged", "", Constants.DEVICE_TYPE_WEAR, "", "h", "oldw", "oldh", "onDraw", "canvas", "Landroid/graphics/Canvas;", "updateView", "behavior", "Lcom/xiaomi/fitness/summary/recycler/SportBehaviorModel;", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportsBehaviorCircleView extends View {
    private static final float BASE_START_RANGE = 135.0f;
    private static final float BASE_SWEEP_RANGE = 270.0f;

    @NotNull
    private final Paint baseProgressPaint;

    @NotNull
    private final RectF bounds;

    @NotNull
    private final Paint.FontMetrics fontMetrics;

    @NotNull
    private int[] gradientColors;
    private SweepGradient mSweepGradient;

    @NotNull
    private String progress;

    @NotNull
    private String progressDes;

    @NotNull
    private final Paint progressPaint;
    private float progressSweepAngle;

    @NotNull
    private Rect rect;

    @NotNull
    private final Paint textPaint;

    @NotNull
    private String title;
    private static final float RING_WIDTH = ExtUtilsKt.getDp(Float.valueOf(12.0f));
    private static final float RADIUS = ExtUtilsKt.getDp(Float.valueOf(50.0f));

    public SportsBehaviorCircleView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.rect = new Rect();
        this.fontMetrics = new Paint.FontMetrics();
        this.progressSweepAngle = 80.0f;
        this.gradientColors = new int[]{Color.parseColor("#00E3D2"), Color.parseColor("#1ADDEC"), Color.parseColor("#29B2FF")};
        this.bounds = new RectF();
        this.progress = "";
        this.progressDes = "";
        this.title = "";
        this.baseProgressPaint = new Paint(1);
        this.progressPaint = new Paint(1);
        this.textPaint = new Paint(1);
    }

    @NotNull
    public final Rect getRect() {
        return this.rect;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawArc(this.bounds, BASE_START_RANGE, 270.0f, false, this.baseProgressPaint);
        canvas.drawArc(this.bounds, BASE_START_RANGE, this.progressSweepAngle, false, this.progressPaint);
        this.textPaint.setColor(ViewExtKt.getColor(this, dki.G0));
        this.textPaint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        this.textPaint.setTextSize(ExtUtilsKt.getSp(Float.valueOf(24.0f)));
        Paint.FontMetrics fontMetrics = this.fontMetrics;
        float f = 2;
        float fDescent = (fontMetrics.ascent + fontMetrics.descent) / f;
        if (Intrinsics.areEqual(this.progressDes, "")) {
            fDescent = (this.textPaint.descent() + this.textPaint.ascent()) / f;
        }
        canvas.drawText(this.progress, getWidth() / 2, (getHeight() / 2) - fDescent, this.textPaint);
        this.textPaint.setColor(ViewExtKt.getColor(this, dki.J0));
        this.textPaint.setTextSize(ExtUtilsKt.getSp(Float.valueOf(12.0f)));
        canvas.drawText(this.progressDes, getWidth() / 2, (getHeight() / 2) + fDescent + ExtUtilsKt.getDp(Float.valueOf(20.0f)), this.textPaint);
        this.textPaint.setColor(ViewExtKt.getColor(this, dki.G0));
        this.textPaint.setTextSize(ExtUtilsKt.getSp(Float.valueOf(14.0f)));
        canvas.drawText(this.title, getWidth() / 2, (getHeight() / 2) + RADIUS + ExtUtilsKt.getDp(Float.valueOf(15.0f)), this.textPaint);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        RectF rectF = this.bounds;
        float width = getWidth() / 2;
        float f = RADIUS;
        rectF.set(new RectF(width - f, (getHeight() / 2) - f, (getWidth() / 2) + f, (getHeight() / 2) + f));
        Paint paint = this.baseProgressPaint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.progressPaint.setStyle(style);
        this.baseProgressPaint.setColor(ViewExtKt.getColor(this, dki.V1));
        Paint paint2 = this.baseProgressPaint;
        float f2 = RING_WIDTH;
        paint2.setStrokeWidth(f2);
        this.progressPaint.setStrokeWidth(f2);
        Paint paint3 = this.baseProgressPaint;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        this.progressPaint.setStrokeCap(cap);
        SweepGradient sweepGradient = null;
        this.mSweepGradient = new SweepGradient(getWidth() / 2, getHeight() / 2, this.gradientColors, (float[]) null);
        Matrix matrix = new Matrix();
        matrix.setRotate(90.0f, getWidth() / 2, getHeight() / 2);
        SweepGradient sweepGradient2 = this.mSweepGradient;
        if (sweepGradient2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSweepGradient");
            sweepGradient2 = null;
        }
        sweepGradient2.setLocalMatrix(matrix);
        Paint paint4 = this.progressPaint;
        SweepGradient sweepGradient3 = this.mSweepGradient;
        if (sweepGradient3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSweepGradient");
        } else {
            sweepGradient = sweepGradient3;
        }
        paint4.setShader(sweepGradient);
        this.textPaint.getFontMetrics(this.fontMetrics);
        this.textPaint.setTextAlign(Paint.Align.CENTER);
        this.textPaint.setStyle(Paint.Style.FILL);
    }

    public final void setRect(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<set-?>");
        this.rect = rect;
    }

    public final void updateView(@NotNull SportBehaviorModel behavior) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        int i = behavior.d;
        if (i == 0) {
            this.gradientColors = new int[]{ViewExtKt.getColor(this, dki.a2), ViewExtKt.getColor(this, dki.Y1), ViewExtKt.getColor(this, dki.W1)};
            this.title = ResourceExtKt.getString(j1j.g0);
            float f = behavior.f13233b;
            float fE = f >= 5.0f ? 5.0f : xr5.e(1, f);
            this.progress = String.valueOf(fE);
            this.progressSweepAngle = (fE / 5.0f) * 270.0f;
        } else if (i == 1) {
            this.gradientColors = new int[]{ViewExtKt.getColor(this, dki.b2), ViewExtKt.getColor(this, dki.Z1), ViewExtKt.getColor(this, dki.X1)};
            this.title = ResourceExtKt.getString(j1j.j0);
            float f2 = behavior.f13233b;
            float fE2 = f2 >= 5.0f ? 5.0f : xr5.e(1, f2);
            this.progress = String.valueOf(fE2);
            this.progressSweepAngle = (fE2 / 5.0f) * 270.0f;
        } else if (i == 2) {
            float f3 = behavior.f13233b;
            int i2 = f3 >= 100.0f ? 100 : (int) f3;
            this.progress = String.valueOf(i2);
            this.progressSweepAngle = (i2 / 100.0f) * 270.0f;
            this.title = ResourceExtKt.getString(j1j.R3);
        } else if (i == 3) {
            float f4 = behavior.f13233b;
            int i3 = f4 >= 300.0f ? 300 : (int) f4;
            this.progress = String.valueOf(i3);
            this.progressSweepAngle = (i3 / 300.0f) * 270.0f;
            this.title = ResourceExtKt.getString(j1j.f4);
        } else if (i == 5) {
            this.gradientColors = new int[]{ViewExtKt.getColor(this, dki.b2), ViewExtKt.getColor(this, dki.Z1), ViewExtKt.getColor(this, dki.X1)};
            this.title = ResourceExtKt.getString(j1j.W5);
            float f5 = behavior.f13233b;
            float fE3 = f5 >= 5.0f ? 5.0f : xr5.e(1, f5);
            this.progress = String.valueOf(fE3);
            this.progressSweepAngle = (fE3 / 5.0f) * 270.0f;
        }
        switch (behavior.c) {
            case 1:
                this.progressDes = ResourceExtKt.getString(j1j.r9);
                break;
            case 2:
                this.progressDes = ResourceExtKt.getString(j1j.s9);
                break;
            case 3:
                this.progressDes = ResourceExtKt.getString(j1j.q9);
                break;
            case 4:
                this.progressDes = ResourceExtKt.getString(j1j.o9);
                break;
            case 5:
                this.progressDes = ResourceExtKt.getString(j1j.p9);
                break;
            case 6:
                this.progressDes = ResourceExtKt.getString(j1j.n9);
                break;
        }
        invalidate();
    }
}
