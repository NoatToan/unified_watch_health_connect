package lj0;

/* JADX INFO: loaded from: classes8.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f112950d = new b(c.OAUTH_EXCEPTION);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f112951e = new b(c.CONNECT_EXCEPTION);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f112952f = new b(c.IO_EXCEPTION);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f112953g = new b(c.SSL_EXCEPTION);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f112954h = new b(c.NULL_GC_DATA_RESPONSE);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f112955i = new b(c.JSON_EXCEPTION);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f112956j = new b(c.UNKNOWN_EXCEPTION);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f112957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f112958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f112959c;

    private b(c cVar, int i14, String str) {
        this.f112957a = cVar;
        this.f112958b = i14;
        this.f112959c = str == null ? "" : str;
    }

    public final boolean a() {
        return this == f112951e;
    }

    public final String toString() {
        String str;
        StringBuilder sb3 = new StringBuilder();
        c cVar = this.f112957a;
        sb3.append(cVar);
        if (cVar == c.ERROR_CODE_RESPONSE) {
            str = " [" + String.valueOf(this.f112958b) + "]";
        } else {
            str = "";
        }
        sb3.append(str);
        return sb3.toString();
    }

    public b(int i14, String str) {
        this(c.ERROR_CODE_RESPONSE, i14, str);
    }

    private b(c cVar) {
        this(cVar, -1, "");
    }

    public b(int i14) {
        this(c.ERROR_CODE_RESPONSE, i14, "");
    }
}
