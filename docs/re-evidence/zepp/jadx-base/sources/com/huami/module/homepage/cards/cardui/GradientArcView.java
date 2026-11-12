package com.huami.module.homepage.cards.cardui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorRes;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.module.homepage.R;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.module.ktx.NumberExtKt;
import com.huami.module.ktx.ViewExtKt;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.squareup.picasso.u;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import kotlin.ranges.e;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 `2\u00020\u0001:\u0001\tB\u0011\b\u0016\u0012\u0006\u0010X\u001a\u00020W¢\u0006\u0004\bY\u0010ZB\u001b\b\u0016\u0012\u0006\u0010X\u001a\u00020W\u0012\b\u0010\\\u001a\u0004\u0018\u00010[¢\u0006\u0004\bY\u0010]B#\b\u0016\u0012\u0006\u0010X\u001a\u00020W\u0012\b\u0010\\\u001a\u0004\u0018\u00010[\u0012\u0006\u0010^\u001a\u00020\r¢\u0006\u0004\bY\u0010_J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J0\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0014J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000bJ\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0016J\u0010\u0010\u001a\u001a\u00020\u00002\b\b\u0001\u0010\u0019\u001a\u00020\rJ\u0017\u0010\u001c\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\rJ>\u0010%\u001a\u00020\u000026\u0010$\u001a2\u0012\u0013\u0012\u00110!¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110!¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00040 J\u0006\u0010&\u001a\u00020\u0004J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\rJ\u0012\u0010+\u001a\u00020\u00002\n\u0010*\u001a\u00020)\"\u00020\rJ\u0010\u0010-\u001a\u00020\u00002\b\b\u0002\u0010,\u001a\u00020\u000bR\u0016\u0010'\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010.R\u0016\u00101\u001a\u00020/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00103R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00103R\u0016\u00107\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00106R\u0016\u00108\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u00106R\u0016\u0010:\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00106R\u0016\u0010=\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010A\u001a\u00020>8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010E\u001a\u00020>8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010@R\u0016\u0010\u001e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010.R\u0016\u0010H\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u00106R\u0016\u0010K\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010M\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010JR\u0016\u0010O\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010JR*\u0010R\u001a\u0016\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u001c\u0010V\u001a\b\u0012\u0004\u0012\u00020\r0S8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006a"}, d2 = {"Lcom/huami/module/homepage/cards/cardui/GradientArcView;", "Landroid/view/View;", "Landroid/graphics/Canvas;", "canvas", "", "b", "c", "f", "e", "a", GoogleApiAvailabilityLight.a, "", u.q, "", "left", "top", "right", "bottom", "onLayout", "onDraw", "show", "setShowDot", "", "content", "setContent", "color", "setContentColor", "value", "setValue", "(Ljava/lang/Integer;)Lcom/huami/module/homepage/cards/cardui/GradientArcView;", "maxValue", "setMaxValue", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "animationCallback", "setHeartAnimation", "refresh", "openAngle", "setOpenAngle", "", "colors", "setGradientColor", "keep", "setDotColorKeepArcColor", LogUtil.I, "Landroid/graphics/Path;", "Landroid/graphics/Path;", "sweepPath", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "sweepPaint", "circlePaint", "F", "padding", "dotAngle", "g", "radius", "h", "Ljava/lang/String;", "contentText", "Landroid/text/TextPaint;", "i", "Landroid/text/TextPaint;", "contentPaint", z.j, "Ljava/lang/Integer;", hl.k, "valuePaint", "l", "m", "startAngle", GoogleApiAvailabilityLight.b, "Z", "dotColorKeepArcColor", "o", "showDot", b.r, "needReMeasureLayout", DTransferConstants.SEARCH_KEY, "Lkotlin/jvm/functions/Function2;", "heartAnimationListener", "", "r", "Ljava/util/List;", "gradientColors", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", SOAP.XMLNS, "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class GradientArcView extends View {

    @Deprecated
    public static final float ANGLE_OFFSET = 10.0f;

    @Deprecated
    public static final int DEFAULT_MAX_VALUE = 100;

    @Deprecated
    public static final float HALF_CIRCLE_ANGLE = 180.0f;

    @Deprecated
    public static final int QUARTER_CIRCLE = 90;

    @Deprecated
    public static final int QUARTER_PI = 4;

    @Deprecated
    public static final float SWEEP_ANGLE = 360.0f;

    @Deprecated
    public static final float THREE_QUARTERS_CIRCLE = 270.0f;

    @Deprecated
    public static final float UNCIA_CIRCLE = 30.0f;

    @NotNull
    private static final a s = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int openAngle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Path sweepPath;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Paint sweepPaint;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Paint circlePaint;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float padding;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private float dotAngle;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private float radius;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private String contentText;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final TextPaint contentPaint;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private Integer value;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final TextPaint valuePaint;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int maxValue;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private float startAngle;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean dotColorKeepArcColor;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private boolean showDot;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private boolean needReMeasureLayout;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    private Function2<? super Float, ? super Float, Unit> heartAnimationListener;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final List<Integer> gradientColors;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0016\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004¨\u0006\u0010"}, d2 = {"com/huami/module/homepage/cards/cardui/GradientArcView$a", "", "", "ANGLE_OFFSET", "F", "", "DEFAULT_MAX_VALUE", LogUtil.I, "HALF_CIRCLE_ANGLE", "QUARTER_CIRCLE", "QUARTER_PI", "SWEEP_ANGLE", "THREE_QUARTERS_CIRCLE", "UNCIA_CIRCLE", "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public GradientArcView(@NotNull Context context) {
        this(context, null);
    }

    private final void a() {
        this.sweepPath.reset();
        this.sweepPath.addArc(new RectF((getWidth() / 2) - this.radius, (getHeight() / 2) - this.radius, (getWidth() / 2) + this.radius, (getHeight() / 2) + this.radius), this.startAngle, 360.0f - this.openAngle);
        int size = this.gradientColors.size();
        if (size == 0) {
            throw new IllegalArgumentException("color count must more than zero.");
        }
        if (size == 1) {
            this.sweepPaint.setColor(this.gradientColors.get(0).intValue());
            return;
        }
        float f = ((360.0f - this.openAngle) / 360.0f) / (size - 1);
        IntRange intRangeUntil = e.until(0, size);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it2 = intRangeUntil.iterator();
        while (it2.hasNext()) {
            arrayList.add(Float.valueOf(((IntIterator) it2).nextInt() * f));
        }
        SweepGradient sweepGradient = new SweepGradient(getWidth() / 2.0f, getHeight() / 2.0f, CollectionsKt___CollectionsKt.toIntArray(this.gradientColors), CollectionsKt___CollectionsKt.toFloatArray(arrayList));
        Matrix matrix = new Matrix();
        matrix.setRotate(this.startAngle - 10.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        sweepGradient.setLocalMatrix(matrix);
        this.sweepPaint.setShader(sweepGradient);
    }

    private final void b(Canvas canvas) {
        Path path = this.sweepPath;
        Paint paint = this.sweepPaint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        Unit unit = Unit.INSTANCE;
        canvas.drawPath(path, paint);
    }

    private final void c(Canvas canvas) {
        canvas.drawText(this.contentText, (getWidth() / 2) - (this.contentPaint.measureText(this.contentText) / 2), (getHeight() / 2) + (this.radius * ((float) Math.sin(0.7853981633974483d))), this.contentPaint);
    }

    private final void d(Canvas canvas) {
        Paint paint;
        double d = (((double) (this.startAngle + this.dotAngle)) * 3.141592653589793d) / ((double) 180.0f);
        float width = (getWidth() / 2.0f) + (this.radius * ((float) Math.cos(d)));
        float height = (getHeight() / 2.0f) + (this.radius * ((float) Math.sin(d)));
        canvas.drawCircle(width, height, NumberExtKt.getDp(10.0f), this.circlePaint);
        float dp = NumberExtKt.getDp(7.0f);
        if (this.dotColorKeepArcColor) {
            paint = this.sweepPaint;
            paint.setStyle(Paint.Style.FILL);
            paint.setStrokeCap(Paint.Cap.SQUARE);
            Unit unit = Unit.INSTANCE;
        } else {
            paint = new Paint(1);
            paint.setColor(this.contentPaint.getColor());
            Unit unit2 = Unit.INSTANCE;
        }
        canvas.drawCircle(width, height, dp, paint);
    }

    private final void e(Canvas canvas) {
        Function2<? super Float, ? super Float, Unit> function2;
        float width = (getWidth() / 2.0f) - NumberExtKt.getDp(15.0f);
        float height = (getHeight() / 2) - NumberExtKt.getDp(30.0f);
        Integer num = this.value;
        if ((num == null || num.intValue() > 0) && (function2 = this.heartAnimationListener) != null) {
            function2.invoke(Float.valueOf(width), Float.valueOf(height));
        } else {
            canvas.drawBitmap(HomeUtils.obtainBitmap(getContext(), (int) NumberExtKt.getDp(30.0f), R.drawable.cardui_heart_beat), width, height - NumberExtKt.getDp(10.0f), (Paint) null);
        }
    }

    private final void f(Canvas canvas) {
        Integer num = this.value;
        String strValueOf = (num == null || num.intValue() <= 0) ? "--" : String.valueOf(this.value);
        canvas.drawText(strValueOf, (getWidth() / 2) - (this.valuePaint.measureText(strValueOf) / 2), (getHeight() / 2) + NumberExtKt.getDp(16.0f), this.valuePaint);
    }

    public static /* synthetic */ GradientArcView setDotColorKeepArcColor$default(GradientArcView gradientArcView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return gradientArcView.setDotColorKeepArcColor(z);
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        canvas.translate(0.0f, NumberExtKt.getDp(9.0f));
        b(canvas);
        if (this.showDot) {
            d(canvas);
        }
        e(canvas);
        f(canvas);
        c(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        int i = this.openAngle;
        this.startAngle = ((180.0f - i) / 2) + i;
        a();
    }

    public final void refresh() {
        Integer num = this.value;
        if (num != null) {
            int iIntValue = num.intValue();
            int i = this.maxValue;
            if (iIntValue > i) {
                this.value = Integer.valueOf(i);
            }
        }
        Integer num2 = this.value;
        this.dotAngle = (num2 == null || num2.intValue() <= 0) ? 30.0f : (270.0f / this.maxValue) * this.value.intValue();
        if (!this.needReMeasureLayout) {
            invalidate();
        } else {
            requestLayout();
            this.needReMeasureLayout = false;
        }
    }

    @NotNull
    public final GradientArcView setContent(@NotNull String content) {
        this.contentText = content;
        return this;
    }

    @NotNull
    public final GradientArcView setContentColor(@NotNull String color) {
        this.contentPaint.setColor(Color.parseColor(color));
        return this;
    }

    @NotNull
    public final GradientArcView setDotColorKeepArcColor(boolean keep) {
        this.dotColorKeepArcColor = keep;
        return this;
    }

    @NotNull
    public final GradientArcView setGradientColor(@NotNull int... colors) {
        if (colors.length != this.gradientColors.size()) {
            this.needReMeasureLayout = true;
        }
        this.gradientColors.clear();
        this.gradientColors.addAll(ArraysKt___ArraysKt.toMutableList(colors));
        return this;
    }

    @NotNull
    public final GradientArcView setHeartAnimation(@NotNull Function2<? super Float, ? super Float, Unit> animationCallback) {
        this.heartAnimationListener = animationCallback;
        return this;
    }

    @NotNull
    public final GradientArcView setMaxValue(int maxValue) {
        this.maxValue = maxValue;
        return this;
    }

    @NotNull
    public final GradientArcView setOpenAngle(int openAngle) {
        this.openAngle = openAngle;
        return this;
    }

    @NotNull
    public final GradientArcView setShowDot(boolean show) {
        this.showDot = show;
        return this;
    }

    @NotNull
    public final GradientArcView setValue(@Nullable Integer value) {
        this.value = value;
        return this;
    }

    public GradientArcView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @NotNull
    public final GradientArcView setContentColor(@ColorRes int color) {
        this.contentPaint.setColor(ViewExtKt.loadColor(this, color));
        return this;
    }

    public GradientArcView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.openAngle = 90;
        this.sweepPath = new Path();
        Paint paint = new Paint(1);
        paint.setStrokeWidth(NumberExtKt.getDp(8.0f));
        Unit unit = Unit.INSTANCE;
        this.sweepPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(ViewExtKt.loadColor(this, R.color.s38));
        this.circlePaint = paint2;
        float dp = NumberExtKt.getDp(8.0f);
        this.padding = dp;
        this.dotAngle = 45.0f;
        float f = 2;
        this.radius = (NumberExtKt.getDp(128.0f) / f) - (dp / f);
        this.contentText = "舒缓放松";
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(NumberExtKt.getSp(14.0f));
        this.contentPaint = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setTextSize(NumberExtKt.getSp(30.0f));
        textPaint2.setColor(ViewExtKt.loadColor(this, R.color.s1));
        this.valuePaint = textPaint2;
        this.maxValue = 100;
        this.showDot = true;
        this.gradientColors = new ArrayList();
    }
}
