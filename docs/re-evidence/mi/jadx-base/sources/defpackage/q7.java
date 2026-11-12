package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0004¢\u0006\u0004\b\u000b\u0010\u0010J\u0017\u0010\u000b\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u000b\u0010\u0012J\u001f\u0010\u000b\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0004¢\u0006\u0004\b\u000b\u0010\u0017R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u000b\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lq7;", "Lm7;", "Lk7;", "dfuApi", "Lo7;", "protocolInfo", "Lxd;", "info", "Lyh;", "callback", "", PluginDeviceInfo.FMODEL, "(Lk7;Lo7;Lxd;Lyh;)Ljava/lang/Boolean;", PluginDeviceInfo.FDESC, "Lqv;", "targetStatus", "(Lk7;Lqv;Lyh;)Z", "", "(Lxd;)I", "dataSize", "", "timeUsage", "", "(IJ)V", "Lzat;", "logObservable", "Lzat;", "()Lzat;", "setLogObservable", "(Lzat;)V", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public class q7 implements m7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f31186b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public zat f31187a;

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004¨\u0006\u0013"}, d2 = {"Lq7$a;", "", "", "DELAY_DISCONNECT", "J", "", "DFU_CONN_INTERVAL_COUNT", "I", "DFU_CONN_INTERVAL_MAX", "DFU_CONN_INTERVAL_MIN", "DFU_CONN_LATENCY", "DFU_CONN_TIMEOUT", "", "TAG", "Ljava/lang/String;", "TIMEOUT_DIAL_UPGRADE", "WAIT_EVERY_TIMEOUT", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final zat getF31187a() {
        return this.f31187a;
    }

    @Nullable
    public Boolean b(@NotNull k7 dfuApi, @NotNull DfuProtocolInfo protocolInfo, @NotNull xd info, @NotNull yh callback) {
        throw null;
    }

    @Override // defpackage.m7
    @Nullable
    public Boolean a(@NotNull k7 dfuApi, @NotNull DfuProtocolInfo protocolInfo, @NotNull xd info, @NotNull yh callback) {
        Intrinsics.checkNotNullParameter(dfuApi, "dfuApi");
        Intrinsics.checkNotNullParameter(protocolInfo, "protocolInfo");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (callback instanceof zat) {
            this.f31187a = (zat) callback;
        }
        return b(dfuApi, protocolInfo, info, callback);
    }

    public static /* synthetic */ boolean a(q7 q7Var, k7 k7Var, UpgradeStatus upgradeStatus, yh yhVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryDfuState");
        }
        if ((i & 4) != 0) {
            yhVar = null;
        }
        return q7Var.a(k7Var, upgradeStatus, yhVar);
    }

    public final boolean a(@NotNull k7 dfuApi, @NotNull UpgradeStatus targetStatus, @Nullable yh callback) {
        Intrinsics.checkNotNullParameter(dfuApi, "dfuApi");
        Intrinsics.checkNotNullParameter(targetStatus, "targetStatus");
        try {
            UpgradeStatueResponse upgradeStatueResponseA = k7.a.a(dfuApi, false, 1, null);
            t5t.d("DfuV5Processor", upgradeStatueResponseA.toString());
            if (!upgradeStatueResponseA.f() || upgradeStatueResponseA.getUpgradeStatus() != targetStatus) {
                return false;
            }
            if (callback != null) {
                yd ydVarA = yd.a(upgradeStatueResponseA.getFirmwareType());
                Intrinsics.checkNotNullExpressionValue(ydVarA, "fromValue(status.firmwareType)");
                callback.a(ydVarA, new Progress(upgradeStatueResponseA.getFirmwareSize(), upgradeStatueResponseA.getFirmwareUpgradedSize()));
            }
            return true;
        } catch (Exception e) {
            t5t.d("DfuV5Processor", "e: " + e + " 一般是固件异常");
            return false;
        }
    }

    public final int a(@NotNull xd info) {
        Intrinsics.checkNotNullParameter(info, "info");
        return (int) new File(info.g()).length();
    }

    public final void a(int dataSize, long timeUsage) {
        if (dataSize <= 0) {
            t5t.d("DfuV5Processor", "No data transfer");
            return;
        }
        if (timeUsage <= 0) {
            t5t.d("DfuV5Processor", "Transfer " + dataSize + " data less than one millis");
            return;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.getDefault(), "DFU transfer rate: %.1f KBps", Arrays.copyOf(new Object[]{Float.valueOf(dataSize / timeUsage)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
        t5t.d("DfuV5Processor", str);
    }
}
