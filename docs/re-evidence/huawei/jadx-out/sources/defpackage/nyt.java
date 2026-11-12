package defpackage;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.renderer.YAxisRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class nyt extends YAxisRenderer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<qml> f43971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f43972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f43973c;
    private float d;
    private float e;
    private float[] h;

    public nyt(ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
        super(viewPortHandler, yAxis, transformer);
        this.h = new float[5];
        yAxis.setLabelCount(5, true);
    }

    public void a(List<qml> list) {
        this.f43971a = list;
    }

    public void c(float f, float f2, float f3, float f4) {
        this.e = f;
        this.d = f2;
        this.f43973c = f3;
        this.f43972b = f4;
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderGridLines(Canvas canvas) {
        if (canvas == null || this.mYAxis == null) {
            LogUtil.j("HeartRateControlSportYaxisRender", "renderGridLines base is null");
            return;
        }
        if (!this.mYAxis.isEnabled()) {
            LogUtil.j("HeartRateControlSportYaxisRender", "Yaxis invalid");
            return;
        }
        if (this.mYAxis.isDrawGridLinesEnabled()) {
            canvas.clipRect(new RectF(0.0f, 0.0f, this.mViewPortHandler.getChartWidth(), this.mViewPortHandler.getChartHeight()));
            this.mGridPaint.setColor(this.mYAxis.getGridColor());
            this.mGridPaint.setStrokeWidth(this.d);
            this.mGridPaint.setStyle(Paint.Style.STROKE);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{this.f43973c, this.f43972b}, 0.0f);
            this.h = new float[5];
            if (this.mYAxis.mEntries.length < 2) {
                LogUtil.a("HeartRateControlSportYaxisRender", "mYAxis.mEntries.length is invalid ", Integer.valueOf(this.mYAxis.mEntries.length));
                return;
            }
            float f = (this.mYAxis.mEntries[this.mYAxis.mEntries.length - 1] - this.mYAxis.mEntries[0]) / 4.0f;
            for (int i = 0; i < 5; i++) {
                this.h[i] = this.mYAxis.mEntries[0] + (i * f);
                float[] fArr = {0.0f, (float) Math.floor(this.h[i])};
                this.mTrans.pointValuesToPixel(fArr);
                this.mRenderGridLinesPath.reset();
                if (i == 0) {
                    this.mGridPaint.setPathEffect(null);
                } else {
                    this.mGridPaint.setPathEffect(dashPathEffect);
                }
                canvas.drawPath(a(this.mRenderGridLinesPath, fArr[1]), this.mGridPaint);
            }
            a(canvas);
        }
    }

    private void a(Canvas canvas) {
        List<qml> list = this.f43971a;
        if (list == null || list.size() < 1) {
            LogUtil.j("HeartRateControlSportYaxisRender", "HeartRateIntervalArea is null");
            return;
        }
        float axisMaximum = this.mYAxis.getAxisMaximum();
        float axisMinimum = this.mYAxis.getAxisMinimum();
        this.mGridPaint.setStyle(Paint.Style.FILL);
        this.mGridPaint.setPathEffect(null);
        for (qml qmlVar : this.f43971a) {
            if (qmlVar.c() < 0.0f || qmlVar.e() > axisMaximum || qmlVar.b() < axisMinimum) {
                LogUtil.j("HeartRateControlSportYaxisRender", "drawRecommendInterval area data invalid");
            } else {
                this.mGridPaint.setColor(qmlVar.a());
                float[] fArr = {qmlVar.c(), qmlVar.e(), qmlVar.d(), qmlVar.b()};
                this.mTrans.pointValuesToPixel(fArr);
                canvas.drawRect(new RectF(fArr[0], fArr[1], fArr[2], fArr[3]), this.mGridPaint);
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer
    public void drawYLabels(Canvas canvas, float f, float[] fArr, float f2) {
        if (this.mGetTransformedPositionsBuffer.length != 10) {
            this.mGetTransformedPositionsBuffer = new float[10];
        }
        float[] fArr2 = this.mGetTransformedPositionsBuffer;
        for (int i = 0; i < fArr2.length; i += 2) {
            fArr2[i + 1] = this.h[i / 2];
        }
        this.mTrans.pointValuesToPixel(fArr2);
        float fA = a();
        this.mAxisLabelPaint.setTextAlign(Paint.Align.LEFT);
        float f3 = this.e;
        for (int i2 = 0; i2 < 5; i2++) {
            canvas.drawText(d(i2), f3, fArr2[(i2 * 2) + 1] + fA, this.mAxisLabelPaint);
        }
    }

    private String d(int i) {
        if (i < 0 || i >= this.h.length) {
            return "";
        }
        return this.mYAxis.getValueFormatter().getFormattedValue(this.h[i], this.mAxis);
    }

    protected Path a(Path path, float f) {
        float f2 = this.e;
        float fContentRight = this.mViewPortHandler.contentRight();
        path.moveTo(f2, f);
        path.lineTo(fContentRight, f);
        return path;
    }

    protected float a() {
        Paint.FontMetrics fontMetrics = this.mAxisLabelPaint.getFontMetrics();
        return ((fontMetrics.bottom - fontMetrics.top) * (-1.0f)) + (fontMetrics.top * (-1.0f));
    }
}
