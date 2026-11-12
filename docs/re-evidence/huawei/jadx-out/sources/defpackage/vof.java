package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes19.dex */
public class vof {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("mHuid")
    private long f51402c;

    @SerializedName("mImageUrl")
    private String e;

    public void a(long j) {
        this.f51402c = j;
    }

    public long d() {
        return this.f51402c;
    }

    public void b(String str) {
        this.e = str;
    }

    public String c() {
        return this.e;
    }
}
