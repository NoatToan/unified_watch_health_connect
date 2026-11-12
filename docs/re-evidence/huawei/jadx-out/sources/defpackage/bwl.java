package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes23.dex */
public class bwl implements Comparable<bwl> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("endTime")
    private int f1249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("startTime")
    private int f1250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("id")
    private int f1251c;

    @SerializedName("timestamp")
    private long d;

    public String toString() {
        return "HealthModelChallengeRecord{mStartTime=" + this.f1250b + ", mEndTime=" + this.f1249a + ", mId=" + this.f1251c + ", mTimeStamp=" + this.d + '}';
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(bwl bwlVar) {
        return this.f1249a - bwlVar.f1249a;
    }
}
