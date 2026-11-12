package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class qqq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("versions")
    private List<String> f46676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("name")
    private String f46677b;

    @SerializedName("configs")
    private List<e> e;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("startTime")
        private String f46678a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("endTime")
        private String f46679c;
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("periods")
        private List<a> f46680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("platforms")
        private List<Integer> f46681b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("scopes")
        private List<Integer> f46682c;

        @SerializedName("configName")
        private String e;
    }

    public String toString() {
        return "GrayingBasicConfig{name='" + this.f46677b + "', versionList=" + this.f46676a + ", configs=" + this.e + '}';
    }
}
