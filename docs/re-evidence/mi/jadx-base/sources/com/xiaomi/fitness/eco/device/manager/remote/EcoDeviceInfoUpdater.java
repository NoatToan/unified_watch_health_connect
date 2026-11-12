package com.xiaomi.fitness.eco.device.manager.remote;

import android.text.TextUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDevice;
import com.xiaomi.fitness.eco.device.manager.extensions.EcoInstanceExtKt;
import com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceInfoUpdater;
import com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternalRemote;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J*\u0010\u0010\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u001a\u0010\u0014\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u001a\u0010\u0015\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/remote/EcoDeviceInfoUpdater;", "Lcom/xiaomi/fitness/eco/device/manager/export/OnEcoDeviceStatusListener;", "<init>", "()V", "mDeviceManager", "Lcom/xiaomi/fitness/eco/device/model/api/EcoDeviceManagerInternalRemote;", "getMDeviceManager", "()Lcom/xiaomi/fitness/eco/device/model/api/EcoDeviceManagerInternalRemote;", "mDeviceManager$delegate", "Lkotlin/Lazy;", "TAG", "", "onConnectStart", "", "did", "mac", "onConnectFailure", "errorCode", "", "retryTimes", "onConnectSuccess", "onDisconnect", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EcoDeviceInfoUpdater implements OnEcoDeviceStatusListener {

    @NotNull
    private static final String TAG = "EcoDeviceInfoUpdater";

    @NotNull
    public static final EcoDeviceInfoUpdater INSTANCE = new EcoDeviceInfoUpdater();

    /* JADX INFO: renamed from: mDeviceManager$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy mDeviceManager = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: or7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoDeviceInfoUpdater.mDeviceManager_delegate$lambda$0();
        }
    });

    private EcoDeviceInfoUpdater() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EcoDeviceManagerRemoteImpl mDeviceManager_delegate$lambda$0() {
        return EcoInstanceExtKt.getInstance(EcoDeviceManagerRemoteImpl.INSTANCE);
    }

    @NotNull
    public final EcoDeviceManagerInternalRemote getMDeviceManager() {
        return (EcoDeviceManagerInternalRemote) mDeviceManager.getValue();
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onConnectFailure(@Nullable String did, @NotNull String mac, int errorCode, int retryTimes) {
        Intrinsics.checkNotNullParameter(mac, "mac");
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onConnectStart(@Nullable String did, @NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onConnectSuccess(@Nullable String did, @NotNull String mac) {
        EcoDevice ecoDevice;
        Intrinsics.checkNotNullParameter(mac, "mac");
        if (TextUtils.isEmpty(did)) {
            return;
        }
        EcoDeviceManager.Companion companion = EcoDeviceManager.INSTANCE;
        EcoDeviceManager ecoDeviceManagerExtKt = EcoDeviceManagerExtKt.getInstance(companion);
        Intrinsics.checkNotNull(did);
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) ecoDeviceManagerExtKt.getDeviceModel(did);
        if (Intrinsics.areEqual(ecoDeviceModel != null ? ecoDeviceModel.getDid() : null, did) && (ecoDevice = (EcoDevice) ecoDeviceModel.getDeviceInfo().device) != null) {
            Device.Detail detail = ecoDevice.getDetail();
            String phoneId = detail != null ? detail.getPhoneId() : null;
            String uniqueIdentify = EcoDeviceManagerExtKt.getInstance(companion).getUniqueIdentify();
            Logger.i(TAG, "onConnectSuccess: report id = " + uniqueIdentify + ", phone id = " + phoneId);
            if (phoneId == null || !Intrinsics.areEqual(uniqueIdentify, phoneId)) {
                Device.Detail detail2 = ecoDevice.getDetail();
                if (detail2 != null) {
                    detail2.setPhoneId(uniqueIdentify);
                }
                getMDeviceManager().updateDevice(ecoDevice);
            }
        }
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onDisconnect(@Nullable String did, @NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
    }
}
