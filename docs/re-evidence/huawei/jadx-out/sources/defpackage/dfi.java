package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class dfi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f31734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f31735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f31736c;
    private boolean d;
    private String e;
    private int g;
    private long h;

    public boolean d() {
        return this.d;
    }

    public void a(boolean z) {
        this.d = z;
    }

    public String c() {
        return this.e;
    }

    public void e(String str) {
        this.e = str;
    }

    public long e() {
        return this.h;
    }

    public void e(long j) {
        this.h = j;
    }

    public boolean a() {
        return this.f31734a;
    }

    public void d(boolean z) {
        this.f31734a = z;
    }

    public int i() {
        return this.g;
    }

    public void b(int i) {
        this.g = i;
    }

    public void e(boolean z) {
        this.f31736c = z;
    }

    public int b() {
        return this.f31735b;
    }

    public void c(int i) {
        this.f31735b = i;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("BPInputPageParam{imi=");
        stringBuffer.append(this.d);
        stringBuffer.append(",bsf=").append(this.e);
        stringBuffer.append(",mt=").append(this.h);
        stringBuffer.append(",ifr=").append(this.f31734a);
        stringBuffer.append(",rc=").append(this.g);
        stringBuffer.append(",isbp=").append(this.f31736c);
        stringBuffer.append(",c=").append(this.f31735b);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
