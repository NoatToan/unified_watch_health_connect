package qm;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.chartingv2.charts.LineChart;
import com.github.mikephil.chartingv2.highlight.Highlight;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@o13.e
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lqm/u;", "Lcom/github/mikephil/chartingv2/charts/LineChart;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "blockOverlay", "", "setBlockOverlay", "(Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u extends LineChart {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f145452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f145453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Paint f145454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Rect f145455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f145456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f145457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f145458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f145459h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f145460i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context) {
        super(context);
        context.getClass();
        a(context);
    }

    public final void a(Context context) {
        Resources resources;
        Resources resources2;
        this.f145453b = context;
        Paint paint = new Paint(1);
        this.f145454c = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = this.f145454c;
        if (paint2 != null) {
            Context context2 = this.f145453b;
            context2.getClass();
            paint2.setColor(a7.b.getColor(context2, R.color.gcm_chart_overlay));
        }
        Paint paint3 = this.f145454c;
        if (paint3 != null) {
            paint3.setAlpha(100);
        }
        Paint paint4 = this.f145454c;
        if (paint4 != null) {
            paint4.setPathEffect(null);
        }
        this.f145455d = new Rect();
        Context context3 = this.f145453b;
        this.f145460i = (context3 == null || (resources2 = context3.getResources()) == null) ? 0.0f : resources2.getDimension(R.dimen.gcm3_chart_offset_margin_bottom);
        Context context4 = this.f145453b;
        this.f145459h = (context4 == null || (resources = context4.getResources()) == null) ? 0 : (int) resources.getDimension(R.dimen.spacing_normal);
    }

    public final void b(Highlight[] highlightArr, float f14, float f15, int i14, int i15) {
        Highlight highlight = highlightArr[0];
        if (highlight == null || highlightArr[1] == null) {
            return;
        }
        int xIndex = highlight.getXIndex();
        int xIndex2 = highlightArr[1].getXIndex();
        if (xIndex > i14 && xIndex2 > i14 && xIndex < i15 && xIndex2 < i15) {
            this.f145457f = (int) f14;
            this.f145458g = (int) f15;
            return;
        }
        if (xIndex <= i14) {
            this.f145458g = (int) f15;
            return;
        }
        if (xIndex2 <= i14) {
            this.f145457f = (int) f14;
        } else if (xIndex >= i15) {
            this.f145458g = (int) f15;
        } else if (xIndex2 >= i15) {
            this.f145457f = (int) f14;
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
            if (highlight != null) {
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
        Rect rect;
        canvas.getClass();
        super.onDraw(canvas);
        if (!this.f145452a || (rect = this.f145455d) == null || this.f145454c == null) {
            return;
        }
        rect.getClass();
        rect.set(this.f145457f, this.f145459h, this.f145458g, this.f145456e);
        Rect rect2 = this.f145455d;
        rect2.getClass();
        Paint paint = this.f145454c;
        paint.getClass();
        canvas.drawRect(rect2, paint);
        drawMarkers(canvas);
        this.f145452a = false;
    }

    public final void setBlockOverlay(boolean blockOverlay) {
        this.f145452a = blockOverlay;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        a(context);
    }

    public u(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
    }
}
