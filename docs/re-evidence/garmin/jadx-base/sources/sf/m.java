package sf;

import ch.qos.logback.core.CoreConstants;
import com.google.common.net.HttpHeaders;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.u0;
import p13.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\b\tB#\b\u0002\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lsf/m;", "", "", "", "", "data", "<init>", "(Ljava/util/Map;)V", "a", "b", "coil-network-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f158806b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, List<String>> f158807a;

    static {
        new b(null);
        f158806b = new a().b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private m(Map<String, ? extends List<String>> map) {
        this.f158807a = map;
    }

    public final String a() {
        String lowerCase = HttpHeaders.CONTENT_TYPE.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        List<String> list = this.f158807a.get(lowerCase);
        if (list != null) {
            return (String) h0.n0(list);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && s.g(this.f158807a, ((m) obj).f158807a);
    }

    public final int hashCode() {
        return this.f158807a.hashCode();
    }

    public final String toString() {
        return "NetworkHeaders(data=" + this.f158807a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsf/m$b;", "", "<init>", "()V", "Lsf/m;", "EMPTY", "Lsf/m;", "coil-network-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ m(Map map, p005kotlin.jvm.internal.j jVar) {
        this(map);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsf/m$a;", "", "<init>", "()V", "Lsf/m;", "headers", "(Lsf/m;)V", "coil-network-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f158808a;

        public a(m mVar) {
            Map<String, List<String>> map = mVar.f158807a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), h0.d1((Collection) entry.getValue()));
            }
            this.f158808a = linkedHashMap;
        }

        public final void a(String str, String str2) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            LinkedHashMap linkedHashMap = this.f158808a;
            Object arrayList = linkedHashMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(str2);
        }

        public final m b() {
            return new m(u0.m(this.f158808a), null);
        }

        public final void c(String str) {
            String lowerCase = HttpHeaders.CACHE_CONTROL.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            this.f158808a.put(lowerCase, x.m(str));
        }

        public a() {
            this.f158808a = new LinkedHashMap();
        }
    }
}
