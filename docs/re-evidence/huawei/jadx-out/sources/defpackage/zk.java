package defpackage;

/* JADX INFO: loaded from: classes21.dex */
public class zk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f54212a;
    private final wq d;
    private final Class<?> e;

    public zk(Object obj, Class<?> cls, wq wqVar) {
        this.f54212a = obj;
        this.e = cls;
        this.d = wqVar;
    }

    public String toString() {
        return String.format("Object id [%s] (for %s) at %s", this.f54212a, ahw.u(this.e), this.d);
    }
}
