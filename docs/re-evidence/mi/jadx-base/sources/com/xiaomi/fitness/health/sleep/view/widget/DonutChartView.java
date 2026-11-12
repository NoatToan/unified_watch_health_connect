package com.xiaomi.fitness.health.sleep.view.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.amap.api.maps.utils.SpatialRelationUtil;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import defpackage.iji;
import defpackage.n4j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 @2\u00020\u0001:\u0001@B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010%\u001a\u00020&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020!0\u001d2\u0006\u0010(\u001a\u00020\u0017J0\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u00020\tH\u0014J\u0010\u00100\u001a\u00020&2\u0006\u00101\u001a\u000202H\u0014J\u0010\u00103\u001a\u00020&2\u0006\u00101\u001a\u000202H\u0002J\u0010\u00104\u001a\u00020&2\u0006\u00101\u001a\u000202H\u0002J\u0010\u00105\u001a\u00020&2\u0006\u00101\u001a\u000202H\u0002J \u00106\u001a\u00020&2\u0006\u00101\u001a\u0002022\u0006\u00107\u001a\u00020\u001e2\u0006\u00108\u001a\u00020\rH\u0002J\u0010\u00109\u001a\u00020+2\u0006\u0010:\u001a\u00020\rH\u0002J\u0010\u0010;\u001a\u00020+2\u0006\u0010:\u001a\u00020\rH\u0002J\u001c\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0=2\u0006\u0010:\u001a\u00020\rH\u0002J$\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0=2\u0006\u0010?\u001a\u00020\t2\u0006\u0010:\u001a\u00020\rH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/view/widget/DonutChartView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mViewCenterX", "", "mViewCenterY", "mInnerRadius", "mRingWidth", "", "mInnerCircleColor", "mRingBaseColor", "mSelectRingColor", "mMaxValue", "mPaint", "Landroid/graphics/Paint;", "mRectF", "Landroid/graphics/RectF;", "mCenterTitle", "", "mPercentageArray", "", "mColorIntArray", "", "mTitleList", "", "", "mDonutPieceModels", "", "Lcom/xiaomi/fitness/health/sleep/view/widget/DonutPieceModel;", "mCenterTitleTextPaint", "Landroid/text/TextPaint;", "topTextPadding", "setPieceModels", "", "donutPieceModelList", "centerTitle", "onLayout", "changed", "", "left", "top", TSMAuthContants.PARAM_KEY_RIGHT, "bottom", "onDraw", "canvas", "Landroid/graphics/Canvas;", "drawStaticLayoutCenterTitle", "drawRingBase", "drawColorRingAndTitleIndicator", "drawTitleIndicator", "title", "startingPointAngleInDegree", "isUpperHalf", "angle", "isRightHalf", "getSlopeOffset", "Lkotlin/Pair;", "getHorizontalOffset", "slopeEndX", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDonutChartView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DonutChartView.kt\ncom/xiaomi/fitness/health/sleep/view/widget/DonutChartView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 Canvas.kt\nandroidx/core/graphics/CanvasKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,359:1\n1557#2:360\n1628#2,3:361\n1557#2:368\n1628#2,3:369\n1557#2:372\n1628#2,3:373\n37#3:364\n36#3,3:365\n30#4,7:376\n47#4,8:400\n13517#5,3:383\n1437#6,14:386\n*S KotlinDebug\n*F\n+ 1 DonutChartView.kt\ncom/xiaomi/fitness/health/sleep/view/widget/DonutChartView\n*L\n87#1:360\n87#1:361,3\n89#1:368\n89#1:369,3\n90#1:372\n90#1:373,3\n87#1:364\n87#1:365,3\n156#1:376,7\n307#1:400,8\n180#1:383,3\n280#1:386,14\n*E\n"})
public final class DonutChartView extends View {

    @NotNull
    public static final String TAG = "DonutChartView";

    @NotNull
    private CharSequence mCenterTitle;

    @NotNull
    private TextPaint mCenterTitleTextPaint;

    @NotNull
    private int[] mColorIntArray;

    @NotNull
    private List<DonutPieceModel> mDonutPieceModels;
    private int mInnerCircleColor;
    private int mInnerRadius;
    private int mMaxValue;

    @NotNull
    private Paint mPaint;

    @NotNull
    private float[] mPercentageArray;

    @NotNull
    private RectF mRectF;
    private int mRingBaseColor;
    private float mRingWidth;
    private int mSelectRingColor;

    @NotNull
    private List<String> mTitleList;
    private int mViewCenterX;
    private int mViewCenterY;
    private final int topTextPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DonutChartView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mRectF = new RectF();
        this.mCenterTitle = "";
        this.mPercentageArray = new float[0];
        this.mColorIntArray = new int[0];
        this.mTitleList = CollectionsKt__CollectionsKt.emptyList();
        this.mDonutPieceModels = new ArrayList();
        this.mCenterTitleTextPaint = new TextPaint();
        this.topTextPadding = ExtUtilsKt.getDp(30);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n4j.W0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.mInnerRadius = typedArrayObtainStyledAttributes.getInteger(n4j.Y0, ExtUtilsKt.getDp(58));
        this.mRingWidth = typedArrayObtainStyledAttributes.getFloat(n4j.c1, ExtUtilsKt.getDp(17));
        this.mInnerCircleColor = typedArrayObtainStyledAttributes.getColor(n4j.X0, getResources().getColor(iji.A3, null));
        this.mRingBaseColor = typedArrayObtainStyledAttributes.getColor(n4j.a1, getResources().getColor(iji.A3, null));
        this.mSelectRingColor = typedArrayObtainStyledAttributes.getInt(n4j.b1, getResources().getColor(iji.f21230k, null));
        this.mMaxValue = typedArrayObtainStyledAttributes.getInt(n4j.Z0, 100);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.mPaint = paint;
        paint.setAntiAlias(true);
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.mCenterTitleTextPaint = textPaint;
        textPaint.setDither(true);
        this.mCenterTitleTextPaint.setTypeface(Typeface.create("mipro-regular", 1));
        this.mCenterTitleTextPaint.setTextSize(ExtUtilsKt.getSp(Double.valueOf(14.52d)));
        this.mCenterTitleTextPaint.setColor(ApplicationExtKt.getApplication().getResources().getColor(iji.r3, null));
        this.mCenterTitleTextPaint.setStyle(Paint.Style.FILL);
    }

    private final void drawColorRingAndTitleIndicator(Canvas canvas) {
        canvas.save();
        Paint paint = new Paint(this.mPaint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.mRingWidth);
        paint.setColor(this.mSelectRingColor);
        float[] fArr = this.mPercentageArray;
        int length = fArr.length;
        float f = -90.0f;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            float f2 = f + 1.0f;
            float f3 = ((fArr[i2] * SpatialRelationUtil.A_CIRCLE_DEGREE) + f2) - 1.0f;
            float f4 = f3 - f2;
            drawTitleIndicator(canvas, this.mTitleList.get(i), (f2 + f3) / 2);
            Logger.d(TAG, "drawColorRing startAngle=" + f2 + " endAngle=" + f3 + " sweepAngle=" + f4);
            paint.setColor(this.mColorIntArray[i]);
            paint.setStrokeCap(Paint.Cap.BUTT);
            canvas.drawArc(this.mRectF, f2, f4, false, paint);
            i2++;
            i++;
            f = f3;
        }
        paint.setShader(null);
        canvas.restore();
    }

    private final void drawRingBase(Canvas canvas) {
        Paint paint = new Paint(this.mPaint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.mRingWidth);
        paint.setColor(this.mRingBaseColor);
        canvas.drawArc(this.mRectF, 360.0f, 360.0f, false, paint);
    }

    private final void drawStaticLayoutCenterTitle(Canvas canvas) {
        if (this.mCenterTitle.length() == 0) {
            return;
        }
        int dp = (this.mInnerRadius * 2) - ExtUtilsKt.getDp(8);
        TextPaint textPaint = new TextPaint(this.mCenterTitleTextPaint);
        CharSequence charSequence = this.mCenterTitle;
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, dp).setAlignment(Layout.Alignment.ALIGN_CENTER).setIncludePad(false).build();
        Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "build(...)");
        float width = staticLayoutBuild.getWidth();
        float height = staticLayoutBuild.getHeight();
        float f = dp;
        float fMin = Math.min(height > f ? f / height : 1.0f, width > f ? f / width : 1.0f);
        float sp = ExtUtilsKt.getSp(7) / ExtUtilsKt.getSp(24);
        if (fMin < sp) {
            fMin = sp;
        }
        float f2 = 2;
        float f3 = this.mViewCenterX - ((width * fMin) / f2);
        float f4 = this.mViewCenterY - ((height * fMin) / f2);
        int iSave = canvas.save();
        try {
            canvas.translate(f3, f4);
            if (fMin != 1.0f) {
                canvas.scale(fMin, fMin);
            }
            staticLayoutBuild.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    private final void drawTitleIndicator(Canvas canvas, String title, float startingPointAngleInDegree) {
        String value;
        float dp = this.mInnerRadius + this.mRingWidth + ExtUtilsKt.getDp(5);
        double d = (float) ((((double) startingPointAngleInDegree) * 3.141592653589793d) / ((double) 180));
        float fCos = this.mViewCenterX + (((float) Math.cos(d)) * dp);
        float fSin = this.mViewCenterY + (dp * ((float) Math.sin(d)));
        int color = ApplicationExtKt.getApplication().getColor(iji.K3);
        Paint paint = this.mPaint;
        paint.setColor(color);
        paint.setStrokeWidth(ExtUtilsKt.getDp(4));
        paint.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawPoint(fCos, fSin, this.mPaint);
        this.mPaint.setStrokeWidth(4.0f);
        Pair<Integer, Integer> slopeOffset = getSlopeOffset(startingPointAngleInDegree);
        float fFloatValue = fCos + slopeOffset.getFirst().floatValue();
        float fFloatValue2 = fSin + slopeOffset.getSecond().floatValue();
        canvas.drawLine(fCos, fSin, fFloatValue, fFloatValue2, this.mPaint);
        Pair<Integer, Integer> horizontalOffset = getHorizontalOffset((int) fFloatValue, startingPointAngleInDegree);
        float fFloatValue3 = fFloatValue + horizontalOffset.getFirst().floatValue();
        canvas.drawLine(fFloatValue, fFloatValue2, fFloatValue3, fFloatValue2 + horizontalOffset.getSecond().floatValue(), this.mPaint);
        boolean zIsRightHalf = isRightHalf(startingPointAngleInDegree);
        float fMin = Math.min(fFloatValue, fFloatValue3);
        float fMax = Math.max(fFloatValue, fFloatValue3);
        float fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast((fMax - fMin) - ExtUtilsKt.getDp(4), 0.0f);
        TextPaint textPaint = new TextPaint(this.mPaint);
        textPaint.setColor(ApplicationExtKt.getApplication().getColor(iji.r3));
        float sp = ExtUtilsKt.getSp(15);
        float sp2 = ExtUtilsKt.getSp(6);
        textPaint.setTextSize(sp);
        if (textPaint.measureText(title) <= fCoerceAtLeast) {
            drawTitleIndicator$drawSingleLine(textPaint, title, zIsRightHalf, fMax, fMin, canvas, fFloatValue2, sp);
            return;
        }
        float fCoerceAtLeast2 = RangesKt___RangesKt.coerceAtLeast((sp * fCoerceAtLeast) / textPaint.measureText(title), sp2);
        if (fCoerceAtLeast2 > sp2) {
            drawTitleIndicator$drawSingleLine(textPaint, title, zIsRightHalf, fMax, fMin, canvas, fFloatValue2, fCoerceAtLeast2);
            return;
        }
        textPaint.setTextSize(sp2);
        Object next = null;
        Iterator it = Regex.findAll$default(new Regex("\\p{L}+"), title, 0, 2, null).iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int length = ((MatchResult) next).getValue().length();
                do {
                    Object next2 = it.next();
                    int length2 = ((MatchResult) next2).getValue().length();
                    if (length < length2) {
                        next = next2;
                        length = length2;
                    }
                } while (it.hasNext());
            }
        }
        MatchResult matchResult = (MatchResult) next;
        if (matchResult == null || (value = matchResult.getValue()) == null) {
            value = "";
        }
        if (value.length() > 0) {
            while (textPaint.measureText(value) > fCoerceAtLeast) {
                textPaint.setTextSize(textPaint.getTextSize() - 0.5f);
            }
        }
        if (textPaint.getTextSize() < 1.0f) {
            textPaint.setTextSize(1.0f);
        }
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(title, 0, title.length(), textPaint, (int) fCoerceAtLeast).setAlignment(zIsRightHalf ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL).setIncludePad(false).build();
        Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "build(...)");
        if (zIsRightHalf) {
            fMin = fMax - fCoerceAtLeast;
        }
        float dpFloat = (fFloatValue2 - ExtUtilsKt.getDpFloat(2)) - staticLayoutBuild.getLineBaseline(staticLayoutBuild.getLineCount() - 1);
        int iSave = canvas.save();
        canvas.translate(fMin, dpFloat);
        try {
            staticLayoutBuild.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    private static final void drawTitleIndicator$drawSingleLine(TextPaint textPaint, String str, boolean z, float f, float f2, Canvas canvas, float f3, float f4) {
        textPaint.setTextSize(f4);
        float fMeasureText = textPaint.measureText(str);
        if (z) {
            f2 = f - fMeasureText;
        }
        canvas.drawText(str, f2, f3 - ExtUtilsKt.getDpFloat(2), textPaint);
    }

    private final Pair<Integer, Integer> getHorizontalOffset(int slopeEndX, float angle) {
        return isRightHalf(angle) ? new Pair<>(Integer.valueOf((getWidth() - getPaddingEnd()) - slopeEndX), 0) : new Pair<>(Integer.valueOf(getPaddingStart() - slopeEndX), 0);
    }

    private final Pair<Integer, Integer> getSlopeOffset(float angle) {
        boolean zIsUpperHalf = isUpperHalf(angle);
        boolean zIsRightHalf = isRightHalf(angle);
        Logger.d(TAG, "getOffset angle=" + angle + " isUpperHalf=" + zIsUpperHalf + " isRightHalf=" + zIsRightHalf);
        int dp = ExtUtilsKt.getDp(12);
        if (zIsUpperHalf && zIsRightHalf) {
            return new Pair<>(Integer.valueOf(dp), Integer.valueOf(-dp));
        }
        if (!zIsUpperHalf) {
            return !zIsRightHalf ? new Pair<>(Integer.valueOf(-dp), Integer.valueOf(dp)) : new Pair<>(Integer.valueOf(dp), Integer.valueOf(dp));
        }
        int i = -dp;
        return new Pair<>(Integer.valueOf(i), Integer.valueOf(i));
    }

    private final boolean isRightHalf(float angle) {
        float f = SpatialRelationUtil.A_CIRCLE_DEGREE;
        float f2 = (angle + f) % f;
        return !(f2 > 90.0f && f2 < 270.0f);
    }

    private final boolean isUpperHalf(float angle) {
        float f = SpatialRelationUtil.A_CIRCLE_DEGREE;
        float f2 = (angle + f) % f;
        Logger.d(TAG, "isUpperHalf angle=" + angle + " validAngle=" + f2);
        return f2 > 180.0f;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.mPaint.setColor(this.mInnerCircleColor);
        canvas.drawCircle(this.mViewCenterX, this.mViewCenterY, this.mInnerRadius, this.mPaint);
        drawRingBase(canvas);
        drawColorRingAndTitleIndicator(canvas);
        drawStaticLayoutCenterTitle(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.mViewCenterX = getWidth() / 2;
        int height = getHeight();
        int i = this.topTextPadding;
        int i2 = ((height - i) / 2) + i;
        this.mViewCenterY = i2;
        RectF rectF = this.mRectF;
        int i3 = this.mViewCenterX;
        int i4 = this.mInnerRadius;
        float f = this.mRingWidth;
        float f2 = 2;
        rectF.left = (i3 - i4) - (f / f2);
        rectF.top = (i2 - i4) - (f / f2);
        rectF.right = i3 + i4 + (f / f2);
        rectF.bottom = i2 + i4 + (f / f2);
    }

    public final void setPieceModels(@NotNull List<DonutPieceModel> donutPieceModelList, @NotNull CharSequence centerTitle) {
        Intrinsics.checkNotNullParameter(donutPieceModelList, "donutPieceModelList");
        Intrinsics.checkNotNullParameter(centerTitle, "centerTitle");
        this.mCenterTitle = centerTitle;
        this.mDonutPieceModels.clear();
        this.mDonutPieceModels.addAll(donutPieceModelList);
        List<DonutPieceModel> list = donutPieceModelList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(((DonutPieceModel) it.next()).getPercentage()));
        }
        this.mPercentageArray = ArraysKt___ArraysKt.toFloatArray((Float[]) arrayList.toArray(new Float[0]));
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(getResources().getColor(((DonutPieceModel) it2.next()).getColorResId(), null)));
        }
        this.mColorIntArray = CollectionsKt___CollectionsKt.toIntArray(arrayList2);
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((DonutPieceModel) it3.next()).getPieceTitle());
        }
        this.mTitleList = arrayList3;
        Logger.d(TAG, "setValueArray mPercentageArray=" + this.mPercentageArray + " mColorIntArray=" + this.mColorIntArray + " mTitleList=" + arrayList3);
        invalidate();
    }
}
