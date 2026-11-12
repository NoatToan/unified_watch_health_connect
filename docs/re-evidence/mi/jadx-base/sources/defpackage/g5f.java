package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class g5f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f18618b;
    public final float c;

    public g5f(String str, float f, float f2) {
        this.f18617a = str;
        this.c = f2;
        this.f18618b = f;
    }

    public boolean a(String str) {
        if (this.f18617a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f18617a.endsWith("\r")) {
            String str2 = this.f18617a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
