package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class dop {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f32140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32141c;
    private byte[] d;
    private int e;
    private float g;

    public void c(byte[] bArr) {
        this.d = bArr == null ? null : (byte[]) bArr.clone();
    }

    public void c(int i) {
        this.f32139a = ((Integer) dym.d(Integer.valueOf(i))).intValue();
    }

    public String a() {
        return (String) dym.d(this.f32140b);
    }

    public void b(String str) {
        this.f32140b = (String) dym.d(str);
    }

    public void a(int i) {
        this.e = ((Integer) dym.d(Integer.valueOf(i))).intValue();
    }

    public void d(int i) {
        this.f32141c = ((Integer) dym.d(Integer.valueOf(i))).intValue();
    }

    public void b(float f) {
        this.g = ((Float) dym.d(Float.valueOf(f))).floatValue();
    }

    public byte[] d() {
        int i = this.e;
        if (this.f32139a == 1) {
            i |= 128;
        }
        int i2 = (int) (this.g * 10.0f);
        byte[] bArr = this.d;
        return new byte[]{-37, 14, 9, bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], bArr[5], bArr[6], (byte) i, (byte) this.f32141c, 0, (byte) (i2 & 255), (byte) ((i2 >> 8) & 255), -1, -1};
    }
}
