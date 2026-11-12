package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class ei5 extends de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public xf5 f16669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public wd f16670b;

    public ei5(te teVar) {
        if (teVar.size() == 2) {
            this.f16669a = xf5.v(teVar.t(0));
            this.f16670b = wd.o(teVar.t(1));
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + teVar.size());
        }
    }

    public static ei5 g(Object obj) {
        if (obj instanceof ei5) {
            return (ei5) obj;
        }
        if (obj != null) {
            return new ei5(te.q(obj));
        }
        return null;
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        jd jdVar = new jd();
        jdVar.a(this.f16669a);
        jdVar.a(this.f16670b);
        return new yg5(jdVar);
    }
}
