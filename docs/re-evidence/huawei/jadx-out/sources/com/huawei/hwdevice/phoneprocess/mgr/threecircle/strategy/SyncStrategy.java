package com.huawei.hwdevice.phoneprocess.mgr.threecircle.strategy;

import android.content.ContentValues;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import defpackage.eeh;
import defpackage.ndu;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public interface SyncStrategy {
    public static final long FETCH_WAIT_MAX_TIME = 5000;
    public static final String KEY_CLOUD_LAST_SYNC_TIME = "KEY_CLOUD_LAST_SYNC_TIME";
    public static final String KEY_INSERT_LAST_SYNC_TIME = "KEY_INSERT_LAST_SYNC_TIME";
    public static final int PARSE_RADIX_10 = 10;
    public static final String SP_KEY_RECONNECT_LAST_SYNC_TIME = "SP_KEY_RECONNECT_LAST_SYNC_TIME";
    public static final String SRC_PKG_NAME = "hw.sport.config";
    public static final long SYNC_INTERVAL_30_MINUTE = 1800000;
    public static final long SYNC_INTERVAL_FOREGROUND = 1000;
    public static final long SYNC_INTERVAL_ONE_MINUTE = 60000;
    public static final long SYNC_INTERVAL_SCREEN_OFF = 180000;
    public static final String WEAR_PKG_NAME = "in.huawei.motion";

    List<HiHealthData> fetchData(List<HiAggregateOption> list);

    boolean isNeedSync(DeviceInfo deviceInfo, long j);

    List<eeh> preProcess(List<HiHealthData> list);

    void syncDataToDevice(DeviceInfo deviceInfo, List<eeh> list);

    default List<HiHealthData> transAggregateToRead(HiHealthData hiHealthData) {
        int iB;
        long j;
        ArrayList arrayList = new ArrayList();
        long startTime = hiHealthData.getStartTime();
        ContentValues valueHolder = hiHealthData.getValueHolder();
        Iterator<Map.Entry<String, Object>> it = valueHolder.valueSet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            Double asDouble = valueHolder.getAsDouble(key);
            if (asDouble != null) {
                if (key.startsWith("WriteBackKey_HALFHOUR_")) {
                    iB = CommonUtil.b(key.replace("WriteBackKey_HALFHOUR_", ""), 10);
                    j = 1800000;
                } else if (key.startsWith("WriteBackKey_HOUR_")) {
                    iB = CommonUtil.b(key.replace("WriteBackKey_HOUR_", ""), 10);
                    j = 3600000;
                } else if (key.startsWith("WriteBackKey_DAY_")) {
                    iB = CommonUtil.b(key.replace("WriteBackKey_DAY_", ""), 10);
                    j = 86400000;
                }
                if (iB != -1) {
                    HiHealthData hiHealthData2 = new HiHealthData();
                    hiHealthData2.setTimeInterval(ndu.a(startTime, j), ndu.e(startTime, j));
                    hiHealthData2.setValue(asDouble.doubleValue());
                    if (!isNeedHandleHour(iB, j, hiHealthData2, arrayList) && (iB != 40008 || j != 3600000)) {
                        hiHealthData2.setType(ndu.b(iB, j));
                        arrayList.add(hiHealthData2);
                    }
                }
            }
        }
        return arrayList;
    }

    static boolean isNeedHandleHour(int i, long j, HiHealthData hiHealthData, List<HiHealthData> list) {
        if (i != DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE.value() || j != 3600000) {
            return false;
        }
        hiHealthData.setType(ndu.b(DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE.value(), 1800000L));
        HiHealthData hiHealthDataCopyData = hiHealthData.copyData();
        long startTime = hiHealthData.getStartTime() + 1800000;
        hiHealthData.setEndTime(startTime);
        list.add(hiHealthData);
        hiHealthDataCopyData.setStartTime(startTime);
        list.add(hiHealthDataCopyData);
        return true;
    }
}
