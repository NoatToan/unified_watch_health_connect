package defpackage;

import android.content.Context;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.SleepTotalData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.MainLoginCallBack;
import com.huawei.pluginachievement.PluginAchieveAdapter;
import com.huawei.pluginachievement.impl.AchieveCallback;
import com.huawei.pluginachievement.report.constant.EnumAnnualType;
import com.huawei.pluginachievement.report.iterface.BaseCalculator;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public class ovw extends BaseCalculator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f44885b = {0, 63, 78};
    private PluginAchieveAdapter e = getPluginAchieveAdapter();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f44886a = BaseApplication.getContext();

    @Override // com.huawei.pluginachievement.report.iterface.BaseCalculator
    public void compute(int i) {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        ArrayList arrayList = new ArrayList(16);
        ArrayList arrayList2 = new ArrayList(16);
        a(i, countDownLatch, arrayList);
        int i2 = i - 1;
        a(i2, countDownLatch, arrayList2);
        try {
            countDownLatch.await(8000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            LogUtil.e("PLGACHIEVE_SleepCalculator", "compute.await(): catch InterruptedException");
        }
        int iE = e(arrayList, i);
        insertData(i, EnumAnnualType.REPORT_SLEEP.value(), MainLoginCallBack.MSG_SHOW_HMS_DIALOG, String.valueOf(oxi.e(iE, e(arrayList2, i2), 5)));
        e(iE, arrayList);
    }

    private void e(int i, List<SleepTotalData> list) {
        addStarData("sleepStar", njy.e(list) ? 0 : oxi.b(i, f44885b));
    }

    public void d(int i) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ArrayList arrayList = new ArrayList(16);
        a(i, countDownLatch, arrayList);
        try {
            countDownLatch.await(8000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            LogUtil.e("PLGACHIEVE_SleepCalculator", "compute2019.await(): catch InterruptedException");
        }
        e(arrayList, i);
    }

    private void a(int i, final CountDownLatch countDownLatch, final List<SleepTotalData> list) {
        this.e.getAnnualSleepReport(this.f44886a, oxi.a(i, true), oxi.a(i, false), new AchieveCallback() { // from class: ovw.1
            @Override // com.huawei.pluginachievement.impl.AchieveCallback
            public void onResponse(int i2, Object obj) {
                if (obj instanceof List) {
                    list.addAll((List) obj);
                } else {
                    LogUtil.j("PLGACHIEVE_SleepCalculator", "getAnnualSleepRecords data is not correct");
                }
                countDownLatch.countDown();
            }
        });
    }

    private int e(List<SleepTotalData> list, int i) {
        int i2 = 0;
        if (njy.e(list)) {
            return 0;
        }
        HashMap map = new HashMap(16);
        HashMap map2 = new HashMap(16);
        HashMap map3 = new HashMap(16);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<SleepTotalData> it = list.iterator();
        int deepSleepTime = 0;
        int score = 0;
        int iC = 0;
        int wakeUpTime = 0;
        int wakeupTimes = 0;
        int i3 = 0;
        int i4 = 0;
        long sleepMonitorStartTime = 0;
        int totalSleepTime = 0;
        int i5 = 0;
        while (it.hasNext()) {
            Iterator<SleepTotalData> it2 = it;
            SleepTotalData next = it.next();
            score += next.getScore();
            deepSleepTime += next.getDeepSleepTime();
            int slumberSleepTime = i5 + next.getSlumberSleepTime();
            int shallowSleepTime = i2 + next.getShallowSleepTime();
            int fallTime = next.getFallTime();
            wakeUpTime += next.getWakeUpTime();
            wakeupTimes += next.getWakeupTimes();
            iC += oxg.c(next.getSnoreFreq(), next.getSlumberSleepTime());
            arrayList.add(Integer.valueOf(next.getFallTime()));
            oxg.c(next, map, map2, map3);
            if (next.getFallTime() <= 1440) {
                i4++;
            }
            if (totalSleepTime == 0 || totalSleepTime > next.getTotalSleepTime()) {
                totalSleepTime = next.getTotalSleepTime();
                sleepMonitorStartTime = next.getSleepMonitorStartTime();
            }
            i3 += fallTime;
            it = it2;
            i2 = shallowSleepTime;
            i5 = slumberSleepTime;
        }
        int size = list.size();
        int i6 = totalSleepTime;
        double d = ((double) size) * 1.0d;
        double d2 = ((double) score) / d;
        int i7 = i2;
        c(i, d2, a(deepSleepTime, i5, i2, size), oxi.c(((double) iC) / d), size);
        b(i, a(d(score, deepSleepTime, i5, i7, wakeUpTime), wakeupTimes, i3, iC), arrayList, size);
        e(i, i3, wakeUpTime, size);
        a(i, map3);
        e(i, i4, i6, sleepMonitorStartTime);
        return oxi.c(d2);
    }

    private int a(int i, int i2, int i3, int i4) {
        double d = ((double) i4) * 1.0d;
        return oxi.c((((double) i) / d) + (((double) i2) / d) + (((double) i3) / d));
    }

    private SleepTotalData a(SleepTotalData sleepTotalData, int i, int i2, int i3) {
        sleepTotalData.setWakeupTimes(i);
        sleepTotalData.setFallTime(i2);
        sleepTotalData.setSnoreFreq(i3);
        return sleepTotalData;
    }

    private SleepTotalData d(int i, int i2, int i3, int i4, int i5) {
        SleepTotalData sleepTotalData = new SleepTotalData();
        sleepTotalData.setScore(i);
        sleepTotalData.setDeepSleepTime(i2);
        sleepTotalData.setSlumberSleepTime(i3);
        sleepTotalData.setShallowSleepTime(i4);
        sleepTotalData.setWakeUpTime(i5);
        return sleepTotalData;
    }

    private void e(int i, int i2, int i3, long j) {
        LogUtil.a("PLGACHIEVE_SleepCalculator", "saveSleepData year == ", Integer.valueOf(i), " fallTimeLess24Sum == ", Integer.valueOf(i2), " minSleepDuration == ", Integer.valueOf(i3), " minSleepDurationDay == ", Long.valueOf(j));
        insertData(i, EnumAnnualType.REPORT_SLEEP.value(), 10019, String.valueOf(i2));
        insertData(i, EnumAnnualType.REPORT_SLEEP.value(), 10021, String.valueOf(i3));
        insertData(i, EnumAnnualType.REPORT_SLEEP.value(), 10020, String.valueOf(j));
    }

    private void a(int i, Map<Integer, Double> map) {
        if (map == null) {
            return;
        }
        LogUtil.a("PLGACHIEVE_SleepCalculator", "saveEverySeasonScore seasonSleepAvgScoreMap == ", map.toString());
        int iB = oxg.b(map);
        if (map.containsKey(Integer.valueOf(iB))) {
            int iC = oxi.c(map.get(Integer.valueOf(iB)).doubleValue());
            LogUtil.a("PLGACHIEVE_SleepCalculator", "saveSleepData year == ", Integer.valueOf(i), " maxSeasonScore == ", Integer.valueOf(iC), " maxSeasonIndex == ", Integer.valueOf(iB));
            insertData(i, EnumAnnualType.REPORT_SLEEP.value(), 10018, String.valueOf(iC));
            insertData(i, EnumAnnualType.REPORT_SLEEP.value(), 10017, String.valueOf(iB));
        }
    }

    private void c(int i, double d, int i2, int i3, int i4) {
        insertData(i, EnumAnnualType.REPORT_SLEEP.value(), 8001, UnitUtil.e(d, 1, 1));
        insertData(i, EnumAnnualType.REPORT_SLEEP.value(), 8002, String.valueOf(i2));
        insertData(i, EnumAnnualType.REPORT_SLEEP.value(), MainLoginCallBack.MSG_HMS_VERSION_ERROR, String.valueOf(i3));
        insertData(i, EnumAnnualType.REPORT_SLEEP.value(), MainLoginCallBack.MSG_START_APK_SERVICE_ERROR, String.valueOf(i4));
    }

    private void b(int i, SleepTotalData sleepTotalData, List<Integer> list, int i2) {
        insertData(i, EnumAnnualType.REPORT_SLEEP.value(), MainLoginCallBack.MSG_HWID_STOPED, String.valueOf(oxg.b(sleepTotalData, list, i2)));
    }

    private void e(int i, int i2, int i3, int i4) {
        double d = ((double) i4) * 1.0d;
        int iC = oxi.c(((double) i2) / d) / 60;
        if (iC >= 24) {
            iC -= 24;
        }
        double d2 = ((double) i3) / d;
        int iC2 = oxi.c(d2) / 60;
        int iC3 = oxi.c(d2);
        insertData(i, EnumAnnualType.REPORT_SLEEP.value(), MainLoginCallBack.MSG_HWID_ACCOUNT_NOT_LOGIN, b(iC, (i2 / i4) % 60));
        insertData(i, EnumAnnualType.REPORT_SLEEP.value(), MainLoginCallBack.MSG_NO_NETWORK, b(iC2, iC3 % 60));
    }

    private String b(int i, int i2) {
        String strValueOf;
        String strValueOf2;
        if (i == 0 && i2 == 0) {
            return "00:00";
        }
        if (i < 10) {
            strValueOf = "0" + i;
        } else {
            strValueOf = String.valueOf(i);
        }
        if (i2 < 10) {
            strValueOf2 = "0" + i2;
        } else {
            strValueOf2 = String.valueOf(i2);
        }
        return strValueOf + ":" + strValueOf2;
    }
}
