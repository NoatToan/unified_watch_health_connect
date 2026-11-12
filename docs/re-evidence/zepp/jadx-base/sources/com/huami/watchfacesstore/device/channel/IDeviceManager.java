package com.huami.watchfacesstore.device.channel;

import com.huami.watchfacesstore.device.WatchFaceState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0002H&J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&J\b\u0010\r\u001a\u00020\nH&J\b\u0010\u000e\u001a\u00020\nH&J\b\u0010\u000f\u001a\u00020\u0002H&J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H&J\b\u0010\u0014\u001a\u00020\nH&J7\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u00072%\u0010\u001d\u001a!\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u001b0\u0016j\u0002`\u001cH&J\b\u0010 \u001a\u00020\u001fH&J\u0011\u0010!\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b!\u0010\"J\u0016\u0010%\u001a\u00020\u00022\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0#H&J\u0010\u0010'\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\nH&J \u0010+\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020\nH&J\b\u0010,\u001a\u00020\u0002H&J\n\u0010-\u001a\u0004\u0018\u00010\u0007H&¨\u0006."}, d2 = {"Lcom/huami/watchfacesstore/device/channel/IDeviceManager;", "", "", "isBluetoothEnable", "isConnected", "isSyncingData", "isAgpsUpgrading", "", "fwVersionName", "isFwSupport", "", "batteryLowValue", "checkBattery", "getBatteryLevel", "getDfuState", "isSupportQueryStorageState", "", "dialSize", "dialId", "getStorageStateSync", "getDeviceFamilyValue", "watchFacePath", "Lkotlin/Function1;", "Lcom/huami/watchfacesstore/device/WatchFaceState;", "Lkotlin/ParameterName;", "name", "state", "", "Lcom/huami/watchfacesstore/device/OnSyncResultCallBack;", "onSyncResultCallBack", "syncWatchFace", "", "getAllWatchFaceIds", "getCurrentWatchFaceId", "()Ljava/lang/Integer;", "", "watchFaceIds", "deleteWatchFaceIds", "id", "setWatchFaceById", "currentId", "destId", "destSize", "replaceWatchFace", "isSilentTransmitting", "getCurrentDeviceSn", "lib_release"}, k = 1, mv = {1, 5, 1})
public interface IDeviceManager {
    boolean checkBattery(int batteryLowValue);

    boolean deleteWatchFaceIds(@NotNull List<Integer> watchFaceIds);

    @NotNull
    int[] getAllWatchFaceIds();

    int getBatteryLevel();

    @Nullable
    String getCurrentDeviceSn();

    @Nullable
    Integer getCurrentWatchFaceId();

    int getDeviceFamilyValue();

    int getDfuState();

    boolean getStorageStateSync(long dialSize, long dialId);

    boolean isAgpsUpgrading();

    boolean isBluetoothEnable();

    boolean isConnected();

    boolean isFwSupport(@Nullable String fwVersionName);

    boolean isSilentTransmitting();

    boolean isSupportQueryStorageState();

    boolean isSyncingData();

    boolean replaceWatchFace(int currentId, int destId, int destSize);

    boolean setWatchFaceById(int id);

    void syncWatchFace(@NotNull String watchFacePath, @NotNull Function1<? super WatchFaceState, Unit> onSyncResultCallBack);
}
