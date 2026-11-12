package defpackage;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class hdc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("foodId")
    private String f36444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("carbohydrate")
    private float f36445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("foodName")
    private String f36446c;

    @SerializedName("fat")
    private float d;

    @SerializedName("extensionUnits")
    private List<hdd> e;

    @SerializedName("protein")
    private float f;

    @SerializedName("imageUrl")
    private String g;

    @SerializedName("mealType")
    private int h;

    @SerializedName("gi")
    private float i;

    @SerializedName("heat")
    private float j;

    @SerializedName("unit")
    private String n;

    @SerializedName("value")
    private int o;

    public String c() {
        return this.f36444a;
    }

    public String b() {
        return this.f36446c;
    }

    public int l() {
        return this.o;
    }

    public float h() {
        return this.j;
    }

    public String g() {
        return this.g;
    }

    public String m() {
        return this.n;
    }

    public int j() {
        return this.h;
    }

    public void c(int i) {
        this.h = i;
    }

    public float i() {
        return this.i;
    }

    public float d() {
        return this.f36445b;
    }

    public float e() {
        return this.d;
    }

    public float f() {
        return this.f;
    }

    public List<hdd> a() {
        return this.e;
    }

    public String toString() {
        return new Gson().toJson(this);
    }
}
