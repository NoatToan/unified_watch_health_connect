package com.xiaomi.hm.health.bt.profile.dfu;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J$\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J8\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/dfu/DfuUpgradeApiImp;", "Lcom/xiaomi/hm/health/bt/profile/dfu/DfuUpgradeApi;", "Lcom/xiaomi/hm/health/bt/profile/dfu/DfuApi;", "dfuApi", "", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/bt/profile/dfu/IFirmwareUpgradeCallback;", "callback", "c", "Lcom/xiaomi/hm/health/bt/profile/dfu/UpgradeStatus;", "targetStatus", "a", "Lcom/xiaomi/hm/health/bt/profile/dfu/DfuProtocolInfo;", "protocolInfo", "", "totalSize", "", "crc32", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareType;", "type", "upgrade", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class DfuUpgradeApiImp implements DfuUpgradeApi {

    @NotNull
    private static final String a = "DfuUpgradeApiImp";

    private final boolean a(DfuApi dfuApi, UpgradeStatus targetStatus, IFirmwareUpgradeCallback callback) throws Exception {
        UpgradeStatueResponse upgradeStatueResponseQueryUpgradeStatus$default = DfuApi.DefaultImpls.queryUpgradeStatus$default(dfuApi, false, 1, null);
        Debug.fi(a, upgradeStatueResponseQueryUpgradeStatus$default.toString());
        if (!upgradeStatueResponseQueryUpgradeStatus$default.isOk() || upgradeStatueResponseQueryUpgradeStatus$default.getUpgradeStatus() != targetStatus) {
            return false;
        }
        if (callback != null) {
            callback.upgradingProgress(HMFirmwareType.fromValue(upgradeStatueResponseQueryUpgradeStatus$default.getFirmwareType()), new Progress(upgradeStatueResponseQueryUpgradeStatus$default.getFirmwareSize(), upgradeStatueResponseQueryUpgradeStatus$default.getFirmwareUpgradedSize()));
        }
        return true;
    }

    public static /* synthetic */ boolean b(DfuUpgradeApiImp dfuUpgradeApiImp, DfuApi dfuApi, UpgradeStatus upgradeStatus, IFirmwareUpgradeCallback iFirmwareUpgradeCallback, int i, Object obj) throws Exception {
        if ((i & 4) != 0) {
            iFirmwareUpgradeCallback = null;
        }
        return dfuUpgradeApiImp.a(dfuApi, upgradeStatus, iFirmwareUpgradeCallback);
    }

    private final boolean c(DfuApi dfuApi, IFirmwareUpgradeCallback callback) throws Exception {
        UpgradeResponse upgradeResponse;
        String string;
        boolean zUpgrade = dfuApi.upgrade();
        Debug.fi(a, Intrinsics.stringPlus("Upgrade command: ", Boolean.valueOf(zUpgrade)));
        if (!zUpgrade) {
            return false;
        }
        do {
            boolean zA = a(dfuApi, UpgradeStatus.IN_UPGRADING, callback);
            upgradeResponse = dfuApi.getUpgradeResponse(15000);
            if (!zA) {
                break;
            }
        } while (upgradeResponse == null);
        String str = "Upgrade no response";
        if (upgradeResponse != null && (string = upgradeResponse.toString()) != null) {
            str = string;
        }
        Debug.fi(a, str);
        if (upgradeResponse == null) {
            return false;
        }
        return upgradeResponse.isOk();
    }

    private final boolean d(DfuApi dfuApi) throws Exception {
        ValidateResponse validateResponse;
        String string;
        boolean zValidate = dfuApi.validate();
        Debug.fi(a, Intrinsics.stringPlus("Validate cmd:", Boolean.valueOf(zValidate)));
        if (!zValidate) {
            return false;
        }
        do {
            boolean zB = b(this, dfuApi, UpgradeStatus.VALIDATING, null, 4, null);
            validateResponse = dfuApi.getValidateResponse();
            if (!zB) {
                break;
            }
        } while (validateResponse == null);
        String str = "Validate no response";
        if (validateResponse != null && (string = validateResponse.toString()) != null) {
            str = string;
        }
        Debug.fi(a, str);
        return validateResponse == null || !(validateResponse.isOk() ^ true);
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.DfuUpgradeApi
    public boolean upgrade(@NotNull DfuApi dfuApi, @NotNull DfuProtocolInfo protocolInfo, int totalSize, long crc32, @NotNull HMFirmwareType type, @NotNull IFirmwareUpgradeCallback callback) {
        Debug.fi(a, "totalSize:" + totalSize + ",crc32:" + crc32 + ",type:" + type);
        UpgradeStatueResponse upgradeStatueResponseQueryUpgradeStatus$default = DfuApi.DefaultImpls.queryUpgradeStatus$default(dfuApi, false, 1, null);
        Debug.fi(a, upgradeStatueResponseQueryUpgradeStatus$default.toString());
        if (!upgradeStatueResponseQueryUpgradeStatus$default.isOk() || upgradeStatueResponseQueryUpgradeStatus$default.getUpgradeStatus() != UpgradeStatus.IDLE) {
            callback.onError(upgradeStatueResponseQueryUpgradeStatus$default.getCode());
            return false;
        }
        PrepareResponse prepareResponsePrepareTransfer$default = DfuApi.DefaultImpls.prepareTransfer$default(dfuApi, type, totalSize, crc32, protocolInfo.getMaxChunkSize(), UpgradeModel.FOREGROUND, null, 32, null);
        Debug.fi(a, prepareResponsePrepareTransfer$default.toString());
        if (!prepareResponsePrepareTransfer$default.isOk()) {
            callback.onError(prepareResponsePrepareTransfer$default.getCode());
            return false;
        }
        StartTransferResponse startTransferResponseStartTransfer = dfuApi.startTransfer(true);
        Debug.fi(a, Intrinsics.stringPlus("start transfer result:", startTransferResponseStartTransfer));
        if (!startTransferResponseStartTransfer.isOk()) {
            callback.onError(startTransferResponseStartTransfer.getCode());
            return false;
        }
        if (d(dfuApi)) {
            return c(dfuApi, callback);
        }
        return false;
    }
}
