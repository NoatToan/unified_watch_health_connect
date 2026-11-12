package defpackage;

/* JADX INFO: loaded from: classes16.dex */
public class rgg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f47294a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f47295b = false;
    private int e = 0;

    public boolean e() {
        return this.f47294a;
    }

    public void e(boolean z) {
        this.f47294a = z;
    }

    public boolean b() {
        return this.f47295b;
    }

    public void c(boolean z) {
        this.f47295b = z;
    }

    public int a() {
        return this.e;
    }

    public void a(int i) {
        this.e = i;
    }

    public String toString() {
        return "WalletSatcomCardInfo{mIsSupportSatcomCard=" + this.f47294a + ", mHasOpenedSatcomCard=" + this.f47295b + ", mActivityPeriod=" + this.e + '}';
    }
}
