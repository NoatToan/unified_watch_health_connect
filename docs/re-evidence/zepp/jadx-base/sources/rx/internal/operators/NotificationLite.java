package rx.internal.operators;

import java.io.Serializable;
import rx.Observer;

/* JADX INFO: loaded from: classes23.dex */
public final class NotificationLite {
    private static final Object a = new a();
    private static final Object b = new b();

    public static class a implements Serializable {
        private static final long serialVersionUID = 1;

        public String toString() {
            return "Notification=>Completed";
        }
    }

    public static class b implements Serializable {
        private static final long serialVersionUID = 2;

        public String toString() {
            return "Notification=>NULL";
        }
    }

    public static final class c implements Serializable {
        private static final long serialVersionUID = 3;
        public final Throwable a;

        public c(Throwable th) {
            this.a = th;
        }

        public String toString() {
            return "Notification=>Error:" + this.a;
        }
    }

    private NotificationLite() {
    }

    public static <T> boolean accept(Observer<? super T> observer, Object obj) {
        if (obj == a) {
            observer.onCompleted();
            return true;
        }
        if (obj == b) {
            observer.onNext(null);
            return false;
        }
        if (obj == null) {
            throw new IllegalArgumentException("The lite notification can not be null");
        }
        if (obj.getClass() == c.class) {
            observer.onError(((c) obj).a);
            return true;
        }
        observer.onNext(obj);
        return false;
    }

    public static Object completed() {
        return a;
    }

    public static Object error(Throwable th) {
        return new c(th);
    }

    public static Throwable getError(Object obj) {
        return ((c) obj).a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T getValue(Object obj) {
        if (obj == b) {
            return null;
        }
        return obj;
    }

    public static boolean isCompleted(Object obj) {
        return obj == a;
    }

    public static boolean isError(Object obj) {
        return obj instanceof c;
    }

    public static boolean isNext(Object obj) {
        return (obj == null || isError(obj) || isCompleted(obj)) ? false : true;
    }

    public static boolean isNull(Object obj) {
        return obj == b;
    }

    public static <T> Object next(T t) {
        return t == null ? b : t;
    }
}
