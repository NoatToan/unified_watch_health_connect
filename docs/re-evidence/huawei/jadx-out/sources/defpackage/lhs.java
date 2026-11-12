package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;
import health.compact.a.Utils;

/* JADX INFO: loaded from: classes10.dex */
public class lhs implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("type")
    private int f40169a;

    @SerializedName("version")
    private long e;

    public long c() {
        return this.e;
    }

    public void b(long j) {
        this.e = j;
    }

    public int b() {
        return this.f40169a;
    }

    public void c(int i) {
        this.f40169a = i;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return Utils.b() + "/healthExpansion/extended/queryByVersion";
    }
}
