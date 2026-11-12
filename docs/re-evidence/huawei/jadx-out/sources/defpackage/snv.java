package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes43.dex */
public class snv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("name")
    private String f48441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("totalPalyCount")
    private long f48442b;

    @SerializedName("topicBackImgUrl")
    private String d;

    public String toString() {
        return "RecommendMoreTopic{name='" + this.f48441a + "', topicBackImgUrl='" + this.d + "', totalPalyCount=" + this.f48442b + '}';
    }
}
