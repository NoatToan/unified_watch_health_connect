package com.huami.bluetooth.profile.channel.module.member_card;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b \u0010!J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00072\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u0010\u001a\u00020\fHÆ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001R\u0019\u0010\u000e\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0010\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/member_card/Version;", "", "other", "", "equals", "", "hashCode", "", "component1", "", "Lcom/huami/bluetooth/profile/channel/module/member_card/BarcodeType;", "component2", "", "component3", "version", "codeType", "colorType", "copy", "", "toString", "a", "B", "getVersion", "()B", "b", "Ljava/util/List;", "getCodeType", "()Ljava/util/List;", "c", "[B", "getColorType", "()[B", "<init>", "(BLjava/util/List;[B)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Version {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final byte version;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<BarcodeType> codeType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final byte[] colorType;

    /* JADX WARN: Multi-variable type inference failed */
    public Version(byte b, @NotNull List<? extends BarcodeType> list, @NotNull byte[] bArr) {
        this.version = b;
        this.codeType = list;
        this.colorType = bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Version copy$default(Version version, byte b, List list, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            b = version.version;
        }
        if ((i & 2) != 0) {
            list = version.codeType;
        }
        if ((i & 4) != 0) {
            bArr = version.colorType;
        }
        return version.copy(b, list, bArr);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final byte getVersion() {
        return this.version;
    }

    @NotNull
    public final List<BarcodeType> component2() {
        return this.codeType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final byte[] getColorType() {
        return this.colorType;
    }

    @NotNull
    public final Version copy(byte version, @NotNull List<? extends BarcodeType> codeType, @NotNull byte[] colorType) {
        return new Version(version, codeType, colorType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(Version.class, other == null ? null : other.getClass())) {
            return false;
        }
        Objects.requireNonNull(other, "null cannot be cast to non-null type com.huami.bluetooth.profile.channel.module.member_card.Version");
        Version version = (Version) other;
        return this.version == version.version && Intrinsics.areEqual(this.codeType, version.codeType) && Arrays.equals(this.colorType, version.colorType);
    }

    @NotNull
    public final List<BarcodeType> getCodeType() {
        return this.codeType;
    }

    @NotNull
    public final byte[] getColorType() {
        return this.colorType;
    }

    public final byte getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((this.version * 31) + this.codeType.hashCode()) * 31) + Arrays.hashCode(this.colorType);
    }

    @NotNull
    public String toString() {
        return "Version(version=" + ((int) this.version) + ", codeType=" + this.codeType + ", colorType=" + Arrays.toString(this.colorType) + ')';
    }
}
