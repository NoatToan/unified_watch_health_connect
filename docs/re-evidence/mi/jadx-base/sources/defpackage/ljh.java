package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class ljh<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public K f25132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public V f25133b;

    public ljh(K k2, V v) {
        this.f25132a = k2;
        this.f25133b = v;
    }

    public K a() {
        return this.f25132a;
    }

    public V b() {
        return this.f25133b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ljh)) {
            return false;
        }
        ljh ljhVar = (ljh) obj;
        return this.f25132a.equals(ljhVar.f25132a) && this.f25133b.equals(ljhVar.f25133b);
    }

    public int hashCode() {
        int iHashCode = this.f25132a.hashCode() * 13;
        V v = this.f25133b;
        return iHashCode + (v == null ? 0 : v.hashCode());
    }

    public String toString() {
        return "<" + this.f25132a + ", " + this.f25133b + ">";
    }
}
