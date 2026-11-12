package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class jm1 extends de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ee f22916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public hd f22917b;

    public jm1(te teVar) {
        this.f22916a = (ee) teVar.t(0);
        this.f22917b = teVar.t(1);
    }

    public static jm1 g(Object obj) {
        if (obj instanceof jm1) {
            return (jm1) obj;
        }
        if (obj != null) {
            return new jm1(te.q(obj));
        }
        throw new IllegalArgumentException("null value in getInstance()");
    }

    public ee h() {
        return this.f22916a;
    }

    public hd i() {
        return this.f22917b;
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        jd jdVar = new jd();
        jdVar.a(this.f22916a);
        jdVar.a(this.f22917b);
        return new yg5(jdVar);
    }
}
