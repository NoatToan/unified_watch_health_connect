package defpackage;

import com.google.android.gms.common.util.GmsVersion;
import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.manager.model.MedalInfo;
import health.compact.a.UnitUtil;
import java.util.HashMap;
import java.util.IllegalFormatConversionException;
import java.util.Map;
import java.util.MissingFormatArgumentException;

/* JADX INFO: loaded from: classes13.dex */
public class pas {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static pas f45099a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f45100c = new Object();

    private pas() {
    }

    public static pas d() {
        pas pasVar;
        synchronized (f45100c) {
            if (f45099a == null) {
                f45099a = new pas();
            }
            pasVar = f45099a;
        }
        return pasVar;
    }

    private String e(int i, int i2) {
        return BaseApplication.getContext().getResources().getString(i, UnitUtil.e(i2, 1, 0));
    }

    private String e(int i) {
        return UnitUtil.e(i, 1, 0);
    }

    public Map<String, MedalInfo> d(boolean z) {
        Map<String, MedalInfo> mapA;
        HashMap map = new HashMap(20);
        HashMap map2 = new HashMap(20);
        HashMap map3 = new HashMap(20);
        pax.e(map2);
        if (z) {
            pax.d(map3);
        } else {
            pax.b(map3);
        }
        if (UnitUtil.f()) {
            mapA = e(map, map2, map3);
        } else {
            mapA = a(map, map2, map3);
        }
        try {
            mapA.put("B_7", new MedalInfo("B7", map2.get("B7").intValue(), map3.get("B7").intValue(), e(R.string.IDS_plugin_achievement_adhere_to_exercise_100_days_new, 7), BaseApplication.getContext().getResources().getString(R.string.IDS_plugin_achievement_insit_steps_7days_movement_new, e(7), e(10000))));
            mapA.put("B_21", new MedalInfo("B21", map2.get("B21").intValue(), map3.get("B21").intValue(), e(R.string.IDS_plugin_achievement_adhere_to_exercise_100_days_new, 21), BaseApplication.getContext().getResources().getString(R.string.IDS_plugin_achievement_insit_steps_21days_movement_new, e(21), e(10000))));
            mapA.put("B_100", new MedalInfo("B100", map2.get("B100").intValue(), map3.get("B100").intValue(), e(R.string.IDS_plugin_achievement_adhere_to_exercise_100_days_new, 100), BaseApplication.getContext().getResources().getString(R.string.IDS_plugin_achievement_insit_steps_100days_movement_new, e(100), e(10000))));
            mapA.put("A2_10", b(map2, map3, "A2_10", 10));
            mapA.put("A2_50", b(map2, map3, "A2_50", 50));
            mapA.put("A2_100", b(map2, map3, "A2_100", 100));
            return b(mapA, map2, map3);
        } catch (IllegalFormatConversionException | MissingFormatArgumentException unused) {
            LogUtil.e("PLGACHIEVE_CombinationOldMyMedals", "string format exception");
            return mapA;
        }
    }

    private Map<String, MedalInfo> e(Map<String, MedalInfo> map, Map<String, Integer> map2, Map<String, Integer> map3) {
        String strE = pax.e(5.0d, 0);
        map.put("A_5", new MedalInfo("A5", map2.get("A5").intValue(), map3.get("A5").intValue(), BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_plugin_achievement_challenge_distance_imperial, pax.s(strE), strE), BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_plugin_achievement_single_run_distance_imperial, pax.s(strE), strE)));
        String strE2 = pax.e(10.0d, 0);
        map.put("A_10", new MedalInfo("A10", map2.get("A10").intValue(), map3.get("A10").intValue(), BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_plugin_achievement_challenge_distance_imperial, pax.s(strE2), strE2), BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_plugin_achievement_single_run_distance_imperial, pax.s(strE2), strE2)));
        String strE3 = pax.e(21.0975d, 4);
        map.put("A_20", new MedalInfo("A20", map2.get("A20").intValue(), map3.get("A20").intValue(), BaseApplication.getContext().getResources().getString(R.string.IDS_plugin_achievement_challenge_half_marathon), BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_plugin_achievement_single_run_distance_imperial, pax.s(strE3), strE3)));
        String strE4 = pax.e(42.195d, 3);
        map.put("A_40", new MedalInfo("A40", map2.get("A40").intValue(), map3.get("A40").intValue(), BaseApplication.getContext().getResources().getString(R.string.IDS_plugin_achievement_full_marathon_challenge), BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_plugin_achievement_single_run_distance_imperial, pax.s(strE4), strE4)));
        String strE5 = pax.e(100.0d, 0);
        map.put("A_100", new MedalInfo(WatchFaceConstant.PRESET_RES, map2.get(WatchFaceConstant.PRESET_RES).intValue(), map3.get(WatchFaceConstant.PRESET_RES).intValue(), BaseApplication.getContext().getResources().getString(R.string.IDS_plugin_achievement_ultra_marathon_challenge), BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_plugin_achievement_single_run_distance_maxinum_imperial, pax.s(strE5), strE5)));
        return map;
    }

    private Map<String, MedalInfo> a(Map<String, MedalInfo> map, Map<String, Integer> map2, Map<String, Integer> map3) {
        try {
            String strE = e(R.string.IDS_hw_show_sport_kms_string, 5);
            map.put("A_5", new MedalInfo("A5", map2.get("A5").intValue(), map3.get("A5").intValue(), BaseApplication.getContext().getResources().getString(R.string.IDS_plugin_achievement_challenge_distance, strE), BaseApplication.getContext().getResources().getString(R.string.IDS_plugin_achievement_single_run_distance, e(R.string.IDS_hw_show_sport_kms_string, 5))));
            String strE2 = e(R.string.IDS_hw_show_sport_kms_string, 10);
            map.put("A_10", new MedalInfo("A10", map2.get("A10").intValue(), map3.get("A10").intValue(), BaseApplication.getContext().getResources().getString(R.string.IDS_plugin_achievement_challenge_distance, strE2), BaseApplication.getContext().getResources().getString(R.string.IDS_plugin_achievement_single_run_distance, e(R.string.IDS_hw_show_sport_kms_string, 10))));
            map.put("A_20", new MedalInfo("A20", map2.get("A20").intValue(), map3.get("A20").intValue(), BaseApplication.getContext().getResources().getString(R.string.IDS_plugin_achievement_challenge_half_marathon), BaseApplication.getContext().getResources().getString(R.string.IDS_plugin_achievement_single_run_distance, BaseApplication.getContext().getResources().getString(R.string.IDS_hw_show_sport_kms_string, UnitUtil.e(21.0975d, 1, 4)))));
            map.put("A_40", new MedalInfo("A40", map2.get("A40").intValue(), map3.get("A40").intValue(), BaseApplication.getContext().getResources().getString(R.string.IDS_plugin_achievement_full_marathon_challenge), BaseApplication.getContext().getResources().getString(R.string.IDS_plugin_achievement_single_run_distance, BaseApplication.getContext().getResources().getString(R.string.IDS_hw_show_sport_kms_string, UnitUtil.e(42.195d, 1, 3)))));
            map.put("A_100", new MedalInfo(WatchFaceConstant.PRESET_RES, map2.get(WatchFaceConstant.PRESET_RES).intValue(), map3.get(WatchFaceConstant.PRESET_RES).intValue(), BaseApplication.getContext().getResources().getString(R.string.IDS_plugin_achievement_ultra_marathon_challenge), BaseApplication.getContext().getResources().getString(R.string.IDS_plugin_achievement_single_run_distance, e(R.string.IDS_hw_show_sport_kms_string, 100))));
            return map;
        } catch (IllegalFormatConversionException | MissingFormatArgumentException unused) {
            LogUtil.e("PLGACHIEVE_CombinationOldMyMedals", "string format exception");
            return map;
        }
    }

    private Map<String, MedalInfo> b(Map<String, MedalInfo> map, Map<String, Integer> map2, Map<String, Integer> map3) {
        map.put("C_10000", new MedalInfo("C10000", map2.get("C10000").intValue(), map3.get("C10000").intValue(), e(R.string.IDS_plugin_achievement_cumulative_steps, 10000), e(R.string.IDS_plugin_achievement_cumulative_movement_1wsteps_new, 10000)));
        map.put("C_100000", new MedalInfo("C100000", map2.get("C100000").intValue(), map3.get("C100000").intValue(), e(R.string.IDS_plugin_achievement_cumulative_steps, 100000), e(R.string.IDS_plugin_achievement_cumulative_movement_10wsteps_new, 100000)));
        map.put("C_300000", new MedalInfo("C300000", map2.get("C300000").intValue(), map3.get("C300000").intValue(), e(R.string.IDS_plugin_achievement_cumulative_steps, 300000), e(R.string.IDS_plugin_achievement_cumulative_movement_30wsteps_new, 300000)));
        map.put("C_1000000", new MedalInfo("C1000000", map2.get("C1000000").intValue(), map3.get("C1000000").intValue(), e(R.string.IDS_plugin_achievement_cumulative_steps, 1000000), e(R.string.IDS_plugin_achievement_cumulative_movement_100wsteps_new, 1000000)));
        map.put("C_3000000", new MedalInfo("C3000000", map2.get("C3000000").intValue(), map3.get("C3000000").intValue(), e(R.string.IDS_plugin_achievement_cumulative_steps, 3000000), e(R.string.IDS_plugin_achievement_cumulative_movement_300wsteps_new, 3000000)));
        map.put("C_5000000", new MedalInfo("C5000000", map2.get("C5000000").intValue(), map3.get("C5000000").intValue(), e(R.string.IDS_plugin_achievement_cumulative_steps, GmsVersion.VERSION_LONGHORN), e(R.string.IDS_plugin_achievement_cumulative_movement_500wsteps_new, GmsVersion.VERSION_LONGHORN)));
        map.put("C_10000000", new MedalInfo("C10000000", map2.get("C10000000").intValue(), map3.get("C10000000").intValue(), e(R.string.IDS_plugin_achievement_cumulative_steps, ExceptionCode.CRASH_EXCEPTION), e(R.string.IDS_plugin_achievement_cumulative_movement_1000wsteps_new, ExceptionCode.CRASH_EXCEPTION)));
        map.put("C_15000000", new MedalInfo("C15000000", map2.get("C15000000").intValue(), map3.get("C15000000").intValue(), e(R.string.IDS_plugin_achievement_cumulative_steps, 15000000), e(R.string.IDS_plugin_achievement_cumulative_movement_1500wsteps_new, 15000000)));
        return map;
    }

    private MedalInfo b(Map<String, Integer> map, Map<String, Integer> map2, String str, int i) {
        if (UnitUtil.f()) {
            String strE = pax.e(i, 0);
            LogUtil.d("PLGACHIEVE_CombinationOldMyMedals", "buildCycleMedalInfo");
            return new MedalInfo(str, map.get(str).intValue(), map2.get(str).intValue(), BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_plugin_achievement_single_cycle_imperial, pax.s(strE), strE), BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_plugin_achievement_single_cycle_distance_imperial, pax.s(strE), strE));
        }
        String strE2 = UnitUtil.e(i, 1, 0);
        return new MedalInfo(str, map.get(str).intValue(), map2.get(str).intValue(), BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_plugin_achievement_single_run, pax.s(strE2), strE2), BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_plugin_achievement_single_cycle_distance, pax.s(strE2), strE2));
    }
}
