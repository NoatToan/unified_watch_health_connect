package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.operation.utils.Constants;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lqe implements IRequest {

    @SerializedName(JsbMapKeyNames.H5_USER_ID)
    private String d;

    @SerializedName(Constants.VMALL_SIGN_INFO)
    private List<lqf> e;

    public void c(String str) {
        this.d = str;
    }

    public void e(List<lqf> list) {
        this.e = list;
    }

    public String toString() {
        return "GetHonorDevicePrivacyReq{userId=" + this.d + ", agrInfo=" + this.e + '}';
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return lon.c().d("domain_honor_device_privacy") + "/agreementservice/user/save";
    }
}
