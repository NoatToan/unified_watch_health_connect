package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class pdx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("coachAdvice")
    private String f45218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("imageUrl")
    private String f45219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("endDate")
    private String f45220c;

    @SerializedName("endTime")
    private long d;

    @SerializedName(ParsedFieldTag.GOAL)
    private int e;

    @SerializedName("pbCurrent")
    private int f;

    @SerializedName("pbBeforePlan")
    private int g;
    private transient boolean h;

    @SerializedName("lastWeekStatisticsData")
    private pdz i;
    private transient boolean j;

    @SerializedName(Constants.START_DATE)
    private String k;

    @SerializedName("planName")
    private String l;

    @SerializedName("planWeekDataList")
    private List<pdq> m;

    @SerializedName("reportPageTahitiUrl")
    private String n;

    @SerializedName("reportPageUrl")
    private String o;

    @SerializedName("startTime")
    private long p;

    @SerializedName("weekNum")
    private int q;

    @SerializedName("totalStaticsData")
    private pdw r;

    @SerializedName("targetTime")
    private int s;

    @SerializedName("timeZone")
    private String t;

    public String f() {
        return this.l;
    }

    public void i(String str) {
        this.l = str;
    }

    public String b() {
        return this.f45218a;
    }

    public void d(String str) {
        this.f45218a = str;
    }

    public int k() {
        return this.s;
    }

    public void b(int i) {
        this.s = i;
    }

    public int h() {
        return this.g;
    }

    public void e(int i) {
        this.g = i;
    }

    public int i() {
        return this.f;
    }

    public void d(int i) {
        this.f = i;
    }

    public pdw r() {
        return this.r;
    }

    public void c(pdw pdwVar) {
        this.r = pdwVar;
    }

    public pdz j() {
        return this.i;
    }

    public void c(pdz pdzVar) {
        this.i = pdzVar;
    }

    public void c(String str) {
        this.f45219b = str;
    }

    public String l() {
        return this.k;
    }

    public void j(String str) {
        this.k = str;
    }

    public String a() {
        return this.f45220c;
    }

    public void a(String str) {
        this.f45220c = str;
    }

    public boolean t() {
        return this.h;
    }

    public void d(boolean z) {
        this.h = z;
    }

    public int p() {
        return this.q;
    }

    public void a(int i) {
        this.q = i;
    }

    public String o() {
        return this.t;
    }

    public void f(String str) {
        this.t = str;
    }

    public long n() {
        return this.p;
    }

    public void b(long j) {
        this.p = j;
    }

    public long d() {
        return this.d;
    }

    public void a(long j) {
        this.d = j;
    }

    public String c() {
        return this.o;
    }

    public void b(String str) {
        this.o = str;
    }

    public String e() {
        return this.n;
    }

    public void e(String str) {
        this.n = str;
    }

    public List<pdq> m() {
        List<pdq> list = this.m;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public void e(List<pdq> list) {
        this.m = list;
    }

    public boolean g() {
        return this.j;
    }

    public void a(boolean z) {
        this.j = z;
    }

    public void c(int i) {
        this.e = i;
    }
}
