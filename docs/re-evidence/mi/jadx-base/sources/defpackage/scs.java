package defpackage;

/* JADX INFO: loaded from: classes4.dex */
@c4t(a = "update_item")
public class scs {

    @e4t(a = "localPath", b = 6)
    public String h;

    @e4t(a = "mCompleteCode", b = 2)
    public int j;

    @e4t(a = "mState", b = 2)
    public int l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @e4t(a = "title", b = 6)
    public String f33516a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e4t(a = "url", b = 6)
    public String f33517b = null;

    @e4t(a = "mAdcode", b = 6)
    public String c = null;

    @e4t(a = "fileName", b = 6)
    public String d = null;

    @e4t(a = "version", b = 6)
    public String e = "";

    @e4t(a = "lLocalLength", b = 5)
    public long f = 0;

    @e4t(a = "lRemoteLength", b = 5)
    public long g = 0;

    @e4t(a = "isProvince", b = 2)
    public int i = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @e4t(a = "mCityCode", b = 6)
    public String f33518k = "";

    @e4t(a = "mPinyin", b = 6)
    public String m = "";

    public static String f(String str) {
        return "mAdcode='" + str + "'";
    }

    public static String h(String str) {
        return "mPinyin='" + str + "'";
    }

    public final String a() {
        return this.f33516a;
    }

    public final void b(String str) {
        this.c = str;
    }

    public final String c() {
        return this.e;
    }

    public final void d(String str) {
        this.f33518k = str;
    }

    public final String e() {
        return this.c;
    }

    public final String g() {
        return this.f33517b;
    }

    public final int i() {
        return this.j;
    }

    public final String j() {
        return this.m;
    }
}
