package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class dbj extends de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wd f15343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ee f15344b;
    public wd c;
    public byte[][] d;
    public byte[][] e;
    public byte[] f;

    public dbj(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.f15343a = new wd(0L);
        this.c = new wd(i);
        this.d = lbj.c(sArr);
        this.e = lbj.c(sArr2);
        this.f = lbj.a(sArr3);
    }

    public static dbj k(Object obj) {
        if (obj instanceof dbj) {
            return (dbj) obj;
        }
        if (obj != null) {
            return new dbj(te.q(obj));
        }
        return null;
    }

    public short[][] g() {
        return lbj.d(this.d);
    }

    public short[] h() {
        return lbj.b(this.f);
    }

    public short[][] i() {
        return lbj.d(this.e);
    }

    public int j() {
        return this.c.r().intValue();
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        jd jdVar = new jd();
        hd hdVar = this.f15343a;
        if (hdVar == null) {
            hdVar = this.f15344b;
        }
        jdVar.a(hdVar);
        jdVar.a(this.c);
        jd jdVar2 = new jd();
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[][] bArr = this.d;
            if (i2 >= bArr.length) {
                break;
            }
            jdVar2.a(new qg5(bArr[i2]));
            i2++;
        }
        jdVar.a(new yg5(jdVar2));
        jd jdVar3 = new jd();
        while (true) {
            byte[][] bArr2 = this.e;
            if (i >= bArr2.length) {
                jdVar.a(new yg5(jdVar3));
                jd jdVar4 = new jd();
                jdVar4.a(new qg5(this.f));
                jdVar.a(new yg5(jdVar4));
                return new yg5(jdVar);
            }
            jdVar3.a(new qg5(bArr2[i]));
            i++;
        }
    }

    public dbj(te teVar) {
        if (teVar.t(0) instanceof wd) {
            this.f15343a = wd.o(teVar.t(0));
        } else {
            this.f15344b = ee.w(teVar.t(0));
        }
        this.c = wd.o(teVar.t(1));
        te teVarQ = te.q(teVar.t(2));
        this.d = new byte[teVarQ.size()][];
        for (int i = 0; i < teVarQ.size(); i++) {
            this.d[i] = he.q(teVarQ.t(i)).r();
        }
        te teVar2 = (te) teVar.t(3);
        this.e = new byte[teVar2.size()][];
        for (int i2 = 0; i2 < teVar2.size(); i2++) {
            this.e[i2] = he.q(teVar2.t(i2)).r();
        }
        this.f = he.q(((te) teVar.t(4)).t(0)).r();
    }
}
