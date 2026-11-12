package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class qqr extends de implements uqr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ee f31755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public re f31756b;

    public qqr(int i, int i2) {
        this(i, i2, 0, 0);
    }

    public static qqr h(Object obj) {
        if (obj instanceof qqr) {
            return (qqr) obj;
        }
        if (obj != null) {
            return new qqr(te.q(obj));
        }
        return null;
    }

    public ee g() {
        return this.f31755a;
    }

    public re i() {
        return this.f31756b;
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        jd jdVar = new jd();
        jdVar.a(this.f31755a);
        jdVar.a(this.f31756b);
        return new yg5(jdVar);
    }

    public qqr(int i, int i2, int i3, int i4) {
        this.f31755a = uqr.Ca;
        jd jdVar = new jd();
        jdVar.a(new wd(i));
        if (i3 == 0) {
            if (i4 != 0) {
                throw new IllegalArgumentException("inconsistent k values");
            }
            jdVar.a(uqr.Ea);
            jdVar.a(new wd(i2));
        } else {
            if (i3 <= i2 || i4 <= i3) {
                throw new IllegalArgumentException("inconsistent k values");
            }
            jdVar.a(uqr.Fa);
            jd jdVar2 = new jd();
            jdVar2.a(new wd(i2));
            jdVar2.a(new wd(i3));
            jdVar2.a(new wd(i4));
            jdVar.a(new yg5(jdVar2));
        }
        this.f31756b = new yg5(jdVar);
    }

    public qqr(te teVar) {
        this.f31755a = ee.w(teVar.t(0));
        this.f31756b = teVar.t(1).toASN1Primitive();
    }

    public qqr(BigInteger bigInteger) {
        this.f31755a = uqr.Ba;
        this.f31756b = new wd(bigInteger);
    }
}
