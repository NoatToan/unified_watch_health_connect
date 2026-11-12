package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;

/* JADX INFO: loaded from: classes42.dex */
public class pgp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("clientTime")
    private Long f45336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("altitude")
    private Double f45337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(JsbMapKeyNames.H5_LOC_LON)
    private Double f45338c;

    @SerializedName(JsbMapKeyNames.H5_LOC_LAT)
    private Double d;

    @SerializedName("coordinate")
    private String e;

    @SerializedName("serverTime")
    private Long h;

    @SerializedName("type")
    private int i;

    public String d() {
        return this.e;
    }

    public void b(String str) {
        this.e = str;
    }

    public Double b() {
        return this.f45338c;
    }

    public void e(Double d) {
        this.f45338c = d;
    }

    public Double a() {
        return this.d;
    }

    public void c(Double d) {
        this.d = d;
    }

    public Double e() {
        return this.f45337b;
    }

    public void b(Double d) {
        this.f45337b = d;
    }

    public Long c() {
        return this.f45336a;
    }

    public void d(Long l) {
        this.f45336a = l;
    }

    public int j() {
        return this.i;
    }

    public void e(int i) {
        this.i = i;
    }
}
