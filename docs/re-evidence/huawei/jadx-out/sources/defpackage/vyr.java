package defpackage;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes43.dex */
public class vyr implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("count")
    private int f51702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("timemills")
    private long f51703c;

    public vyr(int i, long j) {
        this.f51702b = i;
        this.f51703c = j;
    }

    public int b() {
        return this.f51702b;
    }

    public void b(int i) {
        this.f51702b = i;
    }

    public long c() {
        return this.f51703c;
    }

    public void b(long j) {
        this.f51703c = j;
    }
}
