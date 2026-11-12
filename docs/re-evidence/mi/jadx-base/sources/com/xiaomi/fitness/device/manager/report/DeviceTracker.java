package com.xiaomi.fitness.device.manager.report;

import com.miui.circulate.device.api.Column;
import com.xiaomi.fitness.device.manager.export.FoundDeviceCallback;
import com.xiaomi.fitness.device.manager.export.bean.DeviceActiveBean;
import com.xiaomi.fitness.device.manager.export.bean.DeviceRecord;
import com.xiaomi.onetrack.c.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fJ\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u001c\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH¦@¢\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\u00020\u000fH¦@¢\u0006\u0002\u0010\u0010JO\u0010\u0011\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000b2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000b2\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00030\u0017¢\u0006\u0002\b\u0019H&J.\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001d\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H&¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/device/manager/report/DeviceTracker;", "", "reportDeviceActive", "", "firmwareVersion", "", i.d, "eventValue", "Lcom/xiaomi/fitness/device/manager/export/bean/DeviceActiveBean;", "saveDeviceRecordToDatabase", "recordList", "", "Lcom/xiaomi/fitness/device/manager/export/bean/DeviceRecord;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteDeviceRecordFromDatabaseTimeout", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundDeviceByScanBluetooth", "namePrefixList", "wearProductIdList", "", "localProductIdList", "callback", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/device/manager/export/FoundDeviceCallback;", "Lkotlin/ExtensionFunctionType;", "reportBatteryValue", "deviceModel", "deviceVersion", Column.BATTERY, "info", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DeviceTracker {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/device/manager/report/DeviceTracker$Companion;", "", "<init>", "()V", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Nullable
    Object deleteDeviceRecordFromDatabaseTimeout(@NotNull Continuation<? super Boolean> continuation);

    void foundDeviceByScanBluetooth(@NotNull List<String> namePrefixList, @Nullable List<Integer> wearProductIdList, @Nullable List<Integer> localProductIdList, @NotNull Function1<? super FoundDeviceCallback, Unit> callback);

    void reportBatteryValue(@Nullable String deviceModel, @Nullable String deviceVersion, int battery, @Nullable String info);

    void reportDeviceActive(@Nullable String firmwareVersion);

    void reportDeviceActive(@NotNull String eventName, @NotNull DeviceActiveBean eventValue);

    @Nullable
    Object saveDeviceRecordToDatabase(@NotNull List<DeviceRecord> list, @NotNull Continuation<? super Unit> continuation);
}
