package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class i7l extends xre {
    public i7l() {
    }

    @Override // defpackage.dpf
    public void a(dpf dpfVar) {
        super.l((i7l) dpfVar);
    }

    @Override // defpackage.aw6
    public int c() {
        return 48;
    }

    @Override // defpackage.dpf
    public dpf copy() {
        return new i7l(this);
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
        reset();
        return 48;
    }

    @Override // defpackage.aw6
    public String getAlgorithmName() {
        return "SHA-384";
    }

    @Override // defpackage.xre, defpackage.aw6
    public void reset() {
        super.reset();
        this.e = -3766243637369397544L;
        this.f = 7105036623409894663L;
        this.g = -7973340178411365097L;
        this.h = 1526699215303891257L;
        this.i = 7436329637833083697L;
        this.j = -8163818279084223215L;
        this.f39390k = -2662702644619276377L;
        this.l = 5167115440072839076L;
    }

    public i7l(i7l i7lVar) {
        super(i7lVar);
    }
}
