package com.huami.chart.chart;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.R;
import com.huami.chart.data.ArcChartData;
import com.huami.chart.data.PieDataList;
import com.huami.tools.analytics.DbUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010(\u001a\u00020'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\b\b\u0002\u0010+\u001a\u00020\r¢\u0006\u0004\b,\u0010-J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ(\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0014J\u0012\u0010\u0013\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006."}, d2 = {"Lcom/huami/chart/chart/HMPieChart;", "Landroid/view/View;", "Landroid/graphics/Canvas;", "canvas", "Lcom/huami/chart/data/ArcChartData;", "arcChartData", "Landroid/graphics/RectF;", "oval", "", "a", "Lcom/huami/chart/data/PieDataList;", "pieDataList", "refresh", "", "w", "h", "oldw", "oldh", "onSizeChanged", "onDraw", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "paint", "b", "Lcom/huami/chart/data/PieDataList;", "", "c", "Z", "useCenter", "", GoogleApiAvailabilityLight.a, "F", "lineWidth", "e", "Landroid/graphics/RectF;", "rectF", "f", LogUtil.I, "capType", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "chart_release"}, k = 1, mv = {1, 5, 1})
public final class HMPieChart extends View {

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
    @Nullable
    private RectF rectF;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int capType;

    @JvmOverloads
    public HMPieChart(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public HMPieChart(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @JvmOverloads
    public HMPieChart(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.useCenter = true;
        this.capType = Paint.Cap.BUTT.ordinal();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.HMPieChart);
            this.lineWidth = typedArrayObtainStyledAttributes.getDimension(R.styleable.HMPieChart_lineWidth, this.lineWidth);
            this.useCenter = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HMPieChart_useCenter, true);
            this.capType = typedArrayObtainStyledAttributes.getInt(R.styleable.HMPieChart_capType, this.capType);
            typedArrayObtainStyledAttributes.recycle();
        }
        Paint paint = new Paint();
        paint.setStrokeWidth(this.lineWidth);
        paint.setAntiAlias(true);
        paint.setStyle(this.useCenter ? Paint.Style.FILL : Paint.Style.STROKE);
        int i2 = this.capType;
        paint.setStrokeCap(i2 != 1 ? i2 != 2 ? Paint.Cap.BUTT : Paint.Cap.SQUARE : Paint.Cap.ROUND);
        Unit unit = Unit.INSTANCE;
        this.paint = paint;
    }

    private final void a(Canvas canvas, ArcChartData arcChartData, RectF oval) {
        if (arcChartData == null || oval == null) {
            return;
        }
        this.paint.setColor(arcChartData.getStartColor());
        canvas.drawArc(oval, arcChartData.getStartAngle(), arcChartData.getEndAngle(), this.useCenter, this.paint);
    }

    @Override // android.view.View
    public void onDraw(@Nullable Canvas canvas) {
        PieDataList pieDataList;
        super.onDraw(canvas);
        if (canvas == null || (pieDataList = this.pieDataList) == null) {
            return;
        }
        int i = 0;
        IntRange intRangeUntil = e.until(0, pieDataList.getSize());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it2 = intRangeUntil.iterator();
        while (it2.hasNext()) {
            ((IntIterator) it2).nextInt();
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            a(canvas, pieDataList.getDataByDataIndex(i), this.rectF);
            arrayList.add(Unit.INSTANCE);
            i = i2;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        float f = this.lineWidth / 2;
        float measuredWidth = getMeasuredWidth() - f;
        this.rectF = new RectF(f, f, measuredWidth, measuredWidth);
    }

    public final void refresh(@NotNull PieDataList pieDataList) {
        this.pieDataList = pieDataList;
        invalidate();
    }

    public /* synthetic */ HMPieChart(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
