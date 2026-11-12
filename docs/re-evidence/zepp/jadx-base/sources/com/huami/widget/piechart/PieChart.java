package com.huami.widget.piechart;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.Key;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import java.util.HashMap;
import java.util.List;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 72\u00020\u0001:\u00017B'\b\u0007\u0012\u0006\u00101\u001a\u000200\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\b\b\u0002\u00104\u001a\u00020\u0012¢\u0006\u0004\b5\u00106J\b\u0010\u0003\u001a\u00020\u0002H\u0002J(\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J(\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0014J\u0012\u0010\u0018\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0014\u0010\u001b\u001a\u00020\u00022\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0019R\u0016\u0010\u001d\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001cR\u001d\u0010\"\u001a\u00020\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010$\u001a\u00020\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b#\u0010!R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010%R\u0016\u0010(\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010'R\u0016\u0010)\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010.¨\u00068"}, d2 = {"Lcom/huami/widget/piechart/PieChart;", "Landroid/view/View;", "", "e", "Landroid/graphics/Canvas;", "canvas", "Lcom/huami/widget/piechart/SliceValue;", "sliceValue", "", "lastAngle", "angle", "c", GoogleApiAvailabilityLight.a, "b", "Landroid/graphics/PointF;", "point", "f", "a", "", "w", "h", "oldw", "oldh", "onSizeChanged", "onDraw", "", "data", "updateData", LogUtil.I, "mDividerWidth", "Landroid/graphics/Paint;", "Lkotlin/Lazy;", "getMPaint", "()Landroid/graphics/Paint;", "mPaint", "getMDividerPaint", "mDividerPaint", "Ljava/util/List;", "mSliceValues", "F", "maxSum", Key.ROTATION, "Landroid/graphics/RectF;", "g", "Landroid/graphics/RectF;", "circleOval", "Landroid/graphics/PointF;", "sliceVector", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "piechart_release"}, k = 1, mv = {1, 4, 0})
public final class PieChart extends View {
    public static final int DEFAULT_START_ROTATION = -90;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int mDividerWidth;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy mPaint;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Lazy mDividerPaint;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private List<SliceValue> mSliceValues;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private float maxSum;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int rotation;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final RectF circleOval;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final PointF sliceVector;
    private HashMap i;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String j = PieChart.class.getSimpleName();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/huami/widget/piechart/PieChart$Companion;", "", "", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "", "DEFAULT_START_ROTATION", LogUtil.I, "<init>", "()V", "piechart_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final String getTAG() {
            return PieChart.j;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

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
            return new Paint();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/graphics/Paint;", "a", "()Landroid/graphics/Paint;"}, k = 3, mv = {1, 4, 0})
    public static final class b extends Lambda implements Function0<Paint> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint invoke() {
            return new Paint();
        }
    }

    @JvmOverloads
    public PieChart(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public PieChart(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PieChart(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void a() {
        float fMin = Math.min(getWidth(), getHeight());
        this.circleOval.set(0.0f, 0.0f, fMin, fMin);
    }

    private final void b(Canvas canvas) {
        if (this.mSliceValues.size() < 2) {
            return;
        }
        int size = this.mSliceValues.size();
        for (int i = 0; i < size; i++) {
            if (this.maxSum == this.mSliceValues.get(i).getValue()) {
                return;
            }
        }
        float f = 360.0f / this.maxSum;
        double d = this.rotation;
        float fWidth = this.circleOval.width() / 2;
        getMDividerPaint().setStrokeWidth(this.mDividerWidth);
        int size2 = this.mSliceValues.size();
        for (int i2 = 0; i2 < size2; i2++) {
            float fAbs = Math.abs(this.mSliceValues.get(i2).getValue() * f);
            this.sliceVector.set((float) Math.cos(Math.toRadians(d)), (float) Math.sin(Math.toRadians(d)));
            f(this.sliceVector);
            canvas.drawLine(this.circleOval.centerX(), this.circleOval.centerY(), (this.sliceVector.x * fWidth) + this.circleOval.centerX(), (this.sliceVector.y * fWidth) + this.circleOval.centerY(), getMDividerPaint());
            d += (double) fAbs;
        }
    }

    private final void c(Canvas canvas, SliceValue sliceValue, float lastAngle, float angle) {
        getMPaint().setColor(sliceValue.getColor());
        canvas.drawArc(this.circleOval, lastAngle, angle, true, getMPaint());
    }

    private final void d(Canvas canvas) {
        float f = 360.0f / this.maxSum;
        float f2 = this.rotation;
        int size = this.mSliceValues.size();
        for (int i = 0; i < size; i++) {
            float fAbs = Math.abs(this.mSliceValues.get(i).getValue() * f);
            c(canvas, this.mSliceValues.get(i), f2, fAbs);
            f2 += fAbs;
        }
    }

    private final void e() {
        getMPaint().setAntiAlias(true);
        getMPaint().setStyle(Paint.Style.FILL);
        getMDividerPaint().setAntiAlias(true);
        getMDividerPaint().setStyle(Paint.Style.STROKE);
        getMDividerPaint().setStrokeCap(Paint.Cap.ROUND);
        getMDividerPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        setLayerType(2, null);
        getMDividerPaint().setColor(0);
    }

    private final void f(PointF point) {
        float length = point.length();
        point.set(point.x / length, point.y / length);
    }

    private final Paint getMDividerPaint() {
        return (Paint) this.mDividerPaint.getValue();
    }

    private final Paint getMPaint() {
        return (Paint) this.mPaint.getValue();
    }

    public void _$_clearFindViewByIdCache() {
        HashMap map = this.i;
        if (map != null) {
            map.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.i == null) {
            this.i = new HashMap();
        }
        View view = (View) this.i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.i.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // android.view.View
    public void onDraw(@Nullable Canvas canvas) {
        this.maxSum = 0.0f;
        int size = this.mSliceValues.size();
        for (int i = 0; i < size; i++) {
            this.maxSum += this.mSliceValues.get(i).getValue();
        }
        if (canvas != null) {
            d(canvas);
            b(canvas);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        a();
    }

    public final void updateData(@NotNull List<SliceValue> data) {
        this.mSliceValues = data;
        invalidate();
    }

    @JvmOverloads
    public PieChart(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mPaint = LazyKt__LazyJVMKt.lazy(b.a);
        this.mDividerPaint = LazyKt__LazyJVMKt.lazy(a.a);
        this.mSliceValues = PieChartDataUtil.INSTANCE.getDefaultPieChartData();
        this.rotation = -90;
        this.circleOval = new RectF();
        this.sliceVector = new PointF();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PieChart);
        this.mDividerWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.PieChart_pie_chart_divider_width, 10);
        typedArrayObtainStyledAttributes.recycle();
        e();
    }
}
