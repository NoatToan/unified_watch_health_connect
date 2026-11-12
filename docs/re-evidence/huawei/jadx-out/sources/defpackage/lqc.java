package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lqc implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("agrInfo")
    private List<lpy> f40623a;

    @SerializedName("obtainVersion")
    private boolean d;

    @SerializedName(JsbMapKeyNames.H5_USER_ID)
    private String e;

    public void c(String str) {
        this.e = str;
    }

    public void d(boolean z) {
        this.d = z;
    }

    public void a(List<lpy> list) {
        this.f40623a = list;
    }

    public String toString() {
        return "GetHonorDevicePrivacyReq{userId=" + this.e + ", obtainVersion=" + this.d + ", agrInfo=" + this.f40623a + '}';
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return lon.c().d("domain_honor_device_privacy") + "/agreementservice/user/query";
    }
}
