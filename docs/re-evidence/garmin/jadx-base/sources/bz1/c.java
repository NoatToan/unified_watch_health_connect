package bz1;

import c22.t;
import fg0.k;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbz1/c;", "", "", "Lfg0/k;", "upcomingEventsList", "pastEventsList", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<k> f22295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<k> f22296b;

    public c(List<k> list, List<k> list2) {
        this.f22295a = list;
        this.f22296b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f22295a, cVar.f22295a) && s.g(this.f22296b, cVar.f22296b);
    }

    public final int hashCode() {
        List<k> list = this.f22295a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<k> list2 = this.f22296b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return t.f("EventListUIModel(upcomingEventsList=", ", pastEventsList=", ")", this.f22295a, this.f22296b);
    }
}
