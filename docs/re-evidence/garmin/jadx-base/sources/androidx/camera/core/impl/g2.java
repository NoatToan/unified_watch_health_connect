package androidx.camera.core.impl;

/* JADX INFO: loaded from: classes.dex */
public final class g2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f2 f5560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g2 f5561c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x1<f2> f5562a = x1.g(f5560b);

    public static class a<T> implements z1.a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k7.b<T> f5563a;

        public a(k7.b<T> bVar) {
            this.f5563a = bVar;
        }

        @Override // androidx.camera.core.impl.z1.a
        public final void a(T t7) {
            this.f5563a.accept(t7);
        }

        @Override // androidx.camera.core.impl.z1.a
        public final void onError(Throwable th3) {
        }
    }

    static {
        f2.b bVar = new f2.b();
        bVar.f5552a = true;
        f5560b = new f2(true, bVar.f5553b, bVar.f5554c);
        f5561c = new g2();
    }
}
