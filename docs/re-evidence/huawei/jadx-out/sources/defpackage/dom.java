package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class dom {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f32134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32135c;
    private int d;
    private int e;
    private byte[] f;
    private String g;

    public dom(int i, int i2, int i3, int i4) {
        this.f32133a = i;
        this.e = i2;
        this.f32135c = i3;
        this.d = i4;
    }

    public dom() {
        this(0, 0, 0, 0);
    }

    public int c() {
        return this.f32133a;
    }

    public int d() {
        return this.e;
    }

    public void b(int i) {
        this.e = i;
    }

    public void d(String str) {
        this.f32134b = str;
    }

    public String b() {
        return this.f32134b;
    }

    public String e() {
        return this.g;
    }

    public void b(String str) {
        this.g = str;
    }

    public byte[] a() {
        return this.f;
    }

    public void e(byte[] bArr) {
        this.f = bArr;
    }
}
