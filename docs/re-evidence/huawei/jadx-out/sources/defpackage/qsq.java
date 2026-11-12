package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class qsq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("isSupposeNewHome")
    private int f46763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("supportHuid")
    private List<Integer> f46764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("configName")
    private String f46765c;

    @SerializedName("blockHuid")
    private List<String> d;

    @SerializedName("releaseSupportDevice")
    private List<String> e;

    @SerializedName("supportVersions")
    private List<qsz> i;

    @SerializedName("whiteCountryCode")
    private List<String> j;

    public List<qsz> c() {
        return this.i;
    }

    public List<Integer> b() {
        return this.f46764b;
    }

    public List<String> d() {
        return this.d;
    }

    public List<String> i() {
        return this.j;
    }

    public List<String> e() {
        return this.e;
    }

    public int a() {
        return this.f46763a;
    }

    public String toString() {
        return "HomeFragmentConfigBean{mConfigName=" + this.f46765c + ", mSupportVersions=" + this.i + ", mSupportHuid=" + this.f46764b + ", mBlockHuid=" + this.d + ", mWhiteCountryCode=" + this.j + ", mReleaseSupportDevice=" + this.e + ", mSupposeNewHome=" + this.f46763a + '}';
    }
}
