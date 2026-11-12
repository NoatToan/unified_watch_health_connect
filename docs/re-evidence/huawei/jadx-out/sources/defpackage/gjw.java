package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes29.dex */
public class gjw implements IRequest {

    @SerializedName("serialCourseId")
    private String e;

    public void d(String str) {
        this.e = str;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        StringBuilder sb = new StringBuilder();
        sb.append(GRSManager.c(BaseApplication.b()).getUrl("sportSuggestUrl"));
        if (!LoginInit.getInstance(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).isBrowseMode()) {
            sb.append("/user/queryEssenceVideos");
        } else {
            sb.append("/queryEssenceVideos");
        }
        return sb.toString();
    }
}
