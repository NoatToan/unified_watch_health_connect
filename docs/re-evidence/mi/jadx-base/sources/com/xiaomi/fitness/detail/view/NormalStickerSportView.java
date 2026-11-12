package com.xiaomi.fitness.detail.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.share.report.SportReportShareExtKt;
import com.xiaomi.wearable.hm.ChangeListenerImpl;
import defpackage.dki;
import defpackage.hoi;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0014J\u0010\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/detail/view/NormalStickerSportView;", "Lcom/xiaomi/fitness/detail/view/StickerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mContext", "textSizeRadio", "", "marginStartRadio", "viewBottomList", "", "viewHeightList", "txtSizeList", "leftTxtList", "", "", "rightTxtList", "bigTextSizeRadio", "marginStartWidth", "normalTxtSize", "bigTxtWidth", "midTxtWidth", "avgHeartTxt", "maxHeartTxt", "distanceTxt", "timeDateTxt", "timeMinTxt", "caloriesTxt", "durationTxt", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "setStickTextValue", "sportValue", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "drawViewText", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NormalStickerSportView extends StickerView {

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
    public NormalStickerSportView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:29:0x01aa  */
    private final void drawViewText(Canvas canvas) {
        char c;
        boolean z;
        float fAscent;
        int i;
        Paint paint = new Paint();
        float height = getHeight() / ((Number) CollectionsKt___CollectionsKt.last((List) this.viewBottomList)).floatValue();
        paint.setColor(this.mContext.getColor(dki.f2));
        int i2 = 2;
        paint.setTypeface(SportReportShareExtKt.getLocalFontType(this.mContext, 2));
        Paint paint2 = new Paint();
        paint2.setColor(this.mContext.getColor(dki.i2));
        paint2.setStyle(Paint.Style.STROKE);
        DisplayUtil displayUtil = DisplayUtil.INSTANCE;
        float f = 3;
        paint2.setStrokeWidth(displayUtil.dip2pxF((this.txtSizeList.get(0).floatValue() * height) / f) / 18);
        paint.setTextSize(displayUtil.dip2pxF((this.txtSizeList.get(1).floatValue() * height) / f));
        displayUtil.dip2pxF(1.5f * height);
        int size = this.leftTxtList.size();
        int i3 = 0;
        float fMax = 0.0f;
        while (i3 < size) {
            String str = this.leftTxtList.get(i3);
            float fFloatValue = (this.txtSizeList.get(i3).floatValue() * height) / f;
            DisplayUtil displayUtil2 = DisplayUtil.INSTANCE;
            float fDip2pxF = displayUtil2.dip2pxF((this.viewHeightList.get(i3).floatValue() * height) / f);
            float f2 = i2;
            float f3 = fDip2pxF / f2;
            float fDip2pxF2 = displayUtil2.dip2pxF((this.viewBottomList.get(i3).floatValue() * height) / f) - f3;
            paint.setColor(this.mContext.getColor(dki.f2));
            paint.setTextSize(displayUtil2.dip2pxF(fFloatValue));
            if (i3 == 0) {
                height = height;
                size = size;
                c = 3;
                z = false;
                paint.getTextBounds(str, 0, str.length(), new Rect());
                float fAscent2 = fDip2pxF2 - ((paint.ascent() + paint.descent()) / 2.0f);
                if (canvas != null) {
                    canvas.drawText(this.leftTxtList.get(i3), 0.0f, fAscent2, paint);
                }
                float fMeasureText = paint.measureText(this.leftTxtList.get(i3)) + displayUtil2.dip2pxF(fFloatValue / 6);
                Drawable drawable = this.mContext.getDrawable(hoi.T0);
                float f4 = (fDip2pxF * 22) / 27;
                float f5 = fDip2pxF2 - (f4 / f2);
                if (drawable != null) {
                    drawable.setBounds((int) fMeasureText, (int) f5, (int) (fMeasureText + f4), (int) (f5 + f4));
                    Intrinsics.checkNotNull(canvas);
                    drawable.draw(canvas);
                }
            } else if (i3 == 1) {
                height = height;
                size = size;
                paint.getTextBounds(str, 0, str.length(), new Rect());
                fAscent = fDip2pxF2 - ((paint.ascent() + paint.descent()) / 2.0f);
                if (canvas != null) {
                    canvas.drawText(this.leftTxtList.get(i3), 0.0f, fAscent, paint);
                }
                fMax = Math.max(fMax, paint.measureText(this.leftTxtList.get(i3)));
                z = false;
                c = 3;
            } else if (i3 == 2) {
                Drawable drawable2 = this.mContext.getDrawable(hoi.V0);
                float fMeasureText2 = paint.measureText(this.leftTxtList.get(i3));
                float f6 = fDip2pxF / 4;
                if (drawable2 != null) {
                    i = 0;
                    drawable2.setBounds(0, (int) (fDip2pxF2 - f3), (int) ((f2 * f6) + fMeasureText2), (int) (fDip2pxF2 + f3));
                    Intrinsics.checkNotNull(canvas);
                    drawable2.draw(canvas);
                } else {
                    i = 0;
                }
                paint.getTextBounds(str, i, str.length(), new Rect());
                float fAscent3 = fDip2pxF2 - ((paint.ascent() + paint.descent()) / 2.0f);
                if (canvas != null) {
                    canvas.drawText(this.leftTxtList.get(i3), f6, fAscent3 - (f6 / f), paint);
                }
                Drawable drawable3 = this.mContext.getDrawable(hoi.U0);
                float f7 = (fDip2pxF / 42) * 15;
                int i4 = (int) (((double) fMeasureText2) + (((double) f6) * 2.5d));
                int i5 = (int) (fDip2pxF2 - f3);
                if (drawable3 != null) {
                    drawable3.setBounds(i4, i5, (int) (i4 + f7), (int) (i5 + f7));
                    Intrinsics.checkNotNull(canvas);
                    drawable3.draw(canvas);
                }
                fMax = Math.max(fMax, i4 + f7);
                z = false;
                c = 3;
            } else if (i3 != 3) {
                height = height;
                size = size;
                c = 3;
                z = false;
            } else {
                height = height;
                size = size;
                paint.getTextBounds(str, 0, str.length(), new Rect());
                fAscent = fDip2pxF2 - ((paint.ascent() + paint.descent()) / 2.0f);
                if (canvas != null) {
                    canvas.drawText(this.leftTxtList.get(i3), 0.0f, fAscent, paint);
                }
                fMax = Math.max(fMax, paint.measureText(this.leftTxtList.get(i3)));
                z = false;
                c = 3;
            }
            i3++;
            height = height;
            size = size;
            i2 = 2;
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
        this.leftTxtList.add(ChangeListenerImpl.SETTING_GROUP_TYPE_SPORT);
        long j = 1000;
        String dateFormated = TimeDateUtil.getDateFormated(sportValue.getStartTime() * j, "M/d");
        this.timeDateTxt = dateFormated;
        this.leftTxtList.add("{" + dateFormated + "}");
        this.durationTxt = TimeDateUtil.INSTANCE.getDurationStrHour(((long) sportValue.getDuration()) * j);
        if (sportValue.getCalories() != null) {
            this.caloriesTxt = sportValue.getCalories() + " KCAL";
        }
        this.leftTxtList.add(this.caloriesTxt);
        this.leftTxtList.add(this.durationTxt);
    }

    public /* synthetic */ NormalStickerSportView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NormalStickerSportView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mContext = context;
        this.textSizeRadio = 0.8f;
        this.marginStartRadio = 0.013333333f;
        Float fValueOf = Float.valueOf(33.0f);
        this.viewBottomList = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{fValueOf, Float.valueOf(66.0f), Float.valueOf(112.0f), Float.valueOf(153.0f), Float.valueOf(DisplayUtil.INSTANCE.dip2pxF(51.0f))});
        this.viewHeightList = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{fValueOf, fValueOf, Float.valueOf(42.0f), Float.valueOf(41.0f)});
        Float fValueOf2 = Float.valueOf(27.0f);
        this.txtSizeList = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{fValueOf2, fValueOf2, Float.valueOf(26.0f), Float.valueOf(34.0f)});
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
    }
}
