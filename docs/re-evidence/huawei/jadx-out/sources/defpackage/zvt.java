package defpackage;

import java.net.InetSocketAddress;

/* JADX INFO: loaded from: classes20.dex */
public class zvt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f54626a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zve f54627c;
    private final Object d;

    public zvt(zve zveVar, Object obj) {
        this.f54627c = zveVar;
        this.d = obj;
        int iHashCode = zveVar.hashCode();
        this.f54626a = obj != null ? iHashCode + (obj.hashCode() * 31) : iHashCode;
    }

    public final int hashCode() {
        return this.f54626a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zvt zvtVar = (zvt) obj;
        if (this.f54626a != zvtVar.f54626a || !this.f54627c.equals(zvtVar.f54627c)) {
            return false;
        }
        Object obj2 = this.d;
        Object obj3 = zvtVar.d;
        if (obj2 == obj3) {
            return true;
        }
        if (obj2 == null) {
            return false;
        }
        return obj2.equals(obj3);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("KeyToken[");
        Object objB = this.d;
        if (objB != null) {
            if (objB instanceof InetSocketAddress) {
                objB = zzp.b((InetSocketAddress) objB);
            }
            sb.append(objB);
            sb.append('-');
        }
        sb.append(this.f54627c.a());
        sb.append(']');
        return sb.toString();
    }
}
