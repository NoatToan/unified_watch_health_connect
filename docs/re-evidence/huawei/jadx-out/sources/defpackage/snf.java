package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes43.dex */
public class snf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("topicBackImgUrl")
    private String f48408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("topicId")
    private int f48409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("playTime")
    private long f48410c;

    @SerializedName("playedCount")
    private int d;

    @SerializedName("topicName")
    private String e;

    @SerializedName("workoutCount")
    private int f;

    public String toString() {
        return "AudioTopicBehavior{topicId=" + this.f48409b + ", topicName='" + this.e + "', topicBackImgUrl='" + this.f48408a + "', playTime=" + this.f48410c + ", workoutCount=" + this.f + ", playedCount=" + this.d + '}';
    }
}
