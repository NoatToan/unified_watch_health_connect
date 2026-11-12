package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;
import health.compact.a.Utils;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lhw implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("types")
    private List<Integer> f40175a;

    public void a(List<Integer> list) {
        this.f40175a = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(16);
        sb.append("types=");
        sb.append(this.f40175a);
        return sb.toString();
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return Utils.b() + "/healthExpansion/extended/getCurrentVersion";
    }
}
