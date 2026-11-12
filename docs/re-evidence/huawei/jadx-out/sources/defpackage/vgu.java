package defpackage;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes19.dex */
public class vgu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("fat")
    private float f51078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("carbohydrate")
    private float f51079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("addedTime")
    private long f51080c;

    @SerializedName("count")
    private float d;

    @SerializedName("fileTag")
    private String e;

    @SerializedName("protein")
    private float f;

    @SerializedName("kiloCalorie")
    private float g;

    @SerializedName("foodId")
    private String h;

    @SerializedName("foodName")
    private String i;

    @SerializedName("gi")
    private float j;

    @SerializedName("provider")
    private int k = 1;

    @SerializedName("unitId")
    private String l;

    @SerializedName("unit")
    private String m;

    @SerializedName("timeZone")
    private String n;

    @SerializedName("sodium")
    private float o;

    public void b(String str) {
        this.n = str;
    }

    public vgu(String str, long j) {
        this.h = str;
        this.f51080c = j;
    }

    public void o() {
        if (String.valueOf(this.f51080c).matches("\\d{13}")) {
            this.f51080c /= 1000;
        }
    }

    public void b(float f) {
        this.d = f;
    }

    public float d() {
        return this.d;
    }

    public String j() {
        return this.m;
    }

    public void a(String str) {
        this.m = str;
    }

    public int f() {
        return this.k;
    }

    public void l() {
        if (String.valueOf(this.f51080c).matches("\\d{10}")) {
            this.f51080c *= 1000;
        }
    }

    public String e() {
        return this.h;
    }

    public float g() {
        return this.j;
    }

    public void e(float f) {
        this.j = f;
    }

    public float c() {
        return this.f51079b;
    }

    public void c(float f) {
        this.f51079b = f;
    }

    public String a() {
        return this.i;
    }

    public void d(String str) {
        this.i = str;
    }

    public float b() {
        return this.f51078a;
    }

    public void d(float f) {
        this.f51078a = f;
    }

    public float i() {
        return this.f;
    }

    public void h(float f) {
        this.f = f;
    }

    public float h() {
        return this.g;
    }

    public void a(float f) {
        this.g = f;
    }

    public void i(float f) {
        this.o = f;
    }

    public String toString() {
        return new Gson().toJson(this);
    }
}
