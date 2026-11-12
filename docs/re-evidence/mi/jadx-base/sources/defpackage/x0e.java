package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class x0e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38541b;

    public x0e(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Key may not be null");
        }
        this.f38540a = str;
        this.f38541b = str2;
    }

    public String a() {
        return this.f38540a;
    }

    public String b() {
        return this.f38541b;
    }

    public String toString() {
        return this.f38540a + ":" + this.f38541b;
    }
}
