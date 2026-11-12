package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class fj5 extends de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BigInteger f17839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public dj5 f17840b;
    public wd c;
    public he d;
    public wd e;
    public he f;

    public fj5(te teVar) {
        this.f17839a = BigInteger.valueOf(0L);
        int i = 0;
        if (teVar.t(0) instanceof ff) {
            ff ffVar = (ff) teVar.t(0);
            if (!ffVar.t() || ffVar.r() != 0) {
                throw new IllegalArgumentException("object parse error");
            }
            this.f17839a = wd.o(ffVar.getLoadedObject()).r();
            i = 1;
        }
        this.f17840b = dj5.g(teVar.t(i));
        this.c = wd.o(teVar.t(i + 1));
        this.d = he.q(teVar.t(i + 2));
        this.e = wd.o(teVar.t(i + 3));
        this.f = he.q(teVar.t(i + 4));
    }

    public static fj5 k(Object obj) {
        if (obj instanceof fj5) {
            return (fj5) obj;
        }
        if (obj != null) {
            return new fj5(te.q(obj));
        }
        return null;
    }

    public BigInteger g() {
        return this.c.r();
    }

    public byte[] h() {
        return vj1.e(this.d.r());
    }

    public dj5 i() {
        return this.f17840b;
    }

    public byte[] j() {
        return vj1.e(this.f.r());
    }

    public BigInteger l() {
        return this.e.r();
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        jd jdVar = new jd();
        if (this.f17839a.compareTo(BigInteger.valueOf(0L)) != 0) {
            jdVar.a(new ih5(true, 0, new wd(this.f17839a)));
        }
        jdVar.a(this.f17840b);
        jdVar.a(this.c);
        jdVar.a(this.d);
        jdVar.a(this.e);
        jdVar.a(this.f);
        return new yg5(jdVar);
    }
}
