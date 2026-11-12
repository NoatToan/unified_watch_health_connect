package o73;

import com.mapbox.maps.MapboxMap;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lo73/n;", "", "", "Lo73/e;", "qualifiers", "", "path", "", MapboxMap.QFE_OFFSET, "size", "<init>", "(Ljava/util/Set;Ljava/lang/String;JJ)V", "library_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<e> f130767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f130768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f130769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f130770d;

    /* JADX WARN: Multi-variable type inference failed */
    public n(Set<? extends e> set, String str, long j8, long j14) {
        set.getClass();
        str.getClass();
        this.f130767a = set;
        this.f130768b = str;
        this.f130769c = j8;
        this.f130770d = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f130767a.equals(nVar.f130767a) && this.f130768b.equals(nVar.f130768b) && this.f130769c == nVar.f130769c && this.f130770d == nVar.f130770d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f130770d) + q6.f.e(wr.g.j(this.f130767a.hashCode() * 31, 31, this.f130768b), 31, this.f130769c);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ResourceItem(qualifiers=");
        sb3.append(this.f130767a);
        sb3.append(", path=");
        sb3.append(this.f130768b);
        sb3.append(", offset=");
        sb3.append(this.f130769c);
        return com.nimbusds.jose.shaded.gson.internal.a.g(this.f130770d, ", size=", ")", sb3);
    }
}
