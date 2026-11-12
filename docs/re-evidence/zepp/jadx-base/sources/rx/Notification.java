package rx;

import io.netty.util.internal.StringUtil;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* JADX INFO: loaded from: classes23.dex */
public final class Notification<T> {
    private static final Notification<Void> d = new Notification<>(Kind.OnCompleted, null, null);
    private final Kind a;
    private final Throwable b;
    private final T c;

    public enum Kind {
        OnNext,
        OnError,
        OnCompleted
    }

    private Notification(Kind kind, T t, Throwable th) {
        this.c = t;
        this.b = th;
        this.a = kind;
    }

    public static <T> Notification<T> createOnCompleted() {
        return (Notification<T>) d;
    }

    public static <T> Notification<T> createOnError(Throwable th) {
        return new Notification<>(Kind.OnError, null, th);
    }

    public static <T> Notification<T> createOnNext(T t) {
        return new Notification<>(Kind.OnNext, t, null);
    }

    public void accept(Observer<? super T> observer) {
        Kind kind = this.a;
        if (kind == Kind.OnNext) {
            observer.onNext(getValue());
        } else if (kind == Kind.OnCompleted) {
            observer.onCompleted();
        } else {
            observer.onError(getThrowable());
        }
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
        if (notification.getKind() != getKind()) {
            return false;
        }
        T t = this.c;
        T t2 = notification.c;
        if (t != t2 && (t == null || !t.equals(t2))) {
            return false;
        }
        Throwable th = this.b;
        Throwable th2 = notification.b;
        return th == th2 || (th != null && th.equals(th2));
    }

    public Kind getKind() {
        return this.a;
    }

    public Throwable getThrowable() {
        return this.b;
    }

    public T getValue() {
        return this.c;
    }

    public boolean hasThrowable() {
        return isOnError() && this.b != null;
    }

    public boolean hasValue() {
        return isOnNext() && this.c != null;
    }

    public int hashCode() {
        int iHashCode = getKind().hashCode();
        if (hasValue()) {
            iHashCode = (iHashCode * 31) + getValue().hashCode();
        }
        return hasThrowable() ? (iHashCode * 31) + getThrowable().hashCode() : iHashCode;
    }

    public boolean isOnCompleted() {
        return getKind() == Kind.OnCompleted;
    }

    public boolean isOnError() {
        return getKind() == Kind.OnError;
    }

    public boolean isOnNext() {
        return getKind() == Kind.OnNext;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(JsonLexerKt.BEGIN_LIST);
        sb.append(super.toString());
        sb.append(StringUtil.SPACE);
        sb.append(getKind());
        if (hasValue()) {
            sb.append(StringUtil.SPACE);
            sb.append(getValue());
        }
        if (hasThrowable()) {
            sb.append(StringUtil.SPACE);
            sb.append(getThrowable().getMessage());
        }
        sb.append(JsonLexerKt.END_LIST);
        return sb.toString();
    }

    @Deprecated
    public static <T> Notification<T> createOnCompleted(Class<T> cls) {
        return (Notification<T>) d;
    }
}
