package fo;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lfo/t;", "", "", "searchQuery", "Li53/c;", "Ljo/c;", "selectedFilters", "Ljo/f;", "sortData", "", "isImmediate", "<init>", "(Ljava/lang/String;Li53/c;Ljo/f;Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f72439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.c<jo.c> f72440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jo.f f72441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f72442d;

    /* JADX WARN: Multi-variable type inference failed */
    public t(String str, i53.c<? extends jo.c> cVar, jo.f fVar, boolean z14) {
        str.getClass();
        fVar.getClass();
        this.f72439a = str;
        this.f72440b = cVar;
        this.f72441c = fVar;
        this.f72442d = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return p005kotlin.jvm.internal.s.g(this.f72439a, tVar.f72439a) && p005kotlin.jvm.internal.s.g(this.f72440b, tVar.f72440b) && p005kotlin.jvm.internal.s.g(this.f72441c, tVar.f72441c) && this.f72442d == tVar.f72442d;
    }

    public final int hashCode() {
        int iHashCode = this.f72439a.hashCode() * 31;
        i53.c<jo.c> cVar = this.f72440b;
        return Boolean.hashCode(this.f72442d) + ((this.f72441c.hashCode() + ((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "ActivitiesPagerKey(searchQuery=" + this.f72439a + ", selectedFilters=" + this.f72440b + ", sortData=" + this.f72441c + ", isImmediate=" + this.f72442d + ")";
    }

    public /* synthetic */ t(String str, i53.c cVar, jo.f fVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, cVar, fVar, (i14 & 8) != 0 ? false : z14);
    }
}
