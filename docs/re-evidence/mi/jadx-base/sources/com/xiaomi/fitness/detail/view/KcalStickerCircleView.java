package com.xiaomi.fitness.detail.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.share.report.SportReportShareExtKt;
import defpackage.byi;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0014J\u0010\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020%H\u0016J\u0012\u0010&\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/detail/view/KcalStickerCircleView;", "Lcom/xiaomi/fitness/detail/view/StickerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mContext", "textSizeRadio", "", "marginStartRadio", "txtHeightSizeList", "", "txtSizeList", "leftTxtList", "", "", "rightTxtList", "bigTextSizeRadio", "marginStartWidth", "normalTxtSize", "bigTxtWidth", "midTxtWidth", "avgHeartTxt", "maxHeartTxt", "distanceTxt", "timeDateTxt", "timeMinTxt", "caloriesTxt", "durationTxt", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "setStickTextValue", "sportValue", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "drawViewText", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KcalStickerCircleView extends StickerView {

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
    private final List<Float> txtHeightSizeList;

    @NotNull
    private final List<Float> txtSizeList;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public KcalStickerCircleView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Code duplicated, block: B:12:0x00df  */
    /* JADX WARN: Code duplicated, block: B:45:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:47:0x02bf  */
    private final void drawViewText(Canvas canvas) {
        int i;
        float f;
        char c;
        float fAscent;
        float fMeasureText;
        Integer numValueOf;
        float f2;
        int i2;
        Paint paint = new Paint();
        float height = getHeight() / CollectionsKt___CollectionsKt.sumOfFloat(this.txtHeightSizeList);
        paint.setColor(this.mContext.getColor(dki.f2));
        int i3 = 2;
        paint.setTypeface(SportReportShareExtKt.getLocalFontType(this.mContext, 2));
        Paint paint2 = new Paint();
        paint2.setColor(this.mContext.getColor(dki.g2));
        paint2.setStyle(Paint.Style.STROKE);
        DisplayUtil displayUtil = DisplayUtil.INSTANCE;
        float f3 = 3;
        paint2.setStrokeWidth(displayUtil.dip2pxF((1.0f * height) / f3));
        int i4 = 1;
        paint.setTextSize(displayUtil.dip2pxF((this.txtSizeList.get(1).floatValue() * height) / f3));
        float fDip2pxF = displayUtil.dip2pxF((height * 2.0f) / f3);
        int size = this.leftTxtList.size();
        float f4 = fDip2pxF;
        int i5 = 0;
        while (i5 < size) {
            String str = this.leftTxtList.get(i5);
            float fFloatValue = (this.txtSizeList.get(i5).floatValue() * height) / f3;
            float fFloatValue2 = (this.txtHeightSizeList.get(i5).floatValue() * height) / f3;
            DisplayUtil displayUtil2 = DisplayUtil.INSTANCE;
            int i6 = size;
            float fDip2pxF2 = f4 + displayUtil2.dip2pxF(fFloatValue2);
            float f5 = fDip2pxF2 - f4;
            float f6 = fDip2pxF2;
            float f7 = i3;
            float f8 = f4 + (f5 / f7);
            paint.setColor(this.mContext.getColor(dki.f2));
            paint.setTextSize(displayUtil2.dip2pxF(fFloatValue));
            if (i5 == 0) {
                i = i5;
                i6 = i6;
                height = height;
                f6 = f6;
                f = f3;
                float f9 = f4;
                setViewWidth(displayUtil2.dip2pxF(fFloatValue2) * 8);
                if (getViewWidth() > getWidth()) {
                    setViewWidth(getWidth());
                }
                RectF rectF = new RectF();
                float viewWidth = getViewWidth() / 18;
                rectF.set(0.0f, f9, getViewWidth(), f6);
                paint.getTextBounds(str, 0, str.length(), new Rect());
                c = 0;
                float fAscent2 = f8 - ((paint.ascent() + paint.descent()) / 2.0f);
                if (canvas != null) {
                    canvas.drawRoundRect(rectF, displayUtil2.dip2pxF(fFloatValue2), displayUtil2.dip2pxF(fFloatValue2), paint2);
                }
                if (canvas != null) {
                    canvas.drawText(this.leftTxtList.get(i), 0.0f + viewWidth, fAscent2, paint);
                }
                float fMeasureText2 = paint.measureText(this.durationTxt) + viewWidth;
                if (canvas != null) {
                    canvas.drawText(this.durationTxt, getViewWidth() - fMeasureText2, fAscent2, paint);
                }
            } else if (i5 == i4) {
                i = i5;
                i6 = i6;
                height = height;
                f6 = f6;
                f = f3;
                paint.getTextBounds(str, 0, str.length(), new Rect());
                fAscent = f8 - ((paint.ascent() + paint.descent()) / 2.0f);
                fMeasureText = paint.measureText(this.leftTxtList.get(i));
                if (fMeasureText > getWidth()) {
                    paint.setTextSize(((paint.getTextSize() * getWidth()) * 0.98f) / fMeasureText);
                }
                if (canvas != null) {
                    canvas.drawText(this.leftTxtList.get(i), 0.0f, fAscent, paint);
                }
                c = 0;
            } else if (i5 == 2) {
                float fDip2pxF3 = displayUtil2.dip2pxF(fFloatValue) * 1.8f;
                Drawable drawable = this.mContext.getDrawable(hoi.d);
                if (canvas != null) {
                    float f10 = fDip2pxF3 / f7;
                    numValueOf = Integer.valueOf(canvas.saveLayer(0.0f, f8 - f10, fDip2pxF3, f8 + f10, null));
                } else {
                    numValueOf = null;
                }
                if (drawable != null) {
                    float f11 = fDip2pxF3 / f7;
                    f2 = f8;
                    i2 = 0;
                    drawable.setBounds(0, (int) (f2 - f11), (int) fDip2pxF3, (int) (f11 + f2));
                    Intrinsics.checkNotNull(canvas);
                    drawable.draw(canvas);
                } else {
                    f2 = f8;
                    i2 = 0;
                }
                Rect rect = new Rect();
                paint.setTextSize(displayUtil2.dip2pxF(fFloatValue / 1.5f));
                paint.getTextBounds(str, i2, r20.length(), rect);
                float fAscent3 = f2 - ((paint.ascent() + paint.descent()) / 2.0f);
                i = i5;
                float fMeasureText3 = (fDip2pxF3 - paint.measureText(this.leftTxtList.get(i))) / f7;
                if (canvas != null) {
                    canvas.drawText(this.leftTxtList.get(i), fMeasureText3, fAscent3, paint);
                }
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                if (canvas != null) {
                    canvas.drawText(this.leftTxtList.get(i), fMeasureText3, fAscent3, paint);
                }
                paint.setXfermode(null);
                if (canvas != null) {
                    Intrinsics.checkNotNull(numValueOf);
                    canvas.restoreToCount(numValueOf.intValue());
                }
                float fDip2pxF4 = displayUtil2.dip2pxF(fFloatValue / f7) + fDip2pxF3;
                paint.setTextSize(displayUtil2.dip2pxF((fFloatValue / 32) * 23));
                float fMeasureText4 = paint.measureText("is worth it.");
                float fDip2pxF5 = displayUtil2.dip2pxF(fFloatValue2) * 2.5f;
                float viewWidth2 = (getViewWidth() - fDip2pxF5) - fDip2pxF4;
                if (fMeasureText4 > viewWidth2) {
                    paint.setTextSize(((paint.getTextSize() * 0.9f) * viewWidth2) / fMeasureText4);
                }
                if (canvas != null) {
                    canvas.drawText("Every step", fDip2pxF4, f2, paint);
                }
                if (canvas != null) {
                    canvas.drawText("is worth it.", fDip2pxF4, paint.getTextSize() + f2, paint);
                }
                RectF rectF2 = new RectF();
                float f12 = fDip2pxF5 / 4.8f;
                f = f3;
                rectF2.set(getViewWidth() - fDip2pxF5, f4, getViewWidth(), f6);
                if (canvas != null) {
                    canvas.drawRoundRect(rectF2, displayUtil2.dip2pxF(fFloatValue2), displayUtil2.dip2pxF(fFloatValue2), paint2);
                }
                paint.setTextSize(displayUtil2.dip2pxF(fFloatValue));
                Rect rect2 = new Rect();
                String str2 = this.timeMinTxt;
                paint.getTextBounds(str2, 0, str2.length(), rect2);
                float fAscent4 = f2 - ((paint.ascent() + paint.descent()) / 2.0f);
                if (canvas != null) {
                    canvas.drawText(this.timeMinTxt, (getViewWidth() - fDip2pxF5) + f12, fAscent4, paint);
                }
                c = 0;
            } else if (i5 != 3) {
                i = i5;
                i6 = i6;
                c = 0;
                height = height;
                f6 = f6;
                f = f3;
            } else {
                i = i5;
                i6 = i6;
                height = height;
                f6 = f6;
                f = f3;
                paint.getTextBounds(str, 0, str.length(), new Rect());
                fAscent = f8 - ((paint.ascent() + paint.descent()) / 2.0f);
                fMeasureText = paint.measureText(this.leftTxtList.get(i));
                if (fMeasureText > getWidth()) {
                    paint.setTextSize(((paint.getTextSize() * getWidth()) * 0.98f) / fMeasureText);
                }
                if (canvas != null) {
                    canvas.drawText(this.leftTxtList.get(i), 0.0f, fAscent, paint);
                }
                c = 0;
            }
            i5 = i + 1;
            f4 = f6;
            size = i6;
            height = height;
            f3 = f;
            i3 = 2;
            i4 = 1;
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
        long j = 1000;
        this.timeDateTxt = TimeDateUtil.getDateFormated(sportValue.getStartTime() * j, "MM.dd");
        this.timeMinTxt = TimeDateUtil.getDateHHmm24Format(sportValue.getStartTime());
        if (sportValue.getDistance() != null) {
            Integer correctedDistance = sportValue.getCorrectedDistance();
            Integer distance = (correctedDistance == null || correctedDistance.intValue() <= 0) ? sportValue.getDistance() : sportValue.getCorrectedDistance();
            Intrinsics.checkNotNull(distance);
            this.distanceTxt = xr5.g(2, (distance.intValue() * 1.0f) / 1000) + "KM";
        }
        this.leftTxtList.add(this.distanceTxt);
        this.durationTxt = TimeDateUtil.INSTANCE.getDurationStrHour(((long) sportValue.getDuration()) * j);
        if (sportValue.getCalories() != null) {
            Context context = this.mContext;
            int i = byi.c;
            Integer calories = sportValue.getCalories();
            Intrinsics.checkNotNull(calories);
            this.caloriesTxt = ResourceExtKt.getQuantityString(context, i, calories.intValue(), String.valueOf(sportValue.getCalories()));
        }
        this.leftTxtList.add(this.caloriesTxt);
        this.leftTxtList.add(this.timeDateTxt);
        if (sportValue.getAvgHr() != null) {
            Context context2 = this.mContext;
            int i2 = j1j.B;
            Integer avgHr = sportValue.getAvgHr();
            Intrinsics.checkNotNull(avgHr);
            this.avgHeartTxt = context2.getString(i2, String.valueOf(avgHr.intValue()));
        }
        this.leftTxtList.add(this.avgHeartTxt);
    }

    public /* synthetic */ KcalStickerCircleView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KcalStickerCircleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mContext = context;
        this.textSizeRadio = 0.8f;
        this.marginStartRadio = 0.013333333f;
        Float fValueOf = Float.valueOf(21.0f);
        Float fValueOf2 = Float.valueOf(50.0f);
        Float fValueOf3 = Float.valueOf(23.0f);
        Float fValueOf4 = Float.valueOf(40.0f);
        this.txtHeightSizeList = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{fValueOf, fValueOf2, fValueOf3, fValueOf4});
        Float fValueOf5 = Float.valueOf(14.0f);
        this.txtSizeList = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{fValueOf5, fValueOf4, fValueOf5, Float.valueOf(22.0f)});
        this.leftTxtList = new ArrayList();
        this.rightTxtList = new ArrayList();
        this.bigTextSizeRadio = 1.45f;
        this.avgHeartTxt = "--";
        this.maxHeartTxt = "--";
        this.distanceTxt = "--";
        this.timeDateTxt = "--";
        this.timeMinTxt = "--";
        this.caloriesTxt = "--";
        this.durationTxt = "--";
    }
}
