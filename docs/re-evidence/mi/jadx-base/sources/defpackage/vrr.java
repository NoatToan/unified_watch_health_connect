package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class vrr extends de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wd f37169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37170b;
    public final int c;
    public final t51 d;

    public vrr(int i, int i2, t51 t51Var) {
        this.f37169a = new wd(0L);
        this.f37170b = i;
        this.c = i2;
        this.d = t51Var;
    }

    public static vrr h(Object obj) {
        if (obj instanceof vrr) {
            return (vrr) obj;
        }
        if (obj != null) {
            return new vrr(te.q(obj));
        }
        return null;
    }

    public int g() {
        return this.f37170b;
    }

    public int i() {
        return this.c;
    }

    public t51 j() {
        return this.d;
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        jd jdVar = new jd();
        jdVar.a(this.f37169a);
        jdVar.a(new wd(this.f37170b));
        jdVar.a(new wd(this.c));
        jdVar.a(this.d);
        return new yg5(jdVar);
    }

    public vrr(te teVar) {
        this.f37169a = wd.o(teVar.t(0));
        this.f37170b = wd.o(teVar.t(1)).r().intValue();
        this.c = wd.o(teVar.t(2)).r().intValue();
        this.d = t51.h(teVar.t(3));
    }
}
