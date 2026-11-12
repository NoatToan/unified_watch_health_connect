package oz;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.chartingv2.charts.CombinedChart;
import com.github.mikephil.chartingv2.components.Legend;
import com.github.mikephil.chartingv2.components.MarkerView;
import com.github.mikephil.chartingv2.data.CombinedData;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.highlight.Highlight;
import com.github.mikephil.chartingv2.renderer.LegendRenderer;
import gz.d;
import o13.e;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@e
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Loz/a;", "Lcom/github/mikephil/chartingv2/charts/CombinedChart;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrSet", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "text", "", "setNoDataText", "(Ljava/lang/String;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends CombinedChart {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2551a f134436a;

    /* JADX INFO: renamed from: oz.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"oz/a$a", "", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2551a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.f134436a = new C2551a();
    }

    public final void a(d dVar, mz.c cVar) {
        Legend legend = dVar;
        if (dVar == null) {
            legend = getLegend();
        }
        this.mLegend = legend;
        LegendRenderer legendRenderer = cVar;
        if (cVar == null) {
            legendRenderer = getLegendRenderer();
        }
        this.mLegendRenderer = legendRenderer;
    }

    @Override // com.github.mikephil.chartingv2.charts.Chart
    public final void drawMarkers(Canvas canvas) {
        Entry entryForHighlight;
        Entry entryCopy;
        if (this.mMarkerView != null && this.mDrawMarkerViews && valuesToHighlight()) {
            int length = this.mIndicesToHighlight.length;
            float f14 = 0.0f;
            float f15 = 0.0f;
            int i14 = 0;
            for (int i15 = 0; i15 < length; i15++) {
                Highlight highlight = this.mIndicesToHighlight[i15];
                int xIndex = highlight.getXIndex();
                float f16 = this.mXAxis.mAxisRange;
                float f17 = xIndex;
                if (f17 <= f16 && f17 <= this.mAnimator.getPhaseX() * f16 && (entryForHighlight = ((CombinedData) this.mData).getEntryForHighlight(this.mIndicesToHighlight[i15])) != null && entryForHighlight.getXIndex() == this.mIndicesToHighlight[i15].getXIndex()) {
                    if (this.f134436a != null) {
                        entryCopy = entryForHighlight.copy();
                        if (entryCopy.getVal() < 0.0f) {
                            entryCopy.setVal(0.0f);
                        }
                    } else {
                        entryCopy = entryForHighlight;
                    }
                    float[] markerPosition = getMarkerPosition(entryCopy, highlight);
                    if (this.mViewPortHandler.isInBounds(markerPosition[0], markerPosition[1])) {
                        i14++;
                        this.mMarkerView.refreshContent(entryForHighlight, highlight);
                        this.mMarkerView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                        MarkerView markerView = this.mMarkerView;
                        markerView.layout(0, 0, markerView.getMeasuredWidth(), this.mMarkerView.getMeasuredHeight());
                        f14 += markerPosition[0];
                        if (markerPosition[1] - this.mMarkerView.getHeight() <= 0.0f) {
                            float height = this.mMarkerView.getHeight();
                            float f18 = markerPosition[1];
                            f15 = (height - f18) + f18;
                        } else {
                            f15 = markerPosition[1];
                        }
                    }
                }
            }
            this.mMarkerView.draw(canvas, f14 / i14, f15);
        }
    }

    @Override // com.github.mikephil.chartingv2.charts.Chart
    public void setNoDataText(String text) {
        text.getClass();
        super.setNoDataText(text);
        getPaint(7).setColor(getContext().getColor(R.color.gcm_text_secondary));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        context.getClass();
        this.f134436a = new C2551a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        attributeSet.getClass();
        this.f134436a = new C2551a();
    }
}
