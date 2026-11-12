package fk1;

import hk1.j;
import i53.c;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lfk1/a;", "", "Li53/c;", "Lhk1/j;", "connectedApps", "availableApps", "<init>", "(Li53/c;Li53/c;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c<j> f71935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c<j> f71936b;

    /* JADX WARN: Multi-variable type inference failed */
    public a(c<? extends j> cVar, c<? extends j> cVar2) {
        cVar.getClass();
        cVar2.getClass();
        this.f71935a = cVar;
        this.f71936b = cVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f71935a.equals(aVar.f71935a) && this.f71936b.equals(aVar.f71936b);
    }

    public final int hashCode() {
        return this.f71936b.hashCode() + (this.f71935a.hashCode() * 31);
    }

    public final String toString() {
        return "PartnerAppsData(connectedApps=" + this.f71935a + ", availableApps=" + this.f71936b + ")";
    }
}
