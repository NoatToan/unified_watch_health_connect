package mp;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmp/a;", "", "Lmp/b;", "selectedValue", "Li53/c;", "availableActivities", "<init>", "(Lmp/b;Li53/c;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f119946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.c<b> f119947b;

    /* JADX WARN: Multi-variable type inference failed */
    public a(b bVar, i53.c<? extends b> cVar) {
        bVar.getClass();
        this.f119946a = bVar;
        this.f119947b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f119946a.equals(aVar.f119946a) && s.g(this.f119947b, aVar.f119947b);
    }

    public final int hashCode() {
        int iHashCode = this.f119946a.hashCode() * 31;
        i53.c<b> cVar = this.f119947b;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        return "ActivityFilterSelectionData(selectedValue=" + this.f119946a + ", availableActivities=" + this.f119947b + ")";
    }
}
