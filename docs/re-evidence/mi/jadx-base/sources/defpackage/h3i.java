package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class h3i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j3i f19646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k3i f19647b;
    public final j3i c;
    public final spf d;
    public final j3i e;
    public final k3i f;
    public final j3i g;
    public final k3i h;
    public final String i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f19648k;
    public final boolean l;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public j3i f19649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public k3i f19650b;
        public j3i c;
        public spf d;
        public j3i e;
        public k3i f;
        public j3i g;
        public k3i h;
        public String i;
        public int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f19651k;
        public boolean l;

        public h3i m() {
            return new h3i(this);
        }

        public b() {
        }
    }

    public static b m() {
        return new b();
    }

    public int a() {
        return this.f19648k;
    }

    public int b() {
        return this.j;
    }

    public j3i c() {
        return this.f19646a;
    }

    public k3i d() {
        return this.f19647b;
    }

    public String e() {
        return this.i;
    }

    public j3i f() {
        return this.c;
    }

    public j3i g() {
        return this.e;
    }

    public k3i h() {
        return this.f;
    }

    public spf i() {
        return this.d;
    }

    public j3i j() {
        return this.g;
    }

    public k3i k() {
        return this.h;
    }

    public boolean l() {
        return this.l;
    }

    public h3i(b bVar) {
        if (epa.d()) {
            epa.a("PoolConfig()");
        }
        this.f19646a = bVar.f19649a == null ? tt5.a() : bVar.f19649a;
        this.f19647b = bVar.f19650b == null ? zug.h() : bVar.f19650b;
        this.c = bVar.c == null ? bv5.b() : bVar.c;
        this.d = bVar.d == null ? yug.a() : bVar.d;
        this.e = bVar.e == null ? gw5.a() : bVar.e;
        this.f = bVar.f == null ? zug.h() : bVar.f;
        this.g = bVar.g == null ? vt5.a() : bVar.g;
        this.h = bVar.h == null ? zug.h() : bVar.h;
        this.i = bVar.i == null ? "legacy" : bVar.i;
        this.j = bVar.j;
        this.f19648k = bVar.f19651k > 0 ? bVar.f19651k : 4194304;
        this.l = bVar.l;
        if (epa.d()) {
            epa.b();
        }
    }
}
