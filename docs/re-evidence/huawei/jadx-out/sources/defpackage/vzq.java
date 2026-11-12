package defpackage;

/* JADX INFO: loaded from: classes19.dex */
public class vzq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f51754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f51755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f51756c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean n;

    public void a(String str) {
        this.f51756c = str;
    }

    public boolean g() {
        return this.h;
    }

    public void f(boolean z) {
        this.h = z;
    }

    public boolean h() {
        return this.g;
    }

    public void g(boolean z) {
        this.g = z;
    }

    public boolean b() {
        return this.f;
    }

    public void b(boolean z) {
        this.f = z;
    }

    public boolean c() {
        return this.f51754a;
    }

    public void e(boolean z) {
        this.f51754a = z;
    }

    public boolean f() {
        return this.j;
    }

    public void h(boolean z) {
        this.j = z;
    }

    public boolean k() {
        return this.k;
    }

    public void k(boolean z) {
        this.k = z;
    }

    public boolean j() {
        return this.i;
    }

    public void i(boolean z) {
        this.i = z;
    }

    public boolean i() {
        return this.n;
    }

    public void j(boolean z) {
        this.n = z;
    }

    public boolean a() {
        return this.d;
    }

    public void c(boolean z) {
        this.d = z;
    }

    public boolean d() {
        return this.e;
    }

    public void d(boolean z) {
        this.e = z;
    }

    public boolean e() {
        return this.f51755b;
    }

    public void a(boolean z) {
        this.f51755b = z;
    }

    public boolean m() {
        return this.l;
    }

    public void n(boolean z) {
        this.l = z;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("ShowDataBean{ deviceUniqueCode=");
        stringBuffer.append(this.f51756c);
        stringBuffer.append(", isStep=").append(this.h);
        stringBuffer.append(", isDistance=").append(this.g);
        stringBuffer.append(", isClimbStair=").append(this.f);
        stringBuffer.append(", isCalorie=").append(this.f51754a);
        stringBuffer.append(", isHeartRate=").append(this.j);
        stringBuffer.append(", isWeight=").append(this.k);
        stringBuffer.append(", isSleep=").append(this.i);
        stringBuffer.append(", isStress=").append(this.n);
        stringBuffer.append(", isBloodOxygen=").append(this.d);
        stringBuffer.append(", isBloodPressure=").append(this.e);
        stringBuffer.append(", isBloodSugar=").append(this.f51755b);
        stringBuffer.append(", isTemperature=").append(this.l);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
