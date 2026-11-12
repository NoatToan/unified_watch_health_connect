package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes9.dex */
public class hdh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("resultCode")
    private int f36456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("recipesDate")
    private String f36457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("recommendDetail")
    private hdf f36458c;

    @SerializedName("resultDesc")
    private String d;

    @SerializedName("status")
    private int e;

    public String toString() {
        return "RecipeResponse{mResultCode=" + this.f36456a + ", mResultDesc='" + this.d + "', mRecipesDate='" + this.f36457b + "', mRecommendDetail=" + this.f36458c + ", mStatus=" + this.e + '}';
    }

    public int c() {
        return this.f36456a;
    }

    public hdf d() {
        return this.f36458c;
    }

    public int b() {
        return this.e;
    }
}
