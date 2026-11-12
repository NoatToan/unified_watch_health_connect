package com.huami.ecg.sync.health.offline;

import com.huami.ecg.sync.health.model.SimplifyDeviceInfo;
import java.util.Calendar;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&J\b\u0010\r\u001a\u00020\fH&¨\u0006\u000e"}, d2 = {"Lcom/huami/ecg/sync/health/offline/EcgOffLineDevice;", "", "", "deviceSource", "Lcom/huami/ecg/sync/health/model/SimplifyDeviceInfo;", "deviceInfo", "Ljava/util/Calendar;", "time", "Lcom/huami/ecg/sync/health/offline/HealthEcgSyncCallback;", "callback", "", "sync", "", "isEcgUser", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public interface EcgOffLineDevice {
    @NotNull
    SimplifyDeviceInfo deviceInfo();

    int deviceSource();

    boolean isEcgUser();

    void sync(@NotNull Calendar time, @NotNull HealthEcgSyncCallback callback);
}
