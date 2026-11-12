package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class fwp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("packageName")
    private String f34645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("deviceTypes")
    private Set<Integer> f34646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("appIconPath")
    private String f34647c;

    @SerializedName("authTime")
    private String d;

    @SerializedName("appName")
    private String e;

    @SerializedName("url2Desc")
    private Map<String, String> f;

    public Map<String, String> j() {
        return this.f;
    }

    public String d() {
        return this.d;
    }

    public String b() {
        return this.e;
    }

    public Set<Integer> e() {
        return this.f34646b;
    }

    public String c() {
        return this.f34647c;
    }

    public String a() {
        return this.f34645a;
    }
}
