package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class uaf extends de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35570b;
    public final wua c;

    public uaf(int i, int i2, wua wuaVar) {
        this.f35569a = i;
        this.f35570b = i2;
        this.c = new wua(wuaVar);
    }

    public static uaf h(Object obj) {
        if (obj instanceof uaf) {
            return (uaf) obj;
        }
        if (obj != null) {
            return new uaf(te.q(obj));
        }
        return null;
    }

    public wua g() {
        return new wua(this.c);
    }

    public int i() {
        return this.f35569a;
    }

    public int j() {
        return this.f35570b;
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        jd jdVar = new jd();
        jdVar.a(new wd(this.f35569a));
        jdVar.a(new wd(this.f35570b));
        jdVar.a(new qg5(this.c.c()));
        return new yg5(jdVar);
    }

    public uaf(te teVar) {
        this.f35569a = ((wd) teVar.t(0)).r().intValue();
        this.f35570b = ((wd) teVar.t(1)).r().intValue();
        this.c = new wua(((he) teVar.t(2)).r());
    }
}
