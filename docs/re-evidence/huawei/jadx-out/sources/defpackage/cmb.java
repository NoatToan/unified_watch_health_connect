package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class cmb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f1758a;
    private int d;

    public byte[] a() {
        byte[] bArr = this.f1758a;
        return bArr != null ? bArr : new byte[0];
    }

    public void a(byte[] bArr) {
        if (bArr != null) {
            this.f1758a = bArr;
        }
    }

    public int b() {
        return this.d;
    }

    public void c(int i) {
        this.d = i;
    }
}
