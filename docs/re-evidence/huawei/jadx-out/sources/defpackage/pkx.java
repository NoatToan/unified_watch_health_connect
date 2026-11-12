package defpackage;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import com.huawei.operation.ble.BleConstants;
import com.huawei.pluginachievement.manager.db.IAchieveDBMgr;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes42.dex */
public class pkx implements IRequest {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("urlSuffix")
    private String f45572b;

    @SerializedName(BleConstants.SPORT_TYPE)
    private Integer d;

    @SerializedName("pageNo")
    private Integer e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(IAchieveDBMgr.PARAM_PAGE_SIZE)
    private Integer f45571a = 1000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("iVersion")
    private String f45573c = "6";

    public void c(Integer num) {
        this.d = num;
    }

    public void c(String str) {
        this.f45572b = str;
    }

    public void a(String str) {
        this.f45573c = str;
    }

    public String toString() {
        return "GetShareResourceReq{sportType=" + this.d + "urlSuffix=" + this.f45572b + "iVersion=" + this.f45573c + '}';
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        StringBuilder sb = new StringBuilder();
        sb.append(GRSManager.c(BaseApplication.b()).getUrl("sportSuggestUrl"));
        sb.append(TextUtils.isEmpty(this.f45572b) ? "/getShareResList" : this.f45572b);
        return sb.toString();
    }
}
