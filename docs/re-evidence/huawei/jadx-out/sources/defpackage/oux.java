package defpackage;

import com.huawei.hihealth.HiHealthData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.PluginAchieveAdapter;
import com.huawei.pluginachievement.impl.AchieveCallback;
import com.huawei.pluginachievement.report.constant.EnumAnnualType;
import com.huawei.pluginachievement.report.iterface.BaseCalculator;
import health.compact.a.UnitUtil;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public class oux extends BaseCalculator {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PluginAchieveAdapter f44826c = getPluginAchieveAdapter();

    private double d(int i, int i2) {
        if (i2 != 0) {
            return (((double) i) * 1.0d) / ((double) i2);
        }
        return 0.0d;
    }

    @Override // com.huawei.pluginachievement.report.iterface.BaseCalculator
    public void compute(int i) {
        d(i);
    }

    public void d(int i) {
        if (this.f44826c == null) {
            this.f44826c = oru.a(BaseApplication.getContext()).getAdapter();
        }
        CountDownLatch countDownLatch = new CountDownLatch(2);
        ArrayList arrayList = new ArrayList(16);
        ArrayList arrayList2 = new ArrayList(16);
        c(i, countDownLatch, arrayList);
        c(i - 1, countDownLatch, arrayList2);
        try {
            countDownLatch.await(8000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            LogUtil.e("PLGACHIEVE_BloodPressureCalculator", "getBloodPressureRecordData.await(): catch a InterruptedException");
        }
        int iE = e(arrayList);
        int iD = d(arrayList);
        double d = d(iE, iD);
        double d2 = d - d(e(arrayList2), d(arrayList2));
        LogUtil.a("PLGACHIEVE_BloodPressureCalculator", "getBloodPressureRecordData diffNormalRatio ", Double.valueOf(d2));
        a(iD, iE, d, d2, i);
    }

    private int d(List<HiHealthData> list) {
        if (njy.e(list)) {
            LogUtil.j("PLGACHIEVE_BloodPressureCalculator", "getTotalRecords records isEmpty.");
            return 0;
        }
        return list.size();
    }

    private int e(List<HiHealthData> list) {
        if (njy.e(list)) {
            LogUtil.j("PLGACHIEVE_BloodPressureCalculator", "getNormalRecordData records isEmpty.");
            return 0;
        }
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.getDefault());
        int i = 0;
        for (HiHealthData hiHealthData : list) {
            String strE = UnitUtil.e(hiHealthData.getDouble("BLOOD_PRESSURE_SYSTOLIC"), 1, 0);
            String strE2 = UnitUtil.e(hiHealthData.getDouble("BLOOD_PRESSURE_DIASTOLIC"), 1, 0);
            try {
                int iIntValue = numberFormat.parse(strE).intValue();
                int iIntValue2 = numberFormat.parse(strE2).intValue();
                int iD = owu.d((short) iIntValue, (short) iIntValue2);
                LogUtil.a("PLGACHIEVE_BloodPressureCalculator", "getNormalRecordData records highPressureRange = ", Integer.valueOf(iIntValue), " lowPressureRange ", Integer.valueOf(iIntValue2), " level ", Integer.valueOf(iD));
                if (iD == 1) {
                    i++;
                }
            } catch (ParseException unused) {
                LogUtil.e("PLGACHIEVE_BloodPressureCalculator", "getNormalRecordData, ParseException");
            }
        }
        return i;
    }

    private List<HiHealthData> c(int i, final CountDownLatch countDownLatch, final List<HiHealthData> list) {
        this.f44826c.getAnnualBloodPressureRecordData(i, new AchieveCallback() { // from class: oux.4
            @Override // com.huawei.pluginachievement.impl.AchieveCallback
            public void onResponse(int i2, Object obj) {
                if (obj instanceof List) {
                    list.addAll((List) obj);
                } else {
                    LogUtil.j("PLGACHIEVE_BloodPressureCalculator", "getTotalRecordData data is not correct");
                }
                countDownLatch.countDown();
            }
        });
        return list;
    }

    private void a(int i, int i2, double d, double d2, int i3) {
        insertData(i3, EnumAnnualType.REPORT_HEALTH.value(), 10004, String.valueOf(i));
        insertData(i3, EnumAnnualType.REPORT_HEALTH.value(), 10005, String.valueOf(i2));
        insertData(i3, EnumAnnualType.REPORT_HEALTH.value(), 10006, UnitUtil.e(d, 1, 2));
        insertData(i3, EnumAnnualType.REPORT_HEALTH.value(), 10007, UnitUtil.e(d2, 1, 2));
    }
}
