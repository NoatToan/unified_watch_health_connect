package com.xiaomi.fitness.detail.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.share.report.SportReportShareExtKt;
import defpackage.dki;
import defpackage.hoi;
import defpackage.j1j;
import defpackage.xr5;
import java.util.ArrayList;
import java.util.Calendar;
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
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0014J\u000e\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020(J(\u0010)\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\nH\u0002J\u0010\u0010/\u001a\u00020#2\u0006\u00100\u001a\u000201H\u0016J.\u00102\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u00103\u001a\u00020\n2\u0006\u00104\u001a\u00020\n2\u0006\u00105\u001a\u00020\n2\u0006\u00106\u001a\u00020\nJ\u0012\u00107\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0002R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/xiaomi/fitness/detail/view/DataCircleStickerView;", "Lcom/xiaomi/fitness/detail/view/StickerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mContext", "textSizeRadio", "", "marginStartRadio", "viewBottomList", "", "viewHeightList", "txtSizeList", "marginTopSize", "leftTxtList", "", "", "leftTitleTxtList", "bigTextSizeRadio", "marginStartWidth", "normalTxtSize", "bigTxtWidth", "midTxtWidth", "avgHeartTxt", "maxHeartTxt", "distanceTxt", "timeDateTxt", "timeMinTxt", "caloriesTxt", "durationTxt", "heightSizeRadio", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "getDayOfWeek", "timestamp", "", "drawCircularText", "paint", "Landroid/graphics/Paint;", "drawArea", "Landroid/graphics/RectF;", "radius", "setStickTextValue", "sportValue", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "drawCustomShape", "x", "y", "width", "height", "drawViewText", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataCircleStickerView extends StickerView {

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
    private float marginTopSize;

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
    public DataCircleStickerView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void drawCircularText(Canvas canvas, Paint paint, RectF drawArea, float radius) {
        float fCenterX = drawArea.centerX();
        float fCenterY = drawArea.centerY();
        String str = this.timeDateTxt;
        char[] charArray = str.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        int length = charArray.length;
        float fDip2pxF = DisplayUtil.INSTANCE.dip2pxF((this.heightSizeRadio * 8.0f) / 3);
        float fMeasureText = 330.0f / paint.measureText(str);
        float f = 0.0f;
        int i = 0;
        while (i < length) {
            float f2 = (f * fMeasureText) + 105;
            float fMeasureText2 = f + paint.measureText(String.valueOf(charArray[i]));
            double radians = Math.toRadians(f2);
            paint.measureText(String.valueOf(charArray[i]));
            char[] cArr = charArray;
            float fCos = (((float) Math.cos(radians)) * radius) + fCenterX + fDip2pxF;
            float fSin = (((float) Math.sin(radians)) * radius) + fCenterY + fDip2pxF;
            canvas.save();
            canvas.rotate(f2 + 90, fCos, fSin);
            canvas.drawText(String.valueOf(cArr[i]), fCos, fSin, paint);
            canvas.restore();
            i++;
            charArray = cArr;
            f = fMeasureText2;
        }
    }

    private final void drawViewText(Canvas canvas) {
        int i;
        int i2;
        int i3;
        Integer numValueOf;
        float f;
        Paint paint = new Paint();
        paint.setColor(this.mContext.getColor(dki.f2));
        int i4 = 2;
        paint.setTypeface(SportReportShareExtKt.getLocalFontType(this.mContext, 2));
        Paint paint2 = new Paint();
        paint2.setColor(this.mContext.getColor(dki.f2));
        paint2.setStyle(Paint.Style.STROKE);
        DisplayUtil displayUtil = DisplayUtil.INSTANCE;
        int i5 = 3;
        float f2 = 3;
        paint2.setStrokeWidth(displayUtil.dip2pxF((this.heightSizeRadio * 1.0f) / f2));
        displayUtil.dip2pxF(this.heightSizeRadio * 1.5f);
        if (getViewWidth() > getWidth()) {
            setViewWidth(getWidth());
        }
        int size = this.leftTxtList.size();
        int i6 = 0;
        while (i6 < size) {
            paint.setTypeface(SportReportShareExtKt.getLocalFontType(this.mContext, i5));
            this.leftTxtList.get(i6);
            float fFloatValue = (this.txtSizeList.get(i6).floatValue() * this.heightSizeRadio) / f2;
            DisplayUtil displayUtil2 = DisplayUtil.INSTANCE;
            float fDip2pxF = displayUtil2.dip2pxF((this.viewHeightList.get(i6).floatValue() * this.heightSizeRadio) / f2);
            float fDip2pxF2 = displayUtil2.dip2pxF((this.viewBottomList.get(i6).floatValue() * this.heightSizeRadio) / f2);
            float f3 = i4;
            float f4 = fDip2pxF / f3;
            float f5 = (this.marginTopSize * f3) + (fDip2pxF2 - f4);
            paint.setColor(this.mContext.getColor(dki.f2));
            paint.setTextSize(displayUtil2.dip2pxF(fFloatValue));
            if (i6 != 0) {
                if (i6 != 1) {
                    i3 = 2;
                    if (i6 == 2) {
                        i3 = 2;
                        i6 = i6;
                        i2 = 3;
                        float fMeasureText = paint.measureText(this.leftTxtList.get(i6)) + (this.marginStartWidth * f2);
                        float fDip2pxF3 = displayUtil2.dip2pxF((32 * this.heightSizeRadio) / f2);
                        float fDip2pxF4 = displayUtil2.dip2pxF((37 * this.heightSizeRadio) / f2);
                        float f6 = this.marginStartWidth;
                        float f7 = fMeasureText + f6;
                        float f8 = (f5 - fDip2pxF4) + f6;
                        Drawable drawable = this.mContext.getDrawable(hoi.L0);
                        if (drawable != null) {
                            drawable.setBounds((int) f7, (int) f8, (int) (f7 + fDip2pxF3), (int) (f8 + fDip2pxF4));
                            Intrinsics.checkNotNull(canvas);
                            drawable.draw(canvas);
                        }
                        float fAscent = f5 - ((paint.ascent() + paint.descent()) / 2.0f);
                        if (canvas != null) {
                            canvas.drawText(this.leftTxtList.get(i6), this.marginStartWidth, fAscent, paint);
                        }
                    } else if (i6 != 3) {
                        i2 = 3;
                        i3 = 2;
                        i = i6;
                    } else {
                        float fMeasureText2 = paint.measureText(this.leftTxtList.get(i6)) + (this.marginStartWidth * 4);
                        float fAscent2 = f5 - ((paint.ascent() + paint.descent()) / 2.0f);
                        if (canvas != null) {
                            float f9 = this.marginStartWidth;
                            i2 = 3;
                            numValueOf = Integer.valueOf(canvas.saveLayer(f9, f5 - f4, fMeasureText2 + f9, f5 + f4, paint));
                        } else {
                            i2 = 3;
                            numValueOf = null;
                        }
                        paint2.setStyle(Paint.Style.FILL);
                        if (canvas != null) {
                            float f10 = this.marginStartWidth;
                            float f11 = fDip2pxF / 5;
                            canvas.drawRoundRect(f10, f5 - f4, fMeasureText2 + f10, f5 + f4, f11, f11, paint2);
                        }
                        if (canvas != null) {
                            String str = this.leftTxtList.get(i6);
                            float f12 = this.marginStartWidth;
                            f = fAscent2;
                            canvas.drawText(str, f12 + (f12 * f3), f, paint);
                        } else {
                            f = fAscent2;
                        }
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        if (canvas != null) {
                            String str2 = this.leftTxtList.get(i6);
                            float f13 = this.marginStartWidth;
                            canvas.drawText(str2, f13 + (f13 * f3), f, paint);
                        }
                        paint.setXfermode(null);
                        if (canvas != null) {
                            Intrinsics.checkNotNull(numValueOf);
                            canvas.restoreToCount(numValueOf.intValue());
                        }
                    }
                } else {
                    i2 = 3;
                    i3 = 2;
                    if (canvas != null) {
                        canvas.save();
                    }
                    if (canvas != null) {
                        canvas.rotate(-15.0f, 0.0f, fDip2pxF2);
                    }
                    if (canvas != null) {
                        float f14 = fDip2pxF / 5;
                        canvas.drawRoundRect(this.marginStartWidth, f5 - f4, (this.marginStartWidth * f3) + getViewWidth(), f5 + f4, f14, f14, paint2);
                    }
                    float fAscent3 = f5 - ((paint.ascent() + paint.descent()) / 2.0f);
                    if (canvas != null) {
                        String str3 = this.leftTxtList.get(i6);
                        float f15 = this.marginStartWidth;
                        canvas.drawText(str3, f15 + (f15 * f3), fAscent3, paint);
                    }
                    if (canvas != null) {
                        canvas.restore();
                    }
                }
                i = i6;
            } else {
                i = i6;
                i2 = 3;
                i3 = 2;
                float f16 = this.marginStartWidth;
                RectF rectF = new RectF(f16, 0.0f, f16 + fDip2pxF, fDip2pxF);
                Intrinsics.checkNotNull(canvas);
                drawCircularText(canvas, paint, rectF, f4);
            }
            i6 = i + 1;
            i5 = i2;
            i4 = i3;
        }
    }

    public final void drawCustomShape(@NotNull Canvas canvas, float x, float y, float width, float height) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Paint paint = new Paint();
        paint.setColor(this.mContext.getColor(dki.f2));
        paint.setTextSize(DisplayUtil.INSTANCE.dip2pxF((this.heightSizeRadio * 12.0f) / 3));
        paint.setTypeface(SportReportShareExtKt.getLocalFontType(this.mContext, 2));
        Drawable drawable = this.mContext.getDrawable(hoi.Z0);
        float f = width + x;
        float f2 = y + height;
        int iSaveLayer = canvas.saveLayer(x, y, f, f2, paint);
        float f3 = (18.0f * height) / 21.0f;
        float fAscent = ((height / 2) + y) - ((paint.ascent() + paint.descent()) / 2.0f);
        if (drawable != null) {
            drawable.setBounds((int) x, (int) y, (int) f, (int) f2);
            drawable.draw(canvas);
        }
        float f4 = x + f3;
        canvas.drawText(this.avgHeartTxt, f4, fAscent, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawText(this.avgHeartTxt, f4, fAscent, paint);
        paint.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }

    @NotNull
    public final String getDayOfWeek(long timestamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timestamp);
        switch (calendar.get(7)) {
            case 1:
            default:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
        }
    }

    @Override // com.xiaomi.fitness.detail.view.StickerView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float height = getHeight() / ((Number) CollectionsKt___CollectionsKt.last((List) this.viewBottomList)).floatValue();
        this.heightSizeRadio = height;
        DisplayUtil displayUtil = DisplayUtil.INSTANCE;
        float f = 3;
        this.marginTopSize = displayUtil.dip2pxF((height * 7.0f) / f);
        Paint paint = new Paint();
        paint.setTypeface(SportReportShareExtKt.getLocalFontType(this.mContext, 3));
        paint.setTextSize(displayUtil.dip2pxF((this.heightSizeRadio * 23.0f) / f));
        this.marginStartWidth = displayUtil.dip2pxF((this.heightSizeRadio * 7.0f) / f);
        setViewWidth(paint.measureText(this.durationTxt) + (this.marginStartWidth * 4));
        drawViewText(canvas);
    }

    @Override // com.xiaomi.fitness.detail.view.StickerView
    public void setStickTextValue(@NotNull SportBasicReport sportValue) {
        String string;
        Intrinsics.checkNotNullParameter(sportValue, "sportValue");
        this.leftTxtList.clear();
        long j = 1000;
        String dateFormated = TimeDateUtil.getDateFormated(sportValue.getStartTime() * j, getContext().getString(j1j.f) + " HH:mm");
        this.timeDateTxt = dateFormated;
        this.leftTxtList.add(dateFormated);
        String durationStrHour = TimeDateUtil.INSTANCE.getDurationStrHour(((long) sportValue.getDuration()) * j);
        this.durationTxt = durationStrHour;
        this.leftTxtList.add(durationStrHour);
        Integer avgHr = sportValue.getAvgHr();
        if (avgHr == null || (string = avgHr.toString()) == null) {
            string = "--";
        }
        this.avgHeartTxt = string;
        if (sportValue.getCalories() != null) {
            Integer calories = sportValue.getCalories();
            Intrinsics.checkNotNull(calories);
            this.caloriesTxt = "(" + calories + "KCAL)";
        }
        this.leftTxtList.add(this.caloriesTxt);
        if (sportValue.getDistance() != null) {
            Integer correctedDistance = sportValue.getCorrectedDistance();
            Integer distance = (correctedDistance == null || correctedDistance.intValue() <= 0) ? sportValue.getDistance() : sportValue.getCorrectedDistance();
            Intrinsics.checkNotNull(distance);
            this.distanceTxt = xr5.g(2, (distance.intValue() * 1.0f) / 1000) + "KM";
        }
        this.leftTxtList.add(this.distanceTxt);
    }

    public /* synthetic */ DataCircleStickerView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DataCircleStickerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mContext = context;
        this.textSizeRadio = 0.8f;
        this.marginStartRadio = 0.013333333f;
        this.viewBottomList = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(49.0f), Float.valueOf(94.0f), Float.valueOf(114.0f), Float.valueOf(157.0f), Float.valueOf(175.0f), Float.valueOf(DisplayUtil.INSTANCE.dip2pxF(58.333332f))});
        this.viewHeightList = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(37.0f), Float.valueOf(31.0f), Float.valueOf(14.0f), Float.valueOf(35.0f)});
        this.txtSizeList = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(9.0f), Float.valueOf(26.0f), Float.valueOf(20.0f), Float.valueOf(29.0f)});
        this.marginTopSize = 30.0f;
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
