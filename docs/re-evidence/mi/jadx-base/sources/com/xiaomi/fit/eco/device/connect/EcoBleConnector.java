package com.xiaomi.fit.eco.device.connect;

import com.xiaomi.fit.eco.device.connect.EcoBleConnector;
import com.xiaomi.fit.eco.device.model.EcoBaseDeviceModel;
import com.xiaomi.fit.eco.device.utils.EcoBleUtil;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ByteUtil;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDevice;
import defpackage.asc;
import defpackage.et7;
import defpackage.qj7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fit/eco/device/connect/EcoBleConnector;", "Lcom/xiaomi/fit/eco/device/connect/EcoBaseConnector;", "", "connect", "()V", "disconnect", "Lcom/xiaomi/fit/eco/device/model/EcoBaseDeviceModel;", "deviceModel", "Lcom/xiaomi/fit/eco/device/model/EcoBaseDeviceModel;", "getDeviceModel", "()Lcom/xiaomi/fit/eco/device/model/EcoBaseDeviceModel;", "Lasc;", "apiCall", "<init>", "(Lcom/xiaomi/fit/eco/device/model/EcoBaseDeviceModel;Lasc;)V", "Companion", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class EcoBleConnector extends EcoBaseConnector {

    @NotNull
    private static final String TAG = "EcoBleConnector";

    @NotNull
    private final EcoBaseDeviceModel deviceModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcoBleConnector(@NotNull EcoBaseDeviceModel deviceModel, @NotNull asc apiCall) {
        super(apiCall);
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(apiCall, "apiCall");
        this.deviceModel = deviceModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void connect$lambda$0(int i, String str) {
        Logger.i("onConnectStatus: status=" + i + ",message:" + str, new Object[0]);
    }

    @Override // com.xiaomi.fitness.device.manager.export.DeviceConnector
    public void connect() {
        Device.Detail detail;
        if (getMApiCall().connectionType() != 2) {
            EcoBleUtil.INSTANCE.discovery();
        }
        String userId = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId();
        EcoDevice ecoDevice = (EcoDevice) this.deviceModel.getDeviceInfo().device;
        String encryptKey = (ecoDevice == null || (detail = ecoDevice.getDetail()) == null) ? null : detail.getEncryptKey();
        Logger.i(TAG, "connect() encryptKey : " + encryptKey);
        asc mApiCall = getMApiCall();
        if (encryptKey == null) {
            encryptKey = "";
        }
        mApiCall.d(userId, ByteUtil.stringToBytes(encryptKey), new qj7() { // from class: ri7
            @Override // defpackage.qj7
            public final void b(int i, String str) {
                EcoBleConnector.connect$lambda$0(i, str);
            }
        });
    }

    @Override // com.xiaomi.fit.eco.device.connect.EcoBaseConnector, com.xiaomi.fitness.device.manager.export.DeviceConnector
    public void disconnect() {
        Logger.i(TAG, "disconnect: ");
        getMApiCall().e(new et7() { // from class: com.xiaomi.fit.eco.device.connect.EcoBleConnector.disconnect.1
            @Override // defpackage.et7
            public /* bridge */ /* synthetic */ void onDisconnectFailure(int i) {
                super.onDisconnectFailure(i);
            }

            @Override // defpackage.et7
            public /* bridge */ /* synthetic */ void onDisconnectSuccess() {
                super.onDisconnectSuccess();
            }
        });
    }

    @NotNull
    public final EcoBaseDeviceModel getDeviceModel() {
        return this.deviceModel;
    }
}
