package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class qsz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("vVersionName")
    private String f46778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("vWhiteCountryCode")
    private List<String> f46779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("vSupportHuid")
    private List<Integer> f46780c;

    @SerializedName("vBlockHuid")
    private List<String> d;

    @SerializedName("vReleaseSupportDevice")
    private List<String> e;

    public String b() {
        return this.f46778a;
    }

    public List<Integer> e() {
        return this.f46780c;
    }

    public List<String> d() {
        return this.d;
    }

    public List<String> a() {
        return this.f46779b;
    }

    public List<String> c() {
        return this.e;
    }

    public String toString() {
        return "VersionInnerConfigBean{mVersionName=" + this.f46778a + ", mSupportHuid=" + this.f46780c + ", mBlockHuid=" + this.d + ", mWhiteCountryCode=" + this.f46779b + ", mReleaseSupportDevice=" + this.e + '}';
    }
}
