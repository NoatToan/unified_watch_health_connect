package io.reactivex.internal.util;

import defpackage.joo;
import defpackage.jz6;
import defpackage.x3h;
import defpackage.yno;
import defpackage.z5h;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public enum NotificationLite {
    COMPLETE;

    public static final class a implements Serializable {
        private static final long serialVersionUID = -7482590109178395495L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final jz6 f21345a;

        public a(jz6 jz6Var) {
            this.f21345a = jz6Var;
        }

        public String toString() {
            return "NotificationLite.Disposable[" + this.f21345a + "]";
        }
    }

    public static final class b implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f21346a;

        public b(Throwable th) {
            this.f21346a = th;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return x3h.c(this.f21346a, ((b) obj).f21346a);
            }
            return false;
        }

        public int hashCode() {
            return this.f21346a.hashCode();
        }

        public String toString() {
            return "NotificationLite.Error[" + this.f21346a + "]";
        }
    }

    public static final class c implements Serializable {
        private static final long serialVersionUID = -1322257508628817540L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final joo f21347a;

        public c(joo jooVar) {
            this.f21347a = jooVar;
        }

        public String toString() {
            return "NotificationLite.Subscription[" + this.f21347a + "]";
        }
    }

    public static <T> boolean accept(Object obj, yno<? super T> ynoVar) {
        if (obj == COMPLETE) {
            ynoVar.onComplete();
            return true;
        }
        if (obj instanceof b) {
            ynoVar.onError(((b) obj).f21346a);
            return true;
        }
        ynoVar.onNext(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, yno<? super T> ynoVar) {
        if (obj == COMPLETE) {
            ynoVar.onComplete();
            return true;
        }
        if (obj instanceof b) {
            ynoVar.onError(((b) obj).f21346a);
            return true;
        }
        if (obj instanceof c) {
            ynoVar.onSubscribe(((c) obj).f21347a);
            return false;
        }
        ynoVar.onNext(obj);
        return false;
    }

    public static Object complete() {
        return COMPLETE;
    }

    public static Object disposable(jz6 jz6Var) {
        return new a(jz6Var);
    }

    public static Object error(Throwable th) {
        return new b(th);
    }

    public static jz6 getDisposable(Object obj) {
        return ((a) obj).f21345a;
    }

    public static Throwable getError(Object obj) {
        return ((b) obj).f21346a;
    }

    public static joo getSubscription(Object obj) {
        return ((c) obj).f21347a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T getValue(Object obj) {
        return obj;
    }

    public static boolean isComplete(Object obj) {
        return obj == COMPLETE;
    }

    public static boolean isDisposable(Object obj) {
        return obj instanceof a;
    }

    public static boolean isError(Object obj) {
        return obj instanceof b;
    }

    public static boolean isSubscription(Object obj) {
        return obj instanceof c;
    }

    public static <T> Object next(T t) {
        return t;
    }

    public static Object subscription(joo jooVar) {
        return new c(jooVar);
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }

    public static <T> boolean accept(Object obj, z5h<? super T> z5hVar) {
        if (obj == COMPLETE) {
            z5hVar.onComplete();
            return true;
        }
        if (obj instanceof b) {
            z5hVar.onError(((b) obj).f21346a);
            return true;
        }
        z5hVar.onNext(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, z5h<? super T> z5hVar) {
        if (obj == COMPLETE) {
            z5hVar.onComplete();
            return true;
        }
        if (obj instanceof b) {
            z5hVar.onError(((b) obj).f21346a);
            return true;
        }
        if (obj instanceof a) {
            z5hVar.onSubscribe(((a) obj).f21345a);
            return false;
        }
        z5hVar.onNext(obj);
        return false;
    }
}
