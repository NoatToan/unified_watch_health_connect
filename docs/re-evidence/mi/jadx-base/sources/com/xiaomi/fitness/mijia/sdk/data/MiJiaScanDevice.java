package com.xiaomi.fitness.mijia.sdk.data;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003JK\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/mijia/sdk/data/MiJiaScanDevice;", "", "packet", "Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket;", "mac", "", "scanRecord", "", "model", "updateTime", "", "did", "<init>", "(Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket;Ljava/lang/String;[BLjava/lang/String;JLjava/lang/String;)V", "getPacket", "()Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket;", "setPacket", "(Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket;)V", "getMac", "()Ljava/lang/String;", "setMac", "(Ljava/lang/String;)V", "getScanRecord", "()[B", "setScanRecord", "([B)V", "getModel", "setModel", "getUpdateTime", "()J", "setUpdateTime", "(J)V", "getDid", "setDid", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "mijia-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MiJiaScanDevice {

    @NotNull
    private String did;

    @Nullable
    private String mac;

    @NotNull
    private String model;

    @Nullable
    private AdvPacket packet;

    @Nullable
    private byte[] scanRecord;
    private long updateTime;

    public MiJiaScanDevice(@Nullable AdvPacket advPacket, @Nullable String str, @Nullable byte[] bArr, @NotNull String model, long j, @NotNull String did) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(did, "did");
        this.packet = advPacket;
        this.mac = str;
        this.scanRecord = bArr;
        this.model = model;
        this.updateTime = j;
        this.did = did;
    }

    public static /* synthetic */ MiJiaScanDevice copy$default(MiJiaScanDevice miJiaScanDevice, AdvPacket advPacket, String str, byte[] bArr, String str2, long j, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            advPacket = miJiaScanDevice.packet;
        }
        if ((i & 2) != 0) {
            str = miJiaScanDevice.mac;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            bArr = miJiaScanDevice.scanRecord;
        }
        byte[] bArr2 = bArr;
        if ((i & 8) != 0) {
            str2 = miJiaScanDevice.model;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            j = miJiaScanDevice.updateTime;
        }
        long j2 = j;
        if ((i & 32) != 0) {
            str3 = miJiaScanDevice.did;
        }
        return miJiaScanDevice.copy(advPacket, str4, bArr2, str5, j2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AdvPacket getPacket() {
        return this.packet;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMac() {
        return this.mac;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final byte[] getScanRecord() {
        return this.scanRecord;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDid() {
        return this.did;
    }

    @NotNull
    public final MiJiaScanDevice copy(@Nullable AdvPacket packet, @Nullable String mac, @Nullable byte[] scanRecord, @NotNull String model, long updateTime, @NotNull String did) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(did, "did");
        return new MiJiaScanDevice(packet, mac, scanRecord, model, updateTime, did);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MiJiaScanDevice)) {
            return false;
        }
        MiJiaScanDevice miJiaScanDevice = (MiJiaScanDevice) other;
        return Intrinsics.areEqual(this.packet, miJiaScanDevice.packet) && Intrinsics.areEqual(this.mac, miJiaScanDevice.mac) && Intrinsics.areEqual(this.scanRecord, miJiaScanDevice.scanRecord) && Intrinsics.areEqual(this.model, miJiaScanDevice.model) && this.updateTime == miJiaScanDevice.updateTime && Intrinsics.areEqual(this.did, miJiaScanDevice.did);
    }

    @NotNull
    public final String getDid() {
        return this.did;
    }

    @Nullable
    public final String getMac() {
        return this.mac;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @Nullable
    public final AdvPacket getPacket() {
        return this.packet;
    }

    @Nullable
    public final byte[] getScanRecord() {
        return this.scanRecord;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        AdvPacket advPacket = this.packet;
        int iHashCode = (advPacket == null ? 0 : advPacket.hashCode()) * 31;
        String str = this.mac;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        byte[] bArr = this.scanRecord;
        return ((((((iHashCode2 + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31) + this.model.hashCode()) * 31) + Long.hashCode(this.updateTime)) * 31) + this.did.hashCode();
    }

    public final void setDid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.did = str;
    }

    public final void setMac(@Nullable String str) {
        this.mac = str;
    }

    public final void setModel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.model = str;
    }

    public final void setPacket(@Nullable AdvPacket advPacket) {
        this.packet = advPacket;
    }

    public final void setScanRecord(@Nullable byte[] bArr) {
        this.scanRecord = bArr;
    }

    public final void setUpdateTime(long j) {
        this.updateTime = j;
    }

    @NotNull
    public String toString() {
        return "MiJiaScanDevice(packet=" + this.packet + ", mac=" + this.mac + ", scanRecord=" + Arrays.toString(this.scanRecord) + ", model=" + this.model + ", updateTime=" + this.updateTime + ", did=" + this.did + ")";
    }
}
