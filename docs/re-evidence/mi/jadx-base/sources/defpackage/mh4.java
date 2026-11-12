package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class mh4 extends de implements jgh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ee f26173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public hd f26174b;
    public boolean c = true;

    public mh4(ee eeVar, hd hdVar) {
        this.f26173a = eeVar;
        this.f26174b = hdVar;
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        jd jdVar = new jd();
        jdVar.a(this.f26173a);
        hd hdVar = this.f26174b;
        if (hdVar != null) {
            jdVar.a(new lu1(true, 0, hdVar));
        }
        return this.c ? new du1(jdVar) : new li5(jdVar);
    }
}
