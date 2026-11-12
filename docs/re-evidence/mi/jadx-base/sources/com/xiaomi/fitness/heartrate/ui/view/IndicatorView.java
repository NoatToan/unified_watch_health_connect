package com.xiaomi.fitness.heartrate.ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.o4j;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\u0018\u0000 _2\u00020\u0001:\u0001_B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010?\u001a\u00020@H\u0002J\u0010\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020CH\u0014J\u0010\u0010D\u001a\u00020@2\u0006\u0010B\u001a\u00020CH\u0002J\u0010\u0010E\u001a\u00020@2\u0006\u0010B\u001a\u00020CH\u0002J\u0010\u0010F\u001a\u00020@2\u0006\u0010B\u001a\u00020CH\u0002J\u0010\u0010G\u001a\u00020@2\u0006\u0010B\u001a\u00020CH\u0002J\b\u0010H\u001a\u00020@H\u0002J\u0010\u0010I\u001a\u00020@2\b\u0010)\u001a\u0004\u0018\u00010:J\u0012\u0010J\u001a\u00020@2\n\u0010K\u001a\u00020.\"\u00020\u0007J#\u0010L\u001a\u00020@2\u0016\u0010M\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010100\"\u0004\u0018\u000101¢\u0006\u0002\u0010NJ\u0012\u0010O\u001a\u00020@2\n\u0010P\u001a\u00020.\"\u00020\u0007J\u0012\u0010Q\u001a\u00020@2\n\u0010K\u001a\u00020.\"\u00020\u0007J\u0018\u0010R\u001a\u00020@2\u0010\u0010S\u001a\f\u0012\u0006\u0012\u0004\u0018\u000101\u0018\u000108J\u000e\u0010T\u001a\u00020@2\u0006\u0010U\u001a\u00020\u0007J#\u0010V\u001a\u00020@2\u0016\u0010W\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010:00\"\u0004\u0018\u00010:¢\u0006\u0002\u0010XJ\u0018\u0010Y\u001a\u00020@2\u0006\u0010Z\u001a\u00020\u00072\u0006\u0010[\u001a\u00020\u0007H\u0014J\u0018\u0010\\\u001a\u00020\u00072\u0006\u0010]\u001a\u00020\u00072\u0006\u0010^\u001a\u00020\u0007H\u0002R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010/\u001a\f\u0012\u0006\u0012\u0004\u0018\u000101\u0018\u000100X\u0082\u000e¢\u0006\u0004\n\u0002\u00102R\u0010\u00103\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u00107\u001a\f\u0012\u0006\u0012\u0004\u0018\u000101\u0018\u000108X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00109\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010:\u0018\u000100X\u0082\u000e¢\u0006\u0004\n\u0002\u0010;R\u000e\u0010<\u001a\u00020:X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010=\u001a\u0004\u0018\u00010>X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006`"}, d2 = {"Lcom/xiaomi/fitness/heartrate/ui/view/IndicatorView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "mDefaultSize", "mTagTextColor", "mTagTextSize", "", "mTagMarginBottom", "mTriangleBottomLength", "mTriangleWaistLength", "mTriangleColor", "mTriangleMarginTop", "mTriangleRadius", "mValueTextSize", "mValueTextColor", "mValueTextMarginTop", "mSegmentGap", "mSegmentRadius", "mSegmentHeight", "mSegmentCount", "mTagPaint", "Landroid/graphics/Paint;", "mValuePaint", "mTrianglePaint", "mSegmentPaint", "mMainArea", "Landroid/graphics/Rect;", "mTextBounds", "mPath", "Landroid/graphics/Path;", "mTmpPath", "mSegmentLength", "mIndicatorPositionX", "value", "indicatorIndex", "getIndicatorIndex", "()I", "mTagTextIds", "", "mTagTextArr", "", "", "[Ljava/lang/String;", "mSegmentColors", "mSegmentRect", "Landroid/graphics/RectF;", "mValueTextIds", "mValueTextList", "", "mSegmentRange", "", "[Ljava/lang/Number;", "mCurValue", "mPathMeasure", "Landroid/graphics/PathMeasure;", "init", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "drawTagText", "drawSegment", "drawTriangle", "drawValueText", "calculateSegment", "setValue", "setTagTextIds", "ids", "setTagTexts", "tags", "([Ljava/lang/String;)V", "setSegmentColors", "colorIds", "setValueTextIds", "setValueTexts", "valueTexts", "setSegmentCount", "segmentCount", "setSegmentRange", "numbers", "([Ljava/lang/Number;)V", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "measureViewSize", "measureSpec", "defSize", "Companion", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIndicatorView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IndicatorView.kt\ncom/xiaomi/fitness/heartrate/ui/view/IndicatorView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,435:1\n1#2:436\n*E\n"})
public final class IndicatorView extends View {

    @NotNull
    private static final String TAG = "IndicatorView";
    private int indicatorIndex;

    @NotNull
    private Number mCurValue;
    private final int mDefaultSize;
    private float mIndicatorPositionX;

    @Nullable
    private Rect mMainArea;

    @Nullable
    private Path mPath;

    @Nullable
    private PathMeasure mPathMeasure;

    @Nullable
    private int[] mSegmentColors;
    private int mSegmentCount;
    private float mSegmentGap;
    private float mSegmentHeight;
    private float mSegmentLength;

    @Nullable
    private Paint mSegmentPaint;
    private float mSegmentRadius;

    @Nullable
    private Number[] mSegmentRange;

    @Nullable
    private RectF mSegmentRect;
    private float mTagMarginBottom;

    @Nullable
    private Paint mTagPaint;

    @Nullable
    private String[] mTagTextArr;
    private int mTagTextColor;

    @Nullable
    private int[] mTagTextIds;
    private float mTagTextSize;

    @Nullable
    private Rect mTextBounds;

    @Nullable
    private Path mTmpPath;
    private float mTriangleBottomLength;
    private int mTriangleColor;
    private float mTriangleMarginTop;

    @Nullable
    private Paint mTrianglePaint;
    private float mTriangleRadius;
    private float mTriangleWaistLength;

    @Nullable
    private Paint mValuePaint;
    private int mValueTextColor;

    @Nullable
    private int[] mValueTextIds;

    @Nullable
    private List<String> mValueTextList;
    private float mValueTextMarginTop;
    private float mValueTextSize;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IndicatorView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void calculateSegment() {
        float f;
        Rect rect = this.mMainArea;
        Intrinsics.checkNotNull(rect);
        float fWidth = rect.width();
        float f2 = this.mSegmentGap;
        int i = this.mSegmentCount;
        this.mSegmentLength = (fWidth - (f2 * (i - 1))) / i;
        float fFloatValue = this.mCurValue.floatValue();
        int i2 = this.mSegmentCount;
        int i3 = 0;
        while (i3 < i2) {
            Number[] numberArr = this.mSegmentRange;
            Intrinsics.checkNotNull(numberArr);
            Number number = numberArr[i3];
            Intrinsics.checkNotNull(number);
            float fFloatValue2 = number.floatValue();
            Number[] numberArr2 = this.mSegmentRange;
            Intrinsics.checkNotNull(numberArr2);
            int i4 = i3 + 1;
            Number number2 = numberArr2[i4];
            Intrinsics.checkNotNull(number2);
            float fFloatValue3 = number2.floatValue();
            if (Float.compare(fFloatValue, fFloatValue2) >= 0 && Float.compare(fFloatValue, fFloatValue3) < 0) {
                this.indicatorIndex = i3;
                f = (fFloatValue - fFloatValue2) * (this.mSegmentLength / (fFloatValue3 - fFloatValue2));
                Rect rect2 = this.mMainArea;
                Intrinsics.checkNotNull(rect2);
                this.mIndicatorPositionX = rect2.left + f + (this.indicatorIndex * (this.mSegmentLength + this.mSegmentGap));
            }
            i3 = i4;
        }
        f = 0.0f;
        Rect rect3 = this.mMainArea;
        Intrinsics.checkNotNull(rect3);
        this.mIndicatorPositionX = rect3.left + f + (this.indicatorIndex * (this.mSegmentLength + this.mSegmentGap));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:6:0x001a  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    private final void drawSegment(Canvas canvas) {
        String[] strArr;
        char c = 2;
        Rect rect = this.mMainArea;
        Intrinsics.checkNotNull(rect);
        int iHeight = rect.top;
        int[] iArr = this.mTagTextIds;
        if (iArr != null) {
            Intrinsics.checkNotNull(iArr);
            if (iArr.length <= 0) {
                strArr = this.mTagTextArr;
                if (strArr != null) {
                    Intrinsics.checkNotNull(strArr);
                    if (strArr.length > 0) {
                        Paint paint = this.mTagPaint;
                        Intrinsics.checkNotNull(paint);
                        paint.getTextBounds("666", 0, 3, this.mTextBounds);
                        Rect rect2 = this.mTextBounds;
                        Intrinsics.checkNotNull(rect2);
                        iHeight += (int) (rect2.height() + this.mTagMarginBottom);
                    }
                }
            } else {
                Paint paint2 = this.mTagPaint;
                Intrinsics.checkNotNull(paint2);
                paint2.getTextBounds("666", 0, 3, this.mTextBounds);
                Rect rect3 = this.mTextBounds;
                Intrinsics.checkNotNull(rect3);
                iHeight += (int) (rect3.height() + this.mTagMarginBottom);
            }
        } else {
            strArr = this.mTagTextArr;
            if (strArr != null) {
                Intrinsics.checkNotNull(strArr);
                if (strArr.length > 0) {
                    Paint paint3 = this.mTagPaint;
                    Intrinsics.checkNotNull(paint3);
                    paint3.getTextBounds("666", 0, 3, this.mTextBounds);
                    Rect rect4 = this.mTextBounds;
                    Intrinsics.checkNotNull(rect4);
                    iHeight += (int) (rect4.height() + this.mTagMarginBottom);
                }
            }
        }
        Resources resources = getResources();
        int i = this.mSegmentCount;
        int i2 = 0;
        while (i2 < i) {
            int[] iArr2 = this.mSegmentColors;
            if (iArr2 != null) {
                Intrinsics.checkNotNull(iArr2);
                if (iArr2.length > i2) {
                    Paint paint4 = this.mSegmentPaint;
                    Intrinsics.checkNotNull(paint4);
                    int[] iArr3 = this.mSegmentColors;
                    Intrinsics.checkNotNull(iArr3);
                    paint4.setColor(resources.getColor(iArr3[i2], null));
                }
            }
            Path path = this.mPath;
            Intrinsics.checkNotNull(path);
            path.reset();
            if (i2 == 0) {
                RectF rectF = this.mSegmentRect;
                Intrinsics.checkNotNull(rectF);
                Rect rect5 = this.mMainArea;
                Intrinsics.checkNotNull(rect5);
                float f = rect5.left;
                float f2 = iHeight;
                Rect rect6 = this.mMainArea;
                Intrinsics.checkNotNull(rect6);
                rectF.set(f, f2, rect6.left + this.mSegmentLength, this.mSegmentHeight + f2);
                Path path2 = this.mPath;
                Intrinsics.checkNotNull(path2);
                RectF rectF2 = this.mSegmentRect;
                Intrinsics.checkNotNull(rectF2);
                float f3 = this.mSegmentRadius;
                float[] fArr = new float[8];
                fArr[0] = f3;
                fArr[1] = f3;
                fArr[c] = 0.0f;
                fArr[3] = 0.0f;
                fArr[4] = 0.0f;
                fArr[5] = 0.0f;
                fArr[6] = f3;
                fArr[7] = f3;
                path2.addRoundRect(rectF2, fArr, Path.Direction.CCW);
            } else if (i2 == this.mSegmentCount - 1) {
                Rect rect7 = this.mMainArea;
                Intrinsics.checkNotNull(rect7);
                float f4 = rect7.right - this.mSegmentLength;
                RectF rectF3 = this.mSegmentRect;
                Intrinsics.checkNotNull(rectF3);
                float f5 = iHeight;
                Rect rect8 = this.mMainArea;
                Intrinsics.checkNotNull(rect8);
                rectF3.set(f4, f5, rect8.right, this.mSegmentHeight + f5);
                Path path3 = this.mPath;
                Intrinsics.checkNotNull(path3);
                RectF rectF4 = this.mSegmentRect;
                Intrinsics.checkNotNull(rectF4);
                float f6 = this.mSegmentRadius;
                float[] fArr2 = new float[8];
                fArr2[0] = 0.0f;
                fArr2[1] = 0.0f;
                fArr2[c] = f6;
                fArr2[3] = f6;
                fArr2[4] = f6;
                fArr2[5] = f6;
                fArr2[6] = 0.0f;
                fArr2[7] = 0.0f;
                path3.addRoundRect(rectF4, fArr2, Path.Direction.CCW);
            } else {
                Rect rect9 = this.mMainArea;
                Intrinsics.checkNotNull(rect9);
                float f7 = rect9.left;
                float f8 = this.mSegmentLength;
                float f9 = f7 + (i2 * (this.mSegmentGap + f8));
                RectF rectF5 = this.mSegmentRect;
                Intrinsics.checkNotNull(rectF5);
                float f10 = iHeight;
                rectF5.set(f9, f10, f8 + f9, this.mSegmentHeight + f10);
                Path path4 = this.mPath;
                Intrinsics.checkNotNull(path4);
                RectF rectF6 = this.mSegmentRect;
                Intrinsics.checkNotNull(rectF6);
                path4.addRect(rectF6, Path.Direction.CCW);
            }
            Path path5 = this.mPath;
            Intrinsics.checkNotNull(path5);
            Paint paint5 = this.mSegmentPaint;
            Intrinsics.checkNotNull(paint5);
            canvas.drawPath(path5, paint5);
            i2++;
            c = 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0097  */
    private final void drawTagText(Canvas canvas) {
        String str;
        int[] iArr = this.mTagTextIds;
        if (iArr == null && this.mTagTextArr == null) {
            return;
        }
        if (iArr != null) {
            Intrinsics.checkNotNull(iArr);
            int length = iArr.length;
            if (this.mTagTextArr == null) {
                this.mTagTextArr = new String[length];
            }
            Context context = getContext();
            for (int i = 0; i < length; i++) {
                String[] strArr = this.mTagTextArr;
                Intrinsics.checkNotNull(strArr);
                int[] iArr2 = this.mTagTextIds;
                Intrinsics.checkNotNull(iArr2);
                strArr[i] = context.getString(iArr2[i]);
            }
        }
        Paint paint = this.mTagPaint;
        Intrinsics.checkNotNull(paint);
        paint.getTextBounds("666", 0, 3, this.mTextBounds);
        Rect rect = this.mMainArea;
        Intrinsics.checkNotNull(rect);
        float f = rect.top;
        Rect rect2 = this.mTextBounds;
        Intrinsics.checkNotNull(rect2);
        float fHeight = f + (rect2.height() * 1.4f);
        Resources resources = getResources();
        int i2 = this.mSegmentCount;
        for (int i3 = 0; i3 < i2; i3++) {
            String[] strArr2 = this.mTagTextArr;
            Intrinsics.checkNotNull(strArr2);
            if (strArr2.length > i3) {
                String[] strArr3 = this.mTagTextArr;
                Intrinsics.checkNotNull(strArr3);
                str = strArr3[i3];
            } else {
                str = "";
            }
            int[] iArr3 = this.mSegmentColors;
            if (iArr3 != null) {
                Intrinsics.checkNotNull(iArr3);
                int length2 = iArr3.length;
                int i4 = this.indicatorIndex;
                if (length2 <= i4 || i4 != i3) {
                    Paint paint2 = this.mTagPaint;
                    Intrinsics.checkNotNull(paint2);
                    paint2.setColor(this.mTagTextColor);
                } else {
                    int[] iArr4 = this.mSegmentColors;
                    Intrinsics.checkNotNull(iArr4);
                    int color = resources.getColor(iArr4[this.indicatorIndex], null);
                    Paint paint3 = this.mTagPaint;
                    Intrinsics.checkNotNull(paint3);
                    paint3.setColor(color);
                }
            } else {
                Paint paint4 = this.mTagPaint;
                Intrinsics.checkNotNull(paint4);
                paint4.setColor(this.mTagTextColor);
            }
            Rect rect3 = this.mMainArea;
            Intrinsics.checkNotNull(rect3);
            float f2 = rect3.left;
            float f3 = this.mSegmentGap;
            float f4 = this.mSegmentLength;
            Intrinsics.checkNotNull(str);
            Paint paint5 = this.mTagPaint;
            Intrinsics.checkNotNull(paint5);
            canvas.drawText(str, f2 + (i3 * (f3 + f4)) + (f4 * 0.5f), fHeight, paint5);
        }
    }

    private final void drawTriangle(Canvas canvas) {
        Path path = this.mPath;
        Intrinsics.checkNotNull(path);
        path.reset();
        float f = this.mIndicatorPositionX;
        RectF rectF = this.mSegmentRect;
        Intrinsics.checkNotNull(rectF);
        float f2 = rectF.bottom + this.mTriangleMarginTop;
        float f3 = this.mTriangleRadius;
        float f4 = 3 + f2;
        Path path2 = this.mTmpPath;
        Intrinsics.checkNotNull(path2);
        path2.reset();
        Path path3 = this.mTmpPath;
        Intrinsics.checkNotNull(path3);
        path3.addArc(f - f3, f4 - f3, f + f3, f4 + f3, 221.41f, 97.18f);
        Path path4 = this.mPath;
        Intrinsics.checkNotNull(path4);
        Path path5 = this.mTmpPath;
        Intrinsics.checkNotNull(path5);
        path4.addPath(path5);
        PathMeasure pathMeasure = this.mPathMeasure;
        Intrinsics.checkNotNull(pathMeasure);
        pathMeasure.setPath(this.mTmpPath, false);
        float[] fArr = new float[2];
        PathMeasure pathMeasure2 = this.mPathMeasure;
        Intrinsics.checkNotNull(pathMeasure2);
        pathMeasure2.getPosTan(0.0f, fArr, null);
        float f5 = fArr[0];
        float f6 = fArr[1];
        float[] fArr2 = new float[2];
        PathMeasure pathMeasure3 = this.mPathMeasure;
        Intrinsics.checkNotNull(pathMeasure3);
        PathMeasure pathMeasure4 = this.mPathMeasure;
        Intrinsics.checkNotNull(pathMeasure4);
        pathMeasure3.getPosTan(pathMeasure4.getLength(), fArr2, null);
        float f7 = fArr2[0];
        float f8 = fArr2[1];
        float f9 = this.mTriangleBottomLength * 0.5f;
        float f10 = (f - f9) + 4.45f;
        float fSqrt = ((float) (((double) f2) + Math.sqrt(Math.pow(this.mTriangleWaistLength, 2.0d) - Math.pow(f9, 2.0d)))) - f3;
        Path path6 = this.mTmpPath;
        Intrinsics.checkNotNull(path6);
        path6.reset();
        Path path7 = this.mTmpPath;
        Intrinsics.checkNotNull(path7);
        float f11 = fSqrt - f3;
        float f12 = fSqrt + f3;
        path7.addArc(f10 - f3, f11, f10 + f3, f12, 90.0f, 131.41f);
        Path path8 = this.mPath;
        Intrinsics.checkNotNull(path8);
        Path path9 = this.mTmpPath;
        Intrinsics.checkNotNull(path9);
        path8.addPath(path9);
        PathMeasure pathMeasure5 = this.mPathMeasure;
        Intrinsics.checkNotNull(pathMeasure5);
        pathMeasure5.setPath(this.mTmpPath, false);
        PathMeasure pathMeasure6 = this.mPathMeasure;
        Intrinsics.checkNotNull(pathMeasure6);
        pathMeasure6.getPosTan(0.0f, fArr, null);
        float f13 = fArr[0];
        float f14 = fArr[1];
        PathMeasure pathMeasure7 = this.mPathMeasure;
        Intrinsics.checkNotNull(pathMeasure7);
        PathMeasure pathMeasure8 = this.mPathMeasure;
        Intrinsics.checkNotNull(pathMeasure8);
        pathMeasure7.getPosTan(pathMeasure8.getLength(), fArr2, null);
        float f15 = fArr2[0];
        float f16 = fArr2[1];
        float f17 = (f + f9) - 4.45f;
        Path path10 = this.mTmpPath;
        Intrinsics.checkNotNull(path10);
        path10.reset();
        Path path11 = this.mTmpPath;
        Intrinsics.checkNotNull(path11);
        path11.addArc(f17 - f3, f11, f17 + f3, f12, -41.41f, 131.41f);
        Path path12 = this.mPath;
        Intrinsics.checkNotNull(path12);
        Path path13 = this.mTmpPath;
        Intrinsics.checkNotNull(path13);
        path12.addPath(path13);
        PathMeasure pathMeasure9 = this.mPathMeasure;
        Intrinsics.checkNotNull(pathMeasure9);
        pathMeasure9.setPath(this.mTmpPath, false);
        PathMeasure pathMeasure10 = this.mPathMeasure;
        Intrinsics.checkNotNull(pathMeasure10);
        pathMeasure10.getPosTan(0.0f, fArr, null);
        float f18 = fArr[0];
        float f19 = fArr[1];
        PathMeasure pathMeasure11 = this.mPathMeasure;
        Intrinsics.checkNotNull(pathMeasure11);
        PathMeasure pathMeasure12 = this.mPathMeasure;
        Intrinsics.checkNotNull(pathMeasure12);
        pathMeasure11.getPosTan(pathMeasure12.getLength(), fArr2, null);
        float f20 = fArr2[0];
        float f21 = fArr2[1];
        Path path14 = this.mPath;
        Intrinsics.checkNotNull(path14);
        path14.moveTo(f5, f6);
        Path path15 = this.mPath;
        Intrinsics.checkNotNull(path15);
        path15.lineTo(f15, f16);
        Path path16 = this.mPath;
        Intrinsics.checkNotNull(path16);
        path16.lineTo(f13, f14);
        Path path17 = this.mPath;
        Intrinsics.checkNotNull(path17);
        path17.lineTo(f20, f21);
        Path path18 = this.mPath;
        Intrinsics.checkNotNull(path18);
        path18.lineTo(f18, f19);
        Path path19 = this.mPath;
        Intrinsics.checkNotNull(path19);
        path19.lineTo(f7, f8);
        Path path20 = this.mPath;
        Intrinsics.checkNotNull(path20);
        path20.close();
        Resources resources = getResources();
        int[] iArr = this.mSegmentColors;
        Intrinsics.checkNotNull(iArr);
        int color = resources.getColor(iArr[this.indicatorIndex], null);
        Paint paint = this.mTrianglePaint;
        Intrinsics.checkNotNull(paint);
        paint.setColor(color);
        Path path21 = this.mPath;
        Intrinsics.checkNotNull(path21);
        Paint paint2 = this.mTrianglePaint;
        Intrinsics.checkNotNull(paint2);
        canvas.drawPath(path21, paint2);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00c1 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x000a  */
    /* JADX WARN: Code duplicated, block: B:8:0x000e  */
    private final void drawValueText(Canvas canvas) {
        List<String> list;
        int[] iArr = this.mValueTextIds;
        if (iArr != null) {
            Intrinsics.checkNotNull(iArr);
            if (iArr.length == 0) {
                list = this.mValueTextList;
                if (list != null) {
                    return;
                }
                Intrinsics.checkNotNull(list);
                if (list.isEmpty()) {
                    return;
                }
            }
        } else {
            list = this.mValueTextList;
            if (list != null) {
                return;
            }
            Intrinsics.checkNotNull(list);
            if (list.isEmpty()) {
                return;
            }
        }
        Resources resources = getResources();
        if (this.mValueTextIds != null) {
            if (this.mValueTextList == null) {
                this.mValueTextList = new LinkedList();
            }
            List<String> list2 = this.mValueTextList;
            Intrinsics.checkNotNull(list2);
            list2.clear();
            int[] iArr2 = this.mValueTextIds;
            Intrinsics.checkNotNull(iArr2);
            for (int i : iArr2) {
                List<String> list3 = this.mValueTextList;
                Intrinsics.checkNotNull(list3);
                list3.add(resources.getString(i));
            }
        }
        Paint paint = this.mValuePaint;
        Intrinsics.checkNotNull(paint);
        paint.getTextBounds("666", 0, 3, this.mTextBounds);
        Paint paint2 = this.mValuePaint;
        Intrinsics.checkNotNull(paint2);
        paint2.setColor(this.mValueTextColor);
        RectF rectF = this.mSegmentRect;
        Intrinsics.checkNotNull(rectF);
        float f = rectF.bottom + this.mValueTextMarginTop;
        Rect rect = this.mTextBounds;
        Intrinsics.checkNotNull(rect);
        float fHeight = f + (rect.height() * 1.2f);
        int i2 = this.mSegmentCount - 1;
        for (int i3 = 0; i3 < i2; i3++) {
            List<String> list4 = this.mValueTextList;
            Intrinsics.checkNotNull(list4);
            if (list4.size() > i3) {
                List<String> list5 = this.mValueTextList;
                Intrinsics.checkNotNull(list5);
                String str = list5.get(i3);
                Rect rect2 = this.mMainArea;
                Intrinsics.checkNotNull(rect2);
                float f2 = rect2.left + (this.mSegmentLength * (i3 + 1));
                float f3 = this.mSegmentGap;
                Intrinsics.checkNotNull(str);
                Paint paint3 = this.mValuePaint;
                Intrinsics.checkNotNull(paint3);
                canvas.drawText(str, f2 + (i3 * f3) + (f3 * 0.5f), fHeight, paint3);
            }
        }
    }

    private final void init() {
        Paint paint = new Paint(1);
        this.mTagPaint = paint;
        Intrinsics.checkNotNull(paint);
        paint.setDither(true);
        Paint paint2 = this.mTagPaint;
        Intrinsics.checkNotNull(paint2);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        Paint paint3 = this.mTagPaint;
        Intrinsics.checkNotNull(paint3);
        paint3.setTextAlign(Paint.Align.CENTER);
        Paint paint4 = this.mTagPaint;
        Intrinsics.checkNotNull(paint4);
        paint4.setColor(this.mTagTextColor);
        Paint paint5 = this.mTagPaint;
        Intrinsics.checkNotNull(paint5);
        paint5.setTextSize(this.mTagTextSize);
        Paint paint6 = new Paint(this.mTagPaint);
        this.mValuePaint = paint6;
        Intrinsics.checkNotNull(paint6);
        paint6.setTextSize(this.mValueTextSize);
        Paint paint7 = this.mValuePaint;
        Intrinsics.checkNotNull(paint7);
        paint7.setColor(this.mValueTextColor);
        Paint paint8 = new Paint(this.mTagPaint);
        this.mTrianglePaint = paint8;
        Intrinsics.checkNotNull(paint8);
        paint8.setColor(this.mTriangleColor);
        this.mSegmentPaint = new Paint(this.mTagPaint);
        this.mMainArea = new Rect();
        this.mTextBounds = new Rect();
        this.mSegmentRect = new RectF();
        this.mPath = new Path();
        this.mTmpPath = new Path();
        this.mPathMeasure = new PathMeasure();
    }

    private final int measureViewSize(int measureSpec, int defSize) {
        int mode = View.MeasureSpec.getMode(measureSpec);
        int size = View.MeasureSpec.getSize(measureSpec);
        if (mode != Integer.MIN_VALUE) {
            return (mode == 0 || mode == 1073741824) ? size : defSize;
        }
        return Math.min(defSize, size);
    }

    public final int getIndicatorIndex() {
        return this.indicatorIndex;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        int i = this.mSegmentCount;
        if (i <= 0) {
            Logger.w(TAG, "the segment count is %d, ignore", Integer.valueOf(i));
        }
        if (this.mSegmentRange == null) {
            return;
        }
        int i2 = (int) (this.mTriangleBottomLength * 0.5f);
        Rect rect = this.mMainArea;
        Intrinsics.checkNotNull(rect);
        rect.set(getPaddingStart() + i2, getPaddingTop() - 4, (getWidth() - getPaddingEnd()) - i2, (getHeight() - getPaddingBottom()) + 4);
        calculateSegment();
        drawTagText(canvas);
        drawSegment(canvas);
        drawTriangle(canvas);
        drawValueText(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(measureViewSize(widthMeasureSpec, this.mDefaultSize), measureViewSize(heightMeasureSpec, this.mDefaultSize));
    }

    public final void setSegmentColors(@NotNull int... colorIds) {
        Intrinsics.checkNotNullParameter(colorIds, "colorIds");
        this.mSegmentColors = colorIds;
        postInvalidate();
    }

    public final void setSegmentCount(int segmentCount) {
        this.mSegmentCount = segmentCount;
    }

    public final void setSegmentRange(@NotNull Number... numbers) {
        Intrinsics.checkNotNullParameter(numbers, "numbers");
        this.mSegmentRange = (Number[]) Arrays.copyOf(numbers, numbers.length);
    }

    public final void setTagTextIds(@NotNull int... ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        this.mTagTextIds = ids;
        postInvalidate();
    }

    public final void setTagTexts(@NotNull String... tags) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.mTagTextArr = (String[]) Arrays.copyOf(tags, tags.length);
        postInvalidate();
    }

    public final void setValue(@Nullable Number value) {
        Number[] numberArr = this.mSegmentRange;
        if (!(!(numberArr == null || numberArr.length == 0))) {
            throw new IllegalStateException("segment range is null or empty".toString());
        }
        if (value == null) {
            value = 0;
            Logger.w(TAG, "setValue: value is null");
        }
        this.mCurValue = value;
        Number[] numberArr2 = this.mSegmentRange;
        Intrinsics.checkNotNull(numberArr2);
        Number[] numberArr3 = this.mSegmentRange;
        Intrinsics.checkNotNull(numberArr3);
        Number number = numberArr2[numberArr3.length - 1];
        float fFloatValue = this.mCurValue.floatValue();
        Intrinsics.checkNotNull(number);
        if (fFloatValue > number.floatValue()) {
            this.mCurValue = number;
        }
        postInvalidate();
    }

    public final void setValueTextIds(@NotNull int... ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        this.mValueTextIds = ids;
        postInvalidate();
    }

    public final void setValueTexts(@Nullable List<String> valueTexts) {
        this.mValueTextList = valueTexts;
        postInvalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IndicatorView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IndicatorView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ IndicatorView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IndicatorView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mDefaultSize = 200;
        this.mTagTextColor = -16777216;
        this.mTagTextSize = 20.0f;
        this.mTagMarginBottom = 20.0f;
        this.mTriangleBottomLength = 20.0f;
        this.mTriangleWaistLength = 20.0f;
        this.mTriangleColor = -16776961;
        this.mTriangleMarginTop = 20.0f;
        this.mTriangleRadius = 2.0f;
        this.mValueTextSize = 20.0f;
        this.mValueTextColor = -16777216;
        this.mValueTextMarginTop = 20.0f;
        this.mSegmentGap = 20.0f;
        this.mSegmentRadius = 10.0f;
        this.mSegmentHeight = 30.0f;
        this.mSegmentCount = 1;
        this.mCurValue = 0;
        setLayerType(1, null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o4j.t1);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.mTagTextSize = typedArrayObtainStyledAttributes.getDimension(o4j.A1, this.mTagTextSize);
        this.mTagTextColor = typedArrayObtainStyledAttributes.getColor(o4j.z1, this.mTagTextColor);
        this.mTagMarginBottom = typedArrayObtainStyledAttributes.getDimension(o4j.y1, this.mTagMarginBottom);
        this.mTriangleColor = typedArrayObtainStyledAttributes.getColor(o4j.C1, this.mTriangleColor);
        this.mTriangleBottomLength = typedArrayObtainStyledAttributes.getDimension(o4j.B1, this.mTriangleBottomLength);
        this.mTriangleWaistLength = typedArrayObtainStyledAttributes.getDimension(o4j.F1, this.mTriangleWaistLength);
        this.mTriangleMarginTop = typedArrayObtainStyledAttributes.getDimension(o4j.D1, this.mTriangleMarginTop);
        this.mTriangleRadius = typedArrayObtainStyledAttributes.getDimension(o4j.E1, this.mTriangleRadius);
        this.mValueTextSize = typedArrayObtainStyledAttributes.getDimension(o4j.I1, this.mValueTextSize);
        this.mValueTextColor = typedArrayObtainStyledAttributes.getColor(o4j.G1, this.mValueTextColor);
        this.mValueTextMarginTop = typedArrayObtainStyledAttributes.getDimension(o4j.H1, this.mValueTextMarginTop);
        this.mSegmentGap = typedArrayObtainStyledAttributes.getDimension(o4j.v1, this.mSegmentGap);
        this.mSegmentRadius = typedArrayObtainStyledAttributes.getDimension(o4j.x1, this.mSegmentRadius);
        this.mSegmentHeight = typedArrayObtainStyledAttributes.getDimension(o4j.w1, this.mSegmentHeight);
        this.mSegmentCount = typedArrayObtainStyledAttributes.getInt(o4j.u1, this.mSegmentCount);
        typedArrayObtainStyledAttributes.recycle();
        init();
    }
}
