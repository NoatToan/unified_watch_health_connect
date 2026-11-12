package com.xiaomi.fitness.detail.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.share.report.SportReportShareExtKt;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import defpackage.dki;
import defpackage.hoi;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0014J\u000e\u00102\u001a\u00020\u00132\u0006\u00103\u001a\u000204J\u0010\u00105\u001a\u00020/2\u0006\u00106\u001a\u000207H\u0016J.\u00108\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00109\u001a\u00020\n2\u0006\u0010:\u001a\u00020\n2\u0006\u0010;\u001a\u00020\n2\u0006\u0010<\u001a\u00020\nJ.\u0010=\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00109\u001a\u00020\n2\u0006\u0010:\u001a\u00020\n2\u0006\u0010;\u001a\u00020\n2\u0006\u0010<\u001a\u00020\nJ\u0012\u0010>\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0002R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010+\"\u0004\b,\u0010-¨\u0006?"}, d2 = {"Lcom/xiaomi/fitness/detail/view/StepWeekStickerView;", "Lcom/xiaomi/fitness/detail/view/StickerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mContext", "textSizeRadio", "", "marginStartRadio", "viewBottomList", "", "viewHeightList", "txtSizeList", "marginTopSize", "leftTxtList", "", "", "leftTitleTxtList", "bigTextSizeRadio", "marginStartWidth", "normalTxtSize", "bigTxtWidth", "midTxtWidth", "avgHeartTxt", "maxHeartTxt", "distanceTxt", "timeDateTxt", "timeMinTxt", "caloriesTxt", "durationTxt", "dataUnitTxt", "heightSizeRadio", "currentLocale", "Ljava/util/Locale;", "getCurrentLocale", "()Ljava/util/Locale;", "setCurrentLocale", "(Ljava/util/Locale;)V", "isChina", "", "()Z", "setChina", "(Z)V", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "getDayOfWeek", "timestamp", "", "setStickTextValue", "sportValue", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "drawCustomShape", "x", "y", "width", "height", "drawRightCustomShape", "drawViewText", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StepWeekStickerView extends StickerView {

    @NotNull
    private String avgHeartTxt;
    private float bigTextSizeRadio;
    private float bigTxtWidth;

    @NotNull
    private String caloriesTxt;

    @NotNull
    private Locale currentLocale;

    @NotNull
    private String dataUnitTxt;

    @NotNull
    private String distanceTxt;

    @NotNull
    private String durationTxt;
    private float heightSizeRadio;
    private boolean isChina;

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
    public StepWeekStickerView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x01b3  */
    private final void drawViewText(Canvas canvas) {
        Paint paint;
        int i;
        char c;
        String str;
        Paint paint2 = new Paint();
        paint2.setColor(this.mContext.getColor(dki.f2));
        int i2 = 2;
        paint2.setTypeface(SportReportShareExtKt.getLocalFontType(this.mContext, 2));
        Paint paint3 = new Paint();
        paint3.setColor(this.mContext.getColor(dki.f2));
        paint3.setStyle(Paint.Style.STROKE);
        DisplayUtil displayUtil = DisplayUtil.INSTANCE;
        int i3 = 3;
        float f = 3;
        paint3.setStrokeWidth(displayUtil.dip2pxF((this.heightSizeRadio * 1.0f) / f));
        displayUtil.dip2pxF(this.heightSizeRadio * 1.5f);
        int size = this.leftTxtList.size();
        int i4 = 0;
        while (i4 < size) {
            paint2.setTypeface(SportReportShareExtKt.getLocalFontType(this.mContext, i2));
            String str2 = this.leftTxtList.get(i4);
            float fFloatValue = (this.txtSizeList.get(i4).floatValue() * this.heightSizeRadio) / f;
            DisplayUtil displayUtil2 = DisplayUtil.INSTANCE;
            float fDip2pxF = displayUtil2.dip2pxF((this.viewHeightList.get(i4).floatValue() * this.heightSizeRadio) / f);
            float fDip2pxF2 = displayUtil2.dip2pxF((this.viewBottomList.get(i4).floatValue() * this.heightSizeRadio) / f);
            if (getViewWidth() > getWidth()) {
                setViewWidth(getWidth());
            }
            float f2 = i2;
            float f3 = this.marginTopSize + (fDip2pxF2 - (fDip2pxF / f2));
            paint2.setColor(this.mContext.getColor(dki.f2));
            paint2.setTextSize(displayUtil2.dip2pxF(fFloatValue));
            if (i4 == 0) {
                i4 = i4;
                paint = paint3;
                i = size;
                c = 0;
                paint2.setTypeface(SportReportShareExtKt.getLocalFontType(this.mContext, 1));
                if (canvas != null) {
                    canvas.save();
                }
                paint2.getTextBounds(str2, 0, str2.length(), new Rect());
                float fAscent = f3 - ((paint2.ascent() + paint2.descent()) / 2.0f);
                float fMeasureText = paint2.measureText(this.leftTxtList.get(i4)) * 0.9f;
                if (canvas != null) {
                    canvas.rotate(-15.0f, getViewWidth() - fMeasureText, fAscent);
                }
                if (canvas != null) {
                    canvas.drawText(this.leftTxtList.get(i4), getViewWidth() - fMeasureText, fAscent, paint2);
                }
                if (canvas != null) {
                    canvas.restore();
                }
                if (canvas != null) {
                    canvas.drawLine(0.0f, f3, (getViewWidth() - fMeasureText) - displayUtil2.dip2pxF((this.heightSizeRadio * 4.0f) / f), f3, paint);
                }
            } else if (i4 == 1) {
                i4 = i4;
                paint = paint3;
                i = size;
                c = 0;
                float fAscent2 = f3 - ((paint2.ascent() + paint2.descent()) / 2.0f);
                if (paint2.measureText(this.leftTxtList.get(i4)) > getViewWidth()) {
                    paint2.setTextSize((paint2.getTextSize() * getViewWidth()) / paint2.measureText(this.leftTxtList.get(i4)));
                }
                if (canvas != null) {
                    canvas.drawText(this.leftTxtList.get(i4), 0.0f, fAscent2, paint2);
                }
            } else if (i4 != i2) {
                if (i4 == i3 && canvas != null) {
                    canvas.drawLine(0.0f, f3, getViewWidth(), f3, paint3);
                }
                paint = paint3;
                i = size;
                c = 0;
            } else {
                i4 = i4;
                float fAscent3 = f3 - ((paint2.ascent() + paint2.descent()) / 2.0f);
                Intrinsics.checkNotNull(canvas);
                float f4 = fDip2pxF * 2.2f;
                drawCustomShape(canvas, 0.0f, (fDip2pxF2 + this.marginTopSize) - fDip2pxF, f4, fDip2pxF);
                float viewWidth = getViewWidth() / f2;
                float fDip2pxF3 = displayUtil2.dip2pxF((this.heightSizeRadio * 15.0f) / f);
                Drawable drawable = this.mContext.getDrawable(hoi.X0);
                if (this.isChina) {
                    String str3 = this.leftTxtList.get(i4);
                    str = ((Object) str3) + this.dataUnitTxt;
                } else {
                    str = this.leftTxtList.get(i4);
                }
                float fMeasureText2 = paint2.measureText(str);
                float viewWidth2 = getViewWidth() - (4.4f * fDip2pxF);
                i = size;
                if (this.isChina) {
                    paint = paint3;
                } else {
                    paint = paint3;
                    if (!Intrinsics.areEqual(this.dataUnitTxt, "")) {
                        float f5 = fDip2pxF3 / f2;
                        float f6 = (viewWidth - (fMeasureText2 / f2)) - f5;
                        float f7 = viewWidth2 - fDip2pxF3;
                        c = 0;
                        viewWidth += displayUtil2.dip2pxF((this.heightSizeRadio * 1.0f) / f) + f5;
                        if (drawable != null) {
                            drawable.setBounds((int) f6, (int) (f3 - f5), (int) (f6 + fDip2pxF3), (int) (f3 + f5));
                            drawable.draw(canvas);
                        }
                        viewWidth2 = f7;
                    }
                    if (fMeasureText2 > viewWidth2) {
                        paint2.setTextSize(((paint2.getTextSize() * viewWidth2) * 0.95f) / fMeasureText2);
                    }
                    canvas.drawText(str, viewWidth - (paint2.measureText(str) / f2), fAscent3, paint2);
                    drawRightCustomShape(canvas, getViewWidth() - f4, (fDip2pxF2 + this.marginTopSize) - fDip2pxF, f4, fDip2pxF);
                }
                c = 0;
                if (fMeasureText2 > viewWidth2) {
                    paint2.setTextSize(((paint2.getTextSize() * viewWidth2) * 0.95f) / fMeasureText2);
                }
                canvas.drawText(str, viewWidth - (paint2.measureText(str) / f2), fAscent3, paint2);
                drawRightCustomShape(canvas, getViewWidth() - f4, (fDip2pxF2 + this.marginTopSize) - fDip2pxF, f4, fDip2pxF);
            }
            i4++;
            size = i;
            paint3 = paint;
            i2 = 2;
            i3 = 3;
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

    public final void drawRightCustomShape(@NotNull Canvas canvas, float x, float y, float width, float height) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Paint paint = new Paint();
        paint.setColor(this.mContext.getColor(dki.f2));
        paint.setTextSize(DisplayUtil.INSTANCE.dip2pxF((this.heightSizeRadio * 12.0f) / 3));
        paint.setTypeface(SportReportShareExtKt.getLocalFontType(this.mContext, 2));
        Drawable drawable = this.mContext.getDrawable(hoi.Y0);
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
        canvas.drawText(this.caloriesTxt, f4, fAscent, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawText(this.caloriesTxt, f4, fAscent, paint);
        paint.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }

    @NotNull
    public final Locale getCurrentLocale() {
        return this.currentLocale;
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

    /* JADX INFO: renamed from: isChina, reason: from getter */
    public final boolean getIsChina() {
        return this.isChina;
    }

    @Override // com.xiaomi.fitness.detail.view.StickerView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float height = getHeight() / ((Number) CollectionsKt___CollectionsKt.last((List) this.viewBottomList)).floatValue();
        this.heightSizeRadio = height;
        DisplayUtil displayUtil = DisplayUtil.INSTANCE;
        float f = 3;
        this.marginTopSize = displayUtil.dip2pxF((height * 30.0f) / f);
        Paint paint = new Paint();
        paint.setTypeface(SportReportShareExtKt.getLocalFontType(this.mContext, 2));
        paint.setTextSize(displayUtil.dip2pxF((this.heightSizeRadio * 40.0f) / f));
        setViewWidth(paint.measureText(this.timeDateTxt));
        drawViewText(canvas);
    }

    public final void setChina(boolean z) {
        this.isChina = z;
    }

    public final void setCurrentLocale(@NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "<set-?>");
        this.currentLocale = locale;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x005d  */
    @Override // com.xiaomi.fitness.detail.view.StickerView
    public void setStickTextValue(@NotNull SportBasicReport sportValue) {
        String str;
        String string;
        Intrinsics.checkNotNullParameter(sportValue, "sportValue");
        this.leftTxtList.clear();
        this.leftTxtList.add(getDayOfWeek(sportValue.getStartTime()));
        long j = 1000;
        String dateFormated = TimeDateUtil.getDateFormated(sportValue.getStartTime() * j, "yyyy.MM.dd");
        this.timeDateTxt = dateFormated;
        this.leftTxtList.add(dateFormated);
        this.durationTxt = TimeDateUtil.INSTANCE.getDurationStrHour(((long) sportValue.getDuration()) * j);
        if (sportValue.getSteps() != null) {
            Integer steps = sportValue.getSteps();
            Intrinsics.checkNotNull(steps);
            if (steps.intValue() > 0) {
                this.leftTxtList.add(String.valueOf(sportValue.getSteps()));
                str = "步";
            } else {
                this.leftTxtList.add(this.durationTxt);
                str = "";
            }
        } else {
            this.leftTxtList.add(this.durationTxt);
            str = "";
        }
        this.dataUnitTxt = str;
        this.leftTxtList.add(" ");
        Integer avgHr = sportValue.getAvgHr();
        if (avgHr == null || (string = avgHr.toString()) == null) {
            string = "--";
        }
        this.avgHeartTxt = string;
        if (sportValue.getCalories() != null) {
            Integer calories = sportValue.getCalories();
            Intrinsics.checkNotNull(calories);
            this.caloriesTxt = String.valueOf(calories.intValue());
        }
    }

    public /* synthetic */ StepWeekStickerView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StepWeekStickerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mContext = context;
        this.textSizeRadio = 0.8f;
        this.marginStartRadio = 0.013333333f;
        this.viewBottomList = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(27.0f), Float.valueOf(60.0f), Float.valueOf(91.0f), Float.valueOf(105.0f), Float.valueOf(153.0f), Float.valueOf(DisplayUtil.INSTANCE.dip2pxF(51.0f))});
        this.viewHeightList = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(19.0f), Float.valueOf(33.0f), Float.valueOf(21.0f), Float.valueOf(1.0f)});
        this.txtSizeList = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(23.0f), Float.valueOf(40.0f), Float.valueOf(18.0f), Float.valueOf(0.0f)});
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
        this.dataUnitTxt = "--";
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        this.currentLocale = locale;
        this.isChina = locale.getCountry().equals(ServerConstants.NEW_CN_COUNTRY_CODE);
    }
}
