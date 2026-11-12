package com.xiaomi.hm.health.bt.profile.dfu;

import com.alipay.sdk.m.l.c;
import com.xiaomi.hm.health.bt.profile.base.LEParams;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0002H&J\b\u0010\t\u001a\u00020\u0002H&J\b\u0010\u000b\u001a\u00020\nH&J\u0012\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\f\u001a\u00020\u0002H&J<\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018H&J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0002H&J\b\u0010\u001f\u001a\u00020\u0005H&J\u0010\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H&J\b\u0010$\u001a\u00020#H&J\b\u0010%\u001a\u00020\u0002H&J\n\u0010'\u001a\u0004\u0018\u00010&H&J\b\u0010(\u001a\u00020\u0002H&J\u0012\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010)\u001a\u00020\u0011H&J\b\u0010,\u001a\u00020\u0011H&J\n\u0010.\u001a\u0004\u0018\u00010-H&J\u0010\u00100\u001a\u00020\u00022\u0006\u0010/\u001a\u00020-H&¨\u00061"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/dfu/DfuApi;", "", "", "isRunning", "running", "", "setRunning", "clear", "initApi", "deInit", "Lcom/xiaomi/hm/health/bt/profile/dfu/DfuProtocolInfo;", "queryProtocolInfo", "inDfu", "Lcom/xiaomi/hm/health/bt/profile/dfu/UpgradeStatueResponse;", "queryUpgradeStatus", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareType;", "firmwareType", "", "firmwareSize", "", "firmwareCRC32", "chunkSize", "Lcom/xiaomi/hm/health/bt/profile/dfu/UpgradeModel;", "mode", "Lcom/xiaomi/hm/health/bt/profile/dfu/ContinueModeExtraInfo;", "continueModeExtraInfo", "Lcom/xiaomi/hm/health/bt/profile/dfu/PrepareResponse;", "prepareTransfer", "fromBreakpoint", "Lcom/xiaomi/hm/health/bt/profile/dfu/StartTransferResponse;", "startTransfer", "stopTransfer", "", "byteArray", "transferData", "Lcom/xiaomi/hm/health/bt/profile/dfu/TransferContinueResponse;", "transferContinue", c.j, "Lcom/xiaomi/hm/health/bt/profile/dfu/ValidateResponse;", "getValidateResponse", "upgrade", "timeout", "Lcom/xiaomi/hm/health/bt/profile/dfu/UpgradeResponse;", "getUpgradeResponse", "getChannelMtu", "Lcom/xiaomi/hm/health/bt/profile/base/LEParams;", "getLEParams", "leParams", "setLEParams", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface DfuApi {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ PrepareResponse prepareTransfer$default(DfuApi dfuApi, HMFirmwareType hMFirmwareType, int i, long j, int i2, UpgradeModel upgradeModel, ContinueModeExtraInfo continueModeExtraInfo, int i3, Object obj) {
            if (obj == null) {
                return dfuApi.prepareTransfer(hMFirmwareType, i, j, i2, upgradeModel, (i3 & 32) != 0 ? null : continueModeExtraInfo);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prepareTransfer");
        }

        public static /* synthetic */ UpgradeStatueResponse queryUpgradeStatus$default(DfuApi dfuApi, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryUpgradeStatus");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            return dfuApi.queryUpgradeStatus(z);
        }
    }

    void clear();

    boolean deInit();

    int getChannelMtu();

    @Nullable
    LEParams getLEParams();

    @Nullable
    UpgradeResponse getUpgradeResponse(int timeout);

    @Nullable
    ValidateResponse getValidateResponse();

    boolean initApi();

    boolean isRunning();

    @NotNull
    PrepareResponse prepareTransfer(@NotNull HMFirmwareType firmwareType, int firmwareSize, long firmwareCRC32, int chunkSize, @NotNull UpgradeModel mode, @Nullable ContinueModeExtraInfo continueModeExtraInfo);

    @NotNull
    DfuProtocolInfo queryProtocolInfo();

    @NotNull
    UpgradeStatueResponse queryUpgradeStatus(boolean inDfu);

    boolean setLEParams(@NotNull LEParams leParams);

    void setRunning(boolean running);

    @NotNull
    StartTransferResponse startTransfer(boolean fromBreakpoint);

    void stopTransfer();

    @NotNull
    TransferContinueResponse transferContinue();

    boolean transferData(@NotNull byte[] byteArray);

    boolean upgrade();

    boolean validate();
}
