package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: vo, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lvo;", "", "", "toString", "", "hashCode", "other", "", "equals", "protocolVersion", "I", PluginDeviceInfo.FDESC, "()I", "algorithmVersion", "Ljava/lang/String;", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;", "<init>", "(ILjava/lang/String;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class PhnVersion {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final int protocolVersion;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @NotNull
    public final String algorithmVersion;

    public PhnVersion(int i, @NotNull String algorithmVersion) {
        Intrinsics.checkNotNullParameter(algorithmVersion, "algorithmVersion");
        this.protocolVersion = i;
        this.algorithmVersion = algorithmVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAlgorithmVersion() {
        return this.algorithmVersion;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getProtocolVersion() {
        return this.protocolVersion;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhnVersion)) {
            return false;
        }
        PhnVersion phnVersion = (PhnVersion) other;
        return this.protocolVersion == phnVersion.protocolVersion && Intrinsics.areEqual(this.algorithmVersion, phnVersion.algorithmVersion);
    }

    public int hashCode() {
        return (Integer.hashCode(this.protocolVersion) * 31) + this.algorithmVersion.hashCode();
    }

    @NotNull
    public String toString() {
        return "PhnVersion(protocolVersion=" + this.protocolVersion + ", algorithmVersion=" + this.algorithmVersion + ')';
    }
}
