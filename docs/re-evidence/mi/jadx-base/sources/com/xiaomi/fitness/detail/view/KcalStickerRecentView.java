package com.xiaomi.fitness.detail.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.share.report.SportReportShareExtKt;
import defpackage.byi;
import defpackage.dki;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0014J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0012\u0010!\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/detail/view/KcalStickerRecentView;", "Lcom/xiaomi/fitness/detail/view/StickerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mContext", "textSizeRadio", "", "marginStartRadio", "viewBottomList", "", "viewHeightList", "txtSizeList", "txtList", "", "", "bigTextSizeRadio", "marginStartWidth", "avgHeartTxt", "maxHeartTxt", "distanceTxt", "timeDateTxt", "caloriesTxt", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "setStickTextValue", "sportValue", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "drawViewText", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KcalStickerRecentView extends StickerView {

    @NotNull
    private String avgHeartTxt;
    private float bigTextSizeRadio;

    @NotNull
    private String caloriesTxt;

    @NotNull
    private String distanceTxt;

    @NotNull
    private final Context mContext;
    private final float marginStartRadio;
    private float marginStartWidth;

    @NotNull
    private String maxHeartTxt;
    private final float textSizeRadio;

    @NotNull
    private String timeDateTxt;

    @NotNull
    private final List<String> txtList;

    @NotNull
    private final List<Float> txtSizeList;

    @NotNull
    private final List<Float> viewBottomList;

    @NotNull
    private final List<Float> viewHeightList;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public KcalStickerRecentView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void drawViewText(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(this.mContext.getColor(dki.f2));
        int i = 2;
        paint.setTypeface(SportReportShareExtKt.getLocalFontType(this.mContext, 2));
        float height = getHeight() / ((Number) CollectionsKt___CollectionsKt.last((List) this.viewBottomList)).floatValue();
        int size = this.txtList.size();
        int i2 = 0;
        float fMax = 0.0f;
        while (i2 < size) {
            String str = this.txtList.get(i2);
            float f = 3;
            float fFloatValue = (this.txtSizeList.get(i2).floatValue() * height) / f;
            DisplayUtil displayUtil = DisplayUtil.INSTANCE;
            float fDip2pxF = displayUtil.dip2pxF((this.viewHeightList.get(i2).floatValue() * height) / f);
            float f2 = i;
            float fDip2pxF2 = displayUtil.dip2pxF((this.viewBottomList.get(i2).floatValue() * height) / f) - (fDip2pxF / f2);
            paint.setColor(this.mContext.getColor(dki.f2));
            paint.setTextSize(displayUtil.dip2pxF(fFloatValue));
            int i3 = size;
            paint.getTextBounds(str, 0, str.length(), new Rect());
            float fAscent = fDip2pxF2 - ((paint.ascent() + paint.descent()) / 2.0f);
            if (Intrinsics.areEqual(this.txtList.get(i2), "")) {
                RectF rectF = new RectF();
                float fDip2pxF3 = displayUtil.dip2pxF((2.0f * height) / f) / f2;
                rectF.set(0.0f, fAscent - fDip2pxF3, fDip2pxF * 14, fDip2pxF3 + fAscent);
                if (canvas != null) {
                    canvas.drawRoundRect(rectF, 20.0f, 20.0f, paint);
                }
            } else {
                if (canvas != null) {
                    canvas.drawText(this.txtList.get(i2), 0.0f, fAscent, paint);
                }
                fMax = Math.max(paint.measureText(this.txtList.get(i2)), fMax);
            }
            if (i2 == 1) {
                float fMeasureText = paint.measureText(this.txtList.get(i2));
                float f3 = 110;
                paint.setTextSize((displayUtil.dip2pxF(fFloatValue) / f3) * 63);
                paint.setColor(this.mContext.getColor(dki.f2));
                if (canvas != null) {
                    canvas.drawText("KM", displayUtil.dip2pxF((displayUtil.dip2pxF(fFloatValue) / f3) * 6) + fMeasureText, fAscent, paint);
                }
                fMax = Math.max(fMeasureText + displayUtil.dip2pxF((displayUtil.dip2pxF(fFloatValue) / f3) * 6) + paint.measureText("KM"), fMax);
            }
            i2++;
            size = i3;
            i = 2;
        }
        setViewWidth(fMax);
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
        this.txtList.clear();
        String str = TimeDateUtil.getDateFormated(sportValue.getStartTime() * ((long) 1000), "MM/dd") + "  " + TimeDateUtil.getDateHHmm24Format(sportValue.getStartTime());
        this.timeDateTxt = str;
        this.txtList.add(str);
        if (sportValue.getDistance() != null) {
            Integer correctedDistance = sportValue.getCorrectedDistance();
            Integer distance = (correctedDistance == null || correctedDistance.intValue() <= 0) ? sportValue.getDistance() : sportValue.getCorrectedDistance();
            Intrinsics.checkNotNull(distance);
            this.distanceTxt = xr5.g(2, (distance.intValue() * 1.0f) / 1000);
        }
        this.txtList.add(this.distanceTxt);
        if (sportValue.getCalories() != null) {
            Context context = this.mContext;
            int i = byi.f4727b;
            Integer calories = sportValue.getCalories();
            Intrinsics.checkNotNull(calories);
            this.caloriesTxt = ResourceExtKt.getQuantityString(context, i, calories.intValue(), String.valueOf(sportValue.getCalories()));
        }
        this.txtList.add(this.caloriesTxt);
        if (sportValue.getAvgHr() != null) {
            Context context2 = this.mContext;
            int i2 = byi.d;
            Integer avgHr = sportValue.getAvgHr();
            Intrinsics.checkNotNull(avgHr);
            this.avgHeartTxt = ResourceExtKt.getQuantityString(context2, i2, avgHr.intValue(), String.valueOf(sportValue.getAvgHr()));
        }
        this.txtList.add("");
        this.txtList.add(this.avgHeartTxt);
    }

    public /* synthetic */ KcalStickerRecentView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KcalStickerRecentView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mContext = context;
        this.textSizeRadio = 0.8f;
        this.marginStartRadio = 0.013333333f;
        Float fValueOf = Float.valueOf(21.0f);
        this.viewBottomList = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{fValueOf, Float.valueOf(81.0f), Float.valueOf(111.0f), Float.valueOf(122.0f), Float.valueOf(153.0f), Float.valueOf(DisplayUtil.INSTANCE.dip2pxF(51.0f))});
        this.viewHeightList = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{fValueOf, Float.valueOf(60.0f), Float.valueOf(30.0f), Float.valueOf(2.0f), fValueOf});
        Float fValueOf2 = Float.valueOf(17.0f);
        this.txtSizeList = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{fValueOf2, Float.valueOf(47.0f), Float.valueOf(24.0f), Float.valueOf(0.0f), fValueOf2});
        this.txtList = new ArrayList();
        this.bigTextSizeRadio = 1.45f;
        this.avgHeartTxt = "--";
        this.maxHeartTxt = "--";
        this.distanceTxt = "--";
        this.timeDateTxt = "--";
        this.caloriesTxt = "--";
    }
}
