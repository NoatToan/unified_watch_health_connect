package com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.IMarker;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.ViewPortHandler;
import e23.l;
import j00.c;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import p13.u;
import pz.d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017R6\u0010\"\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomLineChart;", "Lcom/github/mikephil/charting/charts/LineChart;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrSet", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "text", "", "setNoDataText", "(Ljava/lang/String;)V", "setNoDataTextDescription", "Lcom/github/mikephil/charting/components/Legend;", "getLegend", "()Lcom/github/mikephil/charting/components/Legend;", "legend", "setLegend", "(Lcom/github/mikephil/charting/components/Legend;)V", "Lkotlin/Function1;", "", "Lcom/github/mikephil/charting/highlight/Highlight;", "Lcom/github/mikephil/charting/data/Entry;", "a", "Le23/l;", "getGetHighlightEntry", "()Le23/l;", "setGetHighlightEntry", "(Le23/l;)V", "getHighlightEntry", "", "f", "Z", "getShouldShowHighlightedOnTop", "()Z", "setShouldShowHighlightedOnTop", "(Z)V", "shouldShowHighlightedOnTop", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CustomLineChart extends LineChart {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f31344h;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public l<? super Highlight[], ? extends Entry> getHighlightEntry;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public StaticLayout f31346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f31347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f31348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f31349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean shouldShowHighlightedOnTop;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Legend f31351g;

    static {
        new a(null);
        f31344h = 8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomLineChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        setImportantForAccessibility(2);
        super.setNoDataText(null);
        Legend legend = this.mLegend;
        legend.getClass();
        this.f31351g = legend;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public final void drawDescription(Canvas canvas) {
        Description description;
        float f14;
        float width;
        if (canvas == null || (description = this.mDescription) == null || !description.isEnabled()) {
            return;
        }
        MPPointF position = this.mDescription.getPosition();
        this.mDescPaint.setTypeface(this.mDescription.getTypeface());
        this.mDescPaint.setTextSize(this.mDescription.getTextSize());
        this.mDescPaint.setColor(this.mDescription.getTextColor());
        this.mDescPaint.setTextAlign(this.mDescription.getTextAlign());
        if (position == null) {
            width = getWidth() / 2.0f;
            f14 = getViewPortHandler().getContentRect().top;
        } else {
            float f15 = position.f52828x;
            f14 = position.f52829y;
            width = f15;
        }
        String text = getDescription().getText();
        if (this.f31346b == null || !s.g(this.f31347c, text)) {
            this.f31347c = text;
            text.getClass();
            int length = text.length();
            Paint paint = this.mDescPaint;
            paint.getClass();
            int i14 = d.f141918a;
            TextPaint textPaint = new TextPaint();
            textPaint.setTypeface(paint.getTypeface());
            textPaint.setTextSize(paint.getTextSize());
            textPaint.setColor(paint.getColor());
            textPaint.setTextAlign(paint.getTextAlign());
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(text, 0, length, textPaint, (int) ((getWidth() - this.mViewPortHandler.offsetRight()) - this.mViewPortHandler.offsetLeft()));
            builderObtain.getClass();
            builderObtain.setAlignment(Layout.Alignment.ALIGN_NORMAL);
            builderObtain.setLineSpacing(0.0f, 1.0f);
            builderObtain.setIncludePad(false);
            StaticLayout staticLayoutBuild = builderObtain.build();
            staticLayoutBuild.getClass();
            this.f31346b = staticLayoutBuild;
        }
        StaticLayout staticLayout = this.f31346b;
        if (staticLayout != null) {
            canvas.save();
            canvas.translate(width, f14 - (staticLayout.getLineCount() == 1 ? staticLayout.getHeight() + 8 : staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
            canvas.restore();
        }
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [com.github.mikephil.charting.interfaces.datasets.IDataSet, java.lang.Object] */
    @Override // com.github.mikephil.charting.charts.Chart
    public final void drawMarkers(Canvas canvas) {
        canvas.getClass();
        if (this.mMarker != null && isDrawMarkersEnabled() && valuesToHighlight()) {
            Entry entry = new Entry();
            int length = this.mIndicesToHighlight.length;
            float f14 = 0.0f;
            float f15 = 0.0f;
            int i14 = 0;
            while (i14 < length) {
                Highlight highlight = this.mIndicesToHighlight[i14];
                ?? dataSetByIndex = ((LineData) this.mData).getDataSetByIndex(highlight.getDataSetIndex());
                dataSetByIndex.getClass();
                Entry entryForHighlight = ((LineData) this.mData).getEntryForHighlight(this.mIndicesToHighlight[i14]);
                entryForHighlight.getClass();
                if (dataSetByIndex.getEntryIndex(entryForHighlight) <= this.mAnimator.getPhaseX() * dataSetByIndex.getEntryCount()) {
                    float[] markerPosition = getMarkerPosition(highlight);
                    if (this.mViewPortHandler.isInBounds(markerPosition[0], MathKt.c(markerPosition[1] * 1000.0f) / 1000.0f)) {
                        f14 += markerPosition[0];
                        f15 = markerPosition[1];
                    }
                }
                i14++;
                entry = entryForHighlight;
            }
            l<? super Highlight[], ? extends Entry> lVar = this.getHighlightEntry;
            if (lVar != null) {
                Object obj = this.mIndicesToHighlight;
                obj.getClass();
                Entry entryInvoke = lVar.invoke(obj);
                if (entryInvoke != null) {
                    entry = entryInvoke;
                }
            }
            IMarker iMarker = this.mMarker;
            Highlight[] highlightArr = this.mIndicesToHighlight;
            highlightArr.getClass();
            iMarker.refreshContent(entry, (Highlight) u.L(0, highlightArr));
            this.mMarker.draw(canvas, f14 / this.mIndicesToHighlight.length, f15);
        }
    }

    public final l<Highlight[], Entry> getGetHighlightEntry() {
        return this.getHighlightEntry;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    /* JADX INFO: renamed from: getLegend, reason: from getter */
    public Legend getF31351g() {
        return this.f31351g;
    }

    public final boolean getShouldShowHighlightedOnTop() {
        return this.shouldShowHighlightedOnTop;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        Context context = getContext();
        context.getClass();
        String str = this.f31348d;
        String str2 = this.f31349e;
        RectF contentRect = getContentRect();
        contentRect.getClass();
        c.a(canvas, context, str, str2, contentRect);
        if (((LineData) getData()) != null && valuesToHighlight() && this.shouldShowHighlightedOnTop) {
            this.mRenderer.drawHighlighted(canvas, this.mIndicesToHighlight);
            drawMarkers(canvas);
        }
    }

    public final void setGetHighlightEntry(l<? super Highlight[], ? extends Entry> lVar) {
        this.getHighlightEntry = lVar;
    }

    public final void setLegend(Legend legend) {
        legend.getClass();
        this.f31351g = legend;
        this.mLegend = legend;
        ViewPortHandler viewPortHandler = this.mViewPortHandler;
        viewPortHandler.getClass();
        this.mLegendRenderer = new a00.c(viewPortHandler, legend);
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void setNoDataText(String text) {
        this.f31348d = text;
    }

    public final void setNoDataTextDescription(String text) {
        this.f31349e = text;
    }

    public final void setShouldShowHighlightedOnTop(boolean z14) {
        this.shouldShowHighlightedOnTop = z14;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomLineChart$a;", "", "<init>", "()V", "", "DESCRIPTION_PADDING", "I", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomLineChart(Context context) {
        super(context);
        context.getClass();
        setImportantForAccessibility(2);
        super.setNoDataText(null);
        Legend legend = this.mLegend;
        legend.getClass();
        this.f31351g = legend;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomLineChart(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        attributeSet.getClass();
        setImportantForAccessibility(2);
        super.setNoDataText(null);
        Legend legend = this.mLegend;
        legend.getClass();
        this.f31351g = legend;
    }
}
