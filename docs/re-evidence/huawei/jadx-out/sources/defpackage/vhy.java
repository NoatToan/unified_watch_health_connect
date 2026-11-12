package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes19.dex */
public class vhy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("targetWeight")
    private double f51135b;

    @SerializedName("targetSettingChanged")
    private int d;

    @SerializedName("fatBurnChoice")
    private int e;

    public void e(double d) {
        this.f51135b = d;
    }

    public void a(int i) {
        this.d = i;
    }

    public void e(int i) {
        this.e = i;
    }

    public String toString() {
        return "Goal{targetWeight=" + this.f51135b + ", targetSettingChanged=" + this.d + ", fatBurnChoice=" + this.e + '}';
    }
}
