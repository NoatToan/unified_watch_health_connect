package com.huami.moving.sport.ui.view.bar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.text.TextUtilsCompat;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010/\u001a\u00020.\u0012\b\u00101\u001a\u0004\u0018\u000100\u0012\u0006\u00102\u001a\u00020\u0002¢\u0006\u0004\b3\u00104B\u001b\b\u0016\u0012\u0006\u0010/\u001a\u00020.\u0012\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b3\u00105B\u0011\b\u0016\u0012\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b3\u00106J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014J\u0016\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fR\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0016\u0010\u001e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010\"\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001dR\u0016\u0010$\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001dR\u0016\u0010&\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\u001dR\u0016\u0010)\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u00067"}, d2 = {"Lcom/huami/moving/sport/ui/view/bar/ProgressBar;", "Landroid/view/View;", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "Landroid/graphics/Canvas;", "canvas", "onDraw", "seekColor", "bgColor", "setColors", "process", "setProcess", "", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "setWidth", "", "a", "Ljava/lang/String;", "TAG", "Landroid/graphics/Paint;", "b", "Landroid/graphics/Paint;", "mPaint", "c", "mPaint1", GoogleApiAvailabilityLight.a, LogUtil.I, "mSeekColor", "e", "mBgColor", "f", "mHeight", "g", "mWidth", "h", "mProcess", "i", "F", "mStrokeWidth", "", z.j, "Z", "isRtl", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
public final class ProgressBar extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String TAG;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Paint mPaint;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Paint mPaint1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int mSeekColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int mBgColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int mHeight;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int mWidth;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int mProcess;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private float mStrokeWidth;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean isRtl;

    public ProgressBar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.TAG = "ProgressBar";
        this.mStrokeWidth = 10.0f;
        this.isRtl = TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
        Paint paint = new Paint();
        this.mPaint = paint;
        Objects.requireNonNull(paint);
        paint.setAntiAlias(true);
        Paint paint2 = this.mPaint;
        Objects.requireNonNull(paint2);
        paint2.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint();
        this.mPaint1 = paint3;
        Objects.requireNonNull(paint3);
        paint3.setAntiAlias(true);
        Paint paint4 = this.mPaint1;
        Objects.requireNonNull(paint4);
        paint4.setStyle(Paint.Style.FILL);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // android.view.View
    public void onDraw(@Nullable Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.mPaint;
        Objects.requireNonNull(paint);
        paint.setStrokeWidth(this.mStrokeWidth);
        Paint paint2 = this.mPaint;
        Objects.requireNonNull(paint2);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        Paint paint3 = this.mPaint1;
        Objects.requireNonNull(paint3);
        paint3.setStrokeWidth(this.mStrokeWidth);
        Paint paint4 = this.mPaint1;
        Objects.requireNonNull(paint4);
        paint4.setStrokeCap(Paint.Cap.ROUND);
        float f = 2;
        float f2 = this.mStrokeWidth / f;
        Paint paint5 = this.mPaint;
        Objects.requireNonNull(paint5);
        paint5.setColor(this.mBgColor);
        if (canvas != null) {
            float f3 = this.mWidth - f2;
            Paint paint6 = this.mPaint;
            Objects.requireNonNull(paint6);
            canvas.drawLine(f2, f2, f3, f2, paint6);
        }
        Paint paint7 = this.mPaint1;
        Objects.requireNonNull(paint7);
        paint7.setColor(this.mSeekColor);
        if (this.isRtl) {
            int i = this.mProcess;
            if (i > 0) {
                int i2 = this.mWidth;
                if (i2 * (i / 100.0f) > f * f2) {
                    if (canvas == null) {
                        return;
                    }
                    Paint paint8 = this.mPaint1;
                    Objects.requireNonNull(paint8);
                    canvas.drawLine(i2 - f2, f2, (i2 - (i2 * (i / 100.0f))) - f2, f2, paint8);
                    return;
                }
                if (canvas == null) {
                    return;
                }
                Paint paint9 = this.mPaint1;
                Objects.requireNonNull(paint9);
                canvas.drawLine(i2 - f2, f2, i2 - f2, f2, paint9);
                return;
            }
            return;
        }
        int i3 = this.mProcess;
        if (i3 > 0) {
            int i4 = this.mWidth;
            if (i4 * (i3 / 100.0f) > f * f2) {
                if (canvas == null) {
                    return;
                }
                Paint paint10 = this.mPaint1;
                Objects.requireNonNull(paint10);
                canvas.drawLine(f2, f2, (i4 * (i3 / 100.0f)) - f2, f2, paint10);
                return;
            }
            if (canvas == null) {
                return;
            }
            Paint paint11 = this.mPaint1;
            Objects.requireNonNull(paint11);
            canvas.drawLine(f2, f2, f2, f2, paint11);
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.mHeight = getMeasuredHeight();
        this.mWidth = getMeasuredWidth();
    }

    public final void setColors(int seekColor, int bgColor) {
        this.mSeekColor = seekColor;
        this.mBgColor = bgColor;
        invalidate();
    }

    public final void setProcess(int process) {
        this.mProcess = process;
        invalidate();
    }

    public final void setWidth(float width) {
        this.mStrokeWidth = width;
        invalidate();
    }

    public ProgressBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProgressBar(@NotNull Context context) {
        this(context, null);
    }
}
