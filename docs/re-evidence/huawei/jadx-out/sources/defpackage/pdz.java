package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class pdz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("realIntensityZone")
    private List<Integer> f45224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("lastWeekCalorie")
    private float f45225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("coachComments")
    private String f45226c;

    @SerializedName("realLastWeekDuration")
    private int d;

    @SerializedName("lastWeekDistance")
    private double e;

    @SerializedName("targetWeekDuration")
    private int h;

    @SerializedName("targetIntensityZone")
    private List<Integer> j;

    public double c() {
        return this.e;
    }

    public void e(double d) {
        this.e = d;
    }

    public int a() {
        return this.d;
    }

    public void e(int i) {
        this.d = i;
    }

    public float d() {
        return this.f45225b;
    }

    public void c(float f) {
        this.f45225b = f;
    }

    public List<Integer> e() {
        return this.j;
    }

    public void a(List<Integer> list) {
        this.j = list;
    }

    public List<Integer> b() {
        return this.f45224a;
    }

    public void b(List<Integer> list) {
        this.f45224a = list;
    }
}
