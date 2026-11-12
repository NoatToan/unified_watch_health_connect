package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class nnb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f43305a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f43306c;
    private int d;

    public nnb(String str, int i, String str2) {
        this.f43305a = str;
        this.d = i;
        this.f43306c = str2;
    }

    public String a() {
        return this.f43305a;
    }

    public int c() {
        return this.d;
    }

    public String d() {
        return this.f43306c;
    }

    public String toString() {
        return "QrInfoReq{qrCode='" + this.f43305a + "', qrSiteId=" + this.d + ", qrCodeSource='" + this.f43306c + "'}";
    }
}
