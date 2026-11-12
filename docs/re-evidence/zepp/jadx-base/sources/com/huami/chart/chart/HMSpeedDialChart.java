package com.huami.chart.chart;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.R;
import com.huami.chart.data.ArcChartData;
import com.huami.chart.data.PieDataList;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 62\u00020\u0001:\u00016B'\b\u0007\u0012\u0006\u00100\u001a\u00020/\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000101\u0012\b\b\u0002\u00103\u001a\u00020\u001f¢\u0006\u0004\b4\u00105J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\u00020\n8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R+\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00078B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR+\u0010%\u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\u001f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R+\u0010)\u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\u001f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u0019\u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R\u0016\u0010,\u001a\u00020\u00078\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010+¨\u00067"}, d2 = {"Lcom/huami/chart/chart/HMSpeedDialChart;", "Lcom/huami/chart/chart/HMRingChart;", "Landroid/graphics/Canvas;", "canvas", "", "c", "onDraw", "", "percent", "refresh", "", hl.k, "[I", "colors", "Landroid/graphics/Paint;", "l", "Landroid/graphics/Paint;", "markLinePaint", "m", "Lkotlin/Lazy;", "getDefaultColors", "()[I", "defaultColors", "<set-?>", GoogleApiAvailabilityLight.b, "Lkotlin/properties/ReadWriteProperty;", "getMarkLineDegree", "()F", "setMarkLineDegree", "(F)V", "markLineDegree", "", "o", "getMarkLineColor", "()I", "setMarkLineColor", "(I)V", "markLineColor", com.google.android.exoplayer2.text.ttml.b.r, "getDefaultColor", "setDefaultColor", "defaultColor", DTransferConstants.SEARCH_KEY, "F", "startAngle", "r", "openAngle", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "chart_release"}, k = 1, mv = {1, 5, 1})
public final class HMSpeedDialChart extends HMRingChart {

    @NotNull
    public static final String TAG = "HMSpeedDialChart";
    public static final /* synthetic */ KProperty<Object>[] s;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int[] colors;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Paint markLinePaint;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final Lazy defaultColors;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty markLineDegree;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty markLineColor;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty defaultColor;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final float startAngle;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private float openAngle;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "请设置颜色，或者使用默认颜色";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0015\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<int[]> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int[] invoke() {
            return new int[]{Color.parseColor("#33B3E3"), Color.parseColor("#02AF8D"), Color.parseColor("#FFAB03"), Color.parseColor("#FF8C46"), Color.parseColor("#FF5850")};
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[4];
        kPropertyArr[1] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(HMSpeedDialChart.class), "markLineDegree", "getMarkLineDegree()F"));
        kPropertyArr[2] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(HMSpeedDialChart.class), "markLineColor", "getMarkLineColor()I"));
        kPropertyArr[3] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(HMSpeedDialChart.class), "defaultColor", "getDefaultColor()I"));
        s = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    @JvmOverloads
    public HMSpeedDialChart(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public HMSpeedDialChart(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @JvmOverloads
    public HMSpeedDialChart(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        Object objM3845constructorimpl;
        super(context, attributeSet, i);
        this.defaultColors = LazyKt__LazyJVMKt.lazy(b.a);
        Delegates delegates = Delegates.INSTANCE;
        this.markLineDegree = delegates.notNull();
        this.markLineColor = delegates.notNull();
        this.defaultColor = delegates.notNull();
        this.openAngle = 180.0f;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.HMSpeedDialChart);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HMSpeedDialChart_colors, 0);
            setMarkLineDegree(typedArrayObtainStyledAttributes.getFloat(R.styleable.HMSpeedDialChart_markLineDegree, 5.0f));
            setMarkLineColor(typedArrayObtainStyledAttributes.getColor(R.styleable.HMSpeedDialChart_markLineColor, -1));
            try {
                Result.Companion companion = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(getResources().getIntArray(resourceId));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) != null) {
                HMLog.error$default(TAG, null, null, a.a, 6, null);
                Unit unit = Unit.INSTANCE;
            }
            this.colors = (int[]) (Result.m3850isFailureimpl(objM3845constructorimpl) ? getDefaultColors() : objM3845constructorimpl);
            setDefaultColor(typedArrayObtainStyledAttributes.getColor(R.styleable.HMSpeedDialChart_defaultColor, Color.parseColor("#E8E8E9")));
            typedArrayObtainStyledAttributes.recycle();
        }
        Paint paint = new Paint();
        paint.setStyle(getUseCenter() ? Paint.Style.FILL : Paint.Style.STROKE);
        paint.setColor(getMarkLineColor());
        paint.setStrokeWidth(getLineWidth() + 1);
        paint.setAntiAlias(true);
        Unit unit2 = Unit.INSTANCE;
        this.markLinePaint = paint;
    }

    private final void c(Canvas canvas) {
        float f = this.openAngle;
        int[] iArr = this.colors;
        Objects.requireNonNull(iArr);
        float length = f / iArr.length;
        Objects.requireNonNull(iArr);
        ArrayList arrayList = new ArrayList(iArr.length);
        int length2 = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length2) {
            int i3 = iArr[i];
            int i4 = i2 + 1;
            int[] iArr2 = this.colors;
            Objects.requireNonNull(iArr2);
            if (i2 != ArraysKt___ArraysKt.getLastIndex(iArr2)) {
                canvas.drawArc(getRingRectF(), (i4 * length) - half(getMarkLineDegree()), getMarkLineDegree(), getUseCenter(), this.markLinePaint);
            }
            arrayList.add(Unit.INSTANCE);
            i++;
            i2 = i4;
        }
    }

    private final int getDefaultColor() {
        return ((Number) this.defaultColor.getValue(this, s[3])).intValue();
    }

    private final int[] getDefaultColors() {
        return (int[]) this.defaultColors.getValue();
    }

    private final int getMarkLineColor() {
        return ((Number) this.markLineColor.getValue(this, s[2])).intValue();
    }

    private final float getMarkLineDegree() {
        return ((Number) this.markLineDegree.getValue(this, s[1])).floatValue();
    }

    private final void setDefaultColor(int i) {
        this.defaultColor.setValue(this, s[3], Integer.valueOf(i));
    }

    private final void setMarkLineColor(int i) {
        this.markLineColor.setValue(this, s[2], Integer.valueOf(i));
    }

    private final void setMarkLineDegree(float f) {
        this.markLineDegree.setValue(this, s[1], Float.valueOf(f));
    }

    @Override // com.huami.chart.chart.HMRingChart, android.view.View
    public void onDraw(@Nullable Canvas canvas) throws Exception {
        super.onDraw(canvas);
        if (canvas == null) {
            return;
        }
        c(canvas);
    }

    public final void refresh(float percent) {
        SparseArray sparseArray = new SparseArray();
        float f = this.startAngle;
        float f2 = this.openAngle;
        int[] iArr = this.colors;
        Objects.requireNonNull(iArr);
        float length = f2 / iArr.length;
        float f3 = percent * f2;
        Objects.requireNonNull(iArr);
        ArrayList arrayList = new ArrayList(iArr.length);
        int length2 = iArr.length;
        float f4 = f;
        int i = 0;
        int i2 = 0;
        while (i < length2) {
            int i3 = iArr[i];
            int i4 = i2 + 1;
            if (!(f3 == 0.0f)) {
                if (f3 >= f4 && f3 < f4 + length) {
                    float f5 = i2 * length;
                    float fHalf = half(getMarkLineDegree()) + (((f3 - f5) / length) * (length - getMarkLineDegree())) + f5;
                    int i5 = i2;
                    sparseArray.put(i5, new ArcChartData(i2, f4, fHalf, null, i3, 0, 40, null));
                    sparseArray.put(i4, new ArcChartData(i5, fHalf, this.openAngle - this.startAngle, null, getDefaultColor(), 0, 40, null));
                    break;
                }
                float f6 = f4 + length;
                sparseArray.put(i2, new ArcChartData(i2, f4, f6, null, i3, 0, 40, null));
                arrayList.add(Unit.INSTANCE);
                i++;
                i2 = i4;
                f4 = f6;
            } else {
                sparseArray.put(i2, new ArcChartData(i2, f3, this.openAngle - this.startAngle, null, getDefaultColor(), 0, 40, null));
                break;
            }
        }
        Unit unit = Unit.INSTANCE;
        refresh(new PieDataList(sparseArray));
    }

    public /* synthetic */ HMSpeedDialChart(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
