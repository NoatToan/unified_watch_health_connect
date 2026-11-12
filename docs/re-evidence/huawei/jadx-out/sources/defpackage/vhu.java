package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.IRequest;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.up.model.UserInfomation;
import health.compact.a.CommonUtils;
import health.compact.a.GRSManager;
import health.compact.a.ReleaseLogUtil;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes43.dex */
public class vhu implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("energy")
    private int f51128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("birthday")
    private String f51129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("age")
    private int f51130c;

    @SerializedName(CloudParamKeys.CLIENT_TYPE)
    private int d;

    @SerializedName(CommonConstant.KEY_GENDER)
    private int e;

    @SerializedName("management")
    private String j;

    public vhu(String str, int i) {
        UserInfomation userInfoFromDbSync = LoginInit.getInstance(BaseApplication.b()).getUserInfoFromDbSync();
        if (userInfoFromDbSync == null) {
            ReleaseLogUtil.d("R_DietAnalysisRequest", "DietAnalysisRequest userInfomation is null");
        } else {
            if (userInfoFromDbSync.getGender() == 1) {
                this.e = 2;
            } else {
                this.e = 1;
            }
            this.f51130c = userInfoFromDbSync.getAge();
            this.f51129b = DateFormatUtil.e(DateFormatUtil.c(CommonUtils.j(userInfoFromDbSync.getBirthday()), TimeZone.getDefault()), DateFormatUtil.DateFormatType.DATE_FORMAT_YYYY_MM_DD);
        }
        this.j = str;
        this.f51128a = i;
        this.d = CommonUtils.j(fxl.d());
    }

    public int b() {
        return this.e;
    }

    public int c() {
        return this.f51130c;
    }

    public String a() {
        return this.f51129b;
    }

    public String f() {
        return this.j;
    }

    public int d() {
        return this.f51128a;
    }

    public int e() {
        return this.d;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/healthExpansion/diet/analysis";
    }
}
