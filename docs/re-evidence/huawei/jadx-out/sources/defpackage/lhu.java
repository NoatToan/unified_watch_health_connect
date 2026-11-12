package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;
import com.huawei.operation.jsoperation.JsUtil;
import health.compact.a.Utils;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lhu implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(JsUtil.DATA_LIST)
    private List<lhx> f40173a;

    public void d(List<lhx> list) {
        this.f40173a = list;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return Utils.b() + "/healthExpansion/extended/addExtendedServiceData";
    }
}
