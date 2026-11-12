package com.huawei.ui.commonui.linechart.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.widget.LinearLayout;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.Utils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.anchor.Layout;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarDataSet;
import com.huawei.ui.commonui.linechart.common.HwEntrys;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import defpackage.qln;
import defpackage.qmh;
import defpackage.qqn;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class HwHealthMarkerView extends MarkerView {
    private static final SpannableString d = new SpannableString("--");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f23734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<d> f23735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HwHealthBaseBarLineChart f23736c;
    private boolean e;
    private float f;
    private int g;
    private HealthTextView h;
    private OnMarkViewTextNotify i;
    private OnMarkViewGlobalPoint j;
    private HealthTextView k;
    private SpannableString l;

    public interface OnMarkViewGlobalPoint {
        void onTextGlobalPoint();
    }

    public interface OnMarkViewTextNotify {
        void onTextChanged(String str, List<d> list);
    }

    public HwHealthMarkerView(Context context, int i, HwHealthBaseBarLineChart hwHealthBaseBarLineChart) {
        super(context, i);
        this.g = -1;
        this.l = d;
        this.f23735b = new ArrayList();
        this.f = -3.4028235E38f;
        this.i = null;
        this.j = null;
        this.f23736c = null;
        this.f23734a = true;
        this.e = true;
        this.k = (HealthTextView) findViewById(R.id.tvTime);
        this.h = (HealthTextView) findViewById(R.id.tvContent);
        this.f23736c = hwHealthBaseBarLineChart;
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    @Deprecated
    public void refreshContent(Entry entry, Highlight highlight) {
        LogUtil.e("HwHealthMarkerView", "refreshContent deprecated");
    }

    public void a(Entry entry, Highlight highlight, int i) {
        if (!(entry instanceof HwEntrys)) {
            LogUtil.j("HwHealthMarkerView", "entryArg not instanceof HwHealthLineData.HwEntrys,logic error,warning!!!");
            return;
        }
        List<HwEntrys.HwDataEntry> entries = ((HwEntrys) entry).getEntries();
        if (entries.size() == 0) {
            LogUtil.j("HwHealthMarkerView", "markview hwDataEntries size 0,return");
            return;
        }
        setTextContent(highlight);
        Drawable drawable = getResources().getDrawable(R.drawable.marker_view_background);
        if (!(drawable instanceof GradientDrawable)) {
            LogUtil.j("HwHealthMarkerView", "!(drawable instanceof GradientDrawable)");
            return;
        }
        this.f23735b.clear();
        d((GradientDrawable) drawable, entries, highlight, i);
        super.refreshContent(entry, highlight);
    }

    private void d(GradientDrawable gradientDrawable, List<HwEntrys.HwDataEntry> list, Highlight highlight, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Iterator<HwEntrys.HwDataEntry> it = list.iterator();
        if (list.size() == 1 && i == 1) {
            HwEntrys.HwDataEntry next = it.next();
            if (next.getHwDataEntry() == null) {
                this.f23735b.add(new d(next.getDataSet().acquireUnit(), (HwHealthBaseBarLineDataSet) next.getDataSet()));
                return;
            }
            IAxisValueFormatter iAxisValueFormatterB = b(next, next.getDataSet().acquireMarkViewTextDigitalCount(), new ForegroundColorSpan(-1), spannableStringBuilder);
            if (iAxisValueFormatterB == null) {
                return;
            }
            b(highlight, next, iAxisValueFormatterB);
            gradientDrawable.setColor(next.getDataSet().acquireColor());
            d();
        } else {
            while (it.hasNext()) {
                HwEntrys.HwDataEntry next2 = it.next();
                if (next2.getHwDataEntry() == null) {
                    this.f23735b.add(new d(next2.getDataSet().acquireUnit(), (HwHealthBaseBarLineDataSet) next2.getDataSet()));
                } else {
                    IAxisValueFormatter iAxisValueFormatterB2 = b(next2, next2.getDataSet().acquireMarkViewTextDigitalCount(), new ForegroundColorSpan(next2.getDataSet().acquireMarkViewTextColor()), spannableStringBuilder);
                    if (iAxisValueFormatterB2 == null) {
                        return;
                    }
                    this.f23735b.add(new d(next2.getHwDataEntry(), next2.getDataSet().acquireUnit(), (HwHealthBaseBarLineDataSet) next2.getDataSet(), iAxisValueFormatterB2));
                    if (it.hasNext()) {
                        spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
                    }
                }
            }
            gradientDrawable.setColor(Color.argb(120, 0, 0, 0));
            b();
        }
        this.h.setText(spannableStringBuilder);
        setBackground(gradientDrawable);
    }

    public void a() {
        this.l = d;
        this.f23735b.clear();
    }

    public void setOnMarkViewTextNotify(OnMarkViewTextNotify onMarkViewTextNotify) {
        this.i = onMarkViewTextNotify;
    }

    public void setOnMarkViewGlobalPoint(OnMarkViewGlobalPoint onMarkViewGlobalPoint) {
        this.j = onMarkViewGlobalPoint;
    }

    public void c(float f) {
        this.f = f;
    }

    public void d(boolean z) {
        this.f23734a = z;
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public HwHealthBaseEntry f23737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public IAxisValueFormatter f23738b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public HwHealthBaseBarLineDataSet f23739c;
        public String d;
        public boolean e = true;

        public d(String str, HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet) {
            this.d = str;
            this.f23739c = hwHealthBaseBarLineDataSet;
        }

        public d(HwHealthBaseEntry hwHealthBaseEntry, String str, HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, IAxisValueFormatter iAxisValueFormatter) {
            this.f23737a = hwHealthBaseEntry;
            this.d = str;
            this.f23739c = hwHealthBaseBarLineDataSet;
            this.f23738b = iAxisValueFormatter;
        }
    }

    public boolean e() {
        return this.g != -1;
    }

    public long c() {
        return ((long) this.g) * 60000;
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void draw(Canvas canvas, float f, float f2) {
        int iSave = canvas.save();
        Chart chartView = getChartView();
        if (chartView == null) {
            LogUtil.j("HwHealthMarkerView", "markview draw chart null,default draw");
            draw(canvas);
            canvas.restoreToCount(iSave);
            return;
        }
        if (this.i == null) {
            float width = (-(getWidth() / 2)) + f;
            if (width < 0.0f) {
                width = 0.0f;
            } else if (width > chartView.getWidth() - getWidth()) {
                width = chartView.getWidth() - getWidth();
            }
            canvas.translate(width, 0.0f);
            draw(canvas);
        } else {
            setOnMarkViewTextNotify(f);
        }
        if (this.j != null && e(f)) {
            this.j.onTextGlobalPoint();
        }
        canvas.restoreToCount(iSave);
        int iSave2 = canvas.save();
        canvas.translate(this.f, chartView.getViewPortHandler().contentBottom() + chartView.getXAxis().getYOffset());
        canvas.scale(1.0f, -1.0f);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        paint.setAlpha(0);
        paint.setXfermode(porterDuffXfermode);
        a(paint, canvas, porterDuffXfermode, new Path(), Utils.convertDpToPixel(36.0f), Utils.convertDpToPixel(13.5f));
        b(canvas, paint);
        canvas.restoreToCount(iSave2);
    }

    private boolean e(float f) {
        if (qmh.e(BaseApplication.getContext())) {
            return f >= (this.f23736c.acquireChartAnchor().f() + Utils.convertDpToPixel(26.0f)) - 1.0f && f <= (this.f23736c.acquireChartAnchor().f() + Utils.convertDpToPixel(26.0f)) + 1.0f;
        }
        return f >= (this.f23736c.acquireChartAnchor().g() - Utils.convertDpToPixel(26.0f)) - 1.0f && f <= (this.f23736c.acquireChartAnchor().g() - Utils.convertDpToPixel(26.0f)) + 1.0f;
    }

    private int getMarkerViewButtonColor() {
        List dataSets = this.f23736c.getData().getDataSets();
        if (dataSets.size() == 0) {
            return Color.argb(255, 250, 101, 33);
        }
        HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet = (HwHealthBaseBarLineDataSet) dataSets.get(0);
        if (hwHealthBaseBarLineDataSet instanceof HwHealthBarDataSet) {
            return ((HwHealthBarDataSet) hwHealthBaseBarLineDataSet).acquireFocusColor();
        }
        if (dataSets.size() == 1) {
            return hwHealthBaseBarLineDataSet.getColor();
        }
        return qqn.d(R.color.colorForeground);
    }

    private void c(Canvas canvas, Paint paint) {
        paint.reset();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(Utils.convertDpToPixel(1.0f));
        if (getChartView() == null || !(getChartView() instanceof HwHealthBaseBarLineChart)) {
            LogUtil.j("HwHealthMarkerView", "markview draw chart null,default draw");
            return;
        }
        HwHealthBaseBarLineChart hwHealthBaseBarLineChart = (HwHealthBaseBarLineChart) getChartView();
        Layout layoutAcquireLayout = hwHealthBaseBarLineChart.acquireLayout();
        qln qlnVarAcquireChartAnchor = hwHealthBaseBarLineChart.acquireChartAnchor();
        float f = layoutAcquireLayout.f();
        float fH = layoutAcquireLayout.h();
        float fConvertDpToPixel = Utils.convertDpToPixel(0.25f);
        float f2 = layoutAcquireLayout.f();
        float fH2 = layoutAcquireLayout.h();
        float fH3 = qlnVarAcquireChartAnchor.h();
        paint.setColor(qqn.d(R.color.chart_highline_color));
        canvas.drawLine(0.0f, f + fH + fConvertDpToPixel, 0.0f, f2 + fH2 + fH3, paint);
    }

    private void b(Canvas canvas, int[] iArr, float[] fArr, Paint paint) {
        paint.reset();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2.0f);
        if (getChartView() == null || !(getChartView() instanceof HwHealthBaseBarLineChart)) {
            LogUtil.j("HwHealthMarkerView", "markview draw chart null,default draw");
            return;
        }
        HwHealthBaseBarLineChart hwHealthBaseBarLineChart = (HwHealthBaseBarLineChart) getChartView();
        Layout layoutAcquireLayout = hwHealthBaseBarLineChart.acquireLayout();
        qln qlnVarAcquireChartAnchor = hwHealthBaseBarLineChart.acquireChartAnchor();
        float f = layoutAcquireLayout.f() * 2.0f;
        float f2 = layoutAcquireLayout.f() + layoutAcquireLayout.h() + qlnVarAcquireChartAnchor.h();
        paint.setShader(new LinearGradient(0.0f, f, 0.0f, f2, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.drawLine(0.0f, f, 0.0f, f2, paint);
    }

    private String d(float f) {
        IAxisValueFormatter valueFormatter = this.f23736c.getXAxis().getValueFormatter();
        if (valueFormatter instanceof HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter) {
            return ((HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter) valueFormatter).getFormattedValueForMarkerView(f, this.f23736c.getXAxis());
        }
        return this.f23736c.getXAxis().getValueFormatter().getFormattedValue(f, this.f23736c.getXAxis());
    }

    public void b(boolean z) {
        this.e = z;
    }

    private IAxisValueFormatter b(HwEntrys.HwDataEntry hwDataEntry, int i, ForegroundColorSpan foregroundColorSpan, SpannableStringBuilder spannableStringBuilder) {
        SpannableString spannableString = new SpannableString(UnitUtil.e(hwDataEntry.getHwDataEntry().getY(), 1, i) + hwDataEntry.getDataSet().acquireUnit());
        spannableString.setSpan(foregroundColorSpan, 0, spannableString.length(), 34);
        spannableStringBuilder.append((CharSequence) spannableString);
        if (hwDataEntry.getDataSet() instanceof HwHealthLineDataSet) {
            return this.f23736c.getAxis(((HwHealthLineDataSet) hwDataEntry.getDataSet()).getAxisDependencyExt()).getValueFormatter();
        }
        if (hwDataEntry.getDataSet() instanceof HwHealthBarDataSet) {
            return this.f23736c.getAxis(((HwHealthBarDataSet) hwDataEntry.getDataSet()).getAxisDependencyExt()).getValueFormatter();
        }
        LogUtil.e("HwHealthMarkerView", "unrecoginzed dataSet,unsupport getAxisDependencyExt");
        return null;
    }

    private void b() {
        this.h.setSingleLine(false);
        if (this.k.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.k.getLayoutParams();
            if (!qmh.e(getContext())) {
                layoutParams.gravity = 3;
            } else {
                layoutParams.gravity = 5;
            }
            this.k.setLayoutParams(layoutParams);
        }
    }

    private void b(Highlight highlight, HwEntrys.HwDataEntry hwDataEntry, IAxisValueFormatter iAxisValueFormatter) {
        if (this.f23736c.isRenderUsePaintAsBackground() && this.f23736c.isManualReferenceLineEnabled()) {
            this.f23735b.add(new d(new HwHealthBaseEntry(highlight.getX(), this.f23736c.getManualReferenceLineValue()), hwDataEntry.getDataSet().acquireUnit(), (HwHealthBaseBarLineDataSet) hwDataEntry.getDataSet(), iAxisValueFormatter));
        } else {
            this.f23735b.add(new d(hwDataEntry.getHwDataEntry(), hwDataEntry.getDataSet().acquireUnit(), (HwHealthBaseBarLineDataSet) hwDataEntry.getDataSet(), iAxisValueFormatter));
        }
    }

    private void d() {
        this.h.setSingleLine(false);
        if (this.k.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.k.getLayoutParams();
            layoutParams.gravity = 1;
            this.k.setLayoutParams(layoutParams);
        }
    }

    private void setTextContent(Highlight highlight) {
        this.g = (int) highlight.getX();
        this.l = new SpannableString(d(highlight.getX()));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(-1);
        SpannableString spannableString = this.l;
        spannableString.setSpan(foregroundColorSpan, 0, spannableString.length(), 34);
        this.k.setText(this.l);
        this.k.setSingleLine(false);
    }

    private void setOnMarkViewTextNotify(float f) {
        if (this.f23735b.size() == 0 || f == this.f23736c.acquireChartAnchor().g() - Utils.convertDpToPixel(26.0f)) {
            return;
        }
        this.i.onTextChanged(this.l.toString(), this.f23735b);
    }

    private void a(Paint paint, Canvas canvas, PorterDuffXfermode porterDuffXfermode, Path path, float f, float f2) {
        path.moveTo(-f, 0.0f);
        float f3 = f * 3.0f;
        float f4 = f * 2.0f;
        path.cubicTo((-f3) / 6.0f, 0.0f, (-f4) / 6.0f, f2, 0.0f, f2);
        path.cubicTo(f4 / 6.0f, f2, f3 / 6.0f, 0.0f, f, 0.0f);
        canvas.drawPath(path, paint);
        paint.setXfermode(null);
        paint.setStyle(Paint.Style.FILL);
        paint.setShadowLayer(Utils.convertDpToPixel(7.0f), 0.0f, Utils.convertDpToPixel(-3.0f), qqn.b(getContext(), R.color.health_chart_eye_shadow_color));
        paint.setColor(qqn.b(getContext(), R.color.colorBackground));
        canvas.drawCircle(0.0f, 0.0f, Utils.convertDpToPixel(11.0f), paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        paint.setXfermode(porterDuffXfermode);
        paint.setAlpha(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(2.0f);
        canvas.drawCircle(0.0f, 0.0f, Utils.convertDpToPixel(11.0f), paint);
        paint.setXfermode(null);
        paint.setStyle(Paint.Style.STROKE);
        canvas.translate(0.0f, Utils.convertDpToPixel(-1.0f));
        paint.setStrokeWidth(1.0f);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(qqn.b(getContext(), R.color.health_chart_eye_color));
        boolean zIsAntiAlias = paint.isAntiAlias();
        paint.setAntiAlias(true);
        canvas.drawCircle(0.0f, 0.0f, Utils.convertDpToPixel(11.0f), paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(Utils.convertDpToPixel(0.5f));
        paint.setColor(qqn.b(getContext(), R.color.health_chart_eye_shadow_color));
        paint.setAntiAlias(true);
        canvas.drawCircle(0.0f, 0.0f, Utils.convertDpToPixel(11.25f), paint);
        paint.setAntiAlias(zIsAntiAlias);
        paint.setStyle(Paint.Style.STROKE);
        canvas.translate(0.0f, Utils.convertDpToPixel(1.0f));
    }

    private void b(Canvas canvas, Paint paint) {
        if (this.f23734a) {
            if (this.e) {
                int markerViewButtonColor = getMarkerViewButtonColor();
                int iArgb = Color.argb(0, Color.red(markerViewButtonColor), Color.green(markerViewButtonColor), Color.blue(markerViewButtonColor));
                b(canvas, new int[]{iArgb, markerViewButtonColor, iArgb}, new float[]{0.0f, 0.5f, 1.0f}, paint);
                return;
            }
            c(canvas, paint);
        }
    }

    public List<d> getData() {
        return this.f23735b;
    }

    public SpannableString getTime() {
        return this.l;
    }
}
