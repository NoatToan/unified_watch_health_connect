package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.util.Pair;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.components.IMarker;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthTransformer;
import com.huawei.ui.commonui.linechart.icommon.HwHealthLineDataProvider;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthDatasContainer;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthLineDatasContainer;
import com.huawei.ui.commonui.linechart.icommon.IStorageModel;
import com.huawei.ui.commonui.linechart.view.HwHealthBaseLineDataSet;
import com.huawei.ui.commonui.linechart.view.IHwHealthLineDataSet;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.views.bloodsugar.BloodSugarLineChartInterface;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class ulm extends qnq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f50330a;
    private long aa;
    private final int ab;
    private float ac;
    private Entry ad;
    private final List<Pair> ae;
    private long af;
    private int ag;
    private final int ah;
    private Entry ai;
    private final int aj;
    private long al;
    private final Paint am;
    private final int an;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f50331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f50332c;
    private BloodSugarLineChartInterface e;
    private Entry h;
    private final int j;
    private final int k;
    private final Map<Long, IStorageModel> l;
    private final DataInfos m;
    private Entry n;
    private String o;
    private final int p;
    private Entry q;
    private Entry r;
    private final int s;
    private final int t;
    private boolean u;
    private final int v;
    private final Path w;
    private final Paint x;
    private int y;
    private float z;

    public ulm(HwHealthLineDataProvider hwHealthLineDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler, Context context, DataInfos dataInfos) {
        super(hwHealthLineDataProvider, chartAnimator, viewPortHandler, context);
        this.f50330a = BaseApplication.getContext().getResources().getColor(R.color.color_blood_high);
        this.f50332c = BaseApplication.getContext().getResources().getColor(R.color.color_blood_low);
        this.j = BaseApplication.getContext().getResources().getColor(R.color.color_blood_normal);
        this.ah = BaseApplication.getContext().getResources().getColor(R.color.color_blood_high);
        this.aj = BaseApplication.getContext().getResources().getColor(R.color.color_blood_normal);
        this.an = BaseApplication.getContext().getResources().getColor(R.color.color_blood_low);
        this.k = BaseApplication.getContext().getResources().getColor(R.color.hw_show_color_text_30_persent_black);
        this.v = BaseApplication.getContext().getResources().getColor(R.color.color_26000000);
        this.s = BaseApplication.getContext().getResources().getColor(R.color.blood_sugar_chart_diff_line);
        this.t = Color.argb(127, 252, 49, 89);
        this.p = Color.argb(0, 252, 49, 89);
        this.ab = Color.argb(255, 252, 49, 89);
        this.x = new Paint(1);
        this.w = new Path();
        this.am = new Paint();
        this.f50331b = new Paint(1);
        this.ae = new ArrayList(3);
        this.ag = 0;
        this.y = 0;
        this.al = 180000L;
        this.u = false;
        this.ac = -1.0f;
        this.z = -1.0f;
        this.l = new HashMap(16);
        LogUtil.a("BloodSugarLineChartRender", "BloodOxygenLineChartRender");
        i();
        this.m = dataInfos;
        if (dataInfos != null) {
            if (dataInfos.isDayData()) {
                this.al = 180000L;
                this.aa = 2100000L;
            } else if (dataInfos.isWeekData()) {
                this.al = 600000L;
                this.aa = 7000000L;
            } else {
                this.al = 3600000L;
                this.aa = 42000000L;
            }
        }
    }

    private void i() {
        this.am.setColor(this.k);
        this.am.setAntiAlias(true);
        this.am.setStrokeWidth(Utils.convertDpToPixel(2.0f));
        this.am.setStyle(Paint.Style.STROKE);
        this.f50331b.setStyle(Paint.Style.STROKE);
        this.f50331b.setStrokeCap(Paint.Cap.SQUARE);
        this.f50331b.setStrokeJoin(Paint.Join.ROUND);
        this.f50331b.setColor(this.ab);
        this.f50331b.setStrokeWidth(2.0f);
        this.x.setStyle(Paint.Style.STROKE);
        this.x.setStrokeCap(Paint.Cap.ROUND);
        this.x.setColor(this.ab);
        this.x.setStrokeWidth(2.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r30v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // defpackage.qnq, com.huawei.ui.commonui.linechart.view.HwHealthLineChartRenderLayerOriginal
    public void drawLinear(Canvas canvas, IHwHealthLineDataSet iHwHealthLineDataSet) {
        ulg ulgVar;
        List list;
        float x;
        ulg ulgVar2 = iHwHealthLineDataSet instanceof ulg ? (ulg) iHwHealthLineDataSet : null;
        if (ulgVar2 == null || !ulgVar2.isDataCalculated()) {
            return;
        }
        List values = ulgVar2.getValues();
        if (njy.e(values)) {
            return;
        }
        Collections.sort(values);
        f();
        ArrayList arrayList = new ArrayList(16);
        ArrayList arrayList2 = new ArrayList(16);
        ArrayList arrayList3 = new ArrayList(16);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        b(ulgVar2);
        float f = 0.0f;
        int i = 0;
        long jM = 0;
        long jM2 = 0;
        ?? entryForIndex = ulgVar2.getEntryForIndex(this.mXBounds.min);
        ?? entryForIndex2 = ulgVar2.getEntryForIndex(this.mXBounds.range + this.mXBounds.min);
        while (true) {
            float f2 = f;
            ulgVar = ulgVar2;
            if (i >= values.size()) {
                break;
            }
            HwHealthBaseEntry hwHealthBaseEntry = (HwHealthBaseEntry) values.get(i);
            if (entryForIndex.getX() > hwHealthBaseEntry.getX() || hwHealthBaseEntry.getX() > entryForIndex2.getX() || !(hwHealthBaseEntry.getData() instanceof uma)) {
                list = values;
            } else {
                uma umaVar = (uma) hwHealthBaseEntry.getData();
                list = values;
                if (this.o.equals("BLOOD_SUGAR_CONTINUE") || this.o.equals("BLOOD_SUGAR_FINGER_TIP") || this.o.equals(umaVar.d())) {
                    this.l.put(Long.valueOf(umaVar.m()), umaVar);
                    int iN = umaVar.n();
                    if (iN == 2108) {
                        if (!umaVar.g()) {
                            qod qodVar = new qod(hwHealthBaseEntry);
                            if (jM2 == 0) {
                                arrayList4.add(qodVar);
                                jM2 = umaVar.m();
                            } else if (umaVar.m() - jM2 < this.aa) {
                                qodVar.e(true);
                                arrayList4.add(qodVar);
                                jM2 = umaVar.m();
                            } else {
                                int size = arrayList4.size() - 1;
                                if (!arrayList4.get(size).h()) {
                                    qod qodVarRemove = arrayList4.remove(size);
                                    arrayList5.add(new PointF(qodVarRemove.c(), qodVarRemove.b()));
                                }
                                arrayList4.add(qodVar);
                                jM2 = umaVar.m();
                            }
                            f = f2;
                        }
                    } else {
                        i = i;
                        long j = jM;
                        if (umaVar.m() - jM > this.al) {
                            jM = umaVar.m();
                            x = hwHealthBaseEntry.getX();
                        } else {
                            x = f2;
                            jM = j;
                        }
                        hwHealthBaseEntry.setX(x);
                        entryForIndex = entryForIndex;
                        if (this.m != DataInfos.BloodSugarDayDetail && !"BLOOD_SUGAR_FINGER_TIP".equals(umaVar.d())) {
                            arrayList3.add(new Entry(hwHealthBaseEntry.getX(), hwHealthBaseEntry.getY()));
                        }
                        entryForIndex2 = entryForIndex2;
                        arrayList.add(new PointF(hwHealthBaseEntry.getX(), hwHealthBaseEntry.getY() * this.mAnimator.getPhaseY()));
                        arrayList2.add(Integer.valueOf(umaVar.j()));
                        if (this.m == DataInfos.BloodSugarDayDetail) {
                            d(hwHealthBaseEntry, iN);
                        }
                        f = x;
                    }
                }
                i++;
                entryForIndex = entryForIndex;
                ulgVar2 = ulgVar;
                values = list;
                entryForIndex2 = entryForIndex2;
            }
            entryForIndex = entryForIndex;
            entryForIndex2 = entryForIndex2;
            i = i;
            f = f2;
            jM = jM;
            i++;
            entryForIndex = entryForIndex;
            ulgVar2 = ulgVar;
            values = list;
            entryForIndex2 = entryForIndex2;
        }
        if (arrayList4.size() > 0) {
            qod qodVar2 = arrayList4.get(arrayList4.size() - 1);
            this.ac = qodVar2.c();
            if (!qodVar2.h()) {
                arrayList5.add(new PointF(qodVar2.c(), qodVar2.b()));
            }
        }
        if (arrayList.size() > 0) {
            this.z = arrayList.get(arrayList.size() - 1).x;
        }
        Canvas canvas2 = this.mBitmapCanvas;
        int iContentBottom = (int) (this.mViewPortHandler.contentBottom() + this.mChart.getXAxis().getYOffset());
        HwHealthTransformer transformer = this.mChart.getTransformer(ulgVar.getAxisDependencyExt());
        if (this.o.equals("BLOOD_SUGAR_CONTINUE")) {
            if (!arrayList4.isEmpty() || !arrayList5.isEmpty()) {
                c(canvas2, transformer, arrayList4, arrayList5);
            }
            if (!arrayList.isEmpty()) {
                canvas2.saveLayerAlpha(new RectF(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop(), this.mViewPortHandler.contentRight(), iContentBottom), 25);
                d(canvas2, ulgVar, arrayList, arrayList2, arrayList3);
                canvas2.restore();
            }
        } else if (this.o.equals("BLOOD_SUGAR_FINGER_TIP")) {
            if (!arrayList.isEmpty()) {
                d(canvas2, ulgVar, arrayList, arrayList2, arrayList3);
            }
            if (!arrayList4.isEmpty() || !arrayList5.isEmpty()) {
                canvas2.saveLayerAlpha(new RectF(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop(), this.mViewPortHandler.contentRight(), iContentBottom), 25);
                c(canvas2, transformer, arrayList4, arrayList5);
                canvas2.restore();
            }
        } else if (!arrayList.isEmpty()) {
            d(canvas2, ulgVar, arrayList, arrayList2, arrayList3);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = jElapsedRealtime - this.af;
        if (j2 > 100) {
            c();
            LogUtil.a("BloodSugarLineChartRender", "diff=", Long.valueOf(j2));
        }
        this.af = jElapsedRealtime;
    }

    public void c() {
        BloodSugarLineChartInterface bloodSugarLineChartInterface = this.e;
        if (bloodSugarLineChartInterface != null) {
            bloodSugarLineChartInterface.onDrawDataCallback(this.l);
        }
    }

    private void d(Canvas canvas, ulg ulgVar, List<PointF> list, List<Integer> list2, List<Entry> list3) {
        HwHealthTransformer transformer = this.mChart.getTransformer(ulgVar.getAxisDependencyExt());
        int i = ulgVar.getMode() == HwHealthBaseLineDataSet.Mode.STEPPED ? 4 : 2;
        float phaseY = this.mAnimator.getPhaseY();
        if (this.m != DataInfos.BloodSugarDayDetail && list3.size() > 0) {
            a(i, transformer, canvas, d(ulgVar, phaseY));
        }
        a(transformer, phaseY, canvas);
        if (list.size() > 0) {
            d(canvas, list2, list, transformer);
        }
    }

    private void c(Canvas canvas, Transformer transformer, List<qod> list, List<PointF> list2) {
        if (!njy.e(list2)) {
            e(canvas, transformer, list2);
        }
        if (njy.e(list)) {
            return;
        }
        ViewPortHandler viewPortHandler = this.mViewPortHandler;
        Path path = new Path();
        int i = 0;
        while (i < list.size() - 1) {
            qod qodVar = list.get(i);
            int i2 = i + 1;
            qod qodVar2 = list.get(i2);
            if (qodVar2.h()) {
                path.reset();
                MPPointD pixelForValues = transformer.getPixelForValues(qodVar.c(), qodVar.b());
                MPPointD pixelForValues2 = transformer.getPixelForValues(qodVar2.c(), qodVar2.b());
                int iSave = canvas.save();
                canvas.clipRect((int) pixelForValues.x, (int) viewPortHandler.contentTop(), (int) pixelForValues2.x, (int) viewPortHandler.contentBottom());
                path.moveTo((float) pixelForValues.x, (float) pixelForValues.y);
                path.lineTo((float) pixelForValues2.x, (float) pixelForValues2.y);
                canvas.drawPath(path, this.f50331b);
                canvas.restoreToCount(iSave);
                e(canvas, (float) pixelForValues.x, (float) pixelForValues.y, (float) pixelForValues2.x, (float) pixelForValues2.y);
            }
            i = i2;
        }
    }

    private void e(Canvas canvas, Transformer transformer, List<PointF> list) {
        for (PointF pointF : list) {
            MPPointD pixelForValues = transformer.getPixelForValues(pointF.x, pointF.y);
            canvas.drawLine((float) pixelForValues.x, (float) pixelForValues.y, (float) pixelForValues.x, (float) pixelForValues.y, this.x);
            e(canvas, (float) (pixelForValues.x - ((double) (this.x.getStrokeWidth() / 2.0f))), (float) pixelForValues.y, (float) (pixelForValues.x + ((double) (this.x.getStrokeWidth() / 2.0f))), (float) pixelForValues.y);
        }
    }

    private void e(Canvas canvas, float f, float f2, float f3, float f4) {
        ViewPortHandler viewPortHandler = this.mViewPortHandler;
        int iSave = canvas.save();
        int iContentBottom = (int) viewPortHandler.contentBottom();
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        float f5 = iContentBottom;
        path.lineTo(f3, f5);
        path.lineTo(f, f5);
        canvas.clipPath(path);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{this.t, this.p});
        gradientDrawable.setBounds((int) viewPortHandler.contentLeft(), (int) viewPortHandler.contentTop(), (int) viewPortHandler.contentRight(), iContentBottom);
        gradientDrawable.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    private void b(ulg ulgVar) {
        int i = ulgVar.getMode() == HwHealthBaseLineDataSet.Mode.STEPPED ? 4 : 2;
        this.mXBounds.set(this.mChart, ulgVar);
        int iMax = Math.max(ulgVar.getEntryCount() * i, i);
        int i2 = iMax * 2;
        if (this.g.length < i2) {
            this.g = new float[iMax * 4];
        }
        if (this.f.length < i2) {
            this.f = new float[iMax * 4];
        }
    }

    private void d(Entry entry, int i) {
        switch (i) {
            case 2008:
                this.n = entry;
                break;
            case 2009:
                this.h = entry;
                break;
            case 2010:
                this.ai = entry;
                break;
            case 2011:
                this.ad = entry;
                break;
            case 2012:
                this.q = entry;
                break;
            case 2013:
                this.r = entry;
                break;
        }
    }

    private void f() {
        this.n = null;
        this.h = null;
        this.ai = null;
        this.ad = null;
        this.q = null;
        this.r = null;
        this.ac = -1.0f;
        this.z = -1.0f;
        this.l.clear();
    }

    private void a(Transformer transformer, float f, Canvas canvas) {
        if (this.m != DataInfos.BloodSugarDayDetail) {
            return;
        }
        this.ae.clear();
        Entry entry = this.n;
        if (entry != null && this.h != null && c(entry.getX(), this.h.getX())) {
            this.ae.add(new Pair(this.n, this.h));
        }
        Entry entry2 = this.ai;
        if (entry2 != null && this.ad != null && c(entry2.getX(), this.ad.getX())) {
            this.ae.add(new Pair(this.ai, this.ad));
        }
        Entry entry3 = this.q;
        if (entry3 != null && this.r != null && c(entry3.getX(), this.r.getX())) {
            this.ae.add(new Pair(this.q, this.r));
        }
        if (njy.b(this.ae)) {
            this.am.setColor(this.s);
            if (qqs.e(BaseApplication.getContext())) {
                this.am.setAlpha(76);
            } else {
                this.am.setAlpha(25);
            }
            this.am.setStyle(Paint.Style.FILL_AND_STROKE);
            this.am.setStrokeWidth(Utils.convertDpToPixel(8.0f));
            Path path = new Path();
            for (Pair pair : this.ae) {
                MPPointD pixelForValues = transformer.getPixelForValues(((Entry) pair.first).getX(), ((Entry) pair.first).getY() * f);
                MPPointD pixelForValues2 = transformer.getPixelForValues(((Entry) pair.second).getX(), ((Entry) pair.second).getY() * f);
                path.reset();
                path.moveTo((float) pixelForValues.x, (float) pixelForValues.y);
                path.lineTo((float) pixelForValues2.x, (float) pixelForValues2.y);
                canvas.drawPath(path, this.am);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.github.mikephil.charting.data.Entry] */
    private int d(IHwHealthLineDataSet iHwHealthLineDataSet, float f) {
        LogUtil.a("BloodSugarLineChartRender", "putLineBuffer");
        int i = this.mXBounds.min;
        int i2 = 0;
        int i3 = 0;
        while (i <= this.mXBounds.range + this.mXBounds.min) {
            ?? entryForIndex = i != 0 ? iHwHealthLineDataSet.getEntryForIndex(i - 1) : 0;
            ?? entryForIndex2 = iHwHealthLineDataSet.getEntryForIndex(i);
            if (entryForIndex2 != 0 && entryForIndex != 0 && (DataInfos.BloodSugarDayDetail != this.m || c(entryForIndex.getX(), entryForIndex2.getX()))) {
                this.g[i3] = entryForIndex.getX();
                this.g[i3 + 1] = entryForIndex.getY() * f;
                this.g[i3 + 2] = entryForIndex2.getX();
                this.g[i3 + 3] = entryForIndex2.getY() * f;
                i2++;
                i3 += 4;
            }
            i++;
        }
        return i2;
    }

    private void a(int i, Transformer transformer, Canvas canvas, int i2) {
        if (i2 <= 0) {
            return;
        }
        transformer.pointValuesToPixel(this.g);
        int iMax = Math.max(i2 * i, i);
        if (DataInfos.BloodSugarDayDetail == this.m) {
            return;
        }
        Path path = new Path();
        int i3 = 0;
        path.moveTo(this.g[0], this.g[1]);
        float f = this.g[0];
        float f2 = this.g[0];
        float f3 = this.g[0];
        float f4 = this.g[1];
        while (true) {
            int i4 = (i3 * 2) + 1;
            if (i4 < iMax) {
                int i5 = i3 * 4;
                float f5 = this.g[i5];
                float f6 = this.g[i5 + 1];
                int i6 = i4 * 2;
                float f7 = this.g[i6];
                float f8 = this.g[i6 + 1];
                if (b(f3, f5) && b(f4, f6)) {
                    path.lineTo(f7, f8);
                } else {
                    canvas.save();
                    canvas.clipRect(f, (int) this.mViewPortHandler.contentTop(), f2, (int) this.mViewPortHandler.contentBottom());
                    this.am.setShadowLayer(10.0f, 0.0f, 5.0f, this.v);
                    canvas.drawPath(path, this.am);
                    canvas.restore();
                    path.reset();
                    path.moveTo(f5, f6);
                    path.lineTo(f7, f8);
                    f = f5;
                }
                i3++;
                f4 = f8;
                f2 = f7;
                f3 = f2;
            } else {
                canvas.save();
                canvas.clipRect(f, (int) this.mViewPortHandler.contentTop(), f2, (int) this.mViewPortHandler.contentBottom());
                this.am.setShadowLayer(10.0f, 0.0f, 5.0f, this.v);
                canvas.drawPath(path, this.am);
                canvas.restore();
                path.reset();
                return;
            }
        }
    }

    private boolean b(float f, float f2) {
        LogUtil.a("BloodSugarLineChartRender", "floatNumberCompare");
        return Math.abs(f - f2) < 1.0E-7f;
    }

    private void d(Canvas canvas, List<Integer> list, List<PointF> list2, Transformer transformer) {
        LogUtil.a("BloodSugarLineChartRender", "drawDataPoints");
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        int size = list2.size() * 2;
        float[] fArr = new float[size];
        int i = 0;
        for (PointF pointF : list2) {
            fArr[i] = pointF.x;
            fArr[i + 1] = pointF.y;
            i += 2;
        }
        transformer.pointValuesToPixel(fArr);
        for (int i2 = 0; i2 < size; i2 += 2) {
            paint.setColor(list.get(i2 / 2).intValue());
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.FILL);
            float f = fArr[i2];
            float f2 = fArr[i2 + 1];
            canvas.drawCircle(f, f2, Utils.convertDpToPixel(5.0f), paint);
            paint.setColor(-1);
            canvas.drawCircle(f, f2, Utils.convertDpToPixel(5.0f) / 2.0f, paint);
        }
    }

    private float d(float f) {
        LogUtil.a("BloodSugarLineChartRender", "getColorForBloodOxygenGrade");
        if (f <= 4.4f) {
            return 4.4f;
        }
        return f <= 8.0f ? 8.0f : 10.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qnq, com.huawei.ui.commonui.linechart.view.HwHealthLineChartRenderLayerOriginal, com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        List entriesForXValue;
        qnt lineData = this.mChart.getLineData();
        if (highlightArr == null || highlightArr.length <= 0 || lineData == null) {
            return;
        }
        for (Highlight highlight : highlightArr) {
            List<T> dataSets = lineData.getDataSets();
            if (dataSets != 0 && dataSets.size() != 0) {
                for (T t : dataSets) {
                    if ("BLOOD_SUGAR_CONTINUE".equals(this.o) && (this.mChart instanceof HwHealthBaseBarLineChart)) {
                        IHwHealthDatasContainer iHwHealthDatasContainerCacheDataContainer = t.cacheDataContainer((HwHealthBaseBarLineChart) this.mChart);
                        entriesForXValue = iHwHealthDatasContainerCacheDataContainer instanceof IHwHealthLineDatasContainer ? t.getEntriesForXValue(highlight.getX(), (IHwHealthLineDatasContainer) iHwHealthDatasContainerCacheDataContainer) : null;
                    } else {
                        entriesForXValue = t.getEntriesForXValue(highlight.getX());
                    }
                    if (entriesForXValue != null && !entriesForXValue.isEmpty()) {
                        c(canvas, highlight, t, (List<HwHealthBaseEntry>) entriesForXValue);
                    }
                }
            }
        }
    }

    private void c(Canvas canvas, Highlight highlight, IHwHealthLineDataSet iHwHealthLineDataSet, List<HwHealthBaseEntry> list) {
        if (njy.b(list)) {
            for (HwHealthBaseEntry hwHealthBaseEntry : list) {
                uma umaVar = hwHealthBaseEntry.getData() instanceof uma ? (uma) hwHealthBaseEntry.getData() : null;
                if (umaVar != null && this.o.equals(umaVar.d())) {
                    a(hwHealthBaseEntry);
                    MPPointD pixelForValues = this.mChart.getTransformer(iHwHealthLineDataSet.getAxisDependencyExt()).getPixelForValues(hwHealthBaseEntry.getX(), hwHealthBaseEntry.getY() * this.mAnimator.getPhaseY());
                    highlight.setDraw((float) pixelForValues.x, (float) pixelForValues.y);
                    d(canvas, (float) pixelForValues.x, (float) pixelForValues.y, iHwHealthLineDataSet, false, true, Color.argb(0, 0, 0, 0));
                }
            }
        }
    }

    @Override // defpackage.qnq
    protected void d(Canvas canvas, float f, float f2, ILineScatterCandleRadarDataSet iLineScatterCandleRadarDataSet, boolean z, boolean z2, int i) {
        if (iLineScatterCandleRadarDataSet == null) {
            LogUtil.j("BloodSugarLineChartRender", "drawHighlightLines: dataSet is null");
            return;
        }
        LogUtil.a("BloodSugarLineChartRender", "set.getHighlightLineWidth() = ", Float.valueOf(iLineScatterCandleRadarDataSet.getHighlightLineWidth()));
        this.mHighlightPaint.setStrokeWidth(iLineScatterCandleRadarDataSet.getHighlightLineWidth());
        this.mHighlightPaint.setColor(i);
        this.mHighlightPaint.setPathEffect(iLineScatterCandleRadarDataSet.getDashPathEffectHighlight());
        if (iLineScatterCandleRadarDataSet.isVerticalHighlightIndicatorEnabled() && z) {
            this.w.reset();
            if (this.mChart instanceof Chart) {
                IMarker marker = ((Chart) this.mChart).getMarker();
                if (marker instanceof MarkerView) {
                    this.w.moveTo(f, ((MarkerView) marker).getHeight());
                    this.w.lineTo(f, this.mViewPortHandler.contentTop() + this.mChart.getXAxis().getYOffset());
                    canvas.drawPath(this.w, this.mHighlightPaint);
                }
            }
        }
        if (z2) {
            this.mHighlightPaint.setAntiAlias(true);
            this.mHighlightPaint.setStyle(Paint.Style.FILL);
            this.mHighlightPaint.setColor(-1);
            this.mHighlightPaint.setStrokeWidth(0.0f);
            canvas.drawCircle(f, f2, Utils.convertDpToPixel(8.0f), this.mHighlightPaint);
            this.mHighlightPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            this.mHighlightPaint.setStyle(Paint.Style.FILL);
            this.mHighlightPaint.setColor(this.ag);
            canvas.drawCircle(f, f2, Utils.convertDpToPixel(5.0f), this.mHighlightPaint);
            this.mHighlightPaint.setStyle(Paint.Style.STROKE);
            return;
        }
        this.mHighlightPaint.setAntiAlias(true);
        this.mHighlightPaint.setStrokeWidth(1.0f);
        this.mHighlightPaint.setStyle(Paint.Style.FILL);
        this.mHighlightPaint.setColor(this.y);
        int iA = qqp.a(BaseApplication.getContext(), 1.0f);
        float f3 = iA;
        canvas.drawCircle(f - f3, f2, f3, this.mHighlightPaint);
        canvas.drawRect(f - (iA * 2), f2, f, this.mViewPortHandler.contentTop(), this.mHighlightPaint);
        this.mHighlightPaint.setStyle(Paint.Style.STROKE);
    }

    private void a(Entry entry) {
        LogUtil.a("BloodSugarLineChartRender", "setHighLightDotColor");
        Object data = entry.getData();
        if (data instanceof uma) {
            uma umaVar = (uma) data;
            this.ag = umaVar.j();
            this.y = umaVar.j();
            return;
        }
        float fD = d(entry.getY());
        if (fD <= 4.4f) {
            this.ag = this.f50332c;
            this.y = this.an;
        } else if (fD <= 8.0f) {
            this.ag = this.j;
            this.y = this.aj;
        } else {
            this.ag = this.f50330a;
            this.y = this.ah;
        }
    }

    @Override // defpackage.qnq, com.huawei.ui.commonui.linechart.common.IHwHealthDataRender
    public void usePaintAsBackground(boolean z) {
        LogUtil.a("BloodSugarLineChartRender", "usePaintAsBackground");
        this.u = z;
    }

    @Override // defpackage.qnq, com.huawei.ui.commonui.linechart.common.IHwHealthDataRender
    public boolean isUsePaintAsBackground() {
        LogUtil.a("BloodSugarLineChartRender", "isUsePaintAsBackground");
        return this.u;
    }

    private boolean c(float f, float f2) {
        LogUtil.a("BloodSugarLineChartRender", "isSameDay");
        Date date = new Date((((long) f) * 60000) + 1388505600000L);
        Date date2 = new Date((((long) f2) * 60000) + 1388505600000L);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i = calendar.get(6);
        calendar.setTime(date2);
        return calendar.get(6) == i;
    }

    public void a(String str) {
        this.o = str;
    }

    public void b(BloodSugarLineChartInterface bloodSugarLineChartInterface) {
        this.e = bloodSugarLineChartInterface;
    }

    public float e() {
        if ("BLOOD_SUGAR_CONTINUE".equals(this.o)) {
            return this.ac;
        }
        return this.z;
    }

    public void b() {
        this.ac = -1.0f;
        this.z = -1.0f;
    }
}
