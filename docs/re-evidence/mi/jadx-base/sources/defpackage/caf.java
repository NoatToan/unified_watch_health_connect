package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class caf extends x9f {
    public int c;
    public int d;
    public ava e;
    public a3i f;
    public tsh g;
    public wua h;
    public a3i[] i;

    public caf(int i, int i2, ava avaVar, a3i a3iVar, wua wuaVar, tsh tshVar, String str) {
        super(true, str);
        this.c = i;
        this.d = i2;
        this.e = avaVar;
        this.f = a3iVar;
        this.h = wuaVar;
        this.g = tshVar;
        this.i = new c3i(avaVar, a3iVar).c();
    }

    public ava c() {
        return this.e;
    }

    public a3i d() {
        return this.f;
    }

    public wua e() {
        return this.h;
    }

    public int f() {
        return this.d;
    }

    public int g() {
        return this.c;
    }

    public tsh h() {
        return this.g;
    }

    public a3i[] i() {
        return this.i;
    }

    public caf(int i, int i2, ava avaVar, a3i a3iVar, tsh tshVar, String str) {
        this(i, i2, avaVar, a3iVar, r2b.a(avaVar, a3iVar), tshVar, str);
    }
}
