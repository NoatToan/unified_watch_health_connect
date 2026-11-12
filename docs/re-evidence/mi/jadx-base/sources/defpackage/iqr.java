package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class iqr extends de implements uqr {
    public static final BigInteger g = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public qqr f22002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a87 f22003b;
    public mqr c;
    public BigInteger d;
    public BigInteger e;
    public byte[] f;

    public iqr(te teVar) {
        if (!(teVar.t(0) instanceof wd) || !((wd) teVar.t(0)).r().equals(g)) {
            throw new IllegalArgumentException("bad version in X9ECParameters");
        }
        gqr gqrVar = new gqr(qqr.h(teVar.t(1)), te.q(teVar.t(2)));
        this.f22003b = gqrVar.g();
        hd hdVarT = teVar.t(3);
        if (hdVarT instanceof mqr) {
            this.c = (mqr) hdVarT;
        } else {
            this.c = new mqr(this.f22003b, (he) hdVarT);
        }
        this.d = ((wd) teVar.t(4)).r();
        this.f = gqrVar.h();
        if (teVar.size() == 6) {
            this.e = ((wd) teVar.t(5)).r();
        }
    }

    public static iqr j(Object obj) {
        if (obj instanceof iqr) {
            return (iqr) obj;
        }
        if (obj != null) {
            return new iqr(te.q(obj));
        }
        return null;
    }

    public a87 g() {
        return this.f22003b;
    }

    public h97 h() {
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

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        jd jdVar = new jd();
        jdVar.a(new wd(g));
        jdVar.a(this.f22002a);
        jdVar.a(new gqr(this.f22003b, this.f));
        jdVar.a(this.c);
        jdVar.a(new wd(this.d));
        BigInteger bigInteger = this.e;
        if (bigInteger != null) {
            jdVar.a(new wd(bigInteger));
        }
        return new yg5(jdVar);
    }

    public iqr(a87 a87Var, h97 h97Var, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this(a87Var, new mqr(h97Var), bigInteger, bigInteger2, bArr);
    }

    public iqr(a87 a87Var, mqr mqrVar, BigInteger bigInteger, BigInteger bigInteger2) {
        this(a87Var, mqrVar, bigInteger, bigInteger2, (byte[]) null);
    }

    public iqr(a87 a87Var, mqr mqrVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        qqr qqrVar;
        this.f22003b = a87Var;
        this.c = mqrVar;
        this.d = bigInteger;
        this.e = bigInteger2;
        this.f = bArr;
        if (v77.f(a87Var)) {
            qqrVar = new qqr(a87Var.r().b());
        } else {
            if (!v77.d(a87Var)) {
                throw new IllegalArgumentException("'curve' is of an unsupported type");
            }
            int[] iArrA = ((y2i) a87Var.r()).c().a();
            if (iArrA.length == 3) {
                qqrVar = new qqr(iArrA[2], iArrA[1]);
            } else {
                if (iArrA.length != 5) {
                    throw new IllegalArgumentException("Only trinomial and pentomial curves are supported");
                }
                qqrVar = new qqr(iArrA[4], iArrA[1], iArrA[2], iArrA[3]);
            }
        }
        this.f22002a = qqrVar;
    }
}
