package com.huami.device.core.sync.impl.job.hub;

import com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback;
import java.util.Calendar;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lcom/huami/device/core/sync/impl/job/hub/SensorHub;", "", "Ljava/util/Calendar;", "startTime", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/IHMActivityDataCallback;", "callback", "", "syncSensorHubData", "sync-center_release"}, k = 1, mv = {1, 5, 1})
public interface SensorHub {
    void syncSensorHubData(@NotNull Calendar startTime, @NotNull IHMActivityDataCallback callback);
}
