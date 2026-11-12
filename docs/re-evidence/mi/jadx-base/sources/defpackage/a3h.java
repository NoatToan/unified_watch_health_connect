package defpackage;

import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes4.dex */
public class a3h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SoftReference<T> f573a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SoftReference<T> f574b = null;
    public SoftReference<T> c = null;

    public void a() {
        SoftReference<T> softReference = this.f573a;
        if (softReference != null) {
            softReference.clear();
            this.f573a = null;
        }
        SoftReference<T> softReference2 = this.f574b;
        if (softReference2 != null) {
            softReference2.clear();
            this.f574b = null;
        }
        SoftReference<T> softReference3 = this.c;
        if (softReference3 != null) {
            softReference3.clear();
            this.c = null;
        }
    }

    public T b() {
        SoftReference<T> softReference = this.f573a;
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    public void c(T t) {
        this.f573a = new SoftReference<>(t);
        this.f574b = new SoftReference<>(t);
        this.c = new SoftReference<>(t);
    }
}
