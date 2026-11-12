package com.xiaomi.fitness.detail.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.share.report.SportReportShareExtKt;
import defpackage.dki;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0014J\u0010\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&H\u0016J\u0012\u0010'\u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/detail/view/NormalStickerTimeView;", "Lcom/xiaomi/fitness/detail/view/StickerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mContext", "textSizeRadio", "", "marginStartRadio", "viewBottomList", "", "viewHeightList", "txtSizeList", "leftTxtList", "", "", "rightTxtList", "bigTextSizeRadio", "marginStartWidth", "normalTxtSize", "bigTxtWidth", "midTxtWidth", "avgHeartTxt", "maxHeartTxt", "distanceTxt", "timeDateTxt", "timeMinTxt", "caloriesTxt", "durationTxt", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "setStickTextValue", "sportValue", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "drawViewText", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NormalStickerTimeView extends StickerView {

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
    private final List<Float> viewBottomList;

    @NotNull
    private final List<Float> viewHeightList;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public NormalStickerTimeView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void drawViewText(Canvas canvas) {
        boolean z;
        Paint paint = new Paint();
        float height = getHeight() / ((Number) CollectionsKt___CollectionsKt.last((List) this.viewBottomList)).floatValue();
        paint.setColor(this.mContext.getColor(dki.f2));
        paint.setTypeface(SportReportShareExtKt.getLocalFontType(this.mContext, 4));
        Paint paint2 = new Paint();
        paint2.setColor(this.mContext.getColor(dki.k2));
        paint2.setStyle(Paint.Style.STROKE);
        DisplayUtil displayUtil = DisplayUtil.INSTANCE;
        float f = 3;
        paint2.setStrokeWidth(displayUtil.dip2pxF((this.txtSizeList.get(0).floatValue() * height) / f) / 18);
        paint.setTextSize(displayUtil.dip2pxF((this.txtSizeList.get(1).floatValue() * height) / f));
        float fDip2pxF = displayUtil.dip2pxF(1.5f * height);
        int size = this.leftTxtList.size();
        int i = 0;
        float fMax = 0.0f;
        while (i < size) {
            String str = this.leftTxtList.get(i);
            float fFloatValue = (this.txtSizeList.get(i).floatValue() * height) / f;
            DisplayUtil displayUtil2 = DisplayUtil.INSTANCE;
            int i2 = size;
            float fDip2pxF2 = displayUtil2.dip2pxF((this.viewBottomList.get(i).floatValue() * height) / f) - (displayUtil2.dip2pxF((this.viewHeightList.get(i).floatValue() * height) / f) / 2);
            paint.setColor(this.mContext.getColor(dki.f2));
            paint.setTextSize(displayUtil2.dip2pxF(fFloatValue));
            if (i == 0 || i == 1 || i == 2) {
                paint.getTextBounds(str, 0, str.length(), new Rect());
                float fAscent = fDip2pxF2 - ((paint.ascent() + paint.descent()) / 2.0f);
                if (canvas != null) {
                    z = false;
                    canvas.drawText(this.leftTxtList.get(i), 0.0f, fAscent, paint);
                } else {
                    z = false;
                }
                float fMeasureText = (paint.measureText(this.leftTxtList.get(i)) * 11) / 10;
                if (canvas != null) {
                    float f2 = fAscent + fDip2pxF;
                    canvas.drawLine(0.0f, f2, fMeasureText, f2, paint2);
                }
                fMax = Math.max(fMeasureText, fMax);
            } else {
                if (i == 3) {
                    paint.getTextBounds(str, 0, str.length(), new Rect());
                    float fAscent2 = fDip2pxF2 - ((paint.ascent() + paint.descent()) / 2.0f);
                    if (canvas != null) {
                        canvas.drawText(this.leftTxtList.get(i), 0.0f, fAscent2, paint);
                    }
                    float fMeasureText2 = paint.measureText(this.leftTxtList.get(i));
                    paint.setTextSize(displayUtil2.dip2pxF((fFloatValue / 36) * 15));
                    if (canvas != null) {
                        canvas.drawText("kcal", displayUtil2.dip2pxF((1.0f * height) / f) + fMeasureText2, fAscent2, paint);
                    }
                    fMax = Math.max(fMax, fMeasureText2 + paint.measureText("kcal"));
                }
                i = i;
            }
            i++;
            size = i2;
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
        this.leftTxtList.clear();
        long j = 1000;
        String dateFormated = TimeDateUtil.getDateFormated(sportValue.getStartTime() * j, "MM/dd");
        this.timeDateTxt = dateFormated;
        this.leftTxtList.add(dateFormated);
        String dateHHmm24Format = TimeDateUtil.getDateHHmm24Format(sportValue.getStartTime());
        this.timeMinTxt = dateHHmm24Format;
        this.leftTxtList.add(dateHHmm24Format);
        String durationStrHour = TimeDateUtil.INSTANCE.getDurationStrHour(((long) sportValue.getDuration()) * j);
        this.durationTxt = durationStrHour;
        this.leftTxtList.add(durationStrHour);
        if (sportValue.getCalories() != null) {
            Integer calories = sportValue.getCalories();
            Intrinsics.checkNotNull(calories);
            this.caloriesTxt = String.valueOf(calories.intValue());
        }
        this.leftTxtList.add(this.caloriesTxt);
    }

    public /* synthetic */ NormalStickerTimeView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NormalStickerTimeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mContext = context;
        this.textSizeRadio = 0.8f;
        this.marginStartRadio = 0.013333333f;
        Float fValueOf = Float.valueOf(26.0f);
        this.viewBottomList = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{fValueOf, Float.valueOf(60.0f), Float.valueOf(98.0f), Float.valueOf(155.0f), Float.valueOf(DisplayUtil.INSTANCE.dip2pxF(51.666668f))});
        this.viewHeightList = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{fValueOf, Float.valueOf(28.0f), Float.valueOf(31.0f), Float.valueOf(51.0f)});
        this.txtSizeList = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(18.0f), Float.valueOf(20.0f), Float.valueOf(22.0f), Float.valueOf(36.0f)});
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
