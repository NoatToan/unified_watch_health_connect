package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class gog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("audioType")
    private int f35873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("audioName")
    private String f35874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("audioId")
    private int f35875c;

    @SerializedName("aiAudioId")
    private String d;

    @SerializedName("childAudioType")
    private int e;

    @SerializedName("resourceLabel")
    private List<String> f;

    @SerializedName("resourceType")
    private List<gny> g;

    @SerializedName("resourceName")
    private String h;

    @SerializedName("vipMode")
    private int i;

    @SerializedName("decompressingType")
    private int j;

    @SerializedName("workoutPackageId")
    private int k;

    public String a() {
        return this.d;
    }

    public int l() {
        return this.k;
    }

    public String e() {
        return this.f35874b;
    }

    public int c() {
        return this.f35875c;
    }

    public int d() {
        return this.f35873a;
    }

    public List<gny> i() {
        return this.g;
    }

    public int b() {
        return this.e;
    }

    public int j() {
        return this.i;
    }

    public String f() {
        return this.h;
    }

    public int g() {
        return this.j;
    }

    public List<String> h() {
        return this.f;
    }
}
