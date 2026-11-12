package d62;

import java.util.List;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ld62/b;", "", "Ld62/d;", "step", "Ld62/i;", "selectedParentProfile", "Ld62/j;", "selectedProfile", "", "profiles", "<init>", "(Ld62/d;Ld62/i;Ld62/j;Ljava/util/List;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f57998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f57999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f58000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<i> f58001d;

    public b(d dVar, i iVar, j jVar, List list, int i14, p005kotlin.jvm.internal.j jVar2) {
        this((i14 & 1) != 0 ? d.PARENT_PROFILE : dVar, (i14 & 2) != 0 ? null : iVar, (i14 & 4) != 0 ? null : jVar, (i14 & 8) != 0 ? j0.f134944a : list);
    }

    public static b a(b bVar, d dVar, i iVar, j jVar, List list, int i14) {
        if ((i14 & 1) != 0) {
            dVar = bVar.f57998a;
        }
        if ((i14 & 2) != 0) {
            iVar = bVar.f57999b;
        }
        if ((i14 & 4) != 0) {
            jVar = bVar.f58000c;
        }
        if ((i14 & 8) != 0) {
            list = bVar.f58001d;
        }
        bVar.getClass();
        dVar.getClass();
        list.getClass();
        return new b(dVar, iVar, jVar, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f57998a == bVar.f57998a && p005kotlin.jvm.internal.s.g(this.f57999b, bVar.f57999b) && this.f58000c == bVar.f58000c && p005kotlin.jvm.internal.s.g(this.f58001d, bVar.f58001d);
    }

    public final int hashCode() {
        int iHashCode = this.f57998a.hashCode() * 31;
        i iVar = this.f57999b;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        j jVar = this.f58000c;
        return this.f58001d.hashCode() + ((iHashCode2 + (jVar != null ? jVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ActivityTypeSelectionUIState(step=" + this.f57998a + ", selectedParentProfile=" + this.f57999b + ", selectedProfile=" + this.f58000c + ", profiles=" + this.f58001d + ")";
    }

    public b(d dVar, i iVar, j jVar, List<i> list) {
        dVar.getClass();
        list.getClass();
        this.f57998a = dVar;
        this.f57999b = iVar;
        this.f58000c = jVar;
        this.f58001d = list;
    }

    public b() {
        this(null, null, null, null, 15, null);
    }
}
