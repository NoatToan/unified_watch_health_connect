package com.garmin.android.apps.connectmobile.activities.charts.wrapper;

import a7.b;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.chartingv2.charts.CombinedChart;
import com.github.mikephil.chartingv2.highlight.Highlight;
import java.util.ArrayList;
import o13.e;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@e
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/charts/wrapper/OverlayCombinedChart;", "Lcom/github/mikephil/chartingv2/charts/CombinedChart;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class OverlayCombinedChart extends CombinedChart {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f28979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f28980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f28981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f28984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f28985g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f28986h;

    public OverlayCombinedChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.f28980b = paint;
        paint.setStyle(Paint.Style.FILL);
        context.getClass();
        paint.setColor(b.getColor(context, R.color.gcm_chart_overlay));
        paint.setAlpha(100);
        paint.setPathEffect(null);
        this.f28981c = new Rect();
        Resources resources = context.getResources();
        this.f28986h = resources != null ? resources.getDimension(R.dimen.gcm3_chart_offset_margin_bottom) : 0.0f;
        Resources resources2 = context.getResources();
        this.f28985g = resources2 != null ? (int) resources2.getDimension(R.dimen.spacing_normal) : 0;
    }

    public final void a(Highlight[] highlightArr, float f14, float f15, int i14, int i15) {
        Highlight highlight = highlightArr[0];
        if (highlight == null || highlightArr[1] == null) {
            return;
        }
        int xIndex = highlight.getXIndex();
        int xIndex2 = highlightArr[1].getXIndex();
        if (xIndex > i14 && xIndex2 > i14 && xIndex < i15 && xIndex2 < i15) {
            this.f28983e = (int) f14;
            this.f28984f = (int) f15;
            return;
        }
        if (xIndex <= i14) {
            this.f28984f = (int) f15;
            return;
        }
        if (xIndex2 <= i14) {
            this.f28983e = (int) f14;
        } else if (xIndex >= i15) {
            this.f28984f = (int) f15;
        } else if (xIndex2 >= i15) {
            this.f28983e = (int) f14;
        }
    }

    @Override // com.github.mikephil.chartingv2.charts.Chart
    public final void highlightValues(Highlight[] highlightArr) {
        if (highlightArr == null) {
            super.highlightValues(null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Highlight highlight : highlightArr) {
            if (highlight != null && highlight != null) {
                arrayList.add(highlight);
            }
        }
        if (arrayList.isEmpty()) {
            super.highlightValues(null);
        } else {
            super.highlightValues((Highlight[]) arrayList.toArray(new Highlight[0]));
        }
    }

    @Override // com.github.mikephil.chartingv2.charts.BarLineChartBase, com.github.mikephil.chartingv2.charts.Chart, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        if (this.f28979a) {
            Rect rect = this.f28981c;
            rect.getClass();
            rect.set(this.f28983e, this.f28985g, this.f28984f, this.f28982d);
            Paint paint = this.f28980b;
            paint.getClass();
            canvas.drawRect(rect, paint);
            drawMarkers(canvas);
            this.f28979a = false;
        }
    }

    public OverlayCombinedChart(Context context) {
        super(context);
    }

    public OverlayCombinedChart(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
    }
}
