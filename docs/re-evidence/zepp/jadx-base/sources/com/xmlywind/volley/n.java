package com.xmlywind.volley;

/* JADX INFO: loaded from: classes22.dex */
public class n<T> {
    public final T a;
    public final com.xmlywind.volley.b.a b;
    public final s c;
    public boolean d;

    public interface a {
        void onErrorResponse(s sVar);
    }

    public interface b<T> {
        void a(T t);
    }

    private n(s sVar) {
        this.d = false;
        this.a = null;
        this.b = null;
        this.c = sVar;
    }

    private n(T t, com.xmlywind.volley.b.a aVar) {
        this.d = false;
        this.a = t;
        this.b = aVar;
        this.c = null;
    }

    public static <T> n<T> a(s sVar) {
        return new n<>(sVar);
    }

    public static <T> n<T> a(T t, com.xmlywind.volley.b.a aVar) {
        return new n<>(t, aVar);
    }

    public boolean a() {
        return this.c == null;
    }
}
