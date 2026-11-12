package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class doz {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f32169c;
    private int e;

    public doz(int i, byte[] bArr) {
        this.e = ((Integer) lst.d(Integer.valueOf(i))).intValue();
        this.f32169c = (byte[]) lst.d(bArr);
    }

    public byte[] d() {
        return (byte[]) lst.d(this.f32169c);
    }

    public int b() {
        return ((Integer) lst.d(Integer.valueOf(this.e))).intValue();
    }
}
