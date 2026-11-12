package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class paf extends de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30166b;
    public byte[] c;
    public byte[] d;
    public byte[] e;
    public byte[] f;
    public byte[] g;

    public paf(int i, int i2, ava avaVar, a3i a3iVar, tsh tshVar, tsh tshVar2, wua wuaVar) {
        this.f30165a = i;
        this.f30166b = i2;
        this.c = avaVar.e();
        this.d = a3iVar.h();
        this.e = wuaVar.c();
        this.f = tshVar.a();
        this.g = tshVar2.a();
    }

    public static paf i(Object obj) {
        if (obj instanceof paf) {
            return (paf) obj;
        }
        if (obj != null) {
            return new paf(te.q(obj));
        }
        return null;
    }

    public ava g() {
        return new ava(this.c);
    }

    public a3i h() {
        return new a3i(g(), this.d);
    }

    public int j() {
        return this.f30166b;
    }

    public int k() {
        return this.f30165a;
    }

    public tsh l() {
        return new tsh(this.f);
    }

    public tsh m() {
        return new tsh(this.g);
    }

    public wua o() {
        return new wua(this.e);
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        jd jdVar = new jd();
        jdVar.a(new wd(this.f30165a));
        jdVar.a(new wd(this.f30166b));
        jdVar.a(new qg5(this.c));
        jdVar.a(new qg5(this.d));
        jdVar.a(new qg5(this.f));
        jdVar.a(new qg5(this.g));
        jdVar.a(new qg5(this.e));
        return new yg5(jdVar);
    }

    public paf(te teVar) {
        this.f30165a = ((wd) teVar.t(0)).r().intValue();
        this.f30166b = ((wd) teVar.t(1)).r().intValue();
        this.c = ((he) teVar.t(2)).r();
        this.d = ((he) teVar.t(3)).r();
        this.f = ((he) teVar.t(4)).r();
        this.g = ((he) teVar.t(5)).r();
        this.e = ((he) teVar.t(6)).r();
    }
}
