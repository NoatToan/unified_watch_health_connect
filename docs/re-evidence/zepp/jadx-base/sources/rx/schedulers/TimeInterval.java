package rx.schedulers;

/* JADX INFO: loaded from: classes23.dex */
public class TimeInterval<T> {
    private final long a;
    private final T b;

    public TimeInterval(long j, T t) {
        this.b = t;
        this.a = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TimeInterval timeInterval = (TimeInterval) obj;
        if (this.a != timeInterval.a) {
            return false;
        }
        T t = this.b;
        if (t == null) {
            if (timeInterval.b != null) {
                return false;
            }
        } else if (!t.equals(timeInterval.b)) {
            return false;
        }
        return true;
    }

    public long getIntervalInMilliseconds() {
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
        return "TimeInterval [intervalInMilliseconds=" + this.a + ", value=" + this.b + "]";
    }
}
