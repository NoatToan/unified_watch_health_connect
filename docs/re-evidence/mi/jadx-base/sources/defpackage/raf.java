package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class raf extends laf {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f32355b;
    public int c;
    public ava d;
    public a3i e;
    public wua f;
    public tsh g;
    public tsh h;
    public wua i;
    public a3i[] j;

    public raf(int i, int i2, ava avaVar, a3i a3iVar, tsh tshVar, tsh tshVar2, wua wuaVar) {
        super(true, null);
        this.c = i2;
        this.f32355b = i;
        this.d = avaVar;
        this.e = a3iVar;
        this.f = wuaVar;
        this.g = tshVar;
        this.h = tshVar2;
        this.i = r2b.a(avaVar, a3iVar);
        this.j = new c3i(avaVar, a3iVar).c();
    }

    public ava b() {
        return this.d;
    }

    public a3i c() {
        return this.e;
    }

    public wua d() {
        return this.i;
    }

    public int e() {
        return this.c;
    }

    public int f() {
        return this.f32355b;
    }

    public tsh g() {
        return this.g;
    }

    public tsh h() {
        return this.h;
    }

    public a3i[] i() {
        return this.j;
    }

    public wua j() {
        return this.f;
    }
}
