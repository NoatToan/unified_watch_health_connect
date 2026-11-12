package defpackage;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes9.dex */
public class hde {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("foodMatchConditions")
    private hcz f36449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("recommendDetail")
    private hdf f36450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("planId")
    private String f36451c;

    @SerializedName("recipesDate")
    private String d;

    @SerializedName("mealType")
    private int e;

    @SerializedName("replaceType")
    private int f;

    public String b() {
        return this.f36451c;
    }

    public void a(String str) {
        this.f36451c = str;
    }

    public String e() {
        return this.d;
    }

    public void b(String str) {
        this.d = str;
    }

    public hcz d() {
        return this.f36449a;
    }

    public void a(hcz hczVar) {
        this.f36449a = hczVar;
    }

    public hdf c() {
        return this.f36450b;
    }

    public void d(hdf hdfVar) {
        this.f36450b = hdfVar;
    }

    public int i() {
        return this.f;
    }

    public void b(int i) {
        this.f = i;
    }

    public int a() {
        return this.e;
    }

    public void a(int i) {
        this.e = i;
    }

    public String toString() {
        return new Gson().toJson(this);
    }
}
