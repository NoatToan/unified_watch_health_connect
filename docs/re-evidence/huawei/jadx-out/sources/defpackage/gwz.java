package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.operation.jsoperation.JsUtil;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class gwz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("acti_dur")
    private List<Integer> f36166a;

    @SerializedName("sleep_avgspo")
    private int aa;

    @SerializedName("sleep_efficiency")
    private int ab;

    @SerializedName("sleep_latency")
    private int ac;

    @SerializedName("sleep_osa")
    private int ad;

    @SerializedName("steady_ratio")
    private Integer af;

    @SerializedName("wake_times")
    private int ag;

    @SerializedName("total_duration")
    private int ah;

    @SerializedName("wake_duration")
    private int ai;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("acti_ts")
    private List<Long> f36167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("avg_pressure")
    private int f36168c;

    @SerializedName("awake_time")
    private long d;

    @SerializedName("asleep_time")
    private long e;

    @SerializedName("data_src")
    private int f;

    @SerializedName("cur_time")
    private long g;

    @SerializedName("deep_duration")
    private int h;

    @SerializedName("bed_duration")
    private int i;

    @SerializedName("deep_continuity")
    private int j;

    @SerializedName("hr_list")
    private List<Integer> k;

    @SerializedName("nap_dur")
    private List<Integer> l;

    @SerializedName("light_duration")
    private int m;

    @SerializedName("max_hr")
    private int n;

    @SerializedName("hr_ts")
    private List<Long> o;

    @SerializedName("rdi")
    private int p;

    @SerializedName("nap_ts")
    private List<Long> q;

    @SerializedName("off_bed_time")
    private long r;

    @SerializedName("on_bed_time")
    private long s;

    @SerializedName("noise")
    private int t;

    @SerializedName("sleep_avghr")
    private int u;

    @SerializedName(HwHealthChartHolder.LAYER_ID_REST_HR)
    private int v;

    @SerializedName(JsUtil.SCORE)
    private int w;

    @SerializedName("sleep_avghrv")
    private int x;

    @SerializedName("rem_duration")
    private int y;

    @SerializedName("sleep_avgrr")
    private int z;

    public void q(int i) {
        this.af = Integer.valueOf(i);
    }

    public void d(long j) {
        this.g = j;
    }

    public void n(int i) {
        this.w = i;
    }

    public void e(long j) {
        this.e = j;
    }

    public long e() {
        return this.e;
    }

    public void c(long j) {
        this.d = j;
    }

    public long d() {
        return this.d;
    }

    public void b(long j) {
        this.s = j;
    }

    public long c() {
        return this.s;
    }

    public void a(long j) {
        this.r = j;
    }

    public void b(int i) {
        this.h = i;
    }

    public void i(int i) {
        this.m = i;
    }

    public void h(int i) {
        this.y = i;
    }

    public void x(int i) {
        this.ah = i;
    }

    public int g() {
        return this.ah;
    }

    public void v(int i) {
        this.ag = i;
    }

    public void w(int i) {
        this.ai = i;
    }

    public void d(int i) {
        this.j = i;
    }

    public void g(int i) {
        this.p = i;
    }

    public void o(int i) {
        this.v = i;
    }

    public void j(int i) {
        this.n = i;
    }

    public void c(int i) {
        this.f36168c = i;
    }

    public void f(int i) {
        this.t = i;
    }

    public void t(int i) {
        this.ab = i;
    }

    public void r(int i) {
        this.ac = i;
    }

    public void i(List<Long> list) {
        this.q = list;
    }

    public void c(List<Integer> list) {
        this.l = list;
    }

    public void b(List<Long> list) {
        this.o = list;
    }

    public void d(List<Integer> list) {
        this.k = list;
    }

    public void e(List<Long> list) {
        this.f36167b = list;
    }

    public void a(List<Integer> list) {
        this.f36166a = list;
    }

    public int a() {
        return this.i;
    }

    public void a(int i) {
        this.i = i;
    }

    public void e(int i) {
        this.f = i;
    }

    public int b() {
        return this.f;
    }

    public void p(int i) {
        this.ad = i;
    }

    public void l(int i) {
        this.u = i;
    }

    public void m(int i) {
        this.z = i;
    }

    public void k(int i) {
        this.x = i;
    }

    public void s(int i) {
        this.aa = i;
    }

    public String toString() {
        return "SleepInfo{dataSrc=" + this.f + ", curTime=" + this.g + ", score=" + this.w + ", asleepTime=" + this.e + ", awakeTime=" + this.d + ", onBedTime=" + this.s + ", offBedTime=" + this.r + ", deepDuration=" + this.h + ", lightDuration=" + this.m + ", remDuration=" + this.y + ", totalDuration=" + this.ah + ", bedDuration=" + this.i + ", wakeTimes=" + this.ag + ", wakeDuration=" + this.ai + ", deepContinuity=" + this.j + ", rdi=" + this.p + ", restHr=" + this.v + ", maxHr=" + this.n + ", avgPressure=" + this.f36168c + ", noise=" + this.t + ", sleepEfficiency=" + this.ab + ", sleepLatency=" + this.ac + ", sleepOsa=" + this.ad + ", sleepAvghr=" + this.u + ", sleepAvghrv=" + this.x + ", sleepAvgrr=" + this.z + ", sleepAvgspo=" + this.aa + ", napTs=" + this.q + ", napDur=" + this.l + ", hrTs=" + this.o + ", hrList=" + this.k + ", actiTs=" + this.f36167b + ", actiDur=" + this.f36166a + '}';
    }
}
