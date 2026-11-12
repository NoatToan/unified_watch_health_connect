package defpackage;

import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthYAxis;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import com.huawei.ui.commonui.linechart.view.HwHealthMarkerView;
import com.huawei.ui.commonui.linechart.view.IHwHealthLineDataSet;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.weight.viewholder.WeightTrendLineChart;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class vns {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f51377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeightTrendLineChart f51378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f51379c;
    private int d;
    private View e;
    private Handler f = new e(this);
    private dnb g;
    private List<Pair<Long, Float>> h;
    private View i;
    private int j;

    public vns(View view, dnb dnbVar) {
        this.g = dnbVar;
        this.i = view.findViewById(R.id.weight_goal_line_chart);
        this.f51377a = (HealthTextView) view.findViewById(R.id.weight_goal_preview_chart_layout_average);
        this.f51378b = (WeightTrendLineChart) view.findViewById(R.id.weight_line_chart);
        this.i.setBackground(ContextCompat.getDrawable(BaseApplication.b(), R.drawable.trend_chart_bg));
    }

    public void d(View view) {
        this.e = view;
    }

    public void b(final List<Pair<Long, Float>> list) {
        HandlerExecutor.b(new Runnable() { // from class: vnz
            @Override // java.lang.Runnable
            public final void run() {
                this.e.d(list);
            }
        });
    }

    /* synthetic */ void d(List list) {
        this.h = list;
        if (this.f51378b == null || njy.e(list) || list.size() <= 1) {
            LogUtil.j("WeightTrendChartViewHolder", "refreshCardView : mLineChart is null or mLineChartDataList is empty");
            return;
        }
        ArrayList arrayList = new ArrayList(this.h.size());
        float fMin = Float.MAX_VALUE;
        float fMax = Float.MIN_VALUE;
        for (int i = 0; i < this.h.size(); i++) {
            Pair<Long, Float> pair = this.h.get(i);
            if (pair != null) {
                arrayList.add(new HwHealthBaseEntry(i, ((Float) pair.second).floatValue()));
                fMin = Math.min(fMin, ((Float) pair.second).floatValue());
                fMax = Math.max(fMax, ((Float) pair.second).floatValue());
            }
        }
        if (arrayList.size() <= 0) {
            return;
        }
        d(0);
        d(arrayList, this.h, fMin, fMax);
    }

    private void d(List<HwHealthBaseEntry> list, List<Pair<Long, Float>> list2, float f, float f2) {
        float fC = c(list.size());
        b(0, list.size() - 1, fC);
        b(f, f2);
        List<IHwHealthLineDataSet> listE = e(list);
        c();
        this.f51378b.setData(new qnt(listE));
        b(list, fC);
        a(list2);
        e();
        b();
        this.f51378b.refresh();
    }

    private void b() {
        this.f51378b.addOnXRangeSet(new HwHealthBaseScrollBarLineChart.OnXRangeSet() { // from class: vnu
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.OnXRangeSet
            public final void onRangeShow(int i, int i2) {
                this.e.a(i, i2);
            }
        });
    }

    /* synthetic */ void a(int i, int i2) {
        this.j = i;
        if (this.d == i2) {
            return;
        }
        this.d = i2;
        Handler handler = this.f;
        if (handler != null) {
            handler.removeMessages(13);
            this.f.sendEmptyMessageDelayed(13, 500L);
        }
    }

    public static class e extends BaseHandler<vns> {
        e(vns vnsVar) {
            super(vnsVar);
        }

        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(vns vnsVar, Message message) {
            if (vnsVar == null || message == null) {
                LogUtil.j("WeightTrendChartViewHolder", "handleMessageWhenReferenceNotNull chartViewHolder == null !");
            } else if (message.what == 13) {
                vnsVar.a();
            } else {
                LogUtil.j("WeightTrendChartViewHolder", "unknown msg");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        int i = this.j;
        int i2 = this.d;
        int size = this.h.size();
        LogUtil.a("WeightTrendChartViewHolder", "updateDate startX = ", Integer.valueOf(i), " endX = ", Integer.valueOf(i2), " mTrendDataList.size() = ", Integer.valueOf(size), " mBodyDataKey = ", this.f51379c);
        if (this.h.size() <= 0 || i >= i2 || !njy.c(this.h, i) || !njy.c(this.h, i2)) {
            LogUtil.j("WeightTrendChartViewHolder", "updateDate data is error");
            return;
        }
        float fMin = Float.MAX_VALUE;
        float fMax = Float.MIN_VALUE;
        while (i <= i2) {
            Pair<Long, Float> pair = this.h.get(i);
            if (pair != null) {
                fMin = Math.min(fMin, ((Float) pair.second).floatValue());
                fMax = Math.max(fMax, ((Float) pair.second).floatValue());
            }
            i++;
        }
        LogUtil.a("WeightTrendChartViewHolder", "updateDate yMin = ", Float.valueOf(fMin), " yMax = ", Float.valueOf(fMax));
        b(fMin, fMax);
        this.f51378b.refresh();
    }

    private void b(List<HwHealthBaseEntry> list, float f) {
        this.f51378b.setPadding(0, 0, 0, 0);
        this.f51378b.setVisibleXRange(0.0f, Math.min(6, list.size() - 1) + (2.0f * f));
        if (!LanguageUtil.ba(BaseApplication.b())) {
            this.f51378b.moveViewToX(((list.size() - 1) - Math.min(6, list.size() - 1)) - f);
        }
        this.f51378b.highlightValue(list.size() - 1, false);
    }

    private void c() {
        DataRenderer renderer = this.f51378b.getRenderer();
        if (renderer instanceof qns) {
            ((qns) renderer).c(1);
        }
        this.f51378b.enableMarkerView(true);
        this.f51378b.fillChartBackground(qqn.b(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), R.color.device_card_bg_color), qqn.b(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), R.color.device_card_bg_color));
        this.f51378b.setBackgroundColor(ContextCompat.getColor(BaseApplication.b(), R.color.hw_hongmeng_bg));
        this.f51378b.makeReverse(true);
        this.f51378b.setMarkerSlidingMode(HwHealthBaseBarLineChart.MarkerViewSlidingMode.ACCORDING_DATA);
        this.f51378b.enableSpacePreserveForDataOverlay(true);
        this.f51378b.setLayerType(1, null);
        this.f51378b.getLegend().setEnabled(false);
        this.f51378b.getDescription().setEnabled(false);
        this.f51378b.setEnabled(false);
    }

    private List<IHwHealthLineDataSet> e(List<HwHealthBaseEntry> list) {
        HwHealthLineDataSet hwHealthLineDataSet = new HwHealthLineDataSet(BaseApplication.b(), list, "", "", "", 1);
        int iB = qqn.b(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), R.color.weight_primary_color);
        hwHealthLineDataSet.setColor(iB);
        hwHealthLineDataSet.a(qqn.b(iB, 0.5f), qqn.b(iB, 0.0f), true);
        hwHealthLineDataSet.setAxisDependency(HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY);
        hwHealthLineDataSet.setLabelCount(5, true);
        ArrayList arrayList = new ArrayList();
        arrayList.add(hwHealthLineDataSet);
        return arrayList;
    }

    private float c(int i) {
        return Math.min(i, 7) * 0.014f;
    }

    private void a(final List<Pair<Long, Float>> list) {
        this.f51378b.getXAxis().setValueFormatter(new HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter() { // from class: vns.2
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter
            public void enableMarkerViewShowRange(boolean z) {
            }

            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter
            public void setHealthType(HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter.HealthDeviceKindType healthDeviceKindType) {
            }

            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter
            public String getRangeText(double d, double d2) {
                return "";
            }

            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter
            public String getFormattedValueForMarkerView(float f, AxisBase axisBase) {
                if (!njy.e(list)) {
                    Date dateD = vns.this.d((int) f, (List<Pair<Long, Float>>) list);
                    return dateD == null ? "" : UnitUtil.a(dateD, 24);
                }
                LogUtil.j("WeightTrendChartViewHolder", "setXAxisValues() startTimes is empty");
                return "";
            }

            @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
            public String getFormattedValue(float f, AxisBase axisBase) {
                float fRound = f > 0.0f ? Math.round(f) : 0.0f;
                if (!njy.e(list)) {
                    Date dateD = vns.this.d((int) fRound, (List<Pair<Long, Float>>) list);
                    return dateD == null ? "" : UnitUtil.a(dateD, 131080);
                }
                LogUtil.j("WeightTrendChartViewHolder", "setXAxisValues() startTimes is empty");
                return "";
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Date d(int i, List<Pair<Long, Float>> list) {
        if (!njy.c(list, i) || list.get(i) == null) {
            return null;
        }
        return new Date(((Long) list.get(i).first).longValue());
    }

    private void e() {
        this.f51378b.setOnMarkViewTextNotify(new HwHealthMarkerView.OnMarkViewTextNotify() { // from class: vnt
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthMarkerView.OnMarkViewTextNotify
            public final void onTextChanged(String str, List list) {
                this.f51382a.d(str, list);
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x00d2  */
    /* synthetic */ void d(String str, List list) {
        String strE;
        if (njy.e(list)) {
            this.f51377a.setText(qre.a(R.string.IDS_weight_average, str, a(0.0f, "--")));
            LogUtil.j("WeightTrendChartViewHolder", "onListerMarkerTextChanged list ", list, " date ", str);
            return;
        }
        HwHealthBaseEntry hwHealthBaseEntry = ((HwHealthMarkerView.d) list.get(list.size() - 1)).f23737a;
        if (hwHealthBaseEntry == null) {
            this.f51377a.setText(qre.a(R.string.IDS_weight_average, str, a(0.0f, "--")));
            LogUtil.j("WeightTrendChartViewHolder", "onListerMarkerTextChanged entry is null date ", str);
            return;
        }
        float y = hwHealthBaseEntry.getY();
        LogUtil.a("WeightTrendChartViewHolder", "onListerMarkerTextChanged date ", str, " value ", Float.valueOf(y));
        String str2 = this.f51379c;
        str2.hashCode();
        switch (str2) {
            case "moistureRate":
            case "protein":
            case "bodyFatRate":
                strE = UnitUtil.e(y, 2, 1);
                break;
            case "bodyWeight":
                strE = b(y);
                break;
            case "waistHipRatioUser":
            case "waistHipRatio":
            case "boneSalt":
                strE = UnitUtil.e(y, 1, 2);
                break;
            case "heartRate":
                strE = UnitUtil.e(y, 1, 0);
                break;
            default:
                strE = UnitUtil.e(y, 1, 1);
                break;
        }
        this.f51377a.setText(qre.a(R.string.IDS_weight_average, str, a(y, strE)));
    }

    private String b(float f) {
        dnb dnbVar = this.g;
        if (dnbVar == null) {
            return UnitUtil.e(f, 1, 1);
        }
        return UnitUtil.e(f, 1, dnbVar.getFractionDigitByType(0));
    }

    private void b(float f, float f2) {
        float fE;
        float fD;
        IAxisValueFormatter valueFormatter;
        WeightTrendLineChart weightTrendLineChart = this.f51378b;
        if (weightTrendLineChart == null) {
            LogUtil.j("WeightTrendChartViewHolder", "initAxis mLineChart is null");
            return;
        }
        HwHealthYAxis axisFirstParty = weightTrendLineChart.getAxisFirstParty();
        axisFirstParty.setDrawLabels(true);
        axisFirstParty.setDrawAxisLine(true);
        axisFirstParty.setDrawGridLines(true);
        if (f < 0.0f) {
            f = 0.0f;
        }
        LogUtil.a("WeightTrendChartViewHolder", "initYAxis : axisMinimum = ", Float.valueOf(f), " - axisMaximum = ", Float.valueOf(f2), " mBodyDataKey = ", this.f51379c);
        if (this.f51379c.equals("bodyWeight") || this.f51379c.equals(BleConstants.BASAL_METABOLISM) || this.f51379c.equals(BleConstants.MOISTURE_RATE) || this.f51379c.equals("weight_fat_free") || this.f51379c.equals(IndoorEquipManagerApi.KEY_HEART_RATE)) {
            fE = vng.e(f2, 4.0d, 0);
            fD = vng.d(f, 4.0d, 0);
            valueFormatter = axisFirstParty.getValueFormatter();
        } else if (this.f51379c.equals(BleConstants.BONE_SALT) || this.f51379c.equals("waistHipRatioUser")) {
            fE = vng.e(f2, 0.04d, 2);
            fD = vng.d(f, 0.04d, 2);
            valueFormatter = a(2);
        } else {
            fE = vng.e(f2, 0.4d, 1);
            fD = vng.d(f, 0.4d, 1);
            valueFormatter = a(1);
        }
        LogUtil.a("WeightTrendChartViewHolder", "initYAxis : yMin = ", Float.valueOf(fD), " - yMax = ", Float.valueOf(fE), " mBodyDataKey = ", this.f51379c);
        axisFirstParty.setAxisMinimum(fD);
        axisFirstParty.setAxisMaximum(fE * 1.05f);
        axisFirstParty.setValueFormatter(valueFormatter);
    }

    private IAxisValueFormatter a(final int i) {
        return new IAxisValueFormatter() { // from class: vns.5
            @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
            public String getFormattedValue(float f, AxisBase axisBase) {
                String str;
                int i2 = i;
                if (i2 == 1) {
                    str = "0.0";
                } else if (i2 != 2) {
                    str = "0";
                } else {
                    str = "0.00";
                }
                return new DecimalFormat(str).format(f);
            }
        };
    }

    private void b(int i, float f, float f2) {
        WeightTrendLineChart weightTrendLineChart = this.f51378b;
        if (weightTrendLineChart == null) {
            LogUtil.j("WeightTrendChartViewHolder", "initAxis mLineChart is null");
            return;
        }
        XAxis xAxis = weightTrendLineChart.getXAxis();
        xAxis.setEnabled(true);
        xAxis.setDrawLabels(true);
        if (Math.min(Math.round(f) + 1, 7) < 7) {
            xAxis.setLabelCount(Math.min(Math.round(f) + 1, 7), true);
            xAxis.setAvoidFirstLastClipping(true);
        }
        xAxis.setAxisMinimum(i - f2);
        xAxis.setAxisMaximum(f + f2);
    }

    public void d(int i) {
        View view = this.i;
        if (view != null) {
            view.setVisibility(i);
        }
        View view2 = this.e;
        if (view2 != null) {
            view2.setVisibility(i);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:65:0x00c8  */
    private String a(float f, String str) {
        int iD;
        String str2 = this.f51379c;
        str2.hashCode();
        switch (str2) {
            case "thighGirth":
            case "calves":
            case "armCircumference":
            case "bustGirth":
            case "waistGirth":
            case "hipline":
                if (!UnitUtil.f()) {
                    iD = R.plurals.IDS_avg_cm_weight;
                    break;
                } else {
                    iD = R.plurals.IDS_avg_ins_weight;
                    break;
                }
                break;
            case "basalMetabolism":
                iD = R.plurals.IDS_avg_cal_weight;
                break;
            case "muscleMass":
            case "bodyWeight":
            case "skeletalMusclelMass":
            case "weight_fat_free":
            case "boneSalt":
                iD = d();
                break;
            case "rasm":
                iD = R.plurals.IDS_avg_skeletal_muscle_weight;
                break;
            case "heartRate":
                iD = R.plurals.IDS_avg_rate_weight;
                break;
            case "visceralFatLevel":
                iD = R.plurals.IDS_avg_level_weight;
                break;
            default:
                return str;
        }
        return qre.e(iD, UnitUtil.b(f, Locale.getDefault()), str);
    }

    private int d() {
        int iE = UnitUtil.e();
        if (iE == 1) {
            return R.plurals.IDS_health_catty;
        }
        if (iE == 3) {
            return R.plurals.IDS_avg_lb_weight;
        }
        return R.plurals.IDS_avg_kg_weight;
    }

    public void b(String str) {
        this.f51379c = str;
    }
}
