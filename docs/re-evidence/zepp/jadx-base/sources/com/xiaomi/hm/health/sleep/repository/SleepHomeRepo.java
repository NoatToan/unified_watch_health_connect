package com.xiaomi.hm.health.sleep.repository;

import android.content.Context;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import com.huami.sleep.sleephome.promotion.SleepPromotionVo;
import com.huami.sleep.sleephome.repo.ISleepHomeRepo;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.manager.SportDataManager;
import com.xiaomi.hm.health.sleep.eventbus.SlpHMDeviceSyncDataEventObserver;
import com.xiaomi.hm.health.sleep.eventbus.SlpSummaryAnalasisJobFinishObserver;
import com.xiaomi.hm.health.sleep.manger.PromotionType;
import com.xiaomi.hm.health.sleep.manger.SleepPromotionDataManager;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH\u0016J\u001c\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0016H\u0016R\u0016\u0010\u0019\u001a\u00020\u00068\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/sleep/repository/SleepHomeRepo;", "Lcom/huami/sleep/sleephome/repo/ISleepHomeRepo;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "", "isTodaySync", "", "getTodaySyncStatus", "Landroidx/lifecycle/MutableLiveData;", "getSyncStatus", "getInitSyncStatus", "getInitEditStatus", "", "index", "getSleepLoadingStatus", "Landroidx/lifecycle/LiveData;", "isSummaryAnalysisFinish", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "Lcom/huami/sleep/sleephome/promotion/SleepPromotionVo;", "getSleepPromotionData", "", "initDetailPage", "deinitDetailPage", "mTag", "Ljava/lang/String;", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SleepHomeRepo implements ISleepHomeRepo {

    @NotNull
    private final String mTag = "SleepHomeRepo";

    private final String getTodaySyncStatus(HMDeviceType type) {
        boolean zIsTodaySync = isTodaySync(type);
        if (HMDeviceManager.getInstance().isConnected(type)) {
            return zIsTodaySync ? SlpHMDeviceSyncDataEventObserver.SYNC_FINISH : SlpHMDeviceSyncDataEventObserver.SYNC_NOT;
        }
        return SlpHMDeviceSyncDataEventObserver.SYNCING;
    }

    private final boolean isTodaySync(HMDeviceType type) {
        HMDeviceManager hMDeviceManager = HMDeviceManager.getInstance();
        Calendar boundDeviceSyncTime = hMDeviceManager == null ? null : hMDeviceManager.getBoundDeviceSyncTime(type);
        if (boundDeviceSyncTime == null) {
            return false;
        }
        return TimeUtils.isToday(boundDeviceSyncTime) || boundDeviceSyncTime.getTime().getTime() > SportDay.getToday().getCalendar().getTime().getTime();
    }

    @Override // com.huami.sleep.sleephome.repo.ISleepHomeRepo
    public void deinitDetailPage() {
        SportDataManager.getInstance().deinitDetailPage();
    }

    @Override // com.huami.sleep.sleephome.repo.ISleepHomeRepo
    public boolean getInitEditStatus() {
        HMDeviceManager hMDeviceManager = HMDeviceManager.getInstance();
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        boolean zIsTodaySync = hMDeviceManager.hasBound(hMDeviceType) ? isTodaySync(hMDeviceType) : false;
        HMDeviceType hMDeviceType2 = HMDeviceType.WATCH;
        if (hMDeviceManager.hasBound(hMDeviceType2)) {
            zIsTodaySync = isTodaySync(hMDeviceType2);
        }
        HMDeviceType hMDeviceType3 = HMDeviceType.EARBUD;
        return hMDeviceManager.hasBound(hMDeviceType3) ? zIsTodaySync | isTodaySync(hMDeviceType3) : zIsTodaySync;
    }

    @Override // com.huami.sleep.sleephome.repo.ISleepHomeRepo
    @NotNull
    public String getInitSyncStatus() {
        HMDeviceManager hMDeviceManager = HMDeviceManager.getInstance();
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        if (hMDeviceManager.hasBound(hMDeviceType)) {
            HMLog.info(this.mTag, new Function0<String>() { // from class: com.xiaomi.hm.health.sleep.repository.SleepHomeRepo.getInitSyncStatus.1
                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "当前绑定并启用的设备type：MILI";
                }
            });
            return getTodaySyncStatus(hMDeviceType);
        }
        HMDeviceType hMDeviceType2 = HMDeviceType.WATCH;
        if (!hMDeviceManager.hasBound(hMDeviceType2)) {
            return SlpHMDeviceSyncDataEventObserver.NO_SYNC;
        }
        HMLog.info(this.mTag, new Function0<String>() { // from class: com.xiaomi.hm.health.sleep.repository.SleepHomeRepo.getInitSyncStatus.2
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "当前绑定并启用的设备type：WATCH";
            }
        });
        return getTodaySyncStatus(hMDeviceType2);
    }

    @Override // com.huami.sleep.sleephome.repo.ISleepHomeRepo
    public boolean getSleepLoadingStatus(int index) {
        int i = SportDataManager.getInstance().getSleepStatus(SportDataManager.getInstance().getKey(index))[0];
        return (i == R.string.loading || i == R.string.no_network || i == R.string.load_failed) ? false : true;
    }

    @Override // com.huami.sleep.sleephome.repo.ISleepHomeRepo
    @NotNull
    public LiveData<List<SleepPromotionVo>> getSleepPromotionData(@NotNull Context context) {
        return SleepPromotionDataManager.INSTANCE.loadData(context, PromotionType.SLEEP_PAGE_PROMOTION);
    }

    @Override // com.huami.sleep.sleephome.repo.ISleepHomeRepo
    @NotNull
    public MutableLiveData<String> getSyncStatus() {
        return SlpHMDeviceSyncDataEventObserver.INSTANCE.getSyncStatus();
    }

    @Override // com.huami.sleep.sleephome.repo.ISleepHomeRepo
    public void initDetailPage() {
        SportDataManager.getInstance().initDetailPage();
    }

    @Override // com.huami.sleep.sleephome.repo.ISleepHomeRepo
    @NotNull
    public LiveData<Boolean> isSummaryAnalysisFinish() {
        return SlpSummaryAnalasisJobFinishObserver.INSTANCE.isDataAnalysisFinish();
    }
}
