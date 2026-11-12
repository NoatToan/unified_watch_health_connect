package defpackage;

import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes19.dex */
public class vpq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f51437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f51438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f51439c;
    private String d = "Track_AllSportRankItem";
    private double e;
    private double i;

    public vpq(int i, double d, double d2, double d3) {
        this.f51437a = i;
        this.e = d;
        this.i = d2;
        this.f51438b = d3;
    }

    public int b() {
        return this.f51437a;
    }

    public void a(double d) {
        this.e = d;
    }

    public double c() {
        return this.e;
    }

    public void e(double d) {
        this.i = d;
    }

    public double e() {
        return this.i;
    }

    public void c(double d) {
        this.f51438b = d;
    }

    public double d() {
        return this.f51438b;
    }

    public void b(double d) {
        this.f51439c = d;
    }

    public double a() {
        return this.f51439c;
    }

    public double c(String str) {
        if (str.equals("Track_Duration_Sum")) {
            return c();
        }
        if (str.equals("Track_Count_Sum")) {
            return e();
        }
        if (str.equals("Track_Calorie_Sum")) {
            return d();
        }
        LogUtil.a(this.d, "invalid type");
        return 0.0d;
    }
}
