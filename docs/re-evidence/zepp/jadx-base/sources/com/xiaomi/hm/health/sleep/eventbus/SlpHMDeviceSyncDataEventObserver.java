package com.xiaomi.hm.health.sleep.eventbus;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.event.HMDeviceSyncDataEvent;
import com.xiaomi.hm.health.play.card.InvalidateLiveData;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u0016\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0016\u0010\f\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0016\u0010\r\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0016\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/sleep/eventbus/SlpHMDeviceSyncDataEventObserver;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "", "isToday", "Landroidx/lifecycle/MutableLiveData;", "", "getSyncStatus", "SYNC_FINISH", "Ljava/lang/String;", "SYNC_NOT", "SYNCING", "SYNC_FAILED", "NO_SYNC", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SlpHMDeviceSyncDataEventObserver {

    @NotNull
    public static final SlpHMDeviceSyncDataEventObserver INSTANCE = new SlpHMDeviceSyncDataEventObserver();

    @NotNull
    public static final String NO_SYNC = "no_sync";

    @NotNull
    public static final String SYNCING = "syncing";

    @NotNull
    public static final String SYNC_FAILED = "sync_failed";

    @NotNull
    public static final String SYNC_FINISH = "sync_finish";

    @NotNull
    public static final String SYNC_NOT = "not_sync";

    private SlpHMDeviceSyncDataEventObserver() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isToday(HMDeviceType type) {
        Calendar boundDeviceSyncTime = HMDeviceManager.getInstance().getBoundDeviceSyncTime(type);
        return TimeUtils.isToday(boundDeviceSyncTime) || boundDeviceSyncTime.getTime().getTime() > SportDay.getToday().getCalendar().getTime().getTime();
    }

    @NotNull
    public final MutableLiveData<String> getSyncStatus() {
        final MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        Transformations.map(InvalidateLiveData.INSTANCE.listen(SleepDataNotifiers.INSTANCE.getHMDeviceSyncDataEvent()), new Function<HMDeviceSyncDataEvent, Unit>() { // from class: com.xiaomi.hm.health.sleep.eventbus.SlpHMDeviceSyncDataEventObserver$getSyncStatus$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final Unit apply(HMDeviceSyncDataEvent hMDeviceSyncDataEvent) {
                HMDeviceSyncDataEvent hMDeviceSyncDataEvent2 = hMDeviceSyncDataEvent;
                if (hMDeviceSyncDataEvent2 != null) {
                    HMDeviceType deviceType = hMDeviceSyncDataEvent2.getDeviceType();
                    HMDeviceType hMDeviceType = HMDeviceType.MILI;
                    if (deviceType != hMDeviceType) {
                        mutableLiveData.postValue(SlpHMDeviceSyncDataEventObserver.NO_SYNC);
                    } else if (hMDeviceSyncDataEvent2.isStop()) {
                        if (SlpHMDeviceSyncDataEventObserver.INSTANCE.isToday(hMDeviceType)) {
                            mutableLiveData.postValue(SlpHMDeviceSyncDataEventObserver.SYNC_FINISH);
                        } else {
                            mutableLiveData.postValue(SlpHMDeviceSyncDataEventObserver.SYNC_NOT);
                        }
                        if (!hMDeviceSyncDataEvent2.getResult()) {
                            mutableLiveData.postValue("sync_failed");
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        });
        return mutableLiveData;
    }
}
