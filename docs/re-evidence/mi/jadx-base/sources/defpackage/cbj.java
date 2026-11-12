package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class cbj extends be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public vd f5164a = new vd(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public fe f5165b;
    public vd c;
    public byte[][] d;
    public byte[][] e;
    public byte[] f;

    public cbj(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.c = new vd(i);
        this.d = kbj.b(sArr);
        this.e = kbj.b(sArr2);
        this.f = kbj.a(sArr3);
    }

    @Override // defpackage.be, defpackage.gd
    public pe toASN1Primitive() {
        id idVar = new id();
        vd vdVar = this.f5164a;
        if (vdVar != null) {
            idVar.a(vdVar);
        } else {
            idVar.a(this.f5165b);
        }
        idVar.a(this.c);
        id idVar2 = new id();
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[][] bArr = this.d;
            if (i2 >= bArr.length) {
                break;
            }
            idVar2.a(new pg5(bArr[i2]));
            i2++;
        }
        idVar.a(new xg5(idVar2));
        id idVar3 = new id();
        while (true) {
            byte[][] bArr2 = this.e;
            if (i >= bArr2.length) {
                idVar.a(new xg5(idVar3));
                id idVar4 = new id();
                idVar4.a(new pg5(this.f));
                idVar.a(new xg5(idVar4));
                return new xg5(idVar);
            }
            idVar3.a(new pg5(bArr2[i]));
            i++;
        }
    }
}
