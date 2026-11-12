package defpackage;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class hda {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("banFoods")
    private List<String> f36439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("illness")
    private List<Integer> f36440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("dietFavor")
    private Integer f36441c;

    @SerializedName("area")
    private String d;

    @SerializedName("allergenicFoods")
    private List<String> e;

    @SerializedName("resultCode")
    private String f;

    @SerializedName("resultDesc")
    private String j;

    public String toString() {
        return new Gson().toJson(this);
    }

    public String a() {
        return this.d;
    }

    public List<String> e() {
        return this.f36439a;
    }

    public List<Integer> b() {
        return this.f36440b;
    }

    public List<String> d() {
        return this.e;
    }
}
