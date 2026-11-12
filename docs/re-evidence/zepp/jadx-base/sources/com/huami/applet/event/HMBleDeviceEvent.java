package com.huami.applet.event;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u00020\n8F@\u0006¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u00020\n8F@\u0006¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0013\u001a\u00020\n8F@\u0006¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0014\u001a\u00020\n8F@\u0006¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0015\u001a\u00020\n8F@\u0006¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\u0016\u001a\u00020\n8F@\u0006¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/huami/applet/event/HMBleDeviceEvent;", "", "", "component1", "mConnectionType", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getMConnectionType", "()I", "isConnecting", "()Z", "isConnected", "isDisconnected", "isConnectingTimeout", "isBound", "isUnbound", "<init>", "(I)V", "applet_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HMBleDeviceEvent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int mConnectionType;

    public HMBleDeviceEvent(int i) {
        this.mConnectionType = i;
    }

    public static /* synthetic */ HMBleDeviceEvent copy$default(HMBleDeviceEvent hMBleDeviceEvent, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = hMBleDeviceEvent.mConnectionType;
        }
        return hMBleDeviceEvent.copy(i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMConnectionType() {
        return this.mConnectionType;
    }

    @NotNull
    public final HMBleDeviceEvent copy(int mConnectionType) {
        return new HMBleDeviceEvent(mConnectionType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HMBleDeviceEvent) && this.mConnectionType == ((HMBleDeviceEvent) other).mConnectionType;
    }

    public final int getMConnectionType() {
        return this.mConnectionType;
    }

    public int hashCode() {
        return this.mConnectionType;
    }

    public final boolean isBound() {
        return this.mConnectionType == 4;
    }

    public final boolean isConnected() {
        return this.mConnectionType == 1;
    }

    public final boolean isConnecting() {
        return this.mConnectionType == 0;
    }

    public final boolean isConnectingTimeout() {
        return this.mConnectionType == 3;
    }

    public final boolean isDisconnected() {
        return this.mConnectionType == 2;
    }

    public final boolean isUnbound() {
        return this.mConnectionType == 5;
    }

    @NotNull
    public String toString() {
        return "HMBleDeviceEvent(mConnectionType=" + this.mConnectionType + ')';
    }
}
