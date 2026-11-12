package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes.dex */
public class nzy {

    @SerializedName("runDuration")
    private long d;

    @SerializedName("startTime")
    private String e;

    public void d(String str) {
        this.e = str;
    }

    public void e(long j) {
        this.d = j;
    }

    public String toString() {
        return "AliveInfo{mStartTime=" + this.e + ", mRunDuration=" + this.d + '}';
    }
}
