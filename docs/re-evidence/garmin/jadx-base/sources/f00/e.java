package f00;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IFillFormatter;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer;
import com.github.mikephil.charting.renderer.LineChartRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lf00/e;", "Lcom/github/mikephil/charting/renderer/LineChartRenderer;", "Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;", "chart", "Lcom/github/mikephil/charting/animation/ChartAnimator;", "animator", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "", "shouldDrawSkippedValuesAsDefaultValue", "Lf00/e$b$a;", "filter", "<init>", "(Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;Lcom/github/mikephil/charting/animation/ChartAnimator;Lcom/github/mikephil/charting/utils/ViewPortHandler;ZLf00/e$b$a;)V", "c", "b", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class e extends LineChartRenderer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LineDataProvider f67657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f67658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b.a f67659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[] f67660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f67661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap<IDataSet<?>, c> f67662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f67663g;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"f00/e$a", "Lf00/e$b$a;", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements b.a {
        @Override // f00.e.b.a
        public final boolean a(Entry entry, ILineDataSet iLineDataSet) {
            entry.getClass();
            return entry.getY() == 0.0f;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf00/e$c;", "", "<init>", "(Lf00/e;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Path f67664a = new Path();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Bitmap[] f67665b;

        public c() {
        }
    }

    static {
        new b(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(LineDataProvider lineDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler, boolean z14, b.a aVar) {
        super(lineDataProvider, chartAnimator, viewPortHandler);
        lineDataProvider.getClass();
        chartAnimator.getClass();
        viewPortHandler.getClass();
        aVar.getClass();
        this.f67657a = lineDataProvider;
        this.f67658b = z14;
        this.f67659c = aVar;
        this.f67660d = new float[4];
        this.f67661e = new float[2];
        this.f67662f = new HashMap<>();
    }

    public final boolean a(Entry entry, ILineDataSet iLineDataSet) {
        return entry == null || this.f67659c.a(entry, iLineDataSet);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x014c A[LOOP:2: B:53:0x014c->B:69:0x01ae, LOOP_START, PHI: r1
      0x014c: PHI (r1v8 int) = (r1v7 int), (r1v9 int) binds: [B:52:0x014a, B:69:0x01ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0154  */
    /* JADX WARN: Code duplicated, block: B:58:0x015a  */
    /* JADX WARN: Code duplicated, block: B:60:0x0175  */
    /* JADX WARN: Code duplicated, block: B:64:0x0189  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ae A[LOOP:2: B:53:0x014c->B:69:0x01ae, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x01b1 A[EDGE_INSN: B:74:0x01b1->B:70:0x01b1 BREAK  A[LOOP:2: B:53:0x014c->B:69:0x01ae], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x004d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x004d A[SYNTHETIC] */
    @Override // com.github.mikephil.charting.renderer.LineChartRenderer
    public final void drawCircles(Canvas canvas) {
        int i14;
        int i15;
        int i16;
        c cVar;
        int i17;
        int i18;
        Entry entryForIndex;
        this.mRenderPaint.setStyle(Paint.Style.FILL);
        float phaseY = this.mAnimator.getPhaseY();
        float[] fArr = this.f67661e;
        int i19 = 0;
        float f14 = 0.0f;
        fArr[0] = 0.0f;
        int i24 = 1;
        fArr[1] = 0.0f;
        List dataSets = this.mChart.getLineData().getDataSets();
        int size = dataSets.size();
        int i25 = 0;
        while (i25 < size) {
            ILineDataSet iLineDataSet = (ILineDataSet) dataSets.get(i25);
            if (iLineDataSet.isVisible() && iLineDataSet.isDrawCirclesEnabled() && iLineDataSet.getEntryCount() != 0) {
                this.mCirclePaintInner.setColor(iLineDataSet.getCircleHoleColor());
                Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
                this.mXBounds.set(this.mChart, iLineDataSet);
                float circleRadius = iLineDataSet.getCircleRadius();
                float circleHoleRadius = iLineDataSet.getCircleHoleRadius();
                int i26 = (!iLineDataSet.isDrawCircleHoleEnabled() || circleHoleRadius >= circleRadius || circleHoleRadius <= f14) ? i19 : i24;
                int i27 = (i26 == 0 || iLineDataSet.getCircleHoleColor() != 1122867) ? i19 : i24;
                HashMap<IDataSet<?>, c> map = this.f67662f;
                if (map.containsKey(iLineDataSet)) {
                    cVar = map.get(iLineDataSet);
                    if (cVar == null) {
                        cVar = new c();
                    }
                } else {
                    c cVar2 = new c();
                    map.put(iLineDataSet, cVar2);
                    cVar = cVar2;
                }
                int circleColorCount = iLineDataSet.getCircleColorCount();
                i14 = i19;
                Bitmap[] bitmapArr = cVar.f67665b;
                if (bitmapArr == null) {
                    cVar.f67665b = new Bitmap[circleColorCount];
                } else {
                    if (bitmapArr.length != circleColorCount) {
                        cVar.f67665b = new Bitmap[circleColorCount];
                    }
                    i15 = size;
                    i16 = i25;
                    BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
                    int i28 = xBounds.range;
                    i17 = xBounds.min;
                    i18 = i28 + i17;
                    if (i17 <= i18) {
                        while (true) {
                            entryForIndex = iLineDataSet.getEntryForIndex(i17);
                            if (entryForIndex != null) {
                                if (!a(entryForIndex, iLineDataSet)) {
                                    fArr[i14] = entryForIndex.getX();
                                    fArr[i24] = entryForIndex.getY() * phaseY;
                                    transformer.pointValuesToPixel(fArr);
                                    if (this.mViewPortHandler.isInBoundsRight(fArr[i14])) {
                                        if (!this.mViewPortHandler.isInBoundsLeft(fArr[i14]) && this.mViewPortHandler.isInBoundsY(fArr[i24])) {
                                            Bitmap[] bitmapArr2 = cVar.f67665b;
                                            bitmapArr2.getClass();
                                            Bitmap[] bitmapArr3 = cVar.f67665b;
                                            bitmapArr3.getClass();
                                            Bitmap bitmap = bitmapArr2[i17 % bitmapArr3.length];
                                            if (bitmap != null) {
                                                canvas.getClass();
                                                canvas.drawBitmap(bitmap, fArr[i14] - circleRadius, fArr[i24] - circleRadius, (Paint) null);
                                            }
                                        }
                                    }
                                }
                                if (i17 != i18) {
                                    break;
                                } else {
                                    i17++;
                                }
                            }
                        }
                    }
                    i25 = i16 + 1;
                    i19 = i14;
                    i24 = i24;
                    phaseY = phaseY;
                    dataSets = dataSets;
                    size = i15;
                    f14 = 0.0f;
                }
                Path path = cVar.f67664a;
                e eVar = e.this;
                int circleColorCount2 = iLineDataSet.getCircleColorCount();
                float circleRadius2 = iLineDataSet.getCircleRadius();
                float circleHoleRadius2 = iLineDataSet.getCircleHoleRadius();
                int i29 = i14;
                while (i29 < circleColorCount2) {
                    int i30 = circleColorCount2;
                    int i34 = size;
                    int i35 = i25;
                    int i36 = (int) (((double) circleRadius2) * 2.1d);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i36, i36, Bitmap.Config.ARGB_4444);
                    bitmapCreateBitmap.getClass();
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    Bitmap[] bitmapArr4 = cVar.f67665b;
                    if (bitmapArr4 != null) {
                        bitmapArr4[i29] = bitmapCreateBitmap;
                    }
                    eVar.mRenderPaint.setColor(iLineDataSet.getCircleColor(i29));
                    if (i27 != 0) {
                        path.reset();
                        path.addCircle(circleRadius2, circleRadius2, circleRadius2, Path.Direction.CW);
                        path.addCircle(circleRadius2, circleRadius2, circleHoleRadius2, Path.Direction.CCW);
                        canvas2.drawPath(path, eVar.mRenderPaint);
                    } else {
                        canvas2.drawCircle(circleRadius2, circleRadius2, circleRadius2, eVar.mRenderPaint);
                        if (i26 != 0) {
                            canvas2.drawCircle(circleRadius2, circleRadius2, circleHoleRadius2, eVar.mCirclePaintInner);
                        }
                    }
                    i29++;
                    circleColorCount2 = i30;
                    size = i34;
                    i25 = i35;
                }
                i15 = size;
                i16 = i25;
                BarLineScatterCandleBubbleRenderer.XBounds xBounds2 = this.mXBounds;
                int i210 = xBounds2.range;
                i17 = xBounds2.min;
                i18 = i210 + i17;
                if (i17 <= i18) {
                    while (true) {
                        entryForIndex = iLineDataSet.getEntryForIndex(i17);
                        if (entryForIndex != null) {
                            if (!a(entryForIndex, iLineDataSet)) {
                                fArr[i14] = entryForIndex.getX();
                                fArr[i24] = entryForIndex.getY() * phaseY;
                                transformer.pointValuesToPixel(fArr);
                                if (this.mViewPortHandler.isInBoundsRight(fArr[i14])) {
                                    if (!this.mViewPortHandler.isInBoundsLeft(fArr[i14])) {
                                    }
                                }
                            }
                            if (i17 != i18) {
                                break;
                                break;
                            }
                            i17++;
                        }
                    }
                }
                i25 = i16 + 1;
                i19 = i14;
                i24 = i24;
                phaseY = phaseY;
                dataSets = dataSets;
                size = i15;
                f14 = 0.0f;
            } else {
                phaseY = phaseY;
                i14 = i19;
                i24 = i24;
                dataSets = dataSets;
                i15 = size;
                i16 = i25;
            }
            i25 = i16 + 1;
            i19 = i14;
            i24 = i24;
            phaseY = phaseY;
            dataSets = dataSets;
            size = i15;
            f14 = 0.0f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r4v17, types: [com.github.mikephil.charting.data.Entry, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r5v22, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r6v9, types: [com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.renderer.LineChartRenderer
    public final void drawDataSet(Canvas canvas, ILineDataSet iLineDataSet) {
        int entryIndex;
        ?? r14;
        float x14;
        Object entryForIndex;
        if (iLineDataSet != null) {
            boolean z14 = iLineDataSet instanceof xz.d;
            Paint paint = this.mRenderPaint;
            if (z14) {
                paint.setShader(((xz.d) iLineDataSet).f192733a);
            } else {
                paint.setShader(null);
            }
            super.drawDataSet(canvas, iLineDataSet);
            int entryCount = iLineDataSet.getEntryCount();
            ArrayList<Entry> arrayList = new ArrayList();
            if (entryCount > 1) {
                int i14 = 0;
                while (i14 < entryCount) {
                    ?? entryForIndex2 = iLineDataSet.getEntryForIndex(i14);
                    entryForIndex2.getClass();
                    if (!a(entryForIndex2, iLineDataSet)) {
                        ?? entryForIndex3 = i14 > 0 ? iLineDataSet.getEntryForIndex(i14 - 1) : null;
                        ?? entryForIndex4 = i14 < entryCount + (-1) ? iLineDataSet.getEntryForIndex(i14 + 1) : null;
                        if (a(entryForIndex3, iLineDataSet) && a(entryForIndex4, iLineDataSet)) {
                            arrayList.add(entryForIndex2);
                        }
                    }
                    i14++;
                }
            } else if (entryCount == 1) {
                arrayList.add(iLineDataSet.getEntryForIndex(0));
            }
            boolean z15 = iLineDataSet.getMode() == LineDataSet.Mode.STEPPED;
            boolean zIsDrawFilledEnabled = iLineDataSet.isDrawFilledEnabled();
            if (arrayList.isEmpty()) {
                return;
            }
            Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
            transformer.getClass();
            this.mRenderPaint.setColor(iLineDataSet.getColor());
            this.mRenderPaint.setStyle(Paint.Style.FILL);
            if (!z15) {
                float lineWidth = iLineDataSet.getLineWidth() / 2;
                for (Entry entry : arrayList) {
                    float[] fArr = {entry.getX(), entry.getY()};
                    transformer.pointValuesToPixel(fArr);
                    Canvas canvas2 = this.mBitmapCanvas;
                    float f14 = fArr[0];
                    float f15 = fArr[1];
                    canvas2.drawRect(f14 - lineWidth, f15 - lineWidth, f14 + lineWidth, f15 + lineWidth, this.mRenderPaint);
                }
                return;
            }
            if (!zIsDrawFilledEnabled) {
                for (Entry entry2 : arrayList) {
                    if (iLineDataSet.getEntryIndex(entry2) < iLineDataSet.getEntryCount()) {
                        int entryIndex2 = iLineDataSet.getEntryIndex(entry2) + 1;
                        if (entryIndex2 < iLineDataSet.getEntryCount()) {
                            entryForIndex = iLineDataSet.getEntryForIndex(entryIndex2);
                        } else {
                            r14 = 0;
                        }
                        if (r14 != 0) {
                            r14 = entryForIndex;
                            x14 = r14.getX();
                        } else {
                            r14 = entryForIndex;
                            x14 = entry2.getX() + 1;
                        }
                        float phaseY = this.mAnimator.getPhaseY();
                        float[] fArr2 = {entry2.getX(), entry2.getY() * phaseY};
                        float[] fArr3 = {x14, entry2.getY() * phaseY};
                        transformer.pointValuesToPixel(fArr2);
                        transformer.pointValuesToPixel(fArr3);
                        if (canvas != null) {
                            canvas.drawLine(fArr2[0], fArr2[1], fArr3[0], fArr3[1], this.mRenderPaint);
                        }
                    }
                }
                return;
            }
            for (Entry entry3 : arrayList) {
                if (iLineDataSet.getEntryIndex(entry3) < iLineDataSet.getEntryCount() && (entryIndex = iLineDataSet.getEntryIndex(entry3) + 1) < iLineDataSet.getEntryCount()) {
                    ?? entryForIndex5 = iLineDataSet.getEntryForIndex(entryIndex);
                    float x15 = entryForIndex5 != 0 ? entryForIndex5.getX() : entry3.getX() + 1;
                    float yChartMin = this.f67663g ? this.mChart.getYChartMin() : iLineDataSet.getFillFormatter().getFillLinePosition(iLineDataSet, this.mChart);
                    float phaseY2 = this.mAnimator.getPhaseY();
                    Path path = new Path();
                    path.reset();
                    path.moveTo(entry3.getX(), yChartMin);
                    path.lineTo(entry3.getX(), entry3.getY() * phaseY2);
                    path.lineTo(x15, entry3.getY() * phaseY2);
                    path.lineTo(x15, yChartMin);
                    path.close();
                    transformer.pathValueToPixel(path);
                    Drawable fillDrawable = iLineDataSet.getFillDrawable();
                    if (fillDrawable != null) {
                        drawFilledPath(canvas, path, fillDrawable);
                    } else {
                        drawFilledPath(canvas, path, iLineDataSet.getFillColor(), iLineDataSet.getFillAlpha());
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.LineChartRenderer
    public final void drawLinear(Canvas canvas, ILineDataSet iLineDataSet) {
        boolean z14;
        int i14;
        float f14;
        char c14;
        char c15;
        int i15;
        float y14;
        float y15;
        float y16;
        Entry entry;
        float y17;
        int i16;
        canvas.getClass();
        iLineDataSet.getClass();
        int entryCount = iLineDataSet.getEntryCount();
        boolean z15 = iLineDataSet.getMode() == LineDataSet.Mode.STEPPED;
        int i17 = z15 ? 4 : 2;
        Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
        float phaseY = this.mAnimator.getPhaseY();
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        Canvas canvas2 = iLineDataSet.isDashedLineEnabled() ? this.mBitmapCanvas : canvas;
        this.mXBounds.set(this.mChart, iLineDataSet);
        if (!iLineDataSet.isDrawFilledEnabled() || entryCount <= 0) {
            z14 = z15;
            i14 = i17;
            f14 = phaseY;
            c14 = 4;
            c15 = 2;
            i15 = 0;
        } else {
            Transformer transformer2 = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
            ArrayList arrayList = new ArrayList();
            BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
            int i18 = xBounds.min;
            int i19 = xBounds.range + i18;
            if (i18 <= i19) {
                c14 = 4;
                int i24 = -1;
                int i25 = -1;
                c15 = 2;
                i15 = 0;
                while (true) {
                    Entry entryForIndex = iLineDataSet.getEntryForIndex(i18);
                    b.a aVar = this.f67659c;
                    if (i25 == i24 && entryForIndex != null && !aVar.a(entryForIndex, iLineDataSet)) {
                        z14 = z15;
                        i16 = i24;
                        i25 = i18;
                    } else if (i25 == i24 || !a(entryForIndex, iLineDataSet)) {
                        BarLineScatterCandleBubbleRenderer.XBounds xBounds2 = this.mXBounds;
                        z14 = z15;
                        if (i18 != xBounds2.range + xBounds2.min || entryForIndex == null || aVar.a(entryForIndex, iLineDataSet)) {
                            i16 = -1;
                        } else {
                            i16 = -1;
                            if (i25 != -1) {
                                arrayList.add(new p(Integer.valueOf(i25), Integer.valueOf(i18)));
                            }
                        }
                    } else if (i25 != i18 - 1) {
                        arrayList.add(new p(Integer.valueOf(i25), Integer.valueOf(i18)));
                        z14 = z15;
                        i16 = i24;
                        i25 = i16;
                    } else {
                        z14 = z15;
                        i16 = i24;
                    }
                    if (i18 == i19) {
                        break;
                    }
                    i18++;
                    i24 = i16;
                    z15 = z14;
                }
            } else {
                z14 = z15;
                c14 = 4;
                c15 = 2;
                i15 = 0;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                p pVar = (p) it.next();
                int iIntValue = ((Number) pVar.f128594a).intValue();
                int iIntValue2 = ((Number) pVar.f128595b).intValue();
                Path path = new Path();
                float phaseY2 = this.mAnimator.getPhaseY();
                int i26 = iLineDataSet.getMode() == LineDataSet.Mode.STEPPED ? 1 : i15;
                Entry entryForIndex2 = iLineDataSet.getEntryForIndex(iIntValue);
                IFillFormatter fillFormatter = iLineDataSet.getFillFormatter();
                Iterator it3 = it;
                Entry entryForIndex3 = null;
                yz.a aVar2 = fillFormatter instanceof yz.a ? (yz.a) fillFormatter : null;
                List<Entry> listA = aVar2 != null ? aVar2.a() : null;
                float yChartMin = this.f67663g ? this.mChart.getYChartMin() : iLineDataSet.getFillFormatter().getFillLinePosition(iLineDataSet, this.mChart);
                path.reset();
                if (listA != null) {
                    float x14 = entryForIndex2.getX();
                    Object objE0 = h0.e0(iIntValue, listA);
                    Entry entry2 = (Entry) objE0;
                    if (entry2 == null || Float.isNaN(entry2.getY())) {
                        objE0 = null;
                    }
                    Entry entry3 = (Entry) objE0;
                    path.moveTo(x14, entry3 != null ? entry3.getY() : yChartMin);
                    path.lineTo(entryForIndex2.getX(), entryForIndex2.getY() * phaseY2);
                    int i27 = iIntValue + 1;
                    if (i27 <= iIntValue2) {
                        while (true) {
                            Entry entryForIndex4 = iLineDataSet.getEntryForIndex(i27);
                            if (entryForIndex4 != null) {
                                if (i26 == 0 || entryForIndex2 == null) {
                                    entry = entryForIndex4;
                                } else {
                                    entry = entryForIndex4;
                                    path.lineTo(entry.getX(), entryForIndex2.getY() * phaseY2);
                                }
                                if (Float.isNaN(entry.getY())) {
                                    y17 = entryForIndex2 != null ? entryForIndex2.getY() : yChartMin;
                                } else {
                                    y17 = entry.getY();
                                }
                                path.lineTo(entry.getX(), y17 * phaseY2);
                                if (!Float.isNaN(entry.getY())) {
                                    entryForIndex2 = entry;
                                }
                            } else {
                                phaseY = phaseY;
                            }
                            if (i27 == iIntValue2) {
                                break;
                            }
                            i27++;
                            phaseY = phaseY;
                        }
                    } else {
                        phaseY = phaseY;
                    }
                    if (iIntValue <= iIntValue2) {
                        while (true) {
                            Entry entry4 = (Entry) h0.e0(iIntValue2, listA);
                            if (entry4 != null) {
                                Object objE1 = h0.e0(iIntValue2 - 1, listA);
                                Entry entry5 = (Entry) objE1;
                                if (entry5 == null || Float.isNaN(entry5.getY())) {
                                    objE1 = null;
                                }
                                Entry entry6 = (Entry) objE1;
                                if (Float.isNaN(entry4.getY())) {
                                    y16 = entry6 != null ? entry6.getY() : yChartMin;
                                } else {
                                    y16 = entry4.getY();
                                }
                                path.lineTo(entry4.getX(), y16 * phaseY2);
                                if (i26 != 0 && entry6 != null) {
                                    path.lineTo(entry4.getX(), entry6.getY() * phaseY2);
                                }
                            }
                            if (iIntValue2 == iIntValue) {
                                break;
                            } else {
                                iIntValue2--;
                            }
                        }
                    }
                    path.close();
                } else {
                    i17 = i17;
                    phaseY = phaseY;
                    path.moveTo(entryForIndex2.getX(), yChartMin);
                    path.lineTo(entryForIndex2.getX(), entryForIndex2.getY() * phaseY2);
                    int i28 = iIntValue + 1;
                    if (i28 <= iIntValue2) {
                        while (true) {
                            entryForIndex3 = iLineDataSet.getEntryForIndex(i28);
                            if (entryForIndex3 != null) {
                                float y18 = 0.0f;
                                if (i26 != 0) {
                                    path.lineTo(entryForIndex3.getX(), (entryForIndex2 != null ? entryForIndex2.getY() : 0.0f) * phaseY2);
                                }
                                if (!Float.isNaN(entryForIndex3.getY())) {
                                    y18 = entryForIndex3.getY();
                                } else if (entryForIndex2 != null) {
                                    y18 = entryForIndex2.getY();
                                }
                                path.lineTo(entryForIndex3.getX(), y18 * phaseY2);
                                if (!Float.isNaN(entryForIndex3.getY())) {
                                    entryForIndex2 = entryForIndex3;
                                }
                            }
                            if (i28 == iIntValue2) {
                                break;
                            } else {
                                i28++;
                            }
                        }
                    }
                    if (entryForIndex3 != null) {
                        path.lineTo(entryForIndex3.getX(), yChartMin);
                    }
                    path.close();
                }
                transformer2.pathValueToPixel(path);
                Drawable fillDrawable = iLineDataSet.getFillDrawable();
                if (fillDrawable != null) {
                    drawFilledPath(canvas, path, fillDrawable);
                } else {
                    drawFilledPath(canvas, path, iLineDataSet.getFillColor(), iLineDataSet.getFillAlpha());
                }
                it = it3;
                i17 = i17;
                phaseY = phaseY;
            }
            i14 = i17;
            f14 = phaseY;
        }
        float yMax = this.f67657a.isInverted(iLineDataSet.getAxisDependency()) ? iLineDataSet.getYMax() + 1.0f : -1.0f;
        int size = iLineDataSet.getColors().size();
        float[] fArr = this.f67660d;
        boolean z16 = this.f67658b;
        if (size > 1) {
            int length = fArr.length;
            int i29 = i14 * 2;
            if (length <= i29) {
                this.f67660d = new float[i14 * 4];
            }
            BarLineScatterCandleBubbleRenderer.XBounds xBounds3 = this.mXBounds;
            int i30 = xBounds3.min;
            int i34 = xBounds3.range + i30;
            if (i30 > i34) {
                return;
            }
            while (true) {
                Entry entryForIndex5 = iLineDataSet.getEntryForIndex(i30);
                if (entryForIndex5 != null && (z16 || !a(entryForIndex5, iLineDataSet))) {
                    float x15 = entryForIndex5.getX();
                    float y19 = a(entryForIndex5, iLineDataSet) ? yMax : entryForIndex5.getY();
                    float[] fArr2 = this.f67660d;
                    fArr2[i15] = x15;
                    float f15 = y19 * f14;
                    fArr2[1] = f15;
                    if (i30 < this.mXBounds.max) {
                        Entry entryForIndex6 = iLineDataSet.getEntryForIndex(i30 + 1);
                        if (entryForIndex6 != null) {
                            if (!z16) {
                                if (a(entryForIndex6, iLineDataSet)) {
                                    return;
                                }
                                if (iLineDataSet instanceof hz.e) {
                                }
                            }
                            float x16 = entryForIndex6.getX();
                            if (a(entryForIndex6, iLineDataSet)) {
                                y15 = yMax;
                            } else {
                                if (iLineDataSet instanceof hz.e) {
                                }
                                y15 = entryForIndex6.getY();
                            }
                            float[] fArr3 = this.f67660d;
                            if (z14) {
                                fArr3[c15] = x16;
                                float f16 = fArr3[1];
                                fArr3[3] = f16;
                                fArr3[c14] = x16;
                                fArr3[5] = f16;
                                fArr3[6] = x16;
                                fArr3[7] = y15 * f14;
                            } else {
                                fArr3[c15] = x16;
                                fArr3[3] = y15 * f14;
                            }
                        }
                    } else {
                        fArr2[c15] = x15;
                        fArr2[3] = f15;
                    }
                    transformer.pointValuesToPixel(this.f67660d);
                    if (!this.mViewPortHandler.isInBoundsRight(this.f67660d[i15])) {
                        return;
                    }
                    if (this.mViewPortHandler.isInBoundsLeft(this.f67660d[c15]) && (this.mViewPortHandler.isInBoundsTop(this.f67660d[1]) || this.mViewPortHandler.isInBoundsBottom(this.f67660d[3]))) {
                        this.mRenderPaint.setColor(iLineDataSet.getColor(i30));
                        canvas2.drawLines(this.f67660d, i15, i29, this.mRenderPaint);
                    }
                }
                if (i30 == i34) {
                    return;
                }
                i30++;
                i15 = 0;
            }
        } else {
            int length2 = fArr.length;
            int i35 = i14 * 2;
            if (length2 <= i35) {
                this.f67660d = new float[i14 * 4];
            }
            BarLineScatterCandleBubbleRenderer.XBounds xBounds4 = this.mXBounds;
            int i36 = xBounds4.min;
            int i37 = xBounds4.range + i36;
            if (i36 > i37) {
                return;
            }
            while (true) {
                Entry entryForIndex7 = iLineDataSet.getEntryForIndex(i36);
                if (entryForIndex7 != null && (z16 || !a(entryForIndex7, iLineDataSet))) {
                    float x17 = entryForIndex7.getX();
                    float y24 = a(entryForIndex7, iLineDataSet) ? yMax : entryForIndex7.getY();
                    float[] fArr4 = this.f67660d;
                    fArr4[0] = x17;
                    float f17 = y24 * f14;
                    fArr4[1] = f17;
                    if (i36 < this.mXBounds.max) {
                        Entry entryForIndex8 = iLineDataSet.getEntryForIndex(i36 + 1);
                        if (entryForIndex8 != null) {
                            if (!z16) {
                                if (!a(entryForIndex8, iLineDataSet)) {
                                    if (iLineDataSet instanceof hz.e) {
                                    }
                                }
                            }
                            float x18 = entryForIndex8.getX();
                            if (a(entryForIndex8, iLineDataSet)) {
                                y14 = yMax;
                            } else {
                                if (iLineDataSet instanceof hz.e) {
                                }
                                y14 = entryForIndex8.getY();
                            }
                            float[] fArr5 = this.f67660d;
                            if (z14) {
                                fArr5[c15] = x18;
                                float f18 = fArr5[1];
                                fArr5[3] = f18;
                                fArr5[c14] = x18;
                                fArr5[5] = f18;
                                fArr5[6] = x18;
                                fArr5[7] = y14 * f14;
                            } else {
                                fArr5[c15] = x18;
                                fArr5[3] = y14 * f14;
                            }
                        }
                    } else {
                        fArr4[c15] = x17;
                        fArr4[3] = f17;
                    }
                    transformer.pointValuesToPixel(this.f67660d);
                    if (!this.mViewPortHandler.isInBoundsRight(this.f67660d[0])) {
                        return;
                    }
                    if (this.mViewPortHandler.isInBoundsLeft(this.f67660d[c15]) && (this.mViewPortHandler.isInBoundsTop(this.f67660d[1]) || this.mViewPortHandler.isInBoundsBottom(this.f67660d[3]))) {
                        this.mRenderPaint.setColor(iLineDataSet.getColor());
                        canvas2.drawLines(this.f67660d, 0, i35, this.mRenderPaint);
                    }
                }
                if (i36 == i37) {
                    return;
                } else {
                    i36++;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lf00/e$b;", "", "<init>", "()V", "", "DEFAULT_ENTRY_SKIP_VALUE", "F", "", "NO_START_INDEX", "I", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {

        public interface a {
            boolean a(Entry entry, ILineDataSet iLineDataSet);
        }

        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ e(LineDataProvider lineDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler, boolean z14, b.a aVar, int i14, j jVar) {
        this(lineDataProvider, chartAnimator, viewPortHandler, (i14 & 8) != 0 ? true : z14, (i14 & 16) != 0 ? new a() : aVar);
    }
}
