package ak;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a {
    public abstract byte[] b();

    public abstract int d();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return d() == aVar.d() && Arrays.equals(b(), aVar.b());
    }

    public int hashCode() {
        return b().hashCode() + ((d() + 217) * 31);
    }

    public String toString() {
        return k.a(d()) + ":" + k.b(b());
    }
}
