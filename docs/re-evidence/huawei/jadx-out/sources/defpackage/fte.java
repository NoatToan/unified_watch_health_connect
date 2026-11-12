package defpackage;

import android.content.Context;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
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

/* JADX INFO: loaded from: classes29.dex */
public class fte implements IChartStorageHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f34541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HwHealthChartHolder.c f34542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ResponseCallback<Map<Long, IStorageModel>> f34543c;
    private Context d;
    private long e;
    private DataInfos i;

    public fte() {
        ObserverManagerUtil.d(new Observer() { // from class: fte.1
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                if (fte.this.f34543c == null) {
                    return;
                }
                fte fteVar = fte.this;
                int iD = fteVar.d(fteVar.i);
                fte fteVar2 = fte.this;
                fteVar2.d(fteVar2.f34541a, fte.this.e, iD, fte.this.f34543c);
            }
        }, "FINISH_SLEEP_TAG");
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper
    public void queryStepDayData(Context context, long j, long j2, DataInfos dataInfos, HwHealthChartHolder.c cVar, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        this.d = context;
        this.f34541a = j;
        this.e = j2;
        this.i = dataInfos;
        this.f34542b = cVar;
        this.f34543c = responseCallback;
        d(j, j2, d(dataInfos), responseCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    public void d(long j, long j2, int i, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
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
                hiAggregateOption.setConstantsKey(new String[]{"core_sleep_deep_key", "core_sleep_light_key", "core_sleep_wake_dream_key", "core_sleep_wake_count_key", "core_sleep_score_key", "core_sleep_fall_key", "core_sleep_wake_up_key", "core_sleep_snore_freq_key", "core_sleep_deep_sleep_part_key", "core_sleep_total_sleep_time_key", "core_sleep_day_sleep_time_key", "sleep_deep_key", "sleep_light_key", "sleep_wake_key", "core_sleep_wake_key", "sleep_wake_count_key", "core_sleep_valid_data_key", "data_session_manual_sleep_bed_time_key", "sleep_version", "core_sleep_rem_key_aasm", "core_sleep_deep_key_aasm", "core_sleep_shallow_key_aasm"});
                hiAggregateOption.setType(new int[]{44102, 44103, 44101, 44107, 44203, 44201, 44202, 44208, 44106, 44105, 44108, 44001, 44002, 44003, 44104, 44005, 44206, 44109, 44235, 44111, 44112, 44113});
                hiAggregateOption.setGroupUnitSize(1);
                hiAggregateOption.setGroupUnitType(i3);
                hiAggregateOption.setReadType(0);
                d(responseCallback, hiAggregateOption, i);
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
        hiAggregateOption2.setConstantsKey(new String[]{"core_sleep_deep_key", "core_sleep_light_key", "core_sleep_wake_dream_key", "core_sleep_wake_count_key", "core_sleep_score_key", "core_sleep_fall_key", "core_sleep_wake_up_key", "core_sleep_snore_freq_key", "core_sleep_deep_sleep_part_key", "core_sleep_total_sleep_time_key", "core_sleep_day_sleep_time_key", "sleep_deep_key", "sleep_light_key", "sleep_wake_key", "core_sleep_wake_key", "sleep_wake_count_key", "core_sleep_valid_data_key", "data_session_manual_sleep_bed_time_key", "sleep_version", "core_sleep_rem_key_aasm", "core_sleep_deep_key_aasm", "core_sleep_shallow_key_aasm"});
        hiAggregateOption2.setType(new int[]{44102, 44103, 44101, 44107, 44203, 44201, 44202, 44208, 44106, 44105, 44108, 44001, 44002, 44003, 44104, 44005, 44206, 44109, 44235, 44111, 44112, 44113});
        hiAggregateOption2.setGroupUnitSize(1);
        hiAggregateOption2.setGroupUnitType(i3);
        hiAggregateOption2.setReadType(0);
        d(responseCallback, hiAggregateOption2, i);
    }

    private void d(ResponseCallback<Map<Long, IStorageModel>> responseCallback, HiAggregateOption hiAggregateOption, int i) {
        HiHealthManager.d(BaseApplication.getContext()).aggregateHiHealthData(hiAggregateOption, new b(responseCallback, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<HiHealthData> list, ResponseCallback<Map<Long, IStorageModel>> responseCallback, int i) {
        int i2;
        boolean z;
        HashMap map = new HashMap(16);
        LogUtil.a("UIHLH_SleepModuleChartStorageHelper", "sumDataList.size = ", Integer.valueOf(list.size()));
        Iterator<HiHealthData> it = list.iterator();
        while (it.hasNext()) {
            HiHealthData next = it.next();
            long startTime = next.getStartTime();
            int iRound = Math.round(next.getFloat("core_sleep_deep_key"));
            int iRound2 = Math.round(next.getFloat("core_sleep_light_key"));
            int iRound3 = Math.round(next.getFloat("core_sleep_wake_dream_key"));
            int iRound4 = Math.round(next.getFloat("core_sleep_deep_key_aasm"));
            int iRound5 = Math.round(next.getFloat("core_sleep_shallow_key_aasm"));
            int iRound6 = Math.round(next.getFloat("core_sleep_rem_key_aasm"));
            int iRound7 = Math.round(next.getFloat("core_sleep_wake_key"));
            int iRound8 = Math.round(next.getFloat("core_sleep_day_sleep_time_key"));
            int iRound9 = Math.round(next.getFloat("core_sleep_total_sleep_time_key"));
            int iRound10 = Math.round(next.getFloat("data_session_manual_sleep_bed_time_key"));
            Iterator<HiHealthData> it2 = it;
            int i3 = next.getInt("sleep_version");
            boolean z2 = i3 == 5;
            fri friVar = new fri();
            if (z2) {
                friVar.a(i3);
                i2 = iRound4;
                iRound3 = iRound6;
            } else {
                iRound5 = iRound2;
            }
            if (i2 > 0 || iRound5 > 0 || iRound3 > 0) {
                i2 = iRound;
                z = true;
            } else {
                z = false;
            }
            boolean z3 = iRound8 > 0;
            boolean z4 = iRound10 > 0;
            int i4 = next.getInt("sleep_deep_key") / 60;
            int i5 = next.getInt("sleep_light_key") / 60;
            boolean z5 = z3;
            int i6 = next.getInt("sleep_wake_key") / 60;
            if (z) {
                friVar.a(i2);
                friVar.d(iRound5);
                friVar.e(iRound3);
                friVar.g(iRound7);
                friVar.c(iRound8);
                if (i == 3) {
                    friVar.b(iRound10);
                }
                friVar.b(31);
                int i7 = i2 + iRound5 + iRound3 + iRound7;
                float f = iRound8 + i7;
                if (i7 == 0 && iRound10 != 0) {
                    f = iRound10;
                }
                friVar.h(iRound9);
                map.put(Long.valueOf(startTime), new ftd(f, friVar));
            } else if (i4 > 0 || i5 > 0 || i6 > 0) {
                friVar.a(i4);
                friVar.d(i5);
                friVar.g(i6);
                friVar.b(30);
                map.put(Long.valueOf(startTime), new ftd(i4 + i5 + i6, friVar));
            } else if (z4) {
                friVar.a(i2);
                friVar.d(iRound5);
                friVar.e(iRound3);
                friVar.g(iRound7);
                friVar.c(iRound8);
                float f2 = iRound10;
                friVar.b(f2);
                friVar.b(31);
                int i8 = i2 + iRound5 + iRound3 + iRound7;
                float f3 = iRound8 + i8;
                if (i8 != 0 || iRound10 == 0) {
                    f2 = f3;
                }
                friVar.h(iRound9);
                map.put(Long.valueOf(startTime), new ftd(f2, friVar));
            } else if (z5) {
                float f4 = iRound8;
                friVar.c(f4);
                friVar.b(31);
                friVar.h(f4);
                map.put(Long.valueOf(startTime), new ftd(f4, friVar));
            }
            it = it2;
        }
        if (responseCallback != 0) {
            if (map.size() > 0) {
                responseCallback.onResult(0, map);
            } else {
                responseCallback.onResult(-1, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d(DataInfos dataInfos) {
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
        private ResponseCallback<Map<Long, IStorageModel>> f34545b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<fte> f34546c;
        private int e;

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
        }

        private b(fte fteVar, ResponseCallback<Map<Long, IStorageModel>> responseCallback, int i) {
            this.f34546c = new WeakReference<>(fteVar);
            this.f34545b = responseCallback;
            this.e = i;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            fte fteVar = this.f34546c.get();
            if (fteVar == null) {
                LogUtil.j("UIHLH_SleepModuleChartStorageHelper", "DataReadListener storageHelper is null");
                return;
            }
            if (this.f34545b == null) {
                LogUtil.j("UIHLH_SleepModuleChartStorageHelper", "DataReadListener mCallback is null");
            } else if (!njy.e(list)) {
                fteVar.a(new ArrayList(list), this.f34545b, this.e);
                this.f34545b = null;
            } else {
                this.f34545b.onResult(-1, null);
            }
        }
    }
}
