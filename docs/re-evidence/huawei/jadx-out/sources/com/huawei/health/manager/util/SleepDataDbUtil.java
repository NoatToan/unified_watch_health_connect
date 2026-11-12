package com.huawei.health.manager.util;

import android.content.Context;
import androidx.media3.common.C;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.njy;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class SleepDataDbUtil {
    private static final Object d = new Object();

    private SleepDataDbUtil() {
    }

    public static void b(Context context, Map<String, Object> map) {
        synchronized (SleepDataDbUtil.class) {
            HiAggregateOption hiAggregateOption = new HiAggregateOption();
            int iA = DateFormatUtil.a(System.currentTimeMillis());
            hiAggregateOption.setTimeInterval(String.valueOf(iA), String.valueOf(iA), HiDataReadOption.TimeFormatType.DATE_FORMAT_YYYY_MM_DD);
            hiAggregateOption.setType(new int[]{44006, 44007, 44004, 44001, 44002, 44003, 44005, 44201, 44202, 44105, 44102, 44103, 44104, 44107});
            hiAggregateOption.setConstantsKey(new String[]{"sleep_start_time", "sleep_end_time", "sleep_duration_sum", "sleep_deep_duration", "sleep_shallow_duration", "sleep_wake_duration", "sleep_wake_count", "sleep_start_time_core", "sleep_end_time_core", "sleep_duration_sum_core", "sleep_deep_duration_core", "sleep_shallow_duration_core", "sleep_wake_duration_core", "sleep_wake_count_core"});
            LogUtil.d("Step_SleepDataDbUtil", "getSleepDataDetail...");
            hiAggregateOption.setAggregateType(1);
            hiAggregateOption.setGroupUnitType(3);
            if (context == null) {
                LogUtil.a("Step_SleepDataDbUtil", "getSleepDataDetail mContext is null");
                return;
            }
            if (map == null) {
                LogUtil.a("Step_SleepDataDbUtil", "getSleepDataDetail sleepDataMap is null");
                return;
            }
            HiHealthNativeApi.a(context).aggregateHiHealthData(hiAggregateOption, new ReadSleepStaticDealCallback(map));
            Object obj = d;
            synchronized (obj) {
                try {
                    obj.wait(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
                } catch (InterruptedException e) {
                    LogUtil.a("Step_SleepDataDbUtil", "getSleepDataDetail InterruptedException", e.getMessage());
                }
            }
        }
    }

    static class ReadSleepStaticDealCallback implements HiAggregateListener {
        private Map<String, Object> e;

        protected ReadSleepStaticDealCallback(Map<String, Object> map) {
            this.e = map;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            if (njy.e(list)) {
                LogUtil.a("Step_SleepDataDbUtil", "ReadSleepStaticDealCallback onResult data is null");
                synchronized (SleepDataDbUtil.d) {
                    SleepDataDbUtil.d.notifyAll();
                }
                return;
            }
            try {
                a(list.get(0));
                synchronized (SleepDataDbUtil.d) {
                    SleepDataDbUtil.d.notifyAll();
                }
            } catch (NumberFormatException unused) {
                LogUtil.j("Step_SleepDataDbUtil", "ReadSleepStaticDealCallback NumberFormatException");
            }
        }

        private void a(HiHealthData hiHealthData) {
            long j;
            long j2;
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            String str;
            if (hiHealthData == null) {
                LogUtil.j("Step_SleepDataDbUtil", "putHiHealthData data is null.");
                return;
            }
            long j3 = hiHealthData.getLong("sleep_start_time_core");
            long j4 = hiHealthData.getLong("sleep_end_time_core");
            int i6 = hiHealthData.getInt("sleep_duration_sum_core");
            int i7 = hiHealthData.getInt("sleep_deep_duration_core");
            int i8 = hiHealthData.getInt("sleep_shallow_duration_core");
            int i9 = hiHealthData.getInt("sleep_wake_duration_core");
            int i10 = hiHealthData.getInt("sleep_wake_count_core");
            if (i6 <= 0) {
                LogUtil.j("Step_SleepDataDbUtil", "core sleep data validate false! ");
                j = hiHealthData.getLong("sleep_start_time");
                j2 = hiHealthData.getLong("sleep_end_time");
                i = hiHealthData.getInt("sleep_duration_sum") / 60;
                i2 = hiHealthData.getInt("sleep_deep_duration") / 60;
                i3 = hiHealthData.getInt("sleep_shallow_duration") / 60;
                i4 = hiHealthData.getInt("sleep_wake_duration") / 60;
                i5 = hiHealthData.getInt("sleep_wake_count");
                str = "";
            } else {
                str = "_core";
                i = i6;
                j = j3;
                i3 = i8;
                i4 = i9;
                i2 = i7;
                j2 = j4;
                i5 = i10;
            }
            LogUtil.a("Step_SleepDataDbUtil", "sleep data from suffix:", str);
            this.e.put("sleep_start_time", DateFormatUtil.e(j, DateFormatUtil.DateFormatType.DATE_FORMAT_8));
            this.e.put("sleep_end_time", DateFormatUtil.e(j2, DateFormatUtil.DateFormatType.DATE_FORMAT_8));
            this.e.put("sleep_duration_sum", Integer.valueOf(i));
            this.e.put("sleep_deep_duration", Integer.valueOf(i2));
            this.e.put("sleep_shallow_duration", Integer.valueOf(i3));
            this.e.put("sleep_wake_duration", Integer.valueOf(i4));
            this.e.put("sleep_wake_count", Integer.valueOf(i5));
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            LogUtil.a("Step_SleepDataDbUtil", "ReadSleepStaticDealCallback onResultIntent ", Integer.valueOf(i), list != null ? Integer.valueOf(list.size()) : "dataList is null.", Integer.valueOf(i2), Integer.valueOf(i3));
            synchronized (SleepDataDbUtil.d) {
                SleepDataDbUtil.d.notifyAll();
            }
        }
    }
}
