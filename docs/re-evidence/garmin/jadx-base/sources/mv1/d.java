package mv1;

import c22.t;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import tw1.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lmv1/d;", "", "", "", "daysAvailable", "Ltw1/h;", "supplementalSports", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f121182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<h> f121183b;

    public /* synthetic */ d(List list, List list2, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : list, (i14 & 2) != 0 ? null : list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f121182a, dVar.f121182a) && s.g(this.f121183b, dVar.f121183b);
    }

    public final int hashCode() {
        List<String> list = this.f121182a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<h> list2 = this.f121183b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return t.f("FBTFitnessPreferencesModel(daysAvailable=", ", supplementalSports=", ")", this.f121182a, this.f121183b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(List<String> list, List<? extends h> list2) {
        this.f121182a = list;
        this.f121183b = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
