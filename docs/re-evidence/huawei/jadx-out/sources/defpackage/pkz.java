package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes15.dex */
public class pkz implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("chargeFlag")
    private String f45577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(HwPayConstant.KEY_SIGN)
    private String f45578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("length")
    private String f45579c;

    @SerializedName("listCode")
    private String d;

    @SerializedName("cursor")
    private String e;

    public void b(String str) {
        this.f45578b = str;
    }

    public void a(String str) {
        this.d = str;
    }

    public void e(String str) {
        this.e = str;
    }

    public void c(String str) {
        this.f45579c = str;
    }

    public void d(String str) {
        this.f45577a = str;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("GetThemeListReq{, sign=");
        stringBuffer.append(this.f45578b);
        stringBuffer.append(", listCode=").append(this.d);
        stringBuffer.append(", cursor=").append(this.e);
        stringBuffer.append(", length=").append(this.f45579c);
        stringBuffer.append(", chargeFlag=").append(this.f45577a);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("domainThemeCloud") + "/servicesupport/theme/v2/getStaticWallpaperList.do";
    }
}
