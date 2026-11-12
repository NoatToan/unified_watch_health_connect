package com.xiaomi.fitness.health.sleep.rhythm.rhythm;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import defpackage.iji;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0014J\u000e\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\rR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmChatListView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "chartValues", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmChatListAdapter$SleepRhythmChartValue;", "dashPaint", "Landroid/graphics/Paint;", "colors", "", "[Ljava/lang/Integer;", "paint", "mode", "Landroid/graphics/PorterDuffXfermode;", "getMode", "()Landroid/graphics/PorterDuffXfermode;", "init", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "update", "item", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepRhythmChatListView extends View {

    @NotNull
    private SleepRhythmChatListAdapter.SleepRhythmChartValue chartValues;

    @NotNull
    private final Integer[] colors;

    @NotNull
    private final Paint dashPaint;

    @NotNull
    private final PorterDuffXfermode mode;

    @NotNull
    private final Paint paint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepRhythmChatListView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.chartValues = new SleepRhythmChatListAdapter.SleepRhythmChartValue(0L, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList());
        this.dashPaint = new Paint();
        this.colors = new Integer[]{Integer.valueOf(ExtUtilsKt.getColor(iji.I1)), Integer.valueOf(ExtUtilsKt.getColor(iji.L1)), Integer.valueOf(ExtUtilsKt.getColor(iji.J1)), Integer.valueOf(ExtUtilsKt.getColor(iji.K1))};
        this.paint = new Paint();
        this.mode = new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER);
        init(null);
    }

    private final void init(AttributeSet attrs) {
        this.dashPaint.setColor(ExtUtilsKt.getColor(iji.M1));
        this.dashPaint.setStyle(Paint.Style.STROKE);
        this.dashPaint.setStrokeWidth(ExtUtilsKt.getDp(Float.valueOf(0.5f)));
        this.dashPaint.setPathEffect(new DashPathEffect(new float[]{ExtUtilsKt.getDp(Float.valueOf(5.0f)), ExtUtilsKt.getDp(Float.valueOf(3.0f))}, 0.0f));
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setAlpha(255);
    }

    @NotNull
    public final PorterDuffXfermode getMode() {
        return this.mode;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float width = getWidth() - ExtUtilsKt.getDp(Float.valueOf(5.0f));
        float height = getHeight();
        Float fValueOf = Float.valueOf(2.0f);
        float dp = height - ExtUtilsKt.getDp(fValueOf);
        float f = width / 1440;
        float height2 = getHeight() - ExtUtilsKt.getDp(fValueOf);
        this.paint.setColor(this.colors[3].intValue());
        List<SleepRhythmChatListAdapter.SleepRhythmChartItem> sleepValue = this.chartValues.getSleepValue();
        int size = sleepValue.size();
        for (int i = 0; i < size; i++) {
            float f2 = i * f;
            canvas.drawRect(f2, dp - ((sleepValue.get(i).getValue() / 10000.0f) * height2), f2 + f, dp, this.paint);
        }
        this.paint.setColor(this.colors[1].intValue());
        List<SleepRhythmChatListAdapter.SleepRhythmChartItem> lightValue = this.chartValues.getLightValue();
        int size2 = lightValue.size();
        for (int i2 = 0; i2 < size2; i2++) {
            float f3 = i2 * f;
            canvas.drawRect(f3, dp - ((lightValue.get(i2).getValue() / 10000.0f) * height2), f3 + f, dp, this.paint);
        }
        this.paint.setColor(this.colors[0].intValue());
        List<SleepRhythmChatListAdapter.SleepRhythmChartItem> bodyValue = this.chartValues.getBodyValue();
        int size3 = bodyValue.size();
        for (int i3 = 0; i3 < size3; i3++) {
            float f4 = i3 * f;
            canvas.drawRect(f4, dp - ((bodyValue.get(i3).getValue() / 10000.0f) * height2), f4 + f, dp, this.paint);
        }
        this.paint.setColor(this.colors[2].intValue());
        List<SleepRhythmChatListAdapter.SleepRhythmChartItem> bedValue = this.chartValues.getBedValue();
        int size4 = bedValue.size();
        for (int i4 = 0; i4 < size4; i4++) {
            float f5 = i4 * f;
            canvas.drawRect(f5, dp - ((bedValue.get(i4).getValue() / 10000.0f) * height2), f5 + f, dp, this.paint);
        }
        canvas.drawLine(0.0f, dp, getWidth(), dp, this.dashPaint);
    }

    public final void update(@NotNull SleepRhythmChatListAdapter.SleepRhythmChartValue item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.chartValues = new SleepRhythmChatListAdapter.SleepRhythmChartValue(item.getTime(), item.getLightValue(), item.getBodyValue(), item.getBedValue(), item.getSleepValue());
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepRhythmChatListView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.chartValues = new SleepRhythmChatListAdapter.SleepRhythmChartValue(0L, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList());
        this.dashPaint = new Paint();
        this.colors = new Integer[]{Integer.valueOf(ExtUtilsKt.getColor(iji.I1)), Integer.valueOf(ExtUtilsKt.getColor(iji.L1)), Integer.valueOf(ExtUtilsKt.getColor(iji.J1)), Integer.valueOf(ExtUtilsKt.getColor(iji.K1))};
        this.paint = new Paint();
        this.mode = new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER);
        init(attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepRhythmChatListView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.chartValues = new SleepRhythmChatListAdapter.SleepRhythmChartValue(0L, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList());
        this.dashPaint = new Paint();
        this.colors = new Integer[]{Integer.valueOf(ExtUtilsKt.getColor(iji.I1)), Integer.valueOf(ExtUtilsKt.getColor(iji.L1)), Integer.valueOf(ExtUtilsKt.getColor(iji.J1)), Integer.valueOf(ExtUtilsKt.getColor(iji.K1))};
        this.paint = new Paint();
        this.mode = new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER);
        init(attributeSet);
    }
}
