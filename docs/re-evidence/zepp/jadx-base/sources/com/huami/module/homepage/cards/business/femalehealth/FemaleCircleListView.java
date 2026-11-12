package com.huami.module.homepage.cards.business.femalehealth;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.module.homepage.R;
import com.huami.module.ktx.GlobalFunctionKt;
import com.huami.module.ktx.NumberExtKt;
import com.huami.module.ktx.ViewExtKt;
import com.huami.tools.analytics.DbUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010/\u001a\u00020.\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\b\b\u0002\u00102\u001a\u00020\b¢\u0006\u0004\b3\u00104J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J(\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0014\u0010\u0014\u001a\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012J(\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0014J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001cR\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0016\u0010&\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0016\u0010*\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010%R\u0016\u0010,\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010%R\u0016\u0010-\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010%¨\u00065"}, d2 = {"Lcom/huami/module/homepage/cards/business/femalehealth/FemaleCircleListView;", "Landroid/view/View;", "", "c", "", "text", "Landroid/graphics/Typeface;", "typeface", "", "b", "Landroid/graphics/Canvas;", "canvas", "index", "", "textOffset", "Lcom/huami/module/homepage/cards/business/femalehealth/CircleParam;", "param", "a", "", "params", "setCircleParam", "w", "h", "oldw", "oldh", "onSizeChanged", "onDraw", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "paint", "Landroid/text/TextPaint;", "Landroid/text/TextPaint;", "textPaint", "", "Ljava/util/List;", "circleParams", GoogleApiAvailabilityLight.a, "F", "innerCircleRadius", "e", "outCircleRadius", "f", "circleMargin", "g", "circleOffset", "extraWidth", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class FemaleCircleListView extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Paint paint;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final TextPaint textPaint;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final List<CircleParam> circleParams;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float innerCircleRadius;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float outCircleRadius;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float circleMargin;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private float circleOffset;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private float extraWidth;

    @JvmOverloads
    public FemaleCircleListView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public FemaleCircleListView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ FemaleCircleListView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void a(Canvas canvas, int index, float textOffset, CircleParam param) {
        TextPaint textPaint = this.textPaint;
        textPaint.setColor(param.getTextColor());
        textPaint.setTypeface(param.getTypeface());
        Rect rect = new Rect();
        this.textPaint.getTextBounds(param.getText(), 0, param.getText().length(), rect);
        String text = param.getText();
        float fWidth = (((this.circleOffset * index) + this.innerCircleRadius) - (rect.width() / 2.0f)) + this.extraWidth;
        float height = (getHeight() / 2.0f) + (rect.height() / 2.0f);
        if (!param.getOutstanding()) {
            textOffset = 0.0f;
        }
        canvas.drawText(text, fWidth, height - textOffset, this.textPaint);
    }

    private final int b(String text, Typeface typeface) {
        this.textPaint.setTypeface(typeface);
        Rect rect = new Rect();
        this.textPaint.getTextBounds(text, 0, text.length(), rect);
        return rect.height();
    }

    private final void c() {
        float size = (this.circleParams.size() * this.innerCircleRadius * 2) + ((this.circleParams.size() - 1) * this.circleMargin);
        this.extraWidth = ((float) getWidth()) > size ? (getWidth() - size) / 2.0f : 0.0f;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        List<CircleParam> list = this.circleParams;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (CircleParam circleParam : list) {
            arrayList.add(Integer.valueOf(b(circleParam.getText(), circleParam.getTypeface())));
        }
        Integer num = (Integer) CollectionsKt.maxOrNull((Iterable) arrayList);
        int i = 0;
        int iIntValue = num == null ? 0 : num.intValue();
        Integer num2 = (Integer) CollectionsKt.minOrNull((Iterable) arrayList);
        float fIntValue = (iIntValue - (num2 == null ? 0 : num2.intValue())) / 2.0f;
        for (Object obj : this.circleParams) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            CircleParam circleParam2 = (CircleParam) obj;
            if (circleParam2.getOutstanding()) {
                float f = (this.circleOffset * i) + this.innerCircleRadius + this.extraWidth;
                float height = getHeight() / 2.0f;
                float f2 = this.outCircleRadius;
                Paint paint = this.paint;
                paint.setColor(circleParam2.getCircleColor());
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(NumberExtKt.getDp(1.0f));
                Unit unit = Unit.INSTANCE;
                canvas.drawCircle(f, height, f2, paint);
            }
            float f3 = (this.circleOffset * i) + this.innerCircleRadius + this.extraWidth;
            float height2 = getHeight() / 2.0f;
            float f4 = this.innerCircleRadius;
            Paint paint2 = this.paint;
            paint2.setColor(circleParam2.getCircleColor());
            paint2.setStyle(Paint.Style.FILL);
            Unit unit2 = Unit.INSTANCE;
            canvas.drawCircle(f3, height2, f4, paint2);
            a(canvas, i, fIntValue, circleParam2);
            i = i2;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        c();
    }

    public final void setCircleParam(@NotNull List<CircleParam> params) {
        this.circleParams.clear();
        List<CircleParam> list = this.circleParams;
        if (GlobalFunctionKt.isRtl()) {
            params = CollectionsKt___CollectionsKt.reversed(params);
        }
        list.addAll(params);
        c();
        invalidate();
    }

    @JvmOverloads
    public FemaleCircleListView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.paint = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        this.circleParams = new ArrayList();
        float dp = NumberExtKt.getDp(17.0f);
        this.innerCircleRadius = dp;
        this.outCircleRadius = NumberExtKt.getDp(21.0f);
        float dp2 = NumberExtKt.getDp(16.0f);
        this.circleMargin = dp2;
        this.circleOffset = (dp * 2) + dp2;
        textPaint.setTextSize(NumberExtKt.getSp(14.0f));
        textPaint.setColor(ViewExtKt.loadColor(this, R.color.s1));
    }
}
