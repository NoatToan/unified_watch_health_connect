package defpackage;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import com.huawei.operation.ble.BleConstants;
import com.huawei.pluginachievement.manager.db.IAchieveDBMgr;
import health.compact.a.GRSManager;
import java.util.List;

/* JADX INFO: loaded from: classes42.dex */
public class pkv implements IRequest {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("templateTypeList")
    List<String> f45568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(BleConstants.SPORT_TYPE)
    private Integer f45569c;

    @SerializedName("urlSuffix")
    private String j;

    @SerializedName("pageNo")
    private Integer e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(IAchieveDBMgr.PARAM_PAGE_SIZE)
    private Integer f45567a = 1000;

    @SerializedName("iVersion")
    private String d = "6";

    public void b(Integer num) {
        this.f45569c = num;
    }

    public void d(String str) {
        this.j = str;
    }

    public void e(String str) {
        this.d = str;
    }

    public void e(Integer num) {
        this.f45567a = num;
    }

    public String toString() {
        return "GetShareResourceReq{sportType=" + this.f45569c + "urlSuffix=" + this.j + "iVersion=" + this.d + "pageNo=" + this.e + "pageSize=" + this.f45567a + '}';
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        StringBuilder sb = new StringBuilder();
        sb.append(GRSManager.c(BaseApplication.b()).getUrl("sportSuggestUrl"));
        sb.append(TextUtils.isEmpty(this.j) ? "/getShareResList" : this.j);
        return sb.toString();
    }
}
