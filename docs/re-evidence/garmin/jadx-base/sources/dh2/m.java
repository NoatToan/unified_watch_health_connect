package dh2;

/* JADX INFO: loaded from: classes11.dex */
public class m extends l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f59659c;

    public m(byte[] bArr) {
        super(bArr);
        this.f59659c = 0;
        this.f59659c = bArr.length - 1;
    }

    @Override // dh2.v
    public final byte[] b() {
        int i14 = this.f59659c + 1;
        byte[] bArr = new byte[i14];
        System.arraycopy(this.f59673a, 0, bArr, 0, i14);
        return bArr;
    }

    @Override // dh2.v
    public final int c(boolean z14) {
        return z14 ? 192 : 20;
    }

    public m(boolean z14) {
        super(z14);
        this.f59659c = 0;
    }
}
