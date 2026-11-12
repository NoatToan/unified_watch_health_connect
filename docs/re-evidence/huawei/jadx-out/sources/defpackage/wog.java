package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes19.dex */
public class wog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("level")
    private final int f52260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("joinTime")
    private final long f52261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("activityId")
    private final String f52262c;

    @SerializedName("joinStatus")
    private final int e;

    public String b() {
        return this.f52262c;
    }

    public int d() {
        return this.e;
    }

    public String toString() {
        return "UserActivityInfo{activityId='" + this.f52262c + "', level=" + this.f52260a + ", joinStatus=" + this.e + ", joinTime=" + this.f52261b + '}';
    }
}
