package defpackage;

/* JADX INFO: loaded from: classes16.dex */
public class rby extends rbx {
    private static final long serialVersionUID = 1069953673580218483L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f47109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private rbv f47110b;
    private String e;

    public String d() {
        return this.e;
    }

    public String a() {
        return this.f47109a;
    }

    public rbv c() {
        return this.f47110b;
    }

    public void d(String str) {
        this.e = str;
    }

    public void e(String str) {
        this.f47109a = str;
    }

    public void d(rbv rbvVar) {
        this.f47110b = rbvVar;
    }

    public String toString() {
        return "Checkbox{name=" + this.e + ", description='" + this.f47109a + ", config= " + this.f47110b + '}';
    }
}
