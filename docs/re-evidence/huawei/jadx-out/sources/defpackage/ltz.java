package defpackage;

/* JADX INFO: loaded from: classes10.dex */
public class ltz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f40829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f40830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f40831c;
    private boolean d;
    private boolean e;
    private String f;
    private String g;
    private String h;

    public String a() {
        return this.f40829a;
    }

    public void e(String str) {
        this.f40829a = str;
    }

    public String b() {
        return this.f;
    }

    public void a(String str) {
        this.f = str;
    }

    public String e() {
        return this.g;
    }

    public void b(String str) {
        this.g = str;
    }

    public String c() {
        return this.h;
    }

    public void c(String str) {
        this.h = str;
    }

    public boolean f() {
        return this.d;
    }

    public boolean d() {
        return this.d;
    }

    public void c(boolean z) {
        this.d = z;
    }

    public boolean i() {
        return this.f40831c;
    }

    public void d(boolean z) {
        this.f40831c = z;
    }

    public boolean j() {
        return this.e;
    }

    public void a(boolean z) {
        this.e = z;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("MigrateTable{mId=");
        stringBuffer.append(this.f40830b).append(", mOriginalHuid='").append(this.f40829a).append("', mToHuid='").append(this.f).append("', mOriginalSt='").append(this.g).append("', mTime='").append(this.h).append("', mIsSendCommandFinished=").append(this.d).append(", mIsCloudFinished=").append(this.f40831c).append(", mIsLocalFinished=").append(this.e).append('}');
        return stringBuffer.toString();
    }
}
