package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthTransformer;
import com.huawei.ui.commonui.linechart.icommon.HwHealthLineDataProvider;
import com.huawei.ui.commonui.linechart.view.IHwHealthLineDataSet;
import com.huawei.ui.commonui.view.trackview.TrackLineChartHolder;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class frp extends qnq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Path f34447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<TrackLineChartHolder.e> f34448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f34449c;
    private Paint e;
    private Paint h;
    private List<TrackLineChartHolder.e> j;

    @Override // defpackage.qnq
    protected boolean a() {
        return false;
    }

    public frp(HwHealthLineDataProvider hwHealthLineDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler, Context context) {
        super(hwHealthLineDataProvider, chartAnimator, viewPortHandler, context);
        this.e = new Paint();
        this.h = new Paint();
        this.f34447a = new Path();
        this.j = new ArrayList();
        this.f34448b = new ArrayList();
        this.f34449c = 1.0d;
        e();
    }

    private void e() {
        this.e.setAntiAlias(true);
        this.e.setStyle(Paint.Style.FILL);
        this.h.setAntiAlias(true);
        this.h.setTextAlign(Paint.Align.CENTER);
        this.h.setTextSize(Utils.convertDpToPixel(12.0f));
    }

    public void a(List<TrackLineChartHolder.e> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.j = list;
    }

    @Override // defpackage.qnq, com.huawei.ui.commonui.linechart.view.HwHealthLineChartRenderLayerOriginal
    public void drawLinear(Canvas canvas, IHwHealthLineDataSet iHwHealthLineDataSet) {
        int entryCount;
        if (iHwHealthLineDataSet.isDataCalculated() && (entryCount = iHwHealthLineDataSet.getEntryCount()) > 0) {
            iHwHealthLineDataSet.isDrawSteppedEnabled();
            HwHealthTransformer transformer = this.mChart.getTransformer(iHwHealthLineDataSet.getAxisDependencyExt());
            float phaseY = this.mAnimator.getPhaseY();
            this.mRenderPaint.setStyle(Paint.Style.STROKE);
            Canvas canvas2 = this.mBitmapCanvas;
            this.mXBounds.set(this.mChart, iHwHealthLineDataSet);
            int size = iHwHealthLineDataSet.getColors().size();
            if (size > entryCount) {
                double d = ((double) size) / ((double) entryCount);
                this.f34449c = d;
                LogUtil.a("TrackAltitudeLineChartRender", "mColorInterval(", Double.valueOf(d), ") = colorSize:", Integer.valueOf(size), " /entryCount:", Integer.valueOf(entryCount), ";");
            }
            d(canvas2, iHwHealthLineDataSet, transformer, phaseY);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void d(Canvas canvas, IHwHealthLineDataSet iHwHealthLineDataSet, Transformer transformer, float f) {
        for (int i = 0; i < this.j.size(); i++) {
            if (this.j.size() == this.f34448b.size()) {
                LogUtil.a("TrackAltitudeLineChartRender", "transform Point finish");
                break;
            }
            TrackLineChartHolder.e eVar = this.j.get(i);
            HwHealthBaseEntry hwHealthBaseEntry = (HwHealthBaseEntry) iHwHealthLineDataSet.getEntryForIndex((int) (((double) eVar.f24030c) / this.f34449c));
            this.f34448b.add(new TrackLineChartHolder.e(eVar.f24029b, eVar.f24030c, hwHealthBaseEntry.getX(), hwHealthBaseEntry.getY(), Color.argb(102.0f, 0.0f, 0.0f, 0.0f)));
        }
        if (iHwHealthLineDataSet.getColors().size() > 1 && (iHwHealthLineDataSet instanceof qtj)) {
            b((qtj) iHwHealthLineDataSet, transformer, f, canvas);
        } else {
            e(iHwHealthLineDataSet, transformer, f, canvas);
        }
        this.mRenderPaint.setPathEffect(null);
        if (this.f34448b.isEmpty()) {
            return;
        }
        e(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.github.mikephil.charting.data.Entry] */
    private void b(qtj qtjVar, Transformer transformer, float f, Canvas canvas) {
        int[] iArrM = qtjVar.m();
        LogUtil.a("TrackAltitudeLineChartRender", "drawMultiColorLine");
        if (iArrM == null || iArrM.length == 0) {
            e((IHwHealthLineDataSet) qtjVar, transformer, f, canvas);
            return;
        }
        int entryCount = qtjVar.getEntryCount();
        int i = this.mXBounds.min;
        int i2 = this.mXBounds.range;
        int i3 = this.mXBounds.min;
        while (i3 <= i + i2) {
            ?? entryForIndex = i3 != 0 ? qtjVar.getEntryForIndex(i3 - 1) : 0;
            ?? entryForIndex2 = qtjVar.getEntryForIndex(i3);
            if (entryForIndex2 != 0 && entryForIndex != 0) {
                float[] fArr = {entryForIndex.getX(), entryForIndex.getY() * f, entryForIndex2.getX(), entryForIndex2.getY() * f};
                transformer.pointValuesToPixel(fArr);
                if (!this.mViewPortHandler.isInBoundsRight(fArr[0])) {
                    break;
                }
                boolean z = (this.mViewPortHandler.isInBoundsTop(fArr[1]) || this.mViewPortHandler.isInBoundsBottom(fArr[3])) ? false : true;
                if (this.mViewPortHandler.isInBoundsLeft(fArr[2]) && !z) {
                    this.mRenderPaint.setColor(iArrM[Math.min((int) (((double) i3) * this.f34449c), iArrM.length - 1)]);
                    canvas.drawLines(fArr, 0, 4, this.mRenderPaint);
                }
                i3++;
            }
            i3++;
        }
        if (!qtjVar.isDrawFilledEnabled() || entryCount <= 0) {
            return;
        }
        e(qtjVar, transformer, f, canvas);
    }

    private void e(qtj qtjVar, Transformer transformer, float f, Canvas canvas) {
        LogUtil.a("TrackAltitudeLineChartRender", "drawMultiColorFill");
        int[] iArrN = qtjVar.n();
        int[] iArrA = qtjVar.a();
        if (iArrN == null || iArrA == null) {
            LogUtil.a("TrackAltitudeLineChartRender", "startColors or endColors is null");
            return;
        }
        int entryCount = qtjVar.getEntryCount();
        float fContentBottom = this.mViewPortHandler.contentBottom();
        float fContentLeft = this.mViewPortHandler.contentLeft();
        float fContentRight = this.mViewPortHandler.contentRight();
        if (entryCount < 2) {
            LogUtil.a("TrackAltitudeLineChartRender", "entryCount < 2");
        } else {
            c(qtjVar, transformer, f, canvas, entryCount, iArrN, iArrA, fContentLeft, fContentRight, fContentBottom);
            this.e.setShader(null);
        }
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.github.mikephil.charting.data.Entry] */
    private void c(qtj qtjVar, Transformer transformer, float f, Canvas canvas, int i, int[] iArr, int[] iArr2, float f2, float f3, float f4) {
        LogUtil.a("TrackAltitudeLineChartRender", "drawFill");
        int i2 = this.mXBounds.min;
        while (i2 < this.mXBounds.min + this.mXBounds.range && i2 < i - 1) {
            ?? entryForIndex = qtjVar.getEntryForIndex(i2);
            int i3 = i2 + 1;
            ?? entryForIndex2 = qtjVar.getEntryForIndex(i3);
            if (entryForIndex != 0 && entryForIndex2 != 0) {
                float x = entryForIndex.getX();
                float y = entryForIndex.getY();
                float x2 = entryForIndex2.getX();
                float y2 = entryForIndex2.getY();
                int iMin = Math.min((int) (((double) i3) * this.f34449c), iArr.length - 1);
                int i4 = iArr[iMin];
                int i5 = iArr2[iMin];
                float[] fArr = {x, y * f, x2, y2 * f};
                transformer.pointValuesToPixel(fArr);
                float f5 = fArr[0];
                float f6 = fArr[1];
                float f7 = fArr[2];
                float f8 = fArr[3];
                if (f7 >= f2 && f5 <= f3) {
                    this.f34447a.reset();
                    this.f34447a.moveTo(f5, f6);
                    this.f34447a.lineTo(f7, f8);
                    this.f34447a.lineTo(f7, f4);
                    this.f34447a.lineTo(f5, f4);
                    this.f34447a.close();
                    this.e.setShader(new LinearGradient(f5, Math.min(f6, f8), f5, f4, i4, i5, Shader.TileMode.CLAMP));
                    canvas.drawPath(this.f34447a, this.e);
                }
                i2 = i3;
            }
            i2 = i3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.github.mikephil.charting.data.Entry] */
    private void e(IHwHealthLineDataSet iHwHealthLineDataSet, Transformer transformer, float f, Canvas canvas) {
        int i;
        LogUtil.a("TrackAltitudeLineChartRender", "drawSingleColorLine");
        int entryCount = iHwHealthLineDataSet.getEntryCount();
        if (entryCount <= 0 || this.mXBounds.min >= entryCount || iHwHealthLineDataSet.getEntryForIndex(this.mXBounds.min) == null) {
            return;
        }
        int iMin = Math.min(this.mXBounds.min + this.mXBounds.range, entryCount - 1);
        int i2 = this.mXBounds.min;
        int i3 = 0;
        while (i2 <= iMin) {
            ?? entryForIndex = i2 != 0 ? iHwHealthLineDataSet.getEntryForIndex(i2 - 1) : 0;
            ?? entryForIndex2 = iHwHealthLineDataSet.getEntryForIndex(i2);
            if (entryForIndex2 != 0 && entryForIndex != 0) {
                while (true) {
                    i = i3 + 4;
                    if (this.g.length >= i) {
                        break;
                    }
                    float[] fArr = new float[this.g.length * 2];
                    System.arraycopy(this.g, 0, fArr, 0, this.g.length);
                    this.g = fArr;
                }
                this.g[i3] = entryForIndex.getX();
                this.g[i3 + 1] = entryForIndex.getY() * f;
                this.g[i3 + 2] = entryForIndex2.getX();
                this.g[i3 + 3] = entryForIndex2.getY() * f;
                i3 = i;
            }
            i2++;
        }
        e(transformer, canvas, i3);
    }

    private void e(Transformer transformer, Canvas canvas, int i) {
        if (i <= 0) {
            return;
        }
        transformer.pointValuesToPixel(this.g);
        Path path = new Path();
        int i2 = 0;
        while (true) {
            int i3 = i2 * 4;
            int i4 = i3 + 3;
            if (i4 < i) {
                float f = this.g[i3];
                float f2 = this.g[i3 + 1];
                float f3 = this.g[i3 + 2];
                float f4 = this.g[i4];
                if (i2 == 0) {
                    path.moveTo(f, f2);
                }
                path.lineTo(f3, f4);
                i2++;
            } else {
                canvas.drawPath(path, this.mRenderPaint);
                return;
            }
        }
    }

    @Override // defpackage.qnq, com.huawei.ui.commonui.linechart.view.HwHealthLineChartRenderLayerOriginal, com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        super.drawHighlighted(canvas, highlightArr);
    }

    public void e(Canvas canvas) {
        HwHealthTransformer transformer;
        LogUtil.a("TrackAltitudeLineChartRender", "drawSlopeMarkers");
        if (njy.e(this.f34448b)) {
            LogUtil.a("TrackAltitudeLineChartRender", "mNewSlopeMarkers is empty");
            return;
        }
        IHwHealthLineDataSet iHwHealthLineDataSet = this.mChart.getLineData().getDataSets().isEmpty() ? null : (IHwHealthLineDataSet) this.mChart.getLineData().getDataSets().get(0);
        if (iHwHealthLineDataSet == null || (transformer = this.mChart.getTransformer(iHwHealthLineDataSet.getAxisDependencyExt())) == null) {
            return;
        }
        for (TrackLineChartHolder.e eVar : this.f34448b) {
            MPPointD pixelForValues = transformer.getPixelForValues(eVar.d, eVar.e);
            float f = (float) pixelForValues.x;
            float f2 = (float) pixelForValues.y;
            if (this.mViewPortHandler.isInBoundsRight(f) && this.mViewPortHandler.isInBoundsLeft(f)) {
                float fConvertDpToPixel = f2 - Utils.convertDpToPixel(10.0f);
                if (fConvertDpToPixel - Utils.convertDpToPixel(8.0f) < this.mViewPortHandler.contentTop()) {
                    fConvertDpToPixel = this.mViewPortHandler.contentTop() + Utils.convertDpToPixel(8.0f);
                }
                float fConvertDpToPixel2 = Utils.convertDpToPixel(8.0f);
                this.h.setStyle(Paint.Style.FILL);
                this.h.setColor(eVar.f24028a);
                canvas.drawCircle(f, fConvertDpToPixel, fConvertDpToPixel2, this.h);
                this.h.setStyle(Paint.Style.STROKE);
                this.h.setStrokeWidth(Utils.convertDpToPixel(1.0f));
                this.h.setColor(-1);
                canvas.drawCircle(f, fConvertDpToPixel, fConvertDpToPixel2 - Utils.convertDpToPixel(0.5f), this.h);
                this.h.setStyle(Paint.Style.FILL);
                this.h.setColor(-1);
                this.h.setTextSize(Utils.convertDpToPixel(10.0f));
                canvas.drawText(UnitUtil.e(eVar.f24029b, 1, 0), f, fConvertDpToPixel + Utils.convertDpToPixel(4.0f), this.h);
            }
        }
    }
}
