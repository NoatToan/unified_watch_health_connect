package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.renderer.BarChartRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes41.dex */
public class oyz extends BarChartRenderer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f44996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f44997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f44998c;
    private int d;
    private IBarDataSet e;
    private Path f;
    private float[] g;
    private float h;
    private float i;
    private float j;
    private Transformer m;

    public oyz(BarDataProvider barDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(barDataProvider, chartAnimator, viewPortHandler);
        this.g = new float[2];
    }

    public Transformer e() {
        return this.m;
    }

    private int d() {
        Paint paint = new Paint();
        paint.setTextSize(10.0f);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return ((int) Math.ceil(fontMetrics.descent - fontMetrics.top)) + 2;
    }

    private float a() {
        float f = this.h;
        return (f / 40.0f <= 10.0f || f % 40.0f == 0.0f) ? f : ((((int) f) / 40) + 1) * 40;
    }

    public void e(Canvas canvas) {
        LogUtil.a("WisdomBarChartRenderer", "drawChart()");
        d(canvas, this.e, this.d);
    }

    private void a(Canvas canvas, Transformer transformer) {
        Paint paint = new Paint();
        paint.setColor(this.f44998c.getResources().getColor(R.color.hw_achieve_task_kaka_content_line));
        paint.setStrokeWidth(1.0f);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint(1);
        paint2.setColor(this.f44998c.getResources().getColor(R.color.achieve_kaka_rule_title_two));
        paint2.setTextSize(Utils.convertDpToPixel(10.0f));
        e(canvas, transformer, a(), paint2, paint);
        e(canvas, transformer, (a() * 3.0f) / 4.0f, paint2, paint);
        e(canvas, transformer, a() / 2.0f, paint2, paint);
        e(canvas, transformer, a() / 4.0f, paint2, paint);
        e(canvas, transformer, 0.0f, paint2, paint);
        b();
        float[] fArr = this.g;
        fArr[0] = 0.0f;
        fArr[1] = this.j;
        transformer.pointValuesToPixel(fArr);
        Path path = new Path();
        this.f = path;
        float[] fArr2 = this.g;
        if (fArr2[1] <= 0.0f) {
            fArr2[1] = 1.0f;
        }
        path.moveTo(fArr2[0], fArr2[1]);
        this.f.lineTo(canvas.getWidth(), this.g[1]);
        this.f44996a.setColor(this.f44998c.getResources().getColor(R.color.achieve_color_divide_line));
        canvas.drawPath(this.f, this.f44996a);
        this.f.reset();
    }

    private void e(Canvas canvas, Transformer transformer, float f, Paint paint, Paint paint2) {
        float fConvertDpToPixel = Utils.convertDpToPixel(1.5f);
        Path path = new Path();
        transformer.pointValuesToPixel(new float[]{0.0f, f});
        path.moveTo(0.0f, f);
        path.lineTo(canvas.getWidth(), f);
        canvas.drawText(e(f), 0.0f, f - fConvertDpToPixel, paint);
        canvas.drawPath(path, paint2);
        path.reset();
    }

    @Override // com.github.mikephil.charting.renderer.BarChartRenderer
    public void drawDataSet(Canvas canvas, IBarDataSet iBarDataSet, int i) {
        LogUtil.a("WisdomBarChartRenderer", "mDataSet = null");
        this.e = iBarDataSet;
        this.d = i;
    }

    private void d(Canvas canvas, IBarDataSet iBarDataSet, int i) {
        LogUtil.a("WisdomBarChartRenderer", "resetDrawDataSet()");
        if (iBarDataSet == null) {
            LogUtil.a("WisdomBarChartRenderer", "resetDrawDataSet() mDataSet = null");
            return;
        }
        this.m = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
        this.mBarBorderPaint.setColor(iBarDataSet.getBarBorderColor());
        this.mBarBorderPaint.setStrokeWidth(Utils.convertDpToPixel(iBarDataSet.getBarBorderWidth()));
        BarBuffer barBuffer = this.mBarBuffers[i];
        barBuffer.setDataSet(i);
        barBuffer.setInverted(this.mChart.isInverted(iBarDataSet.getAxisDependency()));
        barBuffer.setBarWidth(this.mChart.getBarData().getBarWidth());
        barBuffer.feed(iBarDataSet);
        this.m.pointValuesToPixel(barBuffer.buffer);
        boolean z = iBarDataSet.getColors().size() == 1;
        if (z) {
            this.mRenderPaint.setColor(iBarDataSet.getColor());
        }
        float f = barBuffer.buffer.length > 0 ? barBuffer.buffer[1] : 0.0f;
        for (int i2 = 1; i2 < barBuffer.size(); i2 += 4) {
            if (barBuffer.buffer[i2] < f) {
                f = barBuffer.buffer[i2];
            }
        }
        LogUtil.d("WisdomBarChartRenderer", "tmpData = ", Float.valueOf(f));
        this.h = (this.i * (((canvas.getHeight() - f) + d()) + Utils.convertDpToPixel(6.0f))) / (canvas.getHeight() - f);
        a(canvas, this.m);
        float f2 = barBuffer.buffer.length > 1 ? ((barBuffer.buffer[2] - barBuffer.buffer[0]) - this.f44997b) / 2.0f : 0.0f;
        for (int i3 = 0; i3 < barBuffer.size(); i3 += 4) {
            if (this.mViewPortHandler.isInBoundsLeft(barBuffer.buffer[i3 + 2])) {
                if (!this.mViewPortHandler.isInBoundsRight(barBuffer.buffer[i3])) {
                    return;
                }
                if (!z) {
                    this.mRenderPaint.setColor(iBarDataSet.getColor(i3 / 4));
                }
                a(barBuffer, canvas, f2, i3);
            }
        }
    }

    private void a(BarBuffer barBuffer, Canvas canvas, float f, int i) {
        float[] fArr = {0.0f, 0.0f};
        this.m.pointValuesToPixel(fArr);
        int i2 = i + 1;
        int i3 = i + 2;
        if (fArr[1] > barBuffer.buffer[i2] + (((barBuffer.buffer[i3] - barBuffer.buffer[i]) - (f * 2.0f)) / 2.0f)) {
            canvas.drawArc(new RectF(barBuffer.buffer[i] + f, barBuffer.buffer[i2], barBuffer.buffer[i3] - f, barBuffer.buffer[i2] + this.f44997b), 180.0f, 180.0f, false, this.mRenderPaint);
            canvas.drawRect(barBuffer.buffer[i] + f, (barBuffer.buffer[i2] + (this.f44997b / 2.0f)) - 1.0f, barBuffer.buffer[i3] - f, barBuffer.buffer[i + 3], this.mRenderPaint);
            return;
        }
        Path path = new Path();
        int i4 = i + 3;
        path.moveTo(barBuffer.buffer[i] + f, barBuffer.buffer[i4]);
        path.quadTo((barBuffer.buffer[i] + barBuffer.buffer[i3]) / 2.0f, (barBuffer.buffer[i2] * 2.0f) - barBuffer.buffer[i4], barBuffer.buffer[i3] - f, barBuffer.buffer[i4]);
        canvas.drawPath(path, this.mRenderPaint);
    }

    private String e(float f) {
        return UnitUtil.e(f, 2, 0);
    }

    private void b() {
        Paint paint = new Paint(1);
        this.f44996a = paint;
        paint.setAntiAlias(true);
        this.f44996a.setStyle(Paint.Style.STROKE);
        this.f44996a.setStrokeWidth(1.0f);
        this.f44996a.setPathEffect(new DashPathEffect(new float[]{0.0f, 0.0f}, 1.0f));
    }
}
