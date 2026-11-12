package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class hbq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("template_id")
    private String f36370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("sportConfigs")
    private List<hbt> f36371c;

    @SerializedName("baseConfig")
    private hbt d;

    @SerializedName("version")
    private String e;

    public String b() {
        return this.e;
    }

    public hbt d() {
        return this.d;
    }

    public List<hbt> c() {
        return this.f36371c;
    }
}
