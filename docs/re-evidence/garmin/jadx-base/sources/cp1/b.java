package cp1;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcp1/b;", "", "", "isLoading", "", "Lcp1/j;", "awards", "<init>", "(ZLjava/util/List;)V", "gcm-social-group-ride_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f54898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<j> f54899b;

    public /* synthetic */ b(boolean z14, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? null : list);
    }

    public static b a(b bVar, boolean z14, ArrayList arrayList, int i14) {
        if ((i14 & 1) != 0) {
            z14 = bVar.f54898a;
        }
        List<j> list = arrayList;
        if ((i14 & 2) != 0) {
            list = bVar.f54899b;
        }
        bVar.getClass();
        return new b(z14, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f54898a == bVar.f54898a && s.g(this.f54899b, bVar.f54899b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f54898a) * 31;
        List<j> list = this.f54899b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "GroupRideAwardsState(isLoading=" + this.f54898a + ", awards=" + this.f54899b + ")";
    }

    public b(boolean z14, List<j> list) {
        this.f54898a = z14;
        this.f54899b = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }
}
