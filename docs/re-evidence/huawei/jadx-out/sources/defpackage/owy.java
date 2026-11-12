package defpackage;

import com.google.gson.JsonSyntaxException;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.report.bean.AnnualReportCycle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class owy {
    public static AnnualReportCycle c(List<HiHealthData> list) {
        LogUtil.a("PLGACHIEVE_CycleCalRule", "enter computeCycleTrackInfo");
        HiTrackMetaData hiTrackMetaData = null;
        if (njy.e(list)) {
            LogUtil.j("PLGACHIEVE_CycleCalRule", "computeCycleTrackInfo dataInfos is empty");
            return null;
        }
        HashSet hashSet = new HashSet(16);
        int i = 0;
        long j = 0;
        int i2 = 0;
        int i3 = 0;
        for (HiHealthData hiHealthData : list) {
            try {
                hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(hiHealthData.getMetaData(), HiTrackMetaData.class);
            } catch (JsonSyntaxException unused) {
                LogUtil.e("PLGACHIEVE_CycleCalRule", "computeCycleTrackInfo trackMetaData is error!");
            }
            if (hiTrackMetaData != null) {
                int totalDistance = hiTrackMetaData.getTotalDistance();
                if (!oxe.e(hiTrackMetaData)) {
                    i2 += totalDistance;
                    i3++;
                    hashSet.add(Long.valueOf(oxi.a(hiHealthData)));
                }
                if (!oxe.d(hiTrackMetaData)) {
                    long startTime = hiHealthData.getStartTime();
                    if (totalDistance >= i) {
                        i = totalDistance;
                        j = startTime;
                    }
                }
            }
        }
        int iC = owj.c(new ArrayList(hashSet));
        LogUtil.a("PLGACHIEVE_CycleCalRule", "maxCycleContinuousDays reachDays == ", Integer.valueOf(iC));
        return d(i, j, i2, i3, iC);
    }

    private static AnnualReportCycle d(int i, long j, int i2, int i3, int i4) {
        AnnualReportCycle annualReportCycle = new AnnualReportCycle();
        annualReportCycle.saveMaxDistance(i);
        annualReportCycle.saveMaxDistanceDay(j);
        annualReportCycle.saveNumberOfTimes(i3);
        annualReportCycle.saveTotalDistance(i2);
        annualReportCycle.setMaxCycleContinuousDays(i4);
        return annualReportCycle;
    }
}
