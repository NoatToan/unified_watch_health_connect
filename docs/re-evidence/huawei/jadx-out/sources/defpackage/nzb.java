package defpackage;

import android.graphics.Color;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateThresholdConfig;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.ui.hrcontrol.HeartRateControlSportChart;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class nzb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f43990a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HeartRateControlSportChart f43991c;
    private List<qml> f;
    private int h;
    private static final int e = Color.parseColor("#80EB4667");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f43989b = Color.parseColor("#4DEB4667");
    private List<Entry> d = new ArrayList();
    private int g = 1800;

    public nzb(HeartRateControlSportChart heartRateControlSportChart) {
        this.f43991c = heartRateControlSportChart;
        a();
    }

    public void c(List<qml> list) {
        this.f = list;
        this.f43991c.setIntervalAreaList(b(0));
    }

    public void e(int i) {
        this.g = i;
        e();
    }

    public void d(int i, int i2) {
        LogUtil.a("HeartRateControlSportChartHolder", "min:", Integer.valueOf(i), "max:", Integer.valueOf(i2));
        this.h = Math.max(i, 40);
        int iMin = Math.min(i2, HeartRateThresholdConfig.HEART_RATE_LIMIT);
        this.f43990a = iMin;
        if (iMin <= this.h) {
            this.h = 40;
            this.f43990a = HeartRateThresholdConfig.HEART_RATE_LIMIT;
            LogUtil.a("HeartRateControlSportChartHolder", "adjustChartY invalid");
        } else {
            YAxis axisLeft = this.f43991c.getAxisLeft();
            axisLeft.setAxisMaximum(this.f43990a);
            axisLeft.setAxisMinimum(this.h);
        }
    }

    private void a() {
        YAxis axisLeft = this.f43991c.getAxisLeft();
        axisLeft.setAxisMaximum(220.0f);
        axisLeft.setAxisMinimum(40.0f);
        axisLeft.setLabelCount(5, true);
        e();
    }

    private void e() {
        XAxis xAxis = this.f43991c.getXAxis();
        xAxis.setAxisMinimum(0.0f);
        xAxis.setAxisMaximum(this.g);
        xAxis.setLabelCount(6, true);
    }

    public void b() {
        HeartRateControlSportChart heartRateControlSportChart = this.f43991c;
        if (heartRateControlSportChart != null) {
            heartRateControlSportChart.d();
        }
    }

    public void e(int i, int i2) {
        if (i >= 0) {
            this.f43991c.setIntervalAreaList(b(i));
        }
        if (i2 >= 40 && i2 <= 220) {
            this.d.add(new Entry(i, i2));
            a(i2);
        }
        this.f43991c.setChartData(this.d);
    }

    public void a(int i) {
        if (i > this.f43990a || i < this.h) {
            LogUtil.a("HeartRateControlSportChartHolder", "judgeAndAdjustChartY:", Integer.valueOf(i));
            int i2 = this.h;
            if (i < i2) {
                d(((int) Math.floor(((double) i) / 10.0d)) * 10, this.f43990a);
            } else if (i > this.f43990a) {
                d(i2, ((int) Math.ceil(((double) i) / 10.0d)) * 10);
            } else {
                LogUtil.a("HeartRateControlSportChartHolder", "not judgeAndAdjustChartY");
            }
        }
    }

    public void d(List<Entry> list) {
        if (njy.e(list)) {
            LogUtil.j("HeartRateControlSportChartHolder", "chart rate data list is null");
            return;
        }
        int x = (int) list.get(list.size() - 1).getX();
        if (x >= 0 && x <= this.g) {
            this.f43991c.setIntervalAreaList(b(x));
        }
        this.d.clear();
        this.d.addAll(list);
        this.f43991c.setChartData(this.d);
    }

    private List<qml> b(int i) {
        LogUtil.a("HeartRateControlSportChartHolder", "enter getDrawIntervalArea time: ", Integer.valueOf(i));
        ArrayList arrayList = new ArrayList();
        List<qml> list = this.f;
        if (list == null || list.size() < 1) {
            LogUtil.j("HeartRateControlSportChartHolder", "mOriginAreaList is null");
            return arrayList;
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            qml qmlVar = this.f.get(i2);
            float fC = qmlVar.c();
            float fD = qmlVar.d();
            float fE = qmlVar.e();
            float fB = qmlVar.b();
            float f = i;
            if (f > fD) {
                arrayList.add(new qml(fC, fE, fD, fB, e));
            } else if (f >= fC && f <= fD) {
                arrayList.add(new qml(fC, fE, f, fB, e));
                arrayList.add(new qml(f, fE, fD, fB, f43989b));
            } else {
                arrayList.add(new qml(fC, fE, fD, fB, f43989b));
            }
        }
        return arrayList;
    }
}
