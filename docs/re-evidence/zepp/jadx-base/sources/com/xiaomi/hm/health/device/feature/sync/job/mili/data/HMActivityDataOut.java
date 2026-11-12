package com.xiaomi.hm.health.device.feature.sync.job.mili.data;

import com.huami.devicex.injection.keeper.DeviceTimeStoreApi;
import com.huami.devicex.manager.DataCacheApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityData;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityDataExtend;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityDataFragment;
import com.xiaomi.hm.health.dataprocess.DaySportData;
import com.xiaomi.hm.health.dataprocess.SportData;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.device.feature.sync.job.ConstKt;
import com.xiaomi.hm.health.starsky.api.gdsp.GdspStarSkyApiImpl;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class HMActivityDataOut {
    private final Lazy<DeviceManagerApi> deviceManagerApiLazy = KoinJavaComponent.inject(DeviceManagerApi.class);
    private final Lazy<DeviceTimeStoreApi> deviceTimeStoreApiLazy = KoinJavaComponent.inject(DeviceTimeStoreApi.class);
    private final Lazy<DataCacheApi> dataCacheApiLazy = KoinJavaComponent.inject(DataCacheApi.class);

    public int calculateMinuteOfDay(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeZone(calendar.getTimeZone());
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        return (int) ((calendar.getTimeInMillis() - calendar2.getTimeInMillis()) / ((long) 60000));
    }

    public void handleSyncedData(HMDeviceType hMDeviceType, HMDeviceSource hMDeviceSource, List<ActivityDataFragment> list) {
        SportData sportData;
        int i;
        int i2 = 0;
        String str = ConstKt.debugTag;
        HMLog.d(ConstKt.debugTag, "handleSyncedData", new Object[0]);
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        HashMap map = new HashMap();
        Iterator<ActivityDataFragment> it2 = list.iterator();
        Calendar calendar2 = null;
        while (it2.hasNext()) {
            ActivityDataFragment next = it2.next();
            List<T> list2 = next.data;
            Calendar calendar3 = next.timestamp;
            arrayList.add(new ActivityDataFragment(calendar3, list2));
            HMLog.i(str, "data size:" + list2.size() + ",data time:" + calendar3.getTime().toString() + ",phone time:" + calendar.getTime().toString() + ",isEnd:" + next.isEnd(), new Object[i2]);
            if (ConstKt.isInvalidTime(calendar3)) {
                HMLog.i(str, "the synced data Calendar is wrong", new Object[i2]);
            } else {
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    ActivityData activityData = (ActivityData) it3.next();
                    int i3 = calendar3.get(1);
                    int i4 = calendar3.get(2);
                    int i5 = calendar3.get(5);
                    int iCalculateMinuteOfDay = calculateMinuteOfDay(calendar3);
                    Calendar calendar4 = calendar;
                    SportDay sportDay = new SportDay(i3, i4, i5);
                    DaySportData daySportData = (DaySportData) map.get(sportDay.getKey());
                    if (daySportData == null) {
                        daySportData = new DaySportData(sportDay);
                        map.put(sportDay.getKey(), daySportData);
                    }
                    if (activityData instanceof ActivityDataExtend) {
                        daySportData.set8Byte(true);
                        ActivityDataExtend activityDataExtend = (ActivityDataExtend) activityData;
                        sportData = new SportData(iCalculateMinuteOfDay, activityData.category & 255, activityData.intensity & 255, activityData.steps & 255, activityData.hr & 255, activityDataExtend.getRetain() & 255, activityDataExtend.getSleepProbabilityAndPosture() & 255, activityDataExtend.getSleepProbabilityDeep() & 255, activityDataExtend.getSleepProbabilityRem() & 255);
                    } else {
                        sportData = new SportData(iCalculateMinuteOfDay, activityData.category & 255, activityData.intensity & 255, activityData.steps & 255, activityData.hr & 255);
                    }
                    if (hMDeviceSource == HMDeviceSource.SENSORHUB) {
                        i = 1;
                        daySportData.add(sportData, true);
                    } else {
                        i = 1;
                        daySportData.add(sportData);
                    }
                    calendar3.add(12, i);
                    calendar = calendar4;
                    it2 = it2;
                    it3 = it3;
                    str = str;
                    calendar2 = calendar2;
                    arrayList = arrayList;
                }
                ArrayList arrayList2 = arrayList;
                String str2 = str;
                Calendar calendar5 = calendar;
                Iterator<ActivityDataFragment> it4 = it2;
                calendar2 = next.isEnd() ? next.timestamp : calendar2;
                calendar = calendar5;
                it2 = it4;
                str = str2;
                arrayList = arrayList2;
                i2 = 0;
            }
        }
        ArrayList arrayList3 = arrayList;
        String str3 = str;
        Calendar calendar6 = calendar2;
        if (hMDeviceType == HMDeviceType.EARBUD || hMDeviceType == HMDeviceType.HEADSET) {
            this.dataCacheApiLazy.getValue().analysisNewDsdFromEarbud(new ArrayList(map.values()), hMDeviceType.getValue(), hMDeviceSource, this.deviceManagerApiLazy.getValue().getBoundDeviceId(hMDeviceType));
        } else {
            this.dataCacheApiLazy.getValue().analysisNewDSDFromBand(new ArrayList(map.values()), hMDeviceType.getValue(), hMDeviceSource, this.deviceManagerApiLazy.getValue().getBoundDeviceId(hMDeviceType));
            GdspStarSkyApiImpl.INSTANCE.getInstance().onActivityData(arrayList3);
        }
        if (calendar6 != null) {
            this.deviceTimeStoreApiLazy.getValue().setBoundDeviceSyncTime(hMDeviceType, calendar6);
        } else {
            HMLog.i(str3, "end time is null!!!", new Object[0]);
        }
    }
}
