package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class gxh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("monthly_major_reason")
    private List<Integer> f36193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("monthly_impact_desc")
    private String f36194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("monthly_daily_tasks")
    private List<List<gwq>> f36195c;

    @SerializedName("monthly_daily_advices")
    private List<gwt> d;

    @SerializedName("monthly_prob_desc")
    private String e;

    @SerializedName("monthly_problem")
    private int f;

    @SerializedName("monthly_prob_val")
    private List<Integer> g;

    @SerializedName("monthly_prob_level")
    private int h;

    @SerializedName("monthly_recomd")
    private gwu i;

    @SerializedName("monthly_tasks")
    private List<Integer> j;

    @SerializedName("rhythm_desc")
    private String l;

    @SerializedName("result_code")
    private int m;

    @SerializedName("rhythm")
    private int o;

    public int k() {
        return this.m;
    }

    public int m() {
        return this.o;
    }

    public int h() {
        return this.f;
    }

    public int f() {
        return this.h;
    }

    public String d() {
        return this.e;
    }

    public List<Integer> j() {
        return this.g;
    }

    public List<Integer> c() {
        return this.f36193a;
    }

    public String b() {
        return this.f36194b;
    }

    public gwu i() {
        return this.i;
    }

    public List<Integer> g() {
        return this.j;
    }

    public List<List<gwq>> a() {
        return this.f36195c;
    }

    public List<gwt> e() {
        return this.d;
    }
}
