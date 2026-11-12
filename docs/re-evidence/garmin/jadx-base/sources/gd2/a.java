package gd2;

import g11.e;
import java.net.InetAddress;
import java.util.List;
import okhttp3.Dns;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0007B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lgd2/a;", "Lokhttp3/Dns;", "", "Lgd2/b;", "strategies", "<init>", "(Ljava/util/List;)V", "a", "networking-okhttp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements Dns {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f76980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f76981c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<b> f76982a;

    static {
        new C1552a(null);
        f76980b = new b("garmin.cn", new e(12));
        Logger logger = LoggerFactory.getLogger("DnsResolver");
        logger.getClass();
        f76981c = logger;
    }

    public /* synthetic */ a(List list, int i14, j jVar) {
        this((i14 & 1) != 0 ? w.c(f76980b) : list);
    }

    @Override // okhttp3.Dns
    public final List<InetAddress> lookup(String str) {
        str.getClass();
        List<InetAddress> listLookup = Dns.SYSTEM.lookup(str);
        for (b bVar : this.f76982a) {
            if (d53.w.z(str, bVar.f76985c, false)) {
                List<InetAddress> listInvoke = bVar.f76984b.invoke(listLookup);
                String str2 = bVar.f76983a;
                String strK0 = h0.k0(listLookup, null, null, null, new e(13), 31);
                StringBuilder sbI = p6.b.i("DNS lookup with '", str2, "' strategy: ", str, " -> ");
                sbI.append(strK0);
                f76981c.debug(sbI.toString());
                return listInvoke;
            }
        }
        return listLookup;
    }

    /* JADX INFO: renamed from: gd2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgd2/a$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "networking-okhttp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C1552a {
        public /* synthetic */ C1552a(j jVar) {
            this();
        }

        private C1552a() {
        }
    }

    public a(List<b> list) {
        list.getClass();
        this.f76982a = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
