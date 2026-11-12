package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class fsy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f34522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34524c;
    private long d;
    private CharSequence e;
    private int f;
    private CharSequence g;
    private int h;
    private int i;
    private int j;
    private CharSequence m;
    private List<Integer> n;
    private CharSequence o;

    public fsy(long j, int i, CharSequence charSequence, int i2) {
        this.d = j;
        this.f = i;
        this.m = charSequence;
        this.i = i2;
    }

    public long b() {
        return this.d;
    }

    public int f() {
        return this.f;
    }

    public CharSequence m() {
        return this.m;
    }

    public int g() {
        return this.i;
    }

    public CharSequence h() {
        return this.g;
    }

    public void c(CharSequence charSequence) {
        this.g = charSequence;
    }

    public int j() {
        return this.j;
    }

    public void c(int i) {
        this.j = i;
    }

    public CharSequence c() {
        return this.e;
    }

    public void b(CharSequence charSequence) {
        this.e = charSequence;
    }

    public CharSequence n() {
        return this.o;
    }

    public void e(CharSequence charSequence) {
        this.o = charSequence;
    }

    public int i() {
        return this.h;
    }

    public void b(int i) {
        this.h = i;
    }

    public List<Integer> o() {
        return this.n;
    }

    public void d(List<Integer> list) {
        this.n = list;
    }

    public int a() {
        return this.f34524c;
    }

    public void d(int i) {
        this.f34524c = i;
    }

    public int d() {
        return this.f34523b;
    }

    public void e(int i) {
        this.f34523b = i;
    }

    public int e() {
        return this.f34522a;
    }

    public void a(int i) {
        this.f34522a = i;
    }

    public String toString() {
        return "SectionActiveWeekBean{mDayTimeMillis=" + this.d + ", mIconResourceId=" + this.f + ", mTitle=" + ((Object) this.m) + ", mIconTipResourceId=" + this.i + ", mTipText=" + ((Object) this.g) + ", mEventType=" + this.j + ", mDayValue=" + ((Object) this.e) + ", mWeekValue=" + ((Object) this.o) + ", mGoalValue=" + this.h + ", mValueList=" + this.n + ", mBarChartColor=" + this.f34524c + ", mBarChartHighlightColor=" + this.f34523b + ", mBarChartTargetColor=" + this.f34522a + '}';
    }
}
