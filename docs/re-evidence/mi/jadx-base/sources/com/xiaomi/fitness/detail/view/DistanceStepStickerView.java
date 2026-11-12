package com.xiaomi.fitness.detail.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import defpackage.dki;
import defpackage.opi;
import defpackage.xr5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0014J\u0010\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020(H\u0016J.\u0010)\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020\n2\u0006\u0010-\u001a\u00020\nJ.\u0010.\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020\n2\u0006\u0010-\u001a\u00020\nJ\u0012\u0010/\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0002R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/xiaomi/fitness/detail/view/DistanceStepStickerView;", "Lcom/xiaomi/fitness/detail/view/StickerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mContext", "textSizeRadio", "", "marginStartRadio", "viewBottomList", "", "viewHeightList", "txtSizeList", "recentSizeList", "leftTxtList", "", "", "leftTitleTxtList", "bigTextSizeRadio", "marginStartWidth", "normalTxtSize", "bigTxtWidth", "midTxtWidth", "avgHeartTxt", "maxHeartTxt", "distanceTxt", "timeDateTxt", "timeMinTxt", "caloriesTxt", "durationTxt", "heightSizeRadio", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "setStickTextValue", "sportValue", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "drawCustomShape", "x", "y", "width", "height", "drawRightCustomShape", "drawViewText", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DistanceStepStickerView extends StickerView {

    @NotNull
    private String avgHeartTxt;
    private float bigTextSizeRadio;
    private float bigTxtWidth;

    @NotNull
    private String caloriesTxt;

    @NotNull
    private String distanceTxt;

    @NotNull
    private String durationTxt;
    private float heightSizeRadio;

    @NotNull
    private final List<String> leftTitleTxtList;

    @NotNull
    private final List<String> leftTxtList;

    @NotNull
    private final Context mContext;
    private final float marginStartRadio;
    private float marginStartWidth;

    @NotNull
    private String maxHeartTxt;
    private float midTxtWidth;
    private float normalTxtSize;

    @NotNull
    private final List<Float> recentSizeList;
    private final float textSizeRadio;

    @NotNull
    private String timeDateTxt;

    @NotNull
    private String timeMinTxt;

    @NotNull
    private final List<Float> txtSizeList;

    @NotNull
    private final List<Float> viewBottomList;

    @NotNull
    private final List<Float> viewHeightList;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public DistanceStepStickerView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void drawViewText(Canvas canvas) {
        Paint paint;
        char c;
        char c2;
        Paint paint2 = new Paint();
        paint2.setColor(this.mContext.getColor(dki.f2));
        paint2.setTypeface(DisplayUtil.getTypefaceAsResourceId(getContext(), opi.f29366a));
        Paint paint3 = new Paint();
        paint3.setColor(this.mContext.getColor(dki.f2));
        paint3.setStyle(Paint.Style.STROKE);
        DisplayUtil displayUtil = DisplayUtil.INSTANCE;
        float f = 3;
        paint3.setStrokeWidth(displayUtil.dip2pxF((this.heightSizeRadio * 2.0f) / f));
        displayUtil.dip2pxF(this.heightSizeRadio * 1.5f);
        int size = this.leftTxtList.size();
        float f2 = 0.0f;
        int i = 0;
        while (i < size) {
            String str = this.leftTxtList.get(i);
            float fFloatValue = (this.txtSizeList.get(i).floatValue() * this.heightSizeRadio) / f;
            DisplayUtil displayUtil2 = DisplayUtil.INSTANCE;
            float fDip2pxF = displayUtil2.dip2pxF((this.viewHeightList.get(i).floatValue() * this.heightSizeRadio) / f);
            float fDip2pxF2 = displayUtil2.dip2pxF((this.viewBottomList.get(i).floatValue() * this.heightSizeRadio) / f);
            float fDip2pxF3 = displayUtil2.dip2pxF((this.recentSizeList.get(i).floatValue() * this.heightSizeRadio) / f);
            if (fDip2pxF3 > getWidth()) {
                fDip2pxF3 = getWidth();
            }
            float f3 = fDip2pxF3;
            float fMax = Math.max(f3, f2);
            float f4 = 2;
            float f5 = fDip2pxF2 - (fDip2pxF / f4);
            paint2.setColor(this.mContext.getColor(dki.f2));
            paint2.setTextSize(displayUtil2.dip2pxF(fFloatValue));
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        c = 3;
                        if (i == 3) {
                            Integer numValueOf = canvas != null ? Integer.valueOf(canvas.saveLayer(0.0f, fDip2pxF2 - fDip2pxF, f3, fDip2pxF2, null)) : null;
                            Intrinsics.checkNotNull(canvas);
                            drawRightCustomShape(canvas, 0.0f, fDip2pxF2 - fDip2pxF, f3, fDip2pxF);
                            float fAscent = f5 - ((paint2.ascent() + paint2.descent()) / 2.0f);
                            paint2.measureText(this.leftTxtList.get(i));
                            canvas.drawText(this.leftTxtList.get(i), this.marginStartWidth, fAscent, paint2);
                            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                            canvas.drawText(this.leftTxtList.get(i), this.marginStartWidth, fAscent, paint2);
                            paint2.setXfermode(null);
                            Intrinsics.checkNotNull(numValueOf);
                            canvas.restoreToCount(numValueOf.intValue());
                            paint2.setTextSize((paint2.getTextSize() * 9) / 22);
                            canvas.drawText(this.leftTitleTxtList.get(i), ((5 * f3) / 7.0f) + ((((f3 * f4) / 7.0f) - paint2.measureText(this.leftTitleTxtList.get(i))) / f4), f5, paint2);
                            paint = paint3;
                        } else if (i != 4) {
                            c = 3;
                            paint = paint3;
                            size = size;
                            c2 = 0;
                            i = i;
                        } else {
                            c = 3;
                        }
                    } else {
                        c = 3;
                    }
                    i = i;
                    Integer numValueOf2 = canvas != null ? Integer.valueOf(canvas.saveLayer(0.0f, fDip2pxF2 - fDip2pxF, f3, fDip2pxF2, null)) : null;
                    Intrinsics.checkNotNull(canvas);
                    drawCustomShape(canvas, 0.0f, fDip2pxF2 - fDip2pxF, f3, fDip2pxF);
                    float fAscent2 = f5 - ((paint2.ascent() + paint2.descent()) / 2.0f);
                    float fMeasureText = paint2.measureText(this.leftTxtList.get(i));
                    canvas.drawText(this.leftTxtList.get(i), (f3 - this.marginStartWidth) - fMeasureText, fAscent2, paint2);
                    paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    canvas.drawText(this.leftTxtList.get(i), (f3 - this.marginStartWidth) - fMeasureText, fAscent2, paint2);
                    paint2.setXfermode(null);
                    Intrinsics.checkNotNull(numValueOf2);
                    canvas.restoreToCount(numValueOf2.intValue());
                    paint2.setTextSize((paint2.getTextSize() * ((float) 9)) / 22);
                    canvas.drawText(this.leftTitleTxtList.get(i), ((((f3 * f4) / 11.0f) - paint2.measureText(this.leftTitleTxtList.get(i))) / f4) + (displayUtil2.dip2pxF((this.heightSizeRadio * 2.0f) / f) / 4), f5, paint2);
                    paint = paint3;
                } else {
                    size = size;
                    c = 3;
                    i = i;
                    Path path = new Path();
                    float f6 = fDip2pxF2 - fDip2pxF;
                    path.moveTo(0.0f, f6);
                    path.lineTo(f3, f6);
                    path.lineTo(f3, fDip2pxF2);
                    path.lineTo(0.0f, fDip2pxF2);
                    path.lineTo(0.0f, f6);
                    paint = paint3;
                    if (canvas != null) {
                        canvas.drawPath(path, paint);
                    }
                    this.marginStartWidth = paint2.getTextSize() / f;
                    paint2.setTextSize(paint2.getTextSize() / f4);
                    if (canvas != null) {
                        canvas.drawText(this.leftTitleTxtList.get(i), this.marginStartWidth, f5, paint2);
                    }
                    float fMeasureText2 = paint2.measureText("kcal");
                    if (canvas != null) {
                        canvas.drawText("kcal", (f3 - this.marginStartWidth) - fMeasureText2, f5 - (paint2.ascent() + paint2.descent()), paint2);
                    }
                    paint2.setTextSize(paint2.getTextSize() * f4);
                    float fAscent3 = f5 - ((paint2.ascent() + paint2.descent()) / 2.0f);
                    float fMeasureText3 = paint2.measureText(this.leftTxtList.get(i));
                    if (canvas != null) {
                        canvas.drawText(this.leftTxtList.get(i), ((f3 - this.marginStartWidth) - fMeasureText2) - fMeasureText3, fAscent3, paint2);
                    }
                }
                c2 = 0;
            } else {
                paint = paint3;
                size = size;
                c = 3;
                i = i;
                paint2.getTextBounds(str, 0, str.length(), new Rect());
                c2 = 0;
                float fAscent4 = f5 - ((paint2.ascent() + paint2.descent()) / 2.0f);
                if (canvas != null) {
                    canvas.drawText(this.leftTxtList.get(i), 0.0f, fAscent4, paint2);
                }
                i++;
                paint3 = paint;
                f2 = fMax;
                size = size;
            }
            i++;
            paint3 = paint;
            f2 = fMax;
            size = size;
        }
        setViewWidth(f2);
    }

    public final void drawCustomShape(@NotNull Canvas canvas, float x, float y, float width, float height) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Paint paint = new Paint();
        paint.setColor(this.mContext.getColor(dki.f2));
        paint.setStyle(Paint.Style.STROKE);
        DisplayUtil displayUtil = DisplayUtil.INSTANCE;
        float f = 3;
        paint.setStrokeWidth(displayUtil.dip2pxF((this.heightSizeRadio * 2.0f) / f));
        float fDip2pxF = displayUtil.dip2pxF((this.heightSizeRadio * 1.0f) / f);
        float f2 = x + width;
        float f3 = y + height;
        canvas.drawRoundRect(x, y, f2, f3, fDip2pxF, fDip2pxF, paint);
        float f4 = (19 * height) / 28.0f;
        float fDip2pxF2 = ((height * f) / 28.0f) + f4 + displayUtil.dip2pxF((this.heightSizeRadio * 1.0f) / f);
        paint.setStrokeWidth(displayUtil.dip2pxF((this.heightSizeRadio * 1.0f) / f));
        float f5 = y + f4;
        canvas.drawLine(x, f5, f2, f5, paint);
        float f6 = y + fDip2pxF2;
        canvas.drawLine(x, f6, f2, f6, paint);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        canvas.drawRect(x + ((2 * width) / 11.0f), y, f2, f3, paint);
    }

    public final void drawRightCustomShape(@NotNull Canvas canvas, float x, float y, float width, float height) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Paint paint = new Paint();
        paint.setColor(this.mContext.getColor(dki.f2));
        paint.setStyle(Paint.Style.STROKE);
        DisplayUtil displayUtil = DisplayUtil.INSTANCE;
        float f = 3;
        paint.setStrokeWidth(displayUtil.dip2pxF((this.heightSizeRadio * 2.0f) / f));
        float fDip2pxF = displayUtil.dip2pxF((this.heightSizeRadio * 1.0f) / f);
        float f2 = x + width;
        float f3 = y + height;
        canvas.drawRoundRect(x, y, f2, f3, fDip2pxF, fDip2pxF, paint);
        float f4 = (19 * height) / 28.0f;
        float fDip2pxF2 = ((height * f) / 28.0f) + f4 + displayUtil.dip2pxF((this.heightSizeRadio * 1.0f) / f);
        paint.setStrokeWidth(displayUtil.dip2pxF((this.heightSizeRadio * 1.0f) / f));
        float f5 = y + f4;
        canvas.drawLine(x, f5, f2, f5, paint);
        float f6 = y + fDip2pxF2;
        canvas.drawLine(x, f6, f2, f6, paint);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        canvas.drawRect(x, y, x + ((5 * width) / 7.0f), f3, paint);
    }

    @Override // com.xiaomi.fitness.detail.view.StickerView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.heightSizeRadio = getHeight() / ((Number) CollectionsKt___CollectionsKt.last((List) this.viewBottomList)).floatValue();
        drawViewText(canvas);
    }

    @Override // com.xiaomi.fitness.detail.view.StickerView
    public void setStickTextValue(@NotNull SportBasicReport sportValue) {
        Intrinsics.checkNotNullParameter(sportValue, "sportValue");
        this.leftTxtList.clear();
        if (sportValue.getDistance() != null) {
            Integer correctedDistance = sportValue.getCorrectedDistance();
            Integer distance = (correctedDistance == null || correctedDistance.intValue() <= 0) ? sportValue.getDistance() : sportValue.getCorrectedDistance();
            Intrinsics.checkNotNull(distance);
            this.distanceTxt = xr5.g(2, (distance.intValue() * 1.0f) / 1000) + "KM";
        }
        this.leftTxtList.add(this.distanceTxt);
        this.leftTitleTxtList.add("");
        if (sportValue.getCalories() != null) {
            Integer calories = sportValue.getCalories();
            Intrinsics.checkNotNull(calories);
            this.caloriesTxt = String.valueOf(calories.intValue());
        }
        this.leftTxtList.add(this.caloriesTxt);
        this.leftTitleTxtList.add("CALORIES");
        this.timeMinTxt = TimeDateUtil.getHHmmLocalFormat(sportValue.getStartTime());
        long j = 1000;
        String durationStrHour = TimeDateUtil.INSTANCE.getDurationStrHour(((long) sportValue.getDuration()) * j);
        this.durationTxt = durationStrHour;
        this.leftTxtList.add(durationStrHour);
        this.leftTitleTxtList.add("TIME");
        this.timeDateTxt = TimeDateUtil.getDateFormated(sportValue.getStartTime() * j, "MM/dd");
        if (sportValue.getSteps() != null) {
            Integer steps = sportValue.getSteps();
            Intrinsics.checkNotNull(steps);
            if (steps.intValue() > 0) {
                this.leftTxtList.add(String.valueOf(sportValue.getSteps()));
                this.leftTitleTxtList.add("STEPS");
                return;
            }
        }
        if (sportValue.getSkipCount() != null) {
            Integer skipCount = sportValue.getSkipCount();
            Intrinsics.checkNotNull(skipCount);
            if (skipCount.intValue() > 0) {
                this.leftTxtList.add(String.valueOf(sportValue.getSkipCount()));
                this.leftTitleTxtList.add("JUMPS");
                return;
            }
        }
        if (sportValue.getRowCount() != null) {
            Integer rowCount = sportValue.getRowCount();
            Intrinsics.checkNotNull(rowCount);
            if (rowCount.intValue() > 0) {
                this.leftTxtList.add(String.valueOf(sportValue.getSkipCount()));
                this.leftTitleTxtList.add("COUNTS");
                return;
            }
        }
        if (sportValue.getGross() != null) {
            Integer gross = sportValue.getGross();
            Intrinsics.checkNotNull(gross);
            if (gross.intValue() > 0) {
                this.leftTxtList.add(String.valueOf(sportValue.getGross()));
                this.leftTitleTxtList.add("COUNTS");
                return;
            }
        }
        this.leftTxtList.add(this.timeDateTxt);
        this.leftTitleTxtList.add("DATE");
    }

    public /* synthetic */ DistanceStepStickerView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DistanceStepStickerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mContext = context;
        this.textSizeRadio = 0.8f;
        this.marginStartRadio = 0.013333333f;
        Float fValueOf = Float.valueOf(33.0f);
        this.viewBottomList = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{fValueOf, Float.valueOf(62.0f), Float.valueOf(96.0f), Float.valueOf(130.0f), Float.valueOf(DisplayUtil.INSTANCE.dip2pxF(43.333332f))});
        Float fValueOf2 = Float.valueOf(28.0f);
        this.viewHeightList = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{fValueOf, fValueOf2, fValueOf2, fValueOf2});
        Float fValueOf3 = Float.valueOf(27.0f);
        Float fValueOf4 = Float.valueOf(18.0f);
        Float fValueOf5 = Float.valueOf(22.0f);
        this.txtSizeList = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{fValueOf3, fValueOf4, fValueOf5, fValueOf5});
        this.recentSizeList = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(0.0f), Float.valueOf(140.0f), Float.valueOf(154.0f), Float.valueOf(125.0f)});
        this.leftTxtList = new ArrayList();
        this.leftTitleTxtList = new ArrayList();
        this.bigTextSizeRadio = 1.45f;
        this.avgHeartTxt = "--";
        this.maxHeartTxt = "--";
        this.distanceTxt = "-- KM";
        this.timeDateTxt = "--";
        this.timeMinTxt = "--";
        this.caloriesTxt = "--";
        this.durationTxt = "--";
    }
}
