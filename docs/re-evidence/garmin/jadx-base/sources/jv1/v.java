package jv1;

import com.garmin.android.apps.connectmobile.f3;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ljv1/v;", "", "", "", "restDays", "longWorkoutDays", "selectedSwimDays", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f101164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f101165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<String> f101166c;

    public /* synthetic */ v(List list, List list2, List list3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : list, (i14 & 2) != 0 ? null : list2, (i14 & 4) != 0 ? null : list3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return p005kotlin.jvm.internal.s.g(this.f101164a, vVar.f101164a) && p005kotlin.jvm.internal.s.g(this.f101165b, vVar.f101165b) && p005kotlin.jvm.internal.s.g(this.f101166c, vVar.f101166c);
    }

    public final int hashCode() {
        List<String> list = this.f101164a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.f101165b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.f101166c;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        return u62.z.c(f3.k("FBTSwimDaysUIModel(restDays=", ", longWorkoutDays=", ", selectedSwimDays=", this.f101164a, this.f101165b), this.f101166c, ")");
    }

    public v(List<String> list, List<String> list2, List<String> list3) {
        this.f101164a = list;
        this.f101165b = list2;
        this.f101166c = list3;
    }

    public v() {
        this(null, null, null, 7, null);
    }
}
