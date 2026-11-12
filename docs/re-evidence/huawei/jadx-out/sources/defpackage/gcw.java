package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes7.dex */
public class gcw implements IRequest {

    @SerializedName("countryId")
    private String d;

    private gcw(a aVar) {
        this.d = aVar.e;
    }

    public static final class a {
        private String e;

        public a c(String str) {
            this.e = str;
            return this;
        }

        public gcw b() {
            return new gcw(this);
        }
    }

    public String d() {
        return this.d;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/dataAnalyse/app/getCityInfoList";
    }

    public String toString() {
        return "GetCityInfoListReq{countryId='" + this.d + "'}";
    }
}
