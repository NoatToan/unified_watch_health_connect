package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class l extends i {
    public int x;

    public l(byte b2, byte b3, byte b4, byte b5) {
        super(b2, b3, b4, b5);
        this.x = b5;
    }

    @Override // defpackage.i
    public byte[] a() {
        return new byte[]{(byte) this.v, (byte) this.t, (byte) this.u, (byte) this.x};
    }

    @Override // defpackage.i
    public int b() {
        return 4;
    }

    @Override // defpackage.i
    public String toString() {
        return super.toString() + " heartrate=" + this.x;
    }
}
