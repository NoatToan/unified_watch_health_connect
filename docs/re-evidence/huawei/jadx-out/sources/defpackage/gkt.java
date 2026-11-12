package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class gkt implements IRequest {

    @SerializedName("batchBehaviorList")
    private List<pdh> e;

    public void e(List<pdh> list) {
        this.e = list;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        StringBuilder sb = new StringBuilder();
        sb.append(GRSManager.c(BaseApplication.b()).getUrl("sportSuggestUrl"));
        if (!LoginInit.getInstance(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).isBrowseMode()) {
            sb.append("/v3/uploadBehavior");
        } else {
            sb.append("/v3/uploadBehaviorAnon");
        }
        return sb.toString();
    }
}
