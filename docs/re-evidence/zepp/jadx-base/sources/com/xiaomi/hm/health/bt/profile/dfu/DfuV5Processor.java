package com.xiaomi.hm.health.bt.profile.dfu;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import com.xiaomi.hm.health.bt.profile.base.LEParams;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.bt.profile.observe.LogObservable;
import com.xiaomi.hm.health.bt.utils.CRCUtilsKt;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000 #2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b!\u0010\"J1\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0004J$\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0004J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0006H\u0004J\u0018\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0004R$\u0010 \u001a\u0004\u0018\u00010\u00198\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/dfu/DfuV5Processor;", "Lcom/xiaomi/hm/health/bt/profile/dfu/DfuProcessor;", "Lcom/xiaomi/hm/health/bt/profile/dfu/DfuApi;", "dfuApi", "Lcom/xiaomi/hm/health/bt/profile/dfu/DfuProtocolInfo;", "protocolInfo", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareInfo;", "info", "Lcom/xiaomi/hm/health/bt/profile/dfu/IFirmwareUpgradeCallback;", "callback", "", "process", "(Lcom/xiaomi/hm/health/bt/profile/dfu/DfuApi;Lcom/xiaomi/hm/health/bt/profile/dfu/DfuProtocolInfo;Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareInfo;Lcom/xiaomi/hm/health/bt/profile/dfu/IFirmwareUpgradeCallback;)Ljava/lang/Boolean;", "upgrade", "", "adjustConnectParams", "Lcom/xiaomi/hm/health/bt/profile/dfu/UpgradeStatus;", "targetStatus", "queryDfuState", "", "calculateFirmwareSize", "dataSize", "", "timeUsage", "recordTransferRate", "Lcom/xiaomi/hm/health/bt/profile/observe/LogObservable;", "a", "Lcom/xiaomi/hm/health/bt/profile/observe/LogObservable;", "getLogObservable", "()Lcom/xiaomi/hm/health/bt/profile/observe/LogObservable;", "setLogObservable", "(Lcom/xiaomi/hm/health/bt/profile/observe/LogObservable;)V", "logObservable", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class DfuV5Processor implements DfuProcessor {
    public static final long DELAY_DISCONNECT = 2000;
    public static final int DFU_CONN_INTERVAL_COUNT = 6;
    public static final int DFU_CONN_INTERVAL_MAX = 12;
    public static final int DFU_CONN_INTERVAL_MIN = 6;
    public static final int DFU_CONN_LATENCY = 0;
    public static final int DFU_CONN_TIMEOUT = 2000;
    public static final int TIMEOUT_DIAL_UPGRADE = 1000;

    @NotNull
    private static final String b = "DfuV5Processor";
    private static final long c = 5000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private LogObservable logObservable;

    public static /* synthetic */ boolean queryDfuState$default(DfuV5Processor dfuV5Processor, DfuApi dfuApi, UpgradeStatus upgradeStatus, IFirmwareUpgradeCallback iFirmwareUpgradeCallback, int i, Object obj) throws Exception {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryDfuState");
        }
        if ((i & 4) != 0) {
            iFirmwareUpgradeCallback = null;
        }
        return dfuV5Processor.queryDfuState(dfuApi, upgradeStatus, iFirmwareUpgradeCallback);
    }

    public final void adjustConnectParams(@NotNull DfuApi dfuApi) {
        Object objM3845constructorimpl;
        Object objM3845constructorimpl2;
        LEParams lEParams = dfuApi.getLEParams();
        Debug.fi(b, Intrinsics.stringPlus("leParams:", lEParams));
        if (lEParams == null) {
            Debug.fi(b, "waite default time");
            try {
                Result.Companion companion = Result.Companion;
                Thread.sleep(500L);
                objM3845constructorimpl2 = Result.m3845constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl2 = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl2) != null) {
                Debug.fi(b, "wait connect param adjust failed");
                return;
            }
            return;
        }
        if (lEParams.getConnIntMax() > 12) {
            LEParams lEParams2 = new LEParams(6, 12, 0, 2000);
            Debug.fi(b, Intrinsics.stringPlus("set connect params:", lEParams2));
            dfuApi.setLEParams(lEParams2);
            try {
                Result.Companion companion3 = Result.Companion;
                long jCeil = (long) Math.ceil(((double) (lEParams.getConnIntMax() * 1.25f)) * 6.0d);
                Debug.fi(b, "wait " + jCeil + "ms");
                Thread.sleep(jCeil);
                objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) != null) {
                Debug.fi(b, "wait connect param adjust failed");
            }
        }
    }

    public final int calculateFirmwareSize(@NotNull HMFirmwareInfo info) {
        return (int) new File(info.getFwPath()).length();
    }

    @Nullable
    public final LogObservable getLogObservable() {
        return this.logObservable;
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.DfuProcessor
    @Nullable
    public Boolean process(@NotNull DfuApi dfuApi, @NotNull DfuProtocolInfo protocolInfo, @NotNull HMFirmwareInfo info, @NotNull IFirmwareUpgradeCallback callback) {
        if (callback instanceof LogObservable) {
            this.logObservable = (LogObservable) callback;
        }
        return upgrade(dfuApi, protocolInfo, info, callback);
    }

    public final boolean queryDfuState(@NotNull DfuApi dfuApi, @NotNull UpgradeStatus targetStatus, @Nullable IFirmwareUpgradeCallback callback) throws Exception {
        try {
            UpgradeStatueResponse upgradeStatueResponseQueryUpgradeStatus$default = DfuApi.DefaultImpls.queryUpgradeStatus$default(dfuApi, false, 1, null);
            Debug.fi(b, upgradeStatueResponseQueryUpgradeStatus$default.toString());
            if (!upgradeStatueResponseQueryUpgradeStatus$default.isOk() || upgradeStatueResponseQueryUpgradeStatus$default.getUpgradeStatus() != targetStatus) {
                return false;
            }
            if (callback != null) {
                callback.upgradingProgress(HMFirmwareType.fromValue(upgradeStatueResponseQueryUpgradeStatus$default.getFirmwareType()), new Progress(upgradeStatueResponseQueryUpgradeStatus$default.getFirmwareSize(), upgradeStatueResponseQueryUpgradeStatus$default.getFirmwareUpgradedSize()));
            }
            return true;
        } catch (Exception e) {
            Debug.fi(b, "e: " + e + " 一般是固件异常");
            return false;
        }
    }

    public final void recordTransferRate(int dataSize, long timeUsage) {
        if (dataSize <= 0) {
            Debug.fi(b, "No data transfer");
            return;
        }
        if (timeUsage > 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Debug.fi(b, String.format(Locale.getDefault(), "DFU transfer rate: %.1f KBps", Arrays.copyOf(new Object[]{Float.valueOf(dataSize / timeUsage)}, 1)));
            return;
        }
        Debug.fi(b, "Transfer " + dataSize + " data less than one millis");
    }

    public final void setLogObservable(@Nullable LogObservable logObservable) {
        this.logObservable = logObservable;
    }

    /* JADX WARN: Code duplicated, block: B:154:0x01cb A[EDGE_INSN: B:154:0x01cb->B:57:0x01cb BREAK  A[LOOP:0: B:26:0x011e->B:56:0x01c5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x019e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x01bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0183  */
    /* JADX WARN: Code duplicated, block: B:48:0x0190  */
    /* JADX WARN: Code duplicated, block: B:52:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:56:0x01c5 A[LOOP:0: B:26:0x011e->B:56:0x01c5, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public Boolean upgrade(@NotNull DfuApi dfuApi, @NotNull DfuProtocolInfo protocolInfo, @NotNull HMFirmwareInfo info, @NotNull IFirmwareUpgradeCallback callback) throws Exception {
        int receiveSize;
        boolean z;
        String str;
        IFirmwareUpgradeCallback iFirmwareUpgradeCallback;
        ValidateResponse validateResponse;
        UpgradeResponse upgradeResponse;
        String string;
        GattPeripheral peripheral;
        GattPeripheral peripheral2;
        String string2;
        int channelMtu;
        byte[] bArr;
        int i;
        IFirmwareUpgradeCallback iFirmwareUpgradeCallback2 = callback;
        Debug.fi("coderJay", Intrinsics.stringPlus("fwType: ", info.getFwType()));
        iFirmwareUpgradeCallback2.onFwStart(0);
        String string3 = protocolInfo.toString();
        String str2 = b;
        Debug.fi(b, string3);
        UpgradeStatueResponse upgradeStatueResponseQueryUpgradeStatus$default = DfuApi.DefaultImpls.queryUpgradeStatus$default(dfuApi, false, 1, null);
        Debug.fi(b, upgradeStatueResponseQueryUpgradeStatus$default.toString());
        if (!upgradeStatueResponseQueryUpgradeStatus$default.isOk() || (upgradeStatueResponseQueryUpgradeStatus$default.getUpgradeStatus() != UpgradeStatus.IDLE && upgradeStatueResponseQueryUpgradeStatus$default.getUpgradeStatus() != UpgradeStatus.WAITING_NEXT_FIRMWARE)) {
            return Boolean.FALSE;
        }
        int iCalculateFirmwareSize = calculateFirmwareSize(info);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(info.getFwPath()));
        long crc32 = CRCUtilsKt.getCrc32(info.getFwPath());
        PrepareResponse prepareResponsePrepareTransfer = dfuApi.prepareTransfer(info.getFwType(), iCalculateFirmwareSize, crc32, protocolInfo.getMaxChunkSize(), info.getUpgradeModel(), info.getContinueModeExtraInfo());
        Debug.fi(b, prepareResponsePrepareTransfer.toString());
        if (!prepareResponsePrepareTransfer.isOk()) {
            iFirmwareUpgradeCallback2.onError(prepareResponsePrepareTransfer.getCode());
            return Boolean.FALSE;
        }
        if (prepareResponsePrepareTransfer.getReceiveSize() <= 0 || CRCUtilsKt.getCrc32(info.getFwPath(), prepareResponsePrepareTransfer.getReceiveSize()) != prepareResponsePrepareTransfer.getReceiveDataCrc()) {
            receiveSize = 0;
            z = false;
        } else {
            bufferedInputStream.skip(prepareResponsePrepareTransfer.getReceiveSize());
            receiveSize = prepareResponsePrepareTransfer.getReceiveSize();
            z = true;
        }
        Debug.fi(b, "total size:" + iCalculateFirmwareSize + ",total crc:" + crc32 + ",device size:" + prepareResponsePrepareTransfer.getReceiveSize() + ",device crc:" + prepareResponsePrepareTransfer.getReceiveDataCrc());
        StartTransferResponse startTransferResponseStartTransfer = dfuApi.startTransfer(z);
        Debug.fi(b, Intrinsics.stringPlus("start transfer result:", startTransferResponseStartTransfer));
        if (!startTransferResponseStartTransfer.isOk()) {
            return Boolean.FALSE;
        }
        iFirmwareUpgradeCallback2.onFwProgress(new Progress(iCalculateFirmwareSize, receiveSize));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (receiveSize != iCalculateFirmwareSize) {
            int i2 = 0;
            while (true) {
                if ((iFirmwareUpgradeCallback2 instanceof IFirmwareInterruptedUpgradeCallback) && ((IFirmwareInterruptedUpgradeCallback) iFirmwareUpgradeCallback2).onInterrupted()) {
                    Debug.fi(b, "Transfer is actively interrupted");
                    return Boolean.FALSE;
                }
                if (i2 == protocolInfo.getMaxChunkSize() || receiveSize == iCalculateFirmwareSize) {
                    TransferContinueResponse transferContinueResponseTransferContinue = dfuApi.transferContinue();
                    Debug.fi(b, transferContinueResponseTransferContinue.toString());
                    if (transferContinueResponseTransferContinue.getSize() < 0) {
                        Debug.fi(b, "Transfer error, already send " + receiveSize + " of total " + iCalculateFirmwareSize);
                        return Boolean.FALSE;
                    }
                    iFirmwareUpgradeCallback2.onFwProgress(new Progress(iCalculateFirmwareSize, receiveSize));
                    if (transferContinueResponseTransferContinue.getSize() != receiveSize) {
                        Debug.fi(b, "No need continue transfer");
                        break;
                    }
                    i2 = 0;
                    if (receiveSize == iCalculateFirmwareSize) {
                        break;
                    }
                    channelMtu = dfuApi.getChannelMtu();
                    if (i2 + channelMtu >= protocolInfo.getMaxChunkSize()) {
                        channelMtu = protocolInfo.getMaxChunkSize() - i2;
                    }
                    bArr = new byte[channelMtu];
                    i = bufferedInputStream.read(bArr, 0, channelMtu);
                    if (i < 1) {
                        Debug.fi(b, Intrinsics.stringPlus("read firmware data size:", Integer.valueOf(i)));
                        break;
                    }
                    if (!dfuApi.transferData(ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(0, i - 1)))) {
                        Debug.fi(b, "write firmware data failed!!!");
                        return Boolean.FALSE;
                    }
                    i2 += i;
                    receiveSize += i;
                } else {
                    if (receiveSize == iCalculateFirmwareSize) {
                        break;
                        break;
                    }
                    channelMtu = dfuApi.getChannelMtu();
                    if (i2 + channelMtu >= protocolInfo.getMaxChunkSize()) {
                        channelMtu = protocolInfo.getMaxChunkSize() - i2;
                    }
                    bArr = new byte[channelMtu];
                    i = bufferedInputStream.read(bArr, 0, channelMtu);
                    if (i < 1) {
                        Debug.fi(b, Intrinsics.stringPlus("read firmware data size:", Integer.valueOf(i)));
                        break;
                    }
                    if (!dfuApi.transferData(ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(0, i - 1)))) {
                        Debug.fi(b, "write firmware data failed!!!");
                        return Boolean.FALSE;
                    }
                    i2 += i;
                    receiveSize += i;
                }
            }
        }
        recordTransferRate(iCalculateFirmwareSize - prepareResponsePrepareTransfer.getReceiveSize(), System.currentTimeMillis() - jCurrentTimeMillis);
        boolean zValidate = dfuApi.validate();
        Debug.fi(b, Intrinsics.stringPlus("Validate cmd:", Boolean.valueOf(zValidate)));
        LogObservable logObservable = this.logObservable;
        if (logObservable != null) {
            logObservable.onLogMessage(Intrinsics.stringPlus("Validate cmd:", Boolean.valueOf(zValidate)));
        }
        if (!zValidate) {
            return Boolean.FALSE;
        }
        while (true) {
            str = str2;
            iFirmwareUpgradeCallback = iFirmwareUpgradeCallback2;
            boolean zQueryDfuState$default = queryDfuState$default(this, dfuApi, UpgradeStatus.VALIDATING, null, 4, null);
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
        int i3 = info.getFwType() == HMFirmwareType.FIRMWARE_DIAL ? 1000 : 15000;
        do {
            boolean zQueryDfuState = queryDfuState(dfuApi, UpgradeStatus.IN_UPGRADING, iFirmwareUpgradeCallback);
            upgradeResponse = dfuApi.getUpgradeResponse(i3);
            if (!zQueryDfuState) {
                break;
            }
        } while (upgradeResponse == null);
        try {
            Thread.sleep(2000L);
        } catch (Exception e) {
            Debug.fi(str, Intrinsics.stringPlus("delay exception: ", e));
            LogObservable logObservable2 = this.logObservable;
            if (logObservable2 != null) {
                logObservable2.onLogMessage(Intrinsics.stringPlus("upgrade error. ", e));
            }
        }
        if (upgradeResponse != null && (!upgradeResponse.isOk())) {
            iFirmwareUpgradeCallback.onError(Integer.valueOf(upgradeResponse.getCode()).intValue());
        }
        String str4 = "Upgrade no response";
        if (upgradeResponse != null && (string = upgradeResponse.toString()) != null) {
            str4 = string;
        }
        Debug.fi(str, str4);
        LogObservable logObservable3 = this.logObservable;
        if (logObservable3 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("upgrade response --> [");
            sb.append(upgradeResponse == null ? null : Boolean.valueOf(upgradeResponse.isOk()));
            sb.append(JsonLexerKt.END_LIST);
            logObservable3.onLogMessage(sb.toString());
        }
        return upgradeResponse == null ? Boolean.FALSE : Boolean.valueOf(upgradeResponse.isOk());
    }
}
