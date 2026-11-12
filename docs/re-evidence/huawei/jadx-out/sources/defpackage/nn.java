package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class nn {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f43303c;
    public final String d;

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static String f43304a = "0";
        public static String d = "1";
        public static String e = "2";
    }

    public nn(String str, String str2, String str3) {
        this.f43302b = str;
        this.d = str2;
        this.f43303c = str3;
    }

    public String b() {
        return this.f43302b;
    }

    public String c() {
        return this.d;
    }

    public String e() {
        return this.f43303c;
    }

    public String toString() {
        return "updateStrategy: " + this.f43303c + " sha256:" + this.f43302b + " sourceUrl:" + this.d;
    }
}
