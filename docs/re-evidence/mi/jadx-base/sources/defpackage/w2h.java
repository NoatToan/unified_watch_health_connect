package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class w2h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f37481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37482b = 0;

    public w2h(String str) {
        this.f37481a = str;
    }

    public boolean a() {
        return this.f37482b != -1;
    }

    public String b() {
        int i = this.f37482b;
        if (i == -1) {
            return null;
        }
        int iIndexOf = this.f37481a.indexOf(46, i);
        if (iIndexOf == -1) {
            String strSubstring = this.f37481a.substring(this.f37482b);
            this.f37482b = -1;
            return strSubstring;
        }
        String strSubstring2 = this.f37481a.substring(this.f37482b, iIndexOf);
        this.f37482b = iIndexOf + 1;
        return strSubstring2;
    }
}
