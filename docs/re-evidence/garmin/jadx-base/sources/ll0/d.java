package ll0;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lll0/d;", "", "", "isLoading", "", "Lil0/a;", "downloadedGolfCourses", "<init>", "(ZLjava/util/List;)V", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f113349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<il0.a> f113350b;

    public d(boolean z14, List list, int i14, j jVar) {
        this((i14 & 1) != 0 ? true : z14, (i14 & 2) != 0 ? j0.f134944a : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f113349a == dVar.f113349a && s.g(this.f113350b, dVar.f113350b);
    }

    public final int hashCode() {
        return this.f113350b.hashCode() + (Boolean.hashCode(this.f113349a) * 31);
    }

    public final String toString() {
        return "DownloadedGolfCoursesUIState(isLoading=" + this.f113349a + ", downloadedGolfCourses=" + this.f113350b + ")";
    }

    public d(boolean z14, List<il0.a> list) {
        list.getClass();
        this.f113349a = z14;
        this.f113350b = list;
    }

    public d() {
        this(false, null, 3, null);
    }
}
