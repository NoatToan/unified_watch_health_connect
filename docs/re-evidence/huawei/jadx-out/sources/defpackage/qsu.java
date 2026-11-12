package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class qsu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("blockHuid")
    private List<String> f46770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("releaseSupportDevice")
    private List<String> f46771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("supportHuid")
    private List<Integer> f46772c;

    @SerializedName("isOpenArkuix")
    private int d;

    @SerializedName("configName")
    private String e;

    @SerializedName("whiteCountryCode")
    private List<String> f;

    @SerializedName("supportVersions")
    private List<qsz> g;

    public List<qsz> e() {
        return this.g;
    }

    public List<Integer> b() {
        return this.f46772c;
    }

    public List<String> c() {
        return this.f46770a;
    }

    public List<String> h() {
        return this.f;
    }

    public List<String> d() {
        return this.f46771b;
    }

    public int a() {
        return this.d;
    }

    public String toString() {
        return "ArkuixPageConfigBean{mConfigName=" + this.e + ", mSupportVersions=" + this.g + ", mSupportHuid=" + this.f46772c + ", mBlockHuid=" + this.f46770a + ", mWhiteCountryCode=" + this.f + ", mReleaseSupportDevice=" + this.f46771b + ", mOpenArkuix=" + this.d + '}';
    }
}
