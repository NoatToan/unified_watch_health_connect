package defpackage;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.renderer.BarChartRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.R;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes16.dex */
public class qov extends BarChartRenderer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IBarDataSet f46583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f46584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f46585c;
    private boolean d;
    private boolean e;
    private Paint f;
    private boolean g;
    private Path h;
    private Paint i;
    private float j;
    private float k;
    private float[] m;
    private int n;

    public qov(BarDataProvider barDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(barDataProvider, chartAnimator, viewPortHandler);
        this.i = new Paint(1);
        this.g = false;
        this.d = true;
        this.e = false;
        this.m = new float[2];
    }

    public void c(Canvas canvas) {
        d(canvas, this.f46583a, this.f46585c);
    }

    public void b(Canvas canvas, Transformer transformer) {
        Paint paint = new Paint();
        paint.setColor(this.n);
        paint.setStrokeWidth(1.0f);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        c();
        float[] fArr = this.m;
        fArr[0] = 0.0f;
        fArr[1] = this.j;
        transformer.pointValuesToPixel(fArr);
        if (this.j > 0.0f) {
            Path path = new Path();
            this.h = path;
            path.moveTo(0.0f, this.m[1]);
            this.h.lineTo(canvas.getWidth(), this.m[1]);
            this.f.setColor(this.n);
            canvas.drawPath(this.h, this.f);
            this.h.reset();
        }
    }

    @Override // com.github.mikephil.charting.renderer.BarChartRenderer
    public void drawDataSet(Canvas canvas, IBarDataSet iBarDataSet, int i) {
        this.f46583a = iBarDataSet;
        this.f46585c = i;
    }

    private void d(Canvas canvas, IBarDataSet iBarDataSet, int i) {
        if (iBarDataSet == null) {
            return;
        }
        Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
        this.mBarBorderPaint.setColor(iBarDataSet.getBarBorderColor());
        this.mBarBorderPaint.setStrokeWidth(Utils.convertDpToPixel(iBarDataSet.getBarBorderWidth()));
        if (this.mBarBuffers == null || i >= this.mBarBuffers.length || i < 0) {
            return;
        }
        BarBuffer barBuffer = this.mBarBuffers[i];
        barBuffer.setDataSet(i);
        barBuffer.setInverted(this.mChart.isInverted(iBarDataSet.getAxisDependency()));
        barBuffer.setBarWidth(this.mChart.getBarData().getBarWidth());
        barBuffer.feed(iBarDataSet);
        transformer.pointValuesToPixel(barBuffer.buffer);
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
        b(canvas, transformer);
        c(barBuffer, z, f, canvas, transformer, barBuffer.buffer.length > 1 ? ((barBuffer.buffer[2] - barBuffer.buffer[0]) - this.f46584b) / 2.0f : 0.0f);
        this.d = true;
    }

    private String e(float f) {
        if (this.g) {
            return UnitUtil.e(f, 1, 2);
        }
        return UnitUtil.e(f, 1, 0);
    }

    private void c() {
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setAntiAlias(true);
        this.f.setColor(-256);
        this.f.setStyle(Paint.Style.STROKE);
        this.f.setStrokeWidth(1.0f);
        this.f.setPathEffect(new DashPathEffect(new float[]{6.0f, 6.0f}, 1.0f));
        this.i.setColor(BaseApplication.getContext().getResources().getColor(R.color.textColorPrimary));
        this.i.setTextSize(Utils.convertDpToPixel(10.0f));
    }

    public void c(int i, float f, float f2, float f3, boolean z) {
        this.n = i;
        this.j = f;
        this.k = f2;
        this.f46584b = f3;
        this.g = z;
    }

    public boolean e() {
        return this.e;
    }

    public void a(boolean z) {
        this.e = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void c(BarBuffer barBuffer, boolean z, float f, Canvas canvas, Transformer transformer, float f2) {
        for (int i = 0; i < barBuffer.size(); i += 4) {
            if (this.mViewPortHandler.isInBoundsLeft(barBuffer.buffer[i + 2])) {
                if (!this.mViewPortHandler.isInBoundsRight(barBuffer.buffer[i])) {
                    return;
                }
                if (!z) {
                    this.mRenderPaint.setColor(this.f46583a.getColor(i / 4));
                }
                if (((BarEntry) this.f46583a.getEntryForIndex(i / 4)).getY() >= this.j) {
                    this.mRenderPaint.setColor(this.n);
                } else {
                    this.mRenderPaint.setColor(this.f46583a.getColor());
                }
                if (f == barBuffer.buffer[i + 1] && this.d && this.k > 0.0f) {
                    b(canvas, barBuffer, i, f2);
                    this.d = false;
                }
                a(canvas, transformer, barBuffer, i, f2);
            }
        }
    }

    private void b(Canvas canvas, BarBuffer barBuffer, int i, float f) {
        float fMeasureText = this.i.measureText(e(this.k));
        if (e()) {
            if (LanguageUtil.ba(BaseApplication.getContext())) {
                canvas.drawText(e(this.k), (((barBuffer.buffer[i] + f) - (fMeasureText / 2.0f)) + (this.f46584b / 2.0f)) - Utils.convertDpToPixel(13.0f), barBuffer.buffer[i + 1] - Utils.convertDpToPixel(2.0f), this.i);
                return;
            } else {
                canvas.drawText(e(this.k), ((barBuffer.buffer[i] + f) - (fMeasureText / 2.0f)) + (this.f46584b / 2.0f) + Utils.convertDpToPixel(13.0f), barBuffer.buffer[i + 1] - Utils.convertDpToPixel(2.0f), this.i);
                return;
            }
        }
        canvas.drawText(e(this.k), ((barBuffer.buffer[i] + f) - (fMeasureText / 2.0f)) + (this.f46584b / 2.0f), barBuffer.buffer[i + 1] - Utils.convertDpToPixel(2.0f), this.i);
    }

    private void a(Canvas canvas, Transformer transformer, BarBuffer barBuffer, int i, float f) {
        float[] fArr = {0.0f, 0.0f};
        transformer.pointValuesToPixel(fArr);
        int i2 = i + 1;
        int i3 = i + 2;
        if (fArr[1] > barBuffer.buffer[i2] + (((barBuffer.buffer[i3] - barBuffer.buffer[i]) - (f * 2.0f)) / 2.0f)) {
            canvas.drawArc(new RectF(barBuffer.buffer[i] + f, barBuffer.buffer[i2], barBuffer.buffer[i3] - f, barBuffer.buffer[i2] + this.f46584b), 180.0f, 180.0f, false, this.mRenderPaint);
            canvas.drawRect(barBuffer.buffer[i] + f, barBuffer.buffer[i2] + (this.f46584b / 2.0f), barBuffer.buffer[i3] - f, barBuffer.buffer[i + 3], this.mRenderPaint);
            return;
        }
        Path path = new Path();
        int i4 = i + 3;
        path.moveTo(barBuffer.buffer[i] + f, barBuffer.buffer[i4]);
        path.quadTo((barBuffer.buffer[i] + barBuffer.buffer[i3]) / 2.0f, (barBuffer.buffer[i2] * 2.0f) - barBuffer.buffer[i4], barBuffer.buffer[i3] - f, barBuffer.buffer[i4]);
        canvas.drawPath(path, this.mRenderPaint);
    }
}
