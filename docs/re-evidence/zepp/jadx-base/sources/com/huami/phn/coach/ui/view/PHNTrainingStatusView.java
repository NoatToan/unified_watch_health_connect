package com.huami.phn.coach.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.lib.view.ViewUtils;
import com.huami.phn.coach.R;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b4\u00105B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u00107\u001a\u0004\u0018\u000106¢\u0006\u0004\b4\u00108B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u00107\u001a\u0004\u0018\u000106\u0012\u0006\u00109\u001a\u00020\f¢\u0006\u0004\b4\u0010:J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0014J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0014R\u0016\u0010\u0014\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0016\u0010\u0019\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001cR\u0016\u0010$\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010#R\u0016\u0010(\u001a\u00020\n8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b'\u0010#R\u0016\u0010*\u001a\u00020\n8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b)\u0010#R\u0016\u0010-\u001a\u00020\f8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020\f8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b.\u0010,R\u0016\u00101\u001a\u00020\n8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b0\u0010#R\u0016\u00103\u001a\u00020\n8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b2\u0010#¨\u0006;"}, d2 = {"Lcom/huami/phn/coach/ui/view/PHNTrainingStatusView;", "Landroid/view/View;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "b", "Landroid/graphics/Paint;", "paint", "", "text", "", "a", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Landroid/graphics/Canvas;", "canvas", "onDraw", "Landroid/graphics/Paint;", "mLinePaint", "mTvStatePaint", "c", "mTvValuePaint", GoogleApiAvailabilityLight.a, "mCirclePaint", "", "e", "Ljava/util/List;", "mMainLineBGList", "f", "mUpperTextList", "g", "mLowerTextList", "h", "F", "mSplitLineLength", "i", "mCommonWidth", z.j, "mTvStateSize", hl.k, "mTvValueSize", "l", LogUtil.I, "upperOffset", "m", "lowerOffset", GoogleApiAvailabilityLight.b, "mDefaultWidth", "o", "mDefaultHeight", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class PHNTrainingStatusView extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private Paint mLinePaint;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private Paint mTvStatePaint;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private Paint mTvValuePaint;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private Paint mCirclePaint;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private List<Integer> mMainLineBGList;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private List<String> mUpperTextList;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private List<String> mLowerTextList;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private float mSplitLineLength;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private float mCommonWidth;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final float mTvStateSize;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final float mTvValueSize;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final int upperOffset;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final int lowerOffset;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final float mDefaultWidth;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final float mDefaultHeight;

    public PHNTrainingStatusView(@NotNull Context context) {
        this(context, null);
    }

    private final float a(Paint paint, String text) {
        return paint.measureText(text) / 2;
    }

    private final void b(Context context) {
        this.mCommonWidth = ViewUtils.dp2px(context, this.mCommonWidth);
        this.mSplitLineLength = ViewUtils.dp2px(context, this.mSplitLineLength);
        this.mUpperTextList.add(context.getString(R.string.phn_training_analysis_status_over));
        this.mUpperTextList.add(context.getString(R.string.phn_training_analysis_status_optimal));
        this.mUpperTextList.add(context.getString(R.string.phn_training_analysis_status_balance));
        this.mUpperTextList.add(context.getString(R.string.phn_training_analysis_status_abundant));
        this.mUpperTextList.add(context.getString(R.string.phn_training_analysis_status_rest_modify));
        this.mCirclePaint.setAntiAlias(true);
        this.mCirclePaint.setStyle(Paint.Style.FILL);
        this.mLinePaint.setAntiAlias(true);
        this.mLinePaint.setStrokeWidth(this.mCommonWidth);
        this.mTvStatePaint.setAntiAlias(true);
        this.mTvStatePaint.setColor(ContextCompat.getColor(context, R.color.s1));
        this.mTvStatePaint.setTextSize(ViewUtils.sp2px(context, this.mTvStateSize));
        Paint paint = new Paint();
        this.mTvValuePaint = paint;
        paint.setAntiAlias(true);
        this.mTvValuePaint.setColor(ContextCompat.getColor(context, R.color.s2));
        this.mTvValuePaint.setTextSize(ViewUtils.sp2px(context, this.mTvValueSize));
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        int i = 2;
        int height = getHeight() / 2;
        float width = getWidth();
        int i2 = 5;
        float f = ((width - this.mCommonWidth) - (this.mSplitLineLength * 4)) / 5;
        int i3 = 1;
        int i4 = 1;
        while (true) {
            int i5 = i4 + 1;
            if (i4 == i3) {
                this.mCirclePaint.setColor(ContextCompat.getColor(getContext(), this.mMainLineBGList.get(i4 - 1).intValue()));
                float f2 = this.mCommonWidth;
                float f3 = i;
                canvas.drawCircle(f2 / f3, height, f2 / f3, this.mCirclePaint);
            }
            if (i4 == i2) {
                this.mCirclePaint.setColor(ContextCompat.getColor(getContext(), this.mMainLineBGList.get(i4 - 1).intValue()));
                float f4 = this.mCommonWidth;
                float f5 = i;
                canvas.drawCircle(width - (f4 / f5), height, f4 / f5, this.mCirclePaint);
            }
            int i6 = i4 - 1;
            this.mLinePaint.setColor(ContextCompat.getColor(getContext(), this.mMainLineBGList.get(i6).intValue()));
            float f6 = this.mCommonWidth;
            float f7 = i;
            float f8 = this.mSplitLineLength;
            float f9 = i6;
            float f10 = height;
            float f11 = i4 * f;
            canvas.drawLine((f6 / f7) + ((f + f8) * f9), f10, (f6 / f7) + f11 + (f8 * f9), f10, this.mLinePaint);
            canvas.drawText(this.mUpperTextList.get(i6), ((this.mSplitLineLength + f) * f9) + ((f - a(this.mTvStatePaint, this.mUpperTextList.get(i6))) / f7), height - this.upperOffset, this.mTvStatePaint);
            int i7 = 5;
            if (i4 < 5) {
                String str = this.mLowerTextList.get(i6);
                float f12 = (this.mCommonWidth / f7) + f11;
                float f13 = this.mSplitLineLength;
                canvas.drawText(str, ((f12 + (f9 * f13)) + f13) - (a(this.mTvStatePaint, this.mUpperTextList.get(i6)) / f7), this.lowerOffset + height, this.mTvValuePaint);
                i7 = 5;
            }
            if (i5 > i7) {
                return;
            }
            i4 = i5;
            i = 2;
            i2 = 5;
            i3 = 1;
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        float fSp2px = ViewUtils.sp2px(getContext(), this.mDefaultWidth);
        float fSp2px2 = ViewUtils.sp2px(getContext(), this.mDefaultHeight);
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension((int) fSp2px, (int) fSp2px2);
        } else if (mode == Integer.MIN_VALUE) {
            setMeasuredDimension((int) fSp2px, size2);
        } else if (mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(size, (int) fSp2px2);
        }
    }

    public PHNTrainingStatusView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PHNTrainingStatusView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mLinePaint = new Paint();
        this.mTvStatePaint = new Paint();
        this.mTvValuePaint = new Paint();
        this.mCirclePaint = new Paint();
        this.mMainLineBGList = CollectionsKt__CollectionsKt.mutableListOf(Integer.valueOf(R.color.s25), Integer.valueOf(R.color.s15), Integer.valueOf(R.color.s20), Integer.valueOf(R.color.s22), Integer.valueOf(R.color.s33));
        this.mUpperTextList = new ArrayList();
        this.mLowerTextList = CollectionsKt__CollectionsKt.mutableListOf("-30", "-5", "5", "10");
        this.mSplitLineLength = 4.0f;
        this.mCommonWidth = 8.0f;
        this.mTvStateSize = 12.0f;
        this.mTvValueSize = 10.0f;
        this.upperOffset = 30;
        this.lowerOffset = 50;
        this.mDefaultWidth = 325.0f;
        this.mDefaultHeight = 60.0f;
        b(context);
    }
}
