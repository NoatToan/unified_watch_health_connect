package defpackage;

/* JADX INFO: loaded from: classes19.dex */
public class umb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f50345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f50346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f50347c;
    private float d;
    private float e;
    private long f;
    private int g;
    private int h;
    private String i;
    private String j;
    private int k;
    private long l;
    private float n;

    public void e(long j) {
        this.l = j;
    }

    public long n() {
        return this.l;
    }

    public int g() {
        return this.h;
    }

    public void d(int i) {
        this.h = i;
    }

    public int c() {
        return this.f50346b;
    }

    public void c(int i) {
        this.f50346b = i;
    }

    public float a() {
        return this.e;
    }

    public void b(float f) {
        this.e = f;
    }

    public int j() {
        return this.g;
    }

    public void e(int i) {
        this.g = i;
    }

    public float b() {
        return this.f50345a;
    }

    public void a(float f) {
        this.f50345a = f;
    }

    public float d() {
        return this.d;
    }

    public void d(float f) {
        this.d = f;
    }

    public String e() {
        return this.f50347c;
    }

    public void e(String str) {
        this.f50347c = str;
    }

    public String h() {
        return this.j;
    }

    public void c(String str) {
        this.j = str;
    }

    public void d(String str) {
        this.i = str;
    }

    public int l() {
        return this.k;
    }

    public void a(int i) {
        this.k = i;
    }

    public long f() {
        return this.f;
    }

    public void a(long j) {
        if (String.valueOf(j).matches("\\d{13}")) {
            this.f = j / 1000;
        } else {
            this.f = j;
        }
    }

    public float i() {
        return this.n;
    }

    public void c(float f) {
        this.n = f;
    }

    public String toString() {
        return "BloodSugarDietBean{mDietType=" + this.f50346b + ", mDiffNum=" + this.e + ", mDiffStatus=" + this.g + ", mDietCalorie=" + this.f50345a + ", mDietCarbohydrates=" + this.d + ", mDietDescription='" + this.f50347c + "', mHighGiTitle='" + this.i + "', mHighGiFood='" + this.j + "', mWhichMeal=" + this.k + ", mEatTime=" + this.f + '}';
    }
}
