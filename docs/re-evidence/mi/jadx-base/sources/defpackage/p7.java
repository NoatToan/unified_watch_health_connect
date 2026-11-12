package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002J$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¨\u0006\u0014"}, d2 = {"Lp7;", "", "Lk7;", "dfuApi", "Lo7;", "protocolInfo", "", "totalSize", "", "crc32", "Lyd;", "type", "Lyh;", "callback", "", PluginDeviceInfo.FMODEL, "Lqv;", "targetStatus", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class p7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f30074a = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lp7$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public boolean a(@NotNull k7 dfuApi, @NotNull DfuProtocolInfo protocolInfo, int totalSize, long crc32, @NotNull yd type, @NotNull yh callback) {
        Intrinsics.checkNotNullParameter(dfuApi, "dfuApi");
        Intrinsics.checkNotNullParameter(protocolInfo, "protocolInfo");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(callback, "callback");
        t5t.d("DfuUpgradeApiImp", "totalSize:" + totalSize + ",crc32:" + crc32 + ",type:" + type);
        UpgradeStatueResponse upgradeStatueResponseA = k7.a.a(dfuApi, false, 1, null);
        t5t.d("DfuUpgradeApiImp", upgradeStatueResponseA.toString());
        if (!upgradeStatueResponseA.f() || upgradeStatueResponseA.getUpgradeStatus() != UpgradeStatus.IDLE) {
            callback.onError(upgradeStatueResponseA.getCode());
            return false;
        }
        PrepareResponse prepareResponseA = k7.a.a(dfuApi, type, totalSize, crc32, protocolInfo.getMaxChunkSize(), nv.FOREGROUND, null, 32, null);
        t5t.d("DfuUpgradeApiImp", prepareResponseA.toString());
        if (!prepareResponseA.d()) {
            callback.onError(prepareResponseA.getCode());
            return false;
        }
        StartTransferResponse startTransferResponseA = dfuApi.a(true);
        t5t.d("DfuUpgradeApiImp", "start transfer result:" + startTransferResponseA);
        if (!startTransferResponseA.b()) {
            callback.onError(startTransferResponseA.getCode());
            return false;
        }
        if (a(dfuApi)) {
            return a(dfuApi, callback);
        }
        return false;
    }

    public final boolean a(k7 dfuApi) {
        ValidateResponse validateResponseF;
        String string;
        boolean zH = dfuApi.h();
        t5t.d("DfuUpgradeApiImp", "Validate cmd:" + zH);
        if (!zH) {
            return false;
        }
        do {
            boolean zA = a(this, dfuApi, UpgradeStatus.VALIDATING, (yh) null, 4, (Object) null);
            validateResponseF = dfuApi.f();
            if (!zA) {
                break;
            }
        } while (validateResponseF == null);
        if (validateResponseF == null || (string = validateResponseF.toString()) == null) {
            string = "Validate no response";
        }
        t5t.d("DfuUpgradeApiImp", string);
        return validateResponseF == null || !(validateResponseF.b() ^ true);
    }

    public final boolean a(k7 dfuApi, yh callback) {
        UpgradeResponse upgradeResponseB;
        String string;
        boolean zA = dfuApi.a();
        t5t.d("DfuUpgradeApiImp", "Upgrade command: " + zA);
        if (!zA) {
            return false;
        }
        do {
            boolean zA2 = a(dfuApi, UpgradeStatus.IN_UPGRADING, callback);
            upgradeResponseB = dfuApi.b(15000);
            if (!zA2) {
                break;
            }
        } while (upgradeResponseB == null);
        if (upgradeResponseB == null || (string = upgradeResponseB.toString()) == null) {
            string = "Upgrade no response";
        }
        t5t.d("DfuUpgradeApiImp", string);
        if (upgradeResponseB != null) {
            return upgradeResponseB.b();
        }
        return false;
    }

    public static /* synthetic */ boolean a(p7 p7Var, k7 k7Var, UpgradeStatus upgradeStatus, yh yhVar, int i, Object obj) {
        if ((i & 4) != 0) {
            yhVar = null;
        }
        return p7Var.a(k7Var, upgradeStatus, yhVar);
    }

    public final boolean a(k7 dfuApi, UpgradeStatus targetStatus, yh callback) {
        UpgradeStatueResponse upgradeStatueResponseA = k7.a.a(dfuApi, false, 1, null);
        t5t.d("DfuUpgradeApiImp", upgradeStatueResponseA.toString());
        if (!upgradeStatueResponseA.f() || upgradeStatueResponseA.getUpgradeStatus() != targetStatus) {
            return false;
        }
        if (callback != null) {
            yd ydVarA = yd.a(upgradeStatueResponseA.getFirmwareType());
            Intrinsics.checkNotNullExpressionValue(ydVarA, "fromValue(status.firmwareType)");
            callback.a(ydVarA, new Progress(upgradeStatueResponseA.getFirmwareSize(), upgradeStatueResponseA.getFirmwareUpgradedSize()));
        }
        return true;
    }
}
