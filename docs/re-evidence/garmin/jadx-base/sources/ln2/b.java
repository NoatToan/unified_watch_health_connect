package ln2;

import d53.u;
import e23.l;
import java.net.InetAddress;
import java.util.List;
import org.slf4j.Marker;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\"\u0010\b\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004j\u0002`\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lln2/b;", "", "", "filter", "Lkotlin/Function1;", "", "Ljava/net/InetAddress;", "Lcom/garmin/feature/garminpay/network/IpAddressSelector;", "selector", "<init>", "(Ljava/lang/String;Le23/l;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<List<? extends InetAddress>, List<InetAddress>> f113684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f113685c;

    /* JADX WARN: Multi-variable type inference failed */
    public b(String str, l<? super List<? extends InetAddress>, ? extends List<? extends InetAddress>> lVar) {
        str.getClass();
        lVar.getClass();
        this.f113683a = str;
        this.f113684b = lVar;
        this.f113685c = u.v(str, Marker.ANY_MARKER, "", false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f113683a.equals(bVar.f113683a) && this.f113684b.equals(bVar.f113684b);
    }

    public final int hashCode() {
        return this.f113684b.hashCode() + (this.f113683a.hashCode() * 31);
    }

    public final String toString() {
        return "DnsStrategy(filter=" + this.f113683a + ", selector=" + this.f113684b + ")";
    }
}
