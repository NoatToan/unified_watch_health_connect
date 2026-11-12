package defpackage;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: wf, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\f"}, d2 = {"Lwf;", "", "", "toString", "", "hashCode", "other", "", "equals", "version", "<init>", "(I)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class HearingAidProtocolVersion {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final int version;

    public HearingAidProtocolVersion(int i) {
        this.version = i;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HearingAidProtocolVersion) && this.version == ((HearingAidProtocolVersion) other).version;
    }

    public int hashCode() {
        return Integer.hashCode(this.version);
    }

    @NotNull
    public String toString() {
        return "HearingAidProtocolVersion(version=" + this.version + ')';
    }
}
