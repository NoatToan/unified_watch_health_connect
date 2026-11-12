package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class aaf extends de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f827b;
    public byte[] c;
    public byte[] d;
    public byte[] e;
    public t51 f;

    public aaf(int i, int i2, ava avaVar, a3i a3iVar, tsh tshVar, t51 t51Var) {
        this.f826a = i;
        this.f827b = i2;
        this.c = avaVar.e();
        this.d = a3iVar.h();
        this.e = tshVar.a();
        this.f = t51Var;
    }

    public static aaf j(Object obj) {
        if (obj instanceof aaf) {
            return (aaf) obj;
        }
        if (obj != null) {
            return new aaf(te.q(obj));
        }
        return null;
    }

    public t51 g() {
        return this.f;
    }

    public ava h() {
        return new ava(this.c);
    }

    public a3i i() {
        return new a3i(h(), this.d);
    }

    public int k() {
        return this.f827b;
    }

    public int l() {
        return this.f826a;
    }

    public tsh m() {
        return new tsh(this.e);
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        jd jdVar = new jd();
        jdVar.a(new wd(this.f826a));
        jdVar.a(new wd(this.f827b));
        jdVar.a(new qg5(this.c));
        jdVar.a(new qg5(this.d));
        jdVar.a(new qg5(this.e));
        jdVar.a(this.f);
        return new yg5(jdVar);
    }

    public aaf(te teVar) {
        this.f826a = ((wd) teVar.t(0)).r().intValue();
        this.f827b = ((wd) teVar.t(1)).r().intValue();
        this.c = ((he) teVar.t(2)).r();
        this.d = ((he) teVar.t(3)).r();
        this.e = ((he) teVar.t(4)).r();
        this.f = t51.h(teVar.t(5));
    }
}
