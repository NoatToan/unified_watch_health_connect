package qv2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lqv2/c;", "", "Ltv2/c;", "description", "actionText", "<init>", "(Ltv2/c;Ltv2/c;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tv2.c f148176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tv2.c f148177b;

    public c(tv2.c cVar, tv2.c cVar2) {
        cVar.getClass();
        cVar2.getClass();
        this.f148176a = cVar;
        this.f148177b = cVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f148176a.equals(cVar.f148176a) && this.f148177b.equals(cVar.f148177b);
    }

    public final int hashCode() {
        return this.f148177b.hashCode() + (this.f148176a.hashCode() * 31);
    }

    public final String toString() {
        return "EmptyStateViewOptions(description=" + this.f148176a + ", actionText=" + this.f148177b + ")";
    }
}
