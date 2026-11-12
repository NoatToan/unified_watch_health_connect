package defpackage;

/* JADX INFO: loaded from: classes19.dex */
public class vzp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f51751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f51752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f51753c;
    private int d;
    private String e;
    private String g;
    private int h;
    private boolean j;

    public int b() {
        return this.h;
    }

    public void a(int i) {
        this.h = i;
    }

    public int e() {
        return this.d;
    }

    public void d(int i) {
        this.d = i;
    }

    public String d() {
        String str = this.e;
        return str == null ? "" : str;
    }

    public void b(String str) {
        this.e = str;
    }

    public int a() {
        return this.f51752b;
    }

    public void c(int i) {
        this.f51752b = i;
    }

    public String c() {
        String str = this.g;
        return str == null ? "" : str;
    }

    public void a(String str) {
        this.g = str;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("DeviceRecordBean{ itemType=");
        stringBuffer.append(this.h);
        stringBuffer.append(", dataType=").append(this.d);
        stringBuffer.append(", content=").append(this.e);
        stringBuffer.append(", imageId=").append(this.f51752b);
        stringBuffer.append(", title=").append(this.g);
        stringBuffer.append(", isActivityStatistics=").append(this.f51751a);
        stringBuffer.append(", isHealthState=").append(this.j);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public boolean i() {
        return this.f51751a;
    }

    public void c(boolean z) {
        this.f51751a = z;
    }

    public boolean h() {
        return this.j;
    }

    public void b(boolean z) {
        this.j = z;
    }

    public boolean g() {
        return this.f51753c;
    }

    public void e(boolean z) {
        this.f51753c = z;
    }
}
