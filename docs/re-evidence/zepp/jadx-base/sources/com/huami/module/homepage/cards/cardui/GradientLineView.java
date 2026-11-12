package com.huami.module.homepage.cards.cardui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.core.view.InputDeviceCompat;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.module.homepage.R;
import com.huami.module.ktx.GlobalFunctionKt;
import com.huami.module.ktx.NumberExtKt;
import com.huami.module.ktx.ViewExtKt;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 <2\u00020\u0001:\u0001\u0006B\u0011\b\u0016\u0012\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106B\u001b\b\u0016\u0012\u0006\u00104\u001a\u000203\u0012\b\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b5\u00109B#\b\u0016\u0012\u0006\u00104\u001a\u000203\u0012\b\u00108\u001a\u0004\u0018\u000107\u0012\u0006\u0010:\u001a\u00020\b¢\u0006\u0004\b5\u0010;J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0012\u0010\n\u001a\u00020\u00002\n\u0010\t\u001a\u00020\u0007\"\u00020\bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fJ\u0010\u0010\u0012\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\bJ\u0006\u0010\u0013\u001a\u00020\u0004J(\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bH\u0014J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u0016\u0010\"\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010$R\u0016\u0010\r\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010$R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u0006="}, d2 = {"Lcom/huami/module/homepage/cards/cardui/GradientLineView;", "Landroid/view/View;", "Landroid/graphics/Canvas;", "canvas", "", "b", "a", "", "", "color", "setGradientColor", "maxValue", "setMaxValue", "value", "setValue", "", "keepGradient", "setDotColorKeepGradient", "setDotColor", "refresh", "w", "h", "oldw", "oldh", "onSizeChanged", "onDraw", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "paint", "circlePaint", "c", "dotPaint", GoogleApiAvailabilityLight.a, "Z", "dotColorKeepGradient", "e", LogUtil.I, "dotColor", "Landroid/graphics/LinearGradient;", "f", "Landroid/graphics/LinearGradient;", "linearGradient", "", "g", "Ljava/util/List;", "colorList", "i", "", z.j, "F", "position", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", hl.k, "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class GradientLineView extends View {

    @Deprecated
    public static final int DEFAULT_MAX_VALUE = 100;

    @NotNull
    private static final a k = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Paint paint;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Paint circlePaint;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Paint dotPaint;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean dotColorKeepGradient;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int dotColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private LinearGradient linearGradient;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private List<Integer> colorList;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int maxValue;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int value;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private float position;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/module/homepage/cards/cardui/GradientLineView$a", "", "", "DEFAULT_MAX_VALUE", LogUtil.I, "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public GradientLineView(@NotNull Context context) {
        this(context, null);
    }

    private final void a() {
        this.dotPaint.setShader(null);
        if (!this.dotColorKeepGradient) {
            this.dotPaint.setColor(this.dotColor);
            return;
        }
        LinearGradient linearGradient = this.linearGradient;
        if (linearGradient != null) {
            int i = this.value;
            if (i <= 0) {
                this.dotPaint.setColor(this.colorList.get(0).intValue());
            } else {
                if (i < this.maxValue) {
                    this.dotPaint.setShader(linearGradient);
                    return;
                }
                Paint paint = this.dotPaint;
                List<Integer> list = this.colorList;
                paint.setColor(list.get(list.size() - 1).intValue());
            }
        }
    }

    private final void b(Canvas canvas) {
        RectF rectF = new RectF(0.0f, (getHeight() / 2) - NumberExtKt.getDp(5.0f), getWidth(), (getHeight() / 2) + NumberExtKt.getDp(5.0f));
        float dp = NumberExtKt.getDp(5.0f);
        float dp2 = NumberExtKt.getDp(5.0f);
        Paint paint = this.paint;
        LinearGradient linearGradient = this.linearGradient;
        if (linearGradient != null) {
            paint.setShader(linearGradient);
        }
        Unit unit = Unit.INSTANCE;
        canvas.drawRoundRect(rectF, dp, dp2, paint);
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        b(canvas);
        int i = this.value;
        int i2 = this.maxValue;
        if (i > i2) {
            this.value = i2;
        }
        float width = (((getWidth() - NumberExtKt.getDp(20.0f)) / this.maxValue) * this.value) + NumberExtKt.getDp(10.0f);
        this.position = width;
        canvas.drawCircle(width, getHeight() / 2.0f, NumberExtKt.getDp(10.0f), this.circlePaint);
        float f = this.position;
        float height = getHeight() / 2.0f;
        float dp = NumberExtKt.getDp(7.0f);
        Paint paint = this.dotPaint;
        a();
        Unit unit = Unit.INSTANCE;
        canvas.drawCircle(f, height, dp, paint);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        if (this.colorList.size() > 1) {
            this.linearGradient = new LinearGradient(0.0f, getHeight() / 2.0f, getWidth(), getHeight() / 2.0f, CollectionsKt___CollectionsKt.toIntArray(this.colorList), (float[]) null, Shader.TileMode.CLAMP);
        }
    }

    public final void refresh() {
        if (GlobalFunctionKt.isRtl()) {
            int i = this.maxValue - this.value;
            this.value = i;
            if (i < 0) {
                i = 0;
            }
            this.value = i;
        }
        invalidate();
    }

    @NotNull
    public final GradientLineView setDotColor(@ColorInt int color) {
        this.dotColor = color;
        return this;
    }

    @NotNull
    public final GradientLineView setDotColorKeepGradient(boolean keepGradient) {
        this.dotColorKeepGradient = keepGradient;
        return this;
    }

    @NotNull
    public final GradientLineView setGradientColor(@NotNull int... color) {
        this.colorList.clear();
        this.colorList.addAll(ArraysKt___ArraysKt.toMutableList(color));
        if (GlobalFunctionKt.isRtl()) {
            j.reverse(this.colorList);
        }
        return this;
    }

    @NotNull
    public final GradientLineView setMaxValue(int maxValue) {
        this.maxValue = maxValue;
        return this;
    }

    @NotNull
    public final GradientLineView setValue(int value) {
        this.value = value;
        return this;
    }

    public GradientLineView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GradientLineView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(1);
        paint.setStrokeWidth(NumberExtKt.getDp(10.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        Unit unit = Unit.INSTANCE;
        this.paint = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(ViewExtKt.loadColor(this, R.color.s38));
        this.circlePaint = paint2;
        this.dotPaint = paint;
        this.dotColorKeepGradient = true;
        this.dotColor = InputDeviceCompat.SOURCE_ANY;
        this.colorList = new ArrayList();
        this.maxValue = 100;
    }
}
