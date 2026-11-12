package defpackage;

import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xv, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÖ\u0001¨\u0006\u0012"}, d2 = {"Lxv;", "", "other", "", "equals", "", "hashCode", "", "toString", "", "version", "", "Lb1;", "codeType", "", "colorType", "<init>", "(BLjava/util/List;[B)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class Version {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final byte version;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @NotNull
    public final List<b1> codeType;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final byte[] colorType;

    /* JADX WARN: Multi-variable type inference failed */
    public Version(byte b2, @NotNull List<? extends b1> codeType, @NotNull byte[] colorType) {
        Intrinsics.checkNotNullParameter(codeType, "codeType");
        Intrinsics.checkNotNullParameter(colorType, "colorType");
        this.version = b2;
        this.codeType = codeType;
        this.colorType = colorType;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(Version.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.huami.bluetooth.profile.channel.module.member_card.Version");
        Version version = (Version) other;
        return this.version == version.version && Intrinsics.areEqual(this.codeType, version.codeType) && Arrays.equals(this.colorType, version.colorType);
    }

    public int hashCode() {
        return (((this.version * 31) + this.codeType.hashCode()) * 31) + Arrays.hashCode(this.colorType);
    }

    @NotNull
    public String toString() {
        return "Version(version=" + ((int) this.version) + ", codeType=" + this.codeType + ", colorType=" + Arrays.toString(this.colorType) + ')';
    }
}
