package defpackage;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class gcm implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("pathThemes")
    private List<gdp> f34898a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("pathClasses")
    private List<gdp> f34899c;

    @SerializedName("pathTypes")
    private List<gdp> d;

    @SerializedName("distanceTypes")
    private List<gdp> e;

    public List<gdp> e() {
        return this.f34898a;
    }

    public List<gdp> b() {
        return this.d;
    }

    public List<gdp> c() {
        return this.e;
    }

    public String toString() {
        return "CityPathAttribute{pathClasses=" + this.f34899c + ", pathThemes=" + this.f34898a + ", pathTypes=" + this.d + ", distanceTypes=" + this.e + '}';
    }
}
