package com.xiaomi.fitness.eco.device.manager.export.bean;

import android.os.Parcelable;
import com.xiaomi.fitness.mijia.sdk.data.AdvPacket;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u0000 12\u00020\u0001:\u00011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001a\u0010\u0011\u001a\u00020\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\rR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010\rR\u001c\u0010 \u001a\u0004\u0018\u00010\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000b\"\u0004\b\"\u0010\rR\u001c\u0010#\u001a\u0004\u0018\u00010\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000b\"\u0004\b%\u0010\rR\u001c\u0010&\u001a\u0004\u0018\u00010'X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0011\u0010,\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b,\u0010.R\u0011\u0010/\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b/\u0010.R\u0011\u00100\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b0\u0010.¨\u00062"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoBindDeviceInfo;", "Landroid/os/Parcelable;", "deviceInfo", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoAddDeviceInfo;", "<init>", "(Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoAddDeviceInfo;)V", "getDeviceInfo", "()Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoAddDeviceInfo;", "bleMac", "", "getBleMac", "()Ljava/lang/String;", "setBleMac", "(Ljava/lang/String;)V", "model", "getModel", "setModel", "bleName", "getBleName", "setBleName", "oob", "getOob", "setOob", "shareId", "getShareId", "setShareId", "shareUserId", "getShareUserId", "setShareUserId", "shareDid", "getShareDid", "setShareDid", "shareModel", "getShareModel", "setShareModel", "to", "getTo", "setTo", "packet", "Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket;", "getPacket", "()Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket;", "setPacket", "(Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket;)V", "isSportMachine", "", "()Z", "isEcoScale", "isEightScale", "Companion", "eco-device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class EcoBindDeviceInfo implements Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private String bleMac;

    @NotNull
    private String bleName;

    @NotNull
    private final EcoAddDeviceInfo deviceInfo;

    @NotNull
    private String model;

    @Nullable
    private String oob;

    @Nullable
    private AdvPacket packet;

    @Nullable
    private String shareDid;

    @Nullable
    private String shareId;

    @Nullable
    private String shareModel;

    @Nullable
    private String shareUserId;

    @Nullable
    private String to;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0006J\n\u0010\u0007\u001a\u00020\u0005*\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoBindDeviceInfo$Companion;", "", "<init>", "()V", "isEcoScale", "", "", "isEightScale", "eco-device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isEcoScale(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return isEightScale(str) || EcoProductModelExtKt.isHuaMiScale(str);
        }

        public final boolean isEightScale(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return StringsKt__StringsJVMKt.startsWith$default(str, "yunmai.scales.ms3001", false, 2, null);
        }
    }

    public EcoBindDeviceInfo(@NotNull EcoAddDeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        this.deviceInfo = deviceInfo;
        this.bleMac = "";
        this.model = "";
        this.bleName = "";
        this.oob = "";
        this.shareId = "";
        this.shareUserId = "";
        this.shareDid = "";
        this.shareModel = "";
    }

    @NotNull
    public String getBleMac() {
        return this.bleMac;
    }

    @NotNull
    public String getBleName() {
        return this.bleName;
    }

    @NotNull
    public EcoAddDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    @NotNull
    public String getModel() {
        return this.model;
    }

    @Nullable
    public String getOob() {
        return this.oob;
    }

    @Nullable
    public AdvPacket getPacket() {
        return this.packet;
    }

    @Nullable
    public String getShareDid() {
        return this.shareDid;
    }

    @Nullable
    public String getShareId() {
        return this.shareId;
    }

    @Nullable
    public String getShareModel() {
        return this.shareModel;
    }

    @Nullable
    public String getShareUserId() {
        return this.shareUserId;
    }

    @Nullable
    public String getTo() {
        return this.to;
    }

    public final boolean isEcoScale() {
        return INSTANCE.isEcoScale(getModel());
    }

    public final boolean isEightScale() {
        return INSTANCE.isEightScale(getModel());
    }

    public final boolean isSportMachine() {
        return getDeviceInfo().isSportMachine();
    }

    public void setBleMac(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bleMac = str;
    }

    public void setBleName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bleName = str;
    }

    public void setModel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.model = str;
    }

    public void setOob(@Nullable String str) {
        this.oob = str;
    }

    public void setPacket(@Nullable AdvPacket advPacket) {
        this.packet = advPacket;
    }

    public void setShareDid(@Nullable String str) {
        this.shareDid = str;
    }

    public void setShareId(@Nullable String str) {
        this.shareId = str;
    }

    public void setShareModel(@Nullable String str) {
        this.shareModel = str;
    }

    public void setShareUserId(@Nullable String str) {
        this.shareUserId = str;
    }

    public void setTo(@Nullable String str) {
        this.to = str;
    }
}
