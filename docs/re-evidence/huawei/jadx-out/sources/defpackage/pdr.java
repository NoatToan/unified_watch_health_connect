package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.operation.ble.BleConstants;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public class pdr implements Serializable, Cloneable {
    private static final long serialVersionUID = -6971445234843367795L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("actualCalorie")
    private float f45203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("duration")
    private long f45204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("actualDistance")
    private int f45205c;

    @SerializedName("endTime")
    private long d;

    @SerializedName("completionRate")
    private float e;

    @SerializedName("recordId")
    private String f;

    @SerializedName("startTime")
    private long g;

    @SerializedName("extraInfo")
    private String h;

    @SerializedName(BleConstants.SPORT_TYPE)
    private int i;

    @SerializedName("inPlan")
    private int j;

    @SerializedName(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID)
    private String k;

    @SerializedName("userWeight")
    private double m;

    @SerializedName(HwExerciseConstants.JSON_NAME_TRAINING_POINTS)
    private int n;

    public String l() {
        return this.k;
    }

    public void c(String str) {
        this.k = str;
    }

    public String j() {
        return this.f;
    }

    public void e(String str) {
        this.f = str;
    }

    public int g() {
        return this.i;
    }

    public void c(int i) {
        this.i = i;
    }

    public long f() {
        return this.g;
    }

    public void a(long j) {
        this.g = j;
    }

    public long b() {
        return this.d;
    }

    public void c(long j) {
        this.d = j;
    }

    public long a() {
        return this.f45204b;
    }

    public void e(long j) {
        this.f45204b = j;
    }

    public int i() {
        return this.j;
    }

    public void e(int i) {
        this.j = i;
    }

    public String h() {
        return this.h;
    }

    public void a(String str) {
        this.h = str;
    }

    public int d() {
        return this.f45205c;
    }

    public void a(int i) {
        this.f45205c = i;
    }

    public float e() {
        return this.f45203a;
    }

    public void b(float f) {
        this.f45203a = f;
    }

    public int k() {
        return this.n;
    }

    public void d(int i) {
        this.n = i;
    }

    public float c() {
        return this.e;
    }

    public void c(float f) {
        this.e = f;
    }

    public void d(double d) {
        this.m = d;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
