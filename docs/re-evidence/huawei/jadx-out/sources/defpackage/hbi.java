package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class hbi implements IRequest {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("broadcastInfoList")
    private List<hbj> f36353b = new ArrayList();

    public void b(List<hbj> list) {
        this.f36353b = list;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("sportSuggestUrl") + "/v1/getVoiceBroadcastList";
    }
}
