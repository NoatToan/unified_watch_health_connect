package hs1;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\t\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\r\u0010\f¨\u0006\u000f"}, d2 = {"Lhs1/i;", "", "Lhs1/j;", "steps", "pushes", "floorsAscended", "floorsDescended", "<init>", "(Lhs1/j;Lhs1/j;Lhs1/j;Lhs1/j;)V", "a", "Lhs1/j;", "d", "()Lhs1/j;", "b", "c", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("steps")
    private final j steps;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pushes")
    private final j pushes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("floorsAscended")
    private final j floorsAscended;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("floorsDescended")
    private final j floorsDescended;

    public /* synthetic */ i(j jVar, j jVar2, j jVar3, j jVar4, int i14, p005kotlin.jvm.internal.j jVar5) {
        this((i14 & 1) != 0 ? null : jVar, (i14 & 2) != 0 ? null : jVar2, (i14 & 4) != 0 ? null : jVar3, (i14 & 8) != 0 ? null : jVar4);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final j getFloorsAscended() {
        return this.floorsAscended;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final j getFloorsDescended() {
        return this.floorsDescended;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final j getPushes() {
        return this.pushes;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final j getSteps() {
        return this.steps;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return s.g(this.steps, iVar.steps) && s.g(this.pushes, iVar.pushes) && s.g(this.floorsAscended, iVar.floorsAscended) && s.g(this.floorsDescended, iVar.floorsDescended);
    }

    public final int hashCode() {
        j jVar = this.steps;
        int iHashCode = (jVar == null ? 0 : jVar.hashCode()) * 31;
        j jVar2 = this.pushes;
        int iHashCode2 = (iHashCode + (jVar2 == null ? 0 : jVar2.hashCode())) * 31;
        j jVar3 = this.floorsAscended;
        int iHashCode3 = (iHashCode2 + (jVar3 == null ? 0 : jVar3.hashCode())) * 31;
        j jVar4 = this.floorsDescended;
        return iHashCode3 + (jVar4 != null ? jVar4.hashCode() : 0);
    }

    public final String toString() {
        return "Movement(steps=" + this.steps + ", pushes=" + this.pushes + ", floorsAscended=" + this.floorsAscended + ", floorsDescended=" + this.floorsDescended + ")";
    }

    public i(j jVar, j jVar2, j jVar3, j jVar4) {
        this.steps = jVar;
        this.pushes = jVar2;
        this.floorsAscended = jVar3;
        this.floorsDescended = jVar4;
    }

    public i() {
        this(null, null, null, null, 15, null);
    }
}
