package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.health.trackprocess.model.GpsPoint;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class gcl implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("cpGps")
    private List<GpsPoint> f34895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("cpRelations")
    private List<gcs> f34896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("punchNum")
    private int f34897c;

    @SerializedName("rotationAngle")
    private double d;

    @SerializedName("drawBoard")
    private gco e;

    public List<GpsPoint> c() {
        return this.f34895a;
    }

    public List<gcs> d() {
        return this.f34896b;
    }

    public int b() {
        return this.f34897c;
    }

    public gco e() {
        return this.e;
    }

    public String toString() {
        return "CpPoint{cpGps='" + this.f34895a + ", cpRelations=" + this.f34896b + ", rotationAngle=" + this.d + ", drawBoard=" + this.e + ", punchNum=" + this.f34897c + '}';
    }
}
