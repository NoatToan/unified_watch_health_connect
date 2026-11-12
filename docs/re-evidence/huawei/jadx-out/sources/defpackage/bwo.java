package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes23.dex */
public class bwo extends bwg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("endTime")
    private long f1254a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("startTime")
    private long f1255c;

    @SerializedName("version")
    private long d;

    @Override // defpackage.bwg, com.huawei.networkclient.IRequest
    public String getUrl() {
        return null;
    }

    public void b(long j) {
        this.d = j;
    }

    public void e(long j) {
        this.f1255c = j;
    }

    public void d(long j) {
        this.f1254a = j;
    }
}
