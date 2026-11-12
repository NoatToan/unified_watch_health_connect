package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class fdf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("countryRuleList")
    private List<fdh> f33887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("version")
    private String f33888b;

    public List<fdh> c() {
        return this.f33887a;
    }

    public String toString() {
        return "CommonFeatureConfig{mVersion='" + this.f33888b + ", mCountryRuleList=" + this.f33887a + '}';
    }
}
