package com.huami.watch.musicupload;

import com.xiaomi.hm.health.bt.device.Status;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/huami/watch/musicupload/DeviceStatus;", "", "", "isTransferring", "isConnected", Status.PRE_CONNECT_STATE_CONNECTED, "nextStateForConnect", "transfer", "nextStateForTransfer", "<init>", "(Ljava/lang/String;I)V", "ConnectedTransfer", "ConnectedIdle", "DisconnectedTransfer", "DisconnectedIdle", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public enum DeviceStatus {
    ConnectedTransfer,
    ConnectedIdle,
    DisconnectedTransfer,
    DisconnectedIdle;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 1})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[DeviceStatus.values().length];
            $EnumSwitchMapping$0 = iArr;
            DeviceStatus deviceStatus = DeviceStatus.ConnectedTransfer;
            iArr[deviceStatus.ordinal()] = 1;
            DeviceStatus deviceStatus2 = DeviceStatus.ConnectedIdle;
            iArr[deviceStatus2.ordinal()] = 2;
            DeviceStatus deviceStatus3 = DeviceStatus.DisconnectedTransfer;
            iArr[deviceStatus3.ordinal()] = 3;
            DeviceStatus deviceStatus4 = DeviceStatus.DisconnectedIdle;
            iArr[deviceStatus4.ordinal()] = 4;
            int[] iArr2 = new int[DeviceStatus.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[deviceStatus4.ordinal()] = 1;
            iArr2[deviceStatus3.ordinal()] = 2;
            iArr2[deviceStatus2.ordinal()] = 3;
            iArr2[deviceStatus.ordinal()] = 4;
            int[] iArr3 = new int[DeviceStatus.values().length];
            $EnumSwitchMapping$2 = iArr3;
            iArr3[deviceStatus.ordinal()] = 1;
            iArr3[deviceStatus3.ordinal()] = 2;
            iArr3[deviceStatus2.ordinal()] = 3;
            iArr3[deviceStatus4.ordinal()] = 4;
            int[] iArr4 = new int[DeviceStatus.values().length];
            $EnumSwitchMapping$3 = iArr4;
            iArr4[deviceStatus2.ordinal()] = 1;
            iArr4[deviceStatus4.ordinal()] = 2;
            iArr4[deviceStatus.ordinal()] = 3;
            iArr4[deviceStatus3.ordinal()] = 4;
        }
    }

    public final boolean isConnected() {
        return this == ConnectedTransfer || this == ConnectedIdle;
    }

    public final boolean isTransferring() {
        return this == ConnectedTransfer || this == DisconnectedTransfer;
    }

    @NotNull
    public final DeviceStatus nextStateForConnect(boolean connected) {
        if (connected) {
            int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i != 1 && i != 2) {
                if (i == 3) {
                    return ConnectedTransfer;
                }
                if (i == 4) {
                    return ConnectedIdle;
                }
                throw new NoWhenBranchMatchedException();
            }
        } else {
            int i2 = WhenMappings.$EnumSwitchMapping$1[ordinal()];
            if (i2 != 1 && i2 != 2) {
                if (i2 == 3) {
                    return DisconnectedIdle;
                }
                if (i2 == 4) {
                    return DisconnectedTransfer;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return this;
    }

    @NotNull
    public final DeviceStatus nextStateForTransfer(boolean transfer) {
        if (transfer) {
            int i = WhenMappings.$EnumSwitchMapping$2[ordinal()];
            if (i != 1 && i != 2) {
                if (i == 3) {
                    return ConnectedTransfer;
                }
                if (i == 4) {
                    return DisconnectedTransfer;
                }
                throw new NoWhenBranchMatchedException();
            }
        } else {
            int i2 = WhenMappings.$EnumSwitchMapping$3[ordinal()];
            if (i2 != 1 && i2 != 2) {
                if (i2 == 3) {
                    return ConnectedIdle;
                }
                if (i2 == 4) {
                    return DisconnectedIdle;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return this;
    }
}
