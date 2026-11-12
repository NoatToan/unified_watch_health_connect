package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class i5l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i5l f20815b = new i5l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<k5l> f20816a = new AtomicReference<>();

    public static i5l a() {
        return f20815b;
    }

    public k5l b() {
        if (this.f20816a.get() == null) {
            d8i.a(this.f20816a, null, k5l.a());
        }
        return this.f20816a.get();
    }
}
