package zy2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lzy2/j;", "K", "V", "", "first", "second", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "util-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class j<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f207533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V f207534b;

    public j(K k14, V v14) {
        this.f207533a = k14;
        this.f207534b = v14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return s.g(this.f207533a, jVar.f207533a) && s.g(this.f207534b, jVar.f207534b);
    }

    public final int hashCode() {
        K k14 = this.f207533a;
        int iHashCode = (k14 == null ? 0 : k14.hashCode()) * 31;
        V v14 = this.f207534b;
        return iHashCode + (v14 != null ? v14.hashCode() : 0);
    }

    public final String toString() {
        return "KMPPair(first=" + this.f207533a + ", second=" + this.f207534b + ")";
    }
}
