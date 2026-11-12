package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes20.dex */
public class xho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<String, xht> f53002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, xhp> f53003b;
    private ConcurrentHashMap<String, xhr> d;
    private CopyOnWriteArrayList<xhr> e;

    private xho() {
        this.e = new CopyOnWriteArrayList<>();
        this.d = new ConcurrentHashMap<>(20);
        this.f53002a = new ConcurrentHashMap<>(20);
        this.f53003b = new ConcurrentHashMap<>(20);
    }

    public static xho d() {
        return c.e;
    }

    public ConcurrentHashMap<String, xhp> b() {
        return this.f53003b;
    }

    public ConcurrentHashMap<String, xht> e() {
        return this.f53002a;
    }

    public CopyOnWriteArrayList<xhr> a() {
        return this.e;
    }

    public ConcurrentHashMap<String, xhr> c() {
        return this.d;
    }

    static class c {
        private static xho e = new xho();
    }
}
