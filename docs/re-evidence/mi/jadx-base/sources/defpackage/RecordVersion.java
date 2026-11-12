package defpackage;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: gq, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\r"}, d2 = {"Lgq;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "version", "<init>", "(B)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class RecordVersion {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final byte version;

    public RecordVersion(byte b2) {
        this.version = b2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RecordVersion) && this.version == ((RecordVersion) other).version;
    }

    public int hashCode() {
        return Byte.hashCode(this.version);
    }

    @NotNull
    public String toString() {
        return "RecordVersion(version=" + ((int) this.version) + ')';
    }
}
