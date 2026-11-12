package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import com.huawei.operation.ble.BleConstants;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes15.dex */
public class pkw implements IRequest {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(BleConstants.SPORT_TYPE)
    private Integer f45570b;

    public void b(Integer num) {
        this.f45570b = num;
    }

    public String toString() {
        return "GetShareResourceReq{sportType=" + this.f45570b + '}';
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("sportSuggestUrl") + "/getShareResList";
    }
}
