package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.feature.result.CommonConstant;

/* JADX INFO: loaded from: classes19.dex */
public class vib {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("age")
    private int f51143a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("weight")
    private double f51144c;

    @SerializedName("height")
    private int d;

    @SerializedName(CommonConstant.KEY_GENDER)
    private int e;

    public void a(int i) {
        this.e = i;
    }

    public void c(int i) {
        this.f51143a = i;
    }

    public int b() {
        return this.d;
    }

    public void e(int i) {
        this.d = i;
    }

    public double a() {
        return this.f51144c;
    }

    public void a(double d) {
        this.f51144c = d;
    }
}
