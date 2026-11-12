package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class taf extends be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fe f34502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34503b;
    public int c;
    public byte[] d;

    public taf(fe feVar, int i, int i2, vua vuaVar) {
        this.f34502a = feVar;
        this.f34503b = i;
        this.c = i2;
        throw null;
    }

    @Override // defpackage.be, defpackage.gd
    public pe toASN1Primitive() {
        id idVar = new id();
        idVar.a(this.f34502a);
        idVar.a(new vd(this.f34503b));
        idVar.a(new vd(this.c));
        idVar.a(new pg5(this.d));
        return new xg5(idVar);
    }
}
