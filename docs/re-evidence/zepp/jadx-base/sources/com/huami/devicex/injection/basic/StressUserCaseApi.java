package com.huami.devicex.injection.basic;

import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J0\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H&J\b\u0010\u000b\u001a\u00020\tH&J\b\u0010\f\u001a\u00020\tH&J\b\u0010\r\u001a\u00020\tH&J\b\u0010\u000f\u001a\u00020\u000eH&¨\u0006\u0010"}, d2 = {"Lcom/huami/devicex/injection/basic/StressUserCaseApi;", "", "", "Value", "deviceSource", "", "deviceId", ParamKey.deviceMac, ParamKey.deviceSn, "", "syncDeviceData", "syncDataFromServer", "fetchDataFromServer", "syncDataToServer", "", "isSyncDataEnable", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface StressUserCaseApi {
    void fetchDataFromServer();

    boolean isSyncDataEnable();

    void syncDataFromServer();

    void syncDataToServer();

    void syncDeviceData(int Value, int deviceSource, @NotNull String deviceId, @NotNull String deviceMac, @NotNull String deviceSn);
}
