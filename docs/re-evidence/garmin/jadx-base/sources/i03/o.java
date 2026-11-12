package i03;

import j20.x;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class o<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f86962a;

    public o(String str) {
        this.f86962a = str;
    }

    public final T a(q qVar) {
        T t7 = (T) ((r) qVar).f86966a.get(this);
        if (t7 != null) {
            return t7;
        }
        x.l(this.f86962a);
        return null;
    }

    public final void b(q qVar, T t7) {
        HashMap map = ((r) qVar).f86966a;
        if (t7 == null) {
            map.remove(this);
        } else {
            map.put(this, t7);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f86962a.equals(((o) obj).f86962a);
    }

    public final int hashCode() {
        return this.f86962a.hashCode();
    }

    public final String toString() {
        return am.j.o(this.f86962a, "'}", new StringBuilder("Prop{name='"));
    }
}
