package qf0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lqf0/b;", "Lh00/b;", "Lcom/github/mikephil/charting/charts/LineChart;", "chart", "Lcom/github/mikephil/charting/utils/Transformer;", "trans", "<init>", "(Lcom/github/mikephil/charting/charts/LineChart;Lcom/github/mikephil/charting/utils/Transformer;)V", "a", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends h00.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Paint f144602m;

    static {
        new a(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(LineChart lineChart, Transformer transformer) {
        lineChart.getClass();
        transformer.getClass();
        ViewPortHandler viewPortHandler = lineChart.getViewPortHandler();
        viewPortHandler.getClass();
        XAxis xAxis = lineChart.getXAxis();
        xAxis.getClass();
        super(viewPortHandler, xAxis, transformer);
        Paint paint = new Paint();
        this.f144602m = paint;
        paint.setColor(a7.b.getColor(lineChart.getContext(), R.color.gcm_chart_grid));
        paint.setStrokeWidth(4.0f);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    public final void drawGridLine(Canvas canvas, float f14, float f15, Path path) {
        float f16 = 5;
        float fWidth = ((this.mGridClippingRect.width() / 3) / f16) / f16;
        for (int i14 = 0; i14 < 25; i14++) {
            int i15 = i14 % 5;
            Paint paint = this.mGridPaint;
            if (i15 == 0) {
                paint.setStrokeWidth(4.0f);
            } else {
                paint.setStrokeWidth(1.0f);
            }
            float f17 = i14 * fWidth;
            super.drawGridLine(canvas, f14 + f17, f15, path);
            super.drawGridLine(canvas, f14 - f17, f15, path);
        }
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    public final void drawLabel(Canvas canvas, String str, float f14, float f15, MPPointF mPPointF, float f16) {
        RectF rectF = this.mGridClippingRect;
        float f17 = rectF.left + 4.0f;
        float f18 = rectF.bottom;
        RectF rectF2 = new RectF(f17, f18, rectF.right - 4.0f, f18 - 4.0f);
        Paint paint = this.f144602m;
        if (canvas != null) {
            canvas.drawRect(rectF2, paint);
        }
        float f19 = 2;
        float f22 = this.mGridClippingRect.bottom;
        RectF rectF3 = new RectF(f14 - f19, f22, f19 + f14, 50 + f22);
        if (canvas != null) {
            canvas.drawRect(rectF3, paint);
        }
        Utils.drawXAxisValue(canvas, str, f14 + 40, f15, this.mAxisLabelPaint, mPPointF, f16);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lqf0/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "GRID_LINE_WIDTH", "F", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
