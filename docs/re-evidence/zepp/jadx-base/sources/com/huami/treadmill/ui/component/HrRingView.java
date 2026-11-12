package com.huami.treadmill.ui.component;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.treadmill.R;
import com.huami.treadmill.util.HeartRateIntervalUtils;
import com.loc.z;
import com.xiaomi.hm.health.Constant;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b5\u00106B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b5\u00109B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u00108\u001a\u0004\u0018\u000107\u0012\u0006\u0010:\u001a\u00020\t¢\u0006\u0004\b5\u0010;J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0014J\u0012\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\tR\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00068\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0016\u0010\"\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010!R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010'R\u0016\u0010,\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010'R\u0016\u0010.\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010'R\u0016\u00100\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010!R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u0006<"}, d2 = {"Lcom/huami/treadmill/ui/component/HrRingView;", "Landroid/view/View;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "b", "", Constant.PAI_KEY_DAILY_PAI, "a", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Landroid/graphics/Canvas;", "canvas", "onDraw", "value", "setHr", "Landroid/content/Context;", "mContext", "F", "RING_WIDTH", "c", "mRingWidthPx", GoogleApiAvailabilityLight.a, "mCurRingWidthPx", "Landroid/graphics/RectF;", "e", "Landroid/graphics/RectF;", "mRingRect", "f", "mCurRingRect", "g", LogUtil.I, "mViewWidth", "h", "mViewHeight", "Landroid/graphics/Paint;", "i", "Landroid/graphics/Paint;", "mRingBgPaint", z.j, "mCirclePaint", hl.k, "mRingPaint", "l", "mCurRingPaint", "m", "mHrValue", "", GoogleApiAvailabilityLight.b, "[I", "mColors", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class HrRingView extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context mContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float RING_WIDTH;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private float mRingWidthPx;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private float mCurRingWidthPx;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private RectF mRingRect;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private RectF mCurRingRect;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int mViewWidth;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int mViewHeight;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private Paint mRingBgPaint;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private Paint mCirclePaint;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private Paint mRingPaint;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private Paint mCurRingPaint;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private int mHrValue;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    private int[] mColors;

    public HrRingView(@NotNull Context context) {
        this(context, null);
    }

    private final float a(Context context, float dp) {
        return TypedValue.applyDimension(1, dp, context.getResources().getDisplayMetrics());
    }

    private final void b(Context context) {
        this.mColors = context.getResources().getIntArray(R.array.td_hr_section_colors);
        float fA = a(context, this.RING_WIDTH);
        this.mRingWidthPx = fA;
        this.mCurRingWidthPx = fA * 2;
        this.mRingRect = new RectF();
        this.mCurRingRect = new RectF();
        Paint paint = new Paint();
        this.mRingBgPaint = paint;
        Objects.requireNonNull(paint);
        paint.setAntiAlias(true);
        Paint paint2 = this.mRingBgPaint;
        Objects.requireNonNull(paint2);
        paint2.setStyle(Paint.Style.STROKE);
        Paint paint3 = this.mRingBgPaint;
        Objects.requireNonNull(paint3);
        int i = R.color.td_hr_tape_rest;
        paint3.setColor(ContextCompat.getColor(context, i));
        Paint paint4 = this.mRingBgPaint;
        Objects.requireNonNull(paint4);
        paint4.setStrokeWidth(this.mRingWidthPx);
        Paint paint5 = new Paint();
        this.mCirclePaint = paint5;
        Objects.requireNonNull(paint5);
        paint5.setAntiAlias(true);
        Paint paint6 = this.mCirclePaint;
        Objects.requireNonNull(paint6);
        paint6.setColor(ContextCompat.getColor(context, i));
        Paint paint7 = this.mCirclePaint;
        Objects.requireNonNull(paint7);
        paint7.setStyle(Paint.Style.FILL);
        Paint paint8 = new Paint();
        this.mRingPaint = paint8;
        Objects.requireNonNull(paint8);
        paint8.setAntiAlias(true);
        Paint paint9 = this.mRingPaint;
        Objects.requireNonNull(paint9);
        paint9.setStyle(Paint.Style.STROKE);
        Paint paint10 = this.mRingPaint;
        Objects.requireNonNull(paint10);
        paint10.setStrokeWidth(this.mRingWidthPx);
        Paint paint11 = new Paint();
        this.mCurRingPaint = paint11;
        Objects.requireNonNull(paint11);
        paint11.setAntiAlias(true);
        Paint paint12 = this.mCurRingPaint;
        Objects.requireNonNull(paint12);
        paint12.setStyle(Paint.Style.STROKE);
        Paint paint13 = this.mCurRingPaint;
        Objects.requireNonNull(paint13);
        paint13.setStrokeWidth(this.mCurRingWidthPx);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // android.view.View
    public void onDraw(@Nullable Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            canvas.drawColor(0);
        }
        if (canvas != null) {
            float f = this.mViewWidth / 2;
            int i = this.mViewHeight;
            float f2 = i / 2;
            float f3 = (i / 2) - this.mRingWidthPx;
            Paint paint = this.mCirclePaint;
            Objects.requireNonNull(paint);
            canvas.drawCircle(f, f2, f3, paint);
        }
        RectF rectF = this.mRingRect;
        Objects.requireNonNull(rectF);
        float f4 = this.mRingWidthPx;
        float f5 = 2;
        rectF.top = f4 / f5;
        Objects.requireNonNull(rectF);
        rectF.left = f4 / f5;
        Objects.requireNonNull(rectF);
        int i2 = this.mViewWidth;
        rectF.right = i2 - (f4 / f5);
        Objects.requireNonNull(rectF);
        int i3 = this.mViewHeight;
        rectF.bottom = i3 - (f4 / f5);
        RectF rectF2 = this.mCurRingRect;
        Objects.requireNonNull(rectF2);
        float f6 = this.mCurRingWidthPx;
        rectF2.top = f6 / f5;
        Objects.requireNonNull(rectF2);
        rectF2.left = f6 / f5;
        Objects.requireNonNull(rectF2);
        rectF2.right = i2 - (f6 / f5);
        Objects.requireNonNull(rectF2);
        rectF2.bottom = i3 - (f6 / f5);
        if (canvas != null) {
            Objects.requireNonNull(rectF);
            Paint paint2 = this.mRingBgPaint;
            Objects.requireNonNull(paint2);
            canvas.drawArc(rectF, -90.0f, 360.0f, false, paint2);
        }
        int hrInterval = HeartRateIntervalUtils.getHrInterval(this.mHrValue);
        int i4 = 1;
        while (true) {
            int i5 = i4 + 1;
            int[] iArr = this.mColors;
            Integer numValueOf = iArr == null ? null : Integer.valueOf(iArr[i4]);
            if (hrInterval == i4) {
                Paint paint3 = this.mCurRingPaint;
                Objects.requireNonNull(paint3);
                paint3.setColor(numValueOf.intValue());
                if (canvas != null) {
                    RectF rectF3 = this.mCurRingRect;
                    Objects.requireNonNull(rectF3);
                    Paint paint4 = this.mCurRingPaint;
                    Objects.requireNonNull(paint4);
                    canvas.drawArc(rectF3, ((i4 - 1) * 56) + 131, 54.0f, false, paint4);
                }
            } else {
                Paint paint5 = this.mRingPaint;
                Objects.requireNonNull(paint5);
                paint5.setColor(numValueOf.intValue());
                if (canvas != null) {
                    RectF rectF4 = this.mRingRect;
                    Objects.requireNonNull(rectF4);
                    Paint paint6 = this.mRingPaint;
                    Objects.requireNonNull(paint6);
                    canvas.drawArc(rectF4, ((i4 - 1) * 56) + 131, 54.0f, false, paint6);
                }
            }
            if (i5 > 5) {
                return;
            } else {
                i4 = i5;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.mViewWidth = View.MeasureSpec.getSize(widthMeasureSpec);
        this.mViewHeight = View.MeasureSpec.getSize(heightMeasureSpec);
    }

    public final void setHr(int value) {
        this.mHrValue = value;
        invalidate();
    }

    public HrRingView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HrRingView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mContext = getContext();
        this.RING_WIDTH = 6.0f;
        b(context);
    }
}
