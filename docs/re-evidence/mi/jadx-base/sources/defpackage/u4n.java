package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class u4n implements t4n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Class f35379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f35380b;
    public int c;

    public u4n(Class cls, String str, int i) {
        this.f35379a = cls;
        this.f35380b = str;
        this.c = i;
    }

    public String a() {
        return this.f35380b;
    }

    public int b() {
        return this.c;
    }

    public String toString() {
        return a() + ":" + b();
    }
}
