package com.garmin.android.apps.connectmobile.activities.charts3.components;

import a7.b;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.highlight.Highlight;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/charts3/components/OverlayCombinedChart;", "Lcom/github/mikephil/charting/charts/CombinedChart;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lcom/github/mikephil/charting/highlight/Highlight;", "highlights", "", "setRectMargins", "([Lcom/github/mikephil/charting/highlight/Highlight;)V", "", "a", "Z", "getBlockOverlay", "()Z", "setBlockOverlay", "(Z)V", "blockOverlay", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class OverlayCombinedChart extends CombinedChart {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public boolean blockOverlay;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f28988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f28989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f28992f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f28993g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f28994h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayCombinedChart(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        Paint paint = new Paint(1);
        this.f28988b = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(b.getColor(context, R.color.gcm_chart_overlay));
        paint.setAlpha(100);
        paint.setPathEffect(null);
        this.f28989c = new Rect();
        this.f28994h = context.getResources().getDimension(R.dimen.gcm3_chart_offset_margin_bottom);
        this.f28993g = (int) context.getResources().getDimension(R.dimen.spacing_normal);
    }

    public final boolean getBlockOverlay() {
        return this.blockOverlay;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public final void highlightValues(Highlight[] highlightArr) {
        List listI0;
        super.highlightValues((highlightArr == null || (listI0 = u.i0(highlightArr)) == null) ? null : (Highlight[]) listI0.toArray(new Highlight[0]));
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        if (this.blockOverlay) {
            int i14 = this.f28991e;
            int i15 = this.f28992f;
            int i16 = this.f28990d;
            Rect rect = this.f28989c;
            rect.set(i14, this.f28993g, i15, i16);
            canvas.drawRect(rect, this.f28988b);
            drawMarkers(canvas);
            this.blockOverlay = false;
        }
    }

    public final void setBlockOverlay(boolean z14) {
        this.blockOverlay = z14;
    }

    public final void setRectMargins(Highlight[] highlights) {
        Highlight highlight;
        highlights.getClass();
        this.blockOverlay = true;
        this.f28990d = (int) ((getViewPortHandler().getChartHeight() - getExtraBottomOffset()) - this.f28994h);
        Highlight highlight2 = (Highlight) u.L(0, highlights);
        if (highlight2 == null || (highlight = (Highlight) u.L(1, highlights)) == null) {
            return;
        }
        this.f28991e = (int) highlight2.getXPx();
        this.f28992f = (int) highlight.getXPx();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OverlayCombinedChart(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OverlayCombinedChart(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ OverlayCombinedChart(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
