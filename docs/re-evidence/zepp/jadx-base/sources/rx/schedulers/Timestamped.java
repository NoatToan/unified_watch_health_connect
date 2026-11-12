package rx.schedulers;

/* JADX INFO: loaded from: classes23.dex */
public final class Timestamped<T> {
    private final long a;
    private final T b;

    public Timestamped(long j, T t) {
        this.b = t;
        this.a = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Timestamped)) {
            return false;
        }
        Timestamped timestamped = (Timestamped) obj;
        if (this.a == timestamped.a) {
            T t = this.b;
            T t2 = timestamped.b;
            if (t == t2) {
                return true;
            }
            if (t != null && t.equals(t2)) {
                return true;
            }
        }
        return false;
    }

    public long getTimestampMillis() {
        return this.a;
    }

    public T getValue() {
        return this.b;
    }

    public int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) + 31) * 31;
        T t = this.b;
        return i + (t == null ? 0 : t.hashCode());
    }

    public String toString() {
        return String.format("Timestamped(timestampMillis = %d, value = %s)", Long.valueOf(this.a), this.b.toString());
    }
}
