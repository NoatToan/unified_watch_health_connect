package defpackage;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.userlabelmgr.model.UpdateUserLabel;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes29.dex */
public class fmc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Context f34246b;
    private List<String> g;
    private List<UpdateUserLabel> h;
    private volatile long i;
    private List<String> j;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f34245a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set<String> f34247c = new HashSet<String>() { // from class: fmc.4
        {
            add("weight");
            add("health_sport_weight_size");
            add("health_sport_sleep_care");
            add("health_sport_sleep_quality");
            add("health_sport_weight_care");
            add("health_sport_heart_rate");
            add("health_sport_blood_oxygen");
            add("health_blood_sugar_group_up");
            add("health_blood_pressure_group_up");
            add("health_sport_health_mode_frequency");
            add("health_sport_health_mode_user");
            add("health_sport_health_mode_active");
        }
    };
    private static final Set<String> e = new HashSet<String>() { // from class: fmc.1
        {
            add("health_sleep_rhythm_type");
            add("health_monthly_sleep_problem");
            add("health_daily_sleep_problem");
            add("health_daily_sleep_target_problem");
        }
    };

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final fmc f34248a = new fmc();
    }

    private fmc() {
        this.h = new ArrayList(10);
        this.j = new ArrayList(10);
        this.g = new ArrayList(10);
        f34246b = BaseApplication.b();
        this.j.add(CommonConstant.KEY_GENDER);
        this.j.add("weight");
        this.j.add("health_sport_weight_size");
        this.j.add("age");
        this.j.add("health_blood_pressure_group_up");
        this.j.add("health_sport_grade_up");
        this.j.add("health_sport_freq_up");
        this.j.add("health_sport_bike_up");
        this.j.add("health_blood_sugar_group_up");
        this.j.add("health_sport_last_ride");
        this.j.add("health_sport_strength_up");
        this.j.add("health_sport_last_run");
        this.j.add("health_sport_user_active");
        this.j.add("health_sport_last_active");
        this.j.add("health_sport_last_login");
        this.j.add("health_sport_ride_up");
        this.j.add("health_sport_fitness_newuser");
        this.j.add("health_sport_fitness_silence");
        this.j.add("health_sport_fitness_frequency");
        this.j.add("health_sport_fitness_intensity");
        this.j.add("health_sport_sleep_care");
        this.j.add("health_sport_sleep_quality");
        this.j.add("health_sport_weight_care");
        this.j.add("health_sport_heart_rate");
        this.j.add("health_sport_blood_oxygen");
        this.j.add("health_sport_user_app");
        this.j.add("health_sport_last_fitness");
        this.j.add("health_sport_device_type");
        this.j.add("health_sport_device_up");
        this.j.add("health_sport_device_time");
        this.j.add("health_sport_max_vo2");
        this.j.add("health_sport_stress_average");
        this.j.add("health_sport_sleep_average");
        this.j.add("health_sport_health_mode_user");
        this.j.add("health_sport_average_pace");
        this.j.add("health_sport_step_average");
        this.j.add("health_sport_exercise_intensity_average");
        this.j.add("health_sport_walk_weekday");
        this.j.add("health_sport_run_weekday");
        this.j.add("health_sport_ride_weekday");
        this.j.add("health_sport_member_flag");
        this.j.add("health_sport_member_stage");
        this.j.add("health_sport_member_type");
        this.j.addAll(e);
        c();
        d();
    }

    private void d() {
        this.g.add("health_sport_device_type_smart_wear");
        this.g.add("health_sport_device_up_smart_wear");
        this.g.add("health_sport_device_time_smart_wear");
        this.g.add("health_sport_device_type_third_party");
        this.g.add("health_sport_device_up_third_party");
        this.g.add("health_sport_device_time_third_party");
        this.g.add("health_sport_is_new_user");
    }

    private void c() {
        this.j.add("pengine_daily_work_hour");
        this.j.add("pengine_sport_frequency");
        this.j.add("pengine_sport_type_preference");
        this.j.add("pengine_work_day");
        this.j.add("pengine_commuting_mode");
        this.j.add("pengine_leave_home_time");
        this.j.add("pengine_arrive_home_time");
        this.j.add("pengine_arrive_company_time");
        this.j.add("pengine_leave_company_time");
        this.j.add("pengine_commuting_duration");
    }

    public static fmc a(Context context) {
        LogUtil.a("BIUserLabelMgr", "BIUserLabelHelper getInstance");
        if (context != null) {
            f34246b = context.getApplicationContext();
        }
        return b.f34248a;
    }

    public void e(UpdateUserLabel updateUserLabel) {
        if (updateUserLabel == null) {
            LogUtil.j("BIUserLabelMgr", "registerCallback null");
            return;
        }
        synchronized (f34245a) {
            if (!this.h.contains(updateUserLabel)) {
                this.h.add(updateUserLabel);
            }
        }
    }

    public void d(UpdateUserLabel updateUserLabel) {
        if (updateUserLabel == null) {
            LogUtil.j("BIUserLabelMgr", "unRegisterCallback null");
            return;
        }
        synchronized (f34245a) {
            this.h.remove(updateUserLabel);
        }
    }

    public void e(String str, String str2, String str3) {
        LogUtil.a("BIUserLabelMgr", "initLabel() in");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3) || str2 == null) {
            return;
        }
        flo floVarD = flu.b().d(str, str3);
        if (floVarD != null) {
            floVarD.c(str2);
            LogUtil.a("BIUserLabelMgr", "initLabel updateResult = ", Long.valueOf(flu.b().b(floVarD)), " key = ", str);
        } else {
            floVarD = new flo();
            floVarD.d(str);
            floVarD.c(str2);
            floVarD.b(str3);
            LogUtil.a("BIUserLabelMgr", "initLabel insertResult = ", Long.valueOf(flu.b().c(floVarD)), " key = ", str);
        }
        if (this.g.contains(str)) {
            LogUtil.d("BIUserLabelMgr", "initLabel update device label, label = ", str);
            a(floVarD);
        }
    }

    public List<String> a(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            LogUtil.j("BIUserLabelMgr", "this is mainthread, getAllLabels error.");
            throw new IllegalThreadStateException("getAllLabels not allow InMainThread, please use this in new thread!");
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("BIUserLabelMgr", "getAllLabels, huid is null");
            return new ArrayList(0);
        }
        List<String> listC = fmg.b(f34246b).c(str);
        List<String> listA = fmj.e().a(this.j);
        List<String> listC2 = c(this.j, str);
        listC2.addAll(listC);
        listC2.addAll(listA);
        return listC2;
    }

    public List<String> c(List<String> list, String str) {
        if (njy.e(list) || TextUtils.isEmpty(str)) {
            LogUtil.j("BIUserLabelMgr", "getLabels null");
            return new ArrayList();
        }
        List<String> listB = b(list);
        ArrayList arrayList = new ArrayList(10);
        flu fluVarB = flu.b();
        LogUtil.a("BIUserLabelMgr", "getLabels enter getLabel");
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<flo> listA = fluVarB.a(c(list), str);
        boolean z = true;
        if (!njy.e(listA)) {
            boolean z2 = false;
            for (flo floVar : listA) {
                if (floVar != null) {
                    try {
                        if (jCurrentTimeMillis - Long.parseLong(floVar.a()) > 86400000) {
                        }
                        if (floVar == null && !TextUtils.isEmpty(floVar.d())) {
                            arrayList.add(floVar.d());
                        }
                    } catch (NumberFormatException unused) {
                        LogUtil.e("BIUserLabelMgr", "getLabels, getTimeStamp Exception.");
                    }
                }
                z2 = true;
                if (floVar == null) {
                }
            }
            z = z2;
        }
        if (!njy.e(listB)) {
            LogUtil.a("BIUserLabelMgr", "valueListMember is not null. valueListMember = ", listB.toString());
            arrayList.addAll(listB);
        }
        boolean zA = a(z, jCurrentTimeMillis);
        LogUtil.d("BIUserLabelMgr", "getLabels isUpdate = ", Boolean.valueOf(z), " isUpdateFinally = ", Boolean.valueOf(zA), " size = ", Integer.valueOf(arrayList.size()));
        if (zA) {
            e();
        }
        return arrayList;
    }

    private List<String> c(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null) {
                if (e(str)) {
                    LogUtil.a("BIUserLabelMgr", "labelKey is vip flag. labelKey: ", str);
                } else {
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    private List<String> b(List<String> list) {
        return e(list) ? fmj.e().a(list) : new ArrayList();
    }

    private boolean e(String str) {
        return TextUtils.equals(str, "health_sport_member_flag") || TextUtils.equals(str, "health_sport_member_stage") || TextUtils.equals(str, "health_sport_member_type");
    }

    private boolean e(List<String> list) {
        return list.contains("health_sport_member_flag") || list.contains("health_sport_member_stage") || list.contains("health_sport_member_type");
    }

    private void e() {
        UpdateUserLabel[] updateUserLabelArr;
        LogUtil.a("BIUserLabelMgr", "updateAllLabels enter");
        synchronized (f34245a) {
            List<UpdateUserLabel> list = this.h;
            updateUserLabelArr = (UpdateUserLabel[]) list.toArray(new UpdateUserLabel[list.size()]);
        }
        for (UpdateUserLabel updateUserLabel : updateUserLabelArr) {
            if (updateUserLabel != null) {
                updateUserLabel.onUpdate();
            }
        }
    }

    private boolean a(boolean z, long j) {
        if (!z || j - this.i <= 180000) {
            return false;
        }
        synchronized (d) {
            if (j - this.i <= 180000) {
                return false;
            }
            this.i = j;
            return true;
        }
    }

    private void a(flo floVar) {
        String strC = floVar.c();
        if ("health_sport_device_type_smart_wear".equals(strC) || "health_sport_device_type_third_party".equals(strC)) {
            d(floVar);
        } else if ("health_sport_device_up_smart_wear".equals(strC) || "health_sport_device_up_third_party".equals(strC) || "health_sport_device_time_smart_wear".equals(strC) || "health_sport_device_time_third_party".equals(strC)) {
            e(floVar);
        }
    }

    private void d(flo floVar) {
        String strC = floVar.c();
        String strE = floVar.e();
        if ("health_sport_device_type_smart_wear".equals(strC)) {
            b(floVar.d(), flu.b().b("health_sport_device_type_third_party", strE), floVar);
        } else {
            b(flu.b().b("health_sport_device_type_smart_wear", strE), floVar.d(), floVar);
        }
    }

    private void b(String str, String str2, flo floVar) {
        if ("SportDeviceModel_1".equals(str2) || "SportDeviceModel_1".equals(str)) {
            floVar.d("health_sport_device_type");
            floVar.c("SportDeviceModel_1");
            flu.b().e(floVar);
        } else {
            floVar.d("health_sport_device_type");
            floVar.c("SportDeviceModel_0");
            flu.b().e(floVar);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    private void e(flo floVar) {
        byte b2;
        String strE = floVar.e();
        String strD = floVar.d();
        String strC = floVar.c();
        strC.hashCode();
        switch (strC) {
            case "health_sport_device_up_smart_wear":
                b2 = 0;
                break;
            case "health_sport_device_time_third_party":
                b2 = 1;
                break;
            case "health_sport_device_time_smart_wear":
                b2 = 2;
                break;
            case "health_sport_device_up_third_party":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            d(strD, flu.b().b("health_sport_device_up_third_party", strE), "health_sport_device_up", strE);
            return;
        }
        if (b2 == 1) {
            d(flu.b().b("health_sport_device_time_smart_wear", strE), strD, "health_sport_device_time", strE);
            return;
        }
        if (b2 == 2) {
            d(strD, flu.b().b("health_sport_device_time_third_party", strE), "health_sport_device_time", strE);
        } else if (b2 != 3) {
            LogUtil.a("BIUserLabelMgr", "updateDevice default branch");
        } else {
            d(flu.b().b("health_sport_device_up_smart_wear", strE), strD, "health_sport_device_up", strE);
        }
    }

    private void d(String str, String str2, String str3, String str4) {
        LogUtil.d("BIUserLabelMgr", "compareTwoDeviceLabel label = ", str3);
        StringBuilder sb = new StringBuilder(16);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            sb.append(str);
            sb.append(",");
            sb.append(str2);
            e(str3, sb.toString(), str4);
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            e(str3, sb.toString(), str4);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            sb.append(str2);
            e(str3, sb.toString(), str4);
        } else if (TextUtils.isEmpty(str2)) {
            sb.append(str);
            e(str3, sb.toString(), str4);
        }
    }

    public boolean a(List<String> list) {
        if (njy.e(list)) {
            LogUtil.j("BIUserLabelMgr", "labelKeys is null");
            return false;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (f34247c.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    public boolean d(List<String> list) {
        if (njy.e(list)) {
            LogUtil.j("BIUserLabelMgr", "labelKeys is null");
            return false;
        }
        for (String str : list) {
            if (!f34247c.contains(str) && (this.j.contains(str) || this.g.contains(str))) {
                return true;
            }
        }
        return false;
    }
}
