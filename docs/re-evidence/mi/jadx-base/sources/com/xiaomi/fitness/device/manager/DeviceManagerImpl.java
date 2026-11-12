package com.xiaomi.fitness.device.manager;

import com.xiaomi.fit.data.common.util.FitnessFilePathUtils;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;
import com.xiaomi.fitness.device.manager.bean.DeviceParameter;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.passport.utils.LoginPreferenceConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u0000 A2\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\u0001:\u0001AB\t\b\u0007¢\u0006\u0004\b@\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\u0006\u0010\u0007Jq\u0010\u0010\u001a\u00020\u00052D\u0010\f\u001a@\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tj\u001c\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\n\u0018\u0001`\u000b2\u001a\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tj\u0004\u0018\u0001`\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u0018J!\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u0015J\u001d\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010 \u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b \u0010!J%\u0010#\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0006\u0010\"\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010\u001fJ9\u0010(\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050$2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00050\tH\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010.\u001a\u00020\u00052\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J!\u00101\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010-\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b1\u00102J%\u00104\u001a\u00020\u00052\u0014\u00103\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020&H\u0016¢\u0006\u0004\b6\u00107J=\u0010:\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u001e\u00109\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0004\u0012\u0002080\tH\u0016¢\u0006\u0004\b:\u0010;R\u0014\u0010<\u001a\u0002088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u00107¨\u0006B"}, d2 = {"Lcom/xiaomi/fitness/device/manager/DeviceManagerImpl;", "Lcom/xiaomi/fitness/device/manager/BaseDeviceManager;", "Lcom/xiaomi/fitness/device/manager/DeviceModel;", "Lcom/xiaomi/fitness/device/manager/bean/DeviceInfo;", "Lcom/xiaomi/fitness/device/manager/bean/Device;", "", "register$device_manager_release", "()V", LoginPreferenceConfig.TYPE_REGISTER, "Lkotlin/Function1;", "", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "onSuccess", "Lcom/xiaomi/fitness/net/response/ApiException;", "Lcom/xiaomi/fitness/net/extensions/OnFail;", "onFail", "requestDeviceList", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", "did", "connectDevice", "(Ljava/lang/String;)V", "disconnectDevice", "getDeviceList", "()Ljava/util/List;", "getDeviceModels", "getLocalDeviceModels", "removeDeviceModel", "getCurrentDeviceModel", "()Lcom/xiaomi/fitness/device/manager/DeviceModel;", "getDeviceModel", "(Ljava/lang/String;)Lcom/xiaomi/fitness/device/manager/DeviceModel;", "getDeviceInfoInAll", "(Ljava/lang/String;)Lcom/xiaomi/fitness/device/manager/bean/DeviceInfo;", "mac", "getDeviceModelByMac", "Lkotlin/Function0;", "success", "", "fail", "deauthorize", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lcom/xiaomi/fitness/device/manager/bean/DeviceParameter;", "parameter", "Lcom/xiaomi/fitness/device/manager/a;", "callback", "bindDevice", "(Lcom/xiaomi/fitness/device/manager/bean/DeviceParameter;Lcom/xiaomi/fitness/device/manager/a;)V", "Lcom/xiaomi/fitness/device/manager/l;", "unbindDevice", "(Ljava/lang/String;Lcom/xiaomi/fitness/device/manager/l;)V", "deviceModel", "switchDevice", "(Lcom/xiaomi/fitness/device/manager/DeviceModel;)V", "getDeviceSize", "()I", "", FitnessFilePathUtils.TimeZoneConstant.POSITIVE, "findDeviceModel", "(Lkotlin/jvm/functions/Function1;)Lcom/xiaomi/fitness/device/manager/DeviceModel;", "isConnected", "()Z", "getDeviceStatus", "deviceStatus", "<init>", "Companion", "device-manager_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nDeviceManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceManagerImpl.kt\ncom/xiaomi/fitness/device/manager/DeviceManagerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,148:1\n1863#2,2:149\n1863#2,2:151\n1863#2,2:153\n1368#2:155\n1454#2,5:156\n1863#2,2:161\n1863#2,2:163\n1863#2,2:165\n1863#2,2:167\n1863#2,2:169\n1863#2,2:171\n1863#2,2:173\n1863#2,2:175\n*S KotlinDebug\n*F\n+ 1 DeviceManagerImpl.kt\ncom/xiaomi/fitness/device/manager/DeviceManagerImpl\n*L\n35#1:149,2\n41#1:151,2\n47#1:153,2\n53#1:155\n53#1:156,5\n60#1:161,2\n69#1:163,2\n78#1:165,2\n88#1:167,2\n98#1:169,2\n110#1:171,2\n133#1:173,2\n140#1:175,2\n*E\n"})
public final class DeviceManagerImpl extends BaseDeviceManager<DeviceModel<DeviceInfo<Device>>> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final List<DeviceManager<DeviceModel<DeviceInfo<Device>>>> managers = new ArrayList();

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R,\u0010\u0004\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/device/manager/DeviceManagerImpl$Companion;", "", "<init>", "()V", "managers", "", "Lcom/xiaomi/fitness/device/manager/DeviceManager;", "Lcom/xiaomi/fitness/device/manager/DeviceModel;", "Lcom/xiaomi/fitness/device/manager/bean/DeviceInfo;", "Lcom/xiaomi/fitness/device/manager/bean/Device;", "getManagers$device_manager_release", "()Ljava/util/List;", "device-manager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<DeviceManager<DeviceModel<DeviceInfo<Device>>>> getManagers$device_manager_release() {
            return DeviceManagerImpl.managers;
        }
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public void bindDevice(@NotNull DeviceParameter parameter, @NotNull a callback) {
        Intrinsics.checkNotNullParameter(parameter, "parameter");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public void connectDevice(@Nullable String did) {
        Iterator<T> it = managers.iterator();
        while (it.hasNext()) {
            ((DeviceManager) it.next()).connectDevice(did);
        }
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public void deauthorize(@NotNull String did, @NotNull Function0<Unit> success, @NotNull Function1<? super Integer, Unit> fail) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public void disconnectDevice(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        Iterator<T> it = managers.iterator();
        while (it.hasNext()) {
            ((DeviceManager) it.next()).disconnectDevice(did);
        }
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    @Nullable
    public DeviceModel<DeviceInfo<Device>> findDeviceModel(@NotNull Function1<? super DeviceModel<DeviceInfo<Device>>, Boolean> p) {
        Intrinsics.checkNotNullParameter(p, "p");
        Iterator<T> it = managers.iterator();
        while (it.hasNext()) {
            DeviceModel<DeviceInfo<Device>> deviceModelFindDeviceModel = ((DeviceManager) it.next()).findDeviceModel(p);
            if (deviceModelFindDeviceModel != null) {
                return deviceModelFindDeviceModel;
            }
        }
        return null;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    @Nullable
    public DeviceModel<DeviceInfo<Device>> getCurrentDeviceModel() {
        throw new NotImplementedError(null, 1, null);
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    @Nullable
    public DeviceInfo<? extends Device> getDeviceInfoInAll(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        Iterator<T> it = managers.iterator();
        while (it.hasNext()) {
            DeviceInfo<? extends Device> deviceInfoInAll = ((DeviceManager) it.next()).getDeviceInfoInAll(did);
            if (deviceInfoInAll != null) {
                return deviceInfoInAll;
            }
        }
        return null;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    @NotNull
    public List<Device> getDeviceList() {
        List<DeviceManager<DeviceModel<DeviceInfo<Device>>>> list = managers;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, ((DeviceManager) it.next()).getDeviceList());
        }
        return arrayList;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    @Nullable
    public DeviceModel<DeviceInfo<Device>> getDeviceModel(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        Iterator<T> it = managers.iterator();
        while (it.hasNext()) {
            DeviceModel<DeviceInfo<Device>> deviceModel = ((DeviceManager) it.next()).getDeviceModel(did);
            if (deviceModel != null) {
                return deviceModel;
            }
        }
        return null;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    @Nullable
    public DeviceModel<DeviceInfo<Device>> getDeviceModelByMac(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Iterator<T> it = managers.iterator();
        while (it.hasNext()) {
            DeviceModel<DeviceInfo<Device>> deviceModelByMac = ((DeviceManager) it.next()).getDeviceModelByMac(mac);
            if (deviceModelByMac != null) {
                return deviceModelByMac;
            }
        }
        return null;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    @NotNull
    public List<DeviceModel<DeviceInfo<Device>>> getDeviceModels() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = managers.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((DeviceManager) it.next()).getDeviceModels());
        }
        return arrayList;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public int getDeviceSize() {
        Iterator<T> it = managers.iterator();
        int deviceSize = 0;
        while (it.hasNext()) {
            deviceSize += ((DeviceManager) it.next()).getDeviceSize();
        }
        return deviceSize;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public int getDeviceStatus() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    @NotNull
    public List<DeviceModel<DeviceInfo<Device>>> getLocalDeviceModels() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = managers.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((DeviceManager) it.next()).getLocalDeviceModels());
        }
        return arrayList;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public boolean isConnected() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.xiaomi.fitness.device.manager.BaseDeviceManager
    public void register$device_manager_release() {
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public void removeDeviceModel(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        Iterator<T> it = managers.iterator();
        while (it.hasNext()) {
            ((DeviceManager) it.next()).removeDeviceModel(did);
        }
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public void requestDeviceList(@Nullable Function1<? super List<? extends DeviceModel<DeviceInfo<Device>>>, Unit> onSuccess, @Nullable Function1<? super ApiException, Unit> onFail) {
        Iterator<T> it = managers.iterator();
        while (it.hasNext()) {
            DeviceManager deviceManager = (DeviceManager) it.next();
            StringBuilder sb = new StringBuilder();
            sb.append("requestDeviceList: ");
            sb.append(deviceManager);
        }
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public void switchDevice(@Nullable DeviceModel<DeviceInfo<Device>> deviceModel) {
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public void unbindDevice(@NotNull String did, @Nullable l callback) {
        Intrinsics.checkNotNullParameter(did, "did");
    }
}
