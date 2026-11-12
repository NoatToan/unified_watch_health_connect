package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes.dex */
public class jcq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("mRecordNum")
    private int f38384a;

    @SerializedName("mPace")
    private float d;

    public void d(int i) {
        this.f38384a = i;
    }

    public void b(float f) {
        this.d = f;
    }

    public String toString() {
        return "HistoryBestResult{mRecordNum=" + this.f38384a + ", mPace=" + this.d + '}';
    }
}
