package com.huami.device.feature.health.device.init;

import com.huami.device.feature.health.model.HealthSettingData;
import com.huami.device.feature.health.model.HrAlertParam;
import com.huami.watch.companion.event.WatchFaceArrivingEvent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001a\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u0004H&¨\u0006\f"}, d2 = {"Lcom/huami/device/feature/health/device/init/HighHrAlertInit;", "Lcom/huami/device/feature/health/device/init/BaseHealthInit;", "Lcom/huami/device/feature/health/model/HrAlertParam;", "hrAlert", "", WatchFaceArrivingEvent.CMD_SET, "isInit", "Lcom/huami/device/feature/health/model/HealthSettingData;", "", "get", "<init>", "()V", "health-base_release"}, k = 1, mv = {1, 5, 1})
public abstract class HighHrAlertInit extends BaseHealthInit {
    public static /* synthetic */ HealthSettingData get$default(HighHrAlertInit highHrAlertInit, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        return highHrAlertInit.get(z);
    }

    @Nullable
    public abstract HealthSettingData<Integer> get(boolean isInit);

    public abstract boolean set(@NotNull HrAlertParam hrAlert);
}
