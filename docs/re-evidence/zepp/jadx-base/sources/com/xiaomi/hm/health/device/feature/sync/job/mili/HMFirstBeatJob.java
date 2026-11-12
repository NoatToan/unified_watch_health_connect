package com.xiaomi.hm.health.device.feature.sync.job.mili;

import com.huami.device.core.sync.api.exception.SyncException;
import com.huami.device.core.sync.impl.job.milible.FirstBeatJob;
import com.huami.tools.log.HMLog;
import com.huami.watch.dataflow.sync.bean.FirstbeatData;
import com.huami.watch.dataflow.sync.ble.BleFirstbeatSync;
import com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat.BleFirstbeatData;
import com.xiaomi.hm.health.firstbeat.FirstbeatManager;
import com.xiaomi.hm.health.firstbeat.FirstbeatUtils;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0014\u0010\f\u001a\u00020\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/job/mili/HMFirstBeatJob;", "Lcom/huami/device/core/sync/impl/job/milible/FirstBeatJob;", "Ljava/util/Calendar;", "loadEndTime", "loadStartTime", "Lcom/xiaomi/hm/health/bt/profile/smartwatch/firstbeat/BleFirstbeatData;", "outData", "", "onDataOut", "Ljava/lang/Exception;", "Lkotlin/Exception;", Constants.EXCEPTION, "onError", "", "tag", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public final class HMFirstBeatJob extends FirstBeatJob {

    @NotNull
    private final String tag = "HMFirstBeatJob";

    @Override // com.huami.device.core.sync.impl.job.milible.FirstBeatJob
    @NotNull
    public Calendar loadEndTime() {
        return Calendar.getInstance();
    }

    @Override // com.huami.device.core.sync.impl.job.milible.BaseJob
    @NotNull
    public Calendar loadStartTime() {
        HMLog.info(this.tag, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMFirstBeatJob.loadStartTime.1
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "ready to sync firstbeat data";
            }
        });
        long firstbeatUpdateTime = FirstbeatUtils.INSTANCE.getFirstbeatUpdateTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(firstbeatUpdateTime);
        return calendar;
    }

    @Override // com.huami.device.core.sync.impl.job.milible.BaseJob
    public void onError(@NotNull Exception exception) {
        HMLog.e(this.tag, exception);
    }

    @Override // com.huami.device.core.sync.impl.job.milible.BaseJob
    public void onDataOut(@NotNull BleFirstbeatData outData) {
        try {
            FirstbeatData firstbeatData = BleFirstbeatSync.parseFirstbeatData(outData);
            if (firstbeatData == null) {
                HMLog.info(this.tag, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMFirstBeatJob.onDataOut.1
                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "parsed firstbeat data is null";
                    }
                });
            } else {
                FirstbeatManager.INSTANCE.save(firstbeatData);
            }
        } catch (Exception e) {
            throw new SyncException("error of Stop HMFirstBeatJob", e, 0, 4, null);
        }
    }
}
