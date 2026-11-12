package defpackage;

import androidx.core.util.Pair;

/* JADX INFO: loaded from: classes21.dex */
public class fv<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    T f34602a;
    T e;

    public void d(T t, T t2) {
        this.f34602a = t;
        this.e = t2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return e(pair.first, this.f34602a) && e(pair.second, this.e);
    }

    private static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public int hashCode() {
        T t = this.f34602a;
        int iHashCode = t == null ? 0 : t.hashCode();
        T t2 = this.e;
        return iHashCode ^ (t2 != null ? t2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f34602a + " " + this.e + "}";
    }
}
