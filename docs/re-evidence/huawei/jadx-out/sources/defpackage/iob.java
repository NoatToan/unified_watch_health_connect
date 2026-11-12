package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes9.dex */
public class iob {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("bodyMassIndex")
    private Float f37895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("diastolicPressure")
    private Integer f37896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("bloodPressureTimestamp")
    private Long f37897c;

    @SerializedName("bloodPressureGrade")
    private Integer d;

    @SerializedName("bloodPressureSource")
    private Integer e;

    @SerializedName("fatPercentageTimestamp")
    private Long f;

    @SerializedName("fattyLiverTimestamp")
    private Long g;

    @SerializedName("fattyLiverRisk")
    private Integer h;

    @SerializedName("fattyLiverGrade")
    private Float i;

    @SerializedName("fatPercentage")
    private Float j;

    @SerializedName("systolicPressure")
    private Integer k;

    @SerializedName("weight")
    private Float l;

    @SerializedName("sleepApneaTimestamp")
    private Long m;

    @SerializedName("sleepApneaGrade")
    private Integer n;

    @SerializedName("height")
    private Integer o;

    @SerializedName("weightTimestamp")
    private Long t;

    public Integer e() {
        Integer num = this.o;
        if (num == null) {
            return 0;
        }
        return num;
    }

    public void e(Integer num) {
        this.o = num;
    }

    public Float b() {
        Float f = this.l;
        return f == null ? Float.valueOf(0.0f) : f;
    }

    public void e(Float f) {
        this.l = f;
    }

    public void c(Long l) {
        this.t = l;
    }

    public void b(Float f) {
        this.f37895a = f;
    }

    public void j(Integer num) {
        this.k = num;
    }

    public void c(Integer num) {
        this.f37896b = num;
    }

    public void d(Integer num) {
        this.d = num;
    }

    public void a(Integer num) {
        this.e = num;
    }

    public void e(Long l) {
        this.f37897c = l;
    }

    public void a(Float f) {
        this.j = f;
    }

    public void d(Long l) {
        this.f = l;
    }

    public void b(Integer num) {
        this.h = num;
    }

    public void d(Float f) {
        this.i = f;
    }

    public void b(Long l) {
        this.g = l;
    }

    public void i(Integer num) {
        this.n = num;
    }

    public void a(Long l) {
        this.m = l;
    }

    public String toString() {
        return "HealthGlanceData{height=" + this.o + ", weight=" + this.l + ", weightTimestamp=" + this.t + ", bodyMassIndex=" + this.f37895a + ", systolicPressure=" + this.k + ", diastolicPressure=" + this.f37896b + ", bloodPressureGrade=" + this.d + ", bloodPressureSource=" + this.e + ", bloodPressureTimestamp=" + this.f37897c + ", fatPercentage=" + this.j + ", fatPercentageTimestamp=" + this.f + ", fattyLiverRisk=" + this.h + ", fattyLiverGrade=" + this.i + ", fattyLiverTimestamp=" + this.g + ", sleepApneaGrade=" + this.n + ", sleepApneaTimestamp=" + this.m + '}';
    }
}
