package defpackage;

import android.content.Context;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.health.device.wifi.control.logic.AccessNetWorkTask;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.PluginAchieveAdapter;
import com.huawei.pluginachievement.impl.AchieveCallback;
import com.huawei.pluginachievement.report.bean.AnnualReportCycle;
import com.huawei.pluginachievement.report.constant.EnumAnnualType;
import com.huawei.pluginachievement.report.iterface.BaseCalculator;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public class ovc extends BaseCalculator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f44835a = {0, AccessNetWorkTask.TIME_OUT_ALL, 300000};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PluginAchieveAdapter f44836b = getPluginAchieveAdapter();
    private Context e = BaseApplication.getContext();

    @Override // com.huawei.pluginachievement.report.iterface.BaseCalculator
    public void compute(int i) {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        ArrayList arrayList = new ArrayList(16);
        ArrayList arrayList2 = new ArrayList(16);
        c(i, countDownLatch, arrayList);
        c(i - 1, countDownLatch, arrayList2);
        try {
            countDownLatch.await(8000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            LogUtil.e("PLGACHIEVE_CycleCalculator", "getTrackListByCycleType.await(): catch InterruptedException");
        }
        AnnualReportCycle annualReportCycleC = owy.c(arrayList);
        d(annualReportCycleC, i);
        e(annualReportCycleC, owy.c(arrayList2), i);
        d(annualReportCycleC, arrayList);
    }

    private void d(AnnualReportCycle annualReportCycle, List<HiHealthData> list) {
        addStarData("cycleStar", (njy.e(list) || annualReportCycle == null) ? 0 : oxi.b(annualReportCycle.acquireTotalDistance(), f44835a));
    }

    public void d(int i) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ArrayList arrayList = new ArrayList(16);
        c(i, countDownLatch, arrayList);
        try {
            countDownLatch.await(8000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            LogUtil.e("PLGACHIEVE_CycleCalculator", "compute2019.await(): catch InterruptedException");
        }
        d(owy.c(arrayList), i);
    }

    private void e(AnnualReportCycle annualReportCycle, AnnualReportCycle annualReportCycle2, int i) {
        int iAcquireTotalDistance = annualReportCycle != null ? annualReportCycle.acquireTotalDistance() : 0;
        insertData(i, EnumAnnualType.REPORT_CYCLE.value(), 1005, String.valueOf(oxi.e(iAcquireTotalDistance, annualReportCycle2 != null ? annualReportCycle2.acquireTotalDistance() : 0, 2000)));
        insertData(i, EnumAnnualType.REPORT_CYCLE.value(), 1001, String.valueOf(iAcquireTotalDistance));
    }

    private void c(int i, final CountDownLatch countDownLatch, final List<HiHealthData> list) {
        this.f44836b.fetchSequenceDataBySportType(this.e, oxi.a(i, true), oxi.a(i, false), 259, new AchieveCallback() { // from class: ovc.1
            @Override // com.huawei.pluginachievement.impl.AchieveCallback
            public void onResponse(int i2, Object obj) {
                if (obj instanceof List) {
                    list.addAll((List) obj);
                } else {
                    LogUtil.j("PLGACHIEVE_CycleCalculator", "getTrackListByCycleType data is not correct");
                }
                countDownLatch.countDown();
            }
        });
    }

    private void d(AnnualReportCycle annualReportCycle, int i) {
        if (annualReportCycle == null) {
            LogUtil.j("PLGACHIEVE_CycleCalculator", "saveCycleData annualReportCycle is null");
            return;
        }
        insertData(i, EnumAnnualType.REPORT_CYCLE.value(), 1003, String.valueOf(annualReportCycle.acquireMaxDistance()));
        insertData(i, EnumAnnualType.REPORT_CYCLE.value(), 1004, String.valueOf(annualReportCycle.acquireMaxDistanceDay()));
        insertData(i, EnumAnnualType.REPORT_CYCLE.value(), 1002, String.valueOf(annualReportCycle.acquireNumberOfTimes()));
        insertData(i, EnumAnnualType.REPORT_CYCLE.value(), PrebakedEffectId.RT_SPEED_UP, String.valueOf(annualReportCycle.getMaxCycleContinuousDays()));
        if (i <= 2019) {
            insertData(i, EnumAnnualType.REPORT_CYCLE.value(), 1001, String.valueOf(annualReportCycle.acquireTotalDistance()));
        }
    }
}
