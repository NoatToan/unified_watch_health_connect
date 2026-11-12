package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J \u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¨\u0006\u0016"}, d2 = {"Lr7;", "Lq7;", "Lk7;", "dfuApi", "Lo7;", "protocolInfo", "Lxd;", "info", "Lyh;", "callback", "", PluginDeviceInfo.FDESC, "(Lk7;Lo7;Lxd;Lyh;)Ljava/lang/Boolean;", "", PluginDeviceInfo.FMODEL, "api", "", "byteArray", "", "mtu", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class r7 extends q7 {

    @NotNull
    public static final a c = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lr7$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void a(k7 dfuApi, yh callback) {
        int iC = dfuApi.c();
        if (iC != 1) {
            callback.onError(iC);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00fe  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.q7
    @NotNull
    public Boolean b(@NotNull k7 dfuApi, @NotNull DfuProtocolInfo protocolInfo, @NotNull xd info, @NotNull yh callback) throws IOException {
        boolean z;
        int size;
        String str;
        yh yhVar;
        ValidateResponse validateResponseF;
        String string;
        UpgradeResponse upgradeResponseB;
        String string2;
        jet peripheral;
        jet peripheral2;
        BufferedInputStream bufferedInputStream;
        TransferContinueResponse transferContinueResponseK;
        int i;
        yh callback2 = callback;
        Intrinsics.checkNotNullParameter(dfuApi, "dfuApi");
        Intrinsics.checkNotNullParameter(protocolInfo, "protocolInfo");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(callback2, "callback");
        t5t.d("coderJay", "fwType: " + info.h());
        String str2 = "DfuV5ProcessorImpl";
        t5t.d("DfuV5ProcessorImpl", protocolInfo.toString());
        UpgradeStatueResponse upgradeStatueResponseA = k7.a.a(dfuApi, false, 1, null);
        t5t.d("DfuV5ProcessorImpl", upgradeStatueResponseA.toString());
        if (!upgradeStatueResponseA.f() || (upgradeStatueResponseA.getUpgradeStatus() != UpgradeStatus.IDLE && upgradeStatueResponseA.getUpgradeStatus() != UpgradeStatus.WAITING_NEXT_FIRMWARE)) {
            return Boolean.FALSE;
        }
        int iA = a(info);
        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(info.g()));
        String strG = info.g();
        Intrinsics.checkNotNullExpressionValue(strG, "info.fwPath");
        long jA = f3.a(strG, bufferedInputStream2.available());
        yd ydVarH = info.h();
        Intrinsics.checkNotNullExpressionValue(ydVarH, "info.fwType");
        int maxChunkSize = protocolInfo.getMaxChunkSize();
        nv nvVarJ = info.j();
        Intrinsics.checkNotNullExpressionValue(nvVarJ, "info.upgradeModel");
        BufferedInputStream bufferedInputStream3 = bufferedInputStream2;
        PrepareResponse prepareResponseA = dfuApi.a(ydVarH, iA, jA, maxChunkSize, nvVarJ, info.e());
        t5t.d("DfuV5ProcessorImpl", prepareResponseA.toString());
        if (!prepareResponseA.d()) {
            callback2.onError(prepareResponseA.getCode());
            return Boolean.FALSE;
        }
        if (prepareResponseA.getReceiveSize() > 0) {
            String strG2 = info.g();
            Intrinsics.checkNotNullExpressionValue(strG2, "info.fwPath");
            if (f3.a(strG2, prepareResponseA.getReceiveSize()) == prepareResponseA.getReceiveDataCrc()) {
                bufferedInputStream3.skip(prepareResponseA.getReceiveSize());
                size = prepareResponseA.getReceiveSize();
                z = true;
            } else {
                z = false;
                size = 0;
            }
        } else {
            z = false;
            size = 0;
        }
        t5t.d("DfuV5ProcessorImpl", "total size:" + iA + ",total crc:" + jA + ",device size:" + prepareResponseA.getReceiveSize() + ",device crc:" + prepareResponseA.getReceiveDataCrc());
        StartTransferResponse startTransferResponseA = dfuApi.a(z);
        StringBuilder sb = new StringBuilder();
        sb.append("start transfer result:");
        sb.append(startTransferResponseA);
        t5t.d("DfuV5ProcessorImpl", sb.toString());
        if (!startTransferResponseA.b()) {
            return Boolean.FALSE;
        }
        callback2.onFwProgress(new Progress(iA, size));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (size != iA) {
            while (true) {
                if ((callback2 instanceof xh) && ((xh) callback2).a()) {
                    t5t.d("DfuV5ProcessorImpl", "Transfer is actively interrupted");
                    return Boolean.FALSE;
                }
                byte[] bArr = new byte[protocolInfo.getMaxChunkSize()];
                int i2 = bufferedInputStream3.read(bArr, 0, protocolInfo.getMaxChunkSize());
                if (i2 < 1) {
                    t5t.d("DfuV5ProcessorImpl", "read firmware data size:" + i2);
                    break;
                }
                int iE = dfuApi.e();
                while (true) {
                    bufferedInputStream = bufferedInputStream3;
                    if (!a(dfuApi, ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(0, i2 - 1)), iE)) {
                        t5t.d("DfuV5ProcessorImpl", "write chunk failed!!!");
                        a(dfuApi, callback2);
                        return Boolean.FALSE;
                    }
                    transferContinueResponseK = dfuApi.k();
                    t5t.d("DfuV5ProcessorImpl", transferContinueResponseK.toString());
                    i = i2 + size;
                    if (transferContinueResponseK.getSize() == i || !transferContinueResponseK.b()) {
                        break;
                    }
                    t5t.d("DfuV5ProcessorImpl", "Retry transfer last chunk");
                    bufferedInputStream3 = bufferedInputStream;
                }
                if (transferContinueResponseK.getSize() != i) {
                    t5t.d("DfuV5ProcessorImpl", "Transfer error, already send " + size + " of total " + iA);
                    a(dfuApi, callback2);
                    return Boolean.FALSE;
                }
                size = transferContinueResponseK.getSize();
                callback2.onFwProgress(new Progress(iA, size));
                if (size == iA) {
                    break;
                }
                bufferedInputStream3 = bufferedInputStream;
            }
        }
        a(iA - prepareResponseA.getReceiveSize(), System.currentTimeMillis() - jCurrentTimeMillis);
        boolean zH = dfuApi.h();
        t5t.d("DfuV5ProcessorImpl", "Validate cmd:" + zH);
        zat f31187a = getF31187a();
        if (f31187a != null) {
            f31187a.a("Validate cmd:" + zH);
        }
        if (!zH) {
            return Boolean.FALSE;
        }
        while (true) {
            str = str2;
            yhVar = callback2;
            boolean zA = q7.a(this, dfuApi, UpgradeStatus.VALIDATING, null, 4, null);
            validateResponseF = dfuApi.f();
            if (!zA || validateResponseF != null) {
                break;
            }
            callback2 = yhVar;
            str2 = str;
        }
        if (validateResponseF == null || (string = validateResponseF.toString()) == null) {
            string = "Validate no response";
        }
        t5t.d(str, string);
        if (validateResponseF == null || (!validateResponseF.b())) {
            if (validateResponseF != null) {
                yhVar.onError(validateResponseF.getCode());
            }
            return Boolean.FALSE;
        }
        boolean z2 = dfuApi instanceof a6t;
        a6t a6tVar = z2 ? (a6t) dfuApi : null;
        if (a6tVar != null && (peripheral2 = a6tVar.getPeripheral()) != null) {
            peripheral2.N(true);
        }
        if (info.j() == nv.BACKGROUND) {
            return Boolean.TRUE;
        }
        a6t a6tVar2 = z2 ? (a6t) dfuApi : null;
        if (a6tVar2 != null && (peripheral = a6tVar2.getPeripheral()) != null) {
            peripheral.N(true);
        }
        boolean zA2 = dfuApi.a();
        t5t.d(str, "Upgrade command: " + zA2);
        if (!zA2) {
            return Boolean.FALSE;
        }
        int i3 = info.h() == yd.FIRMWARE_DIAL ? 1000 : 15000;
        do {
            boolean zA3 = a(dfuApi, UpgradeStatus.IN_UPGRADING, yhVar);
            upgradeResponseB = dfuApi.b(i3);
            if (!zA3) {
                break;
            }
        } while (upgradeResponseB == null);
        try {
            Thread.sleep(VibrateModeProgressBar.sLongToLong);
        } catch (Exception e) {
            t5t.d(str, "delay exception: " + e);
            zat f31187a2 = getF31187a();
            if (f31187a2 != null) {
                f31187a2.a("upgrade error. " + e);
            }
        }
        if (upgradeResponseB != null && (!upgradeResponseB.b())) {
            yhVar.onError(upgradeResponseB.getCode());
        }
        if (upgradeResponseB == null || (string2 = upgradeResponseB.toString()) == null) {
            string2 = "Upgrade no response";
        }
        t5t.d(str, string2);
        zat f31187a3 = getF31187a();
        if (f31187a3 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("upgrade response --> [");
            sb2.append(upgradeResponseB != null ? Boolean.valueOf(upgradeResponseB.b()) : null);
            sb2.append(AbstractJsonLexerKt.END_LIST);
            f31187a3.a(sb2.toString());
        }
        return Boolean.valueOf(upgradeResponseB != null ? upgradeResponseB.b() : false);
    }

    public final boolean a(k7 api, byte[] byteArray, int mtu) {
        w2 w2Var = new w2(byteArray, 0, 2, null);
        while (w2Var.h() > 0) {
            byte[] bArrB = w2Var.b(mtu);
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean zD = api.d(bArrB);
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() - jCurrentTimeMillis);
            if (iCurrentTimeMillis >= 3000) {
                t5t.d("DfuV5ProcessorImpl", "Send chunk:" + zD + ",time usage:" + iCurrentTimeMillis);
            }
            if (!zD) {
                t5t.d("DfuV5ProcessorImpl", "write firmware data failed!!!");
                return false;
            }
        }
        return true;
    }
}
