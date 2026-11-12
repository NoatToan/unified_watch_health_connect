package defpackage;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class vrw implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("jumpToManager")
    private List<String> f51539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("btn")
    private String f51540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("manufactures")
    private List<String> f51541c;

    @SerializedName("jumpDetail")
    private List<String> d;

    @SerializedName("subtitle")
    private String e;

    @SerializedName("type")
    private String f;

    @SerializedName("title")
    private String h;

    public String h() {
        return this.f;
    }

    public String b() {
        return this.h;
    }

    public String d() {
        return this.f51540b;
    }

    public List<String> e() {
        return this.f51541c;
    }

    public List<String> a() {
        return this.d;
    }

    public List<String> c() {
        return this.f51539a;
    }
}
