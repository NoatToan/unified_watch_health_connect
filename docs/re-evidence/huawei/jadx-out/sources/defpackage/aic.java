package defpackage;

/* JADX INFO: loaded from: classes21.dex */
public final class aic<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f448a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private aic<T> f449c;

    public aic(T t, aic<T> aicVar) {
        this.f448a = t;
        this.f449c = aicVar;
    }

    public void a(aic<T> aicVar) {
        if (this.f449c != null) {
            throw new IllegalStateException();
        }
        this.f449c = aicVar;
    }

    public aic<T> e() {
        return this.f449c;
    }

    public T c() {
        return this.f448a;
    }

    public static <ST> boolean b(aic<ST> aicVar, ST st) {
        while (aicVar != null) {
            if (aicVar.c() == st) {
                return true;
            }
            aicVar = aicVar.e();
        }
        return false;
    }
}
