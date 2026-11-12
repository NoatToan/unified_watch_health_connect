package com.xiaomi.fitness.device.manager.export;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.device.manager.BaseDeviceManager;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.device.manager.l;
import com.xiaomi.onetrack.api.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000 <2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001<B\u0007¢\u0006\u0004\b:\u0010;J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\u0003H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u0003H&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0003H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0003H&¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0003H&¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0018H&¢\u0006\u0004\b\u001f\u0010 J'\u0010$\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0018H&¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020!2\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020!2\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b(\u0010'J\u0015\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020)H&¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020!H&¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020!2\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b.\u0010'J\u0019\u00100\u001a\u0004\u0018\u00010/2\u0006\u0010\r\u001a\u00020\u0003H&¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\b\u0012\u0004\u0012\u00020\u00020)H&¢\u0006\u0004\b2\u0010+J\u0015\u00103\u001a\b\u0012\u0004\u0012\u00020/0)H&¢\u0006\u0004\b3\u0010+J\u0017\u00105\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010)H&¢\u0006\u0004\b5\u0010+J%\u00107\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010)2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00030)H&¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b9\u0010\u0007¨\u0006="}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/WearableDeviceManager;", "Lcom/xiaomi/fitness/device/manager/BaseDeviceManager;", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "", "did", "", "connectLocalDevice", "(Ljava/lang/String;)V", "Lcom/xiaomi/fitness/device/manager/export/OnAccessoryDeviceStateListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addAccessoryDeviceStateListener", "(Lcom/xiaomi/fitness/device/manager/export/OnAccessoryDeviceStateListener;)V", "removeAccessoryDeviceStateListener", "model", "getLocalDeviceModel", "(Ljava/lang/String;)Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mac", "Lcom/xiaomi/fitness/device/manager/export/HuamiApiCaller;", "getHuaMiApiCaller", "(Ljava/lang/String;)Lcom/xiaomi/fitness/device/manager/export/HuamiApiCaller;", "getLocalPhoneSid", "()Ljava/lang/String;", "getCurrentPhoneSid", "getUniqueIdentify", "", "flag", "setShowCommonAppDialog", "(Z)V", "Lcom/xiaomi/fitness/device/manager/l;", "callback", "syncData", "unbindBloodSugarDevice", "(Ljava/lang/String;Lcom/xiaomi/fitness/device/manager/l;Z)V", "", "mode", Constants.EXTRA_FROM_APP, "switchDeviceWearMode", "(Ljava/lang/String;IZ)V", "getDeviceCapability", "(Ljava/lang/String;)I", "getDeviceCapabilityV2", "", "getAccessoryDeviceModels", "()Ljava/util/List;", "hasAccessoryMode", "(I)Z", "getAccessoryMode", "Lcom/xiaomi/fitness/device/manager/bean/Device;", "getDeviceByModelFromAllDevice", "(Ljava/lang/String;)Lcom/xiaomi/fitness/device/manager/bean/Device;", "getNeedKeepAliveDeviceModel", "getAllDeviceList", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;", "getAllDeviceInfoList", b.n, "getAllFeatureSupportDeviceInfoList", "(Ljava/util/List;)Ljava/util/List;", "setBindNewMode", "<init>", "()V", "Companion", "device-manager-export_release"}, k = 1, mv = {2, 0, 0})
public abstract class WearableDeviceManager extends BaseDeviceManager<WearableDeviceModel> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/WearableDeviceManager$Companion;", "", "<init>", "()V", "device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public abstract void addAccessoryDeviceStateListener(@NotNull OnAccessoryDeviceStateListener listener);

    public void connectLocalDevice(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
    }

    @NotNull
    public abstract List<WearableDeviceModel> getAccessoryDeviceModels();

    public abstract int getAccessoryMode(@NotNull String did);

    @Nullable
    public abstract List<WearableDeviceInfo> getAllDeviceInfoList();

    @NotNull
    public abstract List<Device> getAllDeviceList();

    @Nullable
    public abstract List<WearableDeviceInfo> getAllFeatureSupportDeviceInfoList(@NotNull List<String> feature);

    @NotNull
    public abstract String getCurrentPhoneSid();

    @Nullable
    public abstract Device getDeviceByModelFromAllDevice(@NotNull String model);

    public abstract int getDeviceCapability(@NotNull String did);

    public abstract int getDeviceCapabilityV2(@NotNull String did);

    @Nullable
    public abstract HuamiApiCaller getHuaMiApiCaller(@NotNull String mac);

    @Nullable
    public abstract WearableDeviceModel getLocalDeviceModel(@NotNull String model);

    @NotNull
    public abstract String getLocalPhoneSid();

    @NotNull
    public abstract List<WearableDeviceModel> getNeedKeepAliveDeviceModel();

    @NotNull
    public abstract String getUniqueIdentify();

    public abstract boolean hasAccessoryMode(int mode);

    public abstract void removeAccessoryDeviceStateListener(@NotNull OnAccessoryDeviceStateListener listener);

    public abstract void setBindNewMode(@NotNull String did);

    public abstract void setShowCommonAppDialog(boolean flag);

    public abstract void switchDeviceWearMode(@NotNull String did, int mode, boolean fromApp);

    public abstract void unbindBloodSugarDevice(@NotNull String did, @NotNull l callback, boolean syncData);
}
