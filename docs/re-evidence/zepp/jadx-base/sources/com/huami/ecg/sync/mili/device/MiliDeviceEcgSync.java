package com.huami.ecg.sync.mili.device;

import java.util.Calendar;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\n"}, d2 = {"Lcom/huami/ecg/sync/mili/device/MiliDeviceEcgSync;", "", "Ljava/util/Calendar;", "time", "Lcom/huami/ecg/sync/mili/device/EcgRawDataCallback;", "callback", "", "syncPpg", "syncEcg", "syncSummary", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public interface MiliDeviceEcgSync {
    void syncEcg(@NotNull Calendar time, @NotNull EcgRawDataCallback callback);

    void syncPpg(@NotNull Calendar time, @NotNull EcgRawDataCallback callback);

    void syncSummary(@NotNull Calendar time, @NotNull EcgRawDataCallback callback);
}
