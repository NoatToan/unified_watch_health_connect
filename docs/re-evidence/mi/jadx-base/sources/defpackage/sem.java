package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sem<T> implements koo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final moo f33567a = new moo();

    public final void a(koo kooVar) {
        this.f33567a.a(kooVar);
    }

    public abstract void b(Throwable th);

    public abstract void c(T t);

    @Override // defpackage.koo
    public final boolean isUnsubscribed() {
        return this.f33567a.isUnsubscribed();
    }

    @Override // defpackage.koo
    public final void unsubscribe() {
        this.f33567a.unsubscribe();
    }
}
