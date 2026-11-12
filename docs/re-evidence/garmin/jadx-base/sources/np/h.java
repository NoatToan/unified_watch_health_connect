package np;

import mp.k;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnp/h;", "", "Lo82/g;", "intervalType", "Lmp/k;", "metricType", "<init>", "(Lo82/g;Lmp/k;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o82.g f126829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f126830b;

    public h(o82.g gVar, k kVar) {
        gVar.getClass();
        kVar.getClass();
        this.f126829a = gVar;
        this.f126830b = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f126829a == hVar.f126829a && this.f126830b == hVar.f126830b;
    }

    public final int hashCode() {
        return this.f126830b.hashCode() + (this.f126829a.hashCode() * 31);
    }

    public final String toString() {
        return this.f126829a + "-" + this.f126830b;
    }
}
