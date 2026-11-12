package j61;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lj61/e;", "", "Lj61/i;", "cyclingAbilityDTO", "Lj61/d;", "courseDemandsDTO", "<init>", "(Lj61/i;Lj61/d;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f97322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f97323b;

    public e(i iVar, d dVar) {
        this.f97322a = iVar;
        this.f97323b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.f97322a, eVar.f97322a) && s.g(this.f97323b, eVar.f97323b);
    }

    public final int hashCode() {
        i iVar = this.f97322a;
        int iHashCode = (iVar == null ? 0 : iVar.hashCode()) * 31;
        d dVar = this.f97323b;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return "CourseDemandsData(cyclingAbilityDTO=" + this.f97322a + ", courseDemandsDTO=" + this.f97323b + ")";
    }
}
