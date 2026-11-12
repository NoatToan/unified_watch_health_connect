package defpackage;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class gxd implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("daily_advice")
    private List<gwf> f36182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("daily_factor")
    private List<Integer> f36183c;

    @SerializedName("daily_factor_desc_input")
    private List<gwi> d;

    @SerializedName("daily_factor_physio")
    private String e;

    @SerializedName("daily_problem")
    private int f;

    @SerializedName("daily_major_reason")
    private int h;

    @SerializedName("daily_problem_desc_input")
    private List<gwk> j;

    @SerializedName("daily_problem_physio")
    private String l;

    @SerializedName("daily_quality")
    private int m;

    @SerializedName("daily_problem_level")
    private int n;

    @SerializedName("daily_task")
    private List<gwn> o;

    @SerializedName("result_code")
    private int p;

    @SerializedName("update")
    private boolean r;

    @SerializedName("generateTime")
    private long t;

    @SerializedName("daily_quality_desc")
    private String k = "";

    @SerializedName("daily_problem_desc")
    private String i = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("daily_factor_desc")
    private String f36181a = "";

    @SerializedName("daily_problem_impact")
    private String g = "";

    public int m() {
        return this.p;
    }

    public void c(String str) {
        this.k = str;
    }

    public String o() {
        return this.k;
    }

    public void c(int i) {
        this.f = i;
    }

    public int j() {
        return this.f;
    }

    public void a(int i) {
        this.n = i;
    }

    public int i() {
        return this.n;
    }

    public void d(String str) {
        this.i = str;
    }

    public String g() {
        return this.i;
    }

    public void d(List<gwk> list) {
        this.j = list;
    }

    public List<gwk> h() {
        return this.j;
    }

    public void b(String str) {
        this.g = str;
    }

    public String f() {
        return this.g;
    }

    public void a(List<Integer> list) {
        this.f36183c = list;
    }

    public List<Integer> a() {
        return this.f36183c;
    }

    public List<gwi> c() {
        return this.d;
    }

    public void c(List<gwi> list) {
        this.d = list;
    }

    public String e() {
        return this.f36181a;
    }

    public void a(String str) {
        this.f36181a = str;
    }

    public void b(List<gwf> list) {
        this.f36182b = list;
    }

    public List<gwf> d() {
        return this.f36182b;
    }

    public void e(List<gwn> list) {
        this.o = list;
    }

    public List<gwn> k() {
        return this.o;
    }

    public boolean p() {
        return this.r;
    }

    public void b(boolean z) {
        this.r = z;
    }

    public long l() {
        return this.t;
    }

    public void c(long j) {
        this.t = j;
    }

    public String n() {
        return this.l;
    }

    public String b() {
        return this.e;
    }

    public String toString() {
        return "SleepDailyResultBean{resultCode=" + this.p + ", dailyQuality=" + this.m + ", dailyQualityDesc='" + this.k + "', dailyProblem=" + this.f + ", dailyProblemLevel=" + this.n + ", dailyProblemDesc='" + this.i + "', dailyFactorDesc='" + this.f36181a + "', dailyProblemDescInput=" + this.j + ", dailyProblemImpact='" + this.g + "', dailyFactor=" + this.f36183c + ", dailyFactorDescInput=" + this.d + ", dailyMajorReason=" + this.h + ", dailyAdvice=" + this.f36182b + ", dailyTask=" + this.o + ", isUpdated=" + this.r + ", generateTime=" + this.t + ", dailyProblemPhysio='" + this.l + "', dailyFactorPhysio='" + this.e + "'}";
    }
}
