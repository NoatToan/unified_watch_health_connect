package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: qv, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u001b\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lqv;", "", "", "toString", "()Ljava/lang/String;", "", "value", "I", PluginDeviceInfo.FDESC, "()I", "desc", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public enum UpgradeStatus {
    IDLE(0, "idle"),
    WAITING_TRANSFER(1, "ready for transfer"),
    IN_TRANSFER(2, "in transfer"),
    VALIDATING(3, "validating"),
    WAITING_UPGRADE(4, "ready for upgrading"),
    IN_UPGRADING(5, "upgrading"),
    BUSY(6, "busy"),
    WAITING_NEXT_FIRMWARE(7, "waiting next continuous file"),
    DFU_RUNNING(255, null, 2, null);


    @NotNull
    public static final a v = new a(null);

    /* JADX INFO: renamed from: t, reason: from toString */
    public final int value;

    /* JADX INFO: renamed from: u, reason: from toString */
    @NotNull
    public final String desc;

    /* JADX INFO: renamed from: qv$a */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lqv$a;", "", "", "v", "Lqv;", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final UpgradeStatus a(int v) {
            for (UpgradeStatus upgradeStatus : UpgradeStatus.values()) {
                if (upgradeStatus.getValue() == v) {
                    return upgradeStatus;
                }
            }
            return UpgradeStatus.IDLE;
        }
    }

    UpgradeStatus(int i, String str) {
        this.value = i;
        this.desc = str;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return "UpgradeStatus(value=" + this.value + ", desc='" + this.desc + "')";
    }

    /* synthetic */ UpgradeStatus(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? "" : str);
    }
}
