package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class lh4 extends be implements igh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fe f25064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public gd f25065b;
    public boolean c = true;

    public lh4(fe feVar, gd gdVar) {
        this.f25064a = feVar;
        this.f25065b = gdVar;
    }

    @Override // defpackage.be, defpackage.gd
    public pe toASN1Primitive() {
        id idVar = new id();
        idVar.a(this.f25064a);
        gd gdVar = this.f25065b;
        if (gdVar != null) {
            idVar.a(new ku1(true, 0, gdVar));
        }
        return this.c ? new cu1(idVar) : new ki5(idVar);
    }
}
