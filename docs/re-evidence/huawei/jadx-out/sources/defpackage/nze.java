package defpackage;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.github.mikephil.charting.data.Entry;
import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.R;
import com.huawei.indoorequip.datastruct.SupportDataRange;
import com.huawei.indoorequip.ui.hrcontrol.HeartRateControlSportChart;
import com.huawei.indoorequip.ui.view.SportEquipItemDrawer;
import com.huawei.indoorequip.viewmodel.IndoorEquipViewModel;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class nze {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private nyv f43996a;
    private int aa;
    private HealthTextView ab;
    private List<String> ac;
    private HealthTextView ad;
    private HealthTextView ae;
    private HealthTextView af;
    private HealthTextView ag;
    private LinearLayout ah;
    private HealthTextView ai;
    private HealthTextView ak;
    private HealthTextView al;
    private HealthTextView am;
    private HealthTextView an;
    private IndoorEquipViewModel as;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private nys f43997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HeartRateControlSportChart f43998c;
    private LinearLayout d;
    private nzb e;
    private Context f;
    private View g;
    private boolean i;
    private boolean j;
    private SportEquipItemDrawer l;
    private SportEquipItemDrawer m;
    private SportEquipItemDrawer n;
    private LinearLayout o;
    private LinearLayout q;
    private View r;
    private LinearLayout t;
    private List<Pair<Integer, Integer>> u;
    private int v;
    private List<Pair<Integer, Integer>> w;
    private List<Integer> x;
    private String y;
    private HealthTextView z;
    private LinearLayout.LayoutParams k = new LinearLayout.LayoutParams(-2, -2);
    private LinearLayout.LayoutParams s = new LinearLayout.LayoutParams(-2, -2);
    private LinearLayout.LayoutParams aj = new LinearLayout.LayoutParams(-2, -2);
    private int h = 1;
    private int p = 0;

    public nze(Context context, View view, IndoorEquipViewModel indoorEquipViewModel, boolean z) {
        this.y = "";
        this.f = context;
        this.r = view;
        this.as = indoorEquipViewModel;
        this.j = z;
        if (indoorEquipViewModel != null) {
            this.v = indoorEquipViewModel.getSportType();
            this.y = indoorEquipViewModel.s();
        }
        d();
        this.e = new nzb(this.f43998c);
    }

    public void a(SupportDataRange supportDataRange) {
        this.n = new SportEquipItemDrawer(this.f);
        this.l = new SportEquipItemDrawer(this.f);
        HashMap map = new HashMap();
        this.f43996a = new nyv(this.f, this.v, true, supportDataRange);
        c(map);
    }

    public void d(float f, float f2, float f3, SupportDataRange supportDataRange) {
        this.m = new SportEquipItemDrawer(this.f);
        HashMap map = new HashMap();
        nys nysVar = new nys(this.f, this.v, true, f, f2, supportDataRange);
        this.f43997b = nysVar;
        nysVar.b(f3);
        e(map);
        nzb nzbVar = this.e;
        if (nzbVar != null) {
            nzbVar.b();
        }
        b(this.as.m());
    }

    public void a(Map<Integer, Object> map) {
        if (this.r == null) {
            LogUtil.j("HeartRateControlSportViewHolder", "root view is null");
            return;
        }
        if (map == null) {
            LogUtil.j("HeartRateControlSportViewHolder", "sport data map is null");
            return;
        }
        f(map);
        i(map);
        j(map);
        c(map);
        if (this.n.getParent() != null && (this.n.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.n.getParent()).removeView(this.n);
        }
        if (this.l.getParent() != null && (this.l.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.l.getParent()).removeView(this.l);
        }
        this.t.addView(this.l);
        this.o.addView(this.n);
        LogUtil.d("HeartRateControlSportViewHolder", "add view");
    }

    public void d(Map<Integer, Object> map) {
        if (this.r == null) {
            LogUtil.j("HeartRateControlSportViewHolder", "tv root view is null");
            return;
        }
        if (map == null) {
            LogUtil.j("HeartRateControlSportViewHolder", "tv sport data map is null");
            return;
        }
        i(map);
        j(map);
        e(map);
        if (this.m.getParent() != null && (this.m.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.m.getParent()).removeView(this.m);
        }
        this.ah.addView(this.m);
        LogUtil.d("HeartRateControlSportViewHolder", "add tv sport view");
    }

    public void b(Map<String, Object> map) {
        if (map == null) {
            LogUtil.j("HeartRateControlSportViewHolder", "course data map is null");
            return;
        }
        if (map.containsKey("COURSE_MIN_HEART_RATE") && map.containsKey("COURSE_MAX_HEART_RATE")) {
            int iB = fgp.d().b();
            int iE = fgp.d().e();
            LogUtil.a("HeartRateControlSportViewHolder", "update chart, maxHeartRate ", Integer.valueOf(iB), " restHeartRate ", Integer.valueOf(iE));
            this.e.d(iE - ((Integer) map.get("COURSE_MIN_HEART_RATE")).intValue(), iB + ((Integer) map.get("COURSE_MAX_HEART_RATE")).intValue());
        }
        if (map.containsKey("COURSE_NAME_LIST")) {
            this.ac = (List) map.get("COURSE_NAME_LIST");
        }
        if (map.containsKey("COURSE_DURATION_LIST")) {
            this.x = (List) map.get("COURSE_DURATION_LIST");
            c();
        }
        if (map.containsKey("COURSE_HEART_RATE_LIST")) {
            this.u = (List) map.get("COURSE_HEART_RATE_LIST");
            c();
        }
        if (map.containsKey("COURSE_CADENCE_LIST") && (map.get("COURSE_CADENCE_LIST") instanceof List)) {
            this.w = (List) map.get("COURSE_CADENCE_LIST");
        }
        if (map.containsKey("COURSE_DURATION")) {
            this.aa = ((Integer) map.get("COURSE_DURATION")).intValue();
            if (a() && !this.i) {
                this.i = true;
                b();
                f();
            }
        }
        if (map.containsKey("CURRENT_STAGE_NUMBER")) {
            b(((Integer) map.get("CURRENT_STAGE_NUMBER")).intValue());
        }
    }

    private void d() {
        this.af = (HealthTextView) this.r.findViewById(R.id.tv_current_stage);
        this.an = (HealthTextView) this.r.findViewById(R.id.tv_total_stage);
        this.al = (HealthTextView) this.r.findViewById(R.id.tv_stage_name);
        this.am = (HealthTextView) this.r.findViewById(R.id.tv_stage_duration);
        this.ae = (HealthTextView) this.r.findViewById(R.id.tv_recommend_hr_interval);
        this.ag = (HealthTextView) this.r.findViewById(R.id.tv_current_hr_value);
        this.ak = (HealthTextView) this.r.findViewById(R.id.tv_stage_divider);
        this.ai = (HealthTextView) this.r.findViewById(R.id.tv_recommend_hr_title);
        this.ad = (HealthTextView) this.r.findViewById(R.id.tv_chart_legend);
        this.ab = (HealthTextView) this.r.findViewById(R.id.tv_recommend_cadence_interval);
        this.d = (LinearLayout) this.r.findViewById(R.id.layout_cadence_data);
        this.g = this.r.findViewById(R.id.center_divider);
        this.z = (HealthTextView) this.r.findViewById(R.id.tv_current_cadence_value);
        this.q = (LinearLayout) this.r.findViewById(R.id.realtime_hr_layout);
        HeartRateControlSportChart heartRateControlSportChart = (HeartRateControlSportChart) this.r.findViewById(R.id.recommend_interval_chart);
        this.f43998c = heartRateControlSportChart;
        heartRateControlSportChart.setNoDataText("");
        if (this.j) {
            this.ah = (LinearLayout) this.r.findViewById(R.id.ll_sport_data_layout);
        } else {
            this.o = (LinearLayout) this.r.findViewById(R.id.ll_left_data_layout);
            this.t = (LinearLayout) this.r.findViewById(R.id.ll_right_data_layout);
        }
        this.ag.setText("--");
        this.z.setText("--");
        this.ad.setText(this.f.getString(R.string.IDS_main_watch_heart_rate_string));
        h();
    }

    private void h() {
        if (this.v == 264) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.alignWithParent = true;
            layoutParams.addRule(14);
            this.q.setLayoutParams(layoutParams);
        }
        if (this.v == 265) {
            this.g.setVisibility(0);
            this.d.setVisibility(0);
        }
    }

    private void b(int i) {
        LogUtil.a("HeartRateControlSportViewHolder", "enter updateStageInfo num: ", Integer.valueOf(i));
        if (!e()) {
            LogUtil.j("HeartRateControlSportViewHolder", "updateStageInfo course data not received");
            return;
        }
        if (i < 1 || i < this.h || i > this.ac.size()) {
            LogUtil.j("HeartRateControlSportViewHolder", "updateStageInfo stage num error");
            return;
        }
        this.h = i;
        int i2 = i - 1;
        this.af.setText(String.valueOf(i));
        this.an.setText(String.valueOf(this.ac.size()));
        this.al.setText(this.ac.get(i2));
        this.am.setText(this.f.getString(R.string.IDS_hw_show_set_target_sport_time_unit, esn.c(this.x.get(i2).intValue())).replaceAll(" ", ""));
        Pair<Integer, Integer> pair = this.u.get(i2);
        this.ae.setText(pair.first + " - " + pair.second);
        this.ak.setVisibility(0);
        this.ai.setVisibility(0);
        if (this.v != 265 || njy.e(this.w)) {
            return;
        }
        Pair<Integer, Integer> pair2 = this.w.get(i2);
        this.ab.setText(pair2.first + " - " + pair2.second);
    }

    private void c() {
        if (a()) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (int i2 = 0; i2 < this.u.size(); i2++) {
                int iIntValue = this.x.get(i2).intValue();
                Pair<Integer, Integer> pair = this.u.get(i2);
                i += iIntValue;
                arrayList.add(new qml(i, ((Integer) pair.second).intValue(), i, ((Integer) pair.first).intValue()));
            }
            this.e.c(arrayList);
            this.e.e(i);
        }
    }

    private void f(Map<Integer, Object> map) {
        int iIntValue = map.containsKey(2) ? ((Integer) map.get(2)).intValue() : 0;
        if (iIntValue > 0 && iIntValue <= this.aa && iIntValue != this.p) {
            this.p = iIntValue;
            LogUtil.a("HeartRateControlSportViewHolder", "saveLastSportDuration:", Integer.valueOf(iIntValue));
            b("lastSportDuration", iIntValue);
        }
        IndoorEquipViewModel indoorEquipViewModel = this.as;
        if (indoorEquipViewModel == null || indoorEquipViewModel.getMotionPath() == null) {
            LogUtil.j("HeartRateControlSportViewHolder", "saveSportDuration mViewModel or MotionPath is null");
            return;
        }
        MotionPath motionPath = this.as.getMotionPath();
        ArrayList<HeartRateData> arrayListRequestHeartRateList = motionPath.requestHeartRateList();
        ArrayList<HeartRateData> arrayListRequestInvalidHeartRateList = motionPath.requestInvalidHeartRateList();
        if (njy.e(arrayListRequestHeartRateList) && njy.e(arrayListRequestInvalidHeartRateList)) {
            LogUtil.a("HeartRateControlSportViewHolder", "saveStartSportDuration:", Integer.valueOf(iIntValue));
            b("startSportDuration", iIntValue);
        }
    }

    private void f() {
        IndoorEquipViewModel indoorEquipViewModel = this.as;
        if (indoorEquipViewModel == null) {
            LogUtil.j("HeartRateControlSportViewHolder", "showHistoryHeartRate mViewModel is null");
            return;
        }
        List<HeartRateData> listD = d(indoorEquipViewModel.getMotionPath());
        if (njy.e(listD)) {
            return;
        }
        LogUtil.a("HeartRateControlSportViewHolder", "showHistoryHeartRate start show history heart rate data,", Integer.valueOf(listD.size()));
        ArrayList arrayList = new ArrayList();
        for (HeartRateData heartRateData : listD) {
            int iAcquireTime = (int) heartRateData.acquireTime();
            int iAcquireHeartRate = heartRateData.acquireHeartRate();
            if (iAcquireTime >= 0 && iAcquireTime < this.aa && iAcquireHeartRate >= 40 && iAcquireHeartRate <= 220) {
                arrayList.add(new Entry(iAcquireTime, iAcquireHeartRate));
            }
        }
        this.e.d(arrayList);
    }

    private void b() {
        IndoorEquipViewModel indoorEquipViewModel = this.as;
        if (indoorEquipViewModel == null) {
            LogUtil.j("HeartRateControlSportViewHolder", "adjustChartWithHistoryHr mViewModel is null");
            return;
        }
        if (indoorEquipViewModel.getMotionPath() == null || njy.e(this.as.getMotionPath().requestHeartRateList())) {
            LogUtil.j("HeartRateControlSportViewHolder", "requestHeartRateList is empty");
            return;
        }
        ArrayList<HeartRateData> arrayListRequestHeartRateList = this.as.getMotionPath().requestHeartRateList();
        LogUtil.a("HeartRateControlSportViewHolder", "heartRateList start show history heart rate data,", arrayListRequestHeartRateList);
        int iAcquireHeartRate = arrayListRequestHeartRateList.get(0).acquireHeartRate();
        int iAcquireHeartRate2 = arrayListRequestHeartRateList.get(0).acquireHeartRate();
        Iterator<HeartRateData> it = arrayListRequestHeartRateList.iterator();
        while (it.hasNext()) {
            int iAcquireHeartRate3 = it.next().acquireHeartRate();
            iAcquireHeartRate = Math.max(iAcquireHeartRate, iAcquireHeartRate3);
            iAcquireHeartRate2 = Math.min(iAcquireHeartRate2, iAcquireHeartRate3);
        }
        this.e.a(iAcquireHeartRate);
        this.e.a(iAcquireHeartRate2);
    }

    private List<HeartRateData> d(MotionPath motionPath) {
        if (motionPath == null || njy.e(motionPath.requestHeartRateList())) {
            LogUtil.j("HeartRateControlSportViewHolder", "getHistoryHeartRateData heart rate data is null");
            return null;
        }
        int iD = d("lastSportDuration");
        if (iD == 0) {
            LogUtil.j("HeartRateControlSportViewHolder", "getHistoryHeartRateData last sport duration is zero");
            return null;
        }
        ArrayList arrayList = new ArrayList(16);
        ArrayList<HeartRateData> arrayListRequestHeartRateList = motionPath.requestHeartRateList();
        List<HeartRateData> listRequestInvalidHeartRateList = motionPath.requestInvalidHeartRateList();
        if (!njy.e(listRequestInvalidHeartRateList)) {
            e(arrayListRequestHeartRateList, listRequestInvalidHeartRateList, arrayList);
        } else {
            arrayList.addAll(arrayListRequestHeartRateList);
        }
        int iD2 = d("startSportDuration");
        float size = (iD - iD2) / (arrayList.size() > 1 ? arrayList.size() - 1 : 1);
        ArrayList arrayList2 = new ArrayList(16);
        for (int i = 0; i < arrayList.size(); i++) {
            HeartRateData heartRateData = (HeartRateData) arrayList.get(i);
            if (heartRateData != null) {
                arrayList2.add(new HeartRateData((long) (iD2 + (i * size)), heartRateData.acquireHeartRate()));
            }
        }
        return arrayList2;
    }

    private void e(List<HeartRateData> list, List<HeartRateData> list2, List<HeartRateData> list3) {
        int i = 0;
        for (HeartRateData heartRateData : list) {
            while (i < list2.size()) {
                HeartRateData heartRateData2 = list2.get(i);
                if (heartRateData2.acquireTime() >= heartRateData.acquireTime()) {
                    break;
                }
                i++;
                list3.add(new HeartRateData(heartRateData2.acquireTime(), heartRateData2.acquireHeartRate()));
            }
            if (list3 != null) {
                list3.add(new HeartRateData(heartRateData.acquireTime(), heartRateData.acquireHeartRate()));
            }
        }
    }

    private int d(String str) {
        return SharedPreferenceManager.c(Integer.toString(20002), str, 0);
    }

    private void b(String str, int i) {
        SharedPreferenceManager.d(Integer.toString(20002), str, i);
    }

    private boolean a() {
        if (njy.e(this.x)) {
            LogUtil.j("HeartRateControlSportViewHolder", "stage duration list is null");
            return false;
        }
        if (njy.e(this.u)) {
            LogUtil.j("HeartRateControlSportViewHolder", "stage hr scope list is null");
            return false;
        }
        if (this.x.size() == this.u.size()) {
            return true;
        }
        LogUtil.j("HeartRateControlSportViewHolder", "stage size diff");
        return false;
    }

    private boolean e() {
        if (njy.e(this.ac)) {
            LogUtil.j("HeartRateControlSportViewHolder", "stage name list is null");
            return false;
        }
        if (!a() || this.x.size() == this.ac.size()) {
            return true;
        }
        LogUtil.j("HeartRateControlSportViewHolder", "stage size diff");
        return false;
    }

    private void c(Map<Integer, Object> map) {
        int i = this.v;
        if (i == 264 || i == 265) {
            d(map, 3);
            b(map, 3);
        } else {
            LogUtil.a("HeartRateControlSportViewHolder", "other sportType =", Integer.valueOf(i));
        }
    }

    private void e(Map<Integer, Object> map) {
        int i = this.v;
        if (i == 264 || i == 265) {
            a(map, 6);
        } else {
            LogUtil.a("HeartRateControlSportViewHolder", "other tv sportType =", Integer.valueOf(i));
        }
    }

    private void i(Map<Integer, Object> map) {
        if (this.e == null) {
            LogUtil.j("HeartRateControlSportViewHolder", "updateChartData mChartHolder is null");
            return;
        }
        int iIntValue = map.containsKey(2) ? ((Integer) map.get(2)).intValue() : 0;
        int iIntValue2 = map.containsKey(20004) ? ((Integer) map.get(20004)).intValue() : 0;
        if (iIntValue >= 0) {
            this.e.e(iIntValue, iIntValue2);
        }
    }

    private void j(Map<Integer, Object> map) {
        int iIntValue = 0;
        int iIntValue2 = map.containsKey(20004) ? ((Integer) map.get(20004)).intValue() : 0;
        if (iIntValue2 > 0 && iIntValue2 < 255) {
            this.ag.setText(String.valueOf(iIntValue2));
        } else {
            this.ag.setText("--");
        }
        if (this.v == 265) {
            iIntValue = map.get(31) != null ? ((Integer) map.get(31)).intValue() : 0;
            this.z.setText(String.valueOf(iIntValue));
        }
        LogUtil.a("HeartRateControlSportViewHolder", "updateHeartRateData hr: ", Integer.valueOf(iIntValue2), " cadence ", Integer.valueOf(iIntValue));
    }

    private void d(Map<Integer, Object> map, int i) {
        this.n.b(i);
        this.n.setLayoutParams(this.k);
        int[] iArrA = nyh.a(this.v, 8, -1, this.y);
        LogUtil.a("HeartRateControlSportViewHolder", "left sport data items: ", Arrays.toString(iArrA));
        this.f43996a.d(this.n, map, iArrA);
    }

    private void b(Map<Integer, Object> map, int i) {
        this.l.b(i);
        this.l.setLayoutParams(this.s);
        int[] iArrA = nyh.a(this.v, 9, -1, this.y);
        LogUtil.a("HeartRateControlSportViewHolder", "right sport data items: ", Arrays.toString(iArrA));
        this.f43996a.d(this.l, map, iArrA);
    }

    private void a(Map<Integer, Object> map, int i) {
        this.m.b(i);
        this.m.setLayoutParams(this.aj);
        int[] iArrA = nyh.a(this.v, 10, -1, this.y);
        LogUtil.a("HeartRateControlSportViewHolder", "tv sport data items: ", Arrays.toString(iArrA));
        this.f43997b.d(this.m, map, iArrA);
    }
}
