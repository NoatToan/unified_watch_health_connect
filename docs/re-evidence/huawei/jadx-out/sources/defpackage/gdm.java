package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.health.trackprocess.model.GpsPoint;
import com.huawei.operation.ble.BleConstants;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class gdm implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("distanceTypeId")
    private int f34936a;

    @SerializedName("state")
    private int aa;

    @SerializedName("timeRanking")
    private List<gdo> ab;

    @SerializedName("pathTypes")
    private List<Integer> ac;

    @SerializedName(BleConstants.TOTAL_DISTANCE)
    private double ad;

    @SerializedName("validEndDay")
    private int ag;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("cpPoint")
    private gcl f34937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("description")
    private String f34938c;

    @SerializedName("coordinate")
    private String d;

    @SerializedName("cityId")
    private String e;

    @SerializedName("estimateDuration")
    private int f;

    @SerializedName("minTime")
    private long g;

    @SerializedName("num")
    private int h;

    @SerializedName("numsRanking")
    private List<gdo> i;

    @SerializedName("flag")
    private int j;

    @SerializedName("pathClass")
    private int k;

    @SerializedName("pathBehaviorwait")
    private gdl l;

    @SerializedName("pathComment")
    private String m;

    @SerializedName("participateUserNum")
    private long n;

    @SerializedName("participateNum")
    private long o;

    @SerializedName("pathLocation")
    private GpsPoint p;

    @SerializedName("pathLabel")
    private List<String> q;

    @SerializedName("pathFlag")
    private int r;

    @SerializedName("pathImageInfo")
    private gdw s;

    @SerializedName("pathId")
    private String t;

    @SerializedName("pathName")
    private String u;

    @SerializedName("pathSourceDeeplink")
    private String v;

    @SerializedName("pathPoints")
    private List<GpsPoint> w;

    @SerializedName("pathSource")
    private int x;

    @SerializedName("pathThemes")
    private List<Integer> y;

    @SerializedName("pathType")
    private int z;

    public String o() {
        return this.t;
    }

    public String b() {
        return this.e;
    }

    public List<GpsPoint> p() {
        return this.w;
    }

    public int m() {
        return this.r;
    }

    public int q() {
        return this.z;
    }

    public List<Integer> v() {
        return this.ac;
    }

    public String l() {
        return this.u;
    }

    public gdw n() {
        return this.s;
    }

    public long h() {
        return this.n;
    }

    public long f() {
        return this.o;
    }

    public double y() {
        return this.ad;
    }

    public GpsPoint k() {
        return this.p;
    }

    public long j() {
        return this.g;
    }

    public List<gdo> i() {
        return this.i;
    }

    public List<gdo> u() {
        return this.ab;
    }

    public String d() {
        return this.f34938c;
    }

    public int x() {
        return this.aa;
    }

    public gcl a() {
        return this.f34937b;
    }

    public String c() {
        return this.d;
    }

    public List<Integer> s() {
        return this.y;
    }

    public int g() {
        return this.k;
    }

    public int e() {
        return this.f;
    }

    public int r() {
        return this.x;
    }

    public String t() {
        return this.v;
    }

    public String toString() {
        return "HotPathDetailInfo{pathId='" + this.t + "', pathPoints=" + this.w + ", pathFlag=" + this.r + ", pathType=" + this.z + ", pathTypes=" + this.ac + ", pathClass=" + this.k + ", pathThemes=" + this.y + ", pathName='" + this.u + "', pathLabel=" + this.q + ", pathImageInfo=" + this.s + ", participateUserNum=" + this.n + ", participateNum=" + this.o + ", validEndDay=" + this.ag + ", totalDistance=" + this.ad + ", pathLocation=" + this.p + ", num=" + this.h + ", minTime=" + this.g + ", numsRanking=" + this.i + ", timeRanking=" + this.ab + ", description='" + this.f34938c + "', flag=" + this.j + ", state=" + this.aa + ", cpPoint=" + this.f34937b + ", pathComment=" + this.m + ", coordinate=" + this.d + ", pathBehavior=" + this.l + ", estimateDuration=" + this.f + ", pathSource=" + this.x + ", pathSourceDeeplink=" + this.v + '}';
    }
}
