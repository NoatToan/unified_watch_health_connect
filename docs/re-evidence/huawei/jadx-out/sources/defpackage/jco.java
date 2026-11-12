package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes.dex */
public class jco {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("mSportResult")
    private long f38381a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("mSportType")
    private int f38382c;

    public void b(int i) {
        this.f38382c = i;
    }

    public void a(long j) {
        this.f38381a = j;
    }

    public String toString() {
        return "SportResult{mSportType=" + this.f38382c + ", mSportResult=" + this.f38381a + '}';
    }
}
