package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class hqr extends be implements tqr {
    public static final BigInteger g = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public pqr f20354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b87 f20355b;
    public lqr c;
    public BigInteger d;
    public BigInteger e;
    public byte[] f;

    public hqr(b87 b87Var, lqr lqrVar, BigInteger bigInteger, BigInteger bigInteger2) {
        this(b87Var, lqrVar, bigInteger, bigInteger2, (byte[]) null);
    }

    public static hqr j(Object obj) {
        if (obj instanceof hqr) {
            return (hqr) obj;
        }
        if (obj != null) {
            return new hqr(se.q(obj));
        }
        return null;
    }

    public b87 g() {
        return this.f20355b;
    }

    public i97 h() {
        return this.c.g();
    }

    public BigInteger i() {
        return this.e;
    }

    public BigInteger k() {
        return this.d;
    }

    public byte[] l() {
        return this.f;
    }

    @Override // defpackage.be, defpackage.gd
    public pe toASN1Primitive() {
        id idVar = new id();
        idVar.a(new vd(g));
        idVar.a(this.f20354a);
        idVar.a(new fqr(this.f20355b, this.f));
        idVar.a(this.c);
        idVar.a(new vd(this.d));
        BigInteger bigInteger = this.e;
        if (bigInteger != null) {
            idVar.a(new vd(bigInteger));
        }
        return new xg5(idVar);
    }

    public hqr(se seVar) {
        if ((seVar.t(0) instanceof vd) && ((vd) seVar.t(0)).r().equals(g)) {
            fqr fqrVar = new fqr(pqr.h(seVar.t(1)), se.q(seVar.t(2)));
            this.f20355b = fqrVar.g();
            gd gdVarT = seVar.t(3);
            if (gdVarT instanceof lqr) {
                this.c = (lqr) gdVarT;
            } else {
                this.c = new lqr(this.f20355b, (ge) gdVarT);
            }
            this.d = ((vd) seVar.t(4)).r();
            this.f = fqrVar.h();
            if (seVar.size() == 6) {
                this.e = ((vd) seVar.t(5)).r();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("bad version in X9ECParameters");
    }

    public hqr(b87 b87Var, i97 i97Var, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this(b87Var, new lqr(i97Var), bigInteger, bigInteger2, bArr);
    }

    public hqr(b87 b87Var, lqr lqrVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.f20355b = b87Var;
        this.c = lqrVar;
        this.d = bigInteger;
        this.e = bigInteger2;
        this.f = bArr;
        if (u77.c(b87Var)) {
            this.f20354a = new pqr(b87Var.o().b());
            return;
        }
        if (u77.a(b87Var)) {
            int[] iArrA = ((x2i) b87Var.o()).c().a();
            if (iArrA.length == 3) {
                this.f20354a = new pqr(iArrA[2], iArrA[1]);
                return;
            } else {
                if (iArrA.length == 5) {
                    this.f20354a = new pqr(iArrA[4], iArrA[1], iArrA[2], iArrA[3]);
                    return;
                }
                throw new IllegalArgumentException("Only trinomial and pentomial curves are supported");
            }
        }
        throw new IllegalArgumentException("'curve' is of an unsupported type");
    }
}
