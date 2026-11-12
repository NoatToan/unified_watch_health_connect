package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tfp<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f34658b;

    public tfp(long j, T t) {
        this.f34658b = t;
        this.f34657a = j;
    }

    public long a() {
        return this.f34657a;
    }

    public T b() {
        return this.f34658b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof tfp)) {
            return false;
        }
        tfp tfpVar = (tfp) obj;
        if (this.f34657a == tfpVar.f34657a) {
            T t = this.f34658b;
            T t2 = tfpVar.f34658b;
            if (t == t2) {
                return true;
            }
            if (t != null && t.equals(t2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.f34657a;
        int i = (((int) (j ^ (j >>> 32))) + 31) * 31;
        T t = this.f34658b;
        return i + (t == null ? 0 : t.hashCode());
    }

    public String toString() {
        return String.format("Timestamped(timestampMillis = %d, value = %s)", Long.valueOf(this.f34657a), this.f34658b.toString());
    }
}
