package com.xiaomi.hm.health.bt.profile.dfu;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.ecg.core.model.constant.MeasureStateValue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u001b\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\u0005\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/dfu/UpgradeStatus;", "", "", "toString", "", "value", LogUtil.I, "getValue", "()I", "desc", "Ljava/lang/String;", "getDesc", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "Companion", "IDLE", "WAITING_TRANSFER", "IN_TRANSFER", "VALIDATING", "WAITING_UPGRADE", "IN_UPGRADING", MeasureStateValue.BUSY, "WAITING_NEXT_FIRMWARE", "DFU_RUNNING", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
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


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String desc;
    private final int value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/dfu/UpgradeStatus$Companion;", "", "", "v", "Lcom/xiaomi/hm/health/bt/profile/dfu/UpgradeStatus;", "fromValue", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final UpgradeStatus fromValue(int v) {
            UpgradeStatus[] upgradeStatusArrValues = UpgradeStatus.values();
            int length = upgradeStatusArrValues.length;
            int i = 0;
            while (i < length) {
                UpgradeStatus upgradeStatus = upgradeStatusArrValues[i];
                i++;
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

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

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
