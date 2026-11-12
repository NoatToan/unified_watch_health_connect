package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class oaf extends be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fe f28923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28924b;
    public int c;
    public byte[] d;
    public byte[] e;
    public byte[] f;
    public byte[] g;
    public byte[] h;
    public byte[] i;
    public byte[][] j;

    public oaf(fe feVar, int i, int i2, zua zuaVar, z2i z2iVar, vua vuaVar, ssh sshVar, ssh sshVar2, vua vuaVar2, z2i[] z2iVarArr) {
        this.f28923a = feVar;
        this.f28924b = i;
        this.c = i2;
        throw null;
    }

    @Override // defpackage.be, defpackage.gd
    public pe toASN1Primitive() {
        id idVar = new id();
        idVar.a(this.f28923a);
        idVar.a(new vd(this.f28924b));
        idVar.a(new vd(this.c));
        idVar.a(new pg5(this.d));
        idVar.a(new pg5(this.e));
        idVar.a(new pg5(this.f));
        idVar.a(new pg5(this.g));
        idVar.a(new pg5(this.h));
        idVar.a(new pg5(this.i));
        id idVar2 = new id();
        int i = 0;
        while (true) {
            byte[][] bArr = this.j;
            if (i >= bArr.length) {
                idVar.a(new xg5(idVar2));
                return new xg5(idVar);
            }
            idVar2.a(new pg5(bArr[i]));
            i++;
        }
    }
}
