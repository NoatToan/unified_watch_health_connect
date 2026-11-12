package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class eed {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f32837c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f32836b = null;

    public long a() {
        return this.f32837c;
    }

    public void e(long j) {
        this.f32837c = j;
    }

    public byte[] b() {
        return this.f32836b;
    }

    public void a(byte[] bArr) {
        this.f32836b = bArr;
    }

    public String toString() {
        return "SamplePointInfo{mKey=" + this.f32837c + ", mByteValue=" + cpl.e(cph.d(this.f32836b)) + '}';
    }
}
