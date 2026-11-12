package qe1;

import com.google.gson.annotations.SerializedName;
import ds.e0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"Lqe1/f;", "", "", "min", "max", "<init>", "(JJ)V", "a", "J", "b", "()J", "gcm-running-economy_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("MIN")
    private final long min;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("MAX")
    private final long max;

    public f(long j8, long j14) {
        this.min = j8;
        this.max = j14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getMax() {
        return this.max;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getMin() {
        return this.min;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.min == fVar.min && this.max == fVar.max;
    }

    public final int hashCode() {
        return Long.hashCode(this.max) + (Long.hashCode(this.min) * 31);
    }

    public final String toString() {
        return am.j.i(this.max, ")", e0.k(this.min, "Recreational(min=", ", max="));
    }
}
