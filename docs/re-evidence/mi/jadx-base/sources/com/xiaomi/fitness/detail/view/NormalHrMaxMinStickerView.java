package com.xiaomi.fitness.detail.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.miui.tsmclient.util.StringUtils;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.util.SportReportComputeUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.share.report.SportReportShareExtKt;
import defpackage.dki;
import defpackage.hoi;
import defpackage.j1j;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0014J\u0010\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&H\u0016J\u0012\u0010'\u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/detail/view/NormalHrMaxMinStickerView;", "Lcom/xiaomi/fitness/detail/view/StickerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mContext", "textSizeRadio", "", "marginStartRadio", "viewBottomList", "", "viewHeightList", "txtSizeList", "leftTxtList", "", "", "leftTitleTxtList", "bigTextSizeRadio", "marginStartWidth", "normalTxtSize", "bigTxtWidth", "midTxtWidth", "avgHeartTxt", "maxHeartTxt", "distanceTxt", "timeDateTxt", "timeMinTxt", "caloriesTxt", "durationTxt", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "setStickTextValue", "sportValue", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "drawViewText", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NormalHrMaxMinStickerView extends StickerView {

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
    public NormalHrMaxMinStickerView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void drawViewText(Canvas canvas) {
        Paint paint = new Paint();
        float height = getHeight() / ((Number) CollectionsKt___CollectionsKt.last((List) this.viewBottomList)).floatValue();
        paint.setColor(this.mContext.getColor(dki.f2));
        int i = 2;
        paint.setTypeface(SportReportShareExtKt.getLocalFontType(this.mContext, 2));
        Paint paint2 = new Paint();
        paint2.setColor(this.mContext.getColor(dki.h2));
        paint2.setStyle(Paint.Style.STROKE);
        DisplayUtil displayUtil = DisplayUtil.INSTANCE;
        float f = 3;
        paint2.setStrokeWidth(displayUtil.dip2pxF((1.0f * height) / f));
        displayUtil.dip2pxF(1.5f * height);
        setViewWidth(((float) getHeight()) * 0.8f > ((float) getWidth()) ? getWidth() : getHeight() * 0.8f);
        float viewWidth = getViewWidth() / 14;
        float fDip2pxF = displayUtil.dip2pxF((12.0f * height) / f);
        float fDip2pxF2 = displayUtil.dip2pxF((4.0f * height) / f);
        RectF rectF = new RectF();
        rectF.set(fDip2pxF2, fDip2pxF2, getViewWidth() - fDip2pxF2, getHeight() - fDip2pxF2);
        if (canvas != null) {
            canvas.drawRoundRect(rectF, fDip2pxF2, fDip2pxF2, paint2);
        }
        int size = this.leftTxtList.size();
        int i2 = 0;
        while (i2 < size) {
            String str = this.leftTxtList.get(i2);
            float fFloatValue = (this.txtSizeList.get(i2).floatValue() * height) / f;
            DisplayUtil displayUtil2 = DisplayUtil.INSTANCE;
            float fDip2pxF3 = displayUtil2.dip2pxF((this.viewHeightList.get(i2).floatValue() * height) / f);
            float f2 = i;
            float f3 = fDip2pxF3 / f2;
            float fDip2pxF4 = (displayUtil2.dip2pxF((this.viewBottomList.get(i2).floatValue() * height) / f) + fDip2pxF) - f3;
            float f4 = height;
            paint.setColor(this.mContext.getColor(dki.f2));
            paint.setTextSize(displayUtil2.dip2pxF(fFloatValue));
            if (i2 != 0) {
                if (i2 == 1) {
                    paint.getTextBounds(str, 0, str.length(), new Rect());
                    float fAscent = fDip2pxF4 - ((paint.ascent() + paint.descent()) / 2.0f);
                    if (canvas != null) {
                        canvas.drawText(this.leftTxtList.get(i2), viewWidth, fAscent, paint);
                    }
                    float fMeasureText = paint.measureText(this.leftTxtList.get(i2));
                    paint.setTextSize((paint.getTextSize() * 10) / 16);
                    if (canvas != null) {
                        canvas.drawText(this.leftTitleTxtList.get(i2), fMeasureText + (f2 * viewWidth), fAscent, paint);
                    }
                } else if (i2 == 2 || i2 == 3 || i2 == 4) {
                    float f5 = 13;
                    float f6 = 16;
                    paint.setTextSize((paint.getTextSize() * f5) / f6);
                    paint.getTextBounds(str, 0, str.length(), new Rect());
                    float fAscent2 = fDip2pxF4 - ((paint.ascent() + paint.descent()) / 2.0f);
                    if (canvas != null) {
                        canvas.drawText(this.leftTitleTxtList.get(i2), viewWidth, fAscent2, paint);
                    }
                    float fMeasureText2 = paint.measureText(this.leftTitleTxtList.get(i2));
                    paint.setTextSize((paint.getTextSize() * f6) / f5);
                    if (Intrinsics.areEqual(this.leftTitleTxtList.get(i2), "")) {
                        if (canvas != null) {
                            canvas.drawText(this.leftTxtList.get(i2), viewWidth, fAscent2, paint);
                        }
                    } else if (canvas != null) {
                        canvas.drawText(this.leftTxtList.get(i2), fMeasureText2 + (f2 * viewWidth), fAscent2, paint);
                    }
                }
                size = size;
            } else {
                paint.getTextBounds(str, 0, str.length(), new Rect());
                float fAscent3 = fDip2pxF4 - ((paint.ascent() + paint.descent()) / 2.0f);
                if (canvas != null) {
                    canvas.drawText(this.leftTxtList.get(i2), viewWidth, fAscent3, paint);
                }
                float viewWidth2 = (getViewWidth() - viewWidth) - fDip2pxF3;
                Drawable drawable = this.mContext.getDrawable(hoi.Q0);
                float f7 = fDip2pxF4 - f3;
                if (drawable != null) {
                    drawable.setBounds((int) viewWidth2, (int) f7, (int) (viewWidth2 + fDip2pxF3), (int) (f7 + fDip2pxF3));
                    Intrinsics.checkNotNull(canvas);
                    drawable.draw(canvas);
                }
                paint.setTextSize((paint.getTextSize() * 9) / 16);
                float fMeasureText3 = viewWidth2 + ((fDip2pxF3 - paint.measureText(this.timeMinTxt)) / f2);
                float fAscent4 = fDip2pxF4 - ((paint.ascent() + paint.descent()) / 2.0f);
                if (canvas != null) {
                    canvas.drawText(this.timeMinTxt, fMeasureText3, fAscent4, paint);
                }
            }
            i2++;
            height = f4;
            size = size;
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

    /* JADX WARN: Code duplicated, block: B:13:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:15:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:17:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:18:0x010d  */
    @Override // com.xiaomi.fitness.detail.view.StickerView
    public void setStickTextValue(@NotNull SportBasicReport sportValue) {
        Float avgSwingSpeed;
        Intrinsics.checkNotNullParameter(sportValue, "sportValue");
        this.leftTxtList.clear();
        this.leftTxtList.add("Achieve");
        this.leftTitleTxtList.add("");
        long j = 1000;
        String dateFormated = TimeDateUtil.getDateFormated(sportValue.getStartTime() * j, StringUtils.EXPECT_DATE_FORMAT);
        this.timeDateTxt = dateFormated;
        this.leftTxtList.add(dateFormated);
        this.leftTitleTxtList.add("SAT");
        this.timeMinTxt = TimeDateUtil.getHHmmLocalFormat(sportValue.getStartTime());
        if (sportValue.getCalories() != null) {
            Integer calories = sportValue.getCalories();
            Intrinsics.checkNotNull(calories);
            this.caloriesTxt = String.valueOf(calories.intValue());
        }
        this.durationTxt = TimeDateUtil.INSTANCE.getDurationStrHour(((long) sportValue.getDuration()) * j);
        SportReportComputeUtil sportReportComputeUtil = SportReportComputeUtil.INSTANCE;
        if (sportReportComputeUtil.getAvgPace(sportValue) != null) {
            List<String> list = this.leftTxtList;
            Integer avgPace = sportReportComputeUtil.getAvgPace(sportValue);
            Intrinsics.checkNotNull(avgPace);
            list.add(TimeDateUtil.getSportPaceStrWithSecDef(avgPace.intValue()));
            List<String> list2 = this.leftTitleTxtList;
            String string = this.mContext.getString(j1j.F);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            list2.add(string);
        } else if (sportReportComputeUtil.getAvgSpeed(sportValue) != null) {
            Float avgSpeed = sportReportComputeUtil.getAvgSpeed(sportValue);
            Intrinsics.checkNotNull(avgSpeed);
            if (avgSpeed.floatValue() > 0.0f) {
                Float avgSpeed2 = sportReportComputeUtil.getAvgSpeed(sportValue);
                Intrinsics.checkNotNull(avgSpeed2);
                this.leftTxtList.add(String.valueOf(xr5.e(2, avgSpeed2.floatValue())));
                List<String> list3 = this.leftTitleTxtList;
                String string2 = this.mContext.getString(j1j.G);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                list3.add(string2);
            } else if (sportValue.getAvgSwingSpeed() != null) {
                avgSwingSpeed = sportValue.getAvgSwingSpeed();
                Intrinsics.checkNotNull(avgSwingSpeed);
                if (avgSwingSpeed.floatValue() > 0.0f) {
                    List<String> list4 = this.leftTxtList;
                    Float avgSwingSpeed2 = sportValue.getAvgSwingSpeed();
                    Intrinsics.checkNotNull(avgSwingSpeed2);
                    list4.add(String.valueOf(avgSwingSpeed2.floatValue()));
                    List<String> list5 = this.leftTitleTxtList;
                    String string3 = this.mContext.getString(j1j.G);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    list5.add(string3);
                } else {
                    this.leftTxtList.add(this.durationTxt);
                    this.leftTitleTxtList.add("");
                }
            } else {
                this.leftTxtList.add(this.durationTxt);
                this.leftTitleTxtList.add("");
            }
        } else if (sportValue.getAvgSwingSpeed() != null) {
            avgSwingSpeed = sportValue.getAvgSwingSpeed();
            Intrinsics.checkNotNull(avgSwingSpeed);
            if (avgSwingSpeed.floatValue() > 0.0f) {
                List<String> list6 = this.leftTxtList;
                Float avgSwingSpeed3 = sportValue.getAvgSwingSpeed();
                Intrinsics.checkNotNull(avgSwingSpeed3);
                list6.add(String.valueOf(avgSwingSpeed3.floatValue()));
                List<String> list7 = this.leftTitleTxtList;
                String string4 = this.mContext.getString(j1j.G);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                list7.add(string4);
            } else {
                this.leftTxtList.add(this.durationTxt);
                this.leftTitleTxtList.add("");
            }
        } else {
            this.leftTxtList.add(this.durationTxt);
            this.leftTitleTxtList.add("");
        }
        if (sportValue.getAvgHr() != null) {
            Integer avgHr = sportValue.getAvgHr();
            this.avgHeartTxt = (avgHr != null ? avgHr.toString() : null) + "BPM";
        }
        this.leftTxtList.add(this.avgHeartTxt);
        List<String> list8 = this.leftTitleTxtList;
        String string5 = this.mContext.getString(j1j.A);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        list8.add(string5);
        if (sportValue.getMaxHr() != null) {
            Integer maxHr = sportValue.getMaxHr();
            this.maxHeartTxt = (maxHr != null ? maxHr.toString() : null) + "BPM";
        }
        this.leftTxtList.add(this.maxHeartTxt);
        List<String> list9 = this.leftTitleTxtList;
        String string6 = this.mContext.getString(j1j.D);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        list9.add(string6);
    }

    public /* synthetic */ NormalHrMaxMinStickerView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NormalHrMaxMinStickerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mContext = context;
        this.textSizeRadio = 0.8f;
        this.marginStartRadio = 0.013333333f;
        Float fValueOf = Float.valueOf(34.0f);
        this.viewBottomList = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{fValueOf, Float.valueOf(74.0f), Float.valueOf(94.0f), Float.valueOf(125.0f), Float.valueOf(148.0f), Float.valueOf(174.0f), Float.valueOf(DisplayUtil.INSTANCE.dip2pxF(58.0f))});
        Float fValueOf2 = Float.valueOf(20.0f);
        this.viewHeightList = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{fValueOf, fValueOf2, fValueOf2, fValueOf2, fValueOf2});
        Float fValueOf3 = Float.valueOf(16.0f);
        this.txtSizeList = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{fValueOf3, fValueOf3, fValueOf3, fValueOf3, fValueOf3});
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
