package xd1;

import com.garmin.android.gncs.NotificationConstants;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lxd1/b;", "", "Lxd1/e;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "Lxd1/d;", "summaries", "", "allPrimaryMuscles", "allSecondaryMuscles", "<init>", "(Lxd1/e;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f190008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<d> f190009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<String> f190010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<String> f190011d;

    public /* synthetic */ b(e eVar, List list, List list2, List list3, int i14, j jVar) {
        this(eVar, (i14 & 2) != 0 ? new ArrayList() : list, (i14 & 4) != 0 ? new ArrayList() : list2, (i14 & 8) != 0 ? new ArrayList() : list3);
    }

    public final void a() {
        for (d dVar : this.f190009b) {
            if (dVar.f190023f) {
                dVar.f190021d = -1.0d;
            }
            for (c cVar : dVar.f190024g) {
                if (cVar.f190017f) {
                    cVar.f190015d = -1.0d;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f190008a == bVar.f190008a && s.g(this.f190009b, bVar.f190009b) && s.g(this.f190010c, bVar.f190010c) && s.g(this.f190011d, bVar.f190011d);
    }

    public final int hashCode() {
        return this.f190011d.hashCode() + u0.b(u0.b(this.f190008a.hashCode() * 31, 31, this.f190009b), 31, this.f190010c);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GroupedExerciseData(type=");
        sb3.append(this.f190008a);
        sb3.append(", summaries=");
        sb3.append(this.f190009b);
        sb3.append(", allPrimaryMuscles=");
        return n23.j.j(sb3, this.f190010c, ", allSecondaryMuscles=", this.f190011d, ")");
    }

    public b(e eVar, List<d> list, List<String> list2, List<String> list3) {
        eVar.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.f190008a = eVar;
        this.f190009b = list;
        this.f190010c = list2;
        this.f190011d = list3;
    }
}
