package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class sge<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f33612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sge<T> f33613b;

    public sge(T t, sge<T> sgeVar) {
        this.f33612a = t;
        this.f33613b = sgeVar;
    }

    public static <ST> boolean a(sge<ST> sgeVar, ST st) {
        while (sgeVar != null) {
            if (sgeVar.d() == st) {
                return true;
            }
            sgeVar = sgeVar.c();
        }
        return false;
    }

    public void b(sge<T> sgeVar) {
        if (this.f33613b != null) {
            throw new IllegalStateException();
        }
        this.f33613b = sgeVar;
    }

    public sge<T> c() {
        return this.f33613b;
    }

    public T d() {
        return this.f33612a;
    }
}
