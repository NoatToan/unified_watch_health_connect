package wb2;

/* JADX INFO: loaded from: classes11.dex */
public class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f184046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f184047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f184048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f184049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f184050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f184051f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f184052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f184053h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f184054i;

    public k0(int i14, long j8) {
        this.f184046a = i14;
    }

    public final void a(String str, String str2, String str3, String str4) {
        if (this.f184051f == null) {
            this.f184051f = str;
            this.f184052g = str2;
            this.f184053h = str3;
            this.f184054i = str4;
            return;
        }
        if ("NOT_STARTED".equals(str2)) {
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sn.a.t(sb3, this.f184053h, " | ", str, "-");
        sb3.append(str2);
        this.f184053h = sb3.toString();
    }
}
