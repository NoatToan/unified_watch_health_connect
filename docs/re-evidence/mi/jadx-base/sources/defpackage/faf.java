package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class faf extends de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17599b;
    public final wua c;
    public final t51 d;

    public faf(int i, int i2, wua wuaVar, t51 t51Var) {
        this.f17598a = i;
        this.f17599b = i2;
        this.c = new wua(wuaVar.c());
        this.d = t51Var;
    }

    public static faf i(Object obj) {
        if (obj instanceof faf) {
            return (faf) obj;
        }
        if (obj != null) {
            return new faf(te.q(obj));
        }
        return null;
    }

    public t51 g() {
        return this.d;
    }

    public wua h() {
        return this.c;
    }

    public int j() {
        return this.f17598a;
    }

    public int k() {
        return this.f17599b;
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        jd jdVar = new jd();
        jdVar.a(new wd(this.f17598a));
        jdVar.a(new wd(this.f17599b));
        jdVar.a(new qg5(this.c.c()));
        jdVar.a(this.d);
        return new yg5(jdVar);
    }

    public faf(te teVar) {
        this.f17598a = ((wd) teVar.t(0)).r().intValue();
        this.f17599b = ((wd) teVar.t(1)).r().intValue();
        this.c = new wua(((he) teVar.t(2)).r());
        this.d = t51.h(teVar.t(3));
    }
}
