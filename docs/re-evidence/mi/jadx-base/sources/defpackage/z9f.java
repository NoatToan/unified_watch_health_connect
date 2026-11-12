package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class z9f extends be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fe f41046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41047b;
    public int c;
    public byte[] d;
    public byte[] e;
    public byte[] f;
    public byte[] g;
    public byte[][] h;

    public z9f(fe feVar, int i, int i2, zua zuaVar, z2i z2iVar, ssh sshVar, vua vuaVar, z2i[] z2iVarArr) {
        this.f41046a = feVar;
        this.f41047b = i;
        this.c = i2;
        throw null;
    }

    @Override // defpackage.be, defpackage.gd
    public pe toASN1Primitive() {
        id idVar = new id();
        idVar.a(this.f41046a);
        idVar.a(new vd(this.f41047b));
        idVar.a(new vd(this.c));
        idVar.a(new pg5(this.d));
        idVar.a(new pg5(this.e));
        idVar.a(new pg5(this.f));
        idVar.a(new pg5(this.g));
        id idVar2 = new id();
        int i = 0;
        while (true) {
            byte[][] bArr = this.h;
            if (i >= bArr.length) {
                idVar.a(new xg5(idVar2));
                return new xg5(idVar);
            }
            idVar2.a(new pg5(bArr[i]));
            i++;
        }
    }
}
