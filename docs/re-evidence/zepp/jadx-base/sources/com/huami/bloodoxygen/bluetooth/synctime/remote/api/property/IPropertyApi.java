package com.huami.bloodoxygen.bluetooth.synctime.remote.api.property;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/huami/bloodoxygen/bluetooth/synctime/remote/api/property/IPropertyApi;", "", "Lcom/huami/bloodoxygen/bluetooth/synctime/remote/api/property/BloodOxygenSyncTime;", "getBloodOxygenSyncTime", "syncTime", "", "postBloodOxygenSyncTime", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface IPropertyApi {
    @Nullable
    BloodOxygenSyncTime getBloodOxygenSyncTime();

    boolean postBloodOxygenSyncTime(@NotNull BloodOxygenSyncTime syncTime);
}
