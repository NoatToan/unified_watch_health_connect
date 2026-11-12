package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class i7s implements t7s {
    public static final Object c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile t7s f20872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f20873b = c;

    public i7s(t7s t7sVar) {
        this.f20872a = t7sVar;
    }

    public static t7s b(t7s t7sVar) {
        return t7sVar instanceof i7s ? t7sVar : new i7s(t7sVar);
    }

    public static i7s c(t7s t7sVar) {
        return new i7s(t7sVar);
    }

    @Override // defpackage.f8s
    public final Object a() {
        Object objA = this.f20873b;
        Object obj = c;
        if (objA == obj) {
            synchronized (this) {
                try {
                    objA = this.f20873b;
                    if (objA == obj) {
                        objA = this.f20872a.a();
                        Object obj2 = this.f20873b;
                        if (obj2 != obj && obj2 != objA) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objA + ". This is likely due to a circular dependency.");
                        }
                        this.f20873b = objA;
                        this.f20872a = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return objA;
    }
}
