package defpackage;

/* JADX INFO: loaded from: classes20.dex */
public class zou {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected byte[] f54411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f54412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f54413c;
    protected byte[] d;
    protected String e;

    public zou() {
        this.f54413c = null;
        this.e = "UTF-8";
        this.d = null;
        this.f54412b = 1000;
        this.f54411a = null;
    }

    public zou(String str, String str2, byte[] bArr, int i) {
        this(str, str2, bArr, i, null);
    }

    public zou(String str, String str2, byte[] bArr, int i, byte[] bArr2) {
        this.f54413c = str;
        this.e = str2;
        this.d = bArr;
        this.f54412b = i;
        this.f54411a = bArr2;
    }

    public int e() {
        return this.f54412b;
    }

    public byte[] c() {
        return this.d;
    }

    public String a() {
        return this.f54413c;
    }
}
