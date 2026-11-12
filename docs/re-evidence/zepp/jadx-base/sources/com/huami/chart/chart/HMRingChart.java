package com.huami.chart.chart;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.R;
import com.huami.chart.data.ArcChartData;
import com.huami.chart.data.PieDataList;
import com.huami.tools.analytics.DbUtils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.ranges.IntRange;
import kotlin.ranges.e;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 K2\u00020\u0001:\u0002KLB'\b\u0007\u0012\u0006\u0010E\u001a\u00020D\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010F\u0012\b\b\u0002\u0010H\u001a\u00020\u0006¢\u0006\u0004\bI\u0010JJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J$\u0010\u000b\u001a\u00020\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u0002J\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002J(\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0014J\u0012\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014J\f\u0010\u0016\u001a\u00020\b*\u00020\bH\u0004R\u001c\u0010\u001b\u001a\u00020\u00178\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u001cR\"\u0010$\u001a\u00020\u001d8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010+\u001a\u00020\b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R+\u00104\u001a\u00020,2\u0006\u0010-\u001a\u00020,8D@DX\u0084\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R+\u00108\u001a\u00020\b2\u0006\u0010-\u001a\u00020\b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010/\u001a\u0004\b6\u0010(\"\u0004\b7\u0010*R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010?\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010>R+\u0010C\u001a\u00020\b2\u0006\u0010-\u001a\u00020\b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010/\u001a\u0004\bA\u0010(\"\u0004\bB\u0010*¨\u0006M"}, d2 = {"Lcom/huami/chart/chart/HMRingChart;", "Landroid/view/View;", "Lcom/huami/chart/data/PieDataList;", "Lcom/huami/chart/chart/HMRingChart$Gradient;", "b", "", "", "colorList", "", "angelPercentList", "", "a", "pieDataList", "refresh", "w", "h", "oldw", "oldh", "onSizeChanged", "Landroid/graphics/Canvas;", "canvas", "onDraw", "half", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "paint", "Lcom/huami/chart/data/PieDataList;", "", "c", "Z", "getUseCenter", "()Z", "setUseCenter", "(Z)V", "useCenter", GoogleApiAvailabilityLight.a, "F", "getLineWidth", "()F", "setLineWidth", "(F)V", "lineWidth", "Landroid/graphics/RectF;", "<set-?>", "e", "Lkotlin/properties/ReadWriteProperty;", "getRingRectF", "()Landroid/graphics/RectF;", "setRingRectF", "(Landroid/graphics/RectF;)V", "ringRectF", "f", "getRadius", "setRadius", "radius", "Landroid/graphics/Paint$Cap;", "g", "Landroid/graphics/Paint$Cap;", "capType", "", LogUtil.D, "capDegree", "i", "getRotationDegree", "setRotationDegree", "rotationDegree", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "Gradient", "chart_release"}, k = 1, mv = {1, 5, 1})
public class HMRingChart extends View {
    public static final float ROUND_DEGREE = 360.0f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Paint paint;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private PieDataList pieDataList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean useCenter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private float lineWidth;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty ringRectF;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty radius;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private Paint.Cap capType;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private double capDegree;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty rotationDegree;
    public static final /* synthetic */ KProperty<Object>[] j = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(HMRingChart.class), "ringRectF", "getRingRectF()Landroid/graphics/RectF;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(HMRingChart.class), "radius", "getRadius()F")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(HMRingChart.class), "rotationDegree", "getRotationDegree()F"))};

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003J=\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001d¨\u0006\""}, d2 = {"Lcom/huami/chart/chart/HMRingChart$Gradient;", "", "", "component1", "component2", "", "", "component3", "component4", "startAngel", "endAngel", "colorList", "positionList", "copy", "", "toString", "hashCode", "other", "", "equals", "a", "F", "getStartAngel", "()F", "b", "getEndAngel", "c", "Ljava/util/List;", "getColorList", "()Ljava/util/List;", GoogleApiAvailabilityLight.a, "getPositionList", "<init>", "(FFLjava/util/List;Ljava/util/List;)V", "chart_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Gradient {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final float startAngel;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final float endAngel;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @NotNull
        private final List<Integer> colorList;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @NotNull
        private final List<Float> positionList;

        public Gradient(float f, float f2, @NotNull List<Integer> list, @NotNull List<Float> list2) {
            this.startAngel = f;
            this.endAngel = f2;
            this.colorList = list;
            this.positionList = list2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Gradient copy$default(Gradient gradient, float f, float f2, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = gradient.startAngel;
            }
            if ((i & 2) != 0) {
                f2 = gradient.endAngel;
            }
            if ((i & 4) != 0) {
                list = gradient.colorList;
            }
            if ((i & 8) != 0) {
                list2 = gradient.positionList;
            }
            return gradient.copy(f, f2, list, list2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getStartAngel() {
            return this.startAngel;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getEndAngel() {
            return this.endAngel;
        }

        @NotNull
        public final List<Integer> component3() {
            return this.colorList;
        }

        @NotNull
        public final List<Float> component4() {
            return this.positionList;
        }

        @NotNull
        public final Gradient copy(float startAngel, float endAngel, @NotNull List<Integer> colorList, @NotNull List<Float> positionList) {
            return new Gradient(startAngel, endAngel, colorList, positionList);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Gradient)) {
                return false;
            }
            Gradient gradient = (Gradient) other;
            return Intrinsics.areEqual((Object) Float.valueOf(this.startAngel), (Object) Float.valueOf(gradient.startAngel)) && Intrinsics.areEqual((Object) Float.valueOf(this.endAngel), (Object) Float.valueOf(gradient.endAngel)) && Intrinsics.areEqual(this.colorList, gradient.colorList) && Intrinsics.areEqual(this.positionList, gradient.positionList);
        }

        @NotNull
        public final List<Integer> getColorList() {
            return this.colorList;
        }

        public final float getEndAngel() {
            return this.endAngel;
        }

        @NotNull
        public final List<Float> getPositionList() {
            return this.positionList;
        }

        public final float getStartAngel() {
            return this.startAngel;
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.startAngel) * 31) + Float.floatToIntBits(this.endAngel)) * 31) + this.colorList.hashCode()) * 31) + this.positionList.hashCode();
        }

        @NotNull
        public String toString() {
            return "Gradient(startAngel=" + this.startAngel + ", endAngel=" + this.endAngel + ", colorList=" + this.colorList + ", positionList=" + this.positionList + ")";
        }
    }

    @JvmOverloads
    public HMRingChart(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public HMRingChart(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @JvmOverloads
    public HMRingChart(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.useCenter = true;
        this.lineWidth = 10.0f;
        Delegates delegates = Delegates.INSTANCE;
        this.ringRectF = delegates.notNull();
        this.radius = delegates.notNull();
        this.capType = Paint.Cap.BUTT;
        this.rotationDegree = delegates.notNull();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.HMRingChart);
            this.lineWidth = typedArrayObtainStyledAttributes.getDimension(R.styleable.HMRingChart_lineWidth, this.lineWidth);
            setRotationDegree(typedArrayObtainStyledAttributes.getFloat(R.styleable.HMRingChart_rotationDegree, 180.0f));
            this.useCenter = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HMRingChart_useCenter, true);
            int i2 = typedArrayObtainStyledAttributes.getInt(R.styleable.HMRingChart_capType, 0);
            this.capType = i2 != 1 ? i2 != 2 ? Paint.Cap.BUTT : Paint.Cap.SQUARE : Paint.Cap.ROUND;
            typedArrayObtainStyledAttributes.recycle();
        }
        Paint paint = new Paint();
        paint.setStrokeWidth(getLineWidth());
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setStyle(getUseCenter() ? Paint.Style.FILL : Paint.Style.STROKE);
        paint.setStrokeCap(this.capType);
        Unit unit = Unit.INSTANCE;
        this.paint = paint;
    }

    private final void a(List<Integer> colorList, List<Float> angelPercentList) {
        if (this.capType == Paint.Cap.ROUND) {
            colorList.add(colorList.get(0));
            colorList.add(colorList.get(0));
            angelPercentList.set(CollectionsKt__CollectionsKt.getLastIndex(angelPercentList), Float.valueOf(angelPercentList.get(CollectionsKt__CollectionsKt.getLastIndex(angelPercentList)).floatValue() + new BigDecimal(String.valueOf(this.capDegree / ((double) 360.0f))).setScale(1, 0).floatValue()));
            angelPercentList.add(angelPercentList.get(CollectionsKt__CollectionsKt.getLastIndex(angelPercentList)));
            angelPercentList.add(Float.valueOf(1.0f));
        }
    }

    private final Gradient b(PieDataList pieDataList) throws Exception {
        Boolean boolValueOf;
        int size = pieDataList.getSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArcChartData firstData = pieDataList.getFirstData();
        Float fValueOf = firstData == null ? null : Float.valueOf(firstData.getStartAngle());
        ArcChartData lastData = pieDataList.getLastData();
        Float fValueOf2 = lastData == null ? null : Float.valueOf(lastData.getEndAngle());
        if (fValueOf == null || fValueOf2 == null) {
            throw new Exception("请设置有效的角度");
        }
        int i = 0;
        IntRange intRangeUntil = e.until(0, size);
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it2 = intRangeUntil.iterator();
        while (it2.hasNext()) {
            ((IntIterator) it2).nextInt();
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            ArcChartData dataByDataIndex = pieDataList.getDataByDataIndex(i);
            if (dataByDataIndex == null) {
                boolValueOf = null;
            } else {
                arrayList.add(Float.valueOf((dataByDataIndex.getStartAngle() - fValueOf.floatValue()) / 360.0f));
                arrayList.add(Float.valueOf((dataByDataIndex.getEndAngle() - fValueOf.floatValue()) / 360.0f));
                arrayList2.add(Integer.valueOf(dataByDataIndex.getStartColor()));
                boolValueOf = Boolean.valueOf(arrayList2.add(Integer.valueOf(dataByDataIndex.getEndColor())));
            }
            arrayList3.add(boolValueOf);
            i = i2;
        }
        a(arrayList2, arrayList);
        return new Gradient(fValueOf.floatValue(), fValueOf2.floatValue(), arrayList2, arrayList);
    }

    private final float getRadius() {
        return ((Number) this.radius.getValue(this, j[1])).floatValue();
    }

    private final float getRotationDegree() {
        return ((Number) this.rotationDegree.getValue(this, j[2])).floatValue();
    }

    private final void setRadius(float f) {
        this.radius.setValue(this, j[1], Float.valueOf(f));
    }

    private final void setRotationDegree(float f) {
        this.rotationDegree.setValue(this, j[2], Float.valueOf(f));
    }

    public final float getLineWidth() {
        return this.lineWidth;
    }

    @NotNull
    public final Paint getPaint() {
        return this.paint;
    }

    @NotNull
    public final RectF getRingRectF() {
        return (RectF) this.ringRectF.getValue(this, j[0]);
    }

    public final boolean getUseCenter() {
        return this.useCenter;
    }

    public final float half(float f) {
        return f / 2;
    }

    @Override // android.view.View
    public void onDraw(@Nullable Canvas canvas) throws Exception {
        super.onDraw(canvas);
        if (canvas == null) {
            return;
        }
        PieDataList pieDataList = this.pieDataList;
        if (pieDataList != null) {
            canvas.rotate(getRotationDegree(), getRingRectF().centerX(), getRingRectF().centerY());
            Gradient gradientB = b(pieDataList);
            float startAngel = gradientB.getStartAngel();
            float endAngel = gradientB.getEndAngel();
            getPaint().setShader(new SweepGradient(getRingRectF().centerX(), getRingRectF().centerY(), CollectionsKt___CollectionsKt.toIntArray(gradientB.component3()), CollectionsKt___CollectionsKt.toFloatArray(gradientB.component4())));
            canvas.drawArc(getRingRectF(), startAngel, endAngel, getUseCenter(), getPaint());
        }
        if (getLayoutDirection() == 1) {
            setScaleX(-1.0f);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        float fHalf = half(this.lineWidth);
        float measuredWidth = getMeasuredWidth();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        float f = paddingLeft;
        setRadius(half(((measuredWidth - f) - getPaddingRight()) - this.lineWidth));
        float f2 = f + fHalf;
        float f3 = fHalf + paddingTop;
        float f4 = 2;
        setRingRectF(new RectF(f2, f3, (getRadius() * f4) + f2, (getRadius() * f4) + f3));
        if (this.capType == Paint.Cap.ROUND) {
            this.capDegree = Math.toDegrees(Math.asin(half(this.lineWidth) / getRadius()));
        }
    }

    public final void refresh(@NotNull PieDataList pieDataList) {
        this.pieDataList = pieDataList;
        invalidate();
    }

    public final void setLineWidth(float f) {
        this.lineWidth = f;
    }

    public final void setRingRectF(@NotNull RectF rectF) {
        this.ringRectF.setValue(this, j[0], rectF);
    }

    public final void setUseCenter(boolean z) {
        this.useCenter = z;
    }

    public /* synthetic */ HMRingChart(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
