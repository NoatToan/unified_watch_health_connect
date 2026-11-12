package ho;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lho/j;", "", "Li53/c;", "Lho/a;", "activityData", "", "allActivities", "<init>", "(Li53/c;Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i53.c<a> f84636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f84637b;

    public j(i53.c cVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? j53.l.b() : cVar, (i14 & 2) != 0 ? false : z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return p005kotlin.jvm.internal.s.g(this.f84636a, jVar.f84636a) && this.f84637b == jVar.f84637b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f84637b) + (this.f84636a.hashCode() * 31);
    }

    public final String toString() {
        return "ActivityTypeSelectionUiState(activityData=" + this.f84636a + ", allActivities=" + this.f84637b + ")";
    }

    public j(i53.c<a> cVar, boolean z14) {
        cVar.getClass();
        this.f84636a = cVar;
        this.f84637b = z14;
    }

    public j() {
        this(null, false, 3, null);
    }
}
