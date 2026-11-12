package h62;

import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import u62.z;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lh62/l;", "", "", "isLoading", "", "Lm52/k;", "allWorkoutTypes", "selectedWorkoutType", "<init>", "(ZLjava/util/List;Ljava/util/List;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f82246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<m52.k> f82247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<m52.k> f82248c;

    public l(boolean z14, List list, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? j0.f134944a : list, (i14 & 4) != 0 ? j0.f134944a : list2);
    }

    public static l a(l lVar, boolean z14, List list, List list2, int i14) {
        if ((i14 & 1) != 0) {
            z14 = lVar.f82246a;
        }
        if ((i14 & 2) != 0) {
            list = lVar.f82247b;
        }
        if ((i14 & 4) != 0) {
            list2 = lVar.f82248c;
        }
        lVar.getClass();
        list.getClass();
        list2.getClass();
        return new l(z14, list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f82246a == lVar.f82246a && s.g(this.f82247b, lVar.f82247b) && s.g(this.f82248c, lVar.f82248c);
    }

    public final int hashCode() {
        return this.f82248c.hashCode() + u0.b(Boolean.hashCode(this.f82246a) * 31, 31, this.f82247b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("WorkoutListUiState(isLoading=");
        sb3.append(this.f82246a);
        sb3.append(", allWorkoutTypes=");
        sb3.append(this.f82247b);
        sb3.append(", selectedWorkoutType=");
        return z.c(sb3, this.f82248c, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(boolean z14, List<? extends m52.k> list, List<? extends m52.k> list2) {
        list.getClass();
        list2.getClass();
        this.f82246a = z14;
        this.f82247b = list;
        this.f82248c = list2;
    }

    public l() {
        this(false, null, null, 7, null);
    }
}
