package ps;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lps/v0;", "", "Lps/p;", "activitySplits", "Lps/p1;", "splitSummary", "Lps/y1;", "typedSplits", "<init>", "(Lps/p;Lps/p1;Lps/y1;)V", "a", "Lps/p;", "()Lps/p;", "b", "Lps/p1;", "()Lps/p1;", "c", "Lps/y1;", "()Lps/y1;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("splits")
    private final p activitySplits;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("splitsummaries")
    private final p1 splitSummary;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("typedsplits")
    private final y1 typedSplits;

    public /* synthetic */ v0(p pVar, p1 p1Var, y1 y1Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : pVar, (i14 & 2) != 0 ? null : p1Var, (i14 & 4) != 0 ? null : y1Var);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final p getActivitySplits() {
        return this.activitySplits;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final p1 getSplitSummary() {
        return this.splitSummary;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final y1 getTypedSplits() {
        return this.typedSplits;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return p005kotlin.jvm.internal.s.g(this.activitySplits, v0Var.activitySplits) && p005kotlin.jvm.internal.s.g(this.splitSummary, v0Var.splitSummary) && p005kotlin.jvm.internal.s.g(this.typedSplits, v0Var.typedSplits);
    }

    public final int hashCode() {
        p pVar = this.activitySplits;
        int iHashCode = (pVar == null ? 0 : pVar.hashCode()) * 31;
        p1 p1Var = this.splitSummary;
        int iHashCode2 = (iHashCode + (p1Var == null ? 0 : p1Var.hashCode())) * 31;
        y1 y1Var = this.typedSplits;
        return iHashCode2 + (y1Var != null ? y1Var.hashCode() : 0);
    }

    public final String toString() {
        return "IntervalsWrapperDTO(activitySplits=" + this.activitySplits + ", splitSummary=" + this.splitSummary + ", typedSplits=" + this.typedSplits + ")";
    }

    public v0(p pVar, p1 p1Var, y1 y1Var) {
        this.activitySplits = pVar;
        this.splitSummary = p1Var;
        this.typedSplits = y1Var;
    }

    public v0() {
        this(null, null, null, 7, null);
    }
}
