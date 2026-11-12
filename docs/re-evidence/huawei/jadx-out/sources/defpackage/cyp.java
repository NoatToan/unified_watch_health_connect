package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class cyp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("frequency")
    private int f31499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("currentWeight")
    private double f31500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("endTime")
    private long f31501c;

    @SerializedName("createTime")
    private long d;

    @SerializedName("completeValue")
    private double e;

    @SerializedName("recordDays")
    private List<Long> f;

    @SerializedName("goalValue")
    private double g;

    @SerializedName(ParsedFieldTag.TASK_MODIFY_TIME)
    private long h;

    @SerializedName("goalType")
    private int i;

    @SerializedName("id")
    private long j;

    @SerializedName("unitValue")
    private double k;

    @SerializedName("startTime")
    private long l;

    @SerializedName("status")
    private int n;

    @SerializedName("timeZone")
    private String o;

    public long h() {
        return this.j;
    }

    public int d() {
        return this.i;
    }

    public double b() {
        return this.g;
    }

    public void d(double d) {
        this.e = d;
    }

    public double c() {
        return this.e;
    }

    public void e(List<Long> list) {
        this.f = list;
    }

    public List<Long> g() {
        return this.f;
    }

    public double a() {
        return this.f31500b;
    }

    public long f() {
        return this.l;
    }

    public long e() {
        return this.f31501c;
    }

    public String i() {
        return this.o;
    }

    public int j() {
        return this.n;
    }

    public void c(int i) {
        this.n = i;
    }

    public String toString() {
        return "GoalBean{id=" + this.j + ", goalType=" + this.i + ", goalValue=" + this.g + ", completeValue=" + this.e + ", recordDays=" + this.f + ", currentWeight=" + this.f31500b + ", frequency=" + this.f31499a + ", unitValue=" + this.k + ", startTime=" + this.l + ", endTime=" + this.f31501c + ", createTime=" + this.d + ", modifyTime=" + this.h + ", status=" + this.n + ", timeZone='" + this.o + "'}";
    }
}
