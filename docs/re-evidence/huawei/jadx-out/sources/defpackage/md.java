package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class md extends mg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f41449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f41450b;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String m = "";

    public int b() {
        if (this.d) {
            return kj.c(this.f41449a) ? 2 : 1;
        }
        return "APPKEY_ERROR".equals(this.f41641c) ? 3 : 2;
    }

    public boolean c() {
        return "1".equals(this.f41450b);
    }

    public String a() {
        String str = this.f;
        return str == null ? "0" : str;
    }
}
