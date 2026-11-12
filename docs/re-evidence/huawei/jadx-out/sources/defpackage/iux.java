package defpackage;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class iux implements Serializable {
    private static final long serialVersionUID = 2867379742733736124L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("maxRatio")
    private float f38058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("gear")
    private int f38059c;

    @SerializedName("maxWeek")
    private int d;

    @SerializedName("minRatio")
    private float e;

    public int d() {
        return this.f38059c;
    }

    public void e(int i) {
        this.f38059c = i;
    }

    public void e(float f) {
        this.e = f;
    }

    public void a(float f) {
        this.f38058b = f;
    }

    public void a(int i) {
        this.d = i;
    }

    public String toString() {
        return "FatLossRatio{mGear=" + this.f38059c + ", mMinRatio=" + this.e + ", mMaxRatio=" + this.f38058b + ", mMaxWeek=" + this.d + '}';
    }
}
