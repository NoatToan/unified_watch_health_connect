package com.google.android.play.integrity.internal;

/* JADX INFO: loaded from: classes14.dex */
public final class ax implements bb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f53440a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile bb f53441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Object f53442c = f53440a;

    private ax(bb bbVar) {
        this.f53441b = bbVar;
    }

    public static bb b(bb bbVar) {
        return bbVar instanceof ax ? bbVar : new ax(bbVar);
    }

    @Override // com.google.android.play.integrity.internal.bd, com.google.android.play.integrity.internal.bc
    public final Object a() {
        Object objA;
        Object obj = this.f53442c;
        Object obj2 = f53440a;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objA = this.f53442c;
                if (objA == obj2) {
                    objA = this.f53441b.a();
                    Object obj3 = this.f53442c;
                    if (obj3 != obj2 && obj3 != objA) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objA + ". This is likely due to a circular dependency.");
                    }
                    this.f53442c = objA;
                    this.f53441b = null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return objA;
    }
}
