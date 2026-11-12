package defpackage;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class njj implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("pace")
    private float f43088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("dis")
    private int f43089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("points")
    private int f43090c;

    public njj() {
    }

    public njj(int i, int i2, float f) {
        this.f43089b = i;
        this.f43090c = i2;
        this.f43088a = f;
    }

    public njj(njj njjVar) {
        this.f43089b = njjVar.f43089b;
        this.f43090c = njjVar.f43090c;
        this.f43088a = njjVar.f43088a;
    }

    public int c() {
        return this.f43089b;
    }

    public void c(int i) {
        this.f43089b = i;
    }

    public int e() {
        return this.f43090c;
    }

    public void e(int i) {
        this.f43090c = i;
    }

    public float d() {
        return this.f43088a;
    }

    public void d(float f) {
        this.f43088a = f;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        njj njjVar = (njj) obj;
        return this.f43089b == njjVar.f43089b && this.f43090c == njjVar.f43090c;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f43089b), Integer.valueOf(this.f43090c));
    }

    public String toString() {
        return "{distance=" + this.f43089b + ", pointsNums=" + this.f43090c + ", pace=" + this.f43088a + '}';
    }
}
