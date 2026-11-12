package j70;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lj70/e;", "", "", "enabledSectionsCount", "", "", "challengesContent", "<init>", "(ILjava/util/List;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f97522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f97523b;

    public e(int i14, List<String> list) {
        list.getClass();
        this.f97522a = i14;
        this.f97523b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f97522a == eVar.f97522a && this.f97523b.equals(eVar.f97523b);
    }

    public final int hashCode() {
        return this.f97523b.hashCode() + (Integer.hashCode(this.f97522a) * 31);
    }

    public final String toString() {
        return "DashboardChallengesData(enabledSectionsCount=" + this.f97522a + ", challengesContent=" + this.f97523b + ")";
    }
}
