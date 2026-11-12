package com.xiaomi.hm.health.healthdata.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.hmwatchmanager.R;
import com.loc.z;
import com.xiaomi.hm.health.Constant;
import com.xiaomi.hm.health.ui.pai.exutil.ViewExKt;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010Z\u001a\u00020Y\u0012\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010[\u0012\b\b\u0002\u0010]\u001a\u00020\u0002¢\u0006\u0004\b^\u0010_J0\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J0\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\u0014\u0010\u0011\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\u0014\u0010\u0012\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0004H\u0002J\u0014\u0010\u0014\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0002H\u0002J\u0014\u0010\u0015\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0004H\u0002J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0002H\u0014J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014J\u0018\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0014J0\u0010#\u001a\u00020\n2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u001eJ\u0014\u0010$\u001a\u00020\n2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001eJ\u0014\u0010%\u001a\u00020\n2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001eJ\u0014\u0010&\u001a\u00020\n2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u001eJ,\u0010+\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u00042\u001c\u0010*\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n0(j\u0002`)R\u0016\u0010-\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010,R\u0016\u0010.\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010,R\u0016\u0010/\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010,R\u001c\u00102\u001a\b\u0012\u0004\u0012\u00020\u0002008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00101R\u001c\u00103\u001a\b\u0012\u0004\u0012\u00020 008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00101R\u001c\u00104\u001a\b\u0012\u0004\u0012\u00020 008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00101R\u0016\u00105\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010,R\u0016\u00107\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00106R\u0016\u00109\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00106R\u0016\u0010;\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00106R\u0016\u0010'\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00106R\u0016\u0010>\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010,R\u0016\u0010@\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u00106R\u0016\u0010B\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u00106R\u0016\u0010D\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u00106R0\u0010*\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n\u0018\u00010(j\u0004\u0018\u0001`)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010ER\u0016\u0010H\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010J\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010GR\u0016\u0010L\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010GR\u0016\u0010N\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010GR\u0016\u0010P\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010GR\u0016\u0010R\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010GR\u0016\u0010T\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010,R\u001e\u0010X\u001a\n U*\u0004\u0018\u00010 0 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006`"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/view/ColoredProgressBar;", "Landroid/view/View;", "", "index", "", "segmentLeft", "segmentRight", "textTop", "Landroid/graphics/Canvas;", "canvas", "", GoogleApiAvailabilityLight.a, "textBottom", "c", "thumbY", "e", Constant.PAI_KEY_DAILY_PAI, "b", "a", "sp", "h", "g", "Landroid/graphics/Paint;", b.r, "f", "getSuggestedMinimumHeight", "onDraw", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "", "colorList", "", "segmentTextList", "gapTextList", "setValues", "setColors", "setSegmentTexts", "setGapTexts", "progress", "Lkotlin/Function2;", "Lcom/xiaomi/hm/health/healthdata/ui/view/OnValueChange;", "onValueChange", "setProgress", LogUtil.I, "PROGRESS_COLOR_POSITION_OUTER", "PROGRESS_COLOR_POSITION_INNER", "mProgressColorPosition", "", "Ljava/util/List;", "colors", "segmentTexts", "gapTexts", "gapSize", "F", "thumbRadius", "i", "thumbBorderWidth", z.j, "barHeight", hl.k, "l", "thumbIndex", "m", "thumbX", GoogleApiAvailabilityLight.b, "indicatorHeight", "o", "startX", "Lkotlin/jvm/functions/Function2;", DTransferConstants.SEARCH_KEY, "Landroid/graphics/Paint;", "segmentPaint", "r", "thumbPaint", SOAP.XMLNS, "whitePaint", "t", "textPaint", "u", "indicatorCirclePaint", "v", "indicatorTextPaint", "w", "normalTextColor", "kotlin.jvm.PlatformType", "x", "Ljava/lang/String;", "currentLang", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ColoredProgressBar extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int PROGRESS_COLOR_POSITION_OUTER;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int PROGRESS_COLOR_POSITION_INNER;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int mProgressColorPosition;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final List<Integer> colors;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final List<String> segmentTexts;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final List<String> gapTexts;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int gapSize;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private float thumbRadius;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private float thumbBorderWidth;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private float barHeight;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private float progress;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int thumbIndex;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private float thumbX;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private float indicatorHeight;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private float startX;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    private Function2<? super Integer, ? super String, Unit> onValueChange;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private Paint segmentPaint;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final Paint thumbPaint;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final Paint whitePaint;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    private final Paint textPaint;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    private final Paint indicatorCirclePaint;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    private final Paint indicatorTextPaint;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final int normalTextColor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final String currentLang;

    @JvmOverloads
    public ColoredProgressBar(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public ColoredProgressBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ColoredProgressBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final float a(View view, float f) {
        return TypedValue.applyDimension(1, f, view.getContext().getResources().getDisplayMetrics());
    }

    private final int b(View view, int i) {
        return (int) TypedValue.applyDimension(1, i, view.getContext().getResources().getDisplayMetrics());
    }

    private final void c(int index, float segmentLeft, float segmentRight, float textBottom, Canvas canvas) {
        String str = (String) CollectionsKt.getOrNull(this.gapTexts, index);
        if (str == null) {
            return;
        }
        boolean z = getLayoutDirection() == 1;
        float fMeasureText = this.textPaint.measureText(str);
        float f = z ? segmentLeft - (fMeasureText / 2) : segmentRight - (fMeasureText / 2);
        this.textPaint.setColor(this.normalTextColor);
        canvas.drawText(str, f, textBottom + ViewExKt.getStrHeight(this.textPaint, str), this.textPaint);
    }

    private final void d(int index, float segmentLeft, float segmentRight, float textTop, Canvas canvas) {
        float width;
        float f;
        float width2;
        float f2;
        float f3;
        String str = (String) CollectionsKt.getOrNull(this.segmentTexts, index);
        if (str == null) {
            return;
        }
        Rect rect = new Rect();
        if (Intrinsics.areEqual(this.currentLang, Locale.CHINESE.getLanguage())) {
            this.textPaint.getTextBounds(str, 0, str.length(), rect);
            int iWidth = rect.width();
            int iHeight = rect.height();
            float f4 = segmentLeft + (((segmentRight - segmentLeft) - iWidth) / 2);
            int i = this.thumbIndex;
            this.textPaint.setColor((index != i || this.progress <= 0.0f) ? this.normalTextColor : this.colors.get(i).intValue());
            canvas.drawText(str, f4, textTop + iHeight + b(this, 10), this.textPaint);
            return;
        }
        boolean z = getLayoutDirection() == 1;
        this.startX = z ? getWidth() - getPaddingStart() : getPaddingStart();
        this.indicatorCirclePaint.setColor(this.colors.get(index).intValue());
        int iB = b(this, 10);
        int iB2 = b(this, 18);
        int i2 = (index / 2) + 1;
        if (index % 2 == 1) {
            if (z) {
                width2 = getWidth() / 2;
                f2 = this.indicatorHeight;
                f3 = width2 - (f2 / 2);
            } else {
                width = getWidth() / 2;
                f = this.indicatorHeight;
                f3 = width + (f / 2);
            }
        } else if (z) {
            width2 = this.startX;
            f2 = this.indicatorHeight;
            f3 = width2 - (f2 / 2);
        } else {
            width = this.startX;
            f = this.indicatorHeight;
            f3 = width + (f / 2);
        }
        float f5 = textTop + iB + ((i2 - 1) * iB2);
        float f6 = iB2;
        float f7 = this.indicatorHeight;
        float f8 = 2;
        canvas.drawCircle(f3, ((f6 - f7) / f8) + f5, f7 / f8, this.indicatorCirclePaint);
        this.indicatorTextPaint.getTextBounds(str, 0, str.length(), rect);
        Paint paint = this.indicatorTextPaint;
        int i3 = this.thumbIndex;
        paint.setColor((index != i3 || this.progress <= 0.0f) ? this.normalTextColor : this.colors.get(i3).intValue());
        canvas.drawText(str, z ? (f3 - b(this, 5)) - rect.width() : f3 + b(this, 5), f5 + (rect.height() / 2) + f(this.indicatorTextPaint), this.indicatorTextPaint);
    }

    private final void e(float thumbY, Canvas canvas) {
        if (this.progress < 0.0f) {
            return;
        }
        int i = this.mProgressColorPosition;
        if (i == this.PROGRESS_COLOR_POSITION_INNER) {
            canvas.drawCircle(this.thumbX, thumbY, this.thumbRadius, this.whitePaint);
            canvas.drawCircle(this.thumbX, thumbY, this.thumbBorderWidth, this.thumbPaint);
        } else if (i == this.PROGRESS_COLOR_POSITION_OUTER) {
            canvas.drawCircle(this.thumbX, thumbY, this.thumbRadius, this.thumbPaint);
            canvas.drawCircle(this.thumbX, thumbY, this.thumbBorderWidth, this.whitePaint);
        }
    }

    private final float f(Paint p) {
        Paint.FontMetrics fontMetrics = p.getFontMetrics();
        float f = fontMetrics.descent;
        return ((f - fontMetrics.ascent) / 2) - f;
    }

    private final float g(View view, float f) {
        return TypedValue.applyDimension(2, f, view.getContext().getResources().getDisplayMetrics());
    }

    private final int h(View view, int i) {
        return (int) TypedValue.applyDimension(2, i, view.getContext().getResources().getDisplayMetrics());
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return b(this, 7);
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        float f;
        float f2;
        int i;
        int size = this.colors.size();
        if (size == 0) {
            return;
        }
        boolean z = getLayoutDirection() == 1;
        float f3 = 2;
        float f4 = this.barHeight / f3;
        int i2 = size - 1;
        float width = (((getWidth() - getPaddingStart()) - getPaddingEnd()) - (f3 * f4)) - (this.gapSize * i2);
        float f5 = width / size;
        float width2 = z ? (getWidth() - getPaddingStart()) - f4 : getPaddingStart() + f4;
        float paddingStart = z ? getPaddingStart() + f4 : (getWidth() - getPaddingStart()) - f4;
        float f6 = z ? paddingStart : width2;
        float f7 = z ? width2 : paddingStart;
        float paddingTop = getPaddingTop();
        float fB = paddingTop + b(this, 19);
        float f8 = this.barHeight;
        float f9 = fB + (f8 / 2.0f);
        float f10 = f9 + (f8 / 2.0f);
        float f11 = this.progress;
        if (0.0f <= f11 && f11 <= 1.0f) {
            int i3 = (int) ((f11 * width) / f5);
            this.thumbIndex = i3;
            int iMax = Math.max(0, Math.min(i3, i2));
            this.thumbIndex = iMax;
            if (z) {
                f2 = width * (1 - this.progress);
                i = this.gapSize;
            } else {
                f2 = width * this.progress;
                i = this.gapSize;
            }
            float f12 = f2 + (i * iMax);
            float f13 = this.thumbRadius;
            this.thumbX = Math.max((f6 - f4) + f13, Math.min(f12, (f7 + f4) - f13));
            this.thumbPaint.setColor(this.colors.get(this.thumbIndex).intValue());
        } else {
            f9 = f9;
        }
        if (size > 0) {
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                this.segmentPaint.setColor(this.colors.get(i4).intValue());
                float f14 = z ? (width2 - (i4 * f5)) - (this.gapSize * i4) : (i4 * f5) + width2 + (this.gapSize * i4);
                float f15 = z ? f14 - f5 : f14 + f5;
                float f16 = z ? f15 : f14;
                float f17 = z ? f14 : f15;
                boolean z2 = z;
                f = f9;
                float f18 = f17;
                float f19 = f5;
                int i6 = i4;
                canvas.drawRect(f16, fB, f18, f10, this.segmentPaint);
                float f20 = f16;
                d(i6, f20, f18, f10, canvas);
                c(i6, f20, f18, paddingTop, canvas);
                if (i6 == 0) {
                    canvas.drawCircle(width2, f, f4, this.segmentPaint);
                }
                if (i6 == i2) {
                    canvas.drawCircle(paddingStart, f, f4, this.segmentPaint);
                }
                if (i5 >= size) {
                    break;
                }
                f9 = f;
                i4 = i5;
                z = z2;
                f5 = f19;
            }
        } else {
            f = f9;
        }
        e(f, canvas);
        Function2<? super Integer, ? super String, Unit> function2 = this.onValueChange;
        if (function2 == null) {
            return;
        }
        function2.invoke(this.colors.get(this.thumbIndex), this.segmentTexts.get(this.thumbIndex));
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int iH;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        int size3 = (this.colors.size() + 1) / 2;
        if (Intrinsics.areEqual(this.currentLang, Locale.CHINESE.getLanguage()) || size3 == 1) {
            iH = h(this, 80);
        } else if (size3 == 2) {
            iH = h(this, 90);
        } else {
            iH = size3 == 3 ? h(this, 110) : h(this, 80);
        }
        if (getLayoutParams().width == -2 && getLayoutParams().height == -2) {
            setMeasuredDimension(400, iH);
        } else if (getLayoutParams().width == -2) {
            setMeasuredDimension(400, size2);
        } else if (getLayoutParams().height == -2) {
            setMeasuredDimension(size, iH);
        }
    }

    public final void setColors(@NotNull List<Integer> colorList) {
        this.colors.clear();
        this.colors.addAll(colorList);
        invalidate();
    }

    public final void setGapTexts(@NotNull List<String> gapTextList) {
        this.gapTexts.clear();
        this.gapTexts.addAll(gapTextList);
        invalidate();
    }

    public final void setProgress(float progress, @NotNull Function2<? super Integer, ? super String, Unit> onValueChange) {
        this.progress = progress;
        this.onValueChange = onValueChange;
        invalidate();
    }

    public final void setSegmentTexts(@NotNull List<String> segmentTextList) {
        this.segmentTexts.clear();
        this.segmentTexts.addAll(segmentTextList);
        invalidate();
    }

    public final void setValues(@NotNull List<Integer> colorList, @NotNull List<String> segmentTextList, @NotNull List<String> gapTextList) {
        this.colors.clear();
        this.colors.addAll(colorList);
        this.segmentTexts.clear();
        this.segmentTexts.addAll(segmentTextList);
        this.gapTexts.clear();
        this.gapTexts.addAll(gapTextList);
        invalidate();
    }

    @JvmOverloads
    public ColoredProgressBar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.PROGRESS_COLOR_POSITION_INNER = 1;
        this.colors = new ArrayList();
        this.segmentTexts = new ArrayList();
        this.gapTexts = new ArrayList();
        this.gapSize = b(this, 2);
        this.thumbRadius = a(this, 5.45f);
        this.thumbBorderWidth = a(this, 4.0f);
        this.barHeight = a(this, 3.0f);
        this.progress = -1.0f;
        this.indicatorHeight = a(this, 6.0f);
        this.segmentPaint = new Paint(1);
        this.thumbPaint = new Paint(1);
        Paint paint = new Paint(1);
        paint.setColor(-1);
        Unit unit = Unit.INSTANCE;
        this.whitePaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setTextSize(g(this, 14.0f));
        this.textPaint = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(Paint.Style.FILL);
        this.indicatorCirclePaint = paint3;
        Paint paint4 = new Paint(1);
        paint4.setTextSize(g(this, 12.0f));
        this.indicatorTextPaint = paint4;
        this.normalTextColor = ContextCompat.getColor(context, R.color.s2);
        this.currentLang = Build.VERSION.SDK_INT > 24 ? context.getResources().getConfiguration().getLocales().get(0).getLanguage() : context.getResources().getConfiguration().locale.getLanguage();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.xiaomi.hm.health.R.styleable.ColoredProgressBarAttr);
        this.mProgressColorPosition = typedArrayObtainStyledAttributes.getInt(0, 1);
        typedArrayObtainStyledAttributes.recycle();
    }
}
