package defpackage;

import com.huami.bluetooth.profile.channel.module.binary.Layout;
import com.huami.bluetooth.profile.channel.module.binary.struct.UInt16;
import com.huami.bluetooth.profile.channel.module.binary.struct.UInt8;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: nw, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¨\u0006\u0013"}, d2 = {"Lnw;", "Lcom/huami/bluetooth/profile/channel/module/binary/Layout;", "Lmw;", PluginDeviceInfo.FMODEL, "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/huami/bluetooth/profile/channel/module/binary/struct/UInt8;", "type", "version", "Lcom/huami/bluetooth/profile/channel/module/binary/struct/UInt16;", "maxCount", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/binary/struct/UInt8;Lcom/huami/bluetooth/profile/channel/module/binary/struct/UInt8;Lcom/huami/bluetooth/profile/channel/module/binary/struct/UInt16;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class VersionInfoDto implements Layout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    @JvmField
    @Nullable
    public UInt8 type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @JvmField
    @Nullable
    public UInt8 version;

    /* JADX INFO: renamed from: c, reason: from toString */
    @JvmField
    @Nullable
    public UInt16 maxCount;

    public VersionInfoDto() {
        this(null, null, null, 7, null);
    }

    @NotNull
    public final VersionInfo a() {
        UInt8 uInt8 = this.type;
        int iIntValue = uInt8 != null ? uInt8.ensureValue(2).intValue() : 2;
        UInt8 uInt9 = this.version;
        int iIntValue2 = uInt9 != null ? uInt9.ensureValue(-1).intValue() : -1;
        UInt16 uInt16 = this.maxCount;
        return new VersionInfo(iIntValue, iIntValue2, uInt16 != null ? uInt16.ensureValue().intValue() : 0);
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

    public VersionInfoDto(@yn(1) @Nullable UInt8 uInt8, @yn(2) @Nullable UInt8 uInt9, @yn(3) @Nullable UInt16 uInt16) {
        this.type = uInt8;
        this.version = uInt9;
        this.maxCount = uInt16;
    }

    public /* synthetic */ VersionInfoDto(UInt8 uInt8, UInt8 uInt9, UInt16 uInt16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uInt8, (i & 2) != 0 ? null : uInt9, (i & 4) != 0 ? null : uInt16);
    }
}
