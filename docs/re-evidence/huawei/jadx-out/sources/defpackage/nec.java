package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public class nec {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f42977c = false;
    private boolean e = false;

    public boolean b() {
        return this.f42977c;
    }

    public void a(boolean z) {
        this.f42977c = z;
    }

    public boolean e() {
        return this.e;
    }

    public void b(boolean z) {
        this.e = z;
    }

    public String toString() {
        return "DataFutureWeatherSupport{mIsSupportSunriseSunSet=" + this.f42977c + ", mIsSupportMoonPhase=" + this.e + '}';
    }
}
