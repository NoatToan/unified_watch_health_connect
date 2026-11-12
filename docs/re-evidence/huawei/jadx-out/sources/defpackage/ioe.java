package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.feature.result.CommonConstant;

/* JADX INFO: loaded from: classes.dex */
public class ioe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("examinationInstitution")
    private String f37902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("extendData")
    private String f37903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("examinationReport")
    private String f37904c;

    @SerializedName("examinationDate")
    private int d;

    @SerializedName("deviceCode")
    private String e;

    @SerializedName("recordType")
    private int f;

    @SerializedName(CommonConstant.KEY_GENDER)
    private int g;

    @SerializedName("recordName")
    private String h;

    @SerializedName("generateTime")
    private long i;

    @SerializedName("name")
    private String j;

    @SerializedName("reminderTime")
    private long k;

    @SerializedName("reportTime")
    private long l;

    @SerializedName("remarks")
    private String m;

    public long n() {
        return this.l;
    }

    public void e(long j) {
        this.l = j;
    }

    public long i() {
        return this.i;
    }

    public void a(long j) {
        this.i = j;
    }

    public int g() {
        return this.g;
    }

    public void e(int i) {
        this.g = i;
    }

    public void d(int i) {
        this.d = i;
    }

    public int d() {
        return this.d;
    }

    public void b(int i) {
        this.f = i;
    }

    public int h() {
        return this.f;
    }

    public void i(String str) {
        this.h = str;
    }

    public String j() {
        return this.h;
    }

    public String f() {
        return this.j;
    }

    public void d(String str) {
        this.j = str;
    }

    public void h(String str) {
        this.m = str;
    }

    public String k() {
        return this.m;
    }

    public String e() {
        return this.f37902a;
    }

    public void c(String str) {
        this.f37902a = str;
    }

    public String b() {
        return this.f37904c;
    }

    public void e(String str) {
        this.f37904c = str;
    }

    public long o() {
        return this.k;
    }

    public void d(long j) {
        this.k = j;
    }

    public String a() {
        return this.f37903b;
    }

    public void b(String str) {
        this.f37903b = str;
    }

    public String c() {
        return this.e;
    }

    public void a(String str) {
        this.e = str;
    }
}
