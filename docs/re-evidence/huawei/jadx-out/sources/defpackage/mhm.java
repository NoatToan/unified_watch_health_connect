package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes38.dex */
public class mhm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("countryList")
    private List<String> f41684a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("supportVersion")
    private b f41685b;

    @SerializedName("packageName")
    private String d;

    @SerializedName("support")
    private int e;

    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("ohMinVersion")
        private String f41686c;

        @SerializedName("androidMinVersion")
        private String d;

        @SerializedName("iosMinVersion")
        private String e;
    }

    public String c() {
        return this.d;
    }

    public List<String> a() {
        return this.f41684a;
    }

    public int e() {
        return this.e;
    }
}
