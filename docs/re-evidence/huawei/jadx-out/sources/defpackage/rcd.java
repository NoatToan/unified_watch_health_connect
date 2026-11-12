package defpackage;

/* JADX INFO: loaded from: classes16.dex */
public class rcd extends rcb {
    private static final long serialVersionUID = -1573149602936045007L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f47115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f47116b;
    private String d;

    public rcd(String str, String str2, String str3) {
        this.d = str;
        this.f47115a = str2;
        this.f47116b = str3;
    }

    public String a() {
        return this.d;
    }

    public void b(String str) {
        this.d = str;
    }

    public String e() {
        return this.f47115a;
    }

    public String b() {
        return this.f47116b;
    }

    @Override // defpackage.rcb
    public String toString() {
        return "UrlPlaceholder{mUrl='" + this.d + "', mFlag='" + this.f47115a + "', mBranchId='" + this.f47116b + "', mValue='" + this.e + "', mPlaceholderType=" + this.f47113c + '}';
    }
}
