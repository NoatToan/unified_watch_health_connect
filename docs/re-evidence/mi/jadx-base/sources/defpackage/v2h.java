package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class v2h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f36412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36413b = 0;

    public v2h(String str) {
        this.f36412a = str;
    }

    public boolean a() {
        return this.f36413b != -1;
    }

    public String b() {
        int i = this.f36413b;
        if (i == -1) {
            return null;
        }
        int iIndexOf = this.f36412a.indexOf(46, i);
        if (iIndexOf == -1) {
            String strSubstring = this.f36412a.substring(this.f36413b);
            this.f36413b = -1;
            return strSubstring;
        }
        String strSubstring2 = this.f36412a.substring(this.f36413b, iIndexOf);
        this.f36413b = iIndexOf + 1;
        return strSubstring2;
    }
}
