package com.xiaomi.fitness.active.pk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.f4j;
import defpackage.fni;
import defpackage.jpi;
import defpackage.ozi;
import defpackage.zii;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 =2\u00020\u0001:\u0001=B3\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ&\u0010)\u001a\u00020*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020%0$2\b\b\u0002\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020(J\u0012\u0010.\u001a\u00020*2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010/\u001a\u00020*H\u0002J\b\u00100\u001a\u00020*H\u0002J\b\u00101\u001a\u00020*H\u0002J\u0010\u00102\u001a\u00020*2\u0006\u00103\u001a\u000204H\u0014J\u0010\u0010&\u001a\u00020*2\u0006\u00103\u001a\u000204H\u0002J\u0010\u00105\u001a\u00020*2\u0006\u00103\u001a\u000204H\u0002J(\u00106\u001a\u00020*2\u0006\u00103\u001a\u0002042\u0006\u00107\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u0007H\u0002J\u0010\u0010:\u001a\u00020*2\u0006\u00103\u001a\u000204H\u0002J \u0010;\u001a\u00020*2\u0006\u00103\u001a\u0002042\u0006\u00108\u001a\u00020\u00072\u0006\u0010<\u001a\u00020%H\u0002R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0018X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/xiaomi/fitness/active/pk/widget/PkBarChart;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "normalTextColor", "ownMainColor", "oppMainColor", "lineColor", "emptyStr", "", "showBottomScore", "", "normalTextPaint", "Landroid/text/TextPaint;", "ownTextPaint", "oppTextPaint", "ownBarPaint", "Landroid/graphics/Paint;", "oppBarPaint", "linePaint", "dashPathEffect", "Landroid/graphics/DashPathEffect;", "helpPath", "Landroid/graphics/Path;", "topRadiusArray", "", "extraBitmap", "Landroid/graphics/Bitmap;", "scoreList", "", "Lcom/xiaomi/fitness/active/pk/widget/PkChartDataItem;", "drawEmptyChart", "pkStartTime", "", "updateScoreList", "", "list", "emptyStatusChart", "pkStart", "initStyledAttributes", "initTextPaint", "initBarChartPaint", "initLinePaint", "onDraw", "canvas", "Landroid/graphics/Canvas;", "drawAxisAndLines", "drawBottomText", "str", "xIndex", "yIndex", "drawBarRect", "drawRectItem", "pkChartDataItem", "Companion", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPkBarChart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PkBarChart.kt\ncom/xiaomi/fitness/active/pk/widget/PkBarChart\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,309:1\n1872#2,3:310\n*S KotlinDebug\n*F\n+ 1 PkBarChart.kt\ncom/xiaomi/fitness/active/pk/widget/PkBarChart\n*L\n255#1:310,3\n*E\n"})
public final class PkBarChart extends View {
    public static final int ITEM_SIZE = 7;

    @NotNull
    public static final String TAG = "PkBarChart";
    private DashPathEffect dashPathEffect;
    private boolean drawEmptyChart;

    @NotNull
    private String emptyStr;

    @Nullable
    private Bitmap extraBitmap;
    private Path helpPath;
    private int lineColor;
    private Paint linePaint;
    private int normalTextColor;
    private TextPaint normalTextPaint;
    private Paint oppBarPaint;
    private int oppMainColor;
    private TextPaint oppTextPaint;
    private Paint ownBarPaint;
    private int ownMainColor;
    private TextPaint ownTextPaint;
    private long pkStartTime;

    @NotNull
    private List<PkChartDataItem> scoreList;
    private boolean showBottomScore;
    private float[] topRadiusArray;

    @JvmOverloads
    public PkBarChart(@Nullable Context context) {
        this(context, null, 0, 0, 14, null);
    }

    private final void drawAxisAndLines(Canvas canvas) {
        Paint paint;
        Paint paint2;
        Paint paint3;
        Paint paint4;
        Paint paint5;
        long timeStamp;
        String dateStr;
        float height = getHeight() - getPaddingBottom();
        float f = 2;
        float paddingTop = getPaddingTop() + ((height - getPaddingTop()) / f);
        float paddingTop2 = getPaddingTop();
        float width = getWidth() - getPaddingEnd();
        float f2 = width + 15;
        float paddingStart = getPaddingStart();
        Paint paint6 = this.linePaint;
        if (paint6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("linePaint");
            paint6 = null;
        }
        DashPathEffect dashPathEffect = this.dashPathEffect;
        if (dashPathEffect == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dashPathEffect");
            dashPathEffect = null;
        }
        paint6.setPathEffect(dashPathEffect);
        Paint paint7 = this.linePaint;
        if (paint7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("linePaint");
            paint = null;
        } else {
            paint = paint7;
        }
        canvas.drawLine(paddingStart, height, width, height, paint);
        Paint paint8 = this.linePaint;
        if (paint8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("linePaint");
            paint2 = null;
        } else {
            paint2 = paint8;
        }
        canvas.drawLine(paddingStart, paddingTop, width, paddingTop, paint2);
        Paint paint9 = this.linePaint;
        if (paint9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("linePaint");
            paint3 = null;
        } else {
            paint3 = paint9;
        }
        canvas.drawLine(paddingStart, paddingTop2, width, paddingTop2, paint3);
        TextPaint textPaint = this.normalTextPaint;
        if (textPaint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("normalTextPaint");
            textPaint = null;
        }
        float textSize = height + (textPaint.getTextSize() / f);
        TextPaint textPaint2 = this.normalTextPaint;
        if (textPaint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("normalTextPaint");
            textPaint2 = null;
        }
        float textSize2 = paddingTop + (textPaint2.getTextSize() / f);
        TextPaint textPaint3 = this.normalTextPaint;
        if (textPaint3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("normalTextPaint");
            textPaint3 = null;
        }
        float textSize3 = paddingTop2 + (textPaint3.getTextSize() / f);
        TextPaint textPaint4 = this.normalTextPaint;
        if (textPaint4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("normalTextPaint");
            textPaint4 = null;
        }
        canvas.drawText("0", f2, textSize, textPaint4);
        TextPaint textPaint5 = this.normalTextPaint;
        if (textPaint5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("normalTextPaint");
            textPaint5 = null;
        }
        canvas.drawText("350", f2, textSize2, textPaint5);
        TextPaint textPaint6 = this.normalTextPaint;
        if (textPaint6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("normalTextPaint");
            textPaint6 = null;
        }
        canvas.drawText("700", f2, textSize3, textPaint6);
        Paint paint10 = this.linePaint;
        if (paint10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("linePaint");
            paint10 = null;
        }
        paint10.setPathEffect(null);
        float height2 = getHeight() - getPaddingBottom();
        float paddingTop3 = getPaddingTop();
        Paint paint11 = this.linePaint;
        if (paint11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("linePaint");
            paint4 = null;
        } else {
            paint4 = paint11;
        }
        canvas.drawLine(paddingStart, paddingTop3, paddingStart, height2, paint4);
        Paint paint12 = this.linePaint;
        if (paint12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("linePaint");
            paint5 = null;
        } else {
            paint5 = paint12;
        }
        canvas.drawLine(width, paddingTop3, width, height2, paint5);
        int size = this.scoreList.size();
        if (this.scoreList.isEmpty()) {
            LocalDate localDateMinusDays = (this.pkStartTime > 0 ? new LocalDate(this.pkStartTime * ((long) 1000)) : LocalDate.now()).minusDays(1);
            Intrinsics.checkNotNullExpressionValue(localDateMinusDays, "minusDays(...)");
            timeStamp = TimeDateUtil.changZeroOfTheDay(localDateMinusDays);
        } else {
            timeStamp = ((PkChartDataItem) CollectionsKt___CollectionsKt.last((List) this.scoreList)).getTimeStamp();
        }
        for (int i = 0; i < 7; i++) {
            if (i < size) {
                PkChartDataItem pkChartDataItem = this.scoreList.get(i);
                dateStr = TimeDateUtil.getDateStr(pkChartDataItem.getTimeStamp(), ResourceExtKt.getString(ozi.f29845k));
                if (this.showBottomScore) {
                    int oppScore = pkChartDataItem.getOppScore();
                    drawBottomText(canvas, oppScore >= 0 ? String.valueOf(oppScore) : "--", i, 1);
                    int ownScore = pkChartDataItem.getOwnScore();
                    drawBottomText(canvas, ownScore >= 0 ? String.valueOf(ownScore) : "--", i, 2);
                }
            } else {
                dateStr = TimeDateUtil.getDateStr(TimeUnit.DAYS.toSeconds((i - size) + 1) + timeStamp, ResourceExtKt.getString(ozi.f29845k));
                if (this.showBottomScore) {
                    drawBottomText(canvas, "--", i, 1);
                    drawBottomText(canvas, "--", i, 2);
                }
                drawBottomText(canvas, dateStr, i, 0);
            }
            drawBottomText(canvas, dateStr, i, 0);
        }
    }

    private final void drawBarRect(Canvas canvas) {
        int i = 0;
        for (Object obj : this.scoreList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            drawRectItem(canvas, i, (PkChartDataItem) obj);
            i = i2;
        }
    }

    private final void drawBottomText(Canvas canvas, String str, int xIndex, int yIndex) {
        TextPaint textPaint;
        TextPaint textPaint2 = null;
        if (yIndex == 0) {
            textPaint = this.normalTextPaint;
            if (textPaint == null) {
                Intrinsics.throwUninitializedPropertyAccessException("normalTextPaint");
                textPaint = null;
            }
        } else if (yIndex == 1) {
            textPaint = this.oppTextPaint;
            if (textPaint == null) {
                Intrinsics.throwUninitializedPropertyAccessException("oppTextPaint");
                textPaint = null;
            }
        } else if (yIndex != 2) {
            textPaint = this.normalTextPaint;
            if (textPaint == null) {
                Intrinsics.throwUninitializedPropertyAccessException("normalTextPaint");
                textPaint = null;
            }
        } else {
            textPaint = this.ownTextPaint;
            if (textPaint == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ownTextPaint");
                textPaint = null;
            }
        }
        float height = getHeight() - getPaddingBottom();
        TextPaint textPaint3 = this.normalTextPaint;
        if (textPaint3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("normalTextPaint");
            textPaint3 = null;
        }
        float textSize = height + textPaint3.getTextSize() + 30;
        TextPaint textPaint4 = this.oppTextPaint;
        if (textPaint4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("oppTextPaint");
            textPaint4 = null;
        }
        float textSize2 = textPaint4.getTextSize() + textSize + 15;
        TextPaint textPaint5 = this.ownTextPaint;
        if (textPaint5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ownTextPaint");
        } else {
            textPaint2 = textPaint5;
        }
        float textSize3 = textPaint2.getTextSize() + textSize2 + 10;
        if (yIndex == 1) {
            textSize = textSize2;
        } else if (yIndex == 2) {
            textSize = textSize3;
        }
        float width = ((getWidth() - getPaddingStart()) - getPaddingEnd()) / 7.0f;
        canvas.drawText(str, ((getPaddingStart() + (xIndex * width)) + (width / 2.0f)) - (textPaint.measureText(str) / 2.0f), textSize, textPaint);
    }

    private final void drawEmptyChart(Canvas canvas) {
        Paint paint;
        float height = getHeight() - getPaddingBottom();
        float width = getWidth() - getPaddingEnd();
        float paddingStart = getPaddingStart();
        Paint paint2 = this.linePaint;
        TextPaint textPaint = null;
        if (paint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("linePaint");
            paint = null;
        } else {
            paint = paint2;
        }
        canvas.drawLine(paddingStart, height, width, height, paint);
        LocalDate localDate = this.pkStartTime > 0 ? new LocalDate(this.pkStartTime * ((long) 1000)) : LocalDate.now();
        for (int i = 0; i < 7; i++) {
            LocalDate localDatePlusDays = localDate.plusDays(i);
            Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
            drawBottomText(canvas, TimeDateUtil.getDateStr(localDatePlusDays, ResourceExtKt.getString(ozi.f29845k)), i, 0);
            if (this.showBottomScore) {
                drawBottomText(canvas, "--", i, 1);
                drawBottomText(canvas, "--", i, 2);
            }
        }
        TextPaint textPaint2 = this.normalTextPaint;
        if (textPaint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("normalTextPaint");
            textPaint2 = null;
        }
        float textSize = textPaint2.getTextSize();
        TextPaint textPaint3 = this.normalTextPaint;
        if (textPaint3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("normalTextPaint");
            textPaint3 = null;
        }
        textPaint3.setTextSize(36.0f);
        TextPaint textPaint4 = this.normalTextPaint;
        if (textPaint4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("normalTextPaint");
            textPaint4 = null;
        }
        float paddingStart2 = (getPaddingStart() + (((getWidth() - getPaddingEnd()) - getPaddingStart()) / 2.0f)) - (textPaint4.measureText(this.emptyStr) / 2.0f);
        float paddingTop = getPaddingTop() + (((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2.0f);
        TextPaint textPaint5 = this.normalTextPaint;
        if (textPaint5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("normalTextPaint");
            textPaint5 = null;
        }
        float textSize2 = paddingTop + (textPaint5.getTextSize() / 2.0f);
        String str = this.emptyStr;
        TextPaint textPaint6 = this.normalTextPaint;
        if (textPaint6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("normalTextPaint");
            textPaint6 = null;
        }
        canvas.drawText(str, paddingStart2, textSize2, textPaint6);
        TextPaint textPaint7 = this.normalTextPaint;
        if (textPaint7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("normalTextPaint");
        } else {
            textPaint = textPaint7;
        }
        textPaint.setTextSize(textSize);
    }

    private final void drawRectItem(Canvas canvas, int xIndex, PkChartDataItem pkChartDataItem) {
        Bitmap bitmap;
        Bitmap bitmap2;
        float width = ((getWidth() - getPaddingStart()) - getPaddingEnd()) / 7.0f;
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        float height2 = getHeight() - getPaddingBottom();
        float paddingStart = ((getPaddingStart() + (xIndex * width)) + (width / 2.0f)) - 3;
        float f = 20;
        float f2 = paddingStart - f;
        float f3 = f2 + f;
        int oppScore = pkChartDataItem.getOppScore();
        if (1 <= oppScore && oppScore < 701) {
            float height3 = (getHeight() - getPaddingBottom()) - ((oppScore / 700.0f) * height);
            Path path = this.helpPath;
            if (path == null) {
                Intrinsics.throwUninitializedPropertyAccessException("helpPath");
                path = null;
            }
            path.reset();
            RectF rectF = new RectF(f2, height3, f3, height2);
            Path path2 = this.helpPath;
            if (path2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("helpPath");
                path2 = null;
            }
            float[] fArr = this.topRadiusArray;
            if (fArr == null) {
                Intrinsics.throwUninitializedPropertyAccessException("topRadiusArray");
                fArr = null;
            }
            path2.addRoundRect(rectF, fArr, Path.Direction.CCW);
            Path path3 = this.helpPath;
            if (path3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("helpPath");
                path3 = null;
            }
            Paint paint = this.oppBarPaint;
            if (paint == null) {
                Intrinsics.throwUninitializedPropertyAccessException("oppBarPaint");
                paint = null;
            }
            canvas.drawPath(path3, paint);
            int oppExtraScore = pkChartDataItem.getOppExtraScore();
            if (1 <= oppExtraScore && oppExtraScore < 701 && oppExtraScore < oppScore && (bitmap2 = this.extraBitmap) != null) {
                rectF.bottom = height3 + 34;
                canvas.drawBitmap(bitmap2, (Rect) null, rectF, (Paint) null);
            }
        }
        float f4 = f3 + 6;
        float f5 = f + f4;
        int ownScore = pkChartDataItem.getOwnScore();
        if (1 > ownScore || ownScore >= 701) {
            return;
        }
        float height4 = (getHeight() - getPaddingBottom()) - ((ownScore / 700.0f) * height);
        Path path4 = this.helpPath;
        if (path4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("helpPath");
            path4 = null;
        }
        path4.reset();
        RectF rectF2 = new RectF(f4, height4, f5, height2);
        Path path5 = this.helpPath;
        if (path5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("helpPath");
            path5 = null;
        }
        float[] fArr2 = this.topRadiusArray;
        if (fArr2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topRadiusArray");
            fArr2 = null;
        }
        path5.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
        Path path6 = this.helpPath;
        if (path6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("helpPath");
            path6 = null;
        }
        Paint paint2 = this.ownBarPaint;
        if (paint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ownBarPaint");
            paint2 = null;
        }
        canvas.drawPath(path6, paint2);
        int ownExtraScore = pkChartDataItem.getOwnExtraScore();
        if (1 > ownExtraScore || ownExtraScore >= 701 || ownExtraScore >= ownScore || (bitmap = this.extraBitmap) == null) {
            return;
        }
        rectF2.bottom = height4 + 34;
        canvas.drawBitmap(bitmap, (Rect) null, rectF2, (Paint) null);
    }

    private final void initBarChartPaint() {
        this.helpPath = new Path();
        this.extraBitmap = BitmapFactory.decodeResource(getResources(), fni.j);
        this.topRadiusArray = new float[]{36.0f, 36.0f, 36.0f, 36.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        Paint paint = new Paint(1);
        this.ownBarPaint = paint;
        paint.setDither(true);
        Paint paint2 = this.ownBarPaint;
        Paint paint3 = null;
        if (paint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ownBarPaint");
            paint2 = null;
        }
        paint2.setStyle(Paint.Style.FILL);
        Paint paint4 = this.ownBarPaint;
        if (paint4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ownBarPaint");
            paint4 = null;
        }
        paint4.setColor(this.ownMainColor);
        Paint paint5 = this.ownBarPaint;
        if (paint5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ownBarPaint");
        } else {
            paint3 = paint5;
        }
        Paint paint6 = new Paint(paint3);
        this.oppBarPaint = paint6;
        paint6.setColor(this.oppMainColor);
    }

    private final void initLinePaint() {
        this.dashPathEffect = new DashPathEffect(new float[]{ExtUtilsKt.getDp(4), ExtUtilsKt.getDp(Float.valueOf(1.5f))}, 0.0f);
        Paint paint = new Paint(1);
        this.linePaint = paint;
        paint.setDither(true);
        Paint paint2 = this.linePaint;
        DashPathEffect dashPathEffect = null;
        if (paint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("linePaint");
            paint2 = null;
        }
        paint2.setStyle(Paint.Style.STROKE);
        Paint paint3 = this.linePaint;
        if (paint3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("linePaint");
            paint3 = null;
        }
        paint3.setStrokeWidth(1.0f);
        Paint paint4 = this.linePaint;
        if (paint4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("linePaint");
            paint4 = null;
        }
        paint4.setColor(this.lineColor);
        Paint paint5 = this.linePaint;
        if (paint5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("linePaint");
            paint5 = null;
        }
        DashPathEffect dashPathEffect2 = this.dashPathEffect;
        if (dashPathEffect2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dashPathEffect");
        } else {
            dashPathEffect = dashPathEffect2;
        }
        paint5.setPathEffect(dashPathEffect);
    }

    private final void initStyledAttributes(AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, f4j.K2);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.normalTextColor = typedArrayObtainStyledAttributes.getColor(f4j.M2, this.normalTextColor);
        this.ownMainColor = typedArrayObtainStyledAttributes.getColor(f4j.O2, this.ownMainColor);
        this.oppMainColor = typedArrayObtainStyledAttributes.getColor(f4j.N2, this.oppMainColor);
        this.lineColor = typedArrayObtainStyledAttributes.getColor(f4j.L2, this.lineColor);
        this.showBottomScore = typedArrayObtainStyledAttributes.getBoolean(f4j.P2, false);
        String string = typedArrayObtainStyledAttributes.getString(f4j.Q2);
        if (string == null) {
            string = this.emptyStr;
        }
        this.emptyStr = string;
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void initTextPaint() {
        TextPaint textPaint = new TextPaint(1);
        this.normalTextPaint = textPaint;
        textPaint.setDither(true);
        TextPaint textPaint2 = this.normalTextPaint;
        TextPaint textPaint3 = null;
        if (textPaint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("normalTextPaint");
            textPaint2 = null;
        }
        textPaint2.setTypeface(Typeface.create("mipro-regular", 0));
        TextPaint textPaint4 = this.normalTextPaint;
        if (textPaint4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("normalTextPaint");
            textPaint4 = null;
        }
        textPaint4.setTextSize(ExtUtilsKt.getDp(10));
        TextPaint textPaint5 = this.normalTextPaint;
        if (textPaint5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("normalTextPaint");
            textPaint5 = null;
        }
        textPaint5.setColor(this.normalTextColor);
        TextPaint textPaint6 = this.normalTextPaint;
        if (textPaint6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("normalTextPaint");
            textPaint6 = null;
        }
        TextPaint textPaint7 = new TextPaint(textPaint6);
        this.ownTextPaint = textPaint7;
        textPaint7.setTypeface(DisplayUtil.getTypefaceAsResourceId(getContext(), jpi.f23005a));
        TextPaint textPaint8 = this.ownTextPaint;
        if (textPaint8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ownTextPaint");
            textPaint8 = null;
        }
        textPaint8.setColor(this.ownMainColor);
        TextPaint textPaint9 = this.normalTextPaint;
        if (textPaint9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("normalTextPaint");
            textPaint9 = null;
        }
        TextPaint textPaint10 = new TextPaint(textPaint9);
        this.oppTextPaint = textPaint10;
        textPaint10.setTypeface(DisplayUtil.getTypefaceAsResourceId(getContext(), jpi.f23006b));
        TextPaint textPaint11 = this.oppTextPaint;
        if (textPaint11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("oppTextPaint");
        } else {
            textPaint3 = textPaint11;
        }
        textPaint3.setColor(this.oppMainColor);
    }

    public static /* synthetic */ void updateScoreList$default(PkBarChart pkBarChart, List list, boolean z, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        pkBarChart.updateScoreList(list, z, j);
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (ArrayUtils.isEmpty(this.scoreList) && this.drawEmptyChart) {
            drawEmptyChart(canvas);
        } else {
            drawAxisAndLines(canvas);
            drawBarRect(canvas);
        }
    }

    public final void updateScoreList(@NotNull List<PkChartDataItem> list, boolean emptyStatusChart, long pkStart) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.drawEmptyChart = emptyStatusChart;
        this.scoreList = list;
        this.pkStartTime = pkStart;
        invalidate();
    }

    @JvmOverloads
    public PkBarChart(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @JvmOverloads
    public PkBarChart(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public /* synthetic */ PkBarChart(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    @JvmOverloads
    public PkBarChart(@Nullable Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.normalTextColor = ViewExtKt.getColor(this, zii.e);
        this.ownMainColor = ViewExtKt.getColor(this, zii.i);
        this.oppMainColor = ViewExtKt.getColor(this, zii.h);
        this.lineColor = ViewExtKt.getColor(this, zii.d);
        this.emptyStr = ResourceExtKt.getString(ozi.f);
        List<PkChartDataItem> listEmptyList = Collections.emptyList();
        Intrinsics.checkNotNullExpressionValue(listEmptyList, "emptyList(...)");
        this.scoreList = listEmptyList;
        this.drawEmptyChart = true;
        initStyledAttributes(attributeSet);
        initTextPaint();
        initBarChartPaint();
        initLinePaint();
    }
}
