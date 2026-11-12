package com.xiaomi.fitness.device.model.api;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.xiaomi.fitness.device.manager.export.bean.WearableDevice;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import defpackage.qa6;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\bf\u0018\u0000 (2\u00020\u0001:\u0001(J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u0011\u0010\u000eJ%\u0010\u0016\u001a\u0004\u0018\u00010\u00132\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H&¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0014H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0014H&¢\u0006\u0004\b\u001e\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u0014H&¢\u0006\u0004\b \u0010\u001cJ\u000f\u0010\"\u001a\u00020!H&¢\u0006\u0004\b\"\u0010#R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00130$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/device/model/api/DeviceManagerInternal;", "", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableDevice;", "device", "", "updateDevice", "(Lcom/xiaomi/fitness/device/manager/export/bean/WearableDevice;)V", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;", "deviceInfo", "addDeviceLocal", "(Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;)V", "", "did", "removeLocalDevice", "(Ljava/lang/String;)V", "initDeviceModelsByCache", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setCurrentDeviceModel", "Lkotlin/Function1;", "Lqa6;", "", "predicate", "findDeviceModel", "(Lkotlin/jvm/functions/Function1;)Lqa6;", CervicalMucusRecord.Appearance.CLEAR, "()V", "isReadded", "notifyDeviceInit", "(Ljava/lang/String;Z)V", "isRemoved", "notifyDeviceDestroy", "isRebind", "notifyDeviceBind", "", "getWearableDeviceSize", "()I", "", "getAllDeviceModels", "()Ljava/util/List;", "allDeviceModels", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public interface DeviceManagerInternal {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int REQUESTED = 2;
    public static final int REQUESTING = 1;
    public static final int REQUEST_NOT = 0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/device/model/api/DeviceManagerInternal$Companion;", "", "<init>", "()V", "REQUEST_NOT", "", "REQUESTING", "REQUESTED", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int REQUESTED = 2;
        public static final int REQUESTING = 1;
        public static final int REQUEST_NOT = 0;

        private Companion() {
        }
    }

    void addDeviceLocal(@NotNull WearableDeviceInfo deviceInfo);

    void clear();

    @Nullable
    qa6 findDeviceModel(@NotNull Function1<? super qa6, Boolean> predicate);

    @NotNull
    List<qa6> getAllDeviceModels();

    int getWearableDeviceSize();

    @Nullable
    Object initDeviceModelsByCache(@NotNull Continuation<? super Unit> continuation);

    void notifyDeviceBind(@NotNull String did, boolean isRebind);

    void notifyDeviceDestroy(@NotNull String did, boolean isRemoved);

    void notifyDeviceInit(@NotNull String did, boolean isReadded);

    void removeLocalDevice(@NotNull String did);

    void setCurrentDeviceModel(@NotNull String did);

    void updateDevice(@NotNull WearableDevice device);
}
