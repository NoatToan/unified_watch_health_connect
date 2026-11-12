package defpackage;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wve<T> implements g3i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<T> f38402a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s53<T> f38403b = new s53<>();

    public final T b(T t) {
        if (t != null) {
            synchronized (this) {
                this.f38402a.remove(t);
            }
        }
        return t;
    }

    @Override // defpackage.g3i
    public T get(int i) {
        return b(this.f38403b.a(i));
    }

    @Override // defpackage.g3i
    public T pop() {
        return b(this.f38403b.f());
    }

    @Override // defpackage.g3i
    public void put(T t) {
        boolean zAdd;
        synchronized (this) {
            zAdd = this.f38402a.add(t);
        }
        if (zAdd) {
            this.f38403b.e(a(t), t);
        }
    }
}
