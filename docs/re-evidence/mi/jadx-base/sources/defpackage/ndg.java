package defpackage;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ndg<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f27813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f27814b;

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public void b(T t, T t2) {
        this.f27813a = t;
        this.f27814b = t2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof njh)) {
            return false;
        }
        njh njhVar = (njh) obj;
        return a(njhVar.f27979a, this.f27813a) && a(njhVar.f27980b, this.f27814b);
    }

    public int hashCode() {
        T t = this.f27813a;
        int iHashCode = t == null ? 0 : t.hashCode();
        T t2 = this.f27814b;
        return iHashCode ^ (t2 != null ? t2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f27813a + " " + this.f27814b + "}";
    }
}
