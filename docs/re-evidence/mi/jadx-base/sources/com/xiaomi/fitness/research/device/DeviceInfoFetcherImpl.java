package com.xiaomi.fitness.research.device;

import com.xiaomi.fitness.common.extensions.GsonExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.remote.DeviceModelRemote;
import com.xiaomi.fitness.research.device.DeviceInfoFetcherImpl;
import defpackage.y56;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b \u0010!J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0019\u0010\u0007R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/research/device/DeviceInfoFetcherImpl;", "Ly56$a;", "", "isCurrentConnected", "()Z", "", "getCurrentStatus", "()I", "", "did", "getDeviceInfo", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/xiaomi/fitness/device/manager/remote/DeviceModelRemote;", "getDeviceModel", "(Ljava/lang/String;)Lcom/xiaomi/fitness/device/manager/remote/DeviceModelRemote;", "isConnected", "(Ljava/lang/String;)Z", "getDeviceStatus", "(Ljava/lang/String;)I", "status", "", "setDeviceStatus", "(Ljava/lang/String;I)V", "getCurrentDeviceModel", "()Lcom/xiaomi/fitness/device/manager/remote/DeviceModelRemote;", "getVersion", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceManager;", "mWearableDeviceManager$delegate", "Lkotlin/Lazy;", "getMWearableDeviceManager", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceManager;", "mWearableDeviceManager", "<init>", "()V", "research-support_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DeviceInfoFetcherImpl extends y56.a {

    /* JADX INFO: renamed from: mWearableDeviceManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mWearableDeviceManager = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: z56
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceInfoFetcherImpl.mWearableDeviceManager_delegate$lambda$0();
        }
    });

    private final WearableDeviceManager getMWearableDeviceManager() {
        return (WearableDeviceManager) this.mWearableDeviceManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearableDeviceManager mWearableDeviceManager_delegate$lambda$0() {
        return DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
    }

    @Override // defpackage.y56
    @Nullable
    public DeviceModelRemote getCurrentDeviceModel() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) getMWearableDeviceManager().getCurrentDeviceModel();
        String did = wearableDeviceModel != null ? wearableDeviceModel.getDid() : null;
        if (did == null || did.length() == 0) {
            return null;
        }
        return new DeviceModelRemote(did);
    }

    @Override // defpackage.y56
    public int getCurrentStatus() {
        return getMWearableDeviceManager().getDeviceStatus();
    }

    @Override // defpackage.y56
    @NotNull
    public String getDeviceInfo(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return GsonExtKt.toJson(getMWearableDeviceManager().getDeviceInfoInAll(did));
    }

    @Override // defpackage.y56
    @NotNull
    public DeviceModelRemote getDeviceModel(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return new DeviceModelRemote(did);
    }

    @Override // defpackage.y56
    public int getDeviceStatus(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) getMWearableDeviceManager().getDeviceModel(did);
        if (wearableDeviceModel != null) {
            return wearableDeviceModel.getDeviceStatus();
        }
        return -1;
    }

    @Override // defpackage.y56
    public int getVersion() {
        return 0;
    }

    @Override // defpackage.y56
    public boolean isConnected(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) getMWearableDeviceManager().getDeviceModel(did);
        if (wearableDeviceModel != null) {
            return wearableDeviceModel.isDeviceConnected();
        }
        return false;
    }

    @Override // defpackage.y56
    public boolean isCurrentConnected() {
        return getMWearableDeviceManager().isConnected();
    }

    @Override // defpackage.y56
    public void setDeviceStatus(@NotNull String did, int status) {
        Intrinsics.checkNotNullParameter(did, "did");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) getMWearableDeviceManager().getDeviceModel(did);
        if (wearableDeviceModel != null) {
            wearableDeviceModel.setDeviceStatus(status);
        }
    }
}
