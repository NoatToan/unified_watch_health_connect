package ln2;

import java.net.InetAddress;
import java.util.List;
import li0.x;
import okhttp3.Dns;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lln2/a;", "Lokhttp3/Dns;", "", "Lln2/b;", "strategies", "<init>", "(Ljava/util/List;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements Dns {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f113680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f113681c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<b> f113682a;

    static {
        new C2171a(null);
        f113680b = new b("garmin.cn", new x(24));
        Logger logger = LoggerFactory.getLogger("DnsResolver");
        logger.getClass();
        f113681c = logger;
    }

    public /* synthetic */ a(List list, int i14, j jVar) {
        this((i14 & 1) != 0 ? w.c(f113680b) : list);
    }

    @Override // okhttp3.Dns
    public final List<InetAddress> lookup(String str) {
        str.getClass();
        List<InetAddress> listLookup = Dns.SYSTEM.lookup(str);
        for (b bVar : this.f113682a) {
            if (d53.w.z(str, bVar.f113685c, false)) {
                List<InetAddress> listInvoke = bVar.f113684b.invoke(listLookup);
                String str2 = bVar.f113683a;
                String strK0 = h0.k0(listLookup, null, null, null, new x(25), 31);
                StringBuilder sbI = p6.b.i("DNS lookup with '", str2, "' strategy: ", str, " -> ");
                sbI.append(strK0);
                f113681c.debug(sbI.toString());
                return listInvoke;
            }
        }
        return listLookup;
    }

    /* JADX INFO: renamed from: ln2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lln2/a$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2171a {
        public /* synthetic */ C2171a(j jVar) {
            this();
        }

        private C2171a() {
        }
    }

    public a(List<b> list) {
        list.getClass();
        this.f113682a = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
