package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class xaj extends de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wd f38917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ee f38918b;
    public byte[][] c;
    public byte[] d;
    public byte[][] e;
    public byte[] f;
    public byte[] g;
    public s6e[] h;

    public xaj(te teVar) {
        int i = 0;
        if (teVar.t(0) instanceof wd) {
            this.f38917a = wd.o(teVar.t(0));
        } else {
            this.f38918b = ee.w(teVar.t(0));
        }
        te teVar2 = (te) teVar.t(1);
        this.c = new byte[teVar2.size()][];
        for (int i2 = 0; i2 < teVar2.size(); i2++) {
            this.c[i2] = ((he) teVar2.t(i2)).r();
        }
        this.d = ((he) ((te) teVar.t(2)).t(0)).r();
        te teVar3 = (te) teVar.t(3);
        this.e = new byte[teVar3.size()][];
        for (int i3 = 0; i3 < teVar3.size(); i3++) {
            this.e[i3] = ((he) teVar3.t(i3)).r();
        }
        this.f = ((he) ((te) teVar.t(4)).t(0)).r();
        this.g = ((he) ((te) teVar.t(5)).t(0)).r();
        te teVar4 = (te) teVar.t(6);
        byte[][][][] bArr = new byte[teVar4.size()][][][];
        byte[][][][] bArr2 = new byte[teVar4.size()][][][];
        byte[][][] bArr3 = new byte[teVar4.size()][][];
        byte[][] bArr4 = new byte[teVar4.size()][];
        int i4 = 0;
        while (i4 < teVar4.size()) {
            te teVar5 = (te) teVar4.t(i4);
            te teVar6 = (te) teVar5.t(i);
            bArr[i4] = new byte[teVar6.size()][][];
            for (int i5 = i; i5 < teVar6.size(); i5++) {
                te teVar7 = (te) teVar6.t(i5);
                bArr[i4][i5] = new byte[teVar7.size()][];
                for (int i6 = 0; i6 < teVar7.size(); i6++) {
                    bArr[i4][i5][i6] = ((he) teVar7.t(i6)).r();
                }
            }
            te teVar8 = (te) teVar5.t(1);
            bArr2[i4] = new byte[teVar8.size()][][];
            for (int i7 = 0; i7 < teVar8.size(); i7++) {
                te teVar9 = (te) teVar8.t(i7);
                bArr2[i4][i7] = new byte[teVar9.size()][];
                for (int i8 = 0; i8 < teVar9.size(); i8++) {
                    bArr2[i4][i7][i8] = ((he) teVar9.t(i8)).r();
                }
            }
            te teVar10 = (te) teVar5.t(2);
            bArr3[i4] = new byte[teVar10.size()][];
            for (int i9 = 0; i9 < teVar10.size(); i9++) {
                bArr3[i4][i9] = ((he) teVar10.t(i9)).r();
            }
            bArr4[i4] = ((he) teVar5.t(3)).r();
            i4++;
            i = 0;
        }
        int length = this.g.length - 1;
        this.h = new s6e[length];
        int i10 = 0;
        while (i10 < length) {
            byte[] bArr5 = this.g;
            int i11 = i10 + 1;
            this.h[i10] = new s6e(bArr5[i10], bArr5[i11], lbj.f(bArr[i10]), lbj.f(bArr2[i10]), lbj.d(bArr3[i10]), lbj.b(bArr4[i10]));
            i10 = i11;
        }
    }

    public static xaj i(Object obj) {
        if (obj instanceof xaj) {
            return (xaj) obj;
        }
        if (obj != null) {
            return new xaj(te.q(obj));
        }
        return null;
    }

    public short[] g() {
        return lbj.b(this.d);
    }

    public short[] h() {
        return lbj.b(this.f);
    }

    public short[][] j() {
        return lbj.d(this.c);
    }

    public short[][] k() {
        return lbj.d(this.e);
    }

    public s6e[] l() {
        return this.h;
    }

    public int[] m() {
        return lbj.g(this.g);
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        jd jdVar = new jd();
        hd hdVar = this.f38917a;
        if (hdVar == null) {
            hdVar = this.f38918b;
        }
        jdVar.a(hdVar);
        jd jdVar2 = new jd();
        int i = 0;
        while (true) {
            byte[][] bArr = this.c;
            if (i >= bArr.length) {
                break;
            }
            jdVar2.a(new qg5(bArr[i]));
            i++;
        }
        jdVar.a(new yg5(jdVar2));
        jd jdVar3 = new jd();
        jdVar3.a(new qg5(this.d));
        jdVar.a(new yg5(jdVar3));
        jd jdVar4 = new jd();
        int i2 = 0;
        while (true) {
            byte[][] bArr2 = this.e;
            if (i2 >= bArr2.length) {
                break;
            }
            jdVar4.a(new qg5(bArr2[i2]));
            i2++;
        }
        jdVar.a(new yg5(jdVar4));
        jd jdVar5 = new jd();
        jdVar5.a(new qg5(this.f));
        jdVar.a(new yg5(jdVar5));
        jd jdVar6 = new jd();
        jdVar6.a(new qg5(this.g));
        jdVar.a(new yg5(jdVar6));
        jd jdVar7 = new jd();
        for (int i3 = 0; i3 < this.h.length; i3++) {
            jd jdVar8 = new jd();
            byte[][][] bArrE = lbj.e(this.h[i3].a());
            jd jdVar9 = new jd();
            for (byte[][] bArr3 : bArrE) {
                jd jdVar10 = new jd();
                int i4 = 0;
                while (true) {
                    if (i4 < bArr3.length) {
                        jdVar10.a(new qg5(bArr3[i4]));
                        i4++;
                    }
                }
                jdVar9.a(new yg5(jdVar10));
            }
            jdVar8.a(new yg5(jdVar9));
            byte[][][] bArrE2 = lbj.e(this.h[i3].b());
            jd jdVar11 = new jd();
            for (byte[][] bArr4 : bArrE2) {
                jd jdVar12 = new jd();
                int i5 = 0;
                while (true) {
                    if (i5 < bArr4.length) {
                        jdVar12.a(new qg5(bArr4[i5]));
                        i5++;
                    }
                }
                jdVar11.a(new yg5(jdVar12));
            }
            jdVar8.a(new yg5(jdVar11));
            byte[][] bArrC = lbj.c(this.h[i3].d());
            jd jdVar13 = new jd();
            for (byte[] bArr5 : bArrC) {
                jdVar13.a(new qg5(bArr5));
            }
            jdVar8.a(new yg5(jdVar13));
            jdVar8.a(new qg5(lbj.a(this.h[i3].c())));
            jdVar7.a(new yg5(jdVar8));
        }
        jdVar.a(new yg5(jdVar7));
        return new yg5(jdVar);
    }

    public xaj(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, s6e[] s6eVarArr) {
        this.f38917a = new wd(1L);
        this.c = lbj.c(sArr);
        this.d = lbj.a(sArr2);
        this.e = lbj.c(sArr3);
        this.f = lbj.a(sArr4);
        this.g = lbj.h(iArr);
        this.h = s6eVarArr;
    }
}
