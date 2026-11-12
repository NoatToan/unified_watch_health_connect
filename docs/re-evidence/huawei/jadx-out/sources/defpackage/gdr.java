package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.health.trackprocess.model.GpsPoint;
import com.huawei.operation.ble.BleConstants;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class gdr implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("cityId")
    private String f34945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("description")
    private String f34946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("createTime")
    private long f34947c;

    @SerializedName("distanceToUser")
    private double d;

    @SerializedName("distanceTypeId")
    private int e;

    @SerializedName("flag")
    private int f;

    @SerializedName("participateNum")
    private long g;

    @SerializedName("feedbackNum")
    private long h;

    @SerializedName("geoHash")
    private String i;

    @SerializedName(ParsedFieldTag.TASK_MODIFY_TIME)
    private long j;

    @SerializedName("pathId")
    private String k;

    @SerializedName("participateUserNum")
    private long l;

    @SerializedName("pathClass")
    private int m;

    @SerializedName("pathFlag")
    private int n;

    @SerializedName("pathImageInfo")
    private gdw o;

    @SerializedName("pathLabel")
    private List<String> p;

    @SerializedName("pathThemes")
    private List<Integer> q;

    @SerializedName("pathName")
    private String r;

    @SerializedName("pathType")
    private int s;

    @SerializedName("pathLocation")
    private GpsPoint t;

    @SerializedName("validEndDay")
    private int u;

    @SerializedName(BleConstants.TOTAL_DISTANCE)
    private double v;

    @SerializedName("pathTypes")
    private List<Integer> x;

    @SerializedName("state")
    private int y;

    public String j() {
        return this.k;
    }

    public List<Integer> l() {
        return this.q;
    }

    public int a() {
        return this.m;
    }

    public int c() {
        return this.e;
    }

    public List<Integer> k() {
        return this.x;
    }

    public String h() {
        return this.r;
    }

    public List<String> g() {
        return this.p;
    }

    public gdw i() {
        return this.o;
    }

    public long b() {
        return this.l;
    }

    public double n() {
        return this.v;
    }

    public GpsPoint f() {
        return this.t;
    }

    public double e() {
        return this.d;
    }

    public void d(double d) {
        this.d = d;
    }

    public long d() {
        return this.g;
    }

    public int o() {
        return this.y;
    }

    public String toString() {
        return "HotPathOperationInfo{pathId='" + this.k + "', cityId='" + this.f34945a + "', geoHash='" + this.i + "', pathFlag=" + this.n + ", pathClass=" + this.m + ", pathThemes=" + this.q + ", pathType=" + this.s + ", distanceTypeId=" + this.e + ", pathTypes=" + this.x + ", pathName='" + this.r + "', pathLabel=" + this.p + ", pathImageInfo=" + this.o + ", participateUserNum=" + this.l + ", totalDistance=" + this.v + ", pathLocation=" + this.t + ", validEndDay=" + this.u + ", feedbackNum=" + this.h + ", distanceToUser=" + this.d + ", description='" + this.f34946b + "', flag=" + this.f + ", createTime=" + this.f34947c + ", modifyTime=" + this.j + ", participateNum=" + this.g + ", state=" + this.y + '}';
    }
}
