package rx;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class Notification<T> {
    public static final Notification<Void> d = new Notification<>(Kind.OnCompleted, null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Kind f32994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f32995b;
    public final T c;

    public enum Kind {
        OnNext,
        OnError,
        OnCompleted
    }

    public Notification(Kind kind, T t, Throwable th) {
        this.c = t;
        this.f32995b = th;
        this.f32994a = kind;
    }

    public Kind a() {
        return this.f32994a;
    }

    public Throwable b() {
        return this.f32995b;
    }

    public T c() {
        return this.c;
    }

    public boolean d() {
        return f() && this.f32995b != null;
    }

    public boolean e() {
        return g() && this.c != null;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj.getClass() != Notification.class) {
            return false;
        }
        Notification notification = (Notification) obj;
        if (notification.a() != a()) {
            return false;
        }
        T t = this.c;
        T t2 = notification.c;
        if (t != t2 && (t == null || !t.equals(t2))) {
            return false;
        }
        Throwable th = this.f32995b;
        Throwable th2 = notification.f32995b;
        return th == th2 || (th != null && th.equals(th2));
    }

    public boolean f() {
        return a() == Kind.OnError;
    }

    public boolean g() {
        return a() == Kind.OnNext;
    }

    public int hashCode() {
        int iHashCode = a().hashCode();
        if (e()) {
            iHashCode = (iHashCode * 31) + c().hashCode();
        }
        return d() ? (iHashCode * 31) + b().hashCode() : iHashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb.append(super.toString());
        sb.append(' ');
        sb.append(a());
        if (e()) {
            sb.append(' ');
            sb.append(c());
        }
        if (d()) {
            sb.append(' ');
            sb.append(b().getMessage());
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }
}
