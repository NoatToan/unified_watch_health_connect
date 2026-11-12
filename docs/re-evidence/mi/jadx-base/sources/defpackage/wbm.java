package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class wbm extends be implements igh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public vd f37813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public we f37814b;
    public lh4 c;
    public we d;
    public we e;
    public we f;

    public wbm(vd vdVar, we weVar, lh4 lh4Var, we weVar2, we weVar3, we weVar4) {
        this.f37813a = vdVar;
        this.f37814b = weVar;
        this.c = lh4Var;
        this.d = weVar2;
        this.e = weVar3;
        this.f = weVar4;
    }

    @Override // defpackage.be, defpackage.gd
    public pe toASN1Primitive() {
        id idVar = new id();
        idVar.a(this.f37813a);
        idVar.a(this.f37814b);
        idVar.a(this.c);
        if (this.d != null) {
            idVar.a(new hh5(false, 0, this.d));
        }
        if (this.e != null) {
            idVar.a(new hh5(false, 1, this.e));
        }
        idVar.a(this.f);
        return new cu1(idVar);
    }
}
