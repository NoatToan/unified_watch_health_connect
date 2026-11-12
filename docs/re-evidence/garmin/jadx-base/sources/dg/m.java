package dg;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ldg/m;", "", "K", "V", "", "maxSize", "<init>", "(J)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class m<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f59489a = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f59490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f59491c;

    public m(long j8) {
        this.f59490b = j8;
        if (j8 > 0) {
            return;
        }
        vb.h.s("maxSize <= 0");
        throw null;
    }

    public void a(K k14, V v14, V v15) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long b() {
        if (this.f59491c == -1) {
            Iterator<T> it = this.f59489a.entrySet().iterator();
            long jC = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                jC += c(entry.getKey(), entry.getValue());
            }
            this.f59491c = jC;
        }
        return this.f59491c;
    }

    public final long c(K k14, V v14) throws Exception {
        try {
            long jD = d(k14, v14);
            if (jD >= 0) {
                return jD;
            }
            throw new IllegalStateException(("sizeOf(" + k14 + ", " + v14 + ") returned a negative value: " + jD).toString());
        } catch (Exception e4) {
            this.f59491c = -1L;
            throw e4;
        }
    }

    public long d(K k14, V v14) {
        return 1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(long j8) {
        while (b() > j8) {
            LinkedHashMap linkedHashMap = this.f59489a;
            if (linkedHashMap.isEmpty()) {
                if (b() == 0) {
                    return;
                }
                vb.h.z("sizeOf() is returning inconsistent values");
                return;
            } else {
                Map.Entry entry = (Map.Entry) h0.a0(linkedHashMap.entrySet());
                Object key = entry.getKey();
                Object value = entry.getValue();
                linkedHashMap.remove(key);
                this.f59491c = b() - c(key, value);
                a(key, value, null);
            }
        }
    }
}
