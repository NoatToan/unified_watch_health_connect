package defpackage;

import com.huawei.hwcloudmodel.hwwear.hag.model.tide.HagTideDataBean;
import com.huawei.hwcloudmodel.model.push.AlertWeather;
import com.huawei.hwcloudmodel.model.push.WeatherForecastDay;
import com.huawei.hwcloudmodel.model.push.WeatherForecastGlow;
import com.huawei.hwcloudmodel.model.push.WeatherForecastHour;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lqq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f40654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<AlertWeather> f40655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40656c;
    private int d;
    private int e;
    private Map<String, Object> f;
    private HagTideDataBean g;
    private String h;
    private String i;
    private int j;
    private String k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private List<WeatherForecastDay> r;
    private int s;
    private long t;
    private int u;
    private List<WeatherForecastGlow> v;
    private int w;
    private List<WeatherForecastHour> x;
    private int y;

    public int b() {
        return this.f40656c;
    }

    public void n(int i) {
        this.f40656c = i;
    }

    public HagTideDataBean e() {
        return this.g;
    }

    public void a(HagTideDataBean hagTideDataBean) {
        this.g = hagTideDataBean;
    }

    public Map<String, Object> c() {
        return this.f;
    }

    public void b(Map<String, Object> map) {
        this.f = map;
    }

    public int d() {
        return this.e;
    }

    public void g(int i) {
        this.e = i;
    }

    public int i() {
        return this.q;
    }

    public void o(int i) {
        this.q = i;
    }

    public String g() {
        return this.k;
    }

    public List<WeatherForecastDay> h() {
        return this.r;
    }

    public void d(List<WeatherForecastDay> list) {
        this.r = list;
    }

    public List<WeatherForecastHour> l() {
        return this.x;
    }

    public void e(List<WeatherForecastHour> list) {
        this.x = list;
    }

    public List<WeatherForecastGlow> o() {
        return this.v;
    }

    public void b(List<WeatherForecastGlow> list) {
        this.v = list;
    }

    public int x() {
        return this.s;
    }

    public int k() {
        return this.d;
    }

    public void c(int i) {
        this.d = i;
    }

    public int p() {
        return this.n;
    }

    public void b(int i) {
        this.n = i;
    }

    public long u() {
        return this.t;
    }

    public void c(long j) {
        this.t = j;
    }

    public String s() {
        return this.h;
    }

    public int n() {
        return this.f40654a;
    }

    public void d(int i) {
        this.f40654a = i;
    }

    public int r() {
        return this.m;
    }

    public void f(int i) {
        this.m = i;
    }

    public int t() {
        return this.o;
    }

    public void e(int i) {
        this.o = i;
    }

    public int q() {
        return this.j;
    }

    public void a(int i) {
        this.j = i;
    }

    public int v() {
        return this.p;
    }

    public void j(int i) {
        this.p = i;
    }

    public int y() {
        return this.u;
    }

    public void i(int i) {
        this.u = i;
    }

    public void h(int i) {
        this.w = i;
    }

    public int w() {
        return this.w;
    }

    public void d(String str) {
        this.h = str;
    }

    public String f() {
        return this.i;
    }

    public void c(String str) {
        this.i = str;
    }

    public int m() {
        return this.y;
    }

    public void l(int i) {
        this.y = i;
    }

    public int j() {
        return this.l;
    }

    public void k(int i) {
        this.l = i;
    }

    public List<AlertWeather> a() {
        return this.f40655b;
    }

    public void c(List<AlertWeather> list) {
        this.f40655b = list;
    }

    public String toString() {
        return "DataWeather{weather=" + this.p + ", pm25=" + this.m + ", lowestTemperature=" + this.o + ", highestTemperature=" + this.j + ", currentTemperature=" + this.f40654a + ", locationName='" + this.h + "', temperatureUnit=" + this.s + ", aqi=" + this.d + ", observationTime=" + this.n + ", updateTime=" + this.t + ", windDirection=" + this.u + ", windSpeed=" + this.w + ", source='" + this.k + "', weatherForecastDays=" + this.r + ", weatherForecastHours=" + this.x + ", weatherForecastGlows=" + this.v + ", cnWeatherId=" + this.e + ", uVIndex=" + this.q + ", hagTideDataBean=" + this.g + ", hagReportBiMap=" + this.f + ", errorType=" + this.f40656c + ", humidity='" + this.i + "', windSpeedValue=" + this.y + ", somatosensoryTemperature=" + this.l + ", alertWeathers=" + this.f40655b + '}';
    }
}
