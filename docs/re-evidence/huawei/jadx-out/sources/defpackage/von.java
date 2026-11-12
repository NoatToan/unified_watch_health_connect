package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.network.inner.api.NetworkService;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.hms.support.hwid.bean.AckQrLoginReq;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;

/* JADX INFO: loaded from: classes43.dex */
public class von extends CloudCommonReponse {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("LoginSNSRsp")
    private c f51414b = new c();

    public c a() {
        return this.f51414b;
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName(NetworkService.Constants.CONFIG_SERVICE)
        private String f51415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("frdListVersion")
        private int f51416b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("grpListVersion")
        private String f51417c;

        @SerializedName(AckQrLoginReq.KEY_IS_FIRST_LOGIN)
        private String d;

        @SerializedName("digestKey")
        private String e;

        @SerializedName(HwPayConstant.KEY_USER_ID)
        private long g;

        @SerializedName("sessionValidTime")
        private int i;

        public long b() {
            return this.g;
        }

        public String d() {
            return this.d;
        }

        public int c() {
            return this.i;
        }
    }

    @Override // com.huawei.hwcloudmodel.model.CloudCommonReponse
    public String toString() {
        StringBuilder sb = new StringBuilder("LoginUserSeverResponse{LoginSNSRsp=");
        if (a() != null) {
            sb.append("userId=");
            sb.append(a().b());
            sb.append(", isFirstLogin=");
            sb.append(a().d());
        }
        sb.append('}');
        return sb.toString();
    }
}
