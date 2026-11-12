package com.huami.bluetooth.profile.ecf.data;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import defpackage.tet;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \r2\u00020\u0001:\u0003\u000e\u000f\u0010B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/HidStatus;", "Ljava/io/Serializable;", "", "status", "I", "getStatus", "()I", "", "getBytes", "()[B", "bytes", "<init>", "(I)V", "Companion", PluginDeviceInfo.FMODEL, "HidConnect", "HidDisconnect", "Lcom/huami/bluetooth/profile/ecf/data/HidStatus$HidConnect;", "Lcom/huami/bluetooth/profile/ecf/data/HidStatus$HidDisconnect;", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public abstract class HidStatus implements Serializable {
    private static final long serialVersionUID = 1;
    private final int status;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/HidStatus$HidConnect;", "Lcom/huami/bluetooth/profile/ecf/data/HidStatus;", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class HidConnect extends HidStatus {
        public HidConnect() {
            super(1, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/HidStatus$HidDisconnect;", "Lcom/huami/bluetooth/profile/ecf/data/HidStatus;", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class HidDisconnect extends HidStatus {
        public HidDisconnect() {
            super(0, null);
        }
    }

    public /* synthetic */ HidStatus(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    @NotNull
    public final byte[] getBytes() {
        byte[] bArrP = tet.p(this.status);
        Intrinsics.checkNotNullExpressionValue(bArrP, "intToBytes(status)");
        return bArrP;
    }

    public final int getStatus() {
        return this.status;
    }

    private HidStatus(int i) {
        this.status = i;
    }
}
