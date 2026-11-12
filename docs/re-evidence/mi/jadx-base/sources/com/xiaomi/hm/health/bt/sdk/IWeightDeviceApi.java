package com.xiaomi.hm.health.bt.sdk;

import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import com.xiaomi.hm.health.bt.model.WeightSyncResult;
import com.xiaomi.hm.health.bt.profile.weight.IOFMeasurementCallback;
import com.xiaomi.hm.health.bt.sdk.fw.IUpgradeCallback;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H'J\n\u0010\t\u001a\u0004\u0018\u00010\nH&J\b\u0010\u000b\u001a\u00020\u0003H&J\u001c\u0010\f\u001a\u00020\u00052\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000eH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000fH'J\u0016\u0010\u0012\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H&J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0003H'J\b\u0010\u0018\u001a\u00020\u0003H'J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH'J\u0018\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020 H&¨\u0006!"}, d2 = {"Lcom/xiaomi/hm/health/bt/sdk/IWeightDeviceApi;", "", "clearHistoryData", "", "connect", "", "disconnect", "enablePartMeasure", "enable", "getDeviceInfo", "Lcom/xiaomi/hm/health/bt/sdk/DeviceInfoExt;", "isConnected", "setConnectStatusCallback", "callback", "Lkotlin/Function1;", "", "setUnit", "unit", "setWeightDataCallback", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "Lcom/xiaomi/hm/health/bt/model/WeightAdvData;", "startOneFootMeasure", "Lcom/xiaomi/hm/health/bt/profile/weight/IOFMeasurementCallback;", "forceStart", "stopOneFootMeasure", "syncWeightData", "Lcom/xiaomi/hm/health/bt/model/WeightSyncResult;", "uid", "", "upgradeFirmware", "path", "", "Lcom/xiaomi/hm/health/bt/sdk/fw/IUpgradeCallback;", "btData_wearRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface IWeightDeviceApi {
    boolean clearHistoryData();

    void connect();

    void disconnect();

    boolean enablePartMeasure(boolean enable);

    @Nullable
    DeviceInfoExt getDeviceInfo();

    boolean isConnected();

    void setConnectStatusCallback(@NotNull Function1<? super Integer, Unit> callback);

    boolean setUnit(int unit);

    void setWeightDataCallback(@NotNull HMCallback<WeightAdvData> callback);

    void startOneFootMeasure(@NotNull IOFMeasurementCallback callback, boolean forceStart);

    boolean stopOneFootMeasure();

    @NotNull
    WeightSyncResult syncWeightData(long uid);

    void upgradeFirmware(@NotNull String path, @NotNull IUpgradeCallback callback);
}
