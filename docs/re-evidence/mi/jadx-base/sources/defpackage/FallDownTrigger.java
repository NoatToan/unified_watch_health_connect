package defpackage;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: u9, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u000e"}, d2 = {"Lu9;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "timestamp", "timeZone", "<init>", "(JI)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class FallDownTrigger {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final long timestamp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public final int timeZone;

    public FallDownTrigger(long j, int i) {
        this.timestamp = j;
        this.timeZone = i;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FallDownTrigger)) {
            return false;
        }
        FallDownTrigger fallDownTrigger = (FallDownTrigger) other;
        return this.timestamp == fallDownTrigger.timestamp && this.timeZone == fallDownTrigger.timeZone;
    }

    public int hashCode() {
        return (Long.hashCode(this.timestamp) * 31) + Integer.hashCode(this.timeZone);
    }

    @NotNull
    public String toString() {
        return "FallDownTrigger(timestamp=" + this.timestamp + ", timeZone=" + this.timeZone + ')';
    }
}
