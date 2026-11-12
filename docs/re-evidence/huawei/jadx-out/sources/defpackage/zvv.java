package defpackage;

import java.net.InetSocketAddress;

/* JADX INFO: loaded from: classes20.dex */
public final class zvv {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f54632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f54633c;
    private final int e;

    public zvv(int i, Object obj) {
        if (i < 0 || i > 65535) {
            throw new IllegalArgumentException("MID must be a 16 bit unsigned int: " + i);
        }
        if (obj == null) {
            throw new NullPointerException("peer must not be null");
        }
        this.f54632b = i;
        this.f54633c = obj;
        this.e = (i * 31) + obj.hashCode();
    }

    public Object e() {
        return this.f54633c;
    }

    public int hashCode() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zvv zvvVar = (zvv) obj;
        if (this.f54632b != zvvVar.f54632b) {
            return false;
        }
        return this.f54633c.equals(zvvVar.f54633c);
    }

    public String toString() {
        Object objB = this.f54633c;
        if (objB instanceof InetSocketAddress) {
            objB = zzp.b((InetSocketAddress) objB);
        }
        return "KeyMID[" + objB + '-' + this.f54632b + ']';
    }
}
