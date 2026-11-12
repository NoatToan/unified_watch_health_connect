package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.feature.result.CommonConstant;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class gxg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("advice_to_do")
    private List<gwj> f36190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("monthly_problem")
    private int f36191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("age")
    private int f36192c;

    @SerializedName(CommonConstant.KEY_GENDER)
    private int d;

    @SerializedName("latest_problem")
    private List<Integer> e;

    @SerializedName("task_to_do")
    private List<gxf> f;

    @SerializedName("time_zone")
    private int g;

    @SerializedName("rhythm")
    private int j;

    public void b(int i) {
        this.f36192c = i;
    }

    public void a(int i) {
        this.d = i;
    }

    public void e(int i) {
        this.j = i;
    }

    public void d(int i) {
        this.f36191b = i;
    }

    public void c(int i) {
        this.g = i;
    }

    public void c(List<gwj> list) {
        this.f36190a = list;
    }

    public void d(List<gxf> list) {
        this.f = list;
    }

    public void b(List<Integer> list) {
        this.e = list;
    }
}
