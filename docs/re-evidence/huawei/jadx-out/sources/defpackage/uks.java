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
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class uks implements IChartStorageHelper {
    @Override // com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper
    public void queryStepDayData(Context context, long j, long j2, DataInfos dataInfos, HwHealthChartHolder.c cVar, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        int i;
        if (!dataInfos.isBloodOxygenData()) {
            i = 40002;
        } else if (dataInfos.isWeekData()) {
            i = 1;
        } else if (dataInfos.isMonthData()) {
            i = 2;
        } else if (dataInfos.isYearData()) {
            i = 3;
        } else {
            LogUtil.j("R_BloodOxygen_UIHLH_BloodOxygenModuleChartStorageHelper", "BloodOxygen type does not exist");
            i = 40002;
        }
        d(j, j2, i, responseCallback);
    }

    private void d(long j, long j2, int i, ResponseCallback responseCallback) {
        if (i != 1 && i != 2 && i != 3) {
            if (responseCallback != null) {
                responseCallback.onResult(-1, null);
                return;
            }
            return;
        }
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(j);
        hiAggregateOption.setEndTime(j2);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setConstantsKey(new String[]{"data_max_oxygen_saturation_key", "data_min_oxygen_saturation_key"});
        hiAggregateOption.setType(new int[]{47201, 47202});
        hiAggregateOption.setGroupUnitSize(1);
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setReadType(0);
        a(responseCallback, hiAggregateOption, i);
    }

    private void a(ResponseCallback<Map<Long, IStorageModel>> responseCallback, HiAggregateOption hiAggregateOption, int i) {
        HiHealthManager.d(BaseApplication.getContext()).aggregateHiHealthData(hiAggregateOption, new b(i, responseCallback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<HiHealthData> list, int i, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        HashMap map = new HashMap(16);
        LogUtil.a("UIHLH_BloodOxygenModuleChartStorageHelper", "sumDataList.size = ", Integer.valueOf(list.size()));
        ArrayList arrayList = new ArrayList(16);
        int i2 = 0;
        long j = 0;
        while (i2 < list.size()) {
            HiHealthData hiHealthData = list.get(i2);
            int i3 = hiHealthData.getInt("data_max_oxygen_saturation_key");
            int i4 = hiHealthData.getInt("data_min_oxygen_saturation_key");
            if (i3 > 100 || i4 <= 0) {
                LogUtil.j("UIHLH_BloodOxygenModuleChartStorageHelper", "max > 100 or min <0");
            } else {
                fqq fqqVar = new fqq();
                long startTime = hiHealthData.getStartTime();
                if (i == 3) {
                    if (d(j, startTime) || j == 0) {
                        arrayList.add(Integer.valueOf(i3));
                        arrayList.add(Integer.valueOf(i4));
                    } else {
                        Collections.sort(arrayList);
                        fqqVar.d(((Integer) arrayList.get(0)).intValue());
                        fqqVar.b(((Integer) arrayList.get(arrayList.size() - 1)).intValue());
                        arrayList.clear();
                        arrayList.add(Integer.valueOf(i3));
                        arrayList.add(Integer.valueOf(i4));
                    }
                    j = startTime;
                } else {
                    fqqVar.d(i4);
                    fqqVar.b(i3);
                    startTime = j;
                    j = startTime;
                }
                map.put(Long.valueOf(j), new fqm(40.0f, fqqVar));
                j = startTime;
            }
            i2++;
        }
        if (i == 3 && i2 > 0 && i2 == list.size()) {
            fqq fqqVar2 = new fqq();
            Collections.sort(arrayList);
            fqqVar2.d(((Integer) arrayList.get(0)).intValue());
            fqqVar2.b(((Integer) arrayList.get(arrayList.size() - 1)).intValue());
            map.put(Long.valueOf(j), new fqm(40.0f, fqqVar2));
        }
        d(responseCallback, map);
    }

    private void d(ResponseCallback<Map<Long, IStorageModel>> responseCallback, Map<Long, IStorageModel> map) {
        if (responseCallback != null) {
            if (map.size() > 0) {
                responseCallback.onResult(0, map);
            } else {
                responseCallback.onResult(-1, null);
            }
        }
    }

    private boolean d(long j, long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j2);
        return calendar.get(2) == calendar2.get(2);
    }

    static class b implements HiAggregateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ResponseCallback<Map<Long, IStorageModel>> f50299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<uks> f50300b;
        private int d;

        private b(uks uksVar, int i, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
            this.f50300b = new WeakReference<>(uksVar);
            this.d = i;
            this.f50299a = responseCallback;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            if (this.f50299a == null) {
                return;
            }
            if (njy.e(list)) {
                LogUtil.j("UIHLH_BloodOxygenModuleChartStorageHelper", "oxygen data is null!");
                this.f50299a.onResult(-1, null);
                return;
            }
            uks uksVar = this.f50300b.get();
            if (uksVar != null) {
                uksVar.b(new ArrayList(list), this.d, this.f50299a);
                this.f50299a = null;
            } else {
                LogUtil.j("UIHLH_BloodOxygenModuleChartStorageHelper", "DataReadListener storageHelper is null");
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            LogUtil.d("UIHLH_BloodOxygenModuleChartStorageHelper", "DataReadListener onResultIntent errorCode = ", Integer.valueOf(i2));
        }
    }
}
