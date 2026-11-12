package fw1;

import fg0.k;
import fg0.n;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lfw1/a;", "", "", "Lfg0/k;", "otherEvents", "primaryEventDTO", "Lfg0/n;", "eventProviders", "", "isValidPrimaryEvent", "", "currentPrimaryEventName", "<init>", "(Ljava/util/List;Lfg0/k;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<k> f73779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f73780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<n> f73781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f73782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f73783e;

    public /* synthetic */ a(List list, k kVar, List list2, Boolean bool, String str, int i14, j jVar) {
        this(list, kVar, (i14 & 4) != 0 ? null : list2, (i14 & 8) != 0 ? null : bool, (i14 & 16) != 0 ? null : str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f73779a, aVar.f73779a) && s.g(this.f73780b, aVar.f73780b) && s.g(this.f73781c, aVar.f73781c) && s.g(this.f73782d, aVar.f73782d) && s.g(this.f73783e, aVar.f73783e);
    }

    public final int hashCode() {
        List<k> list = this.f73779a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        k kVar = this.f73780b;
        int iHashCode2 = (iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        List<n> list2 = this.f73781c;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.f73782d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f73783e;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FBTUpcomingEventsUiModel(otherEvents=");
        sb3.append(this.f73779a);
        sb3.append(", primaryEventDTO=");
        sb3.append(this.f73780b);
        sb3.append(", eventProviders=");
        sb3.append(this.f73781c);
        sb3.append(", isValidPrimaryEvent=");
        sb3.append(this.f73782d);
        sb3.append(", currentPrimaryEventName=");
        return am.j.o(this.f73783e, ")", sb3);
    }

    public a(List<k> list, k kVar, List<n> list2, Boolean bool, String str) {
        this.f73779a = list;
        this.f73780b = kVar;
        this.f73781c = list2;
        this.f73782d = bool;
        this.f73783e = str;
    }
}
