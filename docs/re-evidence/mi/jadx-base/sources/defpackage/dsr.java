package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class dsr extends de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f15898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f15899b;

    public dsr(te teVar) {
        if (!wd.o(teVar.t(0)).r().equals(BigInteger.valueOf(0L))) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.f15898a = vj1.e(he.q(teVar.t(1)).r());
        this.f15899b = vj1.e(he.q(teVar.t(2)).r());
    }

    public static dsr g(Object obj) {
        if (obj instanceof dsr) {
            return (dsr) obj;
        }
        if (obj != null) {
            return new dsr(te.q(obj));
        }
        return null;
    }

    public byte[] h() {
        return vj1.e(this.f15898a);
    }

    public byte[] i() {
        return vj1.e(this.f15899b);
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        jd jdVar = new jd();
        jdVar.a(new wd(0L));
        jdVar.a(new qg5(this.f15898a));
        jdVar.a(new qg5(this.f15899b));
        return new yg5(jdVar);
    }

    public dsr(byte[] bArr, byte[] bArr2) {
        this.f15898a = vj1.e(bArr);
        this.f15899b = vj1.e(bArr2);
    }
}
