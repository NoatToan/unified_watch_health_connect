package com.xiaomi.hm.health.jobcenter.job;

import android.content.SharedPreferences;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.datautil.HMDataCacheCenter;
import com.xiaomi.hm.health.eventbus.EventTotalAnalysisJobFinished;
import com.xiaomi.hm.health.jobcenter.manager.ThreadJobObject;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.hm.health.keeper.HMKeeperConstant;
import com.xiaomi.hm.health.model.summery.HMSummery;
import com.xiaomi.hm.health.model.summery.Steps;
import de.greenrobot.event.EventBus;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes21.dex */
public class HMTotalDataAnalisisJob extends ThreadJobObject {
    private static final String c = "HMTotalDataAnalisisJob";

    public HMTotalDataAnalisisJob() {
        super(4);
    }

    @Override // com.xiaomi.hm.health.jobcenter.manager.ThreadJobObject, com.xiaomi.hm.health.devicex.proxy.ThreadJob
    public void cancel() {
        super.cancel();
    }

    @Override // com.xiaomi.hm.health.jobcenter.manager.ThreadJobObject, java.lang.Runnable
    public void run() {
        super.run();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            CopyOnWriteArrayList<HMSummery> copyOnWriteArrayList = HMDataCacheCenter.getInstance().getmBandUint().getmDaySummeryArrayList();
            if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                for (HMSummery hMSummery : copyOnWriteArrayList) {
                    Steps steps = hMSummery.steps;
                    if (steps != null) {
                        i3 += steps.dis;
                        int i5 = steps.ttl;
                        if (i5 >= hMSummery.goal) {
                            i4++;
                        }
                        i2 += i5;
                        if (i5 > 0) {
                            i++;
                        }
                    }
                }
                if (i == 0) {
                    return;
                }
                SharedPreferences.Editor editorEdit = HMKeeper.getSharedPref().edit();
                int i6 = i2 / i;
                HMLog.i(c, "totalMiles : " + i3 + ";totalReachGoalDays = " + i4 + ";totalSteps = " + i2 + ";average = " + i6 + ";totalValidDays = " + i + ";time used =  " + (System.currentTimeMillis() - jCurrentTimeMillis), new Object[0]);
                editorEdit.putInt(HMKeeperConstant.TOTAL_ANALYSIS_MILES, i3);
                editorEdit.putInt(HMKeeperConstant.TOTAL_ANALYSIS_STEPS, i2);
                editorEdit.putInt(HMKeeperConstant.TOTAL_ANALYSIS_AVERAGE_STEPS, i6);
                editorEdit.putInt(HMKeeperConstant.TOTAL_ANALYSIS_REACH_GOALS, i4);
                editorEdit.putInt(HMKeeperConstant.TOTAL_ANALYSIS_VALID_DAYS, i);
                editorEdit.apply();
                EventBus.getDefault().post(new EventTotalAnalysisJobFinished());
                return;
            }
            HMLog.d(c, "日统计列表为空 ，无法计算", new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.xiaomi.hm.health.jobcenter.manager.ThreadJobObject, com.xiaomi.hm.health.devicex.proxy.ThreadJob
    public void start() {
        super.start();
    }
}
