package defpackage;

import com.huawei.hihealth.HiHealthData;
import com.huawei.hwcloudmodel.model.unite.SportTotal;
import health.compact.a.HiDateUtil;
import health.compact.a.HiValidatorUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lgt {

    static class b {
        private static final lgt e = new lgt();
    }

    public static lgt c() {
        return b.e;
    }

    public List<SportTotal> c(List<HiHealthData> list) {
        ArrayList arrayList = new ArrayList(list.size() * 5);
        for (HiHealthData hiHealthData : list) {
            int iD = HiDateUtil.d(hiHealthData.getStartTime());
            String timeZone = hiHealthData.getTimeZone();
            d(arrayList, hiHealthData, iD, 2, timeZone);
            c(arrayList, hiHealthData, iD, 2, timeZone);
            e(arrayList, hiHealthData, iD, 2, timeZone);
            a(arrayList, hiHealthData, iD, 2, timeZone);
            b(arrayList, hiHealthData, iD, 2, timeZone);
        }
        return arrayList;
    }

    private void d(List<SportTotal> list, HiHealthData hiHealthData, int i, int i2, String str) {
        SportTotal sportTotal = new SportTotal();
        int i3 = (int) hiHealthData.getDouble("sport_walk_step_sum");
        int i4 = (int) hiHealthData.getDouble("sport_walk_distance_sum");
        int i5 = (int) hiHealthData.getDouble("sport_walk_calorie_sum");
        int i6 = (int) hiHealthData.getDouble("sport_walk_duration_sum");
        if (!HiValidatorUtil.d(i3)) {
            ReleaseLogUtil.a("Debug_SportDataSwitch", "addWalkTotal steps is out of range hiHealthData = ", hiHealthData);
            return;
        }
        sportTotal.setSportBasicInfo(lik.e(Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Float.valueOf(0.0f), 0, Integer.valueOf(i6 / 60), 0));
        sportTotal.setRecordDay(Integer.valueOf(i));
        sportTotal.setDataSource(Integer.valueOf(i2));
        sportTotal.setTimeZone(str);
        sportTotal.setSportType(5);
        list.add(sportTotal);
    }

    private void c(List<SportTotal> list, HiHealthData hiHealthData, int i, int i2, String str) {
        SportTotal sportTotal = new SportTotal();
        int i3 = (int) hiHealthData.getDouble("sport_run_distance_sum");
        int i4 = (int) hiHealthData.getDouble("sport_run_calorie_sum");
        int i5 = (int) hiHealthData.getDouble("sport_run_duration_sum");
        int i6 = (int) hiHealthData.getDouble("sport_run_step_sum");
        if (!HiValidatorUtil.d(i6)) {
            ReleaseLogUtil.a("Debug_SportDataSwitch", "addRunTotal steps is out of range hiHealthData = ", hiHealthData);
            return;
        }
        sportTotal.setSportBasicInfo(lik.e(Integer.valueOf(i6), Integer.valueOf(i3), Integer.valueOf(i4), Float.valueOf(0.0f), 0, Integer.valueOf(i5 / 60), 0));
        sportTotal.setRecordDay(Integer.valueOf(i));
        sportTotal.setDataSource(Integer.valueOf(i2));
        sportTotal.setTimeZone(str);
        sportTotal.setSportType(4);
        list.add(sportTotal);
    }

    private void e(List<SportTotal> list, HiHealthData hiHealthData, int i, int i2, String str) {
        SportTotal sportTotal = new SportTotal();
        int i3 = (int) hiHealthData.getDouble("sport_cycle_distance_sum");
        int i4 = (int) hiHealthData.getDouble("sport_cycle_calorie_sum");
        int i5 = (int) hiHealthData.getDouble("sport_cycle_duration_sum");
        if (!HiValidatorUtil.a(i4)) {
            ReleaseLogUtil.a("Debug_SportDataSwitch", "addRideTotal calorie is out of range hiHealthData = ", hiHealthData);
            return;
        }
        sportTotal.setSportBasicInfo(lik.e(0, Integer.valueOf(i3), Integer.valueOf(i4), Float.valueOf(0.0f), 0, Integer.valueOf(i5 / 60), 0));
        sportTotal.setRecordDay(Integer.valueOf(i));
        sportTotal.setDataSource(Integer.valueOf(i2));
        sportTotal.setTimeZone(str);
        sportTotal.setSportType(3);
        list.add(sportTotal);
    }

    private void a(List<SportTotal> list, HiHealthData hiHealthData, int i, int i2, String str) {
        SportTotal sportTotal = new SportTotal();
        int i3 = (int) hiHealthData.getDouble("sport_climb_distance_sum");
        int i4 = (int) hiHealthData.getDouble("sport_climb_calorie_sum");
        int i5 = (int) hiHealthData.getDouble("sport_climb_duration_sum");
        float f = (float) hiHealthData.getDouble("sport_altitude_offset_sum");
        int i6 = (int) hiHealthData.getDouble("sport_climb_step_sum");
        if (!HiValidatorUtil.d(i6) || !HiValidatorUtil.b(f)) {
            ReleaseLogUtil.a("Debug_SportDataSwitch", "addMountainTotal STEPS is out of range hiHealthData = ", hiHealthData);
            return;
        }
        sportTotal.setSportBasicInfo(lik.e(Integer.valueOf(i6), Integer.valueOf(i3), Integer.valueOf(i4), Float.valueOf(f / 10.0f), 0, Integer.valueOf(i5 / 60), 0));
        sportTotal.setRecordDay(Integer.valueOf(i));
        sportTotal.setDataSource(Integer.valueOf(i2));
        sportTotal.setTimeZone(str);
        sportTotal.setSportType(2);
        list.add(sportTotal);
    }

    private void b(List<SportTotal> list, HiHealthData hiHealthData, int i, int i2, String str) {
        SportTotal sportTotal = new SportTotal();
        sportTotal.setSportBasicInfo(lik.e(0, Integer.valueOf((int) hiHealthData.getDouble("sport_swim_distance_sum")), Integer.valueOf((int) hiHealthData.getDouble("sport_swim_calorie_sum")), Float.valueOf(0.0f), 0, Integer.valueOf(((int) hiHealthData.getDouble("sport_swim_duration_sum")) / 60), 0));
        sportTotal.setRecordDay(Integer.valueOf(i));
        sportTotal.setDataSource(Integer.valueOf(i2));
        sportTotal.setTimeZone(str);
        sportTotal.setSportType(9);
        list.add(sportTotal);
    }
}
