package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class waj extends be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public vd f37772a = new vd(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public fe f37773b;
    public byte[][] c;
    public byte[] d;
    public byte[][] e;
    public byte[] f;
    public byte[] g;
    public r6e[] h;

    public waj(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, r6e[] r6eVarArr) {
        this.c = kbj.b(sArr);
        this.d = kbj.a(sArr2);
        this.e = kbj.b(sArr3);
        this.f = kbj.a(sArr4);
        this.g = kbj.c(iArr);
        this.h = r6eVarArr;
    }

    @Override // defpackage.be, defpackage.gd
    public pe toASN1Primitive() {
        id idVar = new id();
        vd vdVar = this.f37772a;
        if (vdVar != null) {
            idVar.a(vdVar);
        } else {
            idVar.a(this.f37773b);
        }
        id idVar2 = new id();
        int i = 0;
        while (true) {
            byte[][] bArr = this.c;
            if (i >= bArr.length) {
                break;
            }
            idVar2.a(new pg5(bArr[i]));
            i++;
        }
        idVar.a(new xg5(idVar2));
        id idVar3 = new id();
        idVar3.a(new pg5(this.d));
        idVar.a(new xg5(idVar3));
        id idVar4 = new id();
        int i2 = 0;
        while (true) {
            byte[][] bArr2 = this.e;
            if (i2 >= bArr2.length) {
                break;
            }
            idVar4.a(new pg5(bArr2[i2]));
            i2++;
        }
        idVar.a(new xg5(idVar4));
        id idVar5 = new id();
        idVar5.a(new pg5(this.f));
        idVar.a(new xg5(idVar5));
        id idVar6 = new id();
        idVar6.a(new pg5(this.g));
        idVar.a(new xg5(idVar6));
        id idVar7 = new id();
        if (this.h.length <= 0) {
            idVar.a(new xg5(idVar7));
            return new xg5(idVar);
        }
        new id();
        r6e r6eVar = this.h[0];
        throw null;
    }
}
