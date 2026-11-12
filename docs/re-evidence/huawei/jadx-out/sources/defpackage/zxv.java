package defpackage;

import defpackage.zxs;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes20.dex */
public class zxv<T extends zxs<?>> implements Iterable<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentMap<String, T> f54755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f54756b;

    public zxv(String str) {
        this.f54755a = new ConcurrentHashMap();
        this.f54756b = str;
    }

    public zxv(zxv<T> zxvVar) {
        this(zxvVar.c(), zxvVar);
    }

    public zxv(String str, zxv<T> zxvVar) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f54755a = concurrentHashMap;
        this.f54756b = str;
        concurrentHashMap.putAll(zxvVar.f54755a);
    }

    public String c() {
        return this.f54756b;
    }

    public zxv<T> a(T t) {
        zxs zxsVarD = d(t);
        if (zxsVarD == null || zxsVarD == t) {
            return this;
        }
        throw new IllegalArgumentException(this.f54756b + " already contains " + t.getKey() + "!");
    }

    public T d(T t) {
        t.getClass();
        return this.f54755a.putIfAbsent(t.getKey(), t);
    }

    public boolean e(T t) {
        return t == d(t.getKey());
    }

    public T d(String str) {
        return this.f54755a.get(str);
    }

    public boolean b() {
        return this.f54755a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return this.f54755a.values().iterator();
    }
}
