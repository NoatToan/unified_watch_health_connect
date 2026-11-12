package x33;

import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f188594c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f188595d = new c("");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f188596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient c f188597b;

    public c(String str) {
        str.getClass();
        this.f188596a = new d(str, this);
    }

    public final c a(f fVar) {
        fVar.getClass();
        return new c(this.f188596a.a(fVar), this);
    }

    public final c b() {
        c cVar = this.f188597b;
        if (cVar != null) {
            return cVar;
        }
        d dVar = this.f188596a;
        if (dVar.c()) {
            vb.h.z("root");
            return null;
        }
        c cVar2 = new c(dVar.e());
        this.f188597b = cVar2;
        return cVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return s.g(this.f188596a, ((c) obj).f188596a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f188596a.f188600a.hashCode();
    }

    public final String toString() {
        return this.f188596a.toString();
    }

    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static c a(f fVar) {
            fVar.getClass();
            d.f188598e.getClass();
            String strB = fVar.b();
            strB.getClass();
            return new c(new d(strB, c.f188595d.f188596a, fVar, null));
        }

        private a() {
        }
    }

    public c(d dVar) {
        dVar.getClass();
        this.f188596a = dVar;
    }

    private c(d dVar, c cVar) {
        this.f188596a = dVar;
        this.f188597b = cVar;
    }
}
