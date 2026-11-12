package qj;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class i<T, Y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f144973a = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f144974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f144975c;

    public static final class a<Y> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Y f144976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f144977b;

        public a(Y y14, int i14) {
            this.f144976a = y14;
            this.f144977b = i14;
        }
    }

    public i(long j8) {
        this.f144974b = j8;
    }

    public final synchronized Y a(T t7) {
        a aVar;
        aVar = (a) this.f144973a.get(t7);
        return aVar != null ? aVar.f144976a : null;
    }

    public int b(Y y14) {
        return 1;
    }

    public void c(T t7, Y y14) {
    }

    public final synchronized Y d(T t7, Y y14) {
        int iB = b(y14);
        long j8 = iB;
        if (j8 >= this.f144974b) {
            c(t7, y14);
            return null;
        }
        if (y14 != null) {
            this.f144975c += j8;
        }
        a aVar = (a) this.f144973a.put(t7, y14 == null ? null : new a(y14, iB));
        if (aVar != null) {
            this.f144975c -= (long) aVar.f144977b;
            if (!aVar.f144976a.equals(y14)) {
                c(t7, aVar.f144976a);
            }
        }
        e(this.f144974b);
        return aVar != null ? aVar.f144976a : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void e(long j8) {
        while (this.f144975c > j8) {
            Iterator it = this.f144973a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            a aVar = (a) entry.getValue();
            this.f144975c -= (long) aVar.f144977b;
            Object key = entry.getKey();
            it.remove();
            c(key, aVar.f144976a);
        }
    }
}
