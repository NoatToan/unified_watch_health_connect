package defpackage;

import com.huawei.up.model.UserInfomation;

/* JADX INFO: loaded from: classes19.dex */
public class vfw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f51047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f51048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f51049c;
    private int d;
    private int e;
    private double g;
    private final UserInfomation j = ioy.a();

    public UserInfomation i() {
        return this.j;
    }

    public int d() {
        return this.d;
    }

    public void d(int i) {
        this.d = i;
    }

    public int b() {
        int i = this.f51049c;
        return i > 0 ? i : this.d;
    }

    public void b(int i) {
        this.f51049c = i;
    }

    public int c() {
        return this.f51047a;
    }

    public void a(int i) {
        this.f51047a = i;
    }

    public int e() {
        return this.e;
    }

    public void c(int i) {
        this.e = i;
    }

    public int a() {
        return this.f51048b;
    }

    public void e(int i) {
        this.f51048b = i;
    }

    public double h() {
        return this.g;
    }

    public void b(double d) {
        this.g = d;
    }

    public String toString() {
        return "DietRecordBaseInfo{mUserInformation=" + this.j + ", mRestingCaloriesBasic=" + this.d + ", mRestingCalories=" + this.f51049c + ", mRestingCaloriesBurned=" + this.f51047a + ", mCaloricDeficitGoal=" + this.e + ", mActivityCalGoal=" + this.f51048b + ", mWeightTargetDifferences=" + this.g + '}';
    }
}
