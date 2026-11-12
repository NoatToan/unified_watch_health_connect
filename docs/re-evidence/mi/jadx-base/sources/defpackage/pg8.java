package defpackage;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;

/* JADX INFO: loaded from: classes9.dex */
public class pg8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("distance")
    private int f30366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(FitnessReportKey.maxPace)
    private int f30367b;

    @SerializedName("minPace")
    private int c;

    @SerializedName(FitnessReportKey.avgPace)
    private int d;

    @SerializedName("avgHrm")
    private int e;

    @SerializedName("maxHrm")
    private int f;

    @SerializedName("minHrm")
    private int g;

    @SerializedName("riseHeight")
    private float h;

    @SerializedName("fallHeight")
    private float i;

    @SerializedName("avgHeight")
    private float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @SerializedName("maxHeight")
    private float f30368k;

    @SerializedName("minHeight")
    private float l;

    public int a() {
        int i = this.d;
        if (i > 0) {
            return i;
        }
        return 0;
    }

    public int b() {
        int i = this.f30367b;
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
}
