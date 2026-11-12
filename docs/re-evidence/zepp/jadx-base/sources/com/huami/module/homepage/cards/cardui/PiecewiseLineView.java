package com.huami.module.homepage.cards.cardui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.module.homepage.R;
import com.huami.module.ktx.GlobalFunctionKt;
import com.huami.module.ktx.NumberExtKt;
import com.huami.module.ktx.ViewExtKt;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0012\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ]2\u00020\u0001:\u0001\tB\u0011\b\u0016\u0012\u0006\u0010U\u001a\u00020T¢\u0006\u0004\bV\u0010WB\u001b\b\u0016\u0012\u0006\u0010U\u001a\u00020T\u0012\b\u0010Y\u001a\u0004\u0018\u00010X¢\u0006\u0004\bV\u0010ZB#\b\u0016\u0012\u0006\u0010U\u001a\u00020T\u0012\b\u0010Y\u001a\u0004\u0018\u00010X\u0012\u0006\u0010[\u001a\u00020\u0005¢\u0006\u0004\bV\u0010\\J\u001c\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J*\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002J \u0010\u0015\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002J\u0014\u0010\u0018\u001a\u00020\u00002\f\b\u0001\u0010\u0017\u001a\u00020\u0016\"\u00020\u0005J\u0016\u0010\u0018\u001a\u00020\u00002\u000e\b\u0001\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0019J!\u0010\u001c\u001a\u00020\u00002\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u001b\"\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u001f\u001a\u00020\u00002\u0018\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00040\u0019J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0005J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0012J\u0010\u0010%\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u000fH\u0007J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u000fJ\u0018\u0010)\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u0005H\u0014J\u0006\u0010*\u001a\u00020\bJ\u0010\u0010+\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0014R\u0016\u0010-\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020\u00050.8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010/R\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020\u00020.8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010/R\u0016\u0010 \u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010,R\u0016\u0010\"\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00103R\u0016\u0010%\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u00104R\u0016\u00107\u001a\u0002058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00106R\u0016\u00109\u001a\u0002058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00106R\u0016\u0010;\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00103R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010E\u001a\u00020@8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010BR\u0016\u0010G\u001a\u00020@8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010BR\u0016\u0010I\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u00104R\u0018\u0010M\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u001c\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00120.8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010/R\u0016\u0010S\u001a\u00020P8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006^"}, d2 = {"Lcom/huami/module/homepage/cards/cardui/PiecewiseLineView;", "Landroid/view/View;", "", "text", "Lkotlin/Pair;", "", "f", "getTriAngleColorPosition", "", "a", "g", "Landroid/graphics/Canvas;", "canvas", "e", "textWidth", "", "target", "c", "", "left", "right", "b", "", "color", "setPiecewiseColor", "", "colors", "", "setPiecewiseText", "([Ljava/lang/String;)Lcom/huami/module/homepage/cards/cardui/PiecewiseLineView;", "textAndColor", "setPiecewiseTextAndColor", "maxValue", "setMaxValue", "value", "setValue", "shown", "showIndicator", "setShowIndicator", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "refresh", "onDraw", LogUtil.I, "lineHeight", "", "Ljava/util/List;", "piecewiseColors", "piecewiseTexts", GoogleApiAvailabilityLight.a, "F", "Z", "Landroid/graphics/Path;", "Landroid/graphics/Path;", "outerTriAnglePath", "h", "innerTriAnglePath", "i", "maxLength", "Landroid/graphics/CornerPathEffect;", z.j, "Landroid/graphics/CornerPathEffect;", "cornerPathEffect", "Landroid/graphics/Paint;", hl.k, "Landroid/graphics/Paint;", "paint", "l", "outerTriAnglePaint", "m", "innerTriAnglePaint", GoogleApiAvailabilityLight.b, "needReMeasureLayout", "Landroid/graphics/LinearGradient;", "o", "Landroid/graphics/LinearGradient;", "linearGradient", b.r, "textCenterPositions", "Landroid/text/TextPaint;", DTransferConstants.SEARCH_KEY, "Landroid/text/TextPaint;", "textPaint", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "r", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class PiecewiseLineView extends View {

    @Deprecated
    public static final int DEFAULT_MAX_VALUE = 100;

    @Deprecated
    public static final float POSITION_OFFSET = 1.0E-5f;

    @NotNull
    private static final a r = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int lineHeight;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<Integer> piecewiseColors;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final List<String> piecewiseTexts;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int maxValue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private float value;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean showIndicator;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Path outerTriAnglePath;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Path innerTriAnglePath;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private float maxLength;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final CornerPathEffect cornerPathEffect;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Paint paint;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Paint outerTriAnglePaint;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final Paint innerTriAnglePaint;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean needReMeasureLayout;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    private LinearGradient linearGradient;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final List<Float> textCenterPositions;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final TextPaint textPaint;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"com/huami/module/homepage/cards/cardui/PiecewiseLineView$a", "", "", "DEFAULT_MAX_VALUE", LogUtil.I, "", "POSITION_OFFSET", "F", "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PiecewiseLineView(@NotNull Context context) {
        this(context, null);
    }

    private final void a() {
        float dp;
        float dp2;
        if (this.maxValue < this.value) {
            throw new IllegalArgumentException("maxValue must more than value.");
        }
        g();
        float width = getWidth() - NumberExtKt.getDp(16.0f);
        this.maxLength = width;
        float f = (width / this.maxValue) * this.value;
        this.outerTriAnglePaint.setColor(this.piecewiseColors.get(getTriAngleColorPosition()).intValue());
        float f2 = this.value;
        int i = this.maxValue;
        if (f2 > i / 2.0f) {
            dp2 = f + NumberExtKt.getDp(8.0f) + NumberExtKt.getDp(4.0f);
            if (dp2 > this.maxLength + NumberExtKt.getDp(8.0f)) {
                f = this.maxLength;
                dp = NumberExtKt.getDp(8.0f);
                dp2 = f + dp;
            }
        } else if (f2 < i / 2.0f) {
            dp2 = (f + NumberExtKt.getDp(8.0f)) - NumberExtKt.getDp(4.0f);
            if (dp2 < NumberExtKt.getDp(8.0f)) {
                dp2 = NumberExtKt.getDp(8.0f);
            }
        } else {
            dp = NumberExtKt.getDp(8.0f);
            dp2 = f + dp;
        }
        float dp3 = NumberExtKt.getDp(8.0f);
        float dp4 = NumberExtKt.getDp(10.0f);
        float dp5 = (this.lineHeight / 2.0f) - NumberExtKt.getDp(0.5f);
        float dp6 = (this.lineHeight / 2.0f) + NumberExtKt.getDp(2.0f);
        Path path = this.outerTriAnglePath;
        path.reset();
        path.moveTo(dp2, dp5);
        float f3 = dp2 - dp3;
        float f4 = dp5 - dp4;
        path.lineTo(f3, f4);
        float f5 = dp3 + dp2;
        path.lineTo(f5, f4);
        path.close();
        Path path2 = this.innerTriAnglePath;
        path2.reset();
        path2.moveTo(dp2, dp6);
        float f6 = dp6 - dp4;
        path2.lineTo(f3, f6);
        path2.lineTo(f5, f6);
        path2.close();
    }

    private final void b(Canvas canvas, float left, float right) {
        float dp = (this.lineHeight / 2) - NumberExtKt.getDp(4.0f);
        float dp2 = (this.lineHeight / 2) + NumberExtKt.getDp(4.0f);
        Paint paint = this.paint;
        paint.setColor(ViewExtKt.loadColor(this, R.color.s38));
        paint.setShader(null);
        Unit unit = Unit.INSTANCE;
        canvas.drawRect(left, dp, right, dp2, paint);
    }

    private final void c(Canvas canvas, String text, int textWidth, boolean target) {
        StaticLayout staticLayout;
        if (Build.VERSION.SDK_INT >= 23) {
            int length = text.length();
            TextPaint textPaint = this.textPaint;
            textPaint.setColor(ViewExtKt.loadColor(this, target ? R.color.s1 : R.color.s2));
            Unit unit = Unit.INSTANCE;
            staticLayout = StaticLayout.Builder.obtain(text, 0, length, textPaint, textWidth).setAlignment(Layout.Alignment.ALIGN_CENTER).build();
        } else {
            TextPaint textPaint2 = this.textPaint;
            textPaint2.setColor(ViewExtKt.loadColor(this, target ? R.color.s1 : R.color.s2));
            Unit unit2 = Unit.INSTANCE;
            staticLayout = new StaticLayout(text, textPaint2, textWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        }
        staticLayout.draw(canvas);
    }

    public static /* synthetic */ void d(PiecewiseLineView piecewiseLineView, Canvas canvas, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = false;
        }
        piecewiseLineView.c(canvas, str, i, z);
    }

    private final void e(Canvas canvas) {
        int iIndexOf = this.showIndicator ? this.piecewiseColors.indexOf(Integer.valueOf(this.outerTriAnglePaint.getColor())) : -1;
        int width = (getWidth() - NumberExtKt.getDp(16)) / this.piecewiseColors.size();
        int i = 0;
        for (Object obj : this.textCenterPositions) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            float fFloatValue = ((Number) obj).floatValue();
            canvas.save();
            canvas.translate(fFloatValue - width, this.lineHeight);
            c(canvas, this.piecewiseTexts.get(i), width, iIndexOf == i);
            canvas.restore();
            if (i == this.textCenterPositions.size() - 1) {
                canvas.save();
                canvas.translate(fFloatValue, this.lineHeight);
                c(canvas, this.piecewiseTexts.get(i2), width, iIndexOf == i2);
                canvas.restore();
            }
            i = i2;
        }
    }

    private final Pair<Integer, Integer> f(String text) {
        Rect rect = new Rect();
        this.textPaint.getTextBounds(text, 0, text.length(), rect);
        return TuplesKt.to(Integer.valueOf(rect.height()), Integer.valueOf(rect.width()));
    }

    private final void g() {
        int size = this.piecewiseColors.size();
        if (size == 0) {
            throw new IllegalArgumentException("piecewiseColor count must more than zero.");
        }
        int i = 0;
        if (size == 1) {
            this.paint.setColor(this.piecewiseColors.get(0).intValue());
            return;
        }
        int i2 = size * 2;
        int[] iArr = new int[i2];
        float[] fArr = new float[i2];
        float f = 1.0f / size;
        for (Object obj : this.piecewiseColors) {
            int i3 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            int iIntValue = ((Number) obj).intValue();
            int i4 = i * 2;
            iArr[i4] = iIntValue;
            int i5 = i4 + 1;
            iArr[i5] = iIntValue;
            fArr[i4] = (i * f) + 1.0E-5f;
            fArr[i5] = i3 * f;
            i = i3;
        }
        this.linearGradient = new LinearGradient(0.0f, this.lineHeight / 2.0f, getWidth(), this.lineHeight / 2.0f, iArr, fArr, Shader.TileMode.CLAMP);
    }

    private final int getTriAngleColorPosition() {
        float size = this.value / (this.maxValue / this.piecewiseColors.size());
        int i = (int) size;
        return (!((((float) i) > size ? 1 : (((float) i) == size ? 0 : -1)) == 0) || size <= 0.0f) ? i : i - 1;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        this.textCenterPositions.clear();
        a();
        float f = 2;
        float width = (getWidth() - this.maxLength) / f;
        float f2 = this.lineHeight / 2.0f;
        float width2 = (getWidth() + this.maxLength) / f;
        float f3 = this.lineHeight / 2.0f;
        Paint paint = this.paint;
        LinearGradient linearGradient = this.linearGradient;
        if (linearGradient != null) {
            paint.setShader(linearGradient);
            paint.setStrokeWidth(NumberExtKt.getDp(8.0f));
            paint.setStrokeCap(Paint.Cap.ROUND);
        }
        Unit unit = Unit.INSTANCE;
        canvas.drawLine(width, f2, width2, f3, paint);
        int size = this.piecewiseColors.size();
        if (size > 1) {
            float width3 = getWidth() / size;
            int i = size - 1;
            int i2 = 0;
            while (i2 < i) {
                i2++;
                float f4 = i2 * width3;
                this.textCenterPositions.add(Float.valueOf(f4));
                b(canvas, f4 - NumberExtKt.getDp(1.0f), f4 + NumberExtKt.getDp(1.0f));
            }
        }
        if (this.showIndicator) {
            canvas.drawPath(this.innerTriAnglePath, this.innerTriAnglePaint);
            canvas.drawPath(this.outerTriAnglePath, this.outerTriAnglePaint);
        }
        if (!this.piecewiseTexts.isEmpty()) {
            e(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.piecewiseTexts.isEmpty()) {
            setMeasuredDimension(widthMeasureSpec, NumberExtKt.getDp(20));
            return;
        }
        List<String> list = this.piecewiseTexts;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(f((String) it2.next()));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Integer.valueOf(((Number) ((Pair) it3.next()).getFirst()).intValue()));
        }
        Integer num = (Integer) CollectionsKt.maxOrNull((Iterable) arrayList2);
        int iIntValue = num == null ? 0 : num.intValue() + NumberExtKt.getDp(12);
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList3.add(Integer.valueOf(((Number) ((Pair) it4.next()).getSecond()).intValue()));
        }
        Integer num2 = (Integer) CollectionsKt.maxOrNull((Iterable) arrayList3);
        setMeasuredDimension(widthMeasureSpec, NumberExtKt.getDp(20) + iIntValue + ((num2 == null ? 0 : num2.intValue()) > (getWidth() - NumberExtKt.getDp(16)) / this.piecewiseColors.size() ? iIntValue : NumberExtKt.getDp(0)));
    }

    public final void refresh() {
        if (GlobalFunctionKt.isRtl()) {
            float f = this.maxValue - this.value;
            this.value = f;
            if (f < 0.0f) {
                f = 0.0f;
            }
            this.value = f;
        }
        if (this.needReMeasureLayout) {
            requestLayout();
            this.needReMeasureLayout = false;
        }
        invalidate();
    }

    @NotNull
    public final PiecewiseLineView setMaxValue(int maxValue) {
        this.maxValue = maxValue;
        return this;
    }

    @NotNull
    public final PiecewiseLineView setPiecewiseColor(@ColorInt @NotNull int... color) {
        this.piecewiseColors.clear();
        this.piecewiseColors.addAll(ArraysKt___ArraysKt.toMutableList(color));
        if (GlobalFunctionKt.isRtl()) {
            j.reverse(this.piecewiseColors);
        }
        return this;
    }

    @NotNull
    public final PiecewiseLineView setPiecewiseText(@NotNull String... text) {
        if (this.piecewiseTexts.size() != text.length) {
            this.needReMeasureLayout = true;
        }
        this.piecewiseTexts.clear();
        this.piecewiseTexts.addAll(ArraysKt___ArraysKt.toMutableList(text));
        if (GlobalFunctionKt.isRtl()) {
            j.reverse(this.piecewiseTexts);
        }
        return this;
    }

    @NotNull
    public final PiecewiseLineView setPiecewiseTextAndColor(@NotNull List<Pair<String, Integer>> textAndColor) {
        if (this.piecewiseTexts.size() != textAndColor.size()) {
            this.needReMeasureLayout = true;
        }
        this.piecewiseTexts.clear();
        List<String> list = this.piecewiseTexts;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(textAndColor, 10));
        Iterator<T> it2 = textAndColor.iterator();
        while (it2.hasNext()) {
            arrayList.add((String) ((Pair) it2.next()).getFirst());
        }
        list.addAll(arrayList);
        this.piecewiseColors.clear();
        List<Integer> list2 = this.piecewiseColors;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(textAndColor, 10));
        Iterator<T> it3 = textAndColor.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Integer.valueOf(((Number) ((Pair) it3.next()).getSecond()).intValue()));
        }
        list2.addAll(arrayList2);
        if (GlobalFunctionKt.isRtl()) {
            j.reverse(this.piecewiseColors);
            j.reverse(this.piecewiseTexts);
        }
        return this;
    }

    @NotNull
    public final PiecewiseLineView setShowIndicator(boolean shown) {
        this.showIndicator = shown;
        return this;
    }

    @NotNull
    public final PiecewiseLineView setValue(float value) {
        this.value = value;
        return this;
    }

    @Deprecated(message = "使用setShowIndicator替代", replaceWith = @ReplaceWith(expression = "this.setShowIndicator(shown)", imports = {}))
    public final void showIndicator(boolean shown) {
        this.showIndicator = shown;
        invalidate();
    }

    public PiecewiseLineView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PiecewiseLineView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.lineHeight = NumberExtKt.getDp(20);
        this.piecewiseColors = new ArrayList();
        this.piecewiseTexts = new ArrayList();
        this.maxValue = 100;
        this.showIndicator = true;
        this.outerTriAnglePath = new Path();
        this.innerTriAnglePath = new Path();
        CornerPathEffect cornerPathEffect = new CornerPathEffect(NumberExtKt.getDp(2.0f));
        this.cornerPathEffect = cornerPathEffect;
        this.paint = new Paint(1);
        Paint paint = new Paint(1);
        paint.setPathEffect(cornerPathEffect);
        Unit unit = Unit.INSTANCE;
        this.outerTriAnglePaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(ViewExtKt.loadColor(this, R.color.s38));
        paint2.setPathEffect(cornerPathEffect);
        this.innerTriAnglePaint = paint2;
        this.textCenterPositions = new ArrayList();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(NumberExtKt.getDp(12.0f));
        this.textPaint = textPaint;
    }

    @NotNull
    public final PiecewiseLineView setPiecewiseColor(@ColorInt @NotNull List<Integer> colors) {
        this.piecewiseColors.clear();
        this.piecewiseColors.addAll(colors);
        if (GlobalFunctionKt.isRtl()) {
            j.reverse(this.piecewiseColors);
        }
        return this;
    }
}
