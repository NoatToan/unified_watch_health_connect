package com.huami.module.homepage.cards.cardui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.module.homepage.R;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.module.ktx.NumberExtKt;
import com.huami.module.ktx.ViewExtKt;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010\"\u001a\u00020\u0005¢\u0006\u0004\b#\u0010$J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00002\b\b\u0001\u0010\u0006\u001a\u00020\u0005J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006%"}, d2 = {"Lcom/huami/module/homepage/cards/cardui/PairCircleView;", "Landroid/view/View;", "", "valueText", "setValueText", "", "colorInt", "setColor", "Landroid/graphics/Canvas;", "canvas", "", "onDraw", "", "a", "F", "outerRingWidth", "b", "innerRingWidth", "Landroid/graphics/Paint;", "c", "Landroid/graphics/Paint;", "innerCirclePaint", GoogleApiAvailabilityLight.a, "outCirclePaint", "Landroid/text/TextPaint;", "e", "Landroid/text/TextPaint;", "valuePaint", "f", "Ljava/lang/String;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class PairCircleView extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private float outerRingWidth;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private float innerRingWidth;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Paint innerCirclePaint;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Paint outCirclePaint;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final TextPaint valuePaint;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private String valueText;

    @JvmOverloads
    public PairCircleView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public PairCircleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PairCircleView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, (getWidth() / 2.0f) - (this.outerRingWidth / 2.0f), this.outCirclePaint);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, ((getWidth() / 2.0f) - this.outerRingWidth) + (this.innerRingWidth / 2.0f), this.innerCirclePaint);
        canvas.drawText(this.valueText, (getWidth() / 2) - (this.valuePaint.measureText(this.valueText) / 2), (getHeight() / 2) + NumberExtKt.getDp(20.0f), this.valuePaint);
    }

    @NotNull
    public final PairCircleView setColor(@ColorInt int colorInt) {
        this.innerCirclePaint.setColor(colorInt);
        this.outCirclePaint.setColor(NumberExtKt.addAlpha(colorInt, 0.3d));
        return this;
    }

    @NotNull
    public final PairCircleView setValueText(@NotNull String valueText) {
        this.valueText = valueText;
        return this;
    }

    @JvmOverloads
    public PairCircleView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.outerRingWidth = NumberExtKt.getDp(12.0f);
        this.innerRingWidth = NumberExtKt.getDp(7.0f);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.innerRingWidth);
        paint.setColor(Color.parseColor("#02AF8D"));
        Unit unit = Unit.INSTANCE;
        this.innerCirclePaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(this.outerRingWidth);
        paint2.setColor(Color.parseColor("#7602AF8D"));
        this.outCirclePaint = paint2;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(NumberExtKt.getSp(24.0f));
        textPaint.setColor(ViewExtKt.loadColor(this, R.color.s1));
        textPaint.setTypeface(HomeUtils.getMaisonTypeface());
        this.valuePaint = textPaint;
        this.valueText = "--";
    }
}
