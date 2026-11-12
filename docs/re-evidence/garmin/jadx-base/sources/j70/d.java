package j70;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lj70/d;", "Data", "", "Lyz1/d;", "status", "data", "<init>", "(Lyz1/d;Ljava/lang/Object;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d<Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz1.d f97520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f97521b;

    public d(yz1.d dVar, Data data) {
        dVar.getClass();
        this.f97520a = dVar;
        this.f97521b = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f97520a.equals(dVar.f97520a) && p005kotlin.jvm.internal.s.g(this.f97521b, dVar.f97521b);
    }

    public final int hashCode() {
        int iHashCode = this.f97520a.hashCode() * 31;
        Data data = this.f97521b;
        return iHashCode + (data == null ? 0 : data.hashCode());
    }

    public final String toString() {
        return "DashboardCardData(status=" + this.f97520a + ", data=" + this.f97521b + ")";
    }
}
