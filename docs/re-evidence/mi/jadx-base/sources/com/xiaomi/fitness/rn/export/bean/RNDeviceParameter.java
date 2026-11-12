package com.xiaomi.fitness.rn.export.bean;

import com.xiaomi.fitness.device.manager.bean.DeviceParameter;
import com.xiaomi.fitness.mijia.sdk.data.AdvPacket;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/rn/export/bean/RNDeviceParameter;", "Lcom/xiaomi/fitness/device/manager/bean/DeviceParameter;", "model", "", "mac", "bleName", "nodeId", "oob", "serverBind", "", "packet", "Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/xiaomi/fitness/mijia/sdk/data/AdvPacket;)V", "getModel", "()Ljava/lang/String;", "getMac", "getBleName", "getNodeId", "getOob", "getServerBind", "()Z", "getPacket", "()Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket;", "export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RNDeviceParameter extends DeviceParameter {

    @Nullable
    private final String bleName;

    @NotNull
    private final String mac;

    @NotNull
    private final String model;

    @Nullable
    private final String nodeId;

    @Nullable
    private final String oob;

    @Nullable
    private final AdvPacket packet;
    private final boolean serverBind;

    public /* synthetic */ RNDeviceParameter(String str, String str2, String str3, String str4, String str5, boolean z, AdvPacket advPacket, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : advPacket);
    }

    @Override // com.xiaomi.fitness.device.manager.bean.DeviceParameter
    @Nullable
    public String getBleName() {
        return this.bleName;
    }

    @Override // com.xiaomi.fitness.device.manager.bean.DeviceParameter
    @NotNull
    public String getMac() {
        return this.mac;
    }

    @Override // com.xiaomi.fitness.device.manager.bean.DeviceParameter
    @NotNull
    public String getModel() {
        return this.model;
    }

    @Override // com.xiaomi.fitness.device.manager.bean.DeviceParameter
    @Nullable
    public String getNodeId() {
        return this.nodeId;
    }

    @Override // com.xiaomi.fitness.device.manager.bean.DeviceParameter
    @Nullable
    public String getOob() {
        return this.oob;
    }

    @Nullable
    public final AdvPacket getPacket() {
        return this.packet;
    }

    @Override // com.xiaomi.fitness.device.manager.bean.DeviceParameter
    public boolean getServerBind() {
        return this.serverBind;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNDeviceParameter(@NotNull String model, @NotNull String mac, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z, @Nullable AdvPacket advPacket) {
        super(model, mac, str, str2, str3, z, null, 0, 64, null);
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(mac, "mac");
        this.model = model;
        this.mac = mac;
        this.bleName = str;
        this.nodeId = str2;
        this.oob = str3;
        this.serverBind = z;
        this.packet = advPacket;
    }
}
