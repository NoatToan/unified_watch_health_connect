package defpackage;

/* JADX INFO: loaded from: classes4.dex */
@c4t(a = "update_item_download_info")
public class kcs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @e4t(a = "mAdcode", b = 6)
    public String f23727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e4t(a = "fileLength", b = 5)
    public long f23728b;

    @e4t(a = "splitter", b = 2)
    public int c;

    @e4t(a = "startPos", b = 5)
    public long d;

    @e4t(a = "endPos", b = 5)
    public long e;

    public kcs() {
        this.f23727a = "";
        this.f23728b = 0L;
        this.c = 0;
        this.d = 0L;
        this.e = 0L;
    }

    public static String a(String str) {
        return "mAdcode='" + str + "'";
    }

    public kcs(String str, long j, int i, long j2, long j3) {
        this.f23727a = str;
        this.f23728b = j;
        this.c = i;
        this.d = j2;
        this.e = j3;
    }
}
