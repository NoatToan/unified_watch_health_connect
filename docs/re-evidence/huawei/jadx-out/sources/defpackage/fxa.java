package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class fxa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("maxHr")
    double f34666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("meanHr")
    double f34667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("firstValley")
    int f34668c;

    @SerializedName("isPremBeat")
    int d;

    @SerializedName("afibRstFlag")
    int e;

    @SerializedName("predictValue")
    int f;

    @SerializedName("premPredictProb")
    double g;

    @SerializedName("measureType")
    int h;

    @SerializedName("predictProb")
    double i;

    @SerializedName("minHr")
    double j;

    @SerializedName("timeStamp")
    long l;

    @SerializedName("rriArrayLen")
    int m;

    @SerializedName("premRstFlag")
    int n;

    @SerializedName("rriArray")
    List<Integer> k = new ArrayList();

    @SerializedName("waveClass")
    List<Integer> o = new ArrayList();
}
