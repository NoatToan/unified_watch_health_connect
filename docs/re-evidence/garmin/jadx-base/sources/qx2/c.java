package qx2;

import am.j;
import java.net.URL;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lqx2/c;", "", "", "requestMethod", "Ljava/net/URL;", "url", "", "responseCode", "", "", "responseHeaders", "responseBody", "<init>", "(Ljava/lang/String;Ljava/net/URL;ILjava/util/Map;Ljava/lang/String;)V", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f148452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final URL f148453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f148454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, List<String>> f148455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f148456e;

    /* JADX WARN: Multi-variable type inference failed */
    public c(String str, URL url, int i14, Map<String, ? extends List<String>> map, String str2) {
        str.getClass();
        url.getClass();
        map.getClass();
        str2.getClass();
        this.f148452a = str;
        this.f148453b = url;
        this.f148454c = i14;
        this.f148455d = map;
        this.f148456e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f148452a.equals(cVar.f148452a) && this.f148453b.equals(cVar.f148453b) && this.f148454c == cVar.f148454c && this.f148455d.equals(cVar.f148455d) && this.f148456e.equals(cVar.f148456e);
    }

    public final int hashCode() {
        return this.f148456e.hashCode() + j.b(this.f148455d, q2.d(this.f148454c, (this.f148453b.hashCode() + (this.f148452a.hashCode() * 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "SaMDHttpResponse(responseCode=" + this.f148454c + ", url='" + this.f148453b + "', responseHeaders='" + this.f148455d + "', responseBody=\n" + this.f148456e + "')";
    }
}
