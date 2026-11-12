package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class bxg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f4702a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f4703b = new b();

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

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f4704a;

        public c(Throwable th) {
            this.f4704a = th;
        }

        public String toString() {
            return "Notification=>Error:" + this.f4704a;
        }
    }

    public static <T> boolean a(a6h<? super T> a6hVar, Object obj) {
        if (obj == f4702a) {
            a6hVar.onCompleted();
            return true;
        }
        if (obj == f4703b) {
            a6hVar.onNext(null);
            return false;
        }
        if (obj == null) {
            throw new IllegalArgumentException("The lite notification can not be null");
        }
        if (obj.getClass() == c.class) {
            a6hVar.onError(((c) obj).f4704a);
            return true;
        }
        a6hVar.onNext(obj);
        return false;
    }

    public static Object b() {
        return f4702a;
    }

    public static Object c(Throwable th) {
        return new c(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T d(Object obj) {
        if (obj == f4703b) {
            return null;
        }
        return obj;
    }

    public static boolean e(Object obj) {
        return obj == f4702a;
    }

    public static boolean f(Object obj) {
        return obj instanceof c;
    }

    public static <T> Object g(T t) {
        return t == null ? f4703b : t;
    }
}
