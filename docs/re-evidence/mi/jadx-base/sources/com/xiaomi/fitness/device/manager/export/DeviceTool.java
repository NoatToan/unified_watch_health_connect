package com.xiaomi.fitness.device.manager.export;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.bean.DeviceActiveBean;
import com.xiaomi.fitness.device.manager.export.bean.DeviceRecord;
import com.xiaomi.onetrack.api.b;
import com.xiaomi.onetrack.c.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 -2\u00020\u0001:\u0001-J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&J\"\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0007H&J4\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&JO\u0010\u0011\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000e2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000e2\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00030\u0017¢\u0006\u0002\b\u0019H&J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001dH&J\u0012\u0010\u001a\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0010H&J\u001c\u0010\u001f\u001a\u00020\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u000eH¦@¢\u0006\u0002\u0010\"J\u000e\u0010#\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010$J\u0010\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020'H&J\b\u0010(\u001a\u00020\u0003H&J\u0018\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0010H&¨\u0006."}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/DeviceTool;", "", "launchToAddDevice", "", "context", "Landroid/content/Context;", "viewBloodSugarDevice", "", "launchToScanDevice", "product", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "showList", "launchToScanDeviceWithIds", "products", "", "to", "", "foundDeviceByScanBluetooth", "namePrefixList", "wearProductIdList", "", "localProductIdList", "callback", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/device/manager/export/FoundDeviceCallback;", "Lkotlin/ExtensionFunctionType;", "reportDeviceActive", i.d, "eventValue", "Lcom/xiaomi/fitness/device/manager/export/bean/DeviceActiveBean;", "firmwareVersion", "saveDeviceRecordToDatabase", "value", "Lcom/xiaomi/fitness/device/manager/export/bean/DeviceRecord;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteDeviceRecordFromDatabaseTimeout", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectOtherDeviceTab", "fragment", "Landroidx/fragment/app/Fragment;", "syncHuamiStatisticData", "isVersionSupport", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", b.n, "Companion", "device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DeviceTool {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/DeviceTool$Companion;", "", "<init>", "()V", "device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void launchToAddDevice$default(DeviceTool deviceTool, Context context, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchToAddDevice");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            deviceTool.launchToAddDevice(context, z);
        }

        public static /* synthetic */ void launchToScanDeviceWithIds$default(DeviceTool deviceTool, Context context, List list, boolean z, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchToScanDeviceWithIds");
            }
            if ((i & 8) != 0) {
                str = null;
            }
            deviceTool.launchToScanDeviceWithIds(context, list, z, str);
        }
    }

    @Nullable
    Object deleteDeviceRecordFromDatabaseTimeout(@NotNull Continuation<? super Boolean> continuation);

    void foundDeviceByScanBluetooth(@NotNull List<String> namePrefixList, @Nullable List<Integer> wearProductIdList, @Nullable List<Integer> localProductIdList, @NotNull Function1<? super FoundDeviceCallback, Unit> callback);

    boolean isVersionSupport(@NotNull WearableDeviceModel deviceModel, @NotNull String feature);

    void launchToAddDevice(@NotNull Context context, boolean viewBloodSugarDevice);

    void launchToScanDevice(@NotNull Context context, @Nullable Product product, boolean showList);

    void launchToScanDeviceWithIds(@NotNull Context context, @Nullable List<? extends Product> products, boolean showList, @Nullable String to);

    void reportDeviceActive(@Nullable String firmwareVersion);

    void reportDeviceActive(@NotNull String eventName, @NotNull DeviceActiveBean eventValue);

    @Nullable
    Object saveDeviceRecordToDatabase(@NotNull List<DeviceRecord> list, @NotNull Continuation<? super Unit> continuation);

    void selectOtherDeviceTab(@NotNull Fragment fragment);

    void syncHuamiStatisticData();
}
