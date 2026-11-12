package com.xiaomi.hm.health.device.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.lib.view.ViewUtils;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 Z2\u00020\u0001:\u0003\u0012[\\B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\bV\u0010WB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bV\u0010XB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\bV\u0010YJ*\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\u000b\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\tH\u0002J\u0019\u0010\u000f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0002J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\f\u0010\u0017\u001a\u00020\u0016*\u00020\u0006H\u0002J(\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0014J\u0012\u0010\u001f\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0014J\u0012\u0010!\u001a\u00020 2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0017R$\u0010(\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R*\u0010/\u001a\u00020)2\u0006\u0010\u000e\u001a\u00020)8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R.\u00106\u001a\u0004\u0018\u0001002\b\u0010\u000e\u001a\u0004\u0018\u0001008\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0016\u00108\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u00107R&\u0010=\u001a\u0012\u0012\u0004\u0012\u00020:09j\b\u0012\u0004\u0012\u00020:`;8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010<R&\u0010>\u001a\u0012\u0012\u0004\u0012\u00020\r09j\b\u0012\u0004\u0012\u00020\r`;8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010<R\u0016\u0010@\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010?R\u0016\u0010A\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010?R\u0016\u0010C\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010?R\u0016\u0010E\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010?R\u0016\u0010G\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010?R\u0016\u0010I\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010?R\u0016\u0010M\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010O\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010LR\u0016\u0010Q\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010LR\u0016\u0010S\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010LR\u0016\u0010U\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010L¨\u0006]"}, d2 = {"Lcom/xiaomi/hm/health/device/view/EqView;", "Landroid/view/View;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "", GoogleApiAvailabilityLight.a, "e", "f", "", "value", "c", "(Ljava/lang/Float;)F", "y", "a", "Landroid/view/MotionEvent;", "event", "b", "", "g", "w", "h", "oldw", "oldh", "onSizeChanged", "Landroid/graphics/Canvas;", "canvas", "onDraw", "", "onTouchEvent", "Lcom/xiaomi/hm/health/device/view/EqView$EqListener;", "Lcom/xiaomi/hm/health/device/view/EqView$EqListener;", "getEqListener", "()Lcom/xiaomi/hm/health/device/view/EqView$EqListener;", "setEqListener", "(Lcom/xiaomi/hm/health/device/view/EqView$EqListener;)V", "eqListener", "Lcom/xiaomi/hm/health/device/view/EqView$Config;", "Lcom/xiaomi/hm/health/device/view/EqView$Config;", "getConfig", "()Lcom/xiaomi/hm/health/device/view/EqView$Config;", "setConfig", "(Lcom/xiaomi/hm/health/device/view/EqView$Config;)V", "config", "", "[F", "getValues", "()[F", "setValues", "([F)V", "values", LogUtil.I, "touchPosition", "Ljava/util/ArrayList;", "Landroid/graphics/RectF;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "slideArea", "slideValues", "F", "slideY", "slideHeight", "i", "slideWidth", z.j, "frequencyTextY", hl.k, "textPadding", "l", "slideBarRadius", "Landroid/graphics/Paint;", "m", "Landroid/graphics/Paint;", "slidePaint", GoogleApiAvailabilityLight.b, "slideBackgroundPaint", "o", "slideBarPaint", b.r, "strokeJoinPaint", DTransferConstants.SEARCH_KEY, "frequencyTextPaint", "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "r", "Config", "EqListener", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class EqView extends View {

    @Deprecated
    public static final int FREQUENCY_UNIT = 1000;

    @Deprecated
    public static final int INVALID_VALUE = -1;

    @NotNull
    private static final a r = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private EqListener eqListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private Config config;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private float[] values;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int touchPosition;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<RectF> slideArea;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<Float> slideValues;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private float slideY;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private float slideHeight;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private float slideWidth;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private float frequencyTextY;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private float textPadding;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private float slideBarRadius;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private Paint slidePaint;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private Paint slideBackgroundPaint;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private Paint slideBarPaint;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private Paint strokeJoinPaint;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private Paint frequencyTextPaint;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/device/view/EqView$EqListener;", "", "", "index", "", "gain", "", "onGainUpdate", "onGainChanged", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public interface EqListener {
        void onGainChanged(int index, float gain);

        void onGainUpdate(int index, float gain);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"com/xiaomi/hm/health/device/view/EqView$a", "", "", "FREQUENCY_UNIT", LogUtil.I, "INVALID_VALUE", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public EqView(@NotNull Context context) {
        this(context, null);
    }

    private final float a(float y) {
        int first;
        IntRange range = this.config.getRange();
        int degree = this.config.getDegree();
        float f = y - this.slideY;
        float f2 = degree;
        float fCount = (this.slideHeight / (CollectionsKt___CollectionsKt.count(range) - 1)) * f2;
        float f3 = fCount / 2;
        float f4 = this.slideHeight - f3;
        if (f < f3) {
            first = range.getLast();
        } else {
            if (f <= f4) {
                return range.getLast() - ((((int) ((f - f3) / fCount)) + 1) * (1.0f / f2));
            }
            first = range.getFirst();
        }
        return first;
    }

    private final int b(MotionEvent event) {
        int frequencyCount = this.config.getFrequencyCount();
        if (frequencyCount <= 0) {
            return -1;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (this.slideArea.get(i).contains(event.getX(), event.getY())) {
                return i;
            }
            if (i2 >= frequencyCount) {
                return -1;
            }
            i = i2;
        }
    }

    private final float c(Float value) {
        IntRange range = this.config.getRange();
        int degree = this.config.getDegree();
        float fFloatValue = value == null ? 0.0f : value.floatValue();
        float f = degree;
        boolean z = ((int) (Math.abs(((float) range.getFirst()) - fFloatValue) * f)) == 0 || fFloatValue < ((float) range.getFirst());
        boolean z2 = ((int) (Math.abs(((float) range.getLast()) - fFloatValue) * f)) == 0 || fFloatValue > ((float) range.getLast());
        if (z) {
            return this.slideY + this.slideHeight;
        }
        if (z2) {
            return this.slideY;
        }
        return ((this.slideHeight * ((range.getLast() - fFloatValue) * f)) / ((CollectionsKt___CollectionsKt.count(range) - 1) * degree)) + this.slideY;
    }

    private final void d(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.EqView, defStyleAttr, defStyleRes);
        float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.EqView_slideWidth, DensityUtil.dp2px(2.0f));
        Paint paint = this.slidePaint;
        paint.setColor(typedArrayObtainStyledAttributes.getColor(R.styleable.EqView_slideColor, Color.parseColor("#FF5353")));
        paint.setStrokeWidth(dimensionPixelSize);
        Paint paint2 = this.slideBackgroundPaint;
        paint2.setColor(typedArrayObtainStyledAttributes.getColor(R.styleable.EqView_slideBackgroundColor, Color.parseColor("#EFEFEF")));
        paint2.setStrokeWidth(dimensionPixelSize);
        this.slideBarRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.EqView_slideBarRadius, DensityUtil.dp2px(8.0f));
        this.slideBarPaint.setColor(typedArrayObtainStyledAttributes.getColor(R.styleable.EqView_slideBarColor, Color.parseColor("#FF5353")));
        Paint paint3 = this.strokeJoinPaint;
        paint3.setColor(typedArrayObtainStyledAttributes.getColor(R.styleable.EqView_strokeJoinColor, Color.parseColor("#33FF5353")));
        paint3.setStrokeWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.EqView_strokeJoinWidth, DensityUtil.dp2px(3.47f)));
        this.textPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.EqView_textPadding, DensityUtil.dp2px(14.0f));
        Paint paint4 = this.frequencyTextPaint;
        paint4.setColor(typedArrayObtainStyledAttributes.getColor(R.styleable.EqView_frequencyTextColor, Color.parseColor("#999999")));
        paint4.setTextSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.EqView_frequencyTextSize, (int) ViewUtils.sp2px(context, 12.5f)));
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void e() {
        Paint.FontMetrics fontMetrics = this.frequencyTextPaint.getFontMetrics();
        this.frequencyTextY = (getHeight() - getPaddingBottom()) - ((fontMetrics.bottom - fontMetrics.top) / 2);
        float paddingTop = getPaddingTop();
        float f = this.slideBarRadius;
        float f2 = paddingTop + f;
        this.slideY = f2;
        this.slideHeight = ((this.frequencyTextY - f2) - this.textPadding) - f;
        this.slideWidth = ((getWidth() - getPaddingStart()) - getPaddingEnd()) / this.config.getFrequencyCount();
    }

    private final void f() {
        this.slideArea.clear();
        this.slideValues.clear();
        int paddingStart = getPaddingStart();
        int frequencyCount = this.config.getFrequencyCount();
        if (frequencyCount <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            float f = paddingStart;
            float f2 = this.slideWidth;
            this.slideArea.add(new RectF((i * f2) + f, 0.0f, f + (f2 * i2), this.frequencyTextY));
            ArrayList<Float> arrayList = this.slideValues;
            float[] fArr = this.values;
            arrayList.add(Float.valueOf(c(fArr == null ? null : Float.valueOf(fArr[i]))));
            if (i2 >= frequencyCount) {
                return;
            } else {
                i = i2;
            }
        }
    }

    private final String g(int i) {
        if (i < 1000) {
            return String.valueOf(i);
        }
        return (i / 1000) + "K";
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final Config getConfig() {
        return this.config;
    }

    @Nullable
    public final EqListener getEqListener() {
        return this.eqListener;
    }

    @Nullable
    public final float[] getValues() {
        return this.values;
    }

    @Override // android.view.View
    public void onDraw(@Nullable Canvas canvas) {
        if (canvas == null || getWidth() == -1 || getHeight() == -1) {
            return;
        }
        int frequencyCount = this.config.getFrequencyCount();
        float f = this.slideY;
        float f2 = f + this.slideHeight;
        float paddingStart = getPaddingStart() + (this.slideWidth / 2);
        if (frequencyCount <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            float f3 = paddingStart + (this.slideWidth * i);
            canvas.drawLine(f3, f, f3, f2, this.slideBackgroundPaint);
            if (i < frequencyCount - 1) {
                canvas.drawLine(f3, this.slideValues.get(i).floatValue(), paddingStart + (this.slideWidth * i2), this.slideValues.get(i2).floatValue(), this.strokeJoinPaint);
            }
            canvas.drawLine(f3, this.slideValues.get(i).floatValue(), f3, f2, this.slidePaint);
            canvas.drawCircle(f3, this.slideValues.get(i).floatValue(), this.slideBarRadius, this.slideBarPaint);
            canvas.drawText(g(this.config.getFrequencyList().get(i).intValue()), f3, this.frequencyTextY, this.frequencyTextPaint);
            if (i2 >= frequencyCount) {
                return;
            } else {
                i = i2;
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        e();
        f();
        invalidate();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@Nullable MotionEvent event) {
        if (event == null) {
            return super.onTouchEvent(event);
        }
        float y = this.slideY;
        float f = this.slideHeight + y;
        int action = event.getAction();
        if (action == 0) {
            int iB = b(event);
            if (iB == -1) {
                return super.onTouchEvent(event);
            }
            this.touchPosition = iB;
            this.slideValues.set(iB, Float.valueOf(event.getY()));
            invalidate();
            return true;
        }
        if (action == 1) {
            if (event.getY() >= y) {
                y = event.getY() > f ? f : event.getY();
            }
            float fA = a(y);
            float[] fArr = this.values;
            if (fArr != null) {
                fArr[this.touchPosition] = fA;
            }
            EqListener eqListener = this.eqListener;
            if (eqListener != null) {
                eqListener.onGainChanged(this.touchPosition, fA);
            }
            this.slideValues.set(this.touchPosition, Float.valueOf(c(Float.valueOf(fA))));
            invalidate();
        } else if (action == 2) {
            ArrayList<Float> arrayList = this.slideValues;
            int i = this.touchPosition;
            if (event.getY() >= y) {
                y = event.getY() > f ? f : event.getY();
            }
            arrayList.set(i, Float.valueOf(y));
            EqListener eqListener2 = this.eqListener;
            if (eqListener2 != null) {
                int i2 = this.touchPosition;
                eqListener2.onGainUpdate(i2, a(this.slideValues.get(i2).floatValue()));
            }
            invalidate();
        }
        return super.onTouchEvent(event);
    }

    public final void setConfig(@NotNull Config config) {
        if (Intrinsics.areEqual(this.config, config)) {
            return;
        }
        this.config = config;
        e();
        f();
        invalidate();
    }

    public final void setEqListener(@Nullable EqListener eqListener) {
        this.eqListener = eqListener;
    }

    public final void setValues(@Nullable float[] fArr) {
        float[] fArr2 = this.values;
        if (fArr == null || fArr2 == null || !Arrays.equals(fArr, fArr2)) {
            this.values = fArr;
            this.slideValues.clear();
            int i = 0;
            int frequencyCount = this.config.getFrequencyCount();
            if (frequencyCount > 0) {
                while (true) {
                    int i2 = i + 1;
                    Float fValueOf = null;
                    if (fArr != null && i < fArr.length) {
                        fValueOf = Float.valueOf(fArr[i]);
                    }
                    this.slideValues.add(Float.valueOf(c(fValueOf)));
                    if (i2 >= frequencyCount) {
                        break;
                    } else {
                        i = i2;
                    }
                }
            }
            invalidate();
        }
    }

    public EqView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EqView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.config = new Config(null, null, 0, 7, null);
        this.touchPosition = -1;
        this.slideArea = new ArrayList<>();
        this.slideValues = new ArrayList<>();
        Paint paint = new Paint(1);
        paint.setStrokeCap(Paint.Cap.ROUND);
        Unit unit = Unit.INSTANCE;
        this.slidePaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        this.slideBackgroundPaint = paint2;
        this.slideBarPaint = new Paint(1);
        this.strokeJoinPaint = new Paint(1);
        Paint paint3 = new Paint(1);
        paint3.setTextAlign(Paint.Align.CENTER);
        this.frequencyTextPaint = paint3;
        d(context, attributeSet, i, R.style.EqView);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\u0012B+\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b \u0010!J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J-\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\n\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u001f\u001a\u00020\u00038F@\u0006¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001d¨\u0006#"}, d2 = {"Lcom/xiaomi/hm/health/device/view/EqView$Config;", "", "", "", "component1", "Lkotlin/ranges/IntRange;", "component2", "component3", "frequencyList", "range", "degree", "copy", "", "toString", "hashCode", "other", "", "equals", "a", "Ljava/util/List;", "getFrequencyList", "()Ljava/util/List;", "b", "Lkotlin/ranges/IntRange;", "getRange", "()Lkotlin/ranges/IntRange;", "c", LogUtil.I, "getDegree", "()I", "getFrequencyCount", "frequencyCount", "<init>", "(Ljava/util/List;Lkotlin/ranges/IntRange;I)V", GoogleApiAvailabilityLight.a, "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Config {

        @Deprecated
        public static final int MAX_DEGREE = 1000;

        @NotNull
        private static final a d = new a(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final List<Integer> frequencyList;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        private final IntRange range;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        private final int degree;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/xiaomi/hm/health/device/view/EqView$Config$a", "", "", "MAX_DEGREE", LogUtil.I, "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public Config() {
            this(null, null, 0, 7, null);
        }

        public Config(@NotNull List<Integer> list, @NotNull IntRange intRange, int i) {
            this.frequencyList = list;
            this.range = intRange;
            this.degree = i;
            if (getFrequencyCount() <= 0) {
                throw new IllegalArgumentException("Frequency list can't be empty.");
            }
            if (intRange.isEmpty()) {
                throw new IllegalArgumentException("Gain range can't be empty.");
            }
            if (i <= 0) {
                throw new IllegalArgumentException("Degree must be positive.");
            }
            if (i > 1000) {
                throw new IllegalArgumentException("Max degree is 1000.");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Config copy$default(Config config, List list, IntRange intRange, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                list = config.frequencyList;
            }
            if ((i2 & 2) != 0) {
                intRange = config.range;
            }
            if ((i2 & 4) != 0) {
                i = config.degree;
            }
            return config.copy(list, intRange, i);
        }

        @NotNull
        public final List<Integer> component1() {
            return this.frequencyList;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final IntRange getRange() {
            return this.range;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getDegree() {
            return this.degree;
        }

        @NotNull
        public final Config copy(@NotNull List<Integer> frequencyList, @NotNull IntRange range, int degree) {
            return new Config(frequencyList, range, degree);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return Intrinsics.areEqual(this.frequencyList, config.frequencyList) && Intrinsics.areEqual(this.range, config.range) && this.degree == config.degree;
        }

        public final int getDegree() {
            return this.degree;
        }

        public final int getFrequencyCount() {
            return this.frequencyList.size();
        }

        @NotNull
        public final List<Integer> getFrequencyList() {
            return this.frequencyList;
        }

        @NotNull
        public final IntRange getRange() {
            return this.range;
        }

        public int hashCode() {
            return (((this.frequencyList.hashCode() * 31) + this.range.hashCode()) * 31) + this.degree;
        }

        @NotNull
        public String toString() {
            return "Config(frequencyList=" + this.frequencyList + ", range=" + this.range + ", degree=" + this.degree + ")";
        }

        public /* synthetic */ Config(List list, IntRange intRange, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{31, 62, 125, 250, 500, 1000, 2000, 4000, 8000, 16000}) : list, (i2 & 2) != 0 ? new IntRange(-12, 12) : intRange, (i2 & 4) != 0 ? 1 : i);
        }
    }
}
