package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes11.dex */
public class nrm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("startTime")
    private long f43542a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("endTime")
    private long f43543c;

    public long f() {
        return this.f43542a;
    }

    public void c(long j) {
        this.f43542a = j;
    }

    public long g() {
        return this.f43543c;
    }

    public void b(long j) {
        this.f43543c = j;
    }

    public String toString() {
        return "BaseUiData{startTime=" + this.f43542a + ", endTime=" + this.f43543c + '}';
    }
}
