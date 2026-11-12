package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class eeg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32842c;
    private int f;
    private String h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f32840a = -1;
    private int d = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f32841b = null;
    private Long e = null;

    public static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f32843b = 0;
        public static int d = 2;
        public static int e = 1;
    }

    public long c() {
        return this.f32840a;
    }

    public void b(long j) {
        this.f32840a = j;
    }

    public int d() {
        return this.d;
    }

    public void b(int i) {
        this.d = i;
    }

    public void d(byte[] bArr) {
        this.f32841b = bArr;
    }

    public byte[] e() {
        return this.f32841b;
    }

    public Long b() {
        return this.e;
    }

    public void c(Long l) {
        this.e = l;
    }

    public int a() {
        return this.f;
    }

    public void c(int i) {
        this.f = i;
    }

    public String i() {
        return this.h;
    }

    public void c(String str) {
        this.h = str;
    }

    public void d(int i) {
        this.f32842c = i;
    }

    public String toString() {
        return "SampleConfigInfo{mConfigId=" + this.f32840a + ", mConfigAction=" + this.d + ", mByteConfigData=" + cpl.e(cph.d(this.f32841b)) + ", mConfigModifyTime=" + this.e + ", mSupportCapability=" + this.f + ", mType=" + this.h + ", mChannelCapability=" + this.f32842c + '}';
    }

    public boolean j() {
        return this.f32842c == b.f32843b || this.f32842c == b.d;
    }

    public boolean g() {
        return this.f32842c == b.e || this.f32842c == b.d;
    }
}
