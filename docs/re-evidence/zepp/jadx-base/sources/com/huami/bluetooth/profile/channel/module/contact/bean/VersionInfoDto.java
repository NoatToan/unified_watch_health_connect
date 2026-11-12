package com.huami.bluetooth.profile.channel.module.contact.bean;

import com.huami.bluetooth.profile.channel.module.binary.Layout;
import com.huami.bluetooth.profile.channel.module.binary.annotation.Order;
import com.huami.bluetooth.profile.channel.module.binary.struct.UInt16;
import com.huami.bluetooth.profile.channel.module.binary.struct.UInt8;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0003\u001a\u00020\u0002J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/contact/bean/VersionInfoDto;", "Lcom/huami/bluetooth/profile/channel/module/binary/Layout;", "Lcom/huami/bluetooth/profile/channel/module/contact/bean/VersionInfo;", "toVersionInfo", "Lcom/huami/bluetooth/profile/channel/module/binary/struct/UInt8;", "component1", "component2", "Lcom/huami/bluetooth/profile/channel/module/binary/struct/UInt16;", "component3", "type", "version", "maxCount", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/huami/bluetooth/profile/channel/module/binary/struct/UInt8;", "Lcom/huami/bluetooth/profile/channel/module/binary/struct/UInt16;", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/binary/struct/UInt8;Lcom/huami/bluetooth/profile/channel/module/binary/struct/UInt8;Lcom/huami/bluetooth/profile/channel/module/binary/struct/UInt16;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class VersionInfoDto implements Layout {

    @JvmField
    @Nullable
    public UInt16 maxCount;

    @JvmField
    @Nullable
    public UInt8 type;

    @JvmField
    @Nullable
    public UInt8 version;

    public VersionInfoDto() {
        this(null, null, null, 7, null);
    }

    public VersionInfoDto(@Order(1) @Nullable UInt8 uInt8, @Order(2) @Nullable UInt8 uInt9, @Order(3) @Nullable UInt16 uInt16) {
        this.type = uInt8;
        this.version = uInt9;
        this.maxCount = uInt16;
    }

    public static /* synthetic */ VersionInfoDto copy$default(VersionInfoDto versionInfoDto, UInt8 uInt8, UInt8 uInt9, UInt16 uInt16, int i, Object obj) {
        if ((i & 1) != 0) {
            uInt8 = versionInfoDto.type;
        }
        if ((i & 2) != 0) {
            uInt9 = versionInfoDto.version;
        }
        if ((i & 4) != 0) {
            uInt16 = versionInfoDto.maxCount;
        }
        return versionInfoDto.copy(uInt8, uInt9, uInt16);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UInt8 getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UInt8 getVersion() {
        return this.version;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final UInt16 getMaxCount() {
        return this.maxCount;
    }

    @NotNull
    public final VersionInfoDto copy(@Order(1) @Nullable UInt8 type, @Order(2) @Nullable UInt8 version, @Order(3) @Nullable UInt16 maxCount) {
        return new VersionInfoDto(type, version, maxCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VersionInfoDto)) {
            return false;
        }
        VersionInfoDto versionInfoDto = (VersionInfoDto) other;
        return Intrinsics.areEqual(this.type, versionInfoDto.type) && Intrinsics.areEqual(this.version, versionInfoDto.version) && Intrinsics.areEqual(this.maxCount, versionInfoDto.maxCount);
    }

    public int hashCode() {
        UInt8 uInt8 = this.type;
        int iHashCode = (uInt8 == null ? 0 : uInt8.hashCode()) * 31;
        UInt8 uInt9 = this.version;
        int iHashCode2 = (iHashCode + (uInt9 == null ? 0 : uInt9.hashCode())) * 31;
        UInt16 uInt16 = this.maxCount;
        return iHashCode2 + (uInt16 != null ? uInt16.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "VersionInfoDto(type=" + this.type + ", version=" + this.version + ", maxCount=" + this.maxCount + ')';
    }

    @NotNull
    public final VersionInfo toVersionInfo() {
        Integer numEnsureValue;
        Integer numEnsureValue2;
        Integer numEnsureValue3;
        UInt8 uInt8 = this.type;
        int iIntValue = 2;
        if (uInt8 != null && (numEnsureValue3 = uInt8.ensureValue(2)) != null) {
            iIntValue = numEnsureValue3.intValue();
        }
        UInt8 uInt9 = this.version;
        int iIntValue2 = -1;
        if (uInt9 != null && (numEnsureValue2 = uInt9.ensureValue(-1)) != null) {
            iIntValue2 = numEnsureValue2.intValue();
        }
        UInt16 uInt16 = this.maxCount;
        int iIntValue3 = 0;
        if (uInt16 != null && (numEnsureValue = uInt16.ensureValue()) != null) {
            iIntValue3 = numEnsureValue.intValue();
        }
        return new VersionInfo(iIntValue, iIntValue2, iIntValue3);
    }

    public /* synthetic */ VersionInfoDto(UInt8 uInt8, UInt8 uInt9, UInt16 uInt16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uInt8, (i & 2) != 0 ? null : uInt9, (i & 4) != 0 ? null : uInt16);
    }
}
