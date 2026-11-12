package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class xbm extends de implements jgh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wd f38947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public xe f38948b;
    public mh4 c;
    public xe d;
    public xe e;
    public xe f;

    public xbm(wd wdVar, xe xeVar, mh4 mh4Var, xe xeVar2, xe xeVar3, xe xeVar4) {
        this.f38947a = wdVar;
        this.f38948b = xeVar;
        this.c = mh4Var;
        this.d = xeVar2;
        this.e = xeVar3;
        this.f = xeVar4;
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        jd jdVar = new jd();
        jdVar.a(this.f38947a);
        jdVar.a(this.f38948b);
        jdVar.a(this.c);
        if (this.d != null) {
            jdVar.a(new ih5(false, 0, this.d));
        }
        if (this.e != null) {
            jdVar.a(new ih5(false, 1, this.e));
        }
        jdVar.a(this.f);
        return new du1(jdVar);
    }
}
