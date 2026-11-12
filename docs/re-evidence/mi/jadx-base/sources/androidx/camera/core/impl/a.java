package androidx.camera.core.impl;

/* JADX INFO: loaded from: classes.dex */
public final class a<T> extends Config.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<T> f1723b;
    public final Object c;

    public a(String str, Class<T> cls, Object obj) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f1722a = str;
        if (cls == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.f1723b = cls;
        this.c = obj;
    }

    @Override // androidx.camera.core.impl.Config.a
    public String c() {
        return this.f1722a;
    }

    @Override // androidx.camera.core.impl.Config.a
    public Object d() {
        return this.c;
    }

    @Override // androidx.camera.core.impl.Config.a
    public Class<T> e() {
        return this.f1723b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Config.a)) {
            return false;
        }
        Config.a aVar = (Config.a) obj;
        if (this.f1722a.equals(aVar.c()) && this.f1723b.equals(aVar.e())) {
            Object obj2 = this.c;
            if (obj2 == null) {
                if (aVar.d() == null) {
                    return true;
                }
            } else if (obj2.equals(aVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f1722a.hashCode() ^ 1000003) * 1000003) ^ this.f1723b.hashCode()) * 1000003;
        Object obj = this.c;
        return iHashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "Option{id=" + this.f1722a + ", valueClass=" + this.f1723b + ", token=" + this.c + "}";
    }
}
