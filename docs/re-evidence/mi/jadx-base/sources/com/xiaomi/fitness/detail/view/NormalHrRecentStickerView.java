package com.xiaomi.fitness.detail.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.util.FitnessSportTypeUtils;
import com.xiaomi.fit.data.common.data.sport.util.SportReportComputeUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.share.report.SportReportShareExtKt;
import defpackage.dki;
import defpackage.hoi;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0014J\u0010\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020'H\u0016J\u0012\u0010(\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0002R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/detail/view/NormalHrRecentStickerView;", "Lcom/xiaomi/fitness/detail/view/StickerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mContext", "textSizeRadio", "", "marginStartRadio", "viewBottomList", "", "viewHeightList", "txtSizeList", "leftTxtList", "", "", "rightTxtList", "bigTextSizeRadio", "marginStartWidth", "normalTxtSize", "bigTxtWidth", "midTxtWidth", "avgHeartTxt", "maxHeartTxt", "distanceTxt", "timeDateTxt", "timeMinTxt", "caloriesTxt", "durationTxt", "unitText", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "setStickTextValue", "sportValue", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "drawViewText", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NormalHrRecentStickerView extends StickerView {

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
    private final List<String> rightTxtList;
    private final float textSizeRadio;

    @NotNull
    private String timeDateTxt;

    @NotNull
    private String timeMinTxt;

    @NotNull
    private final List<Float> txtSizeList;

    @NotNull
    private String unitText;

    @NotNull
    private final List<Float> viewBottomList;

    @NotNull
    private final List<Float> viewHeightList;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public NormalHrRecentStickerView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void drawViewText(Canvas canvas) {
        char c;
        Paint paint = new Paint();
        float height = getHeight() / ((Number) CollectionsKt___CollectionsKt.last((List) this.viewBottomList)).floatValue();
        paint.setColor(this.mContext.getColor(dki.f2));
        int i = 2;
        paint.setTypeface(SportReportShareExtKt.getLocalFontType(this.mContext, 2));
        Paint paint2 = new Paint();
        paint2.setColor(this.mContext.getColor(dki.f2));
        paint2.setStyle(Paint.Style.STROKE);
        DisplayUtil displayUtil = DisplayUtil.INSTANCE;
        float f = 3;
        paint2.setStrokeWidth(displayUtil.dip2pxF((1.0f * height) / f));
        displayUtil.dip2pxF(1.5f * height);
        setViewWidth(((float) getHeight()) * 1.1f > ((float) getWidth()) ? getWidth() : getHeight() * 1.1f);
        int size = this.leftTxtList.size();
        int i2 = 0;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (i2 < size) {
            String str = this.leftTxtList.get(i2);
            float fFloatValue = (this.txtSizeList.get(i2).floatValue() * height) / f;
            DisplayUtil displayUtil2 = DisplayUtil.INSTANCE;
            float fDip2pxF = displayUtil2.dip2pxF((this.viewHeightList.get(i2).floatValue() * height) / f);
            float fDip2pxF2 = displayUtil2.dip2pxF((this.viewBottomList.get(i2).floatValue() * height) / f);
            float f4 = height;
            float f5 = i;
            float f6 = fDip2pxF2 - (fDip2pxF / f5);
            int i3 = size;
            float f7 = f;
            paint.setColor(this.mContext.getColor(dki.f2));
            paint.setTextSize(displayUtil2.dip2pxF(fFloatValue));
            if (i2 == 0) {
                c = 3;
                paint.getTextBounds(str, 0, str.length(), new Rect());
                float fAscent = f6 - ((paint.ascent() + paint.descent()) / 2.0f);
                float f8 = (7 * fDip2pxF) / 39.0f;
                if (canvas != null) {
                    canvas.drawText(this.leftTxtList.get(i2), f8, fAscent, paint);
                }
                float fMeasureText = paint.measureText(this.leftTxtList.get(i2)) + (f5 * f8);
                Drawable drawable = this.mContext.getDrawable(hoi.R0);
                float f9 = (fDip2pxF * 11) / 39;
                float fAscent2 = f6 + ((paint.ascent() + paint.descent()) / 2.0f);
                if (drawable != null) {
                    drawable.setBounds((int) fMeasureText, (int) fAscent2, (int) (fMeasureText + f9), (int) (fAscent2 + f9));
                    Intrinsics.checkNotNull(canvas);
                    drawable.draw(canvas);
                }
                f2 = f8;
                f3 = fDip2pxF2;
            } else if (i2 == 1) {
                c = 3;
                float fMeasureText2 = paint.measureText(this.leftTxtList.get(i2)) + (f5 * f2);
                Path path = new Path();
                path.moveTo(0.0f, 0.0f);
                path.lineTo(0.0f, fDip2pxF2);
                path.lineTo(fMeasureText2, fDip2pxF2);
                path.lineTo(fMeasureText2, 0.0f);
                path.lineTo(0.0f, 0.0f);
                path.moveTo(0.0f, f3);
                path.lineTo(fMeasureText2, f3);
                if (canvas != null) {
                    canvas.drawPath(path, paint2);
                }
                paint.getTextBounds(str, 0, str.length(), new Rect());
                float fAscent3 = f6 - ((paint.ascent() + paint.descent()) / 2.0f);
                if (canvas != null) {
                    canvas.drawText(this.leftTxtList.get(i2), f2, fAscent3, paint);
                }
            } else if (i2 != 2) {
                c = 3;
                if (i2 == 3) {
                    Path path2 = new Path();
                    path2.moveTo(0.0f, fDip2pxF2);
                    path2.lineTo(getViewWidth(), fDip2pxF2);
                    if (canvas != null) {
                        canvas.drawPath(path2, paint2);
                    }
                } else if (i2 == 4) {
                    Rect rect = new Rect();
                    paint.getTextBounds(str, 0, str.length(), rect);
                    float fAscent4 = f6 - ((paint.ascent() + paint.descent()) / 2.0f);
                    if (canvas != null) {
                        canvas.drawText(this.leftTxtList.get(i2), 0.0f, fAscent4, paint);
                    }
                    float fMeasureText3 = paint.measureText(this.leftTxtList.get(i2));
                    paint.setTextSize(paint.getTextSize() / 2.6f);
                    if (canvas != null) {
                        canvas.drawText(this.unitText, fMeasureText3, fAscent4, paint);
                    }
                    float viewWidth = getViewWidth() - paint.measureText(this.timeMinTxt);
                    if (canvas != null) {
                        canvas.drawText(this.timeMinTxt, viewWidth, f6, paint);
                    }
                    paint.getTextBounds(this.durationTxt, 0, str.length(), rect);
                    float viewWidth2 = getViewWidth() - paint.measureText(this.durationTxt);
                    if (canvas != null) {
                        canvas.drawText(this.durationTxt, viewWidth2, fAscent4, paint);
                    }
                }
            } else {
                c = 3;
                paint.getTextBounds(str, 0, str.length(), new Rect());
                float fAscent5 = f6 - ((paint.ascent() + paint.descent()) / 2.0f);
                if (canvas != null) {
                    canvas.drawText(this.leftTxtList.get(i2), 0.0f, fAscent5, paint);
                }
            }
            i2++;
            height = f4;
            size = i3;
            f = f7;
            i = 2;
        }
    }

    @Override // com.xiaomi.fitness.detail.view.StickerView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.marginStartWidth = this.marginStartRadio * getWidth();
        drawViewText(canvas);
    }

    @Override // com.xiaomi.fitness.detail.view.StickerView
    public void setStickTextValue(@NotNull SportBasicReport sportValue) {
        Intrinsics.checkNotNullParameter(sportValue, "sportValue");
        this.leftTxtList.clear();
        if (sportValue.getAvgHr() != null) {
            Integer avgHr = sportValue.getAvgHr();
            this.avgHeartTxt = (avgHr != null ? avgHr.toString() : null) + "BPM";
        }
        this.leftTxtList.add(this.avgHeartTxt);
        this.leftTxtList.add("Every step is worth it.");
        long j = 1000;
        this.timeDateTxt = TimeDateUtil.getDateFormated(sportValue.getStartTime() * j, "M/d");
        this.timeMinTxt = TimeDateUtil.getHHmmLocalFormat(sportValue.getStartTime());
        if (sportValue.getCalories() != null) {
            Integer calories = sportValue.getCalories();
            Intrinsics.checkNotNull(calories);
            this.caloriesTxt = String.valueOf(calories.intValue());
        }
        this.leftTxtList.add(this.caloriesTxt + "KCAL");
        this.durationTxt = TimeDateUtil.INSTANCE.getDurationStrHour(((long) sportValue.getDuration()) * j);
        this.leftTxtList.add("");
        SportReportComputeUtil sportReportComputeUtil = SportReportComputeUtil.INSTANCE;
        if (sportReportComputeUtil.getAvgSpeed(sportValue) != null) {
            Float avgSpeed = sportReportComputeUtil.getAvgSpeed(sportValue);
            Intrinsics.checkNotNull(avgSpeed);
            if (avgSpeed.floatValue() > 0.0f && FitnessSportTypeUtils.INSTANCE.supportSpeedSport(sportValue.getSportType())) {
                Float avgSpeed2 = sportReportComputeUtil.getAvgSpeed(sportValue);
                Intrinsics.checkNotNull(avgSpeed2);
                this.leftTxtList.add(String.valueOf(xr5.e(2, avgSpeed2.floatValue())));
                this.unitText = "km/h";
                return;
            }
        }
        if (sportReportComputeUtil.getAvgPace(sportValue) != null && FitnessSportTypeUtils.INSTANCE.supportPaceSport(sportValue.getSportType(), sportValue)) {
            List<String> list = this.leftTxtList;
            Integer avgPace = sportReportComputeUtil.getAvgPace(sportValue);
            Intrinsics.checkNotNull(avgPace);
            list.add(TimeDateUtil.getSportPaceStrWithSecDef(avgPace.intValue()));
            return;
        }
        if (sportValue.getAvgSwingSpeed() != null) {
            Float avgSwingSpeed = sportValue.getAvgSwingSpeed();
            Intrinsics.checkNotNull(avgSwingSpeed);
            if (avgSwingSpeed.floatValue() > 0.0f) {
                List<String> list2 = this.leftTxtList;
                Float avgSwingSpeed2 = sportValue.getAvgSwingSpeed();
                Intrinsics.checkNotNull(avgSwingSpeed2);
                list2.add(String.valueOf(avgSwingSpeed2.floatValue()));
                return;
            }
        }
        this.leftTxtList.add(this.timeDateTxt);
    }

    public /* synthetic */ NormalHrRecentStickerView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NormalHrRecentStickerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mContext = context;
        this.textSizeRadio = 0.8f;
        this.marginStartRadio = 0.013333333f;
        Float fValueOf = Float.valueOf(39.0f);
        this.viewBottomList = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{fValueOf, Float.valueOf(57.0f), Float.valueOf(105.0f), Float.valueOf(112.0f), Float.valueOf(155.0f), Float.valueOf(DisplayUtil.INSTANCE.dip2pxF(51.666668f))});
        Float fValueOf2 = Float.valueOf(18.0f);
        Float fValueOf3 = Float.valueOf(42.0f);
        Float fValueOf4 = Float.valueOf(1.0f);
        this.viewHeightList = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{fValueOf, fValueOf2, fValueOf3, fValueOf4, fValueOf3});
        Float fValueOf5 = Float.valueOf(10.0f);
        Float fValueOf6 = Float.valueOf(36.0f);
        this.txtSizeList = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{fValueOf2, fValueOf5, fValueOf6, fValueOf4, fValueOf6});
        this.leftTxtList = new ArrayList();
        this.rightTxtList = new ArrayList();
        this.bigTextSizeRadio = 1.45f;
        this.avgHeartTxt = "--";
        this.maxHeartTxt = "--";
        this.distanceTxt = "-- KM";
        this.timeDateTxt = "--";
        this.timeMinTxt = "--";
        this.caloriesTxt = "--";
        this.durationTxt = "--";
        this.unitText = "";
    }
}
