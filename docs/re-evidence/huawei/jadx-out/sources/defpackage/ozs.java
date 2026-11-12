package defpackage;

/* JADX INFO: loaded from: classes13.dex */
public class ozs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f45037a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ozu f45039c;
    private String e;
    private String h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f45038b = false;
    private boolean d = false;

    public int a() {
        return this.f45037a;
    }

    public void c(int i) {
        this.f45037a = i;
    }

    public String c() {
        return this.e;
    }

    public void a(String str) {
        this.e = str;
    }

    public String d() {
        return this.h;
    }

    public void b(String str) {
        this.h = str;
    }

    public ozu e() {
        return this.f45039c;
    }

    public void a(ozu ozuVar) {
        this.f45039c = ozuVar;
    }

    public boolean b() {
        return this.f45038b;
    }

    public void c(boolean z) {
        this.f45038b = z;
    }

    public boolean f() {
        return this.d;
    }

    public void e(boolean z) {
        this.d = z;
    }

    public String toString() {
        return "KakaLocationRelationShipData{contentTag=" + this.f45037a + ", contentTitle='" + this.e + "', taskId='" + this.h + "', kakaTaskRecord=" + this.f45039c + '}';
    }
}
