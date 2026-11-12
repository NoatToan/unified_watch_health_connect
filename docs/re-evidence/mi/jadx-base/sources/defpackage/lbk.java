package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public class lbk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a<String, Pattern> f24867a;

    public static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public LinkedHashMap<K, V> f24868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f24869b;

        /* JADX INFO: renamed from: lbk$a$a, reason: collision with other inner class name */
        public class C1009a extends LinkedHashMap<K, V> {
            public C1009a(int i, float f, boolean z) {
                super(i, f, z);
            }

            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry<K, V> entry) {
                return size() > a.this.f24869b;
            }
        }

        public a(int i) {
            this.f24869b = i;
            this.f24868a = new C1009a(((i * 4) / 3) + 1, 0.75f, true);
        }

        public synchronized V b(K k2) {
            return this.f24868a.get(k2);
        }

        public synchronized void c(K k2, V v) {
            this.f24868a.put(k2, v);
        }
    }

    public lbk(int i) {
        this.f24867a = new a<>(i);
    }

    public Pattern a(String str) {
        Pattern patternB = this.f24867a.b(str);
        if (patternB != null) {
            return patternB;
        }
        Pattern patternCompile = Pattern.compile(str);
        this.f24867a.c(str, patternCompile);
        return patternCompile;
    }
}
