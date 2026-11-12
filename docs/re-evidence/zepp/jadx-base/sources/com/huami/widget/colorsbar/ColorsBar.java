package com.huami.widget.colorsbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.squareup.picasso.u;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010I\u001a\u00020H\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010J\u0012\b\b\u0002\u0010L\u001a\u00020\u0006¢\u0006\u0004\bM\u0010NJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J \u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000f\u001a\u00020\nH\u0002J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0014J0\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0014J\u0012\u0010\u001a\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u000e\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bJ\u000e\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0006J\u000e\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0013R\u0016\u0010#\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\"R\u0016\u0010$\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0016\u0010%\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\"R\u0016\u0010'\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010&R\u0016\u0010)\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\"R\u0016\u0010+\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\"R\u0016\u0010-\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\"R\u0016\u0010/\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010\"R\u0016\u00102\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010\"R\u0016\u00107\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001d\u0010=\u001a\u0002088B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001d\u0010B\u001a\u00020>8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010:\u001a\u0004\b@\u0010AR\u001d\u0010G\u001a\u00020C8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010:\u001a\u0004\bE\u0010F¨\u0006O"}, d2 = {"Lcom/huami/widget/colorsbar/ColorsBar;", "Landroid/view/View;", "Landroid/graphics/Canvas;", "canvas", "", "b", "", "getIndicatorColor", "", "text", "", "labelTextCenterX", "c", GoogleApiAvailabilityLight.a, "a", "getValueTextY", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "", u.q, "left", "top", "right", "bottom", "onLayout", "onDraw", "Lcom/huami/widget/colorsbar/ColorsBarData;", "data", "initColorsSection", "value", "updateData", "enable", "enableIndicator", LogUtil.I, "mBarHeight", "mBarDividerWidth", "mBarDividerColor", "F", "mValueTextSize", "e", "mValueTextColor", "f", "mValueTextMargin", "g", "mIndicatorRadius", "h", "mIndicatorStrokeWidth", "i", "Z", "mIndicatorEnable", z.j, "mBarWidth", hl.k, "Lcom/huami/widget/colorsbar/ColorsBarData;", "mData", "Landroid/graphics/Paint;", "l", "Lkotlin/Lazy;", "getMPaint", "()Landroid/graphics/Paint;", "mPaint", "Landroid/graphics/Path;", "m", "getMPath", "()Landroid/graphics/Path;", "mPath", "Landroid/graphics/RectF;", GoogleApiAvailabilityLight.b, "getMRectF", "()Landroid/graphics/RectF;", "mRectF", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "colorsbar_release"}, k = 1, mv = {1, 4, 0})
public final class ColorsBar extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int mBarHeight;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int mBarDividerWidth;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int mBarDividerColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private float mValueTextSize;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int mValueTextColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int mValueTextMargin;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int mIndicatorRadius;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int mIndicatorStrokeWidth;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean mIndicatorEnable;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int mBarWidth;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private ColorsBarData mData;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final Lazy mPaint;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final Lazy mPath;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final Lazy mRectF;
    private HashMap o;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/graphics/Paint;", "a", "()Landroid/graphics/Paint;"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<Paint> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint invoke() {
            return new Paint(1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/graphics/Path;", "a", "()Landroid/graphics/Path;"}, k = 3, mv = {1, 4, 0})
    public static final class b extends Lambda implements Function0<Path> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Path invoke() {
            return new Path();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/graphics/RectF;", "a", "()Landroid/graphics/RectF;"}, k = 3, mv = {1, 4, 0})
    public static final class c extends Lambda implements Function0<RectF> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RectF invoke() {
            return new RectF();
        }
    }

    @JvmOverloads
    public ColorsBar(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public ColorsBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ColorsBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void a(Canvas canvas, String text) {
        canvas.drawText(text, ((getPaddingStart() + this.mIndicatorRadius) + this.mBarWidth) - getMPaint().measureText(text), getValueTextY(), getMPaint());
    }

    private final void b(Canvas canvas) {
        int paddingTop = getPaddingTop() + this.mIndicatorRadius;
        float paddingStart = getPaddingStart() + this.mIndicatorRadius + (((this.mData.getValue() * 1.0f) / this.mData.getRangeValues().get(this.mData.getRangeValues().size() - 1).floatValue()) * this.mBarWidth);
        getMPaint().setColor(getIndicatorColor());
        float f = paddingTop;
        canvas.drawCircle(paddingStart, f, this.mIndicatorRadius, getMPaint());
        getMPaint().setColor(-1);
        canvas.drawCircle(paddingStart, f, this.mIndicatorRadius - this.mIndicatorStrokeWidth, getMPaint());
    }

    private final void c(Canvas canvas, String text, float labelTextCenterX) {
        canvas.drawText(text, (labelTextCenterX - (getMPaint().measureText(text) / 2)) + getPaddingStart() + this.mIndicatorRadius, getValueTextY(), getMPaint());
    }

    private final void d(Canvas canvas, String text) {
        canvas.drawText(text, getPaddingStart() + this.mIndicatorRadius, getValueTextY(), getMPaint());
    }

    private final int getIndicatorColor() {
        int i = 0;
        int iIntValue = this.mData.getRangeColors().get(0).intValue();
        int size = this.mData.getRangeValues().size();
        while (i < size) {
            if (this.mData.getValue() >= this.mData.getRangeValues().get(i).intValue()) {
                iIntValue = i > this.mData.getRangeColors().size() + (-1) ? this.mData.getRangeColors().get(this.mData.getRangeColors().size() - 1).intValue() : this.mData.getRangeColors().get(i).intValue();
            }
            i++;
        }
        return iIntValue;
    }

    private final Paint getMPaint() {
        return (Paint) this.mPaint.getValue();
    }

    private final Path getMPath() {
        return (Path) this.mPath.getValue();
    }

    private final RectF getMRectF() {
        return (RectF) this.mRectF.getValue();
    }

    private final float getValueTextY() {
        return ((getPaddingTop() + (this.mIndicatorRadius * 2)) + this.mValueTextMargin) - getMPaint().getFontMetrics().top;
    }

    public void _$_clearFindViewByIdCache() {
        HashMap map = this.o;
        if (map != null) {
            map.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.o == null) {
            this.o = new HashMap();
        }
        View view = (View) this.o.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.o.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    public final void enableIndicator(boolean enable) {
        this.mIndicatorEnable = enable;
        postInvalidate();
    }

    public final void initColorsSection(@NotNull ColorsBarData data) {
        this.mData = data;
        postInvalidate();
    }

    @Override // android.view.View
    public void onDraw(@Nullable Canvas canvas) {
        if (this.mData.getRangeValues().isEmpty() || this.mData.getRangeColors().isEmpty() || canvas == null) {
            return;
        }
        float f = this.mBarHeight / 2.0f;
        canvas.save();
        int paddingStart = getPaddingStart() + this.mIndicatorRadius;
        float paddingTop = getPaddingTop() + this.mIndicatorRadius;
        int i = this.mBarHeight;
        float f2 = paddingTop - (i / 2);
        float f3 = i + f2;
        getMRectF().set(paddingStart, f2, this.mBarWidth + paddingStart, f3);
        getMPath().addRoundRect(getMRectF(), f, f, Path.Direction.CW);
        canvas.clipPath(getMPath());
        int size = this.mData.getRangeColors().size();
        int i2 = 0;
        while (i2 < size) {
            float fIntValue = i2 == this.mData.getRangeColors().size() - 1 ? this.mBarWidth + paddingStart : paddingStart + (((this.mBarWidth * (i2 == 0 ? this.mData.getRangeValues().get(i2 + 1).intValue() : this.mData.getRangeValues().get(i2 + 1).intValue() - this.mData.getRangeValues().get(i2).intValue())) * 1.0f) / 100);
            getMPaint().setStyle(Paint.Style.FILL);
            getMPaint().setColor(this.mData.getRangeColors().get(i2).intValue());
            canvas.drawRect(paddingStart, f2, fIntValue, f3, getMPaint());
            paddingStart = (int) fIntValue;
            if (i2 < this.mData.getRangeColors().size() - 1) {
                getMPaint().setColor(this.mBarDividerColor);
                getMPaint().setStrokeWidth(this.mBarDividerWidth);
                getMPaint().setStyle(Paint.Style.STROKE);
                float f4 = paddingStart;
                canvas.drawLine(f4, f2, f4, f3, getMPaint());
            }
            i2++;
        }
        canvas.restore();
        if (this.mIndicatorEnable) {
            b(canvas);
        }
        getMPaint().setTextSize(this.mValueTextSize);
        getMPaint().setColor(this.mValueTextColor);
        int size2 = this.mData.getRangeValues().size();
        for (int i3 = 0; i3 < size2; i3++) {
            if (i3 == 0) {
                d(canvas, String.valueOf(this.mData.getRangeValues().get(i3).intValue()));
            } else if (i3 == this.mData.getRangeValues().size() - 1) {
                a(canvas, String.valueOf(this.mData.getRangeValues().get(i3).intValue()));
            } else {
                c(canvas, String.valueOf(this.mData.getRangeValues().get(i3).intValue()), (this.mBarWidth * (this.mData.getRangeValues().get(i3).floatValue() * 1.0f)) / 100);
            }
        }
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.mBarWidth = ((getWidth() - getPaddingStart()) - getPaddingEnd()) - (this.mIndicatorRadius * 2);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        getMPaint().setTextSize(this.mValueTextSize);
        setMeasuredDimension(widthMeasureSpec, View.resolveSize((int) (getPaddingTop() + getPaddingBottom() + this.mValueTextMargin + (this.mIndicatorRadius * 2) + (getMPaint().getFontMetrics().bottom - getMPaint().getFontMetrics().top)), heightMeasureSpec));
    }

    public final void updateData(int value) {
        this.mData.setValue(value);
        postInvalidate();
    }

    @JvmOverloads
    public ColorsBar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mIndicatorRadius = 18;
        this.mIndicatorStrokeWidth = 6;
        this.mIndicatorEnable = true;
        this.mData = ColorsBarDataUtil.INSTANCE.getDefaultData();
        this.mPaint = LazyKt__LazyJVMKt.lazy(a.a);
        this.mPath = LazyKt__LazyJVMKt.lazy(b.a);
        this.mRectF = LazyKt__LazyJVMKt.lazy(c.a);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorsBar);
        this.mBarHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorsBar_colors_bar_height, 20);
        this.mBarDividerWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorsBar_colors_bar_divider_width, 3);
        this.mBarDividerColor = typedArrayObtainStyledAttributes.getColor(R.styleable.ColorsBar_colors_bar_divider_color, -1);
        this.mValueTextSize = typedArrayObtainStyledAttributes.getDimension(R.styleable.ColorsBar_colors_bar_text_size, 14.0f);
        this.mValueTextColor = typedArrayObtainStyledAttributes.getColor(R.styleable.ColorsBar_colors_bar_text_color, -16777216);
        this.mValueTextMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorsBar_colors_bar_text_margin, 0);
        this.mIndicatorRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorsBar_colors_bar_indicator_radius, this.mBarHeight + 4);
        this.mIndicatorStrokeWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorsBar_colors_bar_indicator_stroke_width, 6);
        this.mIndicatorEnable = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ColorsBar_colors_bar_indicator_enable, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
