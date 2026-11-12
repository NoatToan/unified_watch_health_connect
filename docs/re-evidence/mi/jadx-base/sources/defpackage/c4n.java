package defpackage;

import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c4n<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SoftReference<T> f4920a = null;

    public abstract T a(Object obj);

    public final T b(Object obj) {
        T tA;
        synchronized (this) {
            try {
                SoftReference<T> softReference = this.f4920a;
                if (softReference == null || (tA = softReference.get()) == null) {
                    tA = a(obj);
                    this.f4920a = new SoftReference<>(tA);
                } else {
                    c(tA, obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return tA;
    }

    public void c(T t, Object obj) {
    }
}
