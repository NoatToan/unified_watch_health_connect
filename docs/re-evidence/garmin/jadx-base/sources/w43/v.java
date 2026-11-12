package w43;

import p43.n0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<p005kotlin.reflect.jvm.internal.impl.builtins.d, n0> f182054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f182055b;

    public static final class a extends v {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f182056c = new a();

        private a() {
            super("Boolean", u.f182053a, null);
        }
    }

    public static final class b extends v {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f182057c = new b();

        private b() {
            super("Int", w.f182059a, null);
        }
    }

    public static final class c extends v {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f182058c = new c();

        private c() {
            super("Unit", x.f182060a, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private v(String str, e23.l<? super p005kotlin.reflect.jvm.internal.impl.builtins.d, ? extends n0> lVar) {
        this.f182054a = lVar;
        this.f182055b = fb1.c.n("must return ", str);
    }

    @Override // w43.f
    public final boolean a(j33.e eVar) {
        return p005kotlin.jvm.internal.s.g(eVar.f181725g, this.f182054a.invoke(f43.e.e(eVar)));
    }

    @Override // w43.f
    public final /* bridge */ String b(j33.e eVar) {
        return f.a.a(this, eVar);
    }

    @Override // w43.f
    public final String getDescription() {
        return this.f182055b;
    }

    public /* synthetic */ v(String str, e23.l lVar, p005kotlin.jvm.internal.j jVar) {
        this(str, lVar);
    }
}
