package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public class msy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f42364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f42365c;
    private String e;

    public msy(int i, String str, String str2) {
        this.f42365c = i;
        this.e = str;
        this.f42364b = str2;
    }

    public String c() {
        return this.e;
    }

    public String e() {
        return this.f42364b;
    }

    public int a() {
        return this.f42365c;
    }

    public String toString() {
        return "SimpleContactBean{rawContactId=" + this.f42365c + ", rawContactUid='" + this.e + "', rawContactFeature='" + this.f42364b + "'}";
    }
}
