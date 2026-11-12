package defpackage;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: e0, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\r"}, d2 = {"Le0;", "", "", "toString", "", "hashCode", "other", "", "equals", "version", "maxLimitCards", "<init>", "(II)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class AssistantVersion {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final int version;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public final int maxLimitCards;

    public AssistantVersion(int i, int i2) {
        this.version = i;
        this.maxLimitCards = i2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssistantVersion)) {
            return false;
        }
        AssistantVersion assistantVersion = (AssistantVersion) other;
        return this.version == assistantVersion.version && this.maxLimitCards == assistantVersion.maxLimitCards;
    }

    public int hashCode() {
        return (Integer.hashCode(this.version) * 31) + Integer.hashCode(this.maxLimitCards);
    }

    @NotNull
    public String toString() {
        return "AssistantVersion(version=" + this.version + ", maxLimitCards=" + this.maxLimitCards + ')';
    }
}
