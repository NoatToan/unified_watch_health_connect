package defpackage;

import com.huawei.hihealth.HiHealthData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.PluginAchieveAdapter;
import com.huawei.pluginachievement.impl.AchieveCallback;
import com.huawei.pluginachievement.report.constant.EnumAnnualType;
import com.huawei.pluginachievement.report.iterface.BaseCalculator;
import health.compact.a.UnitUtil;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public class ouv extends BaseCalculator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PluginAchieveAdapter f44823a = getPluginAchieveAdapter();

    private double b(int i, int i2) {
        if (i2 != 0) {
            return (((double) i) * 1.0d) / ((double) i2);
        }
        return 0.0d;
    }

    @Override // com.huawei.pluginachievement.report.iterface.BaseCalculator
    public void compute(int i) {
        b(i);
    }

    public void b(int i) {
        if (this.f44823a == null) {
            this.f44823a = oru.a(BaseApplication.getContext()).getAdapter();
        }
        CountDownLatch countDownLatch = new CountDownLatch(2);
        ArrayList arrayList = new ArrayList(16);
        ArrayList arrayList2 = new ArrayList(16);
        a(i, countDownLatch, arrayList);
        a(i - 1, countDownLatch, arrayList2);
        try {
            countDownLatch.await(8000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            LogUtil.e("PLGACHIEVE_BloodSugarCalculator", "getBloodSugarRecordData.await(): catch a InterruptedException");
        }
        int iD = d(arrayList);
        int iC = c(arrayList);
        double dB = b(iD, iC);
        double dB2 = dB - b(d(arrayList2), c(arrayList2));
        LogUtil.a("PLGACHIEVE_BloodSugarCalculator", "getBloodPressureRecordData diffNormalRatio ", Double.valueOf(dB2));
        b(iC, iD, dB, dB2, i);
    }

    private int d(List<HiHealthData> list) {
        int i = 0;
        if (njy.e(list)) {
            LogUtil.j("PLGACHIEVE_BloodSugarCalculator", "getNormalRecordData records isEmpty.");
            return 0;
        }
        for (HiHealthData hiHealthData : list) {
            int type = hiHealthData.getType();
            double dDoubleValue = new BigDecimal(hiHealthData.getDouble("point_value")).setScale(1, RoundingMode.HALF_UP).doubleValue();
            boolean zA = owt.a(type, (float) dDoubleValue);
            LogUtil.a("PLGACHIEVE_BloodSugarCalculator", "getNormalRecordData records measurePeriod = ", Integer.valueOf(type), " bloodValue ", Double.valueOf(dDoubleValue), " isNormal ", Boolean.valueOf(zA));
            if (zA) {
                i++;
            }
        }
        return i;
    }

    private int c(List<HiHealthData> list) {
        if (njy.e(list)) {
            LogUtil.j("PLGACHIEVE_BloodSugarCalculator", "getTotalRecords records isEmpty.");
            return 0;
        }
        return list.size();
    }

    private void a(int i, final CountDownLatch countDownLatch, final List<HiHealthData> list) {
        this.f44823a.getAnnualBloodSugarRecordData(i, new AchieveCallback() { // from class: ouv.3
            @Override // com.huawei.pluginachievement.impl.AchieveCallback
            public void onResponse(int i2, Object obj) {
                if (obj instanceof List) {
                    list.addAll((List) obj);
                } else {
                    LogUtil.j("PLGACHIEVE_BloodSugarCalculator", "getNewSportSumData data is not correct");
                }
                countDownLatch.countDown();
            }
        });
    }

    private void b(int i, int i2, double d, double d2, int i3) {
        insertData(i3, EnumAnnualType.REPORT_HEALTH.value(), 10008, String.valueOf(i));
        insertData(i3, EnumAnnualType.REPORT_HEALTH.value(), 10009, String.valueOf(i2));
        insertData(i3, EnumAnnualType.REPORT_HEALTH.value(), 10010, UnitUtil.e(d, 1, 2));
        insertData(i3, EnumAnnualType.REPORT_HEALTH.value(), 10011, UnitUtil.e(d2, 1, 2));
    }
}
