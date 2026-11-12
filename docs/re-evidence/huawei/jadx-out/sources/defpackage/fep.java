package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
public class fep {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("summaryComment")
    private String f33957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("detailComment")
    private String f33958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("doctorInfo")
    private String f33959c;

    @SerializedName("dimensionComments")
    private Map<String, String> e;

    public String b() {
        return this.f33957a;
    }

    public String toString() {
        return "CommentInfo{mDoctorInfo=" + this.f33959c + ", mSummaryComment=" + this.f33957a + ", mDetailComment=" + this.f33958b + ", mDimensionComments=" + this.e + "}";
    }
}
