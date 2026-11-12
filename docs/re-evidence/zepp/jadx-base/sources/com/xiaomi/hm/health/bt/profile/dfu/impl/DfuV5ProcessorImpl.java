package com.xiaomi.hm.health.bt.profile.dfu.impl;

import com.huami.bluetooth.utils.BufByteDecoder;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import com.xiaomi.hm.health.bt.profile.dfu.DfuApi;
import com.xiaomi.hm.health.bt.profile.dfu.DfuProtocolInfo;
import com.xiaomi.hm.health.bt.profile.dfu.DfuV5Processor;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareInfo;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import com.xiaomi.hm.health.bt.profile.dfu.IFirmwareInterruptedUpgradeCallback;
import com.xiaomi.hm.health.bt.profile.dfu.IFirmwareUpgradeCallback;
import com.xiaomi.hm.health.bt.profile.dfu.PrepareResponse;
import com.xiaomi.hm.health.bt.profile.dfu.StartTransferResponse;
import com.xiaomi.hm.health.bt.profile.dfu.TransferContinueResponse;
import com.xiaomi.hm.health.bt.profile.dfu.UpgradeModel;
import com.xiaomi.hm.health.bt.profile.dfu.UpgradeResponse;
import com.xiaomi.hm.health.bt.profile.dfu.UpgradeStatueResponse;
import com.xiaomi.hm.health.bt.profile.dfu.UpgradeStatus;
import com.xiaomi.hm.health.bt.profile.dfu.ValidateResponse;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.bt.profile.observe.LogObservable;
import com.xiaomi.hm.health.bt.utils.CRCUtilsKt;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J/\u0010\u0011\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/dfu/impl/DfuV5ProcessorImpl;", "Lcom/xiaomi/hm/health/bt/profile/dfu/DfuV5Processor;", "Lcom/xiaomi/hm/health/bt/profile/dfu/DfuApi;", "api", "", "byteArray", "", "mtu", "", "a", "dfuApi", "Lcom/xiaomi/hm/health/bt/profile/dfu/DfuProtocolInfo;", "protocolInfo", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareInfo;", "info", "Lcom/xiaomi/hm/health/bt/profile/dfu/IFirmwareUpgradeCallback;", "callback", "upgrade", "(Lcom/xiaomi/hm/health/bt/profile/dfu/DfuApi;Lcom/xiaomi/hm/health/bt/profile/dfu/DfuProtocolInfo;Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareInfo;Lcom/xiaomi/hm/health/bt/profile/dfu/IFirmwareUpgradeCallback;)Ljava/lang/Boolean;", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class DfuV5ProcessorImpl extends DfuV5Processor {

    @NotNull
    private static final String d = "DfuV5ProcessorImpl";

    private final boolean a(DfuApi api, byte[] byteArray, int mtu) {
        BufByteDecoder bufByteDecoder = new BufByteDecoder(byteArray, 0, 2, null);
        while (bufByteDecoder.remain() > 0) {
            byte[] bytesGreedy = bufByteDecoder.readBytesGreedy(mtu);
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean zTransferData = api.transferData(bytesGreedy);
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() - jCurrentTimeMillis);
            if (iCurrentTimeMillis >= 3000) {
                Debug.fi(d, "Send chunk:" + zTransferData + ",time usage:" + iCurrentTimeMillis);
            }
            if (!zTransferData) {
                Debug.fi(d, "write firmware data failed!!!");
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.bt.profile.dfu.DfuV5Processor
    @NotNull
    public Boolean upgrade(@NotNull DfuApi dfuApi, @NotNull DfuProtocolInfo protocolInfo, @NotNull HMFirmwareInfo info, @NotNull IFirmwareUpgradeCallback callback) throws Exception {
        int size;
        boolean z;
        String str;
        IFirmwareUpgradeCallback iFirmwareUpgradeCallback;
        ValidateResponse validateResponse;
        UpgradeResponse upgradeResponse;
        String string;
        GattPeripheral peripheral;
        GattPeripheral peripheral2;
        String string2;
        TransferContinueResponse transferContinueResponseTransferContinue;
        int i;
        IFirmwareUpgradeCallback iFirmwareUpgradeCallback2 = callback;
        Debug.fi("coderJay", Intrinsics.stringPlus("fwType: ", info.getFwType()));
        String string3 = protocolInfo.toString();
        String str2 = d;
        Debug.fi(d, string3);
        int i2 = 0;
        UpgradeStatueResponse upgradeStatueResponseQueryUpgradeStatus$default = DfuApi.DefaultImpls.queryUpgradeStatus$default(dfuApi, false, 1, null);
        Debug.fi(d, upgradeStatueResponseQueryUpgradeStatus$default.toString());
        if (!upgradeStatueResponseQueryUpgradeStatus$default.isOk() || (upgradeStatueResponseQueryUpgradeStatus$default.getUpgradeStatus() != UpgradeStatus.IDLE && upgradeStatueResponseQueryUpgradeStatus$default.getUpgradeStatus() != UpgradeStatus.WAITING_NEXT_FIRMWARE)) {
            return Boolean.FALSE;
        }
        int iCalculateFirmwareSize = calculateFirmwareSize(info);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(info.getFwPath()));
        long crc32 = CRCUtilsKt.getCrc32(info.getFwPath(), bufferedInputStream.available());
        PrepareResponse prepareResponsePrepareTransfer = dfuApi.prepareTransfer(info.getFwType(), iCalculateFirmwareSize, crc32, protocolInfo.getMaxChunkSize(), info.getUpgradeModel(), info.getContinueModeExtraInfo());
        Debug.fi(d, prepareResponsePrepareTransfer.toString());
        if (!prepareResponsePrepareTransfer.isOk()) {
            iFirmwareUpgradeCallback2.onError(prepareResponsePrepareTransfer.getCode());
            return Boolean.FALSE;
        }
        if (prepareResponsePrepareTransfer.getReceiveSize() <= 0 || CRCUtilsKt.getCrc32(info.getFwPath(), prepareResponsePrepareTransfer.getReceiveSize()) != prepareResponsePrepareTransfer.getReceiveDataCrc()) {
            size = 0;
            z = false;
        } else {
            bufferedInputStream.skip(prepareResponsePrepareTransfer.getReceiveSize());
            size = prepareResponsePrepareTransfer.getReceiveSize();
            z = true;
        }
        Debug.fi(d, "total size:" + iCalculateFirmwareSize + ",total crc:" + crc32 + ",device size:" + prepareResponsePrepareTransfer.getReceiveSize() + ",device crc:" + prepareResponsePrepareTransfer.getReceiveDataCrc());
        StartTransferResponse startTransferResponseStartTransfer = dfuApi.startTransfer(z);
        Debug.fi(d, Intrinsics.stringPlus("start transfer result:", startTransferResponseStartTransfer));
        if (!startTransferResponseStartTransfer.isOk()) {
            return Boolean.FALSE;
        }
        iFirmwareUpgradeCallback2.onFwProgress(new Progress(iCalculateFirmwareSize, size));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (size != iCalculateFirmwareSize) {
            while (true) {
                if ((iFirmwareUpgradeCallback2 instanceof IFirmwareInterruptedUpgradeCallback) && ((IFirmwareInterruptedUpgradeCallback) iFirmwareUpgradeCallback2).onInterrupted()) {
                    Debug.fi(d, "Transfer is actively interrupted");
                    return Boolean.FALSE;
                }
                byte[] bArr = new byte[protocolInfo.getMaxChunkSize()];
                int i3 = bufferedInputStream.read(bArr, i2, protocolInfo.getMaxChunkSize());
                if (i3 < 1) {
                    Debug.fi(d, Intrinsics.stringPlus("read firmware data size:", Integer.valueOf(i3)));
                    break;
                }
                int channelMtu = dfuApi.getChannelMtu();
                while (true) {
                    if (!a(dfuApi, ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(i2, i3 - 1)), channelMtu)) {
                        Debug.fi(d, "write chunk failed!!!");
                        return Boolean.FALSE;
                    }
                    transferContinueResponseTransferContinue = dfuApi.transferContinue();
                    Debug.fi(d, transferContinueResponseTransferContinue.toString());
                    i = i3 + size;
                    if (transferContinueResponseTransferContinue.getSize() == i || !transferContinueResponseTransferContinue.isRetry()) {
                        break;
                    }
                    Debug.fi(d, "Retry transfer last chunk");
                    i2 = 0;
                }
                if (transferContinueResponseTransferContinue.getSize() != i) {
                    Debug.fi(d, "Transfer error, already send " + size + " of total " + iCalculateFirmwareSize);
                    return Boolean.FALSE;
                }
                size = transferContinueResponseTransferContinue.getSize();
                iFirmwareUpgradeCallback2.onFwProgress(new Progress(iCalculateFirmwareSize, size));
                if (size == iCalculateFirmwareSize) {
                    break;
                }
                i2 = 0;
            }
        }
        recordTransferRate(iCalculateFirmwareSize - prepareResponsePrepareTransfer.getReceiveSize(), System.currentTimeMillis() - jCurrentTimeMillis);
        boolean zValidate = dfuApi.validate();
        Debug.fi(d, Intrinsics.stringPlus("Validate cmd:", Boolean.valueOf(zValidate)));
        LogObservable logObservable = getLogObservable();
        if (logObservable != null) {
            logObservable.onLogMessage(Intrinsics.stringPlus("Validate cmd:", Boolean.valueOf(zValidate)));
        }
        if (!zValidate) {
            return Boolean.FALSE;
        }
        while (true) {
            str = str2;
            iFirmwareUpgradeCallback = iFirmwareUpgradeCallback2;
            boolean zQueryDfuState$default = DfuV5Processor.queryDfuState$default(this, dfuApi, UpgradeStatus.VALIDATING, null, 4, null);
            validateResponse = dfuApi.getValidateResponse();
            if (!zQueryDfuState$default || validateResponse != null) {
                break;
            }
            iFirmwareUpgradeCallback2 = iFirmwareUpgradeCallback;
            str2 = str;
        }
        String str3 = "Validate no response";
        if (validateResponse != null && (string2 = validateResponse.toString()) != null) {
            str3 = string2;
        }
        Debug.fi(str, str3);
        if (validateResponse == null || (!validateResponse.isOk())) {
            return Boolean.FALSE;
        }
        boolean z2 = dfuApi instanceof HMBaseProfile;
        HMBaseProfile hMBaseProfile = z2 ? (HMBaseProfile) dfuApi : null;
        if (hMBaseProfile != null && (peripheral2 = hMBaseProfile.getPeripheral()) != null) {
            peripheral2.enableRefreshGatt(true);
        }
        if (info.getUpgradeModel() == UpgradeModel.BACKGROUND) {
            return Boolean.TRUE;
        }
        HMBaseProfile hMBaseProfile2 = z2 ? (HMBaseProfile) dfuApi : null;
        if (hMBaseProfile2 != null && (peripheral = hMBaseProfile2.getPeripheral()) != null) {
            peripheral.enableRefreshGatt(true);
        }
        boolean zUpgrade = dfuApi.upgrade();
        Debug.fi(str, Intrinsics.stringPlus("Upgrade command: ", Boolean.valueOf(zUpgrade)));
        if (!zUpgrade) {
            return Boolean.FALSE;
        }
        int i4 = info.getFwType() == HMFirmwareType.FIRMWARE_DIAL ? 1000 : 15000;
        do {
            boolean zQueryDfuState = queryDfuState(dfuApi, UpgradeStatus.IN_UPGRADING, iFirmwareUpgradeCallback);
            upgradeResponse = dfuApi.getUpgradeResponse(i4);
            if (!zQueryDfuState) {
                break;
            }
        } while (upgradeResponse == null);
        try {
            Thread.sleep(2000L);
        } catch (Exception e) {
            Debug.fi(str, Intrinsics.stringPlus("delay exception: ", e));
            LogObservable logObservable2 = getLogObservable();
            if (logObservable2 != null) {
                logObservable2.onLogMessage(Intrinsics.stringPlus("upgrade error. ", e));
            }
        }
        if (upgradeResponse != null && (!upgradeResponse.isOk())) {
            iFirmwareUpgradeCallback.onError(upgradeResponse.getCode());
        }
        String str4 = "Upgrade no response";
        if (upgradeResponse != null && (string = upgradeResponse.toString()) != null) {
            str4 = string;
        }
        Debug.fi(str, str4);
        LogObservable logObservable3 = getLogObservable();
        if (logObservable3 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("upgrade response --> [");
            sb.append(upgradeResponse == null ? null : Boolean.valueOf(upgradeResponse.isOk()));
            sb.append(JsonLexerKt.END_LIST);
            logObservable3.onLogMessage(sb.toString());
        }
        return Boolean.valueOf(upgradeResponse == null ? false : upgradeResponse.isOk());
    }
}
