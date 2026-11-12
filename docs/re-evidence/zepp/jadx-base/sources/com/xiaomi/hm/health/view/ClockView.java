package com.xiaomi.hm.health.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\u0006\u0010#\u001a\u00020\u0006¢\u0006\u0004\b$\u0010%B\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b$\u0010&B\u001b\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b$\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0002J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0012\u0010\u0010\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u000e\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011J\u0016\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d¨\u0006("}, d2 = {"Lcom/xiaomi/hm/health/view/ClockView;", "Landroid/view/View;", "", GoogleApiAvailabilityLight.a, "Landroid/graphics/Canvas;", "canvas", "", "hours", "minutes", "b", "c", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", Constant.PAI_KEY_DAILY_PAI, "a", "onDraw", "", "isAtNight", "updatePaintColor", EcgData.TIMESTAMP_SERVER_UPDATED, "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "mMinuteHandPaint", "mHourHandPaint", "mPaint", "F", "mRadius", "e", LogUtil.I, "mHour", "f", "mMinute", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ClockView extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private Paint mMinuteHandPaint;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private Paint mHourHandPaint;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private Paint mPaint;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private float mRadius;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int mHour;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int mMinute;

    public ClockView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mMinuteHandPaint = new Paint();
        this.mHourHandPaint = new Paint();
        this.mPaint = new Paint();
        d();
    }

    private final float a(Context context, float dp) {
        return TypedValue.applyDimension(1, dp, context.getResources().getDisplayMetrics());
    }

    private final void b(Canvas canvas, int hours, int minutes) {
        double radians = Math.toRadians((hours * 30) + ((minutes * 30) / 60));
        float f = this.mRadius;
        double dCos = ((double) f) + (((double) f) * Math.cos(radians) * 0.52d);
        float f2 = this.mRadius;
        double dSin = ((double) f2) + (((double) f2) * Math.sin(radians) * 0.52d);
        canvas.save();
        float f3 = this.mRadius;
        canvas.rotate(-90.0f, f3, f3);
        float f4 = this.mRadius;
        canvas.drawLine(f4, f4, (float) dCos, (float) dSin, this.mHourHandPaint);
        float f5 = this.mRadius;
        double dCos2 = ((double) f5) - ((((double) f5) * Math.cos(radians)) * 0.15d);
        float f6 = this.mRadius;
        double dSin2 = ((double) f6) - ((((double) f6) * Math.sin(radians)) * 0.15d);
        float f7 = this.mRadius;
        canvas.drawLine(f7, f7, (float) dCos2, (float) dSin2, this.mHourHandPaint);
        canvas.restore();
    }

    private final void c(Canvas canvas, int minutes) {
        double radians = Math.toRadians(minutes * 6);
        float f = this.mRadius;
        double dCos = ((double) f) + (((double) f) * Math.cos(radians) * 0.64d);
        float f2 = this.mRadius;
        double dSin = ((double) f2) + (((double) f2) * Math.sin(radians) * 0.64d);
        canvas.save();
        float f3 = this.mRadius;
        canvas.rotate(-90.0f, f3, f3);
        float f4 = this.mRadius;
        canvas.drawLine(f4, f4, (float) dCos, (float) dSin, this.mMinuteHandPaint);
        float f5 = this.mRadius;
        double dCos2 = ((double) f5) - ((((double) f5) * Math.cos(radians)) * 0.15d);
        float f6 = this.mRadius;
        double dSin2 = ((double) f6) - ((((double) f6) * Math.sin(radians)) * 0.15d);
        float f7 = this.mRadius;
        canvas.drawLine(f7, f7, (float) dCos2, (float) dSin2, this.mMinuteHandPaint);
        canvas.restore();
    }

    private final void d() {
        this.mRadius = a(getContext(), 33.0f);
        this.mPaint.setColor(Color.parseColor("#191919"));
        this.mPaint.setAntiAlias(true);
        this.mMinuteHandPaint.setColor(Color.parseColor("#F4F4F4"));
        this.mMinuteHandPaint.setStrokeWidth(a(getContext(), 2.0f));
        this.mMinuteHandPaint.setAntiAlias(true);
        this.mHourHandPaint.setColor(Color.parseColor("#CCCCCC"));
        this.mHourHandPaint.setStrokeWidth(a(getContext(), 3.0f));
        this.mHourHandPaint.setAntiAlias(true);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // android.view.View
    public void onDraw(@Nullable Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            float f = this.mRadius;
            canvas.drawCircle(f, f, f, this.mPaint);
        }
        if (canvas == null) {
            return;
        }
        b(canvas, this.mHour, this.mMinute);
        c(canvas, this.mMinute);
    }

    public final void updatePaintColor(boolean isAtNight) {
        this.mPaint.setColor(isAtNight ? Color.parseColor("#191919") : Color.parseColor("#F2F3F4"));
        this.mMinuteHandPaint.setColor(isAtNight ? Color.parseColor("#F4F4F4") : Color.parseColor("#979797"));
        this.mHourHandPaint.setColor(isAtNight ? Color.parseColor("#CCCCCC") : Color.parseColor("#666666"));
    }

    public final void updateTime(int hours, int minutes) {
        this.mHour = hours;
        this.mMinute = minutes;
    }

    public ClockView(@NotNull Context context) {
        this(context, null);
    }

    public ClockView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
