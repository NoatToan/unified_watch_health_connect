package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class khd extends awe {
    public final awe c;

    public khd(awe aweVar) {
        super(aweVar.d(), aweVar.a());
        this.c = aweVar;
    }

    @Override // defpackage.awe
    public byte[] b() {
        byte[] bArrB = this.c.b();
        int iD = d() * a();
        byte[] bArr = new byte[iD];
        for (int i = 0; i < iD; i++) {
            bArr[i] = (byte) (255 - (bArrB[i] & 255));
        }
        return bArr;
    }

    @Override // defpackage.awe
    public byte[] c(int i, byte[] bArr) {
        byte[] bArrC = this.c.c(i, bArr);
        int iD = d();
        for (int i2 = 0; i2 < iD; i2++) {
            bArrC[i2] = (byte) (255 - (bArrC[i2] & 255));
        }
        return bArrC;
    }

    @Override // defpackage.awe
    public boolean f() {
        return this.c.f();
    }

    @Override // defpackage.awe
    public awe g() {
        return new khd(this.c.g());
    }
}
