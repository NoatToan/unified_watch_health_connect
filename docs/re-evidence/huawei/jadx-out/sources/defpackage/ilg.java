package defpackage;

import com.huawei.health.trackprocess.model.GpsPoint;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public class ilg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f37771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f37772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f37773c;
    private double d;
    private List<Integer> e;
    private ill f;
    private List<GpsPoint> g;
    private String h;
    private GpsPoint i;
    private double j;

    public String a() {
        return this.f37771a;
    }

    public String i() {
        return this.h;
    }

    public ill g() {
        return this.f;
    }

    public List<GpsPoint> f() {
        return this.g;
    }

    public double j() {
        return this.j;
    }

    public GpsPoint h() {
        return this.i;
    }

    public List<Integer> e() {
        return this.e;
    }

    public double b() {
        return this.d;
    }

    public int d() {
        return this.f37772b;
    }

    public String c() {
        return this.f37773c;
    }

    public String toString() {
        return "MotionPathInfo{geoHash='" + this.f37771a + "', pathId='" + this.h + "', pathRange=" + this.f + ", pathPoints=" + this.g + ", totalDistance=" + this.j + ", pathLocation=" + this.i + ", heat=" + this.e + ", confidence=" + this.d + ", flag=" + this.f37772b + ", executionTime='" + this.f37773c + "'}";
    }
}
