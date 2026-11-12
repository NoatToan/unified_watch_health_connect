package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class cav {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f1411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1413c;
    private int d;
    private int e;
    private Map<Integer, List<caq>> f;
    private int j;

    public int a() {
        return this.e;
    }

    public void b(int i) {
        this.e = i;
    }

    public int c() {
        return this.d;
    }

    public void c(int i) {
        this.d = i;
    }

    public int g() {
        return this.j;
    }

    public void e(int i) {
        this.j = i;
    }

    public int d() {
        return this.f1412b;
    }

    public void d(int i) {
        this.f1412b = i;
    }

    public Map<Integer, List<caq>> f() {
        return this.f;
    }

    public void a(Map<Integer, List<caq>> map) {
        this.f = map;
    }

    public int b() {
        return this.f1413c;
    }

    public void a(int i) {
        this.f1413c = i;
    }

    public String e() {
        return this.f1411a;
    }

    public void c(String str) {
        this.f1411a = str;
    }

    public String toString() {
        return "WeeklyReportBean{mStartDate=" + this.e + ", mEndDate=" + this.d + ", mWeekNumber=" + this.j + ", mCloverNumber=" + this.f1412b + ", mWeeklyData=" + this.f + ", mCompleteNumber=" + this.f1413c + ", mDateSegment='" + this.f1411a + "'}";
    }
}
