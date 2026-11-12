package defpackage;

/* JADX INFO: loaded from: classes21.dex */
public class fw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f34630a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f34631c;
    private final String d;

    public fw(String str, float f, float f2) {
        this.d = str;
        this.f34631c = f2;
        this.f34630a = f;
    }

    public boolean d(String str) {
        if (this.d.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.d.endsWith("\r")) {
            String str2 = this.d;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
