package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class kdm<T> implements kqk<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f23755a;

    public kdm(T t) {
        this.f23755a = (T) a6i.d(t);
    }

    @Override // defpackage.kqk
    public Class<T> a() {
        return (Class<T>) this.f23755a.getClass();
    }

    @Override // defpackage.kqk
    public final T get() {
        return this.f23755a;
    }

    @Override // defpackage.kqk
    public final int getSize() {
        return 1;
    }

    @Override // defpackage.kqk
    public void recycle() {
    }
}
