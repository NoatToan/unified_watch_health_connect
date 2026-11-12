package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class j7l extends xre {
    public j7l() {
    }

    @Override // defpackage.dpf
    public void a(dpf dpfVar) {
        l((j7l) dpfVar);
    }

    @Override // defpackage.aw6
    public int c() {
        return 64;
    }

    @Override // defpackage.dpf
    public dpf copy() {
        return new j7l(this);
    }

    @Override // defpackage.aw6
    public int doFinal(byte[] bArr, int i) {
        m();
        zgh.j(this.e, bArr, i);
        zgh.j(this.f, bArr, i + 8);
        zgh.j(this.g, bArr, i + 16);
        zgh.j(this.h, bArr, i + 24);
        zgh.j(this.i, bArr, i + 32);
        zgh.j(this.j, bArr, i + 40);
        zgh.j(this.f39390k, bArr, i + 48);
        zgh.j(this.l, bArr, i + 56);
        reset();
        return 64;
    }

    @Override // defpackage.aw6
    public String getAlgorithmName() {
        return "SHA-512";
    }

    @Override // defpackage.xre, defpackage.aw6
    public void reset() {
        super.reset();
        this.e = 7640891576956012808L;
        this.f = -4942790177534073029L;
        this.g = 4354685564936845355L;
        this.h = -6534734903238641935L;
        this.i = 5840696475078001361L;
        this.j = -7276294671716946913L;
        this.f39390k = 2270897969802886507L;
        this.l = 6620516959819538809L;
    }

    public j7l(j7l j7lVar) {
        super(j7lVar);
    }
}
