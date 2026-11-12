package defpackage;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class nje implements Serializable {
    private static final long serialVersionUID = -5886031711168296004L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("heartRateStart")
    private float f43081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("heartRateLow")
    private float f43082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("heartRateIndex")
    private int f43083c;

    @SerializedName("heartRateHigh")
    private float d;

    @SerializedName("heartRateEnd")
    private float e;

    public nje(int i, float f, float f2, float f3, float f4) {
        this.f43083c = i;
        this.f43081a = f;
        this.d = f2;
        this.e = f3;
        this.f43082b = f4;
    }

    public float d() {
        return this.d;
    }

    public float a() {
        return this.f43082b;
    }

    public float c() {
        return this.f43081a;
    }

    public float b() {
        return this.e;
    }

    public String toString() {
        return "tp=h_r_a;index=" + this.f43083c + ";start=" + this.f43081a + ";high=" + this.d + ";end=" + this.e + ";low=" + this.f43082b + ";" + System.lineSeparator();
    }
}
