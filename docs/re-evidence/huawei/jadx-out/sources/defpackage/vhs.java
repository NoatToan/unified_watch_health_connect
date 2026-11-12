package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwcloudmodel.healthdatacloud.model.BindDeviceReq;
import com.huawei.hwcloudmodel.model.userprofile.BindDeviceRsp;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class vhs implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("recordTime")
    private long f51122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("timeZone")
    private String f51123b;

    @SerializedName("deviceCode")
    private long d = b();

    @SerializedName("meals")
    private List<vgw> e;

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/healthExpansion/calorieIntake/addFullDiet";
    }

    public vhs(long j, List<vgw> list, String str) {
        this.f51122a = j;
        this.f51123b = str;
        this.e = list;
    }

    public List<vgw> d() {
        return this.e;
    }

    public String toString() {
        return "AddFullDietRequest{mRecordTime=" + this.f51122a + ", mMeals=" + this.e + ", mTimeZone='" + this.f51123b + "'}";
    }

    public static long b() {
        BindDeviceReq bindDeviceReq = new BindDeviceReq();
        bindDeviceReq.setProductId(1);
        bindDeviceReq.setUniqueId("-1");
        bindDeviceReq.setAppName(BaseApplication.d());
        BindDeviceRsp bindDeviceRspB = lqo.b(BaseApplication.b()).b(bindDeviceReq);
        if (bindDeviceRspB != null && bindDeviceRspB.getResultCode().intValue() == 0) {
            return bindDeviceRspB.getDeviceCode().longValue();
        }
        return -1L;
    }
}
