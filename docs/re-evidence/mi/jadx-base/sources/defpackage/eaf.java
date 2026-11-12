package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class eaf extends be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fe f16445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16446b;
    public int c;
    public byte[] d;

    public eaf(fe feVar, int i, int i2, vua vuaVar) {
        this.f16445a = feVar;
        this.f16446b = i;
        this.c = i2;
        throw null;
    }

    @Override // defpackage.be, defpackage.gd
    public pe toASN1Primitive() {
        id idVar = new id();
        idVar.a(this.f16445a);
        idVar.a(new vd(this.f16446b));
        idVar.a(new vd(this.c));
        idVar.a(new pg5(this.d));
        return new xg5(idVar);
    }
}
