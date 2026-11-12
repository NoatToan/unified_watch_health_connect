package defpackage;

import com.huawei.hihealth.ResultUtils;

/* JADX INFO: loaded from: classes19.dex */
public class uma extends qmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private uma f50342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private uma f50343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f50344c;
    private String d;
    private int e;
    private int f;
    private long g;
    private int h;
    private boolean i;
    private boolean j;
    private int l;
    private long m;

    public uma(float f, int i, int i2) {
        super(f);
        this.l = i;
        this.f = i2;
    }

    public int h() {
        return this.f;
    }

    public int n() {
        return this.l;
    }

    public long m() {
        return this.m;
    }

    public String f() {
        return this.f50344c;
    }

    public uma c() {
        return this.f50343b;
    }

    public void e(uma umaVar) {
        this.f50343b = umaVar;
    }

    public uma a() {
        return this.f50342a;
    }

    public void a(uma umaVar) {
        this.f50342a = umaVar;
    }

    public void e(String str) {
        this.f50344c = (String) ResultUtils.c(str);
    }

    public void b(long j) {
        this.m = j;
    }

    public boolean k() {
        return this.j;
    }

    public int j() {
        return this.h;
    }

    public void e(boolean z) {
        this.j = z;
    }

    public void d(int i) {
        this.h = i;
    }

    public void a(String str) {
        this.d = str;
    }

    public String d() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    public void a(int i) {
        this.e = i;
    }

    public long i() {
        return this.g;
    }

    public void a(long j) {
        this.g = j;
    }

    public boolean g() {
        return this.i;
    }

    public void d(boolean z) {
        this.i = z;
    }

    public String toString() {
        return "BloodSugarStorageModel{mTimePeriod=" + this.l + ", mStatusLevel=" + this.f + ", mIsNeedConfirm=" + this.j + ", mStatusLevelColor=" + this.h + ", mTime=" + this.m + ", mDeviceUuid='" + this.f50344c + "', mBeforeMealData=" + this.f50343b + ", mAfterMealData=" + this.f50342a + ", mDataType='" + this.d + "'}";
    }
}
