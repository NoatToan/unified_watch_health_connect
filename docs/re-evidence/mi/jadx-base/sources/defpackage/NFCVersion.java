package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: nm, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lnm;", "", "", "toString", "", "hashCode", "other", "", "equals", "version", "I", PluginDeviceInfo.FMODEL, "()I", "", "flags", "chunkSize", "<init>", "(I[BI)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class NFCVersion {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final int version;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @NotNull
    public final byte[] flags;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final int chunkSize;

    public NFCVersion(int i, @NotNull byte[] flags, int i2) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.version = i;
        this.flags = flags;
        this.chunkSize = i2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NFCVersion)) {
            return false;
        }
        NFCVersion nFCVersion = (NFCVersion) other;
        return this.version == nFCVersion.version && Intrinsics.areEqual(this.flags, nFCVersion.flags) && this.chunkSize == nFCVersion.chunkSize;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.version) * 31) + Arrays.hashCode(this.flags)) * 31) + Integer.hashCode(this.chunkSize);
    }

    @NotNull
    public String toString() {
        return "NFCVersion(version=" + this.version + ", flags=" + tet.x(this.flags) + ", chunkSize=" + this.chunkSize + ')';
    }
}
