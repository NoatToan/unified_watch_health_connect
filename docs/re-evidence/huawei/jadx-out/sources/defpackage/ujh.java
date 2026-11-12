package defpackage;

import android.content.Context;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper;
import com.huawei.ui.commonui.linechart.icommon.IStorageModel;
import com.huawei.ui.commonui.linechart.utils.ResponseCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class ujh implements IChartStorageHelper {
    @Override // com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper
    public void queryStepDayData(Context context, long j, long j2, DataInfos dataInfos, HwHealthChartHolder.c cVar, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        a(j, j2, e(dataInfos), responseCallback);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    private void a(long j, long j2, int i, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        int i2;
        int i3;
        LogUtil.a("UIHLH_SleepModuleChartStorageHelper", "startTime: ", Long.valueOf(j), " endtime: ", Long.valueOf(j2), " dataType: ", Integer.valueOf(i));
        if (i == 1) {
            i3 = 4;
        } else {
            i2 = 3;
            if (i != 2) {
                if (i == 3) {
                    i3 = 5;
                } else {
                    i3 = 0;
                }
                if (i3 == 0) {
                    responseCallback.onResult(-1, null);
                    return;
                }
                HiAggregateOption hiAggregateOption = new HiAggregateOption();
                hiAggregateOption.setStartTime(j);
                hiAggregateOption.setEndTime(j2);
                hiAggregateOption.setAggregateType(i2);
                hiAggregateOption.setConstantsKey(new String[]{"core_sleep_deep_key", "core_sleep_light_key", "core_sleep_wake_dream_key", "core_sleep_wake_count_key", "core_sleep_score_key", "core_sleep_fall_key", "core_sleep_wake_up_key", "core_sleep_snore_freq_key", "core_sleep_deep_sleep_part_key", "core_sleep_total_sleep_time_key", "core_sleep_day_sleep_time_key", "sleep_deep_key", "sleep_light_key", "sleep_wake_key", "core_sleep_wake_key", "sleep_wake_count_key", "core_sleep_valid_data_key"});
                hiAggregateOption.setType(new int[]{44102, 44103, 44101, 44107, 44203, 44201, 44202, 44208, 44106, 44105, 44108, 44001, 44002, 44003, 44104, 44005, 44206});
                hiAggregateOption.setGroupUnitSize(1);
                hiAggregateOption.setGroupUnitType(i3);
                hiAggregateOption.setReadType(0);
                d(responseCallback, hiAggregateOption);
            }
            i3 = 3;
        }
        i2 = 1;
        if (i3 == 0) {
            responseCallback.onResult(-1, null);
            return;
        }
        HiAggregateOption hiAggregateOption2 = new HiAggregateOption();
        hiAggregateOption2.setStartTime(j);
        hiAggregateOption2.setEndTime(j2);
        hiAggregateOption2.setAggregateType(i2);
        hiAggregateOption2.setConstantsKey(new String[]{"core_sleep_deep_key", "core_sleep_light_key", "core_sleep_wake_dream_key", "core_sleep_wake_count_key", "core_sleep_score_key", "core_sleep_fall_key", "core_sleep_wake_up_key", "core_sleep_snore_freq_key", "core_sleep_deep_sleep_part_key", "core_sleep_total_sleep_time_key", "core_sleep_day_sleep_time_key", "sleep_deep_key", "sleep_light_key", "sleep_wake_key", "core_sleep_wake_key", "sleep_wake_count_key", "core_sleep_valid_data_key"});
        hiAggregateOption2.setType(new int[]{44102, 44103, 44101, 44107, 44203, 44201, 44202, 44208, 44106, 44105, 44108, 44001, 44002, 44003, 44104, 44005, 44206});
        hiAggregateOption2.setGroupUnitSize(1);
        hiAggregateOption2.setGroupUnitType(i3);
        hiAggregateOption2.setReadType(0);
        d(responseCallback, hiAggregateOption2);
    }

    private void d(ResponseCallback<Map<Long, IStorageModel>> responseCallback, HiAggregateOption hiAggregateOption) {
        HiHealthManager.d(BaseApplication.getContext()).aggregateHiHealthData(hiAggregateOption, new b(responseCallback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<HiHealthData> list, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        HashMap map = new HashMap(16);
        LogUtil.a("UIHLH_SleepModuleChartStorageHelper", "sumDataList.size = ", Integer.valueOf(list.size()));
        Iterator<HiHealthData> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            HiHealthData next = it.next();
            long startTime = next.getStartTime();
            int iRound = Math.round(next.getFloat("core_sleep_deep_key"));
            int iRound2 = Math.round(next.getFloat("core_sleep_light_key"));
            int iRound3 = Math.round(next.getFloat("core_sleep_wake_dream_key"));
            int iRound4 = Math.round(next.getFloat("core_sleep_wake_key"));
            int iRound5 = Math.round(next.getFloat("core_sleep_day_sleep_time_key"));
            umi umiVar = new umi();
            boolean z = iRound > 0 || iRound2 > 0 || iRound3 > 0;
            boolean z2 = iRound4 > 0 || iRound5 > 0;
            if (z || z2) {
                umiVar.b(iRound);
                umiVar.a(iRound2);
                umiVar.c(iRound3);
                umiVar.e(iRound4);
                umiVar.d(iRound5);
                umiVar.c(31);
                map.put(Long.valueOf(startTime), new uml(iRound + iRound2 + iRound3 + iRound4 + iRound5, umiVar));
            } else {
                int i = next.getInt("sleep_deep_key") / 60;
                int i2 = next.getInt("sleep_light_key") / 60;
                int i3 = next.getInt("sleep_wake_key") / 60;
                if (i > 0 || i2 > 0 || i3 > 0) {
                    umiVar.b(i);
                    umiVar.a(i2);
                    umiVar.e(i3);
                    umiVar.c(30);
                    map.put(Long.valueOf(startTime), new uml(i + i2 + i3, umiVar));
                }
            }
        }
        if (responseCallback != null) {
            if (map.size() > 0) {
                responseCallback.onResult(0, map);
            } else {
                responseCallback.onResult(-1, null);
            }
        }
    }

    private int e(DataInfos dataInfos) {
        if (!dataInfos.isCoreSleepData()) {
            return 40002;
        }
        if (dataInfos.isWeekData()) {
            return 1;
        }
        if (dataInfos.isMonthData()) {
            return 2;
        }
        if (dataInfos.isYearData()) {
            return 3;
        }
        LogUtil.a("UIHLH_SleepModuleChartStorageHelper", "Sleep type does not exist");
        return 40002;
    }

    static class b implements HiAggregateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ResponseCallback<Map<Long, IStorageModel>> f50231b;
        private WeakReference<ujh> d;

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
        }

        private b(ujh ujhVar, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
            this.d = new WeakReference<>(ujhVar);
            this.f50231b = responseCallback;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            ujh ujhVar = this.d.get();
            if (ujhVar == null) {
                LogUtil.j("UIHLH_SleepModuleChartStorageHelper", "DataReadListener storageHelper is null");
                return;
            }
            if (this.f50231b == null) {
                LogUtil.j("UIHLH_SleepModuleChartStorageHelper", "DataReadListener mCallback is null");
            } else if (!njy.e(list)) {
                ujhVar.b(new ArrayList(list), this.f50231b);
                this.f50231b = null;
            } else {
                this.f50231b.onResult(-1, null);
            }
        }
    }
}
