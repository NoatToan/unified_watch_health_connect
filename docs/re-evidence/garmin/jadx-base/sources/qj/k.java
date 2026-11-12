package qj;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes7.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Class<?> f144979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Class<?> f144980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Class<?> f144981c;

    public k(Class<?> cls, Class<?> cls2) {
        this.f144979a = cls;
        this.f144980b = cls2;
        this.f144981c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.f144979a.equals(kVar.f144979a) && this.f144980b.equals(kVar.f144980b) && m.b(this.f144981c, kVar.f144981c);
    }

    public final int hashCode() {
        int iHashCode = (this.f144980b.hashCode() + (this.f144979a.hashCode() * 31)) * 31;
        Class<?> cls = this.f144981c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f144979a + ", second=" + this.f144980b + CoreConstants.CURLY_RIGHT;
    }

    public k() {
    }

    public k(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f144979a = cls;
        this.f144980b = cls2;
        this.f144981c = cls3;
    }
}
