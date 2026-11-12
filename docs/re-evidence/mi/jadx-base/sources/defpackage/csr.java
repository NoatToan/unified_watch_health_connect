package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class csr extends de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f14687b;
    public final byte[] c;
    public final byte[] d;
    public final byte[] e;
    public final byte[] f;

    public csr(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f14686a = i;
        this.f14687b = vj1.e(bArr);
        this.c = vj1.e(bArr2);
        this.d = vj1.e(bArr3);
        this.e = vj1.e(bArr4);
        this.f = vj1.e(bArr5);
    }

    public static csr i(Object obj) {
        if (obj instanceof csr) {
            return (csr) obj;
        }
        if (obj != null) {
            return new csr(te.q(obj));
        }
        return null;
    }

    public byte[] g() {
        return vj1.e(this.f);
    }

    public int h() {
        return this.f14686a;
    }

    public byte[] j() {
        return vj1.e(this.d);
    }

    public byte[] k() {
        return vj1.e(this.e);
    }

    public byte[] l() {
        return vj1.e(this.c);
    }

    public byte[] m() {
        return vj1.e(this.f14687b);
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        jd jdVar = new jd();
        jdVar.a(new wd(0L));
        jd jdVar2 = new jd();
        jdVar2.a(new wd(this.f14686a));
        jdVar2.a(new qg5(this.f14687b));
        jdVar2.a(new qg5(this.c));
        jdVar2.a(new qg5(this.d));
        jdVar2.a(new qg5(this.e));
        jdVar.a(new yg5(jdVar2));
        jdVar.a(new ih5(true, 0, new qg5(this.f)));
        return new yg5(jdVar);
    }

    public csr(te teVar) {
        if (!wd.o(teVar.t(0)).r().equals(BigInteger.valueOf(0L))) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        if (teVar.size() != 2 && teVar.size() != 3) {
            throw new IllegalArgumentException("key sequence wrong size");
        }
        te teVarQ = te.q(teVar.t(1));
        this.f14686a = wd.o(teVarQ.t(0)).r().intValue();
        this.f14687b = vj1.e(he.q(teVarQ.t(1)).r());
        this.c = vj1.e(he.q(teVarQ.t(2)).r());
        this.d = vj1.e(he.q(teVarQ.t(3)).r());
        this.e = vj1.e(he.q(teVarQ.t(4)).r());
        if (teVar.size() == 3) {
            this.f = vj1.e(he.o(ff.o(teVar.t(2)), true).r());
        } else {
            this.f = null;
        }
    }
}
