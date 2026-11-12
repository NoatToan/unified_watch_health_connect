package com.xiaomi.fit.eco.device.model;

import com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt;
import com.xiaomi.fit.eco.device.model.EcoLocalSportDeviceModel;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ByteUtil;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDeviceInfo;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoLocalDevice;
import defpackage.asc;
import defpackage.et7;
import defpackage.qj7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0014\u001a\u00020\tJ\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\fJ\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0002J\u0010\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\fH\u0016J\b\u0010\u001d\u001a\u00020\u0011H\u0016J\b\u0010\u001e\u001a\u00020\u0011H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fit/eco/device/model/EcoLocalSportDeviceModel;", "Lcom/xiaomi/fit/eco/device/model/EcoBluetoothDeviceModel;", "deviceInfo", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;", "<init>", "(Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;)V", "mAppDeviceId", "", "mToken", "", "mOOB", "isFinishSyncData", "", "isConnectPageMode", "lastDisconnectTime", "", "initLocalBindDeviceInfo", "", "appDeviceId", "oob", "token", "setConnectPageMode", "connectPageMode", "mergeDeviceStatus", "status", "", "syncDataOnConnected", "destroy", "isRemoved", "connectDevice", "disconnectDevice", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EcoLocalSportDeviceModel extends EcoBluetoothDeviceModel {
    private boolean isConnectPageMode;
    private boolean isFinishSyncData;
    private long lastDisconnectTime;

    @Nullable
    private String mAppDeviceId;

    @Nullable
    private String mOOB;
    private byte[] mToken;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcoLocalSportDeviceModel(@NotNull EcoDeviceInfo deviceInfo) {
        super(deviceInfo);
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        EcoBaseDeviceModel.TAG = "[EcoLocalSportDeviceModel]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void connectDevice$lambda$0(int i, String str) {
        EcoDeviceModelExtKt.logd("local device connect status = " + i + " message = " + str);
    }

    private final void syncDataOnConnected() {
        this.lastDisconnectTime = 0L;
    }

    @Override // com.xiaomi.fit.eco.device.model.EcoBluetoothDeviceModel, com.xiaomi.fitness.eco.device.model.api.EcoDeviceModelInternal
    public void connectDevice() {
        String userId = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId();
        if (!(getDeviceInfo().device instanceof EcoLocalDevice)) {
            Logger.i(EcoBaseDeviceModel.TAG, "connect device is not local device to research");
            return;
        }
        T t = getDeviceInfo().device;
        Intrinsics.checkNotNull(t, "null cannot be cast to non-null type com.xiaomi.fitness.eco.device.manager.export.bean.EcoLocalDevice");
        EcoLocalDevice ecoLocalDevice = (EcoLocalDevice) t;
        EcoDeviceModelExtKt.logi(EcoBaseDeviceModel.TAG, "connect() called " + getDeviceInfo());
        asc mEcoApiCall = getMEcoApiCall();
        String appToken = ecoLocalDevice.getAppToken();
        if (appToken == null) {
            appToken = "";
        }
        mEcoApiCall.g(userId, ByteUtil.stringToBytes(appToken), ecoLocalDevice.getAppDeviceId(), getDeviceInfo().getOob(), 1, new qj7() { // from class: vu7
            @Override // defpackage.qj7
            public final void b(int i, String str) {
                EcoLocalSportDeviceModel.connectDevice$lambda$0(i, str);
            }
        });
    }

    @Override // com.xiaomi.fit.eco.device.model.EcoBluetoothDeviceModel, com.xiaomi.fit.eco.device.model.EcoBaseDeviceModel, com.xiaomi.fitness.device.manager.DeviceModel
    public void destroy(boolean isRemoved) {
        super.destroy(isRemoved);
    }

    @Override // com.xiaomi.fit.eco.device.model.EcoBluetoothDeviceModel, com.xiaomi.fitness.eco.device.model.api.EcoDeviceModelInternal
    public void disconnectDevice() {
        Logger.i(EcoBaseDeviceModel.TAG, "disconnect() called");
        getMEcoApiCall().e(new et7() { // from class: com.xiaomi.fit.eco.device.model.EcoLocalSportDeviceModel.disconnectDevice.1
            @Override // defpackage.et7
            public /* bridge */ /* synthetic */ void onDisconnectFailure(int i) {
                super.onDisconnectFailure(i);
            }

            @Override // defpackage.et7
            public void onDisconnectSuccess() {
                Logger.i(EcoBaseDeviceModel.TAG, "onDisconnectSuccess() called");
            }
        });
    }

    public final void initLocalBindDeviceInfo(@NotNull String appDeviceId, @Nullable String oob, @NotNull byte[] token) {
        Intrinsics.checkNotNullParameter(appDeviceId, "appDeviceId");
        Intrinsics.checkNotNullParameter(token, "token");
        this.mAppDeviceId = appDeviceId;
        this.mToken = token;
        this.mOOB = oob;
    }

    @Override // com.xiaomi.fit.eco.device.model.EcoBluetoothDeviceModel
    public void mergeDeviceStatus(int status) {
        super.mergeDeviceStatus(status);
        setDeviceStatus(status);
        if (status == 3) {
            syncDataOnConnected();
        }
    }

    public final void setConnectPageMode(boolean connectPageMode) {
        this.isConnectPageMode = connectPageMode;
    }
}
