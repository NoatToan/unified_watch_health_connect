package j70;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lj70/t;", "", "", "stringId", "Lu4/d;", "icon", "<init>", "(ILu4/d;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f97655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u4.d f97656b;

    public t(int i14, u4.d dVar) {
        dVar.getClass();
        this.f97655a = i14;
        this.f97656b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f97655a == tVar.f97655a && this.f97656b.equals(tVar.f97656b);
    }

    public final int hashCode() {
        return this.f97656b.hashCode() + (Integer.hashCode(this.f97655a) * 31);
    }

    public final String toString() {
        return "PairResource(stringId=" + this.f97655a + ", icon=" + this.f97656b + ")";
    }
}
