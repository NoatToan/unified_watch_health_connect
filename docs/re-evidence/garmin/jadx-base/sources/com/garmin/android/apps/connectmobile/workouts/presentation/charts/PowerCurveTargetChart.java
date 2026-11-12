package com.garmin.android.apps.connectmobile.workouts.presentation.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.utils.MPPointF;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/charts/PowerCurveTargetChart;", "Lcom/github/mikephil/charting/charts/LineChart;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "a", "Ljava/lang/String;", "getCustomNoDataText", "()Ljava/lang/String;", "setCustomNoDataText", "(Ljava/lang/String;)V", "customNoDataText", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PowerCurveTargetChart extends LineChart {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public String customNoDataText;

    public /* synthetic */ PowerCurveTargetChart(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }

    public final String getCustomNoDataText() {
        return this.customNoDataText;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        String str = this.customNoDataText;
        if (str != null) {
            MPPointF center = getCenter();
            canvas.drawText(str, center.f52828x, center.f52829y, this.mInfoPaint);
        }
    }

    public final void setCustomNoDataText(String str) {
        this.customNoDataText = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PowerCurveTargetChart(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PowerCurveTargetChart(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PowerCurveTargetChart(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
