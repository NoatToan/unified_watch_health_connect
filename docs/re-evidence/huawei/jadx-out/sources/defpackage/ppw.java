package defpackage;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class ppw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("mtkBrandAllowList")
    private List<String> f45800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("mtkCpuAllowList")
    private List<String> f45801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("brandMode")
    private String f45802c;

    @SerializedName("cpuAllowList")
    private List<String> d;

    @SerializedName("brandAllowList")
    private List<String> e;

    @SerializedName("deviceModel")
    private List<String> f;

    @SerializedName("shieldingStatus")
    private String g;

    public List<String> e() {
        return this.f45801b;
    }

    public List<String> a() {
        return this.d;
    }

    public List<String> c() {
        return this.e;
    }

    public List<String> d() {
        return this.f45800a;
    }

    public String b() {
        return this.f45802c;
    }

    public String h() {
        return this.g;
    }

    public List<String> g() {
        return this.f;
    }

    public String toString() {
        return new Gson().toJson(this);
    }
}
