package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class lt1 implements cze {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zye f25409a;

    public lt1(aw6 aw6Var, byte[] bArr) {
        this(aw6Var, new c0e(bArr));
    }

    @Override // defpackage.cze
    public byte[] a() {
        byte[] bArr = new byte[b()];
        this.f25409a.doFinal(bArr, 0);
        return bArr;
    }

    @Override // defpackage.cze
    public int b() {
        return this.f25409a.getMacSize();
    }

    public lt1 d(aw6 aw6Var, lw3 lw3Var) {
        mdb mdbVar = new mdb(aw6Var);
        this.f25409a = mdbVar;
        mdbVar.a(lw3Var);
        return this;
    }

    @Override // defpackage.cze
    public String getAlgorithm() {
        return this.f25409a.getAlgorithmName();
    }

    @Override // defpackage.cze
    public void reset() {
        this.f25409a.reset();
    }

    @Override // defpackage.cze
    public void update(byte[] bArr, int i, int i2) {
        this.f25409a.update(bArr, i, i2);
    }

    public lt1(aw6 aw6Var, lw3 lw3Var) {
        d(aw6Var, lw3Var);
    }
}
