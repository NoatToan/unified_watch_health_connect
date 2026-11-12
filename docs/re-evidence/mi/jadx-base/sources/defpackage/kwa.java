package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class kwa extends de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public wd f24366b;
    public wd c;
    public wd d;

    public kwa(int i, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f24365a = i;
        this.f24366b = new wd(bigInteger);
        this.c = new wd(bigInteger2);
        this.d = new wd(bigInteger3);
    }

    public BigInteger g() {
        return this.d.q();
    }

    public BigInteger h() {
        return this.f24366b.q();
    }

    public BigInteger i() {
        return this.c.q();
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        jd jdVar = new jd();
        jdVar.a(new wd(this.f24365a));
        jdVar.a(this.f24366b);
        jdVar.a(this.c);
        jdVar.a(this.d);
        return new yg5(jdVar);
    }
}
