package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.knit.section.view.SectionPieChartBasicAdapter;
import com.huawei.health.knit.section.view.SectionPieChartTrendAdapter;
import com.huawei.hihealth.data.model.HiBloodPressureMetaData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.chart.HealthTrendBarChart;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.util.BloodPressureUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class utl {
    private SectionPieChartBasicAdapter.b i;
    private final String j;
    private long l;
    private utl n;
    private final String o;
    private final String s;
    private final String t;
    private List<uwh> k = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<Integer, Integer> f50549b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<uwh> f50550c = new ArrayList();
    private double g = 0.0d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f50548a = 0.0d;
    private double d = 0.0d;
    private long q = 0;
    private long m = 0;
    private int v = 0;
    private String e = "--";
    private DataInfos h = DataInfos.NoDataPlaceHolder;
    private List<SectionPieChartBasicAdapter.b> f = new ArrayList();
    private Map<String, Map<Integer, Integer>> p = new HashMap();
    private Map<String, List<SectionPieChartBasicAdapter.b>> r = new HashMap();
    private List<SectionPieChartTrendAdapter.a> x = new ArrayList();

    public void e(long j) {
        this.l = j;
    }

    public long h() {
        return this.l;
    }

    public utl() {
        Context contextB = BaseApplication.b();
        this.i = new SectionPieChartBasicAdapter.b(contextB.getString(R.string.IDS_weight_index), contextB.getString(R.string.IDS_blood_pressure_max), contextB.getString(R.string.IDS_blood_pressure_min), contextB.getString(R.string.IDS_blood_pressure_average));
        this.t = contextB.getString(R.string.IDS_blood_pressure_systolic);
        this.j = contextB.getString(R.string.IDS_blood_pressure_diastolic);
        this.s = contextB.getString(R.string.IDS_pulse_rate);
        this.o = contextB.getString(R.string.IDS_pulse_pressure_difference);
    }

    private void k() {
        this.k.clear();
        this.f50549b.clear();
        this.f50550c.clear();
        this.g = 0.0d;
        this.f50548a = 0.0d;
        this.d = 0.0d;
        this.q = 0L;
        this.m = 0L;
        this.v = 0;
        this.f.clear();
        this.x.clear();
        this.e = "--";
    }

    public void b(DataInfos dataInfos) {
        this.h = dataInfos;
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        uwh f50551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f50552b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f50553c;
        int d;
        int e;
        int f;
        uwh g;
        int h;
        uwh i;
        uwh j;
        uwh k;
        int l;
        uwh n;

        private b() {
            this.h = Integer.MAX_VALUE;
            this.f = Integer.MIN_VALUE;
            this.f50553c = 0;
            this.d = 0;
            this.f50552b = 0;
            this.i = null;
            this.k = null;
            this.f50551a = null;
            this.g = null;
            this.j = null;
            this.n = null;
            this.l = 0;
            this.e = 0;
        }
    }

    public void d(List<uwh> list, long j, long j2) {
        if (this.n == null) {
            this.n = new utl();
        }
        this.n.b(list, j, j2);
    }

    public void b(List<uwh> list, long j, long j2) {
        e(list, j, j2);
        if (this.h == DataInfos.BloodPressureMonthDetail || this.h == DataInfos.BloodPressureWeekDetail) {
            c(list, j, j2);
        }
    }

    void e(List<uwh> list, long j, long j2) {
        k();
        if (njy.e(list)) {
            return;
        }
        this.k.addAll(list);
        this.q = j;
        this.m = j2;
        this.f50550c.clear();
        b bVar = new b();
        c(list, bVar);
        a(list, this.f50549b, bVar);
        d(list);
        b(bVar);
    }

    private void c(List<uwh> list, b bVar) {
        int size = list.size();
        int i = 0;
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        for (uwh uwhVar : list) {
            double dM = uwhVar.m();
            double dO = uwhVar.o();
            double dL = uwhVar.l();
            d += dM;
            d2 += dO;
            if (dL > 0.0d) {
                d3 += dL;
                i++;
            }
        }
        this.d = i > 0 ? Math.round(d3 / ((double) i)) : 0.0d;
        double d4 = size;
        this.g = Math.round(d / d4);
        this.f50548a = Math.round(d2 / d4);
        bVar.f50553c = (int) this.g;
        bVar.d = (int) this.f50548a;
        bVar.f50552b = (int) this.d;
    }

    void c(List<uwh> list, long j, long j2) {
        LogUtil.a("BloodPressureData", "updateTimeSharingData");
        this.p.clear();
        this.r.clear();
        if (njy.e(list)) {
            LogUtil.a("BloodPressureData", "dataList is empty");
            return;
        }
        Iterator<uwh> it = list.iterator();
        while (it.hasNext()) {
            LogUtil.a("BloodPressureData", "timeSharingData: " + it.next().toString());
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        for (uwh uwhVar : list) {
            int iN = (int) uwhVar.n();
            a(uwhVar, map);
            if (!map2.containsKey(Integer.valueOf(iN))) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(uwhVar);
                map2.put(Integer.valueOf((int) uwhVar.n()), arrayList);
            } else {
                List<uwh> list2 = map2.get(Integer.valueOf(iN));
                if (list2 != null) {
                    list2.add(uwhVar);
                }
            }
        }
        for (Map.Entry<String, List<uwh>> entry : map.entrySet()) {
            b(entry.getKey(), entry.getValue(), j, j2);
        }
        c(map2, j, j2);
    }

    private void c(Map<Integer, List<uwh>> map, long j, long j2) {
        HashMap map2 = new HashMap();
        for (Map.Entry<Integer, List<uwh>> entry : map.entrySet()) {
            List<uwu> listA = BloodPressureUtil.a();
            BloodPressureUtil.d(BloodPressureUtil.a(entry.getKey().intValue()), listA);
            for (uwu uwuVar : listA) {
                if (uwuVar.g()) {
                    if (map2.containsKey(uwuVar.b()) && map2.get(uwuVar.b()) != null) {
                        ((List) map2.get(uwuVar.b())).addAll(entry.getValue());
                    } else {
                        map2.put(uwuVar.b(), new ArrayList(entry.getValue()));
                    }
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            b((String) entry2.getKey(), (List) entry2.getValue(), j, j2);
        }
    }

    private void a(uwh uwhVar, Map<String, List<uwh>> map) {
        HiBloodPressureMetaData hiBloodPressureMetaData;
        if (TextUtils.isEmpty(uwhVar.j()) || (hiBloodPressureMetaData = (HiBloodPressureMetaData) qqt.e(uwhVar.j(), HiBloodPressureMetaData.class)) == null) {
            return;
        }
        List<String> activityActions = hiBloodPressureMetaData.getActivityActions();
        if (njy.e(activityActions)) {
            LogUtil.a("BloodPressureData", "activity actions is empty");
            return;
        }
        for (String str : activityActions) {
            if (!map.containsKey(str)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(uwhVar);
                map.put(str, arrayList);
            } else {
                List<uwh> list = map.get(str);
                if (list != null) {
                    list.add(uwhVar);
                }
            }
        }
    }

    private void b(b bVar) {
        Context contextB = BaseApplication.b();
        if (this.h == DataInfos.BloodPressureMonthDetail || this.h == DataInfos.BloodPressureWeekDetail) {
            b(contextB, bVar, this.f);
            a(contextB, bVar);
        }
    }

    private void b(Context context, b bVar, List<SectionPieChartBasicAdapter.b> list) {
        list.clear();
        int iA = ftw.a();
        list.add(this.i);
        list.add(b(bVar, context, iA));
        list.add(d(bVar, context, iA));
        list.add(a(bVar));
        list.add(c(bVar, context, iA));
    }

    private void a(Context context, b bVar) {
        this.x.clear();
        String string = context.getString(R.string.IDS_hw_mean_blood_pressure);
        String str = Constants.LEFT_BRACKET_ONLY + context.getString(R.string.IDS_hw_health_show_healthdata_mmhg_str) + Constants.RIGHT_BRACKET_ONLY;
        HealthTrendBarChart.e eVar = new HealthTrendBarChart.e(bVar.f50553c, bVar.d, b(bVar.f50553c, bVar.d) + " " + c());
        utl utlVar = this.n;
        int iE = utlVar != null ? (int) utlVar.e() : 0;
        utl utlVar2 = this.n;
        int iD = utlVar2 != null ? (int) utlVar2.d() : 0;
        String strB = b(iE, iD);
        utl utlVar3 = this.n;
        this.x.add(new SectionPieChartTrendAdapter.a(string, str, eVar, new HealthTrendBarChart.e(iE, iD, strB + " " + (utlVar3 != null ? utlVar3.c() : "--"))));
        String string2 = context.getString(R.string.IDS_hw_ave_pulse_value);
        String str2 = Constants.LEFT_BRACKET_ONLY + context.getString(R.string.IDS_main_watch_heart_rate_unit_string) + Constants.RIGHT_BRACKET_ONLY;
        HealthTrendBarChart.e eVar2 = new HealthTrendBarChart.e(bVar.f50552b, a(bVar.f50552b));
        utl utlVar4 = this.n;
        int iB = utlVar4 != null ? (int) utlVar4.b() : 0;
        this.x.add(new SectionPieChartTrendAdapter.a(string2, str2, eVar2, new HealthTrendBarChart.e(iB, a(iB))));
        String string3 = context.getString(R.string.IDS_low_blood_pressure_times);
        String str3 = Constants.LEFT_BRACKET_ONLY + context.getString(R.string.IDS_awake_times) + Constants.RIGHT_BRACKET_ONLY;
        int iC = c(this.f50549b, 0);
        HealthTrendBarChart.e eVar3 = new HealthTrendBarChart.e(iC, c(iC));
        utl utlVar5 = this.n;
        int iC2 = utlVar5 != null ? utlVar5.c(utlVar5.f50549b, 0) : 0;
        this.x.add(new SectionPieChartTrendAdapter.a(string3, str3, eVar3, new HealthTrendBarChart.e(iC2, c(iC2))));
    }

    void b(String str, List<uwh> list, long j, long j2) {
        LogUtil.a("BloodPressureData", "updatePieBasicData, key: " + str);
        if (njy.e(list)) {
            return;
        }
        Iterator<uwh> it = list.iterator();
        while (it.hasNext()) {
            LogUtil.a("BloodPressureData", "healthData: " + it.next().toString());
        }
        this.q = j;
        this.m = j2;
        b bVar = new b();
        HashMap map = new HashMap();
        this.v = 0;
        a(list, map, bVar);
        e(bVar, map, str);
    }

    private void e(b bVar, Map<Integer, Integer> map, String str) {
        Context contextB = BaseApplication.b();
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("BloodPressureData", "key is not exist");
            return;
        }
        this.p.put(str, map);
        ArrayList arrayList = new ArrayList();
        b(contextB, bVar, arrayList);
        this.r.put(str, arrayList);
    }

    private void a(List<uwh> list, Map<Integer, Integer> map, b bVar) {
        int size = list.size();
        int i = 0;
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        for (uwh uwhVar : list) {
            double dM = uwhVar.m();
            int i2 = size;
            double dO = uwhVar.o();
            double d4 = d2;
            double dL = uwhVar.l();
            if (dL > 0.0d) {
                d += dL;
                i++;
            }
            int i3 = i;
            double d5 = d;
            int i4 = (int) dM;
            int i5 = (int) dO;
            int iB = ftw.b(i4, i5);
            map.put(Integer.valueOf(iB), Integer.valueOf(c(map, iB) + 1));
            if (this.h == DataInfos.BloodPressureMonthDetail || this.h == DataInfos.BloodPressureWeekDetail) {
                e(bVar, i4, i5, uwhVar, (int) dL);
            }
            this.v++;
            d2 = d4 + dM;
            d3 += dO;
            size = i2;
            i = i3;
            d = d5;
        }
        int i6 = size;
        double d6 = d2;
        double dRound = i > 0 ? Math.round(d / ((double) i)) : 0.0d;
        double d7 = i6;
        int iRound = (int) Math.round(d6 / d7);
        int iRound2 = (int) Math.round(d3 / d7);
        int iB2 = ftw.b(iRound, iRound2);
        bVar.f50553c = iRound;
        bVar.d = iRound2;
        bVar.f50552b = (int) dRound;
        bVar.e = iB2;
        this.e = ftw.d(iB2);
    }

    private void d(List<uwh> list) {
        synchronized (this.f50550c) {
            this.f50550c.clear();
            for (uwh uwhVar : list) {
                if (ftw.b((int) uwhVar.m(), (int) uwhVar.o()) != 1) {
                    this.f50550c.add(uwhVar);
                }
            }
        }
    }

    private void e(b bVar, int i, int i2, uwh uwhVar, int i3) {
        if (bVar.i == null || i >= bVar.i.m()) {
            bVar.i = uwhVar;
        }
        if (bVar.k == null || i <= bVar.k.m()) {
            bVar.k = uwhVar;
        }
        if (bVar.f50551a == null || i2 >= bVar.f50551a.o()) {
            bVar.f50551a = uwhVar;
        }
        if (bVar.g == null || i2 <= bVar.g.o()) {
            bVar.g = uwhVar;
        }
        if (i3 >= bVar.f) {
            bVar.f = i3;
        }
        if ((i3 <= bVar.h || bVar.h == 0) && (bVar.h == Integer.MAX_VALUE || i3 != 0)) {
            bVar.h = i3;
        }
        int i4 = i - i2;
        bVar.l += i4;
        if (bVar.j == null || i4 >= b(bVar.j)) {
            bVar.j = uwhVar;
        }
        if (bVar.n == null || i4 <= b(bVar.n)) {
            bVar.n = uwhVar;
        }
    }

    private SectionPieChartBasicAdapter.b b(b bVar, Context context, int i) {
        int iM = (int) bVar.i.m();
        int iO = (int) bVar.i.o();
        int iB = ftw.b(iM, iO);
        SpannableString spannableStringD = d(ftw.d(iB), iB);
        int iM2 = (int) bVar.k.m();
        int iO2 = (int) bVar.k.o();
        int iB2 = ftw.b(iM2, iO2);
        SpannableString spannableStringD2 = d(ftw.d(iB2), iB2);
        String strB = b(iM, iO);
        String strB2 = b(iM2, iO2);
        return new SectionPieChartBasicAdapter.b(this.t, d(strB, c(strB), context, false), spannableStringD, BloodPressureUtil.e(context, i, iB), d(strB2, c(strB2), context, false), spannableStringD2, BloodPressureUtil.e(context, i, iB2), a(bVar.f50553c), d(this.e, bVar.e), BloodPressureUtil.e(context, i, bVar.e));
    }

    private SectionPieChartBasicAdapter.b d(b bVar, Context context, int i) {
        int iM = (int) bVar.f50551a.m();
        int iO = (int) bVar.f50551a.o();
        int iB = ftw.b(iM, iO);
        SpannableString spannableStringD = d(ftw.d(iB), iB);
        int iM2 = (int) bVar.g.m();
        int iO2 = (int) bVar.g.o();
        int iB2 = ftw.b(iM2, iO2);
        SpannableString spannableStringD2 = d(ftw.d(iB2), iB2);
        String strB = b(iO, iM);
        String strB2 = b(iO2, iM2);
        return new SectionPieChartBasicAdapter.b(this.j, d(strB, c(strB), context, false), spannableStringD, BloodPressureUtil.e(context, i, iB), d(strB2, c(strB2), context, false), spannableStringD2, BloodPressureUtil.e(context, i, iB2), a(bVar.d), d(this.e, bVar.e), BloodPressureUtil.e(context, i, bVar.e));
    }

    private SectionPieChartBasicAdapter.b a(b bVar) {
        return new SectionPieChartBasicAdapter.b(this.s, a(bVar.f), a(bVar.h), a(bVar.f50552b));
    }

    private SectionPieChartBasicAdapter.b c(b bVar, Context context, int i) {
        String strB = b((int) bVar.j.m(), (int) bVar.j.o());
        String strC = c(b(bVar.j));
        String str = strC + Constants.LEFT_BRACKET_ONLY + strB + Constants.RIGHT_BRACKET_ONLY;
        if (LanguageUtil.c(context)) {
            str = strC + " (" + strB + Constants.RIGHT_BRACKET_ONLY;
        }
        if (LanguageUtil.br(BaseApplication.b())) {
            str = Constants.LEFT_BRACKET_ONLY + strB + Constants.RIGHT_BRACKET_ONLY + strC;
        }
        String strB2 = b((int) bVar.n.m(), (int) bVar.n.o());
        String strC2 = c(b(bVar.n));
        String str2 = strC2 + Constants.LEFT_BRACKET_ONLY + strB2 + Constants.RIGHT_BRACKET_ONLY;
        if (LanguageUtil.c(context)) {
            str2 = strC2 + " (" + strB2 + Constants.RIGHT_BRACKET_ONLY;
        }
        if (LanguageUtil.br(BaseApplication.b())) {
            str2 = Constants.LEFT_BRACKET_ONLY + strB2 + Constants.RIGHT_BRACKET_ONLY + strC2;
        }
        int iD = BloodPressureUtil.d(b(bVar.j));
        String strA = a(context, iD);
        int iD2 = BloodPressureUtil.d(b(bVar.n));
        String strA2 = a(context, iD2);
        int iRound = this.v != 0 ? (int) Math.round(((double) bVar.l) / ((double) this.v)) : 0;
        int iD3 = BloodPressureUtil.d(iRound);
        return new SectionPieChartBasicAdapter.b(this.o, d(str, strC.length(), context, true), d(strA, iD), BloodPressureUtil.e(context, i, iD), d(str2, strC2.length(), context, true), d(strA2, iD2), BloodPressureUtil.e(context, i, iD2), c(iRound), d(a(context, iD3), iD3), BloodPressureUtil.e(context, i, iD3));
    }

    public List<SectionPieChartTrendAdapter.a> m() {
        return this.x;
    }

    private String b(double d, double d2) {
        StringBuilder sb;
        String strE = "--";
        String strE2 = d > 0.0d ? UnitUtil.e((int) d, 1, 0) : "--";
        if (d2 > 0.0d) {
            strE = UnitUtil.e((int) d2, 1, 0);
        }
        if (!LanguageUtil.ba(BaseApplication.b()) || LanguageUtil.br(BaseApplication.b())) {
            sb = new StringBuilder();
            sb.append(strE2);
            sb.append("/");
            sb.append(strE);
        } else {
            sb = new StringBuilder();
            sb.append(strE);
            sb.append("/");
            sb.append(strE2);
        }
        return sb.toString();
    }

    private String a(double d) {
        return d > 0.0d ? UnitUtil.e((int) d, 1, 0) : "--";
    }

    private String c(double d) {
        return UnitUtil.e((int) d, 1, 0);
    }

    private SpannableString d(String str, int i) {
        int iE = ftw.e(i);
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(iE), 0, str.length(), 33);
        return spannableString;
    }

    private SpannableString d(String str, int i, Context context, boolean z) {
        int length;
        int length2 = str.length();
        int i2 = 0;
        if (z && LanguageUtil.br(BaseApplication.b())) {
            length = str.length() - i;
            int length3 = str.length();
            length2 = str.length() - i;
            i = length3;
        } else {
            length = 0;
            i2 = i;
        }
        TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(context, R.style.health_basic_situation_value_primary);
        TextAppearanceSpan textAppearanceSpan2 = new TextAppearanceSpan(context, R.style.health_basic_situation_value_secondary);
        SpannableString spannableString = new SpannableString(str);
        if (qrs.y()) {
            spannableString.setSpan(new TextAppearanceSpan(context, R.style.health_basic_situation_value_primary_less_one_three_Scale), length, i, 33);
            spannableString.setSpan(new TextAppearanceSpan(context, R.style.health_basic_situation_value_secondary_less_one_three_Scale), i2, length2, 33);
            return spannableString;
        }
        if (qrs.i() > 1.55f) {
            spannableString.setSpan(new TextAppearanceSpan(context, R.style.health_basic_situation_value_primary_more_one_five_Scale), length, i, 33);
            spannableString.setSpan(new TextAppearanceSpan(context, R.style.health_basic_situation_value_secondary_less_one_three_Scale), i2, length2, 33);
            return spannableString;
        }
        spannableString.setSpan(textAppearanceSpan, length, i, 33);
        spannableString.setSpan(textAppearanceSpan2, i2, length2, 33);
        return spannableString;
    }

    private int c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("BloodPressureData", "sysDiaStr is empty");
            return 0;
        }
        String[] strArrSplit = str.split("/");
        if (strArrSplit.length > 0) {
            return strArrSplit[0].length();
        }
        return 0;
    }

    public String c() {
        return this.e;
    }

    public List<SectionPieChartBasicAdapter.b> g() {
        return new ArrayList(this.f);
    }

    public Map<String, List<SectionPieChartBasicAdapter.b>> n() {
        return this.r;
    }

    private String a(Context context, int i) {
        if (i == 0) {
            return context.getString(R.string.IDS_device_measureactivity_result_low);
        }
        if (i == 1) {
            return context.getString(R.string.IDS_device_measureactivity_result_normal);
        }
        if (i == 5) {
            return context.getString(R.string.IDS_device_measureactivity_result_high);
        }
        return "--";
    }

    private int b(uwh uwhVar) {
        return (int) (uwhVar.m() - uwhVar.o());
    }

    private int c(Map<Integer, Integer> map, int i) {
        if (map.containsKey(Integer.valueOf(i))) {
            return map.get(Integer.valueOf(i)).intValue();
        }
        return 0;
    }

    public int a(int i) {
        return c(this.f50549b, i);
    }

    public int a(Map<Integer, Integer> map, int i) {
        return c(map, i);
    }

    public List<uwh> f() {
        return this.k;
    }

    public Map<String, Map<Integer, Integer>> l() {
        return this.p;
    }

    public List<uwh> a() {
        return this.f50550c;
    }

    public double e() {
        return this.g;
    }

    public double d() {
        return this.f50548a;
    }

    public double b() {
        return this.d;
    }

    public long i() {
        return this.q;
    }

    public long j() {
        return this.m;
    }

    public String toString() {
        return "BloodPressureData{mHealthDataList=" + this.k + ", mDistMap=" + this.f50549b + ", mJumpTime=" + this.l + '}';
    }
}
