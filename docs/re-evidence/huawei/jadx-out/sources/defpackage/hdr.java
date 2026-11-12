package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.health.suggestion.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.AtomicAction;
import com.huawei.pluginfitnessadvice.BaseChoreographyAction;
import com.huawei.pluginfitnessadvice.TargetConfig;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class hdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TargetConfig f36485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f36486c;
    private String d;
    private AtomicAction e;
    private boolean f;
    private long g = -1;
    private String h;
    private boolean i;
    private int j;
    private int k;
    private TargetConfig l;
    private String m;
    private List<String> n;

    public int h() {
        return this.j;
    }

    public void a(int i) {
        this.j = i;
    }

    public long f() {
        return this.g;
    }

    public void c(long j) {
        this.g = j;
    }

    public boolean o() {
        return this.f;
    }

    public void d(boolean z) {
        this.f = z;
    }

    public boolean m() {
        return this.i;
    }

    public void c(boolean z) {
        this.i = z;
    }

    public int i() {
        return this.k;
    }

    public void c(int i) {
        this.k = i;
    }

    public String j() {
        return this.h;
    }

    public void c(String str) {
        this.h = str;
    }

    public void d(String str) {
        this.m = str;
    }

    public String n() {
        return this.m;
    }

    public List<String> k() {
        return this.n;
    }

    public String a() {
        return this.d;
    }

    public List<String> e() {
        return this.f36486c;
    }

    public AtomicAction b() {
        return this.e;
    }

    public void a(AtomicAction atomicAction) {
        this.e = atomicAction;
    }

    public TargetConfig g() {
        return this.l;
    }

    private void c(TargetConfig targetConfig) {
        TargetConfig targetConfig2 = new TargetConfig();
        this.l = targetConfig2;
        targetConfig2.setId(targetConfig.getId());
        this.l.setName(targetConfig.getName());
        this.l.setValueH(targetConfig.getValueH());
        this.l.setValueL(targetConfig.getValueL());
        this.l.setValueType(targetConfig.getValueType());
    }

    public TargetConfig c() {
        return this.f36485b;
    }

    private void b(TargetConfig targetConfig) {
        TargetConfig targetConfig2 = new TargetConfig();
        this.f36485b = targetConfig2;
        targetConfig2.setId(targetConfig.getId());
        this.f36485b.setName(targetConfig.getName());
        this.f36485b.setValueType(targetConfig.getValueType());
        this.f36485b.setValueL(targetConfig.getValueL());
        this.f36485b.setValueH(targetConfig.getValueH());
    }

    public void d(Context context, TargetConfig targetConfig, hca hcaVar) {
        if (context == null) {
            LogUtil.j("Suggestion_CustomCourseActionItemConfig", "setTargetConfigInfo, context is null");
            return;
        }
        List<String> list = this.n;
        if (list == null) {
            this.n = new ArrayList();
        } else {
            list.clear();
        }
        if (targetConfig == null || TextUtils.isEmpty(targetConfig.getId())) {
            LogUtil.j("Suggestion_CustomCourseActionItemConfig", "setIntensityConfigInfo, targetConfig is null or targetConfig.getId is empty");
            a(context);
            return;
        }
        c(targetConfig);
        int iN = CommonUtil.n(context, targetConfig.getId());
        if (iN == 1) {
            this.m = context.getResources().getString(R.string.sug_time);
            b(context, targetConfig.getValueL());
            return;
        }
        if (iN == 0) {
            this.m = context.getResources().getString(R.string.sug_distance);
            c(context, targetConfig.getValueL());
        } else if (iN == 3) {
            this.m = context.getResources().getString(R.string.sug_target_type_calories);
            e(context, targetConfig.getValueL());
        } else if (iN == 4 || iN == 5) {
            this.m = context.getResources().getString(R.string.IDS_main_watch_heart_rate_string);
            b(context, hcaVar, iN == 4, targetConfig);
        } else {
            a(context);
        }
    }

    private void b(Context context, hca hcaVar, boolean z, TargetConfig targetConfig) {
        if (hcaVar == null) {
            this.n.add(context.getResources().getString(R.string.IDS_sug_none));
        } else {
            d(context, hcaVar, z, targetConfig.getValueL(), targetConfig.getValueH());
        }
    }

    private void a(Context context) {
        this.m = context.getResources().getString(R.string.IDS_sug_target_type);
        this.n.add(context.getResources().getString(R.string.IDS_sug_none));
    }

    private void c(Context context, List<String> list) {
        if (list.size() == 0) {
            list.add(context.getResources().getString(R.string.IDS_sug_none));
        }
    }

    private void b(Context context, double d) {
        if (d > 0.0d) {
            long hours = TimeUnit.SECONDS.toHours((long) d);
            if (hours > 0) {
                this.n.add(context.getResources().getQuantityString(R.plurals.IDS_motiontrack_detail_recover_time_hour, (int) hours, Long.valueOf(hours)));
            }
            long minutes = TimeUnit.SECONDS.toMinutes((long) (d % 3600.0d));
            if (minutes > 0) {
                this.n.add(context.getResources().getQuantityString(R.plurals.IDS_motiontrack_detail_fm_heart_min_unit, (int) minutes, Long.valueOf(minutes)));
            }
            long j = (long) ((d - (hours * 3600)) - (minutes * 60));
            if (j > 0) {
                this.n.add(context.getResources().getQuantityString(R.plurals.IDS_plugin_fitnessadvice_second_nogap, (int) j, UnitUtil.e(j, 1, 0)));
            }
        }
        c(context, this.n);
    }

    private void c(Context context, double d) {
        if (d > 0.0d) {
            if (UnitUtil.f()) {
                double dE = UnitUtil.e(d, 2) / 1760.0d;
                if (dE > 0.0d) {
                    this.n.add(context.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_show_use_time_mi, (int) dE, UnitUtil.e(dE, 1, 2)));
                }
            } else {
                double d2 = d / 1000.0d;
                if (d2 > 0.0d) {
                    this.n.add(context.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_show_use_time_km, (int) d2, UnitUtil.e(d2, 1, 2)));
                }
            }
        }
        c(context, this.n);
    }

    private void e(Context context, double d) {
        if (d >= 1.0d) {
            this.n.add(context.getResources().getQuantityString(R.plurals.sug_chart_kcals, (int) d, UnitUtil.e(d, 1, 0)));
        }
        c(context, this.n);
    }

    private void d(Context context, hca hcaVar, boolean z, double d, double d2) {
        if ((d > 0.0d || d2 > 0.0d) && hcaVar != null) {
            LogUtil.a("Suggestion_CustomCourseActionItemConfig", "getTargetHeartRateValue, mHeartRateZoneConfig.getMaxThreshold()=" + hcaVar.b());
            if (z) {
                int iD = (int) UnitUtil.d((((double) hcaVar.b()) * d) / 100.0d, 0);
                this.n.add(context.getResources().getQuantityString(R.plurals.sug_courses_heart_rate_height, iD, Integer.valueOf(iD)));
            } else {
                int iD2 = (int) UnitUtil.d((((double) hcaVar.b()) * d2) / 100.0d, 0);
                this.n.add(context.getResources().getQuantityString(R.plurals.sug_courses_heart_rate_lower, iD2, Integer.valueOf(iD2)));
            }
        }
        c(context, this.n);
    }

    public void d(Context context, TargetConfig targetConfig, hca hcaVar, hca hcaVar2, int i, gzf gzfVar) {
        if (context == null) {
            LogUtil.j("Suggestion_CustomCourseActionItemConfig", "setIntensityConfigInfo, context is null");
            return;
        }
        List<String> list = this.f36486c;
        if (list == null) {
            this.f36486c = new ArrayList();
        } else {
            list.clear();
        }
        if (targetConfig == null || TextUtils.isEmpty(targetConfig.getId())) {
            LogUtil.j("Suggestion_CustomCourseActionItemConfig", "setIntensityConfigInfo, intensityConfig is null or intensityConfig.getId is empty");
            e(context);
        } else {
            b(targetConfig);
            c(CommonUtil.n(context, targetConfig.getId()), context, targetConfig, hcaVar, hcaVar2, i, gzfVar);
        }
    }

    private void c(int i, Context context, TargetConfig targetConfig, hca hcaVar, hca hcaVar2, int i2, gzf gzfVar) {
        if (i == 14) {
            if (iem.a(context, ifz.a())) {
                this.d = context.getResources().getString(R.string.IDS_sug_heart_rate_zone);
                c(context, false, hcaVar, hcaVar2, targetConfig.getValueL());
                return;
            } else {
                this.d = context.getResources().getString(R.string.IDS_motiontrack_pace_zone);
                c(context, (int) targetConfig.getValueL(), gzfVar);
                return;
            }
        }
        if (BaseChoreographyAction.d.e(i)) {
            this.d = context.getResources().getString(R.string.IDS_sug_heart_rate_zone);
            c(context, i != 17 ? i == 4 : i2 == 0, hcaVar, hcaVar2, targetConfig.getValueL());
            return;
        }
        if (i == 13) {
            this.d = context.getResources().getString(R.string.IDS_motiontrack_pace_zone);
            c(context, (int) targetConfig.getValueL(), gzfVar);
            return;
        }
        if (i == 15) {
            this.d = context.getResources().getString(R.string.IDS_sug_run_pace);
            d(context, targetConfig.getValueL(), targetConfig.getValueH());
        } else if (i == 16) {
            this.d = context.getResources().getString(R.string.IDS_sug_cadence);
            b(context, targetConfig.getValueL(), targetConfig.getValueH());
        } else if (i == 1) {
            this.d = context.getResources().getString(R.string.IDS_sug_heart_rate_range);
            a(context, hcaVar, targetConfig);
        } else {
            LogUtil.j("Suggestion_CustomCourseActionItemConfig", "setIntensityConfigInfo, intensityConfigId = ", Integer.valueOf(i));
            e(context);
        }
    }

    private void e(Context context) {
        this.d = context.getResources().getString(R.string.IDS_sug_intensity_type);
        this.f36486c.add(context.getResources().getString(R.string.IDS_sug_none));
    }

    private void c(Context context, boolean z, hca hcaVar, hca hcaVar2, double d) {
        if (hcaVar == null && hcaVar2 == null) {
            this.f36486c.add(context.getResources().getString(R.string.IDS_sug_none));
        } else {
            b(context, z, hcaVar, hcaVar2, d);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004a  */
    private void b(Context context, boolean z, hca hcaVar, hca hcaVar2, double d) {
        int i;
        if (d >= 0.0d) {
            int i2 = 0;
            if (z) {
                if (hcaVar != null) {
                    int i3 = (int) d;
                    int iE = hcaVar.e(i3, true);
                    int iE2 = hcaVar.e(i3, false);
                    LogUtil.a("Suggestion_CustomCourseActionItemConfig", "lowHeartRate:", Integer.valueOf(iE), " highHeartRate:", Integer.valueOf(iE2));
                    i = iE2;
                    i2 = iE;
                } else {
                    i = 0;
                }
            } else if (hcaVar2 != null) {
                int i4 = (int) d;
                int iE3 = hcaVar2.e(i4, true);
                int iE4 = hcaVar2.e(i4, false);
                LogUtil.a("Suggestion_CustomCourseActionItemConfig", "lowHeartRate:", Integer.valueOf(iE3), " highHeartRate:", Integer.valueOf(iE4));
                i = iE4;
                i2 = iE3;
            } else {
                i = 0;
            }
            LogUtil.a("Suggestion_CustomCourseActionItemConfig", "setIntensityRelativeHeartRateZoneValue, valueL = ", Double.valueOf(d));
            if (d >= 1.0d) {
                d -= 1.0d;
            }
            this.f36486c.add(context.getResources().getString(R.string.IDS_indoor_skipper_minute_and_second, context.getResources().getString(R.string.IDS_main_watch_detail_max_heart_rate_sport_title, Integer.valueOf(((int) d) + 1)), " "));
            if (i2 < i) {
                this.f36486c.add(context.getResources().getQuantityString(R.plurals.sug_courses_times_min, i, Integer.valueOf(i2), Integer.valueOf(i)));
            } else {
                this.f36486c.add(context.getResources().getQuantityString(R.plurals.sug_courses_times_min, i2, Integer.valueOf(i), Integer.valueOf(i2)));
            }
        }
        c(context, this.f36486c);
    }

    private void c(Context context, int i, gzf gzfVar) {
        if (i > 0) {
            String string = context.getResources().getString(R.string.IDS_pace_range_label_number, Integer.valueOf(i));
            if (gzfVar == null) {
                c(context, this.f36486c);
                return;
            }
            int iB = gzfVar.b(i, true);
            int iB2 = gzfVar.b(i, false);
            LogUtil.a("Suggestion_CustomCourseActionItemConfig", "low:", Integer.valueOf(iB), " high:", Integer.valueOf(iB2));
            String strA = a(context, iB);
            String strA2 = a(context, iB2);
            LogUtil.a("Suggestion_CustomCourseActionItemConfig", "getIntensityPaceZoneValue, paceSectionSelected = ", gzfVar, ", lowPace = ", strA, ", highPace = ", strA2);
            this.f36486c.add(context.getResources().getString(R.string.IDS_indoor_skipper_minute_and_second, string, " "));
            if (iB > iB2) {
                this.f36486c.add(a(context, iB, strA2, strA));
            } else {
                this.f36486c.add(a(context, iB2, strA, strA2));
            }
        }
        c(context, this.f36486c);
    }

    private String a(Context context, int i, String str, String str2) {
        String string = context.getResources().getString(R.string.sug_his_time_formart, str, str2);
        if (UnitUtil.f()) {
            return context.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_pre_unit_mi, i, string);
        }
        return context.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_pre_unit_km, i, string);
    }

    public static String a(Context context, double d) {
        if (UnitUtil.f()) {
            d = UnitUtil.c(d, 3);
        }
        int iRound = (int) Math.round(d);
        int i = iRound / 60;
        if (d <= 0.0010000000474974513d) {
            return context.getResources().getString(R.string.IDS_hw_health_show_healthdata_nodata_symbol);
        }
        if (LanguageUtil.p(context)) {
            return UnitUtil.e(iRound);
        }
        String string = context.getResources().getString(R.string.IDS_hwh_motiontrack_show_pace, UnitUtil.e(i, 1, 0), Integer.valueOf(iRound % 60));
        return LanguageUtil.c(context) ? string.substring(0, string.length() - 2).replace("'", ":") : string;
    }

    private void d(Context context, double d, double d2) {
        if (d > 0.0d && d2 > 0.0d) {
            double dC = d / 1000.0d;
            if (UnitUtil.f()) {
                dC = UnitUtil.c(dC, 3);
            }
            long minutes = TimeUnit.SECONDS.toMinutes((long) dC);
            long jRound = Math.round(dC - (minutes * 60));
            double dC2 = d2 / 1000.0d;
            if (UnitUtil.f()) {
                dC2 = UnitUtil.c(dC2, 3);
            }
            long minutes2 = TimeUnit.SECONDS.toMinutes((long) dC2);
            this.f36486c.add(a(context, 1, context.getResources().getString(R.string.IDS_hwh_motiontrack_show_pace, UnitUtil.e(minutes, 1, 0), Long.valueOf(jRound)), context.getResources().getString(R.string.IDS_hwh_motiontrack_show_pace, UnitUtil.e(minutes2, 1, 0), Long.valueOf(Math.round(dC2 - (60 * minutes2))))));
        }
        c(context, this.f36486c);
    }

    private void b(Context context, double d, double d2) {
        if (d > 0.0d && d2 > 0.0d) {
            long j = (long) d;
            this.f36486c.add(context.getResources().getQuantityString(R.plurals.sug_courses_step_min, (int) j, Long.valueOf(j), Long.valueOf((long) d2)));
        }
        c(context, this.f36486c);
    }

    private void a(Context context, hca hcaVar, TargetConfig targetConfig) {
        if (hcaVar == null) {
            this.f36486c.add(context.getResources().getString(R.string.IDS_sug_none));
        } else {
            d(context, hcaVar, targetConfig.getValueL(), targetConfig.getValueH());
        }
    }

    private void d(Context context, hca hcaVar, double d, double d2) {
        if (d > 0.0d && d2 > 0.0d && hcaVar != null) {
            int iD = (int) UnitUtil.d((((double) hcaVar.b()) * d) / 100.0d, 0);
            this.f36486c.add(context.getResources().getQuantityString(R.plurals.sug_courses_times_min, iD, Integer.valueOf(iD), Integer.valueOf((int) UnitUtil.d((((double) hcaVar.b()) * d2) / 100.0d, 0))));
        }
        c(context, this.f36486c);
    }

    public int d() {
        return this.f36484a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    public void b(String str) {
        byte b2;
        if (TextUtils.isEmpty(str)) {
            this.f36484a = R.drawable.ic_custom_course_item_icon_oragne;
            return;
        }
        LogUtil.a("Suggestion_CustomCourseActionItemConfig", "setColumnIcon, actionId = ", str);
        str.hashCode();
        switch (str.hashCode()) {
            case 77802175:
                if (!str.equals("RD001")) {
                    b2 = -1;
                } else {
                    b2 = 0;
                }
                break;
            case 77802176:
            case 77802177:
            default:
                b2 = -1;
                break;
            case 77802178:
                if (!str.equals("RD004")) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            case 77802179:
                if (!str.equals("RD005")) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
        }
        if (b2 == 0) {
            this.f36484a = R.drawable.ic_custom_course_item_icon_yellow;
        } else if (b2 == 1 || b2 == 2) {
            this.f36484a = R.drawable.ic_custom_course_item_icon_blue;
        } else {
            this.f36484a = R.drawable.ic_custom_course_item_icon_oragne;
        }
    }
}
