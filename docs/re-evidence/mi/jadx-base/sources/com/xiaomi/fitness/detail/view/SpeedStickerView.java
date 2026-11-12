package com.xiaomi.fitness.detail.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.miui.tsmclient.util.StringUtils;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.util.FitnessSportTypeUtils;
import com.xiaomi.fit.data.common.data.sport.util.SportReportComputeUtil;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import defpackage.byi;
import defpackage.dki;
import defpackage.hoi;
import defpackage.j1j;
import defpackage.xr5;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0014J\u0010\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020%H\u0016J\u0012\u0010&\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\u0012\u0010'\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\u0012\u0010(\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\u0018\u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020,H\u0002J\u0012\u0010-\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\u0010\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u000200H\u0002R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/xiaomi/fitness/detail/view/SpeedStickerView;", "Lcom/xiaomi/fitness/detail/view/StickerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mContext", "textSizeRadio", "", "marginStartRadio", "lineWidthRadio", "centerVerticalRadio", "lineHeightRadioList", "", "bigTextSizeRadio", "marginStartWidth", "txtSize", "lineStrokeWidth", "avgHeartTxt", "", "durationTxt", "distanceTxt", "avgPaceTxt", "avgSpeedTxt", "paceValueStr", "speedValueStr", "timeDateTxt", "timeMinTxt", "drawViewWidth", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "setStickTextValue", "sportValue", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "drawHorizontalLine", "drawVerticalLine", "drawRightViewText", "getLeftStartWidthByString", "str", "paint", "Landroid/graphics/Paint;", "drawLeftViewText", "getTextCenterYByLinePosition", "position", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SpeedStickerView extends StickerView {

    @NotNull
    private String avgHeartTxt;

    @NotNull
    private final String avgPaceTxt;

    @NotNull
    private final String avgSpeedTxt;
    private float bigTextSizeRadio;
    private float centerVerticalRadio;

    @NotNull
    private String distanceTxt;
    private float drawViewWidth;

    @NotNull
    private String durationTxt;

    @NotNull
    private final List<Float> lineHeightRadioList;
    private float lineStrokeWidth;
    private final float lineWidthRadio;

    @NotNull
    private final Context mContext;
    private final float marginStartRadio;
    private float marginStartWidth;

    @NotNull
    private String paceValueStr;

    @NotNull
    private String speedValueStr;
    private final float textSizeRadio;

    @NotNull
    private String timeDateTxt;

    @NotNull
    private String timeMinTxt;
    private float txtSize;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public SpeedStickerView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void drawHorizontalLine(Canvas canvas) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        DisplayUtil displayUtil = DisplayUtil.INSTANCE;
        paint.setStrokeWidth(displayUtil.dip2pxF(this.lineStrokeWidth));
        paint.setColor(this.mContext.getColor(dki.f2));
        paint.setTextSize(displayUtil.dip2pxF(this.textSizeRadio * this.drawViewWidth));
        paint.setTypeface(Typeface.create("mipro_regular", 1));
        for (int i = 0; i < 5; i++) {
            Path path = new Path();
            path.moveTo(0.0f, this.lineHeightRadioList.get(i).floatValue() * getHeight());
            path.lineTo(this.drawViewWidth, this.lineHeightRadioList.get(i).floatValue() * getHeight());
            if (canvas != null) {
                canvas.drawPath(path, paint);
            }
        }
    }

    private final void drawLeftViewText(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(this.mContext.getColor(dki.f2));
        DisplayUtil displayUtil = DisplayUtil.INSTANCE;
        paint.setTextSize(displayUtil.dip2pxF(this.txtSize));
        paint.setTypeface(Typeface.create("mipro-regular", 0));
        Drawable drawable = getResources().getDrawable(hoi.S0);
        float fFloatValue = (this.lineHeightRadioList.get(1).floatValue() - this.lineHeightRadioList.get(0).floatValue()) * getHeight();
        if (drawable != null) {
            float f = this.drawViewWidth;
            drawable.setBounds((int) (f - fFloatValue), 0, (int) f, (int) fFloatValue);
            Intrinsics.checkNotNull(canvas);
            drawable.draw(canvas);
        }
        float f2 = 2;
        float fDip2pxF = (this.drawViewWidth - fFloatValue) - displayUtil.dip2pxF(this.marginStartWidth + (this.lineStrokeWidth * f2));
        if (paint.measureText(this.avgHeartTxt) > fDip2pxF) {
            paint.setTextSize(((paint.getTextSize() * fDip2pxF) * 0.9f) / paint.measureText(this.avgHeartTxt));
        }
        if (canvas != null) {
            canvas.drawText(this.avgHeartTxt, displayUtil.dip2pxF(this.marginStartWidth), getTextCenterYByLinePosition(0), paint);
        }
        paint.setTextSize(displayUtil.dip2pxF(this.txtSize));
        float fDip2pxF2 = (this.drawViewWidth * this.centerVerticalRadio) - displayUtil.dip2pxF(this.marginStartWidth + (this.lineStrokeWidth * f2));
        if (paint.measureText(this.durationTxt) > fDip2pxF2) {
            paint.setTextSize(((paint.getTextSize() * fDip2pxF2) * 0.9f) / paint.measureText(this.durationTxt));
        }
        if (canvas != null) {
            canvas.drawText(this.durationTxt, displayUtil.dip2pxF(this.marginStartWidth), getTextCenterYByLinePosition(1), paint);
        }
        paint.setTextSize(displayUtil.dip2pxF(this.txtSize));
        if (canvas != null) {
            canvas.drawText(this.timeDateTxt, displayUtil.dip2pxF(this.marginStartWidth), getTextCenterYByLinePosition(3), paint);
        }
        paint.setTextSize(displayUtil.dip2pxF(this.txtSize * this.bigTextSizeRadio));
        if (Intrinsics.areEqual(this.paceValueStr, "")) {
            if (canvas != null) {
                float f3 = 1;
                canvas.drawText(this.avgSpeedTxt, displayUtil.dip2pxF(this.marginStartWidth - f3), getTextCenterYByLinePosition(2) + displayUtil.dip2pxF(((this.bigTextSizeRadio - f3) * this.txtSize) / f2), paint);
                return;
            }
            return;
        }
        if (canvas != null) {
            float f4 = 1;
            canvas.drawText(this.avgPaceTxt, displayUtil.dip2pxF(this.marginStartWidth - f4), getTextCenterYByLinePosition(2) + displayUtil.dip2pxF(((this.bigTextSizeRadio - f4) * this.txtSize) / f2), paint);
        }
    }

    private final void drawRightViewText(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(this.mContext.getColor(dki.f2));
        DisplayUtil displayUtil = DisplayUtil.INSTANCE;
        paint.setTextSize(displayUtil.dip2pxF(this.txtSize));
        float leftStartWidthByString = this.drawViewWidth - getLeftStartWidthByString(this.distanceTxt, paint);
        if (paint.measureText(this.distanceTxt) > leftStartWidthByString) {
            paint.setTextSize(((paint.getTextSize() * leftStartWidthByString) * 0.9f) / paint.measureText(this.distanceTxt));
        }
        if (canvas != null) {
            String str = this.distanceTxt;
            canvas.drawText(str, getLeftStartWidthByString(str, paint), getTextCenterYByLinePosition(1), paint);
        }
        paint.setTextSize(displayUtil.dip2pxF(this.txtSize));
        if (canvas != null) {
            String str2 = this.timeMinTxt;
            canvas.drawText(str2, getLeftStartWidthByString(str2, paint), getTextCenterYByLinePosition(3), paint);
        }
        paint.setTextSize(displayUtil.dip2pxF(this.txtSize * this.bigTextSizeRadio));
        if (Intrinsics.areEqual(this.paceValueStr, "")) {
            if (paint.measureText(this.speedValueStr) > this.drawViewWidth) {
                paint.setTextSize(((paint.getTextSize() * this.drawViewWidth) * 0.9f) / paint.measureText(this.speedValueStr));
            }
            if (canvas != null) {
                String str3 = this.speedValueStr;
                canvas.drawText(str3, getLeftStartWidthByString(str3, paint), getTextCenterYByLinePosition(2) + displayUtil.dip2pxF(((this.bigTextSizeRadio - 1) * this.txtSize) / 2), paint);
                return;
            }
            return;
        }
        if (paint.measureText(this.paceValueStr) > this.drawViewWidth) {
            paint.setTextSize(((paint.getTextSize() * this.drawViewWidth) * 0.9f) / paint.measureText(this.paceValueStr));
        }
        if (canvas != null) {
            String str4 = this.paceValueStr;
            canvas.drawText(str4, getLeftStartWidthByString(str4, paint), getTextCenterYByLinePosition(2) + displayUtil.dip2pxF(((this.bigTextSizeRadio - 1) * this.txtSize) / 2), paint);
        }
    }

    private final void drawVerticalLine(Canvas canvas) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(DisplayUtil.INSTANCE.dip2pxF(this.lineStrokeWidth));
        paint.setColor(this.mContext.getColor(dki.f2));
        Path path = new Path();
        path.moveTo(this.lineStrokeWidth, 0.0f);
        path.lineTo(this.lineStrokeWidth, getHeight());
        path.moveTo(this.drawViewWidth - this.lineStrokeWidth, 0.0f);
        path.lineTo(this.drawViewWidth - this.lineStrokeWidth, getHeight());
        path.moveTo(this.drawViewWidth * this.centerVerticalRadio, this.lineHeightRadioList.get(1).floatValue() * getHeight());
        path.lineTo(this.drawViewWidth * this.centerVerticalRadio, this.lineHeightRadioList.get(2).floatValue() * getHeight());
        if (canvas != null) {
            canvas.drawPath(path, paint);
        }
    }

    private final float getLeftStartWidthByString(String str, Paint paint) {
        float fMeasureText = this.drawViewWidth - paint.measureText(str);
        DisplayUtil displayUtil = DisplayUtil.INSTANCE;
        float f = 2;
        return Math.max(fMeasureText - displayUtil.dip2pxF(this.marginStartWidth + (this.lineStrokeWidth * f)), (this.drawViewWidth * this.centerVerticalRadio) + displayUtil.dip2pxF(this.marginStartWidth + (f * this.lineStrokeWidth)));
    }

    private final float getTextCenterYByLinePosition(int position) {
        float fFloatValue = this.lineHeightRadioList.get(position).floatValue();
        float fFloatValue2 = this.lineHeightRadioList.get(position + 1).floatValue() - this.lineHeightRadioList.get(position).floatValue();
        float f = 2;
        return ((fFloatValue + (fFloatValue2 / f)) * getHeight()) + DisplayUtil.INSTANCE.dip2pxF((this.txtSize / f) - (this.lineStrokeWidth * f));
    }

    @Override // com.xiaomi.fitness.detail.view.StickerView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float width = ((float) getHeight()) * 1.3f > ((float) getWidth()) ? getWidth() : getHeight() * 1.3f;
        this.drawViewWidth = width;
        setViewWidth(width);
        float f = this.marginStartRadio;
        float f2 = this.drawViewWidth;
        this.marginStartWidth = f * f2;
        this.txtSize = this.textSizeRadio * f2;
        this.lineStrokeWidth = this.lineWidthRadio * getHeight();
        drawHorizontalLine(canvas);
        drawVerticalLine(canvas);
        drawLeftViewText(canvas);
        drawRightViewText(canvas);
    }

    @Override // com.xiaomi.fitness.detail.view.StickerView
    public void setStickTextValue(@NotNull SportBasicReport sportValue) {
        Intrinsics.checkNotNullParameter(sportValue, "sportValue");
        if (sportValue.getAvgHr() != null) {
            Context context = this.mContext;
            int i = byi.f4726a;
            Integer avgHr = sportValue.getAvgHr();
            Intrinsics.checkNotNull(avgHr);
            int iIntValue = avgHr.intValue();
            Integer avgHr2 = sportValue.getAvgHr();
            this.avgHeartTxt = ResourceExtKt.getQuantityString(context, i, iIntValue, avgHr2 != null ? avgHr2.toString() : null);
        }
        this.durationTxt = TimeDateUtil.INSTANCE.getDurationStrHour(((long) sportValue.getDuration()) * ((long) 1000));
        if (sportValue.getDistance() != null) {
            Integer correctedDistance = sportValue.getCorrectedDistance();
            Integer distance = (correctedDistance == null || correctedDistance.intValue() <= 0) ? sportValue.getDistance() : sportValue.getCorrectedDistance();
            Intrinsics.checkNotNull(distance);
            float fIntValue = (distance.intValue() * 1.0f) / 1000;
            this.distanceTxt = ResourceExtKt.getQuantityString(this.mContext, byi.f, (int) fIntValue, Float.valueOf(fIntValue));
        }
        SportReportComputeUtil sportReportComputeUtil = SportReportComputeUtil.INSTANCE;
        Integer avgPace = sportReportComputeUtil.getAvgPace(sportValue);
        if (avgPace != null && FitnessSportTypeUtils.INSTANCE.supportPaceSport(sportValue.getSportType(), sportValue)) {
            this.paceValueStr = TimeDateUtil.getSportPaceStrWithSecDef(avgPace.intValue());
        }
        Float avgSpeed = sportReportComputeUtil.getAvgSpeed(sportValue);
        if (avgSpeed != null && FitnessSportTypeUtils.INSTANCE.supportSpeedSport(sportValue.getSportType())) {
            this.speedValueStr = ResourceExtKt.getQuantityString(this.mContext, byi.g, (int) avgSpeed.floatValue(), Float.valueOf(xr5.e(1, avgSpeed.floatValue())));
        }
        this.timeDateTxt = TimeDateUtil.getDateStr(sportValue.getStartTime(), StringUtils.EXPECT_DATE_FORMAT);
        this.timeMinTxt = TimeDateUtil.getHHmmLocalFormat(sportValue.getStartTime());
    }

    public /* synthetic */ SpeedStickerView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SpeedStickerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mContext = context;
        this.textSizeRadio = 0.028333334f;
        this.marginStartRadio = 0.013333333f;
        this.lineWidthRadio = 0.0033333332f;
        this.centerVerticalRadio = 0.4f;
        this.lineHeightRadioList = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(0.0033333332f), Float.valueOf(0.27f), Float.valueOf(0.5f), Float.valueOf(0.8f), Float.valueOf(1.0f - 0.0033333332f)});
        this.bigTextSizeRadio = 1.45f;
        this.avgHeartTxt = "--";
        this.durationTxt = "--";
        this.distanceTxt = "--";
        String string = context.getString(j1j.E);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.avgPaceTxt = string;
        String string2 = context.getString(j1j.G);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        this.avgSpeedTxt = string2;
        this.paceValueStr = "";
        this.speedValueStr = "";
        this.timeDateTxt = "--";
        this.timeMinTxt = "--";
    }
}
