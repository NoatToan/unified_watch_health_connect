package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class dnq extends de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public xf5 f15728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public wd f15729b;

    public dnq(te teVar) {
        if (teVar.size() == 2) {
            this.f15728a = xf5.v(teVar.t(0));
            this.f15729b = wd.o(teVar.t(1));
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + teVar.size());
        }
    }

    public static dnq g(Object obj) {
        if (obj instanceof dnq) {
            return (dnq) obj;
        }
        if (obj != null) {
            return new dnq(te.q(obj));
        }
        return null;
    }

    public BigInteger h() {
        return this.f15729b.q();
    }

    public byte[] i() {
        return this.f15728a.r();
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        jd jdVar = new jd();
        jdVar.a(this.f15728a);
        jdVar.a(this.f15729b);
        return new yg5(jdVar);
    }
}
