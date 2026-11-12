package com.xiaomi.hm.health.healthtag.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.xiaomi.hm.health.healthtag.core.dto.UserMakeTagDto;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010=\u001a\u00020<\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>\u0012\b\b\u0002\u0010@\u001a\u00020\u0002¢\u0006\u0004\bA\u0010BJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\u000bJ\u0014\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0016\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007J\u0018\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0014J\u0012\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR&\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u001ej\b\u0012\u0004\u0012\u00020\u000f`\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$R\"\u0010.\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00101R\u0016\u00106\u001a\u00020/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00101R\u0016\u00109\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010;\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00108¨\u0006C"}, d2 = {"Lcom/xiaomi/hm/health/healthtag/ui/view/SleepTagChart;", "Landroid/view/View;", "", "a", "startValue", "endValue", "Lkotlin/Pair;", "", "b", "Lcom/xiaomi/hm/health/healthtag/ui/view/RenderConfig;", "config", "", "setRenderConfig", "initDraw", "", "Lcom/xiaomi/hm/health/healthtag/core/dto/UserMakeTagDto;", "data", "updateData", "min", "max", "setXMaxMinValue", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Landroid/graphics/Canvas;", "canvas", "onDraw", "", "Ljava/lang/String;", "mTag", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "mData", "Landroid/graphics/Rect;", "c", "Landroid/graphics/Rect;", "srcRect", GoogleApiAvailabilityLight.a, "dstRect", "e", "Lcom/xiaomi/hm/health/healthtag/ui/view/RenderConfig;", "getMConfig", "()Lcom/xiaomi/hm/health/healthtag/ui/view/RenderConfig;", "setMConfig", "(Lcom/xiaomi/hm/health/healthtag/ui/view/RenderConfig;)V", "mConfig", "Landroid/graphics/Paint;", "f", "Landroid/graphics/Paint;", "rectPaint", "g", "tagPaint", "h", "picPaint", "i", "F", "xAxisMin", z.j, "xAxisMax", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SleepTagChart extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String mTag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<UserMakeTagDto> mData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Rect srcRect;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Rect dstRect;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private RenderConfig mConfig;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Paint rectPaint;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Paint tagPaint;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Paint picPaint;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private float xAxisMin;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private float xAxisMax;

    @JvmOverloads
    public SleepTagChart(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public SleepTagChart(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SleepTagChart(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final int a() {
        RenderConfig renderConfig = this.mConfig;
        return (int) ((renderConfig.getMBarHeight() + renderConfig.getMTagBgHeight() + renderConfig.getLbBitmap().getHeight() + renderConfig.getMTagBgWithBarDis()) * renderConfig.getMMaxTagNum());
    }

    private final Pair<Float, Float> b(int startValue, int endValue) {
        float f = endValue;
        float f2 = this.xAxisMin;
        if (f <= f2) {
            return null;
        }
        float f3 = startValue;
        float f4 = this.xAxisMax;
        if (f3 >= f4) {
            return null;
        }
        if (f3 < f2) {
            startValue = (int) f2;
        }
        if (f > f4) {
            endValue = (int) f4;
        }
        float width = (getWidth() - this.mConfig.getChartLeftPadding()) - this.mConfig.getChartRightPadding();
        float f5 = this.xAxisMin;
        float chartLeftPadding = (((startValue - f5) / (this.xAxisMax - f5)) * width) + this.mConfig.getChartLeftPadding();
        float f6 = this.xAxisMin;
        return new Pair<>(Float.valueOf(chartLeftPadding), Float.valueOf((((endValue - f6) / (this.xAxisMax - f6)) * width) + this.mConfig.getChartRightPadding()));
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final RenderConfig getMConfig() {
        return this.mConfig;
    }

    public final void initDraw() {
        this.rectPaint.setColor(this.mConfig.getMColor());
        Paint paint = this.tagPaint;
        paint.setColor(getMConfig().getMTagTextColor());
        paint.setTextSize(getMConfig().getMTagTextSize());
    }

    @Override // android.view.View
    public void onDraw(@Nullable Canvas canvas) {
        super.onDraw(canvas);
        RenderConfig renderConfig = this.mConfig;
        int mBarHeight = (int) (renderConfig.getMBarHeight() + renderConfig.getMTagBgHeight() + renderConfig.getLbBitmap().getHeight() + renderConfig.getMTagBgWithBarDis());
        int i = 0;
        for (UserMakeTagDto userMakeTagDto : this.mData) {
            int height = getHeight() - (i * mBarHeight);
            int i2 = i + 1;
            int height2 = getHeight() - (i2 * mBarHeight);
            Pair<Float, Float> pairB = b(userMakeTagDto.getStartTime(), userMakeTagDto.getEndTime());
            if (pairB != null) {
                if (canvas != null) {
                    canvas.drawRect(pairB.getFirst().floatValue(), (height - renderConfig.getMBarHeight()) - renderConfig.getLbBitmap().getHeight(), pairB.getSecond().floatValue(), height - renderConfig.getLbBitmap().getHeight(), this.rectPaint);
                }
                float fMeasureText = this.tagPaint.measureText(userMakeTagDto.getTag());
                float fFloatValue = (((pairB.getSecond().floatValue() - pairB.getFirst().floatValue()) / 2.0f) + pairB.getFirst().floatValue()) - (fMeasureText / 2.0f);
                this.srcRect.set(0, 0, renderConfig.getMBitmap().getWidth(), renderConfig.getMBitmap().getHeight());
                float f = height2;
                this.dstRect.set((int) (fFloatValue - renderConfig.getMTagRLPadding()), height2, (int) (fMeasureText + fFloatValue + renderConfig.getMTagRLPadding()), (int) (renderConfig.getMTagBgHeight() + f));
                if (canvas != null) {
                    canvas.drawBitmap(renderConfig.getMBitmap(), this.srcRect, this.dstRect, this.picPaint);
                }
                if (canvas != null) {
                    canvas.drawText(userMakeTagDto.getTag(), fFloatValue, f + renderConfig.getMTagTextSize(), this.tagPaint);
                }
                this.srcRect.set(0, 0, renderConfig.getLbBitmap().getWidth(), renderConfig.getLbBitmap().getHeight());
                this.dstRect.set((int) (pairB.getFirst().floatValue() - renderConfig.getLbBitmap().getWidth()), height - renderConfig.getLbBitmap().getHeight(), (int) pairB.getFirst().floatValue(), height);
                if (canvas != null) {
                    canvas.drawBitmap(renderConfig.getLbBitmap(), this.srcRect, this.dstRect, this.picPaint);
                }
                this.srcRect.set(0, 0, renderConfig.getRbBitmap().getWidth(), renderConfig.getRbBitmap().getHeight());
                this.dstRect.set((int) pairB.getSecond().floatValue(), height - renderConfig.getRbBitmap().getHeight(), (int) (pairB.getSecond().floatValue() + renderConfig.getRbBitmap().getWidth()), height);
                if (canvas != null) {
                    canvas.drawBitmap(renderConfig.getRbBitmap(), this.srcRect, this.dstRect, this.picPaint);
                }
            }
            i = i2;
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(heightMeasureSpec);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(a(), 1073741824));
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void setMConfig(@NotNull RenderConfig renderConfig) {
        this.mConfig = renderConfig;
    }

    public final void setRenderConfig(@NotNull RenderConfig config) {
        this.mConfig = config;
        initDraw();
    }

    public final void setXMaxMinValue(float min, float max) {
        this.xAxisMin = min;
        this.xAxisMax = max;
        invalidate();
    }

    public final void updateData(@NotNull List<UserMakeTagDto> data) {
        ArrayList<UserMakeTagDto> arrayList = this.mData;
        arrayList.clear();
        arrayList.addAll(data);
        invalidate();
    }

    @JvmOverloads
    public SleepTagChart(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mTag = "SleepTagChart";
        this.mData = new ArrayList<>();
        this.srcRect = new Rect(0, 0, 0, 0);
        this.dstRect = new Rect(0, 0, 0, 0);
        this.mConfig = new RenderConfig(context);
        Paint paint = new Paint();
        paint.setColor(getMConfig().getMColor());
        Unit unit = Unit.INSTANCE;
        this.rectPaint = paint;
        Paint paint2 = new Paint();
        paint2.setColor(getMConfig().getMTagTextColor());
        paint2.setTextSize(getMConfig().getMTagTextSize());
        this.tagPaint = paint2;
        Paint paint3 = new Paint(1);
        paint3.setTextAlign(Paint.Align.CENTER);
        paint3.setAntiAlias(true);
        this.picPaint = paint3;
    }
}
