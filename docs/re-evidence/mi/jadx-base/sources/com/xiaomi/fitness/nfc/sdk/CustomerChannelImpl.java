package com.xiaomi.fitness.nfc.sdk;

import android.content.Context;
import com.miui.tsmclient.util.Constants;
import com.tsmclient.smartcard.Coder;
import com.tsmclient.smartcard.terminal.external.IChannel;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.common.utils.ByteUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.nfc.bean.NfcResponse;
import defpackage.ssg;
import defpackage.vqg;
import java.io.IOException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\u0014\u0010\u0015\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0007H\u0002J\f\u0010\u0017\u001a\u00020\u0013*\u00020\u0018H\u0002R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/nfc/sdk/CustomerChannelImpl;", "Lcom/tsmclient/smartcard/terminal/external/IChannel;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "SEND_SIZE", "", "getSEND_SIZE", "()I", "setSEND_SIZE", "(I)V", "RESP_SIZE", "getRESP_SIZE", "setRESP_SIZE", "open", "", Constants.EXTRA_CLOSE_TAI, "transceive", "", "apdu", "addPacketIndex", "index", "hexToBytes", "", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CustomerChannelImpl implements IChannel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static boolean isTransferOutOption;
    private int RESP_SIZE;
    private int SEND_SIZE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/nfc/sdk/CustomerChannelImpl$Companion;", "", "<init>", "()V", "isTransferOutOption", "", "()Z", "setTransferOutOption", "(Z)V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isTransferOutOption() {
            return CustomerChannelImpl.isTransferOutOption;
        }

        public final void setTransferOutOption(boolean z) {
            CustomerChannelImpl.isTransferOutOption = z;
        }
    }

    public CustomerChannelImpl(@Nullable Context context) {
    }

    private final byte[] addPacketIndex(byte[] bArr, int i) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%04x", Arrays.copyOf(new Object[]{Integer.valueOf(i % Integer.parseInt("FFFF", 16))}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        String strSubstring = str.substring(2, 4);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String strSubstring2 = str.substring(0, 2);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        return ArraysKt___ArraysJvmKt.plus(hexToBytes(strSubstring + strSubstring2), bArr);
    }

    private final byte[] hexToBytes(String str) {
        return ByteUtil.hexStringToBytes(StringsKt__StringsJVMKt.replace$default(str, " ", "", false, 4, (Object) null));
    }

    @Override // com.tsmclient.smartcard.terminal.external.IChannel
    public void close() throws InterruptedException, IOException {
        vqg.a("all send size = " + this.SEND_SIZE + "， receive size = " + this.RESP_SIZE);
        vqg.a("--------------------Customer channel close ----------------------");
        this.SEND_SIZE = 0;
        this.RESP_SIZE = 0;
        try {
            ssg.u().c(SportReportBaseParser.ReportType.divingOTU, null);
        } catch (IOException e) {
            throw e;
        } catch (InterruptedException e2) {
            throw e2;
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public final int getRESP_SIZE() {
        return this.RESP_SIZE;
    }

    public final int getSEND_SIZE() {
        return this.SEND_SIZE;
    }

    @Override // com.tsmclient.smartcard.terminal.external.IChannel
    public void open() throws InterruptedException, IOException {
        this.SEND_SIZE = 0;
        this.RESP_SIZE = 0;
        vqg.a("--------------------Customer channel open ----------------------");
        try {
            ssg.u().c(192, null);
        } catch (IOException e) {
            throw e;
        } catch (InterruptedException e2) {
            throw e2;
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public final void setRESP_SIZE(int i) {
        this.RESP_SIZE = i;
    }

    public final void setSEND_SIZE(int i) {
        this.SEND_SIZE = i;
    }

    @Override // com.tsmclient.smartcard.terminal.external.IChannel
    @NotNull
    public byte[] transceive(@Nullable byte[] apdu) throws Exception {
        if (apdu == null) {
            vqg.a("指令为空");
            close();
            throw new IOException("指令为空");
        }
        int i = 0;
        byte[] bArr = new byte[0];
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, apdu.length - 1, 512);
        if (progressionLastElement < 0) {
            return bArr;
        }
        byte[] bArrPlus = bArr;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            int i4 = i2 + 512;
            byte[] bArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(apdu, i2, RangesKt___RangesKt.coerceAtMost(apdu.length, i4));
            vqg.d("execute in data size:" + bArrCopyOfRange.length);
            vqg.d("request part data:" + Coder.bytesToHexString(bArrCopyOfRange));
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            ssg ssgVarU = ssg.u();
            if (wearableDeviceModel != null && DeviceModelExtKt.isL66(wearableDeviceModel)) {
                bArrCopyOfRange = addPacketIndex(bArrCopyOfRange, i);
            }
            NfcResponse nfcResponseG = ssgVarU.g(bArrCopyOfRange);
            if (nfcResponseG.mStatus != 1) {
                vqg.d("execute son data error");
                throw new IOException("execute son data error");
            }
            byte[] mData = nfcResponseG.mData;
            Intrinsics.checkNotNullExpressionValue(mData, "mData");
            bArrPlus = ArraysKt___ArraysJvmKt.plus(bArrPlus, mData);
            if (i2 == progressionLastElement) {
                return bArrPlus;
            }
            i = i3;
            i2 = i4;
        }
    }
}
