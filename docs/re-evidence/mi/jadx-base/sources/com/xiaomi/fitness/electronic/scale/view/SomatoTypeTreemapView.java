package com.xiaomi.fitness.electronic.scale.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.electronic.scale.util.WeightParamUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.user.info.export.medicalid.Gender;
import defpackage.eji;
import defpackage.kpi;
import defpackage.l4j;
import defpackage.oxi;
import defpackage.zzi;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 D2\u00020\u0001:\u0001DB3\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010+\u001a\u00020,H\u0002J\u0010\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020/H\u0014J\u0010\u00100\u001a\u00020,2\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u00101\u001a\u00020,2\u0006\u0010.\u001a\u00020/H\u0002J\b\u00102\u001a\u000203H\u0002J\u0010\u00104\u001a\u00020,2\u0006\u0010.\u001a\u00020/H\u0002J0\u00107\u001a\u00020,2\u0006\u0010.\u001a\u00020/2\u0006\u00108\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u001f2\u0006\u0010:\u001a\u00020\u001b2\u0006\u0010;\u001a\u00020\u001bH\u0002J\b\u0010<\u001a\u00020,H\u0002J\b\u0010=\u001a\u00020,H\u0002J\b\u0010>\u001a\u00020,H\u0002J\u0012\u0010?\u001a\u00020,2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J!\u0010@\u001a\u00020,2\n\b\u0001\u0010A\u001a\u0004\u0018\u00010\u00072\b\u0010B\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010CR\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R \u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0019X\u0082\u000e¢\u0006\u0002\n\u0000RD\u0010\u001c\u001a6\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0\u001e0\u0019j\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0\u001e`\u001dX\u0082.¢\u0006\u0004\n\u0002\u0010 R\u001a\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0\u001eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006E"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/view/SomatoTypeTreemapView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "mGender", "mSomatoType", "mapTitleTextPaint", "Landroid/text/TextPaint;", "defaultTitleTextPaint", "highlightTitleTextPaint", "axisCategoryTextPaint", "axisIndicatorTextPaint", "axisLinePaint", "Landroid/graphics/Paint;", "defaultItemPaint", "positiveItemPaint", "negativeItemPaint", "vertexCoMap", "Ljava/util/HashMap;", "", "", "xAxisIndicatorStrMap", "Lkotlin/collections/HashMap;", "Lkotlin/Pair;", "", "Ljava/util/HashMap;", "yAxisIndicatorStrMap", "mapTitleTextColor", "defaultSomatotypeTitleTextColor", "highlightSomatotypeTitleTextColor", "axisCategoryTextColor", "axisIndicatorTextColor", "axisLineColor", "defaultItemColor", "positiveHighlightItemColor", "negativeHighlightItemColor", "initVertexListMap", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "drawAxisLinesAndAxisText", "drawMapTitle", "isPositiveSomatoType", "", "drawItemAndItemTitles", "textBounds", "Landroid/graphics/Rect;", "drawTextCentered", "paint", "text", "midX", "midY", "initTreemapItemPaint", "initLinePaint", "initTextPaint", "initStyledAttributes", "updateGenderAndSomatoType", "genderInt", "somatotype", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSomatoTypeTreemapView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SomatoTypeTreemapView.kt\ncom/xiaomi/fitness/electronic/scale/view/SomatoTypeTreemapView\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,486:1\n216#2,2:487\n*S KotlinDebug\n*F\n+ 1 SomatoTypeTreemapView.kt\ncom/xiaomi/fitness/electronic/scale/view/SomatoTypeTreemapView\n*L\n283#1:487,2\n*E\n"})
public final class SomatoTypeTreemapView extends View {
    public static final float SQUARE_PIXEL_VALUE = 815.0f;

    @NotNull
    public static final String TAG = "SomatoTypeTreemapView";
    private int axisCategoryTextColor;
    private TextPaint axisCategoryTextPaint;
    private int axisIndicatorTextColor;
    private TextPaint axisIndicatorTextPaint;
    private int axisLineColor;
    private Paint axisLinePaint;
    private int defaultItemColor;
    private Paint defaultItemPaint;
    private int defaultSomatotypeTitleTextColor;
    private TextPaint defaultTitleTextPaint;
    private int highlightSomatotypeTitleTextColor;
    private TextPaint highlightTitleTextPaint;
    private int mGender;
    private int mSomatoType;
    private int mapTitleTextColor;
    private TextPaint mapTitleTextPaint;
    private int negativeHighlightItemColor;
    private Paint negativeItemPaint;
    private int positiveHighlightItemColor;
    private Paint positiveItemPaint;

    @NotNull
    private final Rect textBounds;

    @NotNull
    private HashMap<Integer, List<Float>> vertexCoMap;
    private HashMap<Integer, Pair<String, String>> xAxisIndicatorStrMap;
    private Pair<String, String> yAxisIndicatorStrMap;

    @JvmOverloads
    public SomatoTypeTreemapView(@Nullable Context context) {
        this(context, null, 0, 0, 14, null);
    }

    private final void drawAxisLinesAndAxisText(Canvas canvas) {
        Paint paint;
        Paint paint2;
        Paint paint3;
        Paint paint4;
        TextPaint textPaint;
        TextPaint textPaint2;
        float paddingStart = getPaddingStart();
        float paddingStart2 = getPaddingStart() + 815.0f;
        float paddingTop = getPaddingTop();
        float paddingTop2 = getPaddingTop() + 815.0f;
        float paddingStart3 = getPaddingStart() + 20.0f;
        float paddingTop3 = getPaddingTop() + 10.0f;
        float paddingStart4 = getPaddingStart() + 805.0f;
        float paddingTop4 = getPaddingTop() + 795.0f;
        Paint paint5 = this.axisLinePaint;
        if (paint5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("axisLinePaint");
            paint = null;
        } else {
            paint = paint5;
        }
        canvas.drawLine(paddingStart, paddingTop2, paddingStart2, paddingTop2, paint);
        Paint paint6 = this.axisLinePaint;
        if (paint6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("axisLinePaint");
            paint2 = null;
        } else {
            paint2 = paint6;
        }
        canvas.drawLine(paddingStart, paddingTop, paddingStart3, paddingTop3, paint2);
        Paint paint7 = this.axisLinePaint;
        if (paint7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("axisLinePaint");
            paint3 = null;
        } else {
            paint3 = paint7;
        }
        canvas.drawLine(paddingStart, paddingTop2, paddingStart, paddingTop, paint3);
        Paint paint8 = this.axisLinePaint;
        if (paint8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("axisLinePaint");
            paint4 = null;
        } else {
            paint4 = paint8;
        }
        canvas.drawLine(paddingStart2, paddingTop2, paddingStart4, paddingTop4, paint4);
        float paddingStart5 = getPaddingStart() + 0.0f;
        float f = 51.0f + paddingTop2;
        String string = ResourceExtKt.getString(zzi.B1);
        TextPaint textPaint3 = this.axisCategoryTextPaint;
        if (textPaint3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("axisCategoryTextPaint");
            textPaint3 = null;
        }
        canvas.drawText(string, paddingStart5, f, textPaint3);
        float paddingStart6 = getPaddingStart() - 18.0f;
        TextPaint textPaint4 = this.axisCategoryTextPaint;
        if (textPaint4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("axisCategoryTextPaint");
            textPaint4 = null;
        }
        float fMeasureText = textPaint4.measureText(ResourceExtKt.getString(zzi.s1));
        String string2 = ResourceExtKt.getString(zzi.s1);
        float f2 = paddingStart6 - fMeasureText;
        TextPaint textPaint5 = this.axisCategoryTextPaint;
        if (textPaint5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("axisCategoryTextPaint");
            textPaint5 = null;
        }
        canvas.drawText(string2, f2, paddingTop2, textPaint5);
        float paddingStart7 = getPaddingStart() + 292.0f;
        float f3 = paddingTop2 + 41.0f;
        TextPaint textPaint6 = this.axisIndicatorTextPaint;
        if (textPaint6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("axisIndicatorTextPaint");
            textPaint = null;
        } else {
            textPaint = textPaint6;
        }
        HashMap<Integer, Pair<String, String>> map = this.xAxisIndicatorStrMap;
        if (map == null) {
            Intrinsics.throwUninitializedPropertyAccessException("xAxisIndicatorStrMap");
            map = null;
        }
        Pair<String, String> pair = map.get(Integer.valueOf(this.mGender));
        Intrinsics.checkNotNull(pair);
        drawTextCentered(canvas, textPaint, pair.getFirst(), paddingStart7, f3);
        float paddingStart8 = getPaddingStart() + 572.0f;
        TextPaint textPaint7 = this.axisIndicatorTextPaint;
        if (textPaint7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("axisIndicatorTextPaint");
            textPaint2 = null;
        } else {
            textPaint2 = textPaint7;
        }
        HashMap<Integer, Pair<String, String>> map2 = this.xAxisIndicatorStrMap;
        if (map2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("xAxisIndicatorStrMap");
            map2 = null;
        }
        Pair<String, String> pair2 = map2.get(Integer.valueOf(this.mGender));
        Intrinsics.checkNotNull(pair2);
        drawTextCentered(canvas, textPaint2, pair2.getSecond(), paddingStart8, f3);
        float paddingStart9 = getPaddingStart() - 18.0f;
        float paddingTop5 = getPaddingTop() + 649.0f;
        TextPaint textPaint8 = this.axisIndicatorTextPaint;
        if (textPaint8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("axisIndicatorTextPaint");
            textPaint8 = null;
        }
        Pair<String, String> pair3 = this.yAxisIndicatorStrMap;
        if (pair3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("yAxisIndicatorStrMap");
            pair3 = null;
        }
        float fMeasureText2 = textPaint8.measureText(pair3.getFirst());
        Pair<String, String> pair4 = this.yAxisIndicatorStrMap;
        if (pair4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("yAxisIndicatorStrMap");
            pair4 = null;
        }
        String first = pair4.getFirst();
        float f4 = paddingStart9 - fMeasureText2;
        TextPaint textPaint9 = this.axisIndicatorTextPaint;
        if (textPaint9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("axisIndicatorTextPaint");
            textPaint9 = null;
        }
        canvas.drawText(first, f4, paddingTop5, textPaint9);
        float paddingStart10 = getPaddingStart() - 18.0f;
        float paddingTop6 = getPaddingTop() + 311.0f;
        TextPaint textPaint10 = this.axisIndicatorTextPaint;
        if (textPaint10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("axisIndicatorTextPaint");
            textPaint10 = null;
        }
        Pair<String, String> pair5 = this.yAxisIndicatorStrMap;
        if (pair5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("yAxisIndicatorStrMap");
            pair5 = null;
        }
        float fMeasureText3 = textPaint10.measureText(pair5.getSecond());
        Pair<String, String> pair6 = this.yAxisIndicatorStrMap;
        if (pair6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("yAxisIndicatorStrMap");
            pair6 = null;
        }
        String second = pair6.getSecond();
        float f5 = paddingStart10 - fMeasureText3;
        TextPaint textPaint11 = this.axisIndicatorTextPaint;
        if (textPaint11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("axisIndicatorTextPaint");
            textPaint11 = null;
        }
        canvas.drawText(second, f5, paddingTop6, textPaint11);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015 A[PHI: r0
      0x0015: PHI (r0v3 android.graphics.Paint) = (r0v1 android.graphics.Paint), (r0v30 android.graphics.Paint) binds: [B:10:0x0019, B:5:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    private final void drawItemAndItemTitles(Canvas canvas) {
        Paint paint;
        String str;
        Paint paint2;
        Paint paint3;
        TextPaint textPaint;
        if (isPositiveSomatoType()) {
            paint = this.positiveItemPaint;
            if (paint == null) {
                str = "positiveItemPaint";
                Intrinsics.throwUninitializedPropertyAccessException(str);
                paint2 = null;
            } else {
                paint2 = paint;
            }
        } else {
            paint = this.negativeItemPaint;
            if (paint == null) {
                str = "negativeItemPaint";
                Intrinsics.throwUninitializedPropertyAccessException(str);
                paint2 = null;
            } else {
                paint2 = paint;
            }
        }
        Logger.d("SomatoTypeTreemapView", "isPositiveSomatoType=" + isPositiveSomatoType());
        for (Map.Entry<Integer, List<Float>> entry : this.vertexCoMap.entrySet()) {
            if (entry.getKey().intValue() == this.mSomatoType) {
                paint3 = paint2;
            } else {
                paint3 = this.defaultItemPaint;
                if (paint3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("defaultItemPaint");
                    paint3 = null;
                }
            }
            if (entry.getKey().intValue() == this.mSomatoType) {
                textPaint = this.highlightTitleTextPaint;
                if (textPaint == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("highlightTitleTextPaint");
                    textPaint = null;
                }
            } else {
                textPaint = this.defaultTitleTextPaint;
                if (textPaint == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("defaultTitleTextPaint");
                    textPaint = null;
                }
            }
            String somatotypeName = WeightParamUtil.INSTANCE.getSomatotypeName(entry.getKey());
            if (entry.getValue().size() == 4) {
                RectF rectF = new RectF(entry.getValue().get(0).floatValue(), entry.getValue().get(1).floatValue(), entry.getValue().get(2).floatValue(), entry.getValue().get(3).floatValue());
                canvas.drawRect(rectF, paint3);
                Logger.d("SomatoTypeTreemapView", "drawAxisLinesAndAxisText drawRect rectF=" + rectF);
                if (entry.getKey().intValue() == 0 || entry.getKey().intValue() == -3) {
                    float f = 2;
                    drawTextCentered(canvas, textPaint, somatotypeName, (entry.getValue().get(0).floatValue() + entry.getValue().get(2).floatValue()) / f, (entry.getValue().get(1).floatValue() + entry.getValue().get(3).floatValue()) / f);
                } else {
                    float f2 = 2;
                    drawTextCentered(canvas, textPaint, somatotypeName, (entry.getValue().get(0).floatValue() + entry.getValue().get(2).floatValue()) / f2, (entry.getValue().get(1).floatValue() + entry.getValue().get(3).floatValue()) / f2);
                }
            } else {
                Path path = new Path();
                path.moveTo(entry.getValue().get(0).floatValue(), entry.getValue().get(1).floatValue());
                path.lineTo(entry.getValue().get(2).floatValue(), entry.getValue().get(3).floatValue());
                path.lineTo(entry.getValue().get(4).floatValue(), entry.getValue().get(5).floatValue());
                path.lineTo(entry.getValue().get(6).floatValue(), entry.getValue().get(7).floatValue());
                path.lineTo(entry.getValue().get(8).floatValue(), entry.getValue().get(9).floatValue());
                path.lineTo(entry.getValue().get(10).floatValue(), entry.getValue().get(11).floatValue());
                path.lineTo(entry.getValue().get(0).floatValue(), entry.getValue().get(1).floatValue());
                path.close();
                canvas.drawPath(path, paint3);
                Logger.d("SomatoTypeTreemapView", "drawAxisLinesAndAxisText drawPath path=" + path);
                float f3 = (float) 2;
                drawTextCentered(canvas, textPaint, somatotypeName, (entry.getValue().get(2).floatValue() + entry.getValue().get(10).floatValue()) / f3, (entry.getValue().get(3).floatValue() + entry.getValue().get(11).floatValue()) / f3);
            }
        }
    }

    private final void drawMapTitle(Canvas canvas) {
        float paddingTop = getPaddingTop() + 927.0f;
        TextPaint textPaint = this.mapTitleTextPaint;
        if (textPaint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapTitleTextPaint");
            textPaint = null;
        }
        drawTextCentered(canvas, textPaint, ResourceExtKt.getString(zzi.f2), canvas.getWidth() / 2.0f, paddingTop);
    }

    private final void drawTextCentered(Canvas canvas, TextPaint paint, String text, float midX, float midY) {
        paint.getTextBounds(text, 0, text.length(), this.textBounds);
        canvas.drawText(text, midX - this.textBounds.exactCenterX(), midY - this.textBounds.exactCenterY(), paint);
    }

    private final void initLinePaint() {
        Paint paint = new Paint(1);
        paint.setDither(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4.0f);
        paint.setColor(this.axisLineColor);
        this.axisLinePaint = paint;
    }

    private final void initStyledAttributes(AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, l4j.X0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.defaultSomatotypeTitleTextColor = typedArrayObtainStyledAttributes.getColor(l4j.c1, this.defaultSomatotypeTitleTextColor);
        this.highlightSomatotypeTitleTextColor = typedArrayObtainStyledAttributes.getColor(l4j.d1, this.highlightSomatotypeTitleTextColor);
        this.axisCategoryTextColor = typedArrayObtainStyledAttributes.getColor(l4j.Y0, this.axisCategoryTextColor);
        this.axisIndicatorTextColor = typedArrayObtainStyledAttributes.getColor(l4j.Z0, this.axisIndicatorTextColor);
        this.axisLineColor = typedArrayObtainStyledAttributes.getColor(l4j.a1, this.axisLineColor);
        this.mapTitleTextColor = typedArrayObtainStyledAttributes.getColor(l4j.e1, this.mapTitleTextColor);
        this.defaultItemColor = typedArrayObtainStyledAttributes.getColor(l4j.b1, this.defaultItemColor);
        this.positiveHighlightItemColor = typedArrayObtainStyledAttributes.getColor(l4j.g1, this.positiveHighlightItemColor);
        this.negativeHighlightItemColor = typedArrayObtainStyledAttributes.getColor(l4j.f1, this.negativeHighlightItemColor);
        typedArrayObtainStyledAttributes.recycle();
        String quantityString = getContext().getResources().getQuantityString(oxi.f29789b, 18, 18);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        String quantityString2 = getContext().getResources().getQuantityString(oxi.f29789b, 28, 28);
        Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
        String quantityString3 = getContext().getResources().getQuantityString(oxi.f29789b, 10, 10);
        Intrinsics.checkNotNullExpressionValue(quantityString3, "getQuantityString(...)");
        String quantityString4 = getContext().getResources().getQuantityString(oxi.f29789b, 20, 20);
        Intrinsics.checkNotNullExpressionValue(quantityString4, "getQuantityString(...)");
        String strValueOf = String.valueOf(18.5f);
        String strValueOf2 = String.valueOf(24.0f);
        this.xAxisIndicatorStrMap = MapsKt__MapsKt.hashMapOf(TuplesKt.to(2, new Pair(quantityString, quantityString2)), TuplesKt.to(1, new Pair(quantityString3, quantityString4)));
        this.yAxisIndicatorStrMap = new Pair<>(strValueOf, strValueOf2);
    }

    private final void initTextPaint() {
        TextPaint textPaint = new TextPaint(1);
        textPaint.setDither(true);
        textPaint.setTypeface(Typeface.create("mipro-regular", 0));
        Float fValueOf = Float.valueOf(12.0f);
        textPaint.setTextSize(ExtUtilsKt.getSp(fValueOf));
        textPaint.setColor(this.defaultSomatotypeTitleTextColor);
        this.defaultTitleTextPaint = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setDither(true);
        textPaint2.setTypeface(Typeface.create("mipro-regular", 0));
        textPaint2.setTextSize(ExtUtilsKt.getSp(fValueOf));
        textPaint2.setColor(this.highlightSomatotypeTitleTextColor);
        this.highlightTitleTextPaint = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        textPaint3.setDither(true);
        textPaint3.setTypeface(Typeface.create("mipro-regular", 0));
        textPaint3.setTextSize(ExtUtilsKt.getSp(Float.valueOf(11.3f)));
        textPaint3.setColor(this.axisCategoryTextColor);
        this.axisCategoryTextPaint = textPaint3;
        TextPaint textPaint4 = new TextPaint(1);
        textPaint4.setDither(true);
        textPaint4.setTypeface(DisplayUtil.getTypefaceAsResourceId(getContext(), kpi.f24142b));
        textPaint4.setTextSize(ExtUtilsKt.getSp(Float.valueOf(10.0f)));
        textPaint4.setColor(this.axisIndicatorTextColor);
        this.axisIndicatorTextPaint = textPaint4;
        TextPaint textPaint5 = new TextPaint(1);
        textPaint5.setDither(true);
        textPaint5.setTypeface(Typeface.create("mipro-regular", 0));
        textPaint5.setTextSize(ExtUtilsKt.getSp(fValueOf));
        textPaint5.setColor(this.mapTitleTextColor);
        this.mapTitleTextPaint = textPaint5;
    }

    private final void initTreemapItemPaint() {
        Paint paint = new Paint(1);
        paint.setDither(true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(this.defaultItemColor);
        this.defaultItemPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setDither(true);
        paint2.setStyle(style);
        paint2.setColor(this.positiveHighlightItemColor);
        this.positiveItemPaint = paint2;
        Paint paint3 = new Paint(1);
        paint3.setDither(true);
        paint3.setStyle(style);
        paint3.setColor(this.negativeHighlightItemColor);
        this.negativeItemPaint = paint3;
    }

    private final void initVertexListMap() {
        this.vertexCoMap.put(3, CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(getPaddingStart() + 17.0f), Float.valueOf(getPaddingTop() + 30.0f), Float.valueOf(getPaddingStart() + 423.0f), Float.valueOf(getPaddingTop() + 307.0f)}));
        this.vertexCoMap.put(1, CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(getPaddingStart() + 17.0f), Float.valueOf(getPaddingTop() + 314.0f), Float.valueOf(getPaddingStart() + 423.0f), Float.valueOf(getPaddingTop() + 474.0f)}));
        this.vertexCoMap.put(-2, CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(getPaddingStart() + 17.0f), Float.valueOf(getPaddingTop() + 480.0f), Float.valueOf(getPaddingStart() + 290.0f), Float.valueOf(getPaddingTop() + 640.0f)}));
        this.vertexCoMap.put(-1, CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(getPaddingStart() + 295.0f), Float.valueOf(getPaddingTop() + 480.0f), Float.valueOf(getPaddingStart() + 423.0f), Float.valueOf(getPaddingTop() + 640.0f)}));
        this.vertexCoMap.put(-5, CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(getPaddingStart() + 17.0f), Float.valueOf(getPaddingTop() + 646.0f), Float.valueOf(getPaddingStart() + 290.0f), Float.valueOf(getPaddingTop() + 798.0f)}));
        this.vertexCoMap.put(-4, CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(getPaddingStart() + 295.0f), Float.valueOf(getPaddingTop() + 646.0f), Float.valueOf(getPaddingStart() + 569.0f), Float.valueOf(getPaddingTop() + 798.0f)}));
        this.vertexCoMap.put(0, CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(getPaddingStart() + 429.0f), Float.valueOf(getPaddingTop() + 314.0f), Float.valueOf(getPaddingStart() + 569.0f), Float.valueOf(getPaddingTop() + 640.0f)}));
        this.vertexCoMap.put(-3, CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(getPaddingStart() + 575.0f), Float.valueOf(getPaddingTop() + 480.0f), Float.valueOf(getPaddingStart() + 788.0f), Float.valueOf(getPaddingTop() + 798.0f)}));
        this.vertexCoMap.put(2, CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(getPaddingStart() + 429.0f), Float.valueOf(getPaddingTop() + 174.5f), Float.valueOf(getPaddingStart() + 676.0f), Float.valueOf(getPaddingTop() + 174.5f), Float.valueOf(getPaddingStart() + 676.0f), Float.valueOf(getPaddingTop() + 474.0f), Float.valueOf(getPaddingStart() + 575.0f), Float.valueOf(getPaddingTop() + 474.0f), Float.valueOf(getPaddingStart() + 575.0f), Float.valueOf(getPaddingTop() + 308.0f), Float.valueOf(getPaddingStart() + 429.0f), Float.valueOf(getPaddingTop() + 307.0f)}));
        this.vertexCoMap.put(4, CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(getPaddingStart() + 429.0f), Float.valueOf(getPaddingTop() + 30.0f), Float.valueOf(getPaddingStart() + 788.0f), Float.valueOf(getPaddingTop() + 30.0f), Float.valueOf(getPaddingStart() + 788.0f), Float.valueOf(getPaddingTop() + 474.0f), Float.valueOf(getPaddingStart() + 682.0f), Float.valueOf(getPaddingTop() + 474.0f), Float.valueOf(getPaddingStart() + 682.0f), Float.valueOf(getPaddingTop() + 168.5f), Float.valueOf(getPaddingStart() + 429.0f), Float.valueOf(getPaddingTop() + 168.5f)}));
    }

    private final boolean isPositiveSomatoType() {
        int i = this.mSomatoType;
        return i == 3 || i == 1 || i == -2 || i == -1 || i == 0;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        drawAxisLinesAndAxisText(canvas);
        drawItemAndItemTitles(canvas);
        drawMapTitle(canvas);
    }

    public final void updateGenderAndSomatoType(@Gender @Nullable Integer genderInt, @Nullable Integer somatotype) {
        if (genderInt == null || genderInt.intValue() == 0 || somatotype == null) {
            ViewExtKt.gone(this);
            return;
        }
        if (somatotype.intValue() < -5 || somatotype.intValue() > 4) {
            ViewExtKt.gone(this);
            return;
        }
        ViewExtKt.visible(this);
        this.mGender = genderInt.intValue();
        this.mSomatoType = somatotype.intValue();
        invalidate();
    }

    @JvmOverloads
    public SomatoTypeTreemapView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @JvmOverloads
    public SomatoTypeTreemapView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public /* synthetic */ SomatoTypeTreemapView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    @JvmOverloads
    public SomatoTypeTreemapView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mGender = 2;
        this.vertexCoMap = new HashMap<>();
        this.mapTitleTextColor = ViewExtKt.getColor(this, eji.f16710k);
        this.defaultSomatotypeTitleTextColor = ViewExtKt.getColor(this, eji.f);
        this.highlightSomatotypeTitleTextColor = ViewExtKt.getColor(this, eji.g);
        this.axisCategoryTextColor = ViewExtKt.getColor(this, eji.c);
        this.axisIndicatorTextColor = ViewExtKt.getColor(this, eji.d);
        this.axisLineColor = ViewExtKt.getColor(this, eji.e);
        this.defaultItemColor = ViewExtKt.getColor(this, eji.h);
        this.positiveHighlightItemColor = ViewExtKt.getColor(this, eji.j);
        this.negativeHighlightItemColor = ViewExtKt.getColor(this, eji.i);
        initVertexListMap();
        initStyledAttributes(attributeSet);
        initTextPaint();
        initLinePaint();
        initTreemapItemPaint();
        this.textBounds = new Rect();
    }
}
