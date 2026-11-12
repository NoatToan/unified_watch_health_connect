package com.xiaomi.hm.health.device.callback;

import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.keeper.DeviceTimeStoreApi;
import com.huami.devicex.manager.DataCacheApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.mifit.analytics.Analytics;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.error.HMDeviceSyncDataError;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityDataFragment;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityRunningData;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.dataprocess.DaySportData;
import com.xiaomi.hm.health.dataprocess.ShoesDaySportData;
import com.xiaomi.hm.health.dataprocess.ShoesSportData;
import com.xiaomi.hm.health.dataprocess.SportData;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.device.event.HMDeviceSyncDataEvent;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.feature.sync.job.mili.data.HMActivityDataOut;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class MyActivityDataSyncCallback implements IHMActivityDataCallback {
    private HMDeviceType b;
    private HMDeviceSource c;
    private final String a = "MyActivityDataSyncCallback";
    private int d = -1;
    private final Lazy<DeviceManagerApi> e = KoinJavaComponent.inject(DeviceManagerApi.class);
    private final Lazy<DataCacheApi> f = KoinJavaComponent.inject(DataCacheApi.class);
    private final Lazy<DeviceTimeStoreApi> g = KoinJavaComponent.inject(DeviceTimeStoreApi.class);

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            a = iArr;
            try {
                iArr[HMDeviceSource.MILI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[HMDeviceSource.MILI_1A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[HMDeviceSource.MILI_1S.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[HMDeviceSource.MILI_PRO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[HMDeviceSource.MILI_TEMPO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[HMDeviceSource.MILI_PEYTO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public MyActivityDataSyncCallback(DeviceManagerApi deviceManagerApi, HMDeviceSource hMDeviceSource) {
        this.b = HMDeviceType.MILI;
        this.c = HMDeviceSource.MILI;
        this.c = hMDeviceSource;
        this.b = hMDeviceSource.getType();
    }

    private void a(HMDeviceSyncDataError hMDeviceSyncDataError) {
        String strB = b();
        if (hMDeviceSyncDataError.isLosePackageHappened()) {
            Analytics.event(DeviceXFunctionsKt.getContext(), StatEvent.SYNC_HEALTH_DATA_LOSE_PACKAGE, strB);
        }
        Analytics.event(DeviceXFunctionsKt.getContext(), StatEvent.SYNC_HEALTH_DATA_COUNTS, strB);
    }

    private String b() {
        switch (a.a[this.c.ordinal()]) {
            case 1:
                return StatEvent.DEVICE_MILI;
            case 2:
                return StatEvent.DEVICE_MILI_1A;
            case 3:
                return StatEvent.DEVICE_MILI_1S;
            case 4:
                return StatEvent.DEVICE_MILI_PRO;
            case 5:
                return StatEvent.DEVICE_MILI_TMEPO;
            case 6:
                return StatEvent.DEVICE_MILI_CHAOHU;
            default:
                return this.c.name();
        }
    }

    private void c(List<ActivityDataFragment> list) {
        new HMActivityDataOut().handleSyncedData(this.b, this.c, list);
    }

    private boolean d(Calendar calendar) {
        return calendar.get(1) <= 1975;
    }

    public void handleSyncedDataForMars(List<ActivityDataFragment> list) {
        HMLog.d("MyActivityDataSyncCallback", "handleSyncedDataForMars", new Object[0]);
        ArrayList arrayList = new ArrayList();
        for (ActivityDataFragment activityDataFragment : list) {
            List<T> list2 = activityDataFragment.data;
            Calendar calendar = activityDataFragment.timestamp;
            ArrayList arrayList2 = new ArrayList();
            for (T t : list2) {
                ActivityRunningData activityRunningData = new ActivityRunningData((byte) t.intensity, (byte) t.steps, (byte) t.category);
                HMLog.d("MyActivityDataSyncCallback", "ActivityData:" + t, new Object[0]);
                HMLog.d("MyActivityDataSyncCallback", "ActivityRunningData:" + activityRunningData, new Object[0]);
                arrayList2.add(activityRunningData);
            }
            if (!activityDataFragment.isEnd()) {
                activityDataFragment = new ActivityDataFragment(calendar, arrayList2);
            }
            arrayList.add(activityDataFragment);
        }
        handleSyncedDataForShoes(arrayList);
    }

    public void handleSyncedDataForShoes(List<ActivityDataFragment> list) {
        int i = 0;
        HMLog.d("MyActivityDataSyncCallback", "handleSyncedDataForShoes", new Object[0]);
        Calendar calendar = Calendar.getInstance();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        for (ActivityDataFragment activityDataFragment : list) {
            List<T> list2 = activityDataFragment.data;
            Calendar calendar2 = activityDataFragment.timestamp;
            HMLog.i("MyActivityDataSyncCallback", "data size:" + list2.size() + ",data time:" + calendar2.getTime().toString() + ",phone time:" + calendar.getTime().toString() + ",isEnd:" + activityDataFragment.isEnd(), new Object[i]);
            if (d(calendar2)) {
                HMLog.i("MyActivityDataSyncCallback", "the synced data Calendar is wrong", new Object[i]);
            } else {
                for (T t : list2) {
                    HMLog.d("MyActivityDataSyncCallback", "ActivityRunningData:" + t, new Object[i]);
                    int i2 = calendar2.get(1);
                    int i3 = calendar2.get(2);
                    int i4 = calendar2.get(5);
                    int i5 = (calendar2.get(11) * 60) + calendar2.get(12);
                    SportDay sportDay = new SportDay(i2, i3, i4);
                    byte[] bytes = t.toBytes();
                    if ((bytes[i] & 255) == 255 && (bytes[1] & 255) == 255 && (bytes[2] & 255) == 255) {
                        HMLog.i("MyActivityDataSyncCallback", "ignore invalid data : " + GattUtils.bytesToHexString(bytes), new Object[i]);
                        calendar2.add(12, 1);
                    } else {
                        ShoesDaySportData shoesDaySportData = (ShoesDaySportData) map2.get(sportDay.getKey());
                        if (shoesDaySportData == null) {
                            shoesDaySportData = new ShoesDaySportData(sportDay);
                            map2.put(sportDay.getKey(), shoesDaySportData);
                        }
                        shoesDaySportData.setMinuteData(i5, new ShoesSportData(bytes[i], bytes[1], bytes[2]));
                        DaySportData daySportData = (DaySportData) map.get(sportDay.getKey());
                        if (daySportData == null) {
                            daySportData = new DaySportData(sportDay);
                            map.put(sportDay.getKey(), daySportData);
                        }
                        float percent = t.getPercent() * 100.0f;
                        int time = t.getTime() / 10;
                        boolean z = percent > 50.0f;
                        daySportData.add(new SportData(i5, (z ? (time | 0) << 4 : 0) | (z ? 2 : 1), z ? 180 : 100, t.getTotalSteps()), true);
                        calendar2.add(12, 1);
                        i = 0;
                    }
                }
            }
        }
        if (this.e.getValue().getMajorDeviceType() == this.b) {
            this.f.getValue().analysisNewDSDFromBand(new ArrayList(map.values()), this.b.getValue(), this.c, this.e.getValue().getBoundDeviceId(this.b));
        }
        this.f.getValue().analysisNewDSDFromShoes(new ArrayList(map2.values()));
        this.g.getValue().setBoundDeviceSyncTime(this.b, Calendar.getInstance());
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback
    public void onSyncFinish(HMDeviceSyncDataError hMDeviceSyncDataError) {
        HMDeviceSyncDataEvent hMDeviceSyncDataEvent = new HMDeviceSyncDataEvent(this.b, 2, new Progress(100, 100));
        hMDeviceSyncDataEvent.setError(hMDeviceSyncDataError.getError());
        EventBus.getDefault().post(hMDeviceSyncDataEvent);
        a(hMDeviceSyncDataError);
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback
    public void onSyncProgress(Progress progress) {
        int percent = progress.getPercent();
        if (percent != this.d) {
            this.d = percent;
            EventBus.getDefault().post(new HMDeviceSyncDataEvent(this.b, 1, progress));
        }
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback
    public void onSyncStart() {
        EventBus.getDefault().post(new HMDeviceSyncDataEvent(this.b, 0, new Progress()));
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback
    public void onSyncStop(List<ActivityDataFragment> list) {
        if (list == null) {
            if (this.b == HMDeviceType.SHOES) {
                this.g.getValue().setBoundDeviceSyncTime(this.b, Calendar.getInstance());
            }
        } else if (this.c == HMDeviceSource.SHOES_MARS) {
            handleSyncedDataForMars(list);
        } else if (this.b == HMDeviceType.SHOES) {
            handleSyncedDataForShoes(list);
        } else {
            c(list);
        }
    }
}
