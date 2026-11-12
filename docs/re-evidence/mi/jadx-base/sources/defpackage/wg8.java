package defpackage;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;

/* JADX INFO: loaded from: classes9.dex */
public class wg8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("distance")
    private int f37936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("step")
    private int f37937b;

    @SerializedName(FitnessReportKey.maxPace)
    private int c;

    @SerializedName("minPace")
    private int d;

    @SerializedName(FitnessReportKey.avgPace)
    private int e;

    @SerializedName("maxStepFrequency")
    private int f;

    @SerializedName("minStepFrequency")
    private int g;

    @SerializedName("averageStepFrequency")
    private int h;

    @SerializedName("avgHrm")
    private int i;

    @SerializedName("maxHrm")
    private int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @SerializedName("minHrm")
    private int f37938k;

    @SerializedName("riseHeight")
    private float l;

    @SerializedName("fallHeight")
    private float m;

    @SerializedName("avgHeight")
    private float n;

    @SerializedName("maxHeight")
    private float o;

    @SerializedName("minHeight")
    private float p;

    @SerializedName("pacePerKmList")
    private String q;

    public int a() {
        int i = this.h;
        if (i > 0) {
            return i;
        }
        return 0;
    }

    public int b() {
        int i = this.e;
        if (i > 0) {
            return i;
        }
        return 0;
    }

    public int c() {
        int i = this.c;
        if (i > 0) {
            return i;
        }
        return 0;
    }

    public int d() {
        int i = this.f;
        if (i > 0) {
            return i;
        }
        return 0;
    }

    public int e() {
        int i = this.d;
        if (i > 0) {
            return i;
        }
        return 0;
    }

    public int f() {
        int i = this.g;
        if (i > 0) {
            return i;
        }
        return 0;
    }

    public int g() {
        int i = this.f37937b;
        if (i > 0) {
            return i;
        }
        return 0;
    }
}
