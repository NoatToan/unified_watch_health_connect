package com.huawei.hihealthservice.sync.dataswitch;

import android.content.Context;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwcloudmodel.model.unite.ProfessionalSleep;
import com.huawei.hwcloudmodel.model.unite.ProfessionalSleepTotal;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.kuk;
import defpackage.kym;
import defpackage.kyn;
import defpackage.lik;
import defpackage.njy;
import health.compact.a.HiDateUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class CoreSleepSwitch {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f12592b;

    public CoreSleepSwitch(Context context) {
        this.f12592b = context.getApplicationContext();
    }

    public Map<Integer, List<kuk>> b(List<ProfessionalSleepTotal> list, int i) {
        if (njy.e(list)) {
            return new HashMap();
        }
        HashMap map = new HashMap(list.size());
        for (ProfessionalSleepTotal professionalSleepTotal : list) {
            List<kuk> listD = d(professionalSleepTotal, i);
            if (listD != null && !listD.isEmpty()) {
                map.put(Integer.valueOf(professionalSleepTotal.getRecordDay()), listD);
            }
        }
        return map;
    }

    public List<kuk> d(ProfessionalSleepTotal professionalSleepTotal, int i) {
        if (professionalSleepTotal.getDeviceCode() != 0) {
            LogUtil.j("Debug_CoreSleepSwitch", "the sportTotal's deviceCode should be 0, deviceCode is ", Long.valueOf(professionalSleepTotal.getDeviceCode()));
            return new ArrayList();
        }
        kym kymVarD = kyn.d(this.f12592b).d(0, i, 0);
        if (kymVarD == null) {
            return new ArrayList();
        }
        int recordDay = professionalSleepTotal.getRecordDay();
        List<kuk> listE = e(professionalSleepTotal.getProfessionalSleep(), recordDay, professionalSleepTotal.getGenerateTime());
        if (listE == null || listE.isEmpty()) {
            return new ArrayList();
        }
        int iC = kymVarD.c();
        String timeZone = professionalSleepTotal.getTimeZone();
        for (kuk kukVar : listE) {
            kukVar.a(iC);
            kukVar.c(timeZone);
            kukVar.b(recordDay);
            kukVar.i(1);
            kukVar.a(professionalSleepTotal.getGenerateTime());
            kukVar.e(22100);
        }
        return listE;
    }

    private List<kuk> e(ProfessionalSleep professionalSleep, int i, long j) {
        if (professionalSleep == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(44);
        if (HwExerciseConstants.TEN_DAY_SECOND > System.currentTimeMillis() - HiDateUtil.a(i)) {
            ReleaseLogUtil.d("HiH_CoreSleepSwitch", "recordday=", Integer.valueOf(i), "[", Long.valueOf(j), "]:", professionalSleep);
        }
        d(arrayList, professionalSleep.getFallAsleepTime(), 44201, 5);
        d(arrayList, professionalSleep.getWakeupTime(), 44202, 5);
        d(arrayList, professionalSleep.getSleepScore(), 44203, 17);
        d(arrayList, professionalSleep.getSleepLatency(), 44204, 15);
        d(arrayList, professionalSleep.getGoBedTime(), 44205, 5);
        d(arrayList, professionalSleep.getValidData(), 44206, 0);
        d(arrayList, professionalSleep.getSleepEfficiency(), 44207, 18);
        d(arrayList, professionalSleep.getLightSleepTime(), 44103, 15);
        d(arrayList, professionalSleep.getDeepSleepTime(), 44102, 15);
        d(arrayList, professionalSleep.getDreamTime(), 44101, 15);
        d(arrayList, professionalSleep.getAwakeTime(), 44104, 15);
        d(arrayList, professionalSleep.getAllSleepTime(), 44105, 15);
        d(arrayList, professionalSleep.getWakeUpCount(), 44107, 16);
        d(arrayList, professionalSleep.getDeepSleepPart(), 44106, 16);
        d(arrayList, professionalSleep.getSnoreFrequency(), 44208, 0);
        d(arrayList, professionalSleep.getDaySleepTime(), 44108, 15);
        d(arrayList, professionalSleep.getBedTime(), 44109, 15);
        d(arrayList, professionalSleep.getDeviceCategory(), 44110, 0);
        e(professionalSleep, arrayList);
        d(professionalSleep, arrayList);
        b(professionalSleep, arrayList);
        return arrayList;
    }

    private static void e(ProfessionalSleep professionalSleep, List<kuk> list) {
        d(list, professionalSleep.getMinHeartrate(), 44209, 0);
        d(list, professionalSleep.getMaxHeartrate(), 44210, 0);
        d(list, professionalSleep.getMinOxygenSaturation(), 44211, 0);
        d(list, professionalSleep.getMaxOxygenSaturation(), 44212, 0);
        d(list, professionalSleep.getMinBreathrate(), 44213, 0);
        d(list, professionalSleep.getMaxBreathrate(), 44214, 0);
        d(list, professionalSleep.getNewSleepLatency(), 44218, 0);
        d(list, professionalSleep.getWakeUpFeeling(), 44215, 0);
        d(list, professionalSleep.getRisingTime(), 44216, 0);
        d(list, professionalSleep.getDeviceBedTime(), 44217, 0);
    }

    private void d(ProfessionalSleep professionalSleep, List<kuk> list) {
        b(list, professionalSleep.getLastAvgHeartrate(), 44219, 8);
        b(list, professionalSleep.getLastMinHeartrateBaseline(), 44220, 8);
        b(list, professionalSleep.getLastMaxHeartrateBaseline(), 44221, 8);
        b(list, professionalSleep.getLastHeartrateDayToBaseline(), 44222, 0);
        b(list, professionalSleep.getLastAvgSpO2(), 44223, 0);
        b(list, professionalSleep.getLastMinSpO2Baseline(), 44224, 0);
        b(list, professionalSleep.getLastMaxSpO2Baseline(), 44225, 0);
        b(list, professionalSleep.getLastSpO2DayToBaseline(), 44226, 0);
        b(list, professionalSleep.getLastAvgBreathrate(), 44227, 0);
        b(list, professionalSleep.getLastMinBreathrateBaseline(), 44228, 0);
        b(list, professionalSleep.getLastMaxBreathrateBaseline(), 44229, 0);
        b(list, professionalSleep.getLastBreathrateDayToBaseline(), 44230, 0);
        b(list, professionalSleep.getLastAvgHrv(), 44231, 0);
        b(list, professionalSleep.getLastMinHrvBaseline(), 44232, 0);
        b(list, professionalSleep.getLastMaxHrvBaseline(), 44233, 0);
        b(list, professionalSleep.getLastHrvDayToBaseline(), 44234, 0);
    }

    private void b(ProfessionalSleep professionalSleep, List<kuk> list) {
        b(list, professionalSleep.getMaxSleepVersion(), 44235, 0);
        b(list, professionalSleep.getLastStableSleepRatio(), 44236, 0);
        b(list, professionalSleep.getDayDreamDurationREM(), 44111, 15);
        b(list, professionalSleep.getDayDeepDurationN3(), 44112, 15);
        b(list, professionalSleep.getDayShallowDurationN1N2(), 44113, 15);
    }

    private static void b(List<kuk> list, Integer num, int i, int i2) {
        if (num != null) {
            d(list, num.intValue(), i, i2);
        }
    }

    private static void d(List<kuk> list, double d, int i, int i2) {
        if (d >= 0.0d) {
            list.add(lik.d(i, d, i2));
        }
    }

    public List<ProfessionalSleepTotal> e(List<HiHealthData> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (HiHealthData hiHealthData : list) {
            ProfessionalSleepTotal professionalSleepTotal = new ProfessionalSleepTotal();
            professionalSleepTotal.setTimeZone(hiHealthData.getTimeZone());
            professionalSleepTotal.setRecordDay(HiDateUtil.d(hiHealthData.getStartTime()));
            professionalSleepTotal.setDataSource(2);
            professionalSleepTotal.setDeviceCode(0L);
            professionalSleepTotal.setGenerateTime(hiHealthData.getLong("modified_time"));
            ProfessionalSleep professionalSleepA = a(hiHealthData);
            if (professionalSleepA != null) {
                professionalSleepTotal.setProfessionalSleep(professionalSleepA);
                arrayList.add(professionalSleepTotal);
            }
        }
        return arrayList;
    }

    private ProfessionalSleep a(HiHealthData hiHealthData) {
        ProfessionalSleep professionalSleep = new ProfessionalSleep();
        professionalSleep.setFallAsleepTime(hiHealthData.getLong("stat_out_core_sleep_fall_time"));
        professionalSleep.setWakeupTime(hiHealthData.getLong("stat_out_core_sleep_wake_up_time"));
        professionalSleep.setSleepScore(hiHealthData.getInt("stat_out_core_sleep_score"));
        professionalSleep.setSleepLatency(hiHealthData.getInt("stat_out_core_sleep_latency"));
        professionalSleep.setGoBedTime(hiHealthData.getLong("stat_out_core_sleep_go_bed_time"));
        professionalSleep.setValidData(hiHealthData.getFloat("stat_out_core_sleep_valid_data"));
        professionalSleep.setSleepEfficiency(hiHealthData.getInt("stat_out_core_sleep_efficiency"));
        professionalSleep.setLightSleepTime(hiHealthData.getInt("stat_core_sleep_shallow_duration"));
        professionalSleep.setDeepSleepTime(hiHealthData.getInt("stat_core_sleep_deep_duration"));
        professionalSleep.setDreamTime(hiHealthData.getInt("stat_core_sleep_dream_duration"));
        professionalSleep.setAwakeTime(hiHealthData.getInt("stat_core_sleep_wake_duration"));
        professionalSleep.setAllSleepTime(hiHealthData.getInt("stat_core_sleep_duration_sum"));
        professionalSleep.setWakeUpCount(hiHealthData.getInt("stat_core_sleep_wake_count"));
        professionalSleep.setDeepSleepPart(hiHealthData.getInt("stat_core_sleep_deep_part_count"));
        professionalSleep.setSnoreFrequency(hiHealthData.getInt("stat_out_core_sleep_snore_freq"));
        professionalSleep.setDaySleepTime(hiHealthData.getInt("stat_core_sleep_noon_duration"));
        professionalSleep.setBedTime(hiHealthData.getInt("stat_core_sleep_bed_duration"));
        professionalSleep.setDeviceCategory(hiHealthData.getInt("stat_core_sleep_device_category"));
        professionalSleep.setMinHeartrate(hiHealthData.getInt("stat_out_core_sleep_min_heartrate"));
        professionalSleep.setMaxHeartrate(hiHealthData.getInt("stat_out_core_sleep_max_heartrate"));
        professionalSleep.setMinOxygenSaturation(hiHealthData.getDouble("stat_core_sleep_min_oxygen_saturation"));
        professionalSleep.setMaxOxygenSaturation(hiHealthData.getDouble("stat_core_sleep_max_oxygen_saturation"));
        professionalSleep.setMinBreathrate(hiHealthData.getDouble("stat_out_core_sleep_min_breathrate"));
        professionalSleep.setMaxBreathrate(hiHealthData.getDouble("stat_out_core_sleep_max_breathrate"));
        professionalSleep.setWakeUpFeeling(hiHealthData.getInt("stat_out_core_sleep_wakeup_feeling"));
        professionalSleep.setRisingTime(hiHealthData.getLong("stat_out_core_sleep_rising_time"));
        professionalSleep.setDeviceBedTime(hiHealthData.getInt("stat_out_core_sleep_device_bed_time"));
        professionalSleep.setNewSleepLatency(hiHealthData.getInt("stat_out_core_sleep_new_latency"));
        d(hiHealthData, professionalSleep);
        b(hiHealthData, professionalSleep);
        return professionalSleep;
    }

    private static void b(HiHealthData hiHealthData, ProfessionalSleep professionalSleep) {
        if (hiHealthData.containsKey("maxSleepVersion")) {
            professionalSleep.setMaxSleepVersion(Integer.valueOf(hiHealthData.getInt("maxSleepVersion")));
        }
        if (hiHealthData.containsKey("lastStableSleepRatio")) {
            professionalSleep.setLastStableSleepRatio(Integer.valueOf(hiHealthData.getInt("lastStableSleepRatio")));
        }
        if (hiHealthData.containsKey("dayDreamDurationREM")) {
            professionalSleep.setDayDreamDurationREM(Integer.valueOf(hiHealthData.getInt("dayDreamDurationREM")));
        }
        if (hiHealthData.containsKey("dayDeepDurationN3")) {
            professionalSleep.setDayDeepDurationN3(Integer.valueOf(hiHealthData.getInt("dayDeepDurationN3")));
        }
        if (hiHealthData.containsKey("dayShallowDurationN1N2")) {
            professionalSleep.setDayShallowDurationN1N2(Integer.valueOf(hiHealthData.getInt("dayShallowDurationN1N2")));
        }
    }

    private static void d(HiHealthData hiHealthData, ProfessionalSleep professionalSleep) {
        if (hiHealthData.containsKey("lastAvgHeartrate")) {
            professionalSleep.setLastAvgHeartrate(Integer.valueOf(hiHealthData.getInt("lastAvgHeartrate")));
        }
        if (hiHealthData.containsKey("lastMinHeartrateBaseline")) {
            professionalSleep.setLastMinHeartrateBaseline(Integer.valueOf(hiHealthData.getInt("lastMinHeartrateBaseline")));
        }
        if (hiHealthData.containsKey("lastMaxHeartrateBaseline")) {
            professionalSleep.setLastMaxHeartrateBaseline(Integer.valueOf(hiHealthData.getInt("lastMaxHeartrateBaseline")));
        }
        if (hiHealthData.containsKey("lastHeartrateDayToBaseline")) {
            professionalSleep.setLastHeartrateDayToBaseline(Integer.valueOf(hiHealthData.getInt("lastHeartrateDayToBaseline")));
        }
        if (hiHealthData.containsKey("lastAvgSpO2")) {
            professionalSleep.setLastAvgSpO2(Integer.valueOf(hiHealthData.getInt("lastAvgSpO2")));
        }
        if (hiHealthData.containsKey("lastMinSpO2Baseline")) {
            professionalSleep.setLastMinSpO2Baseline(Integer.valueOf(hiHealthData.getInt("lastMinSpO2Baseline")));
        }
        if (hiHealthData.containsKey("lastMaxSpO2Baseline")) {
            professionalSleep.setLastMaxSpO2Baseline(Integer.valueOf(hiHealthData.getInt("lastMaxSpO2Baseline")));
        }
        if (hiHealthData.containsKey("lastSpO2DayToBaseline")) {
            professionalSleep.setLastSpO2DayToBaseline(Integer.valueOf(hiHealthData.getInt("lastSpO2DayToBaseline")));
        }
        if (hiHealthData.containsKey("lastAvgBreathrate")) {
            professionalSleep.setLastAvgBreathrate(Integer.valueOf(hiHealthData.getInt("lastAvgBreathrate")));
        }
        if (hiHealthData.containsKey("lastMinBreathrateBaseline")) {
            professionalSleep.setLastMinBreathrateBaseline(Integer.valueOf(hiHealthData.getInt("lastMinBreathrateBaseline")));
        }
        if (hiHealthData.containsKey("lastMaxBreathrateBaseline")) {
            professionalSleep.setLastMaxBreathrateBaseline(Integer.valueOf(hiHealthData.getInt("lastMaxBreathrateBaseline")));
        }
        if (hiHealthData.containsKey("lastBreathrateDayToBaseline")) {
            professionalSleep.setLastBreathrateDayToBaseline(Integer.valueOf(hiHealthData.getInt("lastBreathrateDayToBaseline")));
        }
        if (hiHealthData.containsKey("lastAvgHrv")) {
            professionalSleep.setLastAvgHrv(Integer.valueOf(hiHealthData.getInt("lastAvgHrv")));
        }
        if (hiHealthData.containsKey("lastMinHrvBaseline")) {
            professionalSleep.setLastMinHrvBaseline(Integer.valueOf(hiHealthData.getInt("lastMinHrvBaseline")));
        }
        if (hiHealthData.containsKey("lastMaxHrvBaseline")) {
            professionalSleep.setLastMaxHrvBaseline(Integer.valueOf(hiHealthData.getInt("lastMaxHrvBaseline")));
        }
        if (hiHealthData.containsKey("lastHrvDayToBaseline")) {
            professionalSleep.setLastHrvDayToBaseline(Integer.valueOf(hiHealthData.getInt("lastHrvDayToBaseline")));
        }
    }
}
