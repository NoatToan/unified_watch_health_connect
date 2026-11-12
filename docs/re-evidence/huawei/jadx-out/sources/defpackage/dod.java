package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class dod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32110c;
    private byte d;
    private byte[] e;

    public int a() {
        return this.f32109b;
    }

    public void e(int i) {
        this.f32109b = i;
    }

    public int c() {
        return this.f32110c;
    }

    public void c(int i) {
        this.f32110c = i;
    }

    public int d() {
        return this.f32108a;
    }

    public void b(int i) {
        this.f32108a = i;
    }

    public byte[] e() {
        byte[] bArr = this.e;
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        return new byte[0];
    }

    public void d(byte[] bArr) {
        if (bArr != null) {
            this.e = (byte[]) bArr.clone();
        } else {
            this.e = null;
        }
    }

    public byte b() {
        return this.d;
    }

    public void c(byte b2) {
        this.d = b2;
    }
}
